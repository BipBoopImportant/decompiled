package com.sugarcube.app.base.data.feature;

import OE.C13309a;
import WH.C16729a;
import com.sugarcube.app.base.data.preferences.PreferenceStorage;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.external.config.a;
import nH.C17624c;

public final class ConfigRepositoryImpl_Factory implements C17624c<ConfigRepositoryImpl> {
    private final C16729a<C13309a> appEnvironmentProvider;
    private final C16729a<a> configProvider;
    private final C16729a<OptimizelyRepository> optProvider;
    private final C16729a<IPreferencesDataStoreWrapper> overrideDataStoreProvider;
    private final C16729a<PreferenceStorage> preferenceStorageProvider;
    private final C16729a<IPreferencesDataStoreWrapper> remoteDataStoreProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public ConfigRepositoryImpl_Factory(C16729a<C13309a> aVar, C16729a<OptimizelyRepository> aVar2, C16729a<UserRepo> aVar3, C16729a<a> aVar4, C16729a<PreferenceStorage> aVar5, C16729a<IPreferencesDataStoreWrapper> aVar6, C16729a<IPreferencesDataStoreWrapper> aVar7) {
        this.appEnvironmentProvider = aVar;
        this.optProvider = aVar2;
        this.userRepoProvider = aVar3;
        this.configProvider = aVar4;
        this.preferenceStorageProvider = aVar5;
        this.remoteDataStoreProvider = aVar6;
        this.overrideDataStoreProvider = aVar7;
    }

    public static ConfigRepositoryImpl_Factory create(C16729a<C13309a> aVar, C16729a<OptimizelyRepository> aVar2, C16729a<UserRepo> aVar3, C16729a<a> aVar4, C16729a<PreferenceStorage> aVar5, C16729a<IPreferencesDataStoreWrapper> aVar6, C16729a<IPreferencesDataStoreWrapper> aVar7) {
        return new ConfigRepositoryImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static ConfigRepositoryImpl newInstance(C13309a aVar, OptimizelyRepository optimizelyRepository, UserRepo userRepo, a aVar2, PreferenceStorage preferenceStorage, IPreferencesDataStoreWrapper iPreferencesDataStoreWrapper, IPreferencesDataStoreWrapper iPreferencesDataStoreWrapper2) {
        return new ConfigRepositoryImpl(aVar, optimizelyRepository, userRepo, aVar2, preferenceStorage, iPreferencesDataStoreWrapper, iPreferencesDataStoreWrapper2);
    }

    public ConfigRepositoryImpl get() {
        return newInstance(this.appEnvironmentProvider.get(), this.optProvider.get(), this.userRepoProvider.get(), this.configProvider.get(), this.preferenceStorageProvider.get(), this.remoteDataStoreProvider.get(), this.overrideDataStoreProvider.get());
    }
}
