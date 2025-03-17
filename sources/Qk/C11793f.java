package qk;

import FB.C12860a;
import QJ.M;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.y;
import YH.C16877v;
import dI.C17164e;
import eI.C17187b;
import gB.C14507i;
import jB.C14613b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.q;
import nI.r;
import pk.C11722a;
import pk.i;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J?\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00132\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00130\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001e\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lqk/f;", "", "LjB/b;", "shoppingListRepository", "Lpk/a;", "contentItemsMapper", "LFB/a;", "localStoreSelectionRepository", "LWk/d;", "stockRepository", "Lqk/d;", "getAvailabilityInOtherStoresUseCase", "LQJ/M;", "defaultDispatcher", "<init>", "(LjB/b;Lpk/a;LFB/a;LWk/d;Lqk/d;LQJ/M;)V", "", "listId", "LTJ/g;", "", "LWk/f;", "c", "(Ljava/lang/String;)LTJ/g;", "LgB/i;", "items", "availability", "itemsAvailableInOtherStores", "Lpk/i;", "e", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "d", "a", "LjB/b;", "b", "Lpk/a;", "LFB/a;", "LWk/d;", "Lqk/d;", "f", "LQJ/M;", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: qk.f  reason: case insensitive filesystem */
public final class C11793f {

    /* renamed from: a  reason: collision with root package name */
    private final C14613b f101595a;

    /* renamed from: b  reason: collision with root package name */
    private final C11722a f101596b;

    /* renamed from: c  reason: collision with root package name */
    private final C12860a f101597c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Wk.d f101598d;

    /* renamed from: e  reason: collision with root package name */
    private final C11791d f101599e;

