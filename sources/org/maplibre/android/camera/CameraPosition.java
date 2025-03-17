package org.maplibre.android.camera;

import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.maplibre.android.camera.a;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.m;
import org.maplibre.android.utils.f;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 !2\u00020\u0001:\u0002!\"B5\b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001d\u0010\u000eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0006\n\u0004\b\t\u0010 ¨\u0006#"}, d2 = {"Lorg/maplibre/android/camera/CameraPosition;", "Landroid/os/Parcelable;", "Lorg/maplibre/android/geometry/LatLng;", "target", "", "zoom", "tilt", "bearing", "", "padding", "<init>", "(Lorg/maplibre/android/geometry/LatLng;DDD[D)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "out", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lorg/maplibre/android/geometry/LatLng;", "D", "[D", "a", "c", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    public static final c f145493a = new c((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    public static final CameraPosition f145494b = new CameraPosition(new LatLng(), 0.0d, 0.0d, 0.0d, new double[]{0.0d, 0.0d, 0.0d, 0.0d});
    @Keep
    public final double bearing;
    @Keep
    public final double[] padding;
    @Keep
    public final LatLng target;
    @Keep
    public final double tilt;
    @Keep
    public final double zoom;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"org/maplibre/android/camera/CameraPosition$b", "Landroid/os/Parcelable$Creator;", "Lorg/maplibre/android/camera/CameraPosition;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lorg/maplibre/android/camera/CameraPosition;", "", "size", "", "b", "(I)[Lorg/maplibre/android/camera/CameraPosition;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CameraPosition> {
        b() {
        }

        /* renamed from: a */
        public CameraPosition createFromParcel(Parcel parcel) {
            double[] dArr;
            C17542s.j(parcel, "parcel");
            double readDouble = parcel.readDouble();
            Class<LatLng> cls = LatLng.class;
            LatLng latLng = Build.VERSION.SDK_INT >= 33 ? (LatLng) parcel.readParcelable(cls.getClassLoader(), cls) : (LatLng) parcel.readParcelable(cls.getClassLoader());
            double readDouble2 = parcel.readDouble();
            double readDouble3 = parcel.readDouble();
            int readInt = parcel.readInt();
            if (readInt > 0) {
                double[] dArr2 = new double[readInt];
                for (int i10 = 0; i10 < readInt; i10++) {
                    dArr2[i10] = parcel.readDouble();
                }
                dArr = dArr2;
            } else {
                dArr = null;
            }
            return new CameraPosition(latLng, readDouble3, readDouble2, readDouble, dArr);
        }

        /* renamed from: b */
        public CameraPosition[] newArray(int i10) {
            return new CameraPosition[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lorg/maplibre/android/camera/CameraPosition$c;", "", "<init>", "()V", "Lorg/maplibre/android/camera/CameraPosition;", "DEFAULT", "Lorg/maplibre/android/camera/CameraPosition;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Keep
    public CameraPosition(LatLng latLng, double d10, double d11, double d12, double[] dArr) {
        this.target = latLng;
        this.zoom = d10;
        this.tilt = d11;
        this.bearing = d12;
        this.padding = dArr;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (C17542s.e(CameraPosition.class, obj.getClass())) {
                CameraPosition cameraPosition = (CameraPosition) obj;
                LatLng latLng = this.target;
                return (latLng == null || C17542s.e(latLng, cameraPosition.target)) && this.zoom == cameraPosition.zoom && this.tilt == cameraPosition.tilt && this.bearing == cameraPosition.bearing && Arrays.equals(this.padding, cameraPosition.padding);
            }
        }
        return false;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.bearing);
        int i10 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
        LatLng latLng = this.target;
        int hashCode = latLng != null ? latLng.hashCode() : 0;
        long doubleToLongBits2 = Double.doubleToLongBits(this.tilt);
        long doubleToLongBits3 = Double.doubleToLongBits(this.zoom);
        return ((((((i10 + hashCode) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + Arrays.hashCode(this.padding);
    }

    public String toString() {
        LatLng latLng = this.target;
        double d10 = this.zoom;
        double d11 = this.bearing;
        double d12 = this.tilt;
        String arrays = Arrays.toString(this.padding);
        return "Target: " + latLng + ", Zoom:" + d10 + ", Bearing:" + d11 + ", Tilt:" + d12 + ", Padding:" + arrays;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "out");
        parcel.writeDouble(this.bearing);
        parcel.writeParcelable(this.target, i10);
        parcel.writeDouble(this.tilt);
        parcel.writeDouble(this.zoom);
        double[] dArr = this.padding;
        if (dArr != null) {
            parcel.writeInt(dArr.length);
            for (double writeDouble : this.padding) {
                parcel.writeDouble(writeDouble);
            }
            return;
        }
        parcel.writeInt(-1);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0013\n\u0002\b\n\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0013\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0002\u0010\u0006B\u0013\b\u0016\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0002\u0010\tB\u0013\b\u0016\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\b\u0001\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0017\u0010\u0018\u001a\u00020\u00002\b\b\u0001\u0010\u0017\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0010J\u0019\u0010\u001b\u001a\u00020\u00002\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010!\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010 R\u0016\u0010\u0015\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001fR\u0016\u0010\u0017\u001a\u00020\r8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"¨\u0006#"}, d2 = {"Lorg/maplibre/android/camera/CameraPosition$a;", "", "<init>", "()V", "Lorg/maplibre/android/camera/CameraPosition;", "previous", "(Lorg/maplibre/android/camera/CameraPosition;)V", "Landroid/content/res/TypedArray;", "typedArray", "(Landroid/content/res/TypedArray;)V", "Lorg/maplibre/android/camera/a$b;", "update", "(Lorg/maplibre/android/camera/a$b;)V", "", "bearing", "a", "(D)Lorg/maplibre/android/camera/CameraPosition$a;", "Lorg/maplibre/android/geometry/LatLng;", "location", "d", "(Lorg/maplibre/android/geometry/LatLng;)Lorg/maplibre/android/camera/CameraPosition$a;", "tilt", "e", "zoom", "f", "", "padding", "c", "([D)Lorg/maplibre/android/camera/CameraPosition$a;", "b", "()Lorg/maplibre/android/camera/CameraPosition;", "D", "Lorg/maplibre/android/geometry/LatLng;", "target", "[D", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private double f145495a = -1.0d;

        /* renamed from: b  reason: collision with root package name */
        private LatLng f145496b;

        /* renamed from: c  reason: collision with root package name */
        private double f145497c = -1.0d;

        /* renamed from: d  reason: collision with root package name */
        private double f145498d = -1.0d;

        /* renamed from: e  reason: collision with root package name */
        private double[] f145499e;

        public a() {
        }

        public final a a(double d10) {
            while (d10 >= 360.0d) {
                d10 -= 360.0d;
            }
            while (d10 < 0.0d) {
                d10 += 360.0d;
            }
            this.f145495a = d10;
            return this;
        }

        public final CameraPosition b() {
            return new CameraPosition(this.f145496b, this.f145498d, this.f145497c, this.f145495a, this.f145499e);
        }

        public final a c(double[] dArr) {
            this.f145499e = dArr;
            return this;
        }

        public final a d(LatLng latLng) {
            this.f145496b = latLng;
            return this;
        }

        public final a e(double d10) {
            this.f145497c = f.a(d10, 0.0d, 60.0d);
            return this;
        }

        public final a f(double d10) {
            this.f145498d = d10;
            return this;
        }

        public a(CameraPosition cameraPosition) {
            if (cameraPosition != null) {
                this.f145495a = cameraPosition.bearing;
                this.f145496b = cameraPosition.target;
                this.f145497c = cameraPosition.tilt;
                this.f145498d = cameraPosition.zoom;
                this.f145499e = cameraPosition.padding;
            }
        }

        public a(TypedArray typedArray) {
            if (typedArray != null) {
                this.f145495a = (double) typedArray.getFloat(m.f145692v, 0.0f);
                this.f145496b = new LatLng((double) typedArray.getFloat(m.f145695y, 0.0f), (double) typedArray.getFloat(m.f145696z, 0.0f));
                this.f145497c = (double) typedArray.getFloat(m.f145628A, 0.0f);
                this.f145498d = (double) typedArray.getFloat(m.f145629B, 0.0f);
            }
        }

        public a(a.b bVar) {
            if (bVar != null) {
                this.f145495a = bVar.b();
                this.f145496b = bVar.d();
                this.f145497c = bVar.e();
                this.f145498d = bVar.f();
                this.f145499e = bVar.c();
            }
        }
    }
}
