package s4;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jb.C9892c;
import t3.B;
import t3.C5950a;
import t3.C5955f;
import t3.N;
import t3.q;

final class b {

    /* renamed from: c  reason: collision with root package name */
    private static final Pattern f55805c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: d  reason: collision with root package name */
    private static final Pattern f55806d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    /* renamed from: a  reason: collision with root package name */
    private final B f55807a = new B();

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f55808b = new StringBuilder();

    private void a(c cVar, String str) {
        if (!"".equals(str)) {
            int indexOf = str.indexOf(91);
            if (indexOf != -1) {
                Matcher matcher = f55805c.matcher(str.substring(indexOf));
                if (matcher.matches()) {
                    cVar.z((String) C5950a.e(matcher.group(1)));
                }
                str = str.substring(0, indexOf);
            }
            String[] h12 = N.h1(str, "\\.");
            String str2 = h12[0];
            int indexOf2 = str2.indexOf(35);
            if (indexOf2 != -1) {
                cVar.y(str2.substring(0, indexOf2));
                cVar.x(str2.substring(indexOf2 + 1));
            } else {
                cVar.y(str2);
            }
            if (h12.length > 1) {
                cVar.w((String[]) N.V0(h12, 1, h12.length));
            }
        }
    }

    private static boolean b(B b10) {
        int f10 = b10.f();
        int g10 = b10.g();
        byte[] e10 = b10.e();
        if (f10 + 2 > g10) {
            return false;
        }
        int i10 = f10 + 1;
        if (e10[f10] != 47) {
            return false;
        }
        int i11 = f10 + 2;
        if (e10[i10] != 42) {
            return false;
        }
        while (true) {
            int i12 = i11 + 1;
            if (i12 >= g10) {
                b10.X(g10 - b10.f());
                return true;
            } else if (((char) e10[i11]) == '*' && ((char) e10[i12]) == '/') {
                i11 += 2;
                g10 = i11;
            } else {
                i11 = i12;
            }
        }
    }

    private static boolean c(B b10) {
        char k10 = k(b10, b10.f());
        if (k10 != 9 && k10 != 10 && k10 != 12 && k10 != 13 && k10 != ' ') {
            return false;
        }
        b10.X(1);
        return true;
    }

