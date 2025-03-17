package androidx.compose.material;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import I0.C;
import I0.C4552d;
import XH.C16807N;
import XH.v;
import androidx.compose.ui.d;
import c2.C5267b;
import c2.r;
import c2.s;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import nI.p;
import pI.C17752b;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003BI\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012*\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J&\u0010\u0018\u001a\u00020\u0017*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fRF\u0010\u000b\u001a&\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0004\u0012\u00028\u00000\t0\u00068\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, d2 = {"Landroidx/compose/material/b;", "T", "Landroidx/compose/ui/d$c;", "LG1/B;", "LI0/d;", "state", "Lkotlin/Function2;", "Lc2/r;", "Lc2/b;", "LXH/v;", "LI0/C;", "anchors", "Lp0/v;", "orientation", "<init>", "(LI0/d;LnI/p;Lp0/v;)V", "LXH/N;", "n2", "()V", "LE1/K;", "LE1/H;", "measurable", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "LI0/d;", "D2", "()LI0/d;", "G2", "(LI0/d;)V", "o", "LnI/p;", "getAnchors", "()LnI/p;", "E2", "(LnI/p;)V", "p", "Lp0/v;", "C2", "()Lp0/v;", "F2", "(Lp0/v;)V", "", "q", "Z", "didLookahead", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class b<T> extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C4552d<T> f18612n;

    /* renamed from: o  reason: collision with root package name */
    private p<? super r, ? super C5267b, ? extends v<? extends C<T>, ? extends T>> f18613o;

    /* renamed from: p  reason: collision with root package name */
    private p0.v f18614p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f18615q;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ K f18616c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b<T> f18617d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a0 f18618e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(K k10, b<T> bVar, a0 a0Var) {
            super(1);
            this.f18616c = k10;
            this.f18617d = bVar;
            this.f18618e = a0Var;
        }

        public final void a(a0.a aVar) {
            float f10 = this.f18616c.A0() ? this.f18617d.D2().o().f(this.f18617d.D2().x()) : this.f18617d.D2().A();
            float f11 = this.f18617d.C2() == p0.v.Horizontal ? f10 : 0.0f;
            if (this.f18617d.C2() != p0.v.Vertical) {
                f10 = 0.0f;
            }
            a0.a.i(aVar, this.f18618e, C17752b.e(f11), C17752b.e(f10), 0.0f, 4, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public b(C4552d<T> dVar, p<? super r, ? super C5267b, ? extends v<? extends C<T>, ? extends T>> pVar, p0.v vVar) {
        this.f18612n = dVar;
        this.f18613o = pVar;
        this.f18614p = vVar;
    }

    public final p0.v C2() {
        return this.f18614p;
    }

    public final C4552d<T> D2() {
        return this.f18612n;
    }

    public final void E2(p<? super r, ? super C5267b, ? extends v<? extends C<T>, ? extends T>> pVar) {
        this.f18613o = pVar;
    }

    public final void F2(p0.v vVar) {
        this.f18614p = vVar;
    }

    public final void G2(C4552d<T> dVar) {
        this.f18612n = dVar;
    }

    public J h(K k10, H h10, long j10) {
        a0 i02 = h10.i0(j10);
        if (!k10.A0() || !this.f18615q) {
            v vVar = (v) this.f18613o.invoke(r.b(s.a(i02.E0(), i02.z0())), C5267b.a(j10));
            this.f18612n.I((C) vVar.c(), vVar.d());
        }
        this.f18615q = k10.A0() || this.f18615q;
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(k10, this, i02), 4, (Object) null);
    }

    public void n2() {
        this.f18615q = false;
    }
}
