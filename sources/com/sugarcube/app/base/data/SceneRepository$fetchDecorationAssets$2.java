package com.sugarcube.app.base.data;

import QJ.Q;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.net.Uri;
import android.util.Log;
import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.core.logger.AnyKt;
import com.sugarcube.core.network.models.Manifest;
import dI.C17164e;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import nI.p;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQJ/Q;", "", "Lcom/sugarcube/app/base/data/AssetItem;", "<anonymous>", "(LQJ/Q;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
@f(c = "com.sugarcube.app.base.data.SceneRepository$fetchDecorationAssets$2", f = "SceneRepository.kt", l = {}, m = "invokeSuspend")
final class SceneRepository$fetchDecorationAssets$2 extends l implements p<Q, C17164e<? super List<AssetItem>>, Object> {
    final /* synthetic */ Scene $scene;
    int label;
    final /* synthetic */ SceneRepository this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SceneRepository$fetchDecorationAssets$2(Scene scene, SceneRepository sceneRepository, C17164e<? super SceneRepository$fetchDecorationAssets$2> eVar) {
        super(2, eVar);
        this.$scene = scene;
        this.this$0 = sceneRepository;
    }

    public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
        return new SceneRepository$fetchDecorationAssets$2(this.$scene, this.this$0, eVar);
    }

    public final Object invoke(Q q10, C17164e<? super List<AssetItem>> eVar) {
        return ((SceneRepository$fetchDecorationAssets$2) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
    }

    public final Object invokeSuspend(Object obj) {
        AssetItem value;
        int responseCode;
        C17187b.f();
        if (this.label == 0) {
            y.b(obj);
            UUID sceneUuid = this.$scene.getSceneUuid();
            Log.d(AnyKt.SUGARCUBE_TAG, "fetchDecorationAssets " + sceneUuid);
            ArrayList arrayList = new ArrayList();
            AssetCache access$getAssetCacheForScene = this.this$0.getAssetCacheForScene(this.$scene.getSceneUuid(), this.$scene.getJobId());
            Uri glbUrl = this.$scene.getGlbUrl();
            List<Uri> list = null;
            List<Uri> e10 = glbUrl != null ? C16877v.e(glbUrl) : null;
            Manifest manifest = this.$scene.getManifest();
            if (manifest != null) {
                list = manifest.getAllValidUris();
            }
            if (e10 == null) {
                e10 = list == null ? C16877v.n() : list;
            }
            synchronized (access$getAssetCacheForScene) {
                try {
                    for (Uri put : e10) {
                        value = access$getAssetCacheForScene.put(put).getValue();
                        if (value != null) {
                            Uri uri = value.getUri();
                            Log.d(AnyKt.SUGARCUBE_TAG, "fetchDecorationAssets fetch " + uri);
                            value.fetch();
                            arrayList.add(value);
                            if (value.getDownloadTimeMS() > 0 && 200 <= (responseCode = value.getResponseCode()) && responseCode < 300) {
                                value.getDownloadTimeMS();
                                value.getFile().length();
                            }
                        }
                    }
                    C16807N n10 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            UUID sceneUuid2 = this.$scene.getSceneUuid();
            int size = arrayList.size();
            int size2 = e10.size();
            Log.d(AnyKt.SUGARCUBE_TAG, "fetchDecorationAssets " + sceneUuid2 + " loaded " + size + "/" + size2);
            return arrayList;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
