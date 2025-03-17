package com.sugarcube.core.network.models;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b<\b\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010(J\t\u0010E\u001a\u00020\u000bHÆ\u0003J\u0011\u0010F\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003J\t\u0010G\u001a\u00020\u0010HÆ\u0003J\t\u0010H\u001a\u00020\u0010HÆ\u0003J\t\u0010I\u001a\u00020\u0013HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010K\u001a\u00020\u0013HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u000bHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u0017\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001cHÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003Jè\u0001\u0010R\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010SJ\u0013\u0010T\u001a\u00020\u00132\b\u0010U\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010V\u001a\u00020\u0003HÖ\u0001J\t\u0010W\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010%R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010)\u001a\u0004\b'\u0010(R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b0\u0010/R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u00101R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b2\u0010%R\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u00101R\u0011\u0010\u0016\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b4\u0010+R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b5\u0010#R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u001c¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b:\u0010%R\u0013\u0010;\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b<\u0010#R\u0011\u0010=\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b=\u00101R\u0011\u0010>\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b>\u00101R\u0011\u0010?\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b?\u00101¨\u0006X"}, d2 = {"Lcom/sugarcube/core/network/models/Composition;", "", "compositionId", "", "name", "", "baseImageUrl", "Landroid/net/Uri;", "thumbnailUrl", "wid", "compositionUuid", "Ljava/util/UUID;", "placedFurnitureSet", "", "Lcom/sugarcube/core/network/models/PlacedFurniture;", "createdAt", "Ljava/time/Instant;", "lastModifiedTs", "isShared", "", "publicCompositionImageUrl", "isStock", "sceneId", "sceneUuid", "baseImageData", "savedProperties", "Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "gltf", "", "shareUrl", "<init>", "(ILjava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Integer;Ljava/util/UUID;Ljava/util/List;Ljava/time/Instant;Ljava/time/Instant;ZLandroid/net/Uri;ZILjava/util/UUID;Ljava/lang/String;Lcom/sugarcube/core/network/models/CompositionSavedProperties;Ljava/util/Map;Landroid/net/Uri;)V", "getCompositionId", "()I", "getName", "()Ljava/lang/String;", "getBaseImageUrl", "()Landroid/net/Uri;", "getThumbnailUrl", "getWid", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCompositionUuid", "()Ljava/util/UUID;", "getPlacedFurnitureSet", "()Ljava/util/List;", "getCreatedAt", "()Ljava/time/Instant;", "getLastModifiedTs", "()Z", "getPublicCompositionImageUrl", "getSceneId", "getSceneUuid", "getBaseImageData", "getSavedProperties", "()Lcom/sugarcube/core/network/models/CompositionSavedProperties;", "getGltf", "()Ljava/util/Map;", "getShareUrl", "displayName", "getDisplayName", "isDownload3D", "isUpload3D", "isLegacy2D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(ILjava/lang/String;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/Integer;Ljava/util/UUID;Ljava/util/List;Ljava/time/Instant;Ljava/time/Instant;ZLandroid/net/Uri;ZILjava/util/UUID;Ljava/lang/String;Lcom/sugarcube/core/network/models/CompositionSavedProperties;Ljava/util/Map;Landroid/net/Uri;)Lcom/sugarcube/core/network/models/Composition;", "equals", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class Composition {
    private final String baseImageData;
    private final Uri baseImageUrl;
    private final int compositionId;
    private final UUID compositionUuid;
    private final Instant createdAt;
    private final Map<String, Object> gltf;
    private final boolean isShared;
    private final boolean isStock;
    private final Instant lastModifiedTs;
    private final String name;
    private final List<PlacedFurniture> placedFurnitureSet;
    private final Uri publicCompositionImageUrl;
    private final CompositionSavedProperties savedProperties;
    private final int sceneId;
    private final UUID sceneUuid;
    private final Uri shareUrl;
    private final Uri thumbnailUrl;
    private final Integer wid;

    public Composition(int i10, String str, Uri uri, Uri uri2, Integer num, @e(name = "uuid") UUID uuid, @e(name = "placedfurnitureSet") List<PlacedFurniture> list, Instant instant, Instant instant2, boolean z10, Uri uri3, boolean z11, int i11, UUID uuid2, @e(name = "baseImageData") String str2, @e(name = "savedProperties") CompositionSavedProperties compositionSavedProperties, Map<String, ? extends Object> map, Uri uri4) {
        UUID uuid3 = uuid2;
        C17542s.j(uuid, "compositionUuid");
        C17542s.j(instant, "createdAt");
        C17542s.j(instant2, "lastModifiedTs");
        C17542s.j(uuid3, "sceneUuid");
        this.compositionId = i10;
        this.name = str;
        this.baseImageUrl = uri;
        this.thumbnailUrl = uri2;
        this.wid = num;
        this.compositionUuid = uuid;
        this.placedFurnitureSet = list;
        this.createdAt = instant;
        this.lastModifiedTs = instant2;
        this.isShared = z10;
        this.publicCompositionImageUrl = uri3;
        this.isStock = z11;
        this.sceneId = i11;
        this.sceneUuid = uuid3;
        this.baseImageData = str2;
        this.savedProperties = compositionSavedProperties;
        this.gltf = map;
        this.shareUrl = uri4;
    }

    public static /* synthetic */ Composition copy$default(Composition composition, int i10, String str, Uri uri, Uri uri2, Integer num, UUID uuid, List list, Instant instant, Instant instant2, boolean z10, Uri uri3, boolean z11, int i11, UUID uuid2, String str2, CompositionSavedProperties compositionSavedProperties, Map map, Uri uri4, int i12, Object obj) {
        Composition composition2 = composition;
        int i13 = i12;
        return composition.copy((i13 & 1) != 0 ? composition2.compositionId : i10, (i13 & 2) != 0 ? composition2.name : str, (i13 & 4) != 0 ? composition2.baseImageUrl : uri, (i13 & 8) != 0 ? composition2.thumbnailUrl : uri2, (i13 & 16) != 0 ? composition2.wid : num, (i13 & 32) != 0 ? composition2.compositionUuid : uuid, (i13 & 64) != 0 ? composition2.placedFurnitureSet : list, (i13 & 128) != 0 ? composition2.createdAt : instant, (i13 & 256) != 0 ? composition2.lastModifiedTs : instant2, (i13 & 512) != 0 ? composition2.isShared : z10, (i13 & 1024) != 0 ? composition2.publicCompositionImageUrl : uri3, (i13 & RecyclerView.n.FLAG_MOVED) != 0 ? composition2.isStock : z11, (i13 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? composition2.sceneId : i11, (i13 & 8192) != 0 ? composition2.sceneUuid : uuid2, (i13 & 16384) != 0 ? composition2.baseImageData : str2, (i13 & 32768) != 0 ? composition2.savedProperties : compositionSavedProperties, (i13 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 0 ? composition2.gltf : map, (i13 & 131072) != 0 ? composition2.shareUrl : uri4);
    }

    public final int component1() {
        return this.compositionId;
    }

    public final boolean component10() {
        return this.isShared;
    }

    public final Uri component11() {
        return this.publicCompositionImageUrl;
    }

    public final boolean component12() {
        return this.isStock;
    }

    public final int component13() {
        return this.sceneId;
    }

    public final UUID component14() {
        return this.sceneUuid;
    }

    public final String component15() {
        return this.baseImageData;
    }

    public final CompositionSavedProperties component16() {
        return this.savedProperties;
    }

    public final Map<String, Object> component17() {
        return this.gltf;
    }

    public final Uri component18() {
        return this.shareUrl;
    }

    public final String component2() {
        return this.name;
    }

    public final Uri component3() {
        return this.baseImageUrl;
    }

    public final Uri component4() {
        return this.thumbnailUrl;
    }

    public final Integer component5() {
        return this.wid;
    }

    public final UUID component6() {
        return this.compositionUuid;
    }

    public final List<PlacedFurniture> component7() {
        return this.placedFurnitureSet;
    }

    public final Instant component8() {
        return this.createdAt;
    }

    public final Instant component9() {
        return this.lastModifiedTs;
    }

    public final Composition copy(int i10, String str, Uri uri, Uri uri2, Integer num, @e(name = "uuid") UUID uuid, @e(name = "placedfurnitureSet") List<PlacedFurniture> list, Instant instant, Instant instant2, boolean z10, Uri uri3, boolean z11, int i11, UUID uuid2, @e(name = "baseImageData") String str2, @e(name = "savedProperties") CompositionSavedProperties compositionSavedProperties, Map<String, ? extends Object> map, Uri uri4) {
        int i12 = i10;
        C17542s.j(uuid, "compositionUuid");
        C17542s.j(instant, "createdAt");
        C17542s.j(instant2, "lastModifiedTs");
        C17542s.j(uuid2, "sceneUuid");
        return new Composition(i10, str, uri, uri2, num, uuid, list, instant, instant2, z10, uri3, z11, i11, uuid2, str2, compositionSavedProperties, map, uri4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Composition)) {
            return false;
        }
        Composition composition = (Composition) obj;
        return this.compositionId == composition.compositionId && C17542s.e(this.name, composition.name) && C17542s.e(this.baseImageUrl, composition.baseImageUrl) && C17542s.e(this.thumbnailUrl, composition.thumbnailUrl) && C17542s.e(this.wid, composition.wid) && C17542s.e(this.compositionUuid, composition.compositionUuid) && C17542s.e(this.placedFurnitureSet, composition.placedFurnitureSet) && C17542s.e(this.createdAt, composition.createdAt) && C17542s.e(this.lastModifiedTs, composition.lastModifiedTs) && this.isShared == composition.isShared && C17542s.e(this.publicCompositionImageUrl, composition.publicCompositionImageUrl) && this.isStock == composition.isStock && this.sceneId == composition.sceneId && C17542s.e(this.sceneUuid, composition.sceneUuid) && C17542s.e(this.baseImageData, composition.baseImageData) && C17542s.e(this.savedProperties, composition.savedProperties) && C17542s.e(this.gltf, composition.gltf) && C17542s.e(this.shareUrl, composition.shareUrl);
    }

    public final String getBaseImageData() {
        return this.baseImageData;
    }

    public final Uri getBaseImageUrl() {
        return this.baseImageUrl;
    }

    public final int getCompositionId() {
        return this.compositionId;
    }

    public final UUID getCompositionUuid() {
        return this.compositionUuid;
    }

    public final Instant getCreatedAt() {
        return this.createdAt;
    }

    public final String getDisplayName() {
        String str = this.name;
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.name;
    }

    public final Map<String, Object> getGltf() {
        return this.gltf;
    }

    public final Instant getLastModifiedTs() {
        return this.lastModifiedTs;
    }

    public final String getName() {
        return this.name;
    }

    public final List<PlacedFurniture> getPlacedFurnitureSet() {
        return this.placedFurnitureSet;
    }

    public final Uri getPublicCompositionImageUrl() {
        return this.publicCompositionImageUrl;
    }

    public final CompositionSavedProperties getSavedProperties() {
        return this.savedProperties;
    }

    public final int getSceneId() {
        return this.sceneId;
    }

    public final UUID getSceneUuid() {
        return this.sceneUuid;
    }

    public final Uri getShareUrl() {
        return this.shareUrl;
    }

    public final Uri getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final Integer getWid() {
        return this.wid;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.compositionId) * 31;
        String str = this.name;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Uri uri = this.baseImageUrl;
        int hashCode3 = (hashCode2 + (uri == null ? 0 : uri.hashCode())) * 31;
        Uri uri2 = this.thumbnailUrl;
        int hashCode4 = (hashCode3 + (uri2 == null ? 0 : uri2.hashCode())) * 31;
        Integer num = this.wid;
        int hashCode5 = (((hashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.compositionUuid.hashCode()) * 31;
        List<PlacedFurniture> list = this.placedFurnitureSet;
        int hashCode6 = (((((((hashCode5 + (list == null ? 0 : list.hashCode())) * 31) + this.createdAt.hashCode()) * 31) + this.lastModifiedTs.hashCode()) * 31) + Boolean.hashCode(this.isShared)) * 31;
        Uri uri3 = this.publicCompositionImageUrl;
        int hashCode7 = (((((((hashCode6 + (uri3 == null ? 0 : uri3.hashCode())) * 31) + Boolean.hashCode(this.isStock)) * 31) + Integer.hashCode(this.sceneId)) * 31) + this.sceneUuid.hashCode()) * 31;
        String str2 = this.baseImageData;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CompositionSavedProperties compositionSavedProperties = this.savedProperties;
        int hashCode9 = (hashCode8 + (compositionSavedProperties == null ? 0 : compositionSavedProperties.hashCode())) * 31;
        Map<String, Object> map = this.gltf;
        int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
        Uri uri4 = this.shareUrl;
        if (uri4 != null) {
            i10 = uri4.hashCode();
        }
        return hashCode10 + i10;
    }

    public final boolean isDownload3D() {
        Map<String, Object> map = this.gltf;
        return map != null && (map.isEmpty() ^ true);
    }

    public final boolean isLegacy2D() {
        List<PlacedFurniture> list = this.placedFurnitureSet;
        return list != null && !list.isEmpty() && list.get(0).getHeadingI() == null;
    }

    public final boolean isShared() {
        return this.isShared;
    }

    public final boolean isStock() {
        return this.isStock;
    }

    public final boolean isUpload3D() {
        List<PlacedFurniture> list = this.placedFurnitureSet;
        return (list == null || list.isEmpty() || list.get(0).getHeadingI() == null) ? false : true;
    }

    public String toString() {
        int i10 = this.compositionId;
        String str = this.name;
        Uri uri = this.baseImageUrl;
        Uri uri2 = this.thumbnailUrl;
        Integer num = this.wid;
        UUID uuid = this.compositionUuid;
        List<PlacedFurniture> list = this.placedFurnitureSet;
        Instant instant = this.createdAt;
        Instant instant2 = this.lastModifiedTs;
        boolean z10 = this.isShared;
        Uri uri3 = this.publicCompositionImageUrl;
        boolean z11 = this.isStock;
        int i11 = this.sceneId;
        UUID uuid2 = this.sceneUuid;
        String str2 = this.baseImageData;
        CompositionSavedProperties compositionSavedProperties = this.savedProperties;
        Map<String, Object> map = this.gltf;
        Uri uri4 = this.shareUrl;
        return "Composition(compositionId=" + i10 + ", name=" + str + ", baseImageUrl=" + uri + ", thumbnailUrl=" + uri2 + ", wid=" + num + ", compositionUuid=" + uuid + ", placedFurnitureSet=" + list + ", createdAt=" + instant + ", lastModifiedTs=" + instant2 + ", isShared=" + z10 + ", publicCompositionImageUrl=" + uri3 + ", isStock=" + z11 + ", sceneId=" + i11 + ", sceneUuid=" + uuid2 + ", baseImageData=" + str2 + ", savedProperties=" + compositionSavedProperties + ", gltf=" + map + ", shareUrl=" + uri4 + ")";
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Composition(int r22, java.lang.String r23, android.net.Uri r24, android.net.Uri r25, java.lang.Integer r26, java.util.UUID r27, java.util.List r28, java.time.Instant r29, java.time.Instant r30, boolean r31, android.net.Uri r32, boolean r33, int r34, java.util.UUID r35, java.lang.String r36, com.sugarcube.core.network.models.CompositionSavedProperties r37, java.util.Map r38, android.net.Uri r39, int r40, kotlin.jvm.internal.DefaultConstructorMarker r41) {
        /*
            r21 = this;
            r0 = r40
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            java.lang.String r1 = ""
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r23
        L_0x000c:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r5 = r2
            goto L_0x0015
        L_0x0013:
            r5 = r24
        L_0x0015:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x001b
            r6 = r2
            goto L_0x001d
        L_0x001b:
            r6 = r25
        L_0x001d:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0023
            r7 = r2
            goto L_0x0025
        L_0x0023:
            r7 = r26
        L_0x0025:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r9 = r2
            goto L_0x002d
        L_0x002b:
            r9 = r28
        L_0x002d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0033
            r13 = r2
            goto L_0x0035
        L_0x0033:
            r13 = r32
        L_0x0035:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x003c
            r17 = r2
            goto L_0x003e
        L_0x003c:
            r17 = r36
        L_0x003e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0047
            r18 = r2
            goto L_0x0049
        L_0x0047:
            r18 = r37
        L_0x0049:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0051
            r19 = r2
            goto L_0x0053
        L_0x0051:
            r19 = r38
        L_0x0053:
            r1 = 131072(0x20000, float:1.83671E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x005b
            r20 = r2
            goto L_0x005d
        L_0x005b:
            r20 = r39
        L_0x005d:
            r2 = r21
            r3 = r22
            r8 = r27
            r10 = r29
            r11 = r30
            r12 = r31
            r14 = r33
            r15 = r34
            r16 = r35
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.Composition.<init>(int, java.lang.String, android.net.Uri, android.net.Uri, java.lang.Integer, java.util.UUID, java.util.List, java.time.Instant, java.time.Instant, boolean, android.net.Uri, boolean, int, java.util.UUID, java.lang.String, com.sugarcube.core.network.models.CompositionSavedProperties, java.util.Map, android.net.Uri, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
