package com.sugarcube.app.base.data.source.remote;

import WH.C16729a;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.core.network.api.SmartaApiService;
import nH.C17624c;

public final class SmartaRepositoryImpl_Factory implements C17624c<SmartaRepositoryImpl> {
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<SmartaApiService> smartaAPIProvider;

    public SmartaRepositoryImpl_Factory(C16729a<SmartaApiService> aVar, C16729a<ConfigRepository> aVar2) {
        this.smartaAPIProvider = aVar;
        this.configRepositoryProvider = aVar2;
    }

    public static SmartaRepositoryImpl_Factory create(C16729a<SmartaApiService> aVar, C16729a<ConfigRepository> aVar2) {
        return new SmartaRepositoryImpl_Factory(aVar, aVar2);
    }

    public static SmartaRepositoryImpl newInstance(SmartaApiService smartaApiService, ConfigRepository configRepository) {
        return new SmartaRepositoryImpl(smartaApiService, configRepository);
    }

    public SmartaRepositoryImpl get() {
        return newInstance(this.smartaAPIProvider.get(), this.configRepositoryProvider.get());
    }
}
