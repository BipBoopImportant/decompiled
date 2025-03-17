package Uh;

import android.net.Uri;
import com.ingka.ikea.app.productinformationpage.v2.ui.WebViewDialogFragment;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import com.ingka.ikea.core.model.product.WarningMoreInfo;
import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.c;
import x4.C8951o;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001b\u0010\fJ\u001f\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006!"}, d2 = {"LUh/r;", "", "LkK/c;", "json", "<init>", "(LkK/c;)V", "Lx4/o;", "navController", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "productLarge", "LXH/N;", "a", "(Lx4/o;Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "e", "d", "Lcom/ingka/ikea/core/model/product/WarningMoreInfo;", "warningMoreInfo", "g", "(Lx4/o;Lcom/ingka/ikea/core/model/product/WarningMoreInfo;)V", "Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;", "fee", "c", "(Lx4/o;Lcom/ingka/ikea/core/model/product/ProductItem$Price$PriceTag$Fee;)V", "", "itemNumber", "b", "(Lx4/o;Ljava/lang/String;)V", "f", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content;", "content", "h", "(Lx4/o;Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content;)V", "LkK/c;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f64493a;

    public r(C17514c cVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f64493a = cVar;
    }

    public void a(C8951o oVar, ProductLarge productLarge) {
        C17542s.j(oVar, "navController");
        C17542s.j(productLarge, "productLarge");
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/pip/assemblyAndDocuments?productLarge={productLarge}")).buildUpon();
        C17514c.a aVar = C17514c.f144280d;
        aVar.a();
        Uri build = buildUpon.appendQueryParameter("productLarge", aVar.b(ProductLarge.Companion.serializer(), productLarge)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void b(C8951o oVar, String str) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNumber");
        Uri build = Uri.parse(c.b("ikea://navigation/pip/assemblyDetails?itemNo={itemNo}")).buildUpon().appendQueryParameter("itemNo", str).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void c(C8951o oVar, ProductItem.Price.PriceTag.Fee fee) {
        C17542s.j(oVar, "navController");
        C17542s.j(fee, "fee");
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/pip/fee?fee={fee}")).buildUpon();
        C17514c.a aVar = C17514c.f144280d;
        aVar.a();
        Uri build = buildUpon.appendQueryParameter("fee", aVar.b(ProductItem.Price.PriceTag.Fee.Companion.serializer(), fee)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void d(C8951o oVar, ProductLarge productLarge) {
        C17542s.j(oVar, "navController");
        C17542s.j(productLarge, "productLarge");
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/pip/goodToKnow?productLarge={productLarge}")).buildUpon();
        C17514c.a aVar = C17514c.f144280d;
        aVar.a();
        Uri build = buildUpon.appendQueryParameter("productLarge", aVar.b(ProductLarge.Companion.serializer(), productLarge)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void e(C8951o oVar, ProductLarge productLarge) {
        C17542s.j(oVar, "navController");
        C17542s.j(productLarge, "productLarge");
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/pip/materialsAndCare?productLarge={productLarge}")).buildUpon();
        C17514c.a aVar = C17514c.f144280d;
        aVar.a();
        Uri build = buildUpon.appendQueryParameter("productLarge", aVar.b(ProductLarge.Companion.serializer(), productLarge)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void f(C8951o oVar, ProductLarge productLarge) {
        C17542s.j(oVar, "navController");
        C17542s.j(productLarge, "productLarge");
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/pip/safetyAndCompliance?productLarge={productLarge}")).buildUpon();
        C17514c.a aVar = C17514c.f144280d;
        aVar.a();
        Uri build = buildUpon.appendQueryParameter("productLarge", aVar.b(ProductLarge.Companion.serializer(), productLarge)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void g(C8951o oVar, WarningMoreInfo warningMoreInfo) {
        C17542s.j(oVar, "navController");
        C17542s.j(warningMoreInfo, "warningMoreInfo");
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/pip/moreInfo?warningMoreInfo={warningMoreInfo}")).buildUpon();
        C17514c cVar = this.f64493a;
        cVar.a();
        Uri build = buildUpon.appendQueryParameter("warningMoreInfo", cVar.b(WarningMoreInfo.Companion.serializer(), warningMoreInfo)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }

    public void h(C8951o oVar, WebViewDialogFragment.Content content) {
        C17542s.j(oVar, "navController");
        C17542s.j(content, "content");
        Uri.Builder buildUpon = Uri.parse(c.b("ikea://navigation/pip/webview?content={content}")).buildUpon();
        C17514c cVar = this.f64493a;
        cVar.a();
        Uri build = buildUpon.appendQueryParameter("content", cVar.b(WebViewDialogFragment.Content.Companion.serializer(), content)).build();
        C17542s.i(build, "build(...)");
        oVar.Y(build, rw.c.f28698a.c().a());
    }
}
