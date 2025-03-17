package i2;

import i2.C5442e;
import j2.C5484d;
import java.util.Arrays;
import java.util.HashMap;
import k2.d;
import m2.j;
import p2.e;

/* renamed from: i2.d  reason: case insensitive filesystem */
public class C5441d implements Comparable<C5441d> {

    /* renamed from: t  reason: collision with root package name */
    static String[] f24465t = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a  reason: collision with root package name */
    d f24466a;

    /* renamed from: b  reason: collision with root package name */
    int f24467b = 0;

    /* renamed from: c  reason: collision with root package name */
    float f24468c;

    /* renamed from: d  reason: collision with root package name */
    float f24469d;

    /* renamed from: e  reason: collision with root package name */
    float f24470e;

    /* renamed from: f  reason: collision with root package name */
    float f24471f;

    /* renamed from: g  reason: collision with root package name */
    float f24472g;

    /* renamed from: h  reason: collision with root package name */
    float f24473h;

    /* renamed from: i  reason: collision with root package name */
    float f24474i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    float f24475j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    int f24476k = -1;

    /* renamed from: l  reason: collision with root package name */
    String f24477l = null;

    /* renamed from: m  reason: collision with root package name */
    float f24478m = Float.NaN;

    /* renamed from: n  reason: collision with root package name */
    C5439b f24479n = null;

    /* renamed from: o  reason: collision with root package name */
    HashMap<String, C5438a> f24480o = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    int f24481p = 0;

    /* renamed from: q  reason: collision with root package name */
    int f24482q;

    /* renamed from: r  reason: collision with root package name */
    double[] f24483r = new double[18];

    /* renamed from: s  reason: collision with root package name */
    double[] f24484s = new double[18];

    public C5441d() {
    }

    private boolean j(float f10, float f11) {
        return (Float.isNaN(f10) || Float.isNaN(f11)) ? Float.isNaN(f10) != Float.isNaN(f11) : Math.abs(f10 - f11) > 1.0E-6f;
    }

