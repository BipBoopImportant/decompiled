package pK;

import E1.h0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.b;
import androidx.compose.ui.graphics.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import o1.C5667g;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/d;", "Lkotlin/Function0;", "LpK/j;", "transformation", "a", "(Landroidx/compose/ui/d;LnI/a;)Landroidx/compose/ui/d;", "zoomable_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: pK.k  reason: case insensitive filesystem */
public final class C17766k {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/graphics/c;", "LXH/N;", "a", "(Landroidx/compose/ui/graphics/c;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: pK.k$a */
    static final class a extends C17544u implements C17642l<c, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a<C17765j> f146382c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C17631a<? extends C17765j> aVar) {
            super(1);
            this.f146382c = aVar;
        }

        public final void a(c cVar) {
            C17542s.j(cVar, "$this$graphicsLayer");
            C17765j invoke = this.f146382c.invoke();
            cVar.g(h0.c(invoke.e()));
            cVar.m(h0.d(invoke.e()));
            cVar.l(invoke.f());
            cVar.o(C5667g.m(invoke.c()));
            cVar.e(C5667g.n(invoke.c()));
            cVar.L0(invoke.B());
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((c) obj);
            return C16807N.f139792a;
        }
    }

    public static final d a(d dVar, C17631a<? extends C17765j> aVar) {
        C17542s.j(dVar, "<this>");
        C17542s.j(aVar, "transformation");
        return b.a(dVar, new a(aVar));
    }
}
