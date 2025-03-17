package Tj;

import XH.t;
import kotlin.Metadata;
import rz.C15031y;
import rz.O;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrz/O;", "Lrz/y;", "productPickupType", "", "b", "(Lrz/O;Lrz/y;)Z", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Tj.c  reason: case insensitive filesystem */
public final class C10938c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Tj.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f87482a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                rz.O[] r0 = rz.O.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rz.O r1 = rz.O.BARCODE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                rz.O r1 = rz.O.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                rz.O r1 = rz.O.AS_IS     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                rz.O r1 = rz.O.QR     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                rz.O r1 = rz.O.MANUAL_INPUT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f87482a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Tj.C10938c.a.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final boolean b(O o10, C15031y yVar) {
        int i10 = a.f87482a[o10.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                throw new t();
            } else if (yVar != C15031y.FULL_SERVE) {
                return true;
            }
        }
        return false;
    }
}
