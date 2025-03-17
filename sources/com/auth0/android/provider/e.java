package com.auth0.android.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.URLUtil;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

abstract class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46326a = "e";

    private static Map<String, String> a(String str) {
        int i10;
        if (str == null) {
            return new HashMap();
        }
        String[] split = str.length() > 0 ? str.split("&") : new String[0];
        HashMap hashMap = new HashMap(split.length);
        for (String str2 : split) {
            int indexOf = str2.indexOf("=");
            String substring = indexOf > 0 ? str2.substring(0, indexOf) : str2;
            String substring2 = (indexOf <= 0 || str2.length() <= (i10 = indexOf + 1)) ? null : str2.substring(i10);
            if (substring2 != null) {
                hashMap.put(substring, substring2);
            }
        }
        return hashMap;
    }

    static String b(String str, String str2, String str3) {
        if (!URLUtil.isValidUrl(str3)) {
            String str4 = f46326a;
            Log.e(str4, "The Domain is invalid and the Callback URI will not be set. You used: " + str3);
            return null;
        }
        Uri build = Uri.parse(str3).buildUpon().scheme(str).appendPath("android").appendPath(str2).appendPath("callback").build();
        String str5 = f46326a;
        Log.v(str5, "The Callback URI is: " + build);
        return build.toString();
    }

    static Map<String, String> c(Uri uri) {
        if (uri == null) {
            return Collections.emptyMap();
        }
        return a(uri.getQuery() != null ? uri.getQuery() : uri.getFragment());
    }
}
