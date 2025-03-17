package E3;

import A3.v1;
import B3.Y;
import C3.C6408B;
import C3.C6422m;
import E3.L;
import E3.q;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Bundle;
import androidx.media3.exoplayer.C5228e;
import androidx.media3.exoplayer.C5233j;
import androidx.media3.exoplayer.u0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.UUID;
import q3.C5797h;
import q3.C5807s;
import t3.C5950a;
import t3.G;
import t3.I;
import t3.N;
import y3.f;
import z3.C6279b;
import z3.C6280c;
import z3.D;

/* renamed from: E3.A  reason: case insensitive filesystem */
public abstract class C6452A extends C5228e {

    /* renamed from: e1  reason: collision with root package name */
    private static final byte[] f34667e1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* renamed from: A  reason: collision with root package name */
    private final ArrayDeque<e> f34668A;

    /* renamed from: A0  reason: collision with root package name */
    private long f34669A0;

    /* renamed from: B  reason: collision with root package name */
    private final Y f34670B;

    /* renamed from: B0  reason: collision with root package name */
    private boolean f34671B0;

    /* renamed from: C  reason: collision with root package name */
    private C5807s f34672C;

    /* renamed from: C0  reason: collision with root package name */
    private long f34673C0;

    /* renamed from: D  reason: collision with root package name */
    private C5807s f34674D;

    /* renamed from: D0  reason: collision with root package name */
    private int f34675D0;

    /* renamed from: E  reason: collision with root package name */
    private C6422m f34676E;

    /* renamed from: E0  reason: collision with root package name */
    private int f34677E0;

    /* renamed from: F  reason: collision with root package name */
    private C6422m f34678F;

    /* renamed from: F0  reason: collision with root package name */
    private ByteBuffer f34679F0;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public u0.a f34680G;

    /* renamed from: G0  reason: collision with root package name */
    private boolean f34681G0;

    /* renamed from: H  reason: collision with root package name */
    private MediaCrypto f34682H;

    /* renamed from: H0  reason: collision with root package name */
    private boolean f34683H0;

    /* renamed from: I  reason: collision with root package name */
    private long f34684I;

    /* renamed from: I0  reason: collision with root package name */
    private boolean f34685I0;

    /* renamed from: J  reason: collision with root package name */
    private float f34686J;

    /* renamed from: J0  reason: collision with root package name */
    private boolean f34687J0;

    /* renamed from: K  reason: collision with root package name */
    private float f34688K;

    /* renamed from: K0  reason: collision with root package name */
    private boolean f34689K0;

    /* renamed from: L  reason: collision with root package name */
    private q f34690L;

    /* renamed from: L0  reason: collision with root package name */
    private boolean f34691L0;

    /* renamed from: M  reason: collision with root package name */
    private C5807s f34692M;

    /* renamed from: M0  reason: collision with root package name */
    private int f34693M0;

    /* renamed from: N  reason: collision with root package name */
    private MediaFormat f34694N;

    /* renamed from: N0  reason: collision with root package name */
    private int f34695N0;

    /* renamed from: O  reason: collision with root package name */
    private boolean f34696O;

    /* renamed from: O0  reason: collision with root package name */
    private int f34697O0;

    /* renamed from: P  reason: collision with root package name */
    private float f34698P;

    /* renamed from: P0  reason: collision with root package name */
    private boolean f34699P0;

    /* renamed from: Q  reason: collision with root package name */
    private ArrayDeque<t> f34700Q;

    /* renamed from: Q0  reason: collision with root package name */
    private boolean f34701Q0;

    /* renamed from: R  reason: collision with root package name */
    private c f34702R;

    /* renamed from: R0  reason: collision with root package name */
    private boolean f34703R0;

    /* renamed from: S  reason: collision with root package name */
    private t f34704S;

    /* renamed from: S0  reason: collision with root package name */
    private long f34705S0;

    /* renamed from: T  reason: collision with root package name */
    private int f34706T;

    /* renamed from: T0  reason: collision with root package name */
    private long f34707T0;

    /* renamed from: U  reason: collision with root package name */
    private boolean f34708U;

    /* renamed from: U0  reason: collision with root package name */
    private boolean f34709U0;

    /* renamed from: V0  reason: collision with root package name */
    private boolean f34710V0;

    /* renamed from: W0  reason: collision with root package name */
    private boolean f34711W0;

    /* renamed from: X  reason: collision with root package name */
    private boolean f34712X;

    /* renamed from: X0  reason: collision with root package name */
    private boolean f34713X0;

    /* renamed from: Y  reason: collision with root package name */
    private boolean f34714Y;

    /* renamed from: Y0  reason: collision with root package name */
    private C5233j f34715Y0;

    /* renamed from: Z  reason: collision with root package name */
    private boolean f34716Z;

    /* renamed from: Z0  reason: collision with root package name */
    protected C6279b f34717Z0;

    /* renamed from: a1  reason: collision with root package name */
    private e f34718a1;

    /* renamed from: b1  reason: collision with root package name */
    private long f34719b1;

    /* renamed from: c1  reason: collision with root package name */
    private boolean f34720c1;

    /* renamed from: d1  reason: collision with root package name */
    private boolean f34721d1;

    /* renamed from: r  reason: collision with root package name */
    private final q.b f34722r;

    /* renamed from: s  reason: collision with root package name */
    private final D f34723s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f34724t;

    /* renamed from: u  reason: collision with root package name */
    private final float f34725u;

    /* renamed from: v  reason: collision with root package name */
    private final f f34726v = f.N();

    /* renamed from: w  reason: collision with root package name */
    private final f f34727w = new f(0);

    /* renamed from: x  reason: collision with root package name */
    private final f f34728x = new f(2);

    /* renamed from: y  reason: collision with root package name */
    private final C6461i f34729y;

    /* renamed from: y0  reason: collision with root package name */
    private boolean f34730y0;

    /* renamed from: z  reason: collision with root package name */
    private final MediaCodec.BufferInfo f34731z;

    /* renamed from: z0  reason: collision with root package name */
    private boolean f34732z0;

    /* renamed from: E3.A$b */
    private static final class b {
        public static void a(q.a aVar, v1 v1Var) {
            LogSessionId a10 = v1Var.a();
            if (!a10.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                aVar.f34815b.setString("log-session-id", a10.getStringId());
            }
        }
    }

    /* renamed from: E3.A$d */
    private final class d implements q.c {
        private d() {
        }

        public void a() {
            if (C6452A.this.f34680G != null) {
                C6452A.this.f34680G.b();
            }
        }

        public void b() {
            if (C6452A.this.f34680G != null) {
                C6452A.this.f34680G.b();
            }
        }
    }

    /* renamed from: E3.A$e */
    private static final class e {

        /* renamed from: e  reason: collision with root package name */
        public static final e f34739e = new e(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L);

        /* renamed from: a  reason: collision with root package name */
        public final long f34740a;

        /* renamed from: b  reason: collision with root package name */
        public final long f34741b;

        /* renamed from: c  reason: collision with root package name */
        public final long f34742c;

        /* renamed from: d  reason: collision with root package name */
        public final G<C5807s> f34743d = new G<>();

