package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \"2\u00020\u0001:\u0001 B\u0019\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0012\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR$\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001f¨\u0006#"}, d2 = {"Lorg/maplibre/android/geometry/ProjectedMeters;", "Landroid/os/Parcelable;", "", "northing", "easting", "<init>", "(DD)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "out", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "value", "a", "D", "getNorthing", "()D", "b", "getEasting", "c", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ProjectedMeters implements Parcelable {
    public static final Parcelable.Creator<ProjectedMeters> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final b f145515c = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private double f145516a;

    /* renamed from: b  reason: collision with root package name */
    private double f145517b;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"org/maplibre/android/geometry/ProjectedMeters$a", "Landroid/os/Parcelable$Creator;", "Lorg/maplibre/android/geometry/ProjectedMeters;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lorg/maplibre/android/geometry/ProjectedMeters;", "", "size", "", "b", "(I)[Lorg/maplibre/android/geometry/ProjectedMeters;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProjectedMeters> {
        a() {
        }

        /* renamed from: a */
        public ProjectedMeters createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new ProjectedMeters(parcel, (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public ProjectedMeters[] newArray(int i10) {
            return new ProjectedMeters[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/maplibre/android/geometry/ProjectedMeters$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lorg/maplibre/android/geometry/ProjectedMeters;", "CREATOR", "Landroid/os/Parcelable$Creator;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public /* synthetic */ ProjectedMeters(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (C17542s.e(ProjectedMeters.class, obj.getClass())) {
                ProjectedMeters projectedMeters = (ProjectedMeters) obj;
                return Double.compare(projectedMeters.f145517b, this.f145517b) == 0 && Double.compare(projectedMeters.f145516a, this.f145516a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f145517b);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f145516a);
        return (((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public String toString() {
        double d10 = this.f145516a;
        double d11 = this.f145517b;
        return "ProjectedMeters [northing=" + d10 + ", easting=" + d11 + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "out");
        parcel.writeDouble(this.f145516a);
        parcel.writeDouble(this.f145517b);
    }

    @Keep
    public ProjectedMeters(double d10, double d11) {
        this.f145516a = d10;
        this.f145517b = d11;
    }

    private ProjectedMeters(Parcel parcel) {
        this.f145516a = parcel.readDouble();
        this.f145517b = parcel.readDouble();
    }
}
