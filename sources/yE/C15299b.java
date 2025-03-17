package yE;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

/* renamed from: yE.b  reason: case insensitive filesystem */
public class C15299b {

    /* renamed from: c  reason: collision with root package name */
    static final int f132209c = ((int) Math.pow(2.0d, 5.0d));

    /* renamed from: a  reason: collision with root package name */
    private final C15302e f132210a;

    /* renamed from: b  reason: collision with root package name */
    private final Logger f132211b;

    /* renamed from: yE.b$a */
    public interface a<T> {
        T execute();
    }

    public C15299b(C15302e eVar, Logger logger) {
        this.f132210a = eVar;
        this.f132211b = logger;
    }

    public <T> T a(a<T> aVar, int i10, int i11) {
        int pow = (int) Math.pow((double) i10, (double) i11);
        T t10 = null;
        int i12 = i10;
        while (i12 <= pow) {
            try {
                t10 = aVar.execute();
            } catch (Exception e10) {
                this.f132211b.error("Request failed with error: ", (Throwable) e10);
            }
            if (t10 != null && t10 != Boolean.FALSE) {
                break;
            }
            try {
                this.f132211b.info("Request failed, waiting {} seconds to try again", (Object) Integer.valueOf(i12));
                Thread.sleep(TimeUnit.MILLISECONDS.convert((long) i12, TimeUnit.SECONDS));
                i12 *= i10;
            } catch (InterruptedException e11) {
                this.f132211b.warn("Exponential backoff failed", (Throwable) e11);
            }
        }
        return t10;
    }

    public HttpURLConnection b(URL url) {
        try {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        } catch (Exception unused) {
            this.f132211b.warn("Error making request to {}.", (Object) url);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0043 A[SYNTHETIC, Splitter:B:24:0x0043] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0050 A[SYNTHETIC, Splitter:B:30:0x0050] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String c(java.net.URLConnection r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Problem with closing the scanner on a input stream"
            r1 = 0
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            java.util.Scanner r7 = new java.util.Scanner     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            java.lang.String r2 = "\\A"
            java.util.Scanner r7 = r7.useDelimiter(r2)     // Catch:{ Exception -> 0x0038, all -> 0x0033 }
            boolean r2 = r7.hasNext()     // Catch:{ Exception -> 0x0024 }
            if (r2 == 0) goto L_0x0026
            java.lang.String r1 = r7.next()     // Catch:{ Exception -> 0x0024 }
            goto L_0x0028
        L_0x0022:
            r1 = move-exception
            goto L_0x004e
        L_0x0024:
            r2 = move-exception
            goto L_0x003a
        L_0x0026:
            java.lang.String r1 = ""
        L_0x0028:
            r7.close()     // Catch:{ Exception -> 0x002c }
            goto L_0x0032
        L_0x002c:
            r7 = move-exception
            org.slf4j.Logger r2 = r6.f132211b
            r2.error((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x0032:
            return r1
        L_0x0033:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r5
            goto L_0x004e
        L_0x0038:
            r2 = move-exception
            r7 = r1
        L_0x003a:
            org.slf4j.Logger r3 = r6.f132211b     // Catch:{ all -> 0x0022 }
            java.lang.String r4 = "Error reading urlConnection stream."
            r3.warn((java.lang.String) r4, (java.lang.Throwable) r2)     // Catch:{ all -> 0x0022 }
            if (r7 == 0) goto L_0x004d
            r7.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r7 = move-exception
            org.slf4j.Logger r2 = r6.f132211b
            r2.error((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x004d:
            return r1
        L_0x004e:
            if (r7 == 0) goto L_0x005a
            r7.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x005a
        L_0x0054:
            r7 = move-exception
            org.slf4j.Logger r2 = r6.f132211b
            r2.error((java.lang.String) r0, (java.lang.Throwable) r7)
        L_0x005a:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yE.C15299b.c(java.net.URLConnection):java.lang.String");
    }

    public void d(URLConnection uRLConnection) {
        if (uRLConnection == null || uRLConnection.getURL() == null) {
            this.f132211b.error("Invalid connection");
        } else if (uRLConnection.getLastModified() > 0) {
            this.f132210a.d(uRLConnection.getURL().toString(), uRLConnection.getLastModified());
        } else {
            this.f132211b.warn("CDN response didn't have a last modified header");
        }
    }

    public void e(URLConnection uRLConnection) {
        if (uRLConnection == null || uRLConnection.getURL() == null) {
            this.f132211b.error("Invalid connection");
            return;
        }
        long a10 = this.f132210a.a(uRLConnection.getURL().toString(), 0);
        if (a10 > 0) {
            uRLConnection.setIfModifiedSince(a10);
        }
    }
}
