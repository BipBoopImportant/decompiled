package O0;

import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.compose.foundation.o;
import c2.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import m0.C5546i;
import nI.p;
import tI.C17978n;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r2\u0006\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"LO0/z0;", "", "Landroidx/compose/foundation/o;", "scrollState", "LQJ/Q;", "coroutineScope", "<init>", "(Landroidx/compose/foundation/o;LQJ/Q;)V", "LO0/V0;", "Lc2/d;", "density", "", "edgeOffset", "", "tabPositions", "b", "(LO0/V0;Lc2/d;ILjava/util/List;)I", "selectedTab", "LXH/N;", "c", "(Lc2/d;ILjava/util/List;I)V", "a", "Landroidx/compose/foundation/o;", "LQJ/Q;", "Ljava/lang/Integer;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: O0.z0  reason: case insensitive filesystem */
final class C4766z0 {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final o f11668a;

    /* renamed from: b  reason: collision with root package name */
    private final Q f11669b;

    /* renamed from: c  reason: collision with root package name */
    private Integer f11670c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.material3.ScrollableTabData$onLaidOut$1$1", f = "TabRow.kt", l = {1312}, m = "invokeSuspend")
    /* renamed from: O0.z0$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f11671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C4766z0 f11672d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f11673e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C4766z0 z0Var, int i10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f11672d = z0Var;
            this.f11673e = i10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f11672d, this.f11673e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f11671c;
            if (i10 == 0) {
                y.b(obj);
                o a10 = this.f11672d.f11668a;
                int i11 = this.f11673e;
                C5546i h10 = X0.f10104b;
                this.f11671c = 1;
                if (a10.k(i11, h10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C4766z0(o oVar, Q q10) {
        this.f11668a = oVar;
        this.f11669b = q10;
    }

    private final int b(V0 v02, d dVar, int i10, List<V0> list) {
        int K02 = dVar.K0(((V0) C16877v.I0(list)).b()) + i10;
        int m10 = K02 - this.f11668a.m();
        return C17978n.m(dVar.K0(v02.a()) - ((m10 / 2) - (dVar.K0(v02.c()) / 2)), 0, C17978n.e(K02 - m10, 0));
    }

    public final void c(d dVar, int i10, List<V0> list, int i11) {
        int b10;
        Integer num = this.f11670c;
        if (num == null || num.intValue() != i11) {
            this.f11670c = Integer.valueOf(i11);
            V0 v02 = (V0) C16877v.z0(list, i11);
            if (v02 != null && this.f11668a.n() != (b10 = b(v02, dVar, i10, list))) {
                F0 unused = C16314k.d(this.f11669b, (C17168i) null, (T) null, new a(this, b10, (C17164e<? super a>) null), 3, (Object) null);
            }
        }
    }
}
