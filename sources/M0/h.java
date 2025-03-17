package M0;

import QJ.Q;
import U0.A1;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.P;
import U0.p1;
import XH.C16807N;
import androidx.compose.ui.platform.C5100f0;
import c2.d;
import dI.C17169j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.L;
import nI.C17631a;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a<\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u0007ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"", "refreshing", "Lkotlin/Function0;", "LXH/N;", "onRefresh", "Lc2/h;", "refreshThreshold", "refreshingOffset", "LM0/g;", "a", "(ZLnI/a;FFLU0/m;II)LM0/g;", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class h {

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ g f9133c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ boolean f9134d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ L f9135e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ L f9136f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(g gVar, boolean z10, L l10, L l11) {
            super(0);
            this.f9133c = gVar;
            this.f9134d = z10;
            this.f9135e = l10;
            this.f9136f = l11;
        }

        public final void invoke() {
            this.f9133c.t(this.f9134d);
            this.f9133c.v(this.f9135e.f144345a);
            this.f9133c.u(this.f9136f.f144345a);
        }
    }

    public static final g a(boolean z10, C17631a<C16807N> aVar, float f10, float f11, C4889m mVar, int i10, int i11) {
        if ((i11 & 4) != 0) {
            f10 = b.f9072a.a();
        }
        if ((i11 & 8) != 0) {
            f11 = b.f9072a.b();
        }
        if (C4895p.J()) {
            C4895p.S(-174977512, i10, -1, "androidx.compose.material.pullrefresh.rememberPullRefreshState (PullRefreshState.kt:62)");
        }
        if (c2.h.v(f10, c2.h.B((float) 0)) > 0) {
            Object D10 = mVar.D();
            C4889m.a aVar2 = C4889m.f14007a;
            if (D10 == aVar2.a()) {
                B b10 = new B(P.k(C17169j.f142968a, mVar));
                mVar.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            A1<T> q10 = p1.q(aVar, mVar, (i10 >> 3) & 14);
            L l10 = new L();
            L l11 = new L();
            d dVar = (d) mVar.Q(C5100f0.e());
            l10.f144345a = dVar.H1(f10);
            l11.f144345a = dVar.H1(f11);
            boolean V10 = mVar.V(a10);
            Object D11 = mVar.D();
            if (V10 || D11 == aVar2.a()) {
                D11 = new g(a10, q10, l11.f144345a, l10.f144345a);
                mVar.u(D11);
            }
            g gVar = (g) D11;
            boolean F10 = mVar.F(gVar) | ((((i10 & 14) ^ 6) > 4 && mVar.b(z10)) || (i10 & 6) == 4) | mVar.c(l10.f144345a) | mVar.c(l11.f144345a);
            Object D12 = mVar.D();
            if (F10 || D12 == aVar2.a()) {
                D12 = new a(gVar, z10, l10, l11);
                mVar.u(D12);
            }
            P.i((C17631a) D12, mVar, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
            return gVar;
        }
        throw new IllegalArgumentException("The refresh trigger must be greater than zero!");
    }
}
