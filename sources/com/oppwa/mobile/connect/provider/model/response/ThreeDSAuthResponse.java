package com.oppwa.mobile.connect.provider.model.response;

import androidx.annotation.Keep;
import com.oppwa.mobile.connect.provider.ThreeDS2Info;

@Keep
public class ThreeDSAuthResponse {
    private String cardholderInfo;
    private String challengeCompletionCallbackUrl;
    private String clientAuthResponse;
    private ThreeDS2Info.AuthStatus transactionStatus;

    public String getCardholderInfo() {
        return this.cardholderInfo;
    }

    public String getChallengeCompletionCallbackUrl() {
        return this.challengeCompletionCallbackUrl;
    }

    public String getClientAuthResponse() {
        return this.clientAuthResponse;
    }

    public ThreeDS2Info.AuthStatus getTransactionStatus() {
        return this.transactionStatus;
    }
}
