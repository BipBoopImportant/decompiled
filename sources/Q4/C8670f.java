package q4;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import s3.d;
import s3.f;
import s3.g;
import s3.h;
import t3.C5950a;
import t3.N;
import t3.q;

/* renamed from: q4.f  reason: case insensitive filesystem */
final class C8670f {
    public static void a(Spannable spannable, int i10, int i11, C8671g gVar, C8667c cVar, Map<String, C8671g> map, int i12) {
        C8667c e10;
        C8671g f10;
        int i13;
        if (gVar.l() != -1) {
            spannable.setSpan(new StyleSpan(gVar.l()), i10, i11, 33);
        }
        if (gVar.s()) {
            spannable.setSpan(new StrikethroughSpan(), i10, i11, 33);
        }
        if (gVar.t()) {
            spannable.setSpan(new UnderlineSpan(), i10, i11, 33);
        }
        if (gVar.q()) {
            g.b(spannable, new ForegroundColorSpan(gVar.c()), i10, i11, 33);
        }
        if (gVar.p()) {
            g.b(spannable, new BackgroundColorSpan(gVar.b()), i10, i11, 33);
        }
        if (gVar.d() != null) {
            g.b(spannable, new TypefaceSpan(gVar.d()), i10, i11, 33);
        }
        if (gVar.o() != null) {
            C8666b bVar = (C8666b) C5950a.e(gVar.o());
            int i14 = bVar.f55451a;
            if (i14 == -1) {
                i14 = (i12 == 2 || i12 == 1) ? 3 : 1;
                i13 = 1;
            } else {
                i13 = bVar.f55452b;
            }
            int i15 = bVar.f55453c;
            if (i15 == -2) {
                i15 = 1;
            }
            g.b(spannable, new h(i14, i13, i15), i10, i11, 33);
        }
        int j10 = gVar.j();
        if (j10 == 2) {
            C8667c d10 = d(cVar, map);
            if (!(d10 == null || (e10 = e(d10, map)) == null)) {
                if (e10.g() != 1 || e10.f(0).f55455b == null) {
                    q.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) N.i(e10.f(0).f55455b);
                    C8671g f11 = f(e10.f55459f, e10.l(), map);
                    int i16 = f11 != null ? f11.i() : -1;
                    if (i16 == -1 && (f10 = f(d10.f55459f, d10.l(), map)) != null) {
                        i16 = f10.i();
                    }
                    spannable.setSpan(new f(str, i16), i10, i11, 33);
                }
            }
        } else if (j10 == 3 || j10 == 4) {
            spannable.setSpan(new C8665a(), i10, i11, 33);
        }
        if (gVar.n()) {
            g.b(spannable, new d(), i10, i11, 33);
        }
        int f12 = gVar.f();
        if (f12 == 1) {
            g.b(spannable, new AbsoluteSizeSpan((int) gVar.e(), true), i10, i11, 33);
        } else if (f12 == 2) {
            g.b(spannable, new RelativeSizeSpan(gVar.e()), i10, i11, 33);
        } else if (f12 == 3) {
            g.a(spannable, gVar.e() / 100.0f, i10, i11, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    private static C8667c d(C8667c cVar, Map<String, C8671g> map) {
        while (cVar != null) {
            C8671g f10 = f(cVar.f55459f, cVar.l(), map);
            if (f10 != null && f10.j() == 1) {
                return cVar;
            }
            cVar = cVar.f55463j;
        }
        return null;
    }

    private static C8667c e(C8667c cVar, Map<String, C8671g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(cVar);
        while (!arrayDeque.isEmpty()) {
            C8667c cVar2 = (C8667c) arrayDeque.pop();
            C8671g f10 = f(cVar2.f55459f, cVar2.l(), map);
            if (f10 != null && f10.j() == 3) {
                return cVar2;
            }
            for (int g10 = cVar2.g() - 1; g10 >= 0; g10--) {
                arrayDeque.push(cVar2.f(g10));
            }
        }
        return null;
    }

    public static C8671g f(C8671g gVar, String[] strArr, Map<String, C8671g> map) {
        int i10 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                C8671g gVar2 = new C8671g();
                int length = strArr.length;
                while (i10 < length) {
                    gVar2.a(map.get(strArr[i10]));
                    i10++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i10 < length2) {
                    gVar.a(map.get(strArr[i10]));
                    i10++;
                }
            }
        }
        return gVar;
    }
}
