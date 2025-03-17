package sH;

import AH.C15412c;
import AH.C15413d;
import AH.C15416g;
import AH.C15417h;
import BH.C15458c;
import CH.C15490b;
import NH.e;
import OH.C16158a;
import OH.b;
import QJ.F0;
import QJ.I0;
import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.g0;
import dI.C17164e;
import eI.C17187b;
import java.io.Closeable;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import nI.C17642l;
import nI.p;
import nI.q;
import pH.C17746a;
import qH.C17777b;
import uI.C18068q;
import uI.C18075x;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000b\u0010\u001d\u001a\u00020\u001c8BX\u0004\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"LsH/b;", "LQJ/Q;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "LAH/d;", "data", "LAH/g;", "O1", "(LAH/d;LdI/e;)Ljava/lang/Object;", "LpH/a;", "client", "LXH/N;", "a2", "(LpH/a;)V", "requestData", "checkExtensions", "(LAH/d;)V", "executeWithinCallContext", "(LAH/d;)LAH/g;", "LsH/g;", "getConfig", "()LsH/g;", "config", "", "LsH/e;", "b2", "()Ljava/util/Set;", "supportedCapabilities", "", "closed", "ktor-client-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: sH.b  reason: case insensitive filesystem */
public interface C17898b extends Q, Closeable {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: sH.b$a */
    public static final class a {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @f(c = "io.ktor.client.engine.HttpClientEngine$DefaultImpls", f = "HttpClientEngine.kt", l = {91, 100}, m = "executeWithinCallContext")
        /* renamed from: sH.b$a$a  reason: collision with other inner class name */
        static final class C4276a extends d {

            /* renamed from: c  reason: collision with root package name */
            Object f146971c;

            /* renamed from: d  reason: collision with root package name */
            Object f146972d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f146973e;

            /* renamed from: f  reason: collision with root package name */
            int f146974f;

            C4276a(C17164e<? super C4276a> eVar) {
                super(eVar);
            }

