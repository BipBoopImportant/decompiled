package com.sugarcube.app.base.data;

import OE.C13309a;
import OE.C13313e;
import WH.C16729a;
import com.sugarcube.app.base.DeviceCompatibility;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.config.a;
import com.sugarcube.app.base.external.interactions.FirebaseInteractions;
import nH.C17624c;

public final class AnalyticsManager_Factory implements C17624c<AnalyticsManager> {
    private final C16729a<a> appConfigProvider;
    private final C16729a<C13309a> appEnvironmentProvider;
    private final C16729a<DeviceCompatibility> deviceCompatibilityProvider;
    private final C16729a<FirebaseInteractions> firebaseInteractionsProvider;
    private final C16729a<C13313e> installationConfigProvider;
    private final C16729a<AnalyticsMixpanelEngine> mixpanelEngineProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public AnalyticsManager_Factory(C16729a<C13309a> aVar, C16729a<UserRepo> aVar2, C16729a<FirebaseInteractions> aVar3, C16729a<C13313e> aVar4, C16729a<a> aVar5, C16729a<AnalyticsMixpanelEngine> aVar6, C16729a<DeviceCompatibility> aVar7) {
        this.appEnvironmentProvider = aVar;
        this.userRepoProvider = aVar2;
        this.firebaseInteractionsProvider = aVar3;
        this.installationConfigProvider = aVar4;
        this.appConfigProvider = aVar5;
        this.mixpanelEngineProvider = aVar6;
        this.deviceCompatibilityProvider = aVar7;
    }

    public static AnalyticsManager_Factory create(C16729a<C13309a> aVar, C16729a<UserRepo> aVar2, C16729a<FirebaseInteractions> aVar3, C16729a<C13313e> aVar4, C16729a<a> aVar5, C16729a<AnalyticsMixpanelEngine> aVar6, C16729a<DeviceCompatibility> aVar7) {
        return new AnalyticsManager_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static AnalyticsManager newInstance(C13309a aVar, UserRepo userRepo, FirebaseInteractions firebaseInteractions, C13313e eVar, a aVar2, C16729a<AnalyticsMixpanelEngine> aVar3, DeviceCompatibility deviceCompatibility) {
        return new AnalyticsManager(aVar, userRepo, firebaseInteractions, eVar, aVar2, aVar3, deviceCompatibility);
    }

    public AnalyticsManager get() {
        return newInstance(this.appEnvironmentProvider.get(), this.userRepoProvider.get(), this.firebaseInteractionsProvider.get(), this.installationConfigProvider.get(), this.appConfigProvider.get(), this.mixpanelEngineProvider, this.deviceCompatibilityProvider.get());
    }
}
