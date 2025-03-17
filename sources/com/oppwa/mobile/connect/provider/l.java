package com.oppwa.mobile.connect.provider;

import com.oppwa.mobile.connect.utils.Logger;
import java.util.function.Consumer;

public final /* synthetic */ class l implements Consumer {
    public final void accept(Object obj) {
        Logger.setLogLevel((Logger.LogLevel) obj);
    }
}
