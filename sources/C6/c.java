package C6;

import D6.d;
import J6.a;
import java.util.Arrays;
import java.util.List;
import z6.C9019a;
import z6.C9023e;

public class c extends n<d, d> {
    public c(List<a<d>> list) {
        super(b(list));
    }

    private static a<d> a(a<d> aVar) {
        d dVar = (d) aVar.f37351b;
        d dVar2 = (d) aVar.f37352c;
        if (dVar == null || dVar2 == null || dVar.d().length == dVar2.d().length) {
            return aVar;
        }
        float[] c10 = c(dVar.d(), dVar2.d());
        return aVar.b(dVar.a(c10), dVar2.a(c10));
    }

    private static List<a<d>> b(List<a<d>> list) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            list.set(i10, a(list.get(i10)));
        }
        return list;
    }

    static float[] c(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f10 = Float.NaN;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            float f11 = fArr3[i11];
            if (f11 != f10) {
                fArr3[i10] = f11;
                i10++;
                f10 = fArr3[i11];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i10);
    }

    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    public C9019a<d, d> h() {
        return new C9023e(this.f33747a);
    }

    public /* bridge */ /* synthetic */ List i() {
        return super.i();
    }

    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