    /* access modifiers changed from: package-private */
    public void B(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        int[] iArr2 = iArr;
        float f11 = this.f24470e;
        float f12 = this.f24471f;
        float f13 = this.f24472g;
        float f14 = this.f24473h;
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float f18 = 0.0f;
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            float f19 = (float) dArr[i10];
            float f20 = (float) dArr2[i10];
            int i11 = iArr2[i10];
            if (i11 == 1) {
                f11 = f19;
                f15 = f20;
            } else if (i11 == 2) {
                f12 = f19;
                f17 = f20;
            } else if (i11 == 3) {
                f13 = f19;
                f16 = f20;
            } else if (i11 == 4) {
                f14 = f19;
                f18 = f20;
            }
        }
        float f21 = 2.0f;
        float f22 = (f16 / 2.0f) + f15;
        float f23 = (f18 / 2.0f) + f17;
        C5439b bVar = this.f24479n;
        if (bVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            bVar.k(d10, fArr3, fArr4);
            float f24 = fArr3[0];
            float f25 = fArr3[1];
            float f26 = fArr4[0];
            double d11 = (double) f11;
            float f27 = fArr4[1];
            double d12 = (double) f12;
            f10 = f13;
            double d13 = (double) f15;
            double d14 = (double) f17;
            float sin = (float) (((double) f26) + (Math.sin(d12) * d13) + (Math.cos(d12) * d14));
            f23 = (float) ((((double) f27) - (d13 * Math.cos(d12))) + (Math.sin(d12) * d14));
            f22 = sin;
            f11 = (float) ((((double) f24) + (Math.sin(d12) * d11)) - ((double) (f13 / 2.0f)));
            f12 = (float) ((((double) f25) - (d11 * Math.cos(d12))) - ((double) (f14 / 2.0f)));
            f21 = 2.0f;
        } else {
            f10 = f13;
        }
        fArr[0] = f11 + (f10 / f21) + 0.0f;
        fArr[1] = f12 + (f14 / f21) + 0.0f;
        fArr2[0] = f22;
        fArr2[1] = f23;
    }

    /* access modifiers changed from: package-private */
    public int C(String str, double[] dArr, int i10) {
        C5438a aVar = this.f24480o.get(str);
        int i11 = 0;
        if (aVar == null) {
            return 0;
        }
        if (aVar.m() == 1) {
            dArr[i10] = (double) aVar.j();
            return 1;
        }
        int m10 = aVar.m();
        float[] fArr = new float[m10];
        aVar.k(fArr);
        while (i11 < m10) {
            dArr[i10] = (double) fArr[i11];
            i11++;
            i10++;
        }
        return m10;
    }

    /* access modifiers changed from: package-private */
    public int D(String str) {
        C5438a aVar = this.f24480o.get(str);
        if (aVar == null) {
            return 0;
        }
        return aVar.m();
    }

    /* access modifiers changed from: package-private */
    public boolean E(String str) {
        return this.f24480o.containsKey(str);
    }

    /* access modifiers changed from: package-private */
    public void F(C5484d dVar, C5441d dVar2, C5441d dVar3) {
        C5484d dVar4 = dVar;
        C5441d dVar5 = dVar2;
        C5441d dVar6 = dVar3;
        float f10 = ((float) dVar4.f24728a) / 100.0f;
        this.f24468c = f10;
        this.f24467b = dVar4.f24772j;
        float f11 = Float.isNaN(dVar4.f24773k) ? f10 : dVar4.f24773k;
        float f12 = Float.isNaN(dVar4.f24774l) ? f10 : dVar4.f24774l;
        float f13 = dVar6.f24472g;
        float f14 = dVar5.f24472g;
        float f15 = dVar6.f24473h;
        float f16 = dVar5.f24473h;
        this.f24469d = this.f24468c;
        float f17 = dVar5.f24470e;
        float f18 = dVar5.f24471f;
        float f19 = (dVar6.f24470e + (f13 / 2.0f)) - ((f14 / 2.0f) + f17);
        float f20 = (dVar6.f24471f + (f15 / 2.0f)) - (f18 + (f16 / 2.0f));
        float f21 = (f13 - f14) * f11;
        float f22 = f21 / 2.0f;
        this.f24470e = (float) ((int) ((f17 + (f19 * f10)) - f22));
        float f23 = (f15 - f16) * f12;
        float f24 = f23 / 2.0f;
        this.f24471f = (float) ((int) ((f18 + (f20 * f10)) - f24));
        this.f24472g = (float) ((int) (f14 + f21));
        this.f24473h = (float) ((int) (f16 + f23));
        C5484d dVar7 = dVar;
        float f25 = Float.isNaN(dVar7.f24775m) ? f10 : dVar7.f24775m;
        float f26 = 0.0f;
        float f27 = Float.isNaN(dVar7.f24778p) ? 0.0f : dVar7.f24778p;
        if (!Float.isNaN(dVar7.f24776n)) {
            f10 = dVar7.f24776n;
        }
        if (!Float.isNaN(dVar7.f24777o)) {
            f26 = dVar7.f24777o;
        }
        this.f24481p = 0;
        C5441d dVar8 = dVar2;
        this.f24470e = (float) ((int) (((dVar8.f24470e + (f25 * f19)) + (f26 * f20)) - f22));
        this.f24471f = (float) ((int) (((dVar8.f24471f + (f19 * f27)) + (f20 * f10)) - f24));
        this.f24466a = d.c(dVar7.f24770h);
        this.f24476k = dVar7.f24771i;
    }

    /* access modifiers changed from: package-private */
    public void G(C5484d dVar, C5441d dVar2, C5441d dVar3) {
        C5484d dVar4 = dVar;
        C5441d dVar5 = dVar2;
        C5441d dVar6 = dVar3;
        float f10 = ((float) dVar4.f24728a) / 100.0f;
        this.f24468c = f10;
        this.f24467b = dVar4.f24772j;
        float f11 = Float.isNaN(dVar4.f24773k) ? f10 : dVar4.f24773k;
        float f12 = Float.isNaN(dVar4.f24774l) ? f10 : dVar4.f24774l;
        float f13 = dVar6.f24472g - dVar5.f24472g;
        float f14 = dVar6.f24473h - dVar5.f24473h;
        this.f24469d = this.f24468c;
        if (!Float.isNaN(dVar4.f24775m)) {
            f10 = dVar4.f24775m;
        }
        float f15 = dVar5.f24470e;
        float f16 = dVar5.f24472g;
        float f17 = dVar5.f24471f;
        float f18 = dVar5.f24473h;
        float f19 = (dVar6.f24470e + (dVar6.f24472g / 2.0f)) - ((f16 / 2.0f) + f15);
        float f20 = (dVar6.f24471f + (dVar6.f24473h / 2.0f)) - ((f18 / 2.0f) + f17);
        float f21 = f19 * f10;
        float f22 = f13 * f11;
        float f23 = f22 / 2.0f;
        this.f24470e = (float) ((int) ((f15 + f21) - f23));
        float f24 = f10 * f20;
        float f25 = f14 * f12;
        float f26 = f25 / 2.0f;
        this.f24471f = (float) ((int) ((f17 + f24) - f26));
        this.f24472g = (float) ((int) (f16 + f22));
        this.f24473h = (float) ((int) (f18 + f25));
        C5484d dVar7 = dVar;
        float f27 = Float.isNaN(dVar7.f24776n) ? 0.0f : dVar7.f24776n;
        float f28 = (-f20) * f27;
        float f29 = f19 * f27;
        this.f24481p = 1;
        C5441d dVar8 = dVar2;
        this.f24470e = ((float) ((int) ((dVar8.f24470e + f21) - f23))) + f28;
        this.f24471f = ((float) ((int) ((dVar8.f24471f + f24) - f26))) + f29;
        this.f24477l = this.f24477l;
        this.f24466a = d.c(dVar7.f24770h);
        this.f24476k = dVar7.f24771i;
    }

    /* access modifiers changed from: package-private */
    public void H(int i10, int i11, C5484d dVar, C5441d dVar2, C5441d dVar3) {
        float f10;
        float f11;
        float f12 = ((float) dVar.f24728a) / 100.0f;
        this.f24468c = f12;
        this.f24467b = dVar.f24772j;
        this.f24481p = dVar.f24779q;
        float f13 = Float.isNaN(dVar.f24773k) ? f12 : dVar.f24773k;
        float f14 = Float.isNaN(dVar.f24774l) ? f12 : dVar.f24774l;
        float f15 = dVar3.f24472g;
        float f16 = dVar2.f24472g;
        float f17 = dVar3.f24473h;
        float f18 = dVar2.f24473h;
        this.f24469d = this.f24468c;
        this.f24472g = (float) ((int) (f16 + ((f15 - f16) * f13)));
        this.f24473h = (float) ((int) (f18 + ((f17 - f18) * f14)));
        int i12 = dVar.f24779q;
        if (i12 == 1) {
            float f19 = Float.isNaN(dVar.f24775m) ? f12 : dVar.f24775m;
            float f20 = dVar3.f24470e;
            float f21 = dVar2.f24470e;
            this.f24470e = (f19 * (f20 - f21)) + f21;
            if (!Float.isNaN(dVar.f24776n)) {
                f12 = dVar.f24776n;
            }
            float f22 = dVar3.f24471f;
            float f23 = dVar2.f24471f;
            this.f24471f = (f12 * (f22 - f23)) + f23;
        } else if (i12 != 2) {
            float f24 = Float.isNaN(dVar.f24775m) ? f12 : dVar.f24775m;
            float f25 = dVar3.f24470e;
            float f26 = dVar2.f24470e;
            this.f24470e = (f24 * (f25 - f26)) + f26;
            if (!Float.isNaN(dVar.f24776n)) {
                f12 = dVar.f24776n;
            }
            float f27 = dVar3.f24471f;
            float f28 = dVar2.f24471f;
            this.f24471f = (f12 * (f27 - f28)) + f28;
        } else {
            if (Float.isNaN(dVar.f24775m)) {
                float f29 = dVar3.f24470e;
                float f30 = dVar2.f24470e;
                f10 = ((f29 - f30) * f12) + f30;
            } else {
                f10 = Math.min(f14, f13) * dVar.f24775m;
            }
            this.f24470e = f10;
            if (Float.isNaN(dVar.f24776n)) {
                float f31 = dVar3.f24471f;
                float f32 = dVar2.f24471f;
                f11 = (f12 * (f31 - f32)) + f32;
            } else {
                f11 = dVar.f24776n;
            }
            this.f24471f = f11;
        }
        this.f24477l = dVar2.f24477l;
        this.f24466a = d.c(dVar.f24770h);
        this.f24476k = dVar.f24771i;
    }

    /* access modifiers changed from: package-private */
    public void I(int i10, int i11, C5484d dVar, C5441d dVar2, C5441d dVar3) {
        C5484d dVar4 = dVar;
        C5441d dVar5 = dVar2;
        C5441d dVar6 = dVar3;
        float f10 = ((float) dVar4.f24728a) / 100.0f;
        this.f24468c = f10;
        this.f24467b = dVar4.f24772j;
        float f11 = Float.isNaN(dVar4.f24773k) ? f10 : dVar4.f24773k;
        float f12 = Float.isNaN(dVar4.f24774l) ? f10 : dVar4.f24774l;
        float f13 = dVar6.f24472g;
        float f14 = dVar5.f24472g;
        float f15 = dVar6.f24473h;
        float f16 = dVar5.f24473h;
        this.f24469d = this.f24468c;
        float f17 = dVar5.f24470e;
        float f18 = dVar5.f24471f;
        float f19 = dVar6.f24470e + (f13 / 2.0f);
        float f20 = dVar6.f24471f + (f15 / 2.0f);
        float f21 = (f13 - f14) * f11;
        this.f24470e = (float) ((int) ((f17 + ((f19 - ((f14 / 2.0f) + f17)) * f10)) - (f21 / 2.0f)));
        float f22 = (f15 - f16) * f12;
        this.f24471f = (float) ((int) ((f18 + ((f20 - (f18 + (f16 / 2.0f))) * f10)) - (f22 / 2.0f)));
        this.f24472g = (float) ((int) (f14 + f21));
        this.f24473h = (float) ((int) (f16 + f22));
        this.f24481p = 2;
        C5484d dVar7 = dVar;
        if (!Float.isNaN(dVar7.f24775m)) {
            this.f24470e = (float) ((int) (dVar7.f24775m * ((float) (i10 - ((int) this.f24472g)))));
        }
        if (!Float.isNaN(dVar7.f24776n)) {
            this.f24471f = (float) ((int) (dVar7.f24776n * ((float) (i11 - ((int) this.f24473h)))));
        }
        this.f24477l = this.f24477l;
        this.f24466a = d.c(dVar7.f24770h);
        this.f24476k = dVar7.f24771i;
    }

    /* access modifiers changed from: package-private */
    public void J(float f10, float f11, float f12, float f13) {
        this.f24470e = f10;
        this.f24471f = f11;
        this.f24472g = f12;
        this.f24473h = f13;
    }

    /* access modifiers changed from: package-private */
    public void K(float f10, float f11, float[] fArr, int[] iArr, double[] dArr, double[] dArr2) {
        int[] iArr2 = iArr;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        for (int i10 = 0; i10 < iArr2.length; i10++) {
            float f16 = (float) dArr[i10];
            int i11 = iArr2[i10];
            if (i11 == 1) {
                f12 = f16;
            } else if (i11 == 2) {
                f14 = f16;
            } else if (i11 == 3) {
                f13 = f16;
            } else if (i11 == 4) {
                f15 = f16;
            }
        }
        float f17 = f12 - ((0.0f * f13) / 2.0f);
        float f18 = f14 - ((0.0f * f15) / 2.0f);
        fArr[0] = (f17 * (1.0f - f10)) + (((f13 * 1.0f) + f17) * f10) + 0.0f;
        fArr[1] = (f18 * (1.0f - f11)) + (((f15 * 1.0f) + f18) * f11) + 0.0f;
    }

    /* access modifiers changed from: package-private */
    public void L(float f10, C5442e eVar, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3) {
        float f11;
        float f12;
        C5442e eVar2 = eVar;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f13 = this.f24470e;
        float f14 = this.f24471f;
        float f15 = this.f24472g;
        float f16 = this.f24473h;
        if (iArr2.length != 0 && this.f24483r.length <= iArr2[iArr2.length - 1]) {
            int i10 = iArr2[iArr2.length - 1] + 1;
            this.f24483r = new double[i10];
            this.f24484s = new double[i10];
        }
        Arrays.fill(this.f24483r, Double.NaN);
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            double[] dArr5 = this.f24483r;
            int i12 = iArr2[i11];
            dArr5[i12] = dArr[i11];
            this.f24484s[i12] = dArr4[i11];
        }
        float f17 = Float.NaN;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr6 = this.f24483r;
            if (i13 >= dArr6.length) {
                break;
            }
            double d10 = 0.0d;
            if (!Double.isNaN(dArr6[i13]) || !(dArr3 == null || dArr3[i13] == 0.0d)) {
                if (dArr3 != null) {
                    d10 = dArr3[i13];
                }
                if (!Double.isNaN(this.f24483r[i13])) {
                    d10 = this.f24483r[i13] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.f24484s[i13];
                if (i13 == 1) {
                    f17 = f12;
                    f18 = f23;
                    f13 = f22;
                } else if (i13 == 2) {
                    f17 = f12;
                    f19 = f23;
                    f14 = f22;
                } else if (i13 == 3) {
                    f17 = f12;
                    f20 = f23;
                    f15 = f22;
                } else if (i13 == 4) {
                    f17 = f12;
                    f21 = f23;
                    f16 = f22;
                } else if (i13 == 5) {
                    f17 = f22;
                }
                i13++;
                double[] dArr7 = dArr2;
            } else {
                f12 = f17;
            }
            f17 = f12;
            i13++;
            double[] dArr72 = dArr2;
        }
        float f24 = f17;
        C5439b bVar = this.f24479n;
        if (bVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            bVar.k((double) f10, fArr, fArr2);
            float f25 = fArr[0];
            float f26 = fArr[1];
            float f27 = fArr2[0];
            float f28 = fArr2[1];
            double d11 = (double) f13;
            double d12 = (double) f14;
            double sin = ((double) f25) + (Math.sin(d12) * d11);
            f11 = f16;
            float f29 = (float) (sin - ((double) (f15 / 2.0f)));
            float cos = (float) ((((double) f26) - (Math.cos(d12) * d11)) - ((double) (f16 / 2.0f)));
            double d13 = (double) f18;
            double d14 = (double) f19;
            float sin2 = (float) (((double) f27) + (Math.sin(d12) * d13) + (Math.cos(d12) * d11 * d14));
            float f30 = f29;
            float cos2 = (float) ((((double) f28) - (d13 * Math.cos(d12))) + (d11 * Math.sin(d12) * d14));
            double[] dArr8 = dArr2;
            if (dArr8.length >= 2) {
                dArr8[0] = (double) sin2;
                dArr8[1] = (double) cos2;
            }
            if (!Float.isNaN(f24)) {
                eVar2.L((float) (((double) f24) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f13 = f30;
            f14 = cos;
        } else {
            float f31 = f24;
            f11 = f16;
            if (!Float.isNaN(f31)) {
                eVar2.L(((float) (((double) f31) + Math.toDegrees(Math.atan2((double) (f19 + (f21 / 2.0f)), (double) (f18 + (f20 / 2.0f)))))) + 0.0f);
            }
        }
        float f32 = f13 + 0.5f;
        float f33 = f14 + 0.5f;
        eVar2.E((int) f32, (int) f33, (int) (f32 + f15), (int) (f33 + f11));
    }

    public void M(C5439b bVar, C5441d dVar) {
        double d10 = (double) (((this.f24470e + (this.f24472g / 2.0f)) - dVar.f24470e) - (dVar.f24472g / 2.0f));
        double d11 = (double) (((this.f24471f + (this.f24473h / 2.0f)) - dVar.f24471f) - (dVar.f24473h / 2.0f));
        this.f24479n = bVar;
        this.f24470e = (float) Math.hypot(d11, d10);
        if (Float.isNaN(this.f24478m)) {
            this.f24471f = (float) (Math.atan2(d11, d10) + 1.5707963267948966d);
        } else {
            this.f24471f = (float) Math.toRadians((double) this.f24478m);
        }
    }

    public void a(C5442e eVar) {
        e eVar2;
        this.f24466a = d.c(eVar.f24486b.f24492c);
        C5442e.a aVar = eVar.f24486b;
        this.f24476k = aVar.f24493d;
        this.f24477l = aVar.f24490a;
        this.f24474i = aVar.f24497h;
        this.f24467b = aVar.f24494e;
        this.f24482q = aVar.f24491b;
        this.f24475j = eVar.f24487c.f24506d;
        j jVar = eVar.f24485a;
        if (!(jVar == null || (eVar2 = jVar.f26226a) == null)) {
            this.f24478m = eVar2.f27420I;
        }
        for (String next : eVar.j()) {
            C5438a i10 = eVar.i(next);
            if (i10 != null && i10.l()) {
                this.f24480o.put(next, i10);
            }
        }
    }

    /* renamed from: b */
    public int compareTo(C5441d dVar) {
        return Float.compare(this.f24469d, dVar.f24469d);
    }

    /* access modifiers changed from: package-private */
    public void m(C5441d dVar, boolean[] zArr, String[] strArr, boolean z10) {
        boolean j10 = j(this.f24470e, dVar.f24470e);
        boolean j11 = j(this.f24471f, dVar.f24471f);
        boolean z11 = false;
        zArr[0] = zArr[0] | j(this.f24469d, dVar.f24469d);
        zArr[1] = zArr[1] | (j10 || j11 || z10);
        boolean z12 = zArr[2];
        if (j10 || j11 || z10) {
            z11 = true;
        }
        zArr[2] = z12 | z11;
        zArr[3] = zArr[3] | j(this.f24472g, dVar.f24472g);
        zArr[4] = j(this.f24473h, dVar.f24473h) | zArr[4];
    }

    /* access modifiers changed from: package-private */
    public void n(double[] dArr, int[] iArr) {
        float[] fArr = {this.f24469d, this.f24470e, this.f24471f, this.f24472g, this.f24473h, this.f24474i};
        int i10 = 0;
        for (int i11 : iArr) {
            if (i11 < 6) {
                dArr[i10] = (double) fArr[i11];
                i10++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void v(double d10, int[] iArr, double[] dArr, float[] fArr, int i10) {
        int[] iArr2 = iArr;
        float f10 = this.f24470e;
        float f11 = this.f24471f;
        float f12 = this.f24472g;
        float f13 = this.f24473h;
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            float f14 = (float) dArr[i11];
            int i12 = iArr2[i11];
            if (i12 == 1) {
                f10 = f14;
            } else if (i12 == 2) {
                f11 = f14;
            } else if (i12 == 3) {
                f12 = f14;
            } else if (i12 == 4) {
                f13 = f14;
            }
        }
        C5439b bVar = this.f24479n;
        if (bVar != null) {
            float[] fArr2 = new float[2];
            bVar.k(d10, fArr2, new float[2]);
            float f15 = fArr2[0];
            float f16 = fArr2[1];
            double d11 = (double) f15;
            double d12 = (double) f10;
            double d13 = (double) f11;
            f10 = (float) ((d11 + (Math.sin(d13) * d12)) - ((double) (f12 / 2.0f)));
            f11 = (float) ((((double) f16) - (d12 * Math.cos(d13))) - ((double) (f13 / 2.0f)));
        }
        fArr[i10] = f10 + (f12 / 2.0f) + 0.0f;
        fArr[i10 + 1] = f11 + (f13 / 2.0f) + 0.0f;
    }

    public C5441d(int i10, int i11, C5484d dVar, C5441d dVar2, C5441d dVar3) {
        if (dVar2.f24477l != null) {
            H(i10, i11, dVar, dVar2, dVar3);
            return;
        }
        int i12 = dVar.f24779q;
        if (i12 == 1) {
            G(dVar, dVar2, dVar3);
        } else if (i12 != 2) {
            F(dVar, dVar2, dVar3);
        } else {
            I(i10, i11, dVar, dVar2, dVar3);
        }
    }
}
