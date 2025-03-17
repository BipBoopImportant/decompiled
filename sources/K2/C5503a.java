package k2;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.util.Arrays;

/* renamed from: k2.a  reason: case insensitive filesystem */
public class C5503a extends b {

    /* renamed from: a  reason: collision with root package name */
    private final double[] f25023a;

    /* renamed from: b  reason: collision with root package name */
    C0401a[] f25024b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f25025c = true;

    /* renamed from: k2.a$a  reason: collision with other inner class name */
    private static class C0401a {

        /* renamed from: s  reason: collision with root package name */
        private static double[] f25026s = new double[91];

        /* renamed from: a  reason: collision with root package name */
        double[] f25027a;

        /* renamed from: b  reason: collision with root package name */
        double f25028b;

        /* renamed from: c  reason: collision with root package name */
        double f25029c;

        /* renamed from: d  reason: collision with root package name */
        double f25030d;

        /* renamed from: e  reason: collision with root package name */
        double f25031e;

        /* renamed from: f  reason: collision with root package name */
        double f25032f;

        /* renamed from: g  reason: collision with root package name */
        double f25033g;

        /* renamed from: h  reason: collision with root package name */
        double f25034h;

        /* renamed from: i  reason: collision with root package name */
        double f25035i;

        /* renamed from: j  reason: collision with root package name */
        double f25036j;

        /* renamed from: k  reason: collision with root package name */
        double f25037k;

        /* renamed from: l  reason: collision with root package name */
        double f25038l;

        /* renamed from: m  reason: collision with root package name */
        double f25039m;

        /* renamed from: n  reason: collision with root package name */
        double f25040n;

        /* renamed from: o  reason: collision with root package name */
        double f25041o;

        /* renamed from: p  reason: collision with root package name */
        double f25042p;

        /* renamed from: q  reason: collision with root package name */
        boolean f25043q;

        /* renamed from: r  reason: collision with root package name */
        boolean f25044r = false;

        C0401a(int i10, double d10, double d11, double d12, double d13, double d14, double d15) {
            int i11 = i10;
            double d16 = d10;
            double d17 = d11;
            double d18 = d12;
            double d19 = d13;
            double d20 = d14 - d18;
            double d21 = d15 - d19;
            int i12 = 1;
            if (i11 == 1) {
                this.f25043q = true;
            } else if (i11 == 4) {
                this.f25043q = d21 > 0.0d;
            } else if (i11 != 5) {
                this.f25043q = false;
            } else {
                this.f25043q = d21 < 0.0d;
            }
            this.f25029c = d16;
            this.f25030d = d17;
            this.f25035i = 1.0d / (d17 - d16);
            if (3 == i11) {
                this.f25044r = true;
            }
            if (this.f25044r || Math.abs(d20) < 0.001d || Math.abs(d21) < 0.001d) {
                this.f25044r = true;
                this.f25031e = d18;
                double d22 = d21;
                this.f25032f = d14;
                this.f25033g = d19;
                this.f25034h = d15;
                double hypot = Math.hypot(d22, d20);
                this.f25028b = hypot;
                this.f25040n = hypot * this.f25035i;
                double d23 = this.f25030d;
                double d24 = this.f25029c;
                this.f25038l = d20 / (d23 - d24);
                this.f25039m = d22 / (d23 - d24);
                return;
            }
            this.f25027a = new double[CheckoutActivity.RESULT_CANCELED];
            boolean z10 = this.f25043q;
            this.f25036j = d20 * ((double) (z10 ? -1 : 1));
            this.f25037k = d21 * ((double) (!z10 ? -1 : i12));
            this.f25038l = z10 ? d14 : d18;
            this.f25039m = z10 ? d19 : d15;
            a(d12, d13, d14, d15);
            this.f25040n = this.f25028b * this.f25035i;
        }

