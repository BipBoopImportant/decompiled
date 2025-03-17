package com.ingka.ikea.purchasehistorydata.impl.data.network;

import VL.C16704f;
import VL.C16707i;
import VL.s;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.ReturnAuthorizationRemote;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/a;", "", "", "customerId", "purchaseId", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/ReturnAuthorizationRemote;", "a", "(Ljava/lang/String;Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
interface a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.purchasehistorydata.impl.data.network.a$a  reason: collision with other inner class name */
    public static final class C2986a {
        public static /* synthetic */ Object a(a aVar, String str, String str2, C17164e eVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    str = null;
                }
                return aVar.a(str, str2, eVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getReturnAuthorization");
        }
    }

    @C16704f("customer/v6/{cc}/{lc}/purchases/{purchaseId}/return-authorization")
    Object a(@C16707i("x-lite-customer-id") String str, @s("purchaseId") String str2, C17164e<? super ReturnAuthorizationRemote> eVar);
}
