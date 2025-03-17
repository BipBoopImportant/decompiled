package Bn;

import HJ.C15854t;
import YH.C16877v;
import Zl.a;
import Zl.b;
import android.content.UriMatcher;
import android.net.Uri;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import on.C11687b;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\u000bJ!\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000bJ\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u000f*\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H@¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001e¨\u0006 "}, d2 = {"LBn/a;", "LZl/a;", "Lon/b;", "plpNavigation", "<init>", "(Lon/b;)V", "Landroid/net/Uri;", "uri", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "c", "(Landroid/net/Uri;Lcom/ingka/ikea/analytics/Interaction$Component;)Landroid/net/Uri;", "d", "i", "h", "", "f", "(Landroid/net/Uri;)Ljava/lang/String;", "e", "", "Lon/b$d;", "g", "(Landroid/net/Uri;)Ljava/util/List;", "b", "(Landroid/net/Uri;LdI/e;)Ljava/lang/Object;", "", "a", "(Landroid/net/Uri;)Z", "Lon/b;", "Landroid/content/UriMatcher;", "Landroid/content/UriMatcher;", "uriMatcher", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements Zl.a {

    /* renamed from: d  reason: collision with root package name */
    public static final C1468a f79323d = new C1468a((DefaultConstructorMarker) null);

    /* renamed from: e  reason: collision with root package name */
    public static final int f79324e = 8;

    /* renamed from: b  reason: collision with root package name */
    private final C11687b f79325b;

    /* renamed from: c  reason: collision with root package name */
    private final UriMatcher f79326c;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"LBn/a$a;", "", "<init>", "()V", "", "CAMPAIGN_MATCH", "I", "CATEGORY_MATCH", "SEARCH_MATCH", "SIK_CATEGORY_MATCH", "", "QUERY_PARAM_NAME", "Ljava/lang/String;", "GROUP_PARAM_NAME", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Bn.a$a  reason: collision with other inner class name */
    public static final class C1468a {
        public /* synthetic */ C1468a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1468a() {
        }
    }

    public a(C11687b bVar) {
        C17542s.j(bVar, "plpNavigation");
        this.f79325b = bVar;
        UriMatcher uriMatcher = new UriMatcher(-1);
        uriMatcher.addURI("www.ikea.com", "/*/*/new/new-products/", 5);
        uriMatcher.addURI("www.ikea.com", "/*/*/cat/lower-price/", 5);
        uriMatcher.addURI("www.ikea.com", "/*/*/cat/last-chance/", 5);
        uriMatcher.addURI("www.ikea.com", "/*/*/cat/lowest-price/", 5);
        uriMatcher.addURI("www.ikea.com", "/*/*/cat/best-sellers/", 5);
        uriMatcher.addURI("www.ikea.com", "/*/*/cat/limited-edition/", 5);
        uriMatcher.addURI("www.ikea.com", "/*/*/offers/limited-time-offers/", 5);
        uriMatcher.addURI("www.ikea.com", "/*/*/offers/family-offers/", 5);
        uriMatcher.addURI("www.ikea.com", "/*/*/campaign/*/", 1);
        uriMatcher.addURI("www.ikea.com", "/*/*/cat/*/", 2);
        uriMatcher.addURI("www.ikea.com", "/*/*/search/", 4);
        this.f79326c = uriMatcher;
    }

    private final Uri c(Uri uri, Interaction$Component interaction$Component) {
        String e10 = e(uri);
        if (e10 != null) {
            return C11687b.C2346b.a(this.f79325b, e10, "", C11687b.e.CAMPAIGNS, interaction$Component, (List) null, (List) null, (Boolean) null, 64, (Object) null);
        }
        return null;
    }

    private final Uri d(Uri uri, Interaction$Component interaction$Component) {
        String f10 = f(uri);
        if (f10 != null) {
            return C11687b.C2346b.a(this.f79325b, f10, "", C11687b.e.CATEGORY, interaction$Component, (List) null, (List) null, (Boolean) null, 64, (Object) null);
        }
        return null;
    }

    private final String e(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        C17542s.i(pathSegments, "getPathSegments(...)");
        String str = (String) C16877v.z0(pathSegments, uri.getPathSegments().size() - 2);
        if (str == null) {
            return null;
        }
        if (!C17542s.e(str, "campaign")) {
            str = null;
        }
        if (str != null) {
            return uri.getLastPathSegment();
        }
        return null;
    }

    private final String f(Uri uri) {
        List X02;
        String str;
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return null;
        }
        String str2 = C15854t.d0(lastPathSegment, "-", false, 2, (Object) null) ? lastPathSegment : null;
        if (str2 == null || (X02 = C15854t.X0(str2, new char[]{'-'}, false, 0, 6, (Object) null)) == null || (str = (String) C16877v.I0(X02)) == null || str.length() <= 0) {
            return null;
        }
        return str;
    }

    private final List<C11687b.d> g(Uri uri) {
        List Y02;
        String queryParameter = uri.getQueryParameter("filters");
        if (queryParameter == null || (Y02 = C15854t.Y0(queryParameter, new String[]{","}, false, 0, 6, (Object) null)) == null) {
            return null;
        }
        Iterable<String> iterable = Y02;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (String Q10 : iterable) {
            arrayList.add(C11687b.d.f100626b.a(C15854t.Q(C15854t.Q(Q10, ":", "=", false, 4, (Object) null), DslKt.INDICATOR_SEPARATOR, ",", false, 4, (Object) null)));
        }
        return arrayList;
    }

    private final Uri h(Uri uri, Interaction$Component interaction$Component) {
        String queryParameter = uri.getQueryParameter("q");
        String queryParameter2 = queryParameter == null ? uri.getQueryParameter("group") : queryParameter;
        List<C11687b.d> g10 = g(uri);
        if (queryParameter2 == null) {
            return null;
        }
        return this.f79325b.b(queryParameter2, "", C11687b.e.SEARCH_RESULTS, interaction$Component, g10, (List<String>) null, Boolean.valueOf(queryParameter == null));
    }

    private final Uri i(Uri uri, Interaction$Component interaction$Component) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
            return C11687b.C2346b.a(this.f79325b, lastPathSegment, "", C11687b.e.CATEGORY, interaction$Component, (List) null, (List) null, (Boolean) null, 64, (Object) null);
        }
        return null;
    }

    public boolean a(Uri uri) {
        C17542s.j(uri, "uri");
        return b.a(this.f79326c, uri);
    }

    public Object b(Uri uri, C17164e<? super Uri> eVar) {
        T t10;
        String queryParameter = uri.getQueryParameter("sourceComponent");
        Iterator<T> it = Interaction$Component.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((Interaction$Component) t10).getValue(), queryParameter)) {
                break;
            }
        }
        Interaction$Component interaction$Component = (Interaction$Component) t10;
        if (interaction$Component == null) {
            interaction$Component = Interaction$Component.WEB_LINK;
        }
        int match = this.f79326c.match(uri);
        Uri b10 = match != 1 ? match != 2 ? match != 4 ? match != 5 ? a.C1929a.b(Zl.a.f89961a, (Integer) null, uri.toString(), 1, (Object) null) : i(uri, interaction$Component) : h(uri, interaction$Component) : d(uri, interaction$Component) : c(uri, interaction$Component);
        return b10 == null ? a.C1929a.b(Zl.a.f89961a, (Integer) null, uri.toString(), 1, (Object) null) : b10;
    }
}
