package p0;

import QJ.Q;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.p1;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.gestures.DraggableElement;
import androidx.compose.ui.d;
import c2.z;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;
import o1.C5667g;
import r0.m;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a#\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a¥\u0001\u0010\u001a\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\r2*\b\u0002\u0010\u0017\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122*\b\u0002\u0010\u0018\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00122\b\b\u0002\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001e\u0010\u001c\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u001e\u0010\u001f\u001a\u00020\u0001*\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001d\u001a\u0016\u0010 \u001a\u00020\u001e*\u00020\u001eH\u0002ø\u0001\u0000¢\u0006\u0004\b \u0010!\"6\u0010#\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"\"6\u0010%\u001a$\b\u0001\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010\"\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006&"}, d2 = {"Lkotlin/Function1;", "", "LXH/N;", "onDelta", "Lp0/r;", "a", "(LnI/l;)Lp0/r;", "i", "(LnI/l;LU0/m;I)Lp0/r;", "Landroidx/compose/ui/d;", "state", "Lp0/v;", "orientation", "", "enabled", "Lr0/m;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LQJ/Q;", "Lo1/g;", "LdI/e;", "", "onDragStarted", "onDragStopped", "reverseDirection", "g", "(Landroidx/compose/ui/d;Lp0/r;Lp0/v;ZLr0/m;ZLnI/q;LnI/q;Z)Landroidx/compose/ui/d;", "j", "(JLp0/v;)F", "Lc2/y;", "k", "l", "(J)J", "LnI/q;", "NoOpOnDragStarted", "b", "NoOpOnDragStopped", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class q {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final nI.q<Q, C5667g, C17164e<? super C16807N>, Object> f27145a = new a((C17164e<? super a>) null);
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static final nI.q<Q, Float, C17164e<? super C16807N>, Object> f27146b = new b((C17164e<? super b>) null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "Lo1/g;", "it", "LXH/N;", "<anonymous>", "(LQJ/Q;Lo1/g;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStarted$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements nI.q<Q, C5667g, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f27147c;

        a(C17164e<? super a> eVar) {
            super(3, eVar);
        }

        public final Object i(Q q10, long j10, C17164e<? super C16807N> eVar) {
            return new a(eVar).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Q) obj, ((C5667g) obj2).v(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f27147c == 0) {
                y.b(obj);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LQJ/Q;", "", "it", "LXH/N;", "<anonymous>", "(LQJ/Q;F)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.DraggableKt$NoOpOnDragStopped$1", f = "Draggable.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements nI.q<Q, Float, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f27148c;

        b(C17164e<? super b> eVar) {
            super(3, eVar);
        }

        public final Object i(Q q10, float f10, C17164e<? super C16807N> eVar) {
            return new b(eVar).invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Q) obj, ((Number) obj2).floatValue(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f27148c == 0) {
                y.b(obj);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(F)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17642l<Float, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ A1<C17642l<Float, C16807N>> f27149c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(A1<? extends C17642l<? super Float, C16807N>> a12) {
            super(1);
            this.f27149c = a12;
        }

        public final void a(float f10) {
            this.f27149c.getValue().invoke(Float.valueOf(f10));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return C16807N.f139792a;
        }
    }

    public static final r a(C17642l<? super Float, C16807N> lVar) {
        return new C5692j(lVar);
    }

    public static final d g(d dVar, r rVar, v vVar, boolean z10, m mVar, boolean z11, nI.q<? super Q, ? super C5667g, ? super C17164e<? super C16807N>, ? extends Object> qVar, nI.q<? super Q, ? super Float, ? super C17164e<? super C16807N>, ? extends Object> qVar2, boolean z12) {
        d dVar2 = dVar;
        return dVar.s(new DraggableElement(rVar, vVar, z10, mVar, z11, qVar, qVar2, z12));
    }

    public static /* synthetic */ d h(d dVar, r rVar, v vVar, boolean z10, m mVar, boolean z11, nI.q qVar, nI.q qVar2, boolean z12, int i10, Object obj) {
        int i11 = i10;
        return g(dVar, rVar, vVar, (i11 & 4) != 0 ? true : z10, (i11 & 8) != 0 ? null : mVar, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? f27145a : qVar, (i11 & 64) != 0 ? f27146b : qVar2, (i11 & 128) != 0 ? false : z12);
    }

    public static final r i(C17642l<? super Float, C16807N> lVar, C4889m mVar, int i10) {
        if (C4895p.J()) {
            C4895p.S(-183245213, i10, -1, "androidx.compose.foundation.gestures.rememberDraggableState (Draggable.kt:135)");
        }
        A1<T> q10 = p1.q(lVar, mVar, i10 & 14);
        Object D10 = mVar.D();
        if (D10 == C4889m.f14007a.a()) {
            D10 = a(new c(q10));
            mVar.u(D10);
        }
        r rVar = (r) D10;
        if (C4895p.J()) {
            C4895p.R();
        }
        return rVar;
    }

    /* access modifiers changed from: private */
    public static final float j(long j10, v vVar) {
        return vVar == v.Vertical ? C5667g.n(j10) : C5667g.m(j10);
    }

    /* access modifiers changed from: private */
    public static final float k(long j10, v vVar) {
        return vVar == v.Vertical ? c2.y.i(j10) : c2.y.h(j10);
    }

    /* access modifiers changed from: private */
    public static final long l(long j10) {
        float f10 = 0.0f;
        float h10 = Float.isNaN(c2.y.h(j10)) ? 0.0f : c2.y.h(j10);
        if (!Float.isNaN(c2.y.i(j10))) {
            f10 = c2.y.i(j10);
        }
        return z.a(h10, f10);
    }
}
