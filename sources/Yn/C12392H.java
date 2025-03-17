package yn;

import An.c;
import An.d;
import An.f;
import An.g;
import An.h;
import An.i;
import An.j;
import An.k;
import An.l;
import An.m;
import An.n;
import An.o;
import An.p;
import An.r;
import An.s;
import An.t;
import An.u;
import An.v;
import U0.A1;
import U0.C4877g1;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.p1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import u0.C5972G;
import u0.C5974I;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u000b\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\u000e\u0010\u0011\u001a\u00020\u00058\n@\nX\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00058\n@\nX\u0002"}, d2 = {"Lvn/g;", "selectedToggle", "LE4/a;", "LAn/o;", "content", "", "index", "productsPerRowMulti", "Lu0/c;", "c", "(Lvn/g;LE4/a;II)J", "b", "(LE4/a;II)J", "Lu0/I;", "", "d", "(Lu0/I;LU0/m;I)Z", "previousIndex", "previousScrollOffset", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yn.H  reason: case insensitive filesystem */
public final class C12392H {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.H$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106624a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                vn.g[] r0 = vn.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vn.g r1 = vn.g.SINGLE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                vn.g r1 = vn.g.MULTI     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f106624a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yn.C12392H.a.<clinit>():void");
        }
    }

    public static final long b(E4.a<o> aVar, int i10, int i11) {
        C17542s.j(aVar, "content");
        o j10 = aVar.j(i10);
        if (j10 == null) {
            return C5972G.a(i11);
        }
        if ((j10 instanceof An.a) || (j10 instanceof j) || (j10 instanceof s) || (j10 instanceof g) || (j10 instanceof t) || (j10 instanceof k) || (j10 instanceof i) || C17542s.e(j10, h.f79002a) || (j10 instanceof d) || (j10 instanceof m) || (j10 instanceof l) || (j10 instanceof c) || (j10 instanceof n) || (j10 instanceof r) || (j10 instanceof u) || (j10 instanceof v) || (j10 instanceof p)) {
            return C5972G.a(i11);
        }
        if (j10 instanceof f) {
            return C5972G.a(1);
        }
        throw new XH.t();
    }

    public static final long c(vn.g gVar, E4.a<o> aVar, int i10, int i11) {
        C17542s.j(gVar, "selectedToggle");
        C17542s.j(aVar, "content");
        int i12 = a.f106624a[gVar.ordinal()];
        if (i12 == 1) {
            return C5972G.a(1);
        }
        if (i12 == 2) {
            return b(aVar, i10, i11);
        }
        throw new XH.t();
    }

    public static final boolean d(C5974I i10, C4889m mVar, int i11) {
        C17542s.j(i10, "<this>");
        mVar.W(777992136);
        if (C4895p.J()) {
            C4895p.S(777992136, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.isScrollingUp (ComposeUtils.kt:85)");
        }
        mVar.W(-285484693);
        int i12 = (i11 & 14) ^ 6;
        boolean z10 = false;
        boolean z11 = (i12 > 4 && mVar.V(i10)) || (i11 & 6) == 4;
        Object D10 = mVar.D();
        if (z11 || D10 == C4889m.f14007a.a()) {
            D10 = C4877g1.a(i10.r());
            mVar.u(D10);
        }
        C4894o0 o0Var = (C4894o0) D10;
        mVar.P();
        mVar.W(-285481730);
        boolean z12 = (i12 > 4 && mVar.V(i10)) || (i11 & 6) == 4;
        Object D11 = mVar.D();
        if (z12 || D11 == C4889m.f14007a.a()) {
            D11 = C4877g1.a(i10.s());
            mVar.u(D11);
        }
        C4894o0 o0Var2 = (C4894o0) D11;
        mVar.P();
        mVar.W(-285478512);
        if ((i12 > 4 && mVar.V(i10)) || (i11 & 6) == 4) {
            z10 = true;
        }
        Object D12 = mVar.D();
        if (z10 || D12 == C4889m.f14007a.a()) {
            D12 = p1.e(new C12390G(i10, o0Var, o0Var2));
            mVar.u(D12);
        }
        mVar.P();
        boolean booleanValue = ((Boolean) ((A1) D12).getValue()).booleanValue();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return booleanValue;
    }

    private static final int e(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void f(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    private static final int g(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void h(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final boolean i(C5974I i10, C4894o0 o0Var, C4894o0 o0Var2) {
        boolean z10 = false;
        if (e(o0Var) == i10.r() ? g(o0Var2) >= i10.s() : e(o0Var) > i10.r()) {
            z10 = true;
        }
        f(o0Var, i10.r());
        h(o0Var2, i10.s());
        return z10;
    }
}
