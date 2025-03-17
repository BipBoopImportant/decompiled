package com.oppwa.mobile.connect.provider.model.response.transaction;

import androidx.annotation.Keep;

@Keep
public class AfterpayPacificTransactionResponse implements TransactionResponse {
    private AdditionalAttributes additionalAttributes;

    @Keep
    public static class AdditionalAttributes {
        private String callbackUrl;
        private String failureCallbackUrl;
        private String redirectCheckoutUrl;

        public String getCallbackUrl() {
            return this.callbackUrl;
        }

        public String getFailureCallbackUrl() {
            return this.failureCallbackUrl;
        }

        public String getRedirectCheckoutUrl() {
            return this.redirectCheckoutUrl;
        }
    }

    public AdditionalAttributes getAdditionalAttributes() {
        return this.additionalAttributes;
    }
}
