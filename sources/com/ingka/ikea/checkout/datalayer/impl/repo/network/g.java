package com.ingka.ikea.checkout.datalayer.impl.repo.network;

import Nn.w;
import XH.t;
import com.ingka.ikea.checkout.datalayer.impl.repo.network.PaymentEndpoint;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNn/w;", "Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;", "b", "(LNn/w;)Lcom/ingka/ikea/checkout/datalayer/impl/repo/network/PaymentEndpoint$GooglePayTaxInfo;", "onlinecheckout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    /* access modifiers changed from: private */
    public static final PaymentEndpoint.GooglePayTaxInfo b(w wVar) {
        if (wVar instanceof w.b) {
            w.b bVar = (w.b) wVar;
            return new PaymentEndpoint.GooglePayTaxInfo(bVar.c(), bVar.b(), bVar.a(), (String) null, (String) null, (String) null);
        } else if (wVar instanceof w.a) {
            w.a aVar = (w.a) wVar;
            return new PaymentEndpoint.GooglePayTaxInfo((String) null, (String) null, (String) null, aVar.a(), aVar.c(), aVar.b());
        } else {
            throw new t();
        }
    }
}
