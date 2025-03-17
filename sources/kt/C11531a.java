package kt;

import QL.x;
import VL.C16699a;
import VL.C16704f;
import VL.p;
import VL.s;
import XH.C16807N;
import com.ingka.ikea.instore.datalayer.storeevents.network.model.RegistrationRemote;
import com.ingka.ikea.instore.datalayer.storeevents.network.model.StoreEventDetailsRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lkt/a;", "", "", "storeId", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/StoreEventDetailsRemote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "eventId", "timeslotId", "Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;", "body", "LQL/x;", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/instore/datalayer/storeevents/network/model/RegistrationRemote;LdI/e;)Ljava/lang/Object;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kt.a  reason: case insensitive filesystem */
public interface C11531a {
    @C16704f("/range/v6/{cc}/{lc}/stores/{storeId}/events")
    Object a(@s("storeId") String str, C17164e<? super StoreEventDetailsRemote> eVar);

    @p("/range/v6/{cc}/{lc}/stores/events/{eventId}/timeslots/{timeslotId}/registrations")
    Object b(@s("eventId") String str, @s("timeslotId") String str2, @C16699a RegistrationRemote registrationRemote, C17164e<? super x<C16807N>> eVar);
}
