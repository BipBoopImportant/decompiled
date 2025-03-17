package k2;

import i2.C5442e;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import k2.u;

public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    private b f25057a;

    /* renamed from: b  reason: collision with root package name */
    private c f25058b;

    /* renamed from: c  reason: collision with root package name */
    private String f25059c;

    /* renamed from: d  reason: collision with root package name */
    private int f25060d = 0;

    /* renamed from: e  reason: collision with root package name */
    private String f25061e = null;

    /* renamed from: f  reason: collision with root package name */
    public int f25062f = 0;

    /* renamed from: g  reason: collision with root package name */
    ArrayList<e> f25063g = new ArrayList<>();

    class a implements Comparator<e> {
        a() {
        }

        /* renamed from: a */
        public int compare(e eVar, e eVar2) {
            return Integer.compare(eVar.f25085a, eVar2.f25085a);
        }
    }

    private static class b extends g {

        /* renamed from: h  reason: collision with root package name */
        String f25065h;

        /* renamed from: i  reason: collision with root package name */
        int f25066i;

        b(String str) {
            this.f25065h = str;
            this.f25066i = u.b.a(str);
        }

        public void f(C5442e eVar, float f10) {
            eVar.c(this.f25066i, a(f10));
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f25067a;

        /* renamed from: b  reason: collision with root package name */
        k f25068b;

        /* renamed from: c  reason: collision with root package name */
        private final int f25069c = 0;

        /* renamed from: d  reason: collision with root package name */
        private final int f25070d = 1;

        /* renamed from: e  reason: collision with root package name */
        private final int f25071e = 2;

        /* renamed from: f  reason: collision with root package name */
        float[] f25072f;

        /* renamed from: g  reason: collision with root package name */
        double[] f25073g;

        /* renamed from: h  reason: collision with root package name */
        float[] f25074h;

        /* renamed from: i  reason: collision with root package name */
        float[] f25075i;

        /* renamed from: j  reason: collision with root package name */
        float[] f25076j;

        /* renamed from: k  reason: collision with root package name */
        float[] f25077k;

        /* renamed from: l  reason: collision with root package name */
        int f25078l;

        /* renamed from: m  reason: collision with root package name */
        b f25079m;

        /* renamed from: n  reason: collision with root package name */
        double[] f25080n;

        /* renamed from: o  reason: collision with root package name */
        double[] f25081o;

        /* renamed from: p  reason: collision with root package name */
        float f25082p;

        c(int i10, String str, int i11, int i12) {
            k kVar = new k();
            this.f25068b = kVar;
            this.f25078l = i10;
            this.f25067a = i11;
            kVar.e(i10, str);
            this.f25072f = new float[i12];
            this.f25073g = new double[i12];
            this.f25074h = new float[i12];
            this.f25075i = new float[i12];
            this.f25076j = new float[i12];
            this.f25077k = new float[i12];
        }

        public double a(float f10) {
            b bVar = this.f25079m;
            if (bVar != null) {
                bVar.d((double) f10, this.f25080n);
            } else {
                double[] dArr = this.f25080n;
                dArr[0] = (double) this.f25075i[0];
                dArr[1] = (double) this.f25076j[0];
                dArr[2] = (double) this.f25072f[0];
            }
            double[] dArr2 = this.f25080n;
            return dArr2[0] + (this.f25068b.c((double) f10, dArr2[1]) * this.f25080n[2]);
        }

        public void b(int i10, int i11, float f10, float f11, float f12, float f13) {
            this.f25073g[i10] = ((double) i11) / 100.0d;
            this.f25074h[i10] = f10;
            this.f25075i[i10] = f11;
            this.f25076j[i10] = f12;
            this.f25072f[i10] = f13;
        }

        public void c(float f10) {
            this.f25082p = f10;
            int length = this.f25073g.length;
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = length;
            double[][] dArr = (double[][]) Array.newInstance(Double.TYPE, iArr);
            float[] fArr = this.f25072f;
            this.f25080n = new double[(fArr.length + 2)];
            this.f25081o = new double[(fArr.length + 2)];
            if (this.f25073g[0] > 0.0d) {
                this.f25068b.a(0.0d, this.f25074h[0]);
            }
            double[] dArr2 = this.f25073g;
            int length2 = dArr2.length - 1;
            if (dArr2[length2] < 1.0d) {
                this.f25068b.a(1.0d, this.f25074h[length2]);
            }
            for (int i10 = 0; i10 < dArr.length; i10++) {
                double[] dArr3 = dArr[i10];
                dArr3[0] = (double) this.f25075i[i10];
                dArr3[1] = (double) this.f25076j[i10];
                dArr3[2] = (double) this.f25072f[i10];
                this.f25068b.a(this.f25073g[i10], this.f25074h[i10]);
            }
            this.f25068b.d();
            double[] dArr4 = this.f25073g;
            if (dArr4.length > 1) {
                this.f25079m = b.a(0, dArr4, dArr);
            } else {
                this.f25079m = null;
            }
        }
    }

    public static class d extends g {

        /* renamed from: h  reason: collision with root package name */
        String f25083h;

        /* renamed from: i  reason: collision with root package name */
        int f25084i;

        public d(String str) {
            this.f25083h = str;
            this.f25084i = u.b.a(str);
        }

        public void f(C5442e eVar, float f10) {
            eVar.c(this.f25084i, a(f10));
        }

        public void j(C5442e eVar, float f10, double d10, double d11) {
            eVar.L(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }
    }

    static class e {

        /* renamed from: a  reason: collision with root package name */
        int f25085a;

        /* renamed from: b  reason: collision with root package name */
        float f25086b;

        /* renamed from: c  reason: collision with root package name */
        float f25087c;

        /* renamed from: d  reason: collision with root package name */
        float f25088d;

        /* renamed from: e  reason: collision with root package name */
        float f25089e;

        e(int i10, float f10, float f11, float f12, float f13) {
            this.f25085a = i10;
            this.f25086b = f13;
            this.f25087c = f11;
            this.f25088d = f10;
            this.f25089e = f12;
        }
    }

    public static g b(String str) {
        return str.equals("pathRotate") ? new d(str) : new b(str);
    }

    public float a(float f10) {
        return (float) this.f25058b.a(f10);
    }

    /* access modifiers changed from: protected */
    public void c(Object obj) {
    }

    public void d(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13) {
        int i13 = i12;
        this.f25063g.add(new e(i10, f10, f11, f12, f13));
        if (i13 != -1) {
            this.f25062f = i13;
        }
        this.f25060d = i11;
        this.f25061e = str;
    }

    public void e(int i10, int i11, String str, int i12, float f10, float f11, float f12, float f13, Object obj) {
        int i13 = i12;
        this.f25063g.add(new e(i10, f10, f11, f12, f13));
        if (i13 != -1) {
            this.f25062f = i13;
        }
        this.f25060d = i11;
        c(obj);
        this.f25061e = str;
    }

    public void f(C5442e eVar, float f10) {
    }

    public void g(String str) {
        this.f25059c = str;
    }

    public void h(float f10) {
        int size = this.f25063g.size();
        if (size != 0) {
            Collections.sort(this.f25063g, new a());
            double[] dArr = new double[size];
            int[] iArr = new int[2];
            iArr[1] = 3;
            iArr[0] = size;
            double[][] dArr2 = (double[][]) Array.newInstance(Double.TYPE, iArr);
            this.f25058b = new c(this.f25060d, this.f25061e, this.f25062f, size);
            Iterator<e> it = this.f25063g.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                e next = it.next();
                float f11 = next.f25088d;
                dArr[i10] = ((double) f11) * 0.01d;
                double[] dArr3 = dArr2[i10];
                float f12 = next.f25086b;
                dArr3[0] = (double) f12;
                float f13 = next.f25087c;
                dArr3[1] = (double) f13;
                float f14 = next.f25089e;
                dArr3[2] = (double) f14;
                this.f25058b.b(i10, next.f25085a, f11, f13, f14, f12);
                i10++;
                dArr2 = dArr2;
            }
            double[][] dArr4 = dArr2;
            this.f25058b.c(f10);
            this.f25057a = b.a(0, dArr, dArr2);
        }
    }

    public boolean i() {
        return this.f25062f == 1;
    }

    public String toString() {
        String str = this.f25059c;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        Iterator<e> it = this.f25063g.iterator();
        while (it.hasNext()) {
            e next = it.next();
            str = str + "[" + next.f25085a + " , " + decimalFormat.format((double) next.f25086b) + "] ";
        }
        return str;
    }
}
