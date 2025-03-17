package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.ThreeDS2Info;
import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.TransactionType;
import com.oppwa.mobile.connect.provider.model.response.transaction.DefaultTransactionResponse;
import com.oppwa.mobile.connect.provider.model.response.transaction.ThreeDS;
import com.oppwa.mobile.connect.provider.model.response.transaction.Workflow;
import com.oppwa.mobile.connect.utils.StringUtils;
import java.util.Optional;

class f extends C14179a<DefaultTransactionResponse> {
    f() {
    }

    /* access modifiers changed from: protected */
    public void a(DefaultTransactionResponse defaultTransactionResponse, Transaction transaction) {
        ThreeDS2Info threeDS2Info = (ThreeDS2Info) Optional.ofNullable(defaultTransactionResponse.getAdditionalAttributes()).map(new v(this)).orElse((Object) null);
        if (threeDS2Info != null) {
            transaction.setThreeDS2Info(threeDS2Info);
            transaction.setRedirectUrl(a(defaultTransactionResponse));
            transaction.setTransactionType(TransactionType.SYNC);
        } else if (defaultTransactionResponse.getWorkflow() == Workflow.ASYNC) {
            transaction.setRedirectUrl(a(defaultTransactionResponse));
            transaction.setTransactionType(TransactionType.ASYNC);
        } else {
            transaction.setTransactionType(TransactionType.SYNC);
        }
    }

    /* access modifiers changed from: protected */
    public String a(DefaultTransactionResponse defaultTransactionResponse) {
        return (String) Optional.ofNullable(defaultTransactionResponse.getRedirect()).map(new w()).orElse((Object) null);
    }

    /* access modifiers changed from: private */
    public ThreeDS2Info a(DefaultTransactionResponse.AdditionalAttributes additionalAttributes) {
        ThreeDS threeDS = additionalAttributes.getThreeDS();
        if (threeDS == null) {
            return null;
        }
        ThreeDS2Info threeDS2Info = new ThreeDS2Info((ThreeDS2Info.AuthStatus) Optional.ofNullable(additionalAttributes.getTransactionStatus()).map(new x()).orElse(ThreeDS2Info.AuthStatus.AUTH_PARAMS_REQUIRED), additionalAttributes.getClientAuthResponse());
        threeDS2Info.setProtocolVersion(threeDS.getProtocolVersion());
        threeDS2Info.setCardHolderInfo(additionalAttributes.getCardholderInfo());
        threeDS2Info.setThreeDSFlow(threeDS.getMsdkFlow());
        threeDS2Info.setBrand(threeDS.getBrand());
        threeDS2Info.setCallbackUrl(threeDS.getCallbackUrl());
        Optional.ofNullable(threeDS.getConfig()).ifPresent(new y(this, threeDS2Info));
        return threeDS2Info;
    }

    /* access modifiers changed from: private */
    public void a(ThreeDS.Config config, ThreeDS2Info threeDS2Info) {
        threeDS2Info.setDsRefId(config.getDsRefId());
        if (config.getDsCert() != null) {
            threeDS2Info.setDsCert(StringUtils.convertFromBase64(config.getDsCert()));
        }
        if (config.getDsRootCa() != null) {
            threeDS2Info.setDsRootCa(StringUtils.convertFromBase64(config.getDsRootCa()));
        }
    }
}
