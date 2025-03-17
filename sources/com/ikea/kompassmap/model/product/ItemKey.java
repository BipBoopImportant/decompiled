package com.ikea.kompassmap.model.product;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0010\u001a\u00020\u0011H×\u0001J\t\u0010\u0012\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/ikea/kompassmap/model/product/ItemKey;", "", "itemType", "", "itemNo", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getItemType", "()Ljava/lang/String;", "getItemNo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "KompassMap_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ItemKey {
    public static final int $stable = 0;
    private final String itemNo;
    private final String itemType;

    public ItemKey(String str, String str2) {
        C17542s.j(str, "itemType");
        C17542s.j(str2, "itemNo");
        this.itemType = str;
        this.itemNo = str2;
    }

    public static /* synthetic */ ItemKey copy$default(ItemKey itemKey, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = itemKey.itemType;
        }
        if ((i10 & 2) != 0) {
            str2 = itemKey.itemNo;
        }
        return itemKey.copy(str, str2);
    }

    public final String component1() {
        return this.itemType;
    }

    public final String component2() {
        return this.itemNo;
    }

    public final ItemKey copy(String str, String str2) {
        C17542s.j(str, "itemType");
        C17542s.j(str2, "itemNo");
        return new ItemKey(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ItemKey)) {
            return false;
        }
        ItemKey itemKey = (ItemKey) obj;
        return C17542s.e(this.itemType, itemKey.itemType) && C17542s.e(this.itemNo, itemKey.itemNo);
    }

    public final String getItemNo() {
        return this.itemNo;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public int hashCode() {
        return (this.itemType.hashCode() * 31) + this.itemNo.hashCode();
    }

    public String toString() {
        return "ItemKey(itemType=" + this.itemType + ", itemNo=" + this.itemNo + ')';
    }
}
