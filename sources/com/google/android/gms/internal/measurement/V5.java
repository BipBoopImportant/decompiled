package com.google.android.gms.internal.measurement;

final class V5 {
    static String a(C7276d4 d4Var) {
        Y5 y52 = new Y5(d4Var);
        StringBuilder sb2 = new StringBuilder(y52.zza());
        for (int i10 = 0; i10 < y52.zza(); i10++) {
            byte c10 = y52.c(i10);
            if (c10 == 34) {
                sb2.append("\\\"");
            } else if (c10 == 39) {
                sb2.append("\\'");
            } else if (c10 != 92) {
                switch (c10) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (c10 >= 32 && c10 <= 126) {
                            sb2.append((char) c10);
                            break;
                        } else {
                            sb2.append('\\');
                            sb2.append((char) (((c10 >>> 6) & 3) + 48));
                            sb2.append((char) (((c10 >>> 3) & 7) + 48));
                            sb2.append((char) ((c10 & 7) + 48));
                            break;
                        }
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }
}
