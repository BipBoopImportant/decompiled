package com.sugarcube.app.base.data.source.local;

import OE.C13309a;
import WH.C16729a;
import nH.C17624c;

public final class CatalogRepositoryLocalDataSourceImpl_Factory implements C17624c<CatalogRepositoryLocalDataSourceImpl> {
    private final C16729a<C13309a> appEnvironmentProvider;

    public CatalogRepositoryLocalDataSourceImpl_Factory(C16729a<C13309a> aVar) {
        this.appEnvironmentProvider = aVar;
    }

    public static CatalogRepositoryLocalDataSourceImpl_Factory create(C16729a<C13309a> aVar) {
        return new CatalogRepositoryLocalDataSourceImpl_Factory(aVar);
    }

    public static CatalogRepositoryLocalDataSourceImpl newInstance(C13309a aVar) {
        return new CatalogRepositoryLocalDataSourceImpl(aVar);
    }

    public CatalogRepositoryLocalDataSourceImpl get() {
        return newInstance(this.appEnvironmentProvider.get());
    }
}
