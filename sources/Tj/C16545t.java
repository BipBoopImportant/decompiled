package TJ;

import QJ.F0;
import XH.C16807N;
import dI.C17164e;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.q;
import nI.r;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aS\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012.\u0010\b\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0002¢\u0006\u0004\b\t\u0010\n\u001aY\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000124\u0010\u000e\u001a0\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H@¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001b\u0010\u0016\u001a\u00020\r*\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u0019\u001a\u00020\r*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"T", "LTJ/g;", "Lkotlin/Function3;", "LTJ/h;", "", "LdI/e;", "LXH/N;", "", "action", "a", "(LTJ/g;LnI/q;)LTJ/g;", "Lkotlin/Function4;", "", "", "predicate", "e", "(LTJ/g;LnI/r;)LTJ/g;", "collector", "b", "(LTJ/g;LTJ/h;LdI/e;)Ljava/lang/Object;", "LdI/i;", "coroutineContext", "c", "(Ljava/lang/Throwable;LdI/i;)Z", "other", "d", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Z", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.t  reason: case insensitive filesystem */
final /* synthetic */ class C16545t {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TJ/t$a", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.t$a */
    public static final class a implements C16532g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f138705a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ q f138706b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {109, 110}, m = "collect")
        /* renamed from: TJ.t$a$a  reason: collision with other inner class name */
        public static final class C3391a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f138707c;

            /* renamed from: d  reason: collision with root package name */
            int f138708d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ a f138709e;

            /* renamed from: f  reason: collision with root package name */
            Object f138710f;

            /* renamed from: g  reason: collision with root package name */
            Object f138711g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C3391a(a aVar, C17164e eVar) {
                super(eVar);
                this.f138709e = aVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138707c = obj;
                this.f138708d |= Integer.MIN_VALUE;
                return this.f138709e.collect((C16533h) null, this);
            }
        }

        public a(C16532g gVar, q qVar) {
            this.f138705a = gVar;
            this.f138706b = qVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(TJ.C16533h<? super T> r6, dI.C17164e<? super XH.C16807N> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof TJ.C16545t.a.C3391a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                TJ.t$a$a r0 = (TJ.C16545t.a.C3391a) r0
                int r1 = r0.f138708d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138708d = r1
                goto L_0x0018
            L_0x0013:
                TJ.t$a$a r0 = new TJ.t$a$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f138707c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138708d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0040
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                XH.y.b(r7)
                goto L_0x006f
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                java.lang.Object r6 = r0.f138711g
                TJ.h r6 = (TJ.C16533h) r6
                java.lang.Object r2 = r0.f138710f
                TJ.t$a r2 = (TJ.C16545t.a) r2
                XH.y.b(r7)
                goto L_0x0053
            L_0x0040:
                XH.y.b(r7)
                TJ.g r7 = r5.f138705a
                r0.f138710f = r5
                r0.f138711g = r6
                r0.f138708d = r4
                java.lang.Object r7 = TJ.C16534i.h(r7, r6, r0)
                if (r7 != r1) goto L_0x0052
                return r1
            L_0x0052:
                r2 = r5
            L_0x0053:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L_0x006f
                nI.q r2 = r2.f138706b
                r4 = 0
                r0.f138710f = r4
                r0.f138711g = r4
                r0.f138708d = r3
                r3 = 6
                kotlin.jvm.internal.C17541q.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.C17541q.c(r7)
                if (r6 != r1) goto L_0x006f
                return r1
            L_0x006f:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16545t.a.collect(TJ.h, dI.e):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", f = "Errors.kt", l = {152}, m = "catchImpl")
    /* renamed from: TJ.t$b */
    static final class b<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f138712c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f138713d;

        /* renamed from: e  reason: collision with root package name */
        int f138714e;

        b(C17164e<? super b> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f138713d = obj;
            this.f138714e |= Integer.MIN_VALUE;
            return C16534i.h((C16532g) null, (C16533h) null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.t$c */
    static final class c<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16533h<T> f138715a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ O<Throwable> f138716b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2", f = "Errors.kt", l = {154}, m = "emit")
        /* renamed from: TJ.t$c$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f138717c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f138718d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ c<T> f138719e;

            /* renamed from: f  reason: collision with root package name */
            int f138720f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(c<? super T> cVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f138719e = cVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138718d = obj;
                this.f138720f |= Integer.MIN_VALUE;
                return this.f138719e.emit(null, this);
            }
        }

        c(C16533h<? super T> hVar, O<Throwable> o10) {
            this.f138715a = hVar;
            this.f138716b = o10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r5, dI.C17164e<? super XH.C16807N> r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof TJ.C16545t.c.a
                if (r0 == 0) goto L_0x0013
                r0 = r6
                TJ.t$c$a r0 = (TJ.C16545t.c.a) r0
                int r1 = r0.f138720f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138720f = r1
                goto L_0x0018
            L_0x0013:
                TJ.t$c$a r0 = new TJ.t$c$a
                r0.<init>(r4, r6)
            L_0x0018:
                java.lang.Object r6 = r0.f138718d
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138720f
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r5 = r0.f138717c
                TJ.t$c r5 = (TJ.C16545t.c) r5
                XH.y.b(r6)     // Catch:{ all -> 0x002d }
                goto L_0x0047
            L_0x002d:
                r6 = move-exception
                goto L_0x004c
            L_0x002f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L_0x0037:
                XH.y.b(r6)
                TJ.h<T> r6 = r4.f138715a     // Catch:{ all -> 0x004a }
                r0.f138717c = r4     // Catch:{ all -> 0x004a }
                r0.f138720f = r3     // Catch:{ all -> 0x004a }
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch:{ all -> 0x004a }
                if (r5 != r1) goto L_0x0047
                return r1
            L_0x0047:
                XH.N r5 = XH.C16807N.f139792a
                return r5
            L_0x004a:
                r6 = move-exception
                r5 = r4
            L_0x004c:
                kotlin.jvm.internal.O<java.lang.Throwable> r5 = r5.f138716b
                r5.f144348a = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16545t.c.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TJ/t$d", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.t$d */
    public static final class d implements C16532g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f138721a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f138722b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @f(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {113, 115}, m = "collect")
        /* renamed from: TJ.t$d$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f138723c;

            /* renamed from: d  reason: collision with root package name */
            int f138724d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f138725e;

            /* renamed from: f  reason: collision with root package name */
            Object f138726f;

            /* renamed from: g  reason: collision with root package name */
            Object f138727g;

            /* renamed from: h  reason: collision with root package name */
            Object f138728h;

            /* renamed from: i  reason: collision with root package name */
            long f138729i;

            /* renamed from: j  reason: collision with root package name */
            int f138730j;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(d dVar, C17164e eVar) {
                super(eVar);
                this.f138725e = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138723c = obj;
                this.f138724d |= Integer.MIN_VALUE;
                return this.f138725e.collect((C16533h) null, this);
            }
        }

        public d(C16532g gVar, r rVar) {
            this.f138721a = gVar;
            this.f138722b = rVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x006f  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x00a2  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ae  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(TJ.C16533h<? super T> r12, dI.C17164e<? super XH.C16807N> r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof TJ.C16545t.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r13
                TJ.t$d$a r0 = (TJ.C16545t.d.a) r0
                int r1 = r0.f138724d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138724d = r1
                goto L_0x0018
            L_0x0013:
                TJ.t$d$a r0 = new TJ.t$d$a
                r0.<init>(r11, r13)
            L_0x0018:
                java.lang.Object r13 = r0.f138723c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138724d
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0052
                if (r2 == r4) goto L_0x0042
                if (r2 != r3) goto L_0x003a
                long r5 = r0.f138729i
                java.lang.Object r12 = r0.f138728h
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f138727g
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r7 = r0.f138726f
                TJ.t$d r7 = (TJ.C16545t.d) r7
                XH.y.b(r13)
                goto L_0x009a
            L_0x003a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0042:
                int r12 = r0.f138730j
                long r5 = r0.f138729i
                java.lang.Object r2 = r0.f138727g
                TJ.h r2 = (TJ.C16533h) r2
                java.lang.Object r7 = r0.f138726f
                TJ.t$d r7 = (TJ.C16545t.d) r7
                XH.y.b(r13)
                goto L_0x0074
            L_0x0052:
                XH.y.b(r13)
                r5 = 0
                r13 = r11
            L_0x0058:
                TJ.g r2 = r13.f138721a
                r0.f138726f = r13
                r0.f138727g = r12
                r7 = 0
                r0.f138728h = r7
                r0.f138729i = r5
                r7 = 0
                r0.f138730j = r7
                r0.f138724d = r4
                java.lang.Object r2 = TJ.C16534i.h(r2, r12, r0)
                if (r2 != r1) goto L_0x006f
                return r1
            L_0x006f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L_0x0074:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto L_0x00a6
                nI.r r12 = r7.f138722b
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.b.f(r5)
                r0.f138726f = r7
                r0.f138727g = r2
                r0.f138728h = r13
                r0.f138729i = r5
                r0.f138724d = r3
                r9 = 6
                kotlin.jvm.internal.C17541q.c(r9)
                java.lang.Object r12 = r12.l(r2, r13, r8, r0)
                r8 = 7
                kotlin.jvm.internal.C17541q.c(r8)
                if (r12 != r1) goto L_0x0097
                return r1
            L_0x0097:
                r10 = r13
                r13 = r12
                r12 = r10
            L_0x009a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L_0x00a8
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
            L_0x00a6:
                r13 = r7
                goto L_0x00a9
            L_0x00a8:
                throw r12
            L_0x00a9:
                if (r12 != 0) goto L_0x00ae
                XH.N r12 = XH.C16807N.f139792a
                return r12
            L_0x00ae:
                r12 = r2
                goto L_0x0058
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16545t.d.collect(TJ.h, dI.e):java.lang.Object");
        }
    }

    public static final <T> C16532g<T> a(C16532g<? extends T> gVar, q<? super C16533h<? super T>, ? super Throwable, ? super C17164e<? super C16807N>, ? extends Object> qVar) {
        return new a(gVar, qVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object b(TJ.C16532g<? extends T> r4, TJ.C16533h<? super T> r5, dI.C17164e<? super java.lang.Throwable> r6) {
        /*
            boolean r0 = r6 instanceof TJ.C16545t.b
            if (r0 == 0) goto L_0x0013
            r0 = r6
            TJ.t$b r0 = (TJ.C16545t.b) r0
            int r1 = r0.f138714e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138714e = r1
            goto L_0x0018
        L_0x0013:
            TJ.t$b r0 = new TJ.t$b
            r0.<init>(r6)
        L_0x0018:
            java.lang.Object r6 = r0.f138713d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138714e
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r4 = r0.f138712c
            kotlin.jvm.internal.O r4 = (kotlin.jvm.internal.O) r4
            XH.y.b(r6)     // Catch:{ all -> 0x002d }
            goto L_0x004f
        L_0x002d:
            r5 = move-exception
            goto L_0x0053
        L_0x002f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0037:
            XH.y.b(r6)
            kotlin.jvm.internal.O r6 = new kotlin.jvm.internal.O
            r6.<init>()
            TJ.t$c r2 = new TJ.t$c     // Catch:{ all -> 0x0051 }
            r2.<init>(r5, r6)     // Catch:{ all -> 0x0051 }
            r0.f138712c = r6     // Catch:{ all -> 0x0051 }
            r0.f138714e = r3     // Catch:{ all -> 0x0051 }
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch:{ all -> 0x0051 }
            if (r4 != r1) goto L_0x004f
            return r1
        L_0x004f:
            r4 = 0
            return r4
        L_0x0051:
            r5 = move-exception
            r4 = r6
        L_0x0053:
            T r4 = r4.f144348a
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L_0x0076
            dI.i r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L_0x0076
            if (r4 != 0) goto L_0x006a
            return r5
        L_0x006a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L_0x0072
            XH.C16816g.a(r4, r5)
            throw r4
        L_0x0072:
            XH.C16816g.a(r5, r4)
            throw r5
        L_0x0076:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16545t.b(TJ.g, TJ.h, dI.e):java.lang.Object");
    }

    private static final boolean c(Throwable th2, C17168i iVar) {
        F0 f02 = (F0) iVar.get(F0.f137562d0);
        if (f02 == null || !f02.isCancelled()) {
            return false;
        }
        return d(th2, f02.x());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && C17542s.e(th3, th2);
    }

    public static final <T> C16532g<T> e(C16532g<? extends T> gVar, r<? super C16533h<? super T>, ? super Throwable, ? super Long, ? super C17164e<? super Boolean>, ? extends Object> rVar) {
        return new d(gVar, rVar);
    }
}
