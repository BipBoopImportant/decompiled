package com.ingka.ikea.pushnotification.impl.repo.network;

import GK.C15777E;
import QL.x;
import VL.C16699a;
import VL.p;
import VL.s;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ingka/ikea/pushnotification/impl/repo/network/a;", "", "", "clientId", "Lcom/ingka/ikea/pushnotification/impl/repo/network/FCMTokenBody;", "body", "LQL/x;", "LGK/E;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/pushnotification/impl/repo/network/FCMTokenBody;LdI/e;)Ljava/lang/Object;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
interface a {
    @p("/customer/v6/{cc}/{lc}/notifications/client-push-tokens/{clientId}")
    Object a(@s("clientId") String str, @C16699a FCMTokenBody fCMTokenBody, C17164e<? super x<C15777E>> eVar);
}
