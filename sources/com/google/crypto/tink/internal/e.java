package com.google.crypto.tink.internal;

import qb.C10162g;
import qb.C10180y;

public final class e extends C10162g {

    /* renamed from: a  reason: collision with root package name */
    private final o f67858a;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f67859a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f67860b;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|5|6|7|9|10|11|12|13|14|15|16|18) */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        static {
            /*
                Cb.y$c[] r0 = Cb.y.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f67860b = r0
                r1 = 1
                Cb.y$c r2 = Cb.y.c.SYMMETRIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f67860b     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.y$c r3 = Cb.y.c.ASYMMETRIC_PRIVATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                Cb.I[] r2 = Cb.I.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f67859a = r2
                Cb.I r3 = Cb.I.TINK     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f67859a     // Catch:{ NoSuchFieldError -> 0x0038 }
                Cb.I r2 = Cb.I.LEGACY     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f67859a     // Catch:{ NoSuchFieldError -> 0x0043 }
                Cb.I r1 = Cb.I.RAW     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f67859a     // Catch:{ NoSuchFieldError -> 0x004e }
                Cb.I r1 = Cb.I.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.internal.e.a.<clinit>():void");
        }
    }

    public e(o oVar, C10180y yVar) {
        a(oVar, yVar);
        this.f67858a = oVar;
    }

    private static void a(o oVar, C10180y yVar) {
        int i10 = a.f67860b[oVar.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            C10180y.b(yVar);
        }
    }
}
