package yH;

import BH.C15457b;
import BH.C15458c;
import JH.C15954a;
import NH.e;
import QJ.Q;
import XH.C16807N;
import XH.x;
import XH.y;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.g;
import io.ktor.utils.io.i;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import nI.p;
import nI.q;
import pH.C17746a;
import qH.C17777b;
import vH.C18174m;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00112\u00020\u0001:\u0002\r\u000fBF\u0012\"\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR3\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"LyH/e;", "", "Lkotlin/Function2;", "LBH/c;", "LdI/e;", "LXH/N;", "responseHandler", "Lkotlin/Function1;", "LqH/b;", "", "filter", "<init>", "(LnI/p;LnI/l;)V", "a", "LnI/p;", "b", "LnI/l;", "c", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: yH.e  reason: case insensitive filesystem */
public final class C18715e {

    /* renamed from: c  reason: collision with root package name */
    public static final b f152688c = new b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final C15954a<C18715e> f152689d = new C15954a<>("BodyInterceptor");
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final p<C15458c, C17164e<? super C16807N>, Object> f152690a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17642l<C17777b, Boolean> f152691b;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\t\u001a\u00020\u00072\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nRA\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0000@\u0000X\u000eø\u0001\u0000¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\nR0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00118\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"LyH/e$a;", "", "<init>", "()V", "Lkotlin/Function2;", "LBH/c;", "LdI/e;", "LXH/N;", "block", "c", "(LnI/p;)V", "a", "LnI/p;", "b", "()LnI/p;", "setResponseHandler$ktor_client_core", "responseHandler", "Lkotlin/Function1;", "LqH/b;", "", "LnI/l;", "()LnI/l;", "setFilter$ktor_client_core", "(LnI/l;)V", "filter", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: yH.e$a */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private p<? super C15458c, ? super C17164e<? super C16807N>, ? extends Object> f152692a = new C4326a((C17164e<? super C4326a>) null);