        public e(long j10, long j11, long j12) {
            this.f34740a = j10;
            this.f34741b = j11;
            this.f34742c = j12;
        }
    }

    public C6452A(int i10, q.b bVar, D d10, boolean z10, float f10) {
        super(i10);
        this.f34722r = bVar;
        this.f34723s = (D) C5950a.e(d10);
        this.f34724t = z10;
        this.f34725u = f10;
        C6461i iVar = new C6461i();
        this.f34729y = iVar;
        this.f34731z = new MediaCodec.BufferInfo();
        this.f34686J = 1.0f;
        this.f34688K = 1.0f;
        this.f34684I = -9223372036854775807L;
        this.f34668A = new ArrayDeque<>();
        this.f34718a1 = e.f34739e;
        iVar.K(0);
        iVar.f32279d.order(ByteOrder.nativeOrder());
        this.f34670B = new Y();
        this.f34698P = -1.0f;
        this.f34706T = 0;
        this.f34693M0 = 0;
        this.f34675D0 = -1;
        this.f34677E0 = -1;
        this.f34673C0 = -9223372036854775807L;
        this.f34705S0 = -9223372036854775807L;
        this.f34707T0 = -9223372036854775807L;
        this.f34719b1 = -9223372036854775807L;
        this.f34669A0 = -9223372036854775807L;
        this.f34695N0 = 0;
        this.f34697O0 = 0;
        this.f34717Z0 = new C6279b();
    }

