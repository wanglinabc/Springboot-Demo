package com.example.demo.Service;


import org.springframework.boot.configurationprocessor.json.JSONArray;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/25 0025.
 * 请求网络数据jsonString转化为Map集合的形式；
 */
public class ParseJsonDataToMap {

    /**
     * 将String数据转化为map集合
     */
    public static Map<String, String> parseOrgJsonToMap( String dataMap ) {
        Map<String, String> stringMap = new HashMap<>();
        try {
            JSONObject jsonObject = new JSONObject( dataMap );
            Iterator iterator = jsonObject.keys();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                String values = jsonObject.getString( key );
                stringMap.put( key, values );
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return stringMap;
    }

    /**
     * 将String数据转化为map<String,Object></>集合
     */
    public static Map<String, Object> parseOrgJsonToMapObject( String dataMap ) {
        Map<String, Object> stringObjectMap = new HashMap<>();
        try {
            JSONObject jsonObject = new JSONObject( dataMap );
            Iterator iterator = jsonObject.keys();
            while (iterator.hasNext()) {
                String key = (String) iterator.next();
                Object values = jsonObject.get( key );
                stringObjectMap.put( key, values );
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return stringObjectMap;
    }

    /**
     * 将String转化为ListMap集合
     */
    public static List<Map<String, String>> parseOrgJsonArrayToListMap( String dataListMap ) {
        List<Map<String, String>> mapList = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray( dataListMap );
            for (int i = 0; i < jsonArray.length(); i++) {
                Map<String, String> stringMap = new HashMap<>();
                JSONObject jsonObject = jsonArray.getJSONObject( i );
                Iterator iterator = jsonObject.keys();
                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    String values = jsonObject.getString( key );
                    stringMap.put( key, values );
                }
                mapList.add( stringMap );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mapList;
    }

    /**
     * 将String转化为ListMap集合
     */
    public static List<Map<String, Object>> parseOrgJsonArrayToListMapObject( String dataListMap ) {
        List<Map<String, Object>> mapObjectList = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray( dataListMap );
            for (int i = 0; i < jsonArray.length(); i++) {
                Map<String, Object> stringMap = new HashMap<>();
                JSONObject jsonObject = jsonArray.getJSONObject( i );
                Iterator iterator = jsonObject.keys();
                while (iterator.hasNext()) {
                    String key = (String) iterator.next();
                    Object values = jsonObject.get( key );
                    stringMap.put( key, values );
                }
                mapObjectList.add( stringMap );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mapObjectList;
    }


    public static List<List<Map<String, String>>> getParseOrgObjJsonArrayToListListMap( String jsonString ) {

        List<List<Map<String, String>>> lists = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray( jsonString );
            for (int i = 0; i < jsonArray.length(); i++) {
                List<Map<String, String>> mapList = parseOrgJsonArrayToListMap( jsonArray.getJSONObject( i ).getString( "flightInfoEachTrip" ) );
                lists.add( mapList );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }


    /**
     * 将String转化为ListListMap集合
     */
    public static List<List<Map<String, String>>> parseOrgJsonArrayToListListMap( String dataListListMap ) {
        List<List<Map<String, String>>> lists = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray( dataListListMap );
            for (int i = 0; i < jsonArray.length(); i++) {
                List<Map<String, String>> mapList = new ArrayList<>();
                JSONArray jsonArray1 = jsonArray.getJSONArray( i );
                for (int j = 0; j < jsonArray1.length(); j++) {
                    JSONObject jsonObject = jsonArray1.getJSONObject( i );
                    Map<String, String> stringMap = new HashMap<>();
                    Iterator iterator = jsonObject.keys();
                    while (iterator.hasNext()) {
                        String key = (String) iterator.next();
                        String values = jsonObject.getString( key );
                        stringMap.put( key, values );
                    }
                    mapList.add( stringMap );
                }
                lists.add( mapList );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }


    public static List<List<List<Map<String, String>>>> getThreeListFromJson( String jsontring ) {
        List<List<List<Map<String, String>>>> lists = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray( jsontring );
            for (int i = 0; i < jsonArray.length(); i++) {
                lists.add( parseOrgJsonArrayToListListMap( jsonArray.getString( i ) ) );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }

    public static Map<Integer, Boolean> getMapIntergerBoolean( String mapIntergerBoolean ) {
        Map<Integer, Boolean> booleanMap = new HashMap<>();
        try {
            JSONObject jsonObject1 = new JSONObject( mapIntergerBoolean );
            Iterator iterator = jsonObject1.keys();
            while (iterator.hasNext()) {
                String keys = (String) iterator.next();
                Boolean booleans = jsonObject1.getBoolean( keys );
                booleanMap.put( Integer.valueOf( keys ), booleans );
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return booleanMap;
    }


    public static JSONArray PaseListMapToJSONArrayString( List<Map<String, Object>> listMap ) {
        JSONArray jsonArrays = null;
        try {
            jsonArrays = new JSONArray();
            for (int i = 0; i < listMap.size(); i++) {
                JSONObject jsonObject = new JSONObject();
                Map<String, Object> mapStringObiect = listMap.get( i );
                for (String keyset : mapStringObiect.keySet()) {
                    jsonObject.put( keyset, mapStringObiect.get( keyset ) );
                }
                jsonArrays.put( jsonObject );
            }
            return jsonArrays;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonArrays;

    }

    public static List<String> getListStringFromOrgJson( String jsonString ) {
        List<String> listSting = new ArrayList<>();
        try {
            JSONArray jsonArray = new JSONArray( jsonString );
            for (int i = 0; i < jsonArray.length(); i++) {
                listSting.add( jsonArray.getString( i ) );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSting;
    }


}
