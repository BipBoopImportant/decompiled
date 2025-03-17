package gz;

import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.BuyingDecisionSectionDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ChildItemPresentationSectionDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.PresentationSectionDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ProductCardDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u001fR\u0019\u0010%\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lgz/e;", "", "", "barcode", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "product", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "d", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "f", "()Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "quantityPicker", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "e", "()Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "productLite", "()Z", "hasChildItems", "", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ChildItemPresentationSectionDataModel;", "c", "()Ljava/util/List;", "inStockChildItems", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f127417a;

    /* renamed from: b  reason: collision with root package name */
    private final ScanAndGoProductResponseDataModel f127418b;

    public e(String str, ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel) {
        C17542s.j(str, "barcode");
        this.f127417a = str;
        this.f127418b = scanAndGoProductResponseDataModel;
    }

    public final String a() {
        return this.f127417a;
    }

    public final boolean b() {
        ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel = this.f127418b;
        return (scanAndGoProductResponseDataModel != null ? scanAndGoProductResponseDataModel.c() : null) != null;
    }

    public final List<ChildItemPresentationSectionDataModel> c() {
        ChildItemPresentationDataModel c10;
        ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel = this.f127418b;
        if (scanAndGoProductResponseDataModel == null || (c10 = scanAndGoProductResponseDataModel.c()) == null) {
            return null;
        }
        return c10.b();
    }

    public final ScanAndGoProductResponseDataModel d() {
        return this.f127418b;
    }

    public final ProductLiteRemote e() {
        PresentationSectionDataModel h10;
        ProductCardDataModel a10;
        ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel = this.f127418b;
        if (scanAndGoProductResponseDataModel == null || (h10 = scanAndGoProductResponseDataModel.h()) == null || (a10 = h10.a()) == null) {
            return null;
        }
        return a10.b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f127417a, eVar.f127417a) && C17542s.e(this.f127418b, eVar.f127418b);
    }

    public final QuantityPickerDataModel f() {
        BuyingDecisionSectionDataModel a10;
        ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel = this.f127418b;
        if (scanAndGoProductResponseDataModel == null || (a10 = scanAndGoProductResponseDataModel.a()) == null) {
            return null;
        }
        return a10.b();
    }

    public int hashCode() {
        int hashCode = this.f127417a.hashCode() * 31;
        ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel = this.f127418b;
        return hashCode + (scanAndGoProductResponseDataModel == null ? 0 : scanAndGoProductResponseDataModel.hashCode());
    }

    public String toString() {
        String str = this.f127417a;
        ScanAndGoProductResponseDataModel scanAndGoProductResponseDataModel = this.f127418b;
        return "ScanAndGoScannedItemDatabaseModel(barcode=" + str + ", product=" + scanAndGoProductResponseDataModel + ")";
    }
}
