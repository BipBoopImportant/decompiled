package eg;

import HJ.C15854t;
import IC.C13023e;
import IC.C13026h;
import Kf.x;
import Op.B0;
import Op.b1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import YH.g0;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.product.ProductItem;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import eg.C9655e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import tf.C10253a;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\"\u0010(\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020&\u0018\u00010\"0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010$R\u001c\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010)0!8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010$R\u001d\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b\u0017\u00100¨\u00062"}, d2 = {"Leg/f;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LAx/c;", "productRemoteDataSource", "LIl/a;", "appConfigApi", "Ltf/a;", "killSwitchRepository", "LKf/x;", "cartInteractor", "<init>", "(Landroidx/lifecycle/U;LAx/c;LIl/a;Ltf/a;LKf/x;)V", "LXH/N;", "I", "()V", "H", "", "itemNo", "productName", "G", "(Ljava/lang/String;Ljava/lang/String;)V", "m", "LAx/c;", "n", "LIl/a;", "o", "Ltf/a;", "p", "LKf/x;", "q", "Ljava/lang/String;", "LTJ/B;", "", "r", "LTJ/B;", "itemNosAddingToCart", "Lcom/ingka/ikea/core/model/product/ProductItem;", "s", "items", "Leg/e$a;", "t", "message", "LTJ/P;", "Leg/e;", "u", "LTJ/P;", "()LTJ/P;", "uiState", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eg.f  reason: case insensitive filesystem */
public final class C9656f extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ax.c f72690m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Il.a f72691n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C10253a f72692o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final x f72693p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final String f72694q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final C16505B<List<String>> f72695r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<List<ProductItem>> f72696s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<C9655e.a> f72697t;

    /* renamed from: u  reason: collision with root package name */
    private final C16519P<C9655e> f72698u;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.viewmodel.YouMayAlsoLikeViewModel$addToCart$2", f = "YouMayAlsoLikeViewModel.kt", l = {104}, m = "invokeSuspend")
    /* renamed from: eg.f$a */
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f72699c;

        /* renamed from: d  reason: collision with root package name */
        Object f72700d;

        /* renamed from: e  reason: collision with root package name */
        Object f72701e;

        /* renamed from: f  reason: collision with root package name */
        Object f72702f;

        /* renamed from: g  reason: collision with root package name */
        int f72703g;

        /* renamed from: h  reason: collision with root package name */
        int f72704h;

        /* renamed from: i  reason: collision with root package name */
        int f72705i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f72706j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ C9656f f72707k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ String f72708l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ String f72709m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(C9656f fVar, String str, String str2, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f72707k = fVar;
            this.f72708l = str;
            this.f72709m = str2;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f72707k, this.f72708l, this.f72709m, eVar);
            aVar.f72706j = obj;
            return aVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object obj2;
            Object value;
            Object f10 = C17187b.f();
            int i10 = this.f72705i;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f72706j;
                C9656f fVar = this.f72707k;
                String str = this.f72708l;
                x.a aVar = XH.x.f139812b;
                Kf.x i11 = fVar.f72693p;
                List e10 = C16877v.e(new Kf.y(str, 1));
                Interaction$Component interaction$Component = Interaction$Component.CART_YOU_MAY_ALSO_LIKE;
                this.f72706j = q10;
                this.f72699c = q10;
                this.f72700d = fVar;
                this.f72701e = str;
                this.f72702f = q10;
                this.f72703g = 0;
                this.f72704h = 0;
                this.f72705i = 1;
                if (i11.b(e10, interaction$Component, (String) null, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f72702f;
                String str2 = (String) this.f72701e;
                C9656f fVar2 = (C9656f) this.f72700d;
                Q q12 = (Q) this.f72699c;
                q10 = (Q) this.f72706j;
                try {
                    y.b(obj);
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th2) {
                    x.a aVar2 = XH.x.f139812b;
                    obj2 = XH.x.b(y.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = XH.x.b(C16807N.f139792a);
            C9656f fVar3 = this.f72707k;
            String str3 = this.f72709m;
            Throwable e12 = XH.x.e(obj2);
            if (e12 == null) {
                C16807N n10 = (C16807N) obj2;
                fVar3.f72697t.setValue(new C9655e.a.b(C13026h.b(Oo.b.f84507T, str3)));
            } else {
                e eVar = e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str4 = null;
                String str5 = null;
                for (C11819b bVar : arrayList) {
                    if (str4 == null) {
                        String a10 = C11818a.a("Unable to add to cart", e12);
                        if (a10 == null) {
                            break;
                        }
                        str4 = C11820c.a(a10);
                    }
                    String str6 = str4;
                    if (str5 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str7 = str5;
                    bVar.a(eVar, str7, false, e12, str6);
                    str4 = str6;
                    str5 = str7;
                }
                fVar3.f72697t.setValue(new C9655e.a.C1246a(e12, str3));
            }
            C16505B k10 = this.f72707k.f72695r;
            String str8 = this.f72708l;
            do {
                value = k10.getValue();
            } while (!k10.e(value, C16877v.S0((List) value, str8)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.viewmodel.YouMayAlsoLikeViewModel$fetchYouMayAlsoLikeProducts$1", f = "YouMayAlsoLikeViewModel.kt", l = {140}, m = "invokeSuspend")
    /* renamed from: eg.f$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f72710c;

        /* renamed from: d  reason: collision with root package name */
        Object f72711d;

        /* renamed from: e  reason: collision with root package name */
        Object f72712e;

        /* renamed from: f  reason: collision with root package name */
        int f72713f;

        /* renamed from: g  reason: collision with root package name */
        int f72714g;

        /* renamed from: h  reason: collision with root package name */
        int f72715h;

        /* renamed from: i  reason: collision with root package name */
        private /* synthetic */ Object f72716i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ C9656f f72717j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C9656f fVar, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f72717j = fVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f72717j, eVar);
            bVar.f72716i = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object obj2;
            Object obj3;
            Object f10 = C17187b.f();
            int i10 = this.f72715h;
            if (i10 == 0) {
                y.b(obj);
                q10 = (Q) this.f72716i;
                C9656f fVar = this.f72717j;
                x.a aVar = XH.x.f139812b;
                Ax.c F10 = fVar.f72690m;
                String j10 = fVar.f72694q;
                this.f72716i = q10;
                this.f72710c = q10;
                this.f72711d = fVar;
                this.f72712e = q10;
                this.f72713f = 0;
                this.f72714g = 0;
                this.f72715h = 1;
                obj3 = F10.d(j10, "removeItemCat", this);
                if (obj3 == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                Q q11 = (Q) this.f72712e;
                C9656f fVar2 = (C9656f) this.f72711d;
                Q q12 = (Q) this.f72710c;
                q10 = (Q) this.f72716i;
                try {
                    y.b(obj);
                    obj3 = obj;
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    x.a aVar2 = XH.x.f139812b;
                    obj2 = XH.x.b(y.a(th2));
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = XH.x.b((List) obj3);
            C9656f fVar3 = this.f72717j;
            Throwable e11 = XH.x.e(obj2);
            if (e11 == null) {
                fVar3.f72696s.setValue((List) obj2);
            } else {
                e eVar = e.WARN;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a("Unable to fetch products", e11);
                        if (a10 == null) {
                            break;
                        }
                        str = C11820c.a(a10);
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = q10.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, e11, str3);
                    str = str3;
                    str2 = str4;
                }
                fVar3.f72696s.setValue(C16877v.n());
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Lcom/ingka/ikea/core/model/product/ProductItem;", "items", "", "itemNosAddingToCart", "Leg/e$a;", "message", "Leg/e;", "<anonymous>", "(Ljava/util/List;Ljava/util/List;Leg/e$a;)Leg/e;"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.cart.impl.presentation.viewmodel.YouMayAlsoLikeViewModel$uiState$1", f = "YouMayAlsoLikeViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: eg.f$c */
    static final class c extends l implements r<List<? extends ProductItem>, List<? extends String>, C9655e.a, C17164e<? super C9655e>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f72718c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f72719d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f72720e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f72721f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C9656f f72722g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(C9656f fVar, C17164e<? super c> eVar) {
            super(4, eVar);
            this.f72722g = fVar;
        }

        /* renamed from: i */
        public final Object l(List<ProductItem> list, List<String> list2, C9655e.a aVar, C17164e<? super C9655e> eVar) {
            c cVar = new c(this.f72722g, eVar);
            cVar.f72719d = list;
            cVar.f72720e = list2;
            cVar.f72721f = aVar;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C9655e.a aVar;
            C13023e eVar;
            boolean z10;
            List list;
            C17187b.f();
            if (this.f72718c == 0) {
                y.b(obj);
                List list2 = (List) this.f72719d;
                List list3 = (List) this.f72720e;
                C9655e.a aVar2 = (C9655e.a) this.f72721f;
                boolean z11 = true;
                C13023e a10 = (list2 == null || !list2.isEmpty()) ? null : C13026h.a(Oo.b.f84321A3);
                if (list2 != null) {
                    z11 = false;
                }
                boolean z12 = z11;
                if (list2 != null) {
                    Iterable<ProductItem> iterable = list2;
                    C9656f fVar = this.f72722g;
                    list = new ArrayList(C16877v.y(iterable, 10));
                    for (ProductItem m10 : iterable) {
                        List list4 = list;
                        list4.add(B0.m(m10, b1.a.f85084a, list3, g0.d(), fVar.f72691n.s(), fVar.f72691n.w(), fVar.f72692o.b(), false, true, false, false, false, false, 3840, (Object) null));
                        list = list4;
                        fVar = fVar;
                        z12 = z12;
                        a10 = a10;
                        aVar2 = aVar2;
                    }
                    List list5 = list;
                    z10 = z12;
                    eVar = a10;
                    aVar = aVar2;
                } else {
                    z10 = z12;
                    eVar = a10;
                    aVar = aVar2;
                    list = C16877v.n();
                }
                return new C9655e(z10, list, eVar, aVar);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C9656f(U u10, Ax.c cVar, Il.a aVar, C10253a aVar2, Kf.x xVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(cVar, "productRemoteDataSource");
        C17542s.j(aVar, "appConfigApi");
        C17542s.j(aVar2, "killSwitchRepository");
        C17542s.j(xVar, "cartInteractor");
        this.f72690m = cVar;
        this.f72691n = aVar;
        this.f72692o = aVar2;
        this.f72693p = xVar;
        Object f10 = u10.f("itemNo");
        if (f10 != null) {
            this.f72694q = (String) f10;
            C16505B<List<String>> a10 = C16521S.a(C16877v.n());
            this.f72695r = a10;
            C16505B<List<ProductItem>> a11 = C16521S.a(null);
            this.f72696s = a11;
            C16505B<C9655e.a> a12 = C16521S.a(null);
            this.f72697t = a12;
            this.f72698u = C16534i.c0(C16534i.m(a11, a10, a12, new c(this, (C17164e<? super c>) null)), androidx.lifecycle.g0.a(this), ip.f.a(), new C9655e(true, (List) null, (C13023e) null, (C9655e.a) null, 14, (DefaultConstructorMarker) null));
            I();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void I() {
        F0 unused = C16314k.d(androidx.lifecycle.g0.a(this), (C17168i) null, (T) null, new b(this, (C17164e<? super b>) null), 3, (Object) null);
    }

    public final void G(String str, String str2) {
        List<String> value;
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "productName");
        C16505B<List<String>> b10 = this.f72695r;
        do {
            value = b10.getValue();
        } while (!b10.e(value, C16877v.W0(value, str)));
        F0 unused = C16314k.d(androidx.lifecycle.g0.a(this), (C17168i) null, (T) null, new a(this, str, str2, (C17164e<? super a>) null), 3, (Object) null);
    }

    public final void H() {
        this.f72697t.setValue(null);
    }

    public final C16519P<C9655e> m() {
        return this.f72698u;
    }
}
