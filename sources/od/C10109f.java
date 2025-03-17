package od;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: od.f  reason: case insensitive filesystem */
public class C10109f implements C10108e {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f75688a;

    /* renamed from: b  reason: collision with root package name */
    private final int f75689b;

    /* renamed from: od.f$b */
    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final char f75690a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final int f75691b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final b f75692c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final int f75693d;

        /* access modifiers changed from: package-private */
        public boolean e() {
            return this.f75690a == 1000;
        }

        private b(char c10, C10107d dVar, int i10, b bVar, int i11) {
            int i12;
            int i13;
            char c11 = c10 == i11 ? 1000 : c10;
            this.f75690a = c11;
            this.f75691b = i10;
            this.f75692c = bVar;
            if (c11 == 1000) {
                i12 = 1;
            } else {
                i12 = dVar.b(c10, i10).length;
            }
            if (bVar == null) {
                i13 = 0;
            } else {
                i13 = bVar.f75691b;
            }
            i12 = i13 != i10 ? i12 + 3 : i12;
            this.f75693d = bVar != null ? i12 + bVar.f75693d : i12;
        }
    }

    public C10109f(String str, Charset charset, int i10) {
        this.f75689b = i10;
        C10107d dVar = new C10107d(str, charset, i10);
        if (dVar.g() == 1) {
            this.f75688a = new int[str.length()];
            for (int i11 = 0; i11 < this.f75688a.length; i11++) {
                int charAt = str.charAt(i11);
                int[] iArr = this.f75688a;
                if (charAt == i10) {
                    charAt = 1000;
                }
                iArr[i11] = charAt;
            }
            return;
        }
        this.f75688a = e(str, dVar, i10);
    }

    static void c(b[][] bVarArr, int i10, b bVar) {
        if (bVarArr[i10][bVar.f75691b] == null || bVarArr[i10][bVar.f75691b].f75693d > bVar.f75693d) {
            bVarArr[i10][bVar.f75691b] = bVar;
        }
    }

    static void d(String str, C10107d dVar, b[][] bVarArr, int i10, b bVar, int i11) {
        int i12;
        int i13;
        C10107d dVar2 = dVar;
        int i14 = i10;
        String str2 = str;
        int i15 = i11;
        char charAt = str.charAt(i14);
        int g10 = dVar.g();
        if (dVar.f() < 0 || (charAt != i15 && !dVar2.a(charAt, dVar.f()))) {
            i12 = g10;
            i13 = 0;
        } else {
            i13 = dVar.f();
            i12 = i13 + 1;
        }
        for (int i16 = i13; i16 < i12; i16++) {
            if (charAt == i15 || dVar2.a(charAt, i16)) {
                c(bVarArr, i14 + 1, new b(charAt, dVar, i16, bVar, i11));
            } else {
                b[][] bVarArr2 = bVarArr;
            }
        }
    }

    static int[] e(String str, C10107d dVar, int i10) {
        int length = str.length();
        int[] iArr = new int[2];
        iArr[1] = dVar.g();
        iArr[0] = length + 1;
        b[][] bVarArr = (b[][]) Array.newInstance(b.class, iArr);
        d(str, dVar, bVarArr, 0, (b) null, i10);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < dVar.g(); i12++) {
                b bVar = bVarArr[i11][i12];
                if (bVar != null && i11 < length) {
                    d(str, dVar, bVarArr, i11, bVar, i10);
                }
            }
            for (int i13 = 0; i13 < dVar.g(); i13++) {
                bVarArr[i11 - 1][i13] = null;
            }
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        for (int i16 = 0; i16 < dVar.g(); i16++) {
            b bVar2 = bVarArr[length][i16];
            if (bVar2 != null && bVar2.f75693d < i15) {
                i15 = bVar2.f75693d;
                i14 = i16;
            }
        }
        if (i14 >= 0) {
            ArrayList arrayList = new ArrayList();
            for (b bVar3 = bVarArr[length][i14]; bVar3 != null; bVar3 = bVar3.f75692c) {
                if (bVar3.e()) {
                    arrayList.add(0, 1000);
                } else {
                    byte[] b10 = dVar.b(bVar3.f75690a, bVar3.f75691b);
                    for (int length2 = b10.length - 1; length2 >= 0; length2--) {
                        arrayList.add(0, Integer.valueOf(b10[length2] & 255));
                    }
                }
                if ((bVar3.f75692c == null ? 0 : bVar3.f75692c.f75691b) != bVar3.f75691b) {
                    arrayList.add(0, Integer.valueOf(dVar.e(bVar3.f75691b) + 256));
                }
            }
            int size = arrayList.size();
            int[] iArr2 = new int[size];
            for (int i17 = 0; i17 < size; i17++) {
                iArr2[i17] = ((Integer) arrayList.get(i17)).intValue();
            }
            return iArr2;
        }
        throw new IllegalStateException("Failed to encode \"" + str + "\"");
    }

    public boolean a(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        int i11 = this.f75688a[i10];
        return i11 > 255 && i11 <= 999;
    }

    public int b(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        } else if (a(i10)) {
            return this.f75688a[i10] - 256;
        } else {
            throw new IllegalArgumentException("value at " + i10 + " is not an ECI but a character");
        }
    }

    public char charAt(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new IndexOutOfBoundsException("" + i10);
        } else if (!a(i10)) {
            return (char) (h(i10) ? this.f75689b : this.f75688a[i10]);
        } else {
            throw new IllegalArgumentException("value at " + i10 + " is not a character but an ECI");
        }
    }

    public int f() {
        return this.f75689b;
    }

    public boolean g(int i10, int i11) {
        if ((i10 + i11) - 1 >= this.f75688a.length) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i10) {
        if (i10 >= 0 && i10 < length()) {
            return this.f75688a[i10] == 1000;
        }
        throw new IndexOutOfBoundsException("" + i10);
    }

    public int length() {
        return this.f75688a.length;
    }

    public CharSequence subSequence(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > length()) {
            throw new IndexOutOfBoundsException("" + i10);
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < i11) {
            if (!a(i10)) {
                sb2.append(charAt(i10));
                i10++;
            } else {
                throw new IllegalArgumentException("value at " + i10 + " is not a character but an ECI");
            }
        }
        return sb2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < length(); i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            if (a(i10)) {
                sb2.append("ECI(");
                sb2.append(b(i10));
                sb2.append(')');
            } else if (charAt(i10) < 128) {
                sb2.append('\'');
                sb2.append(charAt(i10));
                sb2.append('\'');
            } else {
                sb2.append(charAt(i10));
            }
        }
        return sb2.toString();
    }
}
