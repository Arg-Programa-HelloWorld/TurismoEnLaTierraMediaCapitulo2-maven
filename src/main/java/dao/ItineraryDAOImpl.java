package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import java.util.List;

import jdbc.ConnectionProvider;
import model.Attraction;
import model.Promotion;
import model.PromotionAbsolute;
import model.PromotionAyB;
import model.PromotionPercentage;
import model.PromotionType;
import model.User;

public class ItineraryDAOImpl {

	public List<Promotion> findAll(User user) {

		try {

			String sqlQuery = "SELECT *\n" + "FROM users_promotions\n"
					+ "INNER JOIN promotions ON promotions.id = users_promotions.fk_id_promotion\n"
					+ "WHERE users_promotions.fk_id_user = ?";

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
						results.getDouble(3), results.getDouble(4), results.getDouble(5), results.getInt(6),
						PromotionType.valueOf(results.getString(7)), attractionListPercentage);

				promotionTemp = promotionTempPercentage;

			}

			if (result == 2) {

				LinkedList<Attraction> attractionListAbsolute;

				attractionListAbsolute = (LinkedList<Attraction>) attractionDAO
						.searchAttractionsOfAPromotionByID(results.getInt(1));

				// Promotion( Integer id, String name, Double time, Double cost, Double discount
				// int fk_id_promotion_type PromotionType promotion_type.name)
				promotionTempAbsolute = new PromotionAbsolute(results.getInt(1), results.getString(2),
						results.getDouble(3), results.getDouble(4), results.getDouble(5), results.getInt(6),
						PromotionType.valueOf(results.getString(7)), attractionListAbsolute);

				promotionTemp = promotionTempAbsolute;

			}

			if (result == 3) {

				LinkedList<Attraction> attractionListAyB;

				attractionListAyB = (LinkedList<Attraction>) attractionDAO
						.searchAttractionsOfAPromotionByID(results.getInt(1));

				// Promotion( Integer id, String name, Double time, Double cost, Double discount
				// int fk_id_promotion_type PromotionType promotion_type.name)
				promotionTempAyB = new PromotionAyB(results.getInt(1), results.getString(2), results.getDouble(3),
						results.getDouble(4), results.getDouble(5), results.getInt(6),
						PromotionType.valueOf(results.getString(7)), attractionListAyB);

				promotionTempAyB.calculatePrice();

			}

			return promotionTemp;

		} catch (Exception e) {

			throw new MissingDataException(e);

		}

	}

}
