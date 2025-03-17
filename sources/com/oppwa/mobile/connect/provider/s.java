package com.oppwa.mobile.connect.provider;

import com.oppwa.mobile.connect.provider.threeds.v2.model.ThreeDSConfig;
import java.util.function.Function;

public final /* synthetic */ class s implements Function {
    public final Object apply(Object obj) {
        return Boolean.valueOf(((ThreeDSConfig) obj).isBrowserDataRequired());
    }
}
