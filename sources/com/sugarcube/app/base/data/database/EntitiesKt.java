package com.sugarcube.app.base.data.database;

import YH.C16877v;
import android.net.Uri;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.core.network.models.Manifest;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0016\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u0003¨\u0006\u0004"}, d2 = {"asDomainModel", "Lcom/sugarcube/app/base/data/database/Scene;", "Lcom/sugarcube/app/base/data/database/DatabaseSceneWithEntities;", "", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class EntitiesKt {
    public static final Scene asDomainModel(DatabaseSceneWithEntities databaseSceneWithEntities) {
        C17542s.j(databaseSceneWithEntities, "<this>");
        Iterable<DatabaseMedia> medias = databaseSceneWithEntities.getMedias();
        ArrayList arrayList = new ArrayList(C16877v.y(medias, 10));
        for (DatabaseMedia databaseMedia : medias) {
            arrayList.add(new Media(databaseMedia.getName(), databaseMedia.getUri(), databaseMedia.getType(), databaseMedia.getWidth(), databaseMedia.getHeight()));
        }
        Iterable<DatabaseMetadata> metadatas = databaseSceneWithEntities.getMetadatas();
        ArrayList arrayList2 = new ArrayList(C16877v.y(metadatas, 10));
        for (DatabaseMetadata databaseMetadata : metadatas) {
            arrayList2.add(new Metadata(databaseMetadata.getName(), databaseMetadata.getUri()));
        }
        int sceneId = databaseSceneWithEntities.getScene().getSceneId();
        UUID uuid = databaseSceneWithEntities.getScene().getUuid();
        UUID sceneUuid = databaseSceneWithEntities.getScene().getSceneUuid();
        String name = databaseSceneWithEntities.getScene().getName();
        Instant createdTs = databaseSceneWithEntities.getScene().getCreatedTs();
        Instant lastModifiedTs = databaseSceneWithEntities.getScene().getLastModifiedTs();
        SceneState state = databaseSceneWithEntities.getScene().getState();
        int compositionCount = databaseSceneWithEntities.getScene().getCompositionCount();
        UUID uploadWorkerId = databaseSceneWithEntities.getScene().getUploadWorkerId();
        boolean userAcknowledged = databaseSceneWithEntities.getScene().getUserAcknowledged();
        Manifest manifest = databaseSceneWithEntities.getScene().getManifest();
        String glbUrl = databaseSceneWithEntities.getScene().getGlbUrl();
        ArrayList arrayList3 = arrayList2;
        return new Scene(sceneId, uuid, sceneUuid, name, createdTs, lastModifiedTs, state, compositionCount, uploadWorkerId, userAcknowledged, manifest, glbUrl != null ? Uri.parse(glbUrl) : null, C16877v.n(), databaseSceneWithEntities.getScene().isStock(), arrayList, arrayList3, databaseSceneWithEntities.getScene().getEstimatedFinishTs(), (UUID) null, 0, databaseSceneWithEntities.getScene().getRoomType(), databaseSceneWithEntities.getScene().getJobId(), databaseSceneWithEntities.getScene().getPipelineType(), ImageMetadata.HOT_PIXEL_MODE, (DefaultConstructorMarker) null);
    }

    public static final List<Scene> asDomainModel(List<DatabaseSceneWithEntities> list) {
        C17542s.j(list, "<this>");
        Iterable<DatabaseSceneWithEntities> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (DatabaseSceneWithEntities asDomainModel : iterable) {
            arrayList.add(asDomainModel(asDomainModel));
        }
        return arrayList;
    }
}
