package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/sugarcube/core/network/models/CatalogCombinableNodeMeta;", "", "size", "", "category", "matrixModel", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getSize", "()Ljava/lang/String;", "getCategory", "getMatrixModel", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class CatalogCombinableNodeMeta {
    private final String category;
    private final List<List<Double>> matrixModel;
    private final String size;

    public CatalogCombinableNodeMeta() {
        this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CatalogCombinableNodeMeta copy$default(CatalogCombinableNodeMeta catalogCombinableNodeMeta, String str, String str2, List<List<Double>> list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = catalogCombinableNodeMeta.size;
        }
        if ((i10 & 2) != 0) {
            str2 = catalogCombinableNodeMeta.category;
        }
        if ((i10 & 4) != 0) {
            list = catalogCombinableNodeMeta.matrixModel;
        }
        return catalogCombinableNodeMeta.copy(str, str2, list);
    }

    public final String component1() {
        return this.size;
    }

    public final String component2() {
        return this.category;
    }

    public final List<List<Double>> component3() {
        return this.matrixModel;
    }

    public final CatalogCombinableNodeMeta copy(String str, String str2, List<? extends List<Double>> list) {
        return new CatalogCombinableNodeMeta(str, str2, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogCombinableNodeMeta)) {
            return false;
        }
        CatalogCombinableNodeMeta catalogCombinableNodeMeta = (CatalogCombinableNodeMeta) obj;
        return C17542s.e(this.size, catalogCombinableNodeMeta.size) && C17542s.e(this.category, catalogCombinableNodeMeta.category) && C17542s.e(this.matrixModel, catalogCombinableNodeMeta.matrixModel);
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<List<Double>> getMatrixModel() {
        return this.matrixModel;
    }

    public final String getSize() {
        return this.size;
    }

    public int hashCode() {
        String str = this.size;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.category;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<List<Double>> list = this.matrixModel;
        if (list != null) {
            i10 = list.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.size;
        String str2 = this.category;
        List<List<Double>> list = this.matrixModel;
        return "CatalogCombinableNodeMeta(size=" + str + ", category=" + str2 + ", matrixModel=" + list + ")";
    }

    public CatalogCombinableNodeMeta(String str, String str2, List<? extends List<Double>> list) {
        this.size = str;
        this.category = str2;
        this.matrixModel = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CatalogCombinableNodeMeta(String str, String str2, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : list);
    }
}
