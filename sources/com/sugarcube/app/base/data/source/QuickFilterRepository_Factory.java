package com.sugarcube.app.base.data.source;

import WH.C16729a;
import com.sugarcube.app.base.external.config.a;
import nH.C17624c;

public final class QuickFilterRepository_Factory implements C17624c<QuickFilterRepository> {
    private final C16729a<a> baseConfigProvider;
    private final C16729a<QuickFilterLocalDataSource> localProvider;
    private final C16729a<QuickFilterRemoteDataSource> remoteProvider;

    public QuickFilterRepository_Factory(C16729a<QuickFilterLocalDataSource> aVar, C16729a<QuickFilterRemoteDataSource> aVar2, C16729a<a> aVar3) {
        this.localProvider = aVar;
        this.remoteProvider = aVar2;
        this.baseConfigProvider = aVar3;
    }

    public static QuickFilterRepository_Factory create(C16729a<QuickFilterLocalDataSource> aVar, C16729a<QuickFilterRemoteDataSource> aVar2, C16729a<a> aVar3) {
        return new QuickFilterRepository_Factory(aVar, aVar2, aVar3);
    }

    public static QuickFilterRepository newInstance(QuickFilterLocalDataSource quickFilterLocalDataSource, QuickFilterRemoteDataSource quickFilterRemoteDataSource, a aVar) {
        return new QuickFilterRepository(quickFilterLocalDataSource, quickFilterRemoteDataSource, aVar);
    }

    public QuickFilterRepository get() {
        return newInstance(this.localProvider.get(), this.remoteProvider.get(), this.baseConfigProvider.get());
    }
}
