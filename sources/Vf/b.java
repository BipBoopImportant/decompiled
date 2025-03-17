package Vf;

import Ln.g;
import Ln.h;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Vf.a;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import fm.C11274b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import nI.q;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000e\u001a\u0004\u0018\u00010\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0011\u001a\u0004\u0018\u00010\r2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\"\u0010\n\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b0\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LVf/b;", "LVf/a;", "Lfm/b;", "assemblyServicesUseCase", "LLn/h;", "cartRepository", "<init>", "(Lfm/b;LLn/h;)V", "", "LLn/d;", "cartItems", "Lfm/b$a;", "assemblyServiceDetails", "LVf/a$a;", "d", "(Ljava/util/List;Lfm/b$a;)LVf/a$a;", "Lfm/b$a$a;", "c", "(Ljava/util/List;Lfm/b$a$a;)LVf/a$a;", "LTJ/g;", "invoke", "()LTJ/g;", "a", "Lfm/b;", "b", "LTJ/g;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11274b f64530a;

    /* renamed from: b  reason: collision with root package name */
    private final C16532g<List<Ln.d>> f64531b;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"LVf/b$a;", "", "Lfm/b$a;", "assemblyServices", "", "LLn/d;", "cartItems", "<init>", "(Lfm/b$a;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm/b$a;", "()Lfm/b$a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C11274b.a f64532a;

        /* renamed from: b  reason: collision with root package name */
        private final List<Ln.d> f64533b;

        public a(C11274b.a aVar, List<Ln.d> list) {
            C17542s.j(aVar, "assemblyServices");
            this.f64532a = aVar;
            this.f64533b = list;
        }

        public final C11274b.a a() {
            return this.f64532a;
        }

        public final List<Ln.d> b() {
            return this.f64533b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f64532a, aVar.f64532a) && C17542s.e(this.f64533b, aVar.f64533b);
        }

        public int hashCode() {
            int hashCode = this.f64532a.hashCode() * 31;
            List<Ln.d> list = this.f64533b;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            C11274b.a aVar = this.f64532a;
            List<Ln.d> list = this.f64533b;
            return "AssemblyServiceDetails(assemblyServices=" + aVar + ", cartItems=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LLn/g;", "it", "", "LLn/d;", "<anonymous>", "(LLn/g;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.impl.assembly.usecase.GetAssemblyServicesCartUseCaseImpl$cartItems$1", f = "GetAssemblyServicesCartUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: Vf.b$b  reason: collision with other inner class name */
    static final class C1125b extends l implements p<g, C17164e<? super List<? extends Ln.d>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f64534c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f64535d;

        C1125b(C17164e<? super C1125b> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C1125b bVar = new C1125b(eVar);
            bVar.f64535d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(g gVar, C17164e<? super List<Ln.d>> eVar) {
            return ((C1125b) create(gVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f64534c == 0) {
                y.b(obj);
                g gVar = (g) this.f64535d;
                if (gVar != null) {
                    return gVar.d();
                }
                return null;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.impl.assembly.usecase.GetAssemblyServicesCartUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetAssemblyServicesCartUseCase.kt", l = {189}, m = "invokeSuspend")
    public static final class c extends l implements q<C16533h<? super a>, List<? extends Ln.d>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f64536c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f64537d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f64538e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f64539f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17164e eVar, b bVar) {
            super(3, eVar);
            this.f64539f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super a> hVar, List<? extends Ln.d> list, C17164e<? super C16807N> eVar) {
            c cVar = new c(eVar, this.f64539f);
            cVar.f64537d = hVar;
            cVar.f64538e = list;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C16532g gVar;
            Object f10 = C17187b.f();
            int i10 = this.f64536c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f64537d;
                List list = (List) this.f64538e;
                if (list != null) {
                    C11274b a10 = this.f64539f.f64530a;
                    Iterable<Ln.d> iterable = list;
                    ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                    for (Ln.d dVar : iterable) {
                        arrayList.add(new C11274b.C2173b(dVar.j(), dVar.l()));
                    }
                    gVar = new f(a10.a(arrayList), list);
                } else {
                    gVar = C16534i.J(null);
                }
                this.f64536c = 1;
                if (C16534i.x(hVar, gVar, this) == f10) {
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

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<a.C1122a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f64540a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f64541b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f64542a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f64543b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.impl.assembly.usecase.GetAssemblyServicesCartUseCaseImpl$invoke$$inlined$map$1$2", f = "GetAssemblyServicesCartUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Vf.b$d$a$a  reason: collision with other inner class name */
            public static final class C1126a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f64544c;

                /* renamed from: d  reason: collision with root package name */
                int f64545d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f64546e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1126a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f64546e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f64544c = obj;
                    this.f64545d |= Integer.MIN_VALUE;
                    return this.f64546e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, b bVar) {
                this.f64542a = hVar;
                this.f64543b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Vf.b.d.a.C1126a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    Vf.b$d$a$a r0 = (Vf.b.d.a.C1126a) r0
                    int r1 = r0.f64545d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f64545d = r1
                    goto L_0x0018
                L_0x0013:
                    Vf.b$d$a$a r0 = new Vf.b$d$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f64544c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f64545d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0053
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f64542a
                    Vf.b$a r6 = (Vf.b.a) r6
                    if (r6 == 0) goto L_0x0049
                    Vf.b r2 = r5.f64543b
                    java.util.List r4 = r6.b()
                    fm.b$a r6 = r6.a()
                    Vf.a$a r6 = r2.d(r4, r6)
                    goto L_0x004a
                L_0x0049:
                    r6 = 0
                L_0x004a:
                    r0.f64545d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Vf.b.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar, b bVar) {
            this.f64540a = gVar;
            this.f64541b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f64540a.collect(new a(hVar, this.f64541b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LVf/a$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.impl.assembly.usecase.GetAssemblyServicesCartUseCaseImpl$invoke$3", f = "GetAssemblyServicesCartUseCase.kt", l = {82}, m = "invokeSuspend")
    static final class e extends l implements p<C16533h<? super a.C1122a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f64547c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f64548d;

        e(C17164e<? super e> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f64548d = obj;
            return eVar2;
        }

        public final Object invoke(C16533h<? super a.C1122a> hVar, C17164e<? super C16807N> eVar) {
            return ((e) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f64547c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f64548d;
                this.f64548d = hVar;
                this.f64547c = 1;
                if (hVar.emit(null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f64548d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements C16532g<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f64549a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f64550b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f64551a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f64552b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.cart.impl.assembly.usecase.GetAssemblyServicesCartUseCaseImpl$invoke$lambda$3$lambda$2$$inlined$map$1$2", f = "GetAssemblyServicesCartUseCase.kt", l = {50}, m = "emit")
            /* renamed from: Vf.b$f$a$a  reason: collision with other inner class name */
            public static final class C1127a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f64553c;

                /* renamed from: d  reason: collision with root package name */
                int f64554d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f64555e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1127a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f64555e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f64553c = obj;
                    this.f64554d |= Integer.MIN_VALUE;
                    return this.f64555e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, List list) {
                this.f64551a = hVar;
                this.f64552b = list;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof Vf.b.f.a.C1127a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    Vf.b$f$a$a r0 = (Vf.b.f.a.C1127a) r0
                    int r1 = r0.f64554d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f64554d = r1
                    goto L_0x0018
                L_0x0013:
                    Vf.b$f$a$a r0 = new Vf.b$f$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f64553c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f64554d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x0048
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f64551a
                    fm.b$a r6 = (fm.C11274b.a) r6
                    Vf.b$a r2 = new Vf.b$a
                    java.util.List r4 = r5.f64552b
                    r2.<init>(r6, r4)
                    r0.f64554d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: Vf.b.f.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public f(C16532g gVar, List list) {
            this.f64549a = gVar;
            this.f64550b = list;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f64549a.collect(new a(hVar, this.f64550b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public b(C11274b bVar, h hVar) {
        C17542s.j(bVar, "assemblyServicesUseCase");
        C17542s.j(hVar, "cartRepository");
        this.f64530a = bVar;
        this.f64531b = C16534i.N(hVar.m(), new C1125b((C17164e<? super C1125b>) null));
    }

    private final a.C1122a c(List<Ln.d> list, C11274b.a.C2167a aVar) {
        Ln.d dVar;
        Object obj;
        ArrayList arrayList = new ArrayList();
        Iterator it = aVar.b().iterator();
        while (true) {
            a.C1122a.C1123a.C1124a aVar2 = null;
            if (!it.hasNext()) {
                break;
            }
            C11274b.a.C2167a.C2168a aVar3 = (C11274b.a.C2167a.C2168a) it.next();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (C17542s.e(((Ln.d) obj).j(), aVar3.b())) {
                        break;
                    }
                }
                dVar = (Ln.d) obj;
            } else {
                dVar = null;
            }
            if (dVar != null) {
                aVar2 = new a.C1122a.C1123a.C1124a(dVar.i().e(), dVar.j(), dVar.k(), dVar.l(), dVar.i().i(), dVar.i().h(), dVar.i().g(), aVar3.a());
            }
            if (aVar2 != null) {
                arrayList.add(aVar2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a.C1122a.C1123a(aVar.c(), arrayList, aVar.a());
    }

    /* access modifiers changed from: private */
    public final a.C1122a d(List<Ln.d> list, C11274b.a aVar) {
        if (C17542s.e(aVar, C11274b.a.c.f97446a) || C17542s.e(aVar, C11274b.a.C2172b.f97445a) || C17542s.e(aVar, C11274b.a.d.f97447a) || C17542s.e(aVar, C11274b.a.f.f97449a) || (aVar instanceof C11274b.a.e)) {
            return null;
        }
        if (aVar instanceof C11274b.a.C2167a) {
            return c(list, (C11274b.a.C2167a) aVar);
        }
        throw new t();
    }

    public C16532g<a.C1122a> invoke() {
        return C16534i.s(C16534i.S(new d(C16534i.g0(this.f64531b, new c((C17164e) null, this)), this), new e((C17164e<? super e>) null)));
    }
}
