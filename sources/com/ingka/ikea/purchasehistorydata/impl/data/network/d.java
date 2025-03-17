package com.ingka.ikea.purchasehistorydata.impl.data.network;

import QL.x;
import VL.C16704f;
import VL.o;
import VL.s;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseDetailsRemote;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.PurchaseHistoryEntryRemote;
import dI.C17164e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bb\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\tH§@¢\u0006\u0004\b\u000f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0010\u001a\u00020\tH§@¢\u0006\u0004\b\u0011\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/purchasehistorydata/impl/data/network/d;", "", "", "page", "LQL/x;", "", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseHistoryEntryRemote;", "a", "(ILdI/e;)Ljava/lang/Object;", "", "orderId", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/PurchaseDetailsRemote;", "c", "(Ljava/lang/String;LdI/e;)Ljava/lang/Object;", "receiptId", "h", "returnNumber", "f", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
interface d {
    @C16704f("customer/v6/{cc}/{lc}/purchase-history/list/{page}")
    Object a(@s("page") int i10, C17164e<? super x<List<PurchaseHistoryEntryRemote>>> eVar);

    @o("customer/v6/{cc}/{lc}/purchase-history/order/{orderId}")
    Object c(@s("orderId") String str, C17164e<? super PurchaseDetailsRemote> eVar);

    @C16704f("customer/v6/{cc}/{lc}/purchase-history/return/{returnNumber}")
    Object f(@s("returnNumber") String str, C17164e<? super PurchaseDetailsRemote> eVar);

    @C16704f("customer/v6/{cc}/{lc}/purchase-history/receipt/{receiptId}")
    Object h(@s("receiptId") String str, C17164e<? super PurchaseDetailsRemote> eVar);
}
