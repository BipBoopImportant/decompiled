package xx;

import HJ.C15854t;
import Kf.C9133b;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.x;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.core.model.Media;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.remotemodel.product.ProductDetailsResponseRemote;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import ip.C11410b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import op.C11697h;
import op.C11698i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import qx.C14956a;
import rx.C15004a;
import wx.C15193a;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00160*8\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010,R\u001d\u00108\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0006¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u00102R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010,R\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0006¢\u0006\f\n\u0004\b;\u00100\u001a\u0004\b<\u00102R \u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0>0*8\u0002X\u0004¢\u0006\u0006\n\u0004\b@\u0010,R#\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0>0.8\u0006¢\u0006\f\n\u0004\bB\u00100\u001a\u0004\bC\u00102R\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00020\f0*8\u0002X\u0004¢\u0006\u0006\n\u0004\bE\u0010,R\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020\f0.8\u0006¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u00102R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J0*8\u0002X\u0004¢\u0006\u0006\n\u0004\bK\u0010,R\u001d\u0010O\u001a\b\u0012\u0004\u0012\u00020J0.8\u0006¢\u0006\f\n\u0004\bM\u00100\u001a\u0004\bN\u00102R \u0010T\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160Q0P8\u0002X\u0004¢\u0006\u0006\n\u0004\bR\u0010SR#\u0010W\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160Q0.8\u0006¢\u0006\f\n\u0004\bU\u00100\u001a\u0004\bV\u00102¨\u0006X"}, d2 = {"Lxx/b;", "Landroidx/lifecycle/f0;", "Landroidx/lifecycle/U;", "savedStateHandle", "LKf/b;", "cartApi", "LAx/a;", "productDetailsRemoteDataSource", "LIl/a;", "appConfigApi", "<init>", "(Landroidx/lifecycle/U;LKf/b;LAx/a;LIl/a;)V", "", "itemNo", "LXH/N;", "T", "(Ljava/lang/String;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "I", "(Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "selectedItemNo", "", "S", "(Ljava/lang/String;)Z", "m", "LKf/b;", "n", "LAx/a;", "o", "LIl/a;", "p", "Ljava/lang/String;", "N", "()Ljava/lang/String;", "initialItemNo", "Lrx/a;", "q", "Lrx/a;", "P", "()Lrx/a;", "productConfiguratorMode", "Landroidx/lifecycle/K;", "r", "Landroidx/lifecycle/K;", "_showProgress", "Landroidx/lifecycle/F;", "s", "Landroidx/lifecycle/F;", "Q", "()Landroidx/lifecycle/F;", "showProgress", "t", "_imageUrl", "u", "M", "imageUrl", "v", "_title", "w", "R", "title", "", "Lwx/a;", "x", "_facets", "y", "L", "facets", "z", "_combinationPrice", "A", "K", "combinationPrice", "Lxx/a;", "B", "_addToCartData", "C", "J", "addToCartData", "Lip/b;", "LXH/x;", "D", "Lip/b;", "_onAddToCart", "E", "O", "onAddToCart", "productconfigurator-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xx.b  reason: case insensitive filesystem */
public final class C15270b extends f0 {

    /* renamed from: A  reason: collision with root package name */
    private final F<String> f132053A;
    /* access modifiers changed from: private */

    /* renamed from: B  reason: collision with root package name */
    public final K<C15269a> f132054B;

    /* renamed from: C  reason: collision with root package name */
    private final F<C15269a> f132055C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public final C11410b<x<Boolean>> f132056D;

    /* renamed from: E  reason: collision with root package name */
    private final F<x<Boolean>> f132057E;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final C9133b f132058m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final Ax.a f132059n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public final Il.a f132060o;

    /* renamed from: p  reason: collision with root package name */
    private final String f132061p;

    /* renamed from: q  reason: collision with root package name */
    private final C15004a f132062q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final K<Boolean> f132063r;

    /* renamed from: s  reason: collision with root package name */
    private final F<Boolean> f132064s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final K<String> f132065t;

    /* renamed from: u  reason: collision with root package name */
    private final F<String> f132066u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final K<String> f132067v;

    /* renamed from: w  reason: collision with root package name */
    private final F<String> f132068w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public final K<List<C15193a>> f132069x;

