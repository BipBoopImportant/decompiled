package com.oppwa.mobile.connect.provider.parser;

import android.text.TextUtils;
import java.util.function.Function;

public final /* synthetic */ class i0 implements Function {
    public final Object apply(Object obj) {
        return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
    }
}
