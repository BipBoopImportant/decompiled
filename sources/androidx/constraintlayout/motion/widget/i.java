package androidx.constraintlayout.motion.widget;

import android.view.View;
import androidx.constraintlayout.widget.a;
import com.sugarcube.app.base.data.source.CatalogRepository;
import java.util.Arrays;
import java.util.LinkedHashMap;
import k2.d;

class i implements Comparable<i> {

    /* renamed from: s  reason: collision with root package name */
    static String[] f20100s = {"position", "x", "y", "width", "height", "pathRotate"};

    /* renamed from: a  reason: collision with root package name */
    d f20101a;

    /* renamed from: b  reason: collision with root package name */
    int f20102b = 0;

    /* renamed from: c  reason: collision with root package name */
    float f20103c;

    /* renamed from: d  reason: collision with root package name */
    float f20104d;

    /* renamed from: e  reason: collision with root package name */
    float f20105e;

    /* renamed from: f  reason: collision with root package name */
    float f20106f;

    /* renamed from: g  reason: collision with root package name */
    float f20107g;

    /* renamed from: h  reason: collision with root package name */
    float f20108h;

    /* renamed from: i  reason: collision with root package name */
    float f20109i = Float.NaN;

    /* renamed from: j  reason: collision with root package name */
    float f20110j = Float.NaN;

    /* renamed from: k  reason: collision with root package name */
    int f20111k;

    /* renamed from: l  reason: collision with root package name */
    int f20112l;

    /* renamed from: m  reason: collision with root package name */
    float f20113m;

    /* renamed from: n  reason: collision with root package name */
    g f20114n;

    /* renamed from: o  reason: collision with root package name */
    LinkedHashMap<String, a> f20115o;

    /* renamed from: p  reason: collision with root package name */
    int f20116p;

    /* renamed from: q  reason: collision with root package name */
    double[] f20117q;

    /* renamed from: r  reason: collision with root package name */
    double[] f20118r;

    i() {
        int i10 = d.f20072a;
        this.f20111k = i10;
        this.f20112l = i10;
        this.f20113m = Float.NaN;
        this.f20114n = null;
        this.f20115o = new LinkedHashMap<>();
        this.f20116p = 0;
        this.f20117q = new double[18];
        this.f20118r = new double[18];
    }

    /* renamed from: a */
    public int compareTo(i iVar) {
        return Float.compare(this.f20104d, iVar.f20104d);
    }

    /* access modifiers changed from: package-private */
    public void b(double d10, int[] iArr, double[] dArr, float[] fArr, double[] dArr2, float[] fArr2) {
        float f10;
        int[] iArr2 = iArr;
        float f11 = this.f20105e;
        float f12 = this.f20106f;
        float f13 = this.f20107g;
        float f14 = this.f20108h;
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
        g gVar = this.f20114n;
        if (gVar != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            gVar.b(d10, fArr3, fArr4);
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
    public void j(float f10, View view, int[] iArr, double[] dArr, double[] dArr2, double[] dArr3, boolean z10) {
        float f11;
        float f12;
        View view2 = view;
        int[] iArr2 = iArr;
        double[] dArr4 = dArr2;
        float f13 = this.f20105e;
        float f14 = this.f20106f;
        float f15 = this.f20107g;
        float f16 = this.f20108h;
        if (iArr2.length != 0 && this.f20117q.length <= iArr2[iArr2.length - 1]) {
            int i10 = iArr2[iArr2.length - 1] + 1;
            this.f20117q = new double[i10];
            this.f20118r = new double[i10];
        }
        Arrays.fill(this.f20117q, Double.NaN);
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            double[] dArr5 = this.f20117q;
            int i12 = iArr2[i11];
            dArr5[i12] = dArr[i11];
            this.f20118r[i12] = dArr4[i11];
        }
        float f17 = Float.NaN;
        int i13 = 0;
        float f18 = 0.0f;
        float f19 = 0.0f;
        float f20 = 0.0f;
        float f21 = 0.0f;
        while (true) {
            double[] dArr6 = this.f20117q;
            if (i13 >= dArr6.length) {
                break;
            }
            double d10 = 0.0d;
            if (!Double.isNaN(dArr6[i13]) || !(dArr3 == null || dArr3[i13] == 0.0d)) {
                if (dArr3 != null) {
                    d10 = dArr3[i13];
                }
                if (!Double.isNaN(this.f20117q[i13])) {
                    d10 = this.f20117q[i13] + d10;
                }
                f12 = f17;
                float f22 = (float) d10;
                float f23 = (float) this.f20118r[i13];
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
        g gVar = this.f20114n;
        if (gVar != null) {
            float[] fArr = new float[2];
            float[] fArr2 = new float[2];
            gVar.b((double) f10, fArr, fArr2);
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
                view2.setRotation((float) (((double) f24) + Math.toDegrees(Math.atan2((double) cos2, (double) sin2))));
            }
            f13 = f30;
            f14 = cos;
        } else {
            float f31 = f24;
            f11 = f16;
            if (!Float.isNaN(f31)) {
                view2.setRotation(f31 + ((float) Math.toDegrees(Math.atan2((double) (f19 + (f21 / 2.0f)), (double) (f18 + (f20 / 2.0f))))) + 0.0f);
            }
        }
        if (view2 instanceof c) {
            ((c) view2).a(f13, f14, f15 + f13, f14 + f11);
            return;
        }
        float f32 = f13 + 0.5f;
        int i14 = (int) f32;
        float f33 = f14 + 0.5f;
        int i15 = (int) f33;
        int i16 = (int) (f32 + f15);
        int i17 = (int) (f33 + f11);
        int i18 = i16 - i14;
        int i19 = i17 - i15;
        if (!(i18 == view.getMeasuredWidth() && i19 == view.getMeasuredHeight() && !z10)) {
            view2.measure(View.MeasureSpec.makeMeasureSpec(i18, CatalogRepository.FETCH_FLAG_SDB), View.MeasureSpec.makeMeasureSpec(i19, CatalogRepository.FETCH_FLAG_SDB));
        }
        view2.layout(i14, i15, i16, i17);
    }
}
