//Find itinerary from tickets

import java.util.HashMap;

public class problem3 {
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> reverseMap = new HashMap<>();

        // Store destination as key
        for (String key : tickets.keySet()) {
            reverseMap.put(tickets.get(key), key);
        }

        // The starting point will not be present in reverseMap
        for (String key : tickets.keySet()) {
            if (!reverseMap.containsKey(key)) {
                return key;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        // Print the itinerary
        while (tickets.containsKey(start)) {
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }

        System.out.println(start);
    }
}
