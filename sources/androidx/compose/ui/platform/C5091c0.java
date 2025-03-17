package androidx.compose.ui.platform;

import G1.m0;
import QJ.Q;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4899r0;
import U0.p1;
import XH.C16807N;
import XH.C16820k;
import XH.y;
import android.view.View;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001J<\u0010\t\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H@¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u0004\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR+\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8B@BX\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/platform/c0;", "", "LG1/m0;", "owner", "Lkotlin/Function2;", "Landroidx/compose/ui/platform/L0;", "LdI/e;", "", "session", "c", "(LG1/m0;LnI/p;LdI/e;)Ljava/lang/Object;", "a", "Landroidx/compose/ui/platform/c0;", "parent", "Landroidx/compose/ui/platform/G0;", "<set-?>", "b", "LU0/r0;", "()Landroidx/compose/ui/platform/G0;", "setInterceptor", "(Landroidx/compose/ui/platform/G0;)V", "interceptor", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.c0  reason: case insensitive filesystem */
final class C5091c0 {

    /* renamed from: a  reason: collision with root package name */
    private final C5091c0 f19400a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f19401b;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor", f = "PlatformTextInputModifierNode.kt", l = {229}, m = "textInputSession")
    /* renamed from: androidx.compose.ui.platform.c0$a */
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        /* synthetic */ Object f19402c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5091c0 f19403d;

