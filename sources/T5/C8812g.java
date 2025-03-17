package t5;

import android.text.TextUtils;
import androidx.work.C7055y;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import java.util.List;
import l5.C8501F;
import l5.O;

/* renamed from: t5.g  reason: case insensitive filesystem */
public class C8812g {

    /* renamed from: a  reason: collision with root package name */
    private static final String f56620a = C7055y.i("EnqueueRunnable");

    public static boolean a(C8501F f10) {
        O h10 = f10.h();
        WorkDatabase w10 = h10.w();
        w10.beginTransaction();
        try {
            C8813h.a(w10, h10.p(), f10);
            boolean e10 = e(f10);
            w10.setTransactionSuccessful();
            return e10;
        } finally {
            w10.endTransaction();
        }
    }

    public static void b(C8501F f10) {
        if (f10.i()) {
            throw new IllegalStateException("WorkContinuation has cycles (" + f10 + ")");
        } else if (a(f10)) {
            f(f10);
        }
    }

    private static boolean c(C8501F f10) {
        boolean d10 = d(f10.h(), f10.g(), (String[]) C8501F.n(f10).toArray(new String[0]), f10.e(), f10.c());
        f10.m();
        return d10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x015f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean d(l5.O r18, java.util.List<? extends androidx.work.T> r19, java.lang.String[] r20, java.lang.String r21, androidx.work.C7042k r22) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            androidx.work.c r3 = r18.p()
            androidx.work.b r3 = r3.a()
            long r3 = r3.a()
            androidx.work.impl.WorkDatabase r5 = r18.w()
            r7 = 0
            if (r0 == 0) goto L_0x001e
            int r8 = r0.length
            if (r8 <= 0) goto L_0x001e
            r8 = 1
            goto L_0x001f
        L_0x001e:
            r8 = r7
        L_0x001f:
            if (r8 == 0) goto L_0x006c
            int r9 = r0.length
            r10 = r7
            r12 = r10
            r13 = r12
            r11 = 1
        L_0x0026:
            if (r10 >= r9) goto L_0x006f
            r14 = r0[r10]
            s5.v r15 = r5.f()
            s5.u r15 = r15.i(r14)
            if (r15 != 0) goto L_0x0054
            androidx.work.y r0 = androidx.work.C7055y.e()
            java.lang.String r1 = f56620a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Prerequisite "
            r2.append(r3)
            r2.append(r14)
            java.lang.String r3 = " doesn't exist; not enqueuing"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.c(r1, r2)
            return r7
        L_0x0054:
            androidx.work.Q$c r14 = r15.f55911b
            androidx.work.Q$c r15 = androidx.work.Q.c.SUCCEEDED
            if (r14 != r15) goto L_0x005c
            r15 = 1
            goto L_0x005d
        L_0x005c:
            r15 = r7
        L_0x005d:
            r11 = r11 & r15
            androidx.work.Q$c r15 = androidx.work.Q.c.FAILED
            if (r14 != r15) goto L_0x0064
            r13 = 1
            goto L_0x0069
        L_0x0064:
            androidx.work.Q$c r15 = androidx.work.Q.c.CANCELLED
            if (r14 != r15) goto L_0x0069
            r12 = 1
        L_0x0069:
            int r10 = r10 + 1
            goto L_0x0026
        L_0x006c:
            r12 = r7
            r13 = r12
            r11 = 1
        L_0x006f:
            boolean r9 = android.text.TextUtils.isEmpty(r21)
            if (r9 != 0) goto L_0x0152
            if (r8 != 0) goto L_0x0152
            s5.v r10 = r5.f()
            java.util.List r10 = r10.s(r1)
            boolean r14 = r10.isEmpty()
            if (r14 != 0) goto L_0x0152
            androidx.work.k r14 = androidx.work.C7042k.APPEND
            if (r2 == r14) goto L_0x008d
            androidx.work.k r14 = androidx.work.C7042k.APPEND_OR_REPLACE
            if (r2 != r14) goto L_0x0090
        L_0x008d:
            r14 = r18
            goto L_0x00d1
        L_0x0090:
            androidx.work.k r14 = androidx.work.C7042k.KEEP
            if (r2 != r14) goto L_0x00af
            java.util.Iterator r2 = r10.iterator()
        L_0x0098:
            boolean r14 = r2.hasNext()
            if (r14 == 0) goto L_0x00af
            java.lang.Object r14 = r2.next()
            s5.u$b r14 = (s5.C8739u.b) r14
            androidx.work.Q$c r14 = r14.f55935b
            androidx.work.Q$c r15 = androidx.work.Q.c.ENQUEUED
            if (r14 == r15) goto L_0x00ae
            androidx.work.Q$c r15 = androidx.work.Q.c.RUNNING
            if (r14 != r15) goto L_0x0098
        L_0x00ae:
            return r7
        L_0x00af:
            r14 = r18
            t5.C8809d.g(r1, r14)
            s5.v r2 = r5.f()
            java.util.Iterator r10 = r10.iterator()
        L_0x00bc:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L_0x00ce
            java.lang.Object r15 = r10.next()
            s5.u$b r15 = (s5.C8739u.b) r15
            java.lang.String r15 = r15.f55934a
            r2.a(r15)
            goto L_0x00bc
        L_0x00ce:
            r6 = 1
            goto L_0x0155
        L_0x00d1:
            s5.b r8 = r5.a()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            java.util.Iterator r10 = r10.iterator()
        L_0x00de:
            boolean r16 = r10.hasNext()
            if (r16 == 0) goto L_0x0118
            java.lang.Object r16 = r10.next()
            r6 = r16
            s5.u$b r6 = (s5.C8739u.b) r6
            java.lang.String r7 = r6.f55934a
            boolean r7 = r8.d(r7)
            if (r7 != 0) goto L_0x0112
            androidx.work.Q$c r7 = r6.f55935b
            r17 = r8
            androidx.work.Q$c r8 = androidx.work.Q.c.SUCCEEDED
            if (r7 != r8) goto L_0x00fe
            r8 = 1
            goto L_0x00ff
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            r8 = r8 & r11
            androidx.work.Q$c r11 = androidx.work.Q.c.FAILED
            if (r7 != r11) goto L_0x0106
            r13 = 1
            goto L_0x010b
        L_0x0106:
            androidx.work.Q$c r11 = androidx.work.Q.c.CANCELLED
            if (r7 != r11) goto L_0x010b
            r12 = 1
        L_0x010b:
            java.lang.String r6 = r6.f55934a
            r15.add(r6)
            r11 = r8
            goto L_0x0114
        L_0x0112:
            r17 = r8
        L_0x0114:
            r8 = r17
            r7 = 0
            goto L_0x00de
        L_0x0118:
            androidx.work.k r6 = androidx.work.C7042k.APPEND_OR_REPLACE
            if (r2 != r6) goto L_0x0144
            if (r12 != 0) goto L_0x0120
            if (r13 == 0) goto L_0x0144
        L_0x0120:
            s5.v r2 = r5.f()
            java.util.List r6 = r2.s(r1)
            java.util.Iterator r6 = r6.iterator()
        L_0x012c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x013e
            java.lang.Object r7 = r6.next()
            s5.u$b r7 = (s5.C8739u.b) r7
            java.lang.String r7 = r7.f55934a
            r2.a(r7)
            goto L_0x012c
        L_0x013e:
            java.util.List r15 = java.util.Collections.emptyList()
            r12 = 0
            r13 = 0
        L_0x0144:
            java.lang.Object[] r0 = r15.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            int r2 = r0.length
            if (r2 <= 0) goto L_0x014f
            r8 = 1
            goto L_0x0150
        L_0x014f:
            r8 = 0
        L_0x0150:
            r6 = 0
            goto L_0x0155
        L_0x0152:
            r14 = r18
            goto L_0x0150
        L_0x0155:
            java.util.Iterator r2 = r19.iterator()
        L_0x0159:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x01e6
            java.lang.Object r7 = r2.next()
            androidx.work.T r7 = (androidx.work.T) r7
            s5.u r10 = r7.d()
            if (r8 == 0) goto L_0x0180
            if (r11 != 0) goto L_0x0180
            if (r13 == 0) goto L_0x0174
            androidx.work.Q$c r15 = androidx.work.Q.c.FAILED
            r10.f55911b = r15
            goto L_0x0182
        L_0x0174:
            if (r12 == 0) goto L_0x017b
            androidx.work.Q$c r15 = androidx.work.Q.c.CANCELLED
            r10.f55911b = r15
            goto L_0x0182
        L_0x017b:
            androidx.work.Q$c r15 = androidx.work.Q.c.BLOCKED
            r10.f55911b = r15
            goto L_0x0182
        L_0x0180:
            r10.f55923n = r3
        L_0x0182:
            androidx.work.Q$c r15 = r10.f55911b
            r19 = r2
            androidx.work.Q$c r2 = androidx.work.Q.c.ENQUEUED
            if (r15 != r2) goto L_0x018b
            r6 = 1
        L_0x018b:
            s5.v r2 = r5.f()
            java.util.List r15 = r18.u()
            s5.u r10 = t5.C8813h.c(r15, r10)
            r2.q(r10)
            if (r8 == 0) goto L_0x01bd
            int r2 = r0.length
            r10 = 0
        L_0x019e:
            if (r10 >= r2) goto L_0x01bd
            r15 = r0[r10]
            r17 = r0
            s5.a r0 = new s5.a
            r20 = r2
            java.lang.String r2 = r7.b()
            r0.<init>(r2, r15)
            s5.b r2 = r5.a()
            r2.c(r0)
            int r10 = r10 + 1
            r2 = r20
            r0 = r17
            goto L_0x019e
        L_0x01bd:
            r17 = r0
            s5.B r0 = r5.g()
            java.lang.String r2 = r7.b()
            java.util.Set r10 = r7.c()
            r0.d(r2, r10)
            if (r9 != 0) goto L_0x01e0
            s5.o r0 = r5.d()
            s5.n r2 = new s5.n
            java.lang.String r7 = r7.b()
            r2.<init>(r1, r7)
            r0.a(r2)
        L_0x01e0:
            r2 = r19
            r0 = r17
            goto L_0x0159
        L_0x01e6:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: t5.C8812g.d(l5.O, java.util.List, java.lang.String[], java.lang.String, androidx.work.k):boolean");
    }

    private static boolean e(C8501F f10) {
        List<C8501F> f11 = f10.f();
        boolean z10 = false;
        if (f11 != null) {
            for (C8501F next : f11) {
                if (!next.k()) {
                    z10 |= e(next);
                } else {
                    C7055y e10 = C7055y.e();
                    String str = f56620a;
                    e10.k(str, "Already enqueued work ids (" + TextUtils.join(", ", next.d()) + ")");
                }
            }
        }
        return c(f10) | z10;
    }

    public static void f(C8501F f10) {
        O h10 = f10.h();
        a.h(h10.p(), h10.w(), h10.u());
    }
}
