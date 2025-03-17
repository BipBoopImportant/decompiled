package com.oppwa.mobile.connect.provider.model.response.transaction;

import androidx.annotation.Keep;

@Keep
public class KlarnaTransactionResponse implements TransactionResponse {
    private AdditionalAttributes additionalAttributes;
    private String callbackUrl;
    private String clientToken;
    private String failureCallbackUrl;

    @Keep
    public static class AdditionalAttributes {
        private String connectorId;

        public String getConnectorId() {
            return this.connectorId;
        }
    }

    public AdditionalAttributes getAdditionalAttributes() {
        return this.additionalAttributes;
    }

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
