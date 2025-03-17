package TJ;

import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.M;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001aG\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u000b\u0010\f\u001a+\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0005\u001a0\u0010\u0012\u001a\u00020\u0011\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\tH@¢\u0006\u0004\b\u0012\u0010\u0013\u001aG\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"T", "LTJ/g;", "", "count", "b", "(LTJ/g;I)LTJ/g;", "Lkotlin/Function2;", "LdI/e;", "", "", "predicate", "c", "(LTJ/g;LnI/p;)LTJ/g;", "e", "LTJ/h;", "value", "ownershipMarker", "LXH/N;", "d", "(LTJ/h;Ljava/lang/Object;Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "f", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.u  reason: case insensitive filesystem */
final /* synthetic */ class C16546u {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TJ/u$a", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.u$a */
    public static final class a implements C16532g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f138731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f138732b;

        public a(C16532g gVar, int i10) {
            this.f138731a = gVar;
            this.f138732b = i10;
        }

        public Object collect(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
            Object collect = this.f138731a.collect(new b(new M(), this.f138732b, hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.u$b */
    static final class b<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ M f138733a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f138734b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16533h<T> f138735c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$drop$2$1", f = "Limit.kt", l = {22}, m = "emit")
        /* renamed from: TJ.u$b$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f138736c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ b<T> f138737d;

            /* renamed from: e  reason: collision with root package name */
            int f138738e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(b<? super T> bVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f138737d = bVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138736c = obj;
                this.f138738e |= Integer.MIN_VALUE;
                return this.f138737d.emit(null, this);
            }
        }

        b(M m10, int i10, C16533h<? super T> hVar) {
            this.f138733a = m10;
            this.f138734b = i10;
            this.f138735c = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, dI.C17164e<? super XH.C16807N> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof TJ.C16546u.b.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                TJ.u$b$a r0 = (TJ.C16546u.b.a) r0
                int r1 = r0.f138738e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138738e = r1
                goto L_0x0018
            L_0x0013:
                TJ.u$b$a r0 = new TJ.u$b$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f138736c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138738e
                r3 = 1
                if (r2 == 0) goto L_0x0031
                if (r2 != r3) goto L_0x0029
                XH.y.b(r7)
                goto L_0x0047
            L_0x0029:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0031:
                XH.y.b(r7)
                kotlin.jvm.internal.M r7 = r5.f138733a
                int r2 = r7.f144346a
                int r4 = r5.f138734b
                if (r2 < r4) goto L_0x004a
                TJ.h<T> r7 = r5.f138735c
                r0.f138738e = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0047
                return r1
            L_0x0047:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x004a:
                int r2 = r2 + r3
                r7.f144346a = r2
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16546u.b.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TJ/u$c", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.u$c */
    public static final class c implements C16532g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f138739a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f138740b;

        public c(C16532g gVar, p pVar) {
            this.f138739a = gVar;
            this.f138740b = pVar;
        }

        public Object collect(C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
            Object collect = this.f138739a.collect(new d(new K(), hVar, this.f138740b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.u$d */
    static final class d<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f138741a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16533h<T> f138742b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<T, C17164e<? super Boolean>, Object> f138743c;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$1$1", f = "Limit.kt", l = {34, 35, 37}, m = "emit")
        /* renamed from: TJ.u$d$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f138744c;

            /* renamed from: d  reason: collision with root package name */
            Object f138745d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f138746e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ d<T> f138747f;

            /* renamed from: g  reason: collision with root package name */
            int f138748g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(d<? super T> dVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f138747f = dVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138746e = obj;
                this.f138748g |= Integer.MIN_VALUE;
                return this.f138747f.emit(null, this);
            }
        }

        d(K k10, C16533h<? super T> hVar, p<? super T, ? super C17164e<? super Boolean>, ? extends Object> pVar) {
            this.f138741a = k10;
            this.f138742b = hVar;
            this.f138743c = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r7, dI.C17164e<? super XH.C16807N> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof TJ.C16546u.d.a
                if (r0 == 0) goto L_0x0013
                r0 = r8
                TJ.u$d$a r0 = (TJ.C16546u.d.a) r0
                int r1 = r0.f138748g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138748g = r1
                goto L_0x0018
            L_0x0013:
                TJ.u$d$a r0 = new TJ.u$d$a
                r0.<init>(r6, r8)
            L_0x0018:
                java.lang.Object r8 = r0.f138746e
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138748g
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L_0x0045
                if (r2 == r5) goto L_0x0041
                if (r2 == r4) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                XH.y.b(r8)
                goto L_0x0088
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                java.lang.Object r7 = r0.f138745d
                java.lang.Object r2 = r0.f138744c
                TJ.u$d r2 = (TJ.C16546u.d) r2
                XH.y.b(r8)
                goto L_0x006c
            L_0x0041:
                XH.y.b(r8)
                goto L_0x0059
            L_0x0045:
                XH.y.b(r8)
                kotlin.jvm.internal.K r8 = r6.f138741a
                boolean r8 = r8.f144344a
                if (r8 == 0) goto L_0x005c
                TJ.h<T> r8 = r6.f138742b
                r0.f138748g = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0059
                return r1
            L_0x0059:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x005c:
                nI.p<T, dI.e<? super java.lang.Boolean>, java.lang.Object> r8 = r6.f138743c
                r0.f138744c = r6
                r0.f138745d = r7
                r0.f138748g = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L_0x006b
                return r1
            L_0x006b:
                r2 = r6
            L_0x006c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L_0x008b
                kotlin.jvm.internal.K r8 = r2.f138741a
                r8.f144344a = r5
                TJ.h<T> r8 = r2.f138742b
                r2 = 0
                r0.f138744c = r2
                r0.f138745d = r2
                r0.f138748g = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L_0x0088
                return r1
            L_0x0088:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            L_0x008b:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16546u.d.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {71}, m = "emitAbort$FlowKt__LimitKt")
    /* renamed from: TJ.u$e */
    static final class e<T> extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f138749c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f138750d;

        /* renamed from: e  reason: collision with root package name */
        int f138751e;

        e(C17164e<? super e> eVar) {
            super(eVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f138750d = obj;
            this.f138751e |= Integer.MIN_VALUE;
            return C16546u.d((C16533h) null, null, (Object) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TJ/u$f", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.u$f */
    public static final class f implements C16532g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f138752a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f138753b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1", f = "Limit.kt", l = {112}, m = "collect")
        /* renamed from: TJ.u$f$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f138754c;

            /* renamed from: d  reason: collision with root package name */
            int f138755d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ f f138756e;

            /* renamed from: f  reason: collision with root package name */
            Object f138757f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(f fVar, C17164e eVar) {
                super(eVar);
                this.f138756e = fVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138754c = obj;
                this.f138755d |= Integer.MIN_VALUE;
                return this.f138756e.collect((C16533h) null, this);
            }
        }

        public f(C16532g gVar, int i10) {
            this.f138752a = gVar;
            this.f138753b = i10;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0035  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(TJ.C16533h<? super T> r9, dI.C17164e<? super XH.C16807N> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof TJ.C16546u.f.a
                if (r0 == 0) goto L_0x0013
                r0 = r10
                TJ.u$f$a r0 = (TJ.C16546u.f.a) r0
                int r1 = r0.f138755d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138755d = r1
                goto L_0x0018
            L_0x0013:
                TJ.u$f$a r0 = new TJ.u$f$a
                r0.<init>(r8, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f138754c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138755d
                r3 = 1
                if (r2 == 0) goto L_0x0035
                if (r2 != r3) goto L_0x002d
                java.lang.Object r9 = r0.f138757f
                XH.y.b(r10)     // Catch:{ a -> 0x002b }
                goto L_0x005d
            L_0x002b:
                r10 = move-exception
                goto L_0x005a
            L_0x002d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L_0x0035:
                XH.y.b(r10)
                java.lang.Object r10 = new java.lang.Object
                r10.<init>()
                kotlin.jvm.internal.M r2 = new kotlin.jvm.internal.M
                r2.<init>()
                TJ.g r4 = r8.f138752a     // Catch:{ a -> 0x0056 }
                TJ.u$g r5 = new TJ.u$g     // Catch:{ a -> 0x0056 }
                int r6 = r8.f138753b     // Catch:{ a -> 0x0056 }
                r5.<init>(r2, r6, r9, r10)     // Catch:{ a -> 0x0056 }
                r0.f138757f = r10     // Catch:{ a -> 0x0056 }
                r0.f138755d = r3     // Catch:{ a -> 0x0056 }
                java.lang.Object r9 = r4.collect(r5, r0)     // Catch:{ a -> 0x0056 }
                if (r9 != r1) goto L_0x005d
                return r1
            L_0x0056:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L_0x005a:
                UJ.C16623p.a(r10, r9)
            L_0x005d:
                XH.N r9 = XH.C16807N.f139792a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16546u.f.collect(TJ.h, dI.e):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.u$g */
    static final class g<T> implements C16533h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ M f138758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f138759b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16533h<T> f138760c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Object f138761d;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$take$2$1", f = "Limit.kt", l = {59, 61}, m = "emit")
        /* renamed from: TJ.u$g$a */
        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f138762c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ g<T> f138763d;

            /* renamed from: e  reason: collision with root package name */
            int f138764e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(g<? super T> gVar, C17164e<? super a> eVar) {
                super(eVar);
                this.f138763d = gVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138762c = obj;
                this.f138764e |= Integer.MIN_VALUE;
                return this.f138763d.emit(null, this);
            }
        }

        g(M m10, int i10, C16533h<? super T> hVar, Object obj) {
            this.f138758a = m10;
            this.f138759b = i10;
            this.f138760c = hVar;
            this.f138761d = obj;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object emit(T r6, dI.C17164e<? super XH.C16807N> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof TJ.C16546u.g.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                TJ.u$g$a r0 = (TJ.C16546u.g.a) r0
                int r1 = r0.f138764e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138764e = r1
                goto L_0x0018
            L_0x0013:
                TJ.u$g$a r0 = new TJ.u$g$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f138762c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138764e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0038
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                XH.y.b(r7)
                goto L_0x0061
            L_0x002c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0034:
                XH.y.b(r7)
                goto L_0x0051
            L_0x0038:
                XH.y.b(r7)
                kotlin.jvm.internal.M r7 = r5.f138758a
                int r2 = r7.f144346a
                int r2 = r2 + r4
                r7.f144346a = r2
                int r7 = r5.f138759b
                if (r2 >= r7) goto L_0x0054
                TJ.h<T> r7 = r5.f138760c
                r0.f138764e = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L_0x0051
                return r1
            L_0x0051:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            L_0x0054:
                TJ.h<T> r7 = r5.f138760c
                java.lang.Object r2 = r5.f138761d
                r0.f138764e = r3
                java.lang.Object r6 = TJ.C16546u.d(r7, r6, r2, r0)
                if (r6 != r1) goto L_0x0061
                return r1
            L_0x0061:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16546u.g.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"TJ/u$h", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.u$h */
    public static final class h implements C16532g<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f138765a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p f138766b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1", f = "Limit.kt", l = {120}, m = "collect")
        /* renamed from: TJ.u$h$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            /* synthetic */ Object f138767c;

            /* renamed from: d  reason: collision with root package name */
            int f138768d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ h f138769e;

            /* renamed from: f  reason: collision with root package name */
            Object f138770f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(h hVar, C17164e eVar) {
                super(eVar);
                this.f138769e = hVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138767c = obj;
                this.f138768d |= Integer.MIN_VALUE;
                return this.f138769e.collect((C16533h) null, this);
            }
        }

        public h(C16532g gVar, p pVar) {
            this.f138765a = gVar;
            this.f138766b = pVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object collect(TJ.C16533h<? super T> r6, dI.C17164e<? super XH.C16807N> r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof TJ.C16546u.h.a
                if (r0 == 0) goto L_0x0013
                r0 = r7
                TJ.u$h$a r0 = (TJ.C16546u.h.a) r0
                int r1 = r0.f138768d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138768d = r1
                goto L_0x0018
            L_0x0013:
                TJ.u$h$a r0 = new TJ.u$h$a
                r0.<init>(r5, r7)
            L_0x0018:
                java.lang.Object r7 = r0.f138767c
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138768d
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                java.lang.Object r6 = r0.f138770f
                TJ.u$i r6 = (TJ.C16546u.i) r6
                XH.y.b(r7)     // Catch:{ a -> 0x002d }
                goto L_0x005a
            L_0x002d:
                r7 = move-exception
                goto L_0x0050
            L_0x002f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L_0x0037:
                XH.y.b(r7)
                TJ.g r7 = r5.f138765a
                TJ.u$i r2 = new TJ.u$i
                nI.p r4 = r5.f138766b
                r2.<init>(r4, r6)
                r0.f138770f = r2     // Catch:{ a -> 0x004e }
                r0.f138768d = r3     // Catch:{ a -> 0x004e }
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch:{ a -> 0x004e }
                if (r6 != r1) goto L_0x005a
                return r1
            L_0x004e:
                r7 = move-exception
                r6 = r2
            L_0x0050:
                UJ.C16623p.a(r7, r6)
                dI.i r6 = r0.getContext()
                QJ.I0.l(r6)
            L_0x005a:
                XH.N r6 = XH.C16807N.f139792a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16546u.h.collect(TJ.h, dI.e):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0018\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"TJ/u$i", "LTJ/h;", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: TJ.u$i */
    public static final class i implements C16533h<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f138771a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C16533h f138772b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.f(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$6$$inlined$collectWhile$1", f = "Limit.kt", l = {132, 133}, m = "emit")
        /* renamed from: TJ.u$i$a */
        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* renamed from: c  reason: collision with root package name */
            Object f138773c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f138774d;

            /* renamed from: e  reason: collision with root package name */
            int f138775e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ i f138776f;

            /* renamed from: g  reason: collision with root package name */
            Object f138777g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(i iVar, C17164e eVar) {
                super(eVar);
                this.f138776f = iVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f138774d = obj;
                this.f138775e |= Integer.MIN_VALUE;
                return this.f138776f.emit(null, this);
            }
        }

        public i(p pVar, C16533h hVar) {
            this.f138771a = pVar;
            this.f138772b = hVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object emit(T r8, dI.C17164e<? super XH.C16807N> r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof TJ.C16546u.i.a
                if (r0 == 0) goto L_0x0013
                r0 = r9
                TJ.u$i$a r0 = (TJ.C16546u.i.a) r0
                int r1 = r0.f138775e
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f138775e = r1
                goto L_0x0018
            L_0x0013:
                TJ.u$i$a r0 = new TJ.u$i$a
                r0.<init>(r7, r9)
            L_0x0018:
                java.lang.Object r9 = r0.f138774d
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f138775e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0046
                if (r2 == r4) goto L_0x0038
                if (r2 != r3) goto L_0x0030
                java.lang.Object r8 = r0.f138773c
                TJ.u$i r8 = (TJ.C16546u.i) r8
                XH.y.b(r9)
                goto L_0x007c
            L_0x0030:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L_0x0038:
                java.lang.Object r8 = r0.f138777g
                java.lang.Object r2 = r0.f138773c
                TJ.u$i r2 = (TJ.C16546u.i) r2
                XH.y.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L_0x0063
            L_0x0046:
                XH.y.b(r9)
                nI.p r9 = r7.f138771a
                r0.f138773c = r7
                r0.f138777g = r8
                r0.f138775e = r4
                r2 = 6
                kotlin.jvm.internal.C17541q.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.C17541q.c(r2)
                if (r9 != r1) goto L_0x0060
                return r1
            L_0x0060:
                r2 = r9
                r9 = r8
                r8 = r7
            L_0x0063:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x007b
                TJ.h r2 = r8.f138772b
                r0.f138773c = r8
                r5 = 0
                r0.f138777g = r5
                r0.f138775e = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L_0x007c
                return r1
            L_0x007b:
                r4 = 0
            L_0x007c:
                if (r4 == 0) goto L_0x0081
                XH.N r8 = XH.C16807N.f139792a
                return r8
            L_0x0081:
                UJ.a r9 = new UJ.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16546u.i.emit(java.lang.Object, dI.e):java.lang.Object");
        }
    }

    public static final <T> C16532g<T> b(C16532g<? extends T> gVar, int i10) {
        if (i10 >= 0) {
            return new a(gVar, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final <T> C16532g<T> c(C16532g<? extends T> gVar, p<? super T, ? super C17164e<? super Boolean>, ? extends Object> pVar) {
        return new c(gVar, pVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object d(TJ.C16533h<? super T> r4, T r5, java.lang.Object r6, dI.C17164e<? super XH.C16807N> r7) {
        /*
            boolean r0 = r7 instanceof TJ.C16546u.e
            if (r0 == 0) goto L_0x0013
            r0 = r7
            TJ.u$e r0 = (TJ.C16546u.e) r0
            int r1 = r0.f138751e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f138751e = r1
            goto L_0x0018
        L_0x0013:
            TJ.u$e r0 = new TJ.u$e
            r0.<init>(r7)
        L_0x0018:
            java.lang.Object r7 = r0.f138750d
            java.lang.Object r1 = eI.C17187b.f()
            int r2 = r0.f138751e
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 == r3) goto L_0x002d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002d:
            java.lang.Object r6 = r0.f138749c
            XH.y.b(r7)
            goto L_0x0041
        L_0x0033:
            XH.y.b(r7)
            r0.f138749c = r6
            r0.f138751e = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L_0x0041
            return r1
        L_0x0041:
            UJ.a r4 = new UJ.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16546u.d(TJ.h, java.lang.Object, java.lang.Object, dI.e):java.lang.Object");
    }

    public static final <T> C16532g<T> e(C16532g<? extends T> gVar, int i10) {
        if (i10 > 0) {
            return new f(gVar, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final <T> C16532g<T> f(C16532g<? extends T> gVar, p<? super T, ? super C17164e<? super Boolean>, ? extends Object> pVar) {
        return new h(gVar, pVar);
    }
}
