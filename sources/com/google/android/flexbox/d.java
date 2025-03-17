package com.google.android.flexbox;

import I2.C4638v;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.core.widget.c;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class d {

    /* renamed from: a  reason: collision with root package name */
    private final a f47886a;

    /* renamed from: b  reason: collision with root package name */
    private boolean[] f47887b;

    /* renamed from: c  reason: collision with root package name */
    int[] f47888c;

    /* renamed from: d  reason: collision with root package name */
    long[] f47889d;

    /* renamed from: e  reason: collision with root package name */
    private long[] f47890e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        List<c> f47891a;

        /* renamed from: b  reason: collision with root package name */
        int f47892b;

        a() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f47891a = null;
            this.f47892b = 0;
        }
    }

    d(a aVar) {
        this.f47886a = aVar;
    }

    private int A(boolean z10) {
        return z10 ? this.f47886a.c() : this.f47886a.d();
    }

    private int B(boolean z10) {
        return z10 ? this.f47886a.d() : this.f47886a.c();
    }

    private int C(boolean z10) {
        return z10 ? this.f47886a.s() : this.f47886a.B();
    }

    private int D(boolean z10) {
        return z10 ? this.f47886a.B() : this.f47886a.s();
    }

    private int E(View view, boolean z10) {
        return z10 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    private int F(View view, boolean z10) {
        return z10 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    private boolean G(int i10, int i11, c cVar) {
        return i10 == i11 - 1 && cVar.c() != 0;
    }

    private boolean H(View view, int i10, int i11, int i12, int i13, b bVar, int i14, int i15, int i16) {
        if (this.f47886a.v() == 0) {
            return false;
        }
        if (bVar.k1()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int k10 = this.f47886a.k();
        if (k10 != -1 && k10 <= i16 + 1) {
            return false;
        }
        int A10 = this.f47886a.A(view, i14, i15);
        if (A10 > 0) {
            i13 += A10;
        }
        return i11 < i12 + i13;
    }

    private void L(int i10, int i11, c cVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        int i17;
        c cVar2 = cVar;
        int i18 = i12;
        int i19 = cVar2.f47872e;
        float f10 = cVar2.f47878k;
        float f11 = 0.0f;
        if (f10 > 0.0f && i18 <= i19) {
            float f12 = ((float) (i19 - i18)) / f10;
            cVar2.f47872e = i13 + cVar2.f47873f;
            if (!z10) {
                cVar2.f47874g = Integer.MIN_VALUE;
            }
            int i20 = 0;
            boolean z11 = false;
            int i21 = 0;
            float f13 = 0.0f;
            while (i20 < cVar2.f47875h) {
                int i22 = cVar2.f47882o + i20;
                View x10 = this.f47886a.x(i22);
                if (x10 == null || x10.getVisibility() == 8) {
                    int i23 = i11;
                    i15 = i19;
                    i14 = i20;
                } else {
                    b bVar = (b) x10.getLayoutParams();
                    int j10 = this.f47886a.j();
                    if (j10 == 0 || j10 == 1) {
                        i15 = i19;
                        int i24 = i20;
                        int i25 = i10;
                        int measuredWidth = x10.getMeasuredWidth();
                        long[] jArr = this.f47890e;
                        if (jArr != null) {
                            measuredWidth = r(jArr[i22]);
                        }
                        int measuredHeight = x10.getMeasuredHeight();
                        long[] jArr2 = this.f47890e;
                        int i26 = i24;
                        if (jArr2 != null) {
                            measuredHeight = q(jArr2[i22]);
                        }
                        if (this.f47887b[i22] || bVar.i0() <= 0.0f) {
                            int i27 = i11;
                            i17 = i26;
                        } else {
                            float i02 = ((float) measuredWidth) - (bVar.i0() * f12);
                            i17 = i26;
                            if (i17 == cVar2.f47875h - 1) {
                                i02 += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(i02);
                            if (round < bVar.l0()) {
                                round = bVar.l0();
                                this.f47887b[i22] = true;
                                cVar2.f47878k -= bVar.i0();
                                z11 = true;
                            } else {
                                f13 += i02 - ((float) round);
                                double d10 = (double) f13;
                                if (d10 > 1.0d) {
                                    round++;
                                    f13 -= 1.0f;
                                } else if (d10 < -1.0d) {
                                    round--;
                                    f13 += 1.0f;
                                }
                            }
                            int s10 = s(i11, bVar, cVar2.f47880m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, CatalogRepository.FETCH_FLAG_SDB);
                            x10.measure(makeMeasureSpec, s10);
                            int measuredWidth2 = x10.getMeasuredWidth();
                            int measuredHeight2 = x10.getMeasuredHeight();
                            Q(i22, makeMeasureSpec, s10, x10);
                            this.f47886a.z(i22, x10);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i21, measuredHeight + bVar.I0() + bVar.n2() + this.f47886a.u(x10));
                        cVar2.f47872e += measuredWidth + bVar.p2() + bVar.V2();
                        i16 = max;
                    } else {
                        int measuredHeight3 = x10.getMeasuredHeight();
                        long[] jArr3 = this.f47890e;
                        if (jArr3 != null) {
                            measuredHeight3 = q(jArr3[i22]);
                        }
                        int measuredWidth3 = x10.getMeasuredWidth();
                        long[] jArr4 = this.f47890e;
                        if (jArr4 != null) {
                            measuredWidth3 = r(jArr4[i22]);
                        }
                        if (this.f47887b[i22] || bVar.i0() <= f11) {
                            i15 = i19;
                            i14 = i20;
                            int i28 = i10;
                        } else {
                            float i03 = ((float) measuredHeight3) - (bVar.i0() * f12);
                            if (i20 == cVar2.f47875h - 1) {
                                i03 += f13;
                                f13 = f11;
                            }
                            int round2 = Math.round(i03);
                            if (round2 < bVar.X2()) {
                                round2 = bVar.X2();
                                this.f47887b[i22] = true;
                                cVar2.f47878k -= bVar.i0();
                                i15 = i19;
                                i14 = i20;
                                z11 = true;
                            } else {
                                f13 += i03 - ((float) round2);
                                i15 = i19;
                                i14 = i20;
                                double d11 = (double) f13;
                                if (d11 > 1.0d) {
                                    round2++;
                                    f13 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    round2--;
                                    f13 += 1.0f;
                                }
                            }
                            int t10 = t(i10, bVar, cVar2.f47880m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, CatalogRepository.FETCH_FLAG_SDB);
                            x10.measure(t10, makeMeasureSpec2);
                            measuredWidth3 = x10.getMeasuredWidth();
                            int measuredHeight4 = x10.getMeasuredHeight();
                            Q(i22, t10, makeMeasureSpec2, x10);
                            this.f47886a.z(i22, x10);
                            measuredHeight3 = measuredHeight4;
                        }
                        i16 = Math.max(i21, measuredWidth3 + bVar.p2() + bVar.V2() + this.f47886a.u(x10));
                        cVar2.f47872e += measuredHeight3 + bVar.I0() + bVar.n2();
                        int i29 = i11;
                    }
                    cVar2.f47874g = Math.max(cVar2.f47874g, i16);
                    i21 = i16;
                }
                i20 = i14 + 1;
                i19 = i15;
                f11 = 0.0f;
            }
            int i30 = i11;
            int i31 = i19;
            if (z11 && i31 != cVar2.f47872e) {
                L(i10, i11, cVar, i12, i13, true);
            }
        }
    }

    private void M(View view, int i10, int i11) {
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - bVar.p2()) - bVar.V2()) - this.f47886a.u(view), bVar.l0()), bVar.y1());
        long[] jArr = this.f47890e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? q(jArr[i11]) : view.getMeasuredHeight(), CatalogRepository.FETCH_FLAG_SDB);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, CatalogRepository.FETCH_FLAG_SDB);
        view.measure(makeMeasureSpec2, makeMeasureSpec);
        Q(i11, makeMeasureSpec2, makeMeasureSpec, view);
        this.f47886a.z(i11, view);
    }

    private void N(View view, int i10, int i11) {
        b bVar = (b) view.getLayoutParams();
        int min = Math.min(Math.max(((i10 - bVar.I0()) - bVar.n2()) - this.f47886a.u(view), bVar.X2()), bVar.g3());
        long[] jArr = this.f47890e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? r(jArr[i11]) : view.getMeasuredWidth(), CatalogRepository.FETCH_FLAG_SDB);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(min, CatalogRepository.FETCH_FLAG_SDB);
        view.measure(makeMeasureSpec, makeMeasureSpec2);
        Q(i11, makeMeasureSpec, makeMeasureSpec2, view);
        this.f47886a.z(i11, view);
    }

    private void Q(int i10, int i11, int i12, View view) {
        long[] jArr = this.f47889d;
        if (jArr != null) {
            jArr[i10] = K(i11, i12);
        }
        long[] jArr2 = this.f47890e;
        if (jArr2 != null) {
            jArr2[i10] = K(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    private void a(List<c> list, c cVar, int i10, int i11) {
        cVar.f47880m = i11;
        this.f47886a.w(cVar);
        cVar.f47883p = i10;
        list.add(cVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void g(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            com.google.android.flexbox.b r0 = (com.google.android.flexbox.b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.l0()
            r4 = 1
            if (r1 >= r3) goto L_0x001b
            int r1 = r0.l0()
        L_0x0019:
            r3 = r4
            goto L_0x0027
        L_0x001b:
            int r3 = r0.y1()
            if (r1 <= r3) goto L_0x0026
            int r1 = r0.y1()
            goto L_0x0019
        L_0x0026:
            r3 = 0
        L_0x0027:
            int r5 = r0.X2()
            if (r2 >= r5) goto L_0x0032
            int r2 = r0.X2()
            goto L_0x003e
        L_0x0032:
            int r5 = r0.g3()
            if (r2 <= r5) goto L_0x003d
            int r2 = r0.g3()
            goto L_0x003e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0055
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Q(r8, r1, r0, r7)
            com.google.android.flexbox.a r0 = r6.f47886a
            r0.z(r8, r7)
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.d.g(android.view.View, int):void");
    }

    private void k(int i10) {
        boolean[] zArr = this.f47887b;
        if (zArr == null) {
            this.f47887b = new boolean[Math.max(i10, 10)];
        } else if (zArr.length < i10) {
            this.f47887b = new boolean[Math.max(zArr.length * 2, i10)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    private void o(CompoundButton compoundButton) {
        b bVar = (b) compoundButton.getLayoutParams();
        int l02 = bVar.l0();
        int X22 = bVar.X2();
        Drawable a10 = c.a(compoundButton);
        int i10 = 0;
        int minimumWidth = a10 == null ? 0 : a10.getMinimumWidth();
        if (a10 != null) {
            i10 = a10.getMinimumHeight();
        }
        if (l02 == -1) {
            l02 = minimumWidth;
        }
        bVar.m2(l02);
        if (X22 == -1) {
            X22 = i10;
        }
        bVar.O0(X22);
    }

    private void p(int i10, int i11, c cVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        int i16;
        double d10;
        int i17;
        double d11;
        c cVar2 = cVar;
        int i18 = i12;
        float f10 = cVar2.f47877j;
        float f11 = 0.0f;
        if (f10 > 0.0f && i18 >= (i14 = cVar2.f47872e)) {
            float f12 = ((float) (i18 - i14)) / f10;
            cVar2.f47872e = i13 + cVar2.f47873f;
            if (!z10) {
                cVar2.f47874g = Integer.MIN_VALUE;
            }
            int i19 = 0;
            boolean z11 = false;
            int i20 = 0;
            float f13 = 0.0f;
            while (i19 < cVar2.f47875h) {
                int i21 = cVar2.f47882o + i19;
                View x10 = this.f47886a.x(i21);
                if (x10 == null || x10.getVisibility() == 8) {
                    int i22 = i11;
                    i15 = i14;
                } else {
                    b bVar = (b) x10.getLayoutParams();
                    int j10 = this.f47886a.j();
                    if (j10 == 0 || j10 == 1) {
                        int i23 = i14;
                        int i24 = i10;
                        int measuredWidth = x10.getMeasuredWidth();
                        long[] jArr = this.f47890e;
                        if (jArr != null) {
                            measuredWidth = r(jArr[i21]);
                        }
                        int measuredHeight = x10.getMeasuredHeight();
                        long[] jArr2 = this.f47890e;
                        i15 = i23;
                        if (jArr2 != null) {
                            measuredHeight = q(jArr2[i21]);
                        }
                        if (this.f47887b[i21] || bVar.Q0() <= 0.0f) {
                            int i25 = i11;
                        } else {
                            float Q02 = ((float) measuredWidth) + (bVar.Q0() * f12);
                            if (i19 == cVar2.f47875h - 1) {
                                Q02 += f13;
                                f13 = 0.0f;
                            }
                            int round = Math.round(Q02);
                            if (round > bVar.y1()) {
                                round = bVar.y1();
                                this.f47887b[i21] = true;
                                cVar2.f47877j -= bVar.Q0();
                                z11 = true;
                            } else {
                                f13 += Q02 - ((float) round);
                                double d12 = (double) f13;
                                if (d12 > 1.0d) {
                                    round++;
                                    d10 = d12 - 1.0d;
                                } else if (d12 < -1.0d) {
                                    round--;
                                    d10 = d12 + 1.0d;
                                }
                                f13 = (float) d10;
                            }
                            int s10 = s(i11, bVar, cVar2.f47880m);
                            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(round, CatalogRepository.FETCH_FLAG_SDB);
                            x10.measure(makeMeasureSpec, s10);
                            int measuredWidth2 = x10.getMeasuredWidth();
                            int measuredHeight2 = x10.getMeasuredHeight();
                            Q(i21, makeMeasureSpec, s10, x10);
                            this.f47886a.z(i21, x10);
                            measuredWidth = measuredWidth2;
                            measuredHeight = measuredHeight2;
                        }
                        int max = Math.max(i20, measuredHeight + bVar.I0() + bVar.n2() + this.f47886a.u(x10));
                        cVar2.f47872e += measuredWidth + bVar.p2() + bVar.V2();
                        i16 = max;
                    } else {
                        int measuredHeight3 = x10.getMeasuredHeight();
                        long[] jArr3 = this.f47890e;
                        if (jArr3 != null) {
                            measuredHeight3 = q(jArr3[i21]);
                        }
                        int measuredWidth3 = x10.getMeasuredWidth();
                        long[] jArr4 = this.f47890e;
                        if (jArr4 != null) {
                            measuredWidth3 = r(jArr4[i21]);
                        }
                        if (this.f47887b[i21] || bVar.Q0() <= f11) {
                            i17 = i14;
                            int i26 = i10;
                        } else {
                            float Q03 = ((float) measuredHeight3) + (bVar.Q0() * f12);
                            if (i19 == cVar2.f47875h - 1) {
                                Q03 += f13;
                                f13 = f11;
                            }
                            int round2 = Math.round(Q03);
                            if (round2 > bVar.g3()) {
                                round2 = bVar.g3();
                                this.f47887b[i21] = true;
                                cVar2.f47877j -= bVar.Q0();
                                i17 = i14;
                                z11 = true;
                            } else {
                                f13 += Q03 - ((float) round2);
                                i17 = i14;
                                double d13 = (double) f13;
                                if (d13 > 1.0d) {
                                    round2++;
                                    d11 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    round2--;
                                    d11 = d13 + 1.0d;
                                }
                                f13 = (float) d11;
                            }
                            int t10 = t(i10, bVar, cVar2.f47880m);
                            int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(round2, CatalogRepository.FETCH_FLAG_SDB);
                            x10.measure(t10, makeMeasureSpec2);
                            measuredWidth3 = x10.getMeasuredWidth();
                            int measuredHeight4 = x10.getMeasuredHeight();
                            Q(i21, t10, makeMeasureSpec2, x10);
                            this.f47886a.z(i21, x10);
                            measuredHeight3 = measuredHeight4;
                        }
                        i16 = Math.max(i20, measuredWidth3 + bVar.p2() + bVar.V2() + this.f47886a.u(x10));
                        cVar2.f47872e += measuredHeight3 + bVar.I0() + bVar.n2();
                        int i27 = i11;
                        i15 = i17;
                    }
                    cVar2.f47874g = Math.max(cVar2.f47874g, i16);
                    i20 = i16;
                }
                i19++;
                i14 = i15;
                f11 = 0.0f;
            }
            int i28 = i11;
            int i29 = i14;
            if (z11 && i29 != cVar2.f47872e) {
                p(i10, i11, cVar, i12, i13, true);
            }
        }
    }

    private int s(int i10, b bVar, int i11) {
        a aVar = this.f47886a;
        int r10 = aVar.r(i10, aVar.s() + this.f47886a.c() + bVar.I0() + bVar.n2() + i11, bVar.getHeight());
        int size = View.MeasureSpec.getSize(r10);
        return size > bVar.g3() ? View.MeasureSpec.makeMeasureSpec(bVar.g3(), View.MeasureSpec.getMode(r10)) : size < bVar.X2() ? View.MeasureSpec.makeMeasureSpec(bVar.X2(), View.MeasureSpec.getMode(r10)) : r10;
    }

    private int t(int i10, b bVar, int i11) {
        a aVar = this.f47886a;
        int m10 = aVar.m(i10, aVar.t() + this.f47886a.o() + bVar.p2() + bVar.V2() + i11, bVar.getWidth());
        int size = View.MeasureSpec.getSize(m10);
        return size > bVar.y1() ? View.MeasureSpec.makeMeasureSpec(bVar.y1(), View.MeasureSpec.getMode(m10)) : size < bVar.l0() ? View.MeasureSpec.makeMeasureSpec(bVar.l0(), View.MeasureSpec.getMode(m10)) : m10;
    }

    private int u(b bVar, boolean z10) {
        return z10 ? bVar.n2() : bVar.V2();
    }

    private int v(b bVar, boolean z10) {
        return z10 ? bVar.V2() : bVar.n2();
    }

    private int w(b bVar, boolean z10) {
        return z10 ? bVar.I0() : bVar.p2();
    }

    private int x(b bVar, boolean z10) {
        return z10 ? bVar.p2() : bVar.I0();
    }

    private int y(b bVar, boolean z10) {
        return z10 ? bVar.getHeight() : bVar.getWidth();
    }

    private int z(b bVar, boolean z10) {
        return z10 ? bVar.getWidth() : bVar.getHeight();
    }

    /* access modifiers changed from: package-private */
    public void I(View view, c cVar, int i10, int i11, int i12, int i13) {
        b bVar = (b) view.getLayoutParams();
        int y10 = this.f47886a.y();
        if (bVar.h0() != -1) {
            y10 = bVar.h0();
        }
        int i14 = cVar.f47874g;
        if (y10 != 0) {
            if (y10 != 1) {
                if (y10 == 2) {
                    int measuredHeight = (((i14 - view.getMeasuredHeight()) + bVar.I0()) - bVar.n2()) / 2;
                    if (this.f47886a.v() != 2) {
                        int i15 = i11 + measuredHeight;
                        view.layout(i10, i15, i12, view.getMeasuredHeight() + i15);
                        return;
                    }
                    int i16 = i11 - measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else if (y10 != 3) {
                    if (y10 != 4) {
                        return;
                    }
                } else if (this.f47886a.v() != 2) {
                    int max = Math.max(cVar.f47879l - view.getBaseline(), bVar.I0());
                    view.layout(i10, i11 + max, i12, i13 + max);
                    return;
                } else {
                    int max2 = Math.max((cVar.f47879l - view.getMeasuredHeight()) + view.getBaseline(), bVar.n2());
                    view.layout(i10, i11 - max2, i12, i13 - max2);
                    return;
                }
            } else if (this.f47886a.v() != 2) {
                int i17 = i11 + i14;
                view.layout(i10, (i17 - view.getMeasuredHeight()) - bVar.n2(), i12, i17 - bVar.n2());
                return;
            } else {
                view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + bVar.I0(), i12, (i13 - i14) + view.getMeasuredHeight() + bVar.I0());
                return;
            }
        }
        if (this.f47886a.v() != 2) {
            view.layout(i10, i11 + bVar.I0(), i12, i13 + bVar.I0());
        } else {
            view.layout(i10, i11 - bVar.n2(), i12, i13 - bVar.n2());
        }
    }

    /* access modifiers changed from: package-private */
    public void J(View view, c cVar, boolean z10, int i10, int i11, int i12, int i13) {
        b bVar = (b) view.getLayoutParams();
        int y10 = this.f47886a.y();
        if (bVar.h0() != -1) {
            y10 = bVar.h0();
        }
        int i14 = cVar.f47874g;
        if (y10 != 0) {
            if (y10 != 1) {
                if (y10 == 2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    int measuredWidth = (((i14 - view.getMeasuredWidth()) + C4638v.b(marginLayoutParams)) - C4638v.a(marginLayoutParams)) / 2;
                    if (!z10) {
                        view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                        return;
                    } else {
                        view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                        return;
                    }
                } else if (!(y10 == 3 || y10 == 4)) {
                    return;
                }
            } else if (!z10) {
                view.layout(((i10 + i14) - view.getMeasuredWidth()) - bVar.V2(), i11, ((i12 + i14) - view.getMeasuredWidth()) - bVar.V2(), i13);
                return;
            } else {
                view.layout((i10 - i14) + view.getMeasuredWidth() + bVar.p2(), i11, (i12 - i14) + view.getMeasuredWidth() + bVar.p2(), i13);
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + bVar.p2(), i11, i12 + bVar.p2(), i13);
        } else {
            view.layout(i10 - bVar.V2(), i11, i12 - bVar.V2(), i13);
        }
    }

    /* access modifiers changed from: package-private */
    public long K(int i10, int i11) {
        return (((long) i10) & 4294967295L) | (((long) i11) << 32);
    }

    /* access modifiers changed from: package-private */
    public void O() {
        P(0);
    }

    /* access modifiers changed from: package-private */
    public void P(int i10) {
        View x10;
        int i11 = i10;
        if (i11 < this.f47886a.g()) {
            int j10 = this.f47886a.j();
            if (this.f47886a.y() == 4) {
                int[] iArr = this.f47888c;
                List<c> q10 = this.f47886a.q();
                int size = q10.size();
                for (int i12 = iArr != null ? iArr[i11] : 0; i12 < size; i12++) {
                    c cVar = q10.get(i12);
                    int i13 = cVar.f47875h;
                    for (int i14 = 0; i14 < i13; i14++) {
                        int i15 = cVar.f47882o + i14;
                        if (!(i14 >= this.f47886a.g() || (x10 = this.f47886a.x(i15)) == null || x10.getVisibility() == 8)) {
                            b bVar = (b) x10.getLayoutParams();
                            if (bVar.h0() == -1 || bVar.h0() == 4) {
                                if (j10 == 0 || j10 == 1) {
                                    N(x10, cVar.f47874g, i15);
                                } else if (j10 == 2 || j10 == 3) {
                                    M(x10, cVar.f47874g, i15);
                                } else {
                                    throw new IllegalArgumentException("Invalid flex direction: " + j10);
                                }
                            }
                        }
                    }
                }
                return;
            }
            for (c next : this.f47886a.q()) {
                Iterator<Integer> it = next.f47881n.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Integer next2 = it.next();
                        View x11 = this.f47886a.x(next2.intValue());
                        if (j10 == 0 || j10 == 1) {
                            N(x11, next.f47874g, next2.intValue());
                        } else if (j10 == 2 || j10 == 3) {
                            M(x11, next.f47874g, next2.intValue());
                        } else {
                            throw new IllegalArgumentException("Invalid flex direction: " + j10);
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(a aVar, int i10, int i11, int i12, int i13, int i14, List<c> list) {
        int i15;
        a aVar2;
        int i16;
        int i17;
        List<c> list2;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        boolean z10;
        int i25;
        int i26;
        View view;
        int i27;
        a aVar3 = aVar;
        int i28 = i10;
        int i29 = i11;
        int i30 = i14;
        boolean C10 = this.f47886a.C();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        ArrayList arrayList = list == null ? new ArrayList() : list;
        aVar3.f47891a = arrayList;
        boolean z11 = i30 == -1;
        int D10 = D(C10);
        int B10 = B(C10);
        int C11 = C(C10);
        int A10 = A(C10);
        c cVar = new c();
        int i31 = i13;
        cVar.f47882o = i31;
        int i32 = B10 + D10;
        cVar.f47872e = i32;
        int g10 = this.f47886a.g();
        boolean z12 = z11;
        int i33 = Integer.MIN_VALUE;
        int i34 = 0;
        int i35 = 0;
        int i36 = 0;
        while (true) {
            if (i31 >= g10) {
                i15 = i35;
                aVar2 = aVar;
                break;
            }
            View x10 = this.f47886a.x(i31);
            if (x10 != null) {
                if (x10.getVisibility() != 8) {
                    if (x10 instanceof CompoundButton) {
                        o((CompoundButton) x10);
                    }
                    b bVar = (b) x10.getLayoutParams();
                    int i37 = g10;
                    if (bVar.h0() == 4) {
                        cVar.f47881n.add(Integer.valueOf(i31));
                    }
                    int z13 = z(bVar, C10);
                    if (bVar.Y0() != -1.0f && mode == 1073741824) {
                        z13 = Math.round(((float) size) * bVar.Y0());
                    }
                    if (C10) {
                        int m10 = this.f47886a.m(i28, i32 + x(bVar, true) + v(bVar, true), z13);
                        i17 = size;
                        i16 = mode;
                        int r10 = this.f47886a.r(i29, C11 + A10 + w(bVar, true) + u(bVar, true) + i34, y(bVar, true));
                        x10.measure(m10, r10);
                        Q(i31, m10, r10, x10);
                        i23 = m10;
                    } else {
                        i17 = size;
                        i16 = mode;
                        int m11 = this.f47886a.m(i29, C11 + A10 + w(bVar, false) + u(bVar, false) + i34, y(bVar, false));
                        int r11 = this.f47886a.r(i28, x(bVar, false) + i32 + v(bVar, false), z13);
                        x10.measure(m11, r11);
                        Q(i31, m11, r11, x10);
                        i23 = r11;
                    }
                    this.f47886a.z(i31, x10);
                    g(x10, i31);
                    i35 = View.combineMeasuredStates(i35, x10.getMeasuredState());
                    int i38 = i34;
                    int i39 = i37;
                    c cVar2 = cVar;
                    int i40 = i32;
                    int i41 = i31;
                    View view2 = x10;
                    list2 = arrayList;
                    int i42 = i23;
                    if (H(x10, i16, i17, cVar.f47872e, v(bVar, C10) + F(x10, C10) + x(bVar, C10), bVar, i41, i36, arrayList.size())) {
                        if (cVar2.c() > 0) {
                            c cVar3 = cVar2;
                            a(list2, cVar3, i41 > 0 ? i41 - 1 : 0, i38);
                            i34 = cVar3.f47874g + i38;
                        } else {
                            i34 = i38;
                        }
                        if (!C10) {
                            i20 = i11;
                            i22 = i41;
                            view = view2;
                            i25 = -1;
                            int i43 = i42;
                            if (bVar.getWidth() == -1) {
                                a aVar4 = this.f47886a;
                                view.measure(aVar4.m(i20, aVar4.t() + this.f47886a.o() + bVar.p2() + bVar.V2() + i34, bVar.getWidth()), i43);
                                g(view, i22);
                            }
                        } else if (bVar.getHeight() == -1) {
                            a aVar5 = this.f47886a;
                            i20 = i11;
                            i25 = -1;
                            view = view2;
                            view.measure(i42, aVar5.r(i20, aVar5.s() + this.f47886a.c() + bVar.I0() + bVar.n2() + i34, bVar.getHeight()));
                            i22 = i41;
                            g(view, i22);
                        } else {
                            i20 = i11;
                            i22 = i41;
                            view = view2;
                            i25 = -1;
                        }
                        cVar = new c();
                        z10 = true;
                        cVar.f47875h = 1;
                        i19 = i40;
                        cVar.f47872e = i19;
                        cVar.f47882o = i22;
                        i24 = Integer.MIN_VALUE;
                        i26 = 0;
                    } else {
                        i20 = i11;
                        i22 = i41;
                        view = view2;
                        i25 = -1;
                        cVar = cVar2;
                        i19 = i40;
                        z10 = true;
                        cVar.f47875h++;
                        i26 = i36 + 1;
                        i34 = i38;
                        i24 = i33;
                    }
                    cVar.f47884q |= bVar.Q0() != 0.0f ? z10 : false;
                    cVar.f47885r |= bVar.i0() != 0.0f ? z10 : false;
                    int[] iArr = this.f47888c;
                    if (iArr != null) {
                        iArr[i22] = list2.size();
                    }
                    cVar.f47872e += F(view, C10) + x(bVar, C10) + v(bVar, C10);
                    cVar.f47877j += bVar.Q0();
                    cVar.f47878k += bVar.i0();
                    this.f47886a.i(view, i22, i26, cVar);
                    int max = Math.max(i24, E(view, C10) + w(bVar, C10) + u(bVar, C10) + this.f47886a.u(view));
                    cVar.f47874g = Math.max(cVar.f47874g, max);
                    if (C10) {
                        if (this.f47886a.v() != 2) {
                            cVar.f47879l = Math.max(cVar.f47879l, view.getBaseline() + bVar.I0());
                        } else {
                            cVar.f47879l = Math.max(cVar.f47879l, (view.getMeasuredHeight() - view.getBaseline()) + bVar.n2());
                        }
                    }
                    i21 = i37;
                    if (G(i22, i21, cVar)) {
                        a(list2, cVar, i22, i34);
                        i34 += cVar.f47874g;
                    }
                    i18 = i14;
                    if (i18 == i25 || list2.size() <= 0 || list2.get(list2.size() - (z10 ? 1 : 0)).f47883p < i18 || i22 < i18 || z12) {
                        i27 = i12;
                    } else {
                        i34 = -cVar.a();
                        i27 = i12;
                        z12 = z10;
                    }
                    if (i34 > i27 && z12) {
                        aVar2 = aVar;
                        i15 = i35;
                        break;
                    }
                    i36 = i26;
                    i33 = max;
                    i28 = i10;
                    i31 = i22 + 1;
                    g10 = i21;
                    i29 = i20;
                    i32 = i19;
                    arrayList = list2;
                    size = i17;
                    mode = i16;
                    i30 = i18;
                    a aVar6 = aVar;
                } else {
                    cVar.f47876i++;
                    cVar.f47875h++;
                    if (G(i31, g10, cVar)) {
                        a(arrayList, cVar, i31, i34);
                    }
                }
            } else if (G(i31, g10, cVar)) {
                a(arrayList, cVar, i31, i34);
            }
            int i44 = i12;
            i17 = size;
            i16 = mode;
            i20 = i29;
            i18 = i30;
            i19 = i32;
            list2 = arrayList;
            i21 = g10;
            i22 = i31;
            i28 = i10;
            i31 = i22 + 1;
            g10 = i21;
            i29 = i20;
            i32 = i19;
            arrayList = list2;
            size = i17;
            mode = i16;
            i30 = i18;
            a aVar62 = aVar;
        }
        aVar2.f47892b = i15;
    }

    /* access modifiers changed from: package-private */
    public void c(a aVar, int i10, int i11, int i12, int i13, List<c> list) {
        b(aVar, i10, i11, i12, i13, -1, list);
    }

    /* access modifiers changed from: package-private */
    public void d(a aVar, int i10, int i11, int i12, int i13, List<c> list) {
        b(aVar, i10, i11, i12, 0, i13, list);
    }

    /* access modifiers changed from: package-private */
    public void e(a aVar, int i10, int i11, int i12, int i13, List<c> list) {
        b(aVar, i11, i10, i12, i13, -1, list);
    }

    /* access modifiers changed from: package-private */
    public void f(a aVar, int i10, int i11, int i12, int i13, List<c> list) {
        b(aVar, i11, i10, i12, 0, i13, list);
    }

    /* access modifiers changed from: package-private */
    public void h(List<c> list, int i10) {
        int i11 = this.f47888c[i10];
        if (i11 == -1) {
            i11 = 0;
        }
        if (list.size() > i11) {
            list.subList(i11, list.size()).clear();
        }
        int[] iArr = this.f47888c;
        int length = iArr.length - 1;
        if (i10 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i10, length, -1);
        }
        long[] jArr = this.f47889d;
        int length2 = jArr.length - 1;
        if (i10 > length2) {
            Arrays.fill(jArr, 0);
        } else {
            Arrays.fill(jArr, i10, length2, 0);
        }
    }

    /* access modifiers changed from: package-private */
    public void i(int i10, int i11) {
        j(i10, i11, 0);
    }

    /* access modifiers changed from: package-private */
    public void j(int i10, int i11, int i12) {
        int i13;
        int t10;
        int o10;
        k(this.f47886a.g());
        if (i12 < this.f47886a.g()) {
            int j10 = this.f47886a.j();
            int j11 = this.f47886a.j();
            if (j11 == 0 || j11 == 1) {
                int mode = View.MeasureSpec.getMode(i10);
                int size = View.MeasureSpec.getSize(i10);
                int l10 = this.f47886a.l();
                if (mode != 1073741824) {
                    size = Math.min(l10, size);
                }
                t10 = this.f47886a.t();
                o10 = this.f47886a.o();
            } else if (j11 == 2 || j11 == 3) {
                int mode2 = View.MeasureSpec.getMode(i11);
                i13 = View.MeasureSpec.getSize(i11);
                if (mode2 != 1073741824) {
                    i13 = this.f47886a.l();
                }
                t10 = this.f47886a.s();
                o10 = this.f47886a.c();
            } else {
                throw new IllegalArgumentException("Invalid flex direction: " + j10);
            }
            int i14 = t10 + o10;
            int[] iArr = this.f47888c;
            List<c> q10 = this.f47886a.q();
            int size2 = q10.size();
            for (int i15 = iArr != null ? iArr[i12] : 0; i15 < size2; i15++) {
                c cVar = q10.get(i15);
                int i16 = cVar.f47872e;
                if (i16 < i13 && cVar.f47884q) {
                    p(i10, i11, cVar, i13, i14, false);
                } else if (i16 > i13 && cVar.f47885r) {
                    L(i10, i11, cVar, i13, i14, false);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void l(int i10) {
        int[] iArr = this.f47888c;
        if (iArr == null) {
            this.f47888c = new int[Math.max(i10, 10)];
        } else if (iArr.length < i10) {
            this.f47888c = Arrays.copyOf(this.f47888c, Math.max(iArr.length * 2, i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void m(int i10) {
        long[] jArr = this.f47889d;
        if (jArr == null) {
            this.f47889d = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f47889d = Arrays.copyOf(this.f47889d, Math.max(jArr.length * 2, i10));
        }
    }

    /* access modifiers changed from: package-private */
    public void n(int i10) {
        long[] jArr = this.f47890e;
        if (jArr == null) {
            this.f47890e = new long[Math.max(i10, 10)];
        } else if (jArr.length < i10) {
            this.f47890e = Arrays.copyOf(this.f47890e, Math.max(jArr.length * 2, i10));
        }
    }

    /* access modifiers changed from: package-private */
    public int q(long j10) {
        return (int) (j10 >> 32);
    }

    /* access modifiers changed from: package-private */
    public int r(long j10) {
        return (int) j10;
    }
}
