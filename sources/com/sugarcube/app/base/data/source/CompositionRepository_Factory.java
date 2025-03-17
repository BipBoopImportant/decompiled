package com.sugarcube.app.base.data.source;

import WH.C16729a;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.user.UserRepo;
import nH.C17624c;

public final class CompositionRepository_Factory implements C17624c<CompositionRepository> {
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<CompositionLocalDataSource> localProvider;
    private final C16729a<CompositionRemoteDataSource> remoteProvider;
    private final C16729a<UserRepo> userRepoProvider;

    public CompositionRepository_Factory(C16729a<CompositionLocalDataSource> aVar, C16729a<CompositionRemoteDataSource> aVar2, C16729a<ConfigRepository> aVar3, C16729a<UserRepo> aVar4) {
        this.localProvider = aVar;
        this.remoteProvider = aVar2;
        this.configRepositoryProvider = aVar3;
        this.userRepoProvider = aVar4;
    }

    public static CompositionRepository_Factory create(C16729a<CompositionLocalDataSource> aVar, C16729a<CompositionRemoteDataSource> aVar2, C16729a<ConfigRepository> aVar3, C16729a<UserRepo> aVar4) {
        return new CompositionRepository_Factory(aVar, aVar2, aVar3, aVar4);
    }

    public static CompositionRepository newInstance(CompositionLocalDataSource compositionLocalDataSource, CompositionRemoteDataSource compositionRemoteDataSource, ConfigRepository configRepository, UserRepo userRepo) {
        return new CompositionRepository(compositionLocalDataSource, compositionRemoteDataSource, configRepository, userRepo);
    }

    public CompositionRepository get() {
        return newInstance(this.localProvider.get(), this.remoteProvider.get(), this.configRepositoryProvider.get(), this.userRepoProvider.get());
    }
}
