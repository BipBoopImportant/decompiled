package r3;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kb.C9967v;
import r3.b;
import t3.C5950a;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final C9967v<b> f28637a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f28638b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer[] f28639c = new ByteBuffer[0];

    /* renamed from: d  reason: collision with root package name */
    private b.a f28640d;

    /* renamed from: e  reason: collision with root package name */
    private b.a f28641e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f28642f;

    public a(C9967v<b> vVar) {
        this.f28637a = vVar;
        b.a aVar = b.a.f28644e;
        this.f28640d = aVar;
        this.f28641e = aVar;
        this.f28642f = false;
    }

    private int c() {
        return this.f28639c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= c()) {
                if (!this.f28639c[i10].hasRemaining()) {
                    b bVar = this.f28638b.get(i10);
                    if (!bVar.d()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f28639c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : b.f28643a;
                        bVar.e(byteBuffer2);
                        this.f28639c[i10] = bVar.b();
                        z10 |= ((long) byteBuffer2.remaining()) - ((long) byteBuffer2.remaining()) > 0 || this.f28639c[i10].hasRemaining();
                    } else if (!this.f28639c[i10].hasRemaining() && i10 < c()) {
                        this.f28638b.get(i10 + 1).g();
                    }
                }
                i10++;
            }
        }
    }

    public b.a a(b.a aVar) {
        if (!aVar.equals(b.a.f28644e)) {
            for (int i10 = 0; i10 < this.f28637a.size(); i10++) {
                b bVar = this.f28637a.get(i10);
                b.a f10 = bVar.f(aVar);
                if (bVar.c()) {
                    C5950a.g(!f10.equals(b.a.f28644e));
                    aVar = f10;
                }
            }
            this.f28641e = aVar;
            return aVar;
        }
        throw new b.C0454b(aVar);
    }

    public void b() {
        this.f28638b.clear();
        this.f28640d = this.f28641e;
        this.f28642f = false;
        for (int i10 = 0; i10 < this.f28637a.size(); i10++) {
            b bVar = this.f28637a.get(i10);
            bVar.flush();
            if (bVar.c()) {
                this.f28638b.add(bVar);
            }
        }
        this.f28639c = new ByteBuffer[this.f28638b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f28639c[i11] = this.f28638b.get(i11).b();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return b.f28643a;
        }
        ByteBuffer byteBuffer = this.f28639c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(b.f28643a);
        return this.f28639c[c()];
    }

    public boolean e() {
        return this.f28642f && this.f28638b.get(c()).d() && !this.f28639c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f28637a.size() != aVar.f28637a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f28637a.size(); i10++) {
            if (this.f28637a.get(i10) != aVar.f28637a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f28638b.isEmpty();
    }

    public void h() {
        if (f() && !this.f28642f) {
            this.f28642f = true;
            this.f28638b.get(0).g();
        }
    }

    public int hashCode() {
        return this.f28637a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (f() && !this.f28642f) {
            g(byteBuffer);
        }
    }

    public void j() {
        for (int i10 = 0; i10 < this.f28637a.size(); i10++) {
            b bVar = this.f28637a.get(i10);
            bVar.flush();
            bVar.a();
        }
        this.f28639c = new ByteBuffer[0];
        b.a aVar = b.a.f28644e;
        this.f28640d = aVar;
        this.f28641e = aVar;
        this.f28642f = false;
    }
}
