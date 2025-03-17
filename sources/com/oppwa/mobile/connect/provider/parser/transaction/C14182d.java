package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.provider.model.response.transaction.BancontactLinkTransactionResponse;
import com.oppwa.mobile.connect.provider.model.response.transaction.Redirect;
import java.util.List;
import java.util.Optional;

/* renamed from: com.oppwa.mobile.connect.provider.parser.transaction.d  reason: case insensitive filesystem */
class C14182d extends C14179a<BancontactLinkTransactionResponse> {
    C14182d() {
    }

    /* access modifiers changed from: protected */
    public void a(BancontactLinkTransactionResponse bancontactLinkTransactionResponse, Transaction transaction) {
        Optional.ofNullable(bancontactLinkTransactionResponse.getRedirect()).map(new r()).map(new s(this)).ifPresent(new t(transaction));
        transaction.setTransactionType(TransactionType.ASYNC);
    }

    /* access modifiers changed from: private */
    public String a(List<Redirect.Parameter> list) {
        return (String) list.stream().filter(new p()).findFirst().map(new q()).orElse((Object) null);
    }
}
