package x;

import H2.i;
import android.util.Size;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import x.k;

class p implements k.a {

    /* renamed from: a  reason: collision with root package name */
    final Object f31536a;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        final List<Surface> f31537a;

        /* renamed from: b  reason: collision with root package name */
        final Size f31538b;

        /* renamed from: c  reason: collision with root package name */
        final int f31539c;

        /* renamed from: d  reason: collision with root package name */
        final int f31540d;

        /* renamed from: e  reason: collision with root package name */
        String f31541e;

        /* renamed from: f  reason: collision with root package name */
        boolean f31542f;

        /* renamed from: g  reason: collision with root package name */
        long f31543g;

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f31538b.equals(aVar.f31538b) || this.f31539c != aVar.f31539c || this.f31540d != aVar.f31540d || this.f31542f != aVar.f31542f || this.f31543g != aVar.f31543g || !Objects.equals(this.f31541e, aVar.f31541e)) {
                return false;
            }
            int min = Math.min(this.f31537a.size(), aVar.f31537a.size());
            for (int i10 = 0; i10 < min; i10++) {
                if (this.f31537a.get(i10) != aVar.f31537a.get(i10)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            int hashCode = this.f31537a.hashCode() ^ 31;
            int i10 = this.f31540d ^ ((hashCode << 5) - hashCode);
            int hashCode2 = this.f31538b.hashCode() ^ ((i10 << 5) - i10);
            int i11 = this.f31539c ^ ((hashCode2 << 5) - hashCode2);
            boolean z10 = this.f31542f ^ ((i11 << 5) - i11);
            int i12 = ((z10 ? 1 : 0) << true) - z10;
            String str = this.f31541e;
            int hashCode3 = (str == null ? 0 : str.hashCode()) ^ i12;
            return Long.hashCode(this.f31543g) ^ ((hashCode3 << 5) - hashCode3);
        }
    }

    p(Object obj) {
        this.f31536a = obj;
    }

    public void a(long j10) {
    }

    public void b(Surface surface) {
        i.h(surface, "Surface must not be null");
        if (getSurface() == surface) {
            throw new IllegalStateException("Surface is already added!");
        } else if (!i()) {
            throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
        } else {
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
    }

    public void c(long j10) {
        ((a) this.f31536a).f31543g = j10;
    }

    public void d(String str) {
        ((a) this.f31536a).f31541e = str;
    }

    public String e() {
        return ((a) this.f31536a).f31541e;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        return Objects.equals(this.f31536a, ((p) obj).f31536a);
    }

    public void f() {
        ((a) this.f31536a).f31542f = true;
    }

    public void g(int i10) {
    }

    public Surface getSurface() {
        List<Surface> list = ((a) this.f31536a).f31537a;
        if (list.size() == 0) {
            return null;
        }
        return list.get(0);
    }

    public Object h() {
        return null;
    }

    public int hashCode() {
        return this.f31536a.hashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean i() {
        return ((a) this.f31536a).f31542f;
    }
}
