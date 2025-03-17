package J3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class o {

    /* renamed from: h  reason: collision with root package name */
    private static final Comparator<b> f37320h = new m();

    /* renamed from: i  reason: collision with root package name */
    private static final Comparator<b> f37321i = new n();

    /* renamed from: a  reason: collision with root package name */
    private final int f37322a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<b> f37323b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final b[] f37324c = new b[5];

    /* renamed from: d  reason: collision with root package name */
    private int f37325d = -1;

    /* renamed from: e  reason: collision with root package name */
    private int f37326e;

    /* renamed from: f  reason: collision with root package name */
    private int f37327f;

    /* renamed from: g  reason: collision with root package name */
    private int f37328g;

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f37329a;

        /* renamed from: b  reason: collision with root package name */
        public int f37330b;

        /* renamed from: c  reason: collision with root package name */
        public float f37331c;

        private b() {
        }
    }

    public o(int i10) {
        this.f37322a = i10;
    }

    private void d() {
        if (this.f37325d != 1) {
            Collections.sort(this.f37323b, f37320h);
            this.f37325d = 1;
        }
    }

    private void e() {
        if (this.f37325d != 0) {
            Collections.sort(this.f37323b, f37321i);
            this.f37325d = 0;
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ int g(b bVar, b bVar2) {
        return bVar.f37329a - bVar2.f37329a;
    }

    public void c(int i10, float f10) {
        b bVar;
        d();
        int i11 = this.f37328g;
        if (i11 > 0) {
            b[] bVarArr = this.f37324c;
            int i12 = i11 - 1;
            this.f37328g = i12;
            bVar = bVarArr[i12];
        } else {
            bVar = new b();
        }
        int i13 = this.f37326e;
        this.f37326e = i13 + 1;
        bVar.f37329a = i13;
        bVar.f37330b = i10;
        bVar.f37331c = f10;
        this.f37323b.add(bVar);
        this.f37327f += i10;
        while (true) {
            int i14 = this.f37327f;
            int i15 = this.f37322a;
            if (i14 > i15) {
                int i16 = i14 - i15;
                b bVar2 = this.f37323b.get(0);
                int i17 = bVar2.f37330b;
                if (i17 <= i16) {
                    this.f37327f -= i17;
                    this.f37323b.remove(0);
                    int i18 = this.f37328g;
                    if (i18 < 5) {
                        b[] bVarArr2 = this.f37324c;
                        this.f37328g = i18 + 1;
                        bVarArr2[i18] = bVar2;
                    }
                } else {
                    bVar2.f37330b = i17 - i16;
                    this.f37327f -= i16;
                }
            } else {
                return;
            }
        }
    }

    public float f(float f10) {
        e();
        float f11 = f10 * ((float) this.f37327f);
        int i10 = 0;
        for (int i11 = 0; i11 < this.f37323b.size(); i11++) {
            b bVar = this.f37323b.get(i11);
            i10 += bVar.f37330b;
            if (((float) i10) >= f11) {
                return bVar.f37331c;
            }
        }
        if (this.f37323b.isEmpty()) {
            return Float.NaN;
        }
        ArrayList<b> arrayList = this.f37323b;
        return arrayList.get(arrayList.size() - 1).f37331c;
    }

    public void i() {
        this.f37323b.clear();
        this.f37325d = -1;
        this.f37326e = 0;
        this.f37327f = 0;
    }
}
