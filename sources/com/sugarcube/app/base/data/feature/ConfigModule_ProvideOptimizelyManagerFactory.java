package com.sugarcube.app.base.data.feature;

import VE.C13760b;
import WH.C16729a;
import android.content.Context;
import nH.C17624c;
import nH.C17627f;
import xE.C15216f;

public final class ConfigModule_ProvideOptimizelyManagerFactory implements C17624c<C15216f> {
    private final C16729a<Context> appContextProvider;
    private final ConfigModule module;
    private final C16729a<C13760b> networkConfigProvider;

    public ConfigModule_ProvideOptimizelyManagerFactory(ConfigModule configModule, C16729a<Context> aVar, C16729a<C13760b> aVar2) {
        this.module = configModule;
        this.appContextProvider = aVar;
        this.networkConfigProvider = aVar2;
    }

    public static ConfigModule_ProvideOptimizelyManagerFactory create(ConfigModule configModule, C16729a<Context> aVar, C16729a<C13760b> aVar2) {
        return new ConfigModule_ProvideOptimizelyManagerFactory(configModule, aVar, aVar2);
    }

    public static C15216f provideOptimizelyManager(ConfigModule configModule, Context context, C13760b bVar) {
        return (C15216f) C17627f.d(configModule.provideOptimizelyManager(context, bVar));
    }

    public C15216f get() {
        return provideOptimizelyManager(this.module, this.appContextProvider.get(), this.networkConfigProvider.get());
    }
}
