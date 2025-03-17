package com.sugarcube.app.base.data.source.remote;

import WH.C16729a;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.network.NetworkClient;
import nH.C17624c;

public final class CompositionRemoteDataSourceImpl_Factory implements C17624c<CompositionRemoteDataSourceImpl> {
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<NetworkClient> networkClientProvider;

    public CompositionRemoteDataSourceImpl_Factory(C16729a<NetworkClient> aVar, C16729a<ConfigRepository> aVar2) {
        this.networkClientProvider = aVar;
        this.configRepositoryProvider = aVar2;
    }

    public static CompositionRemoteDataSourceImpl_Factory create(C16729a<NetworkClient> aVar, C16729a<ConfigRepository> aVar2) {
        return new CompositionRemoteDataSourceImpl_Factory(aVar, aVar2);
    }

    public static CompositionRemoteDataSourceImpl newInstance(NetworkClient networkClient, ConfigRepository configRepository) {
        return new CompositionRemoteDataSourceImpl(networkClient, configRepository);
    }

    public CompositionRemoteDataSourceImpl get() {
        return newInstance(this.networkClientProvider.get(), this.configRepositoryProvider.get());
    }
}
