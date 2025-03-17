package G3;

import androidx.media3.exoplayer.Y;
import java.util.List;
import kb.C9967v;
import t3.C5950a;

/* renamed from: G3.h  reason: case insensitive filesystem */
public final class C6488h implements b0 {

    /* renamed from: a  reason: collision with root package name */
    private final C9967v<a> f35925a;

    /* renamed from: b  reason: collision with root package name */
    private long f35926b;

    /* renamed from: G3.h$a */
    private static final class a implements b0 {

        /* renamed from: a  reason: collision with root package name */
        private final b0 f35927a;

        /* renamed from: b  reason: collision with root package name */
        private final C9967v<Integer> f35928b;

        public a(b0 b0Var, List<Integer> list) {
            this.f35927a = b0Var;
            this.f35928b = C9967v.A(list);
        }

        public boolean a() {
            return this.f35927a.a();
        }

        public boolean b(Y y10) {
            return this.f35927a.b(y10);
        }

        public long c() {
            return this.f35927a.c();
        }

        public long d() {
            return this.f35927a.d();
        }

        public void e(long j10) {
            this.f35927a.e(j10);
        }

        public C9967v<Integer> f() {
            return this.f35928b;
        }
    }

    public C6488h(List<? extends b0> list, List<List<Integer>> list2) {
        C9967v.a t10 = C9967v.t();
        C5950a.a(list.size() == list2.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            t10.a(new a((b0) list.get(i10), list2.get(i10)));
        }
        this.f35925a = t10.k();
        this.f35926b = -9223372036854775807L;
    }

    public boolean a() {
        for (int i10 = 0; i10 < this.f35925a.size(); i10++) {
            if (this.f35925a.get(i10).a()) {
                return true;
            }
        }
        return false;
    }

    public boolean b(Y y10) {
        boolean z10;
        boolean z11 = false;
        do {
            long c10 = c();
            if (c10 == Long.MIN_VALUE) {
                break;
            }
            z10 = false;
            for (int i10 = 0; i10 < this.f35925a.size(); i10++) {
                long c11 = this.f35925a.get(i10).c();
                boolean z12 = c11 != Long.MIN_VALUE && c11 <= y10.f22618a;
                if (c11 == c10 || z12) {
                    z10 |= this.f35925a.get(i10).b(y10);
                }
            }
            z11 |= z10;
        } while (z10);
        return z11;
    }

    public long c() {
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f35925a.size(); i10++) {
            long c10 = this.f35925a.get(i10).c();
            if (c10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, c10);
            }
        }
        if (j10 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j10;
    }

    public long d() {
        long j10 = Long.MAX_VALUE;
        long j11 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < this.f35925a.size(); i10++) {
            a aVar = this.f35925a.get(i10);
            long d10 = aVar.d();
            if ((aVar.f().contains(1) || aVar.f().contains(2) || aVar.f().contains(4)) && d10 != Long.MIN_VALUE) {
                j10 = Math.min(j10, d10);
            }
            if (d10 != Long.MIN_VALUE) {
                j11 = Math.min(j11, d10);
            }
        }
        if (j10 != Long.MAX_VALUE) {
            this.f35926b = j10;
            return j10;
        } else if (j11 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        } else {
            long j12 = this.f35926b;
            return j12 != -9223372036854775807L ? j12 : j11;
        }
    }

    public void e(long j10) {
        for (int i10 = 0; i10 < this.f35925a.size(); i10++) {
            this.f35925a.get(i10).e(j10);
        }
    }
}
