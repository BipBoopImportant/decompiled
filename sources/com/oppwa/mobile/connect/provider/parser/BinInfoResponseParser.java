package com.oppwa.mobile.connect.provider.parser;

import com.oppwa.mobile.connect.provider.model.BinInfo;
import com.oppwa.mobile.connect.provider.model.response.BinInfoResponse;
import java.util.Optional;

public class BinInfoResponseParser extends AbstractResponseParser<BinInfo, BinInfoResponse> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public BinInfo a(BinInfoResponse binInfoResponse) {
        return a(binInfoResponse);
    }

    private BinInfo a(BinInfoResponse binInfoResponse) {
        return new BinInfo((String[]) Optional.ofNullable(binInfoResponse.getBrands()).orElse(new String[0]), binInfoResponse.getBinType(), binInfoResponse.getType());
    }
}
