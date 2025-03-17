package n0;

import androidx.compose.ui.d;
import c2.h;
import c2.t;
import kotlin.Metadata;
import m1.e;
import o1.C5669i;
import o1.C5673m;
import p0.v;
import p1.Q0;
import p1.i1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/d;", "Lp0/v;", "orientation", "a", "(Landroidx/compose/ui/d;Lp0/v;)Landroidx/compose/ui/d;", "Lc2/h;", "F", "b", "()F", "MaxSupportedElevation", "Landroidx/compose/ui/d;", "HorizontalScrollableClipModifier", "c", "VerticalScrollableClipModifier", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: n0.l  reason: case insensitive filesystem */
public final class C5606l {

    /* renamed from: a  reason: collision with root package name */
    private static final float f26463a = h.B((float) 30);

    /* renamed from: b  reason: collision with root package name */
    private static final d f26464b;

    /* renamed from: c  reason: collision with root package name */
    private static final d f26465c;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"n0/l$a", "Lp1/i1;", "Lo1/m;", "size", "Lc2/t;", "layoutDirection", "Lc2/d;", "density", "Lp1/Q0;", "a", "(JLc2/t;Lc2/d;)Lp1/Q0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n0.l$a */
    public static final class a implements i1 {
        a() {
        }

        public Q0 a(long j10, t tVar, c2.d dVar) {
            float K02 = (float) dVar.K0(C5606l.b());
            return new Q0.b(new C5669i(0.0f, -K02, C5673m.l(j10), C5673m.i(j10) + K02));
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J*\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"n0/l$b", "Lp1/i1;", "Lo1/m;", "size", "Lc2/t;", "layoutDirection", "Lc2/d;", "density", "Lp1/Q0;", "a", "(JLc2/t;Lc2/d;)Lp1/Q0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: n0.l$b */
    public static final class b implements i1 {
        b() {
        }

        public Q0 a(long j10, t tVar, c2.d dVar) {
            float K02 = (float) dVar.K0(C5606l.b());
            return new Q0.b(new C5669i(-K02, 0.0f, C5673m.l(j10) + K02, C5673m.i(j10)));
        }
    }

    static {
        d.a aVar = d.f18749a;
        f26464b = e.a(aVar, new a());
        f26465c = e.a(aVar, new b());
    }

    public static final d a(d dVar, v vVar) {
        return dVar.s(vVar == v.Vertical ? f26465c : f26464b);
    }

    public static final float b() {
        return f26463a;
    }
}
