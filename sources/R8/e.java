package R8;

import D8.c;
import L8.f;
import YH.X;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007*\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "d", "(Ljava/lang/String;)Ljava/lang/String;", "", "patterns", "c", "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;", "", "a", "(Ljava/util/Map;)Ljava/util/Map;", "", "b", "(Ljava/lang/String;)[B", "error-analysis_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class e {
    public static final Map<String, String> a(Map<String, String> map) {
        C17542s.j(map, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), a.a((String) entry.getValue()));
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0099 A[Catch:{ all -> 0x0035 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0079 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] b(java.lang.String r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ all -> 0x0035 }
            java.util.Set r0 = r6.getQueryParameterNames()     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "uri.queryParameterNames"
            kotlin.jvm.internal.C17542s.i(r0, r1)     // Catch:{ all -> 0x0035 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
            r1.<init>()     // Catch:{ all -> 0x0035 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0035 }
        L_0x001b:
            boolean r2 = r0.hasNext()     // Catch:{ all -> 0x0035 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x003e
            java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x0035 }
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0038
            boolean r5 = HJ.C15854t.v0(r5)     // Catch:{ all -> 0x0035 }
            if (r5 == 0) goto L_0x0033
            goto L_0x0038
        L_0x0033:
            r3 = r4
            goto L_0x0038
        L_0x0035:
            r6 = move-exception
            goto L_0x00bf
        L_0x0038:
            if (r3 != 0) goto L_0x001b
            r1.add(r2)     // Catch:{ all -> 0x0035 }
            goto L_0x001b
        L_0x003e:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0035 }
            r2 = 10
            int r2 = YH.C16877v.y(r1, r2)     // Catch:{ all -> 0x0035 }
            int r2 = YH.X.e(r2)     // Catch:{ all -> 0x0035 }
            r5 = 16
            int r2 = tI.C17978n.e(r2, r5)     // Catch:{ all -> 0x0035 }
            r0.<init>(r2)     // Catch:{ all -> 0x0035 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0035 }
        L_0x0057:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x006c
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0035 }
            r5 = r2
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0035 }
            java.lang.String r5 = r6.getQueryParameter(r5)     // Catch:{ all -> 0x0035 }
            r0.put(r2, r5)     // Catch:{ all -> 0x0035 }
            goto L_0x0057
        L_0x006c:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0035 }
            r6.<init>()     // Catch:{ all -> 0x0035 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0035 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0035 }
        L_0x0079:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x00a5
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0035 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r1.getValue()     // Catch:{ all -> 0x0035 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0096
            boolean r2 = HJ.C15854t.v0(r2)     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r2 = r4
            goto L_0x0097
        L_0x0096:
            r2 = r3
        L_0x0097:
            if (r2 != 0) goto L_0x0079
            java.lang.Object r2 = r1.getKey()     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0035 }
            r6.put(r2, r1)     // Catch:{ all -> 0x0035 }
            goto L_0x0079
        L_0x00a5:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ all -> 0x0035 }
            r0.<init>(r6)     // Catch:{ all -> 0x0035 }
            java.lang.String r6 = r0.toString()     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "JSONObject(queryParameters).toString()"
            kotlin.jvm.internal.C17542s.i(r6, r0)     // Catch:{ all -> 0x0035 }
            java.nio.charset.Charset r0 = HJ.C15838d.f135279b     // Catch:{ all -> 0x0035 }
            byte[] r6 = r6.getBytes(r0)     // Catch:{ all -> 0x0035 }
            java.lang.String r0 = "this as java.lang.String).getBytes(charset)"
            kotlin.jvm.internal.C17542s.i(r6, r0)     // Catch:{ all -> 0x0035 }
            goto L_0x00cc
        L_0x00bf:
            D8.c r0 = new D8.c
            java.lang.String r1 = "NetworkEventMetric"
            r0.<init>(r1)
            java.lang.String r1 = "Exception received while parsing query parameters"
            r0.g(r6, r1)
            r6 = 0
        L_0x00cc:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R8.e.b(java.lang.String):byte[]");
    }

    public static final String c(String str, List<String> list) {
        C17542s.j(str, "<this>");
        C17542s.j(list, "patterns");
        return f.f38460a.c(str, list);
    }

    public static final String d(String str) {
        C17542s.j(str, "<this>");
        try {
            URI uri = new URI(str);
            String uri2 = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), (String) null, uri.getFragment()).toString();
            C17542s.i(uri2, "{\n        val uri = URI(…       ).toString()\n    }");
            return uri2;
        } catch (Throwable th2) {
            new c((String) null, 1, (DefaultConstructorMarker) null).g(th2, "Exception received while parsing url");
            return str;
        }
    }
}
