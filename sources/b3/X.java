package B3;

import B3.C6374x;
import B3.C6375y;
import E3.C6452A;
import E3.C6467o;
import E3.D;
import E3.L;
import E3.q;
import E3.t;
import N3.S;
import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import androidx.media3.exoplayer.u0;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import q3.C5792c;
import q3.C5795f;
import q3.C5807s;
import t3.C5950a;
import t3.N;
import t3.q;
import y3.f;
import z3.C6280c;
import z3.F;

public class X extends C6452A implements F {

    /* renamed from: f1  reason: collision with root package name */
    private final Context f32995f1;
    /* access modifiers changed from: private */

    /* renamed from: g1  reason: collision with root package name */
    public final C6374x.a f32996g1;

    /* renamed from: h1  reason: collision with root package name */
    private final C6375y f32997h1;

    /* renamed from: i1  reason: collision with root package name */
    private final C6467o f32998i1;

    /* renamed from: j1  reason: collision with root package name */
    private int f32999j1;

    /* renamed from: k1  reason: collision with root package name */
    private boolean f33000k1;

    /* renamed from: l1  reason: collision with root package name */
    private boolean f33001l1;

    /* renamed from: m1  reason: collision with root package name */
    private C5807s f33002m1;

    /* renamed from: n1  reason: collision with root package name */
    private C5807s f33003n1;

    /* renamed from: o1  reason: collision with root package name */
    private long f33004o1;

    /* renamed from: p1  reason: collision with root package name */
    private boolean f33005p1;

    /* renamed from: q1  reason: collision with root package name */
    private boolean f33006q1;
    /* access modifiers changed from: private */

    /* renamed from: r1  reason: collision with root package name */
    public boolean f33007r1;

    /* renamed from: s1  reason: collision with root package name */
    private int f33008s1;

    /* renamed from: t1  reason: collision with root package name */
    private boolean f33009t1;

    /* renamed from: u1  reason: collision with root package name */
    private long f33010u1;

    private static final class b {
        public static void a(C6375y yVar, Object obj) {
            yVar.j((AudioDeviceInfo) obj);
        }
    }

    private final class c implements C6375y.d {
        private c() {
        }

        public void a(boolean z10) {
            X.this.f32996g1.I(z10);
        }

        public void b(Exception exc) {
            q.d("MediaCodecAudioRenderer", "Audio sink error", exc);
            X.this.f32996g1.n(exc);
        }

        public void c(C6375y.a aVar) {
            X.this.f32996g1.p(aVar);
        }

        public void d(C6375y.a aVar) {
            X.this.f32996g1.o(aVar);
        }

        public void e(long j10) {
            X.this.f32996g1.H(j10);
        }

        public void f() {
            boolean unused = X.this.f33007r1 = true;
        }

        public void g() {
            u0.a b22 = X.this.b1();
            if (b22 != null) {
                b22.a();
            }
        }

        public void h(int i10, long j10, long j11) {
            X.this.f32996g1.J(i10, j10, j11);
        }

        public void i() {
            X.this.k0();
        }

        public void j() {
            X.this.l2();
        }

