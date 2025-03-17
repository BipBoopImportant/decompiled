package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.ThreeDS2Info;
import com.oppwa.mobile.connect.provider.model.response.transaction.ThreeDS;
import java.util.function.Consumer;

public final /* synthetic */ class y implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ f f122097a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ThreeDS2Info f122098b;

    public /* synthetic */ y(f fVar, ThreeDS2Info threeDS2Info) {
        this.f122097a = fVar;
        this.f122098b = threeDS2Info;
    }

    public final void accept(Object obj) {
        this.f122097a.a(this.f122098b, (ThreeDS.Config) obj);
    }
}
