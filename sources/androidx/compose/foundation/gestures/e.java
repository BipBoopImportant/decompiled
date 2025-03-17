package androidx.compose.foundation.gestures;

import A1.B;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.compose.foundation.gestures.c;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import n0.C5589L;
import nI.C17642l;
import nI.p;
import nI.q;
import o1.C5667g;
import p0.n;
import p0.r;
import p0.v;
import r0.m;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0000\u0018\u00002\u00020\u0001B¡\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\u00020\u001a*\u00020\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u0010*\u00020\u0010H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ@\u0010!\u001a\u00020\u00122.\u0010 \u001a*\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00120\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u001eH@¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u0010H\u0016ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u001aH\u0016ø\u0001\u0000¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J§\u0001\u0010*\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u00062(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2(\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e2\u0006\u0010\u0017\u001a\u00020\u0006¢\u0006\u0004\b*\u0010\u0019R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\r\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R8\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R8\u0010\u0016\u001a$\b\u0001\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00102R\u0016\u0010\u0017\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u00100\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, d2 = {"Landroidx/compose/foundation/gestures/e;", "Landroidx/compose/foundation/gestures/d;", "Lp0/r;", "state", "Lkotlin/Function1;", "LA1/B;", "", "canDrag", "Lp0/v;", "orientation", "enabled", "Lr0/m;", "interactionSource", "startDragImmediately", "Lkotlin/Function3;", "LQJ/Q;", "Lo1/g;", "LdI/e;", "LXH/N;", "", "onDragStarted", "", "onDragStopped", "reverseDirection", "<init>", "(Lp0/r;LnI/l;Lp0/v;ZLr0/m;ZLnI/q;LnI/q;Z)V", "Lc2/y;", "j3", "(J)J", "k3", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/c$b;", "forEachDelta", "R2", "(LnI/p;LdI/e;)Ljava/lang/Object;", "startedPosition", "V2", "(J)V", "velocity", "W2", "a3", "()Z", "l3", "y", "Lp0/r;", "z", "Lp0/v;", "A", "Z", "B", "LnI/q;", "C", "D", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e extends d {

    /* renamed from: A  reason: collision with root package name */
    private boolean f17790A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public q<? super Q, ? super C5667g, ? super C17164e<? super C16807N>, ? extends Object> f17791B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public q<? super Q, ? super Float, ? super C17164e<? super C16807N>, ? extends Object> f17792C;

    /* renamed from: D  reason: collision with root package name */
    private boolean f17793D;

    /* renamed from: y  reason: collision with root package name */
    private r f17794y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public v f17795z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp0/n;", "LXH/N;", "<anonymous>", "(Lp0/n;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.DraggableNode$drag$2", f = "Draggable.kt", l = {305}, m = "invokeSuspend")
    static final class a extends l implements p<n, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17796c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17797d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<C17642l<? super c.b, C16807N>, C17164e<? super C16807N>, Object> f17798e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ e f17799f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/gestures/c$b;", "dragDelta", "LXH/N;", "a", "(Landroidx/compose/foundation/gestures/c$b;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.compose.foundation.gestures.e$a$a  reason: collision with other inner class name */
        static final class C0261a extends C17544u implements C17642l<c.b, C16807N> {

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ n f17800c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ e f17801d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0261a(n nVar, e eVar) {
                super(1);
                this.f17800c = nVar;
                this.f17801d = eVar;
            }

            public final void a(c.b bVar) {
                this.f17800c.a(p0.q.j(this.f17801d.k3(bVar.a()), this.f17801d.f17795z));
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((c.b) obj);
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(p<? super C17642l<? super c.b, C16807N>, ? super C17164e<? super C16807N>, ? extends Object> pVar, e eVar, C17164e<? super a> eVar2) {
            super(2, eVar2);
            this.f17798e = pVar;
            this.f17799f = eVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f17798e, this.f17799f, eVar);
            aVar.f17797d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(n nVar, C17164e<? super C16807N> eVar) {
            return ((a) create(nVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17796c;
            if (i10 == 0) {
                y.b(obj);
                p<C17642l<? super c.b, C16807N>, C17164e<? super C16807N>, Object> pVar = this.f17798e;
                C0261a aVar = new C0261a((n) this.f17797d, this.f17799f);
                this.f17796c = 1;
                if (pVar.invoke(aVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStarted$1", f = "Draggable.kt", l = {314}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17802c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17803d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f17804e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f17805f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(e eVar, long j10, C17164e<? super b> eVar2) {
            super(2, eVar2);
            this.f17804e = eVar;
            this.f17805f = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f17804e, this.f17805f, eVar);
            bVar.f17803d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17802c;
            if (i10 == 0) {
                y.b(obj);
                q e32 = this.f17804e.f17791B;
                C5667g d10 = C5667g.d(this.f17805f);
                this.f17802c = 1;
                if (e32.invoke((Q) this.f17803d, d10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.gestures.DraggableNode$onDragStopped$1", f = "Draggable.kt", l = {321}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17806c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f17807d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ e f17808e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f17809f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar, long j10, C17164e<? super c> eVar2) {
            super(2, eVar2);
            this.f17808e = eVar;
            this.f17809f = j10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f17808e, this.f17809f, eVar);
            cVar.f17807d = obj;
            return cVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17806c;
            if (i10 == 0) {
                y.b(obj);
                q f32 = this.f17808e.f17792C;
                Float d10 = kotlin.coroutines.jvm.internal.b.d(p0.q.k(this.f17808e.j3(this.f17809f), this.f17808e.f17795z));
                this.f17806c = 1;
                if (f32.invoke((Q) this.f17807d, d10, this) == f10) {
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

    public e(r rVar, C17642l<? super B, Boolean> lVar, v vVar, boolean z10, m mVar, boolean z11, q<? super Q, ? super C5667g, ? super C17164e<? super C16807N>, ? extends Object> qVar, q<? super Q, ? super Float, ? super C17164e<? super C16807N>, ? extends Object> qVar2, boolean z12) {
        super(lVar, z10, mVar, vVar);
        this.f17794y = rVar;
        this.f17795z = vVar;
        this.f17790A = z11;
        this.f17791B = qVar;
        this.f17792C = qVar2;
        this.f17793D = z12;
    }

    /* access modifiers changed from: private */
    public final long j3(long j10) {
        return c2.y.m(j10, this.f17793D ? -1.0f : 1.0f);
    }

    /* access modifiers changed from: private */
    public final long k3(long j10) {
        return C5667g.s(j10, this.f17793D ? -1.0f : 1.0f);
    }

    public Object R2(p<? super C17642l<? super c.b, C16807N>, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17164e<? super C16807N> eVar) {
        Object b10 = this.f17794y.b(C5589L.UserInput, new a(pVar, this, (C17164e<? super a>) null), eVar);
        return b10 == C17187b.f() ? b10 : C16807N.f139792a;
    }

    public void V2(long j10) {
        if (j2() && !C17542s.e(this.f17791B, p0.q.f27145a)) {
            F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new b(this, j10, (C17164e<? super b>) null), 3, (Object) null);
        }
    }

    public void W2(long j10) {
        if (j2() && !C17542s.e(this.f17792C, p0.q.f27146b)) {
            F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new c(this, j10, (C17164e<? super c>) null), 3, (Object) null);
        }
    }

    public boolean a3() {
        return this.f17790A;
    }

    public final void l3(r rVar, C17642l<? super B, Boolean> lVar, v vVar, boolean z10, m mVar, boolean z11, q<? super Q, ? super C5667g, ? super C17164e<? super C16807N>, ? extends Object> qVar, q<? super Q, ? super Float, ? super C17164e<? super C16807N>, ? extends Object> qVar2, boolean z12) {
        boolean z13;
        boolean z14;
        q<? super Q, ? super C5667g, ? super C17164e<? super C16807N>, ? extends Object> qVar3;
        r rVar2 = rVar;
        v vVar2 = vVar;
        boolean z15 = z12;
        if (!C17542s.e(this.f17794y, rVar)) {
            this.f17794y = rVar2;
            z13 = true;
        } else {
            z13 = false;
        }
        if (this.f17795z != vVar2) {
            this.f17795z = vVar2;
            z13 = true;
        }
        if (this.f17793D != z15) {
            this.f17793D = z15;
            qVar3 = qVar;
            z14 = true;
        } else {
            z14 = z13;
            qVar3 = qVar;
        }
        this.f17791B = qVar3;
        this.f17792C = qVar2;
        this.f17790A = z11;
        c3(lVar, z10, mVar, vVar, z14);
    }
}
