package Ko;

import Mp.d;
import QJ.M;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import jB.C14613b;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0012B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0018¨\u0006\u0019"}, d2 = {"LKo/a;", "", "LIp/a;", "commercialContentRepository", "LIl/a;", "appConfigApi", "LjB/b;", "shoppingListRepository", "LQJ/M;", "ioDispatcher", "<init>", "(LIp/a;LIl/a;LjB/b;LQJ/M;)V", "", "storyId", "LTJ/g;", "LKo/a$a;", "d", "(Ljava/lang/String;)LTJ/g;", "a", "LIp/a;", "b", "LIl/a;", "c", "LjB/b;", "LQJ/M;", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Ip.a f82894a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Il.a f82895b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C14613b f82896c;

    /* renamed from: d  reason: collision with root package name */
    private final M f82897d;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"LKo/a$a;", "", "LMp/d;", "story", "Lkp/d;", "currencyConfig", "", "", "allProductNumbersInShoppingLists", "<init>", "(LMp/d;Lkp/d;Ljava/util/Set;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LMp/d;", "c", "()LMp/d;", "b", "Lkp/d;", "()Lkp/d;", "Ljava/util/Set;", "()Ljava/util/Set;", "commercialcontent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Ko.a$a  reason: collision with other inner class name */
    public static final class C1642a {

        /* renamed from: a  reason: collision with root package name */
        private final d f82898a;

        /* renamed from: b  reason: collision with root package name */
        private final C11522d f82899b;

        /* renamed from: c  reason: collision with root package name */
        private final Set<String> f82900c;

        public C1642a(d dVar, C11522d dVar2, Set<String> set) {
            C17542s.j(dVar, "story");
            C17542s.j(dVar2, "currencyConfig");
            C17542s.j(set, "allProductNumbersInShoppingLists");
            this.f82898a = dVar;
            this.f82899b = dVar2;
            this.f82900c = set;
        }

        public final Set<String> a() {
            return this.f82900c;
        }

        public final C11522d b() {
            return this.f82899b;
        }

        public final d c() {
            return this.f82898a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1642a)) {
                return false;
            }
            C1642a aVar = (C1642a) obj;
            return C17542s.e(this.f82898a, aVar.f82898a) && C17542s.e(this.f82899b, aVar.f82899b) && C17542s.e(this.f82900c, aVar.f82900c);
        }

        public int hashCode() {
            return (((this.f82898a.hashCode() * 31) + this.f82899b.hashCode()) * 31) + this.f82900c.hashCode();
        }

        public String toString() {
            d dVar = this.f82898a;
            C11522d dVar2 = this.f82899b;
            Set<String> set = this.f82900c;
            return "CommercialContentData(story=" + dVar + ", currencyConfig=" + dVar2 + ", allProductNumbersInShoppingLists=" + set + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "LKo/a$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.commercialcontent.impl.model.CommercialContentUseCase$invoke$1", f = "CommercialContentUseCase.kt", l = {28, 29}, m = "invokeSuspend")
    static final class b extends l implements p<C16533h<? super C1642a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f82901c;

        /* renamed from: d  reason: collision with root package name */
        Object f82902d;

        /* renamed from: e  reason: collision with root package name */
        Object f82903e;

        /* renamed from: f  reason: collision with root package name */
        Object f82904f;

        /* renamed from: g  reason: collision with root package name */
        int f82905g;

        /* renamed from: h  reason: collision with root package name */
        int f82906h;

        /* renamed from: i  reason: collision with root package name */
        int f82907i;

        /* renamed from: j  reason: collision with root package name */
        int f82908j;

        /* renamed from: k  reason: collision with root package name */
        private /* synthetic */ Object f82909k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ a f82910l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f82911m;

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Ko.a$b$a  reason: collision with other inner class name */
        public static final class C1643a implements C16532g<C1642a> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f82912a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ d f82913b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ a f82914c;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: Ko.a$b$a$a  reason: collision with other inner class name */
            public static final class C1644a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f82915a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ d f82916b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ a f82917c;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.ingka.ikea.commercialcontent.impl.model.CommercialContentUseCase$invoke$1$invokeSuspend$$inlined$map$1$2", f = "CommercialContentUseCase.kt", l = {50}, m = "emit")
                /* renamed from: Ko.a$b$a$a$a  reason: collision with other inner class name */
                public static final class C1645a extends kotlin.coroutines.jvm.internal.d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f82918c;

                    /* renamed from: d  reason: collision with root package name */
                    int f82919d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C1644a f82920e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C1645a(C1644a aVar, C17164e eVar) {
                        super(eVar);
                        this.f82920e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f82918c = obj;
                        this.f82919d |= Integer.MIN_VALUE;
                        return this.f82920e.emit((Object) null, this);
                    }
                }

                public C1644a(C16533h hVar, d dVar, a aVar) {
                    this.f82915a = hVar;
                    this.f82916b = dVar;
                    this.f82917c = aVar;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r7, dI.C17164e r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof Ko.a.b.C1643a.C1644a.C1645a
                        if (r0 == 0) goto L_0x0013
                        r0 = r8
                        Ko.a$b$a$a$a r0 = (Ko.a.b.C1643a.C1644a.C1645a) r0
                        int r1 = r0.f82919d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f82919d = r1
                        goto L_0x0018
                    L_0x0013:
                        Ko.a$b$a$a$a r0 = new Ko.a$b$a$a$a
                        r0.<init>(r6, r8)
                    L_0x0018:
                        java.lang.Object r8 = r0.f82918c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f82919d
                        r3 = 1
                        if (r2 == 0) goto L_0x0031
                        if (r2 != r3) goto L_0x0029
                        XH.y.b(r8)
                        goto L_0x0052
                    L_0x0029:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L_0x0031:
                        XH.y.b(r8)
                        TJ.h r8 = r6.f82915a
                        java.util.Set r7 = (java.util.Set) r7
                        Ko.a$a r2 = new Ko.a$a
                        Mp.d r4 = r6.f82916b
                        Ko.a r5 = r6.f82917c
                        Il.a r5 = r5.f82895b
                        kp.d r5 = r5.s()
                        r2.<init>(r4, r5, r7)
                        r0.f82919d = r3
                        java.lang.Object r7 = r8.emit(r2, r0)
                        if (r7 != r1) goto L_0x0052
                        return r1
                    L_0x0052:
                        XH.N r7 = XH.C16807N.f139792a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: Ko.a.b.C1643a.C1644a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public C1643a(C16532g gVar, d dVar, a aVar) {
                this.f82912a = gVar;
                this.f82913b = dVar;
                this.f82914c = aVar;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f82912a.collect(new C1644a(hVar, this.f82913b, this.f82914c), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(a aVar, String str, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f82910l = aVar;
            this.f82911m = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f82910l, this.f82911m, eVar);
            bVar.f82909k = obj;
            return bVar;
        }

        public final Object invoke(C16533h<? super C1642a> hVar, C17164e<? super C16807N> eVar) {
            return ((b) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r6.f82908j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L_0x0036
                if (r1 == r3) goto L_0x002e
                if (r1 != r2) goto L_0x0026
                java.lang.Object r0 = r6.f82904f
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r6.f82903e
                Ko.a r0 = (Ko.a) r0
                java.lang.Object r0 = r6.f82902d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r6.f82901c
                Mp.d r0 = (Mp.d) r0
                java.lang.Object r0 = r6.f82909k
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r7)
                goto L_0x007e
            L_0x0026:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L_0x002e:
                java.lang.Object r1 = r6.f82909k
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r7)
                goto L_0x0051
            L_0x0036:
                XH.y.b(r7)
                java.lang.Object r7 = r6.f82909k
                r1 = r7
                TJ.h r1 = (TJ.C16533h) r1
                Ko.a r7 = r6.f82910l
                Ip.a r7 = r7.f82894a
                java.lang.String r4 = r6.f82911m
                r6.f82909k = r1
                r6.f82908j = r3
                java.lang.Object r7 = r7.a(r4, r6)
                if (r7 != r0) goto L_0x0051
                return r0
            L_0x0051:
                Mp.d r7 = (Mp.d) r7
                Ko.a r3 = r6.f82910l
                jB.b r3 = r3.f82896c
                TJ.g r3 = r3.f()
                Ko.a r4 = r6.f82910l
                Ko.a$b$a r5 = new Ko.a$b$a
                r5.<init>(r3, r7, r4)
                r6.f82909k = r1
                r6.f82901c = r7
                r6.f82902d = r3
                r6.f82903e = r4
                r6.f82904f = r3
                r7 = 0
                r6.f82905g = r7
                r6.f82906h = r7
                r6.f82907i = r7
                r6.f82908j = r2
                java.lang.Object r7 = TJ.C16534i.x(r1, r5, r6)
                if (r7 != r0) goto L_0x007e
                return r0
            L_0x007e:
                XH.N r7 = XH.C16807N.f139792a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: Ko.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public a(Ip.a aVar, Il.a aVar2, C14613b bVar, M m10) {
        C17542s.j(aVar, "commercialContentRepository");
        C17542s.j(aVar2, "appConfigApi");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(m10, "ioDispatcher");
        this.f82894a = aVar;
        this.f82895b = aVar2;
        this.f82896c = bVar;
        this.f82897d = m10;
    }

    public final C16532g<C1642a> d(String str) {
        C17542s.j(str, "storyId");
        return C16534i.L(C16534i.H(new b(this, str, (C17164e<? super b>) null)), this.f82897d);
    }
}
