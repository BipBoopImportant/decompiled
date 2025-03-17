package com.sugarcube.app.base.data.model;

import com.squareup.moshi.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/sugarcube/app/base/data/model/QualityMeta;", "", "warnings", "Lcom/sugarcube/app/base/data/model/QualityWarnings;", "android", "Lcom/sugarcube/app/base/data/model/AndroidQuality;", "floorDetection", "Lcom/sugarcube/app/base/data/model/FloorDetection;", "<init>", "(Lcom/sugarcube/app/base/data/model/QualityWarnings;Lcom/sugarcube/app/base/data/model/AndroidQuality;Lcom/sugarcube/app/base/data/model/FloorDetection;)V", "getWarnings", "()Lcom/sugarcube/app/base/data/model/QualityWarnings;", "getAndroid", "()Lcom/sugarcube/app/base/data/model/AndroidQuality;", "getFloorDetection", "()Lcom/sugarcube/app/base/data/model/FloorDetection;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@g(generateAdapter = true)
public final class QualityMeta {
    public static final int $stable = 8;

    /* renamed from: android  reason: collision with root package name */
    private final AndroidQuality f122944android;
    private final FloorDetection floorDetection;
    private final QualityWarnings warnings;

    public QualityMeta() {
        this((QualityWarnings) null, (AndroidQuality) null, (FloorDetection) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ QualityMeta copy$default(QualityMeta qualityMeta, QualityWarnings qualityWarnings, AndroidQuality androidQuality, FloorDetection floorDetection2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            qualityWarnings = qualityMeta.warnings;
        }
        if ((i10 & 2) != 0) {
            androidQuality = qualityMeta.f122944android;
        }
        if ((i10 & 4) != 0) {
            floorDetection2 = qualityMeta.floorDetection;
        }
        return qualityMeta.copy(qualityWarnings, androidQuality, floorDetection2);
    }

    public final QualityWarnings component1() {
        return this.warnings;
    }

    public final AndroidQuality component2() {
        return this.f122944android;
    }

    public final FloorDetection component3() {
        return this.floorDetection;
    }

    public final QualityMeta copy(QualityWarnings qualityWarnings, AndroidQuality androidQuality, FloorDetection floorDetection2) {
        C17542s.j(qualityWarnings, "warnings");
        C17542s.j(androidQuality, "android");
        return new QualityMeta(qualityWarnings, androidQuality, floorDetection2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QualityMeta)) {
            return false;
        }
        QualityMeta qualityMeta = (QualityMeta) obj;
        return C17542s.e(this.warnings, qualityMeta.warnings) && C17542s.e(this.f122944android, qualityMeta.f122944android) && C17542s.e(this.floorDetection, qualityMeta.floorDetection);
    }

    public final AndroidQuality getAndroid() {
        return this.f122944android;
    }

    public final FloorDetection getFloorDetection() {
        return this.floorDetection;
    }

    public final QualityWarnings getWarnings() {
        return this.warnings;
    }

    public int hashCode() {
        int hashCode = ((this.warnings.hashCode() * 31) + this.f122944android.hashCode()) * 31;
        FloorDetection floorDetection2 = this.floorDetection;
        return hashCode + (floorDetection2 == null ? 0 : floorDetection2.hashCode());
    }

    public String toString() {
        QualityWarnings qualityWarnings = this.warnings;
        AndroidQuality androidQuality = this.f122944android;
        FloorDetection floorDetection2 = this.floorDetection;
        return "QualityMeta(warnings=" + qualityWarnings + ", android=" + androidQuality + ", floorDetection=" + floorDetection2 + ")";
    }

    public QualityMeta(QualityWarnings qualityWarnings, AndroidQuality androidQuality, FloorDetection floorDetection2) {
        C17542s.j(qualityWarnings, "warnings");
        C17542s.j(androidQuality, "android");
        this.warnings = qualityWarnings;
        this.f122944android = androidQuality;
        this.floorDetection = floorDetection2;
    }

    public /* synthetic */ QualityMeta(QualityWarnings qualityWarnings, AndroidQuality androidQuality, FloorDetection floorDetection2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        QualityMeta qualityMeta;
        FloorDetection floorDetection3;
        QualityWarnings qualityWarnings2 = (i10 & 1) != 0 ? new QualityWarnings(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, (DefaultConstructorMarker) null) : qualityWarnings;
        AndroidQuality androidQuality2 = (i10 & 2) != 0 ? new AndroidQuality((float[]) null, (int[]) null, (Integer) null, 0, 0, (float[]) null, 0, 0.0f, 0.0f, (int[]) null, 0, 0, 0, 0.0f, 0.0f, false, false, false, false, 0.0f, 0.0f, 0.0f, 0, 0, 16777215, (DefaultConstructorMarker) null) : androidQuality;
        if ((i10 & 4) != 0) {
            floorDetection3 = null;
            qualityMeta = this;
        } else {
            qualityMeta = this;
            floorDetection3 = floorDetection2;
        }
        new QualityMeta(qualityWarnings2, androidQuality2, floorDetection3);
    }
}
