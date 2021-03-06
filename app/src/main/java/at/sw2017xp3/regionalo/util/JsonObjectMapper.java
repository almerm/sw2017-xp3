package at.sw2017xp3.regionalo.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import at.sw2017xp3.regionalo.model.Product;
import at.sw2017xp3.regionalo.model.User;

/**
 * Created by jo on 05.04.17.
 */

public class JsonObjectMapper {
    private JsonObjectMapper() {
    }

    public static Product CreateProduct(JSONObject object) throws JSONException {

        int id = object.getInt("id");
        String name = object.getString("name");
        String unitType = object.getString("unit_type");
        boolean isBio = object.getInt("is_bio") == 1;
        double price = object.getDouble("price");
        int producerId = object.getInt("user_id");
        int typeID = object.getInt("type_id");
        int likes = object.getInt("likes");
        String description = object.getString("description");

        return new Product(id, name, isBio, price, producerId, typeID, unitType, likes, description);
    }

    public static User CreateUser(JSONObject object) throws JSONException {

        int id = object.getInt("id");
        String firstName = object.getString("first_name");
        String lastName = object.getString("last_name");;
        String address = object.getString("address");
        String city = object.getString("city");
        String postalCode = object.getString("postal_code");
        String email = object.getString("email");
        String phone = object.getString("phone_number");
        boolean isBio = object.getInt("is_bio") == 1;
        double longitutde = object.getDouble("longitude");
        double latitude = object.getDouble("latitude");
        boolean delivery = object.getInt("delivery") == 1;
        boolean yardSale = object.getInt("yard_sale") == 1;
        boolean selfHarvest = object.getInt("self_harvest") == 1;
        boolean commercial = object.getInt("commercial") == 1;


        return new User(id, firstName, lastName, address, city, postalCode, email,
                phone, isBio, longitutde, latitude, delivery, yardSale, selfHarvest, commercial);
    }
}
