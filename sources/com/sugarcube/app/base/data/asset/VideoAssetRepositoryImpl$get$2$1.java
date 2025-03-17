package com.sugarcube.app.base.data.asset;

import QJ.Q;
import XH.C16807N;
import XH.y;
import YE.C13868b;
import YE.e;
import android.net.Uri;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.asset.VideoAssetRepositoryImpl$get$2$1", f = "VideoAssetRepository.kt", l = {189}, m = "invokeSuspend")
final class VideoAssetRepositoryImpl$get$2$1 extends l implements p<Q, C17164e<? super C16807N>, Object> {
    final /* synthetic */ VideoAsset $asset;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ VideoAssetRepositoryImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoAssetRepositoryImpl$get$2$1(VideoAssetRepositoryImpl videoAssetRepositoryImpl, VideoAsset videoAsset, C17164e<? super VideoAssetRepositoryImpl$get$2$1> eVar) {
        super(2, eVar);
        this.this$0 = videoAssetRepositoryImpl;
        this.$asset = videoAsset;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new VideoAssetRepositoryImpl$get$2$1(this.this$0, this.$asset, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
        return ((VideoAssetRepositoryImpl$get$2$1) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        VideoAssetRepositoryImpl videoAssetRepositoryImpl;
        VideoAsset videoAsset;
        Object f10 = C17187b.f();
        int i10 = this.label;
        if (i10 == 0) {
            y.b(obj);
            videoAssetRepositoryImpl = this.this$0;
            VideoAsset videoAsset2 = this.$asset;
            VideoAssetCache access$getVideoAssetCache$p = videoAssetRepositoryImpl.videoAssetCache;
            VideoAsset videoAsset3 = this.$asset;
            this.L$0 = videoAssetRepositoryImpl;
            this.L$1 = videoAsset2;
            this.label = 1;
            Object cacheAsset = access$getVideoAssetCache$p.cacheAsset(videoAsset3, this);
            if (cacheAsset == f10) {
                return f10;
            }
            videoAsset = videoAsset2;
            obj = cacheAsset;
        } else if (i10 == 1) {
            videoAsset = (VideoAsset) this.L$1;
            videoAssetRepositoryImpl = (VideoAssetRepositoryImpl) this.L$0;
            try {
                y.b(obj);
            } catch (Exception e10) {
                C13868b bVar = C13868b.f118106a;
                VideoAsset videoAsset4 = this.$asset;
                String message = e10.getMessage();
                bVar.b("error " + videoAsset4 + " " + message, e.Asset);
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        videoAssetRepositoryImpl.updateMap(videoAsset, (Uri) obj);
        return C16807N.f139792a;
    }
}
