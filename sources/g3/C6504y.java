package G3;

import G3.C6478B;
import G3.C6479C;
import I3.x;
import J3.C6569b;
import androidx.media3.exoplayer.Y;
import java.io.IOException;
import t3.C5950a;
import t3.N;
import z3.J;

/* renamed from: G3.y  reason: case insensitive filesystem */
public final class C6504y implements C6478B, C6478B.a {

    /* renamed from: a  reason: collision with root package name */
    public final C6479C.b f36007a;

    /* renamed from: b  reason: collision with root package name */
    private final long f36008b;

    /* renamed from: c  reason: collision with root package name */
    private final C6569b f36009c;

    /* renamed from: d  reason: collision with root package name */
    private C6479C f36010d;

    /* renamed from: e  reason: collision with root package name */
    private C6478B f36011e;

    /* renamed from: f  reason: collision with root package name */
    private C6478B.a f36012f;

    /* renamed from: g  reason: collision with root package name */
    private a f36013g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f36014h;

    /* renamed from: i  reason: collision with root package name */
    private long f36015i = -9223372036854775807L;

    /* renamed from: G3.y$a */
    public interface a {
        void a(C6479C.b bVar);

        void b(C6479C.b bVar, IOException iOException);
    }

    public C6504y(C6479C.b bVar, C6569b bVar2, long j10) {
        this.f36007a = bVar;
        this.f36009c = bVar2;
        this.f36008b = j10;
    }

    private long q(long j10) {
        long j11 = this.f36015i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    public boolean a() {
        C6478B b10 = this.f36011e;
        return b10 != null && b10.a();
    }

    public boolean b(Y y10) {
        C6478B b10 = this.f36011e;
        return b10 != null && b10.b(y10);
    }

    public long c() {
        return ((C6478B) N.i(this.f36011e)).c();
    }

    public long d() {
        return ((C6478B) N.i(this.f36011e)).d();
    }

    public void e(long j10) {
        ((C6478B) N.i(this.f36011e)).e(j10);
    }

    public void f(C6478B b10) {
        ((C6478B.a) N.i(this.f36012f)).f(this);
        a aVar = this.f36013g;
        if (aVar != null) {
            aVar.a(this.f36007a);
        }
    }

    public long g(x[] xVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j10) {
        long j11 = this.f36015i;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f36008b) ? j10 : j11;
        this.f36015i = -9223372036854775807L;
        return ((C6478B) N.i(this.f36011e)).g(xVarArr, zArr, a0VarArr, zArr2, j12);
    }

    public long i(long j10) {
        return ((C6478B) N.i(this.f36011e)).i(j10);
    }

    public void j(C6478B.a aVar, long j10) {
        this.f36012f = aVar;
        C6478B b10 = this.f36011e;
        if (b10 != null) {
            b10.j(this, q(this.f36008b));
        }
    }

    public void k(C6479C.b bVar) {
        long q10 = q(this.f36008b);
        C6478B a10 = ((C6479C) C5950a.e(this.f36010d)).a(bVar, this.f36009c, q10);
        this.f36011e = a10;
        if (this.f36012f != null) {
            a10.j(this, q10);
        }
    }

    public long l() {
        return ((C6478B) N.i(this.f36011e)).l();
    }

    public long m() {
        return this.f36015i;
    }

    public long n() {
        return this.f36008b;
    }

    public void o() {
        try {
            C6478B b10 = this.f36011e;
            if (b10 != null) {
                b10.o();
                return;
            }
            C6479C c10 = this.f36010d;
            if (c10 != null) {
                c10.j();
            }
        } catch (IOException e10) {
            a aVar = this.f36013g;
            if (aVar == null) {
                throw e10;
            } else if (!this.f36014h) {
                this.f36014h = true;
                aVar.b(this.f36007a, e10);
            }
        }
    }

    public long p(long j10, J j11) {
        return ((C6478B) N.i(this.f36011e)).p(j10, j11);
    }

    /* renamed from: r */
    public void h(C6478B b10) {
        ((C6478B.a) N.i(this.f36012f)).h(this);
    }

    public k0 s() {
        return ((C6478B) N.i(this.f36011e)).s();
    }

    public void t(long j10) {
        this.f36015i = j10;
    }

    public void u(long j10, boolean z10) {
        ((C6478B) N.i(this.f36011e)).u(j10, z10);
    }

    public void v() {
        if (this.f36011e != null) {
            ((C6479C) C5950a.e(this.f36010d)).o(this.f36011e);
        }
    }

    public void w(C6479C c10) {
        C5950a.g(this.f36010d == null);
        this.f36010d = c10;
    }
}
