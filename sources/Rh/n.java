package RH;

import SH.C16416a;
import SH.C16419d;
import TH.C16492f;
import XH.C16814e;
import XH.C16820k;
import java.io.Closeable;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tI.C17978n;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b5\b'\u0018\u0000 :2\u00060\u0001j\u0002`\u0002:\u0001ZB+\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0011\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0019\u0010\u0017J+\u0010\u001a\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001a\u0010\u0012J \u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001b\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#J'\u0010&\u001a\u00020!2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000eH\u0002¢\u0006\u0004\b&\u0010'J\"\u0010)\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0010¢\u0006\u0004\b)\u0010*J\u0011\u0010+\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020!2\u0006\u0010-\u001a\u00020\u0003H\u0002¢\u0006\u0004\b.\u0010#J\"\u00100\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003H\u0010¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b2\u0010\u0015J\u0017\u00103\u001a\u00020!2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b3\u0010#J-\u00108\u001a\u00020\u000e2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020\u000e2\u0006\u00107\u001a\u00020\u000eH$ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020!H$¢\u0006\u0004\b:\u0010;J\r\u0010=\u001a\u00020<¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020!¢\u0006\u0004\b?\u0010;J\u000f\u0010@\u001a\u00020!H\u0016¢\u0006\u0004\b@\u0010;J\u0011\u0010A\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\bA\u0010,J\u0011\u0010B\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0004\bB\u0010,J\u0017\u0010D\u001a\u00020!2\u0006\u0010C\u001a\u00020\u0003H\u0000¢\u0006\u0004\bD\u0010#J\u0017\u0010E\u001a\u00020<2\u0006\u0010C\u001a\u00020\u0003H\u0000¢\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\bG\u0010HJ\u0015\u0010I\u001a\u00020!2\u0006\u0010\u001b\u001a\u00020\u000e¢\u0006\u0004\bI\u0010JJ\u0015\u0010K\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\bK\u0010LJ!\u0010N\u001a\u00020M2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\bN\u0010OJ\u0019\u0010P\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u000eH\u0000¢\u0006\u0004\bP\u0010QJ\u0019\u0010R\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0004\bR\u0010SJ\u0019\u0010T\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0003H\u0001¢\u0006\u0004\bT\u0010SJ\u0017\u0010U\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0003H\u0000¢\u0006\u0004\bU\u0010#J\u0011\u0010V\u001a\u0004\u0018\u00010\u0003H\u0014¢\u0006\u0004\bV\u0010,J\u000f\u0010W\u001a\u00020!H\u0004¢\u0006\u0004\bW\u0010;J\u0019\u0010X\u001a\u0004\u0018\u00010\u00032\u0006\u0010/\u001a\u00020\u000eH\u0001¢\u0006\u0004\bX\u0010QJ\u0017\u0010Y\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\bY\u0010SR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R$\u0010b\u001a\u00020\u00032\u0006\u0010^\u001a\u00020\u00038\u0002@BX\u000e¢\u0006\f\n\u0004\b_\u0010`\"\u0004\ba\u0010#R1\u0010i\u001a\u0002048\u0000@\u0000X\u000eø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0018\n\u0004\b3\u0010c\u0012\u0004\bh\u0010;\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR(\u0010o\u001a\u00020\u000e8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\bD\u0010j\u0012\u0004\bn\u0010;\u001a\u0004\bk\u0010l\"\u0004\bm\u0010JR(\u0010s\u001a\u00020\u000e8\u0000@\u0000X\u000e¢\u0006\u0018\n\u0004\b.\u0010j\u0012\u0004\br\u0010;\u001a\u0004\bp\u0010l\"\u0004\bq\u0010JR0\u0010{\u001a\u00020\u00052\u0006\u0010t\u001a\u00020\u00058\u0000@@X\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010u\u0012\u0004\bz\u0010;\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u0016\u0010}\u001a\u00020<8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b=\u0010|R\u0011\u0010~\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\bu\u0010>R\u001b\u0010\u0004\u001a\u00020\u00038@X\u0004¢\u0006\r\u0012\u0005\b\u0001\u0010;\u001a\u0004\b\u0010,R\u0012\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b\u0001\u0010w\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006\u0001"}, d2 = {"LRH/n;", "Ljava/io/Closeable;", "Lio/ktor/utils/io/core/Closeable;", "LSH/a;", "head", "", "remaining", "LTH/f;", "pool", "<init>", "(LSH/a;JLTH/f;)V", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "out", "", "min", "max", "F0", "(Ljava/lang/Appendable;II)I", "", "f", "(I)Ljava/lang/Void;", "l0", "(II)Ljava/lang/Void;", "copied", "p0", "N0", "n", "skipped", "o", "(JJ)J", "(II)I", "current", "LXH/N;", "B", "(LSH/a;)V", "size", "overrun", "F", "(LSH/a;II)V", "empty", "u", "(LSH/a;LSH/a;)LSH/a;", "s", "()LSH/a;", "chunk", "e", "minSize", "E0", "(ILSH/a;)LSH/a;", "o0", "c", "LPH/c;", "destination", "offset", "length", "x", "(Ljava/nio/ByteBuffer;II)I", "h", "()V", "", "g", "()Z", "O0", "close", "W0", "T0", "chain", "d", "X0", "(LSH/a;)Z", "i", "(I)I", "q", "(I)V", "l", "(J)J", "", "I0", "(II)Ljava/lang/String;", "A0", "(I)LSH/a;", "v", "(LSH/a;)LSH/a;", "t", "z", "w", "j0", "t0", "P0", "a", "LTH/f;", "h0", "()LTH/f;", "newHead", "b", "LSH/a;", "S0", "_head", "Ljava/nio/ByteBuffer;", "e0", "()Ljava/nio/ByteBuffer;", "setHeadMemory-3GNKZMM", "(Ljava/nio/ByteBuffer;)V", "getHeadMemory-SK3TCg8$annotations", "headMemory", "I", "f0", "()I", "Q0", "getHeadPosition$annotations", "headPosition", "U", "setHeadEndExclusive", "getHeadEndExclusive$annotations", "headEndExclusive", "newValue", "J", "getTailRemaining", "()J", "R0", "(J)V", "getTailRemaining$annotations", "tailRemaining", "Z", "noMoreChunksAvailable", "endOfInput", "N", "getHead$annotations", "i0", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public abstract class n implements Closeable {

    /* renamed from: h  reason: collision with root package name */
    public static final a f137972h = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C16492f<C16416a> f137973a;

    /* renamed from: b  reason: collision with root package name */
    private C16416a f137974b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer f137975c;

    /* renamed from: d  reason: collision with root package name */
    private int f137976d;

    /* renamed from: e  reason: collision with root package name */
    private int f137977e;

    /* renamed from: f  reason: collision with root package name */
    private long f137978f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f137979g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRH/n$a;", "", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public n() {
        this((C16416a) null, 0, (C16492f) null, 7, (DefaultConstructorMarker) null);
    }

    private final void B(C16416a aVar) {
        if (!this.f137979g || aVar.A() != null) {
            int k10 = aVar.k() - aVar.i();
            int min = Math.min(k10, 8 - (aVar.f() - aVar.g()));
            if (k10 > min) {
                F(aVar, k10, min);
            } else {
                C16416a Q12 = this.f137973a.Q1();
                Q12.p(8);
                Q12.F(aVar.y());
                C16369b.a(Q12, aVar, k10);
                S0(Q12);
            }
            aVar.D(this.f137973a);
            return;
        }
        this.f137976d = aVar.i();
        this.f137977e = aVar.k();
        R0(0);
    }

    private final C16416a E0(int i10, C16416a aVar) {
        while (true) {
            int U10 = U() - f0();
            if (U10 >= i10) {
                return aVar;
            }
            C16416a A10 = aVar.A();
            if (A10 == null && (A10 = s()) == null) {
                return null;
            }
            if (U10 == 0) {
                if (aVar != C16416a.f138260j.a()) {
                    P0(aVar);
                }
                aVar = A10;
            } else {
                int a10 = C16369b.a(aVar, A10, i10 - U10);
                this.f137977e = aVar.k();
                R0(this.f137978f - ((long) a10));
                if (A10.k() > A10.i()) {
                    A10.q(a10);
                } else {
                    aVar.F((C16416a) null);
                    aVar.F(A10.y());
                    A10.D(this.f137973a);
                }
                if (aVar.k() - aVar.i() >= i10) {
                    return aVar;
                }
                if (i10 > 8) {
                    o0(i10);
                    throw new C16820k();
                }
            }
        }
    }

    private final void F(C16416a aVar, int i10, int i11) {
        C16416a Q12 = this.f137973a.Q1();
        C16416a Q13 = this.f137973a.Q1();
        Q12.p(8);
        Q13.p(8);
        Q12.F(Q13);
        Q13.F(aVar.y());
        C16369b.a(Q12, aVar, i10 - i11);
        C16369b.a(Q13, aVar, i11);
        S0(Q12);
        R0(C16375h.e(Q13));
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int F0(java.lang.Appendable r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 0
            if (r15 != 0) goto L_0x0006
            if (r14 != 0) goto L_0x0006
            return r0
        L_0x0006:
            boolean r1 = r12.J()
            if (r1 == 0) goto L_0x0018
            if (r14 != 0) goto L_0x000f
            return r0
        L_0x000f:
            r12.f(r14)
            XH.k r13 = new XH.k
            r13.<init>()
            throw r13
        L_0x0018:
            if (r15 < r14) goto L_0x0093
            r1 = 1
            SH.a r2 = SH.g.b(r12, r1)
            if (r2 != 0) goto L_0x0024
            r3 = r0
            goto L_0x0076
        L_0x0024:
            r3 = r0
            r4 = r3
        L_0x0026:
            java.nio.ByteBuffer r5 = r2.h()     // Catch:{ all -> 0x0051 }
            int r6 = r2.i()     // Catch:{ all -> 0x0051 }
            int r7 = r2.k()     // Catch:{ all -> 0x0051 }
            r8 = r6
        L_0x0033:
            if (r8 >= r7) goto L_0x005a
            byte r9 = r5.get(r8)     // Catch:{ all -> 0x0051 }
            r10 = r9 & 255(0xff, float:3.57E-43)
            r11 = 128(0x80, float:1.794E-43)
            r9 = r9 & r11
            if (r9 == r11) goto L_0x0054
            char r9 = (char) r10     // Catch:{ all -> 0x0051 }
            if (r3 != r15) goto L_0x0045
            r9 = r0
            goto L_0x004b
        L_0x0045:
            r13.append(r9)     // Catch:{ all -> 0x0051 }
            int r3 = r3 + 1
            r9 = r1
        L_0x004b:
            if (r9 != 0) goto L_0x004e
            goto L_0x0054
        L_0x004e:
            int r8 = r8 + 1
            goto L_0x0033
        L_0x0051:
            r13 = move-exception
            r0 = r1
            goto L_0x008d
        L_0x0054:
            int r8 = r8 - r6
            r2.c(r8)     // Catch:{ all -> 0x0051 }
            r5 = r0
            goto L_0x005f
        L_0x005a:
            int r7 = r7 - r6
            r2.c(r7)     // Catch:{ all -> 0x0051 }
            r5 = r1
        L_0x005f:
            if (r5 == 0) goto L_0x0063
            r5 = r1
            goto L_0x0069
        L_0x0063:
            if (r3 != r15) goto L_0x0067
            r5 = r0
            goto L_0x0069
        L_0x0067:
            r5 = r0
            r4 = r1
        L_0x0069:
            if (r5 != 0) goto L_0x006f
            SH.g.a(r12, r2)
            goto L_0x0075
        L_0x006f:
            SH.a r2 = SH.g.c(r12, r2)     // Catch:{ all -> 0x008c }
            if (r2 != 0) goto L_0x0026
        L_0x0075:
            r0 = r4
        L_0x0076:
            if (r0 == 0) goto L_0x0080
            int r14 = r14 - r3
            int r15 = r15 - r3
            int r13 = r12.N0(r13, r14, r15)
            int r3 = r3 + r13
            return r3
        L_0x0080:
            if (r3 < r14) goto L_0x0083
            return r3
        L_0x0083:
            r12.p0(r14, r3)
            XH.k r13 = new XH.k
            r13.<init>()
            throw r13
        L_0x008c:
            r13 = move-exception
        L_0x008d:
            if (r0 == 0) goto L_0x0092
            SH.g.a(r12, r2)
        L_0x0092:
            throw r13
        L_0x0093:
            r12.l0(r14, r15)
            XH.k r13 = new XH.k
            r13.<init>()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: RH.n.F0(java.lang.Appendable, int, int):int");
    }

    public static /* synthetic */ String K0(n nVar, int i10, int i11, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 1) != 0) {
                i10 = 0;
            }
            if ((i12 & 2) != 0) {
                i11 = Integer.MAX_VALUE;
            }
            return nVar.I0(i10, i11);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: readText");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00da, code lost:
        r4 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        r5.c(((r11 - r9) - r14) + 1);
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0154  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int N0(java.lang.Appendable r18, int r19, int r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            r3 = r20
            r4 = 1
            SH.a r5 = SH.g.b(r1, r4)
            if (r5 != 0) goto L_0x0012
            r6 = 0
            goto L_0x0146
        L_0x0012:
            r7 = r4
            r8 = 0
        L_0x0014:
            int r9 = r5.k()     // Catch:{ all -> 0x010d }
            int r10 = r5.i()     // Catch:{ all -> 0x010d }
            int r9 = r9 - r10
            if (r9 < r7) goto L_0x0116
            java.nio.ByteBuffer r7 = r5.h()     // Catch:{ all -> 0x00e2 }
            int r9 = r5.i()     // Catch:{ all -> 0x00e2 }
            int r10 = r5.k()     // Catch:{ all -> 0x00e2 }
            r11 = r9
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x002f:
            if (r11 >= r10) goto L_0x00f2
            byte r15 = r7.get(r11)     // Catch:{ all -> 0x00e2 }
            r6 = r15 & 255(0xff, float:3.57E-43)
            r4 = r15 & 128(0x80, float:1.794E-43)
            r16 = -1
            if (r4 != 0) goto L_0x0063
            if (r12 != 0) goto L_0x005a
            char r4 = (char) r6
            if (r8 != r3) goto L_0x0044
            r4 = 0
            goto L_0x004a
        L_0x0044:
            r0.append(r4)     // Catch:{ all -> 0x0053 }
            int r8 = r8 + 1
            r4 = 1
        L_0x004a:
            if (r4 != 0) goto L_0x0057
            int r11 = r11 - r9
            r5.c(r11)     // Catch:{ all -> 0x0053 }
        L_0x0050:
            r4 = 1
            goto L_0x00f8
        L_0x0053:
            r0 = move-exception
            r4 = 1
            goto L_0x010f
        L_0x0057:
            r4 = 1
            goto L_0x00ee
        L_0x005a:
            SH.f.i(r12)     // Catch:{ all -> 0x0053 }
            XH.k r0 = new XH.k     // Catch:{ all -> 0x0053 }
            r0.<init>()     // Catch:{ all -> 0x0053 }
            throw r0     // Catch:{ all -> 0x0053 }
        L_0x0063:
            if (r12 != 0) goto L_0x0089
            r4 = 128(0x80, float:1.794E-43)
            r13 = r6
            r6 = 1
        L_0x0069:
            r14 = 7
            if (r6 >= r14) goto L_0x0079
            r14 = r13 & r4
            if (r14 == 0) goto L_0x0079
            int r14 = ~r4     // Catch:{ all -> 0x0053 }
            r13 = r13 & r14
            int r4 = r4 >> 1
            int r12 = r12 + 1
            int r6 = r6 + 1
            goto L_0x0069
        L_0x0079:
            int r4 = r12 + -1
            int r6 = r10 - r11
            if (r12 <= r6) goto L_0x0086
            int r11 = r11 - r9
            r5.c(r11)     // Catch:{ all -> 0x0053 }
            r16 = r12
            goto L_0x0050
        L_0x0086:
            r14 = r12
            r12 = r4
            goto L_0x0057
        L_0x0089:
            int r4 = r13 << 6
            r6 = r15 & 127(0x7f, float:1.78E-43)
            r13 = r4 | r6
            int r12 = r12 + -1
            if (r12 != 0) goto L_0x0057
            boolean r4 = SH.f.f(r13)     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x00ae
            char r4 = (char) r13     // Catch:{ all -> 0x0053 }
            if (r8 != r3) goto L_0x009e
            r4 = 0
            goto L_0x00a4
        L_0x009e:
            r0.append(r4)     // Catch:{ all -> 0x0053 }
            int r8 = r8 + 1
            r4 = 1
        L_0x00a4:
            if (r4 != 0) goto L_0x00d7
            int r11 = r11 - r9
            int r11 = r11 - r14
            r4 = 1
            int r11 = r11 + r4
            r5.c(r11)     // Catch:{ all -> 0x0053 }
            goto L_0x0050
        L_0x00ae:
            boolean r4 = SH.f.g(r13)     // Catch:{ all -> 0x0053 }
            if (r4 == 0) goto L_0x00e4
            int r4 = SH.f.e(r13)     // Catch:{ all -> 0x0053 }
            char r4 = (char) r4     // Catch:{ all -> 0x0053 }
            if (r8 != r3) goto L_0x00bd
            r4 = 0
            goto L_0x00c3
        L_0x00bd:
            r0.append(r4)     // Catch:{ all -> 0x0053 }
            int r8 = r8 + 1
            r4 = 1
        L_0x00c3:
            if (r4 == 0) goto L_0x00da
            int r4 = SH.f.h(r13)     // Catch:{ all -> 0x0053 }
            char r4 = (char) r4     // Catch:{ all -> 0x0053 }
            if (r8 != r3) goto L_0x00ce
            r4 = 0
            goto L_0x00d4
        L_0x00ce:
            r0.append(r4)     // Catch:{ all -> 0x0053 }
            int r8 = r8 + 1
            r4 = 1
        L_0x00d4:
            if (r4 != 0) goto L_0x00d7
            goto L_0x00da
        L_0x00d7:
            r4 = 1
            r13 = 0
            goto L_0x00ee
        L_0x00da:
            int r11 = r11 - r9
            int r11 = r11 - r14
            r4 = 1
            int r11 = r11 + r4
            r5.c(r11)     // Catch:{ all -> 0x00e2 }
            goto L_0x00f8
        L_0x00e2:
            r0 = move-exception
            goto L_0x010f
        L_0x00e4:
            r4 = 1
            SH.f.j(r13)     // Catch:{ all -> 0x00e2 }
            XH.k r0 = new XH.k     // Catch:{ all -> 0x00e2 }
            r0.<init>()     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00ee:
            int r11 = r11 + 1
            goto L_0x002f
        L_0x00f2:
            int r10 = r10 - r9
            r5.c(r10)     // Catch:{ all -> 0x00e2 }
            r16 = 0
        L_0x00f8:
            if (r16 != 0) goto L_0x00fc
            r7 = r4
            goto L_0x0102
        L_0x00fc:
            if (r16 <= 0) goto L_0x0101
            r7 = r16
            goto L_0x0102
        L_0x0101:
            r7 = 0
        L_0x0102:
            int r6 = r5.k()     // Catch:{ all -> 0x010d }
            int r9 = r5.i()     // Catch:{ all -> 0x010d }
            int r9 = r6 - r9
            goto L_0x0116
        L_0x010d:
            r0 = move-exception
            goto L_0x0152
        L_0x010f:
            r5.k()     // Catch:{ all -> 0x010d }
            r5.i()     // Catch:{ all -> 0x010d }
            throw r0     // Catch:{ all -> 0x010d }
        L_0x0116:
            if (r9 != 0) goto L_0x0120
            SH.a r6 = SH.g.c(r1, r5)     // Catch:{ all -> 0x011d }
            goto L_0x0139
        L_0x011d:
            r0 = move-exception
            r4 = 0
            goto L_0x0152
        L_0x0120:
            if (r9 < r7) goto L_0x0132
            int r6 = r5.f()     // Catch:{ all -> 0x011d }
            int r9 = r5.g()     // Catch:{ all -> 0x011d }
            int r6 = r6 - r9
            r9 = 8
            if (r6 >= r9) goto L_0x0130
            goto L_0x0132
        L_0x0130:
            r6 = r5
            goto L_0x0139
        L_0x0132:
            SH.g.a(r1, r5)     // Catch:{ all -> 0x011d }
            SH.a r6 = SH.g.b(r1, r7)     // Catch:{ all -> 0x011d }
        L_0x0139:
            if (r6 != 0) goto L_0x013d
            r4 = 0
            goto L_0x0140
        L_0x013d:
            r5 = r6
            if (r7 > 0) goto L_0x0014
        L_0x0140:
            if (r4 == 0) goto L_0x0145
            SH.g.a(r1, r5)
        L_0x0145:
            r6 = r8
        L_0x0146:
            if (r6 < r2) goto L_0x0149
            return r6
        L_0x0149:
            r1.p0(r2, r6)
            XH.k r0 = new XH.k
            r0.<init>()
            throw r0
        L_0x0152:
            if (r4 == 0) goto L_0x0157
            SH.g.a(r1, r5)
        L_0x0157:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: RH.n.N0(java.lang.Appendable, int, int):int");
    }

    private final void S0(C16416a aVar) {
        this.f137974b = aVar;
        this.f137975c = aVar.h();
        this.f137976d = aVar.i();
        this.f137977e = aVar.k();
    }

    private final void c(C16416a aVar) {
        if (aVar.k() - aVar.i() == 0) {
            P0(aVar);
        }
    }

    private final void e(C16416a aVar) {
        C16416a c10 = C16375h.c(this.f137974b);
        if (c10 == C16416a.f138260j.a()) {
            S0(aVar);
            long j10 = 0;
            if (this.f137978f == 0) {
                C16416a A10 = aVar.A();
                if (A10 != null) {
                    j10 = C16375h.e(A10);
                }
                R0(j10);
                return;
            }
            throw new IllegalStateException("It should be no tail remaining bytes if current tail is EmptyBuffer");
        }
        c10.F(aVar);
        R0(this.f137978f + C16375h.e(aVar));
    }

    private final Void f(int i10) {
        throw new EOFException("at least " + i10 + " characters required but no bytes available");
    }

    private final Void l0(int i10, int i11) {
        throw new IllegalArgumentException("min should be less or equal to max but min = " + i10 + ", max = " + i11);
    }

    private final int n(int i10, int i11) {
        while (i10 != 0) {
            C16416a t02 = t0(1);
            if (t02 == null) {
                return i11;
            }
            int min = Math.min(t02.k() - t02.i(), i10);
            t02.c(min);
            this.f137976d += min;
            c(t02);
            i10 -= min;
            i11 += min;
        }
        return i11;
    }

    private final long o(long j10, long j11) {
        C16416a t02;
        while (j10 != 0 && (t02 = t0(1)) != null) {
            int min = (int) Math.min((long) (t02.k() - t02.i()), j10);
            t02.c(min);
            this.f137976d += min;
            c(t02);
            long j12 = (long) min;
            j10 -= j12;
            j11 += j12;
        }
        return j11;
    }

    private final Void o0(int i10) {
        throw new IllegalStateException("minSize of " + i10 + " is too big (should be less than 8)");
    }

    private final Void p0(int i10, int i11) {
        throw new C16419d("Premature end of stream: expected at least " + i10 + " chars but had only " + i11);
    }

    private final C16416a s() {
        if (this.f137979g) {
            return null;
        }
        C16416a w10 = w();
        if (w10 == null) {
            this.f137979g = true;
            return null;
        }
        e(w10);
        return w10;
    }

    private final C16416a u(C16416a aVar, C16416a aVar2) {
        while (aVar != aVar2) {
            C16416a y10 = aVar.y();
            aVar.D(this.f137973a);
            if (y10 == null) {
                S0(aVar2);
                R0(0);
                aVar = aVar2;
            } else if (y10.k() > y10.i()) {
                S0(y10);
                R0(this.f137978f - ((long) (y10.k() - y10.i())));
                return y10;
            } else {
                aVar = y10;
            }
        }
        return s();
    }

    public final C16416a A0(int i10) {
        return E0(i10, N());
    }

    public final String I0(int i10, int i11) {
        if (i10 == 0 && (i11 == 0 || J())) {
            return "";
        }
        long i02 = i0();
        if (i02 > 0 && ((long) i11) >= i02) {
            return w.g(this, (int) i02, (Charset) null, 2, (Object) null);
        }
        StringBuilder sb2 = new StringBuilder(C17978n.i(C17978n.e(i10, 16), i11));
        F0(sb2, i10, i11);
        String sb3 = sb2.toString();
        C17542s.i(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }

    public final boolean J() {
        return U() - f0() == 0 && this.f137978f == 0 && (this.f137979g || s() == null);
    }

    public final C16416a N() {
        C16416a aVar = this.f137974b;
        aVar.d(this.f137976d);
        return aVar;
    }

    public final void O0() {
        C16416a N10 = N();
        C16416a a10 = C16416a.f138260j.a();
        if (N10 != a10) {
            S0(a10);
            R0(0);
            C16375h.d(N10, this.f137973a);
        }
    }

    public final C16416a P0(C16416a aVar) {
        C17542s.j(aVar, "head");
        C16416a y10 = aVar.y();
        if (y10 == null) {
            y10 = C16416a.f138260j.a();
        }
        S0(y10);
        R0(this.f137978f - ((long) (y10.k() - y10.i())));
        aVar.D(this.f137973a);
        return y10;
    }

    public final void Q0(int i10) {
        this.f137976d = i10;
    }

    public final void R0(long j10) {
        if (j10 >= 0) {
            this.f137978f = j10;
            return;
        }
        throw new IllegalArgumentException(("tailRemaining shouldn't be negative: " + j10).toString());
    }

    public final C16416a T0() {
        C16416a N10 = N();
        C16416a A10 = N10.A();
        C16416a a10 = C16416a.f138260j.a();
        if (N10 == a10) {
            return null;
        }
        if (A10 == null) {
            S0(a10);
            R0(0);
        } else {
            S0(A10);
            R0(this.f137978f - ((long) (A10.k() - A10.i())));
        }
        N10.F((C16416a) null);
        return N10;
    }

    public final int U() {
        return this.f137977e;
    }

    public final C16416a W0() {
        C16416a N10 = N();
        C16416a a10 = C16416a.f138260j.a();
        if (N10 == a10) {
            return null;
        }
        S0(a10);
        R0(0);
        return N10;
    }

    public final boolean X0(C16416a aVar) {
        C17542s.j(aVar, "chain");
        C16416a c10 = C16375h.c(N());
        int k10 = aVar.k() - aVar.i();
        if (k10 == 0 || c10.g() - c10.k() < k10) {
            return false;
        }
        C16369b.a(c10, aVar, k10);
        if (N() == c10) {
            this.f137977e = c10.k();
            return true;
        }
        R0(this.f137978f + ((long) k10));
        return true;
    }

    public void close() {
        O0();
        if (!this.f137979g) {
            this.f137979g = true;
        }
        h();
    }

    public final void d(C16416a aVar) {
        C17542s.j(aVar, "chain");
        C16416a.d dVar = C16416a.f138260j;
        if (aVar != dVar.a()) {
            long e10 = C16375h.e(aVar);
            if (this.f137974b == dVar.a()) {
                S0(aVar);
                R0(e10 - ((long) (U() - f0())));
                return;
            }
            C16375h.c(this.f137974b).F(aVar);
            R0(this.f137978f + e10);
        }
    }

    public final ByteBuffer e0() {
        return this.f137975c;
    }

    public final int f0() {
        return this.f137976d;
    }

    public final boolean g() {
        return (this.f137976d == this.f137977e && this.f137978f == 0) ? false : true;
    }

    /* access modifiers changed from: protected */
    public abstract void h();

    public final C16492f<C16416a> h0() {
        return this.f137973a;
    }

    public final int i(int i10) {
        if (i10 >= 0) {
            return n(i10, 0);
        }
        throw new IllegalArgumentException(("Negative discard is not allowed: " + i10).toString());
    }

    public final long i0() {
        return ((long) (U() - f0())) + this.f137978f;
    }

    /* access modifiers changed from: protected */
    public final void j0() {
        if (!this.f137979g) {
            this.f137979g = true;
        }
    }

    public final long l(long j10) {
        if (j10 <= 0) {
            return 0;
        }
        return o(j10, 0);
    }

    public final void q(int i10) {
        if (i(i10) != i10) {
            throw new EOFException("Unable to discard " + i10 + " bytes due to end of packet");
        }
    }

    public final C16416a t(C16416a aVar) {
        C17542s.j(aVar, "current");
        return u(aVar, C16416a.f138260j.a());
    }

    public final C16416a t0(int i10) {
        C16416a N10 = N();
        return this.f137977e - this.f137976d >= i10 ? N10 : E0(i10, N10);
    }

    public final C16416a v(C16416a aVar) {
        C17542s.j(aVar, "current");
        return t(aVar);
    }

    /* access modifiers changed from: protected */
    public C16416a w() {
        C16416a Q12 = this.f137973a.Q1();
        try {
            Q12.p(8);
            int x10 = x(Q12.h(), Q12.k(), Q12.g() - Q12.k());
            if (x10 == 0) {
                this.f137979g = true;
                if (Q12.k() <= Q12.i()) {
                    Q12.D(this.f137973a);
                    return null;
                }
            }
            Q12.a(x10);
            return Q12;
        } catch (Throwable th2) {
            Q12.D(this.f137973a);
            throw th2;
        }
    }

    /* access modifiers changed from: protected */
    public abstract int x(ByteBuffer byteBuffer, int i10, int i11);

    public final void z(C16416a aVar) {
        C17542s.j(aVar, "current");
        C16416a A10 = aVar.A();
        if (A10 == null) {
            B(aVar);
            return;
        }
        int k10 = aVar.k() - aVar.i();
        int min = Math.min(k10, 8 - (aVar.f() - aVar.g()));
        if (A10.j() < min) {
            B(aVar);
            return;
        }
        C16371d.f(A10, min);
        if (k10 > min) {
            aVar.m();
            this.f137977e = aVar.k();
            R0(this.f137978f + ((long) min));
            return;
        }
        S0(A10);
        R0(this.f137978f - ((long) ((A10.k() - A10.i()) - min)));
        aVar.y();
        aVar.D(this.f137973a);
    }

    public n(C16416a aVar, long j10, C16492f<C16416a> fVar) {
        C17542s.j(aVar, "head");
        C17542s.j(fVar, "pool");
        this.f137973a = fVar;
        this.f137974b = aVar;
        this.f137975c = aVar.h();
        this.f137976d = aVar.i();
        int k10 = aVar.k();
        this.f137977e = k10;
        this.f137978f = j10 - ((long) (k10 - this.f137976d));
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ n(SH.C16416a r1, long r2, TH.C16492f<SH.C16416a> r4, int r5, kotlin.jvm.internal.DefaultConstructorMarker r6) {
        /*
            r0 = this;
            r6 = r5 & 1
            if (r6 == 0) goto L_0x000a
            SH.a$d r1 = SH.C16416a.f138260j
            SH.a r1 = r1.a()
        L_0x000a:
            r6 = r5 & 2
            if (r6 == 0) goto L_0x0012
            long r2 = RH.C16375h.e(r1)
        L_0x0012:
            r5 = r5 & 4
            if (r5 == 0) goto L_0x001c
            SH.a$d r4 = SH.C16416a.f138260j
            TH.f r4 = r4.c()
        L_0x001c:
            r0.<init>(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: RH.n.<init>(SH.a, long, TH.f, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
