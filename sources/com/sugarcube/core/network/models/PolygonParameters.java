package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B1\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R(\u0010\u0002\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/sugarcube/core/network/models/PolygonParameters;", "", "vertices", "", "", "indices", "", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getVertices", "()Ljava/util/List;", "setVertices", "(Ljava/util/List;)V", "getIndices", "setIndices", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PolygonParameters {
    private List<Integer> indices;
    private List<? extends List<Double>> vertices;

    public PolygonParameters() {
        this((List) null, (List) null, 3, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PolygonParameters copy$default(PolygonParameters polygonParameters, List<? extends List<Double>> list, List<Integer> list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = polygonParameters.vertices;
        }
        if ((i10 & 2) != 0) {
            list2 = polygonParameters.indices;
        }
        return polygonParameters.copy(list, list2);
    }

    public final List<List<Double>> component1() {
        return this.vertices;
    }

    public final List<Integer> component2() {
        return this.indices;
    }

    public final PolygonParameters copy(List<? extends List<Double>> list, List<Integer> list2) {
        return new PolygonParameters(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PolygonParameters)) {
            return false;
        }
        PolygonParameters polygonParameters = (PolygonParameters) obj;
        return C17542s.e(this.vertices, polygonParameters.vertices) && C17542s.e(this.indices, polygonParameters.indices);
    }

    public final List<Integer> getIndices() {
        return this.indices;
    }

    public final List<List<Double>> getVertices() {
        return this.vertices;
    }

    public int hashCode() {
        List<? extends List<Double>> list = this.vertices;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<Integer> list2 = this.indices;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode + i10;
    }

    public final void setIndices(List<Integer> list) {
        this.indices = list;
    }

    public final void setVertices(List<? extends List<Double>> list) {
        this.vertices = list;
    }

    public String toString() {
        List<? extends List<Double>> list = this.vertices;
        List<Integer> list2 = this.indices;
        return "PolygonParameters(vertices=" + list + ", indices=" + list2 + ")";
    }

    public PolygonParameters(List<? extends List<Double>> list, List<Integer> list2) {
        this.vertices = list;
        this.indices = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PolygonParameters(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, (i10 & 2) != 0 ? null : list2);
    }
}
