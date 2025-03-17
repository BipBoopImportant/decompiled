package B0;

import A1.B;
import A1.C4336c;
import A1.K;
import QJ.F0;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.k;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import o1.C5667g;
import p0.m;
import p0.t;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u001c\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H@¢\u0006\u0004\b\u0007\u0010\u0005¨\u0006\b"}, d2 = {"LA1/K;", "LB0/N;", "observer", "LXH/N;", "c", "(LA1/K;LB0/N;LdI/e;)Ljava/lang/Object;", "e", "d", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class E {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LQJ/F0;", "<anonymous>", "(LQJ/Q;)LQJ/F0;"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super F0>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f4526c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f4527d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ K f4528e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ N f4529f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {83}, m = "invokeSuspend")
        /* renamed from: B0.E$a$a  reason: collision with other inner class name */
        static final class C0003a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f4530c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f4531d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ N f4532e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0003a(K k10, N n10, C17164e<? super C0003a> eVar) {
                super(2, eVar);
                this.f4531d = k10;
                this.f4532e = n10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0003a(this.f4531d, this.f4532e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0003a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f4530c;
                if (i10 == 0) {
                    y.b(obj);
                    K k10 = this.f4531d;
                    N n10 = this.f4532e;
                    this.f4530c = 1;
                    if (E.e(k10, n10, this) == f10) {
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
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {86}, m = "invokeSuspend")
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f4533c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ K f4534d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ N f4535e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(K k10, N n10, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f4534d = k10;
                this.f4535e = n10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f4534d, this.f4535e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f4533c;
                if (i10 == 0) {
                    y.b(obj);
                    K k10 = this.f4534d;
                    N n10 = this.f4535e;
                    this.f4533c = 1;
                    if (E.d(k10, n10, this) == f10) {
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
        a(K k10, N n10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f4528e = k10;
            this.f4529f = n10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f4528e, this.f4529f, eVar);
            aVar.f4527d = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super F0> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f4526c == 0) {
                y.b(obj);
                Q q10 = (Q) this.f4527d;
                T t10 = T.UNDISPATCHED;
                T t11 = t10;
                F0 unused = C16314k.d(q10, (C17168i) null, t11, new C0003a(this.f4528e, this.f4529f, (C17164e<? super C0003a>) null), 1, (Object) null);
                return C16314k.d(q10, (C17168i) null, t11, new b(this.f4528e, this.f4529f, (C17164e<? super b>) null), 1, (Object) null);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo1/g;", "it", "LXH/N;", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends C17544u implements C17642l<C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f4536c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(N n10) {
            super(1);
            this.f4536c = n10;
        }

        public final void a(long j10) {
            this.f4536c.i(j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((C5667g) obj).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class c extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f4537c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(N n10) {
            super(0);
            this.f4537c = n10;
        }

        public final void invoke() {
            this.f4537c.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    static final class d extends C17544u implements C17631a<C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f4538c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(N n10) {
            super(0);
            this.f4538c = n10;
        }

        public final void invoke() {
            this.f4538c.onCancel();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LA1/B;", "<anonymous parameter 0>", "Lo1/g;", "offset", "LXH/N;", "a", "(LA1/B;J)V"}, k = 3, mv = {1, 8, 0})
    static final class e extends C17544u implements p<B, C5667g, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ N f4539c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(N n10) {
            super(2);
            this.f4539c = n10;
        }

        public final void a(B b10, long j10) {
            this.f4539c.k(j10);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((B) obj, ((C5667g) obj2).v());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LA1/c;", "LXH/N;", "<anonymous>", "(LA1/c;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {99, 103}, m = "invokeSuspend")
    static final class f extends k implements p<C4336c, C17164e<? super C16807N>, Object> {

        /* renamed from: d  reason: collision with root package name */
        Object f4540d;

        /* renamed from: e  reason: collision with root package name */
        int f4541e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f4542f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ N f4543g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(N n10, C17164e<? super f> eVar) {
            super(2, eVar);
            this.f4543g = n10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            f fVar = new f(this.f4543g, eVar);
            fVar.f4542f = obj;
            return fVar;
        }

        /* renamed from: i */
        public final Object invoke(C4336c cVar, C17164e<? super C16807N> eVar) {
            return ((f) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v10, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: A1.c} */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005d A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006b  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0089 A[SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r12.f4541e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x002a
                if (r1 == r3) goto L_0x0022
                if (r1 != r2) goto L_0x001a
                java.lang.Object r1 = r12.f4540d
                A1.B r1 = (A1.B) r1
                java.lang.Object r4 = r12.f4542f
                A1.c r4 = (A1.C4336c) r4
                XH.y.b(r13)
                goto L_0x005e
            L_0x001a:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L_0x0022:
                java.lang.Object r1 = r12.f4542f
                A1.c r1 = (A1.C4336c) r1
                XH.y.b(r13)
                goto L_0x0043
            L_0x002a:
                XH.y.b(r13)
                java.lang.Object r13 = r12.f4542f
                r1 = r13
                A1.c r1 = (A1.C4336c) r1
                r12.f4542f = r1
                r12.f4541e = r3
                r5 = 0
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r1
                r7 = r12
                java.lang.Object r13 = p0.G.e(r4, r5, r6, r7, r8, r9)
                if (r13 != r0) goto L_0x0043
                return r0
            L_0x0043:
                A1.B r13 = (A1.B) r13
                B0.N r4 = r12.f4543g
                long r5 = r13.h()
                r4.h(r5)
                r4 = r1
                r1 = r13
            L_0x0050:
                r12.f4542f = r4
                r12.f4540d = r1
                r12.f4541e = r2
                r13 = 0
                java.lang.Object r13 = A1.C4336c.J1(r4, r13, r12, r3, r13)
                if (r13 != r0) goto L_0x005e
                return r0
            L_0x005e:
                A1.p r13 = (A1.C4349p) r13
                java.util.List r13 = r13.c()
                int r5 = r13.size()
                r6 = 0
            L_0x0069:
                if (r6 >= r5) goto L_0x0089
                java.lang.Object r7 = r13.get(r6)
                A1.B r7 = (A1.B) r7
                long r8 = r7.f()
                long r10 = r1.f()
                boolean r8 = A1.A.d(r8, r10)
                if (r8 == 0) goto L_0x0086
                boolean r7 = r7.i()
                if (r7 == 0) goto L_0x0086
                goto L_0x0050
            L_0x0086:
                int r6 = r6 + 1
                goto L_0x0069
            L_0x0089:
                B0.N r13 = r12.f4543g
                r13.j()
                XH.N r13 = XH.C16807N.f139792a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: B0.E.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Object c(K k10, N n10, C17164e<? super C16807N> eVar) {
        Object f10 = S.f(new a(k10, n10, (C17164e<? super a>) null), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object d(K k10, N n10, C17164e<? super C16807N> eVar) {
        Object f10 = m.f(k10, new b(n10), new c(n10), new d(n10), new e(n10), eVar);
        return f10 == C17187b.f() ? f10 : C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object e(K k10, N n10, C17164e<? super C16807N> eVar) {
        Object c10 = t.c(k10, new f(n10, (C17164e<? super f>) null), eVar);
        return c10 == C17187b.f() ? c10 : C16807N.f139792a;
    }
}
