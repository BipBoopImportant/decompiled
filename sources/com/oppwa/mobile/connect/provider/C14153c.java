package com.oppwa.mobile.connect.provider;

import android.content.Context;
import com.oppwa.mobile.connect.provider.Connect;
import com.oppwa.mobile.connect.utils.Logger;

/* renamed from: com.oppwa.mobile.connect.provider.c  reason: case insensitive filesystem */
abstract class C14153c implements IPaymentProvider {

    /* renamed from: a  reason: collision with root package name */
    protected Connect.ProviderMode f122005a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f122006b;

    C14153c(Context context, Connect.ProviderMode providerMode) {
        this.f122006b = context;
        this.f122005a = providerMode;
        Logger.setProviderMode(providerMode);
    }

    public Context getContext() {
        return this.f122006b;
    }

    public Connect.ProviderMode getProviderMode() {
        return this.f122005a;
    }

    public void setProviderMode(Connect.ProviderMode providerMode) {
        this.f122005a = providerMode;
        Logger.setProviderMode(providerMode);
    }
}
