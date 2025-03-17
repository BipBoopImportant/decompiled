package nd;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import od.C10104a;

/* renamed from: nd.f  reason: case insensitive filesystem */
final class C10087f {

    /* renamed from: f  reason: collision with root package name */
    static final C10087f f75543f = new C10087f(C10088g.f75549b, 0, 0, 0);

    /* renamed from: a  reason: collision with root package name */
    private final int f75544a;

    /* renamed from: b  reason: collision with root package name */
    private final C10088g f75545b;

    /* renamed from: c  reason: collision with root package name */
    private final int f75546c;

    /* renamed from: d  reason: collision with root package name */
    private final int f75547d;

    /* renamed from: e  reason: collision with root package name */
    private final int f75548e;

    private C10087f(C10088g gVar, int i10, int i11, int i12) {
        this.f75545b = gVar;
        this.f75544a = i10;
        this.f75546c = i11;
        this.f75547d = i12;
        this.f75548e = c(i11);
    }

    private static int c(int i10) {
        if (i10 > 62) {
            return 21;
        }
        if (i10 > 31) {
            return 20;
        }
        return i10 > 0 ? 10 : 0;
    }

    /* access modifiers changed from: package-private */
    public C10087f a(int i10) {
        C10088g gVar = this.f75545b;
        int i11 = this.f75544a;
        int i12 = this.f75547d;
        if (i11 == 4 || i11 == 2) {
            int i13 = C10085d.f75535d[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar = gVar.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f75546c;
        C10087f fVar = new C10087f(gVar, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f75546c == 2078 ? fVar.d(i10 + 1) : fVar;
    }

    /* access modifiers changed from: package-private */
    public C10087f b(int i10) {
        C10088g gVar;
        C10088g gVar2 = j(4, 0).f75545b;
        int i11 = 3;
        if (i10 < 0) {
            gVar = gVar2.a(0, 3);
        } else if (i10 <= 999999) {
            byte[] bytes = Integer.toString(i10).getBytes(StandardCharsets.ISO_8859_1);
            C10088g a10 = gVar2.a(bytes.length, 3);
            int length = bytes.length;
            for (int i12 = 0; i12 < length; i12++) {
                a10 = a10.a(bytes[i12] - 46, 4);
            }
            i11 = 3 + (bytes.length * 4);
            gVar = a10;
        } else {
            throw new IllegalArgumentException("ECI code must be between 0 and 999999");
        }
        return new C10087f(gVar, this.f75544a, 0, this.f75547d + i11);
    }

    /* access modifiers changed from: package-private */
    public C10087f d(int i10) {
        int i11 = this.f75546c;
        return i11 == 0 ? this : new C10087f(this.f75545b.b(i10 - i11, i11), this.f75544a, 0, this.f75547d);
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f75546c;
    }

    /* access modifiers changed from: package-private */
    public int f() {
        return this.f75547d;
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return this.f75544a;
    }

    /* access modifiers changed from: package-private */
    public boolean h(C10087f fVar) {
        int i10 = this.f75547d + (C10085d.f75535d[this.f75544a][fVar.f75544a] >> 16);
        int i11 = this.f75546c;
        int i12 = fVar.f75546c;
        if (i11 < i12) {
            i10 += fVar.f75548e - this.f75548e;
        } else if (i11 > i12 && i12 > 0) {
            i10 += 10;
        }
        return i10 <= fVar.f75547d;
    }

    /* access modifiers changed from: package-private */
    public C10087f i(int i10, int i11) {
        int i12 = this.f75547d;
        C10088g gVar = this.f75545b;
        int i13 = this.f75544a;
        if (i10 != i13) {
            int i14 = C10085d.f75535d[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new C10087f(gVar.a(i11, i17), i10, 0, i12 + i17);
    }

    /* access modifiers changed from: package-private */
    public C10087f j(int i10, int i11) {
        C10088g gVar = this.f75545b;
        int i12 = this.f75544a;
        int i13 = i12 == 2 ? 4 : 5;
        return new C10087f(gVar.a(C10085d.f75537f[i12][i10], i13).a(i11, 5), this.f75544a, 0, this.f75547d + i13 + 5);
    }

    /* access modifiers changed from: package-private */
    public C10104a k(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (C10088g gVar = d(bArr.length).f75545b; gVar != null; gVar = gVar.d()) {
            arrayList.add(gVar);
        }
        C10104a aVar = new C10104a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((C10088g) arrayList.get(size)).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{C10085d.f75534c[this.f75544a], Integer.valueOf(this.f75547d), Integer.valueOf(this.f75546c)});
    }
}
