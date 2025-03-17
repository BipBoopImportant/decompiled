package F3;

import G3.C6479C;
import W3.C6711a;
import W3.C6712b;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.C5228e;
import androidx.media3.exoplayer.v0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import q3.C5807s;
import q3.z;
import t3.C5950a;
import t3.N;
import z3.D;

public final class c extends C5228e implements Handler.Callback {

    /* renamed from: A  reason: collision with root package name */
    private z f35347A;

    /* renamed from: B  reason: collision with root package name */
    private long f35348B;

    /* renamed from: r  reason: collision with root package name */
    private final C6468a f35349r;

    /* renamed from: s  reason: collision with root package name */
    private final b f35350s;

    /* renamed from: t  reason: collision with root package name */
    private final Handler f35351t;

    /* renamed from: u  reason: collision with root package name */
    private final C6712b f35352u;

    /* renamed from: v  reason: collision with root package name */
    private final boolean f35353v;

    /* renamed from: w  reason: collision with root package name */
    private C6711a f35354w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f35355x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f35356y;

    /* renamed from: z  reason: collision with root package name */
    private long f35357z;

    public c(b bVar, Looper looper) {
        this(bVar, looper, C6468a.f35346a);
    }

    private void t0(z zVar, List<z.b> list) {
        for (int i10 = 0; i10 < zVar.e(); i10++) {
            C5807s j02 = zVar.d(i10).j0();
            if (j02 == null || !this.f35349r.b(j02)) {
                list.add(zVar.d(i10));
            } else {
                C6711a a10 = this.f35349r.a(j02);
                byte[] bArr = (byte[]) C5950a.e(zVar.d(i10).m3());
                this.f35352u.v();
                this.f35352u.K(bArr.length);
                ((ByteBuffer) N.i(this.f35352u.f32279d)).put(bArr);
                this.f35352u.L();
                z a11 = a10.a(this.f35352u);
                if (a11 != null) {
                    t0(a11, list);
                }
            }
        }
    }

    private long u0(long j10) {
        boolean z10 = false;
        C5950a.g(j10 != -9223372036854775807L);
        if (this.f35348B != -9223372036854775807L) {
            z10 = true;
        }
        C5950a.g(z10);
        return j10 - this.f35348B;
    }

    private void v0(z zVar) {
        Handler handler = this.f35351t;
        if (handler != null) {
            handler.obtainMessage(1, zVar).sendToTarget();
        } else {
            w0(zVar);
        }
    }

    private void w0(z zVar) {
        this.f35350s.h(zVar);
    }

    private boolean x0(long j10) {
        boolean z10;
        z zVar = this.f35347A;
        if (zVar == null || (!this.f35353v && zVar.f28557b > u0(j10))) {
            z10 = false;
        } else {
            v0(this.f35347A);
            this.f35347A = null;
            z10 = true;
        }
        if (this.f35355x && this.f35347A == null) {
            this.f35356y = true;
        }
        return z10;
    }

    private void y0() {
        if (!this.f35355x && this.f35347A == null) {
            this.f35352u.v();
            D X10 = X();
            int q02 = q0(X10, this.f35352u, 0);
            if (q02 == -4) {
                if (this.f35352u.D()) {
                    this.f35355x = true;
                } else if (this.f35352u.f32281f >= Z()) {
                    C6712b bVar = this.f35352u;
                    bVar.f40530j = this.f35357z;
                    bVar.L();
                    z a10 = ((C6711a) N.i(this.f35354w)).a(this.f35352u);
                    if (a10 != null) {
                        ArrayList arrayList = new ArrayList(a10.e());
                        t0(a10, arrayList);
                        if (!arrayList.isEmpty()) {
                            this.f35347A = new z(u0(this.f35352u.f32281f), (List<? extends z.b>) arrayList);
                        }
                    }
                }
            } else if (q02 == -5) {
                this.f35357z = ((C5807s) C5950a.e(X10.f32383b)).f28249t;
            }
        }
    }

    public int b(C5807s sVar) {
        if (!this.f35349r.b(sVar)) {
            return v0.v(0);
        }
        return v0.v(sVar.f28228M == 0 ? 4 : 2);
    }

    public boolean d() {
        return this.f35356y;
    }

    public boolean f() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void f0() {
        this.f35347A = null;
        this.f35354w = null;
        this.f35348B = -9223372036854775807L;
    }

    public String getName() {
        return "MetadataRenderer";
    }

    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            w0((z) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: protected */
    public void i0(long j10, boolean z10) {
        this.f35347A = null;
        this.f35355x = false;
        this.f35356y = false;
    }

    public void k(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            y0();
            z10 = x0(j10);
        }
    }

    /* access modifiers changed from: protected */
    public void o0(C5807s[] sVarArr, long j10, long j11, C6479C.b bVar) {
        this.f35354w = this.f35349r.a(sVarArr[0]);
        z zVar = this.f35347A;
        if (zVar != null) {
            this.f35347A = zVar.c((zVar.f28557b + this.f35348B) - j11);
        }
        this.f35348B = j11;
    }

    public c(b bVar, Looper looper, C6468a aVar) {
        this(bVar, looper, aVar, false);
    }

    public c(b bVar, Looper looper, C6468a aVar, boolean z10) {
        super(5);
        Handler handler;
        this.f35350s = (b) C5950a.e(bVar);
        if (looper == null) {
            handler = null;
        } else {
            handler = N.z(looper, this);
        }
        this.f35351t = handler;
        this.f35349r = (C6468a) C5950a.e(aVar);
        this.f35353v = z10;
        this.f35352u = new C6712b();
        this.f35348B = -9223372036854775807L;
    }
}
