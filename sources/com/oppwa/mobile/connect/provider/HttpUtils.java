package com.oppwa.mobile.connect.provider;

import com.adjust.sdk.Constants;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.utils.Logger;
import com.oppwa.mobile.connect.utils.StringUtils;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONException;
import org.json.JSONObject;

public class HttpUtils {
    static InputStream a(String str, Map<String, String> map) {
        return b(a(str), map);
    }

    static InputStream b(HttpsURLConnection httpsURLConnection, Map<String, String> map) {
        String str;
        httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        httpsURLConnection.setRequestProperty("Accept", "application/json");
        if (map == null) {
            a(httpsURLConnection);
        } else {
            a(httpsURLConnection, map);
        }
        int responseCode = httpsURLConnection.getResponseCode();
        if (responseCode == 200) {
            return httpsURLConnection.getInputStream();
        }
        try {
            str = new JSONObject(StringUtils.inputStreamToString(httpsURLConnection.getErrorStream())).getString("result");
        } catch (JSONException unused) {
            str = "response code " + responseCode;
        }
        throw new Exception(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap downloadBitmap(java.lang.String r1) {
        /*
            javax.net.ssl.HttpsURLConnection r1 = a((java.lang.String) r1)     // Catch:{ all -> 0x0012 }
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ all -> 0x0010 }
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ all -> 0x0010 }
            r1.disconnect()
            return r0
        L_0x0010:
            r0 = move-exception
            goto L_0x0014
        L_0x0012:
            r0 = move-exception
            r1 = 0
        L_0x0014:
            if (r1 == 0) goto L_0x0019
            r1.disconnect()
        L_0x0019:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.provider.HttpUtils.downloadBitmap(java.lang.String):android.graphics.Bitmap");
    }

    public static String getBaseUrl(Connect.ProviderMode providerMode) {
        return providerMode == Connect.ProviderMode.LIVE ? "https://eu-prod.oppwa.com" : "https://eu-test.oppwa.com";
    }

    public static InputStream makeRequest(Connect.ProviderMode providerMode, String str, Map<String, String> map, String str2) {
        HttpsURLConnection a10 = a(providerMode, str);
        InputStream b10 = b(a10, map);
        a(str2, a10);
        return b10;
    }

    public static Boolean sendCallbackRequestToPaypipe(String str, String str2) {
        try {
            HttpsURLConnection a10 = a(str);
            a(a10);
            return a(a10, str2);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }

    public static String sendPostRequest(String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpsURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        httpsURLConnection.setRequestMethod("POST");
        if (httpsURLConnection.getResponseCode() < 400) {
            return StringUtils.inputStreamToString(httpsURLConnection.getInputStream());
        }
        throw new Exception(StringUtils.inputStreamToString(httpsURLConnection.getErrorStream()));
    }

    static StringBuilder a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String next : map.keySet()) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(next);
            sb2.append("=");
            sb2.append(URLEncoder.encode(map.get(next), Constants.ENCODING));
        }
        return sb2;
    }

    private static HttpsURLConnection a(String str) {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpsURLConnection.setConnectTimeout(30000);
        httpsURLConnection.setReadTimeout(30000);
        return httpsURLConnection;
    }

    private static HttpsURLConnection a(Connect.ProviderMode providerMode, String str) {
        return a(getBaseUrl(providerMode) + a() + str);
    }

    private static void a(HttpsURLConnection httpsURLConnection) {
        httpsURLConnection.setRequestMethod("GET");
    }

    private static void a(HttpsURLConnection httpsURLConnection, Map<String, String> map) {
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoOutput(true);
        OutputStream outputStream = httpsURLConnection.getOutputStream();
        outputStream.write(StringUtils.getBytes(a(map)));
        outputStream.flush();
        outputStream.close();
    }

    private static String a() {
        return ":443";
    }

    private static void a(String str, HttpsURLConnection httpsURLConnection) {
        if (str != null) {
            Logger.info("Response: [_" + httpsURLConnection.getResponseCode() + "] " + httpsURLConnection.getURL() + "\n");
        }
    }

    private static Boolean a(HttpsURLConnection httpsURLConnection, String str) {
        String headerField;
        boolean z10 = false;
        try {
            httpsURLConnection.setInstanceFollowRedirects(false);
            int responseCode = httpsURLConnection.getResponseCode();
            if ((responseCode == 302 || responseCode == 301 || responseCode == 303) && (headerField = httpsURLConnection.getHeaderField("Location")) != null && headerField.contains(str)) {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        } catch (Exception unused) {
            return Boolean.FALSE;
        }
    }
}
