package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import fK.p;
import jK.C17438C;
import jK.C17451f;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 C2\u00020\u0001:\u0002DCBm\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rBy\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0014\u0010\n\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\u001eJv\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001cJ\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u00102R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u00103\u001a\u0004\b4\u0010\u001e\"\u0004\b5\u00106R\"\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010 \"\u0004\b9\u0010:R\"\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u00107\u001a\u0004\b;\u0010 \"\u0004\b<\u0010:R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u00103\u001a\u0004\b=\u0010\u001e\"\u0004\b>\u00106R.\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u00103\u001a\u0004\b?\u0010\u001e\"\u0004\b@\u00106R*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u00103\u001a\u0004\bA\u0010\u001e\"\u0004\bB\u00106¨\u0006E"}, d2 = {"Lcom/sugarcube/decorate_engine/ManifestLight;", "", "", "id", "", "", "color", "intensity", "size", "position", "volume", "direction", "<init>", "(ILjava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IILjava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/ManifestLight;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/util/List;", "component3", "()D", "component4", "component5", "component6", "component7", "copy", "(ILjava/util/List;DDLjava/util/List;Ljava/util/List;Ljava/util/List;)Lcom/sugarcube/decorate_engine/ManifestLight;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "setId", "(I)V", "Ljava/util/List;", "getColor", "setColor", "(Ljava/util/List;)V", "D", "getIntensity", "setIntensity", "(D)V", "getSize", "setSize", "getPosition", "setPosition", "getVolume", "setVolume", "getDirection", "setDirection", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ManifestLight {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private List<Double> color;
    private List<Double> direction;

    /* renamed from: id  reason: collision with root package name */
    private int f142953id;
    private double intensity;
    private List<Double> position;
    private double size;
    private List<? extends List<Double>> volume;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/ManifestLight$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/ManifestLight;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ManifestLight> serializer() {
            return ManifestLight$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C17438C c10 = C17438C.f144010a;
        $childSerializers = new KSerializer[]{null, new C17451f(c10), null, null, new C17451f(c10), new C17451f(new C17451f(c10)), new C17451f(c10)};
    }

    public ManifestLight() {
        this(0, (List) null, 0.0d, 0.0d, (List) null, (List) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ManifestLight copy$default(ManifestLight manifestLight, int i10, List list, double d10, double d11, List list2, List list3, List list4, int i11, Object obj) {
        ManifestLight manifestLight2 = manifestLight;
        return manifestLight.copy((i11 & 1) != 0 ? manifestLight2.f142953id : i10, (i11 & 2) != 0 ? manifestLight2.color : list, (i11 & 4) != 0 ? manifestLight2.intensity : d10, (i11 & 8) != 0 ? manifestLight2.size : d11, (i11 & 16) != 0 ? manifestLight2.position : list2, (i11 & 32) != 0 ? manifestLight2.volume : list3, (i11 & 64) != 0 ? manifestLight2.direction : list4);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void write$Self$decorate_engine_release(com.sugarcube.decorate_engine.ManifestLight r16, iK.C17395d r17, kotlinx.serialization.descriptors.SerialDescriptor r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = 3
            r4 = 2
            r5 = 1
            kotlinx.serialization.KSerializer<java.lang.Object>[] r6 = $childSerializers
            r7 = 0
            boolean r8 = r1.z(r2, r7)
            if (r8 == 0) goto L_0x0013
            goto L_0x0017
        L_0x0013:
            int r8 = r0.f142953id
            if (r8 == 0) goto L_0x001c
        L_0x0017:
            int r8 = r0.f142953id
            r1.w(r2, r7, r8)
        L_0x001c:
            boolean r8 = r1.z(r2, r5)
            r9 = 0
            if (r8 == 0) goto L_0x0025
            goto L_0x0041
        L_0x0025:
            java.util.List<java.lang.Double> r8 = r0.color
            java.lang.Double r11 = java.lang.Double.valueOf(r9)
            java.lang.Double r12 = java.lang.Double.valueOf(r9)
            java.lang.Double r13 = java.lang.Double.valueOf(r9)
            java.lang.Double[] r11 = new java.lang.Double[]{r11, r12, r13}
            java.util.List r11 = YH.C16877v.q(r11)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r11)
            if (r8 != 0) goto L_0x0048
        L_0x0041:
            r8 = r6[r5]
            java.util.List<java.lang.Double> r11 = r0.color
            r1.i(r2, r5, r8, r11)
        L_0x0048:
            boolean r8 = r1.z(r2, r4)
            if (r8 == 0) goto L_0x004f
            goto L_0x0057
        L_0x004f:
            double r11 = r0.intensity
            int r8 = java.lang.Double.compare(r11, r9)
            if (r8 == 0) goto L_0x005c
        L_0x0057:
            double r11 = r0.intensity
            r1.E(r2, r4, r11)
        L_0x005c:
            boolean r8 = r1.z(r2, r3)
            if (r8 == 0) goto L_0x0063
            goto L_0x006b
        L_0x0063:
            double r11 = r0.size
            int r8 = java.lang.Double.compare(r11, r9)
            if (r8 == 0) goto L_0x0070
        L_0x006b:
            double r11 = r0.size
            r1.E(r2, r3, r11)
        L_0x0070:
            r8 = 4
            boolean r11 = r1.z(r2, r8)
            if (r11 == 0) goto L_0x0078
            goto L_0x0094
        L_0x0078:
            java.util.List<java.lang.Double> r11 = r0.position
            java.lang.Double r12 = java.lang.Double.valueOf(r9)
            java.lang.Double r13 = java.lang.Double.valueOf(r9)
            java.lang.Double r14 = java.lang.Double.valueOf(r9)
            java.lang.Double[] r12 = new java.lang.Double[]{r12, r13, r14}
            java.util.List r12 = YH.C16877v.q(r12)
            boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r12)
            if (r11 != 0) goto L_0x009b
        L_0x0094:
            r11 = r6[r8]
            java.util.List<java.lang.Double> r12 = r0.position
            r1.i(r2, r8, r11, r12)
        L_0x009b:
            r8 = 5
            boolean r11 = r1.z(r2, r8)
            if (r11 == 0) goto L_0x00a4
            r3 = r8
            goto L_0x00f8
        L_0x00a4:
            java.util.List<? extends java.util.List<java.lang.Double>> r11 = r0.volume
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r14 = java.lang.Double.valueOf(r12)
            java.lang.Double r15 = java.lang.Double.valueOf(r9)
            java.lang.Double r8 = java.lang.Double.valueOf(r9)
            java.lang.Double[] r8 = new java.lang.Double[]{r14, r15, r8}
            java.util.List r8 = YH.C16877v.q(r8)
            java.lang.Double r14 = java.lang.Double.valueOf(r9)
            java.lang.Double r15 = java.lang.Double.valueOf(r12)
            java.lang.Double r4 = java.lang.Double.valueOf(r9)
            java.lang.Double[] r4 = new java.lang.Double[]{r14, r15, r4}
            java.util.List r4 = YH.C16877v.q(r4)
            java.lang.Double r14 = java.lang.Double.valueOf(r9)
            java.lang.Double r9 = java.lang.Double.valueOf(r9)
            java.lang.Double r10 = java.lang.Double.valueOf(r12)
            java.lang.Double[] r9 = new java.lang.Double[]{r14, r9, r10}
            java.util.List r9 = YH.C16877v.q(r9)
            java.util.List[] r3 = new java.util.List[r3]
            r3[r7] = r8
            r3[r5] = r4
            r4 = 2
            r3[r4] = r9
            java.util.List r3 = YH.C16877v.q(r3)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r11, r3)
            if (r3 != 0) goto L_0x00ff
            r3 = 5
        L_0x00f8:
            r4 = r6[r3]
            java.util.List<? extends java.util.List<java.lang.Double>> r5 = r0.volume
            r1.i(r2, r3, r4, r5)
        L_0x00ff:
            r3 = 6
            boolean r4 = r1.z(r2, r3)
            if (r4 == 0) goto L_0x0107
            goto L_0x010b
        L_0x0107:
            java.util.List<java.lang.Double> r4 = r0.direction
            if (r4 == 0) goto L_0x0112
        L_0x010b:
            r4 = r6[r3]
            java.util.List<java.lang.Double> r0 = r0.direction
            r1.B(r2, r3, r4, r0)
        L_0x0112:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.ManifestLight.write$Self$decorate_engine_release(com.sugarcube.decorate_engine.ManifestLight, iK.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final int component1() {
        return this.f142953id;
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

    public final List<Double> component7() {
        return this.direction;
    }

    public final ManifestLight copy(int i10, List<Double> list, double d10, double d11, List<Double> list2, List<? extends List<Double>> list3, List<Double> list4) {
        C17542s.j(list, "color");
        List<Double> list5 = list2;
        C17542s.j(list5, "position");
        List<? extends List<Double>> list6 = list3;
        C17542s.j(list6, "volume");
        return new ManifestLight(i10, list, d10, d11, list5, list6, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManifestLight)) {
            return false;
        }
        ManifestLight manifestLight = (ManifestLight) obj;
        return this.f142953id == manifestLight.f142953id && C17542s.e(this.color, manifestLight.color) && Double.compare(this.intensity, manifestLight.intensity) == 0 && Double.compare(this.size, manifestLight.size) == 0 && C17542s.e(this.position, manifestLight.position) && C17542s.e(this.volume, manifestLight.volume) && C17542s.e(this.direction, manifestLight.direction);
    }

    public final List<Double> getColor() {
        return this.color;
    }

    public final List<Double> getDirection() {
        return this.direction;
    }

    public final int getId() {
        return this.f142953id;
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
        int hashCode = ((((((((((Integer.hashCode(this.f142953id) * 31) + this.color.hashCode()) * 31) + Double.hashCode(this.intensity)) * 31) + Double.hashCode(this.size)) * 31) + this.position.hashCode()) * 31) + this.volume.hashCode()) * 31;
        List<Double> list = this.direction;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final void setColor(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.color = list;
    }

    public final void setDirection(List<Double> list) {
        this.direction = list;
    }

    public final void setId(int i10) {
        this.f142953id = i10;
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
        int i10 = this.f142953id;
        List<Double> list = this.color;
        double d10 = this.intensity;
        double d11 = this.size;
        List<Double> list2 = this.position;
        List<? extends List<Double>> list3 = this.volume;
        List<Double> list4 = this.direction;
        return "ManifestLight(id=" + i10 + ", color=" + list + ", intensity=" + d10 + ", size=" + d11 + ", position=" + list2 + ", volume=" + list3 + ", direction=" + list4 + ")";
    }

    @C16814e
    public /* synthetic */ ManifestLight(int i10, int i11, List list, double d10, double d11, List list2, List list3, List list4, T0 t02) {
        List list5;
        List list6;
        List list7;
        if ((i10 & 1) == 0) {
            this.f142953id = 0;
        } else {
            this.f142953id = i11;
        }
        if ((i10 & 2) == 0) {
            list5 = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            list5 = list;
        }
        this.color = list5;
        if ((i10 & 4) == 0) {
            this.intensity = 0.0d;
        } else {
            this.intensity = d10;
        }
        if ((i10 & 8) == 0) {
            this.size = 0.0d;
        } else {
            this.size = d11;
        }
        if ((i10 & 16) == 0) {
            list6 = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            list6 = list2;
        }
        this.position = list6;
        if ((i10 & 32) == 0) {
            list7 = C16877v.q(C16877v.q(Double.valueOf(1.0d), Double.valueOf(0.0d), Double.valueOf(0.0d)), C16877v.q(Double.valueOf(0.0d), Double.valueOf(1.0d), Double.valueOf(0.0d)), C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(1.0d)));
        } else {
            list7 = list3;
        }
        this.volume = list7;
        this.direction = (i10 & 64) == 0 ? null : list4;
    }

    public ManifestLight(int i10, List<Double> list, double d10, double d11, List<Double> list2, List<? extends List<Double>> list3, List<Double> list4) {
        C17542s.j(list, "color");
        C17542s.j(list2, "position");
        C17542s.j(list3, "volume");
        this.f142953id = i10;
        this.color = list;
        this.intensity = d10;
        this.size = d11;
        this.position = list2;
        this.volume = list3;
        this.direction = list4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ManifestLight(int r17, java.util.List r18, double r19, double r21, java.util.List r23, java.util.List r24, java.util.List r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r16 = this;
            r0 = 2
            r1 = 0
            r2 = 1
            r3 = r26 & 1
            if (r3 == 0) goto L_0x0009
            r3 = r1
            goto L_0x000b
        L_0x0009:
            r3 = r17
        L_0x000b:
            r4 = r26 & 2
            r5 = 0
            if (r4 == 0) goto L_0x0026
            java.lang.Double r4 = java.lang.Double.valueOf(r5)
            java.lang.Double r7 = java.lang.Double.valueOf(r5)
            java.lang.Double r8 = java.lang.Double.valueOf(r5)
            java.lang.Double[] r4 = new java.lang.Double[]{r4, r7, r8}
            java.util.List r4 = YH.C16877v.q(r4)
            goto L_0x0028
        L_0x0026:
            r4 = r18
        L_0x0028:
            r7 = r26 & 4
            if (r7 == 0) goto L_0x002e
            r7 = r5
            goto L_0x0030
        L_0x002e:
            r7 = r19
        L_0x0030:
            r9 = r26 & 8
            if (r9 == 0) goto L_0x0036
            r9 = r5
            goto L_0x0038
        L_0x0036:
            r9 = r21
        L_0x0038:
            r11 = r26 & 16
            if (r11 == 0) goto L_0x0051
            java.lang.Double r11 = java.lang.Double.valueOf(r5)
            java.lang.Double r12 = java.lang.Double.valueOf(r5)
            java.lang.Double r13 = java.lang.Double.valueOf(r5)
            java.lang.Double[] r11 = new java.lang.Double[]{r11, r12, r13}
            java.util.List r11 = YH.C16877v.q(r11)
            goto L_0x0053
        L_0x0051:
            r11 = r23
        L_0x0053:
            r12 = r26 & 32
            if (r12 == 0) goto L_0x00a5
            r12 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r14 = java.lang.Double.valueOf(r12)
            java.lang.Double r15 = java.lang.Double.valueOf(r5)
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            java.lang.Double[] r0 = new java.lang.Double[]{r14, r15, r0}
            java.util.List r0 = YH.C16877v.q(r0)
            java.lang.Double r14 = java.lang.Double.valueOf(r5)
            java.lang.Double r15 = java.lang.Double.valueOf(r12)
            java.lang.Double r2 = java.lang.Double.valueOf(r5)
            java.lang.Double[] r2 = new java.lang.Double[]{r14, r15, r2}
            java.util.List r2 = YH.C16877v.q(r2)
            java.lang.Double r14 = java.lang.Double.valueOf(r5)
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            java.lang.Double r6 = java.lang.Double.valueOf(r12)
            java.lang.Double[] r5 = new java.lang.Double[]{r14, r5, r6}
            java.util.List r5 = YH.C16877v.q(r5)
            r6 = 3
            java.util.List[] r6 = new java.util.List[r6]
            r6[r1] = r0
            r0 = 1
            r6[r0] = r2
            r0 = 2
            r6[r0] = r5
            java.util.List r0 = YH.C16877v.q(r6)
            goto L_0x00a7
        L_0x00a5:
            r0 = r24
        L_0x00a7:
            r1 = r26 & 64
            if (r1 == 0) goto L_0x00ad
            r1 = 0
            goto L_0x00af
        L_0x00ad:
            r1 = r25
        L_0x00af:
            r17 = r16
            r18 = r3
            r19 = r4
            r20 = r7
            r22 = r9
            r24 = r11
            r25 = r0
            r26 = r1
            r17.<init>(r18, r19, r20, r22, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.ManifestLight.<init>(int, java.util.List, double, double, java.util.List, java.util.List, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
