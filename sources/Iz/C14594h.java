package iz;

import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.QuantityPickerDataModel;
import gz.C14523a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15014g;
import rz.C15031y;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Liz/h;", "", "<init>", "()V", "", "barcode", "", "price", "Lcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;", "productLite", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;", "quantityLimits", "", "quantityInCart", "", "collected", "Lrz/y;", "type", "Lgz/a;", "itemLocation", "isSkipped", "Lrz/g;", "a", "(Ljava/lang/String;DLcom/ingka/ikea/core/remotemodel/product/ProductLiteRemote;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/QuantityPickerDataModel;IZLrz/y;Lgz/a;Z)Lrz/g;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: iz.h  reason: case insensitive filesystem */
public final class C14594h {
    public final C15014g a(String str, double d10, ProductLiteRemote productLiteRemote, QuantityPickerDataModel quantityPickerDataModel, int i10, boolean z10, C15031y yVar, C14523a aVar, boolean z11) {
        String str2 = str;
        C17542s.j(str, "barcode");
        C17542s.j(yVar, "type");
        C17542s.j(aVar, "itemLocation");
        if (productLiteRemote == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (quantityPickerDataModel != null) {
            return new C15014g(d10, str, productLiteRemote.s(), C14590d.b(quantityPickerDataModel, i10), z10, yVar, aVar.a(), z11);
        } else {
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
