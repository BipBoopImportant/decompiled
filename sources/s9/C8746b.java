package s9;

import j9.f;
import java.util.Map;
import s9.f;
import v9.C8903a;

/* renamed from: s9.b  reason: case insensitive filesystem */
final class C8746b extends f {

    /* renamed from: a  reason: collision with root package name */
    private final C8903a f56001a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<f, f.b> f56002b;

    C8746b(C8903a aVar, Map<j9.f, f.b> map) {
        if (aVar != null) {
            this.f56001a = aVar;
            if (map != null) {
                this.f56002b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    /* access modifiers changed from: package-private */
    public C8903a e() {
        return this.f56001a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f56001a.equals(fVar.e()) && this.f56002b.equals(fVar.h());
    }

    /* access modifiers changed from: package-private */
    public Map<j9.f, f.b> h() {
        return this.f56002b;
    }

    public int hashCode() {
        return ((this.f56001a.hashCode() ^ 1000003) * 1000003) ^ this.f56002b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f56001a + ", values=" + this.f56002b + "}";
    }
}
