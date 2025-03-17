package com.oppwa.mobile.connect.provider;

import com.oppwa.mobile.connect.provider.threeds.v2.ThreeDS2TransactionManager;
import java.util.function.Consumer;

public final /* synthetic */ class m implements Consumer {
    public final void accept(Object obj) {
        ((ThreeDS2TransactionManager) obj).cleanUp();
    }
}
