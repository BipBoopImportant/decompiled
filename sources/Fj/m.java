package Fj;

import Vi.o0;
import Vi.r0;
import XH.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.I;
import rz.O;
import rz.T;
import rz.V;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LFj/m;", "", "<init>", "()V", "Lrz/I;", "scanAndGoProduct", "", "LVi/o0;", "a", "(Lrz/I;)Ljava/util/List;", "Lrz/O;", "scanType", "b", "(Lrz/I;Lrz/O;)Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f80889a;

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
                f80889a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Fj.m.a.<clinit>():void");
        }
    }

    private final List<o0> a(I i10) {
        V q10 = i10.q();
        V.a aVar = q10 instanceof V.a ? (V.a) q10 : null;
        if (aVar != null) {
            Iterable<T> a10 = aVar.a();
            ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
            for (T t10 : a10) {
                arrayList.add(new r0(t10.b(), i10.l().getProductType(), t10.c(), t10.a(), t10.d()));
            }
            List<o0> e10 = C16877v.e(new o0(arrayList));
            if (e10 != null) {
                return e10;
            }
        }
        return C16877v.n();
    }

    public final List<o0> b(I i10, O o10) {
        C17542s.j(i10, "scanAndGoProduct");
        C17542s.j(o10, "scanType");
        int i11 = a.f80889a[o10.ordinal()];
        if (i11 == 1 || i11 == 2 || i11 == 3) {
            return C16877v.n();
        }
        if (i11 == 4 || i11 == 5) {
            return a(i10);
        }
        throw new t();
    }
}
