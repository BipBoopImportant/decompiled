package Bw;

import Aw.C12606a;
import Bw.h;
import Bw.i;
import Bw.j;
import HJ.C15854t;
import KJ.C15987c;
import Mp.e;
import Op.c1;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.product.ProductCarousel;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.offerhub.impl.ui.i;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import jB.C14613b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import nI.t;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import sB.C15035a;
import up.C12071a;
import up.C12074d;
import xw.C15265a;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u0012JG\u0010!\u001a\u00020\u00102\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u00152\b\b\u0002\u0010\u001f\u001a\u00020\u00152\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b%\u0010$J)\u0010(\u001a\u00020\u00102\u0006\u0010'\u001a\u00020&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\b\b\u0002\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b*\u0010$J\u001d\u0010-\u001a\u00020\u00102\u0006\u0010,\u001a\u00020+2\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b-\u0010.J\u0015\u00101\u001a\u00020\u00102\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\u00102\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\r\u00107\u001a\u00020\u0010¢\u0006\u0004\b7\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020D0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020H0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bI\u0010FR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020K0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bL\u0010FR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020O0N8\u0002X\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020S0C8\u0002X\u0004¢\u0006\u0006\n\u0004\bT\u0010FR\u001d\u0010Z\u001a\b\u0012\u0004\u0012\u00020S0V8\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\b8\u0010Y¨\u0006["}, d2 = {"LBw/c;", "Landroidx/lifecycle/f0;", "LIp/b;", "offerHubRepository", "LBw/b;", "offerHubUiMapper", "Lxw/a;", "offerHubAnalytics", "Lup/d;", "userConsentRepository", "LAw/a;", "getCommercialMessagesForCarouselUseCase", "LjB/b;", "shoppingListRepository", "<init>", "(LIp/b;LBw/b;Lxw/a;Lup/d;LAw/a;LjB/b;)V", "LXH/N;", "G", "()V", "LMp/a;", "offerHub", "", "isLoading", "hasError", "V", "(LMp/a;ZZ)V", "H", "", "filterCategoryId", "filterId", "allowShuffleShapes", "isRefreshing", "initialLoad", "I", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/Boolean;)V", "K", "(Z)V", "S", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "U", "(Lcom/ingka/ikea/analytics/Interaction$Component;Ljava/lang/String;Ljava/lang/String;)V", "Q", "LOp/c1;", "event", "M", "(LOp/c1;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Lcom/ingka/ikea/offerhub/impl/ui/i;", "screenUiEvent", "N", "(Lcom/ingka/ikea/offerhub/impl/ui/i;)V", "LsB/a;", "action", "O", "(LsB/a;)V", "P", "m", "LIp/b;", "n", "LBw/b;", "o", "Lxw/a;", "p", "Lup/d;", "q", "Z", "hasDataBeenLoaded", "LTJ/B;", "LBw/a;", "r", "LTJ/B;", "offerHubState", "LBw/h;", "s", "recommendationsOnSaleState", "LBw/i;", "t", "surpriseOffersState", "", "LBw/j$d$a$c;", "u", "Ljava/util/List;", "shapes", "LBw/j;", "v", "_uiState", "LTJ/P;", "w", "LTJ/P;", "()LTJ/P;", "uiState", "offerhub-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends f0 {
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final Ip.b f108118m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final b f108119n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final C15265a f108120o;

    /* renamed from: p  reason: collision with root package name */
    private final C12074d f108121p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f108122q;

    /* renamed from: r  reason: collision with root package name */
    private final C16505B<C12661a> f108123r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public final C16505B<h> f108124s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C16505B<i> f108125t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final List<j.d.a.c> f108126u = C16877v.w1(j.d.a.c.b());
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<j> f108127v;

    /* renamed from: w  reason: collision with root package name */
    private final C16519P<j> f108128w;

    @Metadata(d1 = {"\u0000.\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\n¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"", "", "itemNosInShoppingList", "LBw/a;", "offerHubState", "LBw/h;", "recommendationsOnSaleState", "LBw/i;", "surpriseOffersState", "", "Lcw/b;", "commercialMessagesForCarousel", "LXH/N;", "<anonymous>", "(Ljava/util/Set;LBw/a;LBw/h;LBw/i;Ljava/util/List;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.offerhub.impl.viewmodel.OfferHubViewModel$1", f = "OfferHubViewModel.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements t<Set<? extends String>, C12661a, h, i, List<? extends cw.b>, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108129c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f108130d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f108131e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f108132f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f108133g;

        /* renamed from: h  reason: collision with root package name */
        /* synthetic */ Object f108134h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ c f108135i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(c cVar, C17164e<? super a> eVar) {
            super(6, eVar);
            this.f108135i = cVar;
        }

        /* renamed from: i */
        public final Object o(Set<String> set, C12661a aVar, h hVar, i iVar, List<cw.b> list, C17164e<? super C16807N> eVar) {
            a aVar2 = new a(this.f108135i, eVar);
            aVar2.f108130d = set;
            aVar2.f108131e = aVar;
            aVar2.f108132f = hVar;
            aVar2.f108133g = iVar;
            aVar2.f108134h = list;
            return aVar2.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object value;
            C17187b.f();
            if (this.f108129c == 0) {
                y.b(obj);
                j a10 = this.f108135i.f108119n.a(this.f108135i.m().getValue(), (Set) this.f108130d, (C12661a) this.f108131e, (h) this.f108132f, (i) this.f108133g, (List) this.f108134h);
                C16505B E10 = this.f108135i.f108127v;
                do {
                    value = E10.getValue();
                    j jVar = (j) value;
                } while (!E10.e(value, a10));
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Bw/c$b", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f108136a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(N.a aVar, c cVar) {
            super(aVar);
            this.f108136a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f108136a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Load offer hub failed " + th2.getMessage(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            c.W(this.f108136a, (Mp.a) null, false, true, 1, (Object) null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.offerhub.impl.viewmodel.OfferHubViewModel$fetchOfferHub$2", f = "OfferHubViewModel.kt", l = {120}, m = "invokeSuspend")
    /* renamed from: Bw.c$c  reason: collision with other inner class name */
    static final class C2580c extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108137c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f108138d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2580c(c cVar, C17164e<? super C2580c> eVar) {
            super(2, eVar);
            this.f108138d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2580c(this.f108138d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2580c) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108137c;
            if (i10 == 0) {
                y.b(obj);
                Ip.b i11 = this.f108138d.f108118m;
                this.f108137c = 1;
                obj = i11.a(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f108138d.V((Mp.a) obj, false, false);
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Bw/c$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f108139a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, c cVar) {
            super(aVar);
            this.f108139a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f108139a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Load recommendations failed " + th2.getMessage(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            this.f108139a.f108124s.setValue(h.a.f108151a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.offerhub.impl.viewmodel.OfferHubViewModel$fetchRecommendationsOnSale$2", f = "OfferHubViewModel.kt", l = {155}, m = "invokeSuspend")
    static final class e extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108140c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f108141d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(c cVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f108141d = cVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f108141d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108140c;
            if (i10 == 0) {
                y.b(obj);
                Ip.b i11 = this.f108141d.f108118m;
                this.f108140c = 1;
                obj = i11.b(this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f108141d.f108124s.setValue(new h.d((ProductCarousel) obj));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Bw/c$f", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f108142a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(N.a aVar, c cVar) {
            super(aVar);
            this.f108142a = cVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            c cVar = this.f108142a;
            qv.e eVar = qv.e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("Load surprise deals failed " + th2.getMessage(), (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            this.f108142a.f108125t.setValue(i.a.f108155a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.offerhub.impl.viewmodel.OfferHubViewModel$fetchSurpriseDeals$3", f = "OfferHubViewModel.kt", l = {204}, m = "invokeSuspend")
    static final class g extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f108143c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f108144d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f108145e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f108146f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ boolean f108147g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Boolean f108148h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(c cVar, String str, String str2, boolean z10, Boolean bool, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f108144d = cVar;
            this.f108145e = str;
            this.f108146f = str2;
            this.f108147g = z10;
            this.f108148h = bool;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f108144d, this.f108145e, this.f108146f, this.f108147g, this.f108148h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f108143c;
            if (i10 == 0) {
                y.b(obj);
                Ip.b i11 = this.f108144d.f108118m;
                String str = this.f108145e;
                String str2 = this.f108146f;
                this.f108143c = 1;
                obj = i11.c(str, str2, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Mp.e eVar = (Mp.e) obj;
            if (this.f108147g) {
                Collections.shuffle(this.f108144d.f108126u);
            }
            this.f108144d.f108125t.setValue(new i.d(eVar, this.f108144d.f108126u));
            if (C17542s.e(this.f108148h, kotlin.coroutines.jvm.internal.b.a(false))) {
                C15265a h10 = this.f108144d.f108120o;
                String value = Interaction$Component.OFFER_HUB_SHUFFLE.getValue();
                Iterable<ProductItem> k12 = C16877v.k1(eVar.d(), 4);
                ArrayList arrayList = new ArrayList(C16877v.y(k12, 10));
                for (ProductItem f11 : k12) {
                    arrayList.add(f11.f());
                }
                h10.b(value, arrayList, Interaction$Component.OFFER_HUB_SHUFFLE);
            }
            return C16807N.f139792a;
        }
    }

    public c(Ip.b bVar, b bVar2, C15265a aVar, C12074d dVar, C12606a aVar2, C14613b bVar3) {
        Ip.b bVar4 = bVar;
        b bVar5 = bVar2;
        C15265a aVar3 = aVar;
        C12074d dVar2 = dVar;
        C17542s.j(bVar4, "offerHubRepository");
        C17542s.j(bVar5, "offerHubUiMapper");
        C17542s.j(aVar3, "offerHubAnalytics");
        C17542s.j(dVar2, "userConsentRepository");
        C17542s.j(aVar2, "getCommercialMessagesForCarouselUseCase");
        C17542s.j(bVar3, "shoppingListRepository");
        this.f108118m = bVar4;
        this.f108119n = bVar5;
        this.f108120o = aVar3;
        this.f108121p = dVar2;
        C16505B<C12661a> a10 = C16521S.a(new C12661a((Mp.a) null, false, true));
        this.f108123r = a10;
        C16505B<h> a11 = C16521S.a(h.b.f108152a);
        this.f108124s = a11;
        C16505B<i> a12 = C16521S.a(i.b.f108156a);
        this.f108125t = a12;
        C16505B<j> a13 = C16521S.a(new j((j.a) null, (j.c) null, (j.b) null, (j.b) null, (j.b) null, (j.d) null, (C15035a) null, false, false, (C15987c) null, false, 2047, (DefaultConstructorMarker) null));
        this.f108127v = a13;
        this.f108128w = a13;
        C16534i.M(C16534i.k(bVar3.f(), a10, a11, a12, aVar2.invoke(), new a(this, (C17164e<? super a>) null)), g0.a(this));
    }

    private final void G() {
        W(this, (Mp.a) null, true, false, 1, (Object) null);
        F0 unused = C16314k.d(g0.a(this), new b(N.f137593c0, this), (T) null, new C2580c(this, (C17164e<? super C2580c>) null), 2, (Object) null);
    }

    private final void H() {
        if (this.f108121p.b(C12071a.c.f103981e)) {
            if (this.f108124s.getValue() instanceof h.d) {
                this.f108124s.setValue(h.c.f108153a);
            }
            F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(this, (C17164e<? super e>) null), 2, (Object) null);
        }
    }

    private final void I(String str, String str2, boolean z10, boolean z11, Boolean bool) {
        i value = this.f108125t.getValue();
        if (value instanceof i.d) {
            i.d dVar = (i.d) value;
            if (d.b(dVar, str, str2)) {
                if (z10) {
                    Collections.shuffle(this.f108126u);
                }
                List f10 = C16877v.f(dVar.b().d());
                this.f108125t.setValue(new i.d(Mp.e.b(dVar.b(), f10, (e.a) null, 2, (Object) null), this.f108126u));
                C15265a aVar = this.f108120o;
                String value2 = Interaction$Component.OFFER_HUB_SHUFFLE.getValue();
                Iterable<ProductItem> k12 = C16877v.k1(f10, 4);
                ArrayList arrayList = new ArrayList(C16877v.y(k12, 10));
                for (ProductItem f11 : k12) {
                    arrayList.add(f11.f());
                }
                aVar.b(value2, arrayList, Interaction$Component.OFFER_HUB_SHUFFLE);
                return;
            }
        }
        this.f108125t.setValue(z11 ? i.c.f108157a : i.b.f108156a);
        F0 unused = C16314k.d(g0.a(this), new f(N.f137593c0, this), (T) null, new g(this, str, str2, z10, bool, (C17164e<? super g>) null), 2, (Object) null);
    }

    static /* synthetic */ void J(c cVar, String str, String str2, boolean z10, boolean z11, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        if ((i10 & 16) != 0) {
            bool = Boolean.FALSE;
        }
        cVar.I(str, str2, z10, z11, bool);
    }

    public static /* synthetic */ void L(c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        cVar.K(z10);
    }

    public static /* synthetic */ void R(c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        cVar.Q(z10);
    }

    public static /* synthetic */ void T(c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        cVar.S(z10);
    }

    /* access modifiers changed from: private */
    public final void V(Mp.a aVar, boolean z10, boolean z11) {
        C16505B<C12661a> b10 = this.f108123r;
        b10.setValue(b10.getValue().a(aVar, z11, z10));
    }

    static /* synthetic */ void W(c cVar, Mp.a aVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        cVar.V(aVar, z10, z11);
    }

    public final void K(boolean z10) {
        if (!this.f108122q) {
            this.f108122q = true;
            G();
            H();
            J(this, (String) null, (String) null, z10, false, Boolean.TRUE, 11, (Object) null);
        }
    }

    public final void M(c1 c1Var, Interaction$Component interaction$Component) {
        C17542s.j(c1Var, "event");
        C17542s.j(interaction$Component, "component");
        if (c1Var instanceof c1.e) {
            this.f108120o.c(((c1.e) c1Var).a(), interaction$Component);
        }
    }

    public final void N(com.ingka.ikea.offerhub.impl.ui.i iVar) {
        C17542s.j(iVar, "screenUiEvent");
        if (!C17542s.e(iVar, i.c.f119210a)) {
            if (iVar instanceof i.e) {
                i.e eVar = (i.e) iVar;
                this.f108120o.d(eVar.b(), eVar.c().toString());
            } else if (iVar instanceof i.d) {
                i.d dVar = (i.d) iVar;
                this.f108120o.f(dVar.a(), dVar.c(), dVar.d());
            } else if (iVar instanceof i.g) {
                i.g gVar = (i.g) iVar;
                this.f108120o.b(gVar.b(), gVar.c(), gVar.a());
            } else if (iVar instanceof i.h) {
            } else {
                if (iVar instanceof i.f) {
                    i.f fVar = (i.f) iVar;
                    this.f108120o.a(fVar.a(), fVar.b().toString());
                    return;
                }
                throw new XH.t();
            }
        }
    }

    public final void O(C15035a aVar) {
        C17542s.j(aVar, "action");
        C16505B<j> b10 = this.f108127v;
        while (true) {
            j value = b10.getValue();
            C16505B<j> b11 = b10;
            if (!b11.e(value, j.b(value, (j.a) null, (j.c) null, (j.b) null, (j.b) null, (j.b) null, (j.d) null, aVar, false, false, (C15987c) null, false, 1983, (Object) null))) {
                b10 = b11;
            } else {
                return;
            }
        }
    }

    public final void P() {
        j value;
        C16505B<j> b10 = this.f108127v;
        do {
            value = b10.getValue();
        } while (!b10.e(value, j.b(value, (j.a) null, (j.c) null, (j.b) null, (j.b) null, (j.b) null, (j.d) null, (C15035a) null, false, false, (C15987c) null, false, 1983, (Object) null)));
    }

    public final void Q(boolean z10) {
        H();
        J(this, (String) null, (String) null, z10, true, (Boolean) null, 19, (Object) null);
    }

    public final void S(boolean z10) {
        G();
        h value = this.f108124s.getValue();
        if (C17542s.e(value, h.a.f108151a) || C17542s.e(value, h.b.f108152a)) {
            H();
        } else if (!C17542s.e(value, h.c.f108153a) && !(value instanceof h.d)) {
            throw new XH.t();
        }
        if (this.f108125t.getValue() instanceof i.a) {
            J(this, (String) null, (String) null, z10, false, (Boolean) null, 27, (Object) null);
        }
    }

    public final void U(Interaction$Component interaction$Component, String str, String str2) {
        C17542s.j(interaction$Component, "component");
        J(this, str, str2, false, false, (Boolean) null, 28, (Object) null);
        this.f108120o.e(interaction$Component, str, str2);
    }

    public final C16519P<j> m() {
        return this.f108128w;
    }
}
