package com.sugarcube.decorate_engine;

import XH.C16814e;
import YH.C16877v;
import fK.p;
import iK.C17395d;
import jK.C17438C;
import jK.C17451f;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0017\b\b\u0018\u0000 A2\u00020\u0001:\u0002BAB_\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u000b\u0010\fBk\b\u0011\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J(\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015HÁ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJh\u0010$\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u0010\u001c\"\u0004\b1\u00102R(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010/\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u00102R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u00105\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u00108R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u00105\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u00108R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u00108R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\b=\u0010\u001f\"\u0004\b>\u00108R(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010/\u001a\u0004\b?\u0010\u001c\"\u0004\b@\u00102¨\u0006C"}, d2 = {"Lcom/sugarcube/decorate_engine/CameraParameters;", "", "", "", "pos", "rotQuat", "aspect", "yfov", "near", "far", "cxyNormalized", "<init>", "(Ljava/util/List;Ljava/util/List;DDDDLjava/util/List;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;DDDDLjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/CameraParameters;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "component3", "()D", "component4", "component5", "component6", "component7", "copy", "(Ljava/util/List;Ljava/util/List;DDDDLjava/util/List;)Lcom/sugarcube/decorate_engine/CameraParameters;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPos", "setPos", "(Ljava/util/List;)V", "getRotQuat", "setRotQuat", "D", "getAspect", "setAspect", "(D)V", "getYfov", "setYfov", "getNear", "setNear", "getFar", "setFar", "getCxyNormalized", "setCxyNormalized", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CameraParameters {
    /* access modifiers changed from: private */
    public static final KSerializer<Object>[] $childSerializers;
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private double aspect;
    private List<Double> cxyNormalized;
    private double far;
    private double near;
    private List<Double> pos;
    private List<Double> rotQuat;
    private double yfov;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/CameraParameters$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/CameraParameters;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CameraParameters> serializer() {
            return CameraParameters$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        C17438C c10 = C17438C.f144010a;
        $childSerializers = new KSerializer[]{new C17451f(c10), new C17451f(c10), null, null, null, null, new C17451f(c10)};
    }

    public CameraParameters() {
        this((List) null, (List) null, 0.0d, 0.0d, 0.0d, 0.0d, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ CameraParameters copy$default(CameraParameters cameraParameters, List list, List list2, double d10, double d11, double d12, double d13, List list3, int i10, Object obj) {
        CameraParameters cameraParameters2 = cameraParameters;
        return cameraParameters.copy((i10 & 1) != 0 ? cameraParameters2.pos : list, (i10 & 2) != 0 ? cameraParameters2.rotQuat : list2, (i10 & 4) != 0 ? cameraParameters2.aspect : d10, (i10 & 8) != 0 ? cameraParameters2.yfov : d11, (i10 & 16) != 0 ? cameraParameters2.near : d12, (i10 & 32) != 0 ? cameraParameters2.far : d13, (i10 & 64) != 0 ? cameraParameters2.cxyNormalized : list3);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(CameraParameters cameraParameters, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        boolean z10 = dVar.z(serialDescriptor, 0);
        Double valueOf = Double.valueOf(0.0d);
        if (z10 || !C17542s.e(cameraParameters.pos, C16877v.q(valueOf, valueOf, valueOf))) {
            dVar.i(serialDescriptor, 0, kSerializerArr[0], cameraParameters.pos);
        }
        if (dVar.z(serialDescriptor, 1) || !C17542s.e(cameraParameters.rotQuat, C16877v.q(valueOf, valueOf, valueOf, valueOf))) {
            dVar.i(serialDescriptor, 1, kSerializerArr[1], cameraParameters.rotQuat);
        }
        if (dVar.z(serialDescriptor, 2) || Double.compare(cameraParameters.aspect, 0.0d) != 0) {
            dVar.E(serialDescriptor, 2, cameraParameters.aspect);
        }
        if (dVar.z(serialDescriptor, 3) || Double.compare(cameraParameters.yfov, 0.0d) != 0) {
            dVar.E(serialDescriptor, 3, cameraParameters.yfov);
        }
        if (dVar.z(serialDescriptor, 4) || Double.compare(cameraParameters.near, 0.0d) != 0) {
            dVar.E(serialDescriptor, 4, cameraParameters.near);
        }
        if (dVar.z(serialDescriptor, 5) || Double.compare(cameraParameters.far, 0.0d) != 0) {
            dVar.E(serialDescriptor, 5, cameraParameters.far);
        }
        if (dVar.z(serialDescriptor, 6) || !C17542s.e(cameraParameters.cxyNormalized, C16877v.q(valueOf, valueOf))) {
            dVar.i(serialDescriptor, 6, kSerializerArr[6], cameraParameters.cxyNormalized);
        }
    }

    public final List<Double> component1() {
        return this.pos;
    }

    public final List<Double> component2() {
        return this.rotQuat;
    }

    public final double component3() {
        return this.aspect;
    }

    public final double component4() {
        return this.yfov;
    }

    public final double component5() {
        return this.near;
    }

    public final double component6() {
        return this.far;
    }

    public final List<Double> component7() {
        return this.cxyNormalized;
    }

    public final CameraParameters copy(List<Double> list, List<Double> list2, double d10, double d11, double d12, double d13, List<Double> list3) {
        C17542s.j(list, "pos");
        C17542s.j(list2, "rotQuat");
        List<Double> list4 = list3;
        C17542s.j(list4, "cxyNormalized");
        return new CameraParameters(list, list2, d10, d11, d12, d13, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraParameters)) {
            return false;
        }
        CameraParameters cameraParameters = (CameraParameters) obj;
        return C17542s.e(this.pos, cameraParameters.pos) && C17542s.e(this.rotQuat, cameraParameters.rotQuat) && Double.compare(this.aspect, cameraParameters.aspect) == 0 && Double.compare(this.yfov, cameraParameters.yfov) == 0 && Double.compare(this.near, cameraParameters.near) == 0 && Double.compare(this.far, cameraParameters.far) == 0 && C17542s.e(this.cxyNormalized, cameraParameters.cxyNormalized);
    }

    public final double getAspect() {
        return this.aspect;
    }

    public final List<Double> getCxyNormalized() {
        return this.cxyNormalized;
    }

    public final double getFar() {
        return this.far;
    }

    public final double getNear() {
        return this.near;
    }

    public final List<Double> getPos() {
        return this.pos;
    }

    public final List<Double> getRotQuat() {
        return this.rotQuat;
    }

    public final double getYfov() {
        return this.yfov;
    }

    public int hashCode() {
        return (((((((((((this.pos.hashCode() * 31) + this.rotQuat.hashCode()) * 31) + Double.hashCode(this.aspect)) * 31) + Double.hashCode(this.yfov)) * 31) + Double.hashCode(this.near)) * 31) + Double.hashCode(this.far)) * 31) + this.cxyNormalized.hashCode();
    }

    public final void setAspect(double d10) {
        this.aspect = d10;
    }

    public final void setCxyNormalized(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.cxyNormalized = list;
    }

    public final void setFar(double d10) {
        this.far = d10;
    }

    public final void setNear(double d10) {
        this.near = d10;
    }

    public final void setPos(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.pos = list;
    }

    public final void setRotQuat(List<Double> list) {
        C17542s.j(list, "<set-?>");
        this.rotQuat = list;
    }

    public final void setYfov(double d10) {
        this.yfov = d10;
    }

    public String toString() {
        List<Double> list = this.pos;
        List<Double> list2 = this.rotQuat;
        double d10 = this.aspect;
        double d11 = this.yfov;
        double d12 = this.near;
        double d13 = this.far;
        List<Double> list3 = this.cxyNormalized;
        return "CameraParameters(pos=" + list + ", rotQuat=" + list2 + ", aspect=" + d10 + ", yfov=" + d11 + ", near=" + d12 + ", far=" + d13 + ", cxyNormalized=" + list3 + ")";
    }

    @C16814e
    public /* synthetic */ CameraParameters(int i10, List list, List list2, double d10, double d11, double d12, double d13, List list3, T0 t02) {
        List list4;
        List list5;
        List list6;
        if ((i10 & 1) == 0) {
            list4 = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            list4 = list;
        }
        this.pos = list4;
        if ((i10 & 2) == 0) {
            list5 = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            list5 = list2;
        }
        this.rotQuat = list5;
        if ((i10 & 4) == 0) {
            this.aspect = 0.0d;
        } else {
            this.aspect = d10;
        }
        if ((i10 & 8) == 0) {
            this.yfov = 0.0d;
        } else {
            this.yfov = d11;
        }
        if ((i10 & 16) == 0) {
            this.near = 0.0d;
        } else {
            this.near = d12;
        }
        if ((i10 & 32) == 0) {
            this.far = 0.0d;
        } else {
            this.far = d13;
        }
        if ((i10 & 64) == 0) {
            list6 = C16877v.q(Double.valueOf(0.0d), Double.valueOf(0.0d));
        } else {
            list6 = list3;
        }
        this.cxyNormalized = list6;
    }

    public CameraParameters(List<Double> list, List<Double> list2, double d10, double d11, double d12, double d13, List<Double> list3) {
        C17542s.j(list, "pos");
        C17542s.j(list2, "rotQuat");
        C17542s.j(list3, "cxyNormalized");
        this.pos = list;
        this.rotQuat = list2;
        this.aspect = d10;
        this.yfov = d11;
        this.near = d12;
        this.far = d13;
        this.cxyNormalized = list3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ CameraParameters(java.util.List r13, java.util.List r14, double r15, double r17, double r19, double r21, java.util.List r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24 & 1
            r1 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r1)
            if (r0 == 0) goto L_0x0013
            java.lang.Double[] r0 = new java.lang.Double[]{r3, r3, r3}
            java.util.List r0 = YH.C16877v.q(r0)
            goto L_0x0014
        L_0x0013:
            r0 = r13
        L_0x0014:
            r4 = r24 & 2
            if (r4 == 0) goto L_0x0021
            java.lang.Double[] r4 = new java.lang.Double[]{r3, r3, r3, r3}
            java.util.List r4 = YH.C16877v.q(r4)
            goto L_0x0022
        L_0x0021:
            r4 = r14
        L_0x0022:
            r5 = r24 & 4
            if (r5 == 0) goto L_0x0028
            r5 = r1
            goto L_0x0029
        L_0x0028:
            r5 = r15
        L_0x0029:
            r7 = r24 & 8
            if (r7 == 0) goto L_0x002f
            r7 = r1
            goto L_0x0031
        L_0x002f:
            r7 = r17
        L_0x0031:
            r9 = r24 & 16
            if (r9 == 0) goto L_0x0037
            r9 = r1
            goto L_0x0039
        L_0x0037:
            r9 = r19
        L_0x0039:
            r11 = r24 & 32
            if (r11 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r1 = r21
        L_0x0040:
            r11 = r24 & 64
            if (r11 == 0) goto L_0x004d
            java.lang.Double[] r3 = new java.lang.Double[]{r3, r3}
            java.util.List r3 = YH.C16877v.q(r3)
            goto L_0x004f
        L_0x004d:
            r3 = r23
        L_0x004f:
            r13 = r12
            r14 = r0
            r15 = r4
            r16 = r5
            r18 = r7
            r20 = r9
            r22 = r1
            r24 = r3
            r13.<init>(r14, r15, r16, r18, r20, r22, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.CameraParameters.<init>(java.util.List, java.util.List, double, double, double, double, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
