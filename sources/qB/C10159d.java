package qb;

import Cb.C;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* renamed from: qb.d  reason: case insensitive filesystem */
public final class C10159d {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f75965a = new byte[0];

    /* renamed from: qb.d$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f75966a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                Cb.I[] r0 = Cb.I.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f75966a = r0
                Cb.I r1 = Cb.I.LEGACY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f75966a     // Catch:{ NoSuchFieldError -> 0x001d }
                Cb.I r1 = Cb.I.CRUNCHY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f75966a     // Catch:{ NoSuchFieldError -> 0x0028 }
                Cb.I r1 = Cb.I.TINK     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f75966a     // Catch:{ NoSuchFieldError -> 0x0033 }
                Cb.I r1 = Cb.I.RAW     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qb.C10159d.a.<clinit>():void");
        }
    }

    public static byte[] a(C.c cVar) {
        int i10 = a.f75966a[cVar.X().ordinal()];
        if (i10 == 1 || i10 == 2) {
            return ByteBuffer.allocate(5).put((byte) 0).putInt(cVar.W()).array();
        }
        if (i10 == 3) {
            return ByteBuffer.allocate(5).put((byte) 1).putInt(cVar.W()).array();
        }
        if (i10 == 4) {
            return f75965a;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