        private void a(double d10, double d11, double d12, double d13) {
            double d14;
            double d15 = d12 - d10;
            double d16 = d11 - d13;
            int i10 = 0;
            double d17 = 0.0d;
            double d18 = 0.0d;
            double d19 = 0.0d;
            while (true) {
                double[] dArr = f25026s;
                if (i10 >= dArr.length) {
                    break;
                }
                double d20 = d17;
                double radians = Math.toRadians((((double) i10) * 90.0d) / ((double) (dArr.length - 1)));
                double sin = Math.sin(radians) * d15;
                double cos = Math.cos(radians) * d16;
                if (i10 > 0) {
                    d14 = Math.hypot(sin - d18, cos - d19) + d20;
                    f25026s[i10] = d14;
                } else {
                    d14 = d20;
                }
                i10++;
                d19 = cos;
                double d21 = sin;
                d17 = d14;
                d18 = d21;
            }
            double d22 = d17;
            this.f25028b = d22;
            int i11 = 0;
            while (true) {
                double[] dArr2 = f25026s;
                if (i11 >= dArr2.length) {
                    break;
                }
                dArr2[i11] = dArr2[i11] / d22;
                i11++;
            }
            int i12 = 0;
            while (true) {
                double[] dArr3 = this.f25027a;
                if (i12 < dArr3.length) {
                    double length = ((double) i12) / ((double) (dArr3.length - 1));
                    int binarySearch = Arrays.binarySearch(f25026s, length);
                    if (binarySearch >= 0) {
                        this.f25027a[i12] = ((double) binarySearch) / ((double) (f25026s.length - 1));
                    } else if (binarySearch == -1) {
                        this.f25027a[i12] = 0.0d;
                    } else {
                        int i13 = -binarySearch;
                        int i14 = i13 - 2;
                        double[] dArr4 = f25026s;
                        double d23 = dArr4[i14];
                        this.f25027a[i12] = (((double) i14) + ((length - d23) / (dArr4[i13 - 1] - d23))) / ((double) (dArr4.length - 1));
                    }
                    i12++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public double b() {
            double d10 = this.f25036j * this.f25042p;
            double hypot = this.f25040n / Math.hypot(d10, (-this.f25037k) * this.f25041o);
            if (this.f25043q) {
                d10 = -d10;
            }
            return d10 * hypot;
        }

        /* access modifiers changed from: package-private */
        public double c() {
            double d10 = this.f25036j * this.f25042p;
            double d11 = (-this.f25037k) * this.f25041o;
            double hypot = this.f25040n / Math.hypot(d10, d11);
            return this.f25043q ? (-d11) * hypot : d11 * hypot;
        }

        public double d(double d10) {
            return this.f25038l;
        }

        public double e(double d10) {
            return this.f25039m;
        }

        public double f(double d10) {
            double d11 = (d10 - this.f25029c) * this.f25035i;
            double d12 = this.f25031e;
            return d12 + (d11 * (this.f25032f - d12));
        }

        public double g(double d10) {
            double d11 = (d10 - this.f25029c) * this.f25035i;
            double d12 = this.f25033g;
            return d12 + (d11 * (this.f25034h - d12));
        }

        /* access modifiers changed from: package-private */
        public double h() {
            return this.f25038l + (this.f25036j * this.f25041o);
        }

        /* access modifiers changed from: package-private */
        public double i() {
            return this.f25039m + (this.f25037k * this.f25042p);
        }

        /* access modifiers changed from: package-private */
        public double j(double d10) {
            if (d10 <= 0.0d) {
                return 0.0d;
            }
            if (d10 >= 1.0d) {
                return 1.0d;
            }
            double[] dArr = this.f25027a;
            double length = d10 * ((double) (dArr.length - 1));
            int i10 = (int) length;
            double d11 = length - ((double) i10);
            double d12 = dArr[i10];
            return d12 + (d11 * (dArr[i10 + 1] - d12));
        }

        /* access modifiers changed from: package-private */
        public void k(double d10) {
            double j10 = j((this.f25043q ? this.f25030d - d10 : d10 - this.f25029c) * this.f25035i) * 1.5707963267948966d;
            this.f25041o = Math.sin(j10);
            this.f25042p = Math.cos(j10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0030, code lost:
        if (r5 == 1) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5503a(int[] r25, double[] r26, double[][] r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r24.<init>()
            r2 = 1
            r0.f25025c = r2
            r0.f25023a = r1
            int r3 = r1.length
            int r3 = r3 - r2
            k2.a$a[] r3 = new k2.C5503a.C0401a[r3]
            r0.f25024b = r3
            r3 = 0
            r5 = r2
            r6 = r5
            r4 = r3
        L_0x0016:
            k2.a$a[] r7 = r0.f25024b
            int r8 = r7.length
            if (r4 >= r8) goto L_0x0058
            r8 = r25[r4]
            r9 = 3
            if (r8 == 0) goto L_0x002e
            if (r8 == r2) goto L_0x0037
            r10 = 2
            if (r8 == r10) goto L_0x0035
            if (r8 == r9) goto L_0x0030
            r9 = 4
            if (r8 == r9) goto L_0x002e
            r9 = 5
            if (r8 == r9) goto L_0x002e
            goto L_0x0039
        L_0x002e:
            r6 = r9
            goto L_0x0039
        L_0x0030:
            if (r5 != r2) goto L_0x0037
            goto L_0x0035
        L_0x0033:
            r6 = r5
            goto L_0x0039
        L_0x0035:
            r5 = r10
            goto L_0x0033
        L_0x0037:
            r5 = r2
            goto L_0x0033
        L_0x0039:
            k2.a$a r22 = new k2.a$a
            r10 = r1[r4]
            int r23 = r4 + 1
            r12 = r1[r23]
            r8 = r27[r4]
            r14 = r8[r3]
            r16 = r8[r2]
            r8 = r27[r23]
            r18 = r8[r3]
            r20 = r8[r2]
            r8 = r22
            r9 = r6
            r8.<init>(r9, r10, r12, r14, r16, r18, r20)
            r7[r4] = r22
            r4 = r23
            goto L_0x0016
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k2.C5503a.<init>(int[], double[], double[][]):void");
    }

    public double c(double d10, int i10) {
        double g10;
        double e10;
        double i11;
        double c10;
        double g11;
        double e11;
        int i12 = 0;
        if (this.f25025c) {
            C0401a[] aVarArr = this.f25024b;
            C0401a aVar = aVarArr[0];
            double d11 = aVar.f25029c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f25044r) {
                    if (i10 == 0) {
                        g11 = aVar.f(d11);
                        e11 = this.f25024b[0].d(d11);
                    } else {
                        g11 = aVar.g(d11);
                        e11 = this.f25024b[0].e(d11);
                    }
                    return g11 + (d12 * e11);
                }
                aVar.k(d11);
                if (i10 == 0) {
                    i11 = this.f25024b[0].h();
                    c10 = this.f25024b[0].b();
                } else {
                    i11 = this.f25024b[0].i();
                    c10 = this.f25024b[0].c();
                }
                return i11 + (d12 * c10);
            } else if (d10 > aVarArr[aVarArr.length - 1].f25030d) {
                double d13 = aVarArr[aVarArr.length - 1].f25030d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                if (i10 == 0) {
                    g10 = aVarArr[length].f(d13);
                    e10 = this.f25024b[length].d(d13);
                } else {
                    g10 = aVarArr[length].g(d13);
                    e10 = this.f25024b[length].e(d13);
                }
                return g10 + (d14 * e10);
            }
        } else {
            C0401a[] aVarArr2 = this.f25024b;
            double d15 = aVarArr2[0].f25029c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > aVarArr2[aVarArr2.length - 1].f25030d) {
                d10 = aVarArr2[aVarArr2.length - 1].f25030d;
            }
        }
        while (true) {
            C0401a[] aVarArr3 = this.f25024b;
            if (i12 >= aVarArr3.length) {
                return Double.NaN;
            }
            C0401a aVar2 = aVarArr3[i12];
            if (d10 > aVar2.f25030d) {
                i12++;
            } else if (aVar2.f25044r) {
                return i10 == 0 ? aVar2.f(d10) : aVar2.g(d10);
            } else {
                aVar2.k(d10);
                return i10 == 0 ? this.f25024b[i12].h() : this.f25024b[i12].i();
            }
        }
    }

    public void d(double d10, double[] dArr) {
        if (this.f25025c) {
            C0401a[] aVarArr = this.f25024b;
            C0401a aVar = aVarArr[0];
            double d11 = aVar.f25029c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f25044r) {
                    dArr[0] = aVar.f(d11) + (this.f25024b[0].d(d11) * d12);
                    dArr[1] = this.f25024b[0].g(d11) + (d12 * this.f25024b[0].e(d11));
                    return;
                }
                aVar.k(d11);
                dArr[0] = this.f25024b[0].h() + (this.f25024b[0].b() * d12);
                dArr[1] = this.f25024b[0].i() + (d12 * this.f25024b[0].c());
                return;
            } else if (d10 > aVarArr[aVarArr.length - 1].f25030d) {
                double d13 = aVarArr[aVarArr.length - 1].f25030d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                C0401a aVar2 = aVarArr[length];
                if (aVar2.f25044r) {
                    dArr[0] = aVar2.f(d13) + (this.f25024b[length].d(d13) * d14);
                    dArr[1] = this.f25024b[length].g(d13) + (d14 * this.f25024b[length].e(d13));
                    return;
                }
                aVar2.k(d10);
                dArr[0] = this.f25024b[length].h() + (this.f25024b[length].b() * d14);
                dArr[1] = this.f25024b[length].i() + (d14 * this.f25024b[length].c());
                return;
            }
        } else {
            C0401a[] aVarArr2 = this.f25024b;
            double d15 = aVarArr2[0].f25029c;
            if (d10 < d15) {
                d10 = d15;
            }
            if (d10 > aVarArr2[aVarArr2.length - 1].f25030d) {
                d10 = aVarArr2[aVarArr2.length - 1].f25030d;
            }
        }
        int i10 = 0;
        while (true) {
            C0401a[] aVarArr3 = this.f25024b;
            if (i10 < aVarArr3.length) {
                C0401a aVar3 = aVarArr3[i10];
                if (d10 > aVar3.f25030d) {
                    i10++;
                } else if (aVar3.f25044r) {
                    dArr[0] = aVar3.f(d10);
                    dArr[1] = this.f25024b[i10].g(d10);
                    return;
                } else {
                    aVar3.k(d10);
                    dArr[0] = this.f25024b[i10].h();
                    dArr[1] = this.f25024b[i10].i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void e(double d10, float[] fArr) {
        if (this.f25025c) {
            C0401a[] aVarArr = this.f25024b;
            C0401a aVar = aVarArr[0];
            double d11 = aVar.f25029c;
            if (d10 < d11) {
                double d12 = d10 - d11;
                if (aVar.f25044r) {
                    fArr[0] = (float) (aVar.f(d11) + (this.f25024b[0].d(d11) * d12));
                    fArr[1] = (float) (this.f25024b[0].g(d11) + (d12 * this.f25024b[0].e(d11)));
                    return;
                }
                aVar.k(d11);
                fArr[0] = (float) (this.f25024b[0].h() + (this.f25024b[0].b() * d12));
                fArr[1] = (float) (this.f25024b[0].i() + (d12 * this.f25024b[0].c()));
                return;
            } else if (d10 > aVarArr[aVarArr.length - 1].f25030d) {
                double d13 = aVarArr[aVarArr.length - 1].f25030d;
                double d14 = d10 - d13;
                int length = aVarArr.length - 1;
                C0401a aVar2 = aVarArr[length];
                if (aVar2.f25044r) {
                    fArr[0] = (float) (aVar2.f(d13) + (this.f25024b[length].d(d13) * d14));
                    fArr[1] = (float) (this.f25024b[length].g(d13) + (d14 * this.f25024b[length].e(d13)));
                    return;
                }
                aVar2.k(d10);
                fArr[0] = (float) this.f25024b[length].h();
                fArr[1] = (float) this.f25024b[length].i();
                return;
            }
        } else {
            C0401a[] aVarArr2 = this.f25024b;
            double d15 = aVarArr2[0].f25029c;
            if (d10 < d15) {
                d10 = d15;
            } else if (d10 > aVarArr2[aVarArr2.length - 1].f25030d) {
                d10 = aVarArr2[aVarArr2.length - 1].f25030d;
            }
        }
        int i10 = 0;
        while (true) {
            C0401a[] aVarArr3 = this.f25024b;
            if (i10 < aVarArr3.length) {
                C0401a aVar3 = aVarArr3[i10];
                if (d10 > aVar3.f25030d) {
                    i10++;
                } else if (aVar3.f25044r) {
                    fArr[0] = (float) aVar3.f(d10);
                    fArr[1] = (float) this.f25024b[i10].g(d10);
                    return;
                } else {
                    aVar3.k(d10);
                    fArr[0] = (float) this.f25024b[i10].h();
                    fArr[1] = (float) this.f25024b[i10].i();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public void f(double d10, double[] dArr) {
        C0401a[] aVarArr = this.f25024b;
        double d11 = aVarArr[0].f25029c;
        if (d10 < d11) {
            d10 = d11;
        } else if (d10 > aVarArr[aVarArr.length - 1].f25030d) {
            d10 = aVarArr[aVarArr.length - 1].f25030d;
        }
        int i10 = 0;
        while (true) {
            C0401a[] aVarArr2 = this.f25024b;
            if (i10 < aVarArr2.length) {
                C0401a aVar = aVarArr2[i10];
                if (d10 > aVar.f25030d) {
                    i10++;
                } else if (aVar.f25044r) {
                    dArr[0] = aVar.d(d10);
                    dArr[1] = this.f25024b[i10].e(d10);
                    return;
                } else {
                    aVar.k(d10);
                    dArr[0] = this.f25024b[i10].b();
                    dArr[1] = this.f25024b[i10].c();
                    return;
                }
            } else {
                return;
            }
        }
    }

    public double[] g() {
        return this.f25023a;
    }
}