    private static boolean A0(t tVar) {
        String str = tVar.f34823a;
        int i10 = N.f29462a;
        return (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i10 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str) || "OMX.bcm.vdec.avc.tunnel".equals(str) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str) || "OMX.bcm.vdec.hevc.tunnel".equals(str) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str))) || ("Amazon".equals(N.f29464c) && "AFTS".equals(N.f29465d) && tVar.f34829g);
    }

    private void A1() {
        this.f34703R0 = true;
        MediaFormat f10 = ((q) C5950a.e(this.f34690L)).f();
        if (this.f34706T != 0 && f10.getInteger("width") == 32 && f10.getInteger("height") == 32) {
            this.f34730y0 = true;
            return;
        }
        this.f34694N = f10;
        this.f34696O = true;
    }

    private static boolean B0(String str) {
        return N.f29462a == 29 && "c2.android.aac.decoder".equals(str);
    }

    private boolean B1(int i10) {
        D X10 = X();
        this.f34726v.v();
        int q02 = q0(X10, this.f34726v, i10 | 4);
        if (q02 == -5) {
            r1(X10);
            return true;
        } else if (q02 != -4 || !this.f34726v.D()) {
            return false;
        } else {
            this.f34709U0 = true;
            y1();
            return false;
        }
    }

    private void C1() {
        D1();
        m1();
    }

    private void D0() {
        this.f34689K0 = false;
        this.f34729y.v();
        this.f34728x.v();
        this.f34687J0 = false;
        this.f34685I0 = false;
        this.f34670B.d();
    }

    private boolean E0() {
        if (this.f34699P0) {
            this.f34695N0 = 1;
            if (this.f34712X) {
                this.f34697O0 = 3;
                return false;
            }
            this.f34697O0 = 1;
        }
        return true;
    }

    private void F0() {
        if (this.f34699P0) {
            this.f34695N0 = 1;
            this.f34697O0 = 3;
            return;
        }
        C1();
    }

    @TargetApi(23)
    private boolean G0() {
        if (this.f34699P0) {
            this.f34695N0 = 1;
            if (this.f34712X) {
                this.f34697O0 = 3;
                return false;
            }
            this.f34697O0 = 2;
        } else {
            W1();
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean H0(long r20, long r22) {
        /*
            r19 = this;
            r15 = r19
            E3.q r0 = r15.f34690L
            java.lang.Object r0 = t3.C5950a.e(r0)
            r5 = r0
            E3.q r5 = (E3.q) r5
            boolean r0 = r19.d1()
            r16 = 1
            r14 = 0
            if (r0 != 0) goto L_0x00cf
            boolean r0 = r15.f34714Y
            if (r0 == 0) goto L_0x002e
            boolean r0 = r15.f34701Q0
            if (r0 == 0) goto L_0x002e
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z     // Catch:{ IllegalStateException -> 0x0023 }
            int r0 = r5.o(r0)     // Catch:{ IllegalStateException -> 0x0023 }
            goto L_0x0034
        L_0x0023:
            r19.y1()
            boolean r0 = r15.f34710V0
            if (r0 == 0) goto L_0x002d
            r19.D1()
        L_0x002d:
            return r14
        L_0x002e:
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z
            int r0 = r5.o(r0)
        L_0x0034:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r0 >= 0) goto L_0x006b
            r3 = -2
            if (r0 != r3) goto L_0x0042
            r19.A1()
            return r16
        L_0x0042:
            boolean r0 = r15.f34732z0
            if (r0 == 0) goto L_0x0052
            boolean r0 = r15.f34709U0
            if (r0 != 0) goto L_0x004f
            int r0 = r15.f34695N0
            r3 = 2
            if (r0 != r3) goto L_0x0052
        L_0x004f:
            r19.y1()
        L_0x0052:
            long r3 = r15.f34669A0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006a
            r0 = 100
            long r3 = r3 + r0
            t3.d r0 = r19.V()
            long r0 = r0.a()
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x006a
            r19.y1()
        L_0x006a:
            return r14
        L_0x006b:
            boolean r3 = r15.f34730y0
            if (r3 == 0) goto L_0x0075
            r15.f34730y0 = r14
            r5.p(r0, r14)
            return r16
        L_0x0075:
            android.media.MediaCodec$BufferInfo r3 = r15.f34731z
            int r4 = r3.size
            if (r4 != 0) goto L_0x0085
            int r3 = r3.flags
            r3 = r3 & 4
            if (r3 == 0) goto L_0x0085
            r19.y1()
            return r14
        L_0x0085:
            r15.f34677E0 = r0
            java.nio.ByteBuffer r0 = r5.q(r0)
            r15.f34679F0 = r0
            if (r0 == 0) goto L_0x00a2
            android.media.MediaCodec$BufferInfo r3 = r15.f34731z
            int r3 = r3.offset
            r0.position(r3)
            java.nio.ByteBuffer r0 = r15.f34679F0
            android.media.MediaCodec$BufferInfo r3 = r15.f34731z
            int r4 = r3.offset
            int r3 = r3.size
            int r4 = r4 + r3
            r0.limit(r4)
        L_0x00a2:
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z
            long r3 = r0.presentationTimeUs
            long r6 = r19.Z()
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b1
            r0 = r16
            goto L_0x00b2
        L_0x00b1:
            r0 = r14
        L_0x00b2:
            r15.f34681G0 = r0
            long r3 = r15.f34707T0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00c5
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z
            long r0 = r0.presentationTimeUs
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x00c5
            r0 = r16
            goto L_0x00c6
        L_0x00c5:
            r0 = r14
        L_0x00c6:
            r15.f34683H0 = r0
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z
            long r0 = r0.presentationTimeUs
            r15.X1(r0)
        L_0x00cf:
            boolean r0 = r15.f34714Y
            if (r0 == 0) goto L_0x010c
            boolean r0 = r15.f34701Q0
            if (r0 == 0) goto L_0x010c
            java.nio.ByteBuffer r6 = r15.f34679F0     // Catch:{ IllegalStateException -> 0x00ff }
            int r7 = r15.f34677E0     // Catch:{ IllegalStateException -> 0x00ff }
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z     // Catch:{ IllegalStateException -> 0x00ff }
            int r8 = r0.flags     // Catch:{ IllegalStateException -> 0x00ff }
            long r10 = r0.presentationTimeUs     // Catch:{ IllegalStateException -> 0x00ff }
            boolean r12 = r15.f34681G0     // Catch:{ IllegalStateException -> 0x00ff }
            boolean r13 = r15.f34683H0     // Catch:{ IllegalStateException -> 0x00ff }
            q3.s r0 = r15.f34674D     // Catch:{ IllegalStateException -> 0x00ff }
            java.lang.Object r0 = t3.C5950a.e(r0)     // Catch:{ IllegalStateException -> 0x00ff }
            r17 = r0
            q3.s r17 = (q3.C5807s) r17     // Catch:{ IllegalStateException -> 0x00ff }
            r9 = 1
            r0 = r19
            r1 = r20
            r3 = r22
            r18 = r14
            r14 = r17
            boolean r0 = r0.z1(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ IllegalStateException -> 0x0101 }
            goto L_0x0130
        L_0x00ff:
            r18 = r14
        L_0x0101:
            r19.y1()
            boolean r0 = r15.f34710V0
            if (r0 == 0) goto L_0x010b
            r19.D1()
        L_0x010b:
            return r18
        L_0x010c:
            r18 = r14
            java.nio.ByteBuffer r6 = r15.f34679F0
            int r7 = r15.f34677E0
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z
            int r8 = r0.flags
            long r10 = r0.presentationTimeUs
            boolean r12 = r15.f34681G0
            boolean r13 = r15.f34683H0
            q3.s r0 = r15.f34674D
            java.lang.Object r0 = t3.C5950a.e(r0)
            r14 = r0
            q3.s r14 = (q3.C5807s) r14
            r9 = 1
            r0 = r19
            r1 = r20
            r3 = r22
            boolean r0 = r0.z1(r1, r3, r5, r6, r7, r8, r9, r10, r12, r13, r14)
        L_0x0130:
            if (r0 == 0) goto L_0x0163
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z
            long r0 = r0.presentationTimeUs
            r15.u1(r0)
            android.media.MediaCodec$BufferInfo r0 = r15.f34731z
            int r0 = r0.flags
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0144
            r14 = r16
            goto L_0x0146
        L_0x0144:
            r14 = r18
        L_0x0146:
            if (r14 != 0) goto L_0x015a
            boolean r0 = r15.f34701Q0
            if (r0 == 0) goto L_0x015a
            boolean r0 = r15.f34683H0
            if (r0 == 0) goto L_0x015a
            t3.d r0 = r19.V()
            long r0 = r0.a()
            r15.f34669A0 = r0
        L_0x015a:
            r19.I1()
            if (r14 != 0) goto L_0x0160
            return r16
        L_0x0160:
            r19.y1()
        L_0x0163:
            return r18
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6452A.H0(long, long):boolean");
    }

    private void H1() {
        this.f34675D0 = -1;
        this.f34727w.f32279d = null;
    }

    private boolean I0(t tVar, C5807s sVar, C6422m mVar, C6422m mVar2) {
        y3.b g10;
        y3.b g11;
        if (mVar == mVar2) {
            return false;
        }
        if (!(mVar2 == null || mVar == null || (g10 = mVar2.g()) == null || (g11 = mVar.g()) == null || !g10.getClass().equals(g11.getClass()))) {
            if (!(g10 instanceof C6408B)) {
                return false;
            }
            if (!mVar2.a().equals(mVar.a()) || N.f29462a < 23) {
                return true;
            }
            UUID uuid = C5797h.f28133e;
            if (!uuid.equals(mVar.a()) && !uuid.equals(mVar2.a())) {
                if (!tVar.f34829g) {
                    return mVar2.getState() == 2 || ((mVar2.getState() == 3 || mVar2.getState() == 4) && mVar2.i((String) C5950a.e(sVar.f28244o)));
                }
                return false;
            }
        }
        return true;
    }

    private void I1() {
        this.f34677E0 = -1;
        this.f34679F0 = null;
    }

    private boolean J0() {
        int i10;
        if (this.f34690L == null || (i10 = this.f34695N0) == 2 || this.f34709U0) {
            return false;
        }
        if (i10 == 0 && Q1()) {
            F0();
        }
        q qVar = (q) C5950a.e(this.f34690L);
        if (this.f34675D0 < 0) {
            int n10 = qVar.n();
            this.f34675D0 = n10;
            if (n10 < 0) {
                return false;
            }
            this.f34727w.f32279d = qVar.i(n10);
            this.f34727w.v();
        }
        if (this.f34695N0 == 1) {
            if (!this.f34732z0) {
                this.f34701Q0 = true;
                qVar.c(this.f34675D0, 0, 0, 0, 4);
                H1();
            }
            this.f34695N0 = 2;
            return false;
        } else if (this.f34716Z) {
            this.f34716Z = false;
            byte[] bArr = f34667e1;
            ((ByteBuffer) C5950a.e(this.f34727w.f32279d)).put(bArr);
            qVar.c(this.f34675D0, 0, bArr.length, 0, 0);
            H1();
            this.f34699P0 = true;
            return true;
        } else {
            if (this.f34693M0 == 1) {
                for (int i11 = 0; i11 < ((C5807s) C5950a.e(this.f34692M)).f28247r.size(); i11++) {
                    ((ByteBuffer) C5950a.e(this.f34727w.f32279d)).put(this.f34692M.f28247r.get(i11));
                }
                this.f34693M0 = 2;
            }
            int position = ((ByteBuffer) C5950a.e(this.f34727w.f32279d)).position();
            D X10 = X();
            try {
                int q02 = q0(X10, this.f34727w, 0);
                if (q02 == -3) {
                    if (n()) {
                        this.f34707T0 = this.f34705S0;
                    }
                    return false;
                } else if (q02 == -5) {
                    if (this.f34693M0 == 2) {
                        this.f34727w.v();
                        this.f34693M0 = 1;
                    }
                    r1(X10);
                    return true;
                } else if (this.f34727w.D()) {
                    this.f34707T0 = this.f34705S0;
                    if (this.f34693M0 == 2) {
                        this.f34727w.v();
                        this.f34693M0 = 1;
                    }
                    this.f34709U0 = true;
                    if (!this.f34699P0) {
                        y1();
                        return false;
                    }
                    if (!this.f34732z0) {
                        this.f34701Q0 = true;
                        qVar.c(this.f34675D0, 0, 0, 0, 4);
                        H1();
                    }
                    return false;
                } else if (!this.f34699P0 && !this.f34727w.F()) {
                    this.f34727w.v();
                    if (this.f34693M0 == 2) {
                        this.f34693M0 = 1;
                    }
                    return true;
                } else if (R1(this.f34727w)) {
                    this.f34727w.v();
                    this.f34717Z0.f32409d++;
                    return true;
                } else {
                    boolean M10 = this.f34727w.M();
                    if (M10) {
                        this.f34727w.f32278c.b(position);
                    }
                    long j10 = this.f34727w.f32281f;
                    if (this.f34711W0) {
                        if (!this.f34668A.isEmpty()) {
                            this.f34668A.peekLast().f34743d.a(j10, (C5807s) C5950a.e(this.f34672C));
                        } else {
                            this.f34718a1.f34743d.a(j10, (C5807s) C5950a.e(this.f34672C));
                        }
                        this.f34711W0 = false;
                    }
                    this.f34705S0 = Math.max(this.f34705S0, j10);
                    if (n() || this.f34727w.G()) {
                        this.f34707T0 = this.f34705S0;
                    }
                    this.f34727w.L();
                    if (this.f34727w.C()) {
                        c1(this.f34727w);
                    }
                    w1(this.f34727w);
                    int P02 = P0(this.f34727w);
                    if (M10) {
                        ((q) C5950a.e(qVar)).d(this.f34675D0, 0, this.f34727w.f32278c, j10, P02);
                    } else {
                        ((q) C5950a.e(qVar)).c(this.f34675D0, 0, ((ByteBuffer) C5950a.e(this.f34727w.f32279d)).limit(), j10, P02);
                    }
                    H1();
                    this.f34699P0 = true;
                    this.f34693M0 = 0;
                    this.f34717Z0.f32408c++;
                    return true;
                }
            } catch (f.a e10) {
                o1(e10);
                B1(0);
                K0();
                return true;
            }
        }
    }

    private void J1(C6422m mVar) {
        C6422m.e(this.f34676E, mVar);
        this.f34676E = mVar;
    }

    private void K0() {
        try {
            ((q) C5950a.i(this.f34690L)).flush();
        } finally {
            F1();
        }
    }

    private void K1(e eVar) {
        this.f34718a1 = eVar;
        long j10 = eVar.f34742c;
        if (j10 != -9223372036854775807L) {
            this.f34720c1 = true;
            t1(j10);
        }
    }

    private List<t> N0(boolean z10) {
        C5807s sVar = (C5807s) C5950a.e(this.f34672C);
        List<t> U02 = U0(this.f34723s, sVar, z10);
        if (U02.isEmpty() && z10) {
            U02 = U0(this.f34723s, sVar, false);
            if (!U02.isEmpty()) {
                t3.q.h("MediaCodecRenderer", "Drm session requires secure decoder for " + sVar.f28244o + ", but no secure decoder available. Trying to proceed with " + U02 + ".");
            }
        }
        return U02;
    }

    private void N1(C6422m mVar) {
        C6422m.e(this.f34678F, mVar);
        this.f34678F = mVar;
    }

    private boolean O1(long j10) {
        return this.f34684I == -9223372036854775807L || V().c() - j10 < this.f34684I;
    }

    protected static boolean U1(C5807s sVar) {
        int i10 = sVar.f28228M;
        return i10 == 0 || i10 == 2;
    }

    private boolean V1(C5807s sVar) {
        if (!(N.f29462a < 23 || this.f34690L == null || this.f34697O0 == 3 || getState() == 0)) {
            float S02 = S0(this.f34688K, (C5807s) C5950a.e(sVar), b0());
            float f10 = this.f34698P;
            if (f10 == S02) {
                return true;
            }
            if (S02 == -1.0f) {
                F0();
                return false;
            } else if (f10 == -1.0f && S02 <= this.f34725u) {
                return true;
            } else {
                Bundle bundle = new Bundle();
                bundle.putFloat("operating-rate", S02);
                ((q) C5950a.e(this.f34690L)).e(bundle);
                this.f34698P = S02;
            }
        }
        return true;
    }

    private void W1() {
        y3.b g10 = ((C6422m) C5950a.e(this.f34678F)).g();
        if (g10 instanceof C6408B) {
            try {
                ((MediaCrypto) C5950a.e(this.f34682H)).setMediaDrmSession(((C6408B) g10).f33558b);
            } catch (MediaCryptoException e10) {
                throw T(e10, this.f34672C, 6006);
            }
        }
        J1(this.f34678F);
        this.f34695N0 = 0;
        this.f34697O0 = 0;
    }

    private boolean d1() {
        return this.f34677E0 >= 0;
    }

    private boolean e1() {
        if (!this.f34729y.U()) {
            return true;
        }
        long Z10 = Z();
        return k1(Z10, this.f34729y.S()) == k1(Z10, this.f34728x.f32281f);
    }

    private void f1(C5807s sVar) {
        D0();
        String str = sVar.f28244o;
        if ("audio/mp4a-latm".equals(str) || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
            this.f34729y.V(32);
        } else {
            this.f34729y.V(1);
        }
        this.f34685I0 = true;
    }

    /* JADX INFO: finally extract failed */
    private void g1(t tVar, MediaCrypto mediaCrypto) {
        C5807s sVar = (C5807s) C5950a.e(this.f34672C);
        String str = tVar.f34823a;
        int i10 = N.f29462a;
        float f10 = -1.0f;
        float S02 = i10 < 23 ? -1.0f : S0(this.f34688K, sVar, b0());
        if (S02 > this.f34725u) {
            f10 = S02;
        }
        x1(sVar);
        long c10 = V().c();
        q.a X02 = X0(tVar, sVar, mediaCrypto, f10);
        if (i10 >= 31) {
            b.a(X02, a0());
        }
        try {
            I.a("createCodec:" + str);
            q a10 = this.f34722r.a(X02);
            this.f34690L = a10;
            this.f34671B0 = a10.h(new d());
            I.b();
            long c11 = V().c();
            if (!tVar.n(sVar)) {
                t3.q.h("MediaCodecRenderer", N.G("Format exceeds selected codec's capabilities [%s, %s]", C5807s.i(sVar), str));
            }
            this.f34704S = tVar;
            this.f34698P = f10;
            this.f34692M = sVar;
            this.f34706T = x0(str);
            this.f34708U = B0(str);
            this.f34712X = y0(str);
            this.f34714Y = z0(str);
            boolean z10 = false;
            this.f34732z0 = A0(tVar) || R0();
            if (((q) C5950a.e(this.f34690L)).l()) {
                this.f34691L0 = true;
                this.f34693M0 = 1;
                if (this.f34706T != 0) {
                    z10 = true;
                }
                this.f34716Z = z10;
            }
            if (getState() == 2) {
                this.f34673C0 = V().c() + 1000;
            }
            this.f34717Z0.f32406a++;
            p1(str, X02, c11, c11 - c10);
        } catch (Throwable th2) {
            I.b();
            throw th2;
        }
    }

    private boolean h1() {
        C5950a.g(this.f34682H == null);
        C6422m mVar = this.f34676E;
        y3.b g10 = mVar.g();
        if (C6408B.f33556d && (g10 instanceof C6408B)) {
            int state = mVar.getState();
            if (state == 1) {
                C6422m.a aVar = (C6422m.a) C5950a.e(mVar.f());
                throw T(aVar, this.f34672C, aVar.f33662a);
            } else if (state != 4) {
                return false;
            }
        }
        if (g10 == null) {
            return mVar.f() != null;
        }
        if (g10 instanceof C6408B) {
            C6408B b10 = (C6408B) g10;
            try {
                this.f34682H = new MediaCrypto(b10.f33557a, b10.f33558b);
            } catch (MediaCryptoException e10) {
                throw T(e10, this.f34672C, 6006);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r2.f34674D;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean k1(long r3, long r5) {
        /*
            r2 = this;
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x001a
            q3.s r0 = r2.f34674D
            if (r0 == 0) goto L_0x0018
            java.lang.String r0 = r0.f28244o
            java.lang.String r1 = "audio/opus"
            boolean r0 = java.util.Objects.equals(r0, r1)
            if (r0 == 0) goto L_0x0018
            boolean r3 = N3.C6662H.g(r3, r5)
            if (r3 != 0) goto L_0x001a
        L_0x0018:
            r3 = 1
            goto L_0x001b
        L_0x001a:
            r3 = 0
        L_0x001b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6452A.k1(long, long):boolean");
    }

    private static boolean l1(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    private void n1(MediaCrypto mediaCrypto, boolean z10) {
        C5807s sVar = (C5807s) C5950a.e(this.f34672C);
        if (this.f34700Q == null) {
            try {
                List<t> N02 = N0(z10);
                ArrayDeque<t> arrayDeque = new ArrayDeque<>();
                this.f34700Q = arrayDeque;
                if (this.f34724t) {
                    arrayDeque.addAll(N02);
                } else if (!N02.isEmpty()) {
                    this.f34700Q.add(N02.get(0));
                }
                this.f34702R = null;
            } catch (L.c e10) {
                throw new c(sVar, (Throwable) e10, z10, -49998);
            }
        }
        if (!this.f34700Q.isEmpty()) {
            ArrayDeque arrayDeque2 = (ArrayDeque) C5950a.e(this.f34700Q);
            while (this.f34690L == null) {
                t tVar = (t) C5950a.e((t) arrayDeque2.peekFirst());
                if (P1(tVar)) {
                    try {
                        g1(tVar, mediaCrypto);
                    } catch (Exception e11) {
                        t3.q.i("MediaCodecRenderer", "Failed to initialize decoder: " + tVar, e11);
                        arrayDeque2.removeFirst();
                        c cVar = new c(sVar, (Throwable) e11, z10, tVar);
                        o1(cVar);
                        if (this.f34702R == null) {
                            this.f34702R = cVar;
                        } else {
                            this.f34702R = this.f34702R.c(cVar);
                        }
                        if (arrayDeque2.isEmpty()) {
                            throw this.f34702R;
                        }
                    }
                } else {
                    return;
                }
            }
            this.f34700Q = null;
            return;
        }
        throw new c(sVar, (Throwable) null, z10, -49999);
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0105 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void u0() {
        /*
            r8 = this;
            boolean r0 = r8.f34709U0
            r1 = 1
            r0 = r0 ^ r1
            t3.C5950a.g(r0)
            z3.D r0 = r8.X()
            y3.f r2 = r8.f34728x
            r2.v()
        L_0x0010:
            y3.f r2 = r8.f34728x
            r2.v()
            y3.f r2 = r8.f34728x
            r3 = 0
            int r2 = r8.q0(r0, r2, r3)
            r4 = -5
            if (r2 == r4) goto L_0x0105
            r4 = -4
            if (r2 == r4) goto L_0x0036
            r0 = -3
            if (r2 != r0) goto L_0x0030
            boolean r0 = r8.n()
            if (r0 == 0) goto L_0x002f
            long r0 = r8.f34705S0
            r8.f34707T0 = r0
        L_0x002f:
            return
        L_0x0030:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0036:
            y3.f r2 = r8.f34728x
            boolean r2 = r2.D()
            if (r2 == 0) goto L_0x0045
            r8.f34709U0 = r1
            long r0 = r8.f34705S0
            r8.f34707T0 = r0
            return
        L_0x0045:
            long r4 = r8.f34705S0
            y3.f r2 = r8.f34728x
            long r6 = r2.f32281f
            long r4 = java.lang.Math.max(r4, r6)
            r8.f34705S0 = r4
            boolean r2 = r8.n()
            if (r2 != 0) goto L_0x005f
            y3.f r2 = r8.f34727w
            boolean r2 = r2.G()
            if (r2 == 0) goto L_0x0063
        L_0x005f:
            long r4 = r8.f34705S0
            r8.f34707T0 = r4
        L_0x0063:
            boolean r2 = r8.f34711W0
            java.lang.String r4 = "audio/opus"
            if (r2 == 0) goto L_0x00b1
            q3.s r2 = r8.f34672C
            java.lang.Object r2 = t3.C5950a.e(r2)
            q3.s r2 = (q3.C5807s) r2
            r8.f34674D = r2
            java.lang.String r2 = r2.f28244o
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L_0x00a9
            q3.s r2 = r8.f34674D
            java.util.List<byte[]> r2 = r2.f28247r
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x00a9
            q3.s r2 = r8.f34674D
            java.util.List<byte[]> r2 = r2.f28247r
            java.lang.Object r2 = r2.get(r3)
            byte[] r2 = (byte[]) r2
            int r2 = N3.C6662H.f(r2)
            q3.s r5 = r8.f34674D
            java.lang.Object r5 = t3.C5950a.e(r5)
            q3.s r5 = (q3.C5807s) r5
            q3.s$b r5 = r5.b()
            q3.s$b r2 = r5.Y(r2)
            q3.s r2 = r2.M()
            r8.f34674D = r2
        L_0x00a9:
            q3.s r2 = r8.f34674D
            r5 = 0
            r8.s1(r2, r5)
            r8.f34711W0 = r3
        L_0x00b1:
            y3.f r2 = r8.f34728x
            r2.L()
            q3.s r2 = r8.f34674D
            if (r2 == 0) goto L_0x00f2
            java.lang.String r2 = r2.f28244o
            boolean r2 = java.util.Objects.equals(r2, r4)
            if (r2 == 0) goto L_0x00f2
            y3.f r2 = r8.f34728x
            boolean r2 = r2.C()
            if (r2 == 0) goto L_0x00d3
            y3.f r2 = r8.f34728x
            q3.s r3 = r8.f34674D
            r2.f32277b = r3
            r8.c1(r2)
        L_0x00d3:
            long r2 = r8.Z()
            y3.f r4 = r8.f34728x
            long r4 = r4.f32281f
            boolean r2 = N3.C6662H.g(r2, r4)
            if (r2 == 0) goto L_0x00f2
            B3.Y r2 = r8.f34670B
            y3.f r3 = r8.f34728x
            q3.s r4 = r8.f34674D
            java.lang.Object r4 = t3.C5950a.e(r4)
            q3.s r4 = (q3.C5807s) r4
            java.util.List<byte[]> r4 = r4.f28247r
            r2.a(r3, r4)
        L_0x00f2:
            boolean r2 = r8.e1()
            if (r2 == 0) goto L_0x0102
            E3.i r2 = r8.f34729y
            y3.f r3 = r8.f34728x
            boolean r2 = r2.P(r3)
            if (r2 != 0) goto L_0x0010
        L_0x0102:
            r8.f34687J0 = r1
            return
        L_0x0105:
            r8.r1(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6452A.u0():void");
    }

    private boolean v0(long j10, long j11) {
        boolean z10;
        C5950a.g(!this.f34710V0);
        if (this.f34729y.U()) {
            C6461i iVar = this.f34729y;
            if (!z1(j10, j11, (q) null, iVar.f32279d, this.f34677E0, 0, iVar.T(), this.f34729y.R(), k1(Z(), this.f34729y.S()), this.f34729y.D(), (C5807s) C5950a.e(this.f34674D))) {
                return false;
            }
            u1(this.f34729y.S());
            this.f34729y.v();
            z10 = false;
        } else {
            z10 = false;
        }
        if (this.f34709U0) {
            this.f34710V0 = true;
            return z10;
        }
        if (this.f34687J0) {
            C5950a.g(this.f34729y.P(this.f34728x));
            this.f34687J0 = z10;
        }
        if (this.f34689K0) {
            if (this.f34729y.U()) {
                return true;
            }
            D0();
            this.f34689K0 = z10;
            m1();
            if (!this.f34685I0) {
                return z10;
            }
        }
        u0();
        if (this.f34729y.U()) {
            this.f34729y.L();
        }
        if (this.f34729y.U() || this.f34709U0 || this.f34689K0) {
            return true;
        }
        return z10;
    }

    private int x0(String str) {
        int i10 = N.f29462a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = N.f29465d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = N.f29463b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    private static boolean y0(String str) {
        return N.f29462a <= 23 && "OMX.google.vorbis.decoder".equals(str);
    }

    @TargetApi(23)
    private void y1() {
        int i10 = this.f34697O0;
        if (i10 == 1) {
            K0();
        } else if (i10 == 2) {
            K0();
            W1();
        } else if (i10 != 3) {
            this.f34710V0 = true;
            E1();
        } else {
            C1();
        }
    }

    private static boolean z0(String str) {
        return N.f29462a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    /* access modifiers changed from: protected */
    public s C0(Throwable th2, t tVar) {
        return new s(th2, tVar);
    }

    /* access modifiers changed from: protected */
    public void D1() {
        try {
            q qVar = this.f34690L;
            if (qVar != null) {
                qVar.release();
                this.f34717Z0.f32407b++;
                q1(((t) C5950a.e(this.f34704S)).f34823a);
            }
            this.f34690L = null;
            try {
                MediaCrypto mediaCrypto = this.f34682H;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f34682H = null;
                J1((C6422m) null);
                G1();
            }
        } catch (Throwable th2) {
            this.f34690L = null;
            MediaCrypto mediaCrypto2 = this.f34682H;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th2;
        } finally {
            this.f34682H = null;
            J1((C6422m) null);
            G1();
        }
    }

    /* access modifiers changed from: protected */
    public void E1() {
    }

    /* access modifiers changed from: protected */
    public void F1() {
        H1();
        I1();
        this.f34673C0 = -9223372036854775807L;
        this.f34701Q0 = false;
        this.f34669A0 = -9223372036854775807L;
        this.f34699P0 = false;
        this.f34716Z = false;
        this.f34730y0 = false;
        this.f34681G0 = false;
        this.f34683H0 = false;
        this.f34705S0 = -9223372036854775807L;
        this.f34707T0 = -9223372036854775807L;
        this.f34719b1 = -9223372036854775807L;
        this.f34695N0 = 0;
        this.f34697O0 = 0;
        this.f34693M0 = this.f34691L0 ? 1 : 0;
    }

    /* access modifiers changed from: protected */
    public void G1() {
        F1();
        this.f34715Y0 = null;
        this.f34700Q = null;
        this.f34704S = null;
        this.f34692M = null;
        this.f34694N = null;
        this.f34696O = false;
        this.f34703R0 = false;
        this.f34698P = -1.0f;
        this.f34706T = 0;
        this.f34708U = false;
        this.f34712X = false;
        this.f34714Y = false;
        this.f34732z0 = false;
        this.f34671B0 = false;
        this.f34691L0 = false;
        this.f34693M0 = 0;
    }

    public final long H(long j10, long j11) {
        return V0(this.f34671B0, j10, j11);
    }

    /* access modifiers changed from: protected */
    public final boolean L0() {
        boolean M02 = M0();
        if (M02) {
            m1();
        }
        return M02;
    }

    /* access modifiers changed from: protected */
    public final void L1() {
        this.f34713X0 = true;
    }

    public void M(float f10, float f11) {
        this.f34686J = f10;
        this.f34688K = f11;
        V1(this.f34692M);
    }

    /* access modifiers changed from: protected */
    public boolean M0() {
        if (this.f34690L == null) {
            return false;
        }
        int i10 = this.f34697O0;
        if (i10 == 3 || ((this.f34708U && !this.f34703R0) || (this.f34712X && this.f34701Q0))) {
            D1();
            return true;
        }
        if (i10 == 2) {
            int i11 = N.f29462a;
            C5950a.g(i11 >= 23);
            if (i11 >= 23) {
                try {
                    W1();
                } catch (C5233j e10) {
                    t3.q.i("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    D1();
                    return true;
                }
            }
        }
        K0();
        return false;
    }

    /* access modifiers changed from: protected */
    public final void M1(C5233j jVar) {
        this.f34715Y0 = jVar;
    }

    public final int O() {
        return 8;
    }

    /* access modifiers changed from: protected */
    public final q O0() {
        return this.f34690L;
    }

    /* access modifiers changed from: protected */
    public int P0(f fVar) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public boolean P1(t tVar) {
        return true;
    }

    /* access modifiers changed from: protected */
    public final t Q0() {
        return this.f34704S;
    }

    /* access modifiers changed from: protected */
    public boolean Q1() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean R0() {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean R1(f fVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract float S0(float f10, C5807s sVar, C5807s[] sVarArr);

    /* access modifiers changed from: protected */
    public boolean S1(C5807s sVar) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final MediaFormat T0() {
        return this.f34694N;
    }

    /* access modifiers changed from: protected */
    public abstract int T1(D d10, C5807s sVar);

    /* access modifiers changed from: protected */
    public abstract List<t> U0(D d10, C5807s sVar, boolean z10);

    /* access modifiers changed from: protected */
    public long V0(boolean z10, long j10, long j11) {
        return super.H(j10, j11);
    }

    /* access modifiers changed from: protected */
    public long W0() {
        return this.f34707T0;
    }

    /* access modifiers changed from: protected */
    public abstract q.a X0(t tVar, C5807s sVar, MediaCrypto mediaCrypto, float f10);

    /* access modifiers changed from: protected */
    public final void X1(long j10) {
        C5807s j11 = this.f34718a1.f34743d.j(j10);
        if (j11 == null && this.f34720c1 && this.f34694N != null) {
            j11 = this.f34718a1.f34743d.i();
        }
        if (j11 != null) {
            this.f34674D = j11;
        } else if (!this.f34696O || this.f34674D == null) {
            return;
        }
        s1((C5807s) C5950a.e(this.f34674D), this.f34694N);
        this.f34696O = false;
        this.f34720c1 = false;
    }

    /* access modifiers changed from: protected */
    public final long Y0() {
        return this.f34718a1.f34742c;
    }

    /* access modifiers changed from: protected */
    public final long Z0() {
        return this.f34718a1.f34741b;
    }

    /* access modifiers changed from: protected */
    public float a1() {
        return this.f34686J;
    }

    public final int b(C5807s sVar) {
        try {
            return T1(this.f34723s, sVar);
        } catch (L.c e10) {
            throw T(e10, sVar, 4002);
        }
    }

    /* access modifiers changed from: protected */
    public final u0.a b1() {
        return this.f34680G;
    }

    /* access modifiers changed from: protected */
    public abstract void c1(f fVar);

    public boolean d() {
        return this.f34710V0;
    }

    public boolean f() {
        return this.f34672C != null && (e0() || d1() || (this.f34673C0 != -9223372036854775807L && V().c() < this.f34673C0));
    }

    /* access modifiers changed from: protected */
    public void f0() {
        this.f34672C = null;
        K1(e.f34739e);
        this.f34668A.clear();
        M0();
    }

    /* access modifiers changed from: protected */
    public void g0(boolean z10, boolean z11) {
        this.f34717Z0 = new C6279b();
    }

    /* access modifiers changed from: protected */
    public void i0(long j10, boolean z10) {
        this.f34709U0 = false;
        this.f34710V0 = false;
        this.f34713X0 = false;
        if (this.f34685I0) {
            this.f34729y.v();
            this.f34728x.v();
            this.f34687J0 = false;
            this.f34670B.d();
        } else {
            L0();
        }
        if (this.f34718a1.f34743d.l() > 0) {
            this.f34711W0 = true;
        }
        this.f34718a1.f34743d.c();
        this.f34668A.clear();
    }

    /* access modifiers changed from: protected */
    public final boolean i1() {
        return this.f34685I0;
    }

    /* access modifiers changed from: protected */
    public final boolean j1(C5807s sVar) {
        return this.f34678F == null && S1(sVar);
    }

    public void k(long j10, long j11) {
        boolean z10 = false;
        if (this.f34713X0) {
            this.f34713X0 = false;
            y1();
        }
        C5233j jVar = this.f34715Y0;
        if (jVar == null) {
            try {
                if (this.f34710V0) {
                    E1();
                } else if (this.f34672C != null || B1(2)) {
                    m1();
                    if (this.f34685I0) {
                        I.a("bypassRender");
                        while (v0(j10, j11)) {
                        }
                        I.b();
                    } else if (this.f34690L != null) {
                        long c10 = V().c();
                        I.a("drainAndFeed");
                        while (H0(j10, j11) && O1(c10)) {
                        }
                        while (J0() && O1(c10)) {
                        }
                        I.b();
                    } else {
                        this.f34717Z0.f32409d += s0(j10);
                        B1(1);
                    }
                    this.f34717Z0.c();
                }
            } catch (MediaCodec.CryptoException e10) {
                throw T(e10, this.f34672C, N.Y(e10.getErrorCode()));
            } catch (IllegalStateException e11) {
                if (l1(e11)) {
                    o1(e11);
                    if ((e11 instanceof MediaCodec.CodecException) && ((MediaCodec.CodecException) e11).isRecoverable()) {
                        z10 = true;
                    }
                    if (z10) {
                        D1();
                    }
                    s C02 = C0(e11, Q0());
                    throw U(C02, this.f34672C, z10, C02.f34822c == 1101 ? 4006 : 4003);
                }
                throw e11;
            }
        } else {
            this.f34715Y0 = null;
            throw jVar;
        }
    }

    /* access modifiers changed from: protected */
    public void l0() {
        try {
            D0();
            D1();
        } finally {
            N1((C6422m) null);
        }
    }

    /* access modifiers changed from: protected */
    public void m0() {
    }

    /* access modifiers changed from: protected */
    public final void m1() {
        C5807s sVar;
        boolean z10;
        if (this.f34690L == null && !this.f34685I0 && (sVar = this.f34672C) != null) {
            if (j1(sVar)) {
                f1(sVar);
                return;
            }
            J1(this.f34678F);
            if (this.f34676E == null || h1()) {
                try {
                    C6422m mVar = this.f34676E;
                    if (mVar != null) {
                        if (mVar.getState() != 3) {
                            if (this.f34676E.getState() == 4) {
                            }
                        }
                        if (this.f34676E.i((String) C5950a.i(sVar.f28244o))) {
                            z10 = true;
                            n1(this.f34682H, z10);
                        }
                    }
                    z10 = false;
                    n1(this.f34682H, z10);
                } catch (c e10) {
                    throw T(e10, sVar, 4001);
                }
            }
            MediaCrypto mediaCrypto = this.f34682H;
            if (mediaCrypto != null && this.f34690L == null) {
                mediaCrypto.release();
                this.f34682H = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void n0() {
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003d, code lost:
        if (r5 >= r1) goto L_0x003f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void o0(q3.C5807s[] r13, long r14, long r16, G3.C6479C.b r18) {
        /*
            r12 = this;
            r0 = r12
            E3.A$e r1 = r0.f34718a1
            long r1 = r1.f34742c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x0027
            E3.A$e r1 = new E3.A$e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.K1(r1)
            boolean r1 = r0.f34721d1
            if (r1 == 0) goto L_0x006c
            r12.v1()
            goto L_0x006c
        L_0x0027:
            java.util.ArrayDeque<E3.A$e> r1 = r0.f34668A
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x005c
            long r1 = r0.f34705S0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x003f
            long r5 = r0.f34719b1
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 == 0) goto L_0x005c
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 < 0) goto L_0x005c
        L_0x003f:
            E3.A$e r1 = new E3.A$e
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = r1
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.K1(r1)
            E3.A$e r1 = r0.f34718a1
            long r1 = r1.f34742c
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x006c
            r12.v1()
            goto L_0x006c
        L_0x005c:
            java.util.ArrayDeque<E3.A$e> r1 = r0.f34668A
            E3.A$e r9 = new E3.A$e
            long r3 = r0.f34705S0
            r2 = r9
            r5 = r14
            r7 = r16
            r2.<init>(r3, r5, r7)
            r1.add(r9)
        L_0x006c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6452A.o0(q3.s[], long, long, G3.C$b):void");
    }

    /* access modifiers changed from: protected */
    public abstract void o1(Exception exc);

    /* access modifiers changed from: protected */
    public abstract void p1(String str, q.a aVar, long j10, long j11);

    /* access modifiers changed from: protected */
    public abstract void q1(String str);

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a9, code lost:
        if (G0() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (G0() == false) goto L_0x00ab;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0112 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public z3.C6280c r1(z3.D r12) {
        /*
            r11 = this;
            r0 = 1
            r11.f34711W0 = r0
            q3.s r1 = r12.f32383b
            java.lang.Object r1 = t3.C5950a.e(r1)
            q3.s r1 = (q3.C5807s) r1
            java.lang.String r2 = r1.f28244o
            if (r2 == 0) goto L_0x0113
            java.lang.String r3 = "video/av01"
            boolean r2 = java.util.Objects.equals(r2, r3)
            r3 = 0
            if (r2 == 0) goto L_0x002c
            java.util.List<byte[]> r2 = r1.f28247r
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x002c
            q3.s$b r1 = r1.b()
            q3.s$b r1 = r1.f0(r3)
            q3.s r1 = r1.M()
        L_0x002c:
            r7 = r1
            C3.m r12 = r12.f32382a
            r11.N1(r12)
            r11.f34672C = r7
            boolean r12 = r11.f34685I0
            if (r12 == 0) goto L_0x003b
            r11.f34689K0 = r0
            return r3
        L_0x003b:
            E3.q r12 = r11.f34690L
            if (r12 != 0) goto L_0x0045
            r11.f34700Q = r3
            r11.m1()
            return r3
        L_0x0045:
            E3.t r1 = r11.f34704S
            java.lang.Object r1 = t3.C5950a.e(r1)
            E3.t r1 = (E3.t) r1
            q3.s r2 = r11.f34692M
            java.lang.Object r2 = t3.C5950a.e(r2)
            r6 = r2
            q3.s r6 = (q3.C5807s) r6
            C3.m r2 = r11.f34676E
            C3.m r3 = r11.f34678F
            boolean r2 = r11.I0(r1, r7, r2, r3)
            if (r2 == 0) goto L_0x006f
            r11.F0()
            z3.c r12 = new z3.c
            java.lang.String r5 = r1.f34823a
            r8 = 0
            r9 = 128(0x80, float:1.794E-43)
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            return r12
        L_0x006f:
            C3.m r2 = r11.f34678F
            C3.m r3 = r11.f34676E
            r4 = 0
            if (r2 == r3) goto L_0x0078
            r2 = r0
            goto L_0x0079
        L_0x0078:
            r2 = r4
        L_0x0079:
            if (r2 == 0) goto L_0x0084
            int r3 = t3.N.f29462a
            r5 = 23
            if (r3 < r5) goto L_0x0082
            goto L_0x0084
        L_0x0082:
            r3 = r4
            goto L_0x0085
        L_0x0084:
            r3 = r0
        L_0x0085:
            t3.C5950a.g(r3)
            z3.c r3 = r11.w0(r1, r6, r7)
            int r5 = r3.f32421d
            r8 = 3
            if (r5 == 0) goto L_0x00f8
            r9 = 16
            r10 = 2
            if (r5 == r0) goto L_0x00df
            if (r5 == r10) goto L_0x00b3
            if (r5 != r8) goto L_0x00ad
            boolean r0 = r11.V1(r7)
            if (r0 != 0) goto L_0x00a1
            goto L_0x00fc
        L_0x00a1:
            r11.f34692M = r7
            if (r2 == 0) goto L_0x00fb
            boolean r0 = r11.G0()
            if (r0 != 0) goto L_0x00fb
        L_0x00ab:
            r9 = r10
            goto L_0x00fc
        L_0x00ad:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            r12.<init>()
            throw r12
        L_0x00b3:
            boolean r5 = r11.V1(r7)
            if (r5 != 0) goto L_0x00ba
            goto L_0x00fc
        L_0x00ba:
            r11.f34691L0 = r0
            r11.f34693M0 = r0
            int r5 = r11.f34706T
            if (r5 == r10) goto L_0x00d2
            if (r5 != r0) goto L_0x00d1
            int r5 = r7.f28251v
            int r9 = r6.f28251v
            if (r5 != r9) goto L_0x00d1
            int r5 = r7.f28252w
            int r9 = r6.f28252w
            if (r5 != r9) goto L_0x00d1
            goto L_0x00d2
        L_0x00d1:
            r0 = r4
        L_0x00d2:
            r11.f34716Z = r0
            r11.f34692M = r7
            if (r2 == 0) goto L_0x00fb
            boolean r0 = r11.G0()
            if (r0 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00df:
            boolean r0 = r11.V1(r7)
            if (r0 != 0) goto L_0x00e6
            goto L_0x00fc
        L_0x00e6:
            r11.f34692M = r7
            if (r2 == 0) goto L_0x00f1
            boolean r0 = r11.G0()
            if (r0 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00f1:
            boolean r0 = r11.E0()
            if (r0 != 0) goto L_0x00fb
            goto L_0x00ab
        L_0x00f8:
            r11.F0()
        L_0x00fb:
            r9 = r4
        L_0x00fc:
            int r0 = r3.f32421d
            if (r0 == 0) goto L_0x0112
            E3.q r0 = r11.f34690L
            if (r0 != r12) goto L_0x0108
            int r12 = r11.f34697O0
            if (r12 != r8) goto L_0x0112
        L_0x0108:
            z3.c r12 = new z3.c
            java.lang.String r5 = r1.f34823a
            r8 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)
            return r12
        L_0x0112:
            return r3
        L_0x0113:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Sample MIME type is null."
            r12.<init>(r0)
            r0 = 4005(0xfa5, float:5.612E-42)
            androidx.media3.exoplayer.j r12 = r11.T(r12, r1, r0)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6452A.r1(z3.D):z3.c");
    }

    /* access modifiers changed from: protected */
    public abstract void s1(C5807s sVar, MediaFormat mediaFormat);

    /* access modifiers changed from: protected */
    public void t1(long j10) {
    }

    /* access modifiers changed from: protected */
    public void u1(long j10) {
        this.f34719b1 = j10;
        while (!this.f34668A.isEmpty() && j10 >= this.f34668A.peek().f34740a) {
            K1((e) C5950a.e(this.f34668A.poll()));
            v1();
        }
    }

    /* access modifiers changed from: protected */
    public void v1() {
    }

    /* access modifiers changed from: protected */
    public abstract C6280c w0(t tVar, C5807s sVar, C5807s sVar2);

    /* access modifiers changed from: protected */
    public void w1(f fVar) {
    }

    public void x(int i10, Object obj) {
        if (i10 == 11) {
            this.f34680G = (u0.a) obj;
        } else {
            super.x(i10, obj);
        }
    }

    /* access modifiers changed from: protected */
    public void x1(C5807s sVar) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean z1(long j10, long j11, q qVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C5807s sVar);

    /* renamed from: E3.A$c */
    public static class c extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final String f34733a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f34734b;

        /* renamed from: c  reason: collision with root package name */
        public final t f34735c;

        /* renamed from: d  reason: collision with root package name */
        public final String f34736d;

        /* renamed from: e  reason: collision with root package name */
        public final c f34737e;

        public c(C5807s sVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + sVar, th2, sVar.f28244o, z10, (t) null, b(i10), (c) null);
        }

        private static String b(int i10) {
            String str = i10 < 0 ? "neg_" : "";
            return "androidx.media3.exoplayer.mediacodec" + ".MediaCodecRenderer_" + str + Math.abs(i10);
        }

        /* access modifiers changed from: private */
        public c c(c cVar) {
            return new c(getMessage(), getCause(), this.f34733a, this.f34734b, this.f34735c, this.f34736d, cVar);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public c(C5807s sVar, Throwable th2, boolean z10, t tVar) {
            this("Decoder init failed: " + tVar.f34823a + ", " + sVar, th2, sVar.f28244o, z10, tVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, (c) null);
        }

        private c(String str, Throwable th2, String str2, boolean z10, t tVar, String str3, c cVar) {
            super(str, th2);
            this.f34733a = str2;
            this.f34734b = z10;
            this.f34735c = tVar;
            this.f34736d = str3;
            this.f34737e = cVar;
        }
    }
}
