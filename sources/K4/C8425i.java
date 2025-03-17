package k4;

import java.util.List;
import s3.a;
import t3.C5957h;

/* renamed from: k4.i  reason: case insensitive filesystem */
public class C8425i {
    private static int a(C8427k kVar, long j10) {
        if (j10 == -9223372036854775807L) {
            return 0;
        }
        int a10 = kVar.a(j10);
        if (a10 == -1) {
            a10 = kVar.m();
        }
        return (a10 <= 0 || kVar.j(a10 + -1) != j10) ? a10 : a10 - 1;
    }

    private static void b(C8427k kVar, int i10, C5957h<C8421e> hVar) {
        long j10 = kVar.j(i10);
        List<a> b10 = kVar.b(j10);
        if (!b10.isEmpty()) {
            if (i10 != kVar.m() - 1) {
                long j11 = kVar.j(i10 + 1) - kVar.j(i10);
                if (j11 > 0) {
                    hVar.accept(new C8421e(b10, j10, j11));
                    return;
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0043 A[LOOP:0: B:11:0x003d->B:13:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void c(k4.C8427k r11, k4.s.b r12, t3.C5957h<k4.C8421e> r13) {
        /*
            long r0 = r12.f54129a
            int r0 = a(r11, r0)
            long r1 = r12.f54129a
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 0
            if (r1 == 0) goto L_0x003b
            int r1 = r11.m()
            if (r0 >= r1) goto L_0x003b
            long r3 = r12.f54129a
            java.util.List r6 = r11.b(r3)
            long r3 = r11.j(r0)
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L_0x003b
            long r7 = r12.f54129a
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x003b
            k4.e r1 = new k4.e
            long r9 = r3 - r7
            r5 = r1
            r5.<init>(r6, r7, r9)
            r13.accept(r1)
            r1 = 1
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            r3 = r0
        L_0x003d:
            int r4 = r11.m()
            if (r3 >= r4) goto L_0x0049
            b(r11, r3, r13)
            int r3 = r3 + 1
            goto L_0x003d
        L_0x0049:
            boolean r3 = r12.f54130b
            if (r3 == 0) goto L_0x0076
            if (r1 == 0) goto L_0x0051
            int r0 = r0 + -1
        L_0x0051:
            if (r2 >= r0) goto L_0x0059
            b(r11, r2, r13)
            int r2 = r2 + 1
            goto L_0x0051
        L_0x0059:
            if (r1 == 0) goto L_0x0076
            k4.e r1 = new k4.e
            long r2 = r12.f54129a
            java.util.List r4 = r11.b(r2)
            long r5 = r11.j(r0)
            long r2 = r12.f54129a
            long r11 = r11.j(r0)
            long r7 = r2 - r11
            r3 = r1
            r3.<init>(r4, r5, r7)
            r13.accept(r1)
        L_0x0076:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.C8425i.c(k4.k, k4.s$b, t3.h):void");
    }
}
