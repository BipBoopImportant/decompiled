package s4;

import android.text.TextUtils;
import java.util.ArrayList;
import k4.C8421e;
import k4.C8425i;
import k4.s;
import t3.B;
import t3.C5957h;

public final class g implements s {

    /* renamed from: a  reason: collision with root package name */
    private final B f55853a = new B();

    /* renamed from: b  reason: collision with root package name */
    private final b f55854b = new b();

    private static int e(B b10) {
        int i10 = -1;
        int i11 = 0;
        while (i10 == -1) {
            i11 = b10.f();
            String s10 = b10.s();
            i10 = s10 == null ? 0 : "STYLE".equals(s10) ? 2 : s10.startsWith("NOTE") ? 1 : 3;
        }
        b10.W(i11);
        return i10;
    }

    private static void f(B b10) {
        do {
        } while (!TextUtils.isEmpty(b10.s()));
    }

    public void c(byte[] bArr, int i10, int i11, s.b bVar, C5957h<C8421e> hVar) {
        d o10;
        this.f55853a.U(bArr, i11 + i10);
        this.f55853a.W(i10);
        ArrayList arrayList = new ArrayList();
        try {
            h.d(this.f55853a);
            do {
            } while (!TextUtils.isEmpty(this.f55853a.s()));
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                int e10 = e(this.f55853a);
                if (e10 == 0) {
                    C8425i.c(new j(arrayList2), bVar, hVar);
                    return;
                } else if (e10 == 1) {
                    f(this.f55853a);
                } else if (e10 == 2) {
                    if (arrayList2.isEmpty()) {
                        this.f55853a.s();
                        arrayList.addAll(this.f55854b.d(this.f55853a));
                    } else {
                        throw new IllegalArgumentException("A style block was found after the first cue.");
                    }
                } else if (e10 == 3 && (o10 = e.o(this.f55853a, arrayList)) != null) {
                    arrayList2.add(o10);
                }
            }
        } catch (q3.B e11) {
            throw new IllegalArgumentException(e11);
        }
    }

    public int d() {
        return 1;
    }
}
