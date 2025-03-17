package DE;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/* renamed from: DE.b  reason: case insensitive filesystem */
public final class C12747b {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f108606a = LoggerFactory.getLogger((Class<?>) C12747b.class);
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static final String f108607b = b();

    /* renamed from: c  reason: collision with root package name */
    private static String f108608c = b();

    private C12747b() {
    }

    public static String a() {
        return f108608c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        f108606a.error("unable to close reader cleanly");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0032 */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d A[SYNTHETIC, Splitter:B:18:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0049 A[SYNTHETIC, Splitter:B:24:0x0049] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b() {
        /*
            java.lang.String r0 = "unable to close reader cleanly"
            r1 = 0
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0032 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0032 }
            java.lang.Class<DE.b> r4 = DE.C12747b.class
            java.lang.String r5 = "/optimizely-build-version"
            java.io.InputStream r4 = r4.getResourceAsStream(r5)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r5 = "UTF-8"
            java.nio.charset.Charset r5 = java.nio.charset.Charset.forName(r5)     // Catch:{ Exception -> 0x0032 }
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x0032 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0032 }
            java.lang.String r1 = r2.readLine()     // Catch:{ Exception -> 0x002b, all -> 0x0029 }
            r2.close()     // Catch:{ Exception -> 0x0023 }
            goto L_0x0028
        L_0x0023:
            org.slf4j.Logger r2 = f108606a
            r2.error(r0)
        L_0x0028:
            return r1
        L_0x0029:
            r1 = move-exception
            goto L_0x0047
        L_0x002b:
            r1 = r2
            goto L_0x0032
        L_0x002d:
            r2 = move-exception
            r6 = r2
            r2 = r1
            r1 = r6
            goto L_0x0047
        L_0x0032:
            org.slf4j.Logger r2 = f108606a     // Catch:{ all -> 0x002d }
            java.lang.String r3 = "unable to read version number"
            r2.error(r3)     // Catch:{ all -> 0x002d }
            java.lang.String r2 = "unknown"
            if (r1 == 0) goto L_0x0046
            r1.close()     // Catch:{ Exception -> 0x0041 }
            goto L_0x0046
        L_0x0041:
            org.slf4j.Logger r1 = f108606a
            r1.error(r0)
        L_0x0046:
            return r2
        L_0x0047:
            if (r2 == 0) goto L_0x0052
            r2.close()     // Catch:{ Exception -> 0x004d }
            goto L_0x0052
        L_0x004d:
            org.slf4j.Logger r2 = f108606a
            r2.error(r0)
        L_0x0052:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: DE.C12747b.b():java.lang.String");
    }

    public static void c(String str) {
        if (str == null || str.isEmpty()) {
            f108606a.warn("ClientVersion cannot be empty, defaulting to the core java-sdk version.");
        } else {
            f108608c = str;
        }
    }
}
