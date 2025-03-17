package L3;

import E3.C6452A;
import E3.L;
import E3.q;
import E3.s;
import E3.t;
import G3.C6479C;
import L3.C6634D;
import L3.C6635E;
import L3.i;
import L3.p;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.exoplayer.C5233j;
import androidx.media3.exoplayer.v0;
import com.sugarcube.decorate_engine.SceneLayout;
import java.nio.ByteBuffer;
import java.util.List;
import kb.C9967v;
import ob.C10102f;
import q3.A;
import q3.C5807s;
import q3.J;
import q3.S;
import t3.C5950a;
import t3.D;
import t3.I;
import t3.N;
import y3.f;
import z3.C6279b;
import z3.C6280c;

/* renamed from: L3.d  reason: case insensitive filesystem */
public class C6639d extends C6452A implements p.b {

    /* renamed from: P1  reason: collision with root package name */
    private static final int[] f38080P1 = {1920, 1600, 1440, SceneLayout.kCurrent3DVersion, 960, 854, 640, 540, 480};

    /* renamed from: Q1  reason: collision with root package name */
    private static boolean f38081Q1;

    /* renamed from: R1  reason: collision with root package name */
    private static boolean f38082R1;

    /* renamed from: A1  reason: collision with root package name */
    private int f38083A1;

    /* renamed from: B1  reason: collision with root package name */
    private int f38084B1;

    /* renamed from: C1  reason: collision with root package name */
    private long f38085C1;

    /* renamed from: D1  reason: collision with root package name */
    private int f38086D1;

    /* renamed from: E1  reason: collision with root package name */
    private long f38087E1;

    /* renamed from: F1  reason: collision with root package name */
    private S f38088F1;

    /* renamed from: G1  reason: collision with root package name */
    private S f38089G1;

    /* renamed from: H1  reason: collision with root package name */
    private int f38090H1;

    /* renamed from: I1  reason: collision with root package name */
    private boolean f38091I1;

    /* renamed from: J1  reason: collision with root package name */
    private int f38092J1;

    /* renamed from: K1  reason: collision with root package name */
    e f38093K1;

    /* renamed from: L1  reason: collision with root package name */
    private o f38094L1;

    /* renamed from: M1  reason: collision with root package name */
    private long f38095M1;

    /* renamed from: N1  reason: collision with root package name */
    private long f38096N1;

    /* renamed from: O1  reason: collision with root package name */
    private boolean f38097O1;

    /* renamed from: f1  reason: collision with root package name */
    private final Context f38098f1;

    /* renamed from: g1  reason: collision with root package name */
    private final boolean f38099g1;

    /* renamed from: h1  reason: collision with root package name */
    private final C6634D.a f38100h1;

    /* renamed from: i1  reason: collision with root package name */
    private final int f38101i1;

    /* renamed from: j1  reason: collision with root package name */
    private final boolean f38102j1;

    /* renamed from: k1  reason: collision with root package name */
    private final p f38103k1;

    /* renamed from: l1  reason: collision with root package name */
    private final p.a f38104l1;

    /* renamed from: m1  reason: collision with root package name */
    private C0601d f38105m1;

    /* renamed from: n1  reason: collision with root package name */
    private boolean f38106n1;

    /* renamed from: o1  reason: collision with root package name */
    private boolean f38107o1;

    /* renamed from: p1  reason: collision with root package name */
    private C6635E f38108p1;

    /* renamed from: q1  reason: collision with root package name */
    private boolean f38109q1;

    /* renamed from: r1  reason: collision with root package name */
    private List<Object> f38110r1;
    /* access modifiers changed from: private */

    /* renamed from: s1  reason: collision with root package name */
    public Surface f38111s1;

    /* renamed from: t1  reason: collision with root package name */
    private C6640e f38112t1;

    /* renamed from: u1  reason: collision with root package name */
    private D f38113u1;

    /* renamed from: v1  reason: collision with root package name */
    private boolean f38114v1;

    /* renamed from: w1  reason: collision with root package name */
    private int f38115w1;

    /* renamed from: x1  reason: collision with root package name */
    private int f38116x1;

    /* renamed from: y1  reason: collision with root package name */
    private long f38117y1;

    /* renamed from: z1  reason: collision with root package name */
    private int f38118z1;

    /* renamed from: L3.d$a */
    class a implements C6635E.a {
        a() {
        }

        public void a(C6635E e10, S s10) {
        }

        public void b(C6635E e10) {
            if (C6639d.this.f38111s1 != null) {
                C6639d.this.b3(0, 1);
            }
        }

        public void c(C6635E e10) {
            if (C6639d.this.f38111s1 != null) {
                C6639d.this.F2();
            }
        }
    }

    /* renamed from: L3.d$b */
    class b implements C6635E.b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ q f38120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f38121b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f38122c;

        b(q qVar, int i10, long j10) {
            this.f38120a = qVar;
            this.f38121b = i10;
            this.f38122c = j10;
        }

        public void a(long j10) {
            C6639d.this.L2(this.f38120a, this.f38121b, this.f38122c, j10);
        }

