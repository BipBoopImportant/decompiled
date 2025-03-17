package hi;

import QJ.M;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import gi.O;
import hi.g;
import jB.C14613b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lhi/h;", "Lhi/g;", "Lbi/a;", "pipRepository", "LjB/b;", "shoppingListRepository", "LQJ/M;", "ioDispatcher", "<init>", "(Lbi/a;LjB/b;LQJ/M;)V", "", "itemNo", "Lgi/O;", "type", "LTJ/g;", "Lhi/g$a;", "a", "(Ljava/lang/String;Lgi/O;)LTJ/g;", "Lbi/a;", "b", "LjB/b;", "c", "LQJ/M;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final bi.a f74181a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14613b f74182b;

    /* renamed from: c  reason: collision with root package name */
    private final M f74183c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTJ/h;", "Lhi/g$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.GetRecommendationsUseCaseImpl$invoke$1", f = "GetRecommendationsUseCase.kt", l = {39, 40, 42}, m = "invokeSuspend")
    static final class a extends l implements p<C16533h<? super g.a>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f74184c;

        /* renamed from: d  reason: collision with root package name */
        Object f74185d;

        /* renamed from: e  reason: collision with root package name */
        Object f74186e;

        /* renamed from: f  reason: collision with root package name */
        int f74187f;

        /* renamed from: g  reason: collision with root package name */
        int f74188g;

        /* renamed from: h  reason: collision with root package name */
        int f74189h;

        /* renamed from: i  reason: collision with root package name */
        int f74190i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f74191j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ O f74192k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ h f74193l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f74194m;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: hi.h$a$a  reason: collision with other inner class name */
        public /* synthetic */ class C1320a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f74195a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    gi.O[] r0 = gi.O.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    gi.O r1 = gi.O.RECOMMENDATION     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    gi.O r1 = gi.O.MORE_LIKE_THIS     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f74195a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: hi.h.a.C1320a.<clinit>():void");
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements C16532g<g.a> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16532g f74196a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ List f74197b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            /* renamed from: hi.h$a$b$a  reason: collision with other inner class name */
            public static final class C1321a<T> implements C16533h {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ C16533h f74198a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ List f74199b;

                @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
                @f(c = "com.ingka.ikea.app.productinformationpage.v2.model.viewmodel.usecase.GetRecommendationsUseCaseImpl$invoke$1$invokeSuspend$$inlined$map$1$2", f = "GetRecommendationsUseCase.kt", l = {50}, m = "emit")
                /* renamed from: hi.h$a$b$a$a  reason: collision with other inner class name */
                public static final class C1322a extends d {

                    /* renamed from: c  reason: collision with root package name */
                    /* synthetic */ Object f74200c;

                    /* renamed from: d  reason: collision with root package name */
                    int f74201d;

                    /* renamed from: e  reason: collision with root package name */
                    final /* synthetic */ C1321a f74202e;

                    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                    public C1322a(C1321a aVar, C17164e eVar) {
                        super(eVar);
                        this.f74202e = aVar;
                    }

                    public final Object invokeSuspend(Object obj) {
                        this.f74200c = obj;
                        this.f74201d |= Integer.MIN_VALUE;
                        return this.f74202e.emit((Object) null, this);
                    }
                }

                public C1321a(C16533h hVar, List list) {
                    this.f74198a = hVar;
                    this.f74199b = list;
                }

                /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
                /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof hi.h.a.b.C1321a.C1322a
                        if (r0 == 0) goto L_0x0013
                        r0 = r7
                        hi.h$a$b$a$a r0 = (hi.h.a.b.C1321a.C1322a) r0
                        int r1 = r0.f74201d
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L_0x0013
                        int r1 = r1 - r2
                        r0.f74201d = r1
                        goto L_0x0018
                    L_0x0013:
                        hi.h$a$b$a$a r0 = new hi.h$a$b$a$a
                        r0.<init>(r5, r7)
                    L_0x0018:
                        java.lang.Object r7 = r0.f74200c
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f74201d
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
                        TJ.h r7 = r5.f74198a
                        java.util.Set r6 = (java.util.Set) r6
                        hi.g$a r2 = new hi.g$a
                        java.util.List r4 = r5.f74199b
                        r2.<init>(r4, r6)
                        r0.f74201d = r3
                        java.lang.Object r6 = r7.emit(r2, r0)
                        if (r6 != r1) goto L_0x0048
                        return r1
                    L_0x0048:
                        XH.N r6 = XH.C16807N.f139792a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: hi.h.a.b.C1321a.emit(java.lang.Object, dI.e):java.lang.Object");
                }
            }

            public b(C16532g gVar, List list) {
                this.f74196a = gVar;
                this.f74197b = list;
            }

            public Object collect(C16533h hVar, C17164e eVar) {
                Object collect = this.f74196a.collect(new C1321a(hVar, this.f74197b), eVar);
                return collect == C17187b.f() ? collect : C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(O o10, h hVar, String str, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f74192k = o10;
            this.f74193l = hVar;
            this.f74194m = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f74192k, this.f74193l, this.f74194m, eVar);
            aVar.f74191j = obj;
            return aVar;
        }

        public final Object invoke(C16533h<? super g.a> hVar, C17164e<? super C16807N> eVar) {
            return ((a) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: TJ.h} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x00bb A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r7.f74190i
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0046
                if (r1 == r4) goto L_0x003a
                if (r1 == r3) goto L_0x002e
                if (r1 != r2) goto L_0x0026
                java.lang.Object r0 = r7.f74186e
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r7.f74185d
                TJ.g r0 = (TJ.C16532g) r0
                java.lang.Object r0 = r7.f74184c
                java.util.List r0 = (java.util.List) r0
                java.lang.Object r0 = r7.f74191j
                TJ.h r0 = (TJ.C16533h) r0
                XH.y.b(r8)
                goto L_0x00bc
            L_0x0026:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L_0x002e:
                java.lang.Object r1 = r7.f74184c
                gi.O r1 = (gi.O) r1
                java.lang.Object r1 = r7.f74191j
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r8)
                goto L_0x0073
            L_0x003a:
                java.lang.Object r1 = r7.f74184c
                gi.O r1 = (gi.O) r1
                java.lang.Object r1 = r7.f74191j
                TJ.h r1 = (TJ.C16533h) r1
                XH.y.b(r8)
                goto L_0x0093
            L_0x0046:
                XH.y.b(r8)
                java.lang.Object r8 = r7.f74191j
                r1 = r8
                TJ.h r1 = (TJ.C16533h) r1
                gi.O r8 = r7.f74192k
                int[] r5 = hi.h.a.C1320a.f74195a
                int r6 = r8.ordinal()
                r5 = r5[r6]
                if (r5 == r4) goto L_0x007c
                if (r5 != r3) goto L_0x0076
                hi.h r4 = r7.f74193l
                bi.a r4 = r4.f74181a
                java.lang.String r6 = r7.f74194m
                r7.f74191j = r1
                r7.f74184c = r8
                r7.f74187f = r5
                r7.f74190i = r3
                java.lang.Object r8 = r4.b(r6, r7)
                if (r8 != r0) goto L_0x0073
                return r0
            L_0x0073:
                java.util.List r8 = (java.util.List) r8
                goto L_0x0095
            L_0x0076:
                XH.t r8 = new XH.t
                r8.<init>()
                throw r8
            L_0x007c:
                hi.h r3 = r7.f74193l
                bi.a r3 = r3.f74181a
                java.lang.String r6 = r7.f74194m
                r7.f74191j = r1
                r7.f74184c = r8
                r7.f74187f = r5
                r7.f74190i = r4
                java.lang.Object r8 = r3.d(r6, r7)
                if (r8 != r0) goto L_0x0093
                return r0
            L_0x0093:
                java.util.List r8 = (java.util.List) r8
            L_0x0095:
                hi.h r3 = r7.f74193l
                jB.b r3 = r3.f74182b
                TJ.g r3 = r3.f()
                hi.h$a$b r4 = new hi.h$a$b
                r4.<init>(r3, r8)
                r7.f74191j = r1
                r7.f74184c = r8
                r7.f74185d = r3
                r7.f74186e = r3
                r8 = 0
                r7.f74187f = r8
                r7.f74188g = r8
                r7.f74189h = r8
                r7.f74190i = r2
                java.lang.Object r8 = TJ.C16534i.x(r1, r4, r7)
                if (r8 != r0) goto L_0x00bc
                return r0
            L_0x00bc:
                XH.N r8 = XH.C16807N.f139792a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: hi.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(bi.a aVar, C14613b bVar, M m10) {
        C17542s.j(aVar, "pipRepository");
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(m10, "ioDispatcher");
        this.f74181a = aVar;
        this.f74182b = bVar;
        this.f74183c = m10;
    }

    public C16532g<g.a> a(String str, O o10) {
        C17542s.j(str, "itemNo");
        C17542s.j(o10, "type");
        return C16534i.L(C16534i.H(new a(o10, this, str, (C17164e<? super a>) null)), this.f74183c);
    }
}
