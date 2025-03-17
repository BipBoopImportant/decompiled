package androidx.compose.foundation.layout;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.c;
import c2.n;
import c2.r;
import c2.s;
import c2.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import s0.C5866l;
import tI.C17978n;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/N;", "LG1/B;", "Landroidx/compose/ui/d$c;", "Ls0/l;", "direction", "", "unbounded", "Lkotlin/Function2;", "Lc2/r;", "Lc2/t;", "Lc2/n;", "alignmentCallback", "<init>", "(Ls0/l;ZLnI/p;)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "Ls0/l;", "getDirection", "()Ls0/l;", "E2", "(Ls0/l;)V", "o", "Z", "getUnbounded", "()Z", "F2", "(Z)V", "p", "LnI/p;", "C2", "()LnI/p;", "D2", "(LnI/p;)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class N extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C5866l f18010n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f18011o;

    /* renamed from: p  reason: collision with root package name */
    private p<? super r, ? super t, n> f18012p;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f18013c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f18014d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a0 f18015e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f18016f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ K f18017g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(N n10, int i10, a0 a0Var, int i11, K k10) {
            super(1);
            this.f18013c = n10;
            this.f18014d = i10;
            this.f18015e = a0Var;
            this.f18016f = i11;
            this.f18017g = k10;
        }

        public final void a(a0.a aVar) {
            a0.a aVar2 = aVar;
            a0.a.k(aVar2, this.f18015e, this.f18013c.C2().invoke(r.b(s.a(this.f18014d - this.f18015e.E0(), this.f18016f - this.f18015e.z0())), this.f18017g.getLayoutDirection()).n(), 0.0f, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public N(C5866l lVar, boolean z10, p<? super r, ? super t, n> pVar) {
        this.f18010n = lVar;
        this.f18011o = z10;
        this.f18012p = pVar;
    }

    public final p<r, t, n> C2() {
        return this.f18012p;
    }

    public final void D2(p<? super r, ? super t, n> pVar) {
        this.f18012p = pVar;
    }

    public final void E2(C5866l lVar) {
        this.f18010n = lVar;
    }

    public final void F2(boolean z10) {
        this.f18011o = z10;
    }

    public J h(K k10, H h10, long j10) {
        C5866l lVar = this.f18010n;
        C5866l lVar2 = C5866l.Vertical;
        int i10 = 0;
        int n10 = lVar != lVar2 ? 0 : C5267b.n(j10);
        C5866l lVar3 = this.f18010n;
        C5866l lVar4 = C5866l.Horizontal;
        if (lVar3 == lVar4) {
            i10 = C5267b.m(j10);
        }
        int i11 = Integer.MAX_VALUE;
        int l10 = (this.f18010n == lVar2 || !this.f18011o) ? C5267b.l(j10) : Integer.MAX_VALUE;
        if (this.f18010n == lVar4 || !this.f18011o) {
            i11 = C5267b.k(j10);
        }
        a0 i02 = h10.i0(c.a(n10, l10, i10, i11));
        int m10 = C17978n.m(i02.E0(), C5267b.n(j10), C5267b.l(j10));
        int m11 = C17978n.m(i02.z0(), C5267b.m(j10), C5267b.k(j10));
        return K.v0(k10, m10, m11, (Map) null, new a(this, m10, i02, m11, k10), 4, (Object) null);
    }
}
