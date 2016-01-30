package Misc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Imran Bijapuri
 */
public class Distance_Calculator {

    public static void main(String[] args) {
        List<Customer> list = new Distance_Calculator().getDistane();

        //Sort the list in order of user_id
        Collections.sort(list);
        
        System.out.println("Total customer within 100 kms are " + list.size());
        
        //Print the list 
        for (Customer c : list) {
            System.out.println(c.id + "     " + c.name + "      " + c.distance + " kms");
        }
        
        
    }

    public List<Customer> getDistane() {
        String str = "{data:[{\"latitude\": \"52.986375\", \"user_id\": 12, \"name\": \"Christina McArdle\", \"longitude\": \"-6.043701\"},{\"latitude\": \"51.92893\", \"user_id\": 1, \"name\": \"Alice Cahill\", \"longitude\": \"-10.27699\"},{\"latitude\": \"51.8856167\", \"user_id\": 2, \"name\": \"Ian McArdle\", \"longitude\": \"-10.4240951\"},{\"latitude\": \"52.3191841\", \"user_id\": 3, \"name\": \"Jack Enright\", \"longitude\": \"-8.5072391\"},{\"latitude\": \"53.807778\", \"user_id\": 28, \"name\": \"Charlie Halligan\", \"longitude\": \"-7.714444\"},{\"latitude\": \"53.4692815\", \"user_id\": 7, \"name\": \"Frank Kehoe\", \"longitude\": \"-9.436036\"},{\"latitude\": \"54.0894797\", \"user_id\": 8, \"name\": \"Eoin Ahearn\", \"longitude\": \"-6.18671\"},{\"latitude\": \"53.038056\", \"user_id\": 26, \"name\": \"Stephen McArdle\", \"longitude\": \"-7.653889\"},{\"latitude\": \"54.1225\", \"user_id\": 27, \"name\": \"Enid Gallagher\", \"longitude\": \"-8.143333\"},{\"latitude\": \"53.1229599\", \"user_id\": 6, \"name\": \"Theresa Enright\", \"longitude\": \"-6.2705202\"},{\"latitude\": \"52.2559432\", \"user_id\": 9, \"name\": \"Jack Dempsey\", \"longitude\": \"-7.1048927\"},{\"latitude\": \"52.240382\", \"user_id\": 10, \"name\": \"Georgina Gallagher\", \"longitude\": \"-6.972413\"},{\"latitude\": \"53.2451022\", \"user_id\": 4, \"name\": \"Ian Kehoe\", \"longitude\": \"-6.238335\"},{\"latitude\": \"53.1302756\", \"user_id\": 5, \"name\": \"Nora Dempsey\", \"longitude\": \"-6.2397222\"},{\"latitude\": \"53.008769\", \"user_id\": 11, \"name\": \"Richard Finnegan\", \"longitude\": \"-6.1056711\"},{\"latitude\": \"53.1489345\", \"user_id\": 31, \"name\": \"Alan Behan\", \"longitude\": \"-6.8422408\"},{\"latitude\": \"53\", \"user_id\": 13, \"name\": \"Olive Ahearn\", \"longitude\": \"-7\"},{\"latitude\": \"51.999447\", \"user_id\": 14, \"name\": \"Helen Cahill\", \"longitude\": \"-9.742744\"},{\"latitude\": \"52.966\", \"user_id\": 15, \"name\": \"Michael Ahearn\", \"longitude\": \"-6.463\"},{\"latitude\": \"52.366037\", \"user_id\": 16, \"name\": \"Ian Larkin\", \"longitude\": \"-8.179118\"},{\"latitude\": \"54.180238\", \"user_id\": 17, \"name\": \"Patricia Cahill\", \"longitude\": \"-5.920898\"},{\"latitude\": \"53.0033946\", \"user_id\": 39, \"name\": \"Lisa Ahearn\", \"longitude\": \"-6.3877505\"},{\"latitude\": \"52.228056\", \"user_id\": 18, \"name\": \"Bob Larkin\", \"longitude\": \"-7.915833\"},{\"latitude\": \"54.133333\", \"user_id\": 24, \"name\": \"Rose Enright\", \"longitude\": \"-6.433333\"},{\"latitude\": \"55.033\", \"user_id\": 19, \"name\": \"Enid Cahill\", \"longitude\": \"-8.112\"},{\"latitude\": \"53.521111\", \"user_id\": 20, \"name\": \"Enid Enright\", \"longitude\": \"-9.831111\"},{\"latitude\": \"51.802\", \"user_id\": 21, \"name\": \"David Ahearn\", \"longitude\": \"-9.442\"},{\"latitude\": \"54.374208\", \"user_id\": 22, \"name\": \"Charlie McArdle\", \"longitude\": \"-8.371639\"},{\"latitude\": \"53.74452\", \"user_id\": 29, \"name\": \"Oliver Ahearn\", \"longitude\": \"-7.11167\"},{\"latitude\": \"53.761389\", \"user_id\": 30, \"name\": \"Nick Enright\", \"longitude\": \"-7.2875\"},{\"latitude\": \"54.080556\", \"user_id\": 23, \"name\": \"Eoin Gallagher\", \"longitude\": \"-6.361944\"},{\"latitude\": \"52.833502\", \"user_id\": 25, \"name\": \"David Behan\", \"longitude\": \"-8.522366\"}]}";
        List<Customer> list = new ArrayList<Customer>();
        try {
            JSONArray jObject = new JSONObject(str).getJSONArray("data");
            int count = jObject.length();

            //Initialize variables
            double lat1 = Math.toRadians(53.3381985);
            double lat2 = 0.0;
            double lon1 = Math.toRadians(-6.2592576);
            double lon2 = 0.0;
            double delta_lon = 0.0;
            double delta_lat = 0.0;

            //constant
            final int earthRadius = 6371;

            //Loop through Json Array
            for (int i = 0; i < count; i++) {
                lat2 = Math.toRadians(jObject.getJSONObject(i).getDouble("latitude"));
                lon2 = Math.toRadians(jObject.getJSONObject(i).getDouble("longitude"));
                delta_lat = lat1 - lat2;
                delta_lon = lon1 - lon2;

                double numerator = Math.pow((Math.cos(lat2) * Math.sin(delta_lon)), 2);
                numerator = numerator + Math.pow(Math.cos(lat1) * Math.sin(lat2) - Math.sin(lat1) * Math.cos(lat2) * Math.cos(delta_lon), 2);
                numerator = Math.sqrt(numerator);

                double denominator = (Math.sin(lat1) * Math.sin(lat2)) + (Math.cos(lat1) * Math.cos(lat2) * Math.cos(delta_lon));
                double delta_sigma = Math.atan2(numerator, denominator);

                double distance = earthRadius * delta_sigma;

                //Add to list only if distance is less than 100km
                if (distance < 100) {
                    list.add(new Customer(jObject.getJSONObject(i).getInt("user_id"), jObject.getJSONObject(i).getString("name"), distance));
                }
            }
        } catch (JSONException ex) {
        }
        return list;
    }

    class Customer implements Comparable<Customer> {

        int id;
        String name;
        double distance;

        Customer(int id, String name, double distance) {
            this.id = id;
            this.name = name;
            this.distance = distance;
        }

        @Override
        public int compareTo(Customer o) {
            if (this.id > o.id) {
                return 1;
            } else {
                return -1;
            }
        }

    }
}
