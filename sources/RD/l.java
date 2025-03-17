package rd;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import ld.C10009b;

public class l {

    /* renamed from: i  reason: collision with root package name */
    static final l[] f76413i;

    /* renamed from: j  reason: collision with root package name */
    private static l[] f76414j;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f76415a;

    /* renamed from: b  reason: collision with root package name */
    private final int f76416b;

    /* renamed from: c  reason: collision with root package name */
    private final int f76417c;

    /* renamed from: d  reason: collision with root package name */
    public final int f76418d;

    /* renamed from: e  reason: collision with root package name */
    public final int f76419e;

    /* renamed from: f  reason: collision with root package name */
    private final int f76420f;

    /* renamed from: g  reason: collision with root package name */
    private final int f76421g;

    /* renamed from: h  reason: collision with root package name */
    private final int f76422h;

    static {
        l[] lVarArr = {new l(false, 3, 5, 8, 8, 1), new l(false, 5, 7, 10, 10, 1), new l(true, 5, 7, 16, 6, 1), new l(false, 8, 10, 12, 12, 1), new l(true, 10, 11, 14, 6, 2), new l(false, 12, 12, 14, 14, 1), new l(true, 16, 14, 24, 10, 1), new l(false, 18, 14, 16, 16, 1), new l(false, 22, 18, 18, 18, 1), new l(true, 22, 18, 16, 10, 2), new l(false, 30, 20, 20, 20, 1), new l(true, 32, 24, 16, 14, 2), new l(false, 36, 24, 22, 22, 1), new l(false, 44, 28, 24, 24, 1), new l(true, 49, 28, 22, 14, 2), new l(false, 62, 36, 14, 14, 4), new l(false, 86, 42, 16, 16, 4), new l(false, 114, 48, 18, 18, 4), new l(false, 144, 56, 20, 20, 4), new l(false, 174, 68, 22, 22, 4), new l(false, 204, 84, 24, 24, 4, CheckoutActivity.RESULT_ERROR, 42), new l(false, 280, 112, 14, 14, 16, 140, 56), new l(false, 368, 144, 16, 16, 16, 92, 36), new l(false, 456, 192, 18, 18, 16, 114, 48), new l(false, 576, 224, 20, 20, 16, 144, 56), new l(false, 696, 272, 22, 22, 16, 174, 68), new l(false, 816, 336, 24, 24, 16, ModuleDescriptor.MODULE_VERSION, 56), new l(false, 1050, 408, 18, 18, 36, 175, 68), new l(false, 1304, 496, 20, 20, 36, 163, 62), new d()};
        f76413i = lVarArr;
        f76414j = lVarArr;
    }

    public l(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(z10, i10, i11, i12, i13, i14, i10, i11);
    }

    private int e() {
        int i10 = this.f76420f;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (!(i10 == 2 || i10 == 4)) {
                if (i10 == 16) {
                    return 4;
                }
                if (i10 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i11;
    }

    private int k() {
        int i10 = this.f76420f;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static l l(int i10, m mVar, C10009b bVar, C10009b bVar2, boolean z10) {
        for (l lVar : f76414j) {
            if ((mVar != m.FORCE_SQUARE || !lVar.f76415a) && ((mVar != m.FORCE_RECTANGLE || lVar.f76415a) && ((bVar == null || (lVar.j() >= bVar.b() && lVar.i() >= bVar.a())) && ((bVar2 == null || (lVar.j() <= bVar2.b() && lVar.i() <= bVar2.a())) && i10 <= lVar.f76416b)))) {
                return lVar;
            }
        }
        if (!z10) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: " + i10);
    }

    public final int a() {
        return this.f76416b;
    }

    public int b(int i10) {
        return this.f76421g;
    }

    public final int c() {
        return this.f76417c;
    }

    public final int d(int i10) {
        return this.f76422h;
    }

    public int f() {
        return this.f76416b / this.f76421g;
    }

    public final int g() {
        return k() * this.f76419e;
    }

    public final int h() {
        return e() * this.f76418d;
    }

    public final int i() {
        return g() + (k() * 2);
    }

    public final int j() {
        return h() + (e() * 2);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f76415a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.f76418d);
        sb2.append('x');
        sb2.append(this.f76419e);
        sb2.append(", symbol size ");
        sb2.append(j());
        sb2.append('x');
        sb2.append(i());
        sb2.append(", symbol data size ");
        sb2.append(h());
        sb2.append('x');
        sb2.append(g());
        sb2.append(", codewords ");
        sb2.append(this.f76416b);
        sb2.append('+');
        sb2.append(this.f76417c);
        return sb2.toString();
    }

    l(boolean z10, int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f76415a = z10;
        this.f76416b = i10;
        this.f76417c = i11;
        this.f76418d = i12;
        this.f76419e = i13;
        this.f76420f = i14;
        this.f76421g = i15;
        this.f76422h = i16;
    }
}
