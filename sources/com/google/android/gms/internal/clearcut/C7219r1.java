package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.r1  reason: case insensitive filesystem */
final class C7219r1 {
    static String a(A a10) {
        String str;
        C7222s1 s1Var = new C7222s1(a10);
        StringBuilder sb2 = new StringBuilder(s1Var.size());
        for (int i10 = 0; i10 < s1Var.size(); i10++) {
            int a11 = s1Var.a(i10);
            if (a11 == 34) {
                str = "\\\"";
            } else if (a11 == 39) {
                str = "\\'";
            } else if (a11 != 92) {
                switch (a11) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a11 < 32 || a11 > 126) {
                            sb2.append('\\');
                            sb2.append((char) (((a11 >>> 6) & 3) + 48));
                            sb2.append((char) (((a11 >>> 3) & 7) + 48));
                            a11 = (a11 & 7) + 48;
                        }
                        sb2.append((char) a11);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb2.append(str);
        }
        return sb2.toString();
    }
}
