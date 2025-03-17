package H3;

import java.util.ArrayList;
import java.util.List;
import k4.C8421e;
import kb.C9935O;
import kb.C9967v;
import s3.a;
import t3.C5950a;

final class e implements C6523a {

    /* renamed from: b  reason: collision with root package name */
    private static final C9935O<C8421e> f36375b = C9935O.d().f(new C6525c()).a(C9935O.d().g().f(new C6526d()));

    /* renamed from: a  reason: collision with root package name */
    private final List<C8421e> f36376a = new ArrayList();

    public boolean a(C8421e eVar, long j10) {
        C5950a.a(eVar.f54101b != -9223372036854775807L);
        C5950a.a(eVar.f54102c != -9223372036854775807L);
        boolean z10 = eVar.f54101b <= j10 && j10 < eVar.f54103d;
        for (int size = this.f36376a.size() - 1; size >= 0; size--) {
            if (eVar.f54101b >= this.f36376a.get(size).f54101b) {
                this.f36376a.add(size + 1, eVar);
                return z10;
            }
        }
        this.f36376a.add(0, eVar);
        return z10;
    }

    public C9967v<a> b(long j10) {
        if (!this.f36376a.isEmpty()) {
            if (j10 >= this.f36376a.get(0).f54101b) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < this.f36376a.size(); i10++) {
                    C8421e eVar = this.f36376a.get(i10);
                    if (j10 >= eVar.f54101b && j10 < eVar.f54103d) {
                        arrayList.add(eVar);
                    }
                    if (j10 < eVar.f54101b) {
                        break;
                    }
                }
                C9967v<E> M10 = C9967v.M(f36375b, arrayList);
                C9967v.a t10 = C9967v.t();
                for (int i11 = 0; i11 < M10.size(); i11++) {
                    t10.j(((C8421e) M10.get(i11)).f54100a);
                }
                return t10.k();
            }
        }
        return C9967v.E();
    }

    public long c(long j10) {
        if (this.f36376a.isEmpty()) {
            return -9223372036854775807L;
        }
        if (j10 < this.f36376a.get(0).f54101b) {
            return -9223372036854775807L;
        }
        long j11 = this.f36376a.get(0).f54101b;
        for (int i10 = 0; i10 < this.f36376a.size(); i10++) {
            long j12 = this.f36376a.get(i10).f54101b;
            long j13 = this.f36376a.get(i10).f54103d;
            if (j13 > j10) {
                if (j12 > j10) {
                    break;
                }
                j11 = Math.max(j11, j12);
            } else {
                j11 = Math.max(j11, j13);
            }
        }
        return j11;
    }

    public void clear() {
        this.f36376a.clear();
    }

    public long d(long j10) {
        int i10 = 0;
        long j11 = -9223372036854775807L;
        while (true) {
            if (i10 >= this.f36376a.size()) {
                break;
            }
            long j12 = this.f36376a.get(i10).f54101b;
            long j13 = this.f36376a.get(i10).f54103d;
            if (j10 < j12) {
                j11 = j11 == -9223372036854775807L ? j12 : Math.min(j11, j12);
            } else {
                if (j10 < j13) {
                    j11 = j11 == -9223372036854775807L ? j13 : Math.min(j11, j13);
                }
                i10++;
            }
        }
        if (j11 != -9223372036854775807L) {
            return j11;
        }
        return Long.MIN_VALUE;
    }

    public void e(long j10) {
        int i10 = 0;
        while (i10 < this.f36376a.size()) {
            int i11 = (j10 > this.f36376a.get(i10).f54101b ? 1 : (j10 == this.f36376a.get(i10).f54101b ? 0 : -1));
            if (i11 > 0 && j10 > this.f36376a.get(i10).f54103d) {
                this.f36376a.remove(i10);
                i10--;
            } else if (i11 < 0) {
                return;
            }
            i10++;
        }
    }
}
