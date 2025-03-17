package com.oppwa.mobile.connect.provider;

import android.content.Context;
import com.oppwa.mobile.connect.BuildConfig;

public class Connect {

    public enum ProviderMode {
        LIVE,
        TEST
    }

    public static IPaymentProvider getProvider(Context context, ProviderMode providerMode) {
        return new OppPaymentProvider(context, providerMode);
    }

    public static String getVersion() {
        return BuildConfig.VERSION_NAME;
    }
}
