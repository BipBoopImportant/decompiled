package com.sugarcube.core.network.models;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import com.sugarcube.app.base.network.models.UploadKt;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bv\b\b\u0018\u00002\u00020\u0001B³\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\b\b\u0002\u0010\"\u001a\u00020\u0015\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010$\u001a\u00020\t\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b)\u0010*J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0005HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010z\u001a\u00020\u0003HÆ\u0003J\t\u0010{\u001a\u00020\tHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010}\u001a\u00020\fHÆ\u0003J\t\u0010~\u001a\u00020\fHÆ\u0003J\t\u0010\u001a\u00020\fHÆ\u0003J\n\u0010\u0001\u001a\u00020\fHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020!0 HÆ\u0003J\n\u0010\u0001\u001a\u00020\u0015HÆ\u0003J\n\u0010\u0001\u001a\u00020\tHÆ\u0003J\n\u0010\u0001\u001a\u00020\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J¶\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 2\b\b\u0002\u0010\"\u001a\u00020\u00152\b\b\u0002\u0010#\u001a\u00020\t2\b\b\u0002\u0010$\u001a\u00020\t2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0015\u0010\u0001\u001a\u00020\u00152\t\u0010\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0001\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00100\"\u0004\b4\u00102R\u001a\u0010\u0007\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010,\"\u0004\b6\u0010.R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00108\"\u0004\b<\u0010:R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\r\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\u001a\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\u001a\u0010\u000f\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010O\"\u0004\bP\u0010QR\u001a\u0010\u0016\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010O\"\u0004\bS\u0010QR\u001a\u0010\u0017\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010,\"\u0004\bU\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010>\"\u0004\bW\u0010@R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020!0 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001a\u0010\"\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010O\"\u0004\bh\u0010QR\u001a\u0010#\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u00108\"\u0004\bj\u0010:R\u001a\u0010$\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bk\u00108\"\u0004\bl\u0010:R\u001c\u0010%\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bm\u00108\"\u0004\bn\u0010:R\u001c\u0010&\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bo\u00108\"\u0004\bp\u0010:R\u001c\u0010'\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u00108\"\u0004\br\u0010:R\u001c\u0010(\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bs\u00100\"\u0004\bt\u00102R\u0011\u0010u\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\bv\u0010O¨\u0006\u0001"}, d2 = {"Lcom/sugarcube/core/network/models/SceneResponse;", "", "sceneId", "", "sceneUuid", "Ljava/util/UUID;", "upload", "wid", "name", "", "roomType", "creation", "Ljava/time/Instant;", "createdAt", "clientCapturedAt", "lastModifiedTs", "state", "Lcom/sugarcube/core/network/models/SceneResponseState;", "jobState", "Lcom/sugarcube/core/network/models/SceneResponseJobState;", "isRated", "", "canDecorate", "compositionCount", "estimatedFinishTs", "thumbnails", "Lcom/sugarcube/core/network/models/ThumbnailResponse;", "manifest", "Lcom/sugarcube/core/network/models/Manifest;", "glbUrls", "Lcom/sugarcube/core/network/models/GlbUrls;", "viewports", "", "Lcom/sugarcube/core/network/models/MultiviewThumbnail;", "isStock", "captureId", "workId", "pipelineType", "mobilePlatform", "appEnv", "jobId", "<init>", "(ILjava/util/UUID;Ljava/util/UUID;ILjava/lang/String;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Ljava/time/Instant;Ljava/time/Instant;Lcom/sugarcube/core/network/models/SceneResponseState;Lcom/sugarcube/core/network/models/SceneResponseJobState;ZZILjava/time/Instant;Lcom/sugarcube/core/network/models/ThumbnailResponse;Lcom/sugarcube/core/network/models/Manifest;Lcom/sugarcube/core/network/models/GlbUrls;Ljava/util/List;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getSceneId", "()I", "setSceneId", "(I)V", "getSceneUuid", "()Ljava/util/UUID;", "setSceneUuid", "(Ljava/util/UUID;)V", "getUpload", "setUpload", "getWid", "setWid", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getRoomType", "setRoomType", "getCreation", "()Ljava/time/Instant;", "setCreation", "(Ljava/time/Instant;)V", "getCreatedAt", "setCreatedAt", "getClientCapturedAt", "setClientCapturedAt", "getLastModifiedTs", "setLastModifiedTs", "getState", "()Lcom/sugarcube/core/network/models/SceneResponseState;", "setState", "(Lcom/sugarcube/core/network/models/SceneResponseState;)V", "getJobState", "()Lcom/sugarcube/core/network/models/SceneResponseJobState;", "setJobState", "(Lcom/sugarcube/core/network/models/SceneResponseJobState;)V", "()Z", "setRated", "(Z)V", "getCanDecorate", "setCanDecorate", "getCompositionCount", "setCompositionCount", "getEstimatedFinishTs", "setEstimatedFinishTs", "getThumbnails", "()Lcom/sugarcube/core/network/models/ThumbnailResponse;", "setThumbnails", "(Lcom/sugarcube/core/network/models/ThumbnailResponse;)V", "getManifest", "()Lcom/sugarcube/core/network/models/Manifest;", "setManifest", "(Lcom/sugarcube/core/network/models/Manifest;)V", "getGlbUrls", "()Lcom/sugarcube/core/network/models/GlbUrls;", "setGlbUrls", "(Lcom/sugarcube/core/network/models/GlbUrls;)V", "getViewports", "()Ljava/util/List;", "setViewports", "(Ljava/util/List;)V", "setStock", "getCaptureId", "setCaptureId", "getWorkId", "setWorkId", "getPipelineType", "setPipelineType", "getMobilePlatform", "setMobilePlatform", "getAppEnv", "setAppEnv", "getJobId", "setJobId", "hasGltf", "getHasGltf", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "copy", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class SceneResponse {
    private String appEnv;
    private boolean canDecorate;
    private transient String captureId;
    private Instant clientCapturedAt;
    private int compositionCount;
    private Instant createdAt;
    private Instant creation;
    private Instant estimatedFinishTs;
    private GlbUrls glbUrls;
    private final boolean hasGltf;
    private boolean isRated;
    private boolean isStock;
    private UUID jobId;
    private SceneResponseJobState jobState;
    private Instant lastModifiedTs;
    private Manifest manifest;
    private String mobilePlatform;
    private String name;
    private String pipelineType;
    private String roomType;
    private int sceneId;
    private UUID sceneUuid;
    private SceneResponseState state;
    private ThumbnailResponse thumbnails;
    private UUID upload;
    private List<MultiviewThumbnail> viewports;
    private int wid;
    private transient String workId;

    public SceneResponse() {
        this(0, (UUID) null, (UUID) null, 0, (String) null, (String) null, (Instant) null, (Instant) null, (Instant) null, (Instant) null, (SceneResponseState) null, (SceneResponseJobState) null, false, false, 0, (Instant) null, (ThumbnailResponse) null, (Manifest) null, (GlbUrls) null, (List) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (UUID) null, 134217727, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SceneResponse copy$default(SceneResponse sceneResponse, int i10, UUID uuid, UUID uuid2, int i11, String str, String str2, Instant instant, Instant instant2, Instant instant3, Instant instant4, SceneResponseState sceneResponseState, SceneResponseJobState sceneResponseJobState, boolean z10, boolean z11, int i12, Instant instant5, ThumbnailResponse thumbnailResponse, Manifest manifest2, GlbUrls glbUrls2, List list, boolean z12, String str3, String str4, String str5, String str6, String str7, UUID uuid3, int i13, Object obj) {
        SceneResponse sceneResponse2 = sceneResponse;
        int i14 = i13;
        return sceneResponse.copy((i14 & 1) != 0 ? sceneResponse2.sceneId : i10, (i14 & 2) != 0 ? sceneResponse2.sceneUuid : uuid, (i14 & 4) != 0 ? sceneResponse2.upload : uuid2, (i14 & 8) != 0 ? sceneResponse2.wid : i11, (i14 & 16) != 0 ? sceneResponse2.name : str, (i14 & 32) != 0 ? sceneResponse2.roomType : str2, (i14 & 64) != 0 ? sceneResponse2.creation : instant, (i14 & 128) != 0 ? sceneResponse2.createdAt : instant2, (i14 & 256) != 0 ? sceneResponse2.clientCapturedAt : instant3, (i14 & 512) != 0 ? sceneResponse2.lastModifiedTs : instant4, (i14 & 1024) != 0 ? sceneResponse2.state : sceneResponseState, (i14 & RecyclerView.n.FLAG_MOVED) != 0 ? sceneResponse2.jobState : sceneResponseJobState, (i14 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? sceneResponse2.isRated : z10, (i14 & 8192) != 0 ? sceneResponse2.canDecorate : z11, (i14 & 16384) != 0 ? sceneResponse2.compositionCount : i12, (i14 & 32768) != 0 ? sceneResponse2.estimatedFinishTs : instant5, (i14 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? sceneResponse2.thumbnails : thumbnailResponse, (i14 & 131072) != 0 ? sceneResponse2.manifest : manifest2, (i14 & 262144) != 0 ? sceneResponse2.glbUrls : glbUrls2, (i14 & ImageMetadata.LENS_APERTURE) != 0 ? sceneResponse2.viewports : list, (i14 & ImageMetadata.SHADING_MODE) != 0 ? sceneResponse2.isStock : z12, (i14 & UploadKt.MAX_CHUNK_SIZE) != 0 ? sceneResponse2.captureId : str3, (i14 & 4194304) != 0 ? sceneResponse2.workId : str4, (i14 & 8388608) != 0 ? sceneResponse2.pipelineType : str5, (i14 & 16777216) != 0 ? sceneResponse2.mobilePlatform : str6, (i14 & 33554432) != 0 ? sceneResponse2.appEnv : str7, (i14 & 67108864) != 0 ? sceneResponse2.jobId : uuid3);
    }

    public final int component1() {
        return this.sceneId;
    }

    public final Instant component10() {
        return this.lastModifiedTs;
    }

    public final SceneResponseState component11() {
        return this.state;
    }

    public final SceneResponseJobState component12() {
        return this.jobState;
    }

    public final boolean component13() {
        return this.isRated;
    }

    public final boolean component14() {
        return this.canDecorate;
    }

    public final int component15() {
        return this.compositionCount;
    }

    public final Instant component16() {
        return this.estimatedFinishTs;
    }

    public final ThumbnailResponse component17() {
        return this.thumbnails;
    }

    public final Manifest component18() {
        return this.manifest;
    }

    public final GlbUrls component19() {
        return this.glbUrls;
    }

    public final UUID component2() {
        return this.sceneUuid;
    }

    public final List<MultiviewThumbnail> component20() {
        return this.viewports;
    }

    public final boolean component21() {
        return this.isStock;
    }

    public final String component22() {
        return this.captureId;
    }

    public final String component23() {
        return this.workId;
    }

    public final String component24() {
        return this.pipelineType;
    }

    public final String component25() {
        return this.mobilePlatform;
    }

    public final String component26() {
        return this.appEnv;
    }

    public final UUID component27() {
        return this.jobId;
    }

    public final UUID component3() {
        return this.upload;
    }

    public final int component4() {
        return this.wid;
    }

    public final String component5() {
        return this.name;
    }

    public final String component6() {
        return this.roomType;
    }

    public final Instant component7() {
        return this.creation;
    }

    public final Instant component8() {
        return this.createdAt;
    }

    public final Instant component9() {
        return this.clientCapturedAt;
    }

    public final SceneResponse copy(int i10, @e(name = "uuid") UUID uuid, UUID uuid2, int i11, String str, String str2, Instant instant, Instant instant2, Instant instant3, Instant instant4, SceneResponseState sceneResponseState, SceneResponseJobState sceneResponseJobState, boolean z10, boolean z11, int i12, Instant instant5, ThumbnailResponse thumbnailResponse, Manifest manifest2, GlbUrls glbUrls2, List<MultiviewThumbnail> list, boolean z12, String str3, String str4, String str5, String str6, String str7, UUID uuid3) {
        int i13 = i10;
        C17542s.j(uuid, "sceneUuid");
        C17542s.j(str, "name");
        C17542s.j(instant, "creation");
        C17542s.j(instant2, "createdAt");
        C17542s.j(instant3, "clientCapturedAt");
        C17542s.j(instant4, "lastModifiedTs");
        C17542s.j(list, "viewports");
        C17542s.j(str3, "captureId");
        C17542s.j(str4, "workId");
        return new SceneResponse(i10, uuid, uuid2, i11, str, str2, instant, instant2, instant3, instant4, sceneResponseState, sceneResponseJobState, z10, z11, i12, instant5, thumbnailResponse, manifest2, glbUrls2, list, z12, str3, str4, str5, str6, str7, uuid3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SceneResponse)) {
            return false;
        }
        SceneResponse sceneResponse = (SceneResponse) obj;
        return this.sceneId == sceneResponse.sceneId && C17542s.e(this.sceneUuid, sceneResponse.sceneUuid) && C17542s.e(this.upload, sceneResponse.upload) && this.wid == sceneResponse.wid && C17542s.e(this.name, sceneResponse.name) && C17542s.e(this.roomType, sceneResponse.roomType) && C17542s.e(this.creation, sceneResponse.creation) && C17542s.e(this.createdAt, sceneResponse.createdAt) && C17542s.e(this.clientCapturedAt, sceneResponse.clientCapturedAt) && C17542s.e(this.lastModifiedTs, sceneResponse.lastModifiedTs) && this.state == sceneResponse.state && this.jobState == sceneResponse.jobState && this.isRated == sceneResponse.isRated && this.canDecorate == sceneResponse.canDecorate && this.compositionCount == sceneResponse.compositionCount && C17542s.e(this.estimatedFinishTs, sceneResponse.estimatedFinishTs) && C17542s.e(this.thumbnails, sceneResponse.thumbnails) && C17542s.e(this.manifest, sceneResponse.manifest) && C17542s.e(this.glbUrls, sceneResponse.glbUrls) && C17542s.e(this.viewports, sceneResponse.viewports) && this.isStock == sceneResponse.isStock && C17542s.e(this.captureId, sceneResponse.captureId) && C17542s.e(this.workId, sceneResponse.workId) && C17542s.e(this.pipelineType, sceneResponse.pipelineType) && C17542s.e(this.mobilePlatform, sceneResponse.mobilePlatform) && C17542s.e(this.appEnv, sceneResponse.appEnv) && C17542s.e(this.jobId, sceneResponse.jobId);
    }

    public final String getAppEnv() {
        return this.appEnv;
    }

    public final boolean getCanDecorate() {
        return this.canDecorate;
    }

    public final String getCaptureId() {
        return this.captureId;
    }

    public final Instant getClientCapturedAt() {
        return this.clientCapturedAt;
    }

    public final int getCompositionCount() {
        return this.compositionCount;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final Instant getCreation() {
        return this.creation;
    }

    public final Instant getEstimatedFinishTs() {
        return this.estimatedFinishTs;
    }

    public final GlbUrls getGlbUrls() {
        return this.glbUrls;
    }

    public final boolean getHasGltf() {
        return this.hasGltf;
    }

    public final UUID getJobId() {
        return this.jobId;
    }

    public final SceneResponseJobState getJobState() {
        return this.jobState;
    }

    public final Instant getLastModifiedTs() {
        return this.lastModifiedTs;
    }

    public final Manifest getManifest() {
        return this.manifest;
    }

    public final String getMobilePlatform() {
        return this.mobilePlatform;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPipelineType() {
        return this.pipelineType;
    }

    public final String getRoomType() {
        return this.roomType;
    }

    public final int getSceneId() {
        return this.sceneId;
    }

    public final UUID getSceneUuid() {
        return this.sceneUuid;
    }

    public final SceneResponseState getState() {
        return this.state;
    }

    public final ThumbnailResponse getThumbnails() {
        return this.thumbnails;
    }

    public final UUID getUpload() {
        return this.upload;
    }

    public final List<MultiviewThumbnail> getViewports() {
        return this.viewports;
    }

    public final int getWid() {
        return this.wid;
    }

    public final String getWorkId() {
        return this.workId;
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.sceneId) * 31) + this.sceneUuid.hashCode()) * 31;
        UUID uuid = this.upload;
        int i10 = 0;
        int hashCode2 = (((((hashCode + (uuid == null ? 0 : uuid.hashCode())) * 31) + Integer.hashCode(this.wid)) * 31) + this.name.hashCode()) * 31;
        String str = this.roomType;
        int hashCode3 = (((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.creation.hashCode()) * 31) + this.createdAt.hashCode()) * 31) + this.clientCapturedAt.hashCode()) * 31) + this.lastModifiedTs.hashCode()) * 31;
        SceneResponseState sceneResponseState = this.state;
        int hashCode4 = (hashCode3 + (sceneResponseState == null ? 0 : sceneResponseState.hashCode())) * 31;
        SceneResponseJobState sceneResponseJobState = this.jobState;
        int hashCode5 = (((((((hashCode4 + (sceneResponseJobState == null ? 0 : sceneResponseJobState.hashCode())) * 31) + Boolean.hashCode(this.isRated)) * 31) + Boolean.hashCode(this.canDecorate)) * 31) + Integer.hashCode(this.compositionCount)) * 31;
        Instant instant = this.estimatedFinishTs;
        int hashCode6 = (hashCode5 + (instant == null ? 0 : instant.hashCode())) * 31;
        ThumbnailResponse thumbnailResponse = this.thumbnails;
        int hashCode7 = (hashCode6 + (thumbnailResponse == null ? 0 : thumbnailResponse.hashCode())) * 31;
        Manifest manifest2 = this.manifest;
        int hashCode8 = (hashCode7 + (manifest2 == null ? 0 : manifest2.hashCode())) * 31;
        GlbUrls glbUrls2 = this.glbUrls;
        int hashCode9 = (((((((((hashCode8 + (glbUrls2 == null ? 0 : glbUrls2.hashCode())) * 31) + this.viewports.hashCode()) * 31) + Boolean.hashCode(this.isStock)) * 31) + this.captureId.hashCode()) * 31) + this.workId.hashCode()) * 31;
        String str2 = this.pipelineType;
        int hashCode10 = (hashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mobilePlatform;
        int hashCode11 = (hashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appEnv;
        int hashCode12 = (hashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        UUID uuid2 = this.jobId;
        if (uuid2 != null) {
            i10 = uuid2.hashCode();
        }
        return hashCode12 + i10;
    }

    public final boolean isRated() {
        return this.isRated;
    }

    public final boolean isStock() {
        return this.isStock;
    }

    public final SceneResponseJobState jobState() {
        SceneResponseJobState sceneResponseJobState = this.jobState;
        return sceneResponseJobState == null ? SceneResponseJobState.Unknown : sceneResponseJobState;
    }

    public final void setAppEnv(String str) {
        this.appEnv = str;
    }

    public final void setCanDecorate(boolean z10) {
        this.canDecorate = z10;
    }

    public final void setCaptureId(String str) {
        C17542s.j(str, "<set-?>");
        this.captureId = str;
    }

    public final void setClientCapturedAt(Instant instant) {
        C17542s.j(instant, "<set-?>");
        this.clientCapturedAt = instant;
    }

    public final void setCompositionCount(int i10) {
        this.compositionCount = i10;
    }

    public final void setCreatedAt(Instant instant) {
        C17542s.j(instant, "<set-?>");
        this.createdAt = instant;
    }

    public final void setCreation(Instant instant) {
        C17542s.j(instant, "<set-?>");
        this.creation = instant;
    }

    public final void setEstimatedFinishTs(Instant instant) {
        this.estimatedFinishTs = instant;
    }

    public final void setGlbUrls(GlbUrls glbUrls2) {
        this.glbUrls = glbUrls2;
    }

    public final void setJobId(UUID uuid) {
        this.jobId = uuid;
    }

    public final void setJobState(SceneResponseJobState sceneResponseJobState) {
        this.jobState = sceneResponseJobState;
    }

    public final void setLastModifiedTs(Instant instant) {
        C17542s.j(instant, "<set-?>");
        this.lastModifiedTs = instant;
    }

    public final void setManifest(Manifest manifest2) {
        this.manifest = manifest2;
    }

    public final void setMobilePlatform(String str) {
        this.mobilePlatform = str;
    }

    public final void setName(String str) {
        C17542s.j(str, "<set-?>");
        this.name = str;
    }

    public final void setPipelineType(String str) {
        this.pipelineType = str;
    }

    public final void setRated(boolean z10) {
        this.isRated = z10;
    }

    public final void setRoomType(String str) {
        this.roomType = str;
    }

    public final void setSceneId(int i10) {
        this.sceneId = i10;
    }

    public final void setSceneUuid(UUID uuid) {
        C17542s.j(uuid, "<set-?>");
        this.sceneUuid = uuid;
    }

    public final void setState(SceneResponseState sceneResponseState) {
        this.state = sceneResponseState;
    }

    public final void setStock(boolean z10) {
        this.isStock = z10;
    }

    public final void setThumbnails(ThumbnailResponse thumbnailResponse) {
        this.thumbnails = thumbnailResponse;
    }

    public final void setUpload(UUID uuid) {
        this.upload = uuid;
    }

    public final void setViewports(List<MultiviewThumbnail> list) {
        C17542s.j(list, "<set-?>");
        this.viewports = list;
    }

    public final void setWid(int i10) {
        this.wid = i10;
    }

    public final void setWorkId(String str) {
        C17542s.j(str, "<set-?>");
        this.workId = str;
    }

    public final SceneResponseState state() {
        SceneResponseState sceneResponseState = this.state;
        return sceneResponseState == null ? SceneResponseState.Unknown : sceneResponseState;
    }

    public String toString() {
        int i10 = this.sceneId;
        UUID uuid = this.sceneUuid;
        UUID uuid2 = this.upload;
        int i11 = this.wid;
        String str = this.name;
        String str2 = this.roomType;
        Instant instant = this.creation;
        Instant instant2 = this.createdAt;
        Instant instant3 = this.clientCapturedAt;
        Instant instant4 = this.lastModifiedTs;
        SceneResponseState sceneResponseState = this.state;
        SceneResponseJobState sceneResponseJobState = this.jobState;
        boolean z10 = this.isRated;
        boolean z11 = this.canDecorate;
        int i12 = this.compositionCount;
        Instant instant5 = this.estimatedFinishTs;
        ThumbnailResponse thumbnailResponse = this.thumbnails;
        Manifest manifest2 = this.manifest;
        GlbUrls glbUrls2 = this.glbUrls;
        List<MultiviewThumbnail> list = this.viewports;
        boolean z12 = this.isStock;
        String str3 = this.captureId;
        String str4 = this.workId;
        String str5 = this.pipelineType;
        String str6 = this.mobilePlatform;
        String str7 = this.appEnv;
        UUID uuid3 = this.jobId;
        return "SceneResponse(sceneId=" + i10 + ", sceneUuid=" + uuid + ", upload=" + uuid2 + ", wid=" + i11 + ", name=" + str + ", roomType=" + str2 + ", creation=" + instant + ", createdAt=" + instant2 + ", clientCapturedAt=" + instant3 + ", lastModifiedTs=" + instant4 + ", state=" + sceneResponseState + ", jobState=" + sceneResponseJobState + ", isRated=" + z10 + ", canDecorate=" + z11 + ", compositionCount=" + i12 + ", estimatedFinishTs=" + instant5 + ", thumbnails=" + thumbnailResponse + ", manifest=" + manifest2 + ", glbUrls=" + glbUrls2 + ", viewports=" + list + ", isStock=" + z12 + ", captureId=" + str3 + ", workId=" + str4 + ", pipelineType=" + str5 + ", mobilePlatform=" + str6 + ", appEnv=" + str7 + ", jobId=" + uuid3 + ")";
    }

    public SceneResponse(int i10, @e(name = "uuid") UUID uuid, UUID uuid2, int i11, String str, String str2, Instant instant, Instant instant2, Instant instant3, Instant instant4, SceneResponseState sceneResponseState, SceneResponseJobState sceneResponseJobState, boolean z10, boolean z11, int i12, Instant instant5, ThumbnailResponse thumbnailResponse, Manifest manifest2, GlbUrls glbUrls2, List<MultiviewThumbnail> list, boolean z12, String str3, String str4, String str5, String str6, String str7, UUID uuid3) {
        boolean z13;
        String str8 = str;
        Instant instant6 = instant;
        Instant instant7 = instant2;
        Instant instant8 = instant3;
        Instant instant9 = instant4;
        GlbUrls glbUrls3 = glbUrls2;
        List<MultiviewThumbnail> list2 = list;
        String str9 = str3;
        String str10 = str4;
        C17542s.j(uuid, "sceneUuid");
        C17542s.j(str8, "name");
        C17542s.j(instant6, "creation");
        C17542s.j(instant7, "createdAt");
        C17542s.j(instant8, "clientCapturedAt");
        C17542s.j(instant9, "lastModifiedTs");
        C17542s.j(list2, "viewports");
        C17542s.j(str9, "captureId");
        C17542s.j(str10, "workId");
        this.sceneId = i10;
        this.sceneUuid = uuid;
        this.upload = uuid2;
        this.wid = i11;
        this.name = str8;
        this.roomType = str2;
        this.creation = instant6;
        this.createdAt = instant7;
        this.clientCapturedAt = instant8;
        this.lastModifiedTs = instant9;
        this.state = sceneResponseState;
        this.jobState = sceneResponseJobState;
        this.isRated = z10;
        this.canDecorate = z11;
        this.compositionCount = i12;
        this.estimatedFinishTs = instant5;
        this.thumbnails = thumbnailResponse;
        this.manifest = manifest2;
        this.glbUrls = glbUrls3;
        this.viewports = list2;
        this.isStock = z12;
        this.captureId = str9;
        this.workId = str10;
        this.pipelineType = str5;
        this.mobilePlatform = str6;
        this.appEnv = str7;
        this.jobId = uuid3;
        Uri uri = null;
        if ((glbUrls3 != null ? glbUrls2.getComplete() : null) != null) {
            GlbUrls glbUrls4 = this.glbUrls;
            if (!C17542s.e(glbUrls4 != null ? glbUrls4.getComplete() : uri, Uri.EMPTY)) {
                z13 = true;
                this.hasGltf = z13;
            }
        }
        z13 = false;
        this.hasGltf = z13;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v2, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v2, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v2, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r68v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r69v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r70v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v1, resolved type: java.util.UUID} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v4, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v3, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r26v4, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v3, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r25v4, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.sugarcube.core.network.models.GlbUrls} */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SceneResponse(int r44, java.util.UUID r45, java.util.UUID r46, int r47, java.lang.String r48, java.lang.String r49, java.time.Instant r50, java.time.Instant r51, java.time.Instant r52, java.time.Instant r53, com.sugarcube.core.network.models.SceneResponseState r54, com.sugarcube.core.network.models.SceneResponseJobState r55, boolean r56, boolean r57, int r58, java.time.Instant r59, com.sugarcube.core.network.models.ThumbnailResponse r60, com.sugarcube.core.network.models.Manifest r61, com.sugarcube.core.network.models.GlbUrls r62, java.util.List r63, boolean r64, java.lang.String r65, java.lang.String r66, java.lang.String r67, java.lang.String r68, java.lang.String r69, java.util.UUID r70, int r71, kotlin.jvm.internal.DefaultConstructorMarker r72) {
        /*
            r43 = this;
            r0 = r71
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0008
            r1 = 0
            goto L_0x000a
        L_0x0008:
            r1 = r44
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0013
            java.util.UUID r3 = java.util.UUID.randomUUID()
            goto L_0x0015
        L_0x0013:
            r3 = r45
        L_0x0015:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001b
            r4 = 0
            goto L_0x001d
        L_0x001b:
            r4 = r46
        L_0x001d:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0023
            r6 = 0
            goto L_0x0025
        L_0x0023:
            r6 = r47
        L_0x0025:
            r7 = r0 & 16
            java.lang.String r8 = ""
            if (r7 == 0) goto L_0x002d
            r7 = r8
            goto L_0x002f
        L_0x002d:
            r7 = r48
        L_0x002f:
            r9 = r0 & 32
            if (r9 == 0) goto L_0x0035
            r9 = 0
            goto L_0x0037
        L_0x0035:
            r9 = r49
        L_0x0037:
            r10 = r0 & 64
            if (r10 == 0) goto L_0x0040
            java.time.Instant r10 = java.time.Instant.now()
            goto L_0x0042
        L_0x0040:
            r10 = r50
        L_0x0042:
            r11 = r0 & 128(0x80, float:1.794E-43)
            if (r11 == 0) goto L_0x004b
            java.time.Instant r11 = java.time.Instant.now()
            goto L_0x004d
        L_0x004b:
            r11 = r51
        L_0x004d:
            r12 = r0 & 256(0x100, float:3.59E-43)
            if (r12 == 0) goto L_0x0056
            java.time.Instant r12 = java.time.Instant.now()
            goto L_0x0058
        L_0x0056:
            r12 = r52
        L_0x0058:
            r13 = r0 & 512(0x200, float:7.175E-43)
            if (r13 == 0) goto L_0x0061
            java.time.Instant r13 = java.time.Instant.now()
            goto L_0x0063
        L_0x0061:
            r13 = r53
        L_0x0063:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x006a
            com.sugarcube.core.network.models.SceneResponseState r14 = com.sugarcube.core.network.models.SceneResponseState.Unknown
            goto L_0x006c
        L_0x006a:
            r14 = r54
        L_0x006c:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x0073
            com.sugarcube.core.network.models.SceneResponseJobState r15 = com.sugarcube.core.network.models.SceneResponseJobState.Unknown
            goto L_0x0075
        L_0x0073:
            r15 = r55
        L_0x0075:
            r2 = r0 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007d
        L_0x007b:
            r2 = r56
        L_0x007d:
            r5 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x0083
            r5 = 0
            goto L_0x0085
        L_0x0083:
            r5 = r57
        L_0x0085:
            r45 = r8
            r8 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r8 == 0) goto L_0x008d
            r8 = 0
            goto L_0x008f
        L_0x008d:
            r8 = r58
        L_0x008f:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0099
            r16 = 0
            goto L_0x009b
        L_0x0099:
            r16 = r59
        L_0x009b:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00af
            r17 = r8
            com.sugarcube.core.network.models.ThumbnailResponse r8 = new com.sugarcube.core.network.models.ThumbnailResponse
            r18 = r5
            r5 = 1
            r19 = r2
            r2 = 0
            r8.<init>(r2, r5, r2)
            goto L_0x00b8
        L_0x00af:
            r19 = r2
            r18 = r5
            r17 = r8
            r2 = 0
            r8 = r60
        L_0x00b8:
            r5 = 131072(0x20000, float:1.83671E-40)
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00f2
            com.sugarcube.core.network.models.Manifest r5 = new com.sugarcube.core.network.models.Manifest
            r20 = r5
            r41 = 1048575(0xfffff, float:1.469367E-39)
            r42 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r34 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)
            goto L_0x00f4
        L_0x00f2:
            r5 = r61
        L_0x00f4:
            r20 = 262144(0x40000, float:3.67342E-40)
            r20 = r0 & r20
            if (r20 == 0) goto L_0x00fd
            r20 = r2
            goto L_0x00ff
        L_0x00fd:
            r20 = r62
        L_0x00ff:
            r21 = 524288(0x80000, float:7.34684E-40)
            r21 = r0 & r21
            if (r21 == 0) goto L_0x010a
            java.util.List r21 = YH.C16877v.n()
            goto L_0x010c
        L_0x010a:
            r21 = r63
        L_0x010c:
            r22 = 1048576(0x100000, float:1.469368E-39)
            r22 = r0 & r22
            if (r22 == 0) goto L_0x0115
            r22 = 0
            goto L_0x0117
        L_0x0115:
            r22 = r64
        L_0x0117:
            r23 = 2097152(0x200000, float:2.938736E-39)
            r23 = r0 & r23
            if (r23 == 0) goto L_0x0120
            r23 = r45
            goto L_0x0122
        L_0x0120:
            r23 = r65
        L_0x0122:
            r24 = 4194304(0x400000, float:5.877472E-39)
            r24 = r0 & r24
            if (r24 == 0) goto L_0x012b
            r24 = r45
            goto L_0x012d
        L_0x012b:
            r24 = r66
        L_0x012d:
            r25 = 8388608(0x800000, float:1.17549435E-38)
            r25 = r0 & r25
            if (r25 == 0) goto L_0x0136
            r25 = r2
            goto L_0x0138
        L_0x0136:
            r25 = r67
        L_0x0138:
            r26 = 16777216(0x1000000, float:2.3509887E-38)
            r26 = r0 & r26
            if (r26 == 0) goto L_0x0141
            r26 = r2
            goto L_0x0143
        L_0x0141:
            r26 = r68
        L_0x0143:
            r27 = 33554432(0x2000000, float:9.403955E-38)
            r27 = r0 & r27
            if (r27 == 0) goto L_0x014c
            r27 = r2
            goto L_0x014e
        L_0x014c:
            r27 = r69
        L_0x014e:
            r28 = 67108864(0x4000000, float:1.5046328E-36)
            r0 = r0 & r28
            if (r0 == 0) goto L_0x0155
            goto L_0x0157
        L_0x0155:
            r2 = r70
        L_0x0157:
            r44 = r43
            r45 = r1
            r46 = r3
            r47 = r4
            r48 = r6
            r49 = r7
            r50 = r9
            r51 = r10
            r52 = r11
            r53 = r12
            r54 = r13
            r55 = r14
            r56 = r15
            r57 = r19
            r58 = r18
            r59 = r17
            r60 = r16
            r61 = r8
            r62 = r5
            r63 = r20
            r64 = r21
            r65 = r22
            r66 = r23
            r67 = r24
            r68 = r25
            r69 = r26
            r70 = r27
            r71 = r2
            r44.<init>(r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.SceneResponse.<init>(int, java.util.UUID, java.util.UUID, int, java.lang.String, java.lang.String, java.time.Instant, java.time.Instant, java.time.Instant, java.time.Instant, com.sugarcube.core.network.models.SceneResponseState, com.sugarcube.core.network.models.SceneResponseJobState, boolean, boolean, int, java.time.Instant, com.sugarcube.core.network.models.ThumbnailResponse, com.sugarcube.core.network.models.Manifest, com.sugarcube.core.network.models.GlbUrls, java.util.List, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
