package com.oppwa.mobile.connect.provider.model.response;

import androidx.annotation.Keep;

@Keep
public class BinInfoResponse {
    private String binType;
    private String[] brands;
    private String type;

    public String getBinType() {
        return this.binType;
    }

    public String[] getBrands() {
        return this.brands;
    }

    public String getType() {
        return this.type;
    }
}
