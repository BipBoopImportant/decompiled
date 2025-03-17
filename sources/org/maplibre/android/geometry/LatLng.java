package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 !2\u00020\u0001:\u0001!B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0002\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR,\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00048\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R,\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00048\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b!\u0010\u001e\"\u0004\b\"\u0010 R\"\u0010%\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 ¨\u0006&"}, d2 = {"Lorg/maplibre/android/geometry/LatLng;", "Landroid/os/Parcelable;", "<init>", "()V", "", "latitude", "longitude", "(DD)V", "Landroid/os/Parcel;", "in", "(Landroid/os/Parcel;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "describeContents", "out", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "a", "()D", "c", "(D)V", "b", "d", "getAltitude", "setAltitude", "altitude", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatLng implements Parcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final b f145511b = new b((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private double f145512a;
    @Keep
    private double latitude;
    @Keep
    private double longitude;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"org/maplibre/android/geometry/LatLng$a", "Landroid/os/Parcelable$Creator;", "Lorg/maplibre/android/geometry/LatLng;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lorg/maplibre/android/geometry/LatLng;", "", "size", "", "b", "(I)[Lorg/maplibre/android/geometry/LatLng;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LatLng> {
        a() {
        }

        /* renamed from: a */
        public LatLng createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return new LatLng(parcel);
        }

        /* renamed from: b */
        public LatLng[] newArray(int i10) {
            return new LatLng[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lorg/maplibre/android/geometry/LatLng$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lorg/maplibre/android/geometry/LatLng;", "CREATOR", "Landroid/os/Parcelable$Creator;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public LatLng() {
        c(0.0d);
        d(0.0d);
    }

    public final double a() {
        return this.latitude;
    }

    public final double b() {
        return this.longitude;
    }

    public final void c(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("latitude must not be NaN");
        } else if (Math.abs(d10) <= 90.0d) {
            this.latitude = d10;
        } else {
            throw new IllegalArgumentException("latitude must be between -90 and 90");
        }
    }

    public final void d(double d10) {
        if (Double.isNaN(d10)) {
            throw new IllegalArgumentException("longitude must not be NaN");
        } else if (!Double.isInfinite(d10)) {
            this.longitude = d10;
        } else {
            throw new IllegalArgumentException("longitude must not be infinite");
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (C17542s.e(LatLng.class, obj.getClass())) {
                LatLng latLng = (LatLng) obj;
                return Double.compare(latLng.f145512a, this.f145512a) == 0 && Double.compare(latLng.latitude, this.latitude) == 0 && Double.compare(latLng.longitude, this.longitude) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f145512a);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public String toString() {
        double d10 = this.latitude;
        double d11 = this.longitude;
        double d12 = this.f145512a;
        return "LatLng [latitude=" + d10 + ", longitude=" + d11 + ", altitude=" + d12 + "]";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "out");
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeDouble(this.f145512a);
    }

    @Keep
    public LatLng(double d10, double d11) {
        c(d10);
        d(d11);
    }

    public LatLng(Parcel parcel) {
        C17542s.j(parcel, "in");
        c(parcel.readDouble());
        d(parcel.readDouble());
        this.f145512a = parcel.readDouble();
    }
}
