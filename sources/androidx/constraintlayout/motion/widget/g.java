package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import k2.b;
import k2.d;
import r2.C5819b;
import r2.C5820c;
import r2.C5821d;

public class g {

    /* renamed from: a  reason: collision with root package name */
    boolean f20075a;

    /* renamed from: b  reason: collision with root package name */
    private i f20076b;

    /* renamed from: c  reason: collision with root package name */
    private i f20077c;

    /* renamed from: d  reason: collision with root package name */
    private f f20078d;

    /* renamed from: e  reason: collision with root package name */
    private f f20079e;

    /* renamed from: f  reason: collision with root package name */
    private b[] f20080f;

    /* renamed from: g  reason: collision with root package name */
    private b f20081g;

    /* renamed from: h  reason: collision with root package name */
    float f20082h;

    /* renamed from: i  reason: collision with root package name */
    float f20083i;

    /* renamed from: j  reason: collision with root package name */
    private int[] f20084j;

    /* renamed from: k  reason: collision with root package name */
    private double[] f20085k;

    /* renamed from: l  reason: collision with root package name */
    private double[] f20086l;

    /* renamed from: m  reason: collision with root package name */
    private String[] f20087m;

    /* renamed from: n  reason: collision with root package name */
    private float[] f20088n;

    /* renamed from: o  reason: collision with root package name */
    private ArrayList<i> f20089o;

    /* renamed from: p  reason: collision with root package name */
    private HashMap<String, C5821d> f20090p;

    /* renamed from: q  reason: collision with root package name */
    private HashMap<String, C5820c> f20091q;

    /* renamed from: r  reason: collision with root package name */
    private HashMap<String, C5819b> f20092r;

    /* renamed from: s  reason: collision with root package name */
    private e[] f20093s;

    /* renamed from: t  reason: collision with root package name */
    private int f20094t;

    /* renamed from: u  reason: collision with root package name */
    private View f20095u;

    /* renamed from: v  reason: collision with root package name */
    private int f20096v;

    /* renamed from: w  reason: collision with root package name */
    private float f20097w;

    /* renamed from: x  reason: collision with root package name */
    private Interpolator f20098x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f20099y;

