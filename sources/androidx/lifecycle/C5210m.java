package androidx.lifecycle;

import QJ.Q;
import SJ.C16449y;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import dI.C17168i;
import dI.C17169j;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import o.C5647c;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"T", "LTJ/g;", "LdI/i;", "context", "", "timeoutInMs", "Landroidx/lifecycle/F;", "b", "(LTJ/g;LdI/i;J)Landroidx/lifecycle/F;", "a", "(Landroidx/lifecycle/F;)LTJ/g;", "lifecycle-livedata_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.m  reason: case insensitive filesystem */
public final class C5210m {

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LSJ/y;", "LXH/N;", "<anonymous>", "(LSJ/y;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {107, 112, 113, 115}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.m$a */
    static final class a extends l implements p<C16449y<? super T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f22316c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f22317d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ F<T> f22318e;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.m$a$a  reason: collision with other inner class name */
        static final class C0347a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f22319c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F<T> f22320d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ L<T> f22321e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C0347a(F<T> f10, L<T> l10, C17164e<? super C0347a> eVar) {
                super(2, eVar);
                this.f22320d = f10;
                this.f22321e = l10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C0347a(this.f22320d, this.f22321e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C0347a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f22319c == 0) {
                    y.b(obj);
                    this.f22320d.observeForever(this.f22321e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.m$a$b */
        static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f22322c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F<T> f22323d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ L<T> f22324e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            b(F<T> f10, L<T> l10, C17164e<? super b> eVar) {
                super(2, eVar);
                this.f22323d = f10;
                this.f22324e = l10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new b(this.f22323d, this.f22324e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f22322c == 0) {
                    y.b(obj);
                    this.f22323d.observeForever(this.f22324e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
        /* renamed from: androidx.lifecycle.m$a$c */
        static final class c extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f22325c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ F<T> f22326d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ L<T> f22327e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(F<T> f10, L<T> l10, C17164e<? super c> eVar) {
                super(2, eVar);
                this.f22326d = f10;
                this.f22327e = l10;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new c(this.f22326d, this.f22327e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f22325c == 0) {
                    y.b(obj);
                    this.f22326d.removeObserver(this.f22327e);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(F<T> f10, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f22318e = f10;
        }

        /* access modifiers changed from: private */
        public static final void k(C16449y yVar, Object obj) {
            yVar.k(obj);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f22318e, eVar);
            aVar.f22317d = obj;
            return aVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ all -> 0x002e }, RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r9.f22316c
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r1 == 0) goto L_0x0040
                if (r1 == r5) goto L_0x0038
                if (r1 == r4) goto L_0x0030
                if (r1 == r3) goto L_0x0026
                if (r1 == r2) goto L_0x001d
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L_0x001d:
                java.lang.Object r0 = r9.f22317d
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                XH.y.b(r10)
                goto L_0x00b2
            L_0x0026:
                java.lang.Object r1 = r9.f22317d
                androidx.lifecycle.L r1 = (androidx.lifecycle.L) r1
                XH.y.b(r10)     // Catch:{ all -> 0x002e }
                goto L_0x008b
            L_0x002e:
                r10 = move-exception
                goto L_0x0091
            L_0x0030:
                java.lang.Object r1 = r9.f22317d
                androidx.lifecycle.L r1 = (androidx.lifecycle.L) r1
                XH.y.b(r10)     // Catch:{ all -> 0x002e }
                goto L_0x0080
            L_0x0038:
                java.lang.Object r1 = r9.f22317d
                androidx.lifecycle.L r1 = (androidx.lifecycle.L) r1
                XH.y.b(r10)
                goto L_0x0066
            L_0x0040:
                XH.y.b(r10)
                java.lang.Object r10 = r9.f22317d
                SJ.y r10 = (SJ.C16449y) r10
                androidx.lifecycle.l r1 = new androidx.lifecycle.l
                r1.<init>(r10)
                QJ.P0 r10 = QJ.C16311i0.c()
                QJ.P0 r10 = r10.P0()
                androidx.lifecycle.m$a$a r7 = new androidx.lifecycle.m$a$a
                androidx.lifecycle.F<T> r8 = r9.f22318e
                r7.<init>(r8, r1, r6)
                r9.f22317d = r1
                r9.f22316c = r5
                java.lang.Object r10 = QJ.C16310i.g(r10, r7, r9)
                if (r10 != r0) goto L_0x0066
                return r0
            L_0x0066:
                QJ.P0 r10 = QJ.C16311i0.c()     // Catch:{ all -> 0x002e }
                QJ.P0 r10 = r10.P0()     // Catch:{ all -> 0x002e }
                androidx.lifecycle.m$a$b r5 = new androidx.lifecycle.m$a$b     // Catch:{ all -> 0x002e }
                androidx.lifecycle.F<T> r7 = r9.f22318e     // Catch:{ all -> 0x002e }
                r5.<init>(r7, r1, r6)     // Catch:{ all -> 0x002e }
                r9.f22317d = r1     // Catch:{ all -> 0x002e }
                r9.f22316c = r4     // Catch:{ all -> 0x002e }
                java.lang.Object r10 = QJ.C16310i.g(r10, r5, r9)     // Catch:{ all -> 0x002e }
                if (r10 != r0) goto L_0x0080
                return r0
            L_0x0080:
                r9.f22317d = r1     // Catch:{ all -> 0x002e }
                r9.f22316c = r3     // Catch:{ all -> 0x002e }
                java.lang.Object r10 = QJ.C16297b0.a(r9)     // Catch:{ all -> 0x002e }
                if (r10 != r0) goto L_0x008b
                return r0
            L_0x008b:
                XH.k r10 = new XH.k     // Catch:{ all -> 0x002e }
                r10.<init>()     // Catch:{ all -> 0x002e }
                throw r10     // Catch:{ all -> 0x002e }
            L_0x0091:
                QJ.P0 r3 = QJ.C16311i0.c()
                QJ.P0 r3 = r3.P0()
                QJ.R0 r4 = QJ.R0.f137599a
                dI.i r3 = r3.plus(r4)
                androidx.lifecycle.m$a$c r4 = new androidx.lifecycle.m$a$c
                androidx.lifecycle.F<T> r5 = r9.f22318e
                r4.<init>(r5, r1, r6)
                r9.f22317d = r10
                r9.f22316c = r2
                java.lang.Object r1 = QJ.C16310i.g(r3, r4, r9)
                if (r1 != r0) goto L_0x00b1
                return r0
            L_0x00b1:
                r0 = r10
            L_0x00b2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C5210m.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* renamed from: j */
        public final Object invoke(C16449y<? super T> yVar, C17164e<? super C16807N> eVar) {
            return ((a) create(yVar, eVar)).invokeSuspend(C16807N.f139792a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Landroidx/lifecycle/G;", "LXH/N;", "<anonymous>", "(Landroidx/lifecycle/G;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1", f = "FlowLiveData.kt", l = {78}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.m$b */
    static final class b extends l implements p<G<T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f22328c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f22329d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C16532g<T> f22330e;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: androidx.lifecycle.m$b$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ G<T> f22331a;

            a(G<T> g10) {
                this.f22331a = g10;
            }

            public final Object emit(T t10, C17164e<? super C16807N> eVar) {
                Object emit = this.f22331a.emit(t10, eVar);
                return emit == C17187b.f() ? emit : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C16532g<? extends T> gVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f22330e = gVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f22330e, eVar);
            bVar.f22329d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(G<T> g10, C17164e<? super C16807N> eVar) {
            return ((b) create(g10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f22328c;
            if (i10 == 0) {
                y.b(obj);
                C16532g<T> gVar = this.f22330e;
                a aVar = new a((G) this.f22329d);
                this.f22328c = 1;
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

    public static final <T> C16532g<T> a(F<T> f10) {
        C17542s.j(f10, "<this>");
        return C16534i.o(C16534i.f(new a(f10, (C17164e<? super a>) null)));
    }

    public static final <T> F<T> b(C16532g<? extends T> gVar, C17168i iVar, long j10) {
        C17542s.j(gVar, "<this>");
        C17542s.j(iVar, "context");
        F<T> a10 = C5204g.a(iVar, j10, new b(gVar, (C17164e<? super b>) null));
        if (gVar instanceof C16519P) {
            if (C5647c.h().c()) {
                a10.setValue(((C16519P) gVar).getValue());
            } else {
                a10.postValue(((C16519P) gVar).getValue());
            }
        }
        return a10;
    }

    public static /* synthetic */ F c(C16532g gVar, C17168i iVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            iVar = C17169j.f142968a;
        }
        if ((i10 & 2) != 0) {
            j10 = 5000;
        }
        return b(gVar, iVar, j10);
    }
}
