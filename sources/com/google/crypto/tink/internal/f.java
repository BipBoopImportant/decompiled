package com.google.crypto.tink.internal;

import Ab.b;
import Ab.c;
import Cb.z;
import java.security.GeneralSecurityException;
import java.util.List;
import qb.C10166k;
import qb.C10177v;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final b.a f67861a = new b((a) null);

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f67862a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                Cb.z[] r0 = Cb.z.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f67862a = r0
                Cb.z r1 = Cb.z.ENABLED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f67862a     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.z r1 = Cb.z.DISABLED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f67862a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Cb.z r1 = Cb.z.DESTROYED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.internal.f.a.<clinit>():void");
        }
    }

    private static class b implements b.a {
        private b() {
        }

        public void a(int i10, long j10) {
        }

        public void b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public static <P> c a(C10177v<P> vVar) {
        c.b a10 = c.a();
        a10.d(vVar.d());
        for (List<C10177v.c<P>> it : vVar.c()) {
            for (C10177v.c cVar : it) {
                a10.a(c(cVar.h()), cVar.d(), b(cVar.e()), cVar.f().name());
            }
        }
        if (vVar.e() != null) {
            a10.e(vVar.e().d());
        }
        try {
            return a10.b();
        } catch (GeneralSecurityException e10) {
            throw new IllegalStateException(e10);
        }
    }

    private static String b(String str) {
        return !str.startsWith("type.googleapis.com/google.crypto.") ? str : str.substring(34);
    }

    private static C10166k c(z zVar) {
        int i10 = a.f67862a[zVar.ordinal()];
        if (i10 == 1) {
            return C10166k.f75973b;
        }
        if (i10 == 2) {
            return C10166k.f75974c;
        }
        if (i10 == 3) {
            return C10166k.f75975d;
        }
        throw new IllegalStateException("Unknown key status");
    }
}
