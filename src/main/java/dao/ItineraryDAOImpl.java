package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import jdbc.ConnectionProvider;
import model.Attraction;
import model.AttractionType;
import model.Itinerary;
import model.Promotion;
import model.PromotionAbsolute;
import model.PromotionAyB;
import model.PromotionPercentage;
import model.PromotionType;
import model.User;

public class ItineraryDAOImpl implements ItineraryDAO{

	public List<Promotion> findAllPromotions(User user) {

		try {

			String sqlQuery = "SELECT promotions.id, promotions.name, promotions.time, promotions.cost, promotions.discount, promotions.image, promotion_type.id, promotion_type.name AS promotion_type\r\n"
					+ "FROM itinerary_shopping\r\n"
					+ "INNER JOIN promotions ON itinerary_shopping.fk_id_promotion = promotions.id\r\n"
					+ "INNER JOIN promotion_type ON promotions.fk_id_promotion_type = promotion_type.id\r\n"
					+ "WHERE itinerary_shopping.fk_id_user = ?";

			Connection conn = ConnectionProvider.getConnection();

			PreparedStatement statement = conn.prepareStatement(sqlQuery);
			statement.setInt(1, user.getId());
			ResultSet resultados = statement.executeQuery();

			List<Promotion> promotionsTemp = new LinkedList<Promotion>();

			while (resultados.next()) {

				promotionsTemp.add(toPromotion(resultados));

			}

			return promotionsTemp;
			// return (List<Promotion>) promotionsTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}
	

	private Promotion toPromotion(ResultSet results) {

		try {

			Promotion promotionTemp = null;
			Promotion promotionTempPercentage = null;
			Promotion promotionTempAbsolute = null;
			Promotion promotionTempAyB = null;
			int result = 0;

			AttractionDAO attractionDAO = DAOFactory.getAttractionDAO();

			// System.out.println(PromotionType.fromId(results.getInt(6)));

			result = results.getInt(6);

			if (result == 1) {

				LinkedList<Attraction> attractionListPercentage;

				attractionListPercentage = (LinkedList<Attraction>) attractionDAO
						.searchAttractionsOfAPromotionByID(results.getInt(1));

				// Promotion( Integer id, String name, Double time, Double cost, Double discount
				// int fk_id_promotion_type PromotionType promotion_type.name)
				promotionTempPercentage = new PromotionPercentage(results.getInt(1), results.getString(2),
						results.getDouble(3), results.getDouble(4), results.getDouble(5), results.getString(6), results.getInt(7),
						PromotionType.valueOf(results.getString(8)), attractionListPercentage);

				promotionTemp = promotionTempPercentage;

			}

			if (result == 2) {

				LinkedList<Attraction> attractionListAbsolute;

				attractionListAbsolute = (LinkedList<Attraction>) attractionDAO
						.searchAttractionsOfAPromotionByID(results.getInt(1));

				// Promotion( Integer id, String name, Double time, Double cost, Double discount
				// int fk_id_promotion_type PromotionType promotion_type.name)
				promotionTempAbsolute = new PromotionAbsolute(results.getInt(1), results.getString(2),
						results.getDouble(3), results.getDouble(4), results.getDouble(5), results.getString(6), results.getInt(7),
						PromotionType.valueOf(results.getString(8)), attractionListAbsolute);

				promotionTemp = promotionTempAbsolute;

			}

			if (result == 3) {

				LinkedList<Attraction> attractionListAyB;

				attractionListAyB = (LinkedList<Attraction>) attractionDAO
						.searchAttractionsOfAPromotionByID(results.getInt(1));

				// Promotion( Integer id, String name, Double time, Double cost, Double discount
				// int fk_id_promotion_type PromotionType promotion_type.name)
				promotionTempAyB = new PromotionAyB(results.getInt(1), results.getString(2), results.getDouble(3),
						results.getDouble(4), results.getDouble(5), results.getString(6), results.getInt(7), 
						PromotionType.valueOf(results.getString(8)), attractionListAyB);

				promotionTempAyB.calculatePrice();

			}

			return promotionTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

	public List<Attraction> findAllAttractions(User user) {
		
		try {
			
			String sqlQuery = "SELECT attractions.id, attractions.name, attractions.cost, attractions.time, attractions.quota, attractions.image, attraction_type.id, attraction_type.name AS preference\r\n"
					+ "FROM itinerary_shopping \r\n"
					+ "INNER JOIN attractions ON itinerary_shopping.fk_id_attraction = attractions.id\r\n"
					+ "INNER JOIN attraction_type ON attractions.fk_id_attraction_type = attraction_type.id\r\n"
					+ "WHERE itinerary_shopping.fk_id_user = ?";
			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement statement = connection.prepareStatement(sqlQuery);
			statement.setInt(1, user.getId());
			ResultSet results = statement.executeQuery();
			
			List<Attraction> attractions = new LinkedList<Attraction>();
			
			while (results.next()) {
				
				attractions.add(toAttraction(results));
			}
			
			return attractions; // Lista de Attractions.-
			
		} catch (Exception e) {
			
			throw new MissingDataException(e);
			
		}
		
	}
	
	private Attraction toAttraction(ResultSet results) {

		try {
			// Attraction( Integer id, String name, Double cost, Double time, Integer quota,
						//  String image, Integer fk_id_preference) AttractionType attractionType
			return new Attraction(results.getInt(1), results.getString(2), results.getDouble(3), results.getDouble(4),
					results.getInt(5),results.getString(6), results.getInt(7), AttractionType.valueOf(results.getString(8)));
		} catch (Exception e) {

			throw new MissingDataException(e);

		}
	}


	@Override
	public int insert(Itinerary t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int update(Itinerary t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int delete(Itinerary t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public Itinerary findById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Itinerary> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int unsubscribe(Itinerary t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public int subscribe(Itinerary t) {
		// TODO Auto-generated method stub
		return 0;
	}

}
