package q3;

import android.view.Surface;
import t3.C5950a;

public final class I {

    /* renamed from: a  reason: collision with root package name */
    public final Surface f27888a;

    /* renamed from: b  reason: collision with root package name */
    public final int f27889b;

    /* renamed from: c  reason: collision with root package name */
    public final int f27890c;

    /* renamed from: d  reason: collision with root package name */
    public final int f27891d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f27892e;

    public I(Surface surface, int i10, int i11) {
        this(surface, i10, i11, 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I)) {
            return false;
        }
        I i10 = (I) obj;
        return this.f27889b == i10.f27889b && this.f27890c == i10.f27890c && this.f27891d == i10.f27891d && this.f27892e == i10.f27892e && this.f27888a.equals(i10.f27888a);
    }

    public int hashCode() {
        return (((((((this.f27888a.hashCode() * 31) + this.f27889b) * 31) + this.f27890c) * 31) + this.f27891d) * 31) + (this.f27892e ? 1 : 0);
    }

    public I(Surface surface, int i10, int i11, int i12) {
        this(surface, i10, i11, i12, false);
    }

    public I(Surface surface, int i10, int i11, int i12, boolean z10) {
        C5950a.b(i12 == 0 || i12 == 90 || i12 == 180 || i12 == 270, "orientationDegrees must be 0, 90, 180, or 270");
        this.f27888a = surface;
        this.f27889b = i10;
        this.f27890c = i11;
        this.f27891d = i12;
        this.f27892e = z10;
    }
}