        public void b() {
            C6639d.this.Y2(this.f38120a, this.f38121b, this.f38122c);
        }
    }

    /* renamed from: L3.d$c */
    private static final class c {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i10 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i10 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: L3.d$d  reason: collision with other inner class name */
    protected static final class C0601d {

        /* renamed from: a  reason: collision with root package name */
        public final int f38124a;

        /* renamed from: b  reason: collision with root package name */
        public final int f38125b;

        /* renamed from: c  reason: collision with root package name */
        public final int f38126c;

        public C0601d(int i10, int i11, int i12) {
            this.f38124a = i10;
            this.f38125b = i11;
            this.f38126c = i12;
        }
    }

    /* renamed from: L3.d$e */
    private final class e implements q.d, Handler.Callback {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f38127a;

        public e(q qVar) {
            Handler B10 = N.B(this);
            this.f38127a = B10;
            qVar.k(this, B10);
        }

        private void b(long j10) {
            C6639d dVar = C6639d.this;
            if (this == dVar.f38093K1 && dVar.O0() != null) {
                if (j10 == Long.MAX_VALUE) {
                    C6639d.this.H2();
                    return;
                }
                try {
                    C6639d.this.G2(j10);
                } catch (C5233j e10) {
                    C6639d.this.M1(e10);
                }
            }
        }

        public void a(q qVar, long j10, long j11) {
            if (N.f29462a < 30) {
                this.f38127a.sendMessageAtFrontOfQueue(Message.obtain(this.f38127a, 0, (int) (j10 >> 32), (int) j10));
                return;
            }
            b(j10);
        }

        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            b(N.n1(message.arg1, message.arg2));
            return true;
        }
    }

    public C6639d(Context context, q.b bVar, E3.D d10, long j10, boolean z10, Handler handler, C6634D d11, int i10) {
        this(context, bVar, d10, j10, z10, handler, d11, i10, 30.0f);
    }

    private void A2() {
        Surface surface = this.f38111s1;
        if (surface != null && this.f38114v1) {
            this.f38100h1.A(surface);
        }
    }

    private void B2() {
        S s10 = this.f38089G1;
        if (s10 != null) {
            this.f38100h1.D(s10);
        }
    }

    private void C2(MediaFormat mediaFormat) {
        if (this.f38108p1 != null && !N.F0(this.f38098f1)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
    }

    private void D2() {
        int i10;
        q O02;
        if (this.f38091I1 && (i10 = N.f29462a) >= 23 && (O02 = O0()) != null) {
            this.f38093K1 = new e(O02);
            if (i10 >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                O02.e(bundle);
            }
        }
    }

    private void E2(long j10, long j11, C5807s sVar) {
        o oVar = this.f38094L1;
        if (oVar != null) {
            oVar.g(j10, j11, sVar, T0());
        }
    }

    /* access modifiers changed from: private */
    public void F2() {
        this.f38100h1.A(this.f38111s1);
        this.f38114v1 = true;
    }

    /* access modifiers changed from: private */
    public void H2() {
        L1();
    }

    private void J2(q qVar, int i10, long j10, C5807s sVar) {
        long g10 = this.f38104l1.g();
        long f10 = this.f38104l1.f();
        if (!V2() || g10 != this.f38087E1) {
            E2(j10, g10, sVar);
            M2(qVar, i10, j10, g10);
        } else {
            Y2(qVar, i10, j10);
        }
        d3(f10);
        this.f38087E1 = g10;
    }

    private void K2() {
        C6640e eVar = this.f38112t1;
        if (eVar != null) {
            eVar.release();
            this.f38112t1 = null;
        }
    }

    /* access modifiers changed from: private */
    public void L2(q qVar, int i10, long j10, long j11) {
        M2(qVar, i10, j10, j11);
    }

    private static void N2(q qVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        qVar.e(bundle);
    }

    private void O2(Object obj) {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f38111s1 != surface) {
            this.f38111s1 = surface;
            if (this.f38108p1 == null) {
                this.f38103k1.q(surface);
            }
            this.f38114v1 = false;
            int state = getState();
            q O02 = O0();
            if (O02 != null && this.f38108p1 == null) {
                t tVar = (t) C5950a.e(Q0());
                boolean s22 = s2(tVar);
                if (N.f29462a < 23 || !s22 || this.f38106n1) {
                    D1();
                    m1();
                } else {
                    P2(O02, r2(tVar));
                }
            }
            if (surface != null) {
                B2();
                if (state == 2) {
                    C6635E e10 = this.f38108p1;
                    if (e10 != null) {
                        e10.B(true);
                    } else {
                        this.f38103k1.e(true);
                    }
                }
            } else {
                this.f38089G1 = null;
                C6635E e11 = this.f38108p1;
                if (e11 != null) {
                    e11.z();
                }
            }
            D2();
        } else if (surface != null) {
            B2();
            A2();
        }
    }

    private void P2(q qVar, Surface surface) {
        int i10 = N.f29462a;
        if (i10 >= 23 && surface != null) {
            Q2(qVar, surface);
        } else if (i10 >= 35) {
            f2(qVar);
        } else {
            throw new IllegalStateException();
        }
    }

    private boolean X2(t tVar) {
        return N.f29462a >= 23 && !this.f38091I1 && !e2(tVar.f34823a) && (!tVar.f34829g || C6640e.b(this.f38098f1));
    }

    private static int Z2(Context context, E3.D d10, C5807s sVar) {
        boolean z10;
        int i10 = 0;
        if (!A.q(sVar.f28244o)) {
            return v0.v(0);
        }
        boolean z11 = sVar.f28248s != null;
        List<t> n22 = n2(context, d10, sVar, z11, false);
        if (z11 && n22.isEmpty()) {
            n22 = n2(context, d10, sVar, false, false);
        }
        if (n22.isEmpty()) {
            return v0.v(1);
        }
        if (!C6452A.U1(sVar)) {
            return v0.v(2);
        }
        t tVar = n22.get(0);
        boolean n10 = tVar.n(sVar);
        if (!n10) {
            int i11 = 1;
            while (true) {
                if (i11 >= n22.size()) {
                    break;
                }
                t tVar2 = n22.get(i11);
                if (tVar2.n(sVar)) {
                    z10 = false;
                    n10 = true;
                    tVar = tVar2;
                    break;
                }
                i11++;
            }
        }
        z10 = true;
        int i12 = n10 ? 4 : 3;
        int i13 = tVar.q(sVar) ? 16 : 8;
        int i14 = tVar.f34830h ? 64 : 0;
        int i15 = z10 ? 128 : 0;
        if (N.f29462a >= 26 && "video/dolby-vision".equals(sVar.f28244o) && !c.a(context)) {
            i15 = 256;
        }
        if (n10) {
            List<t> n23 = n2(context, d10, sVar, z11, true);
            if (!n23.isEmpty()) {
                t tVar3 = L.m(n23, sVar).get(0);
                if (tVar3.n(sVar) && tVar3.q(sVar)) {
                    i10 = 32;
                }
            }
        }
        return v0.r(i12, i13, i10, i14, i15);
    }

    private void a3() {
        q O02 = O0();
        if (O02 != null && N.f29462a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f38090H1));
            O02.e(bundle);
        }
    }

    private void c3(C6479C.b bVar) {
        J d02 = d0();
        if (d02.q()) {
            this.f38096N1 = -9223372036854775807L;
        } else {
            this.f38096N1 = d02.h(((C6479C.b) C5950a.e(bVar)).f35620a, new J.b()).j();
        }
    }

    private static boolean g2() {
        return "NVIDIA".equals(N.f29464c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:410:0x073c, code lost:
        if (r11.equals("A10-70L") == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x08a9, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean i2() {
        /*
            r0 = 26
            r1 = 8
            r2 = 27
            r3 = 7
            r4 = 6
            r5 = 5
            r6 = 4
            r7 = 3
            r8 = 2
            r9 = -1
            r10 = 0
            int r11 = t3.N.f29462a
            r12 = 28
            r13 = 1
            if (r11 > r12) goto L_0x0080
            java.lang.String r14 = t3.N.f29463b
            r14.hashCode()
            int r15 = r14.hashCode()
            switch(r15) {
                case -1339091551: goto L_0x0071;
                case -1220081023: goto L_0x0066;
                case -1220066608: goto L_0x005b;
                case -1012436106: goto L_0x0050;
                case -760312546: goto L_0x0045;
                case -64886864: goto L_0x003a;
                case 3415681: goto L_0x002f;
                case 825323514: goto L_0x0024;
                default: goto L_0x0021;
            }
        L_0x0021:
            r14 = r9
            goto L_0x007b
        L_0x0024:
            java.lang.String r15 = "machuca"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x002d
            goto L_0x0021
        L_0x002d:
            r14 = r3
            goto L_0x007b
        L_0x002f:
            java.lang.String r15 = "once"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0038
            goto L_0x0021
        L_0x0038:
            r14 = r4
            goto L_0x007b
        L_0x003a:
            java.lang.String r15 = "magnolia"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0043
            goto L_0x0021
        L_0x0043:
            r14 = r5
            goto L_0x007b
        L_0x0045:
            java.lang.String r15 = "aquaman"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x004e
            goto L_0x0021
        L_0x004e:
            r14 = r6
            goto L_0x007b
        L_0x0050:
            java.lang.String r15 = "oneday"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0059
            goto L_0x0021
        L_0x0059:
            r14 = r7
            goto L_0x007b
        L_0x005b:
            java.lang.String r15 = "dangalUHD"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x0064
            goto L_0x0021
        L_0x0064:
            r14 = r8
            goto L_0x007b
        L_0x0066:
            java.lang.String r15 = "dangalFHD"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x006f
            goto L_0x0021
        L_0x006f:
            r14 = r13
            goto L_0x007b
        L_0x0071:
            java.lang.String r15 = "dangal"
            boolean r14 = r14.equals(r15)
            if (r14 != 0) goto L_0x007a
            goto L_0x0021
        L_0x007a:
            r14 = r10
        L_0x007b:
            switch(r14) {
                case 0: goto L_0x007f;
                case 1: goto L_0x007f;
                case 2: goto L_0x007f;
                case 3: goto L_0x007f;
                case 4: goto L_0x007f;
                case 5: goto L_0x007f;
                case 6: goto L_0x007f;
                case 7: goto L_0x007f;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x0080
        L_0x007f:
            return r13
        L_0x0080:
            if (r11 > r2) goto L_0x008d
            java.lang.String r14 = "HWEML"
            java.lang.String r15 = t3.N.f29463b
            boolean r14 = r14.equals(r15)
            if (r14 == 0) goto L_0x008d
            return r13
        L_0x008d:
            java.lang.String r14 = t3.N.f29465d
            r14.hashCode()
            int r15 = r14.hashCode()
            switch(r15) {
                case -349662828: goto L_0x00f5;
                case -321033677: goto L_0x00ea;
                case 2006354: goto L_0x00df;
                case 2006367: goto L_0x00d4;
                case 2006371: goto L_0x00c9;
                case 1785421873: goto L_0x00be;
                case 1785421876: goto L_0x00b3;
                case 1798172390: goto L_0x00a8;
                case 2119412532: goto L_0x009c;
                default: goto L_0x0099;
            }
        L_0x0099:
            r15 = r9
            goto L_0x00ff
        L_0x009c:
            java.lang.String r15 = "AFTEUFF014"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00a5
            goto L_0x0099
        L_0x00a5:
            r15 = r1
            goto L_0x00ff
        L_0x00a8:
            java.lang.String r15 = "AFTSO001"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00b1
            goto L_0x0099
        L_0x00b1:
            r15 = r3
            goto L_0x00ff
        L_0x00b3:
            java.lang.String r15 = "AFTEU014"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00bc
            goto L_0x0099
        L_0x00bc:
            r15 = r4
            goto L_0x00ff
        L_0x00be:
            java.lang.String r15 = "AFTEU011"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00c7
            goto L_0x0099
        L_0x00c7:
            r15 = r5
            goto L_0x00ff
        L_0x00c9:
            java.lang.String r15 = "AFTR"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00d2
            goto L_0x0099
        L_0x00d2:
            r15 = r6
            goto L_0x00ff
        L_0x00d4:
            java.lang.String r15 = "AFTN"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00dd
            goto L_0x0099
        L_0x00dd:
            r15 = r7
            goto L_0x00ff
        L_0x00df:
            java.lang.String r15 = "AFTA"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00e8
            goto L_0x0099
        L_0x00e8:
            r15 = r8
            goto L_0x00ff
        L_0x00ea:
            java.lang.String r15 = "AFTKMST12"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00f3
            goto L_0x0099
        L_0x00f3:
            r15 = r13
            goto L_0x00ff
        L_0x00f5:
            java.lang.String r15 = "AFTJMST12"
            boolean r15 = r14.equals(r15)
            if (r15 != 0) goto L_0x00fe
            goto L_0x0099
        L_0x00fe:
            r15 = r10
        L_0x00ff:
            switch(r15) {
                case 0: goto L_0x08ab;
                case 1: goto L_0x08ab;
                case 2: goto L_0x08ab;
                case 3: goto L_0x08ab;
                case 4: goto L_0x08ab;
                case 5: goto L_0x08ab;
                case 6: goto L_0x08ab;
                case 7: goto L_0x08ab;
                case 8: goto L_0x08ab;
                default: goto L_0x0102;
            }
        L_0x0102:
            if (r11 > r0) goto L_0x08aa
            java.lang.String r11 = t3.N.f29463b
            r11.hashCode()
            int r15 = r11.hashCode()
            switch(r15) {
                case -2144781245: goto L_0x088f;
                case -2144781185: goto L_0x0883;
                case -2144781160: goto L_0x0877;
                case -2097309513: goto L_0x086b;
                case -2022874474: goto L_0x085f;
                case -1978993182: goto L_0x0853;
                case -1978990237: goto L_0x0847;
                case -1936688988: goto L_0x083b;
                case -1936688066: goto L_0x082e;
                case -1936688065: goto L_0x0820;
                case -1931988508: goto L_0x0812;
                case -1885099851: goto L_0x0804;
                case -1696512866: goto L_0x07f6;
                case -1680025915: goto L_0x07e8;
                case -1615810839: goto L_0x07da;
                case -1600724499: goto L_0x07cc;
                case -1554255044: goto L_0x07be;
                case -1481772737: goto L_0x07b0;
                case -1481772730: goto L_0x07a2;
                case -1481772729: goto L_0x0794;
                case -1320080169: goto L_0x0786;
                case -1217592143: goto L_0x0778;
                case -1180384755: goto L_0x076a;
                case -1139198265: goto L_0x075c;
                case -1052835013: goto L_0x074e;
                case -993250464: goto L_0x0740;
                case -993250458: goto L_0x0736;
                case -965403638: goto L_0x0729;
                case -958336948: goto L_0x071c;
                case -879245230: goto L_0x070e;
                case -842500323: goto L_0x0700;
                case -821392978: goto L_0x06f2;
                case -797483286: goto L_0x06e4;
                case -794946968: goto L_0x06d6;
                case -788334647: goto L_0x06c8;
                case -782144577: goto L_0x06ba;
                case -575125681: goto L_0x06ac;
                case -521118391: goto L_0x069e;
                case -430914369: goto L_0x0690;
                case -290434366: goto L_0x0682;
                case -282781963: goto L_0x0674;
                case -277133239: goto L_0x0666;
                case -173639913: goto L_0x0658;
                case -56598463: goto L_0x064a;
                case 2126: goto L_0x063c;
                case 2564: goto L_0x062e;
                case 2715: goto L_0x0620;
                case 2719: goto L_0x0612;
                case 3091: goto L_0x0604;
                case 3483: goto L_0x05f6;
                case 73405: goto L_0x05e8;
                case 75537: goto L_0x05da;
                case 75739: goto L_0x05cc;
                case 76779: goto L_0x05be;
                case 78669: goto L_0x05b0;
                case 79305: goto L_0x05a2;
                case 80618: goto L_0x0594;
                case 88274: goto L_0x0586;
                case 98846: goto L_0x0578;
                case 98848: goto L_0x056a;
                case 99329: goto L_0x055c;
                case 101481: goto L_0x054e;
                case 1513190: goto L_0x0540;
                case 1514184: goto L_0x0532;
                case 1514185: goto L_0x0524;
                case 2133089: goto L_0x0516;
                case 2133091: goto L_0x0508;
                case 2133120: goto L_0x04fa;
                case 2133151: goto L_0x04ec;
                case 2133182: goto L_0x04de;
                case 2133184: goto L_0x04d0;
                case 2436959: goto L_0x04c2;
                case 2463773: goto L_0x04b4;
                case 2464648: goto L_0x04a6;
                case 2689555: goto L_0x0498;
                case 3154429: goto L_0x048a;
                case 3284551: goto L_0x047c;
                case 3351335: goto L_0x046e;
                case 3386211: goto L_0x0460;
                case 41325051: goto L_0x0452;
                case 51349633: goto L_0x0444;
                case 51350594: goto L_0x0436;
                case 55178625: goto L_0x0428;
                case 61542055: goto L_0x041a;
                case 65355429: goto L_0x040c;
                case 66214468: goto L_0x03fe;
                case 66214470: goto L_0x03f0;
                case 66214473: goto L_0x03e2;
                case 66215429: goto L_0x03d4;
                case 66215431: goto L_0x03c6;
                case 66215433: goto L_0x03b8;
                case 66216390: goto L_0x03aa;
                case 76402249: goto L_0x039c;
                case 76404105: goto L_0x038e;
                case 76404911: goto L_0x0380;
                case 80963634: goto L_0x0372;
                case 82882791: goto L_0x0364;
                case 98715550: goto L_0x0356;
                case 101370885: goto L_0x0348;
                case 102844228: goto L_0x033a;
                case 165221241: goto L_0x032c;
                case 182191441: goto L_0x031e;
                case 245388979: goto L_0x0310;
                case 287431619: goto L_0x0302;
                case 307593612: goto L_0x02f4;
                case 308517133: goto L_0x02e6;
                case 316215098: goto L_0x02d8;
                case 316215116: goto L_0x02ca;
                case 316246811: goto L_0x02bc;
                case 316246818: goto L_0x02ae;
                case 407160593: goto L_0x02a0;
                case 507412548: goto L_0x0292;
                case 793982701: goto L_0x0284;
                case 794038622: goto L_0x0276;
                case 794040393: goto L_0x0268;
                case 835649806: goto L_0x025a;
                case 917340916: goto L_0x024c;
                case 958008161: goto L_0x023e;
                case 1060579533: goto L_0x0230;
                case 1150207623: goto L_0x0222;
                case 1176899427: goto L_0x0214;
                case 1280332038: goto L_0x0206;
                case 1306947716: goto L_0x01f8;
                case 1349174697: goto L_0x01ea;
                case 1522194893: goto L_0x01dc;
                case 1691543273: goto L_0x01ce;
                case 1691544261: goto L_0x01c0;
                case 1709443163: goto L_0x01b2;
                case 1865889110: goto L_0x01a4;
                case 1906253259: goto L_0x0196;
                case 1977196784: goto L_0x0188;
                case 2006372676: goto L_0x017b;
                case 2019281702: goto L_0x016e;
                case 2029784656: goto L_0x0161;
                case 2030379515: goto L_0x0154;
                case 2033393791: goto L_0x0147;
                case 2047190025: goto L_0x013a;
                case 2047252157: goto L_0x012d;
                case 2048319463: goto L_0x0120;
                case 2048855701: goto L_0x0113;
                default: goto L_0x0110;
            }
        L_0x0110:
            r0 = r9
            goto L_0x089a
        L_0x0113:
            java.lang.String r0 = "HWWAS-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x011c
            goto L_0x0110
        L_0x011c:
            r0 = 139(0x8b, float:1.95E-43)
            goto L_0x089a
        L_0x0120:
            java.lang.String r0 = "HWVNS-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0129
            goto L_0x0110
        L_0x0129:
            r0 = 138(0x8a, float:1.93E-43)
            goto L_0x089a
        L_0x012d:
            java.lang.String r0 = "ELUGA_Prim"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0136
            goto L_0x0110
        L_0x0136:
            r0 = 137(0x89, float:1.92E-43)
            goto L_0x089a
        L_0x013a:
            java.lang.String r0 = "ELUGA_Note"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0143
            goto L_0x0110
        L_0x0143:
            r0 = 136(0x88, float:1.9E-43)
            goto L_0x089a
        L_0x0147:
            java.lang.String r0 = "ASUS_X00AD_2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0150
            goto L_0x0110
        L_0x0150:
            r0 = 135(0x87, float:1.89E-43)
            goto L_0x089a
        L_0x0154:
            java.lang.String r0 = "HWCAM-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x015d
            goto L_0x0110
        L_0x015d:
            r0 = 134(0x86, float:1.88E-43)
            goto L_0x089a
        L_0x0161:
            java.lang.String r0 = "HWBLN-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x016a
            goto L_0x0110
        L_0x016a:
            r0 = 133(0x85, float:1.86E-43)
            goto L_0x089a
        L_0x016e:
            java.lang.String r0 = "DM-01K"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0177
            goto L_0x0110
        L_0x0177:
            r0 = 132(0x84, float:1.85E-43)
            goto L_0x089a
        L_0x017b:
            java.lang.String r0 = "BRAVIA_ATV3_4K"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0184
            goto L_0x0110
        L_0x0184:
            r0 = 131(0x83, float:1.84E-43)
            goto L_0x089a
        L_0x0188:
            java.lang.String r0 = "Infinix-X572"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0192
            goto L_0x0110
        L_0x0192:
            r0 = 130(0x82, float:1.82E-43)
            goto L_0x089a
        L_0x0196:
            java.lang.String r0 = "PB2-670M"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01a0
            goto L_0x0110
        L_0x01a0:
            r0 = 129(0x81, float:1.81E-43)
            goto L_0x089a
        L_0x01a4:
            java.lang.String r0 = "santoni"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01ae
            goto L_0x0110
        L_0x01ae:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x089a
        L_0x01b2:
            java.lang.String r0 = "iball8735_9806"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01bc
            goto L_0x0110
        L_0x01bc:
            r0 = 127(0x7f, float:1.78E-43)
            goto L_0x089a
        L_0x01c0:
            java.lang.String r0 = "CPH1715"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01ca
            goto L_0x0110
        L_0x01ca:
            r0 = 126(0x7e, float:1.77E-43)
            goto L_0x089a
        L_0x01ce:
            java.lang.String r0 = "CPH1609"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01d8
            goto L_0x0110
        L_0x01d8:
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x089a
        L_0x01dc:
            java.lang.String r0 = "woods_f"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01e6
            goto L_0x0110
        L_0x01e6:
            r0 = 124(0x7c, float:1.74E-43)
            goto L_0x089a
        L_0x01ea:
            java.lang.String r0 = "htc_e56ml_dtul"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x01f4
            goto L_0x0110
        L_0x01f4:
            r0 = 123(0x7b, float:1.72E-43)
            goto L_0x089a
        L_0x01f8:
            java.lang.String r0 = "EverStar_S"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0202
            goto L_0x0110
        L_0x0202:
            r0 = 122(0x7a, float:1.71E-43)
            goto L_0x089a
        L_0x0206:
            java.lang.String r0 = "hwALE-H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0210
            goto L_0x0110
        L_0x0210:
            r0 = 121(0x79, float:1.7E-43)
            goto L_0x089a
        L_0x0214:
            java.lang.String r0 = "itel_S41"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x021e
            goto L_0x0110
        L_0x021e:
            r0 = 120(0x78, float:1.68E-43)
            goto L_0x089a
        L_0x0222:
            java.lang.String r0 = "LS-5017"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x022c
            goto L_0x0110
        L_0x022c:
            r0 = 119(0x77, float:1.67E-43)
            goto L_0x089a
        L_0x0230:
            java.lang.String r0 = "panell_d"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x023a
            goto L_0x0110
        L_0x023a:
            r0 = 118(0x76, float:1.65E-43)
            goto L_0x089a
        L_0x023e:
            java.lang.String r0 = "j2xlteins"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0248
            goto L_0x0110
        L_0x0248:
            r0 = 117(0x75, float:1.64E-43)
            goto L_0x089a
        L_0x024c:
            java.lang.String r0 = "A7000plus"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0256
            goto L_0x0110
        L_0x0256:
            r0 = 116(0x74, float:1.63E-43)
            goto L_0x089a
        L_0x025a:
            java.lang.String r0 = "manning"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0264
            goto L_0x0110
        L_0x0264:
            r0 = 115(0x73, float:1.61E-43)
            goto L_0x089a
        L_0x0268:
            java.lang.String r0 = "GIONEE_WBL7519"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0272
            goto L_0x0110
        L_0x0272:
            r0 = 114(0x72, float:1.6E-43)
            goto L_0x089a
        L_0x0276:
            java.lang.String r0 = "GIONEE_WBL7365"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0280
            goto L_0x0110
        L_0x0280:
            r0 = 113(0x71, float:1.58E-43)
            goto L_0x089a
        L_0x0284:
            java.lang.String r0 = "GIONEE_WBL5708"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x028e
            goto L_0x0110
        L_0x028e:
            r0 = 112(0x70, float:1.57E-43)
            goto L_0x089a
        L_0x0292:
            java.lang.String r0 = "QM16XE_U"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x029c
            goto L_0x0110
        L_0x029c:
            r0 = 111(0x6f, float:1.56E-43)
            goto L_0x089a
        L_0x02a0:
            java.lang.String r0 = "Pixi5-10_4G"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02aa
            goto L_0x0110
        L_0x02aa:
            r0 = 110(0x6e, float:1.54E-43)
            goto L_0x089a
        L_0x02ae:
            java.lang.String r0 = "TB3-850M"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02b8
            goto L_0x0110
        L_0x02b8:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x089a
        L_0x02bc:
            java.lang.String r0 = "TB3-850F"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02c6
            goto L_0x0110
        L_0x02c6:
            r0 = 108(0x6c, float:1.51E-43)
            goto L_0x089a
        L_0x02ca:
            java.lang.String r0 = "TB3-730X"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02d4
            goto L_0x0110
        L_0x02d4:
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x089a
        L_0x02d8:
            java.lang.String r0 = "TB3-730F"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02e2
            goto L_0x0110
        L_0x02e2:
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x089a
        L_0x02e6:
            java.lang.String r0 = "A7020a48"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02f0
            goto L_0x0110
        L_0x02f0:
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x089a
        L_0x02f4:
            java.lang.String r0 = "A7010a48"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x02fe
            goto L_0x0110
        L_0x02fe:
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x089a
        L_0x0302:
            java.lang.String r0 = "griffin"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x030c
            goto L_0x0110
        L_0x030c:
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x089a
        L_0x0310:
            java.lang.String r0 = "marino_f"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x031a
            goto L_0x0110
        L_0x031a:
            r0 = 102(0x66, float:1.43E-43)
            goto L_0x089a
        L_0x031e:
            java.lang.String r0 = "CPY83_I00"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0328
            goto L_0x0110
        L_0x0328:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x089a
        L_0x032c:
            java.lang.String r0 = "A2016a40"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0336
            goto L_0x0110
        L_0x0336:
            r0 = 100
            goto L_0x089a
        L_0x033a:
            java.lang.String r0 = "le_x6"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0344
            goto L_0x0110
        L_0x0344:
            r0 = 99
            goto L_0x089a
        L_0x0348:
            java.lang.String r0 = "l5460"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0352
            goto L_0x0110
        L_0x0352:
            r0 = 98
            goto L_0x089a
        L_0x0356:
            java.lang.String r0 = "i9031"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0360
            goto L_0x0110
        L_0x0360:
            r0 = 97
            goto L_0x089a
        L_0x0364:
            java.lang.String r0 = "X3_HK"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x036e
            goto L_0x0110
        L_0x036e:
            r0 = 96
            goto L_0x089a
        L_0x0372:
            java.lang.String r0 = "V23GB"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x037c
            goto L_0x0110
        L_0x037c:
            r0 = 95
            goto L_0x089a
        L_0x0380:
            java.lang.String r0 = "Q4310"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x038a
            goto L_0x0110
        L_0x038a:
            r0 = 94
            goto L_0x089a
        L_0x038e:
            java.lang.String r0 = "Q4260"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0398
            goto L_0x0110
        L_0x0398:
            r0 = 93
            goto L_0x089a
        L_0x039c:
            java.lang.String r0 = "PRO7S"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03a6
            goto L_0x0110
        L_0x03a6:
            r0 = 92
            goto L_0x089a
        L_0x03aa:
            java.lang.String r0 = "F3311"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03b4
            goto L_0x0110
        L_0x03b4:
            r0 = 91
            goto L_0x089a
        L_0x03b8:
            java.lang.String r0 = "F3215"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03c2
            goto L_0x0110
        L_0x03c2:
            r0 = 90
            goto L_0x089a
        L_0x03c6:
            java.lang.String r0 = "F3213"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03d0
            goto L_0x0110
        L_0x03d0:
            r0 = 89
            goto L_0x089a
        L_0x03d4:
            java.lang.String r0 = "F3211"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03de
            goto L_0x0110
        L_0x03de:
            r0 = 88
            goto L_0x089a
        L_0x03e2:
            java.lang.String r0 = "F3116"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03ec
            goto L_0x0110
        L_0x03ec:
            r0 = 87
            goto L_0x089a
        L_0x03f0:
            java.lang.String r0 = "F3113"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x03fa
            goto L_0x0110
        L_0x03fa:
            r0 = 86
            goto L_0x089a
        L_0x03fe:
            java.lang.String r0 = "F3111"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0408
            goto L_0x0110
        L_0x0408:
            r0 = 85
            goto L_0x089a
        L_0x040c:
            java.lang.String r0 = "E5643"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0416
            goto L_0x0110
        L_0x0416:
            r0 = 84
            goto L_0x089a
        L_0x041a:
            java.lang.String r0 = "A1601"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0424
            goto L_0x0110
        L_0x0424:
            r0 = 83
            goto L_0x089a
        L_0x0428:
            java.lang.String r0 = "Aura_Note_2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0432
            goto L_0x0110
        L_0x0432:
            r0 = 82
            goto L_0x089a
        L_0x0436:
            java.lang.String r0 = "602LV"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0440
            goto L_0x0110
        L_0x0440:
            r0 = 81
            goto L_0x089a
        L_0x0444:
            java.lang.String r0 = "601LV"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x044e
            goto L_0x0110
        L_0x044e:
            r0 = 80
            goto L_0x089a
        L_0x0452:
            java.lang.String r0 = "MEIZU_M5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x045c
            goto L_0x0110
        L_0x045c:
            r0 = 79
            goto L_0x089a
        L_0x0460:
            java.lang.String r0 = "p212"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x046a
            goto L_0x0110
        L_0x046a:
            r0 = 78
            goto L_0x089a
        L_0x046e:
            java.lang.String r0 = "mido"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0478
            goto L_0x0110
        L_0x0478:
            r0 = 77
            goto L_0x089a
        L_0x047c:
            java.lang.String r0 = "kate"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0486
            goto L_0x0110
        L_0x0486:
            r0 = 76
            goto L_0x089a
        L_0x048a:
            java.lang.String r0 = "fugu"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0494
            goto L_0x0110
        L_0x0494:
            r0 = 75
            goto L_0x089a
        L_0x0498:
            java.lang.String r0 = "XE2X"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04a2
            goto L_0x0110
        L_0x04a2:
            r0 = 74
            goto L_0x089a
        L_0x04a6:
            java.lang.String r0 = "Q427"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04b0
            goto L_0x0110
        L_0x04b0:
            r0 = 73
            goto L_0x089a
        L_0x04b4:
            java.lang.String r0 = "Q350"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04be
            goto L_0x0110
        L_0x04be:
            r0 = 72
            goto L_0x089a
        L_0x04c2:
            java.lang.String r0 = "P681"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04cc
            goto L_0x0110
        L_0x04cc:
            r0 = 71
            goto L_0x089a
        L_0x04d0:
            java.lang.String r0 = "F04J"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04da
            goto L_0x0110
        L_0x04da:
            r0 = 70
            goto L_0x089a
        L_0x04de:
            java.lang.String r0 = "F04H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04e8
            goto L_0x0110
        L_0x04e8:
            r0 = 69
            goto L_0x089a
        L_0x04ec:
            java.lang.String r0 = "F03H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x04f6
            goto L_0x0110
        L_0x04f6:
            r0 = 68
            goto L_0x089a
        L_0x04fa:
            java.lang.String r0 = "F02H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0504
            goto L_0x0110
        L_0x0504:
            r0 = 67
            goto L_0x089a
        L_0x0508:
            java.lang.String r0 = "F01J"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0512
            goto L_0x0110
        L_0x0512:
            r0 = 66
            goto L_0x089a
        L_0x0516:
            java.lang.String r0 = "F01H"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0520
            goto L_0x0110
        L_0x0520:
            r0 = 65
            goto L_0x089a
        L_0x0524:
            java.lang.String r0 = "1714"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x052e
            goto L_0x0110
        L_0x052e:
            r0 = 64
            goto L_0x089a
        L_0x0532:
            java.lang.String r0 = "1713"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x053c
            goto L_0x0110
        L_0x053c:
            r0 = 63
            goto L_0x089a
        L_0x0540:
            java.lang.String r0 = "1601"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x054a
            goto L_0x0110
        L_0x054a:
            r0 = 62
            goto L_0x089a
        L_0x054e:
            java.lang.String r0 = "flo"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0558
            goto L_0x0110
        L_0x0558:
            r0 = 61
            goto L_0x089a
        L_0x055c:
            java.lang.String r0 = "deb"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0566
            goto L_0x0110
        L_0x0566:
            r0 = 60
            goto L_0x089a
        L_0x056a:
            java.lang.String r0 = "cv3"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0574
            goto L_0x0110
        L_0x0574:
            r0 = 59
            goto L_0x089a
        L_0x0578:
            java.lang.String r0 = "cv1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0582
            goto L_0x0110
        L_0x0582:
            r0 = 58
            goto L_0x089a
        L_0x0586:
            java.lang.String r0 = "Z80"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0590
            goto L_0x0110
        L_0x0590:
            r0 = 57
            goto L_0x089a
        L_0x0594:
            java.lang.String r0 = "QX1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x059e
            goto L_0x0110
        L_0x059e:
            r0 = 56
            goto L_0x089a
        L_0x05a2:
            java.lang.String r0 = "PLE"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05ac
            goto L_0x0110
        L_0x05ac:
            r0 = 55
            goto L_0x089a
        L_0x05b0:
            java.lang.String r0 = "P85"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05ba
            goto L_0x0110
        L_0x05ba:
            r0 = 54
            goto L_0x089a
        L_0x05be:
            java.lang.String r0 = "MX6"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05c8
            goto L_0x0110
        L_0x05c8:
            r0 = 53
            goto L_0x089a
        L_0x05cc:
            java.lang.String r0 = "M5c"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05d6
            goto L_0x0110
        L_0x05d6:
            r0 = 52
            goto L_0x089a
        L_0x05da:
            java.lang.String r0 = "M04"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05e4
            goto L_0x0110
        L_0x05e4:
            r0 = 51
            goto L_0x089a
        L_0x05e8:
            java.lang.String r0 = "JGZ"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x05f2
            goto L_0x0110
        L_0x05f2:
            r0 = 50
            goto L_0x089a
        L_0x05f6:
            java.lang.String r0 = "mh"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0600
            goto L_0x0110
        L_0x0600:
            r0 = 49
            goto L_0x089a
        L_0x0604:
            java.lang.String r0 = "b5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x060e
            goto L_0x0110
        L_0x060e:
            r0 = 48
            goto L_0x089a
        L_0x0612:
            java.lang.String r0 = "V5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x061c
            goto L_0x0110
        L_0x061c:
            r0 = 47
            goto L_0x089a
        L_0x0620:
            java.lang.String r0 = "V1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x062a
            goto L_0x0110
        L_0x062a:
            r0 = 46
            goto L_0x089a
        L_0x062e:
            java.lang.String r0 = "Q5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0638
            goto L_0x0110
        L_0x0638:
            r0 = 45
            goto L_0x089a
        L_0x063c:
            java.lang.String r0 = "C1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0646
            goto L_0x0110
        L_0x0646:
            r0 = 44
            goto L_0x089a
        L_0x064a:
            java.lang.String r0 = "woods_fn"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0654
            goto L_0x0110
        L_0x0654:
            r0 = 43
            goto L_0x089a
        L_0x0658:
            java.lang.String r0 = "ELUGA_A3_Pro"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0662
            goto L_0x0110
        L_0x0662:
            r0 = 42
            goto L_0x089a
        L_0x0666:
            java.lang.String r0 = "Z12_PRO"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0670
            goto L_0x0110
        L_0x0670:
            r0 = 41
            goto L_0x089a
        L_0x0674:
            java.lang.String r0 = "BLACK-1X"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x067e
            goto L_0x0110
        L_0x067e:
            r0 = 40
            goto L_0x089a
        L_0x0682:
            java.lang.String r0 = "taido_row"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x068c
            goto L_0x0110
        L_0x068c:
            r0 = 39
            goto L_0x089a
        L_0x0690:
            java.lang.String r0 = "Pixi4-7_3G"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x069a
            goto L_0x0110
        L_0x069a:
            r0 = 38
            goto L_0x089a
        L_0x069e:
            java.lang.String r0 = "GIONEE_GBL7360"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06a8
            goto L_0x0110
        L_0x06a8:
            r0 = 37
            goto L_0x089a
        L_0x06ac:
            java.lang.String r0 = "GiONEE_CBL7513"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06b6
            goto L_0x0110
        L_0x06b6:
            r0 = 36
            goto L_0x089a
        L_0x06ba:
            java.lang.String r0 = "OnePlus5T"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06c4
            goto L_0x0110
        L_0x06c4:
            r0 = 35
            goto L_0x089a
        L_0x06c8:
            java.lang.String r0 = "whyred"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06d2
            goto L_0x0110
        L_0x06d2:
            r0 = 34
            goto L_0x089a
        L_0x06d6:
            java.lang.String r0 = "watson"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06e0
            goto L_0x0110
        L_0x06e0:
            r0 = 33
            goto L_0x089a
        L_0x06e4:
            java.lang.String r0 = "SVP-DTV15"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06ee
            goto L_0x0110
        L_0x06ee:
            r0 = 32
            goto L_0x089a
        L_0x06f2:
            java.lang.String r0 = "A7000-a"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x06fc
            goto L_0x0110
        L_0x06fc:
            r0 = 31
            goto L_0x089a
        L_0x0700:
            java.lang.String r0 = "nicklaus_f"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x070a
            goto L_0x0110
        L_0x070a:
            r0 = 30
            goto L_0x089a
        L_0x070e:
            java.lang.String r0 = "tcl_eu"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0718
            goto L_0x0110
        L_0x0718:
            r0 = 29
            goto L_0x089a
        L_0x071c:
            java.lang.String r0 = "ELUGA_Ray_X"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0726
            goto L_0x0110
        L_0x0726:
            r0 = r12
            goto L_0x089a
        L_0x0729:
            java.lang.String r0 = "s905x018"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0733
            goto L_0x0110
        L_0x0733:
            r0 = r2
            goto L_0x089a
        L_0x0736:
            java.lang.String r1 = "A10-70L"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x089a
            goto L_0x0110
        L_0x0740:
            java.lang.String r0 = "A10-70F"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x074a
            goto L_0x0110
        L_0x074a:
            r0 = 25
            goto L_0x089a
        L_0x074e:
            java.lang.String r0 = "namath"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0758
            goto L_0x0110
        L_0x0758:
            r0 = 24
            goto L_0x089a
        L_0x075c:
            java.lang.String r0 = "Slate_Pro"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0766
            goto L_0x0110
        L_0x0766:
            r0 = 23
            goto L_0x089a
        L_0x076a:
            java.lang.String r0 = "iris60"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0774
            goto L_0x0110
        L_0x0774:
            r0 = 22
            goto L_0x089a
        L_0x0778:
            java.lang.String r0 = "BRAVIA_ATV2"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0782
            goto L_0x0110
        L_0x0782:
            r0 = 21
            goto L_0x089a
        L_0x0786:
            java.lang.String r0 = "GiONEE_GBL7319"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0790
            goto L_0x0110
        L_0x0790:
            r0 = 20
            goto L_0x089a
        L_0x0794:
            java.lang.String r0 = "panell_dt"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x079e
            goto L_0x0110
        L_0x079e:
            r0 = 19
            goto L_0x089a
        L_0x07a2:
            java.lang.String r0 = "panell_ds"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07ac
            goto L_0x0110
        L_0x07ac:
            r0 = 18
            goto L_0x089a
        L_0x07b0:
            java.lang.String r0 = "panell_dl"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07ba
            goto L_0x0110
        L_0x07ba:
            r0 = 17
            goto L_0x089a
        L_0x07be:
            java.lang.String r0 = "vernee_M5"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07c8
            goto L_0x0110
        L_0x07c8:
            r0 = 16
            goto L_0x089a
        L_0x07cc:
            java.lang.String r0 = "pacificrim"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07d6
            goto L_0x0110
        L_0x07d6:
            r0 = 15
            goto L_0x089a
        L_0x07da:
            java.lang.String r0 = "Phantom6"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07e4
            goto L_0x0110
        L_0x07e4:
            r0 = 14
            goto L_0x089a
        L_0x07e8:
            java.lang.String r0 = "ComioS1"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x07f2
            goto L_0x0110
        L_0x07f2:
            r0 = 13
            goto L_0x089a
        L_0x07f6:
            java.lang.String r0 = "XT1663"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0800
            goto L_0x0110
        L_0x0800:
            r0 = 12
            goto L_0x089a
        L_0x0804:
            java.lang.String r0 = "RAIJIN"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x080e
            goto L_0x0110
        L_0x080e:
            r0 = 11
            goto L_0x089a
        L_0x0812:
            java.lang.String r0 = "AquaPowerM"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x081c
            goto L_0x0110
        L_0x081c:
            r0 = 10
            goto L_0x089a
        L_0x0820:
            java.lang.String r0 = "PGN611"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x082a
            goto L_0x0110
        L_0x082a:
            r0 = 9
            goto L_0x089a
        L_0x082e:
            java.lang.String r0 = "PGN610"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0838
            goto L_0x0110
        L_0x0838:
            r0 = r1
            goto L_0x089a
        L_0x083b:
            java.lang.String r0 = "PGN528"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0845
            goto L_0x0110
        L_0x0845:
            r0 = r3
            goto L_0x089a
        L_0x0847:
            java.lang.String r0 = "NX573J"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0851
            goto L_0x0110
        L_0x0851:
            r0 = r4
            goto L_0x089a
        L_0x0853:
            java.lang.String r0 = "NX541J"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x085d
            goto L_0x0110
        L_0x085d:
            r0 = r5
            goto L_0x089a
        L_0x085f:
            java.lang.String r0 = "CP8676_I02"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0869
            goto L_0x0110
        L_0x0869:
            r0 = r6
            goto L_0x089a
        L_0x086b:
            java.lang.String r0 = "K50a40"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0875
            goto L_0x0110
        L_0x0875:
            r0 = r7
            goto L_0x089a
        L_0x0877:
            java.lang.String r0 = "GIONEE_SWW1631"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0881
            goto L_0x0110
        L_0x0881:
            r0 = r8
            goto L_0x089a
        L_0x0883:
            java.lang.String r0 = "GIONEE_SWW1627"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x088d
            goto L_0x0110
        L_0x088d:
            r0 = r13
            goto L_0x089a
        L_0x088f:
            java.lang.String r0 = "GIONEE_SWW1609"
            boolean r0 = r11.equals(r0)
            if (r0 != 0) goto L_0x0899
            goto L_0x0110
        L_0x0899:
            r0 = r10
        L_0x089a:
            switch(r0) {
                case 0: goto L_0x08a9;
                case 1: goto L_0x08a9;
                case 2: goto L_0x08a9;
                case 3: goto L_0x08a9;
                case 4: goto L_0x08a9;
                case 5: goto L_0x08a9;
                case 6: goto L_0x08a9;
                case 7: goto L_0x08a9;
                case 8: goto L_0x08a9;
                case 9: goto L_0x08a9;
                case 10: goto L_0x08a9;
                case 11: goto L_0x08a9;
                case 12: goto L_0x08a9;
                case 13: goto L_0x08a9;
                case 14: goto L_0x08a9;
                case 15: goto L_0x08a9;
                case 16: goto L_0x08a9;
                case 17: goto L_0x08a9;
                case 18: goto L_0x08a9;
                case 19: goto L_0x08a9;
                case 20: goto L_0x08a9;
                case 21: goto L_0x08a9;
                case 22: goto L_0x08a9;
                case 23: goto L_0x08a9;
                case 24: goto L_0x08a9;
                case 25: goto L_0x08a9;
                case 26: goto L_0x08a9;
                case 27: goto L_0x08a9;
                case 28: goto L_0x08a9;
                case 29: goto L_0x08a9;
                case 30: goto L_0x08a9;
                case 31: goto L_0x08a9;
                case 32: goto L_0x08a9;
                case 33: goto L_0x08a9;
                case 34: goto L_0x08a9;
                case 35: goto L_0x08a9;
                case 36: goto L_0x08a9;
                case 37: goto L_0x08a9;
                case 38: goto L_0x08a9;
                case 39: goto L_0x08a9;
                case 40: goto L_0x08a9;
                case 41: goto L_0x08a9;
                case 42: goto L_0x08a9;
                case 43: goto L_0x08a9;
                case 44: goto L_0x08a9;
                case 45: goto L_0x08a9;
                case 46: goto L_0x08a9;
                case 47: goto L_0x08a9;
                case 48: goto L_0x08a9;
                case 49: goto L_0x08a9;
                case 50: goto L_0x08a9;
                case 51: goto L_0x08a9;
                case 52: goto L_0x08a9;
                case 53: goto L_0x08a9;
                case 54: goto L_0x08a9;
                case 55: goto L_0x08a9;
                case 56: goto L_0x08a9;
                case 57: goto L_0x08a9;
                case 58: goto L_0x08a9;
                case 59: goto L_0x08a9;
                case 60: goto L_0x08a9;
                case 61: goto L_0x08a9;
                case 62: goto L_0x08a9;
                case 63: goto L_0x08a9;
                case 64: goto L_0x08a9;
                case 65: goto L_0x08a9;
                case 66: goto L_0x08a9;
                case 67: goto L_0x08a9;
                case 68: goto L_0x08a9;
                case 69: goto L_0x08a9;
                case 70: goto L_0x08a9;
                case 71: goto L_0x08a9;
                case 72: goto L_0x08a9;
                case 73: goto L_0x08a9;
                case 74: goto L_0x08a9;
                case 75: goto L_0x08a9;
                case 76: goto L_0x08a9;
                case 77: goto L_0x08a9;
                case 78: goto L_0x08a9;
                case 79: goto L_0x08a9;
                case 80: goto L_0x08a9;
                case 81: goto L_0x08a9;
                case 82: goto L_0x08a9;
                case 83: goto L_0x08a9;
                case 84: goto L_0x08a9;
                case 85: goto L_0x08a9;
                case 86: goto L_0x08a9;
                case 87: goto L_0x08a9;
                case 88: goto L_0x08a9;
                case 89: goto L_0x08a9;
                case 90: goto L_0x08a9;
                case 91: goto L_0x08a9;
                case 92: goto L_0x08a9;
                case 93: goto L_0x08a9;
                case 94: goto L_0x08a9;
                case 95: goto L_0x08a9;
                case 96: goto L_0x08a9;
                case 97: goto L_0x08a9;
                case 98: goto L_0x08a9;
                case 99: goto L_0x08a9;
                case 100: goto L_0x08a9;
                case 101: goto L_0x08a9;
                case 102: goto L_0x08a9;
                case 103: goto L_0x08a9;
                case 104: goto L_0x08a9;
                case 105: goto L_0x08a9;
                case 106: goto L_0x08a9;
                case 107: goto L_0x08a9;
                case 108: goto L_0x08a9;
                case 109: goto L_0x08a9;
                case 110: goto L_0x08a9;
                case 111: goto L_0x08a9;
                case 112: goto L_0x08a9;
                case 113: goto L_0x08a9;
                case 114: goto L_0x08a9;
                case 115: goto L_0x08a9;
                case 116: goto L_0x08a9;
                case 117: goto L_0x08a9;
                case 118: goto L_0x08a9;
                case 119: goto L_0x08a9;
                case 120: goto L_0x08a9;
                case 121: goto L_0x08a9;
                case 122: goto L_0x08a9;
                case 123: goto L_0x08a9;
                case 124: goto L_0x08a9;
                case 125: goto L_0x08a9;
                case 126: goto L_0x08a9;
                case 127: goto L_0x08a9;
                case 128: goto L_0x08a9;
                case 129: goto L_0x08a9;
                case 130: goto L_0x08a9;
                case 131: goto L_0x08a9;
                case 132: goto L_0x08a9;
                case 133: goto L_0x08a9;
                case 134: goto L_0x08a9;
                case 135: goto L_0x08a9;
                case 136: goto L_0x08a9;
                case 137: goto L_0x08a9;
                case 138: goto L_0x08a9;
                case 139: goto L_0x08a9;
                default: goto L_0x089d;
            }
        L_0x089d:
            r14.hashCode()
            java.lang.String r0 = "JSN-L21"
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x08a9
            goto L_0x08aa
        L_0x08a9:
            return r13
        L_0x08aa:
            return r10
        L_0x08ab:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.C6639d.i2():boolean");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r8.equals("video/av01") == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0028, code lost:
        r11 = ((java.lang.Integer) r11.first).intValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int k2(E3.t r10, q3.C5807s r11) {
        /*
            r0 = 4
            java.lang.String r1 = "video/hevc"
            java.lang.String r2 = "video/avc"
            r3 = 1
            r4 = 2
            int r5 = r11.f28251v
            int r6 = r11.f28252w
            r7 = -1
            if (r5 == r7) goto L_0x00e5
            if (r6 != r7) goto L_0x0012
            goto L_0x00e5
        L_0x0012:
            java.lang.String r8 = r11.f28244o
            java.lang.Object r8 = t3.C5950a.e(r8)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.String r9 = "video/dolby-vision"
            boolean r9 = r9.equals(r8)
            if (r9 == 0) goto L_0x003b
            android.util.Pair r11 = E3.L.h(r11)
            if (r11 == 0) goto L_0x003a
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r8 = 512(0x200, float:7.175E-43)
            if (r11 == r8) goto L_0x0038
            if (r11 == r3) goto L_0x0038
            if (r11 != r4) goto L_0x003a
        L_0x0038:
            r8 = r2
            goto L_0x003b
        L_0x003a:
            r8 = r1
        L_0x003b:
            r8.hashCode()
            int r11 = r8.hashCode()
            switch(r11) {
                case -1664118616: goto L_0x0083;
                case -1662735862: goto L_0x007a;
                case -1662541442: goto L_0x0071;
                case 1187890754: goto L_0x0066;
                case 1331836730: goto L_0x005d;
                case 1599127256: goto L_0x0052;
                case 1599127257: goto L_0x0047;
                default: goto L_0x0045;
            }
        L_0x0045:
            r3 = r7
            goto L_0x008d
        L_0x0047:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x0050
            goto L_0x0045
        L_0x0050:
            r3 = 6
            goto L_0x008d
        L_0x0052:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x005b
            goto L_0x0045
        L_0x005b:
            r3 = 5
            goto L_0x008d
        L_0x005d:
            boolean r11 = r8.equals(r2)
            if (r11 != 0) goto L_0x0064
            goto L_0x0045
        L_0x0064:
            r3 = r0
            goto L_0x008d
        L_0x0066:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x006f
            goto L_0x0045
        L_0x006f:
            r3 = 3
            goto L_0x008d
        L_0x0071:
            boolean r11 = r8.equals(r1)
            if (r11 != 0) goto L_0x0078
            goto L_0x0045
        L_0x0078:
            r3 = r4
            goto L_0x008d
        L_0x007a:
            java.lang.String r11 = "video/av01"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x008d
            goto L_0x0045
        L_0x0083:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r8.equals(r11)
            if (r11 != 0) goto L_0x008c
            goto L_0x0045
        L_0x008c:
            r3 = 0
        L_0x008d:
            switch(r3) {
                case 0: goto L_0x00df;
                case 1: goto L_0x00df;
                case 2: goto L_0x00d3;
                case 3: goto L_0x00df;
                case 4: goto L_0x0097;
                case 5: goto L_0x00df;
                case 6: goto L_0x0091;
                default: goto L_0x0090;
            }
        L_0x0090:
            return r7
        L_0x0091:
            int r5 = r5 * r6
            int r10 = p2(r5, r0)
            return r10
        L_0x0097:
            java.lang.String r11 = t3.N.f29465d
            java.lang.String r0 = "BRAVIA 4K 2015"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "Amazon"
            java.lang.String r1 = t3.N.f29464c
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "KFSOWI"
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x00d2
            java.lang.String r0 = "AFTS"
            boolean r11 = r0.equals(r11)
            if (r11 == 0) goto L_0x00c0
            boolean r10 = r10.f34829g
            if (r10 == 0) goto L_0x00c0
            goto L_0x00d2
        L_0x00c0:
            r10 = 16
            int r11 = t3.N.k(r5, r10)
            int r10 = t3.N.k(r6, r10)
            int r11 = r11 * r10
            int r11 = r11 * 256
            int r10 = p2(r11, r4)
            return r10
        L_0x00d2:
            return r7
        L_0x00d3:
            int r5 = r5 * r6
            int r10 = p2(r5, r4)
            r11 = 2097152(0x200000, float:2.938736E-39)
            int r10 = java.lang.Math.max(r11, r10)
            return r10
        L_0x00df:
            int r5 = r5 * r6
            int r10 = p2(r5, r4)
            return r10
        L_0x00e5:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.C6639d.k2(E3.t, q3.s):int");
    }

    private static Point l2(t tVar, C5807s sVar) {
        int i10 = sVar.f28252w;
        int i11 = sVar.f28251v;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = ((float) i10) / ((float) i12);
        for (int i13 : f38080P1) {
            int i14 = (int) (((float) i13) * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            int i15 = z10 ? i14 : i13;
            if (!z10) {
                i13 = i14;
            }
            Point c10 = tVar.c(i15, i13);
            float f11 = sVar.f28253x;
            if (c10 != null && tVar.t(c10.x, c10.y, (double) f11)) {
                return c10;
            }
        }
        return null;
    }

    private static List<t> n2(Context context, E3.D d10, C5807s sVar, boolean z10, boolean z11) {
        String str = sVar.f28244o;
        if (str == null) {
            return C9967v.E();
        }
        if (N.f29462a >= 26 && "video/dolby-vision".equals(str) && !c.a(context)) {
            List<t> f10 = L.f(d10, sVar, z10, z11);
            if (!f10.isEmpty()) {
                return f10;
            }
        }
        return L.l(d10, sVar, z10, z11);
    }

    protected static int o2(t tVar, C5807s sVar) {
        if (sVar.f28245p == -1) {
            return k2(tVar, sVar);
        }
        int size = sVar.f28247r.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += sVar.f28247r.get(i11).length;
        }
        return sVar.f28245p + i10;
    }

    private static int p2(int i10, int i11) {
        return (i10 * 3) / (i11 * 2);
    }

    private Surface r2(t tVar) {
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            return e10.i();
        }
        Surface surface = this.f38111s1;
        if (surface != null) {
            return surface;
        }
        if (W2(tVar)) {
            return null;
        }
        C5950a.g(X2(tVar));
        C6640e eVar = this.f38112t1;
        if (!(eVar == null || eVar.f38131a == tVar.f34829g)) {
            K2();
        }
        if (this.f38112t1 == null) {
            this.f38112t1 = C6640e.c(this.f38098f1, tVar.f34829g);
        }
        return this.f38112t1;
    }

    private boolean s2(t tVar) {
        Surface surface = this.f38111s1;
        return (surface != null && surface.isValid()) || W2(tVar) || X2(tVar);
    }

    private boolean t2(f fVar) {
        return fVar.f32281f < Z();
    }

    private boolean u2(f fVar) {
        if (n() || fVar.G() || this.f38096N1 == -9223372036854775807L) {
            return true;
        }
        return this.f38096N1 - (fVar.f32281f - Y0()) <= 100000;
    }

    private void w2() {
        if (this.f38118z1 > 0) {
            long c10 = V().c();
            this.f38100h1.n(this.f38118z1, c10 - this.f38117y1);
            this.f38118z1 = 0;
            this.f38117y1 = c10;
        }
    }

    private void x2() {
        if (this.f38103k1.i() && this.f38111s1 != null) {
            F2();
        }
    }

    private void y2() {
        int i10 = this.f38086D1;
        if (i10 != 0) {
            this.f38100h1.B(this.f38085C1, i10);
            this.f38085C1 = 0;
            this.f38086D1 = 0;
        }
    }

    private void z2(S s10) {
        if (!s10.equals(S.f28064e) && !s10.equals(this.f38089G1)) {
            this.f38089G1 = s10;
            this.f38100h1.D(s10);
        }
    }

    public boolean C(long j10, long j11) {
        return U2(j10, j11);
    }

    /* access modifiers changed from: protected */
    public s C0(Throwable th2, t tVar) {
        return new C6638c(th2, tVar, this.f38111s1);
    }

    public boolean F(long j10, long j11, long j12, boolean z10, boolean z11) {
        return S2(j10, j12, z10) && v2(j11, z11);
    }

    /* access modifiers changed from: protected */
    public void F1() {
        super.F1();
        this.f38084B1 = 0;
    }

    /* access modifiers changed from: protected */
    public void G2(long j10) {
        X1(j10);
        z2(this.f38088F1);
        this.f34717Z0.f32410e++;
        x2();
        u1(j10);
    }

    /* access modifiers changed from: protected */
    public void I2() {
    }

    public void M(float f10, float f11) {
        super.M(f10, f11);
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.j(f10);
        } else {
            this.f38103k1.r(f10);
        }
    }

    /* access modifiers changed from: protected */
    public void M2(q qVar, int i10, long j10, long j11) {
        I.a("releaseOutputBuffer");
        qVar.m(i10, j11);
        I.b();
        this.f34717Z0.f32410e++;
        this.f38083A1 = 0;
        if (this.f38108p1 == null) {
            z2(this.f38088F1);
            x2();
        }
    }

    public boolean N(long j10, long j11, boolean z10) {
        return T2(j10, j11, z10);
    }

    /* access modifiers changed from: protected */
    public int P0(f fVar) {
        return (N.f29462a < 34 || !this.f38091I1 || !t2(fVar)) ? 0 : 32;
    }

    /* access modifiers changed from: protected */
    public boolean P1(t tVar) {
        return s2(tVar);
    }

    /* access modifiers changed from: protected */
    public void Q2(q qVar, Surface surface) {
        qVar.j(surface);
    }

    /* access modifiers changed from: protected */
    public boolean R0() {
        return this.f38091I1 && N.f29462a < 23;
    }

    /* access modifiers changed from: protected */
    public boolean R1(f fVar) {
        if (fVar.H() && !u2(fVar) && !fVar.M()) {
            return t2(fVar);
        }
        return false;
    }

    public void R2(List<Object> list) {
        this.f38110r1 = list;
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.p(list);
        }
    }

    /* access modifiers changed from: protected */
    public float S0(float f10, C5807s sVar, C5807s[] sVarArr) {
        float f11 = -1.0f;
        for (C5807s sVar2 : sVarArr) {
            float f12 = sVar2.f28253x;
            if (f12 != -1.0f) {
                f11 = Math.max(f11, f12);
            }
        }
        if (f11 == -1.0f) {
            return -1.0f;
        }
        return f11 * f10;
    }

    /* access modifiers changed from: protected */
    public boolean S2(long j10, long j11, boolean z10) {
        return j10 < -500000 && !z10;
    }

    /* access modifiers changed from: protected */
    public int T1(E3.D d10, C5807s sVar) {
        return Z2(this.f38098f1, d10, sVar);
    }

    /* access modifiers changed from: protected */
    public boolean T2(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    /* access modifiers changed from: protected */
    public List<t> U0(E3.D d10, C5807s sVar, boolean z10) {
        return L.m(n2(this.f38098f1, d10, sVar, z10, this.f38091I1), sVar);
    }

    /* access modifiers changed from: protected */
    public boolean U2(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    /* access modifiers changed from: protected */
    public boolean V2() {
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean W2(t tVar) {
        return N.f29462a >= 35 && tVar.f34833k;
    }

    /* access modifiers changed from: protected */
    public q.a X0(t tVar, C5807s sVar, MediaCrypto mediaCrypto, float f10) {
        String str = tVar.f34825c;
        C0601d m22 = m2(tVar, sVar, b0());
        this.f38105m1 = m22;
        MediaFormat q22 = q2(sVar, str, m22, f10, this.f38102j1, this.f38091I1 ? this.f38092J1 : 0);
        Surface r22 = r2(tVar);
        C2(q22);
        return q.a.b(tVar, q22, sVar, r22, mediaCrypto);
    }

    /* access modifiers changed from: protected */
    public void Y2(q qVar, int i10, long j10) {
        I.a("skipVideoBuffer");
        qVar.p(i10, false);
        I.b();
        this.f34717Z0.f32411f++;
    }

    /* access modifiers changed from: protected */
    public void b3(int i10, int i11) {
        C6279b bVar = this.f34717Z0;
        bVar.f32413h += i10;
        int i12 = i10 + i11;
        bVar.f32412g += i12;
        this.f38118z1 += i12;
        int i13 = this.f38083A1 + i12;
        this.f38083A1 = i13;
        bVar.f32414i = Math.max(i13, bVar.f32414i);
        int i14 = this.f38101i1;
        if (i14 > 0 && this.f38118z1 >= i14) {
            w2();
        }
    }

    /* access modifiers changed from: protected */
    @TargetApi(29)
    public void c1(f fVar) {
        if (this.f38107o1) {
            ByteBuffer byteBuffer = (ByteBuffer) C5950a.e(fVar.f32282g);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 != -75 || s10 != 60 || s11 != 1 || b11 != 4) {
                    return;
                }
                if (b12 == 0 || b12 == 1) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    N2((q) C5950a.e(O0()), bArr);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r1.f38108p1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean d() {
        /*
            r1 = this;
            boolean r0 = super.d()
            if (r0 == 0) goto L_0x0012
            L3.E r0 = r1.f38108p1
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.d()
            if (r0 == 0) goto L_0x0012
        L_0x0010:
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: L3.C6639d.d():boolean");
    }

    /* access modifiers changed from: protected */
    public void d3(long j10) {
        this.f34717Z0.a(j10);
        this.f38085C1 += j10;
        this.f38086D1++;
    }

    /* access modifiers changed from: protected */
    public boolean e2(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (C6639d.class) {
            try {
                if (!f38081Q1) {
                    f38082R1 = i2();
                    f38081Q1 = true;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return f38082R1;
    }

    public boolean f() {
        boolean f10 = super.f();
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            return e10.s(f10);
        }
        if (!f10 || (O0() != null && this.f38111s1 != null && !this.f38091I1)) {
            return this.f38103k1.d(f10);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void f0() {
        this.f38089G1 = null;
        this.f38096N1 = -9223372036854775807L;
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.x();
        } else {
            this.f38103k1.g();
        }
        D2();
        this.f38114v1 = false;
        this.f38093K1 = null;
        try {
            super.f0();
        } finally {
            this.f38100h1.m(this.f34717Z0);
            this.f38100h1.D(S.f28064e);
        }
    }

    /* access modifiers changed from: protected */
    public void f2(q qVar) {
        qVar.g();
    }

    /* access modifiers changed from: protected */
    public void g0(boolean z10, boolean z11) {
        super.g0(z10, z11);
        boolean z12 = W().f32390b;
        C5950a.g(!z12 || this.f38092J1 != 0);
        if (this.f38091I1 != z12) {
            this.f38091I1 = z12;
            D1();
        }
        this.f38100h1.o(this.f34717Z0);
        if (!this.f38109q1) {
            if (this.f38110r1 != null && this.f38108p1 == null) {
                this.f38108p1 = new i.b(this.f38098f1, this.f38103k1).g(V()).f().A();
            }
            this.f38109q1 = true;
        }
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.r(new a(), C10102f.a());
            o oVar = this.f38094L1;
            if (oVar != null) {
                this.f38108p1.q(oVar);
            }
            if (this.f38111s1 != null && !this.f38113u1.equals(D.f29444c)) {
                this.f38108p1.n(this.f38111s1, this.f38113u1);
            }
            this.f38108p1.y(this.f38116x1);
            this.f38108p1.j(a1());
            List<Object> list = this.f38110r1;
            if (list != null) {
                this.f38108p1.p(list);
            }
            this.f38108p1.t(z11);
            return;
        }
        this.f38103k1.o(V());
        this.f38103k1.h(z11);
    }

    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    public void h() {
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.h();
        } else {
            this.f38103k1.a();
        }
    }

    /* access modifiers changed from: protected */
    public void h0() {
        super.h0();
    }

    /* access modifiers changed from: protected */
    public void h2(q qVar, int i10, long j10) {
        I.a("dropVideoBuffer");
        qVar.p(i10, false);
        I.b();
        b3(0, 1);
    }

    /* access modifiers changed from: protected */
    public void i0(long j10, boolean z10) {
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.A(true);
            this.f38108p1.m(Z0(), Y0(), j2(), Z());
            this.f38097O1 = true;
        }
        super.i0(j10, z10);
        if (this.f38108p1 == null) {
            this.f38103k1.m();
        }
        if (z10) {
            C6635E e11 = this.f38108p1;
            if (e11 != null) {
                e11.B(false);
            } else {
                this.f38103k1.e(false);
            }
        }
        D2();
        this.f38083A1 = 0;
    }

    /* access modifiers changed from: protected */
    public void j0() {
        super.j0();
        C6635E e10 = this.f38108p1;
        if (e10 != null && this.f38099g1) {
            e10.release();
        }
    }

    /* access modifiers changed from: protected */
    public long j2() {
        return -this.f38095M1;
    }

    public void k(long j10, long j11) {
        super.k(j10, j11);
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            try {
                e10.k(j10, j11);
            } catch (C6635E.c e11) {
                throw T(e11, e11.f38060a, 7001);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l0() {
        try {
            super.l0();
        } finally {
            this.f38109q1 = false;
            this.f38095M1 = -9223372036854775807L;
            K2();
        }
    }

    /* access modifiers changed from: protected */
    public void m0() {
        super.m0();
        this.f38118z1 = 0;
        this.f38117y1 = V().c();
        this.f38085C1 = 0;
        this.f38086D1 = 0;
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.u();
        } else {
            this.f38103k1.k();
        }
    }

    /* access modifiers changed from: protected */
    public C0601d m2(t tVar, C5807s sVar, C5807s[] sVarArr) {
        int k22;
        int i10 = sVar.f28251v;
        int i11 = sVar.f28252w;
        int o22 = o2(tVar, sVar);
        if (sVarArr.length == 1) {
            if (!(o22 == -1 || (k22 = k2(tVar, sVar)) == -1)) {
                o22 = Math.min((int) (((float) o22) * 1.5f), k22);
            }
            return new C0601d(i10, i11, o22);
        }
        int length = sVarArr.length;
        boolean z10 = false;
        for (int i12 = 0; i12 < length; i12++) {
            C5807s sVar2 = sVarArr[i12];
            if (sVar.f28218C != null && sVar2.f28218C == null) {
                sVar2 = sVar2.b().S(sVar.f28218C).M();
            }
            if (tVar.e(sVar, sVar2).f32421d != 0) {
                int i13 = sVar2.f28251v;
                z10 |= i13 == -1 || sVar2.f28252w == -1;
                i10 = Math.max(i10, i13);
                i11 = Math.max(i11, sVar2.f28252w);
                o22 = Math.max(o22, o2(tVar, sVar2));
            }
        }
        if (z10) {
            t3.q.h("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + i10 + "x" + i11);
            Point l22 = l2(tVar, sVar);
            if (l22 != null) {
                i10 = Math.max(i10, l22.x);
                i11 = Math.max(i11, l22.y);
                o22 = Math.max(o22, k2(tVar, sVar.b().x0(i10).c0(i11).M()));
                t3.q.h("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + i10 + "x" + i11);
            }
        }
        return new C0601d(i10, i11, o22);
    }

    /* access modifiers changed from: protected */
    public void n0() {
        w2();
        y2();
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.o();
        } else {
            this.f38103k1.l();
        }
        super.n0();
    }

    /* access modifiers changed from: protected */
    public void o0(C5807s[] sVarArr, long j10, long j11, C6479C.b bVar) {
        super.o0(sVarArr, j10, j11, bVar);
        if (this.f38095M1 == -9223372036854775807L) {
            this.f38095M1 = j10;
        }
        c3(bVar);
    }

    /* access modifiers changed from: protected */
    public void o1(Exception exc) {
        t3.q.d("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f38100h1.C(exc);
    }

    /* access modifiers changed from: protected */
    public void p1(String str, q.a aVar, long j10, long j11) {
        this.f38100h1.k(str, j10, j11);
        this.f38106n1 = e2(str);
        this.f38107o1 = ((t) C5950a.e(Q0())).o();
        D2();
    }

    /* access modifiers changed from: protected */
    public void q1(String str) {
        this.f38100h1.l(str);
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat q2(C5807s sVar, String str, C0601d dVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> h10;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", sVar.f28251v);
        mediaFormat.setInteger("height", sVar.f28252w);
        t3.t.e(mediaFormat, sVar.f28247r);
        t3.t.c(mediaFormat, "frame-rate", sVar.f28253x);
        t3.t.d(mediaFormat, "rotation-degrees", sVar.f28254y);
        t3.t.b(mediaFormat, sVar.f28218C);
        if ("video/dolby-vision".equals(sVar.f28244o) && (h10 = L.h(sVar)) != null) {
            t3.t.d(mediaFormat, "profile", ((Integer) h10.first).intValue());
        }
        mediaFormat.setInteger("max-width", dVar.f38124a);
        mediaFormat.setInteger("max-height", dVar.f38125b);
        t3.t.d(mediaFormat, "max-input-size", dVar.f38126c);
        int i11 = N.f29462a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i10);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f38090H1));
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public C6280c r1(z3.D d10) {
        C6280c r12 = super.r1(d10);
        this.f38100h1.p((C5807s) C5950a.e(d10.f32383b), r12);
        return r12;
    }

    /* access modifiers changed from: protected */
    public void s1(C5807s sVar, MediaFormat mediaFormat) {
        int i10;
        int i11;
        q O02 = O0();
        if (O02 != null) {
            O02.b(this.f38115w1);
        }
        if (this.f38091I1) {
            i10 = sVar.f28251v;
            i11 = sVar.f28252w;
        } else {
            C5950a.e(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            i11 = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer;
        }
        float f10 = sVar.f28255z;
        int i12 = sVar.f28254y;
        if (i12 == 90 || i12 == 270) {
            f10 = 1.0f / f10;
            int i13 = i11;
            i11 = i10;
            i10 = i13;
        }
        this.f38088F1 = new S(i10, i11, f10);
        if (this.f38108p1 == null || !this.f38097O1) {
            this.f38103k1.p(sVar.f28253x);
        } else {
            I2();
            this.f38108p1.w(1, sVar.b().x0(i10).c0(i11).o0(f10).M());
        }
        this.f38097O1 = false;
    }

    /* access modifiers changed from: protected */
    public void u1(long j10) {
        super.u1(j10);
        if (!this.f38091I1) {
            this.f38084B1--;
        }
    }

    /* access modifiers changed from: protected */
    public void v1() {
        super.v1();
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.m(Z0(), Y0(), j2(), Z());
        } else {
            this.f38103k1.j();
        }
        this.f38097O1 = true;
        D2();
    }

    /* access modifiers changed from: protected */
    public boolean v2(long j10, boolean z10) {
        int s02 = s0(j10);
        if (s02 == 0) {
            return false;
        }
        if (z10) {
            C6279b bVar = this.f34717Z0;
            bVar.f32409d += s02;
            bVar.f32411f += this.f38084B1;
        } else {
            this.f34717Z0.f32415j++;
            b3(s02, this.f38084B1);
        }
        L0();
        C6635E e10 = this.f38108p1;
        if (e10 != null) {
            e10.A(false);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public C6280c w0(t tVar, C5807s sVar, C5807s sVar2) {
        C6280c e10 = tVar.e(sVar, sVar2);
        int i10 = e10.f32422e;
        C0601d dVar = (C0601d) C5950a.e(this.f38105m1);
        if (sVar2.f28251v > dVar.f38124a || sVar2.f28252w > dVar.f38125b) {
            i10 |= 256;
        }
        if (o2(tVar, sVar2) > dVar.f38126c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C6280c(tVar.f34823a, sVar, sVar2, i11 != 0 ? 0 : e10.f32421d, i11);
    }

    /* access modifiers changed from: protected */
    public void w1(f fVar) {
        boolean z10 = this.f38091I1;
        if (!z10) {
            this.f38084B1++;
        }
        if (N.f29462a < 23 && z10) {
            G2(fVar.f32281f);
        }
    }

    public void x(int i10, Object obj) {
        if (i10 == 1) {
            O2(obj);
        } else if (i10 == 7) {
            o oVar = (o) C5950a.e(obj);
            this.f38094L1 = oVar;
            C6635E e10 = this.f38108p1;
            if (e10 != null) {
                e10.q(oVar);
            }
        } else if (i10 == 10) {
            int intValue = ((Integer) C5950a.e(obj)).intValue();
            if (this.f38092J1 != intValue) {
                this.f38092J1 = intValue;
                if (this.f38091I1) {
                    D1();
                }
            }
        } else if (i10 == 16) {
            this.f38090H1 = ((Integer) C5950a.e(obj)).intValue();
            a3();
        } else if (i10 == 4) {
            this.f38115w1 = ((Integer) C5950a.e(obj)).intValue();
            q O02 = O0();
            if (O02 != null) {
                O02.b(this.f38115w1);
            }
        } else if (i10 == 5) {
            int intValue2 = ((Integer) C5950a.e(obj)).intValue();
            this.f38116x1 = intValue2;
            C6635E e11 = this.f38108p1;
            if (e11 != null) {
                e11.y(intValue2);
            } else {
                this.f38103k1.n(intValue2);
            }
        } else if (i10 == 13) {
            R2((List) C5950a.e(obj));
        } else if (i10 != 14) {
            super.x(i10, obj);
        } else {
            D d10 = (D) C5950a.e(obj);
            if (d10.b() != 0 && d10.a() != 0) {
                this.f38113u1 = d10;
                C6635E e12 = this.f38108p1;
                if (e12 != null) {
                    e12.n((Surface) C5950a.i(this.f38111s1), d10);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void x1(C5807s sVar) {
        C6635E e10 = this.f38108p1;
        if (e10 != null && !e10.isInitialized()) {
            try {
                this.f38108p1.v(sVar);
            } catch (C6635E.c e11) {
                throw T(e11, sVar, 7000);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean z1(long j10, long j11, q qVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C5807s sVar) {
        q qVar2 = qVar;
        int i13 = i10;
        C5950a.e(qVar);
        long Y02 = j12 - Y0();
        if (this.f38108p1 != null) {
            try {
                return this.f38108p1.l(j12 + j2(), z11, j10, j11, new b(qVar, i10, Y02));
            } catch (C6635E.c e10) {
                throw T(e10, e10.f38060a, 7001);
            }
        } else {
            int c10 = this.f38103k1.c(j12, j10, j11, Z0(), z11, this.f38104l1);
            if (c10 == 4) {
                return false;
            }
            if (z10 && !z11) {
                Y2(qVar2, i13, Y02);
                return true;
            } else if (this.f38111s1 == null) {
                if (this.f38104l1.f() >= 30000) {
                    return false;
                }
                Y2(qVar2, i13, Y02);
                d3(this.f38104l1.f());
                return true;
            } else if (c10 == 0) {
                long b10 = V().b();
                E2(Y02, b10, sVar);
                L2(qVar, i10, Y02, b10);
                d3(this.f38104l1.f());
                return true;
            } else if (c10 == 1) {
                J2((q) C5950a.i(qVar), i10, Y02, sVar);
                return true;
            } else if (c10 == 2) {
                h2(qVar2, i13, Y02);
                d3(this.f38104l1.f());
                return true;
            } else if (c10 == 3) {
                Y2(qVar2, i13, Y02);
                d3(this.f38104l1.f());
                return true;
            } else if (c10 == 5) {
                return false;
            } else {
                throw new IllegalStateException(String.valueOf(c10));
            }
        }
    }

    public C6639d(Context context, q.b bVar, E3.D d10, long j10, boolean z10, Handler handler, C6634D d11, int i10, float f10) {
        this(context, bVar, d10, j10, z10, handler, d11, i10, f10, (C6635E) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6639d(Context context, q.b bVar, E3.D d10, long j10, boolean z10, Handler handler, C6634D d11, int i10, float f10, C6635E e10) {
        super(2, bVar, d10, z10, f10);
        C6635E e11 = e10;
        Context applicationContext = context.getApplicationContext();
        this.f38098f1 = applicationContext;
        this.f38101i1 = i10;
        this.f38108p1 = e11;
        Handler handler2 = handler;
        this.f38100h1 = new C6634D.a(handler, d11);
        this.f38099g1 = e11 == null;
        long j11 = j10;
        this.f38103k1 = new p(applicationContext, this, j10);
        this.f38104l1 = new p.a();
        this.f38102j1 = g2();
        this.f38113u1 = D.f29444c;
        this.f38115w1 = 1;
        this.f38116x1 = 0;
        this.f38088F1 = S.f28064e;
        this.f38092J1 = 0;
        this.f38089G1 = null;
        this.f38090H1 = -1000;
        this.f38095M1 = -9223372036854775807L;
        this.f38096N1 = -9223372036854775807L;
    }
}
