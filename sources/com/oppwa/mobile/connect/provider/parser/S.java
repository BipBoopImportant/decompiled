package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.CheckoutInfo;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmConfig;
import com.oppwa.mobile.connect.provider.model.response.CheckoutInfoResponse;
import java.util.function.Consumer;

public final /* synthetic */ class S implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CheckoutInfo.Builder f122059a;

    public /* synthetic */ S(CheckoutInfo.Builder builder) {
        this.f122059a = builder;
    }

    public final void accept(Object obj) {
        this.f122059a.setAffirmConfig(new AffirmConfig(((CheckoutInfoResponse.Config.WorkflowSpecificConfig.AffirmConfig) obj).getPublicKey(), ((CheckoutInfoResponse.Config.WorkflowSpecificConfig.AffirmConfig) obj).isActive()));
    }
}
