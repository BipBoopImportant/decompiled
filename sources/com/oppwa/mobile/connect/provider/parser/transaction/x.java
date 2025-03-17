package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.ThreeDS2Info;
import java.util.function.Function;

public final /* synthetic */ class x implements Function {
    public final Object apply(Object obj) {
        return ThreeDS2Info.AuthStatus.fromString((String) obj);
    }
}
