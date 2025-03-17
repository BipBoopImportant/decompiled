package cz;

import GK.C15777E;
import QL.x;
import VL.C16699a;
import VL.C16704f;
import VL.o;
import VL.s;
import VL.t;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCancelOrderBodyDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutBodyDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoCheckoutStatusBodyDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.request.ScanAndGoOrderBodyDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.CombinationProductRemote;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoCheckoutResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoCheckoutStatusResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoOrderResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.ScanAndGoProductResponseDataModel;
import com.ingka.ikea.scanandgo.datalayer.impl.scanandgodata.model.response.UpptackaResponse;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000eJb\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00022\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u0019H§@¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001f\u0010 J*\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010!\u001a\u00020\u0002H§@¢\u0006\u0004\b#\u0010$J4\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010%\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcz/a;", "", "", "storeId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;", "orderBody", "LQL/x;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;", "f", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;", "body", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel;", "e", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;LdI/e;)Ljava/lang/Object;", "barcode", "", "quantity", "productType", "ptagSize", "scanType", "isFamilyMember", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "g", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel;", "b", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCancelOrderBodyDataModel;", "LGK/E;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCancelOrderBodyDataModel;LdI/e;)Ljava/lang/Object;", "listigId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "productId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "c", "(Ljava/lang/String;Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cz.a  reason: case insensitive filesystem */
public interface C14327a {
    @o("scan-shop/v6/{cc}/{lc}/stores/{storeId}/cancel")
    Object a(@s("storeId") String str, @C16699a ScanAndGoCancelOrderBodyDataModel scanAndGoCancelOrderBodyDataModel, C17164e<? super x<C15777E>> eVar);

    @o("/scan-shop/v6/{cc}/{lc}/stores/{storeId}/status")
    Object b(@s("storeId") String str, @C16699a ScanAndGoCheckoutStatusBodyDataModel scanAndGoCheckoutStatusBodyDataModel, C17164e<? super x<ScanAndGoCheckoutStatusResponseDataModel>> eVar);

    @C16704f("scan-shop/v6/{cc}/{lc}/stores/{storeId}/combination/{productNumber}/{quantity}")
    Object c(@s("storeId") String str, @s("productNumber") String str2, @s("quantity") int i10, C17164e<? super x<CombinationProductRemote>> eVar);

    @C16704f("scan-shop/v6/{cc}/{lc}/stores/{storeId}/listig/{listigId}")
    Object d(@s("storeId") String str, @s("listigId") String str2, C17164e<? super x<UpptackaResponse>> eVar);

    @o("scan-shop/v6/{cc}/{lc}/stores/{storeId}/checkout")
    Object e(@s("storeId") String str, @C16699a ScanAndGoCheckoutBodyDataModel scanAndGoCheckoutBodyDataModel, C17164e<? super x<ScanAndGoCheckoutResponseDataModel>> eVar);

    @o("scan-shop/v6/{cc}/{lc}/stores/{storeId}/order")
    Object f(@s("storeId") String str, @C16699a ScanAndGoOrderBodyDataModel scanAndGoOrderBodyDataModel, C17164e<? super x<ScanAndGoOrderResponseDataModel>> eVar);

    @C16704f("scan-shop/v6/{cc}/{lc}/stores/{storeId}/product/{barcode}/{quantity}")
    Object g(@s("storeId") String str, @s("barcode") String str2, @s("quantity") int i10, @t("it") String str3, @t("t") String str4, @t("st") String str5, @t("fp") String str6, C17164e<? super x<ScanAndGoProductResponseDataModel>> eVar);
}
