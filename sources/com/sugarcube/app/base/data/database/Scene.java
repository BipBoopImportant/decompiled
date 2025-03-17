package com.sugarcube.app.base.data.database;

import HJ.C15854t;
import XH.C16796C;
import XH.v;
import YH.X;
import YH.g0;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.network.models.UploadKt;
import com.sugarcube.core.analytics.Trackable;
import com.sugarcube.core.analytics.TrackingKey;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.MultiviewThumbnail;
import com.sugarcube.core.network.models.RoomType;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import tI.C17978n;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bM\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001Bå\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0011\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b%\u0010&J\u0012\u0010d\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010e\u001a\u00020\u0011J\u0006\u0010f\u001a\u00020\u0003J\u0006\u0010g\u001a\u00020\u0011J\u0006\u0010h\u001a\u00020\u0011J\u0006\u0010i\u001a\u00020\u0011J\u0006\u0010j\u001a\u00020\u0011J\u0006\u0010k\u001a\u00020\u0011J\u0006\u0010l\u001a\u00020\u0011J\u0006\u0010m\u001a\u00020\u0011J\u0006\u0010n\u001a\u00020\u0011J$\u0010o\u001a\u001e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\b0pj\u000e\u0012\u0004\u0012\u00020q\u0012\u0004\u0012\u00020\b`rH\u0016J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0005HÆ\u0003J\t\u0010u\u001a\u00020\u0005HÆ\u0003J\t\u0010v\u001a\u00020\bHÆ\u0003J\t\u0010w\u001a\u00020\nHÆ\u0003J\t\u0010x\u001a\u00020\nHÆ\u0003J\t\u0010y\u001a\u00020\rHÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010|\u001a\u00020\u0011HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\u000f\u0010\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0011HÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017HÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\nHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00112\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00172\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00172\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010 \u001a\u00020\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0016\u0010\u0001\u001a\u00020\u00112\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0001\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001a\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001a\u0010\u000b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00106\"\u0004\b:\u00108R\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010(\"\u0004\b@\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bA\u0010,R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\bB\u0010CR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001a\u0010\u0019\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010C\"\u0004\bL\u0010MR\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017¢\u0006\b\n\u0000\u001a\u0004\bN\u0010IR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0017¢\u0006\b\n\u0000\u001a\u0004\bO\u0010IR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u00106\"\u0004\bQ\u00108R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010,\"\u0004\bS\u0010.R\u001a\u0010 \u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010(\"\u0004\bU\u0010*R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010,\"\u0004\b[\u0010.R\u001c\u0010$\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00102\"\u0004\b]\u00104R\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017¢\u0006\b\n\u0000\u001a\u0004\b_\u0010IR\u0014\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0017X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010b\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\bc\u0010C¨\u0006\u0001"}, d2 = {"Lcom/sugarcube/app/base/data/database/Scene;", "Lcom/sugarcube/core/analytics/Trackable;", "sceneId", "", "uuid", "Ljava/util/UUID;", "sceneUuid", "name", "", "createdTs", "Ljava/time/Instant;", "lastModifiedTs", "state", "Lcom/sugarcube/app/base/data/database/SceneState;", "compositionCount", "workerId", "userAcknowledged", "", "manifest", "Lcom/sugarcube/core/network/models/Manifest;", "glbUrl", "Landroid/net/Uri;", "viewports", "", "Lcom/sugarcube/core/network/models/MultiviewThumbnail;", "isStock", "medias", "Lcom/sugarcube/app/base/data/database/Media;", "metadatas", "Lcom/sugarcube/app/base/data/database/Metadata;", "estimatedFinishTs", "upload", "wid", "roomType", "Lcom/sugarcube/core/network/models/RoomType;", "jobId", "pipelineType", "<init>", "(ILjava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Lcom/sugarcube/app/base/data/database/SceneState;ILjava/util/UUID;ZLcom/sugarcube/core/network/models/Manifest;Landroid/net/Uri;Ljava/util/List;ZLjava/util/List;Ljava/util/List;Ljava/time/Instant;Ljava/util/UUID;ILcom/sugarcube/core/network/models/RoomType;Ljava/util/UUID;Ljava/lang/String;)V", "getSceneId", "()I", "setSceneId", "(I)V", "getUuid", "()Ljava/util/UUID;", "setUuid", "(Ljava/util/UUID;)V", "getSceneUuid", "setSceneUuid", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCreatedTs", "()Ljava/time/Instant;", "setCreatedTs", "(Ljava/time/Instant;)V", "getLastModifiedTs", "setLastModifiedTs", "getState", "()Lcom/sugarcube/app/base/data/database/SceneState;", "setState", "(Lcom/sugarcube/app/base/data/database/SceneState;)V", "getCompositionCount", "setCompositionCount", "getWorkerId", "getUserAcknowledged", "()Z", "getManifest", "()Lcom/sugarcube/core/network/models/Manifest;", "getGlbUrl", "()Landroid/net/Uri;", "getViewports", "()Ljava/util/List;", "setViewports", "(Ljava/util/List;)V", "setStock", "(Z)V", "getMedias", "getMetadatas", "getEstimatedFinishTs", "setEstimatedFinishTs", "getUpload", "setUpload", "getWid", "setWid", "getRoomType", "()Lcom/sugarcube/core/network/models/RoomType;", "setRoomType", "(Lcom/sugarcube/core/network/models/RoomType;)V", "getJobId", "setJobId", "getPipelineType", "setPipelineType", "images", "getImages", "thumbnails", "mosaic", "hasGltf", "getHasGltf", "getImage", "highRes", "getRemainingProcessingTime", "isNew", "isUploading", "isProcessing", "isSuccessful", "isFailed", "isFailedUpload", "isDone", "isHela", "getValues", "Ljava/util/HashMap;", "Lcom/sugarcube/core/analytics/TrackingKey;", "Lkotlin/collections/HashMap;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "other", "", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Scene implements Trackable {
    public static final int $stable = 8;
    private int compositionCount;
    private Instant createdTs;
    private Instant estimatedFinishTs;
    private final Uri glbUrl;
    private final List<Media> images;
    private boolean isStock;
    private UUID jobId;
    private Instant lastModifiedTs;
    private final Manifest manifest;
    private final List<Media> medias;
    private final List<Metadata> metadatas;
    private final List<Media> mosaic;
    private String name;
    private String pipelineType;
    private RoomType roomType;
    private int sceneId;
    private UUID sceneUuid;
    private SceneState state;
    private final List<Media> thumbnails;
    private UUID upload;
    private final boolean userAcknowledged;
    private UUID uuid;
    private List<MultiviewThumbnail> viewports;
    private int wid;
    private final UUID workerId;

    public Scene(int i10, UUID uuid2, UUID uuid3, String str, Instant instant, Instant instant2, SceneState sceneState, int i11, UUID uuid4, boolean z10, Manifest manifest2, Uri uri, List<MultiviewThumbnail> list, boolean z11, List<Media> list2, List<Metadata> list3, Instant instant3, UUID uuid5, int i12, RoomType roomType2, UUID uuid6, String str2) {
        Instant instant4 = instant;
        Instant instant5 = instant2;
        SceneState sceneState2 = sceneState;
        List<MultiviewThumbnail> list4 = list;
        List<Media> list5 = list2;
        List<Metadata> list6 = list3;
        C17542s.j(uuid2, "uuid");
        C17542s.j(uuid3, "sceneUuid");
        C17542s.j(str, "name");
        C17542s.j(instant4, "createdTs");
        C17542s.j(instant5, "lastModifiedTs");
        C17542s.j(sceneState2, "state");
        C17542s.j(list4, "viewports");
        C17542s.j(list5, "medias");
        C17542s.j(list6, "metadatas");
        this.sceneId = i10;
        this.uuid = uuid2;
        this.sceneUuid = uuid3;
        this.name = str;
        this.createdTs = instant4;
        this.lastModifiedTs = instant5;
        this.state = sceneState2;
        this.compositionCount = i11;
        this.workerId = uuid4;
        this.userAcknowledged = z10;
        this.manifest = manifest2;
        this.glbUrl = uri;
        this.viewports = list4;
        this.isStock = z11;
        this.medias = list5;
        this.metadatas = list6;
        this.estimatedFinishTs = instant3;
        this.upload = uuid5;
        this.wid = i12;
        this.roomType = roomType2;
        this.jobId = uuid6;
        this.pipelineType = str2;
        ArrayList arrayList = new ArrayList();
        for (Object next : list5) {
            if (((Media) next).getType() == MediaType.IMAGE) {
                arrayList.add(next);
            }
        }
        this.images = arrayList;
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : this.medias) {
            if (((Media) next2).getType() == MediaType.THUMBNAIL) {
                arrayList2.add(next2);
            }
        }
        this.thumbnails = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : this.medias) {
            if (((Media) next3).getType() == MediaType.MOSAIC) {
                arrayList3.add(next3);
            }
        }
        this.mosaic = arrayList3;
    }

    public static /* synthetic */ Scene copy$default(Scene scene, int i10, UUID uuid2, UUID uuid3, String str, Instant instant, Instant instant2, SceneState sceneState, int i11, UUID uuid4, boolean z10, Manifest manifest2, Uri uri, List list, boolean z11, List list2, List list3, Instant instant3, UUID uuid5, int i12, RoomType roomType2, UUID uuid6, String str2, int i13, Object obj) {
        Scene scene2 = scene;
        int i14 = i13;
        return scene.copy((i14 & 1) != 0 ? scene2.sceneId : i10, (i14 & 2) != 0 ? scene2.uuid : uuid2, (i14 & 4) != 0 ? scene2.sceneUuid : uuid3, (i14 & 8) != 0 ? scene2.name : str, (i14 & 16) != 0 ? scene2.createdTs : instant, (i14 & 32) != 0 ? scene2.lastModifiedTs : instant2, (i14 & 64) != 0 ? scene2.state : sceneState, (i14 & 128) != 0 ? scene2.compositionCount : i11, (i14 & 256) != 0 ? scene2.workerId : uuid4, (i14 & 512) != 0 ? scene2.userAcknowledged : z10, (i14 & 1024) != 0 ? scene2.manifest : manifest2, (i14 & RecyclerView.n.FLAG_MOVED) != 0 ? scene2.glbUrl : uri, (i14 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? scene2.viewports : list, (i14 & 8192) != 0 ? scene2.isStock : z11, (i14 & 16384) != 0 ? scene2.medias : list2, (i14 & 32768) != 0 ? scene2.metadatas : list3, (i14 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? scene2.estimatedFinishTs : instant3, (i14 & 131072) != 0 ? scene2.upload : uuid5, (i14 & 262144) != 0 ? scene2.wid : i12, (i14 & ImageMetadata.LENS_APERTURE) != 0 ? scene2.roomType : roomType2, (i14 & ImageMetadata.SHADING_MODE) != 0 ? scene2.jobId : uuid6, (i14 & UploadKt.MAX_CHUNK_SIZE) != 0 ? scene2.pipelineType : str2);
    }

    public static /* synthetic */ Uri getImage$default(Scene scene, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return scene.getImage(z10);
    }

    public final int component1() {
        return this.sceneId;
    }

    public final boolean component10() {
        return this.userAcknowledged;
    }

    public final Manifest component11() {
        return this.manifest;
    }

    public final Uri component12() {
        return this.glbUrl;
    }

    public final List<MultiviewThumbnail> component13() {
        return this.viewports;
    }

    public final boolean component14() {
        return this.isStock;
    }

    public final List<Media> component15() {
        return this.medias;
    }

    public final List<Metadata> component16() {
        return this.metadatas;
    }

    public final Instant component17() {
        return this.estimatedFinishTs;
    }

    public final UUID component18() {
        return this.upload;
    }

    public final int component19() {
        return this.wid;
    }

    public final UUID component2() {
        return this.uuid;
    }

    public final RoomType component20() {
        return this.roomType;
    }

    public final UUID component21() {
        return this.jobId;
    }

    public final String component22() {
        return this.pipelineType;
    }

    public final UUID component3() {
        return this.sceneUuid;
    }

    public final String component4() {
        return this.name;
    }

    public final Instant component5() {
        return this.createdTs;
    }

    public final Instant component6() {
        return this.lastModifiedTs;
    }

    public final SceneState component7() {
        return this.state;
    }

    public final int component8() {
        return this.compositionCount;
    }

    public final UUID component9() {
        return this.workerId;
    }

    public final Scene copy(int i10, UUID uuid2, UUID uuid3, String str, Instant instant, Instant instant2, SceneState sceneState, int i11, UUID uuid4, boolean z10, Manifest manifest2, Uri uri, List<MultiviewThumbnail> list, boolean z11, List<Media> list2, List<Metadata> list3, Instant instant3, UUID uuid5, int i12, RoomType roomType2, UUID uuid6, String str2) {
        int i13 = i10;
        C17542s.j(uuid2, "uuid");
        C17542s.j(uuid3, "sceneUuid");
        C17542s.j(str, "name");
        C17542s.j(instant, "createdTs");
        C17542s.j(instant2, "lastModifiedTs");
        C17542s.j(sceneState, "state");
        C17542s.j(list, "viewports");
        C17542s.j(list2, "medias");
        C17542s.j(list3, "metadatas");
        return new Scene(i10, uuid2, uuid3, str, instant, instant2, sceneState, i11, uuid4, z10, manifest2, uri, list, z11, list2, list3, instant3, uuid5, i12, roomType2, uuid6, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scene)) {
            return false;
        }
        Scene scene = (Scene) obj;
        return this.sceneId == scene.sceneId && C17542s.e(this.uuid, scene.uuid) && C17542s.e(this.sceneUuid, scene.sceneUuid) && C17542s.e(this.name, scene.name) && C17542s.e(this.createdTs, scene.createdTs) && C17542s.e(this.lastModifiedTs, scene.lastModifiedTs) && this.state == scene.state && this.compositionCount == scene.compositionCount && C17542s.e(this.workerId, scene.workerId) && this.userAcknowledged == scene.userAcknowledged && C17542s.e(this.manifest, scene.manifest) && C17542s.e(this.glbUrl, scene.glbUrl) && C17542s.e(this.viewports, scene.viewports) && this.isStock == scene.isStock && C17542s.e(this.medias, scene.medias) && C17542s.e(this.metadatas, scene.metadatas) && C17542s.e(this.estimatedFinishTs, scene.estimatedFinishTs) && C17542s.e(this.upload, scene.upload) && this.wid == scene.wid && this.roomType == scene.roomType && C17542s.e(this.jobId, scene.jobId) && C17542s.e(this.pipelineType, scene.pipelineType);
    }

    public final int getCompositionCount() {
        return this.compositionCount;
    }

    public final Instant getCreatedTs() {
        return this.createdTs;
    }

    public final Instant getEstimatedFinishTs() {
        return this.estimatedFinishTs;
    }

    public final Uri getGlbUrl() {
        return this.glbUrl;
    }

    public final boolean getHasGltf() {
        Uri uri = this.glbUrl;
        return uri != null && !C17542s.e(uri, Uri.EMPTY);
    }

    public final Uri getImage(boolean z10) {
        Manifest manifest2;
        Uri pano;
        if (z10 && (manifest2 = this.manifest) != null && (pano = manifest2.getPano()) != null && !pano.equals(Uri.EMPTY)) {
            return this.manifest.getPano();
        }
        if (!this.thumbnails.isEmpty()) {
            return this.thumbnails.get(0).getUri();
        }
        if (!this.mosaic.isEmpty()) {
            return this.mosaic.get(0).getUri();
        }
        return null;
    }

    public final List<Media> getImages() {
        return this.images;
    }

    public final UUID getJobId() {
        return this.jobId;
    }

    public final Instant getLastModifiedTs() {
        return this.lastModifiedTs;
    }

    public final Manifest getManifest() {
        return this.manifest;
    }

    public final List<Media> getMedias() {
        return this.medias;
    }

    public final List<Metadata> getMetadatas() {
        return this.metadatas;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPipelineType() {
        return this.pipelineType;
    }

    public final int getRemainingProcessingTime() {
        if (this.estimatedFinishTs != null) {
            return C17978n.e((int) Instant.now().until(this.estimatedFinishTs, ChronoUnit.MINUTES), 1);
        }
        return 8;
    }

    public final RoomType getRoomType() {
        return this.roomType;
    }

    public final int getSceneId() {
        return this.sceneId;
    }

    public final UUID getSceneUuid() {
        return this.sceneUuid;
    }

    public final SceneState getState() {
        return this.state;
    }

    public final UUID getUpload() {
        return this.upload;
    }

    public final boolean getUserAcknowledged() {
        return this.userAcknowledged;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public HashMap<TrackingKey, String> getValues() {
        String str;
        String uuid2;
        v a10 = C16796C.a(TrackingKey.CaptureId, this.uuid.toString());
        v a11 = C16796C.a(TrackingKey.RoomId, String.valueOf(this.sceneId));
        v a12 = C16796C.a(TrackingKey.RoomUUID, this.uuid.toString());
        v a13 = C16796C.a(TrackingKey.RoomName, this.name);
        TrackingKey trackingKey = TrackingKey.RoomType;
        RoomType roomType2 = this.roomType;
        String str2 = "";
        if (roomType2 == null || (str = roomType2.name()) == null) {
            str = str2;
        }
        v a14 = C16796C.a(trackingKey, str);
        v a15 = C16796C.a(TrackingKey.UploadState, this.state.name());
        TrackingKey trackingKey2 = TrackingKey.UploadUUID;
        UUID uuid3 = this.upload;
        if (!(uuid3 == null || (uuid2 = uuid3.toString()) == null)) {
            str2 = uuid2;
        }
        return X.l(a10, a11, a12, a13, a14, a15, C16796C.a(trackingKey2, str2));
    }

    public final List<MultiviewThumbnail> getViewports() {
        return this.viewports;
    }

    public final int getWid() {
        return this.wid;
    }

    public final UUID getWorkerId() {
        return this.workerId;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((Integer.hashCode(this.sceneId) * 31) + this.uuid.hashCode()) * 31) + this.sceneUuid.hashCode()) * 31) + this.name.hashCode()) * 31) + this.createdTs.hashCode()) * 31) + this.lastModifiedTs.hashCode()) * 31) + this.state.hashCode()) * 31) + Integer.hashCode(this.compositionCount)) * 31;
        UUID uuid2 = this.workerId;
        int i10 = 0;
        int hashCode2 = (((hashCode + (uuid2 == null ? 0 : uuid2.hashCode())) * 31) + Boolean.hashCode(this.userAcknowledged)) * 31;
        Manifest manifest2 = this.manifest;
        int hashCode3 = (hashCode2 + (manifest2 == null ? 0 : manifest2.hashCode())) * 31;
        Uri uri = this.glbUrl;
        int hashCode4 = (((((((((hashCode3 + (uri == null ? 0 : uri.hashCode())) * 31) + this.viewports.hashCode()) * 31) + Boolean.hashCode(this.isStock)) * 31) + this.medias.hashCode()) * 31) + this.metadatas.hashCode()) * 31;
        Instant instant = this.estimatedFinishTs;
        int hashCode5 = (hashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
        UUID uuid3 = this.upload;
        int hashCode6 = (((hashCode5 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31) + Integer.hashCode(this.wid)) * 31;
        RoomType roomType2 = this.roomType;
        int hashCode7 = (hashCode6 + (roomType2 == null ? 0 : roomType2.hashCode())) * 31;
        UUID uuid4 = this.jobId;
        int hashCode8 = (hashCode7 + (uuid4 == null ? 0 : uuid4.hashCode())) * 31;
        String str = this.pipelineType;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode8 + i10;
    }

    public final boolean isDone() {
        return isFailed() || isSuccessful();
    }

    public final boolean isFailed() {
        return g0.c(SceneState.FAILURE).contains(this.state);
    }

    public final boolean isFailedUpload() {
        return g0.h(SceneState.UPLOAD_FAILED, SceneState.NEW_FAILED).contains(this.state);
    }

    public final boolean isHela() {
        String str = this.pipelineType;
        return str != null && C15854t.U(str, "DOLL", true);
    }

    public final boolean isNew() {
        return g0.h(SceneState.NEW, SceneState.UPLOAD_PENDING).contains(this.state);
    }

    public final boolean isProcessing() {
        return g0.h(SceneState.UPLOADED, SceneState.SCHEDULED, SceneState.PROCESSING, SceneState.PREVIEW).contains(this.state);
    }

    public final boolean isStock() {
        return this.isStock;
    }

    public final boolean isSuccessful() {
        return g0.c(SceneState.SUCCESS).contains(this.state);
    }

    public final boolean isUploading() {
        return g0.c(SceneState.UPLOADING).contains(this.state);
    }

    public final void setCompositionCount(int i10) {
        this.compositionCount = i10;
    }

    public final void setCreatedTs(Instant instant) {
        C17542s.j(instant, "<set-?>");
        this.createdTs = instant;
    }

    public final void setEstimatedFinishTs(Instant instant) {
        this.estimatedFinishTs = instant;
    }

    public final void setJobId(UUID uuid2) {
        this.jobId = uuid2;
    }

    public final void setLastModifiedTs(Instant instant) {
        C17542s.j(instant, "<set-?>");
        this.lastModifiedTs = instant;
    }

    public final void setName(String str) {
        C17542s.j(str, "<set-?>");
        this.name = str;
    }

    public final void setPipelineType(String str) {
        this.pipelineType = str;
    }

    public final void setRoomType(RoomType roomType2) {
        this.roomType = roomType2;
    }

    public final void setSceneId(int i10) {
        this.sceneId = i10;
    }

    public final void setSceneUuid(UUID uuid2) {
        C17542s.j(uuid2, "<set-?>");
        this.sceneUuid = uuid2;
    }

    public final void setState(SceneState sceneState) {
        C17542s.j(sceneState, "<set-?>");
        this.state = sceneState;
    }

    public final void setStock(boolean z10) {
        this.isStock = z10;
    }

    public final void setUpload(UUID uuid2) {
        this.upload = uuid2;
    }

    public final void setUuid(UUID uuid2) {
        C17542s.j(uuid2, "<set-?>");
        this.uuid = uuid2;
    }

    public final void setViewports(List<MultiviewThumbnail> list) {
        C17542s.j(list, "<set-?>");
        this.viewports = list;
    }

    public final void setWid(int i10) {
        this.wid = i10;
    }

    public String toString() {
        int i10 = this.sceneId;
        UUID uuid2 = this.uuid;
        UUID uuid3 = this.sceneUuid;
        String str = this.name;
        Instant instant = this.createdTs;
        Instant instant2 = this.lastModifiedTs;
        SceneState sceneState = this.state;
        int i11 = this.compositionCount;
        UUID uuid4 = this.workerId;
        boolean z10 = this.userAcknowledged;
        Manifest manifest2 = this.manifest;
        Uri uri = this.glbUrl;
        List<MultiviewThumbnail> list = this.viewports;
        boolean z11 = this.isStock;
        List<Media> list2 = this.medias;
        List<Metadata> list3 = this.metadatas;
        Instant instant3 = this.estimatedFinishTs;
        UUID uuid5 = this.upload;
        int i12 = this.wid;
        RoomType roomType2 = this.roomType;
        UUID uuid6 = this.jobId;
        String str2 = this.pipelineType;
        return "Scene(sceneId=" + i10 + ", uuid=" + uuid2 + ", sceneUuid=" + uuid3 + ", name=" + str + ", createdTs=" + instant + ", lastModifiedTs=" + instant2 + ", state=" + sceneState + ", compositionCount=" + i11 + ", workerId=" + uuid4 + ", userAcknowledged=" + z10 + ", manifest=" + manifest2 + ", glbUrl=" + uri + ", viewports=" + list + ", isStock=" + z11 + ", medias=" + list2 + ", metadatas=" + list3 + ", estimatedFinishTs=" + instant3 + ", upload=" + uuid5 + ", wid=" + i12 + ", roomType=" + roomType2 + ", jobId=" + uuid6 + ", pipelineType=" + str2 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Scene(int r26, java.util.UUID r27, java.util.UUID r28, java.lang.String r29, java.time.Instant r30, java.time.Instant r31, com.sugarcube.app.base.data.database.SceneState r32, int r33, java.util.UUID r34, boolean r35, com.sugarcube.core.network.models.Manifest r36, android.net.Uri r37, java.util.List r38, boolean r39, java.util.List r40, java.util.List r41, java.time.Instant r42, java.util.UUID r43, int r44, com.sugarcube.core.network.models.RoomType r45, java.util.UUID r46, java.lang.String r47, int r48, kotlin.jvm.internal.DefaultConstructorMarker r49) {
        /*
            r25 = this;
            r0 = r48
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x000c
            java.util.List r1 = YH.C16877v.n()
            r15 = r1
            goto L_0x000e
        L_0x000c:
            r15 = r38
        L_0x000e:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            r2 = 0
            if (r1 == 0) goto L_0x0017
            r20 = r2
            goto L_0x0019
        L_0x0017:
            r20 = r43
        L_0x0019:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0022
            r1 = 0
            r21 = r1
            goto L_0x0024
        L_0x0022:
            r21 = r44
        L_0x0024:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x002c
            r22 = r2
            goto L_0x002e
        L_0x002c:
            r22 = r45
        L_0x002e:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0036
            r23 = r2
            goto L_0x0038
        L_0x0036:
            r23 = r46
        L_0x0038:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0040
            r24 = r2
            goto L_0x0042
        L_0x0040:
            r24 = r47
        L_0x0042:
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r6 = r29
            r7 = r30
            r8 = r31
            r9 = r32
            r10 = r33
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.Scene.<init>(int, java.util.UUID, java.util.UUID, java.lang.String, java.time.Instant, java.time.Instant, com.sugarcube.app.base.data.database.SceneState, int, java.util.UUID, boolean, com.sugarcube.core.network.models.Manifest, android.net.Uri, java.util.List, boolean, java.util.List, java.util.List, java.time.Instant, java.util.UUID, int, com.sugarcube.core.network.models.RoomType, java.util.UUID, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
