package ta;

import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class a extends L9.a {
    public static final Parcelable.Creator<a> CREATOR = new g();

    /* renamed from: i  reason: collision with root package name */
    private static final byte[][] f56747i;

    /* renamed from: j  reason: collision with root package name */
    private static final a f56748j;

    /* renamed from: k  reason: collision with root package name */
    private static final C0911a f56749k = new c();

    /* renamed from: l  reason: collision with root package name */
    private static final C0911a f56750l = new d();

    /* renamed from: m  reason: collision with root package name */
    private static final C0911a f56751m = new e();

    /* renamed from: n  reason: collision with root package name */
    private static final C0911a f56752n = new f();

    /* renamed from: a  reason: collision with root package name */
    private final String f56753a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f56754b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[][] f56755c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[][] f56756d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[][] f56757e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[][] f56758f;

    /* renamed from: g  reason: collision with root package name */
    private final int[] f56759g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[][] f56760h;

    /* renamed from: ta.a$a  reason: collision with other inner class name */
    private interface C0911a {
    }

    static {
        byte[][] bArr = new byte[0][];
        f56747i = bArr;
        f56748j = new a("", (byte[]) null, bArr, bArr, bArr, bArr, (int[]) null, (byte[][]) null);
    }

    public a(String str, byte[] bArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, int[] iArr, byte[][] bArr6) {
        this.f56753a = str;
        this.f56754b = bArr;
        this.f56755c = bArr2;
        this.f56756d = bArr3;
        this.f56757e = bArr4;
        this.f56758f = bArr5;
        this.f56759g = iArr;
        this.f56760h = bArr6;
    }

    private static List<String> B(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte[] encodeToString : bArr) {
            arrayList.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void F(StringBuilder sb2, String str, byte[][] bArr) {
        String str2;
        sb2.append(str);
        sb2.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb2.append("(");
            int length = bArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                byte[] bArr2 = bArr[i10];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append("'");
                sb2.append(Base64.encodeToString(bArr2, 3));
                sb2.append("'");
                i10++;
                z10 = false;
            }
            str2 = ")";
        }
        sb2.append(str2);
    }

    private static List<Integer> x(int[] iArr) {
        if (iArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            return j.a(this.f56753a, aVar.f56753a) && Arrays.equals(this.f56754b, aVar.f56754b) && j.a(B(this.f56755c), B(aVar.f56755c)) && j.a(B(this.f56756d), B(aVar.f56756d)) && j.a(B(this.f56757e), B(aVar.f56757e)) && j.a(B(this.f56758f), B(aVar.f56758f)) && j.a(x(this.f56759g), x(aVar.f56759g)) && j.a(B(this.f56760h), B(aVar.f56760h));
        }
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ExperimentTokens");
        sb2.append("(");
        String str2 = this.f56753a;
        if (str2 == null) {
            str = "null";
        } else {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 2);
            sb3.append("'");
            sb3.append(str2);
            sb3.append("'");
            str = sb3.toString();
        }
        sb2.append(str);
        sb2.append(", ");
        byte[] bArr = this.f56754b;
        sb2.append("direct");
        sb2.append("=");
        if (bArr == null) {
            sb2.append("null");
        } else {
            sb2.append("'");
            sb2.append(Base64.encodeToString(bArr, 3));
            sb2.append("'");
        }
        sb2.append(", ");
        F(sb2, "GAIA", this.f56755c);
        sb2.append(", ");
        F(sb2, "PSEUDO", this.f56756d);
        sb2.append(", ");
        F(sb2, "ALWAYS", this.f56757e);
        sb2.append(", ");
        F(sb2, "OTHER", this.f56758f);
        sb2.append(", ");
        int[] iArr = this.f56759g;
        sb2.append("weak");
        sb2.append("=");
        if (iArr == null) {
            sb2.append("null");
        } else {
            sb2.append("(");
            int length = iArr.length;
            boolean z10 = true;
            int i10 = 0;
            while (i10 < length) {
                int i11 = iArr[i10];
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(i11);
                i10++;
                z10 = false;
            }
            sb2.append(")");
        }
        sb2.append(", ");
        F(sb2, "directs", this.f56760h);
        sb2.append(")");
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f56753a, false);
        c.g(parcel, 3, this.f56754b, false);
        c.h(parcel, 4, this.f56755c, false);
        c.h(parcel, 5, this.f56756d, false);
        c.h(parcel, 6, this.f56757e, false);
        c.h(parcel, 7, this.f56758f, false);
        c.o(parcel, 8, this.f56759g, false);
        c.h(parcel, 9, this.f56760h, false);
        c.b(parcel, a10);
    }
}
