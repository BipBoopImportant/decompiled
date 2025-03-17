package org.maplibre.android.offline;

import ML.C16090a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Geometry;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u00013B5\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB=\b\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000b\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR(\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0016@RX\u000e¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R$\u0010\b\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00068\u0016@RX\u000e¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b%\u0010$R$\u0010\n\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t8\u0016@RX\u000e¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\r8\u0016@RX\u000e¢\u0006\f\n\u0004\b\u000e\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010,8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u001e¨\u00064"}, d2 = {"Lorg/maplibre/android/offline/OfflineGeometryRegionDefinition;", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "", "styleURL", "Lorg/maplibre/geojson/Geometry;", "geometry", "", "minZoom", "maxZoom", "", "pixelRatio", "<init>", "(Ljava/lang/String;Lorg/maplibre/geojson/Geometry;DDF)V", "", "includeIdeographs", "(Ljava/lang/String;Lorg/maplibre/geojson/Geometry;DDFZ)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "value", "Ljava/lang/String;", "getStyleURL", "()Ljava/lang/String;", "Lorg/maplibre/geojson/Geometry;", "getGeometry", "()Lorg/maplibre/geojson/Geometry;", "D", "getMinZoom", "()D", "getMaxZoom", "F", "getPixelRatio", "()F", "Z", "getIncludeIdeographs", "()Z", "Lorg/maplibre/android/geometry/LatLngBounds;", "getBounds", "()Lorg/maplibre/android/geometry/LatLngBounds;", "bounds", "getType", "type", "a", "b", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class OfflineGeometryRegionDefinition implements OfflineRegionDefinition {
    public static final Parcelable.Creator<?> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public static final b f146051a = new b((DefaultConstructorMarker) null);
    @Keep
    private Geometry geometry;
    @Keep
    private boolean includeIdeographs;
    @Keep
    private double maxZoom;
    @Keep
    private double minZoom;
    @Keep
    private float pixelRatio;
    @Keep
    private String styleURL;

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"org/maplibre/android/offline/OfflineGeometryRegionDefinition$a", "Landroid/os/Parcelable$Creator;", "", "Landroid/os/Parcel;", "in", "Lorg/maplibre/android/offline/OfflineGeometryRegionDefinition;", "a", "(Landroid/os/Parcel;)Lorg/maplibre/android/offline/OfflineGeometryRegionDefinition;", "", "size", "", "b", "(I)[Lorg/maplibre/android/offline/OfflineGeometryRegionDefinition;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Object> {
        a() {
        }

        /* renamed from: a */
        public OfflineGeometryRegionDefinition createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "in");
            return new OfflineGeometryRegionDefinition(parcel);
        }

        /* renamed from: b */
        public OfflineGeometryRegionDefinition[] newArray(int i10) {
            return new OfflineGeometryRegionDefinition[i10];
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/offline/OfflineGeometryRegionDefinition$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Keep
    public OfflineGeometryRegionDefinition(String str, Geometry geometry2, double d10, double d11, float f10) {
        this(str, geometry2, d10, d11, f10, false);
    }

    public int describeContents() {
        return 0;
    }

    public LatLngBounds getBounds() {
        Geometry geometry2 = this.geometry;
        if (geometry2 == null) {
            return null;
        }
        double[] a10 = C16090a.a(geometry2);
        return LatLngBounds.Companion.d(a10[3], a10[2], a10[1], a10[0]);
    }

    public boolean getIncludeIdeographs() {
        return this.includeIdeographs;
    }

    public double getMaxZoom() {
        return this.maxZoom;
    }

    public double getMinZoom() {
        return this.minZoom;
    }

    public float getPixelRatio() {
        return this.pixelRatio;
    }

    public String getStyleURL() {
        return this.styleURL;
    }

    public String getType() {
        return "shaperegion";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "dest");
        parcel.writeString(getStyleURL());
        parcel.writeString(Feature.fromGeometry(this.geometry).toJson());
        parcel.writeDouble(getMinZoom());
        parcel.writeDouble(getMaxZoom());
        parcel.writeFloat(getPixelRatio());
        parcel.writeByte(getIncludeIdeographs() ? (byte) 1 : 0);
    }

    @Keep
    public OfflineGeometryRegionDefinition(String str, Geometry geometry2, double d10, double d11, float f10, boolean z10) {
        this.styleURL = str;
        this.geometry = geometry2;
        this.minZoom = d10;
        this.maxZoom = d11;
        this.pixelRatio = f10;
        this.includeIdeographs = z10;
    }

    public OfflineGeometryRegionDefinition(Parcel parcel) {
        C17542s.j(parcel, "parcel");
        this.styleURL = parcel.readString();
        String readString = parcel.readString();
        C17542s.g(readString);
        this.geometry = Feature.fromJson(readString).geometry();
        this.minZoom = parcel.readDouble();
        this.maxZoom = parcel.readDouble();
        this.pixelRatio = parcel.readFloat();
        this.includeIdeographs = parcel.readByte() != 0;
    }
}
