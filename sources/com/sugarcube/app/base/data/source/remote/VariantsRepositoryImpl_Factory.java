package com.sugarcube.app.base.data.source.remote;

import WH.C16729a;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import com.sugarcube.app.base.data.source.local.VariantsItemCache;
import com.sugarcube.core.network.api.CatalogApi;
import nH.C17624c;

public final class VariantsRepositoryImpl_Factory implements C17624c<VariantsRepositoryImpl> {
    private final C16729a<CatalogApi> cachedApiServiceProvider;
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<VariantsItemCache> variantsCacheProvider;

    public VariantsRepositoryImpl_Factory(C16729a<ConfigRepository> aVar, C16729a<VariantsItemCache> aVar2, C16729a<CatalogApi> aVar3) {
        this.configRepositoryProvider = aVar;
        this.variantsCacheProvider = aVar2;
        this.cachedApiServiceProvider = aVar3;
    }

    public static VariantsRepositoryImpl_Factory create(C16729a<ConfigRepository> aVar, C16729a<VariantsItemCache> aVar2, C16729a<CatalogApi> aVar3) {
        return new VariantsRepositoryImpl_Factory(aVar, aVar2, aVar3);
    }

    public static VariantsRepositoryImpl newInstance(ConfigRepository configRepository, VariantsItemCache variantsItemCache, CatalogApi catalogApi) {
        return new VariantsRepositoryImpl(configRepository, variantsItemCache, catalogApi);
    }

    public VariantsRepositoryImpl get() {
        return newInstance(this.configRepositoryProvider.get(), this.variantsCacheProvider.get(), this.cachedApiServiceProvider.get());
    }
}
