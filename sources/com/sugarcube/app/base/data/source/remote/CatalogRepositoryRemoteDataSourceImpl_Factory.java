package com.sugarcube.app.base.data.source.remote;

import OE.q;
import WH.C16729a;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import com.sugarcube.app.base.network.NetworkClient;
import nH.C17624c;

public final class CatalogRepositoryRemoteDataSourceImpl_Factory implements C17624c<CatalogRepositoryRemoteDataSourceImpl> {
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<NetworkClient> networkClientProvider;
    private final C16729a<q> sugarcubeProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public CatalogRepositoryRemoteDataSourceImpl_Factory(C16729a<NetworkClient> aVar, C16729a<ConfigRepository> aVar2, C16729a<q> aVar3, C16729a<UserRepo> aVar4) {
        this.networkClientProvider = aVar;
        this.configRepositoryProvider = aVar2;
        this.sugarcubeProvider = aVar3;
        this.userRepoProvider = aVar4;
    }

    public static CatalogRepositoryRemoteDataSourceImpl_Factory create(C16729a<NetworkClient> aVar, C16729a<ConfigRepository> aVar2, C16729a<q> aVar3, C16729a<UserRepo> aVar4) {
        return new CatalogRepositoryRemoteDataSourceImpl_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static CatalogRepositoryRemoteDataSourceImpl newInstance(NetworkClient networkClient, ConfigRepository configRepository, q qVar, UserRepo userRepo) {
        return new CatalogRepositoryRemoteDataSourceImpl(networkClient, configRepository, qVar, userRepo);
    }

    public CatalogRepositoryRemoteDataSourceImpl get() {
        return newInstance(this.networkClientProvider.get(), this.configRepositoryProvider.get(), this.sugarcubeProvider.get(), this.userRepoProvider.get());
    }
}
