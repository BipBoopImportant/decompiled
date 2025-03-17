package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.model.response.transaction.Redirect;
import java.util.function.Function;

public final /* synthetic */ class q implements Function {
    public final Object apply(Object obj) {
        return ((Redirect.Parameter) obj).getValue();
    }
}
