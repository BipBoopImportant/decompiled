package com.sugarcube.app.base.data.source.remote;

import WH.C16729a;
import com.sugarcube.app.base.network.NetworkClient;
import nH.C17624c;

public final class QuickFilterRemoteDataSourceImpl_Factory implements C17624c<QuickFilterRemoteDataSourceImpl> {
    private final C16729a<NetworkClient> networkClientProvider;

    public QuickFilterRemoteDataSourceImpl_Factory(C16729a<NetworkClient> aVar) {
        this.networkClientProvider = aVar;
    }

    public static QuickFilterRemoteDataSourceImpl_Factory create(C16729a<NetworkClient> aVar) {
        return new QuickFilterRemoteDataSourceImpl_Factory(aVar);
    }

    public static QuickFilterRemoteDataSourceImpl newInstance(NetworkClient networkClient) {
        return new QuickFilterRemoteDataSourceImpl(networkClient);
    }

    public QuickFilterRemoteDataSourceImpl get() {
        return newInstance(this.networkClientProvider.get());
    }
}