        public void k() {
            u0.a a22 = X.this.b1();
            if (a22 != null) {
                a22.b();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public X(Context context, q.b bVar, D d10, boolean z10, Handler handler, C6374x xVar, C6375y yVar) {
        this(context, bVar, d10, z10, handler, xVar, yVar, N.f29462a >= 35 ? new C6467o() : null);
    }

    private static boolean d2(String str) {
        if (N.f29462a < 24 && "OMX.SEC.aac.dec".equals(str) && Constants.REFERRER_API_SAMSUNG.equals(N.f29464c)) {
            String str2 = N.f29463b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    private static boolean e2(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    private static boolean f2() {
        if (N.f29462a == 23) {
            String str = N.f29465d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private int g2(C5807s sVar) {
        C6362k B10 = this.f32997h1.B(sVar);
        if (!B10.f33065a) {
            return 0;
        }
        int i10 = B10.f33066b ? 1536 : 512;
        return B10.f33067c ? i10 | RecyclerView.n.FLAG_MOVED : i10;
    }

    private int h2(t tVar, C5807s sVar) {
        int i10;
        if (!"OMX.google.raw.decoder".equals(tVar.f34823a) || (i10 = N.f29462a) >= 24 || (i10 == 23 && N.I0(this.f32995f1))) {
            return sVar.f28245p;
        }
        return -1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r4 = E3.L.n();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List<E3.t> j2(E3.D r1, q3.C5807s r2, boolean r3, B3.C6375y r4) {
        /*
            java.lang.String r0 = r2.f28244o
            if (r0 != 0) goto L_0x0009
            kb.v r1 = kb.C9967v.E()
            return r1
        L_0x0009:
            boolean r4 = r4.b(r2)
            if (r4 == 0) goto L_0x001a
            E3.t r4 = E3.L.n()
            if (r4 == 0) goto L_0x001a
            kb.v r1 = kb.C9967v.F(r4)
            return r1
        L_0x001a:
            r4 = 0
            java.util.List r1 = E3.L.l(r1, r2, r3, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.X.j2(E3.D, q3.s, boolean, B3.y):java.util.List");
    }

    private void m2(int i10) {
        C6467o oVar;
        this.f32997h1.m(i10);
        if (N.f29462a >= 35 && (oVar = this.f32998i1) != null) {
            oVar.e(i10);
        }
    }

    private void n2() {
        E3.q O02 = O0();
        if (O02 != null && N.f29462a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f33008s1));
            O02.e(bundle);
        }
    }

    private void o2() {
        long v10 = this.f32997h1.v(d());
        if (v10 != Long.MIN_VALUE) {
            if (!this.f33005p1) {
                v10 = Math.max(this.f33004o1, v10);
            }
            this.f33004o1 = v10;
            this.f33005p1 = false;
        }
    }

    /* access modifiers changed from: protected */
    public void E1() {
        try {
            this.f32997h1.t();
            if (W0() != -9223372036854775807L) {
                this.f33010u1 = W0();
            }
        } catch (C6375y.f e10) {
            throw U(e10, e10.f33116c, e10.f33115b, i1() ? 5003 : 5002);
        }
    }

    public long L() {
        if (getState() == 2) {
            o2();
        }
        return this.f33004o1;
    }

    public F R() {
        return this;
    }

    /* access modifiers changed from: protected */
    public float S0(float f10, C5807s sVar, C5807s[] sVarArr) {
        int i10 = -1;
        for (C5807s sVar2 : sVarArr) {
            int i11 = sVar2.f28220E;
            if (i11 != -1) {
                i10 = Math.max(i10, i11);
            }
        }
        if (i10 == -1) {
            return -1.0f;
        }
        return f10 * ((float) i10);
    }

    /* access modifiers changed from: protected */
    public boolean S1(C5807s sVar) {
        if (W().f32389a != 0) {
            int g22 = g2(sVar);
            if ((g22 & 512) != 0) {
                if (W().f32389a == 2 || (g22 & 1024) != 0) {
                    return true;
                }
                if (sVar.f28222G == 0 && sVar.f28223H == 0) {
                    return true;
                }
            }
        }
        return this.f32997h1.b(sVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int T1(E3.D r11, q3.C5807s r12) {
        /*
            r10 = this;
            java.lang.String r0 = r12.f28244o
            boolean r0 = q3.A.n(r0)
            r1 = 0
            if (r0 != 0) goto L_0x000e
            int r11 = androidx.media3.exoplayer.v0.v(r1)
            return r11
        L_0x000e:
            int r0 = r12.f28228M
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = r2
            goto L_0x0016
        L_0x0015:
            r0 = r1
        L_0x0016:
            boolean r3 = E3.C6452A.U1(r12)
            r4 = 8
            r5 = 4
            if (r3 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x0027
            E3.t r0 = E3.L.n()
            if (r0 == 0) goto L_0x003c
        L_0x0027:
            int r0 = r10.g2(r12)
            B3.y r6 = r10.f32997h1
            boolean r6 = r6.b(r12)
            if (r6 == 0) goto L_0x003a
            r11 = 32
            int r11 = androidx.media3.exoplayer.v0.s(r5, r4, r11, r0)
            return r11
        L_0x003a:
            r6 = r0
            goto L_0x003d
        L_0x003c:
            r6 = r1
        L_0x003d:
            java.lang.String r0 = "audio/raw"
            java.lang.String r7 = r12.f28244o
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0054
            B3.y r0 = r10.f32997h1
            boolean r0 = r0.b(r12)
            if (r0 != 0) goto L_0x0054
            int r11 = androidx.media3.exoplayer.v0.v(r2)
            return r11
        L_0x0054:
            B3.y r0 = r10.f32997h1
            int r7 = r12.f28219D
            int r8 = r12.f28220E
            r9 = 2
            q3.s r7 = t3.N.g0(r9, r7, r8)
            boolean r0 = r0.b(r7)
            if (r0 != 0) goto L_0x006a
            int r11 = androidx.media3.exoplayer.v0.v(r2)
            return r11
        L_0x006a:
            B3.y r0 = r10.f32997h1
            java.util.List r11 = j2(r11, r12, r1, r0)
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x007b
            int r11 = androidx.media3.exoplayer.v0.v(r2)
            return r11
        L_0x007b:
            if (r3 != 0) goto L_0x0082
            int r11 = androidx.media3.exoplayer.v0.v(r9)
            return r11
        L_0x0082:
            java.lang.Object r0 = r11.get(r1)
            E3.t r0 = (E3.t) r0
            boolean r3 = r0.n(r12)
            if (r3 != 0) goto L_0x00a7
            r7 = r2
        L_0x008f:
            int r8 = r11.size()
            if (r7 >= r8) goto L_0x00a7
            java.lang.Object r8 = r11.get(r7)
            E3.t r8 = (E3.t) r8
            boolean r9 = r8.n(r12)
            if (r9 == 0) goto L_0x00a4
            r11 = r1
            r0 = r8
            goto L_0x00a9
        L_0x00a4:
            int r7 = r7 + 1
            goto L_0x008f
        L_0x00a7:
            r11 = r2
            r2 = r3
        L_0x00a9:
            if (r2 == 0) goto L_0x00ac
            goto L_0x00ad
        L_0x00ac:
            r5 = 3
        L_0x00ad:
            if (r2 == 0) goto L_0x00b7
            boolean r12 = r0.q(r12)
            if (r12 == 0) goto L_0x00b7
            r4 = 16
        L_0x00b7:
            boolean r12 = r0.f34830h
            if (r12 == 0) goto L_0x00bf
            r12 = 64
            r3 = r12
            goto L_0x00c0
        L_0x00bf:
            r3 = r1
        L_0x00c0:
            if (r11 == 0) goto L_0x00c4
            r1 = 128(0x80, float:1.794E-43)
        L_0x00c4:
            r11 = r1
            r2 = 32
            r0 = r5
            r1 = r4
            r4 = r11
            r5 = r6
            int r11 = androidx.media3.exoplayer.v0.G(r0, r1, r2, r3, r4, r5)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: B3.X.T1(E3.D, q3.s):int");
    }

    /* access modifiers changed from: protected */
    public List<t> U0(D d10, C5807s sVar, boolean z10) {
        return L.m(j2(d10, sVar, z10, this.f32997h1), sVar);
    }

    public long V0(boolean z10, long j10, long j11) {
        long j12 = this.f33010u1;
        if (j12 == -9223372036854775807L) {
            return super.V0(z10, j10, j11);
        }
        long j13 = (long) ((((float) (j12 - j10)) / (e() != null ? e().f27859a : 1.0f)) / 2.0f);
        if (this.f33009t1) {
            j13 -= N.P0(V().c()) - j11;
        }
        return Math.max(10000, j13);
    }

    /* access modifiers changed from: protected */
    public q.a X0(t tVar, C5807s sVar, MediaCrypto mediaCrypto, float f10) {
        this.f32999j1 = i2(tVar, sVar, b0());
        this.f33000k1 = d2(tVar.f34823a);
        this.f33001l1 = e2(tVar.f34823a);
        MediaFormat k22 = k2(sVar, tVar.f34825c, this.f32999j1, f10);
        this.f33003n1 = (!"audio/raw".equals(tVar.f34824b) || "audio/raw".equals(sVar.f28244o)) ? null : sVar;
        return q.a.a(tVar, k22, sVar, mediaCrypto, this.f32998i1);
    }

    /* access modifiers changed from: protected */
    public void c1(f fVar) {
        C5807s sVar;
        if (N.f29462a >= 29 && (sVar = fVar.f32277b) != null && Objects.equals(sVar.f28244o, "audio/opus") && i1()) {
            ByteBuffer byteBuffer = (ByteBuffer) C5950a.e(fVar.f32282g);
            int i10 = ((C5807s) C5950a.e(fVar.f32277b)).f28222G;
            if (byteBuffer.remaining() == 8) {
                this.f32997h1.u(i10, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000));
            }
        }
    }

    public boolean d() {
        return super.d() && this.f32997h1.d();
    }

    public q3.D e() {
        return this.f32997h1.e();
    }

    public boolean f() {
        return this.f32997h1.k() || super.f();
    }

    /* access modifiers changed from: protected */
    public void f0() {
        this.f33006q1 = true;
        this.f33002m1 = null;
        try {
            this.f32997h1.flush();
            try {
                super.f0();
            } finally {
                this.f32996g1.s(this.f34717Z0);
            }
        } catch (Throwable th2) {
            super.f0();
            throw th2;
        } finally {
            this.f32996g1.s(this.f34717Z0);
        }
    }

    public void g(q3.D d10) {
        this.f32997h1.g(d10);
    }

    /* access modifiers changed from: protected */
    public void g0(boolean z10, boolean z11) {
        super.g0(z10, z11);
        this.f32996g1.t(this.f34717Z0);
        if (W().f32390b) {
            this.f32997h1.y();
        } else {
            this.f32997h1.o();
        }
        this.f32997h1.A(a0());
        this.f32997h1.p(V());
    }

    public String getName() {
        return "MediaCodecAudioRenderer";
    }

    /* access modifiers changed from: protected */
    public void i0(long j10, boolean z10) {
        super.i0(j10, z10);
        this.f32997h1.flush();
        this.f33004o1 = j10;
        this.f33007r1 = false;
        this.f33005p1 = true;
    }

    /* access modifiers changed from: protected */
    public int i2(t tVar, C5807s sVar, C5807s[] sVarArr) {
        int h22 = h2(tVar, sVar);
        if (sVarArr.length == 1) {
            return h22;
        }
        for (C5807s sVar2 : sVarArr) {
            if (tVar.e(sVar, sVar2).f32421d != 0) {
                h22 = Math.max(h22, h2(tVar, sVar2));
            }
        }
        return h22;
    }

    /* access modifiers changed from: protected */
    public void j0() {
        C6467o oVar;
        this.f32997h1.release();
        if (N.f29462a >= 35 && (oVar = this.f32998i1) != null) {
            oVar.c();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"InlinedApi"})
    public MediaFormat k2(C5807s sVar, String str, int i10, float f10) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", sVar.f28219D);
        mediaFormat.setInteger("sample-rate", sVar.f28220E);
        t3.t.e(mediaFormat, sVar.f28247r);
        t3.t.d(mediaFormat, "max-input-size", i10);
        int i11 = N.f29462a;
        if (i11 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f10 != -1.0f && !f2()) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (i11 <= 28 && "audio/ac4".equals(sVar.f28244o)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i11 >= 24 && this.f32997h1.r(N.g0(4, sVar.f28219D, sVar.f28220E)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (i11 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i11 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f33008s1));
        }
        return mediaFormat;
    }

    /* access modifiers changed from: protected */
    public void l0() {
        this.f33007r1 = false;
        try {
            super.l0();
        } finally {
            if (this.f33006q1) {
                this.f33006q1 = false;
                this.f32997h1.a();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void l2() {
        this.f33005p1 = true;
    }

    /* access modifiers changed from: protected */
    public void m0() {
        super.m0();
        this.f32997h1.i();
        this.f33009t1 = true;
    }

    /* access modifiers changed from: protected */
    public void n0() {
        o2();
        this.f33009t1 = false;
        this.f32997h1.c();
        super.n0();
    }

    /* access modifiers changed from: protected */
    public void o1(Exception exc) {
        t3.q.d("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f32996g1.m(exc);
    }

    /* access modifiers changed from: protected */
    public void p1(String str, q.a aVar, long j10, long j11) {
        this.f32996g1.q(str, j10, j11);
    }

    /* access modifiers changed from: protected */
    public void q1(String str) {
        this.f32996g1.r(str);
    }

    /* access modifiers changed from: protected */
    public C6280c r1(z3.D d10) {
        C5807s sVar = (C5807s) C5950a.e(d10.f32383b);
        this.f33002m1 = sVar;
        C6280c r12 = super.r1(d10);
        this.f32996g1.u(sVar, r12);
        return r12;
    }

    /* access modifiers changed from: protected */
    public void s1(C5807s sVar, MediaFormat mediaFormat) {
        int i10;
        C5807s sVar2 = this.f33003n1;
        int[] iArr = null;
        if (sVar2 != null) {
            sVar = sVar2;
        } else if (O0() != null) {
            C5950a.e(mediaFormat);
            C5807s M10 = new C5807s.b().s0("audio/raw").m0("audio/raw".equals(sVar.f28244o) ? sVar.f28221F : (N.f29462a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? N.f0(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding")).Y(sVar.f28222G).Z(sVar.f28223H).l0(sVar.f28241l).W(sVar.f28242m).e0(sVar.f28230a).g0(sVar.f28231b).h0(sVar.f28232c).i0(sVar.f28233d).u0(sVar.f28234e).q0(sVar.f28235f).Q(mediaFormat.getInteger("channel-count")).t0(mediaFormat.getInteger("sample-rate")).M();
            if (this.f33000k1 && M10.f28219D == 6 && (i10 = sVar.f28219D) < 6) {
                iArr = new int[i10];
                for (int i11 = 0; i11 < sVar.f28219D; i11++) {
                    iArr[i11] = i11;
                }
            } else if (this.f33001l1) {
                iArr = S.a(M10.f28219D);
            }
            sVar = M10;
        }
        try {
            if (N.f29462a >= 29) {
                if (!i1() || W().f32389a == 0) {
                    this.f32997h1.n(0);
                } else {
                    this.f32997h1.n(W().f32389a);
                }
            }
            this.f32997h1.z(sVar, 0, iArr);
        } catch (C6375y.b e10) {
            throw T(e10, e10.f33108a, 5001);
        }
    }

    /* access modifiers changed from: protected */
    public void t1(long j10) {
        this.f32997h1.w(j10);
    }

    /* access modifiers changed from: protected */
    public void v1() {
        super.v1();
        this.f32997h1.x();
    }

    public boolean w() {
        boolean z10 = this.f33007r1;
        this.f33007r1 = false;
        return z10;
    }

    /* access modifiers changed from: protected */
    public C6280c w0(t tVar, C5807s sVar, C5807s sVar2) {
        C6280c e10 = tVar.e(sVar, sVar2);
        int i10 = e10.f32422e;
        if (j1(sVar2)) {
            i10 |= 32768;
        }
        if (h2(tVar, sVar2) > this.f32999j1) {
            i10 |= 64;
        }
        int i11 = i10;
        return new C6280c(tVar.f34823a, sVar, sVar2, i11 != 0 ? 0 : e10.f32421d, i11);
    }

    public void x(int i10, Object obj) {
        if (i10 == 2) {
            this.f32997h1.h(((Float) C5950a.e(obj)).floatValue());
        } else if (i10 == 3) {
            this.f32997h1.l((C5792c) C5950a.e((C5792c) obj));
        } else if (i10 == 6) {
            this.f32997h1.q((C5795f) C5950a.e((C5795f) obj));
        } else if (i10 != 12) {
            if (i10 == 16) {
                this.f33008s1 = ((Integer) C5950a.e(obj)).intValue();
                n2();
            } else if (i10 == 9) {
                this.f32997h1.C(((Boolean) C5950a.e(obj)).booleanValue());
            } else if (i10 != 10) {
                super.x(i10, obj);
            } else {
                m2(((Integer) C5950a.e(obj)).intValue());
            }
        } else if (N.f29462a >= 23) {
            b.a(this.f32997h1, obj);
        }
    }

    /* access modifiers changed from: protected */
    public boolean z1(long j10, long j11, E3.q qVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, C5807s sVar) {
        C5950a.e(byteBuffer);
        this.f33010u1 = -9223372036854775807L;
        if (this.f33003n1 != null && (i11 & 2) != 0) {
            ((E3.q) C5950a.e(qVar)).p(i10, false);
            return true;
        } else if (z10) {
            if (qVar != null) {
                qVar.p(i10, false);
            }
            this.f34717Z0.f32411f += i12;
            this.f32997h1.x();
            return true;
        } else {
            try {
                if (this.f32997h1.s(byteBuffer, j12, i12)) {
                    if (qVar != null) {
                        qVar.p(i10, false);
                    }
                    this.f34717Z0.f32410e += i12;
                    return true;
                }
                this.f33010u1 = j12;
                return false;
            } catch (C6375y.c e10) {
                throw U(e10, this.f33002m1, e10.f33110b, (!i1() || W().f32389a == 0) ? 5001 : 5004);
            } catch (C6375y.f e11) {
                throw U(e11, sVar, e11.f33115b, (!i1() || W().f32389a == 0) ? 5002 : 5003);
            }
        }
    }

    public X(Context context, q.b bVar, D d10, boolean z10, Handler handler, C6374x xVar, C6375y yVar, C6467o oVar) {
        super(1, bVar, d10, z10, 44100.0f);
        this.f32995f1 = context.getApplicationContext();
        this.f32997h1 = yVar;
        this.f32998i1 = oVar;
        this.f33008s1 = -1000;
        this.f32996g1 = new C6374x.a(handler, xVar);
        this.f33010u1 = -9223372036854775807L;
        yVar.D(new c());
    }
}