        /* renamed from: b  reason: collision with root package name */
        private C17642l<? super C17777b, Boolean> f152693b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LBH/c;", "it", "LXH/N;", "<anonymous>", "(LBH/c;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.observer.ResponseObserver$Config$responseHandler$1", f = "ResponseObserver.kt", l = {}, m = "invokeSuspend")
        /* renamed from: yH.e$a$a  reason: collision with other inner class name */
        static final class C4326a extends l implements p<C15458c, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f152694c;

            C4326a(C17164e<? super C4326a> eVar) {
                super(2, eVar);
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C4326a(eVar);
            }

            /* renamed from: i */
            public final Object invoke(C15458c cVar, C17164e<? super C16807N> eVar) {
                return ((C4326a) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f152694c == 0) {
                    y.b(obj);
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        public final C17642l<C17777b, Boolean> a() {
            return this.f152693b;
        }

        public final p<C15458c, C17164e<? super C16807N>, Object> b() {
            return this.f152692a;
        }

        public final void c(p<? super C15458c, ? super C17164e<? super C16807N>, ? extends Object> pVar) {
            C17542s.j(pVar, "block");
            this.f152692a = pVar;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"LyH/e$b;", "LvH/m;", "LyH/e$a;", "LyH/e;", "<init>", "()V", "Lkotlin/Function1;", "LXH/N;", "block", "d", "(LnI/l;)LyH/e;", "plugin", "LpH/a;", "scope", "c", "(LyH/e;LpH/a;)V", "LJH/a;", "key", "LJH/a;", "getKey", "()LJH/a;", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: yH.e$b */
    public static final class b implements C18174m<a, C18715e> {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LNH/e;", "LBH/c;", "LXH/N;", "response", "<anonymous>", "(LNH/e;LBH/c;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1", f = "ResponseObserver.kt", l = {68, 77}, m = "invokeSuspend")
        /* renamed from: yH.e$b$a */
        static final class a extends l implements q<e<C15458c, C16807N>, C15458c, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f152695c;

            /* renamed from: d  reason: collision with root package name */
            Object f152696d;

            /* renamed from: e  reason: collision with root package name */
            int f152697e;

            /* renamed from: f  reason: collision with root package name */
            private /* synthetic */ Object f152698f;

            /* renamed from: g  reason: collision with root package name */
            /* synthetic */ Object f152699g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ C18715e f152700h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ C17746a f152701i;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {1, 8, 0})
            @f(c = "io.ktor.client.plugins.observer.ResponseObserver$Plugin$install$1$1", f = "ResponseObserver.kt", l = {69, 73}, m = "invokeSuspend")
            /* renamed from: yH.e$b$a$a  reason: collision with other inner class name */
            static final class C4327a extends l implements p<Q, C17164e<? super C16807N>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f152702c;

                /* renamed from: d  reason: collision with root package name */
                private /* synthetic */ Object f152703d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ C15458c f152704e;

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ C18715e f152705f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4327a(C15458c cVar, C18715e eVar, C17164e<? super C4327a> eVar2) {
                    super(2, eVar2);
                    this.f152704e = cVar;
                    this.f152705f = eVar;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    C4327a aVar = new C4327a(this.f152704e, this.f152705f, eVar);
                    aVar.f152703d = obj;
                    return aVar;
                }

                public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                    return ((C4327a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f152702c;
                    if (i10 == 0) {
                        y.b(obj);
                        Q q10 = (Q) this.f152703d;
                        C18715e eVar = this.f152705f;
                        C15458c cVar = this.f152704e;
                        x.a aVar = x.f139812b;
                        p c10 = eVar.f152690a;
                        this.f152703d = q10;
                        this.f152702c = 1;
                        if (c10.invoke(cVar, this) == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        Q q11 = (Q) this.f152703d;
                        try {
                            y.b(obj);
                        } catch (Throwable th2) {
                            x.a aVar2 = x.f139812b;
                            x.b(y.a(th2));
                        }
                    } else if (i10 == 2) {
                        try {
                            y.b(obj);
                            x.b(kotlin.coroutines.jvm.internal.b.f(((Number) obj).longValue()));
                        } catch (Throwable th3) {
                            x.a aVar3 = x.f139812b;
                            x.b(y.a(th3));
                        }
                        return C16807N.f139792a;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x.b(C16807N.f139792a);
                    g b10 = this.f152704e.b();
                    if (!b10.m()) {
                        this.f152703d = null;
                        this.f152702c = 2;
                        obj = i.b(b10, this);
                        if (obj == f10) {
                            return f10;
                        }
                        x.b(kotlin.coroutines.jvm.internal.b.f(((Number) obj).longValue()));
                    }
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C18715e eVar, C17746a aVar, C17164e<? super a> eVar2) {
                super(3, eVar2);
                this.f152700h = eVar;
                this.f152701i = aVar;
            }

            /* renamed from: i */
            public final Object invoke(e<C15458c, C16807N> eVar, C15458c cVar, C17164e<? super C16807N> eVar2) {
                a aVar = new a(this.f152700h, this.f152701i, eVar2);
                aVar.f152698f = eVar;
                aVar.f152699g = cVar;
                return aVar.invokeSuspend(C16807N.f139792a);
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v5, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: NH.e} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: pH.a} */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    r13 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r13.f152697e
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L_0x0034
                    if (r1 == r3) goto L_0x001b
                    if (r1 != r2) goto L_0x0013
                    XH.y.b(r14)
                    goto L_0x00c1
                L_0x0013:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L_0x001b:
                    java.lang.Object r1 = r13.f152696d
                    QJ.Q r1 = (QJ.Q) r1
                    java.lang.Object r3 = r13.f152695c
                    BH.c r3 = (BH.C15458c) r3
                    java.lang.Object r4 = r13.f152699g
                    BH.c r4 = (BH.C15458c) r4
                    java.lang.Object r5 = r13.f152698f
                    NH.e r5 = (NH.e) r5
                    XH.y.b(r14)
                    r9 = r4
                    r10 = r5
                    r12 = r3
                    r3 = r1
                    r1 = r12
                    goto L_0x009f
                L_0x0034:
                    XH.y.b(r14)
                    java.lang.Object r14 = r13.f152698f
                    r5 = r14
                    NH.e r5 = (NH.e) r5
                    java.lang.Object r14 = r13.f152699g
                    BH.c r14 = (BH.C15458c) r14
                    yH.e r1 = r13.f152700h
                    nI.l r1 = r1.f152691b
                    if (r1 == 0) goto L_0x005b
                    qH.b r4 = r14.h0()
                    java.lang.Object r1 = r1.invoke(r4)
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    if (r1 != 0) goto L_0x005b
                    XH.N r14 = XH.C16807N.f139792a
                    return r14
                L_0x005b:
                    io.ktor.utils.io.g r1 = r14.b()
                    XH.v r1 = JH.f.b(r1, r14)
                    java.lang.Object r4 = r1.a()
                    io.ktor.utils.io.g r4 = (io.ktor.utils.io.g) r4
                    java.lang.Object r1 = r1.b()
                    io.ktor.utils.io.g r1 = (io.ktor.utils.io.g) r1
                    qH.b r6 = r14.h0()
                    qH.b r1 = yH.C18712b.a(r6, r1)
                    BH.c r1 = r1.f()
                    qH.b r14 = r14.h0()
                    qH.b r14 = yH.C18712b.a(r14, r4)
                    BH.c r14 = r14.f()
                    pH.a r4 = r13.f152701i
                    r13.f152698f = r5
                    r13.f152699g = r1
                    r13.f152695c = r14
                    r13.f152696d = r4
                    r13.f152697e = r3
                    java.lang.Object r3 = yH.C18716f.a(r13)
                    if (r3 != r0) goto L_0x009a
                    return r0
                L_0x009a:
                    r9 = r1
                    r10 = r5
                    r1 = r14
                    r14 = r3
                    r3 = r4
                L_0x009f:
                    r4 = r14
                    dI.i r4 = (dI.C17168i) r4
                    yH.e$b$a$a r6 = new yH.e$b$a$a
                    yH.e r14 = r13.f152700h
                    r11 = 0
                    r6.<init>(r1, r14, r11)
                    r7 = 2
                    r8 = 0
                    r5 = 0
                    QJ.F0 unused = QJ.C16314k.d(r3, r4, r5, r6, r7, r8)
                    r13.f152698f = r11
                    r13.f152699g = r11
                    r13.f152695c = r11
                    r13.f152696d = r11
                    r13.f152697e = r2
                    java.lang.Object r14 = r10.f(r9, r13)
                    if (r14 != r0) goto L_0x00c1
                    return r0
                L_0x00c1:
                    XH.N r14 = XH.C16807N.f139792a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: yH.C18715e.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: c */
        public void b(C18715e eVar, C17746a aVar) {
            C17542s.j(eVar, "plugin");
            C17542s.j(aVar, "scope");
            aVar.h().l(C15457b.f133235h.a(), new a(eVar, aVar, (C17164e<? super a>) null));
        }

        /* renamed from: d */
        public C18715e a(C17642l<? super a, C16807N> lVar) {
            C17542s.j(lVar, "block");
            a aVar = new a();
            lVar.invoke(aVar);
            return new C18715e(aVar.b(), aVar.a());
        }

        public C15954a<C18715e> getKey() {
            return C18715e.f152689d;
        }

        private b() {
        }
    }

    public C18715e(p<? super C15458c, ? super C17164e<? super C16807N>, ? extends Object> pVar, C17642l<? super C17777b, Boolean> lVar) {
        C17542s.j(pVar, "responseHandler");
        this.f152690a = pVar;
        this.f152691b = lVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C18715e(p pVar, C17642l lVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, (i10 & 2) != 0 ? null : lVar);
    }
}
