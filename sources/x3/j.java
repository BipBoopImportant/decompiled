package x3;

import java.io.File;
import java.util.ArrayList;
import java.util.TreeSet;
import t3.C5950a;
import t3.q;

final class j {

    /* renamed from: a  reason: collision with root package name */
    public final int f31916a;

    /* renamed from: b  reason: collision with root package name */
    public final String f31917b;

    /* renamed from: c  reason: collision with root package name */
    private final TreeSet<s> f31918c;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f31919d;

    /* renamed from: e  reason: collision with root package name */
    private n f31920e;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f31921a;

        /* renamed from: b  reason: collision with root package name */
        public final long f31922b;

        public a(long j10, long j11) {
            this.f31921a = j10;
            this.f31922b = j11;
        }

        public boolean a(long j10, long j11) {
            long j12 = this.f31922b;
            if (j12 == -1) {
                return j10 >= this.f31921a;
            }
            if (j11 == -1) {
                return false;
            }
            long j13 = this.f31921a;
            return j13 <= j10 && j10 + j11 <= j13 + j12;
        }

        public boolean b(long j10, long j11) {
            long j12 = this.f31921a;
            if (j12 > j10) {
                return j11 == -1 || j10 + j11 > j12;
            }
            long j13 = this.f31922b;
            return j13 == -1 || j12 + j13 > j10;
        }
    }

    public j(int i10, String str) {
        this(i10, str, n.f31943c);
    }

    public void a(s sVar) {
        this.f31918c.add(sVar);
    }

    public boolean b(m mVar) {
        n nVar = this.f31920e;
        n g10 = nVar.g(mVar);
        this.f31920e = g10;
        return !g10.equals(nVar);
    }

    public n c() {
        return this.f31920e;
    }

    public s d(long j10, long j11) {
        s C10 = s.C(this.f31917b, j10);
        s floor = this.f31918c.floor(C10);
        if (floor != null && floor.f31911b + floor.f31912c > j10) {
            return floor;
        }
        s ceiling = this.f31918c.ceiling(C10);
        if (ceiling != null) {
            long j12 = ceiling.f31911b - j10;
            j11 = j11 == -1 ? j12 : Math.min(j12, j11);
        }
        return s.B(this.f31917b, j10, j11);
    }

    public TreeSet<s> e() {
        return this.f31918c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f31916a == jVar.f31916a && this.f31917b.equals(jVar.f31917b) && this.f31918c.equals(jVar.f31918c) && this.f31920e.equals(jVar.f31920e);
    }

    public boolean f() {
        return this.f31918c.isEmpty();
    }

    public boolean g(long j10, long j11) {
        for (int i10 = 0; i10 < this.f31919d.size(); i10++) {
            if (this.f31919d.get(i10).a(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f31919d.isEmpty();
    }

    public int hashCode() {
        return (((this.f31916a * 31) + this.f31917b.hashCode()) * 31) + this.f31920e.hashCode();
    }

    public boolean i(long j10, long j11) {
        for (int i10 = 0; i10 < this.f31919d.size(); i10++) {
            if (this.f31919d.get(i10).b(j10, j11)) {
                return false;
            }
        }
        this.f31919d.add(new a(j10, j11));
        return true;
    }

    public boolean j(i iVar) {
        if (!this.f31918c.remove(iVar)) {
            return false;
        }
        File file = iVar.f31914e;
        if (file == null) {
            return true;
        }
        file.delete();
        return true;
    }

    public s k(s sVar, long j10, boolean z10) {
        C5950a.g(this.f31918c.remove(sVar));
        File file = (File) C5950a.e(sVar.f31914e);
        if (z10) {
            File D10 = s.D((File) C5950a.e(file.getParentFile()), this.f31916a, sVar.f31911b, j10);
            if (file.renameTo(D10)) {
                file = D10;
            } else {
                q.h("CachedContent", "Failed to rename " + file + " to " + D10);
            }
        }
        s m10 = sVar.m(file, j10);
        this.f31918c.add(m10);
        return m10;
    }

    public void l(long j10) {
        for (int i10 = 0; i10 < this.f31919d.size(); i10++) {
            if (this.f31919d.get(i10).f31921a == j10) {
                this.f31919d.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public j(int i10, String str, n nVar) {
        this.f31916a = i10;
        this.f31917b = str;
        this.f31920e = nVar;
        this.f31918c = new TreeSet<>();
        this.f31919d = new ArrayList<>();
    }
}
