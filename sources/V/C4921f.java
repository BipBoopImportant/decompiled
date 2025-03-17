package V;

import V.C4927l;
import android.util.Size;
import java.util.List;

/* renamed from: V.f  reason: case insensitive filesystem */
final class C4921f extends C4927l.b {

    /* renamed from: j  reason: collision with root package name */
    private final int f14421j;

    /* renamed from: k  reason: collision with root package name */
    private final String f14422k;

    /* renamed from: l  reason: collision with root package name */
    private final List<Size> f14423l;

    C4921f(int i10, String str, List<Size> list) {
        this.f14421j = i10;
        if (str != null) {
            this.f14422k = str;
            if (list != null) {
                this.f14423l = list;
                return;
            }
            throw new NullPointerException("Null typicalSizes");
        }
        throw new NullPointerException("Null name");
    }

    public String c() {
        return this.f14422k;
    }

    public List<Size> d() {
        return this.f14423l;
    }

    public int e() {
        return this.f14421j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C4927l.b)) {
            return false;
        }
        C4927l.b bVar = (C4927l.b) obj;
        return this.f14421j == bVar.e() && this.f14422k.equals(bVar.c()) && this.f14423l.equals(bVar.d());
    }

    public int hashCode() {
        return ((((this.f14421j ^ 1000003) * 1000003) ^ this.f14422k.hashCode()) * 1000003) ^ this.f14423l.hashCode();
    }

    public String toString() {
        return "ConstantQuality{value=" + this.f14421j + ", name=" + this.f14422k + ", typicalSizes=" + this.f14423l + "}";
    }
}
