package com.sugarcube.app.base.network;

import GK.C15804w;
import VE.C13760b;
import WH.C16729a;
import com.squareup.moshi.t;
import java.util.Map;
import nH.C17624c;

public final class NetworkClientImpl_Factory implements C17624c<NetworkClientImpl> {
    private final C16729a<C15804w> hostAppInterceptorProvider;
    private final C16729a<Map<String, C15804w>> interceptorsProvider;
    private final C16729a<t> moshiProvider;
    private final C16729a<C13760b> networkConfigProvider;
    private final C16729a<TokenStoreV2> tokenStoreProvider;

    public NetworkClientImpl_Factory(C16729a<C15804w> aVar, C16729a<TokenStoreV2> aVar2, C16729a<C13760b> aVar3, C16729a<t> aVar4, C16729a<Map<String, C15804w>> aVar5) {
        this.hostAppInterceptorProvider = aVar;
        this.tokenStoreProvider = aVar2;
        this.networkConfigProvider = aVar3;
        this.moshiProvider = aVar4;
        this.interceptorsProvider = aVar5;
    }

    public static NetworkClientImpl_Factory create(C16729a<C15804w> aVar, C16729a<TokenStoreV2> aVar2, C16729a<C13760b> aVar3, C16729a<t> aVar4, C16729a<Map<String, C15804w>> aVar5) {
        return new NetworkClientImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static NetworkClientImpl newInstance(C15804w wVar, TokenStoreV2 tokenStoreV2, C13760b bVar, t tVar, Map<String, C15804w> map) {
        return new NetworkClientImpl(wVar, tokenStoreV2, bVar, tVar, map);
    }

    public NetworkClientImpl get() {
        return newInstance(this.hostAppInterceptorProvider.get(), this.tokenStoreProvider.get(), this.networkConfigProvider.get(), this.moshiProvider.get(), this.interceptorsProvider.get());
    }
}
