package wC;

import QL.x;
import VL.C16699a;
import VL.o;
import VL.s;
import com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotRequest;
import com.ingka.ikea.timeslot.impl.data.remote.model.TimeslotResponse;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LwC/a;", "", "", "storeId", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRequest;", "body", "LQL/x;", "Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotResponse;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/timeslot/impl/data/remote/model/TimeslotRequest;LdI/e;)Ljava/lang/Object;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wC.a  reason: case insensitive filesystem */
public interface C15167a {
    @o("scan-shop/v6/{cc}/{lc}/stores/{storeId}/fullserve-time-windows")
    Object a(@s("storeId") String str, @C16699a TimeslotRequest timeslotRequest, C17164e<? super x<TimeslotResponse>> eVar);
}
