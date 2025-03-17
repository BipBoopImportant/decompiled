package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010&\u001a\u00020\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\u0010\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0010\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010+\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jj\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\rHÖ\u0001J\t\u00101\u001a\u000202HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lcom/sugarcube/core/network/models/UploadSetState;", "", "uuid", "Ljava/util/UUID;", "urls", "", "Lcom/sugarcube/core/network/models/UploadURL;", "completed", "", "createdAt", "Ljava/time/Instant;", "lastModifiedTs", "user", "", "resumable", "properties", "Lcom/sugarcube/core/network/models/UploadProperties;", "<init>", "(Ljava/util/UUID;Ljava/util/List;ZLjava/time/Instant;Ljava/time/Instant;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sugarcube/core/network/models/UploadProperties;)V", "getUuid", "()Ljava/util/UUID;", "getUrls", "()Ljava/util/List;", "getCompleted", "()Z", "getCreatedAt", "()Ljava/time/Instant;", "getLastModifiedTs", "getUser", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getResumable", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProperties", "()Lcom/sugarcube/core/network/models/UploadProperties;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/UUID;Ljava/util/List;ZLjava/time/Instant;Ljava/time/Instant;Ljava/lang/Integer;Ljava/lang/Boolean;Lcom/sugarcube/core/network/models/UploadProperties;)Lcom/sugarcube/core/network/models/UploadSetState;", "equals", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class UploadSetState {
    private final boolean completed;
    private final Instant createdAt;
    private final Instant lastModifiedTs;
    private final UploadProperties properties;
    private final Boolean resumable;
    private final List<UploadURL> urls;
    private final Integer user;
    private final UUID uuid;

    public UploadSetState() {
        this((UUID) null, (List) null, false, (Instant) null, (Instant) null, (Integer) null, (Boolean) null, (UploadProperties) null, 255, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ UploadSetState copy$default(UploadSetState uploadSetState, UUID uuid2, List list, boolean z10, Instant instant, Instant instant2, Integer num, Boolean bool, UploadProperties uploadProperties, int i10, Object obj) {
        UploadSetState uploadSetState2 = uploadSetState;
        int i11 = i10;
        return uploadSetState.copy((i11 & 1) != 0 ? uploadSetState2.uuid : uuid2, (i11 & 2) != 0 ? uploadSetState2.urls : list, (i11 & 4) != 0 ? uploadSetState2.completed : z10, (i11 & 8) != 0 ? uploadSetState2.createdAt : instant, (i11 & 16) != 0 ? uploadSetState2.lastModifiedTs : instant2, (i11 & 32) != 0 ? uploadSetState2.user : num, (i11 & 64) != 0 ? uploadSetState2.resumable : bool, (i11 & 128) != 0 ? uploadSetState2.properties : uploadProperties);
    }

    public final UUID component1() {
        return this.uuid;
    }

    public final List<UploadURL> component2() {
        return this.urls;
    }

    public final boolean component3() {
        return this.completed;
    }

    public final Instant component4() {
        return this.createdAt;
    }

    public final Instant component5() {
        return this.lastModifiedTs;
    }

    public final Integer component6() {
        return this.user;
    }

    public final Boolean component7() {
        return this.resumable;
    }

    public final UploadProperties component8() {
        return this.properties;
    }

    public final UploadSetState copy(UUID uuid2, List<UploadURL> list, boolean z10, Instant instant, Instant instant2, Integer num, Boolean bool, UploadProperties uploadProperties) {
        C17542s.j(uuid2, "uuid");
        C17542s.j(list, "urls");
        C17542s.j(instant, "createdAt");
        C17542s.j(instant2, "lastModifiedTs");
        return new UploadSetState(uuid2, list, z10, instant, instant2, num, bool, uploadProperties);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadSetState)) {
            return false;
        }
        UploadSetState uploadSetState = (UploadSetState) obj;
        return C17542s.e(this.uuid, uploadSetState.uuid) && C17542s.e(this.urls, uploadSetState.urls) && this.completed == uploadSetState.completed && C17542s.e(this.createdAt, uploadSetState.createdAt) && C17542s.e(this.lastModifiedTs, uploadSetState.lastModifiedTs) && C17542s.e(this.user, uploadSetState.user) && C17542s.e(this.resumable, uploadSetState.resumable) && C17542s.e(this.properties, uploadSetState.properties);
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final Instant getLastModifiedTs() {
        return this.lastModifiedTs;
    }

    public final UploadProperties getProperties() {
        return this.properties;
    }

    public final Boolean getResumable() {
        return this.resumable;
    }

    public final List<UploadURL> getUrls() {
        return this.urls;
    }

    public final Integer getUser() {
        return this.user;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode = ((((((((this.uuid.hashCode() * 31) + this.urls.hashCode()) * 31) + Boolean.hashCode(this.completed)) * 31) + this.createdAt.hashCode()) * 31) + this.lastModifiedTs.hashCode()) * 31;
        Integer num = this.user;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.resumable;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        UploadProperties uploadProperties = this.properties;
        if (uploadProperties != null) {
            i10 = uploadProperties.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        UUID uuid2 = this.uuid;
        List<UploadURL> list = this.urls;
        boolean z10 = this.completed;
        Instant instant = this.createdAt;
        Instant instant2 = this.lastModifiedTs;
        Integer num = this.user;
        Boolean bool = this.resumable;
        UploadProperties uploadProperties = this.properties;
        return "UploadSetState(uuid=" + uuid2 + ", urls=" + list + ", completed=" + z10 + ", createdAt=" + instant + ", lastModifiedTs=" + instant2 + ", user=" + num + ", resumable=" + bool + ", properties=" + uploadProperties + ")";
    }

    public UploadSetState(UUID uuid2, List<UploadURL> list, boolean z10, Instant instant, Instant instant2, Integer num, Boolean bool, UploadProperties uploadProperties) {
        C17542s.j(uuid2, "uuid");
        C17542s.j(list, "urls");
        C17542s.j(instant, "createdAt");
        C17542s.j(instant2, "lastModifiedTs");
        this.uuid = uuid2;
        this.urls = list;
        this.completed = z10;
        this.createdAt = instant;
        this.lastModifiedTs = instant2;
        this.user = num;
        this.resumable = bool;
        this.properties = uploadProperties;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ UploadSetState(java.util.UUID r10, java.util.List r11, boolean r12, java.time.Instant r13, java.time.Instant r14, java.lang.Integer r15, java.lang.Boolean r16, com.sugarcube.core.network.models.UploadProperties r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            if (r1 == 0) goto L_0x000b
            java.util.UUID r1 = java.util.UUID.randomUUID()
            goto L_0x000c
        L_0x000b:
            r1 = r10
        L_0x000c:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0015
            java.util.List r2 = YH.C16877v.n()
            goto L_0x0016
        L_0x0015:
            r2 = r11
        L_0x0016:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001c
            r3 = 0
            goto L_0x001d
        L_0x001c:
            r3 = r12
        L_0x001d:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0026
            java.time.Instant r4 = java.time.Instant.now()
            goto L_0x0027
        L_0x0026:
            r4 = r13
        L_0x0027:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0030
            java.time.Instant r5 = java.time.Instant.now()
            goto L_0x0031
        L_0x0030:
            r5 = r14
        L_0x0031:
            r6 = r0 & 32
            r7 = 0
            if (r6 == 0) goto L_0x0038
            r6 = r7
            goto L_0x0039
        L_0x0038:
            r6 = r15
        L_0x0039:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0040
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            goto L_0x0042
        L_0x0040:
            r8 = r16
        L_0x0042:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r7 = r17
        L_0x0049:
            r10 = r9
            r11 = r1
            r12 = r2
            r13 = r3
            r14 = r4
            r15 = r5
            r16 = r6
            r17 = r8
            r18 = r7
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.UploadSetState.<init>(java.util.UUID, java.util.List, boolean, java.time.Instant, java.time.Instant, java.lang.Integer, java.lang.Boolean, com.sugarcube.core.network.models.UploadProperties, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
