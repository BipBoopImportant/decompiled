package N3;

import b4.h;
import java.io.EOFException;
import q3.z;
import t3.B;

/* renamed from: N3.D  reason: case insensitive filesystem */
public final class C6658D {

    /* renamed from: a  reason: collision with root package name */
    private final B f38742a = new B(10);

    public z a(C6679q qVar, h.a aVar) {
        z zVar = null;
        int i10 = 0;
        while (true) {
            try {
                qVar.o(this.f38742a.e(), 0, 10);
                this.f38742a.W(0);
                if (this.f38742a.K() != 4801587) {
                    break;
                }
                this.f38742a.X(3);
                int G10 = this.f38742a.G();
                int i11 = G10 + 10;
                if (zVar == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f38742a.e(), 0, bArr, 0, 10);
                    qVar.o(bArr, 10, G10);
                    zVar = new h(aVar).e(bArr, i11);
                } else {
                    qVar.i(G10);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        qVar.f();
        qVar.i(i10);
        return zVar;
    }
}
