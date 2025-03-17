package H3;

import java.util.ArrayList;
import k4.C8421e;
import kb.C9922B;
import kb.C9967v;
import s3.a;

final class f implements C6523a {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<C8421e> f36377a = new ArrayList<>();

    private int f(long j10) {
        for (int i10 = 0; i10 < this.f36377a.size(); i10++) {
            if (j10 < this.f36377a.get(i10).f54101b) {
                return i10;
            }
        }
        return this.f36377a.size();
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(k4.C8421e r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.f54101b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 0
            r4 = 1
            if (r0 == 0) goto L_0x000f
            r0 = r4
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            t3.C5950a.a(r0)
            long r5 = r10.f54101b
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0025
            long r5 = r10.f54103d
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0023
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0025
        L_0x0023:
            r0 = r4
            goto L_0x0026
        L_0x0025:
            r0 = r1
        L_0x0026:
            java.util.ArrayList<k4.e> r2 = r9.f36377a
            int r2 = r2.size()
            int r2 = r2 - r4
        L_0x002d:
            if (r2 < 0) goto L_0x0058
            long r5 = r10.f54101b
            java.util.ArrayList<k4.e> r3 = r9.f36377a
            java.lang.Object r3 = r3.get(r2)
            k4.e r3 = (k4.C8421e) r3
            long r7 = r3.f54101b
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L_0x0046
            java.util.ArrayList<k4.e> r11 = r9.f36377a
            int r2 = r2 + r4
            r11.add(r2, r10)
            return r0
        L_0x0046:
            java.util.ArrayList<k4.e> r3 = r9.f36377a
            java.lang.Object r3 = r3.get(r2)
            k4.e r3 = (k4.C8421e) r3
            long r5 = r3.f54101b
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L_0x0055
            r0 = r1
        L_0x0055:
            int r2 = r2 + -1
            goto L_0x002d
        L_0x0058:
            java.util.ArrayList<k4.e> r11 = r9.f36377a
            r11.add(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: H3.f.a(k4.e, long):boolean");
    }

    public C9967v<a> b(long j10) {
        int f10 = f(j10);
        if (f10 == 0) {
            return C9967v.E();
        }
        C8421e eVar = this.f36377a.get(f10 - 1);
        long j11 = eVar.f54103d;
        return (j11 == -9223372036854775807L || j10 < j11) ? eVar.f54100a : C9967v.E();
    }

    public long c(long j10) {
        if (this.f36377a.isEmpty() || j10 < this.f36377a.get(0).f54101b) {
            return -9223372036854775807L;
        }
        for (int i10 = 1; i10 < this.f36377a.size(); i10++) {
            long j11 = this.f36377a.get(i10).f54101b;
            int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
            if (i11 == 0) {
                return j11;
            }
            if (i11 < 0) {
                C8421e eVar = this.f36377a.get(i10 - 1);
                long j12 = eVar.f54103d;
                return (j12 == -9223372036854775807L || j12 > j10) ? eVar.f54101b : j12;
            }
        }
        C8421e eVar2 = (C8421e) C9922B.d(this.f36377a);
        long j13 = eVar2.f54103d;
        return (j13 == -9223372036854775807L || j10 < j13) ? eVar2.f54101b : j13;
    }

    public void clear() {
        this.f36377a.clear();
    }

    public long d(long j10) {
        if (this.f36377a.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j10 < this.f36377a.get(0).f54101b) {
            return this.f36377a.get(0).f54101b;
        }
        for (int i10 = 1; i10 < this.f36377a.size(); i10++) {
            C8421e eVar = this.f36377a.get(i10);
            if (j10 < eVar.f54101b) {
                long j11 = this.f36377a.get(i10 - 1).f54103d;
                return (j11 == -9223372036854775807L || j11 <= j10 || j11 >= eVar.f54101b) ? eVar.f54101b : j11;
            }
        }
        long j12 = ((C8421e) C9922B.d(this.f36377a)).f54103d;
        if (j12 == -9223372036854775807L || j10 >= j12) {
            return Long.MIN_VALUE;
        }
        return j12;
    }

    public void e(long j10) {
        int f10 = f(j10);
        if (f10 != 0) {
            long j11 = this.f36377a.get(f10 - 1).f54103d;
            if (j11 == -9223372036854775807L || j11 >= j10) {
                f10--;
            }
            this.f36377a.subList(0, f10).clear();
        }
    }
}
