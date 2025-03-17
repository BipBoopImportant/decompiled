package TJ;

import QJ.Q;
import SJ.C16438n;
import SJ.C16449y;
import UJ.C16622o;
import UJ.C16627t;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.O;
import nI.C17642l;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a-\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a9\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"T", "LTJ/g;", "", "timeoutMillis", "b", "(LTJ/g;J)LTJ/g;", "Lkotlin/Function1;", "c", "(LTJ/g;LnI/l;)LTJ/g;", "timeoutMillisSelector", "e", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.o  reason: case insensitive filesystem */
final /* synthetic */ class C16540o {

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LQJ/Q;", "LTJ/h;", "downstream", "LXH/N;", "<anonymous>", "(LQJ/Q;LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
    /* renamed from: TJ.o$a */
    static final class a extends l implements q<Q, C16533h<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f138663c;

        /* renamed from: d  reason: collision with root package name */
        Object f138664d;

        /* renamed from: e  reason: collision with root package name */
        int f138665e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f138666f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f138667g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17642l<T, Long> f138668h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f138669i;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
        /* renamed from: TJ.o$a$a  reason: collision with other inner class name */
        static final class C3388a extends l implements C17642l<C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f138670c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C16533h<T> f138671d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ O<Object> f138672e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3388a(C16533h<? super T> hVar, O<Object> o10, C17164e<? super C3388a> eVar) {
                super(1, eVar);
                this.f138671d = hVar;
                this.f138672e = o10;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new C3388a(this.f138671d, this.f138672e, eVar);
            }

            /* renamed from: i */
            public final Object invoke(C17164e<? super C16807N> eVar) {
                return ((C3388a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f138670c;
                if (i10 == 0) {
                    y.b(obj);
                    C16533h<T> hVar = this.f138671d;
                    T t10 = C16627t.f139163a;
                    T t11 = this.f138672e.f144348a;
                    if (t11 == t10) {
                        t11 = null;
                    }
                    this.f138670c = 1;
                    if (hVar.emit(t11, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                this.f138672e.f144348a = null;
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LSJ/n;", "", "value", "LXH/N;", "<anonymous>", "(LSJ/n;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
        /* renamed from: TJ.o$a$b */
        static final class b extends l implements p<C16438n<? extends Object>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f138673c;

            /* renamed from: d  reason: collision with root package name */
            int f138674d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f138675e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ O<Object> f138676f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C16533h<T> f138677g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(O<Object> o10, C16533h<? super T> hVar, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f138676f = o10;
                this.f138677g = hVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f138676f, this.f138677g, eVar);
                bVar.f138675e = obj;
                return bVar;
            }

            public final Object i(Object obj, C17164e<? super C16807N> eVar) {
                return ((b) create(C16438n.b(obj), eVar)).invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((C16438n) obj).l(), (C17164e) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                O<Object> o10;
                O<Object> o11;
                Object f10 = C17187b.f();
                int i10 = this.f138674d;
                if (i10 == 0) {
                    y.b(obj);
                    T l10 = ((C16438n) this.f138675e).l();
                    o10 = this.f138676f;
                    boolean z10 = l10 instanceof C16438n.c;
                    if (!z10) {
                        o10.f144348a = l10;
                    }
                    C16533h<T> hVar = this.f138677g;
                    if (z10) {
                        Throwable e10 = C16438n.e(l10);
                        if (e10 == null) {
                            T t10 = o10.f144348a;
                            if (t10 != null) {
                                if (t10 == C16627t.f139163a) {
                                    t10 = null;
                                }
                                this.f138675e = l10;
                                this.f138673c = o10;
                                this.f138674d = 1;
                                if (hVar.emit(t10, this) == f10) {
                                    return f10;
                                }
                                o11 = o10;
                            }
                            o10.f144348a = C16627t.f139165c;
                        } else {
                            throw e10;
                        }
                    }
                    return C16807N.f139792a;
                } else if (i10 == 1) {
                    o11 = (O) this.f138673c;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o10 = o11;
                o10.f144348a = C16627t.f139165c;
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LSJ/y;", "", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend")
        /* renamed from: TJ.o$a$c */
        static final class c extends l implements p<C16449y<? super Object>, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f138678c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f138679d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16532g<T> f138680e;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: TJ.o$a$c$a  reason: collision with other inner class name */
            static final class C3389a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16449y<Object> f138681a;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1", f = "Delay.kt", l = {204}, m = "emit")
                /* renamed from: TJ.o$a$c$a$a  reason: collision with other inner class name */
                static final class C3390a extends d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f138682c;

                    /* renamed from: d  reason: collision with root package name */
                    final /* synthetic */ C3389a<T> f138683d;

                    /* renamed from: e  reason: collision with root package name */
                    int f138684e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    C3390a(C3389a<? super T> aVar, C17164e<? super C3390a> eVar) {
                        super(eVar);
                        this.f138683d = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f138682c = obj;
                        this.f138684e |= Integer.MIN_VALUE;
                        return this.f138683d.emit(null, this);
                    }
                }

                C3389a(C16449y<Object> yVar) {
                    this.f138681a = yVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(T r5, dI.C17164e<? super XH.C16807N> r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof TJ.C16540o.a.c.C3389a.C3390a
                        if (r0 == 0) goto L_0x0013
                        r0 = r6
                        TJ.o$a$c$a$a r0 = (TJ.C16540o.a.c.C3389a.C3390a) r0
                        int r1 = r0.f138684e
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f138684e = r1
                        goto L_0x0018
                    L_0x0013:
                        TJ.o$a$c$a$a r0 = new TJ.o$a$c$a$a
                        r0.<init>(r4, r6)
                    L_0x0018:
                        java.lang.Object r6 = r0.f138682c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f138684e
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r6)
                        goto L_0x0043
                    L_0x0029:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L_0x0031:
                        XH.y.b(r6)
                        SJ.y<java.lang.Object> r6 = r4.f138681a
                        if (r5 != 0) goto L_0x003a
                        WJ.D r5 = UJ.C16627t.f139163a
                    L_0x003a:
                        r0.f138684e = r3
                        java.lang.Object r5 = r6.y(r5, r0)
                        if (r5 != r1) goto L_0x0043
                        return r1
                    L_0x0043:
                        XH.N r5 = XH.C16807N.f139792a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: TJ.C16540o.a.c.C3389a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C16532g<? extends T> gVar, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f138680e = gVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                c cVar = new c(this.f138680e, eVar);
                cVar.f138679d = obj;
                return cVar;
            }

            /* renamed from: i */
            public final Object invoke(C16449y<Object> yVar, C17164e<? super C16807N> eVar) {
                return ((c) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f138678c;
                if (i10 == 0) {
                    y.b(obj);
                    C16532g<T> gVar = this.f138680e;
                    C3389a aVar = new C3389a((C16449y) this.f138679d);
                    this.f138678c = 1;
                    if (gVar.collect(aVar, this) == f10) {
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
        a(C17642l<? super T, Long> lVar, C16532g<? extends T> gVar, C17164e<? super a> eVar) {
            super(3, eVar);
            this.f138668h = lVar;
            this.f138669i = gVar;
        }

        /* renamed from: i */
        public final Object invoke(Q q10, C16533h<? super T> hVar, C17164e<? super C16807N> eVar) {
            a aVar = new a(this.f138668h, this.f138669i, eVar);
            aVar.f138666f = q10;
            aVar.f138667g = hVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00be  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00e4 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                r14 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r14.f138665e
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L_0x003e
                if (r1 == r3) goto L_0x002a
                if (r1 != r2) goto L_0x0022
                java.lang.Object r1 = r14.f138663c
                kotlin.jvm.internal.O r1 = (kotlin.jvm.internal.O) r1
                java.lang.Object r5 = r14.f138667g
                SJ.A r5 = (SJ.C16422A) r5
                java.lang.Object r6 = r14.f138666f
                TJ.h r6 = (TJ.C16533h) r6
                XH.y.b(r15)
            L_0x001e:
                r7 = r6
                r6 = r5
                r5 = r1
                goto L_0x0060
            L_0x0022:
                java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r15.<init>(r0)
                throw r15
            L_0x002a:
                java.lang.Object r1 = r14.f138664d
                kotlin.jvm.internal.N r1 = (kotlin.jvm.internal.N) r1
                java.lang.Object r5 = r14.f138663c
                kotlin.jvm.internal.O r5 = (kotlin.jvm.internal.O) r5
                java.lang.Object r6 = r14.f138667g
                SJ.A r6 = (SJ.C16422A) r6
                java.lang.Object r7 = r14.f138666f
                TJ.h r7 = (TJ.C16533h) r7
                XH.y.b(r15)
                goto L_0x00a2
            L_0x003e:
                XH.y.b(r15)
                java.lang.Object r15 = r14.f138666f
                r5 = r15
                QJ.Q r5 = (QJ.Q) r5
                java.lang.Object r15 = r14.f138667g
                TJ.h r15 = (TJ.C16533h) r15
                TJ.o$a$c r8 = new TJ.o$a$c
                TJ.g<T> r1 = r14.f138669i
                r8.<init>(r1, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                SJ.A r1 = SJ.C16447w.e(r5, r6, r7, r8, r9, r10)
                kotlin.jvm.internal.O r5 = new kotlin.jvm.internal.O
                r5.<init>()
                r7 = r15
                r6 = r1
            L_0x0060:
                T r15 = r5.f144348a
                WJ.D r1 = UJ.C16627t.f139165c
                if (r15 == r1) goto L_0x00e5
                kotlin.jvm.internal.N r1 = new kotlin.jvm.internal.N
                r1.<init>()
                T r15 = r5.f144348a
                if (r15 == 0) goto L_0x00a4
                nI.l<T, java.lang.Long> r8 = r14.f138668h
                WJ.D r9 = UJ.C16627t.f139163a
                if (r15 != r9) goto L_0x0076
                r15 = r4
            L_0x0076:
                java.lang.Object r15 = r8.invoke(r15)
                java.lang.Number r15 = (java.lang.Number) r15
                long r10 = r15.longValue()
                r1.f144347a = r10
                r12 = 0
                int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r15 < 0) goto L_0x00a9
                int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r15 != 0) goto L_0x00a4
                T r15 = r5.f144348a
                if (r15 != r9) goto L_0x0091
                r15 = r4
            L_0x0091:
                r14.f138666f = r7
                r14.f138667g = r6
                r14.f138663c = r5
                r14.f138664d = r1
                r14.f138665e = r3
                java.lang.Object r15 = r7.emit(r15, r14)
                if (r15 != r0) goto L_0x00a2
                return r0
            L_0x00a2:
                r5.f144348a = r4
            L_0x00a4:
                r15 = r1
                r1 = r5
                r5 = r6
                r6 = r7
                goto L_0x00b1
            L_0x00a9:
                java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Debounce timeout should not be negative"
                r15.<init>(r0)
                throw r15
            L_0x00b1:
                ZJ.j r7 = new ZJ.j
                dI.i r8 = r14.getContext()
                r7.<init>(r8)
                T r8 = r1.f144348a
                if (r8 == 0) goto L_0x00c8
                long r8 = r15.f144347a
                TJ.o$a$a r15 = new TJ.o$a$a
                r15.<init>(r6, r1, r4)
                ZJ.C17008c.a(r7, r8, r15)
            L_0x00c8:
                ZJ.g r15 = r5.m()
                TJ.o$a$b r8 = new TJ.o$a$b
                r8.<init>(r1, r6, r4)
                r7.e(r15, r8)
                r14.f138666f = r6
                r14.f138667g = r5
                r14.f138663c = r1
                r14.f138664d = r4
                r14.f138665e = r2
                java.lang.Object r15 = r7.o(r14)
                if (r15 != r0) goto L_0x001e
                return r0
            L_0x00e5:
                XH.N r15 = XH.C16807N.f139792a
                return r15
            */
            throw new UnsupportedOperationException("Method not decompiled: TJ.C16540o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <T> C16532g<T> b(C16532g<? extends T> gVar, long j10) {
        int i10 = (j10 > 0 ? 1 : (j10 == 0 ? 0 : -1));
        if (i10 >= 0) {
            return i10 == 0 ? gVar : e(gVar, new C16539n(j10));
        }
        throw new IllegalArgumentException("Debounce timeout should not be negative");
    }

    public static final <T> C16532g<T> c(C16532g<? extends T> gVar, C17642l<? super T, Long> lVar) {
        return e(gVar, lVar);
    }

    /* access modifiers changed from: private */
    public static final long d(long j10, Object obj) {
        return j10;
    }

    private static final <T> C16532g<T> e(C16532g<? extends T> gVar, C17642l<? super T, Long> lVar) {
        return C16622o.b(new a(lVar, gVar, (C17164e<? super a>) null));
    }
}
