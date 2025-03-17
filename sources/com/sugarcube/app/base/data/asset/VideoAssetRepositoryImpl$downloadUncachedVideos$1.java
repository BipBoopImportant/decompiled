package com.sugarcube.app.base.data.asset;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl", f = "VideoAssetRepository.kt", l = {247, 253}, m = "downloadUncachedVideos")
final class VideoAssetRepositoryImpl$downloadUncachedVideos$1 extends d {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    Object L$0;
    Object L$1;
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
    final /* synthetic */ VideoAssetRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoAssetRepositoryImpl$downloadUncachedVideos$1(VideoAssetRepositoryImpl videoAssetRepositoryImpl, C17164e<? super VideoAssetRepositoryImpl$downloadUncachedVideos$1> eVar) {
        super(eVar);
        this.this$0 = videoAssetRepositoryImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.downloadUncachedVideos(this);
    }
}
