package u1;

import java.util.List;
import kotlin.Metadata;
import p1.U0;
import u1.C6010h;

@Metadata(d1 = {"\u00000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0014\n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a_\u0010\r\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0013\u001a_\u0010\f\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\f\u0010\u001a\"\u001a\u0010\u001f\u001a\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"", "Lu1/h;", "Lp1/U0;", "target", "c", "(Ljava/util/List;Lp1/U0;)Lp1/U0;", "p", "", "x0", "y0", "x1", "y1", "a", "b", "theta", "", "isMoreThanHalf", "isPositiveArc", "LXH/N;", "(Lp1/U0;DDDDDDDZZ)V", "cx", "cy", "e1x", "e1y", "start", "sweep", "(Lp1/U0;DDDDDDDDD)V", "", "[F", "getEmptyArray", "()[F", "EmptyArray", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final float[] f29945a = new float[0];

    private static final void a(U0 u02, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = d12;
        double d20 = (double) 4;
        int ceil = (int) Math.ceil(Math.abs((d18 * d20) / 3.141592653589793d));
        double cos = Math.cos(d16);
        double sin = Math.sin(d16);
        double cos2 = Math.cos(d17);
        double sin2 = Math.sin(d17);
        double d21 = -d19;
        double d22 = d21 * cos;
        double d23 = d13 * sin;
        double d24 = (d22 * sin2) - (d23 * cos2);
        double d25 = d21 * sin;
        double d26 = d13 * cos;
        double d27 = (sin2 * d25) + (cos2 * d26);
        double d28 = d18 / ((double) ceil);
        double d29 = d14;
        double d30 = d27;
        double d31 = d24;
        int i10 = 0;
        double d32 = d15;
        double d33 = d17;
        while (i10 < ceil) {
            double d34 = d33 + d28;
            double sin3 = Math.sin(d34);
            double cos3 = Math.cos(d34);
            int i11 = ceil;
            double d35 = (d10 + ((d19 * cos) * cos3)) - (d23 * sin3);
            double d36 = d11 + (d19 * sin * cos3) + (d26 * sin3);
            double d37 = (d22 * sin3) - (d23 * cos3);
            double d38 = (sin3 * d25) + (cos3 * d26);
            double d39 = d34 - d33;
            double tan = Math.tan(d39 / ((double) 2));
            double d40 = d20;
            double sin4 = (Math.sin(d39) * (Math.sqrt(d20 + ((3.0d * tan) * tan)) - ((double) 1))) / ((double) 3);
            u02.c((float) (d29 + (d31 * sin4)), (float) (d32 + (d30 * sin4)), (float) (d35 - (sin4 * d37)), (float) (d36 - (sin4 * d38)), (float) d35, (float) d36);
            i10++;
            d28 = d28;
            sin = sin;
            d29 = d35;
            d25 = d25;
            d33 = d34;
            d30 = d38;
            d20 = d40;
            d31 = d37;
            cos = cos;
            ceil = i11;
            d32 = d36;
            d19 = d12;
        }
    }

    private static final void b(U0 u02, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = d10;
        double d20 = d12;
        double d21 = (d16 / ((double) 180)) * 3.141592653589793d;
        double cos = Math.cos(d21);
        double sin = Math.sin(d21);
        double d22 = ((d19 * cos) + (d11 * sin)) / d14;
        double d23 = (((-d19) * sin) + (d11 * cos)) / d15;
        double d24 = ((d20 * cos) + (d13 * sin)) / d14;
        double d25 = (((-d20) * sin) + (d13 * cos)) / d15;
        double d26 = d22 - d24;
        double d27 = d23 - d25;
        double d28 = (double) 2;
        double d29 = (d22 + d24) / d28;
        double d30 = (d23 + d25) / d28;
        double d31 = (d26 * d26) + (d27 * d27);
        if (d31 != 0.0d) {
            double d32 = (1.0d / d31) - 0.25d;
            if (d32 < 0.0d) {
                double sqrt = (double) ((float) (Math.sqrt(d31) / 1.99999d));
                b(u02, d10, d11, d12, d13, d14 * sqrt, d15 * sqrt, d16, z10, z11);
                return;
            }
            double sqrt2 = Math.sqrt(d32);
            double d33 = d26 * sqrt2;
            double d34 = sqrt2 * d27;
            double d35 = d21;
            boolean z12 = z11;
            if (z10 == z12) {
                d18 = d29 - d34;
                d17 = d30 + d33;
            } else {
                d18 = d29 + d34;
                d17 = d30 - d33;
            }
            double atan2 = Math.atan2(d23 - d17, d22 - d18);
            double atan22 = Math.atan2(d25 - d17, d24 - d18) - atan2;
            int i10 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
            if (z12 != (i10 >= 0)) {
                atan22 = i10 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d36 = d18 * d14;
            double d37 = d17 * d15;
            a(u02, (d36 * cos) - (d37 * sin), (d36 * sin) + (d37 * cos), d14, d15, d10, d11, d35, atan2, atan22);
        }
    }

    public static final U0 c(List<? extends C6010h> list, U0 u02) {
        int i10;
        int i11;
        float f10;
        C6010h hVar;
        float f11;
        float f12;
        float f13;
        float f14;
        float c10;
        float d10;
        float d11;
        float f15;
        float f16;
        float f17;
        float f18;
        float c11;
        float e10;
        float d12;
        float f19;
        float f20;
        float f21;
        float f22;
        List<? extends C6010h> list2 = list;
        U0 u03 = u02;
        int r10 = u02.r();
        u02.D();
        u03.k(r10);
        C6010h hVar2 = list.isEmpty() ? C6010h.b.f29892c : (C6010h) list2.get(0);
        int size = list.size();
        float f23 = 0.0f;
        int i12 = 0;
        float f24 = 0.0f;
        float f25 = 0.0f;
        float f26 = 0.0f;
        float f27 = 0.0f;
        float f28 = 0.0f;
        float f29 = 0.0f;
        while (i12 < size) {
            C6010h hVar3 = (C6010h) list2.get(i12);
            if (hVar3 instanceof C6010h.b) {
                u02.close();
                hVar = hVar3;
                f10 = f23;
                i11 = i12;
                i10 = size;
                f24 = f28;
                f26 = f24;
                f25 = f29;
                f27 = f25;
            } else {
                if (hVar3 instanceof C6010h.n) {
                    C6010h.n nVar = (C6010h.n) hVar3;
                    f26 += nVar.c();
                    f27 += nVar.d();
                    u03.f(nVar.c(), nVar.d());
                    f28 = f26;
                } else if (hVar3 instanceof C6010h.f) {
                    C6010h.f fVar = (C6010h.f) hVar3;
                    float c12 = fVar.c();
                    float d13 = fVar.d();
                    u03.b(fVar.c(), fVar.d());
                    f26 = c12;
                    f28 = f26;
                    f27 = d13;
                } else {
                    if (hVar3 instanceof C6010h.m) {
                        C6010h.m mVar = (C6010h.m) hVar3;
                        u03.u(mVar.c(), mVar.d());
                        f26 += mVar.c();
                        f16 = mVar.d();
                    } else {
                        if (hVar3 instanceof C6010h.e) {
                            C6010h.e eVar = (C6010h.e) hVar3;
                            u03.d(eVar.c(), eVar.d());
                            d11 = eVar.c();
                            f15 = eVar.d();
                        } else {
                            if (hVar3 instanceof C6010h.l) {
                                C6010h.l lVar = (C6010h.l) hVar3;
                                u03.u(lVar.c(), f23);
                                f26 += lVar.c();
                            } else if (hVar3 instanceof C6010h.d) {
                                C6010h.d dVar = (C6010h.d) hVar3;
                                u03.d(dVar.c(), f27);
                                f26 = dVar.c();
                            } else if (hVar3 instanceof C6010h.r) {
                                C6010h.r rVar = (C6010h.r) hVar3;
                                u03.u(f23, rVar.c());
                                f16 = rVar.c();
                            } else if (hVar3 instanceof C6010h.s) {
                                C6010h.s sVar = (C6010h.s) hVar3;
                                u03.d(f26, sVar.c());
                                f27 = sVar.c();
                            } else {
                                if (hVar3 instanceof C6010h.k) {
                                    C6010h.k kVar = (C6010h.k) hVar3;
                                    u02.g(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                                    f13 = kVar.d() + f26;
                                    f14 = kVar.g() + f27;
                                    c10 = f26 + kVar.e();
                                    d10 = kVar.h();
                                } else {
                                    if (hVar3 instanceof C6010h.c) {
                                        C6010h.c cVar = (C6010h.c) hVar3;
                                        u02.c(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                        c11 = cVar.d();
                                        e10 = cVar.g();
                                        d12 = cVar.e();
                                        f19 = cVar.h();
                                    } else if (hVar3 instanceof C6010h.p) {
                                        if (hVar2.a()) {
                                            f20 = f27 - f25;
                                            f21 = f26 - f24;
                                        } else {
                                            f21 = f23;
                                            f20 = f21;
                                        }
                                        C6010h.p pVar = (C6010h.p) hVar3;
                                        u02.g(f21, f20, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                        f13 = pVar.c() + f26;
                                        f14 = pVar.e() + f27;
                                        c10 = f26 + pVar.d();
                                        d10 = pVar.f();
                                    } else if (hVar3 instanceof C6010h.C0467h) {
                                        if (hVar2.a()) {
                                            float f30 = (float) 2;
                                            f17 = (f30 * f27) - f25;
                                            f18 = (f26 * f30) - f24;
                                        } else {
                                            f18 = f26;
                                            f17 = f27;
                                        }
                                        C6010h.C0467h hVar4 = (C6010h.C0467h) hVar3;
                                        u02.c(f18, f17, hVar4.c(), hVar4.e(), hVar4.d(), hVar4.f());
                                        c11 = hVar4.c();
                                        e10 = hVar4.e();
                                        d12 = hVar4.d();
                                        f19 = hVar4.f();
                                    } else if (hVar3 instanceof C6010h.o) {
                                        C6010h.o oVar = (C6010h.o) hVar3;
                                        u03.q(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                        f24 = oVar.c() + f26;
                                        f25 = oVar.e() + f27;
                                        f26 += oVar.d();
                                        f16 = oVar.f();
                                    } else if (hVar3 instanceof C6010h.g) {
                                        C6010h.g gVar = (C6010h.g) hVar3;
                                        u03.m(gVar.c(), gVar.e(), gVar.d(), gVar.f());
                                        f24 = gVar.c();
                                        f25 = gVar.e();
                                        d11 = gVar.d();
                                        f15 = gVar.f();
                                    } else if (hVar3 instanceof C6010h.q) {
                                        if (hVar2.b()) {
                                            f12 = f26 - f24;
                                            f11 = f27 - f25;
                                        } else {
                                            f12 = f23;
                                            f11 = f12;
                                        }
                                        C6010h.q qVar = (C6010h.q) hVar3;
                                        u03.q(f12, f11, qVar.c(), qVar.d());
                                        f13 = f12 + f26;
                                        f14 = f11 + f27;
                                        c10 = f26 + qVar.c();
                                        d10 = qVar.d();
                                    } else if (hVar3 instanceof C6010h.i) {
                                        if (hVar2.b()) {
                                            float f31 = (float) 2;
                                            f26 = (f26 * f31) - f24;
                                            f27 = (f31 * f27) - f25;
                                        }
                                        C6010h.i iVar = (C6010h.i) hVar3;
                                        u03.m(f26, f27, iVar.c(), iVar.d());
                                        float c13 = iVar.c();
                                        f25 = f27;
                                        hVar = hVar3;
                                        f10 = f23;
                                        i11 = i12;
                                        i10 = size;
                                        f27 = iVar.d();
                                        float f32 = f26;
                                        f26 = c13;
                                        f24 = f32;
                                    } else if (hVar3 instanceof C6010h.j) {
                                        C6010h.j jVar = (C6010h.j) hVar3;
                                        float c14 = jVar.c() + f26;
                                        double d14 = (double) f27;
                                        float d15 = jVar.d() + f27;
                                        hVar = hVar3;
                                        i11 = i12;
                                        f10 = 0;
                                        i10 = size;
                                        b(u02, (double) f26, d14, (double) c14, (double) d15, (double) jVar.e(), (double) jVar.g(), (double) jVar.f(), jVar.h(), jVar.i());
                                        f25 = d15;
                                        f27 = f25;
                                        f24 = c14;
                                        f26 = f24;
                                    } else {
                                        hVar = hVar3;
                                        f10 = f23;
                                        i11 = i12;
                                        i10 = size;
                                        if (hVar instanceof C6010h.a) {
                                            C6010h.a aVar = (C6010h.a) hVar;
                                            b(u02, (double) f26, (double) f27, (double) aVar.c(), (double) aVar.d(), (double) aVar.e(), (double) aVar.g(), (double) aVar.f(), aVar.h(), aVar.i());
                                            f26 = aVar.c();
                                            f25 = aVar.d();
                                            f27 = f25;
                                            f24 = f26;
                                        }
                                    }
                                    c10 = d12;
                                    f22 = f19;
                                    hVar = hVar3;
                                    f10 = f23;
                                    i11 = i12;
                                    i10 = size;
                                    f25 = e10;
                                    f24 = c11;
                                }
                                f22 = f27 + d10;
                                f25 = f14;
                                hVar = hVar3;
                                f10 = f23;
                                i11 = i12;
                                i10 = size;
                                f24 = c11;
                            }
                            hVar = hVar3;
                            f10 = f23;
                            i11 = i12;
                            i10 = size;
                        }
                        f27 = f15;
                        f26 = d11;
                        hVar = hVar3;
                        f10 = f23;
                        i11 = i12;
                        i10 = size;
                    }
                    f27 += f16;
                    hVar = hVar3;
                    f10 = f23;
                    i11 = i12;
                    i10 = size;
                }
                f29 = f27;
                hVar = hVar3;
                f10 = f23;
                i11 = i12;
                i10 = size;
            }
            i12 = i11 + 1;
            u03 = u02;
            hVar2 = hVar;
            f23 = f10;
            size = i10;
            list2 = list;
        }
        return u02;
    }
}