            public final Object invokeSuspend(Object obj) {
                this.f146973e = obj;
                this.f146974f |= Integer.MIN_VALUE;
                return a.e((C17898b) null, (C15413d) null, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LAH/g;", "<anonymous>", "(LQJ/Q;)LAH/g;"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.engine.HttpClientEngine$executeWithinCallContext$2", f = "HttpClientEngine.kt", l = {99}, m = "invokeSuspend")
        /* renamed from: sH.b$a$b  reason: collision with other inner class name */
        static final class C4277b extends l implements p<Q, C17164e<? super C15416g>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f146975c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C17898b f146976d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C15413d f146977e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C4277b(C17898b bVar, C15413d dVar, C17164e<? super C4277b> eVar) {
                super(2, eVar);
                this.f146976d = bVar;
                this.f146977e = dVar;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C4277b(this.f146976d, this.f146977e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C15416g> eVar) {
                return ((C4277b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f146975c;
                if (i10 == 0) {
                    y.b(obj);
                    if (!a.f(this.f146976d)) {
                        C17898b bVar = this.f146976d;
                        C15413d dVar = this.f146977e;
                        this.f146975c = 1;
                        obj = bVar.O1(dVar, this);
                        if (obj == f10) {
                            return f10;
                        }
                    } else {
                        throw new C17897a((Throwable) null, 1, (DefaultConstructorMarker) null);
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return obj;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LNH/e;", "", "LAH/c;", "content", "LXH/N;", "<anonymous>", "(LNH/e;Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0})
        @f(c = "io.ktor.client.engine.HttpClientEngine$install$1", f = "HttpClientEngine.kt", l = {70, 82}, m = "invokeSuspend")
        /* renamed from: sH.b$a$c */
        static final class c extends l implements q<e<Object, C15412c>, Object, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f146978c;

            /* renamed from: d  reason: collision with root package name */
            private /* synthetic */ Object f146979d;

            /* renamed from: e  reason: collision with root package name */
            /* synthetic */ Object f146980e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C17746a f146981f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C17898b f146982g;

            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "LXH/N;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
            /* renamed from: sH.b$a$c$a  reason: collision with other inner class name */
            static final class C4278a extends C17544u implements C17642l<Throwable, C16807N> {

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ C17746a f146983c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C15458c f146984d;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C4278a(C17746a aVar, C15458c cVar) {
                    super(1);
                    this.f146983c = aVar;
                    this.f146984d = cVar;
                }

                public final void a(Throwable th2) {
                    if (th2 != null) {
                        this.f146983c.g().a(C15490b.c(), this.f146984d);
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((Throwable) obj);
                    return C16807N.f139792a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            c(C17746a aVar, C17898b bVar, C17164e<? super c> eVar) {
                super(3, eVar);
                this.f146981f = aVar;
                this.f146982g = bVar;
            }

            /* renamed from: i */
            public final Object invoke(e<Object, C15412c> eVar, Object obj, C17164e<? super C16807N> eVar2) {
                c cVar = new c(this.f146981f, this.f146982g, eVar2);
                cVar.f146979d = eVar;
                cVar.f146980e = obj;
                return cVar.invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                e eVar;
                C15413d dVar;
                Object f10 = C17187b.f();
                int i10 = this.f146978c;
                if (i10 == 0) {
                    y.b(obj);
                    e eVar2 = (e) this.f146979d;
                    Object obj2 = this.f146980e;
                    C15412c cVar = new C15412c();
                    cVar.p((C15412c) eVar2.b());
                    Class<Object> cls = Object.class;
                    if (obj2 == null) {
                        cVar.j(FH.c.f134396a);
                        C18068q l10 = P.l(cls);
                        cVar.k(b.c(C18075x.f(l10), P.b(cls), l10));
                    } else if (obj2 instanceof FH.d) {
                        cVar.j(obj2);
                        cVar.k((C16158a) null);
                    } else {
                        cVar.j(obj2);
                        C18068q l11 = P.l(cls);
                        cVar.k(b.c(C18075x.f(l11), P.b(cls), l11));
                    }
                    this.f146981f.g().a(C15490b.b(), cVar);
                    dVar = cVar.b();
                    dVar.a().c(i.c(), this.f146981f.e());
                    i.d(dVar);
                    a.d(this.f146982g, dVar);
                    C17898b bVar = this.f146982g;
                    this.f146979d = eVar2;
                    this.f146980e = dVar;
                    this.f146978c = 1;
                    Object b10 = a.e(bVar, dVar, this);
                    if (b10 == f10) {
                        return f10;
                    }
                    Object obj3 = b10;
                    eVar = eVar2;
                    obj = obj3;
                } else if (i10 == 1) {
                    dVar = (C15413d) this.f146980e;
                    eVar = (e) this.f146979d;
                    y.b(obj);
                } else if (i10 == 2) {
                    y.b(obj);
                    return C16807N.f139792a;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C17777b bVar2 = new C17777b(this.f146981f, dVar, (C15416g) obj);
                C15458c f11 = bVar2.f();
                this.f146981f.g().a(C15490b.e(), f11);
                I0.m(f11.getCoroutineContext()).s(new C4278a(this.f146981f, f11));
                this.f146979d = null;
                this.f146980e = null;
                this.f146978c = 2;
                if (eVar.f(bVar2, this) == f10) {
                    return f10;
                }
                return C16807N.f139792a;
            }
        }

        /* access modifiers changed from: private */
        public static void d(C17898b bVar, C15413d dVar) {
            for (C17901e next : dVar.g()) {
                if (!bVar.b2().contains(next)) {
                    throw new IllegalArgumentException(("Engine doesn't support " + next).toString());
                }
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: AH.d} */
        /* access modifiers changed from: private */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0042  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x007a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x007b A[PHI: r12 
          PHI: (r12v2 java.lang.Object) = (r12v7 java.lang.Object), (r12v1 java.lang.Object) binds: [B:19:0x0078, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.lang.Object e(sH.C17898b r10, AH.C15413d r11, dI.C17164e<? super AH.C15416g> r12) {
            /*
                boolean r0 = r12 instanceof sH.C17898b.a.C4276a
                if (r0 == 0) goto L_0x0013
                r0 = r12
                sH.b$a$a r0 = (sH.C17898b.a.C4276a) r0
                int r1 = r0.f146974f
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f146974f = r1
                goto L_0x0018
            L_0x0013:
                sH.b$a$a r0 = new sH.b$a$a
                r0.<init>(r12)
            L_0x0018:
                java.lang.Object r12 = r0.f146973e
                java.lang.Object r1 = eI.C17187b.f()
                int r2 = r0.f146974f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x0042
                if (r2 == r4) goto L_0x0034
                if (r2 != r3) goto L_0x002c
                XH.y.b(r12)
                goto L_0x007b
            L_0x002c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L_0x0034:
                java.lang.Object r10 = r0.f146972d
                r11 = r10
                AH.d r11 = (AH.C15413d) r11
                java.lang.Object r10 = r0.f146971c
                sH.b r10 = (sH.C17898b) r10
                XH.y.b(r12)
            L_0x0040:
                r4 = r10
                goto L_0x0056
            L_0x0042:
                XH.y.b(r12)
                QJ.F0 r12 = r11.d()
                r0.f146971c = r10
                r0.f146972d = r11
                r0.f146974f = r4
                java.lang.Object r12 = sH.i.b(r10, r12, r0)
                if (r12 != r1) goto L_0x0040
                return r1
            L_0x0056:
                dI.i r12 = (dI.C17168i) r12
                sH.j r10 = new sH.j
                r10.<init>(r12)
                dI.i r5 = r12.plus(r10)
                sH.b$a$b r7 = new sH.b$a$b
                r10 = 0
                r7.<init>(r4, r11, r10)
                r8 = 2
                r9 = 0
                r6 = 0
                QJ.Y r11 = QJ.C16314k.b(r4, r5, r6, r7, r8, r9)
                r0.f146971c = r10
                r0.f146972d = r10
                r0.f146974f = r3
                java.lang.Object r12 = r11.f(r0)
                if (r12 != r1) goto L_0x007b
                return r1
            L_0x007b:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: sH.C17898b.a.e(sH.b, AH.d, dI.e):java.lang.Object");
        }

        /* access modifiers changed from: private */
        public static boolean f(C17898b bVar) {
            F0 f02 = (F0) bVar.getCoroutineContext().get(F0.f137562d0);
            return !(f02 != null ? f02.c() : false);
        }

        public static Set<C17901e<?>> g(C17898b bVar) {
            return g0.d();
        }

        public static void h(C17898b bVar, C17746a aVar) {
            C17542s.j(aVar, "client");
            aVar.n().l(C15417h.f132967h.a(), new c(aVar, bVar, (C17164e<? super c>) null));
        }
    }

    Object O1(C15413d dVar, C17164e<? super C15416g> eVar);

    void a2(C17746a aVar);

    Set<C17901e<?>> b2();

    C17903g getConfig();
}
