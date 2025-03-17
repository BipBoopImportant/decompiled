package com.sugarcube.app.base.network;

import VE.C13760b;
import WH.C16729a;
import com.squareup.moshi.t;
import com.sugarcube.app.base.external.config.a;
import nH.C17624c;

public final class SmartaApiClientImpl_Factory implements C17624c<SmartaApiClientImpl> {
    private final C16729a<a> configProvider;
    private final C16729a<t> moshiProvider;
    private final C16729a<C13760b> networkConfigProvider;

    public SmartaApiClientImpl_Factory(C16729a<C13760b> aVar, C16729a<a> aVar2, C16729a<t> aVar3) {
        this.networkConfigProvider = aVar;
        this.configProvider = aVar2;
        this.moshiProvider = aVar3;
    }

    public static SmartaApiClientImpl_Factory create(C16729a<C13760b> aVar, C16729a<a> aVar2, C16729a<t> aVar3) {
        return new SmartaApiClientImpl_Factory(aVar, aVar2, aVar3);
    }

    public static SmartaApiClientImpl newInstance(C13760b bVar, a aVar, t tVar) {
        return new SmartaApiClientImpl(bVar, aVar, tVar);
    }

    public SmartaApiClientImpl get() {
        return newInstance(this.networkConfigProvider.get(), this.configProvider.get(), this.moshiProvider.get());
    }
}
