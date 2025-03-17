package Vy;

import QL.x;
import VL.C16699a;
import VL.o;
import VL.s;
import com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint.FullServePickupWaitingTimeResponse;
import com.ingka.ikea.scanandgo.datalayer.estimatedwaitingtime.endpoint.FullServeWaitingTimeRequest;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LVy/a;", "", "", "storeId", "Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest;", "body", "LQL/x;", "Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServePickupWaitingTimeResponse;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/scanandgo/datalayer/estimatedwaitingtime/endpoint/FullServeWaitingTimeRequest;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface a {
    @o("scan-shop/v6/{cc}/{lc}/stores/{storeId}/fullserve-waiting-time")
    Object a(@s("storeId") String str, @C16699a FullServeWaitingTimeRequest fullServeWaitingTimeRequest, C17164e<? super x<FullServePickupWaitingTimeResponse>> eVar);
}
