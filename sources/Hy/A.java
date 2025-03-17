package Hy;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import KJ.C15987c;
import LC.C13178b;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import YH.C16877v;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import com.ingka.ikea.core.model.Image;
import gs.e;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import s0.C5843N;
import s0.C5857c;
import s0.C5858d;
import s0.C5859e;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LKJ/c;", "Lcom/ingka/ikea/core/model/Image;", "images", "LIC/e;", "number", "LXH/N;", "c", "(LKJ/c;LIC/e;LU0/m;I)V", "image", "Lc2/h;", "maxSize", "e", "(Lcom/ingka/ikea/core/model/Image;FLU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class A {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5859e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Image f110823a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C15987c<Image> f110824b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C13023e f110825c;

        a(Image image, C15987c<Image> cVar, C13023e eVar) {
            this.f110823a = image;
            this.f110824b = cVar;
            this.f110825c = eVar;
        }

        public final void a(C5859e eVar, C4889m mVar, int i10) {
            int i11;
            C5859e eVar2 = eVar;
            C4889m mVar2 = mVar;
            C17542s.j(eVar2, "$this$BoxWithConstraints");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(eVar2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-823407648, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.ImagesInfoGrid.<anonymous> (ImagesInfoGrid.kt:46)");
                }
                float B10 = h.B(eVar.c() / ((float) 2));
                d.a aVar = d.f18749a;
                C5437c.a aVar2 = C5437c.f24302a;
                d a10 = eVar2.a(aVar, aVar2.e());
                Image image = this.f110823a;
                C15987c<Image> cVar = this.f110824b;
                C13023e eVar3 = this.f110825c;
                C5073d dVar = C5073d.f18068a;
                I a11 = C5080k.a(dVar.g(), aVar2.k(), mVar2, 0);
                int a12 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, a10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a13);
                } else {
                    mVar.t();
                }
                C4889m a14 = F1.a(mVar);
                F1.c(a14, a11, aVar3.c());
                F1.c(a14, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.w(Integer.valueOf(a12), b10);
                }
                F1.c(a14, e10, aVar3.d());
                C5862h hVar = C5862h.f28810a;
                I b11 = G.b(dVar.e(), aVar2.l(), mVar2, 6);
                int a15 = C4883j.a(mVar2, 0);
                C4912y s11 = mVar.s();
                d e11 = c.e(mVar2, aVar);
                C17631a<C4504g> a16 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a16);
                } else {
                    mVar.t();
                }
                C4889m a17 = F1.a(mVar);
                F1.c(a17, b11, aVar3.c());
                F1.c(a17, s11, aVar3.e());
                p<C4504g, Integer, C16807N> b12 = aVar3.b();
                if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.w(Integer.valueOf(a15), b12);
                }
                F1.c(a17, e11, aVar3.d());
                C5843N n10 = C5843N.f28726a;
                mVar2.W(287886889);
                for (T g10 : C16877v.k1(cVar, 2)) {
                    A.e(g10, B10, mVar2, 0);
                }
                mVar.P();
                mVar.x();
                mVar2.W(1296338133);
                if (image != null) {
                    C5073d.f e12 = C5073d.f18068a.e();
                    d.a aVar4 = d.f18749a;
                    C5437c.a aVar5 = C5437c.f24302a;
                    I b13 = G.b(e12, aVar5.l(), mVar2, 6);
                    int a18 = C4883j.a(mVar2, 0);
                    C4912y s12 = mVar.s();
                    d e13 = c.e(mVar2, aVar4);
                    C4504g.a aVar6 = C4504g.f6515W;
                    C17631a<C4504g> a19 = aVar6.a();
                    if (mVar.m() == null) {
                        C4883j.c();
                    }
                    mVar.I();
                    if (mVar.i()) {
                        mVar2.p(a19);
                    } else {
                        mVar.t();
                    }
                    C4889m a20 = F1.a(mVar);
                    F1.c(a20, b13, aVar6.c());
                    F1.c(a20, s12, aVar6.e());
                    p<C4504g, Integer, C16807N> b14 = aVar6.b();
                    if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                        a20.u(Integer.valueOf(a18));
                        a20.w(Integer.valueOf(a18), b14);
                    }
                    F1.c(a20, e13, aVar6.d());
                    C5843N n11 = C5843N.f28726a;
                    A.e(image, B10, mVar2, 0);
                    mVar2.W(287899150);
                    if (eVar3 != null) {
                        d i12 = D.i(J.i(J.y(aVar4, B10), B10), h.B((float) 1));
                        C18030v vVar = C18030v.f147664a;
                        int i13 = C18030v.f147665b;
                        d d10 = b.d(i12, vVar.a(mVar2, i13).F0(), (i1) null, 2, (Object) null);
                        I h10 = C5077h.h(aVar5.o(), false);
                        int a21 = C4883j.a(mVar2, 0);
                        C4912y s13 = mVar.s();
                        d e14 = c.e(mVar2, d10);
                        C17631a<C4504g> a22 = aVar6.a();
                        if (mVar.m() == null) {
                            C4883j.c();
                        }
                        mVar.I();
                        if (mVar.i()) {
                            mVar2.p(a22);
                        } else {
                            mVar.t();
                        }
                        C4889m a23 = F1.a(mVar);
                        F1.c(a23, h10, aVar6.c());
                        F1.c(a23, s13, aVar6.e());
                        p<C4504g, Integer, C16807N> b15 = aVar6.b();
                        if (a23.i() || !C17542s.e(a23.D(), Integer.valueOf(a21))) {
                            a23.u(Integer.valueOf(a21));
                            a23.w(Integer.valueOf(a21), b15);
                        }
                        F1.c(a23, e14, aVar6.d());
                        d a24 = C5079j.f18125a.a(aVar4, aVar5.e());
                        int i14 = C13023e.f110931a;
                        String a25 = eVar3.a(mVar2, i14);
                        C13607l.i(eVar3, C13679b.C2857b.a.f116683a, C5116k1.a(a24, "GRID-OverflowProducts" + a25), vVar.a(mVar2, i13).x0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, i14 | 48, 0, 262128);
                        mVar.x();
                    }
                    mVar.P();
                    mVar.x();
                }
                mVar.P();
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5859e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void c(C15987c<Image> cVar, C13023e eVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(cVar, "images");
        C4889m k10 = mVar.k(-1013283338);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= (i10 & 64) == 0 ? k10.V(eVar) : k10.F(eVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1013283338, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.ImagesInfoGrid (ImagesInfoGrid.kt:41)");
            }
            C5858d.a(J.h(d.f18749a, 0.0f, 1, (Object) null), (C5437c) null, false, c1.c.e(-823407648, true, new a((Image) C16877v.z0(cVar, 2), cVar, eVar), k10, 54), k10, 3078, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new y(cVar, eVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C15987c cVar, C13023e eVar, int i10, C4889m mVar, int i11) {
        c(cVar, eVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void e(Image image, float f10, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        Image image2 = image;
        float f11 = f10;
        int i12 = i10;
        C4889m k10 = mVar.k(194484678);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(image2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.c(f11) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(194484678, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.fullserveinfo.ProductImage (ImagesInfoGrid.kt:85)");
            }
            d.a aVar = d.f18749a;
            d d10 = b.d(D.i(J.i(J.y(aVar, f11), f11), h.B((float) 1)), C18030v.f147664a.a(k10, C18030v.f147665b).F0(), (i1) null, 2, (Object) null);
            C5437c.a aVar2 = C5437c.f24302a;
            I h10 = C5077h.h(aVar2.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, d10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar3.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, h10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b10 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar3.d());
            d a13 = C5079j.f18125a.a(D.i(aVar, h.B((float) 16)), aVar2.e());
            String url = image.getUrl();
            mVar2 = k10;
            LC.h.c(image.getUrl(), image.A0(), C5116k1.a(a13, "GRID-ProductImage" + url), C13178b.a.f111818a, (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar2, C13178b.a.f111819b << 9, 0, 4080);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new z(image2, f11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(Image image, float f10, int i10, C4889m mVar, int i11) {
        e(image, f10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}
