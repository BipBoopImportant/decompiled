package com.oppwa.mobile.connect.checkout.meta;

import android.os.Bundle;
import com.oppwa.mobile.connect.utils.Utils;
import java.util.function.Function;

public final /* synthetic */ class x implements Function {
    public final Object apply(Object obj) {
        return Integer.valueOf(Utils.bundleHashCode((Bundle) obj));
    }
}
