package com.oppwa.mobile.connect.provider.model.response.transaction;

import Qc.c;
import androidx.annotation.Keep;

public class AmazonPayTransactionResponse implements TransactionResponse {
    @c("additionalAttributes")

    /* renamed from: a  reason: collision with root package name */
    private AdditionalAttributes f122027a;

    /* renamed from: b  reason: collision with root package name */
    private Redirect f122028b;

    @Keep
    public static class AdditionalAttributes {
        private String connectorId;

        @c("connectorId")
        public String getConnectorId() {
            return this.connectorId;
        }
    }

    @Keep
    public static class ChargeAmount {
        private String amount;
        private String currencyCode;
    }

    @Keep
    public static class ConnectorId {
        @c("createCheckoutSessionConfig")
        private CreateCheckoutSessionConfig createCheckoutSessionConfig;
        @c("ledgerCurrency")
        private String ledgerCurrency;
        @c("merchantId")
        private String merchantId;
        @c("placement")
        private String placement;
        @c("productType")
        private String productType;
        @c("sandbox")
        private boolean sandbox;

        public CreateCheckoutSessionConfig getCreateCheckoutSessionConfig() {
            return this.createCheckoutSessionConfig;
        }

        public String getLedgerCurrency() {
            return this.ledgerCurrency;
        }

        public String getMerchantId() {
            return this.merchantId;
        }

        public String getPlacement() {
            return this.placement;
        }

        public String getProductType() {
            return this.productType;
        }

        public boolean isSandbox() {
            return this.sandbox;
        }
    }

    @Keep
    public static class CreateCheckoutSessionConfig {
        @c("payloadJSON")
        private String payloadJSON;
        @c("publicKeyId")
        private String publicKeyId;
        @c("sandbox")
        private boolean sandbox;
        @c("signature")
        private String signature;

        public String getPayloadJSON() {
            return this.payloadJSON;
        }
    }

    @Keep
    public static class PayloadJSON {
        @c("checkoutSessionId")
        private String checkoutSessionId;
        private PaymentDetails paymentDetails;
        private String storeId;
        private WebCheckoutDetails webCheckoutDetails;

        public String getCheckoutSessionId() {
            return this.checkoutSessionId;
        }
    }

    @Keep
    public static class PaymentDetails {
        private boolean allowOvercharge;
        private boolean canHandlePendingAuthorization;
        private ChargeAmount chargeAmount;
        private boolean extendExpiration;
        private String paymentIntent;
    }

    public static class Redirect {

        /* renamed from: a  reason: collision with root package name */
        private String f122029a;

        /* renamed from: b  reason: collision with root package name */
        private String f122030b;

        public String getShortUrl() {
            return this.f122030b;
        }

        public String getUrl() {
            return this.f122029a;
        }
    }

    @Keep
    public static class WebCheckoutDetails {
        private String checkoutCancelUrl;
        private String checkoutReviewReturnUrl;
    }

    public AdditionalAttributes getAdditionalAttributes() {
        return this.f122027a;
    }

    public Redirect getRedirect() {
        return this.f122028b;
    }
}
