package com.sugarcube.app.base.data.database;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.core.network.models.Manifest;
import com.sugarcube.core.network.models.RoomType;
import java.time.Instant;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\bW\b\b\u0018\u00002\u00020\u0001Bß\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001f\u0010 J\t\u0010Z\u001a\u00020\u0003HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0007HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\nHÆ\u0003J\t\u0010_\u001a\u00020\fHÆ\u0003J\t\u0010`\u001a\u00020\fHÆ\u0003J\t\u0010a\u001a\u00020\u000fHÆ\u0003J\t\u0010b\u001a\u00020\u0007HÆ\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010e\u001a\u00020\u0015HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010g\u001a\u00020\u0015HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010j\u001a\u00020\u0007HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u001cHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\nHÆ\u0003Já\u0001\u0010n\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00072\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010o\u001a\u00020\u00152\b\u0010p\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010q\u001a\u00020\u0007HÖ\u0001J\t\u0010r\u001a\u00020\nHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010\b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\r\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u001a\u0010\u0010\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010*\"\u0004\b>\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00100\"\u0004\bD\u00102R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010E\"\u0004\bF\u0010GR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010&\"\u0004\bI\u0010(R\u001a\u0010\u0017\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010E\"\u0004\bK\u0010GR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00104\"\u0004\bM\u00106R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010&\"\u0004\bO\u0010(R\u001a\u0010\u001a\u001a\u00020\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010*\"\u0004\bQ\u0010,R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010&\"\u0004\bW\u0010(R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u00100\"\u0004\bY\u00102¨\u0006s"}, d2 = {"Lcom/sugarcube/app/base/data/database/DatabaseScene;", "", "id", "", "uuid", "Ljava/util/UUID;", "sceneId", "", "sceneUuid", "name", "", "createdTs", "Ljava/time/Instant;", "lastModifiedTs", "state", "Lcom/sugarcube/app/base/data/database/SceneState;", "compositionCount", "manifest", "Lcom/sugarcube/core/network/models/Manifest;", "glbUrl", "isStock", "", "uploadWorkerId", "userAcknowledged", "estimatedFinishTs", "upload", "wid", "roomType", "Lcom/sugarcube/core/network/models/RoomType;", "jobId", "pipelineType", "<init>", "(JLjava/util/UUID;ILjava/util/UUID;Ljava/lang/String;Ljava/time/Instant;Ljava/time/Instant;Lcom/sugarcube/app/base/data/database/SceneState;ILcom/sugarcube/core/network/models/Manifest;Ljava/lang/String;ZLjava/util/UUID;ZLjava/time/Instant;Ljava/util/UUID;ILcom/sugarcube/core/network/models/RoomType;Ljava/util/UUID;Ljava/lang/String;)V", "getId", "()J", "setId", "(J)V", "getUuid", "()Ljava/util/UUID;", "setUuid", "(Ljava/util/UUID;)V", "getSceneId", "()I", "setSceneId", "(I)V", "getSceneUuid", "setSceneUuid", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getCreatedTs", "()Ljava/time/Instant;", "setCreatedTs", "(Ljava/time/Instant;)V", "getLastModifiedTs", "setLastModifiedTs", "getState", "()Lcom/sugarcube/app/base/data/database/SceneState;", "setState", "(Lcom/sugarcube/app/base/data/database/SceneState;)V", "getCompositionCount", "setCompositionCount", "getManifest", "()Lcom/sugarcube/core/network/models/Manifest;", "setManifest", "(Lcom/sugarcube/core/network/models/Manifest;)V", "getGlbUrl", "setGlbUrl", "()Z", "setStock", "(Z)V", "getUploadWorkerId", "setUploadWorkerId", "getUserAcknowledged", "setUserAcknowledged", "getEstimatedFinishTs", "setEstimatedFinishTs", "getUpload", "setUpload", "getWid", "setWid", "getRoomType", "()Lcom/sugarcube/core/network/models/RoomType;", "setRoomType", "(Lcom/sugarcube/core/network/models/RoomType;)V", "getJobId", "setJobId", "getPipelineType", "setPipelineType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DatabaseScene {
    public static final int $stable = 8;
    private int compositionCount;
    private Instant createdTs;
    private Instant estimatedFinishTs;
    private String glbUrl;

    /* renamed from: id  reason: collision with root package name */
    private long f122936id;
    private boolean isStock;
    private UUID jobId;
    private Instant lastModifiedTs;
    private Manifest manifest;
    private String name;
    private String pipelineType;
    private RoomType roomType;
    private int sceneId;
    private UUID sceneUuid;
    private SceneState state;
    private UUID upload;
    private UUID uploadWorkerId;
    private boolean userAcknowledged;
    private UUID uuid;
    private int wid;

    public DatabaseScene() {
        this(0, (UUID) null, 0, (UUID) null, (String) null, (Instant) null, (Instant) null, (SceneState) null, 0, (Manifest) null, (String) null, false, (UUID) null, false, (Instant) null, (UUID) null, 0, (RoomType) null, (UUID) null, (String) null, 1048575, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ DatabaseScene copy$default(DatabaseScene databaseScene, long j10, UUID uuid2, int i10, UUID uuid3, String str, Instant instant, Instant instant2, SceneState sceneState, int i11, Manifest manifest2, String str2, boolean z10, UUID uuid4, boolean z11, Instant instant3, UUID uuid5, int i12, RoomType roomType2, UUID uuid6, String str3, int i13, Object obj) {
        DatabaseScene databaseScene2 = databaseScene;
        int i14 = i13;
        return databaseScene.copy((i14 & 1) != 0 ? databaseScene2.f122936id : j10, (i14 & 2) != 0 ? databaseScene2.uuid : uuid2, (i14 & 4) != 0 ? databaseScene2.sceneId : i10, (i14 & 8) != 0 ? databaseScene2.sceneUuid : uuid3, (i14 & 16) != 0 ? databaseScene2.name : str, (i14 & 32) != 0 ? databaseScene2.createdTs : instant, (i14 & 64) != 0 ? databaseScene2.lastModifiedTs : instant2, (i14 & 128) != 0 ? databaseScene2.state : sceneState, (i14 & 256) != 0 ? databaseScene2.compositionCount : i11, (i14 & 512) != 0 ? databaseScene2.manifest : manifest2, (i14 & 1024) != 0 ? databaseScene2.glbUrl : str2, (i14 & RecyclerView.n.FLAG_MOVED) != 0 ? databaseScene2.isStock : z10, (i14 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? databaseScene2.uploadWorkerId : uuid4, (i14 & 8192) != 0 ? databaseScene2.userAcknowledged : z11, (i14 & 16384) != 0 ? databaseScene2.estimatedFinishTs : instant3, (i14 & 32768) != 0 ? databaseScene2.upload : uuid5, (i14 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? databaseScene2.wid : i12, (i14 & 131072) != 0 ? databaseScene2.roomType : roomType2, (i14 & 262144) != 0 ? databaseScene2.jobId : uuid6, (i14 & ImageMetadata.LENS_APERTURE) != 0 ? databaseScene2.pipelineType : str3);
    }

    public final long component1() {
        return this.f122936id;
    }

    public final Manifest component10() {
        return this.manifest;
    }

    public final String component11() {
        return this.glbUrl;
    }

    public final boolean component12() {
        return this.isStock;
    }

    public final UUID component13() {
        return this.uploadWorkerId;
    }

    public final boolean component14() {
        return this.userAcknowledged;
    }

    public final Instant component15() {
        return this.estimatedFinishTs;
    }

    public final UUID component16() {
        return this.upload;
    }

    public final int component17() {
        return this.wid;
    }

    public final RoomType component18() {
        return this.roomType;
    }

    public final UUID component19() {
        return this.jobId;
    }

    public final UUID component2() {
        return this.uuid;
    }

    public final String component20() {
        return this.pipelineType;
    }

    public final int component3() {
        return this.sceneId;
    }

    public final UUID component4() {
        return this.sceneUuid;
    }

    public final String component5() {
        return this.name;
    }

    public final Instant component6() {
        return this.createdTs;
    }

    public final Instant component7() {
        return this.lastModifiedTs;
    }

    public final SceneState component8() {
        return this.state;
    }

    public final int component9() {
        return this.compositionCount;
    }

    public final DatabaseScene copy(long j10, UUID uuid2, int i10, UUID uuid3, String str, Instant instant, Instant instant2, SceneState sceneState, int i11, Manifest manifest2, String str2, boolean z10, UUID uuid4, boolean z11, Instant instant3, UUID uuid5, int i12, RoomType roomType2, UUID uuid6, String str3) {
        long j11 = j10;
        C17542s.j(uuid2, "uuid");
        C17542s.j(uuid3, "sceneUuid");
        C17542s.j(str, "name");
        C17542s.j(instant, "createdTs");
        C17542s.j(instant2, "lastModifiedTs");
        C17542s.j(sceneState, "state");
        return new DatabaseScene(j10, uuid2, i10, uuid3, str, instant, instant2, sceneState, i11, manifest2, str2, z10, uuid4, z11, instant3, uuid5, i12, roomType2, uuid6, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DatabaseScene)) {
            return false;
        }
        DatabaseScene databaseScene = (DatabaseScene) obj;
        return this.f122936id == databaseScene.f122936id && C17542s.e(this.uuid, databaseScene.uuid) && this.sceneId == databaseScene.sceneId && C17542s.e(this.sceneUuid, databaseScene.sceneUuid) && C17542s.e(this.name, databaseScene.name) && C17542s.e(this.createdTs, databaseScene.createdTs) && C17542s.e(this.lastModifiedTs, databaseScene.lastModifiedTs) && this.state == databaseScene.state && this.compositionCount == databaseScene.compositionCount && C17542s.e(this.manifest, databaseScene.manifest) && C17542s.e(this.glbUrl, databaseScene.glbUrl) && this.isStock == databaseScene.isStock && C17542s.e(this.uploadWorkerId, databaseScene.uploadWorkerId) && this.userAcknowledged == databaseScene.userAcknowledged && C17542s.e(this.estimatedFinishTs, databaseScene.estimatedFinishTs) && C17542s.e(this.upload, databaseScene.upload) && this.wid == databaseScene.wid && this.roomType == databaseScene.roomType && C17542s.e(this.jobId, databaseScene.jobId) && C17542s.e(this.pipelineType, databaseScene.pipelineType);
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

    public final String getGlbUrl() {
        return this.glbUrl;
    }

    public final long getId() {
        return this.f122936id;
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

    public final String getName() {
        return this.name;
    }

    public final String getPipelineType() {
        return this.pipelineType;
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

    public final UUID getUploadWorkerId() {
        return this.uploadWorkerId;
    }

    public final boolean getUserAcknowledged() {
        return this.userAcknowledged;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public final int getWid() {
        return this.wid;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((Long.hashCode(this.f122936id) * 31) + this.uuid.hashCode()) * 31) + Integer.hashCode(this.sceneId)) * 31) + this.sceneUuid.hashCode()) * 31) + this.name.hashCode()) * 31) + this.createdTs.hashCode()) * 31) + this.lastModifiedTs.hashCode()) * 31) + this.state.hashCode()) * 31) + Integer.hashCode(this.compositionCount)) * 31;
        Manifest manifest2 = this.manifest;
        int i10 = 0;
        int hashCode2 = (hashCode + (manifest2 == null ? 0 : manifest2.hashCode())) * 31;
        String str = this.glbUrl;
        int hashCode3 = (((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isStock)) * 31;
        UUID uuid2 = this.uploadWorkerId;
        int hashCode4 = (((hashCode3 + (uuid2 == null ? 0 : uuid2.hashCode())) * 31) + Boolean.hashCode(this.userAcknowledged)) * 31;
        Instant instant = this.estimatedFinishTs;
        int hashCode5 = (hashCode4 + (instant == null ? 0 : instant.hashCode())) * 31;
        UUID uuid3 = this.upload;
        int hashCode6 = (((hashCode5 + (uuid3 == null ? 0 : uuid3.hashCode())) * 31) + Integer.hashCode(this.wid)) * 31;
        RoomType roomType2 = this.roomType;
        int hashCode7 = (hashCode6 + (roomType2 == null ? 0 : roomType2.hashCode())) * 31;
        UUID uuid4 = this.jobId;
        int hashCode8 = (hashCode7 + (uuid4 == null ? 0 : uuid4.hashCode())) * 31;
        String str2 = this.pipelineType;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode8 + i10;
    }

    public final boolean isStock() {
        return this.isStock;
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

    public final void setGlbUrl(String str) {
        this.glbUrl = str;
    }

    public final void setId(long j10) {
        this.f122936id = j10;
    }

    public final void setJobId(UUID uuid2) {
        this.jobId = uuid2;
    }

    public final void setLastModifiedTs(Instant instant) {
        C17542s.j(instant, "<set-?>");
        this.lastModifiedTs = instant;
    }

    public final void setManifest(Manifest manifest2) {
        this.manifest = manifest2;
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

    public final void setUploadWorkerId(UUID uuid2) {
        this.uploadWorkerId = uuid2;
    }

    public final void setUserAcknowledged(boolean z10) {
        this.userAcknowledged = z10;
    }

    public final void setUuid(UUID uuid2) {
        C17542s.j(uuid2, "<set-?>");
        this.uuid = uuid2;
    }

    public final void setWid(int i10) {
        this.wid = i10;
    }

    public String toString() {
        long j10 = this.f122936id;
        UUID uuid2 = this.uuid;
        int i10 = this.sceneId;
        UUID uuid3 = this.sceneUuid;
        String str = this.name;
        Instant instant = this.createdTs;
        Instant instant2 = this.lastModifiedTs;
        SceneState sceneState = this.state;
        int i11 = this.compositionCount;
        Manifest manifest2 = this.manifest;
        String str2 = this.glbUrl;
        boolean z10 = this.isStock;
        UUID uuid4 = this.uploadWorkerId;
        boolean z11 = this.userAcknowledged;
        Instant instant3 = this.estimatedFinishTs;
        UUID uuid5 = this.upload;
        int i12 = this.wid;
        RoomType roomType2 = this.roomType;
        UUID uuid6 = this.jobId;
        String str3 = this.pipelineType;
        return "DatabaseScene(id=" + j10 + ", uuid=" + uuid2 + ", sceneId=" + i10 + ", sceneUuid=" + uuid3 + ", name=" + str + ", createdTs=" + instant + ", lastModifiedTs=" + instant2 + ", state=" + sceneState + ", compositionCount=" + i11 + ", manifest=" + manifest2 + ", glbUrl=" + str2 + ", isStock=" + z10 + ", uploadWorkerId=" + uuid4 + ", userAcknowledged=" + z11 + ", estimatedFinishTs=" + instant3 + ", upload=" + uuid5 + ", wid=" + i12 + ", roomType=" + roomType2 + ", jobId=" + uuid6 + ", pipelineType=" + str3 + ")";
    }

    public DatabaseScene(long j10, UUID uuid2, int i10, UUID uuid3, String str, Instant instant, Instant instant2, SceneState sceneState, int i11, Manifest manifest2, String str2, boolean z10, UUID uuid4, boolean z11, Instant instant3, UUID uuid5, int i12, RoomType roomType2, UUID uuid6, String str3) {
        Instant instant4 = instant;
        Instant instant5 = instant2;
        SceneState sceneState2 = sceneState;
        C17542s.j(uuid2, "uuid");
        C17542s.j(uuid3, "sceneUuid");
        C17542s.j(str, "name");
        C17542s.j(instant4, "createdTs");
        C17542s.j(instant5, "lastModifiedTs");
        C17542s.j(sceneState2, "state");
        this.f122936id = j10;
        this.uuid = uuid2;
        this.sceneId = i10;
        this.sceneUuid = uuid3;
        this.name = str;
        this.createdTs = instant4;
        this.lastModifiedTs = instant5;
        this.state = sceneState2;
        this.compositionCount = i11;
        this.manifest = manifest2;
        this.glbUrl = str2;
        this.isStock = z10;
        this.uploadWorkerId = uuid4;
        this.userAcknowledged = z11;
        this.estimatedFinishTs = instant3;
        this.upload = uuid5;
        this.wid = i12;
        this.roomType = roomType2;
        this.jobId = uuid6;
        this.pipelineType = str3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ DatabaseScene(long r22, java.util.UUID r24, int r25, java.util.UUID r26, java.lang.String r27, java.time.Instant r28, java.time.Instant r29, com.sugarcube.app.base.data.database.SceneState r30, int r31, com.sugarcube.core.network.models.Manifest r32, java.lang.String r33, boolean r34, java.util.UUID r35, boolean r36, java.time.Instant r37, java.util.UUID r38, int r39, com.sugarcube.core.network.models.RoomType r40, java.util.UUID r41, java.lang.String r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r21 = this;
            r0 = r43
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            r1 = 0
            goto L_0x000b
        L_0x0009:
            r1 = r22
        L_0x000b:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0014
            java.util.UUID r3 = java.util.UUID.randomUUID()
            goto L_0x0016
        L_0x0014:
            r3 = r24
        L_0x0016:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x001c
            r4 = 0
            goto L_0x001e
        L_0x001c:
            r4 = r25
        L_0x001e:
            r6 = r0 & 8
            if (r6 == 0) goto L_0x0027
            java.util.UUID r6 = java.util.UUID.randomUUID()
            goto L_0x0029
        L_0x0027:
            r6 = r26
        L_0x0029:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x0030
            java.lang.String r7 = ""
            goto L_0x0032
        L_0x0030:
            r7 = r27
        L_0x0032:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x003b
            java.time.Instant r8 = java.time.Instant.now()
            goto L_0x003d
        L_0x003b:
            r8 = r28
        L_0x003d:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x0046
            java.time.Instant r9 = java.time.Instant.now()
            goto L_0x0048
        L_0x0046:
            r9 = r29
        L_0x0048:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x004f
            com.sugarcube.app.base.data.database.SceneState r10 = com.sugarcube.app.base.data.database.SceneState.NEW
            goto L_0x0051
        L_0x004f:
            r10 = r30
        L_0x0051:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x0057
            r11 = 0
            goto L_0x0059
        L_0x0057:
            r11 = r31
        L_0x0059:
            r12 = r0 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L_0x005f
            r12 = 0
            goto L_0x0061
        L_0x005f:
            r12 = r32
        L_0x0061:
            r14 = r0 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x0067
            r14 = 0
            goto L_0x0069
        L_0x0067:
            r14 = r33
        L_0x0069:
            r15 = r0 & 2048(0x800, float:2.87E-42)
            if (r15 == 0) goto L_0x006f
            r15 = 0
            goto L_0x0071
        L_0x006f:
            r15 = r34
        L_0x0071:
            r5 = r0 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x0077
            r5 = 0
            goto L_0x0079
        L_0x0077:
            r5 = r35
        L_0x0079:
            r13 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r13 == 0) goto L_0x007f
            r13 = 1
            goto L_0x0081
        L_0x007f:
            r13 = r36
        L_0x0081:
            r44 = r13
            r13 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L_0x0089
            r13 = 0
            goto L_0x008b
        L_0x0089:
            r13 = r37
        L_0x008b:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r0 & r16
            if (r16 == 0) goto L_0x0095
            r16 = 0
            goto L_0x0097
        L_0x0095:
            r16 = r38
        L_0x0097:
            r17 = 65536(0x10000, float:9.18355E-41)
            r17 = r0 & r17
            if (r17 == 0) goto L_0x00a0
            r17 = 0
            goto L_0x00a2
        L_0x00a0:
            r17 = r39
        L_0x00a2:
            r18 = 131072(0x20000, float:1.83671E-40)
            r18 = r0 & r18
            if (r18 == 0) goto L_0x00ab
            r18 = 0
            goto L_0x00ad
        L_0x00ab:
            r18 = r40
        L_0x00ad:
            r19 = 262144(0x40000, float:3.67342E-40)
            r19 = r0 & r19
            if (r19 == 0) goto L_0x00b6
            r19 = 0
            goto L_0x00b8
        L_0x00b6:
            r19 = r41
        L_0x00b8:
            r20 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r20
            if (r0 == 0) goto L_0x00c0
            r0 = 0
            goto L_0x00c2
        L_0x00c0:
            r0 = r42
        L_0x00c2:
            r22 = r21
            r23 = r1
            r25 = r3
            r26 = r4
            r27 = r6
            r28 = r7
            r29 = r8
            r30 = r9
            r31 = r10
            r32 = r11
            r33 = r12
            r34 = r14
            r35 = r15
            r36 = r5
            r37 = r44
            r38 = r13
            r39 = r16
            r40 = r17
            r41 = r18
            r42 = r19
            r43 = r0
            r22.<init>(r23, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.database.DatabaseScene.<init>(long, java.util.UUID, int, java.util.UUID, java.lang.String, java.time.Instant, java.time.Instant, com.sugarcube.app.base.data.database.SceneState, int, com.sugarcube.core.network.models.Manifest, java.lang.String, boolean, java.util.UUID, boolean, java.time.Instant, java.util.UUID, int, com.sugarcube.core.network.models.RoomType, java.util.UUID, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
