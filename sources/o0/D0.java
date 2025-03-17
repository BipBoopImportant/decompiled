package O0;

import A0.c;
import A0.g;
import S0.v;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import XH.t;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import p1.c1;
import p1.i1;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\t\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00058AX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LA0/a;", "e", "(LA0/a;)LA0/a;", "a", "LO0/C0;", "LS0/v;", "value", "Lp1/i1;", "b", "(LO0/C0;LS0/v;)Lp1/i1;", "LU0/I0;", "LU0/I0;", "c", "()LU0/I0;", "LocalShapes", "d", "(LS0/v;LU0/m;I)Lp1/i1;", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class D0 {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C0> f9717a = C4910x.f(a.f9718c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LO0/C0;", "b", "()LO0/C0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C0> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f9718c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C0 invoke() {
            return new C0((A0.a) null, (A0.a) null, (A0.a) null, (A0.a) null, (A0.a) null, 31, (DefaultConstructorMarker) null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f9719a;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|25) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                S0.v[] r0 = S0.v.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                S0.v r1 = S0.v.CornerExtraLarge     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                S0.v r1 = S0.v.CornerExtraLargeTop     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                S0.v r1 = S0.v.CornerExtraSmall     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                S0.v r1 = S0.v.CornerExtraSmallTop     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                S0.v r1 = S0.v.CornerFull     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                S0.v r1 = S0.v.CornerLarge     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                S0.v r1 = S0.v.CornerLargeEnd     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                S0.v r1 = S0.v.CornerLargeTop     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                S0.v r1 = S0.v.CornerMedium     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                S0.v r1 = S0.v.CornerNone     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                S0.v r1 = S0.v.CornerSmall     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                f9719a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O0.D0.b.<clinit>():void");
        }
    }

    public static final A0.a a(A0.a aVar) {
        float f10 = (float) 0.0d;
        return A0.a.d(aVar, c.b(h.B(f10)), (A0.b) null, (A0.b) null, c.b(h.B(f10)), 6, (Object) null);
    }

    public static final i1 b(C0 c02, v vVar) {
        switch (b.f9719a[vVar.ordinal()]) {
            case 1:
                return c02.a();
            case 2:
                return e(c02.a());
            case 3:
                return c02.b();
            case 4:
                return e(c02.b());
            case 5:
                return g.h();
            case 6:
                return c02.c();
            case 7:
                return a(c02.c());
            case 8:
                return e(c02.c());
            case 9:
                return c02.d();
            case 10:
                return c1.a();
            case 11:
                return c02.e();
            default:
                throw new t();
        }
    }

    public static final I0<C0> c() {
        return f9717a;
    }

    public static final i1 d(v vVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1629172543, i10, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        i1 b10 = b(X.f10101a.b(mVar, 6), vVar);
        if (C4895p.J()) {
            C4895p.R();
        }
        return b10;
    }

    public static final A0.a e(A0.a aVar) {
        float f10 = (float) 0.0d;
        return A0.a.d(aVar, (A0.b) null, (A0.b) null, c.b(h.B(f10)), c.b(h.B(f10)), 3, (Object) null);
    }
}
