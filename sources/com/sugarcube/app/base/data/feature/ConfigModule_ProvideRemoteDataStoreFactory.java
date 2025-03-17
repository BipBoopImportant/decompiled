package com.sugarcube.app.base.data.feature;

import R2.h;
import W2.f;
import WH.C16729a;
import android.content.Context;
import nH.C17624c;
import nH.C17627f;

public final class ConfigModule_ProvideRemoteDataStoreFactory implements C17624c<h<f>> {
    private final C16729a<Context> appContextProvider;
    private final ConfigModule module;

    public ConfigModule_ProvideRemoteDataStoreFactory(ConfigModule configModule, C16729a<Context> aVar) {
        this.module = configModule;
        this.appContextProvider = aVar;
    }

    public static ConfigModule_ProvideRemoteDataStoreFactory create(ConfigModule configModule, C16729a<Context> aVar) {
        return new ConfigModule_ProvideRemoteDataStoreFactory(configModule, aVar);
    }

    public static h<f> provideRemoteDataStore(ConfigModule configModule, Context context) {
        return (h) C17627f.d(configModule.provideRemoteDataStore(context));
    }

    public h<f> get() {
        return provideRemoteDataStore(this.module, this.appContextProvider.get());
    }
}
