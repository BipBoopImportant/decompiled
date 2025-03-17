package com.oppwa.mobile.connect.provider.parser.transaction;

import com.oppwa.mobile.connect.provider.Transaction;
import com.oppwa.mobile.connect.provider.model.response.transaction.Redirect;
import java.util.function.Predicate;

public final /* synthetic */ class p implements Predicate {
    public final boolean test(Object obj) {
        return Transaction.BANCONTACT_LINK_APP_SCHEME_URL_KEY.equals(((Redirect.Parameter) obj).getName());
    }
}
