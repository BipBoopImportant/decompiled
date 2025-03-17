package com.sugarcube.app.base.data.source;

import WH.C16729a;
import com.sugarcube.app.base.external.interactions.CartInteractions;
import nH.C17624c;

public final class CatalogRepository_Factory implements C17624c<CatalogRepository> {
    private final C16729a<CartInteractions> cartInteractionsProvider;
    private final C16729a<CatalogRepositoryLocalDataSource> localProvider;
    private final C16729a<CatalogRepositoryRemoteDataSource> remoteProvider;

    public CatalogRepository_Factory(C16729a<CatalogRepositoryLocalDataSource> aVar, C16729a<CatalogRepositoryRemoteDataSource> aVar2, C16729a<CartInteractions> aVar3) {
        this.localProvider = aVar;
        this.remoteProvider = aVar2;
        this.cartInteractionsProvider = aVar3;
    }

    public static CatalogRepository_Factory create(C16729a<CatalogRepositoryLocalDataSource> aVar, C16729a<CatalogRepositoryRemoteDataSource> aVar2, C16729a<CartInteractions> aVar3) {
        return new CatalogRepository_Factory(aVar, aVar2, aVar3);
    }

    public static CatalogRepository newInstance(CatalogRepositoryLocalDataSource catalogRepositoryLocalDataSource, CatalogRepositoryRemoteDataSource catalogRepositoryRemoteDataSource, CartInteractions cartInteractions) {
        return new CatalogRepository(catalogRepositoryLocalDataSource, catalogRepositoryRemoteDataSource, cartInteractions);
    }

    public CatalogRepository get() {
        return newInstance(this.localProvider.get(), this.remoteProvider.get(), this.cartInteractionsProvider.get());
    }
}
