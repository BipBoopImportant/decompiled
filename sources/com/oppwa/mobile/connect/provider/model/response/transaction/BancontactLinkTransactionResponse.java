package com.oppwa.mobile.connect.provider.model.response.transaction;

import androidx.annotation.Keep;

@Keep
public class BancontactLinkTransactionResponse implements TransactionResponse {
    private Redirect redirect;

    public Redirect getRedirect() {
        return this.redirect;
    }
}
