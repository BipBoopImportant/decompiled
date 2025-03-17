package Fj;

import Vi.m0;
import XH.t;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15031y;
import rz.I;
import rz.O;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\t\u001a\u00020\u0005*\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LFj/f;", "", "<init>", "()V", "Lrz/O;", "", "b", "(Lrz/O;)Z", "Lrz/y;", "a", "(Lrz/y;)Z", "Lrz/I;", "scanAndGoProduct", "", "quantityToCollect", "scanType", "", "c", "(Lrz/I;ILrz/O;)Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f80874a = new a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LFj/f$a;", "", "<init>", "()V", "", "DIVIDER_DEFAULT_MARGIN", "I", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f80875a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f80876b;

        /* JADX WARNING: Can't wrap try/catch for region: R(23:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|(2:13|14)|15|(2:17|18)|19|21|22|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|24|25|26|27|28|29|30|31|33) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0045 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0055 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x005d */
        static {
            /*
                rz.O[] r0 = rz.O.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                rz.O r2 = rz.O.BARCODE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                rz.O r3 = rz.O.DATA_MATRIX     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                rz.O r4 = rz.O.MANUAL_INPUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                rz.O r5 = rz.O.AS_IS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                r5 = 5
                rz.O r6 = rz.O.QR     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r0[r6] = r5     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f80875a = r0
                rz.y[] r0 = rz.C15031y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                rz.y r6 = rz.C15031y.COMBINATION     // Catch:{ NoSuchFieldError -> 0x0045 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0045 }
                r0[r6] = r1     // Catch:{ NoSuchFieldError -> 0x0045 }
            L_0x0045:
                rz.y r1 = rz.C15031y.FULL_SERVE     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                rz.y r1 = rz.C15031y.SELF_SERVE     // Catch:{ NoSuchFieldError -> 0x0055 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0055 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0055 }
            L_0x0055:
                rz.y r1 = rz.C15031y.CASH_AND_CARRY     // Catch:{ NoSuchFieldError -> 0x005d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005d }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x005d }
            L_0x005d:
                rz.y r1 = rz.C15031y.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0065 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0065 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x0065 }
            L_0x0065:
                f80876b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Fj.f.b.<clinit>():void");
        }
    }

    private final boolean a(C15031y yVar) {
        int i10 = b.f80876b[yVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            return false;
        }
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            return true;
        }
        throw new t();
    }

    private final boolean b(O o10) {
        int i10 = b.f80875a[o10.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return true;
        }
        if (i10 == 4 || i10 == 5) {
            return false;
        }
        throw new t();
    }

    public final List<Object> c(I i10, int i11, O o10) {
        C17542s.j(i10, "scanAndGoProduct");
        C17542s.j(o10, "scanType");
        if (i11 <= 0 || !a(i10.p()) || !b(o10)) {
            return C16877v.n();
        }
        List c10 = C16877v.c();
        boolean z10 = false;
        c10.add(new el.b("QuantityDivider", 0, (Integer) null, 24, 4, (DefaultConstructorMarker) null));
        if (i10.m().c() != i11) {
            z10 = true;
        }
        c10.add(new m0(z10, i11, z10 ? m0.a.Info : m0.a.Check));
        return C16877v.a(c10);
    }
}
