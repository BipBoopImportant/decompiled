package G3;

import G3.C6478B;
import G3.C6498s;
import I3.x;
import android.net.Uri;
import androidx.media3.exoplayer.Y;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10098b;
import ob.C10099c;
import ob.C10101e;
import ob.C10102f;
import q3.C5807s;
import q3.K;
import y3.f;
import z3.D;
import z3.J;

/* renamed from: G3.t  reason: case insensitive filesystem */
final class C6499t implements C6478B {

    /* renamed from: a  reason: collision with root package name */
    private final Uri f35978a;

    /* renamed from: b  reason: collision with root package name */
    private final C6498s f35979b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final k0 f35980c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f35981d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final AtomicBoolean f35982e = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final AtomicReference<Throwable> f35983f = new AtomicReference<>();

    /* renamed from: g  reason: collision with root package name */
    private C10101e<?> f35984g;

    /* renamed from: G3.t$a */
    class a implements C10098b<Object> {
        a() {
        }

        public void a(Object obj) {
            C6499t.this.f35982e.set(true);
        }

        public void b(Throwable th2) {
            C6499t.this.f35983f.set(th2);
        }
    }

    /* renamed from: G3.t$b */
    private final class b implements a0 {

        /* renamed from: a  reason: collision with root package name */
        private int f35986a = 0;

        public b() {
        }

        public boolean f() {
            return C6499t.this.f35982e.get();
        }

        public void g() {
            Throwable th2 = (Throwable) C6499t.this.f35983f.get();
            if (th2 != null) {
                throw new IOException(th2);
            }
        }

        public int h(D d10, f fVar, int i10) {
            int i11 = this.f35986a;
            if (i11 == 2) {
                fVar.n(4);
                return -4;
            } else if ((i10 & 2) != 0 || i11 == 0) {
                d10.f32383b = C6499t.this.f35980c.b(0).a(0);
                this.f35986a = 1;
                return -5;
            } else if (!C6499t.this.f35982e.get()) {
                return -3;
            } else {
                int length = C6499t.this.f35981d.length;
                fVar.n(1);
                fVar.f32281f = 0;
                if ((i10 & 4) == 0) {
                    fVar.K(length);
                    fVar.f32279d.put(C6499t.this.f35981d, 0, length);
                }
                if ((i10 & 1) == 0) {
                    this.f35986a = 2;
                }
                return -4;
            }
        }

        public int i(long j10) {
            return 0;
        }
    }

    public C6499t(Uri uri, String str, C6498s sVar) {
        this.f35978a = uri;
        C5807s M10 = new C5807s.b().s0(str).M();
        this.f35979b = sVar;
        this.f35980c = new k0(new K(M10));
        this.f35981d = uri.toString().getBytes(StandardCharsets.UTF_8);
    }

    public boolean a() {
        return !this.f35982e.get();
    }

    public boolean b(Y y10) {
        return !this.f35982e.get();
    }

    public long c() {
        return this.f35982e.get() ? Long.MIN_VALUE : 0;
    }

    public long d() {
        return this.f35982e.get() ? Long.MIN_VALUE : 0;
    }

    public void e(long j10) {
    }

    public long g(x[] xVarArr, boolean[] zArr, a0[] a0VarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < xVarArr.length; i10++) {
            if (a0VarArr[i10] != null && (xVarArr[i10] == null || !zArr[i10])) {
                a0VarArr[i10] = null;
            }
            if (a0VarArr[i10] == null && xVarArr[i10] != null) {
                a0VarArr[i10] = new b();
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    public long i(long j10) {
        return j10;
    }

    public void j(C6478B.a aVar, long j10) {
        aVar.f(this);
        C10101e<?> a10 = this.f35979b.a(new C6498s.a(this.f35978a));
        this.f35984g = a10;
        C10099c.a(a10, new a(), C10102f.a());
    }

    public long l() {
        return -9223372036854775807L;
    }

    public void n() {
        C10101e<?> eVar = this.f35984g;
        if (eVar != null) {
            eVar.cancel(false);
        }
    }

    public void o() {
    }

    public long p(long j10, J j11) {
        return j10;
    }

    public k0 s() {
        return this.f35980c;
    }

    public void u(long j10, boolean z10) {
    }
}
