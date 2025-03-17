package com.oppwa.mobile.connect.provider.parser.transaction;

import HJ.C15838d;
import com.oppwa.mobile.connect.provider.model.response.transaction.DefaultTransactionResponse;
import com.oppwa.mobile.connect.provider.model.response.transaction.Redirect;
import com.oppwa.mobile.connect.utils.Logger;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;

class h extends f {
    h() {
    }

    /* access modifiers changed from: protected */
    public String a(DefaultTransactionResponse defaultTransactionResponse) {
        return (String) Optional.ofNullable(defaultTransactionResponse.getRedirect()).map(new E(this)).orElse((Object) null);
    }

    /* access modifiers changed from: private */
    public String a(Redirect redirect) {
        List<Redirect.Parameter> parameters;
        String url = redirect.getUrl();
        if (url == null || (parameters = redirect.getParameters()) == null) {
            return url;
        }
        StringJoiner stringJoiner = new StringJoiner("&");
        for (Redirect.Parameter next : parameters) {
            try {
                String encode = URLEncoder.encode(next.getValue(), C15838d.f135279b.name());
                stringJoiner.add(next.getName() + "=" + encode);
            } catch (UnsupportedEncodingException e10) {
                Logger.error((Throwable) e10);
                throw new IllegalStateException("Fail to encode url parameter", e10);
            }
        }
        return url + "?" + stringJoiner;
    }
}
