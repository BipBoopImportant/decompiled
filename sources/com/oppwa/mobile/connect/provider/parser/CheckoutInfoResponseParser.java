package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.token.BankAccount;
import com.oppwa.mobile.connect.payment.token.Card;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.payment.token.VirtualAccount;
import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Arrays;
import java.util.Optional;

public class CheckoutInfoResponseParser extends AbstractResponseParser<CheckoutInfo, CheckoutInfoResponse> {
    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException c() {
        return new IllegalArgumentException("The holder can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException d() {
        return new IllegalArgumentException("The iban can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException e() {
        return new IllegalArgumentException("The last 4 digits can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException f() {
        return new IllegalArgumentException("The expiry month can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException g() {
        return new IllegalArgumentException("The expiry year can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException h() {
        return new IllegalArgumentException("The token id can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException i() {
        return new IllegalArgumentException("The token brand can't be null");
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ IllegalArgumentException j() {
        return new IllegalArgumentException("The account id can't be null");
    }

    /* access modifiers changed from: protected */
    public CheckoutInfo a(CheckoutInfoResponse checkoutInfoResponse) {
        CheckoutInfo.Builder builder = new CheckoutInfo.Builder();
        a(checkoutInfoResponse, builder);
        return builder.build();
    }

    private void a(CheckoutInfoResponse checkoutInfoResponse, CheckoutInfo.Builder builder) {
        builder.setAmount(checkoutInfoResponse.getAmount()).setCurrencyCode(checkoutInfoResponse.getCurrency()).setCountryCode(checkoutInfoResponse.getBankAccountCountry()).setEndpoint(checkoutInfoResponse.getEndpoint()).setResourcePath(checkoutInfoResponse.getResourcePath());
        Optional.ofNullable(checkoutInfoResponse.getConfig()).ifPresent(new P(this, builder));
    }

    /* access modifiers changed from: private */
    public void a(CheckoutInfoResponse.Config config, CheckoutInfo.Builder builder) {
        builder.setKlarnaMerchantIds(config.getKlarnaMerchantIds()).setCollectRedShieldDeviceId(config.isRedShieldDeviceIdInMsdkActive());
        Optional.ofNullable(config.getBrandConfig()).ifPresent(new F(this, builder));
        Optional.ofNullable(config.getMsdkConfig()).ifPresent(new G(this, builder));
        Optional.ofNullable(config.getRegistrations()).filter(new H()).ifPresent(new I(this, builder));
        Optional.ofNullable(config.getWorkflowSpecificConfig()).ifPresent(new J(this, builder));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean a(CheckoutInfoResponse.Config.Registration[] registrationArr) {
        return registrationArr.length > 0;
    }

    /* access modifiers changed from: private */
    public void a(CheckoutInfoResponse.Config.WorkflowSpecificConfig workflowSpecificConfig, CheckoutInfo.Builder builder) {
        Optional.ofNullable(workflowSpecificConfig.getAffirmConfig()).ifPresent(new S(builder));
    }

    /* access modifiers changed from: private */
    public void a(CheckoutInfoResponse.Config.BrandConfig brandConfig, CheckoutInfo.Builder builder) {
        builder.setBrands(brandConfig.getBrands()).setShopBrandsOverridden(brandConfig.isOverrideShopBrands()).setBrandsActivated(brandConfig.isActivateBrands());
    }

    /* access modifiers changed from: private */
    public void a(CheckoutInfoResponse.Config.MsdkConfig msdkConfig, CheckoutInfo.Builder builder) {
        builder.setMsdkUi(msdkConfig.getUi()).setLogLevel(msdkConfig.getLogLevel());
    }

    /* access modifiers changed from: private */
    public void a(CheckoutInfoResponse.Config.Registration[] registrationArr, CheckoutInfo.Builder builder) {
        builder.setTokens((Token[]) Arrays.stream(registrationArr).map(new E(this)).filter(new N()).toArray(new O()));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ Token[] a(int i10) {
        return new Token[i10];
    }

    /* access modifiers changed from: private */
    public Token a(CheckoutInfoResponse.Config.Registration registration) {
        try {
            String str = (String) Optional.ofNullable(registration.getId()).orElseThrow(new T());
            String str2 = (String) Optional.ofNullable(registration.getPaymentBrand()).orElseThrow(new U());
            CheckoutInfoResponse.Config.Registration.Card card = registration.getCard();
            if (card != null) {
                return new Token(str, str2, a(card));
            }
            CheckoutInfoResponse.Config.Registration.BankAccount bankAccount = registration.getBankAccount();
            if (bankAccount != null) {
                return new Token(str, str2, a(bankAccount));
            }
            CheckoutInfoResponse.Config.Registration.VirtualAccount virtualAccount = registration.getVirtualAccount();
            if (virtualAccount != null) {
                return new Token(str, str2, a(virtualAccount));
            }
            return null;
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            return null;
        }
    }

    private Card a(CheckoutInfoResponse.Config.Registration.Card card) {
        return new Card(card.getHolder(), (String) Optional.ofNullable(card.getLast4Digits()).orElseThrow(new K()), (String) Optional.ofNullable(card.getExpiryMonth()).orElseThrow(new L()), (String) Optional.ofNullable(card.getExpiryYear()).orElseThrow(new M()));
    }

    private BankAccount a(CheckoutInfoResponse.Config.Registration.BankAccount bankAccount) {
        return new BankAccount((String) Optional.ofNullable(bankAccount.getHolder()).orElseThrow(new V()), (String) Optional.ofNullable(bankAccount.getIban()).orElseThrow(new W()));
    }

    private VirtualAccount a(CheckoutInfoResponse.Config.Registration.VirtualAccount virtualAccount) {
        return new VirtualAccount(virtualAccount.getHolder(), (String) Optional.ofNullable(virtualAccount.getAccountId()).orElseThrow(new Q()));
    }
}
