package com.sugarcube.app.base.external.config;

import TJ.C16532g;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\bR\u0014\u0010\u0015\u001a\u00020\u00128VX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/app/base/external/config/IConfig;", "", "", "getDebug", "()Z", "debug", "", "getCountry", "()Ljava/lang/String;", "country", "getLanguage", "language", "LTJ/g;", "getTrackingEnabledFlow", "()LTJ/g;", "trackingEnabledFlow", "getRegion", "region", "Ljava/util/Locale;", "getLocale", "()Ljava/util/Locale;", "locale", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface IConfig {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public static Locale a(IConfig iConfig) {
            return new Locale(iConfig.getLanguage(), iConfig.getCountry());
        }

        public static String b(IConfig iConfig) {
            String country = iConfig.getCountry();
            String language = iConfig.getLanguage();
            return country + "/" + language;
        }
    }

    String getCountry();

    boolean getDebug();

    String getLanguage();

    Locale getLocale();

    String getRegion();

    C16532g<Boolean> getTrackingEnabledFlow();
}
