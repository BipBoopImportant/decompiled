package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jz\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\nHÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011¨\u0006-"}, d2 = {"Lcom/sugarcube/core/network/models/QuickFilter;", "", "id", "", "country", "language", "roomType", "Lcom/sugarcube/core/network/models/RoomType;", "label", "order", "", "subcatalog", "search", "category", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getCountry", "getLanguage", "getRoomType", "()Lcom/sugarcube/core/network/models/RoomType;", "getLabel", "getOrder", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSubcatalog", "getSearch", "getCategory", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sugarcube/core/network/models/RoomType;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/sugarcube/core/network/models/QuickFilter;", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class QuickFilter {
    private final String category;
    private final String country;

    /* renamed from: id  reason: collision with root package name */
    private final String f126081id;
    private final String label;
    private final String language;
    private final Integer order;
    private final RoomType roomType;
    private final String search;
    private final String subcatalog;

    public QuickFilter(String str, String str2, String str3, RoomType roomType2, String str4, Integer num, String str5, String str6, String str7) {
        this.f126081id = str;
        this.country = str2;
        this.language = str3;
        this.roomType = roomType2;
        this.label = str4;
        this.order = num;
        this.subcatalog = str5;
        this.search = str6;
        this.category = str7;
    }

    public static /* synthetic */ QuickFilter copy$default(QuickFilter quickFilter, String str, String str2, String str3, RoomType roomType2, String str4, Integer num, String str5, String str6, String str7, int i10, Object obj) {
        QuickFilter quickFilter2 = quickFilter;
        int i11 = i10;
        return quickFilter.copy((i11 & 1) != 0 ? quickFilter2.f126081id : str, (i11 & 2) != 0 ? quickFilter2.country : str2, (i11 & 4) != 0 ? quickFilter2.language : str3, (i11 & 8) != 0 ? quickFilter2.roomType : roomType2, (i11 & 16) != 0 ? quickFilter2.label : str4, (i11 & 32) != 0 ? quickFilter2.order : num, (i11 & 64) != 0 ? quickFilter2.subcatalog : str5, (i11 & 128) != 0 ? quickFilter2.search : str6, (i11 & 256) != 0 ? quickFilter2.category : str7);
    }

    public final String component1() {
        return this.f126081id;
    }

    public final String component2() {
        return this.country;
    }

    public final String component3() {
        return this.language;
    }

    public final RoomType component4() {
        return this.roomType;
    }

    public final String component5() {
        return this.label;
    }

    public final Integer component6() {
        return this.order;
    }

    public final String component7() {
        return this.subcatalog;
    }

    public final String component8() {
        return this.search;
    }

    public final String component9() {
        return this.category;
    }

    public final QuickFilter copy(String str, String str2, String str3, RoomType roomType2, String str4, Integer num, String str5, String str6, String str7) {
        return new QuickFilter(str, str2, str3, roomType2, str4, num, str5, str6, str7);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuickFilter)) {
            return false;
        }
        QuickFilter quickFilter = (QuickFilter) obj;
        return C17542s.e(this.f126081id, quickFilter.f126081id) && C17542s.e(this.country, quickFilter.country) && C17542s.e(this.language, quickFilter.language) && this.roomType == quickFilter.roomType && C17542s.e(this.label, quickFilter.label) && C17542s.e(this.order, quickFilter.order) && C17542s.e(this.subcatalog, quickFilter.subcatalog) && C17542s.e(this.search, quickFilter.search) && C17542s.e(this.category, quickFilter.category);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getId() {
        return this.f126081id;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final Integer getOrder() {
        return this.order;
    }

    public final RoomType getRoomType() {
        return this.roomType;
    }

    public final String getSearch() {
        return this.search;
    }

    public final String getSubcatalog() {
        return this.subcatalog;
    }

    public int hashCode() {
        String str = this.f126081id;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.country;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.language;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        RoomType roomType2 = this.roomType;
        int hashCode4 = (hashCode3 + (roomType2 == null ? 0 : roomType2.hashCode())) * 31;
        String str4 = this.label;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.order;
        int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.subcatalog;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.search;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.category;
        if (str7 != null) {
            i10 = str7.hashCode();
        }
        return hashCode8 + i10;
    }

    public String toString() {
        String str = this.f126081id;
        String str2 = this.country;
        String str3 = this.language;
        RoomType roomType2 = this.roomType;
        String str4 = this.label;
        Integer num = this.order;
        String str5 = this.subcatalog;
        String str6 = this.search;
        String str7 = this.category;
        return "QuickFilter(id=" + str + ", country=" + str2 + ", language=" + str3 + ", roomType=" + roomType2 + ", label=" + str4 + ", order=" + num + ", subcatalog=" + str5 + ", search=" + str6 + ", category=" + str7 + ")";
    }
}
