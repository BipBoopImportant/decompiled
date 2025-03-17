package com.sugarcube.app.base.data.asset;

import QJ.M;
import QJ.Q;
import WH.C16729a;
import android.content.Context;
import nH.C17624c;

public final class VideoAssetCacheImpl_Factory implements C17624c<VideoAssetCacheImpl> {
    private final C16729a<Context> contextProvider;
    private final C16729a<M> dispatcherProvider;
    private final C16729a<Q> scopeProvider;

    public VideoAssetCacheImpl_Factory(C16729a<Context> aVar, C16729a<Q> aVar2, C16729a<M> aVar3) {
        this.contextProvider = aVar;
        this.scopeProvider = aVar2;
        this.dispatcherProvider = aVar3;
    }

    public static VideoAssetCacheImpl_Factory create(C16729a<Context> aVar, C16729a<Q> aVar2, C16729a<M> aVar3) {
        return new VideoAssetCacheImpl_Factory(aVar, aVar2, aVar3);
    }

    public static VideoAssetCacheImpl newInstance(Context context, Q q10, M m10) {
        return new VideoAssetCacheImpl(context, q10, m10);
    }

    public VideoAssetCacheImpl get() {
        return newInstance(this.contextProvider.get(), this.scopeProvider.get(), this.dispatcherProvider.get());
    }
}
