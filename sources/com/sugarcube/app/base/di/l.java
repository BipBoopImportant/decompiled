package com.sugarcube.app.base.di;

import QL.y;
import com.sugarcube.core.network.api.CatalogApi;
import nH.C17624c;
import nH.C17627f;

public final class l implements C17624c<CatalogApi> {
    public static CatalogApi a(y yVar) {
        return (CatalogApi) C17627f.d(NetworkApiModule.Companion.e(yVar));
    }
}
