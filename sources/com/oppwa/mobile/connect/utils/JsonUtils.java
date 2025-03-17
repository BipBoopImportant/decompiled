package com.oppwa.mobile.connect.utils;

import org.json.JSONArray;
import org.json.JSONObject;

public class JsonUtils {
    public static String[] getArrayForKey(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            JSONArray jSONArray = jSONObject.getJSONArray(str);
            if (jSONArray.length() > 0) {
                String[] strArr = new String[jSONArray.length()];
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    strArr[i10] = jSONArray.getString(i10);
                }
                return strArr;
            }
        }
        return null;
    }

    public static String getStringForKey(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static Boolean isTrueForKey(JSONObject jSONObject, String str) {
        return jSONObject.has(str) ? Boolean.valueOf(jSONObject.getBoolean(str)) : Boolean.FALSE;
    }
}
