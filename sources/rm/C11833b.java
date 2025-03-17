package rm;

import QJ.Q;
import TJ.C16532g;
import TJ.C16533h;
import W2.f;
import W2.h;
import XH.C16807N;
import XH.C16814e;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0017B\u0019\b\u0007\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\r\u001a\u00020\u000b2\"\u0010\f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0007H@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fH@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000fH@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lrm/b;", "Lrm/a;", "LR2/h;", "LW2/f;", "dataStore", "<init>", "(LR2/h;)V", "Lkotlin/Function2;", "LW2/c;", "LdI/e;", "LXH/N;", "", "transform", "f", "(LnI/p;LdI/e;)Ljava/lang/Object;", "", "e", "(LdI/e;)Ljava/lang/Object;", "value", "g", "(ZLdI/e;)Ljava/lang/Object;", "b", "()Z", "a", "(Z)V", "LR2/h;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rm.b  reason: case insensitive filesystem */
public final class C11833b implements C11832a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f102032b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f102033c = 8;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final f.a<Boolean> f102034d = h.a("ExplanationAcknowledgement");

    /* renamed from: a  reason: collision with root package name */
    private final R2.h<W2.f> f102035a;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lrm/b$a;", "", "<init>", "()V", "LW2/f$a;", "", "explanationDialogKey", "LW2/f$a;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rm.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: rm.b$b  reason: collision with other inner class name */
    public static final class C2423b implements C16532g<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f102036a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: rm.b$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f102037a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.repository.storage.BackInStockDataStoreImpl$hasExplanationDialogBeenShown$$inlined$map$1$2", f = "BackInStockDataStore.kt", l = {50}, m = "emit")
            /* renamed from: rm.b$b$a$a  reason: collision with other inner class name */
            public static final class C2424a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f102038c;

                /* renamed from: d  reason: collision with root package name */
                int f102039d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f102040e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2424a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f102040e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f102038c = obj;
                    this.f102039d |= Integer.MIN_VALUE;
                    return this.f102040e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f102037a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof rm.C11833b.C2423b.a.C2424a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    rm.b$b$a$a r0 = (rm.C11833b.C2423b.a.C2424a) r0
                    int r1 = r0.f102039d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f102039d = r1
                    goto L_0x0018
                L_0x0013:
                    rm.b$b$a$a r0 = new rm.b$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f102038c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f102039d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f102037a
                    W2.f r5 = (W2.f) r5
                    W2.f$a r2 = rm.C11833b.f102034d
                    java.lang.Object r5 = r5.b(r2)
                    r0.f102039d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: rm.C11833b.C2423b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public C2423b(C16532g gVar) {
            this.f102036a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f102036a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.repository.storage.BackInStockDataStoreImpl", f = "BackInStockDataStore.kt", l = {39}, m = "hasExplanationDialogBeenShown")
    /* renamed from: rm.b$c */
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f102041c;

        /* renamed from: d  reason: collision with root package name */
        Object f102042d;

        /* renamed from: e  reason: collision with root package name */
        Object f102043e;

        /* renamed from: f  reason: collision with root package name */
        Object f102044f;

        /* renamed from: g  reason: collision with root package name */
        int f102045g;

        /* renamed from: h  reason: collision with root package name */
        int f102046h;

        /* renamed from: i  reason: collision with root package name */
        int f102047i;

        /* renamed from: j  reason: collision with root package name */
        /* synthetic */ Object f102048j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C11833b f102049k;

        /* renamed from: l  reason: collision with root package name */
        int f102050l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C11833b bVar, C17164e<? super c> eVar) {
            super(eVar);
            this.f102049k = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f102048j = obj;
            this.f102050l |= Integer.MIN_VALUE;
            return this.f102049k.e(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "", "<anonymous>", "(LQJ/Q;)Z"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.repository.storage.BackInStockDataStoreImpl$hasExplanationDialogBeenShownLegacy$1", f = "BackInStockDataStore.kt", l = {47}, m = "invokeSuspend")
    /* renamed from: rm.b$d */
    static final class d extends l implements p<Q, C17164e<? super Boolean>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102051c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11833b f102052d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C11833b bVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f102052d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f102052d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super Boolean> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f102051c;
            if (i10 == 0) {
                y.b(obj);
                C11833b bVar = this.f102052d;
                this.f102051c = 1;
                obj = bVar.e(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.repository.storage.BackInStockDataStoreImpl", f = "BackInStockDataStore.kt", l = {56}, m = "safeEdit")
    /* renamed from: rm.b$e */
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f102053c;

        /* renamed from: d  reason: collision with root package name */
        Object f102054d;

        /* renamed from: e  reason: collision with root package name */
        Object f102055e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f102056f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11833b f102057g;

        /* renamed from: h  reason: collision with root package name */
        int f102058h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C11833b bVar, C17164e<? super e> eVar) {
            super(eVar);
            this.f102057g = bVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f102056f = obj;
            this.f102058h |= Integer.MIN_VALUE;
            return this.f102057g.f((p<? super W2.c, ? super C17164e<? super C16807N>, ? extends Object>) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LW2/c;", "preferences", "LXH/N;", "<anonymous>", "(LW2/c;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.repository.storage.BackInStockDataStoreImpl$setExplanationDialogBeenShown$2", f = "BackInStockDataStore.kt", l = {}, m = "invokeSuspend")
    /* renamed from: rm.b$f */
    static final class f extends l implements p<W2.c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102059c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f102060d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f102061e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(boolean z10, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f102061e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f102061e, eVar);
            fVar.f102060d = obj;
            return fVar;
        }

        public final Object invoke(W2.c cVar, C17164e<? super C16807N> eVar) {
            return ((f) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f102059c == 0) {
                y.b(obj);
                ((W2.c) this.f102060d).j(C11833b.f102034d, b.a(this.f102061e));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.backinstock.notification.repository.storage.BackInStockDataStoreImpl$setExplanationDialogBeenShownLegacy$1", f = "BackInStockDataStore.kt", l = {51}, m = "invokeSuspend")
    /* renamed from: rm.b$g */
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102062c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C11833b f102063d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f102064e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(C11833b bVar, boolean z10, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f102063d = bVar;
            this.f102064e = z10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f102063d, this.f102064e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f102062c;
            if (i10 == 0) {
                y.b(obj);
                C11833b bVar = this.f102063d;
                boolean z10 = this.f102064e;
                this.f102062c = 1;
                if (bVar.g(z10, this) == f10) {
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

    public C11833b(R2.h<W2.f> hVar) {
        C17542s.j(hVar, "dataStore");
        this.f102035a = hVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object f(nI.p<? super W2.c, ? super dI.C17164e<? super XH.C16807N>, ? extends java.lang.Object> r13, dI.C17164e<java.lang.Object> r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof rm.C11833b.e
            if (r0 == 0) goto L_0x0013
            r0 = r14
            rm.b$e r0 = (rm.C11833b.e) r0
            int r1 = r0.f102058h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f102058h = r1
            goto L_0x0018
        L_0x0013:
            rm.b$e r0 = new rm.b$e
            r0.<init>(r12, r14)
        L_0x0018:
            java.lang.Object r1 = r0.f102056f
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f102058h
            r4 = 1
            if (r3 == 0) goto L_0x0040
            if (r3 != r4) goto L_0x0038
            java.lang.Object r13 = r0.f102055e
            dI.e r13 = (dI.C17164e) r13
            java.lang.Object r13 = r0.f102054d
            nI.p r13 = (nI.p) r13
            java.lang.Object r13 = r0.f102053c
            rm.b r13 = (rm.C11833b) r13
            XH.y.b(r1)     // Catch:{ IOException -> 0x0036 }
            goto L_0x0101
        L_0x0036:
            r14 = move-exception
            goto L_0x0056
        L_0x0038:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0040:
            XH.y.b(r1)
            R2.h<W2.f> r1 = r12.f102035a     // Catch:{ IOException -> 0x0054 }
            r0.f102053c = r12     // Catch:{ IOException -> 0x0054 }
            r0.f102054d = r13     // Catch:{ IOException -> 0x0054 }
            r0.f102055e = r14     // Catch:{ IOException -> 0x0054 }
            r0.f102058h = r4     // Catch:{ IOException -> 0x0054 }
            java.lang.Object r1 = W2.i.a(r1, r13, r0)     // Catch:{ IOException -> 0x0054 }
            if (r1 != r2) goto L_0x0101
            return r2
        L_0x0054:
            r14 = move-exception
            r13 = r12
        L_0x0056:
            qv.e r0 = qv.e.WARN
            qv.d r1 = qv.d.f102012a
            java.util.List r1 = r1.a()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0069:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0081
            java.lang.Object r3 = r1.next()
            r5 = r3
            qv.b r5 = (qv.C11819b) r5
            r6 = 0
            boolean r5 = r5.b(r0, r6)
            if (r5 == 0) goto L_0x0069
            r2.add(r3)
            goto L_0x0069
        L_0x0081:
            java.util.Iterator r1 = r2.iterator()
            r2 = 0
            r3 = r2
            r5 = r3
        L_0x0088:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00ff
            java.lang.Object r6 = r1.next()
            qv.b r6 = (qv.C11819b) r6
            if (r3 != 0) goto L_0x00a3
            java.lang.String r3 = "Failed to edit DataStore"
            java.lang.String r3 = qv.C11818a.a(r3, r14)
            if (r3 != 0) goto L_0x009f
            goto L_0x00ff
        L_0x009f:
            java.lang.String r3 = qv.C11820c.a(r3)
        L_0x00a3:
            if (r5 != 0) goto L_0x00f3
            java.lang.Class r5 = r13.getClass()
            java.lang.String r5 = r5.getName()
            kotlin.jvm.internal.C17542s.g(r5)
            r7 = 36
            r8 = 2
            java.lang.String r7 = HJ.C15854t.s1(r5, r7, r2, r8, r2)
            r9 = 46
            java.lang.String r7 = HJ.C15854t.o1(r7, r9, r2, r8, r2)
            int r8 = r7.length()
            if (r8 != 0) goto L_0x00c4
            goto L_0x00ca
        L_0x00c4:
            java.lang.String r5 = "Kt"
            java.lang.String r5 = HJ.C15854t.P0(r7, r5)
        L_0x00ca:
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "main"
            boolean r7 = HJ.C15854t.b0(r7, r8, r4)
            if (r7 == 0) goto L_0x00dd
            java.lang.String r7 = "m"
            goto L_0x00df
        L_0x00dd:
            java.lang.String r7 = "b"
        L_0x00df:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = "|"
            r8.append(r7)
            r8.append(r5)
            java.lang.String r5 = r8.toString()
        L_0x00f3:
            r11 = r5
            r8 = 0
            r5 = r6
            r6 = r0
            r7 = r11
            r9 = r14
            r10 = r3
            r5.a(r6, r7, r8, r9, r10)
            r5 = r11
            goto L_0x0088
        L_0x00ff:
            XH.N r1 = XH.C16807N.f139792a
        L_0x0101:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.C11833b.f(nI.p, dI.e):java.lang.Object");
    }

    @C16814e
    public void a(boolean z10) {
        Object unused = C16312j.b((C17168i) null, new g(this, z10, (C17164e<? super g>) null), 1, (Object) null);
    }

    @C16814e
    public boolean b() {
        return ((Boolean) C16312j.b((C17168i) null, new d(this, (C17164e<? super d>) null), 1, (Object) null)).booleanValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object e(dI.C17164e<? super java.lang.Boolean> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof rm.C11833b.c
            if (r0 == 0) goto L_0x0013
            r0 = r7
            rm.b$c r0 = (rm.C11833b.c) r0
            int r1 = r0.f102050l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f102050l = r1
            goto L_0x0018
        L_0x0013:
            rm.b$c r0 = new rm.b$c
            r0.<init>(r6, r7)
        L_0x0018:
            java.lang.Object r1 = r0.f102048j
            java.lang.Object r2 = eI.C17187b.f()
            int r3 = r0.f102050l
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0042
            if (r3 != r4) goto L_0x003a
            java.lang.Object r7 = r0.f102044f
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f102043e
            TJ.g r7 = (TJ.C16532g) r7
            java.lang.Object r7 = r0.f102042d
            dI.e r7 = (dI.C17164e) r7
            java.lang.Object r7 = r0.f102041c
            rm.b r7 = (rm.C11833b) r7
            XH.y.b(r1)
            goto L_0x0067
        L_0x003a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0042:
            XH.y.b(r1)
            R2.h<W2.f> r1 = r6.f102035a
            TJ.g r1 = r1.getData()
            rm.b$b r3 = new rm.b$b
            r3.<init>(r1)
            r0.f102041c = r6
            r0.f102042d = r7
            r0.f102043e = r1
            r0.f102044f = r1
            r0.f102045g = r5
            r0.f102046h = r5
            r0.f102047i = r5
            r0.f102050l = r4
            java.lang.Object r1 = TJ.C16534i.D(r3, r0)
            if (r1 != r2) goto L_0x0067
            return r2
        L_0x0067:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x006f
            boolean r5 = r1.booleanValue()
        L_0x006f:
            java.lang.Boolean r7 = kotlin.coroutines.jvm.internal.b.a(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rm.C11833b.e(dI.e):java.lang.Object");
    }

    public Object g(boolean z10, C17164e<? super C16807N> eVar) {
        Object f10 = f(new f(z10, (C17164e<? super f>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }
}
