package A7;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f32729a = new byte[256];

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f32730b;

    /* renamed from: c  reason: collision with root package name */
    private c f32731c;

    /* renamed from: d  reason: collision with root package name */
    private int f32732d = 0;

    private boolean b() {
        return this.f32731c.f32717b != 0;
    }

    private int d() {
        try {
            return this.f32730b.get() & 255;
        } catch (Exception unused) {
            this.f32731c.f32717b = 1;
            return 0;
        }
    }

    private void e() {
        this.f32731c.f32719d.f32705a = n();
        this.f32731c.f32719d.f32706b = n();
        this.f32731c.f32719d.f32707c = n();
        this.f32731c.f32719d.f32708d = n();
        int d10 = d();
        boolean z10 = false;
        boolean z11 = (d10 & 128) != 0;
        int pow = (int) Math.pow(2.0d, (double) ((d10 & 7) + 1));
        b bVar = this.f32731c.f32719d;
        if ((d10 & 64) != 0) {
            z10 = true;
        }
        bVar.f32709e = z10;
        if (z11) {
            bVar.f32715k = g(pow);
        } else {
            bVar.f32715k = null;
        }
        this.f32731c.f32719d.f32714j = this.f32730b.position();
        r();
        if (!b()) {
            c cVar = this.f32731c;
            cVar.f32718c++;
            cVar.f32720e.add(cVar.f32719d);
        }
    }

    private void f() {
        int d10 = d();
        this.f32732d = d10;
        if (d10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    int i12 = this.f32732d;
                    if (i10 < i12) {
                        i11 = i12 - i10;
                        this.f32730b.get(this.f32729a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        Log.d("GifHeaderParser", "Error Reading Block n: " + i10 + " count: " + i11 + " blockSize: " + this.f32732d, e10);
                    }
                    this.f32731c.f32717b = 1;
                    return;
                }
            }
        }
    }

    private int[] g(int i10) {
        byte[] bArr = new byte[(i10 * 3)];
        int[] iArr = null;
        try {
            this.f32730b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = i12 + 2;
                i12 += 3;
                int i14 = i11 + 1;
                iArr[i11] = ((bArr[i12 + 1] & 255) << 8) | ((bArr[i12] & 255) << 16) | -16777216 | (bArr[i13] & 255);
                i11 = i14;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f32731c.f32717b = 1;
        }
        return iArr;
    }

    private void h() {
        i(Integer.MAX_VALUE);
    }

    private void i(int i10) {
        boolean z10 = false;
        while (!z10 && !b() && this.f32731c.f32718c <= i10) {
            int d10 = d();
            if (d10 == 33) {
                int d11 = d();
                if (d11 == 1) {
                    q();
                } else if (d11 == 249) {
                    this.f32731c.f32719d = new b();
                    j();
                } else if (d11 == 254) {
                    q();
                } else if (d11 != 255) {
                    q();
                } else {
                    f();
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < 11; i11++) {
                        sb2.append((char) this.f32729a[i11]);
                    }
                    if (sb2.toString().equals("NETSCAPE2.0")) {
                        m();
                    } else {
                        q();
                    }
                }
            } else if (d10 == 44) {
                c cVar = this.f32731c;
                if (cVar.f32719d == null) {
                    cVar.f32719d = new b();
                }
                e();
            } else if (d10 != 59) {
                this.f32731c.f32717b = 1;
            } else {
                z10 = true;
            }
        }
    }

    private void j() {
        d();
        int d10 = d();
        b bVar = this.f32731c.f32719d;
        int i10 = (d10 & 28) >> 2;
        bVar.f32711g = i10;
        boolean z10 = true;
        if (i10 == 0) {
            bVar.f32711g = 1;
        }
        if ((d10 & 1) == 0) {
            z10 = false;
        }
        bVar.f32710f = z10;
        int n10 = n();
        if (n10 < 2) {
            n10 = 10;
        }
        b bVar2 = this.f32731c.f32719d;
        bVar2.f32713i = n10 * 10;
        bVar2.f32712h = d();
        d();
    }

    private void k() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < 6; i10++) {
            sb2.append((char) d());
        }
        if (!sb2.toString().startsWith("GIF")) {
            this.f32731c.f32717b = 1;
            return;
        }
        l();
        if (this.f32731c.f32723h && !b()) {
            c cVar = this.f32731c;
            cVar.f32716a = g(cVar.f32724i);
            c cVar2 = this.f32731c;
            cVar2.f32727l = cVar2.f32716a[cVar2.f32725j];
        }
    }

    private void l() {
        this.f32731c.f32721f = n();
        this.f32731c.f32722g = n();
        int d10 = d();
        c cVar = this.f32731c;
        cVar.f32723h = (d10 & 128) != 0;
        cVar.f32724i = (int) Math.pow(2.0d, (double) ((d10 & 7) + 1));
        this.f32731c.f32725j = d();
        this.f32731c.f32726k = d();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m() {
        /*
            r3 = this;
        L_0x0000:
            r3.f()
            byte[] r0 = r3.f32729a
            r1 = 0
            byte r1 = r0[r1]
            r2 = 1
            if (r1 != r2) goto L_0x001b
            byte r1 = r0[r2]
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 2
            byte r0 = r0[r2]
            r0 = r0 & 255(0xff, float:3.57E-43)
            A7.c r2 = r3.f32731c
            int r0 = r0 << 8
            r0 = r0 | r1
            r2.f32728m = r0
        L_0x001b:
            int r0 = r3.f32732d
            if (r0 <= 0) goto L_0x0025
            boolean r0 = r3.b()
            if (r0 == 0) goto L_0x0000
        L_0x0025:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A7.d.m():void");
    }

    private int n() {
        return this.f32730b.getShort();
    }

    private void o() {
        this.f32730b = null;
        Arrays.fill(this.f32729a, (byte) 0);
        this.f32731c = new c();
        this.f32732d = 0;
    }

    private void q() {
        int d10;
        do {
            d10 = d();
            this.f32730b.position(Math.min(this.f32730b.position() + d10, this.f32730b.limit()));
        } while (d10 > 0);
    }

    private void r() {
        d();
        q();
    }

    public void a() {
        this.f32730b = null;
        this.f32731c = null;
    }

    public c c() {
        if (this.f32730b == null) {
            throw new IllegalStateException("You must call setData() before parseHeader()");
        } else if (b()) {
            return this.f32731c;
        } else {
            k();
            if (!b()) {
                h();
                c cVar = this.f32731c;
                if (cVar.f32718c < 0) {
                    cVar.f32717b = 1;
                }
            }
            return this.f32731c;
        }
    }

    public d p(ByteBuffer byteBuffer) {
        o();
        ByteBuffer asReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        this.f32730b = asReadOnlyBuffer;
        asReadOnlyBuffer.position(0);
        this.f32730b.order(ByteOrder.LITTLE_ENDIAN);
        return this;
    }
}
