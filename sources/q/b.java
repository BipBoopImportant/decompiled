package Q;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

final class b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final UUID f11898a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11899b;

    /* renamed from: c  reason: collision with root package name */
    private final int f11900c;

    /* renamed from: d  reason: collision with root package name */
    private final Rect f11901d;

    /* renamed from: e  reason: collision with root package name */
    private final Size f11902e;

    /* renamed from: f  reason: collision with root package name */
    private final int f11903f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f11904g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f11905h;

    b(UUID uuid, int i10, int i11, Rect rect, Size size, int i12, boolean z10, boolean z11) {
        if (uuid != null) {
            this.f11898a = uuid;
            this.f11899b = i10;
            this.f11900c = i11;
            if (rect != null) {
                this.f11901d = rect;
                if (size != null) {
                    this.f11902e = size;
                    this.f11903f = i12;
                    this.f11904g = z10;
                    this.f11905h = z11;
                    return;
                }
                throw new NullPointerException("Null getSize");
            }
            throw new NullPointerException("Null getCropRect");
        }
        throw new NullPointerException("Null getUuid");
    }

    public Rect a() {
        return this.f11901d;
    }

    public int b() {
        return this.f11900c;
    }

    public int c() {
        return this.f11903f;
    }

    public Size d() {
        return this.f11902e;
    }

    public int e() {
        return this.f11899b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f11898a.equals(fVar.f()) && this.f11899b == fVar.e() && this.f11900c == fVar.b() && this.f11901d.equals(fVar.a()) && this.f11902e.equals(fVar.d()) && this.f11903f == fVar.c() && this.f11904g == fVar.g() && this.f11905h == fVar.k();
    }

    /* access modifiers changed from: package-private */
    public UUID f() {
        return this.f11898a;
    }

    public boolean g() {
        return this.f11904g;
    }

    public int hashCode() {
        int i10 = 1237;
        int hashCode = (((((((((((((this.f11898a.hashCode() ^ 1000003) * 1000003) ^ this.f11899b) * 1000003) ^ this.f11900c) * 1000003) ^ this.f11901d.hashCode()) * 1000003) ^ this.f11902e.hashCode()) * 1000003) ^ this.f11903f) * 1000003) ^ (this.f11904g ? 1231 : 1237)) * 1000003;
        if (this.f11905h) {
            i10 = 1231;
        }
        return hashCode ^ i10;
    }

    public boolean k() {
        return this.f11905h;
    }

    public String toString() {
        return "OutConfig{getUuid=" + this.f11898a + ", getTargets=" + this.f11899b + ", getFormat=" + this.f11900c + ", getCropRect=" + this.f11901d + ", getSize=" + this.f11902e + ", getRotationDegrees=" + this.f11903f + ", isMirroring=" + this.f11904g + ", shouldRespectInputCropRect=" + this.f11905h + "}";
    }
}
