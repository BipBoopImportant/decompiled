package com.ingka.ikea.app.stockinfo.local;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/ingka/ikea/app/stockinfo/local/Item;", "", "itemNo", "", "title", "description", "articleNo", "itemType", "itemLocation", "shelfOrRack", "Lcom/ingka/ikea/app/stockinfo/local/ShelfOrRack;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/stockinfo/local/ShelfOrRack;)V", "getItemNo", "()Ljava/lang/String;", "getTitle", "getDescription", "getArticleNo", "getItemType", "getItemLocation", "getShelfOrRack", "()Lcom/ingka/ikea/app/stockinfo/local/ShelfOrRack;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@Keep
public final class Item {
    private final String articleNo;
    private final String description;
    private final String itemLocation;
    private final String itemNo;
    private final String itemType;
    private final ShelfOrRack shelfOrRack;
    private final String title;

    public Item(String str, String str2, String str3, String str4, String str5, String str6, ShelfOrRack shelfOrRack2) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "title");
        C17542s.j(str3, "description");
        C17542s.j(str4, "articleNo");
        this.itemNo = str;
        this.title = str2;
        this.description = str3;
        this.articleNo = str4;
        this.itemType = str5;
        this.itemLocation = str6;
        this.shelfOrRack = shelfOrRack2;
    }

    public static /* synthetic */ Item copy$default(Item item, String str, String str2, String str3, String str4, String str5, String str6, ShelfOrRack shelfOrRack2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = item.itemNo;
        }
        if ((i10 & 2) != 0) {
            str2 = item.title;
        }
        String str7 = str2;
        if ((i10 & 4) != 0) {
            str3 = item.description;
        }
        String str8 = str3;
        if ((i10 & 8) != 0) {
            str4 = item.articleNo;
        }
        String str9 = str4;
        if ((i10 & 16) != 0) {
            str5 = item.itemType;
        }
        String str10 = str5;
        if ((i10 & 32) != 0) {
            str6 = item.itemLocation;
        }
        String str11 = str6;
        if ((i10 & 64) != 0) {
            shelfOrRack2 = item.shelfOrRack;
        }
        return item.copy(str, str7, str8, str9, str10, str11, shelfOrRack2);
    }

    public final String component1() {
        return this.itemNo;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.description;
    }

    public final String component4() {
        return this.articleNo;
    }

    public final String component5() {
        return this.itemType;
    }

    public final String component6() {
        return this.itemLocation;
    }

    public final ShelfOrRack component7() {
        return this.shelfOrRack;
    }

    public final Item copy(String str, String str2, String str3, String str4, String str5, String str6, ShelfOrRack shelfOrRack2) {
        C17542s.j(str, "itemNo");
        C17542s.j(str2, "title");
        C17542s.j(str3, "description");
        C17542s.j(str4, "articleNo");
        return new Item(str, str2, str3, str4, str5, str6, shelfOrRack2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Item)) {
            return false;
        }
        Item item = (Item) obj;
        return C17542s.e(this.itemNo, item.itemNo) && C17542s.e(this.title, item.title) && C17542s.e(this.description, item.description) && C17542s.e(this.articleNo, item.articleNo) && C17542s.e(this.itemType, item.itemType) && C17542s.e(this.itemLocation, item.itemLocation) && C17542s.e(this.shelfOrRack, item.shelfOrRack);
    }

    public final String getArticleNo() {
        return this.articleNo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getItemLocation() {
        return this.itemLocation;
    }

    public final String getItemNo() {
        return this.itemNo;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final ShelfOrRack getShelfOrRack() {
        return this.shelfOrRack;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = ((((((this.itemNo.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.articleNo.hashCode()) * 31;
        String str = this.itemType;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemLocation;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ShelfOrRack shelfOrRack2 = this.shelfOrRack;
        if (shelfOrRack2 != null) {
            i10 = shelfOrRack2.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        String str = this.itemNo;
        String str2 = this.title;
        String str3 = this.description;
        String str4 = this.articleNo;
        String str5 = this.itemType;
        String str6 = this.itemLocation;
        ShelfOrRack shelfOrRack2 = this.shelfOrRack;
        return "Item(itemNo=" + str + ", title=" + str2 + ", description=" + str3 + ", articleNo=" + str4 + ", itemType=" + str5 + ", itemLocation=" + str6 + ", shelfOrRack=" + shelfOrRack2 + ")";
    }
}
