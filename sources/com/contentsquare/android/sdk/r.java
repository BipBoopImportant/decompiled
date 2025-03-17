package com.contentsquare.android.sdk;

import G8.g;
import HJ.C15838d;
import com.contentsquare.android.sdk.C7115b;
import com.contentsquare.android.sdk.W;
import com.optimizely.ab.config.FeatureVariable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.C17542s;
import org.json.JSONObject;
import v8.b;
import y8.C8993b;
import y8.C8994c;

public final class r {
    public static W.a a(C7133k kVar, JSONObject jSONObject, b bVar) {
        Iterator<String> keys;
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(jSONObject, "dataJsonObject");
        C17542s.j(bVar, "screenViewTracker");
        W.a aVar = (W.a) C7133k.b(kVar, 25);
        Long f10 = g.f(jSONObject, "date");
        long longValue = f10 != null ? f10.longValue() : System.currentTimeMillis();
        aVar.f47751i = longValue;
        aVar.f47201m = Long.valueOf(longValue - bVar.b());
        aVar.f47199k = g.g(jSONObject, "message");
        JSONObject optJSONObject = jSONObject.optJSONObject("attributes");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(optJSONObject == null || (keys = optJSONObject.keys()) == null)) {
            while (keys.hasNext()) {
                String next = keys.next();
                C17542s.i(next, "key");
                String g10 = g.g(optJSONObject, next);
                if (g10 != null) {
                    linkedHashMap.put(next, g10);
                }
            }
        }
        C17542s.j(linkedHashMap, "<set-?>");
        aVar.f47202n = linkedHashMap;
        aVar.f47200l = "webview";
        return aVar;
    }

    public static C8993b b(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap;
        C17542s.j(jSONObject, FeatureVariable.JSON_TYPE);
        C8994c a10 = C8994c.f58020q.a();
        if (jSONObject.has("url")) {
            String optString = jSONObject.optString("queryParameters");
            String string = jSONObject.getString("url");
            C17542s.i(optString, "queryParams");
            if (optString.length() > 0) {
                string = string + '?' + optString;
            }
            a10.m(string);
        }
        a10.d(g.g(jSONObject, "method"));
        a10.g(jSONObject.optLong("requestTime", 0));
        a10.l(jSONObject.optLong("responseTime", 0));
        a10.e(jSONObject.optInt("statusCode", 0));
        String g10 = g.g(jSONObject, "requestBody");
        if (g10 != null) {
            byte[] bytes = g10.getBytes(C15838d.f135279b);
            C17542s.i(bytes, "this as java.lang.String).getBytes(charset)");
            a10.f(bytes);
        }
        String g11 = g.g(jSONObject, "responseBody");
        if (g11 != null) {
            byte[] bytes2 = g11.getBytes(C15838d.f135279b);
            C17542s.i(bytes2, "this as java.lang.String).getBytes(charset)");
            a10.h(bytes2);
        }
        JSONObject e10 = g.e(jSONObject, "standardResponseHeaders");
        LinkedHashMap linkedHashMap2 = null;
        if (e10 != null) {
            linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = e10.keys();
            C17542s.i(keys, "keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                C17542s.i(next, "key");
                String g12 = g.g(e10, next);
                if (g12 != null) {
                    linkedHashMap.put(next, g12);
                }
            }
        } else {
            linkedHashMap = null;
        }
        a10.k(linkedHashMap);
        JSONObject e11 = g.e(jSONObject, "standardRequestHeaders");
        if (e11 != null) {
            linkedHashMap2 = new LinkedHashMap();
            Iterator<String> keys2 = e11.keys();
            C17542s.i(keys2, "keys()");
            while (keys2.hasNext()) {
                String next2 = keys2.next();
                C17542s.i(next2, "key");
                String g13 = g.g(e11, next2);
                if (g13 != null) {
                    linkedHashMap2.put(next2, g13);
                }
            }
        }
        a10.j(linkedHashMap2);
        a10.b(g.g(jSONObject, "customRequestHeaders"));
        a10.c(g.g(jSONObject, "customResponseHeaders"));
        a10.i("webview");
        return a10.a();
    }

    public static C7115b.a c(C7133k kVar, JSONObject jSONObject, b bVar) {
        C17542s.j(kVar, "eventsBuildersFactory");
        C17542s.j(jSONObject, "dataJsonObject");
        C17542s.j(bVar, "screenViewTracker");
        C7115b.a aVar = (C7115b.a) C7133k.b(kVar, 26);
        Long f10 = g.f(jSONObject, "date");
        long longValue = f10 != null ? f10.longValue() : System.currentTimeMillis();
        aVar.f47751i = longValue;
        aVar.f47299q = Long.valueOf(longValue - bVar.b());
        aVar.f47293k = g.g(jSONObject, "message");
        aVar.f47294l = g.g(jSONObject, "filename");
        aVar.f47295m = g.g(jSONObject, "pageUrl");
        aVar.f47296n = g.d(jSONObject, "lineno");
        aVar.f47297o = g.d(jSONObject, "colno");
        aVar.f47298p = "webview";
        return aVar;
    }
}
