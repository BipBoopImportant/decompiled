package s4;

import java.util.ArrayList;
import java.util.Collections;
import k4.C8421e;
import k4.s;
import s3.a;
import t3.B;
import t3.C5950a;
import t3.C5957h;
import t3.N;

/* renamed from: s4.a  reason: case insensitive filesystem */
public final class C8714a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final B f55804a = new B();

    private static a e(B b10, int i10) {
        CharSequence charSequence = null;
        a.b bVar = null;
        while (i10 > 0) {
            C5950a.b(i10 >= 8, "Incomplete vtt cue box header found.");
            int q10 = b10.q();
            int q11 = b10.q();
            int i11 = q10 - 8;
            String I10 = N.I(b10.e(), b10.f(), i11);
            b10.X(i11);
            i10 = (i10 - 8) - i11;
            if (q11 == 1937011815) {
                bVar = e.p(I10);
            } else if (q11 == 1885436268) {
                charSequence = e.r((String) null, I10.trim(), Collections.emptyList());
            }
        }
        if (charSequence == null) {
            charSequence = "";
        }
        return bVar != null ? bVar.o(charSequence).a() : e.m(charSequence);
    }

    public void c(byte[] bArr, int i10, int i11, s.b bVar, C5957h<C8421e> hVar) {
        this.f55804a.U(bArr, i11 + i10);
        this.f55804a.W(i10);
        ArrayList arrayList = new ArrayList();
        while (this.f55804a.a() > 0) {
            C5950a.b(this.f55804a.a() >= 8, "Incomplete Mp4Webvtt Top Level box header found.");
            int q10 = this.f55804a.q();
            if (this.f55804a.q() == 1987343459) {
                arrayList.add(e(this.f55804a, q10 - 8));
            } else {
                this.f55804a.X(q10 - 8);
            }
        }
        hVar.accept(new C8421e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    public int d() {
        return 2;
    }
}
