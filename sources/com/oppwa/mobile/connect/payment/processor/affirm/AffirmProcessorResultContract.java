package com.oppwa.mobile.connect.payment.processor.affirm;

import com.oppwa.mobile.connect.payment.processor.BaseProcessorActivityResultContract;

public class AffirmProcessorResultContract extends BaseProcessorActivityResultContract {
    public Class<?> getActivityClass() {
        return AffirmProcessorActivity.class;
    }

    public String getPaymentErrorExtraKey() {
        return AffirmProcessorActivity.ERROR_EXTRA_KEY;
    }

    public String getTransactionExtraKey() {
        return AffirmProcessorActivity.TRANSACTION_EXTRA_KEY;
    }
}
