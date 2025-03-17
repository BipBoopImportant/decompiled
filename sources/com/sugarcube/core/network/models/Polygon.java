package com.sugarcube.core.network.models;

import com.squareup.moshi.e;
import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bm\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0016\b\u0003\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005\u0012\u0016\b\u0003\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005HÆ\u0003J\u0017\u0010+\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005HÆ\u0003Jt\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0003\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u00052\u0016\b\u0003\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0003HÖ\u0001J\t\u00102\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0015\"\u0004\b!\u0010\u0017R(\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R\u001f\u0010$\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u0005\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010\u0015¨\u00063"}, d2 = {"Lcom/sugarcube/core/network/models/Polygon;", "", "id", "", "children", "", "category", "", "parameters", "Lcom/sugarcube/core/network/models/PolygonParameters;", "transformAlt0", "", "transformAlt1", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lcom/sugarcube/core/network/models/PolygonParameters;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getChildren", "()Ljava/util/List;", "setChildren", "(Ljava/util/List;)V", "getCategory", "()Ljava/lang/String;", "setCategory", "(Ljava/lang/String;)V", "getParameters", "()Lcom/sugarcube/core/network/models/PolygonParameters;", "setParameters", "(Lcom/sugarcube/core/network/models/PolygonParameters;)V", "getTransformAlt0", "setTransformAlt0", "getTransformAlt1", "setTransformAlt1", "transform", "getTransform", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lcom/sugarcube/core/network/models/PolygonParameters;Ljava/util/List;Ljava/util/List;)Lcom/sugarcube/core/network/models/Polygon;", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class Polygon {
    private String category;
    private List<Integer> children;

    /* renamed from: id  reason: collision with root package name */
    private Integer f126077id;
    private PolygonParameters parameters;
    private List<? extends List<Double>> transformAlt0;
    private List<? extends List<Double>> transformAlt1;

    public Polygon() {
        this((Integer) null, (List) null, (String) null, (PolygonParameters) null, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ Polygon copy$default(Polygon polygon, Integer num, List<Integer> list, String str, PolygonParameters polygonParameters, List<? extends List<Double>> list2, List<? extends List<Double>> list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = polygon.f126077id;
        }
        if ((i10 & 2) != 0) {
            list = polygon.children;
        }
        List<Integer> list4 = list;
        if ((i10 & 4) != 0) {
            str = polygon.category;
        }
        String str2 = str;
        if ((i10 & 8) != 0) {
            polygonParameters = polygon.parameters;
        }
        PolygonParameters polygonParameters2 = polygonParameters;
        if ((i10 & 16) != 0) {
            list2 = polygon.transformAlt0;
        }
        List<? extends List<Double>> list5 = list2;
        if ((i10 & 32) != 0) {
            list3 = polygon.transformAlt1;
        }
        return polygon.copy(num, list4, str2, polygonParameters2, list5, list3);
    }

    public final Integer component1() {
        return this.f126077id;
    }

    public final List<Integer> component2() {
        return this.children;
    }

    public final String component3() {
        return this.category;
    }

    public final PolygonParameters component4() {
        return this.parameters;
    }

    public final List<List<Double>> component5() {
        return this.transformAlt0;
    }

    public final List<List<Double>> component6() {
        return this.transformAlt1;
    }

    public final Polygon copy(Integer num, List<Integer> list, @e(name = "class") String str, PolygonParameters polygonParameters, @e(name = "transform") List<? extends List<Double>> list2, @e(name = "matrixModel") List<? extends List<Double>> list3) {
        return new Polygon(num, list, str, polygonParameters, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Polygon)) {
            return false;
        }
        Polygon polygon = (Polygon) obj;
        return C17542s.e(this.f126077id, polygon.f126077id) && C17542s.e(this.children, polygon.children) && C17542s.e(this.category, polygon.category) && C17542s.e(this.parameters, polygon.parameters) && C17542s.e(this.transformAlt0, polygon.transformAlt0) && C17542s.e(this.transformAlt1, polygon.transformAlt1);
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<Integer> getChildren() {
        return this.children;
    }

    public final Integer getId() {
        return this.f126077id;
    }

    public final PolygonParameters getParameters() {
        return this.parameters;
    }

    public final List<List<Double>> getTransform() {
        List<? extends List<Double>> list = this.transformAlt0;
        return list == null ? this.transformAlt1 : list;
    }

    public final List<List<Double>> getTransformAlt0() {
        return this.transformAlt0;
    }

    public final List<List<Double>> getTransformAlt1() {
        return this.transformAlt1;
    }

    public int hashCode() {
        Integer num = this.f126077id;
        int i10 = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<Integer> list = this.children;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.category;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        PolygonParameters polygonParameters = this.parameters;
        int hashCode4 = (hashCode3 + (polygonParameters == null ? 0 : polygonParameters.hashCode())) * 31;
        List<? extends List<Double>> list2 = this.transformAlt0;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<? extends List<Double>> list3 = this.transformAlt1;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return hashCode5 + i10;
    }

    public final void setCategory(String str) {
        this.category = str;
    }

    public final void setChildren(List<Integer> list) {
        this.children = list;
    }

    public final void setId(Integer num) {
        this.f126077id = num;
    }

    public final void setParameters(PolygonParameters polygonParameters) {
        this.parameters = polygonParameters;
    }

    public final void setTransformAlt0(List<? extends List<Double>> list) {
        this.transformAlt0 = list;
    }

    public final void setTransformAlt1(List<? extends List<Double>> list) {
        this.transformAlt1 = list;
    }

    public String toString() {
        Integer num = this.f126077id;
        List<Integer> list = this.children;
        String str = this.category;
        PolygonParameters polygonParameters = this.parameters;
        List<? extends List<Double>> list2 = this.transformAlt0;
        List<? extends List<Double>> list3 = this.transformAlt1;
        return "Polygon(id=" + num + ", children=" + list + ", category=" + str + ", parameters=" + polygonParameters + ", transformAlt0=" + list2 + ", transformAlt1=" + list3 + ")";
    }

    public Polygon(Integer num, List<Integer> list, @e(name = "class") String str, PolygonParameters polygonParameters, @e(name = "transform") List<? extends List<Double>> list2, @e(name = "matrixModel") List<? extends List<Double>> list3) {
        this.f126077id = num;
        this.children = list;
        this.category = str;
        this.parameters = polygonParameters;
        this.transformAlt0 = list2;
        this.transformAlt1 = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ Polygon(java.lang.Integer r5, java.util.List r6, java.lang.String r7, com.sugarcube.core.network.models.PolygonParameters r8, java.util.List r9, java.util.List r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r4 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0009
            r5 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
        L_0x0009:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L_0x0010
            r12 = r0
            goto L_0x0011
        L_0x0010:
            r12 = r6
        L_0x0011:
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0017
            r1 = r0
            goto L_0x0018
        L_0x0017:
            r1 = r7
        L_0x0018:
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001e
            r2 = r0
            goto L_0x001f
        L_0x001e:
            r2 = r8
        L_0x001f:
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0025
            r3 = r0
            goto L_0x0026
        L_0x0025:
            r3 = r9
        L_0x0026:
            r6 = r11 & 32
            if (r6 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r0 = r10
        L_0x002c:
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.Polygon.<init>(java.lang.Integer, java.util.List, java.lang.String, com.sugarcube.core.network.models.PolygonParameters, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
