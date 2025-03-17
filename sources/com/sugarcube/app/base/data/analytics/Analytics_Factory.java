package com.sugarcube.app.base.data.analytics;

import NF.C13287a;
import WH.C16729a;
import com.sugarcube.app.base.data.AnalyticsManager;
import nH.C17624c;

public final class Analytics_Factory implements C17624c<Analytics> {
    private final C16729a<AnalyticsManager> analyticsManagerProvider;
    private final C16729a<C13287a> captureAnalyticsHelperProvider;

    public Analytics_Factory(C16729a<AnalyticsManager> aVar, C16729a<C13287a> aVar2) {
        this.analyticsManagerProvider = aVar;
        this.captureAnalyticsHelperProvider = aVar2;
    }

    public static Analytics_Factory create(C16729a<AnalyticsManager> aVar, C16729a<C13287a> aVar2) {
        return new Analytics_Factory(aVar, aVar2);
    }

    public static Analytics newInstance(AnalyticsManager analyticsManager, C13287a aVar) {
        return new Analytics(analyticsManager, aVar);
    }

    public Analytics get() {
        return newInstance(this.analyticsManagerProvider.get(), this.captureAnalyticsHelperProvider.get());
    }
}
