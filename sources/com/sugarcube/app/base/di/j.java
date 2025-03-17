package com.sugarcube.app.base.di;

import com.sugarcube.app.base.network.SmartaApiClient;
import com.sugarcube.core.network.api.SmartaApiService;
import nH.C17624c;
import nH.C17627f;

public final class j implements C17624c<SmartaApiService> {
    public static SmartaApiService a(SmartaApiClient smartaApiClient) {
        return (SmartaApiService) C17627f.d(AppModule.f123073a.l(smartaApiClient));
    }
}
