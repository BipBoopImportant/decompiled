package r4;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import k4.C8421e;
import k4.s;
import kb.C9967v;
import s3.a;
import t3.B;
import t3.C5950a;
import t3.C5957h;
import t3.N;
import t3.q;

/* renamed from: r4.a  reason: case insensitive filesystem */
public final class C8688a implements s {

    /* renamed from: a  reason: collision with root package name */
    private final B f55678a = new B();

    /* renamed from: b  reason: collision with root package name */
    private final boolean f55679b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55680c;

    /* renamed from: d  reason: collision with root package name */
    private final int f55681d;

    /* renamed from: e  reason: collision with root package name */
    private final String f55682e;

    /* renamed from: f  reason: collision with root package name */
    private final float f55683f;

    /* renamed from: g  reason: collision with root package name */
    private final int f55684g;

    public C8688a(List<byte[]> list) {
        String str = "sans-serif";
        boolean z10 = false;
        if (list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.f55680c = bArr[24];
            this.f55681d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f55682e = "Serif".equals(N.I(bArr, 43, bArr.length - 43)) ? "serif" : str;
            int i10 = bArr[25] * 20;
            this.f55684g = i10;
            z10 = (bArr[0] & 32) != 0 ? true : z10;
            this.f55679b = z10;
            if (z10) {
                this.f55683f = N.o(((float) ((bArr[11] & 255) | ((bArr[10] & 255) << 8))) / ((float) i10), 0.0f, 0.95f);
            } else {
                this.f55683f = 0.85f;
            }
        } else {
            this.f55680c = 0;
            this.f55681d = -1;
            this.f55682e = str;
            this.f55679b = false;
            this.f55683f = 0.85f;
            this.f55684g = -1;
        }
    }

    private void e(B b10, SpannableStringBuilder spannableStringBuilder) {
        C5950a.a(b10.a() >= 12);
        int P10 = b10.P();
        int P11 = b10.P();
        b10.X(2);
        int H10 = b10.H();
        b10.X(1);
        int q10 = b10.q();
        if (P11 > spannableStringBuilder.length()) {
            q.h("Tx3gParser", "Truncating styl end (" + P11 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            P11 = spannableStringBuilder.length();
        }
        if (P10 >= P11) {
            q.h("Tx3gParser", "Ignoring styl with start (" + P10 + ") >= end (" + P11 + ").");
            return;
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        int i10 = P10;
        int i11 = P11;
        g(spannableStringBuilder2, H10, this.f55680c, i10, i11, 0);
        f(spannableStringBuilder2, q10, this.f55681d, i10, i11, 0);
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z10 = true;
            boolean z11 = (i10 & 1) != 0;
            boolean z12 = (i10 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z10 = false;
            }
            if (z10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z10 && !z11 && !z12) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    private static void h(SpannableStringBuilder spannableStringBuilder, String str, int i10, int i11) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i10, i11, 16711713);
        }
    }

    private static String i(B b10) {
        C5950a.a(b10.a() >= 2);
        int P10 = b10.P();
        if (P10 == 0) {
            return "";
        }
        int f10 = b10.f();
        Charset R10 = b10.R();
        int f11 = P10 - (b10.f() - f10);
        if (R10 == null) {
            R10 = StandardCharsets.UTF_8;
        }
        return b10.F(f11, R10);
    }

    public void c(byte[] bArr, int i10, int i11, s.b bVar, C5957h<C8421e> hVar) {
        int i12 = i10;
        C5957h<C8421e> hVar2 = hVar;
        this.f55678a.U(bArr, i12 + i11);
        this.f55678a.W(i12);
        String i13 = i(this.f55678a);
        if (i13.isEmpty()) {
            hVar2.accept(new C8421e(C9967v.E(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i13);
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        g(spannableStringBuilder2, this.f55680c, 0, 0, spannableStringBuilder.length(), 16711680);
        f(spannableStringBuilder2, this.f55681d, -1, 0, spannableStringBuilder.length(), 16711680);
        h(spannableStringBuilder, this.f55682e, 0, spannableStringBuilder.length());
        float f10 = this.f55683f;
        while (this.f55678a.a() >= 8) {
            int f11 = this.f55678a.f();
            int q10 = this.f55678a.q();
            int q11 = this.f55678a.q();
            boolean z10 = true;
            if (q11 == 1937013100) {
                if (this.f55678a.a() < 2) {
                    z10 = false;
                }
                C5950a.a(z10);
                int P10 = this.f55678a.P();
                for (int i14 = 0; i14 < P10; i14++) {
                    e(this.f55678a, spannableStringBuilder);
                }
            } else if (q11 == 1952608120 && this.f55679b) {
                if (this.f55678a.a() < 2) {
                    z10 = false;
                }
                C5950a.a(z10);
                f10 = N.o(((float) this.f55678a.P()) / ((float) this.f55684g), 0.0f, 0.95f);
            }
            this.f55678a.W(f11 + q10);
        }
        hVar2.accept(new C8421e(C9967v.F(new a.b().o(spannableStringBuilder).h(f10, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    public int d() {
        return 2;
    }
}
