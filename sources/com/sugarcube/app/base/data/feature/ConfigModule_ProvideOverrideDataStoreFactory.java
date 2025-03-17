package com.sugarcube.app.base.data.feature;

import R2.h;
import W2.f;
import WH.C16729a;
import android.content.Context;
import nH.C17624c;
import nH.C17627f;

public final class ConfigModule_ProvideOverrideDataStoreFactory implements C17624c<h<f>> {
    private final C16729a<Context> appContextProvider;
    private final ConfigModule module;

    public ConfigModule_ProvideOverrideDataStoreFactory(ConfigModule configModule, C16729a<Context> aVar) {
        this.module = configModule;
        this.appContextProvider = aVar;
    }

    public static ConfigModule_ProvideOverrideDataStoreFactory create(ConfigModule configModule, C16729a<Context> aVar) {
        return new ConfigModule_ProvideOverrideDataStoreFactory(configModule, aVar);
    }

    public static h<f> provideOverrideDataStore(ConfigModule configModule, Context context) {
        return (h) C17627f.d(configModule.provideOverrideDataStore(context));
    }

    public h<f> get() {
        return provideOverrideDataStore(this.module, this.appContextProvider.get());
    }
}
