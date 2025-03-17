package qf;

import XH.t;
import android.content.Context;
import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lm.C11550a;
import lm.e;
import ow.c;
import rw.g;
import x4.C8951o;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ?\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b\"\u0010#J7\u0010$\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020!2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010*¨\u0006+"}, d2 = {"Lqf/p;", "Llm/e;", "Llm/a;", "backInStockApi", "<init>", "(Llm/a;)V", "Llm/a$c;", "fulfilmentOption", "", "itemNo", "itemType", "Landroid/net/Uri;", "d", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "productTitle", "g", "(Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "zipCode", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "storeId", "storeName", "", "clickAndCollect", "h", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Landroid/net/Uri;", "areaCode", "f", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "i", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "Lx4/o;", "navController", "LXH/N;", "a", "(Lx4/o;Llm/a$c;Ljava/lang/String;Ljava/lang/String;)V", "b", "(Lx4/o;Llm/a$c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "c", "(Landroid/content/Context;)V", "Llm/a;", "backinstock-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p implements e {

    /* renamed from: a  reason: collision with root package name */
    private final C11550a f76060a;

    public p(C11550a aVar) {
        C17542s.j(aVar, "backInStockApi");
        this.f76060a = aVar;
    }

    private final Uri d(C11550a.c cVar, String str, String str2) {
        if (cVar instanceof C11550a.c.C2255a) {
            C11550a.c.C2255a aVar = (C11550a.c.C2255a) cVar;
            return h(aVar.b(), aVar.c(), str, str2, false);
        } else if (cVar instanceof C11550a.c.b) {
            C11550a.c.b bVar = (C11550a.c.b) cVar;
            return h(bVar.b(), bVar.c(), str, str2, true);
        } else if (cVar instanceof C11550a.c.C2258c) {
            return e(((C11550a.c.C2258c) cVar).c(), str, str2);
        } else {
            throw new t();
        }
    }

    private final Uri e(String str, String str2, String str3) {
        Uri build = c.a(Uri.parse("ikea://navigation/backinstock/notification/push?storeId={storeId}&storeName={storeName}&itemNo={itemNo}&itemType={itemType}&clickAndCollect={clickAndCollect}&zipCode={zipCode}&areaCode={areaCode}")).buildUpon().appendQueryParameter("itemNo", str2).appendQueryParameter("itemType", str3).appendQueryParameter("zipCode", str).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    private final Uri f(String str, String str2, String str3, String str4, String str5) {
        Uri.Builder appendQueryParameter = c.a(Uri.parse("ikea://navigation/backinstock/notification/fallback?storeId={storeId}&storeName={storeName}&itemNo={itemNo}&itemType={itemType}&productTitle={productTitle}&clickAndCollect={clickAndCollect}&zipCode={zipCode}&areaCode={areaCode}")).buildUpon().appendQueryParameter("itemNo", str4).appendQueryParameter("itemType", str5).appendQueryParameter("productTitle", str3).appendQueryParameter("zipCode", str);
        C17542s.i(appendQueryParameter, "appendQueryParameter(...)");
        Uri build = g.a(appendQueryParameter, "areaCode", str2).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    private final Uri g(C11550a.c cVar, String str, String str2, String str3) {
        if (cVar instanceof C11550a.c.C2255a) {
            C11550a.c.C2255a aVar = (C11550a.c.C2255a) cVar;
            return i(aVar.b(), aVar.c(), false, str, str2, str3);
        } else if (cVar instanceof C11550a.c.b) {
            C11550a.c.b bVar = (C11550a.c.b) cVar;
            return i(bVar.b(), bVar.c(), true, str, str2, str3);
        } else if (cVar instanceof C11550a.c.C2258c) {
            C11550a.c.C2258c cVar2 = (C11550a.c.C2258c) cVar;
            return f(cVar2.c(), cVar2.b(), str, str2, str3);
        } else {
            throw new t();
        }
    }

    private final Uri h(String str, String str2, String str3, String str4, boolean z10) {
        Uri build = c.a(Uri.parse("ikea://navigation/backinstock/notification/push?storeId={storeId}&storeName={storeName}&itemNo={itemNo}&itemType={itemType}&clickAndCollect={clickAndCollect}&zipCode={zipCode}&areaCode={areaCode}")).buildUpon().appendQueryParameter("itemNo", str3).appendQueryParameter("itemType", str4).appendQueryParameter("storeId", str).appendQueryParameter("storeName", str2).appendQueryParameter("clickAndCollect", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    private final Uri i(String str, String str2, boolean z10, String str3, String str4, String str5) {
        Uri build = c.a(Uri.parse("ikea://navigation/backinstock/notification/fallback?storeId={storeId}&storeName={storeName}&itemNo={itemNo}&itemType={itemType}&productTitle={productTitle}&clickAndCollect={clickAndCollect}&zipCode={zipCode}&areaCode={areaCode}")).buildUpon().appendQueryParameter("itemNo", str4).appendQueryParameter("itemType", str5).appendQueryParameter("productTitle", str3).appendQueryParameter("storeId", str).appendQueryParameter("storeName", str2).appendQueryParameter("clickAndCollect", String.valueOf(z10)).build();
        C17542s.i(build, "build(...)");
        return build;
    }

    public void a(C8951o oVar, C11550a.c cVar, String str, String str2) {
        C17542s.j(oVar, "navController");
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "itemType");
        oVar.Y(d(cVar, str, str2), rw.c.f28698a.c().a());
    }

    public void b(C8951o oVar, C11550a.c cVar, String str, String str2, String str3) {
        C17542s.j(oVar, "navController");
        C17542s.j(cVar, "fulfilmentOption");
        C17542s.j(str, "productTitle");
        C17542s.j(str2, "itemNo");
        C17542s.j(str3, "itemType");
        oVar.Y(g(cVar, str, str2, str3), rw.c.f28698a.d().a());
    }

    public void c(Context context) {
        C17542s.j(context, "context");
        context.startActivity(this.f76060a.c(context));
    }
}
