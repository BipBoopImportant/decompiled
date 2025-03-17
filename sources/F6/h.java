package F6;

import I6.d;
import android.content.Context;
import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import w6.C8917A;
import w6.C8927i;
import w6.r;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final g f35465a;

    /* renamed from: b  reason: collision with root package name */
    private final f f35466b;

    public h(g gVar, f fVar) {
        this.f35465a = gVar;
        this.f35466b = fVar;
    }

    private C8927i a(Context context, String str, String str2) {
        g gVar;
        Pair<c, InputStream> a10;
        if (str2 == null || (gVar = this.f35465a) == null || (a10 = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) a10.first;
        InputStream inputStream = (InputStream) a10.second;
        C8917A<C8927i> z10 = cVar == c.ZIP ? r.z(context, new ZipInputStream(inputStream), str2) : r.p(inputStream, str2);
        if (z10.b() != null) {
            return z10.b();
        }
        return null;
    }

    private C8917A<C8927i> b(Context context, String str, String str2) {
        d.a("Fetching " + str);
        d dVar = null;
        try {
            dVar = this.f35466b.a(str);
            if (dVar.e1()) {
                C8917A<C8927i> d10 = d(context, str, dVar.L0(), dVar.C0(), str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Completed fetch from network. Success: ");
                sb2.append(d10.b() != null);
                d.a(sb2.toString());
                try {
                    dVar.close();
                } catch (IOException e10) {
                    d.d("LottieFetchResult close failed ", e10);
                }
                return d10;
            }
            C8917A<C8927i> a10 = new C8917A<>((Throwable) new IllegalArgumentException(dVar.s2()));
            try {
                dVar.close();
            } catch (IOException e11) {
                d.d("LottieFetchResult close failed ", e11);
            }
            return a10;
        } catch (Exception e12) {
            C8917A<C8927i> a11 = new C8917A<>((Throwable) e12);
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e13) {
                    d.d("LottieFetchResult close failed ", e13);
                }
            }
            return a11;
        } catch (Throwable th2) {
            if (dVar != null) {
                try {
                    dVar.close();
                } catch (IOException e14) {
                    d.d("LottieFetchResult close failed ", e14);
                }
            }
            throw th2;
        }
    }

    private C8917A<C8927i> d(Context context, String str, InputStream inputStream, String str2, String str3) {
        C8917A<C8927i> a10;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            d.a("Handling zip response.");
            c cVar2 = c.ZIP;
            a10 = f(context, str, inputStream, str3);
            cVar = cVar2;
        } else {
            d.a("Received json response.");
            cVar = c.JSON;
            a10 = e(str, inputStream, str3);
        }
        if (!(str3 == null || a10.b() == null || (gVar = this.f35465a) == null)) {
            gVar.f(str, cVar);
        }
        return a10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r4 = r1.f35465a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private w6.C8917A<w6.C8927i> e(java.lang.String r2, java.io.InputStream r3, java.lang.String r4) {
        /*
            r1 = this;
            if (r4 == 0) goto L_0x001b
            F6.g r4 = r1.f35465a
            if (r4 != 0) goto L_0x0007
            goto L_0x001b
        L_0x0007:
            F6.c r0 = F6.c.JSON
            java.io.File r3 = r4.g(r2, r3, r0)
            java.io.FileInputStream r4 = new java.io.FileInputStream
            java.lang.String r3 = r3.getAbsolutePath()
            r4.<init>(r3)
            w6.A r2 = w6.r.p(r4, r2)
            return r2
        L_0x001b:
            r2 = 0
            w6.A r2 = w6.r.p(r3, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.h.e(java.lang.String, java.io.InputStream, java.lang.String):w6.A");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r5 = r1.f35465a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private w6.C8917A<w6.C8927i> f(android.content.Context r2, java.lang.String r3, java.io.InputStream r4, java.lang.String r5) {
        /*
            r1 = this;
            if (r5 == 0) goto L_0x001c
            F6.g r5 = r1.f35465a
            if (r5 != 0) goto L_0x0007
            goto L_0x001c
        L_0x0007:
            F6.c r0 = F6.c.ZIP
            java.io.File r4 = r5.g(r3, r4, r0)
            java.util.zip.ZipInputStream r5 = new java.util.zip.ZipInputStream
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r4)
            r5.<init>(r0)
            w6.A r2 = w6.r.z(r2, r5, r3)
            return r2
        L_0x001c:
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream
            r3.<init>(r4)
            r4 = 0
            w6.A r2 = w6.r.z(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: F6.h.f(android.content.Context, java.lang.String, java.io.InputStream, java.lang.String):w6.A");
    }

    public C8917A<C8927i> c(Context context, String str, String str2) {
        C8927i a10 = a(context, str, str2);
        if (a10 != null) {
            return new C8917A<>(a10);
        }
        d.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
