package com.sugarcube.app.base.data.asset;

import dI.C17164e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@f(c = "com.sugarcube.app.base.data.asset.VideoAssetDownloadWorker", f = "VideoAssetRepository.kt", l = {277}, m = "doWork")
final class VideoAssetDownloadWorker$doWork$1 extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ VideoAssetDownloadWorker this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoAssetDownloadWorker$doWork$1(VideoAssetDownloadWorker videoAssetDownloadWorker, C17164e<? super VideoAssetDownloadWorker$doWork$1> eVar) {
        super(eVar);
        this.this$0 = videoAssetDownloadWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
