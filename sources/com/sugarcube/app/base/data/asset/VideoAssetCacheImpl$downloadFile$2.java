package com.sugarcube.app.base.data.asset;

import GK.C15774B;
import GK.C15776D;
import HJ.C15854t;
import QJ.Q;
import XH.C16807N;
import XH.t;
import XH.y;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.sugarcube.core.logger.Priority;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LGK/D;", "<anonymous>", "(LQJ/Q;)LGK/D;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.asset.VideoAssetCacheImpl$downloadFile$2", f = "VideoAssetRepository.kt", l = {}, m = "invokeSuspend")
final class VideoAssetCacheImpl$downloadFile$2 extends l implements p<Q, C17164e<? super C15776D>, Object> {
    final /* synthetic */ VideoAsset $asset;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ VideoAssetCacheImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VideoAssetCacheImpl$downloadFile$2(VideoAssetCacheImpl videoAssetCacheImpl, VideoAsset videoAsset, C17164e<? super VideoAssetCacheImpl$downloadFile$2> eVar) {
        super(2, eVar);
        this.this$0 = videoAssetCacheImpl;
        this.$asset = videoAsset;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        VideoAssetCacheImpl$downloadFile$2 videoAssetCacheImpl$downloadFile$2 = new VideoAssetCacheImpl$downloadFile$2(this.this$0, this.$asset, eVar);
        videoAssetCacheImpl$downloadFile$2.L$0 = obj;
        return videoAssetCacheImpl$downloadFile$2;
    }

    public final Object invoke(Q q10, C17164e<? super C15776D> eVar) {
        return ((VideoAssetCacheImpl$downloadFile$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        C17187b.f();
        if (this.label == 0) {
            y.b(obj);
            Q q10 = (Q) this.L$0;
            Uri downloadUri = this.this$0.getDownloadUri(this.$asset);
            Priority priority = Priority.INFO;
            String str = "request " + downloadUri;
            if (str == null) {
                str = "";
            }
            int i10 = VideoAssetCacheImpl$downloadFile$2$invokeSuspend$$inlined$logInfo$default$1$wm$DslKt$WhenMappings.$EnumSwitchMapping$0[priority.ordinal()];
            if (i10 == 1) {
                String name = q10.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                Log.v(name, str + " " + "");
            } else if (i10 == 2) {
                String name2 = q10.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                Log.d(name2, str + " " + "");
            } else if (i10 == 3) {
                String name3 = q10.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                Log.i(name3, str + " " + "");
            } else if (i10 == 4) {
                String name4 = q10.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                Log.w(name4, str + " " + "");
            } else if (i10 == 5) {
                String name5 = q10.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                Log.e(name5, str + " " + "");
            } else {
                throw new t();
            }
            C15774B.a aVar = new C15774B.a();
            String uri = downloadUri.toString();
            C17542s.i(uri, "toString(...)");
            return FirebasePerfOkHttpClient.execute(this.this$0.okHttpClient.b(aVar.n(uri).b()));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
