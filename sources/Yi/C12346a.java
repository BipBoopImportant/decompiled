package yi;

import HJ.C15854t;
import XH.t;
import YH.C16877v;
import Zl.a;
import android.content.UriMatcher;
import android.net.Uri;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import fI.C17220a;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ow.c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;
import rw.g;
import sf.C10242c;
import vi.C12127a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00162\u00020\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH@¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lyi/a;", "LZl/a;", "Lsf/c;", "appUserDataRepository", "Lvi/a;", "purchaseHistoryNavigation", "<init>", "(Lsf/c;Lvi/a;)V", "Landroid/net/Uri;", "uri", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Lsf/c;", "c", "Lvi/a;", "Landroid/content/UriMatcher;", "d", "Landroid/content/UriMatcher;", "uriMatcher", "e", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yi.a  reason: case insensitive filesystem */
public final class C12346a implements a {

    /* renamed from: e  reason: collision with root package name */
    public static final C2535a f106292e = new C2535a((DefaultConstructorMarker) null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f106293f = 8;

    /* renamed from: b  reason: collision with root package name */
    private final C10242c f106294b;

    /* renamed from: c  reason: collision with root package name */
    private final C12127a f106295c;

    /* renamed from: d  reason: collision with root package name */
    private final UriMatcher f106296d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lyi/a$a;", "", "<init>", "()V", "", "LINK_CC_INDEX", "I", "a", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yi.a$a  reason: collision with other inner class name */
    public static final class C2535a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lyi/a$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "LEGACY_MATCH", "LEGACY_INTERNAL_MATCH", "NEW_FORMAT_MATCH", "OPEN", "DETAILS", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yi.a$a$a  reason: collision with other inner class name */
        private enum C2536a {
            LEGACY_MATCH,
            LEGACY_INTERNAL_MATCH,
            NEW_FORMAT_MATCH,
            OPEN,
            DETAILS;

            static {
                C2536a[] a10;
                $ENTRIES = C17221b.a(a10);
            }

            public static C17220a<C2536a> b() {
                return $ENTRIES;
            }
        }

        public /* synthetic */ C2535a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2535a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yi.a$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106297a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                yi.a$a$a[] r0 = yi.C12346a.C2535a.C2536a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                yi.a$a$a r1 = yi.C12346a.C2535a.C2536a.OPEN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                yi.a$a$a r1 = yi.C12346a.C2535a.C2536a.DETAILS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                yi.a$a$a r1 = yi.C12346a.C2535a.C2536a.LEGACY_MATCH     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                yi.a$a$a r1 = yi.C12346a.C2535a.C2536a.LEGACY_INTERNAL_MATCH     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                yi.a$a$a r1 = yi.C12346a.C2535a.C2536a.NEW_FORMAT_MATCH     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f106297a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yi.C12346a.b.<clinit>():void");
        }
    }

    public C12346a(C10242c cVar, C12127a aVar) {
        C17542s.j(cVar, "appUserDataRepository");
        C17542s.j(aVar, "purchaseHistoryNavigation");
        this.f106294b = cVar;
        this.f106295c = aVar;
        UriMatcher uriMatcher = new UriMatcher(-1);
        C2535a.C2536a aVar2 = C2535a.C2536a.LEGACY_MATCH;
        uriMatcher.addURI("order.ikea.com", "/*/history", aVar2.ordinal());
        C2535a.C2536a aVar3 = C2535a.C2536a.NEW_FORMAT_MATCH;
        uriMatcher.addURI("www.ikea.com", "ikeaapp/purchaseHistory/*", aVar3.ordinal());
        uriMatcher.addURI("www.ikea.com", "ikeaapp/purchaseHistory/*/*", aVar3.ordinal());
        uriMatcher.addURI("www.ikea.com", "/*/history", aVar2.ordinal());
        C2535a.C2536a aVar4 = C2535a.C2536a.LEGACY_INTERNAL_MATCH;
        uriMatcher.addURI("navigation", "/purchaseHistory/*", aVar4.ordinal());
        uriMatcher.addURI("navigation", "/purchaseHistory/*/*", aVar4.ordinal());
        uriMatcher.addURI("purchasehistory", "open", C2535a.C2536a.OPEN.ordinal());
        uriMatcher.addURI("purchasehistory", "details", C2535a.C2536a.DETAILS.ordinal());
        this.f106296d = uriMatcher;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return Zl.b.a(this.f106296d, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        String str;
        Class<C12346a> cls;
        Uri uri2;
        Uri uri3 = uri;
        C2535a.C2536a aVar = (C2535a.C2536a) C16877v.z0(C2535a.C2536a.b(), this.f106296d.match(uri3));
        e eVar2 = e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            cls = C12346a.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Mapped uri to: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String str5 = name;
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                String P02 = o12.length() == 0 ? str5 : C15854t.P0(o12, "Kt");
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + P02;
            }
            String str6 = str3;
            bVar.a(eVar2, str6, false, (Throwable) null, str4);
            str3 = str6;
            str2 = str4;
        }
        int i10 = aVar == null ? -1 : b.f106297a[aVar.ordinal()];
        if (i10 != -1) {
            if (i10 == 1) {
                return this.f106295c.a((String) null);
            }
            if (i10 == 2) {
                return this.f106295c.a(uri3.getQueryParameter("orderId"));
            } else if (i10 == 3) {
                String str7 = uri.getPathSegments().get(0);
                if (this.f106294b.c() != null && !C17542s.e(str7, this.f106294b.c())) {
                    return a.f89961a.a(kotlin.coroutines.jvm.internal.b.e(Oo.b.f84748p5), uri.toString());
                }
                String fragment = uri.getFragment();
                if (fragment == null) {
                    fragment = "";
                }
                Uri parse = Uri.parse(fragment);
                String queryParameter = parse.getQueryParameter("orderId");
                String queryParameter2 = parse.getQueryParameter("lid");
                String uri4 = parse.toString();
                C17542s.i(uri4, "toString(...)");
                if (C15854t.d0(uri4, "details", false, 2, (Object) null)) {
                    Uri.Builder appendQueryParameter = Uri.parse(c.b("ikea://navigation/purchaseHistory/order/details?orderId={orderId}&fromConfirmation={fromConfirmation}&type={type}&liteId={liteId}")).buildUpon().appendQueryParameter("cc", str7);
                    C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
                    uri2 = g.a(g.a(appendQueryParameter, "orderId", queryParameter), "liteId", queryParameter2).build();
                } else {
                    Uri.Builder appendQueryParameter2 = Uri.parse(c.b("ikea://navigation/purchaseHistory/order?orderId={orderId}&liteId={liteId}&cc={cc}")).buildUpon().appendQueryParameter("cc", str7);
                    C17542s.i(appendQueryParameter2, "appendQueryParameter(...)");
                    uri2 = g.a(g.a(appendQueryParameter2, "orderId", queryParameter), "liteId", queryParameter2).build();
                }
                C17542s.g(uri2);
                return uri2;
            } else if (i10 == 4) {
                IllegalStateException illegalStateException = new IllegalStateException("We cannot simply remove LEGACY_INTERNAL_MATCH from from PurchaseHistoryApplinkMapper, found usage " + uri3);
                e eVar3 = e.ERROR;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar3, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str8 = null;
                String str9 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str8 == null) {
                        String a11 = C11818a.a((String) null, illegalStateException);
                        if (a11 == null) {
                            return uri3;
                        }
                        str8 = C11820c.a(a11);
                    }
                    if (str9 == null) {
                        String name2 = cls.getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar3, str9, false, illegalStateException, str8);
                }
                return uri3;
            } else if (i10 != 5) {
                throw new t();
            }
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("We are remapping NEW_FORMAT_MATCH is that expected, found usage " + uri3);
        e eVar4 = e.ERROR;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next3 : d.f102012a.a()) {
            if (((C11819b) next3).b(eVar4, false)) {
                arrayList3.add(next3);
            }
        }
        String str10 = null;
        String str11 = null;
        for (C11819b bVar3 : arrayList3) {
            if (str10 == null) {
                String a12 = C11818a.a((String) null, illegalStateException2);
                if (a12 == null) {
                    break;
                }
                str10 = C11820c.a(a12);
            }
            if (str11 == null) {
                String name3 = cls.getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str11 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
            }
            bVar3.a(eVar4, str11, false, illegalStateException2, str10);
            Uri uri5 = uri;
        }
        String uri6 = uri.toString();
        C17542s.i(uri6, "toString(...)");
        return Uri.parse(C15854t.Q(uri6, "https://www.ikea.com/ikeaapp", "ikea://navigation", false, 4, (Object) null));
    }
}
