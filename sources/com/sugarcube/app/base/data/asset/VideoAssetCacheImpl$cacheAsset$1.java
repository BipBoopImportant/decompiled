package com.sugarcube.app.base.data.asset;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.asset.VideoAssetCacheImpl", f = "VideoAssetRepository.kt", l = {351, 353}, m = "cacheAsset")
final class VideoAssetCacheImpl$cacheAsset$1 extends d {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VideoAssetCacheImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoAssetCacheImpl$cacheAsset$1(VideoAssetCacheImpl videoAssetCacheImpl, C17164e<? super VideoAssetCacheImpl$cacheAsset$1> eVar) {
        super(eVar);
        this.this$0 = videoAssetCacheImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.cacheAsset((VideoAsset) null, this);
    }
}
