package YB;

import com.google.android.gms.maps.model.LatLngBounds;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"LYB/y;", "", "Lcom/google/android/gms/maps/model/LatLngBounds;", "latLngBoundsForCameraTarget", "", "isUserLocationAllowed", "", "minZoomPreference", "<init>", "(Lcom/google/android/gms/maps/model/LatLngBounds;ZF)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/google/android/gms/maps/model/LatLngBounds;", "()Lcom/google/android/gms/maps/model/LatLngBounds;", "b", "Z", "c", "()Z", "F", "()F", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class y {

    /* renamed from: a  reason: collision with root package name */
    private final LatLngBounds f118072a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f118073b;

    /* renamed from: c  reason: collision with root package name */
    private final float f118074c;

    public y(LatLngBounds latLngBounds, boolean z10, float f10) {
        this.f118072a = latLngBounds;
        this.f118073b = z10;
        this.f118074c = f10;
    }

    public final LatLngBounds a() {
        return this.f118072a;
    }

    public final float b() {
        return this.f118074c;
    }

    public final boolean c() {
        return this.f118073b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return C17542s.e(this.f118072a, yVar.f118072a) && this.f118073b == yVar.f118073b && Float.compare(this.f118074c, yVar.f118074c) == 0;
    }

    public int hashCode() {
        LatLngBounds latLngBounds = this.f118072a;
        return ((((latLngBounds == null ? 0 : latLngBounds.hashCode()) * 31) + Boolean.hashCode(this.f118073b)) * 31) + Float.hashCode(this.f118074c);
    }

    public String toString() {
        LatLngBounds latLngBounds = this.f118072a;
        boolean z10 = this.f118073b;
        float f10 = this.f118074c;
        return "MapConfig(latLngBoundsForCameraTarget=" + latLngBounds + ", isUserLocationAllowed=" + z10 + ", minZoomPreference=" + f10 + ")";
    }
}
