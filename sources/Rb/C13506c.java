package RB;

import QJ.Q;
import QJ.S;
import RB.C13505b;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Wk.d;
import Wk.e;
import XH.C16796C;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import YH.C16877v;
import YH.X;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;
import tI.C17978n;
import tf.C10253a;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\u0013\u001a\u00020\u0012H@¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\u001b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LRB/c;", "LRB/b;", "LWk/d;", "stockRepository", "LWk/b;", "availabilityRepository", "Ltf/a;", "killSwitchRepository", "<init>", "(LWk/d;LWk/b;Ltf/a;)V", "", "LWk/f;", "inStockList", "LWk/e$a$b;", "clickAndCollectList", "LRB/b$a;", "g", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "", "itemNo", "e", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "LWk/e$b;", "availabilities", "", "f", "(LWk/e$b;)Ljava/lang/Boolean;", "LTJ/g;", "a", "(Ljava/lang/String;)LTJ/g;", "LWk/d;", "b", "LWk/b;", "c", "Ltf/a;", "storepicker-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RB.c  reason: case insensitive filesystem */
public final class C13506c implements C13505b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final d f115129a;

    /* renamed from: b  reason: collision with root package name */
    private final Wk.b f115130b;

    /* renamed from: c  reason: collision with root package name */
    private final C10253a f115131c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: RB.c$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f115132a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.app.stockinfo.network.d[] r0 = com.ingka.ikea.app.stockinfo.network.d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.stockinfo.network.d r1 = com.ingka.ikea.app.stockinfo.network.d.OUT_OF_STOCK     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.stockinfo.network.d r1 = com.ingka.ikea.app.stockinfo.network.d.LOW_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.app.stockinfo.network.d r1 = com.ingka.ikea.app.stockinfo.network.d.MEDIUM_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.app.stockinfo.network.d r1 = com.ingka.ikea.app.stockinfo.network.d.HIGH_IN_STOCK     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.app.stockinfo.network.d r1 = com.ingka.ikea.app.stockinfo.network.d.OTHER     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                com.ingka.ikea.app.stockinfo.network.d r1 = com.ingka.ikea.app.stockinfo.network.d.EMPTY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f115132a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: RB.C13506c.a.<clinit>():void");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStockDataUseCaseImpl", f = "GetStockDataUseCase.kt", l = {136}, m = "fetchStoresAvailabilityOrEmpty")
    /* renamed from: RB.c$b */
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: c  reason: collision with root package name */
        Object f115133c;

        /* renamed from: d  reason: collision with root package name */
        Object f115134d;

        /* renamed from: e  reason: collision with root package name */
        Object f115135e;

        /* renamed from: f  reason: collision with root package name */
        Object f115136f;

        /* renamed from: g  reason: collision with root package name */
        Object f115137g;

        /* renamed from: h  reason: collision with root package name */
        Object f115138h;

        /* renamed from: i  reason: collision with root package name */
        Object f115139i;

        /* renamed from: j  reason: collision with root package name */
        Object f115140j;

        /* renamed from: k  reason: collision with root package name */
        Object f115141k;

        /* renamed from: l  reason: collision with root package name */
        Object f115142l;

        /* renamed from: m  reason: collision with root package name */
        Object f115143m;

        /* renamed from: n  reason: collision with root package name */
        int f115144n;

        /* renamed from: o  reason: collision with root package name */
        int f115145o;

        /* renamed from: p  reason: collision with root package name */
        int f115146p;

        /* renamed from: q  reason: collision with root package name */
        int f115147q;

        /* renamed from: r  reason: collision with root package name */
        int f115148r;

        /* renamed from: s  reason: collision with root package name */
        /* synthetic */ Object f115149s;

        /* renamed from: t  reason: collision with root package name */
        final /* synthetic */ C13506c f115150t;

        /* renamed from: u  reason: collision with root package name */
        int f115151u;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C13506c cVar, C17164e<? super b> eVar) {
            super(eVar);
            this.f115150t = cVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f115149s = obj;
            this.f115151u |= Integer.MIN_VALUE;
            return this.f115150t.e((String) null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LTJ/h;", "", "LRB/b$a;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStockDataUseCaseImpl$invoke$1", f = "GetStockDataUseCase.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: RB.c$c  reason: collision with other inner class name */
    static final class C2828c extends l implements p<C16533h<? super List<? extends C13505b.a>>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f115152c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f115153d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C13506c f115154e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f115155f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStockDataUseCaseImpl$invoke$1$1", f = "GetStockDataUseCase.kt", l = {73, 86, 87, 93}, m = "invokeSuspend")
        /* renamed from: RB.c$c$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f115156c;

            /* renamed from: d  reason: collision with root package name */
            Object f115157d;

            /* renamed from: e  reason: collision with root package name */
            Object f115158e;

            /* renamed from: f  reason: collision with root package name */
            Object f115159f;

            /* renamed from: g  reason: collision with root package name */
            Object f115160g;

            /* renamed from: h  reason: collision with root package name */
            int f115161h;

            /* renamed from: i  reason: collision with root package name */
            private /* synthetic */ Object f115162i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ C16533h<List<C13505b.a>> f115163j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ C13506c f115164k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ String f115165l;

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "LWk/e$a$b;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
            @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStockDataUseCaseImpl$invoke$1$1$clickAndCollectListDeferred$1", f = "GetStockDataUseCase.kt", l = {83}, m = "invokeSuspend")
            /* renamed from: RB.c$c$a$a  reason: collision with other inner class name */
            static final class C2829a extends l implements p<Q, C17164e<? super List<? extends e.a.b>>, Object> {

                /* renamed from: c  reason: collision with root package name */
                int f115166c;

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ C13506c f115167d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ String f115168e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C2829a(C13506c cVar, String str, C17164e<? super C2829a> eVar) {
                    super(2, eVar);
                    this.f115167d = cVar;
                    this.f115168e = str;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    return new C2829a(this.f115167d, this.f115168e, eVar);
                }

                public final Object invoke(Q q10, C17164e<? super List<e.a.b>> eVar) {
                    return ((C2829a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                public final Object invokeSuspend(Object obj) {
                    Object f10 = C17187b.f();
                    int i10 = this.f115166c;
                    if (i10 == 0) {
                        y.b(obj);
                        C13506c cVar = this.f115167d;
                        String str = this.f115168e;
                        this.f115166c = 1;
                        obj = cVar.e(str, this);
                        if (obj == f10) {
                            return f10;
                        }
                    } else if (i10 == 1) {
                        y.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    return obj;
                }
            }

            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "LWk/f;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
            @f(c = "com.ingka.ikea.store.storepicker.impl.usecase.GetStockDataUseCaseImpl$invoke$1$1$inStockListDeferred$1", f = "GetStockDataUseCase.kt", l = {76}, m = "invokeSuspend")
            /* renamed from: RB.c$c$a$b */
            static final class b extends l implements p<Q, C17164e<? super List<? extends Wk.f>>, Object> {

                /* renamed from: c  reason: collision with root package name */
                Object f115169c;

                /* renamed from: d  reason: collision with root package name */
                Object f115170d;

                /* renamed from: e  reason: collision with root package name */
                Object f115171e;

                /* renamed from: f  reason: collision with root package name */
                Object f115172f;

                /* renamed from: g  reason: collision with root package name */
                Object f115173g;

                /* renamed from: h  reason: collision with root package name */
                Object f115174h;

                /* renamed from: i  reason: collision with root package name */
                Object f115175i;

                /* renamed from: j  reason: collision with root package name */
                Object f115176j;

                /* renamed from: k  reason: collision with root package name */
                Object f115177k;

                /* renamed from: l  reason: collision with root package name */
                int f115178l;

                /* renamed from: m  reason: collision with root package name */
                int f115179m;

                /* renamed from: n  reason: collision with root package name */
                int f115180n;

                /* renamed from: o  reason: collision with root package name */
                int f115181o;

                /* renamed from: p  reason: collision with root package name */
                int f115182p;

                /* renamed from: q  reason: collision with root package name */
                int f115183q;

                /* renamed from: r  reason: collision with root package name */
                private /* synthetic */ Object f115184r;

                /* renamed from: s  reason: collision with root package name */
                final /* synthetic */ C13506c f115185s;

                /* renamed from: t  reason: collision with root package name */
                final /* synthetic */ String f115186t;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                b(C13506c cVar, String str, C17164e<? super b> eVar) {
                    super(2, eVar);
                    this.f115185s = cVar;
                    this.f115186t = str;
                }

                public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                    b bVar = new b(this.f115185s, this.f115186t, eVar);
                    bVar.f115184r = obj;
                    return bVar;
                }

                public final Object invoke(Q q10, C17164e<? super List<Wk.f>> eVar) {
                    return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
                }

                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.util.ArrayList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: java.util.ArrayList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: java.util.ArrayList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: qv.b} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.util.ArrayList} */
                /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.util.ArrayList} */
                /* JADX WARNING: Multi-variable type inference failed */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final java.lang.Object invokeSuspend(java.lang.Object r20) {
                    /*
                        r19 = this;
                        r0 = r19
                        java.lang.Object r1 = eI.C17187b.f()
                        int r2 = r0.f115183q
                        r3 = 1
                        if (r2 == 0) goto L_0x0040
                        if (r2 != r3) goto L_0x0038
                        java.lang.Object r1 = r0.f115176j
                        java.util.Iterator r1 = (java.util.Iterator) r1
                        java.lang.Object r1 = r0.f115175i
                        java.lang.Iterable r1 = (java.lang.Iterable) r1
                        java.lang.Object r1 = r0.f115174h
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r1 = r0.f115173g
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r1 = r0.f115172f
                        qv.e r1 = (qv.e) r1
                        java.lang.Object r1 = r0.f115171e
                        QJ.Q r1 = (QJ.Q) r1
                        java.lang.Object r1 = r0.f115170d
                        java.lang.String r1 = (java.lang.String) r1
                        java.lang.Object r1 = r0.f115169c
                        QJ.Q r1 = (QJ.Q) r1
                        java.lang.Object r1 = r0.f115184r
                        QJ.Q r1 = (QJ.Q) r1
                        XH.y.b(r20)
                        r2 = r20
                        goto L_0x0141
                    L_0x0038:
                        java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                        java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                        r1.<init>(r2)
                        throw r1
                    L_0x0040:
                        XH.y.b(r20)
                        java.lang.Object r2 = r0.f115184r
                        QJ.Q r2 = (QJ.Q) r2
                        java.lang.String r4 = r0.f115186t
                        qv.e r11 = qv.e.DEBUG
                        qv.d r5 = qv.d.f102012a
                        java.util.List r5 = r5.a()
                        java.lang.Iterable r5 = (java.lang.Iterable) r5
                        java.util.ArrayList r12 = new java.util.ArrayList
                        r12.<init>()
                        java.util.Iterator r5 = r5.iterator()
                    L_0x005c:
                        boolean r6 = r5.hasNext()
                        r13 = 0
                        if (r6 == 0) goto L_0x0074
                        java.lang.Object r6 = r5.next()
                        r7 = r6
                        qv.b r7 = (qv.C11819b) r7
                        boolean r7 = r7.b(r11, r13)
                        if (r7 == 0) goto L_0x005c
                        r12.add(r6)
                        goto L_0x005c
                    L_0x0074:
                        java.util.Iterator r14 = r12.iterator()
                        r15 = 0
                        r7 = r12
                        r5 = r15
                        r6 = r5
                    L_0x007c:
                        boolean r8 = r14.hasNext()
                        if (r8 == 0) goto L_0x0112
                        java.lang.Object r16 = r14.next()
                        r7 = r16
                        qv.b r7 = (qv.C11819b) r7
                        r9 = 0
                        if (r5 != 0) goto L_0x00ac
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        r8.<init>()
                        java.lang.String r10 = "Fetching store stock status of "
                        r8.append(r10)
                        r8.append(r4)
                        java.lang.String r8 = r8.toString()
                        java.lang.String r8 = qv.C11818a.a(r8, r9)
                        if (r8 != 0) goto L_0x00a8
                        r7 = r16
                        goto L_0x0112
                    L_0x00a8:
                        java.lang.String r5 = qv.C11820c.a(r8)
                    L_0x00ac:
                        r17 = r5
                        if (r6 != 0) goto L_0x00fe
                        java.lang.Class r5 = r2.getClass()
                        java.lang.String r5 = r5.getName()
                        kotlin.jvm.internal.C17542s.g(r5)
                        r6 = 36
                        r8 = 2
                        java.lang.String r6 = HJ.C15854t.s1(r5, r6, r15, r8, r15)
                        r10 = 46
                        java.lang.String r6 = HJ.C15854t.o1(r6, r10, r15, r8, r15)
                        int r8 = r6.length()
                        if (r8 != 0) goto L_0x00cf
                        goto L_0x00d5
                    L_0x00cf:
                        java.lang.String r5 = "Kt"
                        java.lang.String r5 = HJ.C15854t.P0(r6, r5)
                    L_0x00d5:
                        java.lang.Thread r6 = java.lang.Thread.currentThread()
                        java.lang.String r6 = r6.getName()
                        java.lang.String r8 = "main"
                        boolean r6 = HJ.C15854t.b0(r6, r8, r3)
                        if (r6 == 0) goto L_0x00e8
                        java.lang.String r6 = "m"
                        goto L_0x00ea
                    L_0x00e8:
                        java.lang.String r6 = "b"
                    L_0x00ea:
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        r8.<init>()
                        r8.append(r6)
                        java.lang.String r6 = "|"
                        r8.append(r6)
                        r8.append(r5)
                        java.lang.String r6 = r8.toString()
                    L_0x00fe:
                        r18 = r6
                        r8 = 0
                        r5 = r7
                        r6 = r11
                        r7 = r18
                        r10 = r17
                        r5.a(r6, r7, r8, r9, r10)
                        r7 = r16
                        r5 = r17
                        r6 = r18
                        goto L_0x007c
                    L_0x0112:
                        RB.c r8 = r0.f115185s
                        Wk.d r8 = r8.f115129a
                        java.lang.String r9 = r0.f115186t
                        r0.f115184r = r2
                        r0.f115169c = r2
                        r0.f115170d = r4
                        r0.f115171e = r2
                        r0.f115172f = r11
                        r0.f115173g = r5
                        r0.f115174h = r6
                        r0.f115175i = r12
                        r0.f115176j = r14
                        r0.f115177k = r7
                        r0.f115178l = r13
                        r0.f115179m = r13
                        r0.f115180n = r13
                        r0.f115181o = r13
                        r0.f115182p = r13
                        r0.f115183q = r3
                        java.lang.Object r2 = r8.d(r9, r0)
                        if (r2 != r1) goto L_0x0141
                        return r1
                    L_0x0141:
                        java.lang.Iterable r2 = (java.lang.Iterable) r2
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r1.<init>()
                        java.util.Iterator r2 = r2.iterator()
                    L_0x014c:
                        boolean r3 = r2.hasNext()
                        if (r3 == 0) goto L_0x0162
                        java.lang.Object r3 = r2.next()
                        com.ingka.ikea.app.stockinfo.local.a r3 = (com.ingka.ikea.app.stockinfo.local.a) r3
                        com.ingka.ikea.app.stockinfo.local.b r3 = r3.b()
                        if (r3 == 0) goto L_0x014c
                        r1.add(r3)
                        goto L_0x014c
                    L_0x0162:
                        java.util.ArrayList r2 = new java.util.ArrayList
                        r2.<init>()
                        java.util.Iterator r1 = r1.iterator()
                    L_0x016b:
                        boolean r3 = r1.hasNext()
                        if (r3 == 0) goto L_0x017d
                        java.lang.Object r3 = r1.next()
                        boolean r4 = r3 instanceof com.ingka.ikea.app.stockinfo.local.b.c
                        if (r4 == 0) goto L_0x016b
                        r2.add(r3)
                        goto L_0x016b
                    L_0x017d:
                        java.util.ArrayList r1 = new java.util.ArrayList
                        r3 = 10
                        int r3 = YH.C16877v.y(r2, r3)
                        r1.<init>(r3)
                        java.util.Iterator r2 = r2.iterator()
                    L_0x018c:
                        boolean r3 = r2.hasNext()
                        if (r3 == 0) goto L_0x01a0
                        java.lang.Object r3 = r2.next()
                        com.ingka.ikea.app.stockinfo.local.b$c r3 = (com.ingka.ikea.app.stockinfo.local.b.c) r3
                        Wk.f r3 = r3.a()
                        r1.add(r3)
                        goto L_0x018c
                    L_0x01a0:
                        return r1
                    */
                    throw new UnsupportedOperationException("Method not decompiled: RB.C13506c.C2828c.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C16533h<? super List<C13505b.a>> hVar, C13506c cVar, String str, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f115163j = hVar;
                this.f115164k = cVar;
                this.f115165l = str;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f115163j, this.f115164k, this.f115165l, eVar);
                aVar.f115162i = obj;
                return aVar;
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            /* JADX WARNING: Removed duplicated region for block: B:21:0x00c8 A[RETURN] */
            /* JADX WARNING: Removed duplicated region for block: B:22:0x00c9  */
            /* JADX WARNING: Removed duplicated region for block: B:25:0x00eb A[RETURN] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = eI.C17187b.f()
                    int r1 = r14.f115161h
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L_0x0066
                    if (r1 == r5) goto L_0x005e
                    if (r1 == r4) goto L_0x004e
                    if (r1 == r3) goto L_0x0039
                    if (r1 != r2) goto L_0x0031
                    java.lang.Object r0 = r14.f115160g
                    java.util.List r0 = (java.util.List) r0
                    java.lang.Object r0 = r14.f115159f
                    java.util.List r0 = (java.util.List) r0
                    java.lang.Object r0 = r14.f115158e
                    java.util.List r0 = (java.util.List) r0
                    java.lang.Object r0 = r14.f115157d
                    QJ.Y r0 = (QJ.Y) r0
                    java.lang.Object r0 = r14.f115156c
                    QJ.Y r0 = (QJ.Y) r0
                    java.lang.Object r0 = r14.f115162i
                    QJ.Q r0 = (QJ.Q) r0
                    XH.y.b(r15)
                    goto L_0x00ec
                L_0x0031:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L_0x0039:
                    java.lang.Object r1 = r14.f115158e
                    java.util.List r1 = (java.util.List) r1
                    java.lang.Object r3 = r14.f115157d
                    QJ.Y r3 = (QJ.Y) r3
                    java.lang.Object r4 = r14.f115156c
                    QJ.Y r4 = (QJ.Y) r4
                    java.lang.Object r5 = r14.f115162i
                    QJ.Q r5 = (QJ.Q) r5
                    XH.y.b(r15)
                    goto L_0x00cd
                L_0x004e:
                    java.lang.Object r1 = r14.f115157d
                    QJ.Y r1 = (QJ.Y) r1
                    java.lang.Object r4 = r14.f115156c
                    QJ.Y r4 = (QJ.Y) r4
                    java.lang.Object r5 = r14.f115162i
                    QJ.Q r5 = (QJ.Q) r5
                    XH.y.b(r15)
                    goto L_0x00b6
                L_0x005e:
                    java.lang.Object r1 = r14.f115162i
                    QJ.Q r1 = (QJ.Q) r1
                    XH.y.b(r15)
                    goto L_0x007f
                L_0x0066:
                    XH.y.b(r15)
                    java.lang.Object r15 = r14.f115162i
                    r1 = r15
                    QJ.Q r1 = (QJ.Q) r1
                    TJ.h<java.util.List<RB.b$a>> r15 = r14.f115163j
                    java.util.List r6 = YH.C16877v.n()
                    r14.f115162i = r1
                    r14.f115161h = r5
                    java.lang.Object r15 = r15.emit(r6, r14)
                    if (r15 != r0) goto L_0x007f
                    return r0
                L_0x007f:
                    RB.c$c$a$b r8 = new RB.c$c$a$b
                    RB.c r15 = r14.f115164k
                    java.lang.String r5 = r14.f115165l
                    r11 = 0
                    r8.<init>(r15, r5, r11)
                    r9 = 3
                    r10 = 0
                    r6 = 0
                    r7 = 0
                    r5 = r1
                    QJ.Y r15 = QJ.C16314k.b(r5, r6, r7, r8, r9, r10)
                    RB.c$c$a$a r8 = new RB.c$c$a$a
                    RB.c r5 = r14.f115164k
                    java.lang.String r6 = r14.f115165l
                    r8.<init>(r5, r6, r11)
                    r6 = 0
                    r5 = r1
                    QJ.Y r5 = QJ.C16314k.b(r5, r6, r7, r8, r9, r10)
                    r14.f115162i = r1
                    r14.f115156c = r15
                    r14.f115157d = r5
                    r14.f115161h = r4
                    java.lang.Object r4 = r15.f(r14)
                    if (r4 != r0) goto L_0x00b0
                    return r0
                L_0x00b0:
                    r12 = r4
                    r4 = r15
                    r15 = r12
                    r13 = r5
                    r5 = r1
                    r1 = r13
                L_0x00b6:
                    java.util.List r15 = (java.util.List) r15
                    r14.f115162i = r5
                    r14.f115156c = r4
                    r14.f115157d = r1
                    r14.f115158e = r15
                    r14.f115161h = r3
                    java.lang.Object r3 = r1.f(r14)
                    if (r3 != r0) goto L_0x00c9
                    return r0
                L_0x00c9:
                    r12 = r1
                    r1 = r15
                    r15 = r3
                    r3 = r12
                L_0x00cd:
                    java.util.List r15 = (java.util.List) r15
                    RB.c r6 = r14.f115164k
                    java.util.List r6 = r6.g(r1, r15)
                    TJ.h<java.util.List<RB.b$a>> r7 = r14.f115163j
                    r14.f115162i = r5
                    r14.f115156c = r4
                    r14.f115157d = r3
                    r14.f115158e = r1
                    r14.f115159f = r15
                    r14.f115160g = r6
                    r14.f115161h = r2
                    java.lang.Object r15 = r7.emit(r6, r14)
                    if (r15 != r0) goto L_0x00ec
                    return r0
                L_0x00ec:
                    XH.N r15 = XH.C16807N.f139792a
                    return r15
                */
                throw new UnsupportedOperationException("Method not decompiled: RB.C13506c.C2828c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2828c(C13506c cVar, String str, C17164e<? super C2828c> eVar) {
            super(2, eVar);
            this.f115154e = cVar;
            this.f115155f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C2828c cVar = new C2828c(this.f115154e, this.f115155f, eVar);
            cVar.f115153d = obj;
            return cVar;
        }

        public final Object invoke(C16533h<? super List<C13505b.a>> hVar, C17164e<? super C16807N> eVar) {
            return ((C2828c) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f115152c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f115153d;
                a aVar = new a(hVar, this.f115154e, this.f115155f, (C17164e<? super a>) null);
                this.f115153d = hVar;
                this.f115152c = 1;
                if (S.f(aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f115153d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public C13506c(d dVar, Wk.b bVar, C10253a aVar) {
        C17542s.j(dVar, "stockRepository");
        C17542s.j(bVar, "availabilityRepository");
        C17542s.j(aVar, "killSwitchRepository");
        this.f115129a = dVar;
        this.f115130b = bVar;
        this.f115131c = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: qv.b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: java.util.ArrayList} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(java.lang.String r20, dI.C17164e<? super java.util.List<Wk.e.a.b>> r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof RB.C13506c.b
            if (r3 == 0) goto L_0x0019
            r3 = r2
            RB.c$b r3 = (RB.C13506c.b) r3
            int r4 = r3.f115151u
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L_0x0019
            int r4 = r4 - r5
            r3.f115151u = r4
            goto L_0x001e
        L_0x0019:
            RB.c$b r3 = new RB.c$b
            r3.<init>(r0, r2)
        L_0x001e:
            java.lang.Object r4 = r3.f115149s
            java.lang.Object r5 = eI.C17187b.f()
            int r6 = r3.f115151u
            r7 = 1
            if (r6 == 0) goto L_0x0060
            if (r6 != r7) goto L_0x0058
            java.lang.Object r1 = r3.f115142l
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.lang.Object r1 = r3.f115141k
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.lang.Object r1 = r3.f115140j
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f115139i
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f115138h
            qv.e r1 = (qv.e) r1
            java.lang.Object r1 = r3.f115137g
            RB.c r1 = (RB.C13506c) r1
            java.lang.Object r1 = r3.f115136f
            RB.c r1 = (RB.C13506c) r1
            java.lang.Object r1 = r3.f115135e
            dI.e r1 = (dI.C17164e) r1
            java.lang.Object r1 = r3.f115134d
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r3.f115133c
            RB.c r1 = (RB.C13506c) r1
            XH.y.b(r4)     // Catch:{ Exception -> 0x0169 }
            goto L_0x0161
        L_0x0058:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0060:
            XH.y.b(r4)
            tf.a r4 = r0.f115131c     // Catch:{ Exception -> 0x0169 }
            boolean r4 = r4.K()     // Catch:{ Exception -> 0x0169 }
            if (r4 == 0) goto L_0x0164
            qv.e r4 = qv.e.DEBUG     // Catch:{ Exception -> 0x0169 }
            qv.d r6 = qv.d.f102012a     // Catch:{ Exception -> 0x0169 }
            java.util.List r6 = r6.a()     // Catch:{ Exception -> 0x0169 }
            java.lang.Iterable r6 = (java.lang.Iterable) r6     // Catch:{ Exception -> 0x0169 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ Exception -> 0x0169 }
            r14.<init>()     // Catch:{ Exception -> 0x0169 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x0169 }
        L_0x007e:
            boolean r8 = r6.hasNext()     // Catch:{ Exception -> 0x0169 }
            r15 = 0
            if (r8 == 0) goto L_0x0096
            java.lang.Object r8 = r6.next()     // Catch:{ Exception -> 0x0169 }
            r9 = r8
            qv.b r9 = (qv.C11819b) r9     // Catch:{ Exception -> 0x0169 }
            boolean r9 = r9.b(r4, r15)     // Catch:{ Exception -> 0x0169 }
            if (r9 == 0) goto L_0x007e
            r14.add(r8)     // Catch:{ Exception -> 0x0169 }
            goto L_0x007e
        L_0x0096:
            java.util.Iterator r6 = r14.iterator()     // Catch:{ Exception -> 0x0169 }
            r13 = 0
            r8 = r13
            r9 = r8
            r10 = r14
        L_0x009e:
            boolean r11 = r6.hasNext()     // Catch:{ Exception -> 0x0169 }
            if (r11 == 0) goto L_0x0135
            java.lang.Object r16 = r6.next()     // Catch:{ Exception -> 0x0169 }
            r10 = r16
            qv.b r10 = (qv.C11819b) r10     // Catch:{ Exception -> 0x0169 }
            r12 = 0
            if (r8 != 0) goto L_0x00ce
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0169 }
            r11.<init>()     // Catch:{ Exception -> 0x0169 }
            java.lang.String r15 = "Fetching click&collect stock status of "
            r11.append(r15)     // Catch:{ Exception -> 0x0169 }
            r11.append(r1)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0169 }
            java.lang.String r11 = qv.C11818a.a(r11, r12)     // Catch:{ Exception -> 0x0169 }
            if (r11 != 0) goto L_0x00ca
            r10 = r16
            goto L_0x0135
        L_0x00ca:
            java.lang.String r8 = qv.C11820c.a(r11)     // Catch:{ Exception -> 0x0169 }
        L_0x00ce:
            r15 = r8
            if (r9 != 0) goto L_0x011d
            java.lang.Class<RB.c> r8 = RB.C13506c.class
            java.lang.String r8 = r8.getName()     // Catch:{ Exception -> 0x0169 }
            kotlin.jvm.internal.C17542s.g(r8)     // Catch:{ Exception -> 0x0169 }
            r9 = 36
            r11 = 2
            java.lang.String r9 = HJ.C15854t.s1(r8, r9, r13, r11, r13)     // Catch:{ Exception -> 0x0169 }
            r12 = 46
            java.lang.String r9 = HJ.C15854t.o1(r9, r12, r13, r11, r13)     // Catch:{ Exception -> 0x0169 }
            int r11 = r9.length()     // Catch:{ Exception -> 0x0169 }
            if (r11 != 0) goto L_0x00ee
            goto L_0x00f4
        L_0x00ee:
            java.lang.String r8 = "Kt"
            java.lang.String r8 = HJ.C15854t.P0(r9, r8)     // Catch:{ Exception -> 0x0169 }
        L_0x00f4:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch:{ Exception -> 0x0169 }
            java.lang.String r9 = r9.getName()     // Catch:{ Exception -> 0x0169 }
            java.lang.String r11 = "main"
            boolean r9 = HJ.C15854t.b0(r9, r11, r7)     // Catch:{ Exception -> 0x0169 }
            if (r9 == 0) goto L_0x0107
            java.lang.String r9 = "m"
            goto L_0x0109
        L_0x0107:
            java.lang.String r9 = "b"
        L_0x0109:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0169 }
            r11.<init>()     // Catch:{ Exception -> 0x0169 }
            r11.append(r9)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r9 = "|"
            r11.append(r9)     // Catch:{ Exception -> 0x0169 }
            r11.append(r8)     // Catch:{ Exception -> 0x0169 }
            java.lang.String r9 = r11.toString()     // Catch:{ Exception -> 0x0169 }
        L_0x011d:
            r18 = r9
            r11 = 0
            r8 = r10
            r9 = r4
            r10 = r18
            r12 = 0
            r17 = r13
            r13 = r15
            r8.a(r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0169 }
            r8 = r15
            r10 = r16
            r13 = r17
            r9 = r18
            r15 = 0
            goto L_0x009e
        L_0x0135:
            Wk.b r11 = r0.f115130b     // Catch:{ Exception -> 0x0169 }
            r3.f115133c = r0     // Catch:{ Exception -> 0x0169 }
            r3.f115134d = r1     // Catch:{ Exception -> 0x0169 }
            r3.f115135e = r2     // Catch:{ Exception -> 0x0169 }
            r3.f115136f = r0     // Catch:{ Exception -> 0x0169 }
            r3.f115137g = r0     // Catch:{ Exception -> 0x0169 }
            r3.f115138h = r4     // Catch:{ Exception -> 0x0169 }
            r3.f115139i = r8     // Catch:{ Exception -> 0x0169 }
            r3.f115140j = r9     // Catch:{ Exception -> 0x0169 }
            r3.f115141k = r14     // Catch:{ Exception -> 0x0169 }
            r3.f115142l = r6     // Catch:{ Exception -> 0x0169 }
            r3.f115143m = r10     // Catch:{ Exception -> 0x0169 }
            r2 = 0
            r3.f115144n = r2     // Catch:{ Exception -> 0x0169 }
            r3.f115145o = r2     // Catch:{ Exception -> 0x0169 }
            r3.f115146p = r2     // Catch:{ Exception -> 0x0169 }
            r3.f115147q = r2     // Catch:{ Exception -> 0x0169 }
            r3.f115148r = r2     // Catch:{ Exception -> 0x0169 }
            r3.f115151u = r7     // Catch:{ Exception -> 0x0169 }
            java.lang.Object r4 = r11.a(r1, r3)     // Catch:{ Exception -> 0x0169 }
            if (r4 != r5) goto L_0x0161
            return r5
        L_0x0161:
            java.util.List r4 = (java.util.List) r4     // Catch:{ Exception -> 0x0169 }
            goto L_0x016d
        L_0x0164:
            java.util.List r4 = YH.C16877v.n()     // Catch:{ Exception -> 0x0169 }
            goto L_0x016d
        L_0x0169:
            java.util.List r4 = YH.C16877v.n()
        L_0x016d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: RB.C13506c.e(java.lang.String, dI.e):java.lang.Object");
    }

    private final Boolean f(e.b bVar) {
        e.b.a.C1888a a10;
        if (bVar == null || !(bVar instanceof e.b.a) || (a10 = ((e.b.a) bVar).a()) == null) {
            return null;
        }
        return Boolean.valueOf(a10.a());
    }

    /* access modifiers changed from: private */
    public final List<C13505b.a> g(List<Wk.f> list, List<e.a.b> list2) {
        C13505b.a.C2826a aVar;
        Iterable iterable = list2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(((e.a.b) next).b(), next);
        }
        Iterable<Wk.f> iterable2 = list;
        ArrayList<v> arrayList = new ArrayList<>(C16877v.y(iterable2, 10));
        for (Wk.f fVar : iterable2) {
            e.a.b bVar = (e.a.b) linkedHashMap.get(fVar.o());
            arrayList.add(C16796C.a(fVar, bVar != null ? bVar.a() : null));
        }
        ArrayList arrayList2 = new ArrayList(C16877v.y(arrayList, 10));
        for (v vVar : arrayList) {
            Wk.f fVar2 = (Wk.f) vVar.a();
            e.b bVar2 = (e.b) vVar.b();
            String o10 = fVar2.o();
            switch (a.f115132a[fVar2.k().ordinal()]) {
                case 1:
                    aVar = C13505b.a.C2826a.OUT_OF_STOCK;
                    break;
                case 2:
                case 3:
                    aVar = C13505b.a.C2826a.LOW_STOCK;
                    break;
                case 4:
                    aVar = C13505b.a.C2826a.IN_STOCK;
                    break;
                case 5:
                case 6:
                    aVar = C13505b.a.C2826a.INDETERMINATE;
                    break;
                default:
                    throw new t();
            }
            arrayList2.add(new C13505b.a(o10, aVar, fVar2.h(), f(bVar2)));
        }
        return arrayList2;
    }

    public C16532g<List<C13505b.a>> a(String str) {
        C17542s.j(str, "itemNo");
        return C16534i.H(new C2828c(this, str, (C17164e<? super C2828c>) null));
    }
}
