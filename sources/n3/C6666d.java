package N3;

import java.util.ArrayList;
import java.util.List;
import t3.B;
import t3.C5954e;
import u3.e;

/* renamed from: N3.d  reason: case insensitive filesystem */
public final class C6666d {

    /* renamed from: a  reason: collision with root package name */
    public final List<byte[]> f38839a;

    /* renamed from: b  reason: collision with root package name */
    public final int f38840b;

    /* renamed from: c  reason: collision with root package name */
    public final int f38841c;

    /* renamed from: d  reason: collision with root package name */
    public final int f38842d;

    /* renamed from: e  reason: collision with root package name */
    public final int f38843e;

    /* renamed from: f  reason: collision with root package name */
    public final int f38844f;

    /* renamed from: g  reason: collision with root package name */
    public final int f38845g;

    /* renamed from: h  reason: collision with root package name */
    public final int f38846h;

    /* renamed from: i  reason: collision with root package name */
    public final int f38847i;

    /* renamed from: j  reason: collision with root package name */
    public final int f38848j;

    /* renamed from: k  reason: collision with root package name */
    public final float f38849k;

    /* renamed from: l  reason: collision with root package name */
    public final String f38850l;

    private C6666d(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, String str) {
        this.f38839a = list;
        this.f38840b = i10;
        this.f38841c = i11;
        this.f38842d = i12;
        this.f38843e = i13;
        this.f38844f = i14;
        this.f38845g = i15;
        this.f38846h = i16;
        this.f38847i = i17;
        this.f38848j = i18;
        this.f38849k = f10;
        this.f38850l = str;
    }

    private static byte[] a(B b10) {
        int P10 = b10.P();
        int f10 = b10.f();
        b10.X(P10);
        return C5954e.g(b10.e(), f10, P10);
    }

    public static C6666d b(B b10) {
        String str;
        float f10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        try {
            b10.X(4);
            int H10 = (b10.H() & 3) + 1;
            if (H10 != 3) {
                ArrayList arrayList = new ArrayList();
                int H11 = b10.H() & 31;
                for (int i18 = 0; i18 < H11; i18++) {
                    arrayList.add(a(b10));
                }
                int H12 = b10.H();
                for (int i19 = 0; i19 < H12; i19++) {
                    arrayList.add(a(b10));
                }
                if (H11 > 0) {
                    e.m z10 = e.z((byte[]) arrayList.get(0), H10, ((byte[]) arrayList.get(0)).length);
                    int i20 = z10.f30140f;
                    int i21 = z10.f30141g;
                    int i22 = z10.f30151q;
                    int i23 = z10.f30152r;
                    int i24 = z10.f30153s;
                    int i25 = z10.f30154t;
                    float f11 = z10.f30142h;
                    str = C5954e.d(z10.f30135a, z10.f30136b, z10.f30137c);
                    i11 = i24;
                    i10 = i25;
                    f10 = f11;
                    i14 = z10.f30144j + 8;
                    i13 = i22;
                    i12 = i23;
                    i17 = i20;
                    i16 = i21;
                    i15 = z10.f30143i + 8;
                } else {
                    i17 = -1;
                    i16 = -1;
                    i15 = -1;
                    i14 = -1;
                    i13 = -1;
                    i12 = -1;
                    i11 = -1;
                    f10 = 1.0f;
                    str = null;
                    i10 = 16;
                }
                return new C6666d(arrayList, H10, i17, i16, i15, i14, i13, i12, i11, i10, f10, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw q3.B.a("Error parsing AVC config", e10);
        }
    }
}
