package Ny;

import FB.C12860a;
import Ry.f;
import TJ.C16532g;
import TJ.C16533h;
import XH.C16807N;
import XH.x;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"LNy/n;", "", "LRy/f;", "scanAndGoCartRepositoryFactory", "LFB/a;", "localStoreSelectionRepository", "<init>", "(LRy/f;LFB/a;)V", "", "familyCardId", "LXH/x;", "LXH/N;", "b", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "a", "LRy/f;", "LFB/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final f f112654a;

    /* renamed from: b  reason: collision with root package name */
    private final C12860a f112655b;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.SyncCartUseCase", f = "SyncCartUseCase.kt", l = {31}, m = "invoke-gIAlu-s")
    static final class a extends d {

        /* renamed from: c  reason: collision with root package name */
        Object f112656c;

        /* renamed from: d  reason: collision with root package name */
        Object f112657d;

        /* renamed from: e  reason: collision with root package name */
        Object f112658e;

        /* renamed from: f  reason: collision with root package name */
        Object f112659f;

        /* renamed from: g  reason: collision with root package name */
        Object f112660g;

        /* renamed from: h  reason: collision with root package name */
        int f112661h;

        /* renamed from: i  reason: collision with root package name */
        int f112662i;

        /* renamed from: j  reason: collision with root package name */
        int f112663j;

        /* renamed from: k  reason: collision with root package name */
        /* synthetic */ Object f112664k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ n f112665l;

        /* renamed from: m  reason: collision with root package name */
        int f112666m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(n nVar, C17164e<? super a> eVar) {
            super(eVar);
            this.f112665l = nVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f112664k = obj;
            this.f112666m |= Integer.MIN_VALUE;
            Object b10 = this.f112665l.b((String) null, this);
            return b10 == C17187b.f() ? b10 : x.a(b10);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f112667a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f112668a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.SyncCartUseCase$invoke-gIAlu-s$$inlined$map$1$2", f = "SyncCartUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Ny.n$b$a$a  reason: collision with other inner class name */
            public static final class C2776a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f112669c;

                /* renamed from: d  reason: collision with root package name */
                int f112670d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f112671e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2776a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f112671e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f112669c = obj;
                    this.f112670d |= Integer.MIN_VALUE;
                    return this.f112671e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f112668a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof Ny.n.b.a.C2776a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    Ny.n$b$a$a r0 = (Ny.n.b.a.C2776a) r0
                    int r1 = r0.f112670d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f112670d = r1
                    goto L_0x0018
                L_0x0013:
                    Ny.n$b$a$a r0 = new Ny.n$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f112669c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f112670d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f112668a
                    EB.d r5 = (EB.C12832d) r5
                    java.lang.String r5 = r5.e()
                    r0.f112670d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: Ny.n.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f112667a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f112667a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements C16532g<x<? extends C16807N>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f112672a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f112673b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f112674c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f112675a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ n f112676b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f112677c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.scanandgo.cart.impl.usecase.SyncCartUseCase$invoke-gIAlu-s$$inlined$map$2$2", f = "SyncCartUseCase.kt", l = {51, 50}, m = "emit")
            /* renamed from: Ny.n$c$a$a  reason: collision with other inner class name */
            public static final class C2777a extends d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f112678c;

                /* renamed from: d  reason: collision with root package name */
                int f112679d;

                /* renamed from: e  reason: collision with root package name */
                Object f112680e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ a f112681f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2777a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f112681f = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f112678c = obj;
                    this.f112679d |= Integer.MIN_VALUE;
                    return this.f112681f.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, n nVar, String str) {
                this.f112675a = hVar;
                this.f112676b = nVar;
                this.f112677c = str;
            }

            /* JADX WARNING: Removed duplicated region for block: B:14:0x0042  */
            /* JADX WARNING: Removed duplicated region for block: B:20:0x0072 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof Ny.n.c.a.C2777a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    Ny.n$c$a$a r0 = (Ny.n.c.a.C2777a) r0
                    int r1 = r0.f112679d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f112679d = r1
                    goto L_0x0018
                L_0x0013:
                    Ny.n$c$a$a r0 = new Ny.n$c$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f112678c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f112679d
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L_0x0042
                    if (r2 == r4) goto L_0x0034
                    if (r2 != r3) goto L_0x002c
                    XH.y.b(r9)
                    goto L_0x0073
                L_0x002c:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0034:
                    java.lang.Object r8 = r0.f112680e
                    TJ.h r8 = (TJ.C16533h) r8
                    XH.y.b(r9)
                    XH.x r9 = (XH.x) r9
                    java.lang.Object r9 = r9.j()
                    goto L_0x0063
                L_0x0042:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f112675a
                    java.lang.String r8 = (java.lang.String) r8
                    Ny.n r2 = r7.f112676b
                    Ry.f r2 = r2.f112654a
                    Ry.e r2 = r2.invoke()
                    java.lang.String r5 = r7.f112677c
                    r0.f112680e = r9
                    r0.f112679d = r4
                    java.lang.Object r8 = r2.r(r8, r5, r0)
                    if (r8 != r1) goto L_0x0060
                    return r1
                L_0x0060:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L_0x0063:
                    XH.x r9 = XH.x.a(r9)
                    r2 = 0
                    r0.f112680e = r2
                    r0.f112679d = r3
                    java.lang.Object r8 = r8.emit(r9, r0)
                    if (r8 != r1) goto L_0x0073
                    return r1
                L_0x0073:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: Ny.n.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, n nVar, String str) {
            this.f112672a = gVar;
            this.f112673b = nVar;
            this.f112674c = str;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f112672a.collect(new a(hVar, this.f112673b, this.f112674c), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public n(f fVar, C12860a aVar) {
        C17542s.j(fVar, "scanAndGoCartRepositoryFactory");
        C17542s.j(aVar, "localStoreSelectionRepository");
        this.f112654a = fVar;
        this.f112655b = aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(java.lang.String r6, dI.C17164e<? super XH.x<XH.C16807N>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof Ny.n.a
            if (r0 == 0) goto L_0x0013
            r0 = r7
            Ny.n$a r0 = (Ny.n.a) r0
            int r1 = r0.f112666m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f112666m = r1
            goto L_0x0018
        L_0x0013:
            Ny.n$a r0 = new Ny.n$a
            r0.<init>(r5, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f112664k
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f112666m
            r4 = 1
            if (r3 == 0) goto L_0x0045
            if (r3 != r4) goto L_0x003d
            java.lang.Object r6 = r0.f112660g
            TJ.g r6 = (TJ.C16532g) r6
            java.lang.Object r6 = r0.f112659f
            TJ.g r6 = (TJ.C16532g) r6
            java.lang.Object r6 = r0.f112658e
            dI.e r6 = (dI.C17164e) r6
            java.lang.Object r6 = r0.f112657d
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r6 = r0.f112656c
            Ny.n r6 = (Ny.n) r6
            XH.y.b(r1)
            goto L_0x007a
        L_0x003d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0045:
            XH.y.b(r1)
            FB.a r1 = r5.f112655b
            TJ.g r1 = r1.b()
            TJ.g r1 = TJ.C16534i.A(r1)
            Ny.n$b r3 = new Ny.n$b
            r3.<init>(r1)
            TJ.g r1 = TJ.C16534i.e0(r3, r4)
            Ny.n$c r3 = new Ny.n$c
            r3.<init>(r1, r5, r6)
            r0.f112656c = r5
            r0.f112657d = r6
            r0.f112658e = r7
            r0.f112659f = r1
            r0.f112660g = r1
            r6 = 0
            r0.f112661h = r6
            r0.f112662i = r6
            r0.f112663j = r6
            r0.f112666m = r4
            java.lang.Object r1 = TJ.C16534i.B(r3, r0)
            if (r1 != r2) goto L_0x007a
            return r2
        L_0x007a:
            XH.x r1 = (XH.x) r1
            java.lang.Object r6 = r1.j()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: Ny.n.b(java.lang.String, dI.e):java.lang.Object");
    }
}
