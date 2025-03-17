package tF;

import I0.C4567k0;
import I0.C4569l0;
import I0.C4571m0;
import I0.C4592x0;
import I0.C4596z0;
import I0.G0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import S1.C4820m;
import U0.B;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import XH.C16807N;
import XH.y;
import androidx.compose.ui.d;
import androidx.lifecycle.F;
import c1.c;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eF.J;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import m0.C5546i;
import n0.C5607m;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.C5747v0;
import p1.i1;
import rF.C15002a;
import s0.C5834E;
import s0.C5861g;
import tF.C15083h;
import tK.Z;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/lifecycle/F;", "LtF/h;", "dialogUIModelLD", "LXH/N;", "b", "(Landroidx/lifecycle/F;LU0/m;I)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: tF.c  reason: case insensitive filesystem */
public final class C15078c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.sugarcube.app.base.ui.dialog.BottomSheetDialogKt$BottomSheetDialog$1$1", f = "BottomSheetDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: tF.c$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f131137c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C15083h f131138d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Q f131139e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4569l0 f131140f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.dialog.BottomSheetDialogKt$BottomSheetDialog$1$1$1", f = "BottomSheetDialog.kt", l = {66}, m = "invokeSuspend")
        /* renamed from: tF.c$a$a  reason: collision with other inner class name */
        static final class C3245a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f131141c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4569l0 f131142d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3245a(C4569l0 l0Var, C17164e<? super C3245a> eVar) {
                super(2, eVar);
                this.f131142d = l0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3245a(this.f131142d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3245a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f131141c;
                if (i10 == 0) {
                    y.b(obj);
                    C4569l0 l0Var = this.f131142d;
                    this.f131141c = 1;
                    if (l0Var.i(this) == f10) {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.dialog.BottomSheetDialogKt$BottomSheetDialog$1$1$2", f = "BottomSheetDialog.kt", l = {67}, m = "invokeSuspend")
        /* renamed from: tF.c$a$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f131143c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C4569l0 f131144d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C4569l0 l0Var, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f131144d = l0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f131144d, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f131143c;
                if (i10 == 0) {
                    y.b(obj);
                    C4569l0 l0Var = this.f131144d;
                    this.f131143c = 1;
                    if (l0Var.l(this) == f10) {
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C15083h hVar, Q q10, C4569l0 l0Var, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f131138d = hVar;
            this.f131139e = q10;
            this.f131140f = l0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f131138d, this.f131139e, this.f131140f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f131137c == 0) {
                y.b(obj);
                if (this.f131138d instanceof C15083h.a) {
                    F0 unused = C16314k.d(this.f131139e, (C17168i) null, (T) null, new C3245a(this.f131140f, (C17164e<? super C3245a>) null), 3, (Object) null);
                } else {
                    F0 unused2 = C16314k.d(this.f131139e, (C17168i) null, (T) null, new b(this.f131140f, (C17164e<? super b>) null), 3, (Object) null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: tF.c$b */
    static final class b implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4569l0 f131145a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15083h f131146b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Q f131147c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: tF.c$b$a */
        static final class a implements q<C5834E, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C4569l0 f131148a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C15083h f131149b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ Q f131150c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: tF.c$b$a$a  reason: collision with other inner class name */
            static final class C3246a implements q<C5861g, C4889m, Integer, C16807N> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C15083h f131151a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ Q f131152b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C4569l0 f131153c;

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
                @f(c = "com.sugarcube.app.base.ui.dialog.BottomSheetDialogKt$BottomSheetDialog$2$1$2$1$1$1$1$1$1", f = "BottomSheetDialog.kt", l = {114}, m = "invokeSuspend")
                /* renamed from: tF.c$b$a$a$a  reason: collision with other inner class name */
                static final class C3247a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f131154c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ C4569l0 f131155d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C3247a(C4569l0 l0Var, C17164e<? super C3247a> eVar) {
                        super(2, eVar);
                        this.f131155d = l0Var;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C3247a(this.f131155d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C3247a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f131154c;
                        if (i10 == 0) {
                            y.b(obj);
                            C4569l0 l0Var = this.f131155d;
                            this.f131154c = 1;
                            if (l0Var.i(this) == f10) {
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

                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
                @f(c = "com.sugarcube.app.base.ui.dialog.BottomSheetDialogKt$BottomSheetDialog$2$1$2$1$1$2$1$1$1", f = "BottomSheetDialog.kt", l = {126}, m = "invokeSuspend")
                /* renamed from: tF.c$b$a$a$b  reason: collision with other inner class name */
                static final class C3248b extends l implements p<Q, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f131156c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ C4569l0 f131157d;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C3248b(C4569l0 l0Var, C17164e<? super C3248b> eVar) {
                        super(2, eVar);
                        this.f131157d = l0Var;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        return new C3248b(this.f131157d, eVar);
                    }

                    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                        return ((C3248b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f131156c;
                        if (i10 == 0) {
                            y.b(obj);
                            C4569l0 l0Var = this.f131157d;
                            this.f131156c = 1;
                            if (l0Var.i(this) == f10) {
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

                C3246a(C15083h hVar, Q q10, C4569l0 l0Var) {
                    this.f131151a = hVar;
                    this.f131152b = q10;
                    this.f131153c = l0Var;
                }

                /* access modifiers changed from: private */
                public static final C16807N e(C15083h hVar, Q q10, C4569l0 l0Var) {
                    C17631a<C16807N> d10 = ((C15083h.c) hVar).d();
                    if (d10 != null) {
                        d10.invoke();
                    }
                    F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C3247a(l0Var, (C17164e<? super C3247a>) null), 3, (Object) null);
                    return C16807N.f139792a;
                }

                /* access modifiers changed from: private */
                public static final C16807N f(C15083h hVar, Q q10, C4569l0 l0Var) {
                    C17631a<C16807N> f10 = ((C15083h.c) hVar).f();
                    if (f10 != null) {
                        f10.invoke();
                    }
                    F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C3248b(l0Var, (C17164e<? super C3248b>) null), 3, (Object) null);
                    return C16807N.f139792a;
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: nI.a} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: nI.a} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void c(s0.C5861g r42, U0.C4889m r43, int r44) {
                    /*
                        r41 = this;
                        r0 = r41
                        r14 = r43
                        r1 = r44
                        java.lang.String r2 = "$this$ModalBottomSheetLayout"
                        r3 = r42
                        kotlin.jvm.internal.C17542s.j(r3, r2)
                        r2 = r1 & 17
                        r3 = 16
                        if (r2 != r3) goto L_0x001f
                        boolean r2 = r43.l()
                        if (r2 != 0) goto L_0x001a
                        goto L_0x001f
                    L_0x001a:
                        r43.L()
                        goto L_0x031b
                    L_0x001f:
                        boolean r2 = U0.C4895p.J()
                        if (r2 == 0) goto L_0x002e
                        r2 = -1
                        java.lang.String r3 = "com.sugarcube.app.base.ui.dialog.BottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (BottomSheetDialog.kt:86)"
                        r4 = 1222514800(0x48de1870, float:454851.5)
                        U0.C4895p.S(r4, r1, r2, r3)
                    L_0x002e:
                        androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
                        r1 = 28
                        float r1 = (float) r1
                        float r1 = c2.h.B(r1)
                        r2 = 32
                        float r13 = (float) r2
                        float r2 = c2.h.B(r13)
                        androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.j(r15, r1, r2)
                        tF.h r12 = r0.f131151a
                        QJ.Q r10 = r0.f131152b
                        I0.l0 r11 = r0.f131153c
                        androidx.compose.foundation.layout.d r9 = androidx.compose.foundation.layout.C5073d.f18068a
                        androidx.compose.foundation.layout.d$m r2 = r9.g()
                        i1.c$a r26 = i1.C5437c.f24302a
                        i1.c$b r3 = r26.k()
                        r8 = 0
                        E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r2, r3, r14, r8)
                        int r3 = U0.C4883j.a(r14, r8)
                        U0.y r4 = r43.s()
                        androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r14, r1)
                        G1.g$a r27 = G1.C4504g.f6515W
                        nI.a r5 = r27.a()
                        U0.f r6 = r43.m()
                        if (r6 != 0) goto L_0x0074
                        U0.C4883j.c()
                    L_0x0074:
                        r43.I()
                        boolean r6 = r43.i()
                        if (r6 == 0) goto L_0x0081
                        r14.p(r5)
                        goto L_0x0084
                    L_0x0081:
                        r43.t()
                    L_0x0084:
                        U0.m r5 = U0.F1.a(r43)
                        nI.p r6 = r27.c()
                        U0.F1.c(r5, r2, r6)
                        nI.p r2 = r27.e()
                        U0.F1.c(r5, r4, r2)
                        nI.p r2 = r27.b()
                        boolean r4 = r5.i()
                        if (r4 != 0) goto L_0x00ae
                        java.lang.Object r4 = r5.D()
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r3)
                        boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r6)
                        if (r4 != 0) goto L_0x00bc
                    L_0x00ae:
                        java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                        r5.u(r4)
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                        r5.w(r3, r2)
                    L_0x00bc:
                        nI.p r2 = r27.d()
                        U0.F1.c(r5, r1, r2)
                        s0.h r1 = s0.C5862h.f28810a
                        r28 = r12
                        tF.h$c r28 = (tF.C15083h.c) r28
                        tF.p r1 = r28.g()
                        java.lang.String r1 = tF.C15084i.a(r1, r14, r8)
                        tK.v r7 = tK.C18030v.f147664a
                        int r5 = tK.C18030v.f147665b
                        tK.w r2 = r7.b(r14, r5)
                        tK.r r2 = r2.c()
                        N1.Y r21 = r2.a()
                        rF.b r2 = rF.C15002a.a(r14, r8)
                        long r3 = r2.f()
                        r24 = 0
                        r25 = 65530(0xfffa, float:9.1827E-41)
                        r2 = 0
                        r16 = 0
                        r29 = r5
                        r5 = r16
                        r16 = 0
                        r30 = r7
                        r7 = r16
                        r8 = r16
                        r31 = r9
                        r9 = r16
                        r16 = 0
                        r32 = r10
                        r33 = r11
                        r10 = r16
                        r16 = 0
                        r34 = r12
                        r12 = r16
                        r35 = r13
                        r13 = r16
                        r16 = 0
                        r36 = r15
                        r14 = r16
                        r16 = 0
                        r17 = 0
                        r18 = 0
                        r19 = 0
                        r20 = 0
                        r23 = 0
                        r22 = r43
                        I0.b1.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                        r1 = 20
                        float r1 = (float) r1
                        float r1 = c2.h.B(r1)
                        r14 = r36
                        androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r14, r1)
                        r15 = 6
                        r13 = r43
                        s0.C5844O.a(r1, r13, r15)
                        tF.p r1 = r28.b()
                        r12 = 0
                        java.lang.String r1 = tF.C15084i.a(r1, r13, r12)
                        r3 = r29
                        r2 = r30
                        tK.w r2 = r2.b(r13, r3)
                        tK.c r2 = r2.a()
                        N1.Y r21 = r2.a()
                        rF.b r2 = rF.C15002a.a(r13, r12)
                        long r3 = r2.f()
                        r2 = 0
                        r5 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r10 = 0
                        r16 = 0
                        r12 = r16
                        r13 = r16
                        r16 = 0
                        r37 = r14
                        r14 = r16
                        r16 = 0
                        r17 = 0
                        I0.b1.b(r1, r2, r3, r5, r7, r8, r9, r10, r12, r13, r14, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                        float r1 = c2.h.B(r35)
                        r14 = r37
                        androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.i(r14, r1)
                        r15 = r43
                        r2 = 6
                        s0.C5844O.a(r1, r15, r2)
                        r1 = 18
                        float r1 = (float) r1
                        float r1 = c2.h.B(r1)
                        r3 = r31
                        androidx.compose.foundation.layout.d$f r1 = r3.n(r1)
                        i1.c$c r3 = r26.l()
                        E1.I r1 = androidx.compose.foundation.layout.G.b(r1, r3, r15, r2)
                        r13 = 0
                        int r2 = U0.C4883j.a(r15, r13)
                        U0.y r3 = r43.s()
                        androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r15, r14)
                        nI.a r5 = r27.a()
                        U0.f r6 = r43.m()
                        if (r6 != 0) goto L_0x01b8
                        U0.C4883j.c()
                    L_0x01b8:
                        r43.I()
                        boolean r6 = r43.i()
                        if (r6 == 0) goto L_0x01c5
                        r15.p(r5)
                        goto L_0x01c8
                    L_0x01c5:
                        r43.t()
                    L_0x01c8:
                        U0.m r5 = U0.F1.a(r43)
                        nI.p r6 = r27.c()
                        U0.F1.c(r5, r1, r6)
                        nI.p r1 = r27.e()
                        U0.F1.c(r5, r3, r1)
                        nI.p r1 = r27.b()
                        boolean r3 = r5.i()
                        if (r3 != 0) goto L_0x01f2
                        java.lang.Object r3 = r5.D()
                        java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
                        boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
                        if (r3 != 0) goto L_0x0200
                    L_0x01f2:
                        java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
                        r5.u(r3)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                        r5.w(r2, r1)
                    L_0x0200:
                        nI.p r1 = r27.d()
                        U0.F1.c(r5, r4, r1)
                        s0.N r16 = s0.C5843N.f28726a
                        tF.p r1 = r28.c()
                        r2 = -414646832(0xffffffffe748fdd0, float:-9.491553E23)
                        r15.W(r2)
                        r12 = 0
                        r5 = 1
                        r4 = 0
                        if (r1 != 0) goto L_0x0221
                        r0 = r13
                        r39 = r32
                        r38 = r33
                        r40 = r34
                        goto L_0x029c
                    L_0x0221:
                        java.lang.String r1 = tF.C15084i.a(r1, r15, r13)
                        androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r14, r4, r5, r12)
                        r10 = 2
                        r11 = 0
                        r8 = 1065353216(0x3f800000, float:1.0)
                        r9 = 0
                        r6 = r16
                        androidx.compose.ui.d r2 = s0.C5842M.e(r6, r7, r8, r9, r10, r11)
                        wK.l0$f r6 = wK.C18390l0.f.f151159b
                        r3 = 1398877502(0x53612d3e, float:9.6712668E11)
                        r15.W(r3)
                        r11 = r34
                        boolean r3 = r15.V(r11)
                        r10 = r32
                        boolean r7 = r15.F(r10)
                        r3 = r3 | r7
                        r9 = r33
                        boolean r7 = r15.F(r9)
                        r3 = r3 | r7
                        java.lang.Object r7 = r43.D()
                        if (r3 != 0) goto L_0x025e
                        U0.m$a r3 = U0.C4889m.f14007a
                        java.lang.Object r3 = r3.a()
                        if (r7 != r3) goto L_0x0266
                    L_0x025e:
                        tF.e r7 = new tF.e
                        r7.<init>(r11, r10, r9)
                        r15.u(r7)
                    L_0x0266:
                        r17 = r7
                        nI.a r17 = (nI.C17631a) r17
                        r43.P()
                        int r3 = wK.C18390l0.f.f151160c
                        int r18 = r3 << 9
                        r19 = 500(0x1f4, float:7.0E-43)
                        r3 = 0
                        r7 = 0
                        r8 = 0
                        r20 = 0
                        r21 = 0
                        r22 = 0
                        r4 = r6
                        r6 = r5
                        r5 = r7
                        r7 = r6
                        r6 = r8
                        r8 = r7
                        r7 = r20
                        r8 = r21
                        r38 = r9
                        r9 = r22
                        r39 = r10
                        r10 = r17
                        r40 = r11
                        r11 = r43
                        r12 = r18
                        r0 = r13
                        r13 = r19
                        wK.C18342h0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                        XH.N r1 = XH.C16807N.f139792a
                    L_0x029c:
                        r43.P()
                        tF.p r1 = r28.e()
                        r2 = -414621247(0xffffffffe74961c1, float:-9.509989E23)
                        r15.W(r2)
                        if (r1 != 0) goto L_0x02ac
                        goto L_0x0309
                    L_0x02ac:
                        java.lang.String r1 = tF.C15084i.a(r1, r15, r0)
                        r0 = 0
                        r2 = 1
                        r3 = 0
                        androidx.compose.ui.d r7 = androidx.compose.foundation.layout.J.h(r14, r3, r2, r0)
                        r10 = 2
                        r11 = 0
                        r8 = 1065353216(0x3f800000, float:1.0)
                        r9 = 0
                        r6 = r16
                        androidx.compose.ui.d r2 = s0.C5842M.e(r6, r7, r8, r9, r10, r11)
                        r0 = 1398900638(0x5361879e, float:9.6864292E11)
                        r15.W(r0)
                        r0 = r40
                        boolean r3 = r15.V(r0)
                        r4 = r39
                        boolean r5 = r15.F(r4)
                        r3 = r3 | r5
                        r5 = r38
                        boolean r6 = r15.F(r5)
                        r3 = r3 | r6
                        java.lang.Object r6 = r43.D()
                        if (r3 != 0) goto L_0x02ea
                        U0.m$a r3 = U0.C4889m.f14007a
                        java.lang.Object r3 = r3.a()
                        if (r6 != r3) goto L_0x02f2
                    L_0x02ea:
                        tF.f r6 = new tF.f
                        r6.<init>(r0, r4, r5)
                        r15.u(r6)
                    L_0x02f2:
                        r10 = r6
                        nI.a r10 = (nI.C17631a) r10
                        r43.P()
                        r12 = 0
                        r13 = 508(0x1fc, float:7.12E-43)
                        r3 = 0
                        r4 = 0
                        r5 = 0
                        r6 = 0
                        r7 = 0
                        r8 = 0
                        r9 = 0
                        r11 = r43
                        wK.C18342h0.f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                        XH.N r0 = XH.C16807N.f139792a
                    L_0x0309:
                        r43.P()
                        r43.x()
                        r43.x()
                        boolean r0 = U0.C4895p.J()
                        if (r0 == 0) goto L_0x031b
                        U0.C4895p.R()
                    L_0x031b:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: tF.C15078c.b.a.C3246a.c(s0.g, U0.m, int):void");
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    c((C5861g) obj, (C4889m) obj2, ((Number) obj3).intValue());
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tF/c$b$a$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            /* renamed from: tF.c$b$a$b  reason: collision with other inner class name */
            public static final class C3249b implements L {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C15083h f131158a;

                public C3249b(C15083h hVar) {
                    this.f131158a = hVar;
                }

                public void b() {
                    C17631a<C16807N> a10 = ((C15083h.c) this.f131158a).a();
                    if (a10 != null) {
                        a10.invoke();
                    }
                }
            }

            a(C4569l0 l0Var, C15083h hVar, Q q10) {
                this.f131148a = l0Var;
                this.f131149b = hVar;
                this.f131150c = q10;
            }

            /* access modifiers changed from: private */
            public static final L c(C15083h hVar, M m10) {
                C17542s.j(m10, "$this$DisposableEffect");
                return new C3249b(hVar);
            }

            public final void b(C5834E e10, C4889m mVar, int i10) {
                C4889m mVar2 = mVar;
                int i11 = i10;
                C17542s.j(e10, "padding");
                if ((i11 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1965502558, i11, -1, "com.sugarcube.app.base.ui.dialog.BottomSheetDialog.<anonymous>.<anonymous> (BottomSheetDialog.kt:76)");
                    }
                    mVar2.W(-2005457448);
                    if (this.f131148a.e() != C4571m0.Hidden) {
                        C16807N n10 = C16807N.f139792a;
                        mVar2.W(-2005454215);
                        boolean V10 = mVar2.V(this.f131149b);
                        C15083h hVar = this.f131149b;
                        Object D10 = mVar.D();
                        if (V10 || D10 == C4889m.f14007a.a()) {
                            D10 = new C15079d(hVar);
                            mVar2.u(D10);
                        }
                        mVar.P();
                        P.c(n10, (C17642l) D10, mVar2, 6);
                    }
                    mVar.P();
                    long p10 = C15002a.a(mVar2, 0).p();
                    C4567k0.b(c.e(1222514800, true, new C3246a(this.f131149b, this.f131150c, this.f131148a), mVar2, 54), (d) null, this.f131148a, false, (i1) null, 0.0f, p10, 0, 0, C15082g.f131166a.a(), mVar, (C4569l0.f8232e << 6) | 805306374, 442);
                    if (C4895p.J()) {
                        C4895p.R();
                        return;
                    }
                    return;
                }
                mVar.L();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                b((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
                return C16807N.f139792a;
            }
        }

        b(C4569l0 l0Var, C15083h hVar, Q q10) {
            this.f131145a = l0Var;
            this.f131146b = hVar;
            this.f131147c = q10;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1950126940, i11, -1, "com.sugarcube.app.base.ui.dialog.BottomSheetDialog.<anonymous> (BottomSheetDialog.kt:73)");
                }
                C4592x0.a((d) null, (C4596z0) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, (q<? super G0, ? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, 0, false, (q<? super C5861g, ? super C4889m, ? super Integer, C16807N>) null, false, (i1) null, 0.0f, 0, 0, 0, C5747v0.f27350b.h(), 0, c.e(1965502558, true, new a(this.f131145a, this.f131146b, this.f131147c), mVar, 54), mVar, 0, 12779520, 98303);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(F<C15083h> f10, C4889m mVar, int i10) {
        int i11;
        C17542s.j(f10, "dialogUIModelLD");
        C4889m k10 = mVar.k(-829695662);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(f10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-829695662, i11, -1, "com.sugarcube.app.base.ui.dialog.BottomSheetDialog (BottomSheetDialog.kt:54)");
            }
            Object D10 = k10.D();
            C4889m.a aVar = C4889m.f14007a;
            if (D10 == aVar.a()) {
                B b10 = new B(P.k(C17169j.f142968a, k10));
                k10.u(b10);
                D10 = b10;
            }
            Q a10 = ((B) D10).a();
            C15083h value = d1.b.a(f10, k10, i11 & 14).getValue();
            C4569l0 j10 = C4567k0.j(C4571m0.Hidden, (C5546i<Float>) null, (C17642l<? super C4571m0, Boolean>) null, true, k10, 3078, 6);
            k10.W(-586169862);
            boolean V10 = k10.V(value) | k10.F(a10) | k10.F(j10);
            Object D11 = k10.D();
            if (V10 || D11 == aVar.a()) {
                D11 = new a(value, a10, j10, (C17164e<? super a>) null);
                k10.u(D11);
            }
            k10.P();
            P.g(value, (p) D11, k10, 0);
            if (value instanceof C15083h.c) {
                k10.W(-991062108);
                Z.g(C5607m.a(k10, 0), (C4820m) null, c.e(1950126940, true, new b(j10, value, a10), k10, 54), k10, 384, 2);
                k10.P();
            } else if (value instanceof C15083h.b) {
                k10.W(-987767087);
                J.S(value, false, k10, 0, 2);
                k10.P();
            } else {
                k10.W(-987686704);
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C15077b(f10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(F f10, int i10, C4889m mVar, int i11) {
        b(f10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
