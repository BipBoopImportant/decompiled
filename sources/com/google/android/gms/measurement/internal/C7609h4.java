package com.google.android.gms.measurement.internal;

import K9.C6620s;
import java.net.URL;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.h4  reason: case insensitive filesystem */
final class C7609h4 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final URL f50168a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f50169b;

    /* renamed from: c  reason: collision with root package name */
    private final C7588e4 f50170c;

    /* renamed from: d  reason: collision with root package name */
    private final String f50171d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f50172e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ C7595f4 f50173f;

    public C7609h4(C7595f4 f4Var, String str, URL url, byte[] bArr, Map<String, String> map, C7588e4 e4Var) {
        this.f50173f = f4Var;
        C6620s.f(str);
        C6620s.l(url);
        C6620s.l(e4Var);
        this.f50168a = url;
        this.f50169b = bArr;
        this.f50170c = e4Var;
        this.f50171d = str;
        this.f50172e = map;
    }

    private final void a(int i10, Exception exc, byte[] bArr, Map<String, List<String>> map) {
        this.f50173f.q().B(new C7602g4(this, i10, exc, bArr, map));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v23, resolved type: java.io.OutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: java.io.OutputStream} */
    /* JADX WARNING: type inference failed for: r5v28 */
    /* JADX WARNING: type inference failed for: r5v29 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0059, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0103, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0104, code lost:
        r10.f50173f.f().E().c("Error closing HTTP compressed POST connection output stream. appId", com.google.android.gms.measurement.internal.C7607h2.t(r10.f50171d), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0119, code lost:
        r3.disconnect();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0059 A[Catch:{ IOException -> 0x00bb, all -> 0x0059, IOException -> 0x005e, all -> 0x0059 }, ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff A[SYNTHETIC, Splitter:B:51:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0122 A[SYNTHETIC, Splitter:B:60:0x0122] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            java.lang.String r0 = "Error closing HTTP compressed POST connection output stream. appId"
            com.google.android.gms.measurement.internal.f4 r1 = r10.f50173f
            r1.i()
            r1 = 0
            r2 = 0
            java.net.URL r3 = r10.f50168a     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            com.google.android.gms.internal.measurement.F0 r4 = com.google.android.gms.internal.measurement.F0.a()     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            java.lang.String r5 = "client-measurement"
            java.net.URLConnection r3 = r4.b(r3, r5)     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            if (r4 == 0) goto L_0x00f5
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            r3.setDefaultUseCaches(r2)     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            r4 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r4)     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            r3.setInstanceFollowRedirects(r2)     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            r4 = 1
            r3.setDoInput(r4)     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            java.util.Map<java.lang.String, java.lang.String> r5 = r10.f50172e     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            if (r5 == 0) goto L_0x0063
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
        L_0x003d:
            boolean r6 = r5.hasNext()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            if (r6 == 0) goto L_0x0063
            java.lang.Object r6 = r5.next()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.lang.Object r7 = r6.getKey()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.lang.Object r6 = r6.getValue()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            r3.addRequestProperty(r7, r6)     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            goto L_0x003d
        L_0x0059:
            r4 = move-exception
            r5 = r1
        L_0x005b:
            r6 = r5
            goto L_0x00fd
        L_0x005e:
            r4 = move-exception
            r5 = r1
        L_0x0060:
            r6 = r5
            goto L_0x0120
        L_0x0063:
            byte[] r5 = r10.f50169b     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            if (r5 == 0) goto L_0x00cc
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch:{ IOException -> 0x00bb, all -> 0x0059 }
            r6.<init>()     // Catch:{ IOException -> 0x00bb, all -> 0x0059 }
            java.util.zip.GZIPOutputStream r7 = new java.util.zip.GZIPOutputStream     // Catch:{ IOException -> 0x00bb, all -> 0x0059 }
            r7.<init>(r6)     // Catch:{ IOException -> 0x00bb, all -> 0x0059 }
            r7.write(r5)     // Catch:{ IOException -> 0x00bb, all -> 0x0059 }
            r7.close()     // Catch:{ IOException -> 0x00bb, all -> 0x0059 }
            r6.close()     // Catch:{ IOException -> 0x00bb, all -> 0x0059 }
            byte[] r5 = r6.toByteArray()     // Catch:{ IOException -> 0x00bb, all -> 0x0059 }
            com.google.android.gms.measurement.internal.f4 r6 = r10.f50173f     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            com.google.android.gms.measurement.internal.h2 r6 = r6.f()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            com.google.android.gms.measurement.internal.i2 r6 = r6.I()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.lang.String r7 = "Uploading data. size"
            int r8 = r5.length     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            r6.b(r7, r8)     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            r3.setDoOutput(r4)     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r6 = "gzip"
            r3.addRequestProperty(r4, r6)     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            int r4 = r5.length     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            r3.setFixedLengthStreamingMode(r4)     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            r3.connect()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.io.OutputStream r4 = r3.getOutputStream()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            r4.write(r5)     // Catch:{ IOException -> 0x00b4, all -> 0x00ae }
            r4.close()     // Catch:{ IOException -> 0x00b4, all -> 0x00ae }
            goto L_0x00cc
        L_0x00ae:
            r5 = move-exception
            r6 = r1
            r9 = r5
            r5 = r4
            r4 = r9
            goto L_0x00fd
        L_0x00b4:
            r5 = move-exception
            r6 = r1
            r9 = r5
            r5 = r4
            r4 = r9
            goto L_0x0120
        L_0x00bb:
            r4 = move-exception
            com.google.android.gms.measurement.internal.f4 r5 = r10.f50173f     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            com.google.android.gms.measurement.internal.h2 r5 = r5.f()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            com.google.android.gms.measurement.internal.i2 r5 = r5.E()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.lang.String r6 = "Failed to gzip post request content"
            r5.b(r6, r4)     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            throw r4     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
        L_0x00cc:
            int r2 = r3.getResponseCode()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            java.util.Map r4 = r3.getHeaderFields()     // Catch:{ IOException -> 0x005e, all -> 0x0059 }
            com.google.android.gms.measurement.internal.f4 r5 = r10.f50173f     // Catch:{ IOException -> 0x00e6, all -> 0x00e1 }
            byte[] r0 = com.google.android.gms.measurement.internal.C7595f4.t(r3)     // Catch:{ IOException -> 0x00e6, all -> 0x00e1 }
            r3.disconnect()
            r10.a(r2, r1, r0, r4)
            return
        L_0x00e1:
            r5 = move-exception
            r6 = r4
            r4 = r5
            r5 = r1
            goto L_0x00fd
        L_0x00e6:
            r5 = move-exception
            r6 = r4
            r4 = r5
            r5 = r1
            goto L_0x0120
        L_0x00eb:
            r4 = move-exception
            r3 = r1
            r5 = r3
            goto L_0x005b
        L_0x00f0:
            r4 = move-exception
            r3 = r1
            r5 = r3
            goto L_0x0060
        L_0x00f5:
            java.io.IOException r3 = new java.io.IOException     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            java.lang.String r4 = "Failed to obtain HTTP connection"
            r3.<init>(r4)     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
            throw r3     // Catch:{ IOException -> 0x00f0, all -> 0x00eb }
        L_0x00fd:
            if (r5 == 0) goto L_0x0117
            r5.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0117
        L_0x0103:
            r5 = move-exception
            com.google.android.gms.measurement.internal.f4 r7 = r10.f50173f
            com.google.android.gms.measurement.internal.h2 r7 = r7.f()
            com.google.android.gms.measurement.internal.i2 r7 = r7.E()
            java.lang.String r8 = r10.f50171d
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7607h2.t(r8)
            r7.c(r0, r8, r5)
        L_0x0117:
            if (r3 == 0) goto L_0x011c
            r3.disconnect()
        L_0x011c:
            r10.a(r2, r1, r1, r6)
            throw r4
        L_0x0120:
            if (r5 == 0) goto L_0x013a
            r5.close()     // Catch:{ IOException -> 0x0126 }
            goto L_0x013a
        L_0x0126:
            r5 = move-exception
            com.google.android.gms.measurement.internal.f4 r7 = r10.f50173f
            com.google.android.gms.measurement.internal.h2 r7 = r7.f()
            com.google.android.gms.measurement.internal.i2 r7 = r7.E()
            java.lang.String r8 = r10.f50171d
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C7607h2.t(r8)
            r7.c(r0, r8, r5)
        L_0x013a:
            if (r3 == 0) goto L_0x013f
            r3.disconnect()
        L_0x013f:
            r10.a(r2, r4, r1, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C7609h4.run():void");
    }
}
