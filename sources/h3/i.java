package H3;

import G3.C6479C;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.C5228e;
import androidx.media3.exoplayer.v0;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Objects;
import k4.C8418b;
import k4.C8421e;
import k4.C8427k;
import k4.C8428l;
import k4.C8429m;
import k4.C8432p;
import k4.q;
import kb.C9967v;
import q3.A;
import q3.C5807s;
import s3.a;
import s3.b;
import t3.C5950a;
import t3.N;
import y3.f;
import z3.D;

public final class i extends C5228e implements Handler.Callback {

    /* renamed from: A  reason: collision with root package name */
    private q f36380A;

    /* renamed from: B  reason: collision with root package name */
    private int f36381B;

    /* renamed from: C  reason: collision with root package name */
    private final Handler f36382C;

    /* renamed from: D  reason: collision with root package name */
    private final h f36383D;

    /* renamed from: E  reason: collision with root package name */
    private final D f36384E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f36385F;

    /* renamed from: G  reason: collision with root package name */
    private boolean f36386G;

    /* renamed from: H  reason: collision with root package name */
    private C5807s f36387H;

    /* renamed from: I  reason: collision with root package name */
    private long f36388I;

    /* renamed from: J  reason: collision with root package name */
    private long f36389J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f36390K;

    /* renamed from: L  reason: collision with root package name */
    private IOException f36391L;

    /* renamed from: r  reason: collision with root package name */
    private final C8418b f36392r;

    /* renamed from: s  reason: collision with root package name */
    private final f f36393s;

    /* renamed from: t  reason: collision with root package name */
    private C6523a f36394t;

    /* renamed from: u  reason: collision with root package name */
    private final g f36395u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f36396v;

    /* renamed from: w  reason: collision with root package name */
    private int f36397w;

    /* renamed from: x  reason: collision with root package name */
    private C8428l f36398x;

    /* renamed from: y  reason: collision with root package name */
    private C8432p f36399y;

    /* renamed from: z  reason: collision with root package name */
    private q f36400z;

    public i(h hVar, Looper looper) {
        this(hVar, looper, g.f36378a);
    }

    private void A0() {
        this.f36396v = true;
        C8428l a10 = this.f36395u.a((C5807s) C5950a.e(this.f36387H));
        this.f36398x = a10;
        a10.d(Z());
    }

    private void B0(b bVar) {
        this.f36383D.k(bVar.f29078a);
        this.f36383D.x(bVar);
    }

    private static boolean C0(C5807s sVar) {
        return Objects.equals(sVar.f28244o, "application/x-media3-cues");
    }

