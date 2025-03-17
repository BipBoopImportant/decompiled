package B3;

import java.nio.ByteBuffer;
import r3.b;
import r3.d;
import t3.N;

final class c0 extends d {

    /* renamed from: i  reason: collision with root package name */
    private int f33032i;

    /* renamed from: j  reason: collision with root package name */
    private int f33033j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f33034k;

    /* renamed from: l  reason: collision with root package name */
    private int f33035l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f33036m = N.f29467f;

    /* renamed from: n  reason: collision with root package name */
    private int f33037n;

    /* renamed from: o  reason: collision with root package name */
    private long f33038o;

    public ByteBuffer b() {
        int i10;
        if (super.d() && (i10 = this.f33037n) > 0) {
            m(i10).put(this.f33036m, 0, this.f33037n).flip();
            this.f33037n = 0;
        }
        return super.b();
    }

    public boolean d() {
        return super.d() && this.f33037n == 0;
    }

    public void e(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 != 0) {
            int min = Math.min(i10, this.f33035l);
            this.f33038o += (long) (min / this.f28650b.f28648d);
            this.f33035l -= min;
            byteBuffer.position(position + min);
            if (this.f33035l <= 0) {
                int i11 = i10 - min;
                int length = (this.f33037n + i11) - this.f33036m.length;
                ByteBuffer m10 = m(length);
                int p10 = N.p(length, 0, this.f33037n);
                m10.put(this.f33036m, 0, p10);
                int p11 = N.p(length - p10, 0, i11);
                byteBuffer.limit(byteBuffer.position() + p11);
                m10.put(byteBuffer);
                byteBuffer.limit(limit);
                int i12 = i11 - p11;
                int i13 = this.f33037n - p10;
                this.f33037n = i13;
                byte[] bArr = this.f33036m;
                System.arraycopy(bArr, p10, bArr, 0, i13);
                byteBuffer.get(this.f33036m, this.f33037n, i12);
                this.f33037n += i12;
                m10.flip();
            }
        }
    }

    public b.a i(b.a aVar) {
        if (aVar.f28647c == 2) {
            this.f33034k = true;
            return (this.f33032i == 0 && this.f33033j == 0) ? b.a.f28644e : aVar;
        }
        throw new b.C0454b(aVar);
    }

    /* access modifiers changed from: protected */
    public void j() {
        if (this.f33034k) {
            this.f33034k = false;
            int i10 = this.f33033j;
            int i11 = this.f28650b.f28648d;
            this.f33036m = new byte[(i10 * i11)];
            this.f33035l = this.f33032i * i11;
        }
        this.f33037n = 0;
    }

    /* access modifiers changed from: protected */
    public void k() {
        if (this.f33034k) {
            int i10 = this.f33037n;
            if (i10 > 0) {
                this.f33038o += (long) (i10 / this.f28650b.f28648d);
            }
            this.f33037n = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        this.f33036m = N.f29467f;
    }

    public long n() {
        return this.f33038o;
    }

    public void o() {
        this.f33038o = 0;
    }

    public void p(int i10, int i11) {
        this.f33032i = i10;
        this.f33033j = i11;
    }
}