    /* renamed from: f  reason: collision with root package name */
    private final M f101600f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetListProductsUseCase$getStockFlow$$inlined$flatMapLatest$1", f = "GetListProductsUseCase.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: qk.f$a */
    public static final class a extends l implements q<C16533h<? super List<? extends Wk.f>>, v<? extends List<? extends String>, ? extends String>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101601c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f101602d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101603e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11793f f101604f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, C11793f fVar) {
            super(3, eVar);
            this.f101604f = fVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super List<? extends Wk.f>> hVar, v<? extends List<? extends String>, ? extends String> vVar, C17164e<? super C16807N> eVar) {
            a aVar = new a(eVar, this.f101604f);
            aVar.f101602d = hVar;
            aVar.f101603e = vVar;
            return aVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f101601c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f101602d;
                v vVar = (v) this.f101603e;
                List list = (List) vVar.a();
                String str = (String) vVar.b();
                C16532g<List<Wk.f>> c10 = str != null ? this.f101604f.f101598d.c(str, list) : C16534i.J(C16877v.n());
                this.f101601c = 1;
                if (C16534i.x(hVar, c10, this) == f10) {
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
    /* renamed from: qk.f$b */
    public static final class b implements C16532g<List<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101605a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.f$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101606a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetListProductsUseCase$getStockFlow$$inlined$map$1$2", f = "GetListProductsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.f$b$a$a  reason: collision with other inner class name */
            public static final class C2406a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101607c;

                /* renamed from: d  reason: collision with root package name */
                int f101608d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101609e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2406a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101609e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101607c = obj;
                    this.f101608d |= Integer.MIN_VALUE;
                    return this.f101609e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101606a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r10, dI.C17164e r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof qk.C11793f.b.a.C2406a
                    if (r0 == 0) goto L_0x0013
                    r0 = r11
                    qk.f$b$a$a r0 = (qk.C11793f.b.a.C2406a) r0
                    int r1 = r0.f101608d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101608d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.f$b$a$a r0 = new qk.f$b$a$a
                    r0.<init>(r9, r11)
                L_0x0018:
                    java.lang.Object r11 = r0.f101607c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101608d
                    r3 = 1
                    if (r2 == 0) goto L_0x0032
                    if (r2 != r3) goto L_0x002a
                    XH.y.b(r11)
                    goto L_0x00aa
                L_0x002a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r11)
                    throw r10
                L_0x0032:
                    XH.y.b(r11)
                    TJ.h r11 = r9.f101606a
                    java.util.List r10 = (java.util.List) r10
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r5 = YH.C16877v.y(r10, r4)
                    r2.<init>(r5)
                    java.util.Iterator r10 = r10.iterator()
                L_0x004a:
                    boolean r5 = r10.hasNext()
                    if (r5 == 0) goto L_0x0097
                    java.lang.Object r5 = r10.next()
                    gB.i r5 = (gB.C14507i) r5
                    gB.h r6 = r5.b()
                    gB.g r6 = r6.a()
                    java.lang.String r6 = r6.b()
                    java.util.List r6 = YH.C16877v.e(r6)
                    java.util.Collection r6 = (java.util.Collection) r6
                    java.util.List r5 = r5.a()
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.ArrayList r7 = new java.util.ArrayList
                    int r8 = YH.C16877v.y(r5, r4)
                    r7.<init>(r8)
                    java.util.Iterator r5 = r5.iterator()
                L_0x007b:
                    boolean r8 = r5.hasNext()
                    if (r8 == 0) goto L_0x008f
                    java.lang.Object r8 = r5.next()
                    gB.a r8 = (gB.C14499a) r8
                    java.lang.String r8 = r8.a()
                    r7.add(r8)
                    goto L_0x007b
                L_0x008f:
                    java.util.List r5 = YH.C16877v.V0(r6, r7)
                    r2.add(r5)
                    goto L_0x004a
                L_0x0097:
                    java.util.List r10 = YH.C16877v.A(r2)
                    java.lang.Iterable r10 = (java.lang.Iterable) r10
                    java.util.List r10 = YH.C16877v.m0(r10)
                    r0.f101608d = r3
                    java.lang.Object r10 = r11.emit(r10, r0)
                    if (r10 != r1) goto L_0x00aa
                    return r1
                L_0x00aa:
                    XH.N r10 = XH.C16807N.f139792a
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11793f.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f101605a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101605a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: qk.f$c */
    public static final class c implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f101610a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: qk.f$c$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f101611a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetListProductsUseCase$getStockFlow$$inlined$map$2$2", f = "GetListProductsUseCase.kt", l = {50}, m = "emit")
            /* renamed from: qk.f$c$a$a  reason: collision with other inner class name */
            public static final class C2407a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f101612c;

                /* renamed from: d  reason: collision with root package name */
                int f101613d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f101614e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2407a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f101614e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f101612c = obj;
                    this.f101613d |= Integer.MIN_VALUE;
                    return this.f101614e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f101611a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof qk.C11793f.c.a.C2407a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    qk.f$c$a$a r0 = (qk.C11793f.c.a.C2407a) r0
                    int r1 = r0.f101613d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f101613d = r1
                    goto L_0x0018
                L_0x0013:
                    qk.f$c$a$a r0 = new qk.f$c$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f101612c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f101613d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0049
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f101611a
                    EB.d r5 = (EB.C12832d) r5
                    if (r5 == 0) goto L_0x003f
                    java.lang.String r5 = r5.e()
                    goto L_0x0040
                L_0x003f:
                    r5 = 0
                L_0x0040:
                    r0.f101613d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0049
                    return r1
                L_0x0049:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: qk.C11793f.c.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public c(C16532g gVar) {
            this.f101610a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f101610a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00042\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "", "itemNumbers", "storeId", "LXH/v;", "<anonymous>", "(Ljava/util/List;Ljava/lang/String;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetListProductsUseCase$getStockFlow$3", f = "GetListProductsUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qk.f$d */
    static final class d extends l implements q<List<? extends String>, String, C17164e<? super v<? extends List<? extends String>, ? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101615c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101616d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101617e;

        d(C17164e<? super d> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(List<String> list, String str, C17164e<? super v<? extends List<String>, String>> eVar) {
            d dVar = new d(eVar);
            dVar.f101616d = list;
            dVar.f101617e = str;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101615c == 0) {
                y.b(obj);
                return C16796C.a((List) this.f101616d, (String) this.f101617e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0000H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "LWk/f;", "stock", "LgB/i;", "items", "", "availableInOtherStores", "Lpk/i;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.shoppinglist.listdetails.presentation.usecase.GetListProductsUseCase$invoke$1", f = "GetListProductsUseCase.kt", l = {}, m = "invokeSuspend")
    /* renamed from: qk.f$e */
    static final class e extends l implements r<List<? extends Wk.f>, List<? extends C14507i>, List<? extends String>, C17164e<? super List<? extends i>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f101618c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f101619d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f101620e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f101621f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C11793f f101622g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C11793f fVar, C17164e<? super e> eVar) {
            super(4, eVar);
            this.f101622g = fVar;
        }

        /* renamed from: i */
        public final Object l(List<Wk.f> list, List<C14507i> list2, List<String> list3, C17164e<? super List<i>> eVar) {
            e eVar2 = new e(this.f101622g, eVar);
            eVar2.f101619d = list;
            eVar2.f101620e = list2;
            eVar2.f101621f = list3;
            return eVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f101618c == 0) {
                y.b(obj);
                List list = (List) this.f101620e;
                return this.f101622g.e(list, (List) this.f101619d, (List) this.f101621f);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C11793f(C14613b bVar, C11722a aVar, C12860a aVar2, Wk.d dVar, C11791d dVar2, M m10) {
        C17542s.j(bVar, "shoppingListRepository");
        C17542s.j(aVar, "contentItemsMapper");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        C17542s.j(dVar, "stockRepository");
        C17542s.j(dVar2, "getAvailabilityInOtherStoresUseCase");
        C17542s.j(m10, "defaultDispatcher");
        this.f101595a = bVar;
        this.f101596b = aVar;
        this.f101597c = aVar2;
        this.f101598d = dVar;
        this.f101599e = dVar2;
        this.f101600f = m10;
    }

    private final C16532g<List<Wk.f>> c(String str) {
        return C16534i.g0(C16534i.n(C16534i.s(new b(this.f101595a.q(str))), new c(this.f101597c.b()), new d((C17164e<? super d>) null)), new a((C17164e) null, this));
    }

    /* access modifiers changed from: private */
    public final List<i> e(List<C14507i> list, List<Wk.f> list2, List<String> list3) {
        return this.f101596b.n(list, list2, list3);
    }

    public final C16532g<List<i>> d(String str) {
        C17542s.j(str, "listId");
        return C16534i.L(C16534i.s(C16534i.m(c(str), this.f101595a.q(str), this.f101599e.f(str), new e(this, (C17164e<? super e>) null))), this.f101600f);
    }
}
