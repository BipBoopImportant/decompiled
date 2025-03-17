package androidx.compose.foundation;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.I0;
import XH.C16807N;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5133t0;
import androidx.compose.ui.platform.C5137v0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import n0.C5584G;
import n0.C5585H;
import n0.C5586I;
import nI.C17631a;
import nI.C17642l;
import nI.q;
import r0.k;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\f"}, d2 = {"Landroidx/compose/ui/d;", "Lr0/k;", "interactionSource", "Ln0/G;", "indication", "b", "(Landroidx/compose/ui/d;Lr0/k;Ln0/G;)Landroidx/compose/ui/d;", "LU0/I0;", "a", "LU0/I0;", "()LU0/I0;", "LocalIndication", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<C5584G> f17892a = C4910x.f(a.f17893c);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ln0/G;", "b", "()Ln0/G;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17631a<C5584G> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f17893c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final C5584G invoke() {
            return g.f17630a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/v0;", "LXH/N;", "a", "(Landroidx/compose/ui/platform/v0;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17642l<C5137v0, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ k f17894c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5584G f17895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(k kVar, C5584G g10) {
            super(1);
            this.f17894c = kVar;
            this.f17895d = g10;
        }

        public final void a(C5137v0 v0Var) {
            v0Var.b("indication");
            v0Var.a().c("interactionSource", this.f17894c);
            v0Var.a().c("indication", this.f17895d);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C5137v0) obj);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/d;", "a", "(Landroidx/compose/ui/d;LU0/m;I)Landroidx/compose/ui/d;"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements q<d, C4889m, Integer, d> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5584G f17896c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f17897d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C5584G g10, k kVar) {
            super(3);
            this.f17896c = g10;
            this.f17897d = kVar;
        }

        public final d a(d dVar, C4889m mVar, int i10) {
            mVar.W(-353972293);
            if (C4895p.J()) {
                C4895p.S(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:182)");
            }
            C5585H b10 = this.f17896c.b(this.f17897d, mVar, 0);
            boolean V10 = mVar.V(b10);
            Object D10 = mVar.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new k(b10);
                mVar.u(D10);
            }
            k kVar = (k) D10;
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return kVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((d) obj, (C4889m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final I0<C5584G> a() {
        return f17892a;
    }

    public static final d b(d dVar, k kVar, C5584G g10) {
        if (g10 == null) {
            return dVar;
        }
        if (g10 instanceof C5586I) {
            return dVar.s(new IndicationModifierElement(kVar, (C5586I) g10));
        }
        return androidx.compose.ui.c.b(dVar, C5133t0.b() ? new b(kVar, g10) : C5133t0.a(), new c(g10, kVar));
    }
}
