package bi;

import HJ.C15854t;
import QJ.C16311i0;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.S;
import QJ.T;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import androidx.lifecycle.F;
import androidx.lifecycle.K;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.remotemodel.product.ProductDetailsResponseRemote;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fK.C17252e;
import ip.k;
import ip.l;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import op.C11697h;
import op.C11700k;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00130\f2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010 R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010'\u001a\u00020$8BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lbi/b;", "Lbi/a;", "LAx/c;", "productRemoteDataSource", "LWk/d;", "stockRepository", "LAx/a;", "pipRemoteDataSource", "<init>", "(LAx/c;LWk/d;LAx/a;)V", "", "productNo", "Landroidx/lifecycle/F;", "Lip/k;", "Lop/k;", "a", "(Ljava/lang/String;)Landroidx/lifecycle/F;", "itemNo", "storeId", "Lip/l;", "Lcom/ingka/ikea/app/stockinfo/local/a;", "c", "(Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/F;", "", "Lcom/ingka/ikea/core/model/product/ProductItem;", "d", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "b", "LAx/c;", "LWk/d;", "LAx/a;", "LQJ/F0;", "LQJ/F0;", "productDetailsLargeJob", "e", "productStockStatusJob", "LQJ/Q;", "h", "()LQJ/Q;", "coroutineScope", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Ax.c f65643a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Wk.d f65644b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final Ax.a f65645c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public F0 f65646d;

    /* renamed from: e  reason: collision with root package name */
    private F0 f65647e;

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"bi/b$a", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f65648a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ K f65649b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f65650c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(N.a aVar, b bVar, K k10, String str) {
            super(aVar);
            this.f65648a = bVar;
            this.f65649b = k10;
            this.f65650c = str;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            String str;
            Throwable th3 = th2;
            if (th3 instanceof UnknownHostException) {
                e eVar = e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str2 = null;
                String str3 = null;
                for (C11819b bVar : arrayList) {
                    if (str2 == null) {
                        String a10 = C11818a.a((String) null, th3);
                        if (a10 == null) {
                            break;
                        }
                        str2 = C11820c.a(a10);
                    }
                    String str4 = str2;
                    if (str3 == null) {
                        str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Pip got UnknownHostException";
                    }
                    String str5 = str3;
                    bVar.a(eVar, str5, false, th2, str4);
                    str2 = str4;
                    str3 = str5;
                }
                this.f65649b.postValue(k.a.f(k.f98528e, (String) null, this.f65650c, (Object) null, 5, (Object) null));
            } else if (th3 instanceof C17252e) {
                b bVar2 = this.f65648a;
                String str6 = "Invalid data received for: " + this.f65650c + " " + th2.getMessage();
                e eVar2 = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str7 = null;
                String str8 = null;
                for (C11819b bVar3 : arrayList2) {
                    if (str7 == null) {
                        String a11 = C11818a.a((String) null, th3);
                        if (a11 == null) {
                            break;
                        }
                        str7 = C11820c.a(a11);
                    }
                    String str9 = str7;
                    if (str8 == null) {
                        if (str6 == null) {
                            str = bVar2.getClass().getName();
                            C17542s.g(str);
                            String o12 = C15854t.o1(C15854t.s1(str, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                str = C15854t.P0(o12, "Kt");
                            }
                        } else {
                            str = str6;
                        }
                        str8 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + str;
                    }
                    String str10 = str8;
                    bVar3.a(eVar2, str10, false, th2, str9);
                    str7 = str9;
                    str8 = str10;
                    eVar2 = eVar2;
                }
                this.f65649b.postValue(k.a.b(k.f98528e, th2.getMessage(), (Object) null, (Object) null, 6, (Object) null));
            } else {
                e eVar3 = e.DEBUG;
                ArrayList<C11819b> arrayList3 = new ArrayList<>();
                for (Object next3 : qv.d.f102012a.a()) {
                    if (((C11819b) next3).b(eVar3, false)) {
                        arrayList3.add(next3);
                    }
                }
                String str11 = null;
                String str12 = null;
                for (C11819b bVar4 : arrayList3) {
                    if (str11 == null) {
                        String a12 = C11818a.a((String) null, th3);
                        if (a12 == null) {
                            break;
                        }
                        str11 = C11820c.a(a12);
                    }
                    String str13 = str11;
                    if (str12 == null) {
                        str12 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Pip got service exception";
                    }
                    String str14 = str12;
                    bVar4.a(eVar3, str14, false, th2, str13);
                    str11 = str13;
                    str12 = str14;
                }
                this.f65649b.postValue(k.a.b(k.f98528e, th2.getMessage(), (Object) null, (Object) null, 6, (Object) null));
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v2.PipRepositoryImpl$getProductDetailsLarge$3", f = "PipRepositoryImpl.kt", l = {113}, m = "invokeSuspend")
    /* renamed from: bi.b$b  reason: collision with other inner class name */
    static final class C1155b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f65651c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f65652d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f65653e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ K<k<C11700k, String>> f65654f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1155b(b bVar, String str, K<k<C11700k, String>> k10, C17164e<? super C1155b> eVar) {
            super(2, eVar);
            this.f65652d = bVar;
            this.f65653e = str;
            this.f65654f = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C1155b(this.f65652d, this.f65653e, this.f65654f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C1155b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f65651c;
            if (i10 == 0) {
                y.b(obj);
                Ax.a e10 = this.f65652d.f65645c;
                String str = this.f65653e;
                this.f65651c = 1;
                obj = e10.a(str, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b bVar = this.f65652d;
            K<k<C11700k, String>> k10 = this.f65654f;
            ProductDetailsResponseRemote productDetailsResponseRemote = (ProductDetailsResponseRemote) obj;
            bVar.f65646d = null;
            ProductLarge d10 = productDetailsResponseRemote.d();
            List<C11697h> c10 = productDetailsResponseRemote.c();
            List<ProductItem> b10 = productDetailsResponseRemote.b();
            if (b10 == null) {
                b10 = C16877v.n();
            }
            k10.postValue(k.f98528e.g(new C11700k(d10, c10, b10)));
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"bi/b$c", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ K f65655a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(N.a aVar, K k10) {
            super(aVar);
            this.f65655a = k10;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            this.f65655a.postValue(new l.a(th2.getMessage()));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.app.productinformationpage.v2.PipRepositoryImpl$getProductStockStatus$3", f = "PipRepositoryImpl.kt", l = {147}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f65656c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f65657d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f65658e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f65659f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ K<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> f65660g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(b bVar, String str, String str2, K<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> k10, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f65657d = bVar;
            this.f65658e = str;
            this.f65659f = str2;
            this.f65660g = k10;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f65657d, this.f65658e, this.f65659f, this.f65660g, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f65656c;
            if (i10 == 0) {
                y.b(obj);
                Wk.d f11 = this.f65657d.f65644b;
                String str = this.f65658e;
                String str2 = this.f65659f;
                this.f65656c = 1;
                obj = f11.e(str, str2, this);
                if (obj == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            com.ingka.ikea.app.stockinfo.local.a aVar = (com.ingka.ikea.app.stockinfo.local.a) obj;
            this.f65660g.postValue(aVar.c() ? new l.c(aVar) : new l.a(null));
            return C16807N.f139792a;
        }
    }

    public b(Ax.c cVar, Wk.d dVar, Ax.a aVar) {
        C17542s.j(cVar, "productRemoteDataSource");
        C17542s.j(dVar, "stockRepository");
        C17542s.j(aVar, "pipRemoteDataSource");
        this.f65643a = cVar;
        this.f65644b = dVar;
        this.f65645c = aVar;
    }

    private final Q h() {
        return S.a(C16311i0.a());
    }

    public F<k<C11700k, String>> a(String str) {
        String str2 = str;
        C17542s.j(str2, "productNo");
        K k10 = new K(k.a.d(k.f98528e, (Object) null, 1, (Object) null));
        F0 f02 = this.f65646d;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a("Force quiting ongoing job in Pip", (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, (Throwable) null, str5);
                str3 = str5;
                str4 = str6;
            }
            this.f65646d = null;
        }
        this.f65646d = C16314k.d(h(), new a(N.f137593c0, this, k10, str2), (T) null, new C1155b(this, str2, k10, (C17164e<? super C1155b>) null), 2, (Object) null);
        return k10;
    }

    public Object b(String str, C17164e<? super List<ProductItem>> eVar) {
        return this.f65643a.d(str, "allSameCat", eVar);
    }

    public F<ip.l<com.ingka.ikea.app.stockinfo.local.a, String>> c(String str, String str2) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "storeId");
        K k10 = new K(new l.b((Object) null, 1, (DefaultConstructorMarker) null));
        F0 f02 = this.f65647e;
        if (f02 != null) {
            F0.a.a(f02, (CancellationException) null, 1, (Object) null);
            this.f65647e = null;
        }
        this.f65647e = C16314k.d(h(), new c(N.f137593c0, k10), (T) null, new d(this, str2, str, k10, (C17164e<? super d>) null), 2, (Object) null);
        return k10;
    }

    public Object d(String str, C17164e<? super List<ProductItem>> eVar) {
        return this.f65643a.d(str, "removeItemCat", eVar);
    }
}
