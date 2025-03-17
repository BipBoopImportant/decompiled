package com.sugarcube.core.network.models;

import HJ.C15854t;
import com.squareup.moshi.g;
import com.sugarcube.core.network.models.RoomType;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u0000 ,2\u00020\u0001:\u0001,BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ji\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013¨\u0006-"}, d2 = {"Lcom/sugarcube/core/network/models/CreateSceneRequest;", "", "uploadUUID", "Ljava/util/UUID;", "name", "", "roomType", "sessionMeta", "Lcom/sugarcube/core/network/models/SessionMeta;", "captureMetaSha256", "clientCapturedAt", "appType", "pipelineName", "pipelineType", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/SessionMeta;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUploadUUID", "()Ljava/util/UUID;", "getName", "()Ljava/lang/String;", "getRoomType", "getSessionMeta", "()Lcom/sugarcube/core/network/models/SessionMeta;", "getCaptureMetaSha256", "getClientCapturedAt", "getAppType", "getPipelineName", "getPipelineType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CreateSceneRequest {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String appType;
    private final String captureMetaSha256;
    private final String clientCapturedAt;
    private final String name;
    private final String pipelineName;
    private final String pipelineType;
    private final String roomType;
    private final SessionMeta sessionMeta;
    private final UUID uploadUUID;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\tJN\u0010\u0004\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\t¨\u0006\u0013"}, d2 = {"Lcom/sugarcube/core/network/models/CreateSceneRequest$Companion;", "", "<init>", "()V", "newInstance", "Lcom/sugarcube/core/network/models/CreateSceneRequest;", "uuid", "Ljava/util/UUID;", "name", "", "roomType", "Lcom/sugarcube/core/network/models/RoomType;", "sessionMeta", "Lcom/sugarcube/core/network/models/SessionMeta;", "captureMetaSha256", "appType", "pipelineName", "creation", "Ljava/time/Instant;", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CreateSceneRequest newInstance$default(Companion companion, UUID uuid, String str, RoomType roomType, SessionMeta sessionMeta, String str2, String str3, String str4, int i10, Object obj) {
            return companion.newInstance(uuid, str, roomType, sessionMeta, str2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4);
        }

        public final CreateSceneRequest newInstance(UUID uuid, String str, RoomType roomType, SessionMeta sessionMeta, String str2, String str3, String str4) {
            C17542s.j(uuid, "uuid");
            C17542s.j(str, "name");
            RoomType roomType2 = roomType;
            C17542s.j(roomType, "roomType");
            C17542s.j(sessionMeta, "sessionMeta");
            String str5 = str2;
            C17542s.j(str5, "captureMetaSha256");
            String upperCase = roomType.getApiKey().toUpperCase(Locale.ROOT);
            C17542s.i(upperCase, "toUpperCase(...)");
            return new CreateSceneRequest(uuid, str, upperCase, sessionMeta, str5, sessionMeta.getCaptureTimestamp(), str3, str4, (String) null);
        }

        private Companion() {
        }

        public static /* synthetic */ CreateSceneRequest newInstance$default(Companion companion, SessionMeta sessionMeta, UUID uuid, String str, String str2, Instant instant, String str3, String str4, int i10, Object obj) {
            UUID randomUUID = (i10 & 2) != 0 ? UUID.randomUUID() : uuid;
            String str5 = (i10 & 4) != 0 ? "UNKNOWN" : str;
            String str6 = (i10 & 8) != 0 ? "0123456789abcdef" : str2;
            Instant now = (i10 & 16) != 0 ? Instant.now() : instant;
            String str7 = null;
            String str8 = (i10 & 32) != 0 ? null : str3;
            if ((i10 & 64) == 0) {
                str7 = str4;
            }
            return companion.newInstance(sessionMeta, randomUUID, str5, str6, now, str8, str7);
        }

        public final CreateSceneRequest newInstance(SessionMeta sessionMeta, UUID uuid, String str, String str2, Instant instant, String str3, String str4) {
            String str5 = str;
            Instant instant2 = instant;
            SessionMeta sessionMeta2 = sessionMeta;
            C17542s.j(sessionMeta2, "sessionMeta");
            C17542s.j(uuid, "uuid");
            C17542s.j(str5, "name");
            String str6 = str2;
            C17542s.j(str6, "captureMetaSha256");
            C17542s.j(instant2, "creation");
            RoomType.Companion companion = RoomType.Companion;
            Locale locale = Locale.ROOT;
            String upperCase = str5.toUpperCase(locale);
            C17542s.i(upperCase, "toUpperCase(...)");
            String upperCase2 = companion.getTypeFromKey(C15854t.P(upperCase, ' ', '_', false, 4, (Object) null)).getApiKey().toUpperCase(locale);
            C17542s.i(upperCase2, "toUpperCase(...)");
            String format = DateTimeFormatter.ISO_INSTANT.format(instant2);
            C17542s.i(format, "format(...)");
            return new CreateSceneRequest(uuid, str5, upperCase2, sessionMeta2, str6, format, str3, str4, (String) null);
        }
    }

    public CreateSceneRequest(UUID uuid, String str, String str2, SessionMeta sessionMeta2, String str3, String str4, String str5, String str6, String str7) {
        C17542s.j(uuid, "uploadUUID");
        C17542s.j(str, "name");
        C17542s.j(str2, "roomType");
        C17542s.j(sessionMeta2, "sessionMeta");
        C17542s.j(str3, "captureMetaSha256");
        C17542s.j(str4, "clientCapturedAt");
        this.uploadUUID = uuid;
        this.name = str;
        this.roomType = str2;
        this.sessionMeta = sessionMeta2;
        this.captureMetaSha256 = str3;
        this.clientCapturedAt = str4;
        this.appType = str5;
        this.pipelineName = str6;
        this.pipelineType = str7;
    }

    public static /* synthetic */ CreateSceneRequest copy$default(CreateSceneRequest createSceneRequest, UUID uuid, String str, String str2, SessionMeta sessionMeta2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
        CreateSceneRequest createSceneRequest2 = createSceneRequest;
        int i11 = i10;
        return createSceneRequest.copy((i11 & 1) != 0 ? createSceneRequest2.uploadUUID : uuid, (i11 & 2) != 0 ? createSceneRequest2.name : str, (i11 & 4) != 0 ? createSceneRequest2.roomType : str2, (i11 & 8) != 0 ? createSceneRequest2.sessionMeta : sessionMeta2, (i11 & 16) != 0 ? createSceneRequest2.captureMetaSha256 : str3, (i11 & 32) != 0 ? createSceneRequest2.clientCapturedAt : str4, (i11 & 64) != 0 ? createSceneRequest2.appType : str5, (i11 & 128) != 0 ? createSceneRequest2.pipelineName : str6, (i11 & 256) != 0 ? createSceneRequest2.pipelineType : str7);
    }

    public final UUID component1() {
        return this.uploadUUID;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.roomType;
    }

    public final SessionMeta component4() {
        return this.sessionMeta;
    }

    public final String component5() {
        return this.captureMetaSha256;
    }

    public final String component6() {
        return this.clientCapturedAt;
    }

    public final String component7() {
        return this.appType;
    }

    public final String component8() {
        return this.pipelineName;
    }

    public final String component9() {
        return this.pipelineType;
    }

    public final CreateSceneRequest copy(UUID uuid, String str, String str2, SessionMeta sessionMeta2, String str3, String str4, String str5, String str6, String str7) {
        C17542s.j(uuid, "uploadUUID");
        C17542s.j(str, "name");
        C17542s.j(str2, "roomType");
        C17542s.j(sessionMeta2, "sessionMeta");
        String str8 = str3;
        C17542s.j(str8, "captureMetaSha256");
        String str9 = str4;
        C17542s.j(str9, "clientCapturedAt");
        return new CreateSceneRequest(uuid, str, str2, sessionMeta2, str8, str9, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateSceneRequest)) {
            return false;
        }
        CreateSceneRequest createSceneRequest = (CreateSceneRequest) obj;
        return C17542s.e(this.uploadUUID, createSceneRequest.uploadUUID) && C17542s.e(this.name, createSceneRequest.name) && C17542s.e(this.roomType, createSceneRequest.roomType) && C17542s.e(this.sessionMeta, createSceneRequest.sessionMeta) && C17542s.e(this.captureMetaSha256, createSceneRequest.captureMetaSha256) && C17542s.e(this.clientCapturedAt, createSceneRequest.clientCapturedAt) && C17542s.e(this.appType, createSceneRequest.appType) && C17542s.e(this.pipelineName, createSceneRequest.pipelineName) && C17542s.e(this.pipelineType, createSceneRequest.pipelineType);
    }

    public final String getAppType() {
        return this.appType;
    }

    public final String getCaptureMetaSha256() {
        return this.captureMetaSha256;
    }

    public final String getClientCapturedAt() {
        return this.clientCapturedAt;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPipelineName() {
        return this.pipelineName;
    }

    public final String getPipelineType() {
        return this.pipelineType;
    }

    public final String getRoomType() {
        return this.roomType;
    }

    public final SessionMeta getSessionMeta() {
        return this.sessionMeta;
    }

    public final UUID getUploadUUID() {
        return this.uploadUUID;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.uploadUUID.hashCode() * 31) + this.name.hashCode()) * 31) + this.roomType.hashCode()) * 31) + this.sessionMeta.hashCode()) * 31) + this.captureMetaSha256.hashCode()) * 31) + this.clientCapturedAt.hashCode()) * 31;
        String str = this.appType;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pipelineName;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pipelineType;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        UUID uuid = this.uploadUUID;
        String str = this.name;
        String str2 = this.roomType;
        SessionMeta sessionMeta2 = this.sessionMeta;
        String str3 = this.captureMetaSha256;
        String str4 = this.clientCapturedAt;
        String str5 = this.appType;
        String str6 = this.pipelineName;
        String str7 = this.pipelineType;
        return "CreateSceneRequest(uploadUUID=" + uuid + ", name=" + str + ", roomType=" + str2 + ", sessionMeta=" + sessionMeta2 + ", captureMetaSha256=" + str3 + ", clientCapturedAt=" + str4 + ", appType=" + str5 + ", pipelineName=" + str6 + ", pipelineType=" + str7 + ")";
    }
}