    private boolean D0(long j10) {
        if (this.f36385F || q0(this.f36384E, this.f36393s, 0) != -4) {
            return false;
        }
        if (this.f36393s.D()) {
            this.f36385F = true;
            return false;
        }
        this.f36393s.L();
        ByteBuffer byteBuffer = (ByteBuffer) C5950a.e(this.f36393s.f32279d);
        C8421e a10 = this.f36392r.a(this.f36393s.f32281f, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.f36393s.v();
        return this.f36394t.a(a10, j10);
    }

    private void E0() {
        this.f36399y = null;
        this.f36381B = -1;
        q qVar = this.f36400z;
        if (qVar != null) {
            qVar.J();
            this.f36400z = null;
        }
        q qVar2 = this.f36380A;
        if (qVar2 != null) {
            qVar2.J();
            this.f36380A = null;
        }
    }

    private void F0() {
        E0();
        ((C8428l) C5950a.e(this.f36398x)).release();
        this.f36398x = null;
        this.f36397w = 0;
    }

    private void G0(long j10) {
        boolean D02 = D0(j10);
        long d10 = this.f36394t.d(this.f36388I);
        int i10 = (d10 > Long.MIN_VALUE ? 1 : (d10 == Long.MIN_VALUE ? 0 : -1));
        if (i10 == 0 && this.f36385F && !D02) {
            this.f36386G = true;
        }
        if (i10 != 0 && d10 <= j10) {
            D02 = true;
        }
        if (D02) {
            C9967v<a> b10 = this.f36394t.b(j10);
            long c10 = this.f36394t.c(j10);
            K0(new b(b10, x0(c10)));
            this.f36394t.e(c10);
        }
        this.f36388I = j10;
    }

    private void H0(long j10) {
        boolean z10;
        this.f36388I = j10;
        if (this.f36380A == null) {
            ((C8428l) C5950a.e(this.f36398x)).b(j10);
            try {
                this.f36380A = (q) ((C8428l) C5950a.e(this.f36398x)).a();
            } catch (C8429m e10) {
                y0(e10);
                return;
            }
        }
        if (getState() == 2) {
            if (this.f36400z != null) {
                long w02 = w0();
                z10 = false;
                while (w02 <= j10) {
                    this.f36381B++;
                    w02 = w0();
                    z10 = true;
                }
            } else {
                z10 = false;
            }
            q qVar = this.f36380A;
            if (qVar != null) {
                if (qVar.D()) {
                    if (!z10 && w0() == Long.MAX_VALUE) {
                        if (this.f36397w == 2) {
                            I0();
                        } else {
                            E0();
                            this.f36386G = true;
                        }
                    }
                } else if (qVar.f32287b <= j10) {
                    q qVar2 = this.f36400z;
                    if (qVar2 != null) {
                        qVar2.J();
                    }
                    this.f36381B = qVar.a(j10);
                    this.f36400z = qVar;
                    this.f36380A = null;
                    z10 = true;
                }
            }
            if (z10) {
                C5950a.e(this.f36400z);
                K0(new b(this.f36400z.b(j10), x0(v0(j10))));
            }
            if (this.f36397w != 2) {
                while (!this.f36385F) {
                    try {
                        C8432p pVar = this.f36399y;
                        if (pVar == null) {
                            pVar = (C8432p) ((C8428l) C5950a.e(this.f36398x)).e();
                            if (pVar != null) {
                                this.f36399y = pVar;
                            } else {
                                return;
                            }
                        }
                        if (this.f36397w == 1) {
                            pVar.I(4);
                            ((C8428l) C5950a.e(this.f36398x)).c(pVar);
                            this.f36399y = null;
                            this.f36397w = 2;
                            return;
                        }
                        int q02 = q0(this.f36384E, pVar, 0);
                        if (q02 == -4) {
                            if (pVar.D()) {
                                this.f36385F = true;
                                this.f36396v = false;
                            } else {
                                C5807s sVar = this.f36384E.f32383b;
                                if (sVar != null) {
                                    pVar.f54123j = sVar.f28249t;
                                    pVar.L();
                                    this.f36396v &= !pVar.F();
                                } else {
                                    return;
                                }
                            }
                            if (!this.f36396v) {
                                ((C8428l) C5950a.e(this.f36398x)).c(pVar);
                                this.f36399y = null;
                            }
                        } else if (q02 == -3) {
                            return;
                        }
                    } catch (C8429m e11) {
                        y0(e11);
                        return;
                    }
                }
            }
        }
    }

    private void I0() {
        F0();
        A0();
    }

    private void K0(b bVar) {
        Handler handler = this.f36382C;
        if (handler != null) {
            handler.obtainMessage(1, bVar).sendToTarget();
        } else {
            B0(bVar);
        }
    }

    private void t0() {
        boolean z10 = this.f36390K || Objects.equals(this.f36387H.f28244o, "application/cea-608") || Objects.equals(this.f36387H.f28244o, "application/x-mp4-cea-608") || Objects.equals(this.f36387H.f28244o, "application/cea-708");
        C5950a.h(z10, "Legacy decoding is disabled, can't handle " + this.f36387H.f28244o + " samples (expected " + "application/x-media3-cues" + ").");
    }

    private void u0() {
        K0(new b(C9967v.E(), x0(this.f36388I)));
    }

    private long v0(long j10) {
        int a10 = this.f36400z.a(j10);
        if (a10 == 0 || this.f36400z.m() == 0) {
            return this.f36400z.f32287b;
        }
        if (a10 != -1) {
            return this.f36400z.j(a10 - 1);
        }
        q qVar = this.f36400z;
        return qVar.j(qVar.m() - 1);
    }

    private long w0() {
        if (this.f36381B == -1) {
            return Long.MAX_VALUE;
        }
        C5950a.e(this.f36400z);
        if (this.f36381B >= this.f36400z.m()) {
            return Long.MAX_VALUE;
        }
        return this.f36400z.j(this.f36381B);
    }

    private long x0(long j10) {
        C5950a.g(j10 != -9223372036854775807L);
        return j10 - c0();
    }

    private void y0(C8429m mVar) {
        t3.q.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f36387H, mVar);
        u0();
        I0();
    }

