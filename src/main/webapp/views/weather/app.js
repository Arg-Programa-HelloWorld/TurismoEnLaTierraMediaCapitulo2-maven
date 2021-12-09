window.addEventListener('load', ()=> {

    let lat
    let lon

    let temperaturaValor = document.getElementById('temperatura-valor')
    let temperaturaDescripcion = document.getElementById('temperatura-descripcion')

    let ubicacion = document.getElementById('ubicacion')
    let iconoAnimado = document.getElementById('icono-animado')

    let vientoVelocidad = document.getElementById('viento-velocidad')

    if(navigator.geolocation){
        
       navigator.geolocation.getCurrentPosition( posicion => {
           
           lat = posicion.coords.latitude
           lon = posicion.coords.longitude

           // My Api key= 54d591e0c80d0bbade6b974af3a1a105.-

           // Ubicacion por coordenadas geograficas.-
           const url = `https://api.openweathermap.org/data/2.5/weather?lat=${lat}&lon=${lon}&lang=es&units=metric&appid=54d591e0c80d0bbade6b974af3a1a105`

           // Ubicacion por Ciudad.-
           // const url = `https://api.openweathermap.org/data/2.5/weather?q=BuenosAires&lang=es&units=metric&appid=54d591e0c80d0bbade6b974af3a1a105`

           // console.log(url)

           fetch(url)
            .then( Response => { return Response.json() })
            .then( data => {
                console.log(data)
                
                // Para redondear la temperatura
                //let temp = Math.round(data.main.temp) 
                let temp = data.main.temp
                //console.log(temp)
                temperaturaValor.textContent = `${temp} ºC`

                // Descripcion
                let desc = data.weather[0].description
                desc = desc.toUpperCase()   // lo paso a mayuscula.-
                temperaturaDescripcion.textContent = desc

                // Ubicacion
                let ubic = data.name
                ubicacion.textContent = ubic

                // Velocidad del Viento
                let vientVel = data.wind.speed
                vientoVelocidad.textContent = `${vientVel} m/s`

                // Para poner iconos estaticos
                /*
                console.log(data.weather[0].icon)
                let iconoEstatico = data.weather[0].icon
                const urlIcon = `https://openweathermap.org/img/wn/${iconoEstatico}.png`
                iconoAnimado.src =urlIcon
                */

                // Para poner iconos animados
                // https://www.amcharts.com/free-animated-svg-weather-icons/
                // console.log(data.weather[0].main)
                switch(data.weather[0].main) {

                    case 'Thunderstorm':
                      iconoAnimado.src='animated/thunder.svg'
                      console.log('TORMENTA');
                      break;
                    
                    case 'Drizzle':
                      iconoAnimado.src='animated/rainy-2.svg'
                      console.log('LLOVIZNA');
                    break;
                    
                    case 'Rain':
                      iconoAnimado.src='animated/rainy-7.svg'
                      console.log('LLUVIA');
                    break;
                    
                    case 'Snow':
                      iconoAnimado.src='animated/snowy-6.svg'
                        console.log('NIEVE');
                    break;                        
                    
                    case 'Clear':
                        iconoAnimado.src='animated/day.svg'
                        console.log('LIMPIO');
                    break;
                    
                    case 'Atmosphere':
                      iconoAnimado.src='animated/weather.svg'
                        console.log('ATMOSFERA');
                    break;  
                    
                    case 'Clouds':
                        iconoAnimado.src='animated/cloudy-day-1.svg'
                        console.log('NUBES');
                    break;  
                    
                    default:
                      iconoAnimado.src='animated/cloudy-day-1.svg'
                      console.log('por defecto');
                }
                
            })
            .catch( error =>{
                console.log(error);
            })

       })
          
        
    }

})