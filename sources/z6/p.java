package z6;

import C6.l;
import E6.b;
import J6.a;
import J6.c;
import J6.d;
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import w6.z;
import z6.C9019a;

public class p {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f58467a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Matrix f58468b;

    /* renamed from: c  reason: collision with root package name */
    private final Matrix f58469c;

    /* renamed from: d  reason: collision with root package name */
    private final Matrix f58470d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f58471e;

    /* renamed from: f  reason: collision with root package name */
    private C9019a<PointF, PointF> f58472f;

    /* renamed from: g  reason: collision with root package name */
    private C9019a<?, PointF> f58473g;

    /* renamed from: h  reason: collision with root package name */
    private C9019a<d, d> f58474h;

    /* renamed from: i  reason: collision with root package name */
    private C9019a<Float, Float> f58475i;

    /* renamed from: j  reason: collision with root package name */
    private C9019a<Integer, Integer> f58476j;

    /* renamed from: k  reason: collision with root package name */
    private C9022d f58477k;

    /* renamed from: l  reason: collision with root package name */
    private C9022d f58478l;

    /* renamed from: m  reason: collision with root package name */
    private C9019a<?, Float> f58479m;

    /* renamed from: n  reason: collision with root package name */
    private C9019a<?, Float> f58480n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f58481o;

    public p(l lVar) {
        this.f58472f = lVar.c() == null ? null : lVar.c().h();
        this.f58473g = lVar.f() == null ? null : lVar.f().h();
        this.f58474h = lVar.h() == null ? null : lVar.h().h();
        this.f58475i = lVar.g() == null ? null : lVar.g().h();
        this.f58477k = lVar.i() == null ? null : (C9022d) lVar.i().h();
        this.f58481o = lVar.l();
        if (this.f58477k != null) {
            this.f58468b = new Matrix();
            this.f58469c = new Matrix();
            this.f58470d = new Matrix();
            this.f58471e = new float[9];
        } else {
            this.f58468b = null;
            this.f58469c = null;
            this.f58470d = null;
            this.f58471e = null;
        }
        this.f58478l = lVar.j() == null ? null : (C9022d) lVar.j().h();
        if (lVar.e() != null) {
            this.f58476j = lVar.e().h();
        }
        if (lVar.k() != null) {
            this.f58479m = lVar.k().h();
        } else {
            this.f58479m = null;
        }
        if (lVar.d() != null) {
            this.f58480n = lVar.d().h();
        } else {
            this.f58480n = null;
        }
    }

    private void d() {
        for (int i10 = 0; i10 < 9; i10++) {
            this.f58471e[i10] = 0.0f;
        }
    }

    public void a(b bVar) {
        bVar.i(this.f58476j);
        bVar.i(this.f58479m);
        bVar.i(this.f58480n);
        bVar.i(this.f58472f);
        bVar.i(this.f58473g);
        bVar.i(this.f58474h);
        bVar.i(this.f58475i);
        bVar.i(this.f58477k);
        bVar.i(this.f58478l);
    }

    public void b(C9019a.b bVar) {
        C9019a<Integer, Integer> aVar = this.f58476j;
        if (aVar != null) {
            aVar.a(bVar);
        }
        C9019a<?, Float> aVar2 = this.f58479m;
        if (aVar2 != null) {
            aVar2.a(bVar);
        }
        C9019a<?, Float> aVar3 = this.f58480n;
        if (aVar3 != null) {
            aVar3.a(bVar);
        }
        C9019a<PointF, PointF> aVar4 = this.f58472f;
        if (aVar4 != null) {
            aVar4.a(bVar);
        }
        C9019a<?, PointF> aVar5 = this.f58473g;
        if (aVar5 != null) {
            aVar5.a(bVar);
        }
        C9019a<d, d> aVar6 = this.f58474h;
        if (aVar6 != null) {
            aVar6.a(bVar);
        }
        C9019a<Float, Float> aVar7 = this.f58475i;
        if (aVar7 != null) {
            aVar7.a(bVar);
        }
        C9022d dVar = this.f58477k;
        if (dVar != null) {
            dVar.a(bVar);
        }
        C9022d dVar2 = this.f58478l;
        if (dVar2 != null) {
            dVar2.a(bVar);
        }
    }

