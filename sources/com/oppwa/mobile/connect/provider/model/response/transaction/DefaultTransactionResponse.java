package com.oppwa.mobile.connect.provider.model.response.transaction;

import androidx.annotation.Keep;

@Keep
public class DefaultTransactionResponse implements TransactionResponse {
    private AdditionalAttributes additionalAttributes;
    private Redirect redirect;
    private Workflow workflow;

    @Keep
    public static class AdditionalAttributes {
        private String cardholderInfo;
        private String clientAuthResponse;
        private ThreeDS threeDS;
        private String transactionStatus;

        public String getCardholderInfo() {
            return this.cardholderInfo;
        }

        public String getClientAuthResponse() {
            return this.clientAuthResponse;
        }

        public ThreeDS getThreeDS() {
            return this.threeDS;
        }

        public String getTransactionStatus() {
            return this.transactionStatus;
        }
    }

    public AdditionalAttributes getAdditionalAttributes() {
        return this.additionalAttributes;
    }

    public Redirect getRedirect() {
        return this.redirect;
    }

    public Workflow getWorkflow() {
        return this.workflow;
    }
}
