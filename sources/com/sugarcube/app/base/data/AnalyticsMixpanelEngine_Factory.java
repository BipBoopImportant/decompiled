package com.sugarcube.app.base.data;

import OE.C13313e;
import WH.C16729a;
import android.content.Context;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.external.config.a;
import nH.C17624c;

public final class AnalyticsMixpanelEngine_Factory implements C17624c<AnalyticsMixpanelEngine> {
    private final C16729a<a> appConfigProvider;
    private final C16729a<Context> appContextProvider;
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<C13313e> installationConfigProvider;

    public AnalyticsMixpanelEngine_Factory(C16729a<a> aVar, C16729a<C13313e> aVar2, C16729a<Context> aVar3, C16729a<ConfigRepository> aVar4) {
        this.appConfigProvider = aVar;
        this.installationConfigProvider = aVar2;
        this.appContextProvider = aVar3;
        this.configRepositoryProvider = aVar4;
    }

    public static AnalyticsMixpanelEngine_Factory create(C16729a<a> aVar, C16729a<C13313e> aVar2, C16729a<Context> aVar3, C16729a<ConfigRepository> aVar4) {
        return new AnalyticsMixpanelEngine_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static AnalyticsMixpanelEngine newInstance(a aVar, C13313e eVar, Context context, ConfigRepository configRepository) {
        return new AnalyticsMixpanelEngine(aVar, eVar, context, configRepository);
    }

    public AnalyticsMixpanelEngine get() {
        return newInstance(this.appConfigProvider.get(), this.installationConfigProvider.get(), this.appContextProvider.get(), this.configRepositoryProvider.get());
    }
}
