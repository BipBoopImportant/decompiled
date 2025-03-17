package E5;

import O5.h;
import XH.t;
import kotlin.Metadata;
import tI.C17978n;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000b\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\b\b\u0001\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0010\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\r2\b\b\u0001\u0010\u0007\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LE5/g;", "", "<init>", "()V", "", "srcWidth", "srcHeight", "dstWidth", "dstHeight", "LO5/h;", "scale", "a", "(IIIILO5/h;)I", "", "c", "(IIIILO5/h;)D", "b", "(DDDDLO5/h;)D", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final g f34880a = new g();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f34881a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                O5.h[] r0 = O5.h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                O5.h r1 = O5.h.FILL     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                O5.h r1 = O5.h.FIT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f34881a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E5.g.a.<clinit>():void");
        }
    }

    private g() {
    }

    public static final int a(int i10, int i11, int i12, int i13, h hVar) {
        int i14;
        int highestOneBit = Integer.highestOneBit(i10 / i12);
        int highestOneBit2 = Integer.highestOneBit(i11 / i13);
        int i15 = a.f34881a[hVar.ordinal()];
        if (i15 == 1) {
            i14 = Math.min(highestOneBit, highestOneBit2);
        } else if (i15 == 2) {
            i14 = Math.max(highestOneBit, highestOneBit2);
        } else {
            throw new t();
        }
        return C17978n.e(i14, 1);
    }

    public static final double b(double d10, double d11, double d12, double d13, h hVar) {
        double d14 = d12 / d10;
        double d15 = d13 / d11;
        int i10 = a.f34881a[hVar.ordinal()];
        if (i10 == 1) {
            return Math.max(d14, d15);
        }
        if (i10 == 2) {
            return Math.min(d14, d15);
        }
        throw new t();
    }

    public static final double c(int i10, int i11, int i12, int i13, h hVar) {
        double d10 = ((double) i12) / ((double) i10);
        double d11 = ((double) i13) / ((double) i11);
        int i14 = a.f34881a[hVar.ordinal()];
        if (i14 == 1) {
            return Math.max(d10, d11);
        }
        if (i14 == 2) {
            return Math.min(d10, d11);
        }
        throw new t();
    }
}
