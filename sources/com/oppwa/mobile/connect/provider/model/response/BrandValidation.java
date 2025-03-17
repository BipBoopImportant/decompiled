package com.oppwa.mobile.connect.provider.model.response;

import androidx.annotation.Keep;

@Keep
public class BrandValidation {
    private String brand;
    private Boolean customView;
    private Integer cvvLength;
    private String detection;
    private Boolean expiryDate;
    private String label;
    private Boolean luhn;
    private Boolean mobilePhone;
    private Boolean noCvv;
    private String number;
    private Boolean optionalCvv;
    private String pattern;
    private String render;

    public String getBrand() {
        return this.brand;
    }

    public Boolean getCustomView() {
        return this.customView;
    }

    public Integer getCvvLength() {
        return this.cvvLength;
    }

    public String getDetection() {
        return this.detection;
    }

    public Boolean getExpiryDate() {
        return this.expiryDate;
    }

    public String getLabel() {
        return this.label;
    }

    public Boolean getLuhn() {
        return this.luhn;
    }

    public Boolean getMobilePhone() {
        return this.mobilePhone;
    }

    public Boolean getNoCvv() {
        return this.noCvv;
    }

    public String getNumber() {
        return this.number;
    }

    public Boolean getOptionalCvv() {
        return this.optionalCvv;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getRender() {
        return this.render;
    }
}
