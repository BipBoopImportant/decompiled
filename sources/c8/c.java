package C8;

import HJ.C15838d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LC8/c;", "LC8/b;", "<init>", "()V", "LC8/g;", "options", "LC8/d;", "a", "(LC8/g;)LC8/d;", "", "data", "b", "(LC8/g;[B)LC8/d;", "Ljava/net/HttpURLConnection;", "c", "(LC8/g;)Ljava/net/HttpURLConnection;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements b {
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        jI.C17416c.a(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        if (r7 != null) goto L_0x0052;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0071  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8.d a(C8.g r7) {
        /*
            r6 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            C8.d r0 = new C8.d
            r0.<init>()
            java.lang.String r1 = r7.a()
            r0.j(r1)
            r1 = 0
            java.net.HttpURLConnection r7 = r6.c(r7)     // Catch:{ Exception -> 0x0064, all -> 0x0062 }
            java.lang.String r2 = "GET"
            r7.setRequestMethod(r2)     // Catch:{ Exception -> 0x0059 }
            r7.connect()     // Catch:{ Exception -> 0x0059 }
            int r2 = r7.getResponseCode()     // Catch:{ Exception -> 0x0059 }
            r0.m(r2)     // Catch:{ Exception -> 0x0059 }
            java.util.Map r2 = r7.getHeaderFields()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r3 = "connection.headerFields"
            kotlin.jvm.internal.C17542s.i(r2, r3)     // Catch:{ Exception -> 0x0059 }
            r0.l(r2)     // Catch:{ Exception -> 0x0059 }
            java.io.InputStream r2 = r7.getInputStream()     // Catch:{ Exception -> 0x0059 }
            java.lang.String r3 = "connection.inputStream"
            kotlin.jvm.internal.C17542s.i(r2, r3)     // Catch:{ Exception -> 0x0059 }
            java.nio.charset.Charset r3 = HJ.C15838d.f135279b     // Catch:{ Exception -> 0x0059 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0059 }
            r4.<init>(r2, r3)     // Catch:{ Exception -> 0x0059 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0059 }
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r4, r3)     // Catch:{ Exception -> 0x0059 }
            java.lang.String r3 = jI.C17431r.h(r2)     // Catch:{ all -> 0x005b }
            jI.C17416c.a(r2, r1)     // Catch:{ Exception -> 0x0059 }
            r0.n(r3)     // Catch:{ Exception -> 0x0059 }
        L_0x0052:
            r7.disconnect()
            goto L_0x006e
        L_0x0056:
            r0 = move-exception
            r1 = r7
            goto L_0x006f
        L_0x0059:
            r1 = move-exception
            goto L_0x0068
        L_0x005b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x005d }
        L_0x005d:
            r3 = move-exception
            jI.C17416c.a(r2, r1)     // Catch:{ Exception -> 0x0059 }
            throw r3     // Catch:{ Exception -> 0x0059 }
        L_0x0062:
            r0 = move-exception
            goto L_0x006f
        L_0x0064:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
        L_0x0068:
            r0.k(r1)     // Catch:{ all -> 0x0056 }
            if (r7 == 0) goto L_0x006e
            goto L_0x0052
        L_0x006e:
            return r0
        L_0x006f:
            if (r1 == 0) goto L_0x0074
            r1.disconnect()
        L_0x0074:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: C8.c.a(C8.g):C8.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0076, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        jI.C17416c.a(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007a, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C8.d b(C8.g r7, byte[] r8) {
        /*
            r6 = this;
            java.lang.String r0 = "options"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            C8.d r0 = new C8.d
            r0.<init>()
            java.lang.String r1 = r7.a()
            r0.j(r1)
            r1 = 0
            java.net.HttpURLConnection r7 = r6.c(r7)     // Catch:{ Exception -> 0x007d }
            java.lang.String r2 = "POST"
            r7.setRequestMethod(r2)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r2 = 1
            r7.setDoOutput(r2)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            java.io.OutputStream r4 = r7.getOutputStream()     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r4.write(r8)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r4.flush()     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r4.close()     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            int r4 = r7.getResponseCode()     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r0.m(r4)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            int r8 = r8.length     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            long r4 = (long) r8     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r0.i(r4)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            long r4 = r4 - r2
            r0.o(r4)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            java.io.InputStream r8 = r7.getInputStream()     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            java.lang.String r2 = "connection.inputStream"
            kotlin.jvm.internal.C17542s.i(r8, r2)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            java.nio.charset.Charset r2 = HJ.C15838d.f135279b     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r3.<init>(r8, r2)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r2 = 8192(0x2000, float:1.14794E-41)
            r8.<init>(r3, r2)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            java.lang.String r2 = jI.C17431r.h(r8)     // Catch:{ all -> 0x0074 }
            jI.C17416c.a(r8, r1)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r0.n(r2)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            r7.disconnect()
            goto L_0x0086
        L_0x006e:
            r8 = move-exception
            r1 = r7
            goto L_0x0087
        L_0x0071:
            r8 = move-exception
            r1 = r7
            goto L_0x007e
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r2 = move-exception
            jI.C17416c.a(r8, r1)     // Catch:{ Exception -> 0x0071, all -> 0x006e }
            throw r2     // Catch:{ Exception -> 0x0071, all -> 0x006e }
        L_0x007b:
            r8 = move-exception
            goto L_0x0087
        L_0x007d:
            r8 = move-exception
        L_0x007e:
            r0.k(r8)     // Catch:{ all -> 0x007b }
            if (r1 == 0) goto L_0x0086
            r1.disconnect()
        L_0x0086:
            return r0
        L_0x0087:
            if (r1 == 0) goto L_0x008c
            r1.disconnect()
        L_0x008c:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: C8.c.b(C8.g, byte[]):C8.d");
    }

    public final HttpURLConnection c(g gVar) {
        C17542s.j(gVar, "options");
        URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(gVar.a()).openConnection());
        C17542s.h(uRLConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
        httpURLConnection.setRequestProperty("Charset", C15838d.f135279b.name());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setConnectTimeout(gVar.c());
        httpURLConnection.setReadTimeout(gVar.d());
        for (Map.Entry next : gVar.b().entrySet()) {
            httpURLConnection.setRequestProperty((String) next.getKey(), (String) next.getValue());
        }
        return httpURLConnection;
    }
}
