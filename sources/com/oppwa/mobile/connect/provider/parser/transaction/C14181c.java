package com.oppwa.mobile.connect.provider.parser.transaction;

import android.net.Uri;
import com.adjust.sdk.Constants;
import com.google.gson.Gson;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.amazonpay.AmazonPayPaymentParams;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.provider.model.response.transaction.AmazonPayTransactionResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/* renamed from: com.oppwa.mobile.connect.provider.parser.transaction.c  reason: case insensitive filesystem */
class C14181c extends C14179a<AmazonPayTransactionResponse> {

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f122085c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, String> f122086d;

    static {
        HashMap hashMap = new HashMap();
        f122085c = hashMap;
        HashMap hashMap2 = new HashMap();
        f122086d = hashMap2;
        hashMap.put(CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY, "www.amazon.com");
        hashMap.put("DE", "www.amazon.de");
        hashMap.put("UK", "www.amazon.co.uk");
        hashMap.put("FR", "www.amazon.fr");
        hashMap.put("IT", "www.amazon.it");
        hashMap.put("ES", "www.amazon.es");
        hashMap.put("JP", "www.amazon.co.jp");
        hashMap2.put(CheckoutConstants.DEFAULT_ACI_INSTANT_PAY_COUNTRY, "/apay/checkout/initiate/NA");
        hashMap2.put("DE", "/apay/checkout/initiate/DE");
        hashMap2.put("UK", "/apay/checkout/initiate/UK");
        hashMap2.put("FR", "/apay/checkout/initiate/FR");
        hashMap2.put("IT", "/apay/checkout/initiate/IT");
        hashMap2.put("ES", "/apay/checkout/initiate/ES");
        hashMap2.put("JP", "/apay/checkout/initiate/JP");
    }

    C14181c() {
    }

    /* access modifiers changed from: protected */
    public void a(AmazonPayTransactionResponse amazonPayTransactionResponse, Transaction transaction) {
        Optional.ofNullable(amazonPayTransactionResponse.getAdditionalAttributes()).ifPresent(new o(this, transaction));
        transaction.setTransactionType(TransactionType.ASYNC);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void a(Transaction transaction, AmazonPayTransactionResponse.AdditionalAttributes additionalAttributes) {
        AmazonPayPaymentParams amazonPayPaymentParams = (AmazonPayPaymentParams) transaction.getPaymentParams();
        Gson gson = new Gson();
        AmazonPayTransactionResponse.ConnectorId connectorId = (AmazonPayTransactionResponse.ConnectorId) gson.n(additionalAttributes.getConnectorId(), AmazonPayTransactionResponse.ConnectorId.class);
        HashMap hashMap = new HashMap();
        hashMap.put("merchantId", connectorId.getMerchantId());
        hashMap.put("ledgerCurrency", connectorId.getLedgerCurrency());
        hashMap.put("checkoutLanguage", amazonPayPaymentParams.getAmazonPayConfig().getRegion().getLanguageCode());
        hashMap.put("productType", connectorId.getProductType());
        hashMap.put("integrationType", "NativeMobile");
        if (Connect.ProviderMode.LIVE.equals(amazonPayPaymentParams.getProviderMode())) {
            hashMap.put("environment", "LIVE");
        } else {
            hashMap.put("environment", "SANDBOX");
        }
        if (connectorId.getCreateCheckoutSessionConfig() != null) {
            hashMap.put("amazonCheckoutSessionId", ((AmazonPayTransactionResponse.PayloadJSON) gson.n(connectorId.getCreateCheckoutSessionConfig().getPayloadJSON(), AmazonPayTransactionResponse.PayloadJSON.class)).getCheckoutSessionId());
            hashMap.put("payloadJSON", connectorId.getCreateCheckoutSessionConfig().getPayloadJSON());
        }
        transaction.setRedirectUrl(a((Map<String, String>) hashMap, amazonPayPaymentParams.getAmazonPayConfig().getRegion().toString()));
    }

    private String a(Map<String, String> map, String str) {
        Uri.Builder builder = new Uri.Builder();
        for (Map.Entry next : map.entrySet()) {
            builder.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        builder.scheme(Constants.SCHEME).authority(f122085c.get(str)).path(f122086d.get(str));
        return builder.build().toString();
    }
}
