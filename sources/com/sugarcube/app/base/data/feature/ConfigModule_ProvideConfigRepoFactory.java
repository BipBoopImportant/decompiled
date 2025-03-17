package com.sugarcube.app.base.data.feature;

import OE.C13309a;
import R2.h;
import W2.f;
import WH.C16729a;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.config.a;
import nH.C17624c;
import nH.C17627f;

public final class ConfigModule_ProvideConfigRepoFactory implements C17624c<ConfigRepository> {
    private final C16729a<C13309a> appEnvironmentProvider;
    private final C16729a<a> configProvider;
    private final ConfigModule module;
    private final C16729a<OptimizelyRepository> optProvider;
    private final C16729a<h<f>> overrideDataStoreProvider;
    private final C16729a<PreferenceStorage> preferenceStorageProvider;
    private final C16729a<h<f>> remoteDataStoreProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public ConfigModule_ProvideConfigRepoFactory(ConfigModule configModule, C16729a<C13309a> aVar, C16729a<OptimizelyRepository> aVar2, C16729a<UserRepo> aVar3, C16729a<a> aVar4, C16729a<PreferenceStorage> aVar5, C16729a<h<f>> aVar6, C16729a<h<f>> aVar7) {
        this.module = configModule;
        this.appEnvironmentProvider = aVar;
        this.optProvider = aVar2;
        this.userRepoProvider = aVar3;
        this.configProvider = aVar4;
        this.preferenceStorageProvider = aVar5;
        this.remoteDataStoreProvider = aVar6;
        this.overrideDataStoreProvider = aVar7;
    }

    public static ConfigModule_ProvideConfigRepoFactory create(ConfigModule configModule, C16729a<C13309a> aVar, C16729a<OptimizelyRepository> aVar2, C16729a<UserRepo> aVar3, C16729a<a> aVar4, C16729a<PreferenceStorage> aVar5, C16729a<h<f>> aVar6, C16729a<h<f>> aVar7) {
        return new ConfigModule_ProvideConfigRepoFactory(configModule, aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ConfigRepository provideConfigRepo(ConfigModule configModule, C13309a aVar, OptimizelyRepository optimizelyRepository, UserRepo userRepo, a aVar2, PreferenceStorage preferenceStorage, h<f> hVar, h<f> hVar2) {
        return (ConfigRepository) C17627f.d(configModule.provideConfigRepo(aVar, optimizelyRepository, userRepo, aVar2, preferenceStorage, hVar, hVar2));
    }

    public ConfigRepository get() {
        return provideConfigRepo(this.module, this.appEnvironmentProvider.get(), this.optProvider.get(), this.userRepoProvider.get(), this.configProvider.get(), this.preferenceStorageProvider.get(), this.remoteDataStoreProvider.get(), this.overrideDataStoreProvider.get());
    }
}
