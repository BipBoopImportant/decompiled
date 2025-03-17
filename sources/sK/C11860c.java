package sk;

import FB.C12860a;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15989e;
import Op.B0;
import Op.i1;
import SJ.C16428d;
import TJ.C16504A;
import TJ.C16511H;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16796C;
import XH.C16807N;
import XH.v;
import XH.x;
import XH.y;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductItem;
import dI.C17164e;
import eI.C17187b;
import hB.C14526a;
import jB.C14613b;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import jk.C11423a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import pk.o;
import pk.r;
import pk.s;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 L2\u00020\u0001:\u0001>B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r0\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00130\f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u001f\u001a\u00020\u001e*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00132\u0006\u0010\u0018\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00192\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J5\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u0014*\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u000e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019H\u0002¢\u0006\u0004\b\"\u0010#J/\u0010)\u001a\u00020(2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J/\u0010+\u001a\u00020(2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010*J)\u0010/\u001a\u0004\u0018\u00010\u001e*\u00020\u001c2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u001e0,H\u0002¢\u0006\u0004\b/\u00100J5\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0,0\f2\u0006\u0010$\u001a\u00020\u000f2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b¢\u0006\u0004\b1\u00102J<\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0,2\u0006\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020\u000f2\u0006\u00104\u001a\u000203H@¢\u0006\u0004\b5\u00106J\u0018\u00108\u001a\u0002072\u0006\u0010%\u001a\u00020\u000fH@¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u000207H@¢\u0006\u0004\b:\u0010;J\u0019\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0,¢\u0006\u0004\b<\u0010=R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000f0F8\u0002X\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u001a\u0010K\u001a\b\u0012\u0004\u0012\u0002070F8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010H¨\u0006M"}, d2 = {"Lsk/c;", "", "LIl/d;", "marketConfigRepository", "LhB/a;", "recommendationsRepository", "LFB/a;", "localStoreSelectionRepository", "LjB/b;", "shoppingListRepository", "<init>", "(LIl/d;LhB/a;LFB/a;LjB/b;)V", "LTJ/g;", "LXH/v;", "LRl/e;", "", "n", "()LTJ/g;", "storeId", "LXH/x;", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "q", "(Ljava/lang/String;)LTJ/g;", "marketConfig", "", "favouriteItems", "Lkotlin/Function0;", "Lpk/s;", "state", "Lpk/s$n;", "t", "(Ljava/lang/Object;LRl/e;Ljava/util/Set;LnI/a;)Lpk/s$n;", "Lpk/s$n$e;", "s", "(Ljava/util/List;LRl/e;Ljava/util/Set;)Ljava/util/List;", "listId", "itemNo", "itemName", "listName", "Lpk/s$n$a;", "u", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpk/s$n$a;", "m", "Lkotlin/Function1;", "Lpk/s$n$b;", "block", "w", "(Lpk/s;LnI/l;)Lpk/s$n;", "p", "(Ljava/lang/String;LnI/a;)LTJ/g;", "", "inFavourites", "r", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLdI/e;)Ljava/lang/Object;", "LXH/N;", "o", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "v", "(LdI/e;)Ljava/lang/Object;", "j", "()LnI/l;", "a", "LIl/d;", "b", "LhB/a;", "c", "LFB/a;", "d", "LjB/b;", "LTJ/A;", "e", "LTJ/A;", "getSimilarItemsSignal", "f", "retryGetSimilarItemsSignal", "g", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: sk.c  reason: case insensitive filesystem */
public final class C11860c {

    /* renamed from: g  reason: collision with root package name */
    public static final a f102383g = new a((DefaultConstructorMarker) null);

    /* renamed from: h  reason: collision with root package name */
    public static final int f102384h = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Il.d f102385a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C14526a f102386b;

    /* renamed from: c  reason: collision with root package name */
    private final C12860a f102387c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final C14613b f102388d;

    /* renamed from: e  reason: collision with root package name */
    private final C16504A<String> f102389e = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);

    /* renamed from: f  reason: collision with root package name */
    private final C16504A<C16807N> f102390f = C16511H.b(0, 0, (C16428d) null, 7, (Object) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsk/c$a;", "", "<init>", "()V", "", "MAX_PRODUCTS", "I", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sk.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sk.c$b */
    public static final class b implements C16532g<String> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f102391a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sk.c$b$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f102392a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getMarketConfigAndStore$$inlined$map$1$2", f = "SimilarItemsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: sk.c$b$a$a  reason: collision with other inner class name */
            public static final class C2439a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f102393c;

                /* renamed from: d  reason: collision with root package name */
                int f102394d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f102395e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2439a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f102395e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f102393c = obj;
                    this.f102394d |= Integer.MIN_VALUE;
                    return this.f102395e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f102392a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof sk.C11860c.b.a.C2439a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    sk.c$b$a$a r0 = (sk.C11860c.b.a.C2439a) r0
                    int r1 = r0.f102394d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f102394d = r1
                    goto L_0x0018
                L_0x0013:
                    sk.c$b$a$a r0 = new sk.c$b$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f102393c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f102394d
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
                    TJ.h r6 = r4.f102392a
                    EB.d r5 = (EB.C12832d) r5
                    java.lang.String r5 = r5.e()
                    r0.f102394d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: sk.C11860c.b.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public b(C16532g gVar) {
            this.f102391a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f102391a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LRl/e;", "marketConfig", "", "storeId", "LXH/v;", "<anonymous>", "(LRl/e;Ljava/lang/String;)LXH/v;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getMarketConfigAndStore$2", f = "SimilarItemsOrchestrator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: sk.c$c  reason: collision with other inner class name */
    static final class C2440c extends kotlin.coroutines.jvm.internal.l implements q<Rl.e, String, C17164e<? super v<? extends Rl.e, ? extends String>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102396c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f102397d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f102398e;

        C2440c(C17164e<? super C2440c> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(Rl.e eVar, String str, C17164e<? super v<Rl.e, String>> eVar2) {
            C2440c cVar = new C2440c(eVar2);
            cVar.f102397d = eVar;
            cVar.f102398e = str;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f102396c == 0) {
                y.b(obj);
                return C16796C.a((Rl.e) this.f102397d, (String) this.f102398e);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getSimilarItemsUpdates$$inlined$flatMapLatest$1", f = "SimilarItemsOrchestrator.kt", l = {189}, m = "invokeSuspend")
    /* renamed from: sk.c$d */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements q<C16533h<? super s.n>, v<? extends Rl.e, ? extends String>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102399c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f102400d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f102401e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11860c f102402f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f102403g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a f102404h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17164e eVar, C11860c cVar, String str, C17631a aVar) {
            super(3, eVar);
            this.f102402f = cVar;
            this.f102403g = str;
            this.f102404h = aVar;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super s.n> hVar, v<? extends Rl.e, ? extends String> vVar, C17164e<? super C16807N> eVar) {
            d dVar = new d(eVar, this.f102402f, this.f102403g, this.f102404h);
            dVar.f102400d = hVar;
            dVar.f102401e = vVar;
            return dVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f102399c;
            if (i10 == 0) {
                y.b(obj);
                v vVar = (v) this.f102401e;
                C16532g n10 = C16534i.n(C16534i.s(new h(this.f102402f.f102388d.m(this.f102403g))), this.f102402f.q((String) vVar.b()), new f(this.f102402f, (Rl.e) vVar.a(), this.f102404h, (C17164e<? super f>) null));
                this.f102399c = 1;
                if (C16534i.x((C16533h) this.f102400d, n10, this) == f10) {
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
    /* renamed from: sk.c$e */
    public static final class e implements C16532g<C17642l<? super s, ? extends s>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f102405a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sk.c$e$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f102406a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getSimilarItemsUpdates$$inlined$map$1$2", f = "SimilarItemsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: sk.c$e$a$a  reason: collision with other inner class name */
            public static final class C2441a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f102407c;

                /* renamed from: d  reason: collision with root package name */
                int f102408d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f102409e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2441a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f102409e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f102407c = obj;
                    this.f102408d |= Integer.MIN_VALUE;
                    return this.f102409e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f102406a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof sk.C11860c.e.a.C2441a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    sk.c$e$a$a r0 = (sk.C11860c.e.a.C2441a) r0
                    int r1 = r0.f102408d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f102408d = r1
                    goto L_0x0018
                L_0x0013:
                    sk.c$e$a$a r0 = new sk.c$e$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f102407c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f102408d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0046
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f102406a
                    pk.s$n r5 = (pk.s.n) r5
                    sk.c$g r2 = new sk.c$g
                    r2.<init>(r5)
                    r0.f102408d = r3
                    java.lang.Object r5 = r6.emit(r2, r0)
                    if (r5 != r1) goto L_0x0046
                    return r1
                L_0x0046:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: sk.C11860c.e.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public e(C16532g gVar) {
            this.f102405a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f102405a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "", "favouriteItems", "LXH/x;", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "similarItemsResult", "Lpk/s$n;", "<anonymous>", "(Ljava/util/Set;LXH/x;)Lpk/s$n;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getSimilarItemsUpdates$1$2", f = "SimilarItemsOrchestrator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: sk.c$f */
    static final class f extends kotlin.coroutines.jvm.internal.l implements q<Set<? extends String>, x<? extends List<? extends ProductItem>>, C17164e<? super s.n>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102410c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f102411d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f102412e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C11860c f102413f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Rl.e f102414g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C17631a<s> f102415h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(C11860c cVar, Rl.e eVar, C17631a<s> aVar, C17164e<? super f> eVar2) {
            super(3, eVar2);
            this.f102413f = cVar;
            this.f102414g = eVar;
            this.f102415h = aVar;
        }

        public final Object i(Set<String> set, Object obj, C17164e<? super s.n> eVar) {
            f fVar = new f(this.f102413f, this.f102414g, this.f102415h, eVar);
            fVar.f102411d = set;
            fVar.f102412e = x.a(obj);
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((Set) obj, ((x) obj2).j(), (C17164e) obj3);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f102410c == 0) {
                y.b(obj);
                Object j10 = ((x) this.f102412e).j();
                return this.f102413f.t(j10, this.f102414g, (Set) this.f102411d, this.f102415h);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sk.c$g */
    static final class g implements C17642l<s, s> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ s.n f102416a;

        g(s.n nVar) {
            this.f102416a = nVar;
        }

        /* renamed from: a */
        public final s invoke(s sVar) {
            C17542s.j(sVar, "it");
            return s.b(sVar, (pk.k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (pk.j) null, (pk.n) null, (pk.q) null, (pk.m) null, (o) null, (C15987c) null, (pk.l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, this.f102416a, (r) null, (s.h) null, (s.d) null, (s.b) null, 2080374783, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sk.c$h */
    public static final class h implements C16532g<Set<? extends String>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f102417a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sk.c$h$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f102418a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getSimilarItemsUpdates$lambda$2$$inlined$map$1$2", f = "SimilarItemsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: sk.c$h$a$a  reason: collision with other inner class name */
            public static final class C2442a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f102419c;

                /* renamed from: d  reason: collision with root package name */
                int f102420d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f102421e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2442a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f102421e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f102419c = obj;
                    this.f102420d |= Integer.MIN_VALUE;
                    return this.f102421e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f102418a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof sk.C11860c.h.a.C2442a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    sk.c$h$a$a r0 = (sk.C11860c.h.a.C2442a) r0
                    int r1 = r0.f102420d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f102420d = r1
                    goto L_0x0018
                L_0x0013:
                    sk.c$h$a$a r0 = new sk.c$h$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f102419c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f102420d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r7)
                    goto L_0x006a
                L_0x0029:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L_0x0031:
                    XH.y.b(r7)
                    TJ.h r7 = r5.f102418a
                    java.util.List r6 = (java.util.List) r6
                    java.lang.Iterable r6 = (java.lang.Iterable) r6
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r4 = 10
                    int r4 = YH.C16877v.y(r6, r4)
                    r2.<init>(r4)
                    java.util.Iterator r6 = r6.iterator()
                L_0x0049:
                    boolean r4 = r6.hasNext()
                    if (r4 == 0) goto L_0x005d
                    java.lang.Object r4 = r6.next()
                    gB.g r4 = (gB.C14505g) r4
                    java.lang.String r4 = r4.b()
                    r2.add(r4)
                    goto L_0x0049
                L_0x005d:
                    java.util.Set r6 = YH.C16877v.y1(r2)
                    r0.f102420d = r3
                    java.lang.Object r6 = r7.emit(r6, r0)
                    if (r6 != r1) goto L_0x006a
                    return r1
                L_0x006a:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: sk.C11860c.h.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public h(C16532g gVar) {
            this.f102417a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f102417a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LTJ/h;", "LXH/N;", "<anonymous>", "(LTJ/h;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getSimilarProducts$1", f = "SimilarItemsOrchestrator.kt", l = {78}, m = "invokeSuspend")
    /* renamed from: sk.c$i */
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<C16533h<? super C16807N>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102422c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f102423d;

        i(C17164e<? super i> eVar) {
            super(2, eVar);
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            i iVar = new i(eVar);
            iVar.f102423d = obj;
            return iVar;
        }

        public final Object invoke(C16533h<? super C16807N> hVar, C17164e<? super C16807N> eVar) {
            return ((i) create(hVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f102422c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f102423d;
                C16807N n10 = C16807N.f139792a;
                this.f102423d = hVar;
                this.f102422c = 1;
                if (hVar.emit(n10, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                C16533h hVar2 = (C16533h) this.f102423d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LXH/N;", "<unused var>", "", "itemNo", "<anonymous>", "(VLjava/lang/String;)Ljava/lang/String;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getSimilarProducts$2", f = "SimilarItemsOrchestrator.kt", l = {}, m = "invokeSuspend")
    /* renamed from: sk.c$j */
    static final class j extends kotlin.coroutines.jvm.internal.l implements q<C16807N, String, C17164e<? super String>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102424c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f102425d;

        j(C17164e<? super j> eVar) {
            super(3, eVar);
        }

        /* renamed from: i */
        public final Object invoke(C16807N n10, String str, C17164e<? super String> eVar) {
            j jVar = new j(eVar);
            jVar.f102425d = str;
            return jVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f102424c == 0) {
                y.b(obj);
                return (String) this.f102425d;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "itemNo", "LXH/x;", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "<anonymous>", "(Ljava/lang/String;)LXH/x;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$getSimilarProducts$3", f = "SimilarItemsOrchestrator.kt", l = {82}, m = "invokeSuspend")
    /* renamed from: sk.c$k */
    static final class k extends kotlin.coroutines.jvm.internal.l implements p<String, C17164e<? super x<? extends List<? extends ProductItem>>>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f102426c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f102427d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C11860c f102428e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f102429f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        k(C11860c cVar, String str, C17164e<? super k> eVar) {
            super(2, eVar);
            this.f102428e = cVar;
            this.f102429f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            k kVar = new k(this.f102428e, this.f102429f, eVar);
            kVar.f102427d = obj;
            return kVar;
        }

        /* renamed from: i */
        public final Object invoke(String str, C17164e<? super x<? extends List<ProductItem>>> eVar) {
            return ((k) create(str, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object f10 = C17187b.f();
            int i10 = this.f102426c;
            if (i10 == 0) {
                y.b(obj);
                String str = (String) this.f102427d;
                C14526a d10 = this.f102428e.f102386b;
                String str2 = this.f102429f;
                this.f102427d = str;
                this.f102426c = 1;
                obj2 = d10.a(str2, str, this);
                if (obj2 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                String str3 = (String) this.f102427d;
                y.b(obj);
                obj2 = ((x) obj).j();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return x.a(obj2);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sk.c$l */
    public static final class l implements C16532g<s.n.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f102430a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f102431b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C11860c f102432c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f102433d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f102434e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f102435f;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sk.c$l$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f102436a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ boolean f102437b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ C11860c f102438c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ String f102439d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f102440e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f102441f;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$handleAddToFavourites$$inlined$map$1$2", f = "SimilarItemsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: sk.c$l$a$a  reason: collision with other inner class name */
            public static final class C2443a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f102442c;

                /* renamed from: d  reason: collision with root package name */
                int f102443d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f102444e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2443a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f102444e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f102442c = obj;
                    this.f102443d |= Integer.MIN_VALUE;
                    return this.f102444e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, boolean z10, C11860c cVar, String str, String str2, String str3) {
                this.f102436a = hVar;
                this.f102437b = z10;
                this.f102438c = cVar;
                this.f102439d = str;
                this.f102440e = str2;
                this.f102441f = str3;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r8, dI.C17164e r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof sk.C11860c.l.a.C2443a
                    if (r0 == 0) goto L_0x0013
                    r0 = r9
                    sk.c$l$a$a r0 = (sk.C11860c.l.a.C2443a) r0
                    int r1 = r0.f102443d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f102443d = r1
                    goto L_0x0018
                L_0x0013:
                    sk.c$l$a$a r0 = new sk.c$l$a$a
                    r0.<init>(r7, r9)
                L_0x0018:
                    java.lang.Object r9 = r0.f102442c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f102443d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r9)
                    goto L_0x0066
                L_0x0029:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L_0x0031:
                    XH.y.b(r9)
                    TJ.h r9 = r7.f102436a
                    gB.e r8 = (gB.C14503e) r8
                    boolean r2 = r7.f102437b
                    if (r2 == 0) goto L_0x004d
                    sk.c r2 = r7.f102438c
                    java.lang.String r4 = r7.f102439d
                    java.lang.String r5 = r7.f102440e
                    java.lang.String r6 = r7.f102441f
                    java.lang.String r8 = r8.b()
                    pk.s$n$a r8 = r2.u(r4, r5, r6, r8)
                    goto L_0x005d
                L_0x004d:
                    sk.c r2 = r7.f102438c
                    java.lang.String r4 = r7.f102439d
                    java.lang.String r5 = r7.f102440e
                    java.lang.String r6 = r7.f102441f
                    java.lang.String r8 = r8.b()
                    pk.s$n$a r8 = r2.m(r4, r5, r6, r8)
                L_0x005d:
                    r0.f102443d = r3
                    java.lang.Object r8 = r9.emit(r8, r0)
                    if (r8 != r1) goto L_0x0066
                    return r1
                L_0x0066:
                    XH.N r8 = XH.C16807N.f139792a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: sk.C11860c.l.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public l(C16532g gVar, boolean z10, C11860c cVar, String str, String str2, String str3) {
            this.f102430a = gVar;
            this.f102431b = z10;
            this.f102432c = cVar;
            this.f102433d = str;
            this.f102434e = str2;
            this.f102435f = str3;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f102430a.collect(new a(hVar, this.f102431b, this.f102432c, this.f102433d, this.f102434e, this.f102435f), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sk.c$m */
    public static final class m implements C16532g<C17642l<? super s, ? extends s>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f102445a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C11860c f102446b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sk.c$m$a */
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f102447a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ C11860c f102448b;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.shoppinglist.listdetails.similaritems.presentation.SimilarItemsOrchestrator$handleAddToFavourites$$inlined$map$2$2", f = "SimilarItemsOrchestrator.kt", l = {50}, m = "emit")
            /* renamed from: sk.c$m$a$a  reason: collision with other inner class name */
            public static final class C2444a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f102449c;

                /* renamed from: d  reason: collision with root package name */
                int f102450d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f102451e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2444a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f102451e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f102449c = obj;
                    this.f102450d |= Integer.MIN_VALUE;
                    return this.f102451e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar, C11860c cVar) {
                this.f102447a = hVar;
                this.f102448b = cVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r6, dI.C17164e r7) {
                /*
                    r5 = this;
                    boolean r0 = r7 instanceof sk.C11860c.m.a.C2444a
                    if (r0 == 0) goto L_0x0013
                    r0 = r7
                    sk.c$m$a$a r0 = (sk.C11860c.m.a.C2444a) r0
                    int r1 = r0.f102450d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f102450d = r1
                    goto L_0x0018
                L_0x0013:
                    sk.c$m$a$a r0 = new sk.c$m$a$a
                    r0.<init>(r5, r7)
                L_0x0018:
                    java.lang.Object r7 = r0.f102449c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f102450d
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
                    TJ.h r7 = r5.f102447a
                    pk.s$n$a r6 = (pk.s.n.a) r6
                    sk.c$n r2 = new sk.c$n
                    sk.c r4 = r5.f102448b
                    r2.<init>(r4, r6)
                    r0.f102450d = r3
                    java.lang.Object r6 = r7.emit(r2, r0)
                    if (r6 != r1) goto L_0x0048
                    return r1
                L_0x0048:
                    XH.N r6 = XH.C16807N.f139792a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: sk.C11860c.m.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public m(C16532g gVar, C11860c cVar) {
            this.f102445a = gVar;
            this.f102446b = cVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f102445a.collect(new a(hVar, this.f102446b), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: sk.c$n */
    static final class n implements C17642l<s, s> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C11860c f102452a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s.n.a f102453b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: sk.c$n$a */
        static final class a implements C17642l<s.n.b, s.n> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ s.n.a f102454a;

            a(s.n.a aVar) {
                this.f102454a = aVar;
            }

            /* renamed from: a */
            public final s.n invoke(s.n.b bVar) {
                C17542s.j(bVar, "it");
                return s.n.b.b(bVar, (C15987c) null, this.f102454a, 1, (Object) null);
            }
        }

        n(C11860c cVar, s.n.a aVar) {
            this.f102452a = cVar;
            this.f102453b = aVar;
        }

        /* renamed from: a */
        public final s invoke(s sVar) {
            s sVar2 = sVar;
            C17542s.j(sVar2, "state");
            return s.b(sVar, (pk.k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (pk.j) null, (pk.n) null, (pk.q) null, (pk.m) null, (o) null, (C15987c) null, (pk.l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, this.f102452a.w(sVar2, new a(this.f102453b)), (r) null, (s.h) null, (s.d) null, (s.b) null, 2080374783, (Object) null);
        }
    }

    public C11860c(Il.d dVar, C14526a aVar, C12860a aVar2, C14613b bVar) {
        C17542s.j(dVar, "marketConfigRepository");
        C17542s.j(aVar, "recommendationsRepository");
        C17542s.j(aVar2, "localStoreSelectionRepository");
        C17542s.j(bVar, "shoppingListRepository");
        this.f102385a = dVar;
        this.f102386b = aVar;
        this.f102387c = aVar2;
        this.f102388d = bVar;
    }

    /* access modifiers changed from: private */
    public static final s k(C11860c cVar, s sVar) {
        s sVar2 = sVar;
        C17542s.j(sVar2, "state");
        return s.b(sVar, (pk.k) null, false, false, (String) null, false, false, false, false, (C15989e) null, (pk.j) null, (pk.n) null, (pk.q) null, (pk.m) null, (o) null, (C15987c) null, (pk.l) null, (s.j) null, (s.e) null, (s.a) null, (s.m) null, (s.l) null, (s.f) null, (s.i) null, (s.c) null, (s.g) null, (s.k) null, cVar.w(sVar2, new C11859b()), (r) null, (s.h) null, (s.d) null, (s.b) null, 2080374783, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final s.n l(s.n.b bVar) {
        C17542s.j(bVar, "it");
        return s.n.b.b(bVar, (C15987c) null, (s.n.a) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    public final s.n.a m(String str, String str2, String str3, String str4) {
        this.f102388d.j(str, C16877v.e(new C14613b.C3151b(str2, 1)), C11423a.f98576a.a(), Ae.k.BUTTON);
        return new s.n.a.C2378a(str3, str4);
    }

    private final C16532g<v<Rl.e, String>> n() {
        return C16534i.n(C16534i.e0(C16534i.A(this.f102385a.d()), 1), new b(C16534i.A(this.f102387c.b())), new C2440c((C17164e<? super C2440c>) null));
    }

    /* access modifiers changed from: private */
    public final C16532g<x<List<ProductItem>>> q(String str) {
        return C16534i.N(C16534i.n(C16534i.T(this.f102390f, new i((C17164e<? super i>) null)), this.f102389e, new j((C17164e<? super j>) null)), new k(this, str, (C17164e<? super k>) null));
    }

    private final List<s.n.e> s(List<ProductItem> list, Rl.e eVar, Set<String> set) {
        Iterable<ProductItem> k12 = C16877v.k1(list, 6);
        ArrayList arrayList = new ArrayList(C16877v.y(k12, 10));
        for (ProductItem productItem : k12) {
            arrayList.add(new s.n.e(productItem.f(), productItem.d().getUrl(), B0.h(productItem, eVar.c(), false, false, false, false, 30, (Object) null).e(), new i1(eVar.c()), eVar.g(), set.contains(productItem.f())));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    public final s.n t(Object obj, Rl.e eVar, Set<String> set, C17631a<s> aVar) {
        s.n.b b10;
        if (x.e(obj) != null) {
            return s.n.c.f101120a;
        }
        List list = (List) obj;
        s.n H10 = aVar.invoke().H();
        s.n.b bVar = H10 instanceof s.n.b ? (s.n.b) H10 : null;
        return (bVar == null || (b10 = s.n.b.b(bVar, C15985a.l(s(list, eVar, set)), (s.n.a) null, 2, (Object) null)) == null) ? new s.n.b(C15985a.l(s(list, eVar, set)), (s.n.a) null) : b10;
    }

    /* access modifiers changed from: private */
    public final s.n.a u(String str, String str2, String str3, String str4) {
        this.f102388d.l(str, new C14613b.C3151b(str2, 1), C11423a.f98576a.a(), Ae.k.BUTTON);
        return new s.n.a.b(str3, str4);
    }

    /* access modifiers changed from: private */
    public final s.n w(s sVar, C17642l<? super s.n.b, ? extends s.n> lVar) {
        s.n nVar;
        s.n H10 = sVar.H();
        s.n.b bVar = H10 instanceof s.n.b ? (s.n.b) H10 : null;
        return (bVar == null || (nVar = (s.n) lVar.invoke(bVar)) == null) ? sVar.H() : nVar;
    }

    public final C17642l<s, s> j() {
        return new C11858a(this);
    }

    public final Object o(String str, C17164e<? super C16807N> eVar) {
        Object emit = this.f102389e.emit(str, eVar);
        return emit == C17187b.f() ? emit : C16807N.f139792a;
    }

    public final C16532g<C17642l<s, s>> p(String str, C17631a<s> aVar) {
        C17542s.j(str, "listId");
        C17542s.j(aVar, "state");
        return new e(C16534i.g0(n(), new d((C17164e) null, this, str, aVar)));
    }

    public final Object r(String str, String str2, String str3, boolean z10, C17164e<? super C17642l<? super s, s>> eVar) {
        return C16534i.B(new m(new l(C16534i.e0(this.f102388d.e(str), 1), z10, this, str, str2, str3), this), eVar);
    }

    public final Object v(C17164e<? super C16807N> eVar) {
        C16504A<C16807N> a10 = this.f102390f;
        C16807N n10 = C16807N.f139792a;
        Object emit = a10.emit(n10, eVar);
        return emit == C17187b.f() ? emit : n10;
    }
}
