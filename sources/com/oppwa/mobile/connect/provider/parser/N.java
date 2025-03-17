package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.payment.token.Token;
import java.util.Objects;
import java.util.function.Predicate;

public final /* synthetic */ class N implements Predicate {
    public final boolean test(Object obj) {
        return Objects.nonNull((Token) obj);
    }
}
