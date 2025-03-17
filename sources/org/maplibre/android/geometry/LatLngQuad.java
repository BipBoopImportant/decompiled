package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001d\u0010\u001a¨\u0006 "}, d2 = {"Lorg/maplibre/android/geometry/LatLngQuad;", "Landroid/os/Parcelable;", "Lorg/maplibre/android/geometry/LatLng;", "topLeft", "topRight", "bottomRight", "bottomLeft", "<init>", "(Lorg/maplibre/android/geometry/LatLng;Lorg/maplibre/android/geometry/LatLng;Lorg/maplibre/android/geometry/LatLng;Lorg/maplibre/android/geometry/LatLng;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "out", "arg1", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lorg/maplibre/android/geometry/LatLng;", "getTopLeft", "()Lorg/maplibre/android/geometry/LatLng;", "getTopRight", "getBottomRight", "getBottomLeft", "a", "b", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LatLngQuad implements Parcelable {
    public static final Parcelable.Creator<LatLngQuad> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public static final b f145514a = new b((DefaultConstructorMarker) null);
    @Keep
    private final LatLng bottomLeft;
    @Keep
    private final LatLng bottomRight;
    @Keep
    private final LatLng topLeft;
    @Keep
    private final LatLng topRight;

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"org/maplibre/android/geometry/LatLngQuad$a", "Landroid/os/Parcelable$Creator;", "Lorg/maplibre/android/geometry/LatLngQuad;", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lorg/maplibre/android/geometry/LatLngQuad;", "", "size", "", "b", "(I)[Lorg/maplibre/android/geometry/LatLngQuad;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<LatLngQuad> {
        a() {
        }

        /* renamed from: a */
        public LatLngQuad createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            return LatLngQuad.f145514a.b(parcel);
        }

        /* renamed from: b */
        public LatLngQuad[] newArray(int i10) {
            return new LatLngQuad[i10];
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lorg/maplibre/android/geometry/LatLngQuad$b;", "", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "Lorg/maplibre/android/geometry/LatLngQuad;", "b", "(Landroid/os/Parcel;)Lorg/maplibre/android/geometry/LatLngQuad;", "Landroid/os/Parcelable$Creator;", "CREATOR", "Landroid/os/Parcelable$Creator;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final LatLngQuad b(Parcel parcel) {
            return new LatLngQuad(new LatLng(parcel), new LatLng(parcel), new LatLng(parcel), new LatLng(parcel));
        }

        private b() {
        }
    }

    @Keep
    public LatLngQuad(LatLng latLng, LatLng latLng2, LatLng latLng3, LatLng latLng4) {
        C17542s.j(latLng, "topLeft");
        C17542s.j(latLng2, "topRight");
        C17542s.j(latLng3, "bottomRight");
        C17542s.j(latLng4, "bottomLeft");
        this.topLeft = latLng;
        this.topRight = latLng2;
        this.bottomRight = latLng3;
        this.bottomLeft = latLng4;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(LatLngQuad.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type org.maplibre.android.geometry.LatLngQuad");
        LatLngQuad latLngQuad = (LatLngQuad) obj;
        return C17542s.e(this.topLeft, latLngQuad.topLeft) && C17542s.e(this.topRight, latLngQuad.topRight) && C17542s.e(this.bottomRight, latLngQuad.bottomRight) && C17542s.e(this.bottomLeft, latLngQuad.bottomLeft);
    }

    public int hashCode() {
        return (((((this.topLeft.hashCode() * 31) + this.topRight.hashCode()) * 31) + this.bottomRight.hashCode()) * 31) + this.bottomLeft.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "out");
        this.topLeft.writeToParcel(parcel, i10);
        this.topRight.writeToParcel(parcel, i10);
        this.bottomRight.writeToParcel(parcel, i10);
        this.bottomLeft.writeToParcel(parcel, i10);
    }
}
