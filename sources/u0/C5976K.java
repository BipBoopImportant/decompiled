package u0;

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

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu0/I;", "state", "", "reverseScrolling", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "a", "(Lu0/I;ZLU0/m;I)Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: u0.K  reason: case insensitive filesystem */
public final class C5976K {

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u0012\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"u0/K$a", "Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticState;", "", "index", "LXH/N;", "scrollToItem", "(ILdI/e;)Ljava/lang/Object;", "LL1/b;", "collectionInfo", "()LL1/b;", "", "getScrollOffset", "()F", "scrollOffset", "getMaxScrollOffset", "maxScrollOffset", "getViewport", "()I", "viewport", "getContentPadding", "contentPadding", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: u0.K$a */
    public static final class a implements LazyLayoutSemanticState {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C5974I f29639a;

        a(C5974I i10) {
            this.f29639a = i10;
        }

        public b collectionInfo() {
            return new b(-1, -1);
        }

        public int getContentPadding() {
            return this.f29639a.v().d() + this.f29639a.v().c();
        }

        public float getMaxScrollOffset() {
            return f.a(this.f29639a.r(), this.f29639a.s(), this.f29639a.d());
        }

        public float getScrollOffset() {
            return f.b(this.f29639a.r(), this.f29639a.s());
        }

        public int getViewport() {
            return this.f29639a.v().a() == v.Vertical ? r.g(this.f29639a.v().b()) : r.h(this.f29639a.v().b());
        }

        public Object scrollToItem(int i10, C17164e<? super C16807N> eVar) {
            Object J10 = C5974I.J(this.f29639a, i10, 0, eVar, 2, (Object) null);
            return J10 == C17187b.f() ? J10 : C16807N.f139792a;
        }
    }

    public static final LazyLayoutSemanticState a(C5974I i10, boolean z10, C4889m mVar, int i11) {
        if (C4895p.J()) {
            C4895p.S(-1247008005, i11, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:33)");
        }
        boolean z11 = false;
        boolean z12 = (((i11 & 14) ^ 6) > 4 && mVar.V(i10)) || (i11 & 6) == 4;
        if ((((i11 & 112) ^ 48) > 32 && mVar.b(z10)) || (i11 & 48) == 32) {
            z11 = true;
        }
        boolean z13 = z12 | z11;
        Object D10 = mVar.D();
        if (z13 || D10 == C4889m.f14007a.a()) {
            D10 = new a(i10);
            mVar.u(D10);
        }
        a aVar = (a) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return aVar;
    }
}
