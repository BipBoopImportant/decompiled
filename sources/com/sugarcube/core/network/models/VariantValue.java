package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/sugarcube/core/network/models/VariantValue;", "", "value", "", "items", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getValue", "()Ljava/lang/String;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class VariantValue {
    private final List<Integer> items;
    private final String value;

    public VariantValue() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ VariantValue copy$default(VariantValue variantValue, String str, List<Integer> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = variantValue.value;
        }
        if ((i10 & 2) != 0) {
            list = variantValue.items;
        }
        return variantValue.copy(str, list);
    }

    public final String component1() {
        return this.value;
    }

    public final List<Integer> component2() {
        return this.items;
    }

    public final VariantValue copy(@e(name = "value") String str, @e(name = "items") List<Integer> list) {
        return new VariantValue(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariantValue)) {
            return false;
        }
        VariantValue variantValue = (VariantValue) obj;
        return C17542s.e(this.value, variantValue.value) && C17542s.e(this.items, variantValue.items);
    }

    public final List<Integer> getItems() {
        return this.items;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.value;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<Integer> list = this.items;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.value;
        List<Integer> list = this.items;
        return "VariantValue(value=" + str + ", items=" + list + ")";
    }

    public VariantValue(@e(name = "value") String str, @e(name = "items") List<Integer> list) {
        this.value = str;
        this.items = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VariantValue(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : list);
    }
}
