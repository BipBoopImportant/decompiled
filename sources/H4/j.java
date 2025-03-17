package h4;

import N3.C6656B;
import b4.C7057a;
import b4.e;
import b4.i;
import b4.k;
import b4.n;
import kb.C9967v;
import q3.C5807s;
import q3.z;
import t3.B;
import t3.q;
import u3.a;
import u3.b;

final class j {
    public static a a(z zVar, String str) {
        for (int i10 = 0; i10 < zVar.e(); i10++) {
            z.b d10 = zVar.d(i10);
            if (d10 instanceof a) {
                a aVar = (a) d10;
                if (aVar.f30062a.equals(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    private static e b(int i10, B b10) {
        int q10 = b10.q();
        if (b10.q() == 1684108385) {
            b10.X(8);
            String C10 = b10.C(q10 - 16);
            return new e("und", C10, C10);
        }
        q.h("MetadataUtil", "Failed to parse comment attribute: " + b.a(i10));
        return null;
    }

    private static C7057a c(B b10) {
        int q10 = b10.q();
        if (b10.q() == 1684108385) {
            int l10 = C7925b.l(b10.q());
            String str = l10 == 13 ? "image/jpeg" : l10 == 14 ? "image/png" : null;
            if (str == null) {
                q.h("MetadataUtil", "Unrecognized cover art flags: " + l10);
                return null;
            }
            b10.X(4);
            int i10 = q10 - 16;
            byte[] bArr = new byte[i10];
            b10.l(bArr, 0, i10);
            return new C7057a(str, (String) null, 3, bArr);
        }
        q.h("MetadataUtil", "Failed to parse cover art attribute");
        return null;
    }

    public static z.b d(B b10) {
        int f10 = b10.f() + b10.q();
        int q10 = b10.q();
        int i10 = (q10 >> 24) & 255;
        if (i10 == 169 || i10 == 253) {
            int i11 = 16777215 & q10;
            if (i11 == 6516084) {
                e b11 = b(q10, b10);
                b10.W(f10);
                return b11;
            } else if (i11 == 7233901 || i11 == 7631467) {
                n k10 = k(q10, "TIT2", b10);
                b10.W(f10);
                return k10;
            } else if (i11 == 6516589 || i11 == 7828084) {
                n k11 = k(q10, "TCOM", b10);
                b10.W(f10);
                return k11;
            } else if (i11 == 6578553) {
                n k12 = k(q10, "TDRC", b10);
                b10.W(f10);
                return k12;
            } else if (i11 == 4280916) {
                n k13 = k(q10, "TPE1", b10);
                b10.W(f10);
                return k13;
            } else if (i11 == 7630703) {
                n k14 = k(q10, "TSSE", b10);
                b10.W(f10);
                return k14;
            } else if (i11 == 6384738) {
                n k15 = k(q10, "TALB", b10);
                b10.W(f10);
                return k15;
            } else if (i11 == 7108978) {
                n k16 = k(q10, "USLT", b10);
                b10.W(f10);
                return k16;
            } else if (i11 == 6776174) {
                n k17 = k(q10, "TCON", b10);
                b10.W(f10);
                return k17;
            } else if (i11 == 6779504) {
                n k18 = k(q10, "TIT1", b10);
                b10.W(f10);
                return k18;
            }
        } else if (q10 == 1735291493) {
            try {
                return j(b10);
            } finally {
                b10.W(f10);
            }
        } else if (q10 == 1684632427) {
            n e10 = e(q10, "TPOS", b10);
            b10.W(f10);
            return e10;
        } else if (q10 == 1953655662) {
            n e11 = e(q10, "TRCK", b10);
            b10.W(f10);
            return e11;
        } else if (q10 == 1953329263) {
            i g10 = g(q10, "TBPM", b10, true, false);
            b10.W(f10);
            return g10;
        } else if (q10 == 1668311404) {
            i g11 = g(q10, "TCMP", b10, true, true);
            b10.W(f10);
            return g11;
        } else if (q10 == 1668249202) {
            C7057a c10 = c(b10);
            b10.W(f10);
            return c10;
        } else if (q10 == 1631670868) {
            n k19 = k(q10, "TPE2", b10);
            b10.W(f10);
            return k19;
        } else if (q10 == 1936682605) {
            n k20 = k(q10, "TSOT", b10);
            b10.W(f10);
            return k20;
        } else if (q10 == 1936679276) {
            n k21 = k(q10, "TSOA", b10);
            b10.W(f10);
            return k21;
        } else if (q10 == 1936679282) {
            n k22 = k(q10, "TSOP", b10);
            b10.W(f10);
            return k22;
        } else if (q10 == 1936679265) {
            n k23 = k(q10, "TSO2", b10);
            b10.W(f10);
            return k23;
        } else if (q10 == 1936679791) {
            n k24 = k(q10, "TSOC", b10);
            b10.W(f10);
            return k24;
        } else if (q10 == 1920233063) {
            i g12 = g(q10, "ITUNESADVISORY", b10, false, false);
            b10.W(f10);
            return g12;
        } else if (q10 == 1885823344) {
            i g13 = g(q10, "ITUNESGAPLESS", b10, false, true);
            b10.W(f10);
            return g13;
        } else if (q10 == 1936683886) {
            n k25 = k(q10, "TVSHOWSORT", b10);
            b10.W(f10);
            return k25;
        } else if (q10 == 1953919848) {
            n k26 = k(q10, "TVSHOW", b10);
            b10.W(f10);
            return k26;
        } else if (q10 == 757935405) {
            i h10 = h(b10, f10);
            b10.W(f10);
            return h10;
        }
        q.b("MetadataUtil", "Skipped unknown metadata entry: " + b.a(q10));
        b10.W(f10);
        return null;
    }

    private static n e(int i10, String str, B b10) {
        int q10 = b10.q();
        if (b10.q() == 1684108385 && q10 >= 22) {
            b10.X(10);
            int P10 = b10.P();
            if (P10 > 0) {
                String str2 = "" + P10;
                int P11 = b10.P();
                if (P11 > 0) {
                    str2 = str2 + "/" + P11;
                }
                return new n(str, (String) null, C9967v.F(str2));
            }
        }
        q.h("MetadataUtil", "Failed to parse index/count attribute: " + b.a(i10));
        return null;
    }

    private static int f(B b10) {
        int q10 = b10.q();
        if (b10.q() == 1684108385) {
            b10.X(8);
            int i10 = q10 - 16;
            if (i10 == 1) {
                return b10.H();
            }
            if (i10 == 2) {
                return b10.P();
            }
            if (i10 == 3) {
                return b10.K();
            }
            if (i10 == 4 && (b10.j() & 128) == 0) {
                return b10.L();
            }
        }
        q.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    private static i g(int i10, String str, B b10, boolean z10, boolean z11) {
        int f10 = f(b10);
        if (z11) {
            f10 = Math.min(1, f10);
        }
        if (f10 >= 0) {
            return z10 ? new n(str, (String) null, C9967v.F(Integer.toString(f10))) : new e("und", str, Integer.toString(f10));
        }
        q.h("MetadataUtil", "Failed to parse uint8 attribute: " + b.a(i10));
        return null;
    }

    private static i h(B b10, int i10) {
        String str = null;
        String str2 = null;
        int i11 = -1;
        int i12 = -1;
        while (b10.f() < i10) {
            int f10 = b10.f();
            int q10 = b10.q();
            int q11 = b10.q();
            b10.X(4);
            if (q11 == 1835360622) {
                str = b10.C(q10 - 12);
            } else if (q11 == 1851878757) {
                str2 = b10.C(q10 - 12);
            } else {
                if (q11 == 1684108385) {
                    i11 = f10;
                    i12 = q10;
                }
                b10.X(q10 - 12);
            }
        }
        if (str == null || str2 == null || i11 == -1) {
            return null;
        }
        b10.W(i11);
        b10.X(16);
        return new k(str, str2, b10.C(i12 - 16));
    }

    public static a i(B b10, int i10, String str) {
        while (true) {
            int f10 = b10.f();
            if (f10 >= i10) {
                return null;
            }
            int q10 = b10.q();
            if (b10.q() == 1684108385) {
                int q11 = b10.q();
                int q12 = b10.q();
                int i11 = q10 - 16;
                byte[] bArr = new byte[i11];
                b10.l(bArr, 0, i11);
                return new a(str, bArr, q12, q11);
            }
            b10.W(f10 + q10);
        }
    }

    private static n j(B b10) {
        String a10 = b4.j.a(f(b10) - 1);
        if (a10 != null) {
            return new n("TCON", (String) null, C9967v.F(a10));
        }
        q.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    private static n k(int i10, String str, B b10) {
        int q10 = b10.q();
        if (b10.q() == 1684108385) {
            b10.X(8);
            return new n(str, (String) null, C9967v.F(b10.C(q10 - 16)));
        }
        q.h("MetadataUtil", "Failed to parse text attribute: " + b.a(i10));
        return null;
    }

    public static void l(int i10, C6656B b10, C5807s.b bVar) {
        if (i10 == 1 && b10.a()) {
            bVar.Y(b10.f38726a).Z(b10.f38727b);
        }
    }

    public static void m(int i10, z zVar, C5807s.b bVar, z... zVarArr) {
        z zVar2 = new z(new z.b[0]);
        if (zVar != null) {
            for (int i11 = 0; i11 < zVar.e(); i11++) {
                z.b d10 = zVar.d(i11);
                if (d10 instanceof a) {
                    a aVar = (a) d10;
                    if (!aVar.f30062a.equals("com.android.capture.fps")) {
                        zVar2 = zVar2.a(aVar);
                    } else if (i10 == 2) {
                        zVar2 = zVar2.a(aVar);
                    }
                }
            }
        }
        for (z b10 : zVarArr) {
            zVar2 = zVar2.b(b10);
        }
        if (zVar2.e() > 0) {
            bVar.l0(zVar2);
        }
    }
}
