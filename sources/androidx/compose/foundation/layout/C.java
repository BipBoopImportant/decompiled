package androidx.compose.foundation.layout;

import E1.H;
import E1.J;
import E1.K;
import E1.a0;
import G1.B;
import XH.C16807N;
import androidx.compose.ui.d;
import c2.n;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Landroidx/compose/foundation/layout/C;", "LG1/B;", "Landroidx/compose/ui/d$c;", "Lkotlin/Function1;", "Lc2/d;", "Lc2/n;", "offset", "", "rtlAware", "<init>", "(LnI/l;Z)V", "LE1/K;", "LE1/H;", "measurable", "Lc2/b;", "constraints", "LE1/J;", "h", "(LE1/K;LE1/H;J)LE1/J;", "n", "LnI/l;", "C2", "()LnI/l;", "E2", "(LnI/l;)V", "o", "Z", "D2", "()Z", "F2", "(Z)V", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class C extends d.c implements B {

    /* renamed from: n  reason: collision with root package name */
    private C17642l<? super c2.d, n> f17919n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f17920o;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/a0$a;", "LXH/N;", "a", "(LE1/a0$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<a0.a, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C f17921c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ K f17922d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a0 f17923e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C c10, K k10, a0 a0Var) {
            super(1);
            this.f17921c = c10;
            this.f17922d = k10;
            this.f17923e = a0Var;
        }

        public final void a(a0.a aVar) {
            long n10 = this.f17921c.C2().invoke(this.f17922d).n();
            if (this.f17921c.D2()) {
                a0.a.q(aVar, this.f17923e, n.h(n10), n.i(n10), 0.0f, (C17642l) null, 12, (Object) null);
                return;
            }
            a0.a.w(aVar, this.f17923e, n.h(n10), n.i(n10), 0.0f, (C17642l) null, 12, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a0.a) obj);
            return C16807N.f139792a;
        }
    }

    public C(C17642l<? super c2.d, n> lVar, boolean z10) {
        this.f17919n = lVar;
        this.f17920o = z10;
    }

    public final C17642l<c2.d, n> C2() {
        return this.f17919n;
    }

    public final boolean D2() {
        return this.f17920o;
    }

    public final void E2(C17642l<? super c2.d, n> lVar) {
        this.f17919n = lVar;
    }

    public final void F2(boolean z10) {
        this.f17920o = z10;
    }

    public J h(K k10, H h10, long j10) {
        a0 i02 = h10.i0(j10);
        return K.v0(k10, i02.E0(), i02.z0(), (Map) null, new a(this, k10, i02), 4, (Object) null);
    }
}
