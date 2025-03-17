package com.sugarcube.decorate_engine;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bBK\b\u0011\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ(\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013HÁ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010\u001fJL\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b&\u0010\u001fJ\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001a\"\u0004\b-\u0010.R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010+\u001a\u0004\b/\u0010\u001a\"\u0004\b0\u0010.R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010+\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010.R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010+\u001a\u0004\b3\u0010\u001a\"\u0004\b4\u0010.R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\u001f\"\u0004\b7\u00108R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u00105\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u00108¨\u0006="}, d2 = {"Lcom/sugarcube/decorate_engine/ManifestIntrinsics;", "", "", "fx", "fy", "cx", "cy", "", "w", "h", "<init>", "(DDDDII)V", "seen1", "LjK/T0;", "serializationConstructorMarker", "(IDDDDIILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$decorate_engine_release", "(Lcom/sugarcube/decorate_engine/ManifestIntrinsics;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()D", "component2", "component3", "component4", "component5", "()I", "component6", "copy", "(DDDDII)Lcom/sugarcube/decorate_engine/ManifestIntrinsics;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getFx", "setFx", "(D)V", "getFy", "setFy", "getCx", "setCx", "getCy", "setCy", "I", "getW", "setW", "(I)V", "getH", "setH", "Companion", "$serializer", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ManifestIntrinsics {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);

    /* renamed from: cx  reason: collision with root package name */
    private double f142947cx;

    /* renamed from: cy  reason: collision with root package name */
    private double f142948cy;

    /* renamed from: fx  reason: collision with root package name */
    private double f142949fx;

    /* renamed from: fy  reason: collision with root package name */
    private double f142950fy;

    /* renamed from: h  reason: collision with root package name */
    private int f142951h;

    /* renamed from: w  reason: collision with root package name */
    private int f142952w;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/sugarcube/decorate_engine/ManifestIntrinsics$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/sugarcube/decorate_engine/ManifestIntrinsics;", "decorate_engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ManifestIntrinsics> serializer() {
            return ManifestIntrinsics$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ManifestIntrinsics() {
        this(0.0d, 0.0d, 0.0d, 0.0d, 0, 0, 63, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ ManifestIntrinsics copy$default(ManifestIntrinsics manifestIntrinsics, double d10, double d11, double d12, double d13, int i10, int i11, int i12, Object obj) {
        ManifestIntrinsics manifestIntrinsics2 = manifestIntrinsics;
        return manifestIntrinsics.copy((i12 & 1) != 0 ? manifestIntrinsics2.f142949fx : d10, (i12 & 2) != 0 ? manifestIntrinsics2.f142950fy : d11, (i12 & 4) != 0 ? manifestIntrinsics2.f142947cx : d12, (i12 & 8) != 0 ? manifestIntrinsics2.f142948cy : d13, (i12 & 16) != 0 ? manifestIntrinsics2.f142952w : i10, (i12 & 32) != 0 ? manifestIntrinsics2.f142951h : i11);
    }

    public static final /* synthetic */ void write$Self$decorate_engine_release(ManifestIntrinsics manifestIntrinsics, C17395d dVar, SerialDescriptor serialDescriptor) {
        if (dVar.z(serialDescriptor, 0) || Double.compare(manifestIntrinsics.f142949fx, 0.0d) != 0) {
            dVar.E(serialDescriptor, 0, manifestIntrinsics.f142949fx);
        }
        if (dVar.z(serialDescriptor, 1) || Double.compare(manifestIntrinsics.f142950fy, 0.0d) != 0) {
            dVar.E(serialDescriptor, 1, manifestIntrinsics.f142950fy);
        }
        if (dVar.z(serialDescriptor, 2) || Double.compare(manifestIntrinsics.f142947cx, 0.0d) != 0) {
            dVar.E(serialDescriptor, 2, manifestIntrinsics.f142947cx);
        }
        if (dVar.z(serialDescriptor, 3) || Double.compare(manifestIntrinsics.f142948cy, 0.0d) != 0) {
            dVar.E(serialDescriptor, 3, manifestIntrinsics.f142948cy);
        }
        if (dVar.z(serialDescriptor, 4) || manifestIntrinsics.f142952w != 0) {
            dVar.w(serialDescriptor, 4, manifestIntrinsics.f142952w);
        }
        if (dVar.z(serialDescriptor, 5) || manifestIntrinsics.f142951h != 0) {
            dVar.w(serialDescriptor, 5, manifestIntrinsics.f142951h);
        }
    }

    public final double component1() {
        return this.f142949fx;
    }

    public final double component2() {
        return this.f142950fy;
    }

    public final double component3() {
        return this.f142947cx;
    }

    public final double component4() {
        return this.f142948cy;
    }

    public final int component5() {
        return this.f142952w;
    }

    public final int component6() {
        return this.f142951h;
    }

    public final ManifestIntrinsics copy(double d10, double d11, double d12, double d13, int i10, int i11) {
        return new ManifestIntrinsics(d10, d11, d12, d13, i10, i11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ManifestIntrinsics)) {
            return false;
        }
        ManifestIntrinsics manifestIntrinsics = (ManifestIntrinsics) obj;
        return Double.compare(this.f142949fx, manifestIntrinsics.f142949fx) == 0 && Double.compare(this.f142950fy, manifestIntrinsics.f142950fy) == 0 && Double.compare(this.f142947cx, manifestIntrinsics.f142947cx) == 0 && Double.compare(this.f142948cy, manifestIntrinsics.f142948cy) == 0 && this.f142952w == manifestIntrinsics.f142952w && this.f142951h == manifestIntrinsics.f142951h;
    }

    public final double getCx() {
        return this.f142947cx;
    }

    public final double getCy() {
        return this.f142948cy;
    }

    public final double getFx() {
        return this.f142949fx;
    }

    public final double getFy() {
        return this.f142950fy;
    }

    public final int getH() {
        return this.f142951h;
    }

    public final int getW() {
        return this.f142952w;
    }

    public int hashCode() {
        return (((((((((Double.hashCode(this.f142949fx) * 31) + Double.hashCode(this.f142950fy)) * 31) + Double.hashCode(this.f142947cx)) * 31) + Double.hashCode(this.f142948cy)) * 31) + Integer.hashCode(this.f142952w)) * 31) + Integer.hashCode(this.f142951h);
    }

    public final void setCx(double d10) {
        this.f142947cx = d10;
    }

    public final void setCy(double d10) {
        this.f142948cy = d10;
    }

    public final void setFx(double d10) {
        this.f142949fx = d10;
    }

    public final void setFy(double d10) {
        this.f142950fy = d10;
    }

    public final void setH(int i10) {
        this.f142951h = i10;
    }

    public final void setW(int i10) {
        this.f142952w = i10;
    }

    public String toString() {
        double d10 = this.f142949fx;
        double d11 = this.f142950fy;
        double d12 = this.f142947cx;
        double d13 = this.f142948cy;
        int i10 = this.f142952w;
        int i11 = this.f142951h;
        return "ManifestIntrinsics(fx=" + d10 + ", fy=" + d11 + ", cx=" + d12 + ", cy=" + d13 + ", w=" + i10 + ", h=" + i11 + ")";
    }

    public ManifestIntrinsics(double d10, double d11, double d12, double d13, int i10, int i11) {
        this.f142949fx = d10;
        this.f142950fy = d11;
        this.f142947cx = d12;
        this.f142948cy = d13;
        this.f142952w = i10;
        this.f142951h = i11;
    }

    @C16814e
    public /* synthetic */ ManifestIntrinsics(int i10, double d10, double d11, double d12, double d13, int i11, int i12, T0 t02) {
        if ((i10 & 1) == 0) {
            this.f142949fx = 0.0d;
        } else {
            this.f142949fx = d10;
        }
        if ((i10 & 2) == 0) {
            this.f142950fy = 0.0d;
        } else {
            this.f142950fy = d11;
        }
        if ((i10 & 4) == 0) {
            this.f142947cx = 0.0d;
        } else {
            this.f142947cx = d12;
        }
        if ((i10 & 8) == 0) {
            this.f142948cy = 0.0d;
        } else {
            this.f142948cy = d13;
        }
        if ((i10 & 16) == 0) {
            this.f142952w = 0;
        } else {
            this.f142952w = i11;
        }
        if ((i10 & 32) == 0) {
            this.f142951h = 0;
        } else {
            this.f142951h = i12;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ManifestIntrinsics(double r12, double r14, double r16, double r18, int r20, int r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22 & 1
            r1 = 0
            if (r0 == 0) goto L_0x0008
            r3 = r1
            goto L_0x0009
        L_0x0008:
            r3 = r12
        L_0x0009:
            r0 = r22 & 2
            if (r0 == 0) goto L_0x000f
            r5 = r1
            goto L_0x0010
        L_0x000f:
            r5 = r14
        L_0x0010:
            r0 = r22 & 4
            if (r0 == 0) goto L_0x0016
            r7 = r1
            goto L_0x0018
        L_0x0016:
            r7 = r16
        L_0x0018:
            r0 = r22 & 8
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r1 = r18
        L_0x001f:
            r0 = r22 & 16
            r9 = 0
            if (r0 == 0) goto L_0x0026
            r0 = r9
            goto L_0x0028
        L_0x0026:
            r0 = r20
        L_0x0028:
            r10 = r22 & 32
            if (r10 == 0) goto L_0x002d
            goto L_0x002f
        L_0x002d:
            r9 = r21
        L_0x002f:
            r12 = r11
            r13 = r3
            r15 = r5
            r17 = r7
            r19 = r1
            r21 = r0
            r22 = r9
            r12.<init>(r13, r15, r17, r19, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate_engine.ManifestIntrinsics.<init>(double, double, double, double, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
