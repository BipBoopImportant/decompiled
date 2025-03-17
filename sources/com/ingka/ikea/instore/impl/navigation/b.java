package com.ingka.ikea.instore.impl.navigation;

import HJ.C15854t;
import Ht.h;
import QJ.Q;
import XH.C16807N;
import XH.y;
import Zl.a;
import android.content.UriMatcher;
import android.net.Uri;
import com.ingka.ikea.instore.impl.navigation.InstoreRoutes$ChangeStoreDialog;
import com.ingka.ikea.instore.impl.navigation.InstoreRoutes$StorePage;
import com.ingka.ikea.instore.impl.storeevents.navigation.StoreEventsRoutes$StoreEventsHost;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import sf.C10242c;
import st.c;
import up.C12074d;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\"B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u001f\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\n0\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\rJ\u0017\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\n0\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\n \u0010*\u0004\u0018\u00010\n0\nH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001d\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u001f\u001a\n \u0010*\u0004\u0018\u00010\n0\n2\u0006\u0010\u000b\u001a\u00020\nH@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010'R\u0014\u0010*\u001a\u00020(8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)¨\u0006+"}, d2 = {"Lcom/ingka/ikea/instore/impl/navigation/b;", "LZl/a;", "Lsf/c;", "appUserDataRepository", "Lup/d;", "userConsentRepository", "LZs/a;", "inStoreNavigation", "<init>", "(Lsf/c;Lup/d;LZs/a;)V", "Landroid/net/Uri;", "uri", "i", "(Landroid/net/Uri;)Landroid/net/Uri;", "f", "g", "kotlin.jvm.PlatformType", "d", "h", "()Landroid/net/Uri;", "j", "", "cc", "LXH/N;", "k", "(Ljava/lang/String;)V", "changeStoreConfirmedUri", "changeStoreDeniedUri", "noStoreIdUri", "e", "(Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;)Landroid/net/Uri;", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Lsf/c;", "c", "Lup/d;", "LZs/a;", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements Zl.a {

    /* renamed from: f  reason: collision with root package name */
    public static final a f96249f = new a((DefaultConstructorMarker) null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f96250g = 8;

    /* renamed from: b  reason: collision with root package name */
    private final C10242c f96251b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C12074d f96252c;

    /* renamed from: d  reason: collision with root package name */
    private final Zs.a f96253d;

    /* renamed from: e  reason: collision with root package name */
    private final UriMatcher f96254e;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/instore/impl/navigation/b$a;", "", "<init>", "()V", "", "WAYFINDING_MATCH", "I", "STORE_EVENT_MATCH", "STORE_MAP_MATCH", "STORE_PAGE_MATCH", "STORE_PRODUCT_SCANNER_MATCH", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.instore.impl.navigation.InstoreAppLinkMapper$setMarketCode$1$1", f = "InstoreAppLinkMapper.kt", l = {171}, m = "invokeSuspend")
    /* renamed from: com.ingka.ikea.instore.impl.navigation.b$b  reason: collision with other inner class name */
    static final class C2134b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f96255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ b f96256d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2134b(b bVar, C17164e<? super C2134b> eVar) {
            super(2, eVar);
            this.f96256d = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new C2134b(this.f96256d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((C2134b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f96255c;
            if (i10 == 0) {
                y.b(obj);
                C12074d c10 = this.f96256d.f96252c;
                this.f96255c = 1;
                if (c10.a(this) == f10) {
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

    public b(C10242c cVar, C12074d dVar, Zs.a aVar) {
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(dVar, "userConsentRepository");
        C17542s.j(aVar, "inStoreNavigation");
        this.f96251b = cVar;
        this.f96252c = dVar;
        this.f96253d = aVar;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("www.ikea.com", "ikeaapp/instore/wayfinding", 2);
        uriMatcher.addURI("www.ikea.com", "ikeaapp/instore/storeEvent", 3);
        uriMatcher.addURI("in-store", "indoor-map/open", 4);
        uriMatcher.addURI("in-store", "store-event/open", 3);
        uriMatcher.addURI("in-store", "open", 5);
        uriMatcher.addURI("navigation", "in-store/scanner/open", 6);
        this.f96254e = uriMatcher;
    }

    private final Uri d(Uri uri) {
        return InstoreRoutes$StorePage.Companion.a(h.OPEN_STORE_MAP, uri.getQueryParameter("productId"));
    }

    private final Uri e(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
        String queryParameter = uri.getQueryParameter("storeId");
        if (queryParameter == null) {
            return uri4;
        }
        InstoreRoutes$ChangeStoreDialog.a aVar = InstoreRoutes$ChangeStoreDialog.Companion;
        String queryParameter2 = uri.getQueryParameter("productId");
        String uri5 = uri2.toString();
        C17542s.i(uri5, "toString(...)");
        String uri6 = uri3.toString();
        C17542s.i(uri6, "toString(...)");
        return aVar.a(queryParameter, queryParameter2, uri5, uri6);
    }

    private final Uri f(Uri uri) {
        Uri uri2 = uri;
        String c10 = this.f96251b.c();
        String queryParameter = uri2.getQueryParameter("cc");
        String queryParameter2 = uri2.getQueryParameter("eventId");
        String queryParameter3 = uri2.getQueryParameter("storeId");
        Class<b> cls = b.class;
        if (queryParameter == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("App-link for store event didn't contain market");
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
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, illegalArgumentException, str);
            }
            return a.C1929a.b(Zl.a.f89961a, Integer.valueOf(c.f102818w0), (String) null, 2, (Object) null);
        } else if (c10 != null && !C17542s.e(c10, queryParameter)) {
            return a.C1929a.b(Zl.a.f89961a, Integer.valueOf(c.f102815v0), (String) null, 2, (Object) null);
        } else {
            if (queryParameter3 != null) {
                return StoreEventsRoutes$StoreEventsHost.Companion.a(queryParameter3, queryParameter2);
            }
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("App-link for store event didn't contain a store id");
            e eVar2 = e.WARN;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str3 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, illegalArgumentException2, str3);
            }
            return Uri.parse(this.f96253d.a());
        }
    }

    private final Uri g(Uri uri) {
        String c10 = this.f96251b.c();
        Uri parse = Uri.parse(this.f96253d.a());
        String queryParameter = uri.getQueryParameter("cc");
        if (queryParameter == null) {
            return parse;
        }
        if (c10 == null || c10.length() == 0) {
            k(queryParameter);
            c10 = this.f96251b.c();
        }
        if (c10 != null && !C17542s.e(c10, queryParameter)) {
            return a.C1929a.b(Zl.a.f89961a, Integer.valueOf(c.f102828z1), (String) null, 2, (Object) null);
        }
        Uri d10 = d(uri);
        C17542s.i(d10, "getStorePageStoreMapUri(...)");
        Uri d11 = d(uri);
        C17542s.i(d11, "getStorePageStoreMapUri(...)");
        return e(uri, d10, parse, d11);
    }

    private final Uri h() {
        return InstoreRoutes$StorePage.a.b(InstoreRoutes$StorePage.Companion, h.OPEN_STORE_PAGE, (String) null, 2, (Object) null);
    }

    private final Uri i(Uri uri) {
        String c10 = this.f96251b.c();
        Uri parse = Uri.parse(this.f96253d.a());
        String queryParameter = uri.getQueryParameter("cc");
        if (queryParameter == null) {
            return parse;
        }
        if (c10 == null || c10.length() == 0) {
            k(queryParameter);
            c10 = this.f96251b.c();
        }
        return (c10 == null || C17542s.e(c10, queryParameter)) ? e(uri, parse, parse, parse) : a.C1929a.b(Zl.a.f89961a, Integer.valueOf(c.f102828z1), (String) null, 2, (Object) null);
    }

    private final Uri j() {
        return InstoreRoutes$StorePage.a.b(InstoreRoutes$StorePage.Companion, h.OPEN_SCANNER_FROM_SHORTCUT, (String) null, 2, (Object) null);
    }

    private final void k(String str) {
        C10242c cVar = this.f96251b;
        if (!C17542s.e(cVar.c(), str)) {
            cVar.B(str);
            Object unused = C16312j.b((C17168i) null, new C2134b(this, (C17164e<? super C2134b>) null), 1, (Object) null);
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("User will be redirected via FTE, if logged in the user will be logged out", (Throwable) null);
                    if (a10 != null) {
                        str2 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = cVar.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, (Throwable) null, str4);
                str2 = str4;
                str3 = str5;
            }
        }
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return Zl.b.a(this.f96254e, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        int match = this.f96254e.match(uri);
        return match != 2 ? match != 3 ? match != 4 ? match != 5 ? match != 6 ? a.C1929a.b(Zl.a.f89961a, (Integer) null, (String) null, 3, (Object) null) : j() : h() : g(uri) : f(uri) : i(uri);
    }
}
