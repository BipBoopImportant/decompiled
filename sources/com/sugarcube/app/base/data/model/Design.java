package com.sugarcube.app.base.data.model;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0013R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/sugarcube/app/base/data/model/Design;", "", "name", "", "uuid", "Ljava/util/UUID;", "roomId", "", "isShowroom", "", "compositionUUID", "<init>", "(Ljava/lang/String;Ljava/util/UUID;IZLjava/util/UUID;)V", "getName", "()Ljava/lang/String;", "getUuid", "()Ljava/util/UUID;", "getRoomId", "()I", "()Z", "getCompositionUUID", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Design {
    public static final int $stable = 8;
    private final UUID compositionUUID;
    private final boolean isShowroom;
    private final String name;
    private final int roomId;
    private final UUID uuid;

    public Design(String str, UUID uuid2, int i10, boolean z10, UUID uuid3) {
        C17542s.j(str, "name");
        C17542s.j(uuid2, "uuid");
        this.name = str;
        this.uuid = uuid2;
        this.roomId = i10;
        this.isShowroom = z10;
        this.compositionUUID = uuid3;
    }

    public static /* synthetic */ Design copy$default(Design design, String str, UUID uuid2, int i10, boolean z10, UUID uuid3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = design.name;
        }
        if ((i11 & 2) != 0) {
            uuid2 = design.uuid;
        }
        UUID uuid4 = uuid2;
        if ((i11 & 4) != 0) {
            i10 = design.roomId;
        }
        int i12 = i10;
        if ((i11 & 8) != 0) {
            z10 = design.isShowroom;
        }
        boolean z11 = z10;
        if ((i11 & 16) != 0) {
            uuid3 = design.compositionUUID;
        }
        return design.copy(str, uuid4, i12, z11, uuid3);
    }

    public final String component1() {
        return this.name;
    }

    public final UUID component2() {
        return this.uuid;
    }

    public final int component3() {
        return this.roomId;
    }

    public final boolean component4() {
        return this.isShowroom;
    }

    public final UUID component5() {
        return this.compositionUUID;
    }

    public final Design copy(String str, UUID uuid2, int i10, boolean z10, UUID uuid3) {
        C17542s.j(str, "name");
        C17542s.j(uuid2, "uuid");
        return new Design(str, uuid2, i10, z10, uuid3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Design)) {
            return false;
        }
        Design design = (Design) obj;
        return C17542s.e(this.name, design.name) && C17542s.e(this.uuid, design.uuid) && this.roomId == design.roomId && this.isShowroom == design.isShowroom && C17542s.e(this.compositionUUID, design.compositionUUID);
    }

    public final UUID getCompositionUUID() {
        return this.compositionUUID;
    }

    public final String getName() {
        return this.name;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    public final UUID getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        int hashCode = ((((((this.name.hashCode() * 31) + this.uuid.hashCode()) * 31) + Integer.hashCode(this.roomId)) * 31) + Boolean.hashCode(this.isShowroom)) * 31;
        UUID uuid2 = this.compositionUUID;
        return hashCode + (uuid2 == null ? 0 : uuid2.hashCode());
    }

    public final boolean isShowroom() {
        return this.isShowroom;
    }

    public String toString() {
        String str = this.name;
        UUID uuid2 = this.uuid;
        int i10 = this.roomId;
        boolean z10 = this.isShowroom;
        UUID uuid3 = this.compositionUUID;
        return "Design(name=" + str + ", uuid=" + uuid2 + ", roomId=" + i10 + ", isShowroom=" + z10 + ", compositionUUID=" + uuid3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Design(String str, UUID uuid2, int i10, boolean z10, UUID uuid3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, uuid2, i10, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? null : uuid3);
    }
}