    /* renamed from: y  reason: collision with root package name */
    private final F<List<C15193a>> f132070y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public final K<String> f132071z;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"xx/b$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xx.b$a */
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15270b f132072a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, C15270b bVar) {
            super(aVar);
            this.f132072a = bVar;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            C11410b F10 = this.f132072a.f132056D;
            x.a aVar = x.f139812b;
            F10.d(x.a(x.b(y.a(th2))));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.productconfigurator.impl.viewmodels.ProductConfigurationViewModel$addToCart$2", f = "ProductConfigurationViewModel.kt", l = {140}, m = "invokeSuspend")
    /* renamed from: xx.b$b  reason: collision with other inner class name */
    static final class C3263b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f132073c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f132074d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15270b f132075e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f132076f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ int f132077g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ Interaction$Component f132078h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C3263b(C15270b bVar, String str, int i10, Interaction$Component interaction$Component, C17164e<? super C3263b> eVar) {
            super(2, eVar);
            this.f132075e = bVar;
            this.f132076f = str;
            this.f132077g = i10;
            this.f132078h = interaction$Component;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            C3263b bVar = new C3263b(this.f132075e, this.f132076f, this.f132077g, this.f132078h, eVar);
            bVar.f132074d = obj;
            return bVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C3263b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Q q10;
            Object f10 = C17187b.f();
            int i10 = this.f132073c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f132074d;
                C9133b i11 = this.f132075e.f132058m;
                List e10 = C16877v.e(new Kf.y(this.f132076f, this.f132077g));
                Interaction$Component interaction$Component = this.f132078h;
                this.f132074d = q11;
                this.f132073c = 1;
                if (C9133b.C1020b.a(i11, e10, interaction$Component, (String) null, this, 4, (Object) null) == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                q10 = (Q) this.f132074d;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e eVar = e.DEBUG;
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
                    String a10 = C11818a.a("Add to cart successful", (Throwable) null);
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
                bVar.a(eVar, str4, false, (Throwable) null, str3);
                str = str3;
                str2 = str4;
            }
            C11410b F10 = this.f132075e.f132056D;
            x.a aVar = x.f139812b;
            F10.d(x.a(x.b(b.a(true))));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"xx/b$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xx.b$c */
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15270b f132079a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f132080b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, C15270b bVar, String str) {
            super(aVar);
            this.f132079a = bVar;
            this.f132080b = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            String str;
            this.f132079a.f132063r.postValue(Boolean.FALSE);
            C15270b bVar = this.f132079a;
            String str2 = "Could not get configuration for: " + this.f132080b;
            e eVar = e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, th2);
                    if (a10 != null) {
                        str3 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str5 = str3;
                if (str4 == null) {
                    if (str2 == null) {
                        str = bVar.getClass().getName();
                        C17542s.g(str);
                        String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            str = C15854t.P0(o12, "Kt");
                        }
                    } else {
                        str = str2;
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + str;
                }
                String str6 = str4;
                bVar2.a(eVar, str6, false, th2, str5);
                str3 = str5;
                str4 = str6;
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.productconfigurator.impl.viewmodels.ProductConfigurationViewModel$loadConfiguration$2", f = "ProductConfigurationViewModel.kt", l = {77}, m = "invokeSuspend")
    /* renamed from: xx.b$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f132081c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f132082d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C15270b f132083e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f132084f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C15270b bVar, String str, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f132083e = bVar;
            this.f132084f = str;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            d dVar = new d(this.f132083e, this.f132084f, eVar);
            dVar.f132082d = obj;
            return dVar;
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Q q10;
            String str;
            Object obj3;
            String str2;
            Object obj4;
            char c10;
            List n10;
            Object f10 = C17187b.f();
            int i10 = this.f132081c;
            if (i10 == 0) {
                y.b(obj);
                Q q11 = (Q) this.f132082d;
                this.f132083e.f132063r.postValue(b.a(true));
                Ax.a j10 = this.f132083e.f132059n;
                String str3 = this.f132084f;
                this.f132082d = q11;
                this.f132081c = 1;
                obj2 = j10.a(str3, this);
                if (obj2 == f10) {
                    return f10;
                }
                q10 = q11;
            } else if (i10 == 1) {
                q10 = (Q) this.f132082d;
                y.b(obj);
                obj2 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ProductDetailsResponseRemote productDetailsResponseRemote = (ProductDetailsResponseRemote) obj2;
            ProductLarge d10 = productDetailsResponseRemote.d();
            this.f132083e.f132067v.postValue(d10.h().i());
            K E10 = this.f132083e.f132065t;
            Iterator it = d10.g().iterator();
            while (true) {
                str = null;
                if (!it.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it.next();
                if (((Media) obj3).getUrl().length() > 0) {
                    break;
                }
            }
            Media media = (Media) obj3;
            if (media == null || (str2 = media.getUrl()) == null) {
                str2 = "";
            }
            E10.postValue(str2);
            Iterable<C11697h> c11 = productDetailsResponseRemote.c();
            ArrayList arrayList = new ArrayList(C16877v.y(c11, 10));
            for (C11697h hVar : c11) {
                List<C11698i> c12 = hVar.c();
                if (c12 != null) {
                    Iterable iterable = c12;
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it2 = iterable.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            } else if (((C11698i) it2.next()).a() == null) {
                                e eVar = e.WARN;
                                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                                for (Object next : qv.d.f102012a.a()) {
                                    if (((C11819b) next).b(eVar, false)) {
                                        arrayList2.add(next);
                                    }
                                }
                                String str4 = null;
                                String str5 = null;
                                for (C11819b bVar : arrayList2) {
                                    if (str4 == null) {
                                        String a10 = C11818a.a("Contact aws they need to fix their api", (Throwable) null);
                                        if (a10 == null) {
                                            break;
                                        }
                                        str4 = C11820c.a(a10);
                                    }
                                    if (str5 == null) {
                                        String name = q10.getClass().getName();
                                        C17542s.g(name);
                                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                        if (o12.length() != 0) {
                                            name = C15854t.P0(o12, "Kt");
                                        }
                                        str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                                    }
                                    String str6 = str5;
                                    bVar.a(eVar, str6, false, (Throwable) null, str4);
                                    str5 = str6;
                                }
                            }
                        }
                    }
                }
                List<C11698i> c13 = hVar.c();
                if (c13 != null) {
                    Iterable<C11698i> iterable2 = c13;
                    c10 = 10;
                    n10 = new ArrayList(C16877v.y(iterable2, 10));
                    for (C11698i iVar : iterable2) {
                        n10.add(hVar.a() ? new wx.d(iVar.e(), iVar.d(), iVar.b(), iVar.c()) : new wx.e(iVar.e(), iVar.d(), iVar.c()));
                    }
                } else {
                    c10 = 10;
                    n10 = C16877v.n();
                }
                arrayList.add(new C15193a(hVar.b(), n10, false, 4, (DefaultConstructorMarker) null));
                char c14 = c10;
            }
            this.f132083e.f132069x.postValue(arrayList);
            this.f132083e.f132071z.postValue(C14956a.f130484a.b(d10.h().g().e().c(), this.f132083e.f132060o.s()));
            K k10 = this.f132083e.f132054B;
            boolean t10 = d10.t();
            Iterator it3 = d10.p().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it3.next();
                if (((ProductItem.ProductDisclaimer) obj4).e() == ProductItem.ProductDisclaimer.c.PRICE_DELIVERY) {
                    break;
                }
            }
            ProductItem.ProductDisclaimer productDisclaimer = (ProductItem.ProductDisclaimer) obj4;
            if (productDisclaimer != null) {
                str = productDisclaimer.d();
            }
            k10.postValue(new C15269a(t10, str));
            this.f132083e.f132063r.postValue(b.a(false));
            return C16807N.f139792a;
        }
    }

    public C15270b(U u10, C9133b bVar, Ax.a aVar, Il.a aVar2) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(bVar, "cartApi");
        C17542s.j(aVar, "productDetailsRemoteDataSource");
        C17542s.j(aVar2, "appConfigApi");
        this.f132058m = bVar;
        this.f132059n = aVar;
        this.f132060o = aVar2;
        Object f10 = u10.f("itemNo");
        if (f10 != null) {
            this.f132061p = (String) f10;
            C15004a.C3231a aVar3 = C15004a.Companion;
            Object f11 = u10.f("productConfiguratorMode");
            if (f11 != null) {
                this.f132062q = aVar3.a((String) f11);
                K<Boolean> k10 = new K<>();
                this.f132063r = k10;
                this.f132064s = k10;
                K<String> k11 = new K<>();
                this.f132065t = k11;
                this.f132066u = k11;
                K<String> k12 = new K<>();
                this.f132067v = k12;
                this.f132068w = k12;
                K<List<C15193a>> k13 = new K<>();
                this.f132069x = k13;
                this.f132070y = k13;
                K<String> k14 = new K<>();
                this.f132071z = k14;
                this.f132053A = k14;
                K<C15269a> k15 = new K<>();
                this.f132054B = k15;
                this.f132055C = k15;
                C11410b<x<Boolean>> bVar2 = new C11410b<>();
                this.f132056D = bVar2;
                this.f132057E = bVar2;
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final void I(String str, Interaction$Component interaction$Component) {
        C17542s.j(str, "itemNo");
        C17542s.j(interaction$Component, "component");
        F0 unused = C16314k.d(g0.a(this), new a(N.f137593c0, this), (T) null, new C3263b(this, str, 1, interaction$Component, (C17164e<? super C3263b>) null), 2, (Object) null);
    }

    public final F<C15269a> J() {
        return this.f132055C;
    }

    public final F<String> K() {
        return this.f132053A;
    }

    public final F<List<C15193a>> L() {
        return this.f132070y;
    }

    public final F<String> M() {
        return this.f132066u;
    }

    public final String N() {
        return this.f132061p;
    }

    public final F<x<Boolean>> O() {
        return this.f132057E;
    }

    public final C15004a P() {
        return this.f132062q;
    }

    public final F<Boolean> Q() {
        return this.f132064s;
    }

    public final F<String> R() {
        return this.f132068w;
    }

    public final boolean S(String str) {
        return str != null && !C17542s.e(str, this.f132061p);
    }

    public final void T(String str) {
        C17542s.j(str, "itemNo");
        F0 unused = C16314k.d(g0.a(this), new c(N.f137593c0, this, str), (T) null, new d(this, str, (C17164e<? super d>) null), 2, (Object) null);
    }
}
