package org.maplibre.android.camera;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import org.maplibre.android.camera.CameraPosition;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.maps.o;
import yL.C18746b;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\r\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lorg/maplibre/android/camera/a;", "", "<init>", "()V", "Lorg/maplibre/android/camera/CameraPosition;", "cameraPosition", "LyL/b;", "a", "(Lorg/maplibre/android/camera/CameraPosition;)LyL/b;", "Lorg/maplibre/android/geometry/LatLngBounds;", "bounds", "", "padding", "b", "(Lorg/maplibre/android/geometry/LatLngBounds;I)LyL/b;", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "c", "(Lorg/maplibre/android/geometry/LatLngBounds;IIII)LyL/b;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f145500a = new a();

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nBE\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\t\u0010\u0010J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lorg/maplibre/android/camera/a$a;", "LyL/b;", "Lorg/maplibre/android/geometry/LatLngBounds;", "bounds", "", "bearing", "tilt", "", "padding", "<init>", "(Lorg/maplibre/android/geometry/LatLngBounds;Ljava/lang/Double;Ljava/lang/Double;[I)V", "", "paddingLeft", "paddingTop", "paddingRight", "paddingBottom", "(Lorg/maplibre/android/geometry/LatLngBounds;Ljava/lang/Double;Ljava/lang/Double;IIII)V", "Lorg/maplibre/android/maps/o;", "maplibreMap", "Lorg/maplibre/android/camera/CameraPosition;", "a", "(Lorg/maplibre/android/maps/o;)Lorg/maplibre/android/camera/CameraPosition;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lorg/maplibre/android/geometry/LatLngBounds;", "getBounds", "()Lorg/maplibre/android/geometry/LatLngBounds;", "b", "Ljava/lang/Double;", "c", "d", "[I", "getPadding", "()[I", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: org.maplibre.android.camera.a$a  reason: collision with other inner class name */
    public static final class C4246a implements C18746b {

        /* renamed from: a  reason: collision with root package name */
        private final LatLngBounds f145501a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f145502b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f145503c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f145504d;

        public C4246a(LatLngBounds latLngBounds, Double d10, Double d11, int[] iArr) {
            C17542s.j(latLngBounds, "bounds");
            C17542s.j(iArr, "padding");
            this.f145501a = latLngBounds;
            this.f145502b = d10;
            this.f145503c = d11;
            this.f145504d = iArr;
        }

        public CameraPosition a(o oVar) {
            C17542s.j(oVar, "maplibreMap");
            Double d10 = this.f145502b;
            if (d10 == null && this.f145503c == null) {
                return oVar.k(this.f145501a, this.f145504d);
            }
            LatLngBounds latLngBounds = this.f145501a;
            int[] iArr = this.f145504d;
            C17542s.g(d10);
            double doubleValue = d10.doubleValue();
            Double d11 = this.f145503c;
            C17542s.g(d11);
            return oVar.l(latLngBounds, iArr, doubleValue, d11.doubleValue());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C17542s.e(C4246a.class, obj.getClass())) {
                return false;
            }
            C4246a aVar = (C4246a) obj;
            if (!C17542s.e(this.f145501a, aVar.f145501a)) {
                return false;
            }
            return Arrays.equals(this.f145504d, aVar.f145504d);
        }

        public int hashCode() {
            return (this.f145501a.hashCode() * 31) + Arrays.hashCode(this.f145504d);
        }

        public String toString() {
            LatLngBounds latLngBounds = this.f145501a;
            String arrays = Arrays.toString(this.f145504d);
            C17542s.i(arrays, "toString(...)");
            return "CameraBoundsUpdate{bounds=" + latLngBounds + ", padding=" + arrays + "}";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public C4246a(LatLngBounds latLngBounds, Double d10, Double d11, int i10, int i11, int i12, int i13) {
            this(latLngBounds, d10, d11, new int[]{i10, i11, i12, i13});
            C17542s.j(latLngBounds, "bounds");
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0013\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b$\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\"\u0010&¨\u0006'"}, d2 = {"Lorg/maplibre/android/camera/a$b;", "LyL/b;", "", "bearing", "Lorg/maplibre/android/geometry/LatLng;", "target", "tilt", "zoom", "", "padding", "<init>", "(DLorg/maplibre/android/geometry/LatLng;DD[D)V", "Lorg/maplibre/android/maps/o;", "maplibreMap", "Lorg/maplibre/android/camera/CameraPosition;", "a", "(Lorg/maplibre/android/maps/o;)Lorg/maplibre/android/camera/CameraPosition;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "D", "b", "()D", "Lorg/maplibre/android/geometry/LatLng;", "d", "()Lorg/maplibre/android/geometry/LatLng;", "c", "e", "f", "[D", "()[D", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements C18746b {

        /* renamed from: a  reason: collision with root package name */
        private final double f145505a;

        /* renamed from: b  reason: collision with root package name */
        private final LatLng f145506b;

        /* renamed from: c  reason: collision with root package name */
        private final double f145507c;

        /* renamed from: d  reason: collision with root package name */
        private final double f145508d;

        /* renamed from: e  reason: collision with root package name */
        private final double[] f145509e;

        public b(double d10, LatLng latLng, double d11, double d12, double[] dArr) {
            this.f145505a = d10;
            this.f145506b = latLng;
            this.f145507c = d11;
            this.f145508d = d12;
            this.f145509e = dArr;
        }

        public CameraPosition a(o oVar) {
            C17542s.j(oVar, "maplibreMap");
            if (this.f145506b != null) {
                return new CameraPosition.a(this).b();
            }
            CameraPosition m10 = oVar.m();
            C17542s.i(m10, "getCameraPosition(...)");
            return new CameraPosition.a(this).d(m10.target).b();
        }

        public final double b() {
            return this.f145505a;
        }

        public final double[] c() {
            return this.f145509e;
        }

        public final LatLng d() {
            return this.f145506b;
        }

        public final double e() {
            return this.f145507c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (!C17542s.e(b.class, obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            if (Double.compare(bVar.f145505a, this.f145505a) != 0 || Double.compare(bVar.f145507c, this.f145507c) != 0 || Double.compare(bVar.f145508d, this.f145508d) != 0) {
                return false;
            }
            LatLng latLng = this.f145506b;
            if (latLng != null) {
                if (!C17542s.e(latLng, bVar.f145506b)) {
                    return false;
                }
            } else if (bVar.f145506b != null) {
                return false;
            }
            return Arrays.equals(this.f145509e, bVar.f145509e);
        }

        public final double f() {
            return this.f145508d;
        }

        public int hashCode() {
            long doubleToLongBits = Double.doubleToLongBits(this.f145505a);
            int i10 = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31;
            LatLng latLng = this.f145506b;
            int hashCode = latLng != null ? latLng.hashCode() : 0;
            long doubleToLongBits2 = Double.doubleToLongBits(this.f145507c);
            long doubleToLongBits3 = Double.doubleToLongBits(this.f145508d);
            return ((((((i10 + hashCode) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3))) * 31) + Arrays.hashCode(this.f145509e);
        }

        public String toString() {
            double d10 = this.f145505a;
            LatLng latLng = this.f145506b;
            double d11 = this.f145507c;
            double d12 = this.f145508d;
            String arrays = Arrays.toString(this.f145509e);
            return "CameraPositionUpdate{bearing=" + d10 + ", target=" + latLng + ", tilt=" + d11 + ", zoom=" + d12 + ", padding=" + arrays + "}";
        }
    }

    private a() {
    }

    public static final C18746b a(CameraPosition cameraPosition) {
        C17542s.j(cameraPosition, "cameraPosition");
        return new b(cameraPosition.bearing, cameraPosition.target, cameraPosition.tilt, cameraPosition.zoom, cameraPosition.padding);
    }

    public static final C18746b b(LatLngBounds latLngBounds, int i10) {
        C17542s.j(latLngBounds, "bounds");
        return c(latLngBounds, i10, i10, i10, i10);
    }

    public static final C18746b c(LatLngBounds latLngBounds, int i10, int i11, int i12, int i13) {
        C17542s.j(latLngBounds, "bounds");
        return new C4246a(latLngBounds, (Double) null, (Double) null, i10, i11, i12, i13);
    }
}
