package cz;

import GK.C15777E;
import QL.x;
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

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tJ&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00022\b\u0010\u0013\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0018J&\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0019H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ&\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u001dH¦@¢\u0006\u0004\b\u001f\u0010 J&\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0002H¦@¢\u0006\u0004\b#\u0010$J.\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lcz/b;", "", "", "storeId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;", "orderBody", "LQL/x;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoOrderResponseDataModel;", "f", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoOrderBodyDataModel;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;", "body", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutResponseDataModel;", "e", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutBodyDataModel;LdI/e;)Ljava/lang/Object;", "barcode", "", "quantity", "productType", "ptagSize", "scanType", "isFamilyMember", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoProductResponseDataModel;", "g", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/ScanAndGoCheckoutStatusResponseDataModel;", "b", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCheckoutStatusBodyDataModel;LdI/e;)Ljava/lang/Object;", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCancelOrderBodyDataModel;", "LGK/E;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/request/ScanAndGoCancelOrderBodyDataModel;LdI/e;)Ljava/lang/Object;", "listigId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/UpptackaResponse;", "d", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "productId", "Lcom/ingka/ikea/scanandgo/datalayer/impl/scanandgodata/model/response/CombinationProductRemote;", "c", "(Ljava/lang/String;Ljava/lang/String;ILdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cz.b  reason: case insensitive filesystem */
public interface C14328b {
    Object a(String str, ScanAndGoCancelOrderBodyDataModel scanAndGoCancelOrderBodyDataModel, C17164e<? super x<C15777E>> eVar);

    Object b(String str, ScanAndGoCheckoutStatusBodyDataModel scanAndGoCheckoutStatusBodyDataModel, C17164e<? super x<ScanAndGoCheckoutStatusResponseDataModel>> eVar);

    Object c(String str, String str2, int i10, C17164e<? super x<CombinationProductRemote>> eVar);

    Object d(String str, String str2, C17164e<? super x<UpptackaResponse>> eVar);

    Object e(String str, ScanAndGoCheckoutBodyDataModel scanAndGoCheckoutBodyDataModel, C17164e<? super x<ScanAndGoCheckoutResponseDataModel>> eVar);

    Object f(String str, ScanAndGoOrderBodyDataModel scanAndGoOrderBodyDataModel, C17164e<? super x<ScanAndGoOrderResponseDataModel>> eVar);

    Object g(String str, String str2, int i10, String str3, String str4, String str5, String str6, C17164e<? super x<ScanAndGoProductResponseDataModel>> eVar);
}
