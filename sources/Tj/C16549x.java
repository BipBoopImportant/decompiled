package TJ;

import QJ.C16310i;
import QJ.C16339x;
import QJ.C16343z;
import QJ.F0;
import QJ.I0;
import QJ.Q;
import QJ.T;
import TJ.C16515L;
import XH.C16807N;
import XH.t;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.O;
import nI.p;

@Metadata(d1 = {"\u0000r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a=\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0015\u001a\u00020\u0014\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a;\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H@¢\u0006\u0004\b\u001a\u0010\u001b\u001aC\u0010\u001f\u001a\u00020\u001e\"\u0004\b\u0000\u0010\u0000*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 \u001a#\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b!\u0010\"\u001a#\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000#¢\u0006\u0004\b$\u0010%\u001aM\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2(\u0010*\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001e0(\u0012\u0006\u0012\u0004\u0018\u00010)0&¢\u0006\u0004\b+\u0010,¨\u0006-"}, d2 = {"T", "LTJ/g;", "LQJ/Q;", "scope", "LTJ/L;", "started", "", "replay", "LTJ/F;", "g", "(LTJ/g;LQJ/Q;LTJ/L;I)LTJ/F;", "LTJ/K;", "c", "(LTJ/g;I)LTJ/K;", "LdI/i;", "context", "upstream", "LTJ/A;", "shared", "initialValue", "LQJ/F0;", "d", "(LQJ/Q;LdI/i;LTJ/g;LTJ/A;LTJ/L;Ljava/lang/Object;)LQJ/F0;", "LTJ/P;", "i", "(LTJ/g;LQJ/Q;LTJ/L;Ljava/lang/Object;)LTJ/P;", "j", "(LTJ/g;LQJ/Q;LdI/e;)Ljava/lang/Object;", "LQJ/x;", "result", "LXH/N;", "e", "(LQJ/Q;LdI/i;LTJ/g;LQJ/x;)V", "a", "(LTJ/A;)LTJ/F;", "LTJ/B;", "b", "(LTJ/B;)LTJ/P;", "Lkotlin/Function2;", "LTJ/h;", "LdI/e;", "", "action", "f", "(LTJ/F;LnI/p;)LTJ/F;", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: TJ.x  reason: case insensitive filesystem */
final /* synthetic */ class C16549x {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1", f = "Share.kt", l = {210, 214, 215, 221}, m = "invokeSuspend")
    /* renamed from: TJ.x$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138832c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16515L f138833d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f138834e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16504A<T> f138835f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ T f138836g;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", ""}, k = 3, mv = {2, 1, 0}, xi = 48)
        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$1", f = "Share.kt", l = {}, m = "invokeSuspend")
        /* renamed from: TJ.x$a$a  reason: collision with other inner class name */
        static final class C3394a extends l implements p<Integer, C17164e<? super Boolean>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f138837c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ int f138838d;

            C3394a(C17164e<? super C3394a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                C3394a aVar = new C3394a(eVar);
                aVar.f138838d = ((Number) obj).intValue();
                return aVar;
            }

            public final Object i(int i10, C17164e<? super Boolean> eVar) {
                return ((C3394a) create(Integer.valueOf(i10), eVar)).invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Number) obj).intValue(), (C17164e) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f138837c == 0) {
                    y.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(this.f138838d > 0);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/J;", "it", "LXH/N;", "<anonymous>", "(LTJ/J;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharing$1$2", f = "Share.kt", l = {223}, m = "invokeSuspend")
        /* renamed from: TJ.x$a$b */
        static final class b extends l implements p<C16513J, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f138839c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ Object f138840d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C16532g<T> f138841e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C16504A<T> f138842f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ T f138843g;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: TJ.x$a$b$a  reason: collision with other inner class name */
            public /* synthetic */ class C3395a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f138844a;

                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
                static {
                    /*
                        TJ.J[] r0 = TJ.C16513J.values()
                        int r0 = r0.length
                        int[] r0 = new int[r0]
                        TJ.J r1 = TJ.C16513J.START     // Catch:{ NoSuchFieldError -> 0x0010 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                        r2 = 1
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                    L_0x0010:
                        TJ.J r1 = TJ.C16513J.STOP     // Catch:{ NoSuchFieldError -> 0x0019 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                        r2 = 2
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                    L_0x0019:
                        TJ.J r1 = TJ.C16513J.STOP_AND_RESET_REPLAY_CACHE     // Catch:{ NoSuchFieldError -> 0x0022 }
                        int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                        r2 = 3
                        r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                    L_0x0022:
                        f138844a = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: TJ.C16549x.a.b.C3395a.<clinit>():void");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(C16532g<? extends T> gVar, C16504A<T> a10, T t10, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f138841e = gVar;
                this.f138842f = a10;
                this.f138843g = t10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                b bVar = new b(this.f138841e, this.f138842f, this.f138843g, eVar);
                bVar.f138840d = obj;
                return bVar;
            }

            /* renamed from: i */
            public final Object invoke(C16513J j10, C17164e<? super C16807N> eVar) {
                return ((b) create(j10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f138839c;
                if (i10 == 0) {
                    y.b(obj);
                    int i11 = C3395a.f138844a[((C16513J) this.f138840d).ordinal()];
                    if (i11 == 1) {
                        C16532g<T> gVar = this.f138841e;
                        C16504A<T> a10 = this.f138842f;
                        this.f138839c = 1;
                        if (gVar.collect(a10, this) == f10) {
                            return f10;
                        }
                    } else if (i11 != 2) {
                        if (i11 == 3) {
                            T t10 = this.f138843g;
                            if (t10 == C16511H.f138563a) {
                                this.f138842f.f();
                            } else {
                                kotlin.coroutines.jvm.internal.b.a(this.f138842f.a(t10));
                            }
                        } else {
                            throw new t();
                        }
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
        a(C16515L l10, C16532g<? extends T> gVar, C16504A<T> a10, T t10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f138833d = l10;
            this.f138834e = gVar;
            this.f138835f = a10;
            this.f138836g = t10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f138833d, this.f138834e, this.f138835f, this.f138836g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f138832c;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        y.b(obj);
                    } else if (!(i10 == 3 || i10 == 4)) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                y.b(obj);
                return C16807N.f139792a;
            }
            y.b(obj);
            C16515L l10 = this.f138833d;
            C16515L.a aVar = C16515L.f138570a;
            if (l10 == aVar.c()) {
                C16532g<T> gVar = this.f138834e;
                C16504A<T> a10 = this.f138835f;
                this.f138832c = 1;
                if (gVar.collect(a10, this) == f10) {
                    return f10;
                }
            } else if (this.f138833d == aVar.d()) {
                C16519P<Integer> b10 = this.f138835f.b();
                C3394a aVar2 = new C3394a((C17164e<? super C3394a>) null);
                this.f138832c = 2;
                if (C16534i.C(b10, aVar2, this) == f10) {
                    return f10;
                }
            } else {
                C16532g<C16513J> s10 = C16534i.s(this.f138833d.a(this.f138835f.b()));
                b bVar = new b(this.f138834e, this.f138835f, this.f138836g, (C17164e<? super b>) null);
                this.f138832c = 4;
                if (C16534i.j(s10, bVar, this) == f10) {
                    return f10;
                }
            }
            return C16807N.f139792a;
            C16532g<T> gVar2 = this.f138834e;
            C16504A<T> a11 = this.f138835f;
            this.f138832c = 3;
            if (gVar2.collect(a11, this) == f10) {
                return f10;
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {336}, m = "invokeSuspend")
    /* renamed from: TJ.x$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f138845c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f138846d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f138847e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C16339x<C16519P<T>> f138848f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: TJ.x$b$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ O<C16505B<T>> f138849a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Q f138850b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C16339x<C16519P<T>> f138851c;

            a(O<C16505B<T>> o10, Q q10, C16339x<C16519P<T>> xVar) {
                this.f138849a = o10;
                this.f138850b = q10;
                this.f138851c = xVar;
            }

            public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                O<C16505B<T>> o10 = this.f138849a;
                C16505B b10 = (C16505B) o10.f144348a;
                if (b10 != null) {
                    b10.setValue(t10);
                } else {
                    Q q10 = this.f138850b;
                    C16339x<C16519P<T>> xVar = this.f138851c;
                    T a10 = C16521S.a(t10);
                    xVar.J(new C16507D(a10, I0.m(q10.getCoroutineContext())));
                    o10.f144348a = a10;
                }
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16532g<? extends T> gVar, C16339x<C16519P<T>> xVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f138847e = gVar;
            this.f138848f = xVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f138847e, this.f138848f, eVar);
            bVar.f138846d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f138845c;
            if (i10 == 0) {
                y.b(obj);
                Q q10 = (Q) this.f138846d;
                O o10 = new O();
                C16532g<T> gVar = this.f138847e;
                a aVar = new a(o10, q10, this.f138848f);
                this.f138845c = 1;
                if (gVar.collect(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                try {
                    y.b(obj);
                } catch (Throwable th2) {
                    this.f138848f.g(th2);
                    throw th2;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public static final <T> C16509F<T> a(C16504A<T> a10) {
        return new C16506C(a10, (F0) null);
    }

    public static final <T> C16519P<T> b(C16505B<T> b10) {
        return new C16507D(b10, (F0) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002d, code lost:
        if (r3 == 0) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> TJ.C16514K<T> c(TJ.C16532g<? extends T> r7, int r8) {
        /*
            SJ.j$a r0 = SJ.C16434j.f138326e0
            int r0 = r0.a()
            int r0 = tI.C17978n.e(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof UJ.C16612e
            if (r1 == 0) goto L_0x003c
            r1 = r7
            UJ.e r1 = (UJ.C16612e) r1
            TJ.g r2 = r1.k()
            if (r2 == 0) goto L_0x003c
            TJ.K r7 = new TJ.K
            int r3 = r1.f139097b
            r4 = -3
            if (r3 == r4) goto L_0x0026
            r4 = -2
            if (r3 == r4) goto L_0x0026
            if (r3 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0034
        L_0x0026:
            SJ.d r4 = r1.f139098c
            SJ.d r5 = SJ.C16428d.SUSPEND
            r6 = 0
            if (r4 != r5) goto L_0x0031
            if (r3 != 0) goto L_0x0034
        L_0x002f:
            r0 = r6
            goto L_0x0034
        L_0x0031:
            if (r8 != 0) goto L_0x002f
            r0 = 1
        L_0x0034:
            SJ.d r8 = r1.f139098c
            dI.i r1 = r1.f139096a
            r7.<init>(r2, r0, r8, r1)
            return r7
        L_0x003c:
            TJ.K r8 = new TJ.K
            SJ.d r1 = SJ.C16428d.SUSPEND
            dI.j r2 = dI.C17169j.f142968a
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: TJ.C16549x.c(TJ.g, int):TJ.K");
    }

    private static final <T> F0 d(Q q10, C17168i iVar, C16532g<? extends T> gVar, C16504A<T> a10, C16515L l10, T t10) {
        return C16310i.c(q10, iVar, C17542s.e(l10, C16515L.f138570a.c()) ? T.DEFAULT : T.UNDISPATCHED, new a(l10, gVar, a10, t10, (C17164e<? super a>) null));
    }

    private static final <T> void e(Q q10, C17168i iVar, C16532g<? extends T> gVar, C16339x<C16519P<T>> xVar) {
        F0 unused = C16314k.d(q10, iVar, (T) null, new b(gVar, xVar, (C17164e<? super b>) null), 2, (Object) null);
    }

    public static final <T> C16509F<T> f(C16509F<? extends T> f10, p<? super C16533h<? super T>, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
        return new C16524V(f10, pVar);
    }

    public static final <T> C16509F<T> g(C16532g<? extends T> gVar, Q q10, C16515L l10, int i10) {
        C16514K<? extends T> c10 = c(gVar, i10);
        C16504A a10 = C16511H.a(i10, c10.f138567b, c10.f138568c);
        return new C16506C(a10, d(q10, c10.f138569d, c10.f138566a, a10, l10, C16511H.f138563a));
    }

    public static /* synthetic */ C16509F h(C16532g gVar, Q q10, C16515L l10, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return C16534i.Z(gVar, q10, l10, i10);
    }

    public static final <T> C16519P<T> i(C16532g<? extends T> gVar, Q q10, C16515L l10, T t10) {
        C16514K<? extends T> c10 = c(gVar, 1);
        C16505B a10 = C16521S.a(t10);
        return new C16507D(a10, d(q10, c10.f138569d, c10.f138566a, a10, l10, t10));
    }

    public static final <T> Object j(C16532g<? extends T> gVar, Q q10, C17164e<? super C16519P<? extends T>> eVar) {
        C16514K<? extends T> c10 = c(gVar, 1);
        C16339x b10 = C16343z.b((F0) null, 1, (Object) null);
        e(q10, c10.f138569d, c10.f138566a, b10);
        return b10.f(eVar);
    }
}
