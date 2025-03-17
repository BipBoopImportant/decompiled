package com.sugarcube.core.network.models;

import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.moshi.g;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010J\u001a\u00020KJ\u0006\u0010L\u001a\u00020KJ\u0006\u0010M\u001a\u00020\u0012J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u00100J\u000b\u0010W\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010X\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0002\u0010=J\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0002\u0010[J\u0013\u0010\\\u001a\u00020]2\b\u0010^\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010_\u001a\u00020\u0003HÖ\u0001J\t\u0010`\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001c\"\u0004\b \u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010\u001eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001c\"\u0004\b(\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u001c\"\u0004\b*\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0010\n\u0002\u0010@\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010A\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u0018\"\u0004\bC\u0010\u001aR\u001c\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010I¨\u0006a"}, d2 = {"Lcom/sugarcube/core/network/models/Showroom;", "", "id", "", "composition", "", "scene", "subCatalog", "images", "", "name", "roomType", "furnishingType", "Lcom/sugarcube/core/network/models/FurnishingType;", "sortOrder", "roomShapeName", "Lcom/sugarcube/core/network/models/RoomShape;", "roomShape", "Landroid/net/Uri;", "roomSize", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/FurnishingType;Ljava/lang/Integer;Lcom/sugarcube/core/network/models/RoomShape;Landroid/net/Uri;Ljava/lang/Double;)V", "getId", "()I", "setId", "(I)V", "getComposition", "()Ljava/lang/String;", "setComposition", "(Ljava/lang/String;)V", "getScene", "setScene", "getSubCatalog", "setSubCatalog", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "getName", "setName", "getRoomType", "setRoomType", "getFurnishingType", "()Lcom/sugarcube/core/network/models/FurnishingType;", "setFurnishingType", "(Lcom/sugarcube/core/network/models/FurnishingType;)V", "getSortOrder", "()Ljava/lang/Integer;", "setSortOrder", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRoomShapeName", "()Lcom/sugarcube/core/network/models/RoomShape;", "setRoomShapeName", "(Lcom/sugarcube/core/network/models/RoomShape;)V", "getRoomShape", "()Landroid/net/Uri;", "setRoomShape", "(Landroid/net/Uri;)V", "getRoomSize", "()Ljava/lang/Double;", "setRoomSize", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "compositionCount", "getCompositionCount", "setCompositionCount", "lastCreatedAt", "Ljava/time/Instant;", "getLastCreatedAt", "()Ljava/time/Instant;", "setLastCreatedAt", "(Ljava/time/Instant;)V", "getCompositionUuid", "Ljava/util/UUID;", "getSceneUuid", "getImageUri", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/FurnishingType;Ljava/lang/Integer;Lcom/sugarcube/core/network/models/RoomShape;Landroid/net/Uri;Ljava/lang/Double;)Lcom/sugarcube/core/network/models/Showroom;", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class Showroom {
    private String composition;
    private int compositionCount;
    private FurnishingType furnishingType;

    /* renamed from: id  reason: collision with root package name */
    private int f126085id;
    private List<String> images;
    private Instant lastCreatedAt;
    private String name;
    private Uri roomShape;
    private RoomShape roomShapeName;
    private Double roomSize;
    private String roomType;
    private String scene;
    private Integer sortOrder;
    private String subCatalog;

    public Showroom(int i10, String str, String str2, String str3, List<String> list, String str4, String str5, FurnishingType furnishingType2, Integer num, RoomShape roomShape2, Uri uri, Double d10) {
        C17542s.j(str, "composition");
        C17542s.j(str2, "scene");
        C17542s.j(list, "images");
        C17542s.j(str5, "roomType");
        this.f126085id = i10;
        this.composition = str;
        this.scene = str2;
        this.subCatalog = str3;
        this.images = list;
        this.name = str4;
        this.roomType = str5;
        this.furnishingType = furnishingType2;
        this.sortOrder = num;
        this.roomShapeName = roomShape2;
        this.roomShape = uri;
        this.roomSize = d10;
    }

    public static /* synthetic */ Showroom copy$default(Showroom showroom, int i10, String str, String str2, String str3, List list, String str4, String str5, FurnishingType furnishingType2, Integer num, RoomShape roomShape2, Uri uri, Double d10, int i11, Object obj) {
        Showroom showroom2 = showroom;
        int i12 = i11;
        return showroom.copy((i12 & 1) != 0 ? showroom2.f126085id : i10, (i12 & 2) != 0 ? showroom2.composition : str, (i12 & 4) != 0 ? showroom2.scene : str2, (i12 & 8) != 0 ? showroom2.subCatalog : str3, (i12 & 16) != 0 ? showroom2.images : list, (i12 & 32) != 0 ? showroom2.name : str4, (i12 & 64) != 0 ? showroom2.roomType : str5, (i12 & 128) != 0 ? showroom2.furnishingType : furnishingType2, (i12 & 256) != 0 ? showroom2.sortOrder : num, (i12 & 512) != 0 ? showroom2.roomShapeName : roomShape2, (i12 & 1024) != 0 ? showroom2.roomShape : uri, (i12 & RecyclerView.n.FLAG_MOVED) != 0 ? showroom2.roomSize : d10);
    }

    public final int component1() {
        return this.f126085id;
    }

    public final RoomShape component10() {
        return this.roomShapeName;
    }

    public final Uri component11() {
        return this.roomShape;
    }

    public final Double component12() {
        return this.roomSize;
    }

    public final String component2() {
        return this.composition;
    }

    public final String component3() {
        return this.scene;
    }

    public final String component4() {
        return this.subCatalog;
    }

    public final List<String> component5() {
        return this.images;
    }

    public final String component6() {
        return this.name;
    }

    public final String component7() {
        return this.roomType;
    }

    public final FurnishingType component8() {
        return this.furnishingType;
    }

    public final Integer component9() {
        return this.sortOrder;
    }

    public final Showroom copy(int i10, String str, String str2, String str3, List<String> list, String str4, String str5, FurnishingType furnishingType2, Integer num, RoomShape roomShape2, Uri uri, Double d10) {
        String str6 = str;
        C17542s.j(str6, "composition");
        String str7 = str2;
        C17542s.j(str7, "scene");
        List<String> list2 = list;
        C17542s.j(list2, "images");
        String str8 = str5;
        C17542s.j(str8, "roomType");
        return new Showroom(i10, str6, str7, str3, list2, str4, str8, furnishingType2, num, roomShape2, uri, d10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Showroom)) {
            return false;
        }
        Showroom showroom = (Showroom) obj;
        return this.f126085id == showroom.f126085id && C17542s.e(this.composition, showroom.composition) && C17542s.e(this.scene, showroom.scene) && C17542s.e(this.subCatalog, showroom.subCatalog) && C17542s.e(this.images, showroom.images) && C17542s.e(this.name, showroom.name) && C17542s.e(this.roomType, showroom.roomType) && this.furnishingType == showroom.furnishingType && C17542s.e(this.sortOrder, showroom.sortOrder) && this.roomShapeName == showroom.roomShapeName && C17542s.e(this.roomShape, showroom.roomShape) && C17542s.e(this.roomSize, showroom.roomSize);
    }

    public final String getComposition() {
        return this.composition;
    }

    public final int getCompositionCount() {
        return this.compositionCount;
    }

    public final UUID getCompositionUuid() {
        UUID fromString = UUID.fromString(this.composition);
        C17542s.i(fromString, "fromString(...)");
        return fromString;
    }

    public final FurnishingType getFurnishingType() {
        return this.furnishingType;
    }

    public final int getId() {
        return this.f126085id;
    }

    public final Uri getImageUri() {
        Uri parse = Uri.parse(this.images.get(0));
        C17542s.i(parse, "parse(...)");
        return parse;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final Instant getLastCreatedAt() {
        return this.lastCreatedAt;
    }

    public final String getName() {
        return this.name;
    }

    public final Uri getRoomShape() {
        return this.roomShape;
    }

    public final RoomShape getRoomShapeName() {
        return this.roomShapeName;
    }

    public final Double getRoomSize() {
        return this.roomSize;
    }

    public final String getRoomType() {
        return this.roomType;
    }

    public final String getScene() {
        return this.scene;
    }

    public final UUID getSceneUuid() {
        UUID fromString = UUID.fromString(this.scene);
        C17542s.i(fromString, "fromString(...)");
        return fromString;
    }

    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final String getSubCatalog() {
        return this.subCatalog;
    }

    public int hashCode() {
        int hashCode = ((((Integer.hashCode(this.f126085id) * 31) + this.composition.hashCode()) * 31) + this.scene.hashCode()) * 31;
        String str = this.subCatalog;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.images.hashCode()) * 31;
        String str2 = this.name;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.roomType.hashCode()) * 31;
        FurnishingType furnishingType2 = this.furnishingType;
        int hashCode4 = (hashCode3 + (furnishingType2 == null ? 0 : furnishingType2.hashCode())) * 31;
        Integer num = this.sortOrder;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        RoomShape roomShape2 = this.roomShapeName;
        int hashCode6 = (hashCode5 + (roomShape2 == null ? 0 : roomShape2.hashCode())) * 31;
        Uri uri = this.roomShape;
        int hashCode7 = (hashCode6 + (uri == null ? 0 : uri.hashCode())) * 31;
        Double d10 = this.roomSize;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode7 + i10;
    }

    public final void setComposition(String str) {
        C17542s.j(str, "<set-?>");
        this.composition = str;
    }

    public final void setCompositionCount(int i10) {
        this.compositionCount = i10;
    }

    public final void setFurnishingType(FurnishingType furnishingType2) {
        this.furnishingType = furnishingType2;
    }

    public final void setId(int i10) {
        this.f126085id = i10;
    }

    public final void setImages(List<String> list) {
        C17542s.j(list, "<set-?>");
        this.images = list;
    }

    public final void setLastCreatedAt(Instant instant) {
        this.lastCreatedAt = instant;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setRoomShape(Uri uri) {
        this.roomShape = uri;
    }

    public final void setRoomShapeName(RoomShape roomShape2) {
        this.roomShapeName = roomShape2;
    }

    public final void setRoomSize(Double d10) {
        this.roomSize = d10;
    }

    public final void setRoomType(String str) {
        C17542s.j(str, "<set-?>");
        this.roomType = str;
    }

    public final void setScene(String str) {
        C17542s.j(str, "<set-?>");
        this.scene = str;
    }

    public final void setSortOrder(Integer num) {
        this.sortOrder = num;
    }

    public final void setSubCatalog(String str) {
        this.subCatalog = str;
    }

    public String toString() {
        int i10 = this.f126085id;
        String str = this.composition;
        String str2 = this.scene;
        String str3 = this.subCatalog;
        List<String> list = this.images;
        String str4 = this.name;
        String str5 = this.roomType;
        FurnishingType furnishingType2 = this.furnishingType;
        Integer num = this.sortOrder;
        RoomShape roomShape2 = this.roomShapeName;
        Uri uri = this.roomShape;
        Double d10 = this.roomSize;
        return "Showroom(id=" + i10 + ", composition=" + str + ", scene=" + str2 + ", subCatalog=" + str3 + ", images=" + list + ", name=" + str4 + ", roomType=" + str5 + ", furnishingType=" + furnishingType2 + ", sortOrder=" + num + ", roomShapeName=" + roomShape2 + ", roomShape=" + uri + ", roomSize=" + d10 + ")";
    }
}
