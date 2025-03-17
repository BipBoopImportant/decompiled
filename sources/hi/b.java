package hi;

import IC.C13023e;
import IC.C13026h;
import SC.L2;
import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import fm.C11274b;
import gi.C9748c;
import hi.a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.q;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lhi/b;", "Lhi/a;", "Lfm/b;", "getAssemblyServiceUseCase", "<init>", "(Lfm/b;)V", "Lhi/a$a;", "itemDetails", "Lfm/b$a;", "assemblyServiceDetails", "Lgi/c;", "e", "(Lhi/a$a;Lfm/b$a;)Lgi/c;", "Lfm/b$a$a;", "d", "(Lhi/a$a;Lfm/b$a$a;)Lgi/c;", "LTJ/g;", "invoke", "()LTJ/g;", "item", "LXH/N;", "a", "(Lhi/a$a;)V", "Lfm/b;", "LTJ/B;", "b", "LTJ/B;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final C11274b f74123a;

    /* renamed from: b  reason: collision with root package name */
    private final C16505B<a.C1314a> f74124b = C16521S.a(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhi/b$a;", "", "Lfm/b$a;", "assemblyServices", "Lhi/a$a;", "item", "<init>", "(Lfm/b$a;Lhi/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfm/b$a;", "()Lfm/b$a;", "b", "Lhi/a$a;", "()Lhi/a$a;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final C11274b.a f74125a;

        /* renamed from: b  reason: collision with root package name */
        private final a.C1314a f74126b;

        public a(C11274b.a aVar, a.C1314a aVar2) {
            C17542s.j(aVar, "assemblyServices");
            C17542s.j(aVar2, "item");
            this.f74125a = aVar;
            this.f74126b = aVar2;
        }

        public final C11274b.a a() {
            return this.f74125a;
        }

        public final a.C1314a b() {
            return this.f74126b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f74125a, aVar.f74125a) && C17542s.e(this.f74126b, aVar.f74126b);
        }

        public int hashCode() {
            return (this.f74125a.hashCode() * 31) + this.f74126b.hashCode();
        }

        public String toString() {
            C11274b.a aVar = this.f74125a;
            a.C1314a aVar2 = this.f74126b;
            return "AssemblyServiceDetails(assemblyServices=" + aVar + ", item=" + aVar2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.GetAssemblyServiceSectionUseCaseImpl$invoke$$inlined$flatMapLatest$1", f = "GetAssemblyServiceSectionUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: hi.b$b  reason: collision with other inner class name */
    public static final class C1315b extends l implements q<C16533h<? super a>, a.C1314a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f74127c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f74128d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f74129e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ b f74130f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C1315b(C17164e eVar, b bVar) {
            super(3, eVar);
            this.f74130f = bVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super a> hVar, a.C1314a aVar, C17164e<? super C16807N> eVar) {
            C1315b bVar = new C1315b(eVar, this.f74130f);
            bVar.f74128d = hVar;
            bVar.f74129e = aVar;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f74127c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f74128d;
                a.C1314a aVar = (a.C1314a) this.f74129e;
                C16532g dVar = aVar != null ? new d(this.f74130f.f74123a.a(C16877v.e(new C11274b.C2173b(aVar.a(), 1))), aVar) : C16534i.J(null);
                this.f74127c = 1;
                if (C16534i.x(hVar, dVar, this) == f10) {
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
    public static final class c implements C16532g<C9748c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74131a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f74132b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74133a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ b f74134b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.GetAssemblyServiceSectionUseCaseImpl$invoke$$inlined$map$1$2", f = "GetAssemblyServiceSectionUseCase.kt", l = {50}, m = "emit")
            /* renamed from: hi.b$c$a$a  reason: collision with other inner class name */
            public static final class C1316a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74135c;

                /* renamed from: d  reason: collision with root package name */
                int f74136d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74137e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1316a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74137e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74135c = obj;
                    this.f74136d |= Integer.MIN_VALUE;
                    return this.f74137e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, b bVar) {
                this.f74133a = hVar;
                this.f74134b = bVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hi.b.c.a.C1316a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    hi.b$c$a$a r0 = (hi.b.c.a.C1316a) r0
                    int r1 = r0.f74136d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74136d = r1
                    goto L_0x0018
                L_0x0013:
                    hi.b$c$a$a r0 = new hi.b$c$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f74135c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74136d
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
                    TJ.h r7 = r5.f74133a
                    hi.b$a r6 = (hi.b.a) r6
                    if (r6 == 0) goto L_0x0049
                    hi.b r2 = r5.f74134b
                    hi.a$a r4 = r6.b()
                    fm.b$a r6 = r6.a()
                    gi.c r6 = r2.e(r4, r6)
                    goto L_0x004a
                L_0x0049:
                    r6 = 0
                L_0x004a:
                    r0.f74136d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x0053
                    return r1
                L_0x0053:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hi.b.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar, b bVar) {
            this.f74131a = gVar;
            this.f74132b = bVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74131a.collect(new a(hVar, this.f74132b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f74138a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a.C1314a f74139b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f74140a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a.C1314a f74141b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.GetAssemblyServiceSectionUseCaseImpl$invoke$lambda$2$lambda$1$$inlined$map$1$2", f = "GetAssemblyServiceSectionUseCase.kt", l = {50}, m = "emit")
            /* renamed from: hi.b$d$a$a  reason: collision with other inner class name */
            public static final class C1317a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f74142c;

                /* renamed from: d  reason: collision with root package name */
                int f74143d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f74144e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C1317a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f74144e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f74142c = obj;
                    this.f74143d |= Integer.MIN_VALUE;
                    return this.f74144e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, a.C1314a aVar) {
                this.f74140a = hVar;
                this.f74141b = aVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof hi.b.d.a.C1317a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    hi.b$d$a$a r0 = (hi.b.d.a.C1317a) r0
                    int r1 = r0.f74143d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f74143d = r1
                    goto L_0x0018
                L_0x0013:
                    hi.b$d$a$a r0 = new hi.b$d$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f74142c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f74143d
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
                    TJ.h r7 = r5.f74140a
                    fm.b$a r6 = (fm.C11274b.a) r6
                    hi.b$a r2 = new hi.b$a
                    hi.a$a r4 = r5.f74141b
                    r2.<init>(r6, r4)
                    r0.f74143d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hi.b.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar, a.C1314a aVar) {
            this.f74138a = gVar;
            this.f74139b = aVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f74138a.collect(new a(hVar, this.f74139b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    public b(C11274b bVar) {
        C17542s.j(bVar, "getAssemblyServiceUseCase");
        this.f74123a = bVar;
    }

    private final C9748c d(a.C1314a aVar, C11274b.a.C2167a aVar2) {
        Object obj;
        Iterator it = aVar2.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C11274b.a.C2167a.C2168a) obj).b(), aVar.a())) {
                break;
            }
        }
        if (((C11274b.a.C2167a.C2168a) obj) == null) {
            return null;
        }
        return new C9748c((C13023e) null, new C9748c.b(C13026h.b(Oo.b.f84677j0, aVar.b(), aVar2.c()), L2.Available, "available"), C9748c.a.C1281a.f73354a, 1, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: private */
    public final C9748c e(a.C1314a aVar, C11274b.a aVar2) {
        if (C17542s.e(aVar2, C11274b.a.C2172b.f97445a) || C17542s.e(aVar2, C11274b.a.c.f97446a) || C17542s.e(aVar2, C11274b.a.d.f97447a) || C17542s.e(aVar2, C11274b.a.f.f97449a) || (aVar2 instanceof C11274b.a.e)) {
            return null;
        }
        if (aVar2 instanceof C11274b.a.C2167a) {
            return d(aVar, (C11274b.a.C2167a) aVar2);
        }
        throw new t();
    }

    public void a(a.C1314a aVar) {
        a.C1314a value;
        C17542s.j(aVar, "item");
        C16505B<a.C1314a> b10 = this.f74124b;
        do {
            value = b10.getValue();
            a.C1314a aVar2 = value;
        } while (!b10.e(value, aVar));
    }

    public C16532g<C9748c> invoke() {
        return new c(C16534i.g0(this.f74124b, new C1315b((C17164e) null, this)), this);
    }
}
