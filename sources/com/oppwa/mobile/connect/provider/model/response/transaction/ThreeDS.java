package com.oppwa.mobile.connect.provider.model.response.transaction;

import androidx.annotation.Keep;
import com.oppwa.mobile.connect.provider.ThreeDS2Info;

@Keep
public class ThreeDS {
    private String brand;
    private String callbackUrl;
    private Config config;
    private ThreeDS2Info.ThreeDSFlow msdkFlow;
    private String protocolVersion;

    @Keep
    public static class Config {
        private String dsCert;
        private String dsRefId;
        private String dsRootCa;

        public String getDsCert() {
            return this.dsCert;
        }

        public String getDsRefId() {
            return this.dsRefId;
        }

        public String getDsRootCa() {
            return this.dsRootCa;
        }
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public Config getConfig() {
        return this.config;
    }

    public ThreeDS2Info.ThreeDSFlow getMsdkFlow() {
        return this.msdkFlow;
    }

    public String getProtocolVersion() {
        return this.protocolVersion;
    }
}