    private static boolean z0(C8427k kVar, long j10) {
        return kVar == null || kVar.j(kVar.m() - 1) <= j10;
    }

    public void J0(long j10) {
        C5950a.g(D());
        this.f36389J = j10;
    }

    public int b(C5807s sVar) {
        if (!C0(sVar) && !this.f36395u.b(sVar)) {
            return A.p(sVar.f28244o) ? v0.v(1) : v0.v(0);
        }
        return v0.v(sVar.f28228M == 0 ? 4 : 2);
    }

    public boolean d() {
        return this.f36386G;
    }

    public boolean f() {
        if (this.f36387H == null) {
            return true;
        }
        if (this.f36391L == null) {
            try {
                z();
            } catch (IOException e10) {
                this.f36391L = e10;
            }
        }
        if (this.f36391L != null) {
            if (C0((C5807s) C5950a.e(this.f36387H))) {
                return ((C6523a) C5950a.e(this.f36394t)).d(this.f36388I) != Long.MIN_VALUE;
            }
            if (this.f36386G || (this.f36385F && z0(this.f36400z, this.f36388I) && z0(this.f36380A, this.f36388I) && this.f36399y != null)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void f0() {
        this.f36387H = null;
        this.f36389J = -9223372036854775807L;
        u0();
        this.f36388I = -9223372036854775807L;
        if (this.f36398x != null) {
            F0();
        }
    }

    public String getName() {
        return "TextRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            B0((b) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void i0(long j10, boolean z10) {
        this.f36388I = j10;
        C6523a aVar = this.f36394t;
        if (aVar != null) {
            aVar.clear();
        }
        u0();
        this.f36385F = false;
        this.f36386G = false;
        this.f36389J = -9223372036854775807L;
        C5807s sVar = this.f36387H;
        if (sVar != null && !C0(sVar)) {
            if (this.f36397w != 0) {
                I0();
                return;
            }
            E0();
            C8428l lVar = (C8428l) C5950a.e(this.f36398x);
            lVar.flush();
            lVar.d(Z());
        }
    }

    public void k(long j10, long j11) {
        if (D()) {
            long j12 = this.f36389J;
            if (j12 != -9223372036854775807L && j10 >= j12) {
                E0();
                this.f36386G = true;
            }
        }
        if (!this.f36386G) {
            if (C0((C5807s) C5950a.e(this.f36387H))) {
                C5950a.e(this.f36394t);
                G0(j10);
                return;
            }
            t0();
            H0(j10);
        }
    }

    /* access modifiers changed from: protected */
    public void o0(C5807s[] sVarArr, long j10, long j11, C6479C.b bVar) {
        C5807s sVar = sVarArr[0];
        this.f36387H = sVar;
        if (!C0(sVar)) {
            t0();
            if (this.f36398x != null) {
                this.f36397w = 1;
            } else {
                A0();
            }
        } else {
            this.f36394t = this.f36387H.f28225J == 1 ? new e() : new f();
        }
    }

    public i(h hVar, Looper looper, g gVar) {
        super(3);
        Handler handler;
        this.f36383D = (h) C5950a.e(hVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = N.z(looper, this);
        }
        this.f36382C = handler;
        this.f36395u = gVar;
        this.f36392r = new C8418b();
        this.f36393s = new f(1);
        this.f36384E = new D();
        this.f36389J = -9223372036854775807L;
        this.f36388I = -9223372036854775807L;
        this.f36390K = false;
    }
}