    private float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f20083i;
            if (((double) f13) != 1.0d) {
                float f14 = this.f20082h;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && ((double) f10) < 1.0d) {
                    f10 = Math.min((f10 - f14) * f13, 1.0f);
                }
            }
        }
        d dVar = this.f20076b.f20101a;
        Iterator<i> it = this.f20089o.iterator();
        float f15 = Float.NaN;
        while (it.hasNext()) {
            i next = it.next();
            d dVar2 = next.f20101a;
            if (dVar2 != null) {
                float f16 = next.f20103c;
                if (f16 < f10) {
                    dVar = dVar2;
                    f11 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.f20103c;
                }
            }
        }
        if (dVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d10 = (double) ((f10 - f11) / f17);
            f10 = (((float) dVar.a(d10)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) dVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f20080f[0].d(d10, dArr);
        this.f20080f[0].f(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f20076b.b(d10, this.f20084j, dArr, fArr, dArr2, fArr2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v58, resolved type: r2.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: r2.d$a} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean c(android.view.View r21, float r22, long r23, k2.f r25) {
        /*
            r20 = this;
            r0 = r20
            r11 = r21
            r1 = 0
            r2 = r22
            float r2 = r0.a(r2, r1)
            int r3 = r0.f20096v
            int r4 = androidx.constraintlayout.motion.widget.d.f20072a
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r3 == r4) goto L_0x0042
            float r3 = (float) r3
            float r3 = r13 / r3
            float r4 = r2 / r3
            double r4 = (double) r4
            double r4 = java.lang.Math.floor(r4)
            float r4 = (float) r4
            float r4 = r4 * r3
            float r2 = r2 % r3
            float r2 = r2 / r3
            float r5 = r0.f20097w
            boolean r5 = java.lang.Float.isNaN(r5)
            if (r5 != 0) goto L_0x002d
            float r5 = r0.f20097w
            float r2 = r2 + r5
            float r2 = r2 % r13
        L_0x002d:
            android.view.animation.Interpolator r5 = r0.f20098x
            if (r5 == 0) goto L_0x0036
            float r2 = r5.getInterpolation(r2)
            goto L_0x0040
        L_0x0036:
            double r5 = (double) r2
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x003f
            r2 = r13
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            float r2 = r2 * r3
            float r2 = r2 + r4
        L_0x0042:
            r14 = r2
            java.util.HashMap<java.lang.String, r2.c> r2 = r0.f20091q
            if (r2 == 0) goto L_0x005f
            java.util.Collection r2 = r2.values()
            java.util.Iterator r2 = r2.iterator()
        L_0x004f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x005f
            java.lang.Object r3 = r2.next()
            r2.c r3 = (r2.C5820c) r3
            r3.h(r11, r14)
            goto L_0x004f
        L_0x005f:
            java.util.HashMap<java.lang.String, r2.d> r2 = r0.f20090p
            r15 = 0
            if (r2 == 0) goto L_0x0093
            java.util.Collection r2 = r2.values()
            java.util.Iterator r7 = r2.iterator()
            r8 = r1
            r9 = r15
        L_0x006e:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x008f
            java.lang.Object r1 = r7.next()
            r2.d r1 = (r2.C5821d) r1
            boolean r2 = r1 instanceof r2.C5821d.a
            if (r2 == 0) goto L_0x0082
            r8 = r1
            r2.d$a r8 = (r2.C5821d.a) r8
            goto L_0x006e
        L_0x0082:
            r2 = r21
            r3 = r14
            r4 = r23
            r6 = r25
            boolean r1 = r1.e(r2, r3, r4, r6)
            r9 = r9 | r1
            goto L_0x006e
        L_0x008f:
            r16 = r9
            r9 = r8
            goto L_0x0096
        L_0x0093:
            r9 = r1
            r16 = r15
        L_0x0096:
            k2.b[] r1 = r0.f20080f
            r10 = 1
            if (r1 == 0) goto L_0x01ef
            r1 = r1[r15]
            double r7 = (double) r14
            double[] r2 = r0.f20085k
            r1.d(r7, r2)
            k2.b[] r1 = r0.f20080f
            r1 = r1[r15]
            double[] r2 = r0.f20086l
            r1.f(r7, r2)
            k2.b r1 = r0.f20081g
            if (r1 == 0) goto L_0x00bf
            double[] r2 = r0.f20085k
            int r3 = r2.length
            if (r3 <= 0) goto L_0x00bf
            r1.d(r7, r2)
            k2.b r1 = r0.f20081g
            double[] r2 = r0.f20086l
            r1.f(r7, r2)
        L_0x00bf:
            boolean r1 = r0.f20099y
            if (r1 != 0) goto L_0x00df
            androidx.constraintlayout.motion.widget.i r1 = r0.f20076b
            int[] r4 = r0.f20084j
            double[] r5 = r0.f20085k
            double[] r6 = r0.f20086l
            r17 = 0
            boolean r3 = r0.f20075a
            r2 = r14
            r18 = r3
            r3 = r21
            r12 = r7
            r7 = r17
            r8 = r18
            r1.j(r2, r3, r4, r5, r6, r7, r8)
            r0.f20075a = r15
            goto L_0x00e0
        L_0x00df:
            r12 = r7
        L_0x00e0:
            int r1 = r0.f20094t
            int r2 = androidx.constraintlayout.motion.widget.d.f20072a
            if (r1 == r2) goto L_0x0142
            android.view.View r1 = r0.f20095u
            if (r1 != 0) goto L_0x00f8
            android.view.ViewParent r1 = r21.getParent()
            android.view.View r1 = (android.view.View) r1
            int r2 = r0.f20094t
            android.view.View r1 = r1.findViewById(r2)
            r0.f20095u = r1
        L_0x00f8:
            android.view.View r1 = r0.f20095u
            if (r1 == 0) goto L_0x0142
            int r1 = r1.getTop()
            android.view.View r2 = r0.f20095u
            int r2 = r2.getBottom()
            int r1 = r1 + r2
            float r1 = (float) r1
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r2
            android.view.View r3 = r0.f20095u
            int r3 = r3.getLeft()
            android.view.View r4 = r0.f20095u
            int r4 = r4.getRight()
            int r3 = r3 + r4
            float r3 = (float) r3
            float r3 = r3 / r2
            int r2 = r21.getRight()
            int r4 = r21.getLeft()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0142
            int r2 = r21.getBottom()
            int r4 = r21.getTop()
            int r2 = r2 - r4
            if (r2 <= 0) goto L_0x0142
            int r2 = r21.getLeft()
            float r2 = (float) r2
            float r3 = r3 - r2
            int r2 = r21.getTop()
            float r2 = (float) r2
            float r1 = r1 - r2
            r11.setPivotX(r3)
            r11.setPivotY(r1)
        L_0x0142:
            java.util.HashMap<java.lang.String, r2.c> r1 = r0.f20091q
            if (r1 == 0) goto L_0x0170
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x014e:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0170
            java.lang.Object r1 = r8.next()
            k2.n r1 = (k2.n) r1
            boolean r2 = r1 instanceof r2.C5820c.a
            if (r2 == 0) goto L_0x014e
            double[] r2 = r0.f20086l
            int r3 = r2.length
            if (r3 <= r10) goto L_0x014e
            r2.c$a r1 = (r2.C5820c.a) r1
            r4 = r2[r15]
            r6 = r2[r10]
            r2 = r21
            r3 = r14
            r1.i(r2, r3, r4, r6)
            goto L_0x014e
        L_0x0170:
            if (r9 == 0) goto L_0x018b
            double[] r1 = r0.f20086l
            r7 = r1[r15]
            r17 = r1[r10]
            r1 = r9
            r2 = r21
            r3 = r25
            r4 = r14
            r5 = r23
            r19 = r10
            r9 = r17
            boolean r1 = r1.f(r2, r3, r4, r5, r7, r9)
            r16 = r16 | r1
            goto L_0x018d
        L_0x018b:
            r19 = r10
        L_0x018d:
            r10 = r19
        L_0x018f:
            k2.b[] r1 = r0.f20080f
            int r2 = r1.length
            if (r10 >= r2) goto L_0x01b3
            r1 = r1[r10]
            float[] r2 = r0.f20088n
            r1.e(r12, r2)
            androidx.constraintlayout.motion.widget.i r1 = r0.f20076b
            java.util.LinkedHashMap<java.lang.String, androidx.constraintlayout.widget.a> r1 = r1.f20115o
            java.lang.String[] r2 = r0.f20087m
            int r3 = r10 + -1
            r2 = r2[r3]
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.a r1 = (androidx.constraintlayout.widget.a) r1
            float[] r2 = r0.f20088n
            r2.C5818a.b(r1, r11, r2)
            int r10 = r10 + 1
            goto L_0x018f
        L_0x01b3:
            androidx.constraintlayout.motion.widget.f r1 = r0.f20078d
            int r2 = r1.f20073a
            if (r2 != 0) goto L_0x01dd
            r2 = 0
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x01c4
            int r1 = r1.f20074b
            r11.setVisibility(r1)
            goto L_0x01dd
        L_0x01c4:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x01d2
            androidx.constraintlayout.motion.widget.f r1 = r0.f20079e
            int r1 = r1.f20074b
            r11.setVisibility(r1)
            goto L_0x01dd
        L_0x01d2:
            androidx.constraintlayout.motion.widget.f r2 = r0.f20079e
            int r2 = r2.f20074b
            int r1 = r1.f20074b
            if (r2 == r1) goto L_0x01dd
            r11.setVisibility(r15)
        L_0x01dd:
            androidx.constraintlayout.motion.widget.e[] r1 = r0.f20093s
            if (r1 == 0) goto L_0x023f
            r1 = r15
        L_0x01e2:
            androidx.constraintlayout.motion.widget.e[] r2 = r0.f20093s
            int r3 = r2.length
            if (r1 >= r3) goto L_0x023f
            r2 = r2[r1]
            r2.a(r14, r11)
            int r1 = r1 + 1
            goto L_0x01e2
        L_0x01ef:
            r19 = r10
            androidx.constraintlayout.motion.widget.i r1 = r0.f20076b
            float r2 = r1.f20105e
            androidx.constraintlayout.motion.widget.i r3 = r0.f20077c
            float r4 = r3.f20105e
            float r4 = r4 - r2
            float r4 = r4 * r14
            float r2 = r2 + r4
            float r4 = r1.f20106f
            float r5 = r3.f20106f
            float r5 = r5 - r4
            float r5 = r5 * r14
            float r4 = r4 + r5
            float r5 = r1.f20107g
            float r6 = r3.f20107g
            float r7 = r6 - r5
            float r7 = r7 * r14
            float r7 = r7 + r5
            float r1 = r1.f20108h
            float r3 = r3.f20108h
            float r8 = r3 - r1
            float r8 = r8 * r14
            float r8 = r8 + r1
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r9
            int r10 = (int) r2
            float r4 = r4 + r9
            int r9 = (int) r4
            float r2 = r2 + r7
            int r2 = (int) r2
            float r4 = r4 + r8
            int r4 = (int) r4
            int r7 = r2 - r10
            int r8 = r4 - r9
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 != 0) goto L_0x022d
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x022d
            boolean r1 = r0.f20075a
            if (r1 == 0) goto L_0x023c
        L_0x022d:
            r1 = 1073741824(0x40000000, float:2.0)
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r1)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r1)
            r11.measure(r3, r1)
            r0.f20075a = r15
        L_0x023c:
            r11.layout(r10, r9, r2, r4)
        L_0x023f:
            java.util.HashMap<java.lang.String, r2.b> r1 = r0.f20092r
            if (r1 == 0) goto L_0x026e
            java.util.Collection r1 = r1.values()
            java.util.Iterator r8 = r1.iterator()
        L_0x024b:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x026e
            java.lang.Object r1 = r8.next()
            r2.b r1 = (r2.C5819b) r1
            boolean r2 = r1 instanceof r2.C5819b.a
            if (r2 == 0) goto L_0x026a
            r2.b$a r1 = (r2.C5819b.a) r1
            double[] r2 = r0.f20086l
            r4 = r2[r15]
            r6 = r2[r19]
            r2 = r21
            r3 = r14
            r1.k(r2, r3, r4, r6)
            goto L_0x024b
        L_0x026a:
            r1.j(r11, r14)
            goto L_0x024b
        L_0x026e:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.g.c(android.view.View, float, long, k2.f):boolean");
    }

    public String toString() {
        return " start: x: " + this.f20076b.f20105e + " y: " + this.f20076b.f20106f + " end: x: " + this.f20077c.f20105e + " y: " + this.f20077c.f20106f;
    }
}
