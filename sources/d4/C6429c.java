package D4;

import QJ.Q;
import TJ.C16515L;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001aI\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "T", "LTJ/g;", "LD4/M;", "LQJ/Q;", "scope", "a", "(LTJ/g;LQJ/Q;)LTJ/g;", "LD4/a;", "tracker", "b", "(LTJ/g;LQJ/Q;LD4/a;)LTJ/g;", "paging-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: D4.c  reason: case insensitive filesystem */
public final class C6429c {

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J!\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: D4.c$a */
    public static final class a implements C16532g<M<T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f34303a;

        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "LXH/N;", "emit", "(Ljava/lang/Object;LdI/e;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
        /* renamed from: D4.c$a$a  reason: collision with other inner class name */
        public static final class C0543a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f34304a;

            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$map$1$2", f = "CachedPagingData.kt", l = {223}, m = "emit")
            /* renamed from: D4.c$a$a$a  reason: collision with other inner class name */
            public static final class C0544a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f34305c;

                /* renamed from: d  reason: collision with root package name */
                int f34306d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C0543a f34307e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C0544a(C0543a aVar, C17164e eVar) {
                    super(eVar);
                    this.f34307e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f34305c = obj;
                    this.f34306d |= Integer.MIN_VALUE;
                    return this.f34307e.emit((Object) null, this);
                }
            }

            public C0543a(C16533h hVar) {
                this.f34304a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof D4.C6429c.a.C0543a.C0544a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    D4.c$a$a$a r0 = (D4.C6429c.a.C0543a.C0544a) r0
                    int r1 = r0.f34306d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f34306d = r1
                    goto L_0x0018
                L_0x0013:
                    D4.c$a$a$a r0 = new D4.c$a$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f34305c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f34306d
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
                    TJ.h r6 = r4.f34304a
                    D4.A r5 = (D4.A) r5
                    D4.M r5 = r5.b()
                    r0.f34306d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: D4.C6429c.a.C0543a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public a(C16532g gVar) {
            this.f34303a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f34303a.collect(new C0543a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H@"}, d2 = {"T", "R", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$$inlined$simpleMapLatest$1", f = "CachedPagingData.kt", l = {106}, m = "invokeSuspend")
    /* renamed from: D4.c$b */
    public static final class b extends l implements q<C16533h<? super A<T>>, M<T>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34308c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f34309d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f34310e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Q f34311f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, Q q10, C6427a aVar) {
            super(3, eVar);
            this.f34311f = q10;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super A<T>> hVar, M<T> m10, C17164e<? super C16807N> eVar) {
            b bVar = new b(eVar, this.f34311f, (C6427a) null);
            bVar.f34309d = hVar;
            bVar.f34310e = m10;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34308c;
            if (i10 == 0) {
                y.b(obj);
                A a10 = new A(this.f34311f, (M) this.f34310e, (C6427a) null);
                this.f34308c = 1;
                if (((C16533h) this.f34309d).emit(a10, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LD4/A;", "prev", "next", "<anonymous>", "(LD4/A;LD4/A;)LD4/A;"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$2", f = "CachedPagingData.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: D4.c$c  reason: collision with other inner class name */
    static final class C0545c extends l implements q<A<T>, A<T>, C17164e<? super A<T>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34312c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f34313d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f34314e;

        C0545c(C17164e<? super C0545c> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(A<T> a10, A<T> a11, C17164e<? super A<T>> eVar) {
            C0545c cVar = new C0545c(eVar);
            cVar.f34313d = a10;
            cVar.f34314e = a11;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f34312c;
            if (i10 == 0) {
                y.b(obj);
                A a10 = (A) this.f34314e;
                this.f34313d = a10;
                this.f34312c = 1;
                return ((A) this.f34313d).c(this) == f10 ? f10 : a10;
            } else if (i10 == 1) {
                A a11 = (A) this.f34313d;
                y.b(obj);
                return a11;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "T", "LTJ/h;", "LD4/M;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$4", f = "CachedPagingData.kt", l = {109}, m = "invokeSuspend")
    /* renamed from: D4.c$d */
    static final class d extends l implements p<C16533h<? super M<T>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34315c;

        d(C6427a aVar, C17164e<? super d> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d((C6427a) null, eVar);
        }

        public final Object invoke(C16533h<? super M<T>> hVar, C17164e<? super C16807N> eVar) {
            return ((d) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            int i10 = this.f34315c;
            if (i10 == 0 || i10 == 1) {
                y.b(obj);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "T", "LTJ/h;", "LD4/M;", "", "it", "LXH/N;", "<anonymous>", "(LTJ/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    @f(c = "androidx.paging.CachedPagingDataKt$cachedIn$5", f = "CachedPagingData.kt", l = {111}, m = "invokeSuspend")
    /* renamed from: D4.c$e */
    static final class e extends l implements q<C16533h<? super M<T>>, Throwable, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f34316c;

        e(C6427a aVar, C17164e<? super e> eVar) {
            super(3, eVar);
        }

        public final Object invoke(C16533h<? super M<T>> hVar, Throwable th2, C17164e<? super C16807N> eVar) {
            return new e((C6427a) null, eVar).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            int i10 = this.f34316c;
            if (i10 == 0 || i10 == 1) {
                y.b(obj);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final <T> C16532g<M<T>> a(C16532g<M<T>> gVar, Q q10) {
        C17542s.j(gVar, "<this>");
        C17542s.j(q10, "scope");
        return b(gVar, q10, (C6427a) null);
    }

    public static final <T> C16532g<M<T>> b(C16532g<M<T>> gVar, Q q10, C6427a aVar) {
        C17542s.j(gVar, "<this>");
        C17542s.j(q10, "scope");
        return C16534i.Z(C16534i.Q(C16534i.S(new a(C6439m.b(C6439m.d(gVar, new b((C17164e) null, q10, aVar)), new C0545c((C17164e<? super C0545c>) null))), new d(aVar, (C17164e<? super d>) null)), new e(aVar, (C17164e<? super e>) null)), q10, C16515L.f138570a.d(), 1);
    }
}
