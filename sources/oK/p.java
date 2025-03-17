package oK;

import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.graphics.Matrix;
import c2.n;
import c2.o;
import c2.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;
import o1.C5673m;
import o1.C5674n;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a#\u0010\u0004\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0016\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0016\u0010\n\u001a\u00020\t*\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b\n\u0010\b\u001a\u0016\u0010\f\u001a\u00020\u000b*\u00020\u000bH\u0002ø\u0001\u0000¢\u0006\u0004\b\f\u0010\b\"\u001b\u0010\u0012\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, d2 = {"Lc2/p;", "", "degrees", "unRotatedParent", "g", "(Lc2/p;ILc2/p;)Lc2/p;", "Lc2/n;", "c", "(J)J", "Lc2/r;", "d", "Lo1/m;", "e", "Landroid/graphics/Matrix;", "a", "LXH/o;", "f", "()Landroid/graphics/Matrix;", "matrix", "sub-sampling-image_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class p {

    /* renamed from: a  reason: collision with root package name */
    private static final C16824o f145419a = C16825p.a(s.NONE, b.f145421c);

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 176)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f145420a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                oK.d$b[] r0 = oK.C17711d.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                oK.d$b r1 = oK.C17711d.b.None     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                oK.d$b r1 = oK.C17711d.b.Orientation90     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                oK.d$b r1 = oK.C17711d.b.Orientation180     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                oK.d$b r1 = oK.C17711d.b.Orientation270     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f145420a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: oK.p.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/graphics/Matrix;", "b", "()Landroid/graphics/Matrix;"}, k = 3, mv = {1, 9, 0})
    static final class b extends C17544u implements C17631a<Matrix> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f145421c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Matrix invoke() {
            return new Matrix();
        }
    }

    private static final long c(long j10) {
        return o.a(n.i(j10), n.h(j10));
    }

    private static final long d(long j10) {
        return c2.s.a(r.g(j10), r.h(j10));
    }

    /* access modifiers changed from: private */
    public static final long e(long j10) {
        return C5674n.a(C5673m.i(j10), C5673m.l(j10));
    }

    /* access modifiers changed from: private */
    public static final Matrix f() {
        return (Matrix) f145419a.getValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final c2.p g(c2.p r13, int r14, c2.p r15) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            java.lang.String r0 = "unRotatedParent"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            if (r14 != 0) goto L_0x000d
            return r13
        L_0x000d:
            java.lang.String r0 = "unsupported orientation = "
            r1 = 360(0x168, float:5.04E-43)
            r2 = 270(0x10e, float:3.78E-43)
            r3 = 180(0xb4, float:2.52E-43)
            r4 = 90
            r5 = -90
            r6 = -180(0xffffffffffffff4c, float:NaN)
            r7 = -270(0xfffffffffffffef2, float:NaN)
            if (r14 == r7) goto L_0x00a0
            if (r14 == r6) goto L_0x0081
            if (r14 == r5) goto L_0x004d
            if (r14 == 0) goto L_0x0047
            if (r14 == r4) goto L_0x00a0
            if (r14 == r3) goto L_0x0081
            if (r14 == r2) goto L_0x004d
            if (r14 != r1) goto L_0x002e
            goto L_0x0047
        L_0x002e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x0047:
            long r8 = r13.n()
            goto L_0x00d3
        L_0x004d:
            long r8 = r15.o()
            long r10 = r13.o()
            int r15 = c2.n.h(r8)
            int r12 = c2.n.h(r10)
            int r15 = r15 - r12
            int r8 = c2.n.i(r8)
            int r9 = c2.n.i(r10)
            int r8 = r8 - r9
            long r8 = c2.o.a(r15, r8)
            long r10 = c(r8)
            int r15 = c2.n.h(r10)
            int r15 = -r15
            long r8 = c(r8)
            int r8 = c2.n.i(r8)
            long r8 = c2.o.a(r15, r8)
            goto L_0x00d3
        L_0x0081:
            long r8 = r15.g()
            long r10 = r13.g()
            int r15 = c2.n.h(r8)
            int r12 = c2.n.h(r10)
            int r15 = r15 - r12
            int r8 = c2.n.i(r8)
            int r9 = c2.n.i(r10)
            int r8 = r8 - r9
            long r8 = c2.o.a(r15, r8)
            goto L_0x00d3
        L_0x00a0:
            long r8 = r15.f()
            long r10 = r13.f()
            int r15 = c2.n.h(r8)
            int r12 = c2.n.h(r10)
            int r15 = r15 - r12
            int r8 = c2.n.i(r8)
            int r9 = c2.n.i(r10)
            int r8 = r8 - r9
            long r8 = c2.o.a(r15, r8)
            long r10 = c(r8)
            int r15 = c2.n.h(r10)
            long r8 = c(r8)
            int r8 = c2.n.i(r8)
            int r8 = -r8
            long r8 = c2.o.a(r15, r8)
        L_0x00d3:
            if (r14 == r7) goto L_0x0110
            if (r14 == r6) goto L_0x010b
            if (r14 == r5) goto L_0x0102
            if (r14 == 0) goto L_0x00fd
            if (r14 == r4) goto L_0x0110
            if (r14 == r3) goto L_0x010b
            if (r14 == r2) goto L_0x0102
            if (r14 != r1) goto L_0x00e4
            goto L_0x00fd
        L_0x00e4:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r15.append(r0)
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L_0x00fd:
            long r13 = r13.l()
            goto L_0x0118
        L_0x0102:
            long r13 = r13.l()
            long r13 = d(r13)
            goto L_0x0118
        L_0x010b:
            long r13 = r13.l()
            goto L_0x0118
        L_0x0110:
            long r13 = r13.l()
            long r13 = d(r13)
        L_0x0118:
            c2.p r13 = c2.q.a(r8, r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: oK.p.g(c2.p, int, c2.p):c2.p");
    }
}
