package S3;

import N3.C6667e;
import N3.C6679q;
import N3.v;
import N3.y;

/* renamed from: S3.b  reason: case insensitive filesystem */
final class C6688b extends C6667e {

    /* renamed from: S3.b$b  reason: collision with other inner class name */
    private static final class C0650b implements C6667e.f {

        /* renamed from: a  reason: collision with root package name */
        private final y f39851a;

        /* renamed from: b  reason: collision with root package name */
        private final int f39852b;

        /* renamed from: c  reason: collision with root package name */
        private final v.a f39853c;

        private long c(C6679q qVar) {
            while (qVar.h() < qVar.getLength() - 6 && !v.h(qVar, this.f39851a, this.f39852b, this.f39853c)) {
                qVar.i(1);
            }
            if (qVar.h() < qVar.getLength() - 6) {
                return this.f39853c.f38937a;
            }
            qVar.i((int) (qVar.getLength() - qVar.h()));
            return this.f39851a.f38950j;
        }

        public C6667e.C0613e a(C6679q qVar, long j10) {
            long position = qVar.getPosition();
            long c10 = c(qVar);
            long h10 = qVar.h();
            qVar.i(Math.max(6, this.f39851a.f38943c));
            long c11 = c(qVar);
            return (c10 > j10 || c11 <= j10) ? c11 <= j10 ? C6667e.C0613e.f(c11, qVar.h()) : C6667e.C0613e.d(c10, position) : C6667e.C0613e.e(h10);
        }

        private C0650b(y yVar, int i10) {
            this.f39851a = yVar;
            this.f39852b = i10;
            this.f39853c = new v.a();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C6688b(N3.y r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            S3.a r1 = new S3.a
            r1.<init>(r0)
            S3.b$b r2 = new S3.b$b
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.f()
            long r7 = r0.f38950j
            long r13 = r17.d()
            r5 = 6
            int r0 = r0.f38943c
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: S3.C6688b.<init>(N3.y, int, long, long):void");
    }
}
