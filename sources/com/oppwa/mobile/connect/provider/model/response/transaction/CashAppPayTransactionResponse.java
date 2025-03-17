package com.oppwa.mobile.connect.provider.model.response.transaction;

import androidx.annotation.Keep;

@Keep
public class CashAppPayTransactionResponse implements TransactionResponse {
    private AdditionalAttributes additionalAttributes;

    @Keep
    public static class AdditionalAttributes {
        private String callbackUrl;
        private String clientToken;
        private String failureCallbackUrl;

        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public String getClientToken() {
            return this.clientToken;
        }

        public String getFailureCallbackUrl() {
            return this.failureCallbackUrl;
        }
    }

    public AdditionalAttributes getAdditionalAttributes() {
        return this.additionalAttributes;
    }
}
