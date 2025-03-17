package Vb;

import com.adjust.sdk.Constants;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f64502a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, String> f64503b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f64504c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f64502a = str;
        this.f64503b = map;
    }

    private String a(Map<String, String> map) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        sb2.append((String) next.getKey());
        sb2.append("=");
        sb2.append(next.getValue() != null ? URLEncoder.encode((String) next.getValue(), Constants.ENCODING) : "");
        while (it.hasNext()) {
            Map.Entry next2 = it.next();
            sb2.append("&");
            sb2.append((String) next2.getKey());
            sb2.append("=");
            sb2.append(next2.getValue() != null ? URLEncoder.encode((String) next2.getValue(), Constants.ENCODING) : "");
        }
        return sb2.toString();
    }

    private String b(String str, Map<String, String> map) {
        String a10 = a(map);
        if (a10.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a10 = "&" + a10;
            }
            return str + a10;
        }
        return str + "?" + a10;
    }

    private String e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Constants.ENCODING));
        char[] cArr = new char[8192];
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                return sb2.toString();
            }
            sb2.append(cArr, 0, read);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Vb.c c() {
        /*
            r5 = this;
            Rb.f.d()
            r0 = 0
            java.lang.String r1 = r5.f64502a     // Catch:{ all -> 0x0087 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f64503b     // Catch:{ all -> 0x0087 }
            java.lang.String r1 = r5.b(r1, r2)     // Catch:{ all -> 0x0087 }
            Nb.g r2 = Nb.g.f()     // Catch:{ all -> 0x0087 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0087 }
            r3.<init>()     // Catch:{ all -> 0x0087 }
            java.lang.String r4 = "GET Request URL: "
            r3.append(r4)     // Catch:{ all -> 0x0087 }
            r3.append(r1)     // Catch:{ all -> 0x0087 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0087 }
            r2.i(r3)     // Catch:{ all -> 0x0087 }
            java.net.URL r2 = new java.net.URL     // Catch:{ all -> 0x0087 }
            r2.<init>(r1)     // Catch:{ all -> 0x0087 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ all -> 0x0087 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ all -> 0x0087 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setReadTimeout(r2)     // Catch:{ all -> 0x0062 }
            r1.setConnectTimeout(r2)     // Catch:{ all -> 0x0062 }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ all -> 0x0062 }
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.f64504c     // Catch:{ all -> 0x0062 }
            java.util.Set r2 = r2.entrySet()     // Catch:{ all -> 0x0062 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0062 }
        L_0x0046:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0062 }
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch:{ all -> 0x0062 }
            java.lang.Object r4 = r3.getKey()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0062 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x0062 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0062 }
            r1.addRequestProperty(r4, r3)     // Catch:{ all -> 0x0062 }
            goto L_0x0046
        L_0x0062:
            r2 = move-exception
            goto L_0x0089
        L_0x0064:
            r1.connect()     // Catch:{ all -> 0x0062 }
            int r2 = r1.getResponseCode()     // Catch:{ all -> 0x0062 }
            java.io.InputStream r3 = r1.getInputStream()     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x0079
            java.lang.String r0 = r5.e(r3)     // Catch:{ all -> 0x0076 }
            goto L_0x0079
        L_0x0076:
            r2 = move-exception
            r0 = r3
            goto L_0x0089
        L_0x0079:
            if (r3 == 0) goto L_0x007e
            r3.close()
        L_0x007e:
            r1.disconnect()
            Vb.c r1 = new Vb.c
            r1.<init>(r2, r0)
            return r1
        L_0x0087:
            r2 = move-exception
            r1 = r0
        L_0x0089:
            if (r0 == 0) goto L_0x008e
            r0.close()
        L_0x008e:
            if (r1 == 0) goto L_0x0093
            r1.disconnect()
        L_0x0093:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Vb.a.c():Vb.c");
    }

    public a d(String str, String str2) {
        this.f64504c.put(str, str2);
        return this;
    }
}
