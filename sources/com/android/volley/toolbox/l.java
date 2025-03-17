package com.android.volley.toolbox;

import android.os.SystemClock;
import com.android.volley.b;
import com.android.volley.d;
import com.android.volley.g;
import com.android.volley.j;
import com.android.volley.k;
import com.android.volley.n;
import com.android.volley.r;
import com.android.volley.s;
import com.android.volley.t;
import com.android.volley.u;
import com.android.volley.v;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;

final class l {

    static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final String f46278a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final u f46279b;

        private b(String str, u uVar) {
            this.f46278a = str;
            this.f46279b = uVar;
        }
    }

    static void a(n<?> nVar, b bVar) {
        r retryPolicy = nVar.getRetryPolicy();
        int timeoutMs = nVar.getTimeoutMs();
        try {
            retryPolicy.b(bVar.f46279b);
            nVar.addMarker(String.format("%s-retry [timeout=%s]", new Object[]{bVar.f46278a, Integer.valueOf(timeoutMs)}));
        } catch (u e10) {
            nVar.addMarker(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{bVar.f46278a, Integer.valueOf(timeoutMs)}));
            throw e10;
        }
    }

    static k b(n<?> nVar, long j10, List<g> list) {
        b.a cacheEntry = nVar.getCacheEntry();
        if (cacheEntry == null) {
            return new k(304, (byte[]) null, true, j10, list);
        }
        return new k(304, cacheEntry.f46191a, true, j10, e.a(list, cacheEntry));
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0033 A[SYNTHETIC, Splitter:B:19:0x0033] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static byte[] c(java.io.InputStream r5, int r6, com.android.volley.toolbox.c r7) {
        /*
            java.lang.String r0 = "Error occurred when closing InputStream"
            com.android.volley.toolbox.m r1 = new com.android.volley.toolbox.m
            r1.<init>(r7, r6)
            r6 = 1024(0x400, float:1.435E-42)
            r2 = 0
            byte[] r6 = r7.a(r6)     // Catch:{ all -> 0x002f }
        L_0x000e:
            int r3 = r5.read(r6)     // Catch:{ all -> 0x0019 }
            r4 = -1
            if (r3 == r4) goto L_0x001b
            r1.write(r6, r2, r3)     // Catch:{ all -> 0x0019 }
            goto L_0x000e
        L_0x0019:
            r3 = move-exception
            goto L_0x0031
        L_0x001b:
            byte[] r3 = r1.toByteArray()     // Catch:{ all -> 0x0019 }
            r5.close()     // Catch:{ IOException -> 0x0023 }
            goto L_0x0028
        L_0x0023:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.android.volley.v.e(r0, r5)
        L_0x0028:
            r7.b(r6)
            r1.close()
            return r3
        L_0x002f:
            r3 = move-exception
            r6 = 0
        L_0x0031:
            if (r5 == 0) goto L_0x003c
            r5.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003c
        L_0x0037:
            java.lang.Object[] r5 = new java.lang.Object[r2]
            com.android.volley.v.e(r0, r5)
        L_0x003c:
            r7.b(r6)
            r1.close()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.volley.toolbox.l.c(java.io.InputStream, int, com.android.volley.toolbox.c):byte[]");
    }

    static void d(long j10, n<?> nVar, byte[] bArr, int i10) {
        if (v.f46286b || j10 > 3000) {
            v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", nVar, Long.valueOf(j10), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i10), Integer.valueOf(nVar.getRetryPolicy().a()));
        }
    }

    static b e(n<?> nVar, IOException iOException, long j10, f fVar, byte[] bArr) {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new t());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + nVar.getUrl(), iOException);
        } else if (fVar != null) {
            int d10 = fVar.d();
            v.c("Unexpected response code %d for %s", Integer.valueOf(d10), nVar.getUrl());
            if (bArr == null) {
                return new b("network", new j());
            }
            int i10 = d10;
            byte[] bArr2 = bArr;
            k kVar = new k(i10, bArr2, false, SystemClock.elapsedRealtime() - j10, fVar.c());
            if (d10 == 401 || d10 == 403) {
                return new b("auth", new com.android.volley.a(kVar));
            }
            if (d10 >= 400 && d10 <= 499) {
                throw new d(kVar);
            } else if (d10 >= 500 && d10 <= 599 && nVar.shouldRetryServerErrors()) {
                return new b("server", new s(kVar));
            } else {
                throw new s(kVar);
            }
        } else if (nVar.shouldRetryConnectionErrors()) {
            return new b("connection", new com.android.volley.l());
        } else {
            throw new com.android.volley.l(iOException);
        }
    }
}
