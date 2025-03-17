package com.sugarcube.app.base.data.database;

import YH.C16877v;
import android.net.Uri;
import com.sugarcube.app.base.data.database.SceneState;
import com.sugarcube.core.network.models.GlbUrls;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.MultiviewThumbnail;
import com.sugarcube.core.network.models.RoomType;
import com.sugarcube.core.network.models.SceneResponse;
import com.sugarcube.core.network.models.SceneResponseJobState;
import com.sugarcube.core.network.models.SceneResponseState;
import java.time.Instant;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006*&\u0010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001¨\u0006\u0007"}, d2 = {"CachedCombinableMap", "", "", "Lcom/sugarcube/app/base/data/database/CachedCatalogItem;", "asDomain", "Lcom/sugarcube/app/base/data/database/Scene;", "Lcom/sugarcube/core/network/models/SceneResponse;", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ModelsKt {
    public static final Scene asDomain(SceneResponse sceneResponse) {
        Uri uri;
        RoomType roomType;
        C17542s.j(sceneResponse, "<this>");
        int sceneId = sceneResponse.getSceneId();
        UUID sceneUuid = sceneResponse.getSceneUuid();
        UUID sceneUuid2 = sceneResponse.getSceneUuid();
        String name = sceneResponse.getName();
        Instant createdAt = sceneResponse.getCreatedAt();
        Instant lastModifiedTs = sceneResponse.getLastModifiedTs();
        SceneState.Companion companion = SceneState.Companion;
        SceneResponseState state = sceneResponse.state();
        SceneResponseJobState jobState = sceneResponse.jobState();
        Manifest manifest = sceneResponse.getManifest();
        boolean z10 = false;
        if (manifest != null && manifest.isPreviewable()) {
            z10 = true;
        }
        SceneState fromSceneResponseState = companion.fromSceneResponseState(state, jobState, z10);
        int compositionCount = sceneResponse.getCompositionCount();
        Manifest manifest2 = sceneResponse.getManifest();
        GlbUrls glbUrls = sceneResponse.getGlbUrls();
        Uri complete = glbUrls != null ? glbUrls.getComplete() : null;
        List<MultiviewThumbnail> viewports = sceneResponse.getViewports();
        boolean isStock = sceneResponse.isStock();
        Manifest manifest3 = sceneResponse.getManifest();
        if (manifest3 == null || (uri = manifest3.getPano()) == null) {
            uri = Uri.EMPTY;
        }
        Uri uri2 = uri;
        C17542s.g(uri2);
        List e10 = C16877v.e(new Media("pano", uri2, MediaType.THUMBNAIL, 0, 0));
        List n10 = C16877v.n();
        Instant estimatedFinishTs = sceneResponse.getEstimatedFinishTs();
        UUID upload = sceneResponse.getUpload();
        int wid = sceneResponse.getWid();
        String roomType2 = sceneResponse.getRoomType();
        if (roomType2 != null) {
            RoomType.Companion companion2 = RoomType.Companion;
            String lowerCase = roomType2.toLowerCase(Locale.ROOT);
            C17542s.i(lowerCase, "toLowerCase(...)");
            roomType = companion2.getTypeFromKey(lowerCase);
        } else {
            roomType = null;
        }
        return new Scene(sceneId, sceneUuid, sceneUuid2, name, createdAt, lastModifiedTs, fromSceneResponseState, compositionCount, (UUID) null, false, manifest2, complete, viewports, isStock, e10, n10, estimatedFinishTs, upload, wid, roomType, sceneResponse.getJobId(), sceneResponse.getPipelineType());
    }
}
