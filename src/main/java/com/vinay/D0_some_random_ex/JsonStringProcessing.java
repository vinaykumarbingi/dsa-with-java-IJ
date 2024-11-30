package com.vinay.D0_some_random_ex;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JsonStringProcessing {
//    public static void main(String[] args) {
//        // Your JSON string
//        String jsonString = "[\n" +
//                "  {\n" +
//                "    \"id\": \"4a26f6ae-2fda-487c-9e41-f43549e4a818\",\n" +
//                "    \"title\": \"Test Update Done Again\",\n" +
//                "    \"apptDate\": \"2023-10-04\",\n" +
//                "    \"startTime\": \"16:00 am\",\n" +
//                "    \"start\": \"2023-10-04 16:40\",\n" +
//                "    \"endTime\": \"16:20 am\",\n" +
//                "    \"end\": \"2023-10-04 17:00\",\n" +
//                "    \"eventStatus\": 9,\n" +
//                "    \"allDay\": false,\n" +
//                "    \"description\": \"\",\n" +
//                "    \"patientId\": -1,\n" +
//                "    \"providertId\": -1,\n" +
//                "    \"stateCode\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"id\": \"30ac5ec9-4101-4235-b15f-1dc539d41859\",\n" +
//                "    \"url\": \"\",\n" +
//                "    \"title\": \"\",\n" +
//                "    \"apptDate\": \"2023-10-04\",\n" +
//                "    \"startTime\": \"08:20 am\",\n" +
//                "    \"start\": \"2023-10-04 08:20\",\n" +
//                "    \"endTime\": \"08:40 am\",\n" +
//                "    \"end\": \"2023-10-04 08:40\",\n" +
//                "    \"eventStatus\": 9,\n" +
//                "    \"allDay\": false,\n" +
//                "    \"description\": \"\",\n" +
//                "    \"patientId\": -1,\n" +
//                "    \"providertId\": -1,\n" +
//                "    \"stateCode\": \"\"\n" +
//                "  },\n" +
//                "  {\n" +
//                "    \"id\": \"1f743513-1389-4c89-8a9b-99cbe9c1a8dd\",\n" +
//                "    \"url\": \"\",\n" +
//                "    \"title\": \"\",\n" +
//                "    \"apptDate\": \"2023-10-04\",\n" +
//                "    \"startTime\": \"08:40 am\",\n" +
//                "    \"start\": \"2023-10-04 08:40\",\n" +
//                "    \"endTime\": \"09:00 am\",\n" +
//                "    \"end\": \"2023-10-04 09:00\",\n" +
//                "    \"eventStatus\": 9,\n" +
//                "    \"allDay\": false,\n" +
//                "    \"description\": \"\",\n" +
//                "    \"patientId\": -1,\n" +
//                "    \"providertId\": -1,\n" +
//                "    \"stateCode\": \"\"\n" +
//                "  }\n" +
//                "]";
//
//        // Convert string to JSONArray
//        JSONArray jsonArray = new JSONArray(jsonString);
//
//        // User-provided ID to filter by
//        String userIdToFilter = "30ac5ec9-4101-4235-b15f-1dc539d41859";
//
//        // Filter by ID
//        JSONArray filteredArray = filterById(jsonArray, userIdToFilter);
//
//        // Convert the filtered array back to string
//        String filteredJsonString = filteredArray.toString();
//
//        // Print the result
//        System.out.println(filteredJsonString);
//    }
//
//    private static JSONArray filterById(JSONArray jsonArray, String idToFilter) {
//        JSONArray resultArray = new JSONArray();
//
//        for (int i = 0; i < jsonArray.length(); i++) {
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//
//            // Check if the 'id' field matches the provided ID
//            if (jsonObject.getString("id").equals(idToFilter)) {
//                resultArray.put(jsonObject);
//            }
//        }
//
//        return resultArray;
//    }
//
//
//    private static JSONArray filterById(JSONArray jsonArray, String idToFilter) {
//        return jsonArray
//                .stream()
//                .map(obj -> (JSONObject) obj)
//                .filter(jsonObject -> jsonObject.getString("id").equals(idToFilter))
//                .collect(Collectors.toCollection(JSONArray::new));
//    }
//
//    private static JSONArray filterById(JSONArray jsonArray, String idToFilter) {
//        return IntStream.range(0, jsonArray.length())
//                .mapToObj(jsonArray::getJSONObject)
//                .filter(jsonObject -> jsonObject.getString("id").equals(idToFilter))
//                .collect(Collectors.toCollection(JSONArray::new));
//    }
}
