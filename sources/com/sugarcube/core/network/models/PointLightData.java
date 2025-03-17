package com.sugarcube.core.network.models;

import com.squareup.moshi.g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b \n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B[\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0015\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005HÆ\u0003J]\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005HÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0012\"\u0004\b\u001c\u0010\u0014R&\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u0006,"}, d2 = {"Lcom/sugarcube/core/network/models/PointLightData;", "", "id", "", "color", "", "", "intensity", "size", "position", "volume", "<init>", "(ILjava/util/List;DDLjava/util/List;Ljava/util/List;)V", "getId", "()I", "setId", "(I)V", "getColor", "()Ljava/util/List;", "setColor", "(Ljava/util/List;)V", "getIntensity", "()D", "setIntensity", "(D)V", "getSize", "setSize", "getPosition", "setPosition", "getVolume", "setVolume", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "network_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class PointLightData {
    private List<Double> color;

    /* renamed from: id  reason: collision with root package name */
    private int f126076id;
    private double intensity;
    private List<Double> position;
    private double size;
    private List<? extends List<Double>> volume;

    public PointLightData() {
        this(0, (List) null, 0.0d, 0.0d, (List) null, (List) null, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ PointLightData copy$default(PointLightData pointLightData, int i10, List list, double d10, double d11, List list2, List list3, int i11, Object obj) {
        PointLightData pointLightData2 = pointLightData;
        return pointLightData.copy((i11 & 1) != 0 ? pointLightData2.f126076id : i10, (i11 & 2) != 0 ? pointLightData2.color : list, (i11 & 4) != 0 ? pointLightData2.intensity : d10, (i11 & 8) != 0 ? pointLightData2.size : d11, (i11 & 16) != 0 ? pointLightData2.position : list2, (i11 & 32) != 0 ? pointLightData2.volume : list3);
    }

    public final int component1() {
        return this.f126076id;
    }

    public final List<Double> component2() {
        return this.color;
    }

    public final double component3() {
        return this.intensity;
    }

    public final double component4() {
        return this.size;
    }

    public final List<Double> component5() {
        return this.position;
    }

    public final List<List<Double>> component6() {
        return this.volume;
    }

    public final PointLightData copy(int i10, List<Double> list, double d10, double d11, List<Double> list2, List<? extends List<Double>> list3) {
        C17542s.j(list, "color");
        List<Double> list4 = list2;
        C17542s.j(list4, "position");
        List<? extends List<Double>> list5 = list3;
        C17542s.j(list5, "volume");
        return new PointLightData(i10, list, d10, d11, list4, list5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointLightData)) {
            return false;
        }
        PointLightData pointLightData = (PointLightData) obj;
        return this.f126076id == pointLightData.f126076id && C17542s.e(this.color, pointLightData.color) && Double.compare(this.intensity, pointLightData.intensity) == 0 && Double.compare(this.size, pointLightData.size) == 0 && C17542s.e(this.position, pointLightData.position) && C17542s.e(this.volume, pointLightData.volume);
    }

    public final List<Double> getColor() {
        return this.color;
    }

    public final int getId() {
        return this.f126076id;
    }

    public final double getIntensity() {
        return this.intensity;
    }

    public final List<Double> getPosition() {
        return this.position;
    }

    public final double getSize() {
        return this.size;
    }

    public final List<List<Double>> getVolume() {
        return this.volume;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f126076id) * 31) + this.color.hashCode()) * 31) + Double.hashCode(this.intensity)) * 31) + Double.hashCode(this.size)) * 31) + this.position.hashCode()) * 31) + this.volume.hashCode();
    }

    public final void setColor(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.color = list;
    }

    public final void setId(int i10) {
        this.f126076id = i10;
    }

    public final void setIntensity(double d10) {
        this.intensity = d10;
    }

    public final void setPosition(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.position = list;
    }

    public final void setSize(double d10) {
        this.size = d10;
    }

    public final void setVolume(List<? extends List<Double>> list) {
        C17542s.j(list, "<set-?>");
        this.volume = list;
    }

    public String toString() {
        int i10 = this.f126076id;
        List<Double> list = this.color;
        double d10 = this.intensity;
        double d11 = this.size;
        List<Double> list2 = this.position;
        List<? extends List<Double>> list3 = this.volume;
        return "PointLightData(id=" + i10 + ", color=" + list + ", intensity=" + d10 + ", size=" + d11 + ", position=" + list2 + ", volume=" + list3 + ")";
    }

    public PointLightData(int i10, List<Double> list, double d10, double d11, List<Double> list2, List<? extends List<Double>> list3) {
        C17542s.j(list, "color");
        C17542s.j(list2, "position");
        C17542s.j(list3, "volume");
        this.f126076id = i10;
        this.color = list;
        this.intensity = d10;
        this.size = d11;
        this.position = list2;
        this.volume = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PointLightData(int r17, java.util.List r18, double r19, double r21, java.util.List r23, java.util.List r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r16 = this;
            r0 = r25 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r0 = r1
            goto L_0x0009
        L_0x0007:
            r0 = r17
        L_0x0009:
            r2 = r25 & 2
            r3 = 3
            r4 = 0
            if (r2 == 0) goto L_0x0022
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r6 = r1
        L_0x0016:
            if (r6 >= r3) goto L_0x0024
            java.lang.Double r7 = java.lang.Double.valueOf(r4)
            r2.add(r7)
            int r6 = r6 + 1
            goto L_0x0016
        L_0x0022:
            r2 = r18
        L_0x0024:
            r6 = r25 & 4
            if (r6 == 0) goto L_0x002a
            r6 = r4
            goto L_0x002c
        L_0x002a:
            r6 = r19
        L_0x002c:
            r8 = r25 & 8
            if (r8 == 0) goto L_0x0032
            r8 = r4
            goto L_0x0034
        L_0x0032:
            r8 = r21
        L_0x0034:
            r10 = r25 & 16
            if (r10 == 0) goto L_0x004a
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r3)
            r11 = r1
        L_0x003e:
            if (r11 >= r3) goto L_0x004c
            java.lang.Double r12 = java.lang.Double.valueOf(r4)
            r10.add(r12)
            int r11 = r11 + 1
            goto L_0x003e
        L_0x004a:
            r10 = r23
        L_0x004c:
            r11 = r25 & 32
            if (r11 == 0) goto L_0x0070
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r3)
            r12 = r1
        L_0x0056:
            if (r12 >= r3) goto L_0x0072
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>(r3)
            r14 = r1
        L_0x005e:
            if (r14 >= r3) goto L_0x006a
            java.lang.Double r15 = java.lang.Double.valueOf(r4)
            r13.add(r15)
            int r14 = r14 + 1
            goto L_0x005e
        L_0x006a:
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x0056
        L_0x0070:
            r11 = r24
        L_0x0072:
            r17 = r16
            r18 = r0
            r19 = r2
            r20 = r6
            r22 = r8
            r24 = r10
            r25 = r11
            r17.<init>(r18, r19, r20, r22, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.core.network.models.PointLightData.<init>(int, java.util.List, double, double, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