        /* renamed from: e  reason: collision with root package name */
        int f19404e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C5091c0 c0Var, C17164e<? super a> eVar) {
            super(eVar);
            this.f19403d = c0Var;
        }

        public final Object invokeSuspend(Object obj) {
            this.f19402c = obj;
            this.f19404e |= Integer.MIN_VALUE;
            return this.f19403d.c((m0) null, (p<? super L0, ? super C17164e<?>, ? extends Object>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/platform/L0;", "", "<anonymous>", "(Landroidx/compose/ui/platform/L0;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {252}, m = "invokeSuspend")
    /* renamed from: androidx.compose.ui.platform.c0$b */
    static final class b extends l implements p<L0, C17164e<?>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f19405c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f19406d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ p<L0, C17164e<?>, Object> f19407e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C5091c0 f19408f;

        @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"androidx/compose/ui/platform/c0$b$a", "Landroidx/compose/ui/platform/L0;", "Landroidx/compose/ui/platform/H0;", "request", "", "a", "(Landroidx/compose/ui/platform/H0;LdI/e;)Ljava/lang/Object;", "LdI/i;", "getCoroutineContext", "()LdI/i;", "coroutineContext", "Landroid/view/View;", "c", "()Landroid/view/View;", "view", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: androidx.compose.ui.platform.c0$b$a */
        public static final class a implements L0 {

            /* renamed from: a  reason: collision with root package name */
            private final /* synthetic */ L0 f19409a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ L0 f19410b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ AtomicReference f19411c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C5091c0 f19412d;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", f = "PlatformTextInputModifierNode.kt", l = {239}, m = "startInputMethod")
            /* renamed from: androidx.compose.ui.platform.c0$b$a$a  reason: collision with other inner class name */
            static final class C0300a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f19413c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ a f19414d;

                /* renamed from: e  reason: collision with root package name */
                int f19415e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C0300a(a aVar, C17164e<? super C0300a> eVar) {
                    super(eVar);
                    this.f19414d = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f19413c = obj;
                    this.f19415e |= Integer.MIN_VALUE;
                    return this.f19414d.a((H0) null, this);
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "it", "LXH/N;", "a", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: androidx.compose.ui.platform.c0$b$a$b  reason: collision with other inner class name */
            static final class C0301b extends C17544u implements C17642l<Q, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                public static final C0301b f19416c = new C0301b();

                C0301b() {
                    super(1);
                }

                public final void a(Q q10) {
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Q) obj);
                    return C16807N.f139792a;
                }
            }

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXH/N;", "it", "", "<anonymous>", "(V)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
            @f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {244}, m = "invokeSuspend")
            /* renamed from: androidx.compose.ui.platform.c0$b$a$c */
            static final class c extends l implements p<C16807N, C17164e<?>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f19417c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C5091c0 f19418d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ H0 f19419e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ L0 f19420f;

                @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/G0;", "b", "()Landroidx/compose/ui/platform/G0;"}, k = 3, mv = {1, 8, 0})
                /* renamed from: androidx.compose.ui.platform.c0$b$a$c$a  reason: collision with other inner class name */
                static final class C0302a extends C17544u implements C17631a<G0> {

                    /* renamed from: c  reason: collision with root package name */
                    final /* synthetic */ C5091c0 f19421c;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0302a(C5091c0 c0Var) {
                        super(0);
                        this.f19421c = c0Var;
                    }

                    /* renamed from: b */
                    public final G0 invoke() {
                        return this.f19421c.b();
                    }
                }

                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/G0;", "interceptor", "LXH/N;", "<anonymous>", "(Landroidx/compose/ui/platform/G0;)V"}, k = 3, mv = {1, 8, 0})
                @f(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {245}, m = "invokeSuspend")
                /* renamed from: androidx.compose.ui.platform.c0$b$a$c$b  reason: collision with other inner class name */
                static final class C0303b extends l implements p<G0, C17164e<? super C16807N>, Object> {

                    /* renamed from: c  reason: collision with root package name */
                    int f19422c;

                    /* renamed from: d  reason: collision with root package name */
                    /* synthetic */ Object f19423d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ H0 f19424e;

                    /* renamed from: f  reason: collision with root package name */
                    final /* synthetic */ L0 f19425f;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C0303b(H0 h02, L0 l02, C17164e<? super C0303b> eVar) {
                        super(2, eVar);
                        this.f19424e = h02;
                        this.f19425f = l02;
                    }

                    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                        C0303b bVar = new C0303b(this.f19424e, this.f19425f, eVar);
                        bVar.f19423d = obj;
                        return bVar;
                    }

                    /* renamed from: i */
                    public final Object invoke(G0 g02, C17164e<? super C16807N> eVar) {
                        return ((C0303b) create(g02, eVar)).invokeSuspend(C16807N.f139792a);
                    }

                    public final Object invokeSuspend(Object obj) {
                        Object f10 = C17187b.f();
                        int i10 = this.f19422c;
                        if (i10 == 0) {
                            y.b(obj);
                            H0 h02 = this.f19424e;
                            L0 l02 = this.f19425f;
                            this.f19422c = 1;
                            if (((G0) this.f19423d).a(h02, l02, this) == f10) {
                                return f10;
                            }
                        } else if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            y.b(obj);
                        }
                        throw new C16820k();
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                c(C5091c0 c0Var, H0 h02, L0 l02, C17164e<? super c> eVar) {
                    super(2, eVar);
                    this.f19418d = c0Var;
                    this.f19419e = h02;
                    this.f19420f = l02;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new c(this.f19418d, this.f19419e, this.f19420f, eVar);
                }

                /* renamed from: i */
                public final Object invoke(C16807N n10, C17164e<?> eVar) {
                    return ((c) create(n10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f19417c;
                    if (i10 == 0) {
                        y.b(obj);
                        C16532g r10 = p1.r(new C0302a(this.f19418d));
                        C0303b bVar = new C0303b(this.f19419e, this.f19420f, (C17164e<? super C0303b>) null);
                        this.f19417c = 1;
                        if (C16534i.j(r10, bVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        y.b(obj);
                    }
                    throw new IllegalStateException("Interceptors flow should never terminate.");
                }
            }

            a(L0 l02, AtomicReference atomicReference, C5091c0 c0Var) {
                this.f19410b = l02;
                this.f19411c = atomicReference;
                this.f19412d = c0Var;
                this.f19409a = l02;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(androidx.compose.ui.platform.H0 r9, dI.C17164e<?> r10) {
                /*
                    r8 = this;
                    boolean r0 = r10 instanceof androidx.compose.ui.platform.C5091c0.b.a.C0300a
                    if (r0 == 0) goto L_0x0013
                    r0 = r10
                    androidx.compose.ui.platform.c0$b$a$a r0 = (androidx.compose.ui.platform.C5091c0.b.a.C0300a) r0
                    int r1 = r0.f19415e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f19415e = r1
                    goto L_0x0018
                L_0x0013:
                    androidx.compose.ui.platform.c0$b$a$a r0 = new androidx.compose.ui.platform.c0$b$a$a
                    r0.<init>(r8, r10)
                L_0x0018:
                    java.lang.Object r10 = r0.f19413c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f19415e
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 == r3) goto L_0x002d
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L_0x002d:
                    XH.y.b(r10)
                    goto L_0x004b
                L_0x0031:
                    XH.y.b(r10)
                    java.util.concurrent.atomic.AtomicReference r10 = r8.f19411c
                    androidx.compose.ui.platform.c0$b$a$b r2 = androidx.compose.ui.platform.C5091c0.b.a.C0301b.f19416c
                    androidx.compose.ui.platform.c0$b$a$c r4 = new androidx.compose.ui.platform.c0$b$a$c
                    androidx.compose.ui.platform.c0 r5 = r8.f19412d
                    androidx.compose.ui.platform.L0 r6 = r8.f19410b
                    r7 = 0
                    r4.<init>(r5, r9, r6, r7)
                    r0.f19415e = r3
                    java.lang.Object r9 = i1.l.d(r10, r2, r4, r0)
                    if (r9 != r1) goto L_0x004b
                    return r1
                L_0x004b:
                    XH.k r9 = new XH.k
                    r9.<init>()
                    throw r9
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5091c0.b.a.a(androidx.compose.ui.platform.H0, dI.e):java.lang.Object");
            }

            public View c() {
                return this.f19409a.c();
            }

            public C17168i getCoroutineContext() {
                return this.f19409a.getCoroutineContext();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(p<? super L0, ? super C17164e<?>, ? extends Object> pVar, C5091c0 c0Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f19407e = pVar;
            this.f19408f = c0Var;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f19407e, this.f19408f, eVar);
            bVar.f19406d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(L0 l02, C17164e<?> eVar) {
            return ((b) create(l02, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f19405c;
            if (i10 == 0) {
                y.b(obj);
                a aVar = new a((L0) this.f19406d, i1.l.a(), this.f19408f);
                p<L0, C17164e<?>, Object> pVar = this.f19407e;
                this.f19405c = 1;
                if (pVar.invoke(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                y.b(obj);
            }
            throw new C16820k();
        }
    }

    /* access modifiers changed from: private */
    public final G0 b() {
        return (G0) this.f19401b.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(G1.m0 r6, nI.p<? super androidx.compose.ui.platform.L0, ? super dI.C17164e<?>, ? extends java.lang.Object> r7, dI.C17164e<?> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.ui.platform.C5091c0.a
            if (r0 == 0) goto L_0x0013
            r0 = r8
            androidx.compose.ui.platform.c0$a r0 = (androidx.compose.ui.platform.C5091c0.a) r0
            int r1 = r0.f19404e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f19404e = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.ui.platform.c0$a r0 = new androidx.compose.ui.platform.c0$a
            r0.<init>(r5, r8)
        L_0x0018:
            java.lang.Object r8 = r0.f19402c
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f19404e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x002d:
            XH.y.b(r8)
            goto L_0x0045
        L_0x0031:
            XH.y.b(r8)
            androidx.compose.ui.platform.c0 r8 = r5.f19400a
            androidx.compose.ui.platform.c0$b r2 = new androidx.compose.ui.platform.c0$b
            r4 = 0
            r2.<init>(r7, r5, r4)
            r0.f19404e = r3
            java.lang.Object r6 = androidx.compose.ui.platform.J0.c(r6, r8, r2, r0)
            if (r6 != r1) goto L_0x0045
            return r1
        L_0x0045:
            XH.k r6 = new XH.k
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.C5091c0.c(G1.m0, nI.p, dI.e):java.lang.Object");
    }
}
