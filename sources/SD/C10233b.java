package sd;

import java.util.Collection;
import java.util.Collections;
import ld.C10008a;

/* renamed from: sd.b  reason: case insensitive filesystem */
public final class C10233b extends n {

    /* renamed from: b  reason: collision with root package name */
    private static final char[] f76500b;

    /* renamed from: c  reason: collision with root package name */
    private static final char[] f76501c = {'T', 'N', '*', 'E'};

    /* renamed from: d  reason: collision with root package name */
    private static final char[] f76502d = {'/', ':', '+', '.'};

    /* renamed from: e  reason: collision with root package name */
    private static final char f76503e;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        f76500b = cArr;
        f76503e = cArr[0];
    }

    public boolean[] d(String str) {
        int i10;
        if (str.length() < 2) {
            StringBuilder sb2 = new StringBuilder();
            char c10 = f76503e;
            sb2.append(c10);
            sb2.append(str);
            sb2.append(c10);
            str = sb2.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = f76500b;
            boolean a10 = C10232a.a(cArr, upperCase);
            boolean a11 = C10232a.a(cArr, upperCase2);
            char[] cArr2 = f76501c;
            boolean a12 = C10232a.a(cArr2, upperCase);
            boolean a13 = C10232a.a(cArr2, upperCase2);
            if (a10) {
                if (!a11) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (a12) {
                if (!a13) {
                    throw new IllegalArgumentException("Invalid start/end guards: " + str);
                }
            } else if (a11 || a13) {
                throw new IllegalArgumentException("Invalid start/end guards: " + str);
            } else {
                StringBuilder sb3 = new StringBuilder();
                char c11 = f76503e;
                sb3.append(c11);
                sb3.append(str);
                sb3.append(c11);
                str = sb3.toString();
            }
        }
        int i11 = 20;
        for (int i12 = 1; i12 < str.length() - 1; i12++) {
            if (Character.isDigit(str.charAt(i12)) || str.charAt(i12) == '-' || str.charAt(i12) == '$') {
                i11 += 9;
            } else if (C10232a.a(f76502d, str.charAt(i12))) {
                i11 += 10;
            } else {
                throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i12) + '\'');
            }
        }
        boolean[] zArr = new boolean[(i11 + (str.length() - 1))];
        int i13 = 0;
        for (int i14 = 0; i14 < str.length(); i14++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i14));
            if (i14 == 0 || i14 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i15 = 0;
            while (true) {
                char[] cArr3 = C10232a.f76497a;
                if (i15 >= cArr3.length) {
                    i10 = 0;
                    break;
                } else if (upperCase3 == cArr3[i15]) {
                    i10 = C10232a.f76498b[i15];
                    break;
                } else {
                    i15++;
                }
            }
            int i16 = 0;
            int i17 = 0;
            boolean z10 = true;
            while (i16 < 7) {
                zArr[i13] = z10;
                i13++;
                if (((i10 >> (6 - i16)) & 1) == 0 || i17 == 1) {
                    z10 = !z10;
                    i16++;
                    i17 = 0;
                } else {
                    i17++;
                }
            }
            if (i14 < str.length() - 1) {
                zArr[i13] = false;
                i13++;
            }
        }
        return zArr;
    }

    /* access modifiers changed from: protected */
    public Collection<C10008a> g() {
        return Collections.singleton(C10008a.CODABAR);
    }
}
