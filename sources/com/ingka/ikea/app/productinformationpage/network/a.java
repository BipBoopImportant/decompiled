package com.ingka.ikea.app.productinformationpage.network;

import VL.C16704f;
import VL.s;
import com.ingka.ikea.app.productinformationpage.network.FinancialServicesDetails;
import dI.C17164e;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/network/a;", "", "", "amount", "Lcom/ingka/ikea/app/productinformationpage/network/FinancialServicesDetails$Remote;", "a", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
interface a {
    @C16704f("/range/v6/{cc}/{lc}/browse/financial/{amount}")
    Object a(@s("amount") String str, C17164e<? super FinancialServicesDetails.Remote> eVar);
}
