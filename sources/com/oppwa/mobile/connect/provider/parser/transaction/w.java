package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.model.response.transaction.Redirect;
import java.util.function.Function;

public final /* synthetic */ class w implements Function {
    public final Object apply(Object obj) {
        return ((Redirect) obj).getShortUrl();
    }
}