    public <T> boolean c(T t10, c<T> cVar) {
        if (t10 == z.f57312f) {
            C9019a<PointF, PointF> aVar = this.f58472f;
            if (aVar == null) {
                this.f58472f = new q(cVar, new PointF());
                return true;
            }
            aVar.n(cVar);
            return true;
        } else if (t10 == z.f57313g) {
            C9019a<?, PointF> aVar2 = this.f58473g;
            if (aVar2 == null) {
                this.f58473g = new q(cVar, new PointF());
                return true;
            }
            aVar2.n(cVar);
            return true;
        } else {
            if (t10 == z.f57314h) {
                C9019a<?, PointF> aVar3 = this.f58473g;
                if (aVar3 instanceof n) {
                    ((n) aVar3).r(cVar);
                    return true;
                }
            }
            if (t10 == z.f57315i) {
                C9019a<?, PointF> aVar4 = this.f58473g;
                if (aVar4 instanceof n) {
                    ((n) aVar4).s(cVar);
                    return true;
                }
            }
            if (t10 == z.f57321o) {
                C9019a<d, d> aVar5 = this.f58474h;
                if (aVar5 == null) {
                    this.f58474h = new q(cVar, new d());
                    return true;
                }
                aVar5.n(cVar);
                return true;
            } else if (t10 == z.f57322p) {
                C9019a<Float, Float> aVar6 = this.f58475i;
                if (aVar6 == null) {
                    this.f58475i = new q(cVar, Float.valueOf(0.0f));
                    return true;
                }
                aVar6.n(cVar);
                return true;
            } else if (t10 == z.f57309c) {
                C9019a<Integer, Integer> aVar7 = this.f58476j;
                if (aVar7 == null) {
                    this.f58476j = new q(cVar, 100);
                    return true;
                }
                aVar7.n(cVar);
                return true;
            } else if (t10 == z.f57294C) {
                C9019a<?, Float> aVar8 = this.f58479m;
                if (aVar8 == null) {
                    this.f58479m = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar8.n(cVar);
                return true;
            } else if (t10 == z.f57295D) {
                C9019a<?, Float> aVar9 = this.f58480n;
                if (aVar9 == null) {
                    this.f58480n = new q(cVar, Float.valueOf(100.0f));
                    return true;
                }
                aVar9.n(cVar);
                return true;
            } else if (t10 == z.f57323q) {
                if (this.f58477k == null) {
                    this.f58477k = new C9022d(Collections.singletonList(new a(Float.valueOf(0.0f))));
                }
                this.f58477k.n(cVar);
                return true;
            } else if (t10 != z.f57324r) {
                return false;
            } else {
                if (this.f58478l == null) {
                    this.f58478l = new C9022d(Collections.singletonList(new a(Float.valueOf(0.0f))));
                }
                this.f58478l.n(cVar);
                return true;
            }
        }
    }

    public C9019a<?, Float> e() {
        return this.f58480n;
    }

    public Matrix f() {
        PointF h10;
        d h11;
        PointF h12;
        this.f58467a.reset();
        C9019a<?, PointF> aVar = this.f58473g;
        if (!(aVar == null || (h12 = aVar.h()) == null)) {
            float f10 = h12.x;
            if (!(f10 == 0.0f && h12.y == 0.0f)) {
                this.f58467a.preTranslate(f10, h12.y);
            }
        }
        if (!this.f58481o) {
            C9019a<Float, Float> aVar2 = this.f58475i;
            if (aVar2 != null) {
                float floatValue = aVar2 instanceof q ? aVar2.h().floatValue() : ((C9022d) aVar2).p();
                if (floatValue != 0.0f) {
                    this.f58467a.preRotate(floatValue);
                }
            }
        } else if (aVar != null) {
            float f11 = aVar.f();
            PointF h13 = aVar.h();
            float f12 = h13.x;
            float f13 = h13.y;
            aVar.m(1.0E-4f + f11);
            PointF h14 = aVar.h();
            aVar.m(f11);
            this.f58467a.preRotate((float) Math.toDegrees(Math.atan2((double) (h14.y - f13), (double) (h14.x - f12))));
        }
        C9022d dVar = this.f58477k;
        if (dVar != null) {
            C9022d dVar2 = this.f58478l;
            float cos = dVar2 == null ? 0.0f : (float) Math.cos(Math.toRadians((double) ((-dVar2.p()) + 90.0f)));
            C9022d dVar3 = this.f58478l;
            float sin = dVar3 == null ? 1.0f : (float) Math.sin(Math.toRadians((double) ((-dVar3.p()) + 90.0f)));
            float tan = (float) Math.tan(Math.toRadians((double) dVar.p()));
            d();
            float[] fArr = this.f58471e;
            fArr[0] = cos;
            fArr[1] = sin;
            float f14 = -sin;
            fArr[3] = f14;
            fArr[4] = cos;
            fArr[8] = 1.0f;
            this.f58468b.setValues(fArr);
            d();
            float[] fArr2 = this.f58471e;
            fArr2[0] = 1.0f;
            fArr2[3] = tan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.f58469c.setValues(fArr2);
            d();
            float[] fArr3 = this.f58471e;
            fArr3[0] = cos;
            fArr3[1] = f14;
            fArr3[3] = sin;
            fArr3[4] = cos;
            fArr3[8] = 1.0f;
            this.f58470d.setValues(fArr3);
            this.f58469c.preConcat(this.f58468b);
            this.f58470d.preConcat(this.f58469c);
            this.f58467a.preConcat(this.f58470d);
        }
        C9019a<d, d> aVar3 = this.f58474h;
        if (!(aVar3 == null || (h11 = aVar3.h()) == null || (h11.b() == 1.0f && h11.c() == 1.0f))) {
            this.f58467a.preScale(h11.b(), h11.c());
        }
        C9019a<PointF, PointF> aVar4 = this.f58472f;
        if (!(aVar4 == null || (h10 = aVar4.h()) == null)) {
            float f15 = h10.x;
            if (!(f15 == 0.0f && h10.y == 0.0f)) {
                this.f58467a.preTranslate(-f15, -h10.y);
            }
        }
        return this.f58467a;
    }

    public Matrix g(float f10) {
        C9019a<?, PointF> aVar = this.f58473g;
        PointF pointF = null;
        PointF h10 = aVar == null ? null : aVar.h();
        C9019a<d, d> aVar2 = this.f58474h;
        d h11 = aVar2 == null ? null : aVar2.h();
        this.f58467a.reset();
        if (h10 != null) {
            this.f58467a.preTranslate(h10.x * f10, h10.y * f10);
        }
        if (h11 != null) {
            double d10 = (double) f10;
            this.f58467a.preScale((float) Math.pow((double) h11.b(), d10), (float) Math.pow((double) h11.c(), d10));
        }
        C9019a<Float, Float> aVar3 = this.f58475i;
        if (aVar3 != null) {
            float floatValue = aVar3.h().floatValue();
            C9019a<PointF, PointF> aVar4 = this.f58472f;
            if (aVar4 != null) {
                pointF = aVar4.h();
            }
            Matrix matrix = this.f58467a;
            float f11 = floatValue * f10;
            float f12 = 0.0f;
            float f13 = pointF == null ? 0.0f : pointF.x;
            if (pointF != null) {
                f12 = pointF.y;
            }
            matrix.preRotate(f11, f13, f12);
        }
        return this.f58467a;
    }

    public C9019a<?, Integer> h() {
        return this.f58476j;
    }

    public C9019a<?, Float> i() {
        return this.f58479m;
    }

    public void j(float f10) {
        C9019a<Integer, Integer> aVar = this.f58476j;
        if (aVar != null) {
            aVar.m(f10);
        }
        C9019a<?, Float> aVar2 = this.f58479m;
        if (aVar2 != null) {
            aVar2.m(f10);
        }
        C9019a<?, Float> aVar3 = this.f58480n;
        if (aVar3 != null) {
            aVar3.m(f10);
        }
        C9019a<PointF, PointF> aVar4 = this.f58472f;
        if (aVar4 != null) {
            aVar4.m(f10);
        }
        C9019a<?, PointF> aVar5 = this.f58473g;
        if (aVar5 != null) {
            aVar5.m(f10);
        }
        C9019a<d, d> aVar6 = this.f58474h;
        if (aVar6 != null) {
            aVar6.m(f10);
        }
        C9019a<Float, Float> aVar7 = this.f58475i;
        if (aVar7 != null) {
            aVar7.m(f10);
        }
        C9022d dVar = this.f58477k;
        if (dVar != null) {
            dVar.m(f10);
        }
        C9022d dVar2 = this.f58478l;
        if (dVar2 != null) {
            dVar2.m(f10);
        }
    }
}
