package wL;

import org.maplibre.android.maps.MapView;
import org.maplibre.android.maps.o;

@Deprecated
/* renamed from: wL.a  reason: case insensitive filesystem */
public abstract class C18566a implements Comparable<C18566a> {

    /* renamed from: a  reason: collision with root package name */
    private long f152026a = -1;

    /* renamed from: b  reason: collision with root package name */
    protected o f152027b;

    /* renamed from: c  reason: collision with root package name */
    protected MapView f152028c;

    protected C18566a() {
    }

    /* renamed from: a */
    public int compareTo(C18566a aVar) {
        if (this.f152026a < aVar.b()) {
            return 1;
        }
        return this.f152026a > aVar.b() ? -1 : 0;
    }

    public long b() {
        return this.f152026a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C18566a)) {
            return false;
        }
        return this.f152026a == ((C18566a) obj).b();
    }

    public int hashCode() {
        return (int) (b() ^ (b() >>> 32));
    }

    /* access modifiers changed from: protected */
    public o j() {
        return this.f152027b;
    }

    public void m(long j10) {
        this.f152026a = j10;
    }

    public void n(o oVar) {
        this.f152027b = oVar;
    }

    public void v(MapView mapView) {
        this.f152028c = mapView;
    }
}
