package androidx.compose.foundation;

import A1.C4349p;
import A1.C4352t;
import A1.r;
import G1.s0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import r0.g;
import r0.h;
import r0.m;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H@¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u0006J*\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, d2 = {"Landroidx/compose/foundation/i;", "LG1/s0;", "Landroidx/compose/ui/d$c;", "Lr0/m;", "interactionSource", "<init>", "(Lr0/m;)V", "LXH/N;", "E2", "(LdI/e;)Ljava/lang/Object;", "F2", "G2", "()V", "H2", "LA1/p;", "pointerEvent", "LA1/r;", "pass", "Lc2/r;", "bounds", "T1", "(LA1/p;LA1/r;J)V", "s1", "n2", "n", "Lr0/m;", "Lr0/g;", "o", "Lr0/g;", "hoverInteraction", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class i extends d.c implements s0 {

    /* renamed from: n  reason: collision with root package name */
    private m f17877n;

    /* renamed from: o  reason: collision with root package name */
    private g f17878o;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {111}, m = "emitEnter")
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f17879c;

        /* renamed from: d  reason: collision with root package name */
        Object f17880d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f17881e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i f17882f;

        /* renamed from: g  reason: collision with root package name */
        int f17883g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(i iVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f17882f = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17881e = obj;
            this.f17883g |= Integer.MIN_VALUE;
            return this.f17882f.E2(this);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.foundation.HoverableNode", f = "Hoverable.kt", l = {119}, m = "emitExit")
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f17884c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f17885d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ i f17886e;

        /* renamed from: f  reason: collision with root package name */
        int f17887f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(i iVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f17886e = iVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f17885d = obj;
            this.f17887f |= Integer.MIN_VALUE;
            return this.f17886e.F2(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$1", f = "Hoverable.kt", l = {94}, m = "invokeSuspend")
    static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17888c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f17889d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(i iVar, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f17889d = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new c(this.f17889d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17888c;
            if (i10 == 0) {
                y.b(obj);
                i iVar = this.f17889d;
                this.f17888c = 1;
                if (iVar.E2(this) == f10) {
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
    @f(c = "androidx.compose.foundation.HoverableNode$onPointerEvent$2", f = "Hoverable.kt", l = {95}, m = "invokeSuspend")
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f17890c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ i f17891d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(i iVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f17891d = iVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f17891d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f17890c;
            if (i10 == 0) {
                y.b(obj);
                i iVar = this.f17891d;
                this.f17890c = 1;
                if (iVar.F2(this) == f10) {
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

    public i(m mVar) {
        this.f17877n = mVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object E2(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.a
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.i$a r0 = (androidx.compose.foundation.i.a) r0
            int r1 = r0.f17883g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17883g = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.i$a r0 = new androidx.compose.foundation.i$a
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f17881e
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f17883g
            r3 = 1
            if (r2 == 0) goto L_0x0039
            if (r2 != r3) goto L_0x0031
            java.lang.Object r1 = r0.f17880d
            r0.g r1 = (r0.g) r1
            java.lang.Object r0 = r0.f17879c
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            XH.y.b(r5)
            goto L_0x0056
        L_0x0031:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0039:
            XH.y.b(r5)
            r0.g r5 = r4.f17878o
            if (r5 != 0) goto L_0x0058
            r0.g r5 = new r0.g
            r5.<init>()
            r0.m r2 = r4.f17877n
            r0.f17879c = r4
            r0.f17880d = r5
            r0.f17883g = r3
            java.lang.Object r0 = r2.b(r5, r0)
            if (r0 != r1) goto L_0x0054
            return r1
        L_0x0054:
            r0 = r4
            r1 = r5
        L_0x0056:
            r0.f17878o = r1
        L_0x0058:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.E2(dI.e):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object F2(dI.C17164e<? super XH.C16807N> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof androidx.compose.foundation.i.b
            if (r0 == 0) goto L_0x0013
            r0 = r5
            androidx.compose.foundation.i$b r0 = (androidx.compose.foundation.i.b) r0
            int r1 = r0.f17887f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f17887f = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.foundation.i$b r0 = new androidx.compose.foundation.i$b
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f17885d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f17887f
            r3 = 1
            if (r2 == 0) goto L_0x0035
            if (r2 != r3) goto L_0x002d
            java.lang.Object r0 = r0.f17884c
            androidx.compose.foundation.i r0 = (androidx.compose.foundation.i) r0
            XH.y.b(r5)
            goto L_0x004f
        L_0x002d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x0035:
            XH.y.b(r5)
            r0.g r5 = r4.f17878o
            if (r5 == 0) goto L_0x0052
            r0.h r2 = new r0.h
            r2.<init>(r5)
            r0.m r5 = r4.f17877n
            r0.f17884c = r4
            r0.f17887f = r3
            java.lang.Object r5 = r5.b(r2, r0)
            if (r5 != r1) goto L_0x004e
            return r1
        L_0x004e:
            r0 = r4
        L_0x004f:
            r5 = 0
            r0.f17878o = r5
        L_0x0052:
            XH.N r5 = XH.C16807N.f139792a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.i.F2(dI.e):java.lang.Object");
    }

    private final void G2() {
        g gVar = this.f17878o;
        if (gVar != null) {
            this.f17877n.a(new h(gVar));
            this.f17878o = null;
        }
    }

    public final void H2(m mVar) {
        if (!C17542s.e(this.f17877n, mVar)) {
            G2();
            this.f17877n = mVar;
        }
    }

    public void T1(C4349p pVar, r rVar, long j10) {
        if (rVar == r.Main) {
            int g10 = pVar.g();
            C4352t.a aVar = C4352t.f4431a;
            if (C4352t.i(g10, aVar.a())) {
                F0 unused = C16314k.d(c2(), (C17168i) null, (T) null, new c(this, (C17164e<? super c>) null), 3, (Object) null);
            } else if (C4352t.i(g10, aVar.b())) {
                F0 unused2 = C16314k.d(c2(), (C17168i) null, (T) null, new d(this, (C17164e<? super d>) null), 3, (Object) null);
            }
        }
    }

    public void n2() {
        G2();
    }

    public void s1() {
        G2();
    }
}
