package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.ThreeDS2Info;
import com.oppwa.mobile.connect.provider.model.response.ThreeDSAuthResponse;

public class ThreeDSAuthResponseParser extends AbstractResponseParser<ThreeDS2Info, ThreeDSAuthResponse> {
    /* access modifiers changed from: protected */
    public ThreeDS2Info a(ThreeDSAuthResponse threeDSAuthResponse) {
        ThreeDS2Info threeDS2Info = new ThreeDS2Info(threeDSAuthResponse.getTransactionStatus(), threeDSAuthResponse.getClientAuthResponse());
        threeDS2Info.setChallengeCompletionCallbackUrl(threeDSAuthResponse.getChallengeCompletionCallbackUrl());
        threeDS2Info.setCardHolderInfo(threeDSAuthResponse.getCardholderInfo());
        return threeDS2Info;
    }
}
