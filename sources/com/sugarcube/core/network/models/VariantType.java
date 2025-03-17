package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/sugarcube/core/network/models/VariantType;", "", "typeName", "", "values", "", "Lcom/sugarcube/core/network/models/VariantValue;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTypeName", "()Ljava/lang/String;", "getValues", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class VariantType {
    private final String typeName;
    private final List<VariantValue> values;

    public VariantType() {
        this((String) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ VariantType copy$default(VariantType variantType, String str, List<VariantValue> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = variantType.typeName;
        }
        if ((i10 & 2) != 0) {
            list = variantType.values;
        }
        return variantType.copy(str, list);
    }

    public final String component1() {
        return this.typeName;
    }

    public final List<VariantValue> component2() {
        return this.values;
    }

    public final VariantType copy(@e(name = "typeName") String str, @e(name = "values") List<VariantValue> list) {
        return new VariantType(str, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VariantType)) {
            return false;
        }
        VariantType variantType = (VariantType) obj;
        return C17542s.e(this.typeName, variantType.typeName) && C17542s.e(this.values, variantType.values);
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final List<VariantValue> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.typeName;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<VariantValue> list = this.values;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.typeName;
        List<VariantValue> list = this.values;
        return "VariantType(typeName=" + str + ", values=" + list + ")";
    }

    public VariantType(@e(name = "typeName") String str, @e(name = "values") List<VariantValue> list) {
        this.typeName = str;
        this.values = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VariantType(String str, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : list);
    }
}
