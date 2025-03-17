package org.maplibre.android.geometry;

import AL.C15448b;
import BL.C15485a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17535k;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.maplibre.android.utils.d;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002RSB)\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\fJ/\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0015\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020\u001f¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010)\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0000H\u0002¢\u0006\u0004\b)\u0010+J\u0015\u0010-\u001a\u00020\u00002\u0006\u0010,\u001a\u00020\u0000¢\u0006\u0004\b-\u0010.J-\u0010-\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b-\u0010\u0014J\u0017\u00100\u001a\u0004\u0018\u00010\u00002\u0006\u0010/\u001a\u00020\u0000¢\u0006\u0004\b0\u0010.J-\u00100\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0002¢\u0006\u0004\b0\u0010\u0014J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u000201H\u0016¢\u0006\u0004\b4\u00103J\u001f\u00109\u001a\u0002082\u0006\u00106\u001a\u0002052\u0006\u00107\u001a\u000201H\u0016¢\u0006\u0004\b9\u0010:R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010;R\u0014\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010;R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010;R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010;R\u0011\u0010>\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010@\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b?\u0010=R\u0011\u0010B\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bA\u0010=R\u0011\u0010D\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bC\u0010=R\u0011\u0010F\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\bE\u0010=R\u0011\u0010J\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010L\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0011\u0010N\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0011\u0010O\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006T"}, d2 = {"Lorg/maplibre/android/geometry/LatLngBounds;", "Landroid/os/Parcelable;", "", "latitudeNorth", "longitudeEast", "latitudeSouth", "longitudeWest", "<init>", "(DDDD)V", "latitude", "", "containsLatitude", "(D)Z", "longitude", "containsLongitude", "northLat", "eastLon", "southLat", "westLon", "unionNoParamCheck", "(DDDD)Lorg/maplibre/android/geometry/LatLngBounds;", "intersectNoParamCheck", "getLatNorth", "()D", "getLatSouth", "getLonEast", "getLonWest", "", "toString", "()Ljava/lang/String;", "", "Lorg/maplibre/android/geometry/LatLng;", "toLatLngs", "()[Lorg/maplibre/android/geometry/LatLng;", "latLng", "include", "(Lorg/maplibre/android/geometry/LatLng;)Lorg/maplibre/android/geometry/LatLngBounds;", "", "other", "equals", "(Ljava/lang/Object;)Z", "contains", "(Lorg/maplibre/android/geometry/LatLng;)Z", "(Lorg/maplibre/android/geometry/LatLngBounds;)Z", "bounds", "union", "(Lorg/maplibre/android/geometry/LatLngBounds;)Lorg/maplibre/android/geometry/LatLngBounds;", "box", "intersect", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "out", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "D", "getCenter", "()Lorg/maplibre/android/geometry/LatLng;", "center", "getSouthWest", "southWest", "getNorthEast", "northEast", "getSouthEast", "southEast", "getNorthWest", "northWest", "LBL/a;", "getSpan", "()LBL/a;", "span", "getLatitudeSpan", "latitudeSpan", "getLongitudeSpan", "longitudeSpan", "isEmptySpan", "()Z", "Companion", "a", "c", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Keep
public final class LatLngBounds implements Parcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new b();
    public static final c Companion = new c((DefaultConstructorMarker) null);
    @Keep
    public final double latitudeNorth;
    @Keep
    public final double latitudeSouth;
    @Keep
    public final double longitudeEast;
    @Keep
    public final double longitudeWest;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lorg/maplibre/android/geometry/LatLngBounds$a;", "", "<init>", "()V", "Lorg/maplibre/android/geometry/LatLngBounds;", "a", "()Lorg/maplibre/android/geometry/LatLngBounds;", "Lorg/maplibre/android/geometry/LatLng;", "latLng", "b", "(Lorg/maplibre/android/geometry/LatLng;)Lorg/maplibre/android/geometry/LatLngBounds$a;", "", "Ljava/util/List;", "latLngList", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List<LatLng> f145513a = new ArrayList();

        public final LatLngBounds a() {
            if (this.f145513a.size() >= 2) {
                return LatLngBounds.Companion.f(this.f145513a);
            }
            throw new C15448b(this.f145513a.size());
        }

        public final a b(LatLng latLng) {
            C17542s.j(latLng, "latLng");
            this.f145513a.add(latLng);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"org/maplibre/android/geometry/LatLngBounds$b", "Landroid/os/Parcelable$Creator;", "Lorg/maplibre/android/geometry/LatLngBounds;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lorg/maplibre/android/geometry/LatLngBounds;", "", "size", "", "b", "(I)[Lorg/maplibre/android/geometry/LatLngBounds;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<LatLngBounds> {
        b() {
        }

        /* renamed from: a */
        public LatLngBounds createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return LatLngBounds.Companion.i(parcel);
        }

        /* renamed from: b */
        public LatLngBounds[] newArray(int i10) {
            return new LatLngBounds[i10];
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001d\u001a\u00020\u00152\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ3\u0010\u001f\u001a\u00020\u00152\b\b\u0001\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b!\u0010\"R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150#8\u0006X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lorg/maplibre/android/geometry/LatLngBounds$c;", "", "<init>", "()V", "", "latNorth", "lonEast", "latSouth", "lonWest", "LXH/N;", "c", "(DDDD)V", "", "z", "y", "g", "(II)D", "x", "h", "Landroid/os/Parcel;", "parcel", "Lorg/maplibre/android/geometry/LatLngBounds;", "i", "(Landroid/os/Parcel;)Lorg/maplibre/android/geometry/LatLngBounds;", "j", "()Lorg/maplibre/android/geometry/LatLngBounds;", "", "Lorg/maplibre/android/geometry/LatLng;", "latLngs", "f", "(Ljava/util/List;)Lorg/maplibre/android/geometry/LatLngBounds;", "d", "(DDDD)Lorg/maplibre/android/geometry/LatLngBounds;", "e", "(III)Lorg/maplibre/android/geometry/LatLngBounds;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final void c(double d10, double d11, double d12, double d13) {
            C17535k kVar = C17535k.f144384a;
            if (d.b(kVar, d10) || d.b(kVar, d12)) {
                throw new IllegalArgumentException("latitude must not be NaN");
            } else if (d.b(kVar, d11) || d.b(kVar, d13)) {
                throw new IllegalArgumentException("longitude must not be NaN");
            } else if (d.a(kVar, d11) || d.a(kVar, d13)) {
                throw new IllegalArgumentException("longitude must not be infinite");
            } else if (d10 > 90.0d || d10 < -90.0d || d12 > 90.0d || d12 < -90.0d) {
                throw new IllegalArgumentException("latitude must be between -90 and 90");
            } else if (d10 < d12) {
                throw new IllegalArgumentException("latNorth cannot be less than latSouth");
            } else if (d11 < d13) {
                throw new IllegalArgumentException("lonEast cannot be less than lonWest");
            }
        }

        private final double g(int i10, int i11) {
            double pow = 3.141592653589793d - ((((double) i11) * 6.283185307179586d) / Math.pow(2.0d, (double) i10));
            return Math.toDegrees(Math.atan((Math.exp(pow) - Math.exp(-pow)) * 0.5d));
        }

        private final double h(int i10, int i11) {
            return ((((double) i11) / Math.pow(2.0d, (double) i10)) * 360.0d) - 180.0d;
        }

        /* access modifiers changed from: private */
        public final LatLngBounds i(Parcel parcel) {
            return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }

        public final LatLngBounds d(double d10, double d11, double d12, double d13) {
            c(d10, d11, d12, d13);
            return new LatLngBounds(d10, d11, d12, d13);
        }

        public final LatLngBounds e(int i10, int i11, int i12) {
            return new LatLngBounds(g(i10, i12), h(i10, i11 + 1), g(i10, i12 + 1), h(i10, i11));
        }

        public final LatLngBounds f(List<LatLng> list) {
            C17542s.j(list, "latLngs");
            double d10 = Double.MAX_VALUE;
            double d11 = 90.0d;
            double d12 = -90.0d;
            double d13 = -1.7976931348623157E308d;
            for (LatLng next : list) {
                double a10 = next.a();
                double b10 = next.b();
                d11 = Math.min(d11, a10);
                d10 = Math.min(d10, b10);
                d12 = Math.max(d12, a10);
                d13 = Math.max(d13, b10);
            }
            return new LatLngBounds(d12, d13, d11, d10);
        }

        public final LatLngBounds j() {
            return d(90.0d, 180.0d, -90.0d, -180.0d);
        }

        private c() {
        }
    }

    @Keep
    public LatLngBounds(double d10, double d11, double d12, double d13) {
        this.latitudeNorth = d10;
        this.longitudeEast = d11;
        this.latitudeSouth = d12;
        this.longitudeWest = d13;
    }

    private final boolean containsLatitude(double d10) {
        return d10 <= this.latitudeNorth && d10 >= this.latitudeSouth;
    }

    private final boolean containsLongitude(double d10) {
        return d10 <= this.longitudeEast && d10 >= this.longitudeWest;
    }

    public static final LatLngBounds from(double d10, double d11, double d12, double d13) {
        return Companion.d(d10, d11, d12, d13);
    }

    private final LatLngBounds intersectNoParamCheck(double d10, double d11, double d12, double d13) {
        double max = Math.max(this.longitudeWest, d13);
        double min = Math.min(this.longitudeEast, d11);
        if (min < max) {
            return null;
        }
        double max2 = Math.max(this.latitudeSouth, d12);
        double d14 = d10;
        double min2 = Math.min(this.latitudeNorth, d10);
        if (min2 >= max2) {
            return new LatLngBounds(min2, min, max2, max);
        }
        return null;
    }

    private final LatLngBounds unionNoParamCheck(double d10, double d11, double d12, double d13) {
        double d14 = this.latitudeNorth;
        double d15 = d14 < d10 ? d10 : d14;
        double d16 = this.longitudeEast;
        if (d16 < d11) {
            d16 = d11;
        }
        double d17 = this.latitudeSouth;
        if (d17 > d12) {
            d17 = d12;
        }
        double d18 = this.longitudeWest;
        if (d18 > d13) {
            d18 = d13;
        }
        return new LatLngBounds(d15, d16, d17, d18);
    }

    public static final LatLngBounds world() {
        return Companion.j();
    }

    public final boolean contains(LatLng latLng) {
        C17542s.j(latLng, "latLng");
        return containsLatitude(latLng.a()) && containsLongitude(latLng.b());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.latitudeNorth == latLngBounds.latitudeNorth && this.latitudeSouth == latLngBounds.latitudeSouth && this.longitudeEast == latLngBounds.longitudeEast && this.longitudeWest == latLngBounds.longitudeWest;
    }

    public final LatLng getCenter() {
        return new LatLng((this.latitudeNorth + this.latitudeSouth) / 2.0d, (this.longitudeEast + this.longitudeWest) / 2.0d);
    }

    public final double getLatNorth() {
        return this.latitudeNorth;
    }

    public final double getLatSouth() {
        return this.latitudeSouth;
    }

    public final double getLatitudeSpan() {
        return Math.abs(this.latitudeNorth - this.latitudeSouth);
    }

    public final double getLonEast() {
        return this.longitudeEast;
    }

    public final double getLonWest() {
        return this.longitudeWest;
    }

    public final double getLongitudeSpan() {
        return Math.abs(this.longitudeEast - this.longitudeWest);
    }

    public final LatLng getNorthEast() {
        return new LatLng(this.latitudeNorth, this.longitudeEast);
    }

    public final LatLng getNorthWest() {
        return new LatLng(this.latitudeNorth, this.longitudeWest);
    }

    public final LatLng getSouthEast() {
        return new LatLng(this.latitudeSouth, this.longitudeEast);
    }

    public final LatLng getSouthWest() {
        return new LatLng(this.latitudeSouth, this.longitudeWest);
    }

    public final C15485a getSpan() {
        return new C15485a(getLatitudeSpan(), getLongitudeSpan());
    }

    public int hashCode() {
        double d10 = (double) 90;
        double d11 = (double) 180;
        return (int) (this.latitudeNorth + d10 + ((this.latitudeSouth + d10) * ((double) 1000)) + ((this.longitudeEast + d11) * ((double) 1000000)) + ((this.longitudeWest + d11) * ((double) 1000000000)));
    }

    public final LatLngBounds include(LatLng latLng) {
        C17542s.j(latLng, "latLng");
        return new a().b(getNorthEast()).b(getSouthWest()).b(latLng).a();
    }

    public final LatLngBounds intersect(LatLngBounds latLngBounds) {
        C17542s.j(latLngBounds, "box");
        return intersectNoParamCheck(latLngBounds.latitudeNorth, latLngBounds.longitudeEast, latLngBounds.latitudeSouth, latLngBounds.longitudeWest);
    }

    public final boolean isEmptySpan() {
        return getLongitudeSpan() == 0.0d || getLatitudeSpan() == 0.0d;
    }

    public final LatLng[] toLatLngs() {
        return new LatLng[]{getNorthEast(), getSouthWest()};
    }

    public String toString() {
        double d10 = this.latitudeNorth;
        double d11 = this.longitudeEast;
        double d12 = this.latitudeSouth;
        double d13 = this.longitudeWest;
        return "N:" + d10 + "; E:" + d11 + "; S:" + d12 + "; W:" + d13;
    }

    public final LatLngBounds union(LatLngBounds latLngBounds) {
        C17542s.j(latLngBounds, "bounds");
        return unionNoParamCheck(latLngBounds.latitudeNorth, latLngBounds.longitudeEast, latLngBounds.latitudeSouth, latLngBounds.longitudeWest);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "out");
        parcel.writeDouble(this.latitudeNorth);
        parcel.writeDouble(this.longitudeEast);
        parcel.writeDouble(this.latitudeSouth);
        parcel.writeDouble(this.longitudeWest);
    }

    public static final LatLngBounds from(int i10, int i11, int i12) {
        return Companion.e(i10, i11, i12);
    }

    public final boolean contains(LatLngBounds latLngBounds) {
        C17542s.j(latLngBounds, "other");
        return contains(latLngBounds.getNorthEast()) && contains(latLngBounds.getSouthWest());
    }

    public final LatLngBounds intersect(double d10, double d11, double d12, double d13) {
        Companion.c(d10, d11, d12, d13);
        LatLngBounds intersectNoParamCheck = intersectNoParamCheck(d10, d11, d12, d13);
        C17542s.g(intersectNoParamCheck);
        return intersectNoParamCheck;
    }

    public final LatLngBounds union(double d10, double d11, double d12, double d13) {
        Companion.c(d10, d11, d12, d13);
        return unionNoParamCheck(d10, d11, d12, d13);
    }
}
