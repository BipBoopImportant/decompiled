package G1;

import androidx.compose.ui.d;
import i1.C5436b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0005*\u0001\u0012\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a+\u0010\u000b\u001a\u00020\n\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00000\u000e*\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/d$b;", "prev", "next", "", "d", "(Landroidx/compose/ui/d$b;Landroidx/compose/ui/d$b;)I", "Landroidx/compose/ui/d$c;", "T", "LG1/V;", "node", "LXH/N;", "f", "(LG1/V;Landroidx/compose/ui/d$c;)V", "Landroidx/compose/ui/d;", "LW0/b;", "result", "e", "(Landroidx/compose/ui/d;LW0/b;)LW0/b;", "G1/b0$a", "a", "LG1/b0$a;", "SentinelHead", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: G1.b0  reason: case insensitive filesystem */
public final class C4496b0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final a f6434a;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"G1/b0$a", "Landroidx/compose/ui/d$c;", "", "toString", "()Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: G1.b0$a */
    public static final class a extends d.c {
        a() {
        }

        public String toString() {
            return "<Head>";
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/d$b;", "element", "", "a", "(Landroidx/compose/ui/d$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: G1.b0$b */
    static final class b extends C17544u implements C17642l<d.b, Boolean> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ W0.b<d.b> f6435c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(W0.b<d.b> bVar) {
            super(1);
            this.f6435c = bVar;
        }

        /* renamed from: a */
        public final Boolean invoke(d.b bVar) {
            this.f6435c.b(bVar);
            return Boolean.TRUE;
        }
    }

    static {
        a aVar = new a();
        aVar.s2(-1);
        f6434a = aVar;
    }

    public static final int d(d.b bVar, d.b bVar2) {
        if (C17542s.e(bVar, bVar2)) {
            return 2;
        }
        return C5436b.a(bVar, bVar2) ? 1 : 0;
    }

    /* access modifiers changed from: private */
    public static final W0.b<d.b> e(d dVar, W0.b<d.b> bVar) {
        W0.b bVar2 = new W0.b(new d[C17978n.e(bVar.r(), 16)], 0);
        bVar2.b(dVar);
        b bVar3 = null;
        while (bVar2.v()) {
            d dVar2 = (d) bVar2.B(bVar2.r() - 1);
            if (dVar2 instanceof androidx.compose.ui.a) {
                androidx.compose.ui.a aVar = (androidx.compose.ui.a) dVar2;
                bVar2.b(aVar.a());
                bVar2.b(aVar.b());
            } else if (dVar2 instanceof d.b) {
                bVar.b(dVar2);
            } else {
                if (bVar3 == null) {
                    bVar3 = new b(bVar);
                }
                dVar2.d(bVar3);
                bVar3 = bVar3;
            }
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    public static final <T extends d.c> void f(V<T> v10, d.c cVar) {
        C17542s.h(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        v10.b(cVar);
    }
}