    private static void e(String str, c cVar) {
        Matcher matcher = f55806d.matcher(C9892c.e(str));
        if (!matcher.matches()) {
            q.h("WebvttCssParser", "Invalid font-size: '" + str + "'.");
            return;
        }
        String str2 = (String) C5950a.e(matcher.group(2));
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 37:
                if (str2.equals("%")) {
                    c10 = 0;
                    break;
                }
                break;
            case 3240:
                if (str2.equals("em")) {
                    c10 = 1;
                    break;
                }
                break;
            case 3592:
                if (str2.equals("px")) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                cVar.t(3);
                break;
            case 1:
                cVar.t(2);
                break;
            case 2:
                cVar.t(1);
                break;
            default:
                throw new IllegalStateException();
        }
        cVar.s(Float.parseFloat((String) C5950a.e(matcher.group(1))));
    }

    private static String f(B b10, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int f10 = b10.f();
        int g10 = b10.g();
        while (f10 < g10 && !z10) {
            char c10 = (char) b10.e()[f10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                f10++;
                sb2.append(c10);
            }
        }
        b10.X(f10 - b10.f());
        return sb2.toString();
    }

    static String g(B b10, StringBuilder sb2) {
        n(b10);
        if (b10.a() == 0) {
            return null;
        }
        String f10 = f(b10, sb2);
        if (!"".equals(f10)) {
            return f10;
        }
        return "" + ((char) b10.H());
    }

    private static String h(B b10, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder();
        boolean z10 = false;
        while (!z10) {
            int f10 = b10.f();
            String g10 = g(b10, sb2);
            if (g10 == null) {
                return null;
            }
            if ("}".equals(g10) || ";".equals(g10)) {
                b10.W(f10);
                z10 = true;
            } else {
                sb3.append(g10);
            }
        }
        return sb3.toString();
    }

    private static String i(B b10, StringBuilder sb2) {
        n(b10);
        if (b10.a() < 5 || !"::cue".equals(b10.E(5))) {
            return null;
        }
        int f10 = b10.f();
        String g10 = g(b10, sb2);
        if (g10 == null) {
            return null;
        }
        if ("{".equals(g10)) {
            b10.W(f10);
            return "";
        }
        String l10 = "(".equals(g10) ? l(b10) : null;
        if (!")".equals(g(b10, sb2))) {
            return null;
        }
        return l10;
    }

    private static void j(B b10, c cVar, StringBuilder sb2) {
        n(b10);
        String f10 = f(b10, sb2);
        if (!"".equals(f10) && ":".equals(g(b10, sb2))) {
            n(b10);
            String h10 = h(b10, sb2);
            if (h10 != null && !"".equals(h10)) {
                int f11 = b10.f();
                String g10 = g(b10, sb2);
                if (!";".equals(g10)) {
                    if ("}".equals(g10)) {
                        b10.W(f11);
                    } else {
                        return;
                    }
                }
                if ("color".equals(f10)) {
                    cVar.q(C5955f.b(h10));
                } else if ("background-color".equals(f10)) {
                    cVar.n(C5955f.b(h10));
                } else {
                    boolean z10 = true;
                    if ("ruby-position".equals(f10)) {
                        if ("over".equals(h10)) {
                            cVar.v(1);
                        } else if ("under".equals(h10)) {
                            cVar.v(2);
                        }
                    } else if ("text-combine-upright".equals(f10)) {
                        if (!"all".equals(h10) && !h10.startsWith("digits")) {
                            z10 = false;
                        }
                        cVar.p(z10);
                    } else if ("text-decoration".equals(f10)) {
                        if ("underline".equals(h10)) {
                            cVar.A(true);
                        }
                    } else if ("font-family".equals(f10)) {
                        cVar.r(h10);
                    } else if ("font-weight".equals(f10)) {
                        if ("bold".equals(h10)) {
                            cVar.o(true);
                        }
                    } else if ("font-style".equals(f10)) {
                        if ("italic".equals(h10)) {
                            cVar.u(true);
                        }
                    } else if ("font-size".equals(f10)) {
                        e(h10, cVar);
                    }
                }
            }
        }
    }

    private static char k(B b10, int i10) {
        return (char) b10.e()[i10];
    }

    private static String l(B b10) {
        int f10 = b10.f();
        int g10 = b10.g();
        boolean z10 = false;
        while (f10 < g10 && !z10) {
            int i10 = f10 + 1;
            z10 = ((char) b10.e()[f10]) == ')';
            f10 = i10;
        }
        return b10.E((f10 - 1) - b10.f()).trim();
    }

    static void m(B b10) {
        do {
        } while (!TextUtils.isEmpty(b10.s()));
    }

    static void n(B b10) {
        while (true) {
            boolean z10 = true;
            while (b10.a() > 0 && z10) {
                if (!c(b10) && !b(b10)) {
                    z10 = false;
                }
            }
            return;
        }
    }

    public List<c> d(B b10) {
        this.f55808b.setLength(0);
        int f10 = b10.f();
        m(b10);
        this.f55807a.U(b10.e(), b10.f());
        this.f55807a.W(f10);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String i10 = i(this.f55807a, this.f55808b);
            if (i10 == null || !"{".equals(g(this.f55807a, this.f55808b))) {
                return arrayList;
            }
            c cVar = new c();
            a(cVar, i10);
            String str = null;
            boolean z10 = false;
            while (!z10) {
                int f11 = this.f55807a.f();
                String g10 = g(this.f55807a, this.f55808b);
                boolean z11 = g10 == null || "}".equals(g10);
                if (!z11) {
                    this.f55807a.W(f11);
                    j(this.f55807a, cVar, this.f55808b);
                }
                str = g10;
                z10 = z11;
            }
            if ("}".equals(str)) {
                arrayList.add(cVar);
            }
        }
    }
}
