package com.sugarcube.app.base.data.asset;

import QJ.M;
import QJ.Q;
import WH.C16729a;
import android.content.Context;
import com.sugarcube.app.base.data.feature.ConfigRepository;
import nH.C17624c;

public final class VideoAssetRepositoryImpl_Factory implements C17624c<VideoAssetRepositoryImpl> {
    private final C16729a<ConfigRepository> configRepositoryProvider;
    private final C16729a<Context> contextProvider;
    private final C16729a<M> dispatcherProvider;
    private final C16729a<Q> scopeProvider;
    private final C16729a<VideoAssetCache> videoAssetCacheProvider;

    public VideoAssetRepositoryImpl_Factory(C16729a<Context> aVar, C16729a<ConfigRepository> aVar2, C16729a<Q> aVar3, C16729a<M> aVar4, C16729a<VideoAssetCache> aVar5) {
        this.contextProvider = aVar;
        this.configRepositoryProvider = aVar2;
        this.scopeProvider = aVar3;
        this.dispatcherProvider = aVar4;
        this.videoAssetCacheProvider = aVar5;
    }

    public static VideoAssetRepositoryImpl_Factory create(C16729a<Context> aVar, C16729a<ConfigRepository> aVar2, C16729a<Q> aVar3, C16729a<M> aVar4, C16729a<VideoAssetCache> aVar5) {
        return new VideoAssetRepositoryImpl_Factory(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static VideoAssetRepositoryImpl newInstance(Context context, ConfigRepository configRepository, Q q10, M m10, VideoAssetCache videoAssetCache) {
        return new VideoAssetRepositoryImpl(context, configRepository, q10, m10, videoAssetCache);
    }

    public VideoAssetRepositoryImpl get() {
        return newInstance(this.contextProvider.get(), this.configRepositoryProvider.get(), this.scopeProvider.get(), this.dispatcherProvider.get(), this.videoAssetCacheProvider.get());
    }
}
