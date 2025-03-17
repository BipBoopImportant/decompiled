package com.sugarcube.core.network.models;

import YH.C16877v;
import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B/\u0012\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0016\b\u0003\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\u000e\b\u0003\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0003\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0004HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0003\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/sugarcube/core/network/models/SegmentationMetaData;", "", "instanceCategories", "", "", "instancesToStackables", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getInstanceCategories", "()Ljava/util/List;", "setInstanceCategories", "(Ljava/util/List;)V", "getInstancesToStackables", "setInstancesToStackables", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class SegmentationMetaData {
    private List<String> instanceCategories;
    private List<? extends List<Integer>> instancesToStackables;

    public SegmentationMetaData() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SegmentationMetaData copy$default(SegmentationMetaData segmentationMetaData, List<String> list, List<? extends List<Integer>> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = segmentationMetaData.instanceCategories;
        }
        if ((i10 & 2) != 0) {
            list2 = segmentationMetaData.instancesToStackables;
        }
        return segmentationMetaData.copy(list, list2);
    }

    public final List<String> component1() {
        return this.instanceCategories;
    }

    public final List<List<Integer>> component2() {
        return this.instancesToStackables;
    }

    public final SegmentationMetaData copy(@e(name = "instances") List<String> list, @e(name = "instances_to_stackables") List<? extends List<Integer>> list2) {
        C17542s.j(list, "instanceCategories");
        return new SegmentationMetaData(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SegmentationMetaData)) {
            return false;
        }
        SegmentationMetaData segmentationMetaData = (SegmentationMetaData) obj;
        return C17542s.e(this.instanceCategories, segmentationMetaData.instanceCategories) && C17542s.e(this.instancesToStackables, segmentationMetaData.instancesToStackables);
    }

    public final List<String> getInstanceCategories() {
        return this.instanceCategories;
    }

    public final List<List<Integer>> getInstancesToStackables() {
        return this.instancesToStackables;
    }

    public int hashCode() {
        int hashCode = this.instanceCategories.hashCode() * 31;
        List<? extends List<Integer>> list = this.instancesToStackables;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setInstanceCategories(List<String> list) {
        C17542s.j(list, "<set-?>");
        this.instanceCategories = list;
    }

    public final void setInstancesToStackables(List<? extends List<Integer>> list) {
        this.instancesToStackables = list;
    }

    public String toString() {
        List<String> list = this.instanceCategories;
        List<? extends List<Integer>> list2 = this.instancesToStackables;
        return "SegmentationMetaData(instanceCategories=" + list + ", instancesToStackables=" + list2 + ")";
    }

    public SegmentationMetaData(@e(name = "instances") List<String> list, @e(name = "instances_to_stackables") List<? extends List<Integer>> list2) {
        C17542s.j(list, "instanceCategories");
        this.instanceCategories = list;
        this.instancesToStackables = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SegmentationMetaData(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? C16877v.n() : list, (i10 & 2) != 0 ? null : list2);
    }
}
