package com.sugarcube.app.base.data.model;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/sugarcube/app/base/data/model/QualityWarnings;", "", "badFrames", "", "excessiveMotion", "lightingScan", "principalPoint", "lowIntensity", "<init>", "(FFFFF)V", "getBadFrames", "()F", "getExcessiveMotion", "getLightingScan", "getPrincipalPoint", "getLowIntensity", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class QualityWarnings {
    public static final int $stable = 0;
    private final float badFrames;
    private final float excessiveMotion;
    private final float lightingScan;
    private final float lowIntensity;
    private final float principalPoint;

    public QualityWarnings() {
        this(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ QualityWarnings copy$default(QualityWarnings qualityWarnings, float f10, float f11, float f12, float f13, float f14, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = qualityWarnings.badFrames;
        }
        if ((i10 & 2) != 0) {
            f11 = qualityWarnings.excessiveMotion;
        }
        float f15 = f11;
        if ((i10 & 4) != 0) {
            f12 = qualityWarnings.lightingScan;
        }
        float f16 = f12;
        if ((i10 & 8) != 0) {
            f13 = qualityWarnings.principalPoint;
        }
        float f17 = f13;
        if ((i10 & 16) != 0) {
            f14 = qualityWarnings.lowIntensity;
        }
        return qualityWarnings.copy(f10, f15, f16, f17, f14);
    }

    public final float component1() {
        return this.badFrames;
    }

    public final float component2() {
        return this.excessiveMotion;
    }

    public final float component3() {
        return this.lightingScan;
    }

    public final float component4() {
        return this.principalPoint;
    }

    public final float component5() {
        return this.lowIntensity;
    }

    public final QualityWarnings copy(float f10, float f11, float f12, float f13, float f14) {
        return new QualityWarnings(f10, f11, f12, f13, f14);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityWarnings)) {
            return false;
        }
        QualityWarnings qualityWarnings = (QualityWarnings) obj;
        return Float.compare(this.badFrames, qualityWarnings.badFrames) == 0 && Float.compare(this.excessiveMotion, qualityWarnings.excessiveMotion) == 0 && Float.compare(this.lightingScan, qualityWarnings.lightingScan) == 0 && Float.compare(this.principalPoint, qualityWarnings.principalPoint) == 0 && Float.compare(this.lowIntensity, qualityWarnings.lowIntensity) == 0;
    }

    public final float getBadFrames() {
        return this.badFrames;
    }

    public final float getExcessiveMotion() {
        return this.excessiveMotion;
    }

    public final float getLightingScan() {
        return this.lightingScan;
    }

    public final float getLowIntensity() {
        return this.lowIntensity;
    }

    public final float getPrincipalPoint() {
        return this.principalPoint;
    }

    public int hashCode() {
        return (((((((Float.hashCode(this.badFrames) * 31) + Float.hashCode(this.excessiveMotion)) * 31) + Float.hashCode(this.lightingScan)) * 31) + Float.hashCode(this.principalPoint)) * 31) + Float.hashCode(this.lowIntensity);
    }

    public String toString() {
        float f10 = this.badFrames;
        float f11 = this.excessiveMotion;
        float f12 = this.lightingScan;
        float f13 = this.principalPoint;
        float f14 = this.lowIntensity;
        return "QualityWarnings(badFrames=" + f10 + ", excessiveMotion=" + f11 + ", lightingScan=" + f12 + ", principalPoint=" + f13 + ", lowIntensity=" + f14 + ")";
    }

    public QualityWarnings(float f10, float f11, float f12, float f13, float f14) {
        this.badFrames = f10;
        this.excessiveMotion = f11;
        this.lightingScan = f12;
        this.principalPoint = f13;
        this.lowIntensity = f14;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ QualityWarnings(float r5, float r6, float r7, float r8, float r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.data.model.QualityWarnings.<init>(float, float, float, float, float, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
