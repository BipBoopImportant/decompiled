package w0;

import L1.b;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.f;
import c2.r;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import p0.v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw0/E;", "state", "", "reverseScrolling", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "a", "(Lw0/E;ZLU0/m;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: w0.A  reason: case insensitive filesystem */
public final class C6188A {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"w0/A$a", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "", "index", "LXH/N;", "scrollToItem", "(ILdI/e;)Ljava/lang/Object;", "LL1/b;", "collectionInfo", "()LL1/b;", "", "getScrollOffset", "()F", "scrollOffset", "getMaxScrollOffset", "maxScrollOffset", "getViewport", "()I", "viewport", "getContentPadding", "contentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: w0.A$a */
    public static final class a implements LazyLayoutSemanticState {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C6192E f31123a;

        a(C6192E e10) {
            this.f31123a = e10;
        }

        public b collectionInfo() {
            return new b(-1, -1);
        }

        public int getContentPadding() {
            return this.f31123a.w().d() + this.f31123a.w().c();
        }

        public float getMaxScrollOffset() {
            return f.a(this.f31123a.r(), this.f31123a.s(), this.f31123a.d());
        }

        public float getScrollOffset() {
            return f.b(this.f31123a.r(), this.f31123a.s());
        }

        public int getViewport() {
            return this.f31123a.w().a() == v.Vertical ? r.g(this.f31123a.w().b()) : r.h(this.f31123a.w().b());
        }

        public Object scrollToItem(int i10, C17164e<? super C16807N> eVar) {
            Object L10 = C6192E.L(this.f31123a, i10, 0, eVar, 2, (Object) null);
            return L10 == C17187b.f() ? L10 : C16807N.f139792a;
        }
    }

    public static final LazyLayoutSemanticState a(C6192E e10, boolean z10, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(1629354903, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberLazyStaggeredGridSemanticState (LazyStaggeredGridSemantics.kt:33)");
        }
        boolean V10 = ((((i10 & 112) ^ 48) > 32 && mVar.b(z10)) || (i10 & 48) == 32) | mVar.V(e10);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(e10);
            mVar.u(D10);
        }
        a aVar = (a) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return aVar;
    }
}
