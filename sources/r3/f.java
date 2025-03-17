package r3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import r3.b;
import t3.C5950a;
import t3.N;

public class f implements b {

    /* renamed from: b  reason: collision with root package name */
    private int f28680b;

    /* renamed from: c  reason: collision with root package name */
    private float f28681c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f28682d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private b.a f28683e;

    /* renamed from: f  reason: collision with root package name */
    private b.a f28684f;

    /* renamed from: g  reason: collision with root package name */
    private b.a f28685g;

    /* renamed from: h  reason: collision with root package name */
    private b.a f28686h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f28687i;

    /* renamed from: j  reason: collision with root package name */
    private e f28688j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f28689k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f28690l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f28691m;

    /* renamed from: n  reason: collision with root package name */
    private long f28692n;

    /* renamed from: o  reason: collision with root package name */
    private long f28693o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f28694p;

    public f() {
        b.a aVar = b.a.f28644e;
        this.f28683e = aVar;
        this.f28684f = aVar;
        this.f28685g = aVar;
        this.f28686h = aVar;
        ByteBuffer byteBuffer = b.f28643a;
        this.f28689k = byteBuffer;
        this.f28690l = byteBuffer.asShortBuffer();
        this.f28691m = byteBuffer;
        this.f28680b = -1;
    }

    public final void a() {
        this.f28681c = 1.0f;
        this.f28682d = 1.0f;
        b.a aVar = b.a.f28644e;
        this.f28683e = aVar;
        this.f28684f = aVar;
        this.f28685g = aVar;
        this.f28686h = aVar;
        ByteBuffer byteBuffer = b.f28643a;
        this.f28689k = byteBuffer;
        this.f28690l = byteBuffer.asShortBuffer();
        this.f28691m = byteBuffer;
        this.f28680b = -1;
        this.f28687i = false;
        this.f28688j = null;
        this.f28692n = 0;
        this.f28693o = 0;
        this.f28694p = false;
    }

    public final ByteBuffer b() {
        int k10;
        e eVar = this.f28688j;
        if (eVar != null && (k10 = eVar.k()) > 0) {
            if (this.f28689k.capacity() < k10) {
                ByteBuffer order = ByteBuffer.allocateDirect(k10).order(ByteOrder.nativeOrder());
                this.f28689k = order;
                this.f28690l = order.asShortBuffer();
            } else {
                this.f28689k.clear();
                this.f28690l.clear();
            }
            eVar.j(this.f28690l);
            this.f28693o += (long) k10;
            this.f28689k.limit(k10);
            this.f28691m = this.f28689k;
        }
        ByteBuffer byteBuffer = this.f28691m;
        this.f28691m = b.f28643a;
        return byteBuffer;
    }

    public final boolean c() {
        return this.f28684f.f28645a != -1 && (Math.abs(this.f28681c - 1.0f) >= 1.0E-4f || Math.abs(this.f28682d - 1.0f) >= 1.0E-4f || this.f28684f.f28645a != this.f28683e.f28645a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.f28688j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean d() {
        /*
            r1 = this;
            boolean r0 = r1.f28694p
            if (r0 == 0) goto L_0x0010
            r3.e r0 = r1.f28688j
            if (r0 == 0) goto L_0x000e
            int r0 = r0.k()
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.f.d():boolean");
    }

    public final void e(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f28692n += (long) remaining;
            ((e) C5950a.e(this.f28688j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    public final b.a f(b.a aVar) {
        if (aVar.f28647c == 2) {
            int i10 = this.f28680b;
            if (i10 == -1) {
                i10 = aVar.f28645a;
            }
            this.f28683e = aVar;
            b.a aVar2 = new b.a(i10, aVar.f28646b, 2);
            this.f28684f = aVar2;
            this.f28687i = true;
            return aVar2;
        }
        throw new b.C0454b(aVar);
    }

    public final void flush() {
        if (c()) {
            b.a aVar = this.f28683e;
            this.f28685g = aVar;
            b.a aVar2 = this.f28684f;
            this.f28686h = aVar2;
            if (this.f28687i) {
                this.f28688j = new e(aVar.f28645a, aVar.f28646b, this.f28681c, this.f28682d, aVar2.f28645a);
            } else {
                e eVar = this.f28688j;
                if (eVar != null) {
                    eVar.i();
                }
            }
        }
        this.f28691m = b.f28643a;
        this.f28692n = 0;
        this.f28693o = 0;
        this.f28694p = false;
    }

    public final void g() {
        e eVar = this.f28688j;
        if (eVar != null) {
            eVar.s();
        }
        this.f28694p = true;
    }

    public final long h(long j10) {
        if (this.f28693o < 1024) {
            return (long) (((double) this.f28681c) * ((double) j10));
        }
        long l10 = this.f28692n - ((long) ((e) C5950a.e(this.f28688j)).l());
        int i10 = this.f28686h.f28645a;
        int i11 = this.f28685g.f28645a;
        if (i10 == i11) {
            return N.Z0(j10, l10, this.f28693o);
        }
        return N.Z0(j10, l10 * ((long) i10), this.f28693o * ((long) i11));
    }

    public final void i(float f10) {
        if (this.f28682d != f10) {
            this.f28682d = f10;
            this.f28687i = true;
        }
    }

    public final void j(float f10) {
        if (this.f28681c != f10) {
            this.f28681c = f10;
            this.f28687i = true;
        }
    }
}
