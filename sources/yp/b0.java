package Yp;

import A0.g;
import E1.C4478k;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import KJ.C15987c;
import L1.i;
import L1.x;
import LC.C13178b;
import LC.h;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import ZC.C13902y;
import android.content.res.Configuration;
import android.graphics.Color;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import aq.C11079a;
import aq.e;
import com.ingka.ikea.core.model.Media;
import com.sugarcube.core.logger.DslKt;
import gs.e;
import i1.C5437c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n0.C5607m;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.C5751x0;
import p1.i1;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5842M;
import s0.C5843N;
import s0.C5857c;
import t0.C5938c;
import tK.C18030v;
import x0.C6230C;
import x0.v;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u000f\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0014\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0016\u0010\u0015\u001a!\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a!\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001b2\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0003¢\u0006\u0004\b \u0010!\u001a\u0013\u0010$\u001a\u00020#*\u00020\"H\u0003¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lt0/x;", "", "index", "Laq/a$g;", "uiModel", "Lkotlin/Function2;", "", "LXH/N;", "onStoryClicked", "", "isScreenReaderOn", "A", "(Lt0/x;ILaq/a$g;LnI/p;Z)V", "z", "(LU0/m;I)Z", "LKJ/c;", "Laq/e;", "cards", "Landroidx/compose/ui/d;", "modifier", "m", "(LKJ/c;Landroidx/compose/ui/d;LU0/m;II)V", "p", "Laq/e$a;", "card", "k", "(Laq/e$a;Landroidx/compose/ui/d;LU0/m;II)V", "Laq/e$c;", "s", "(Laq/e$c;Landroidx/compose/ui/d;LU0/m;II)V", "Lx0/C;", "pagerState", "i", "(Lx0/C;LU0/m;I)V", "Laq/c;", "Lp1/v0;", "C", "(Laq/c;LU0/m;I)J", "discover-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements r<v, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<e> f89621a;

        a(C15987c<? extends e> cVar) {
            this.f89621a = cVar;
        }

        public final void a(v vVar, int i10, C4889m mVar, int i11) {
            C4889m mVar2 = mVar;
            C17542s.j(vVar, "$this$HorizontalPager");
            if (C4895p.J()) {
                C4895p.S(-698775559, i11, -1, "com.ingka.ikea.discover.impl.ui.StoryCarousel.<anonymous>.<anonymous> (StoryComposables.kt:135)");
            }
            e eVar = this.f89621a.get(i10);
            if (eVar instanceof e.b) {
                mVar2.W(1259783203);
                e.b bVar = (e.b) eVar;
                Media a10 = bVar.a();
                if (a10 instanceof Media.Image) {
                    mVar2.W(1259817768);
                    h.c(bVar.a().getUrl(), bVar.a().A0(), J.f(d.f18749a, 0.0f, 1, (Object) null), C13178b.a.f111818a, (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar, (C13178b.a.f111819b << 9) | 384, 0, 4080);
                    mVar.P();
                } else if (a10 instanceof Media.InfoImage) {
                    mVar.W(1260171819);
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("InfoImage not supported in StoryCarousel");
                    qv.e eVar2 = qv.e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar2, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar2 : arrayList) {
                        if (str == null) {
                            String a11 = C11818a.a((String) null, illegalArgumentException);
                            if (a11 == null) {
                                break;
                            }
                            str = C11820c.a(a11);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = vVar.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar2.a(eVar2, str4, false, illegalArgumentException, str3);
                        str = str3;
                        str2 = str4;
                    }
                    h.c(bVar.a().getUrl(), bVar.a().A0(), J.f(d.f18749a, 0.0f, 1, (Object) null), C13178b.a.f111818a, (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar, (C13178b.a.f111819b << 9) | 384, 0, 4080);
                    mVar.P();
                } else if (a10 instanceof Media.Video) {
                    mVar.W(1260830414);
                    C13902y.q(bVar.a().getUrl(), bVar.a().A0(), C5074e.b(d.f18749a, C15854t.d0(bVar.a().getUrl(), "4x5", false, 2, (Object) null) ? 0.8f : 0.75f, false, 2, (Object) null), (C5437c) null, mVar, 0, 8);
                    mVar.P();
                    mVar.P();
                } else {
                    mVar.W(-790645161);
                    mVar.P();
                    throw new t();
                }
                C4889m mVar3 = mVar;
                mVar.P();
            } else {
                C4889m mVar4 = mVar2;
                if (eVar instanceof e.c) {
                    mVar4.W(1261624479);
                    b0.s((e.c) eVar, (d) null, mVar4, 0, 2);
                    mVar.P();
                } else if (eVar instanceof e.a) {
                    mVar4.W(1261722160);
                    b0.k((e.a) eVar, J.f(d.f18749a, 0.0f, 1, (Object) null), mVar4, 48, 0);
                    mVar.P();
                } else {
                    mVar4.W(-790647837);
                    mVar.P();
                    throw new t();
                }
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements r<v, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<List<aq.e>> f89622a;

        b(List<? extends List<? extends aq.e>> list) {
            this.f89622a = list;
        }

        public final void a(v vVar, int i10, C4889m mVar, int i11) {
            boolean z10;
            C4889m mVar2;
            C4889m mVar3 = mVar;
            C17542s.j(vVar, "$this$HorizontalPager");
            if (C4895p.J()) {
                C4895p.S(-953228676, i11, -1, "com.ingka.ikea.discover.impl.ui.StoryCarouselLandscape.<anonymous>.<anonymous> (StoryComposables.kt:229)");
            }
            List<List<aq.e>> list = this.f89622a;
            d.a aVar = d.f18749a;
            boolean z11 = false;
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), mVar3, 0);
            int a10 = C4883j.a(mVar3, 0);
            C4912y s10 = mVar.s();
            d e10 = androidx.compose.ui.c.e(mVar3, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (mVar.m() == null) {
                C4883j.c();
            }
            mVar.I();
            if (mVar.i()) {
                mVar3.p(a11);
            } else {
                mVar.t();
            }
            C4889m a12 = F1.a(mVar);
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            C5843N n10 = C5843N.f28726a;
            mVar3.W(-924857256);
            int i12 = 0;
            for (Object next : list.get(i10)) {
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C16877v.x();
                }
                aq.e eVar = (aq.e) next;
                if (eVar instanceof e.b) {
                    mVar3.W(-22130401);
                    e.b bVar = (e.b) eVar;
                    Media a13 = bVar.a();
                    if (a13 instanceof Media.Image) {
                        mVar3.W(-22091279);
                        h.c(bVar.a().getUrl(), bVar.a().A0(), C5842M.e(n10, C5074e.b(d.f18749a, 0.75f, z11, 2, (Object) null), 1.0f, false, 2, (Object) null), C13178b.a.f111818a, (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar, C13178b.a.f111819b << 9, 0, 4080);
                        mVar.P();
                    } else if (a13 instanceof Media.InfoImage) {
                        mVar.W(-21568557);
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("InfoImage not supported in StoryCarousels");
                        qv.e eVar2 = qv.e.ERROR;
                        ArrayList<C11819b> arrayList = new ArrayList<>();
                        for (Object next2 : qv.d.f102012a.a()) {
                            if (((C11819b) next2).b(eVar2, false)) {
                                arrayList.add(next2);
                            }
                        }
                        String str = null;
                        String str2 = null;
                        for (C11819b bVar2 : arrayList) {
                            if (str == null) {
                                String a14 = C11818a.a((String) null, illegalArgumentException);
                                if (a14 == null) {
                                    break;
                                }
                                str = C11820c.a(a14);
                            }
                            String str3 = str;
                            if (str2 == null) {
                                String name = n10.getClass().getName();
                                C17542s.g(name);
                                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                                if (o12.length() != 0) {
                                    name = C15854t.P0(o12, "Kt");
                                }
                                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                            }
                            String str4 = str2;
                            bVar2.a(eVar2, str4, false, illegalArgumentException, str3);
                            str = str3;
                            str2 = str4;
                        }
                        h.c(bVar.a().getUrl(), bVar.a().A0(), C5842M.e(n10, C5074e.b(d.f18749a, 0.75f, false, 2, (Object) null), 1.0f, false, 2, (Object) null), C13178b.a.f111818a, (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar, C13178b.a.f111819b << 9, 0, 4080);
                        mVar.P();
                    } else if (a13 instanceof Media.Video) {
                        mVar2 = mVar;
                        mVar2.W(-20682949);
                        z10 = false;
                        C13902y.q(bVar.a().getUrl(), bVar.a().A0(), C5842M.e(n10, C5074e.b(d.f18749a, 0.75f, false, 2, (Object) null), 1.0f, false, 2, (Object) null), i12 == 0 ? C5437c.f24302a.d() : C5437c.f24302a.c(), mVar, 0, 0);
                        mVar.P();
                        mVar.P();
                    } else {
                        mVar.W(-1109091637);
                        mVar.P();
                        throw new t();
                    }
                    mVar2 = mVar;
                    z10 = false;
                    mVar.P();
                } else {
                    z10 = z11;
                    mVar2 = mVar3;
                    if (eVar instanceof e.c) {
                        mVar2.W(-19766806);
                        b0.s((e.c) eVar, C5842M.e(n10, C5074e.b(J.d(d.f18749a, 0.0f, 1, (Object) null), 0.75f, z10, 2, (Object) null), 1.0f, false, 2, (Object) null), mVar2, z10, z10);
                        mVar.P();
                    } else if (eVar instanceof e.a) {
                        mVar2.W(-19351778);
                        b0.k((e.a) eVar, C5842M.e(n10, C5074e.b(d.f18749a, 0.75f, z10, 2, (Object) null), 1.0f, false, 2, (Object) null), mVar2, z10 ? 1 : 0, z10);
                        mVar.P();
                    } else {
                        mVar2.W(-1109093747);
                        mVar.P();
                        throw new t();
                    }
                }
                mVar3 = mVar2;
                z11 = z10;
                i12 = i13;
            }
            C4889m mVar4 = mVar3;
            mVar.P();
            mVar.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f89623a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<String, String, C16807N> f89624b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C11079a.g f89625c;

        c(boolean z10, p<? super String, ? super String, C16807N> pVar, C11079a.g gVar) {
            this.f89623a = z10;
            this.f89624b = pVar;
            this.f89625c = gVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(p pVar, C11079a.g gVar) {
            pVar.invoke(gVar.d(), gVar.e());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C11079a.g gVar, x xVar) {
            C17542s.j(xVar, "$this$clearAndSetSemantics");
            String c10 = gVar.c();
            String e10 = gVar.e();
            L1.v.d0(xVar, c10 + ". " + e10);
            L1.v.l0(xVar, i.f8936b.a());
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(x xVar) {
            C17542s.j(xVar, "$this$semantics");
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void e(t0.C5938c r10, U0.C4889m r11, int r12) {
            /*
                r9 = this;
                java.lang.String r0 = "$this$item"
                kotlin.jvm.internal.C17542s.j(r10, r0)
                r10 = r12 & 17
                r0 = 16
                if (r10 != r0) goto L_0x0017
                boolean r10 = r11.l()
                if (r10 != 0) goto L_0x0012
                goto L_0x0017
            L_0x0012:
                r11.L()
                goto L_0x00f1
            L_0x0017:
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x0026
                r10 = -1
                java.lang.String r0 = "com.ingka.ikea.discover.impl.ui.storySection.<anonymous> (StoryComposables.kt:75)"
                r1 = 1420587872(0x54ac7360, float:5.9253604E12)
                U0.C4895p.S(r1, r12, r10, r0)
            L_0x0026:
                androidx.compose.ui.d$a r10 = androidx.compose.ui.d.f18749a
                r12 = 0
                r0 = 0
                r1 = 1
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.h(r10, r12, r1, r0)
                boolean r3 = r9.f89623a
                r10 = 288008481(0x112aa921, float:1.3462752E-28)
                r11.W(r10)
                nI.p<java.lang.String, java.lang.String, XH.N> r10 = r9.f89624b
                boolean r10 = r11.V(r10)
                aq.a$g r12 = r9.f89625c
                boolean r12 = r11.F(r12)
                r10 = r10 | r12
                nI.p<java.lang.String, java.lang.String, XH.N> r12 = r9.f89624b
                aq.a$g r0 = r9.f89625c
                java.lang.Object r4 = r11.D()
                if (r10 != 0) goto L_0x0056
                U0.m$a r10 = U0.C4889m.f14007a
                java.lang.Object r10 = r10.a()
                if (r4 != r10) goto L_0x005e
            L_0x0056:
                Yp.c0 r4 = new Yp.c0
                r4.<init>(r12, r0)
                r11.u(r4)
            L_0x005e:
                r6 = r4
                nI.a r6 = (nI.C17631a) r6
                r11.P()
                r7 = 6
                r8 = 0
                r4 = 0
                r5 = 0
                androidx.compose.ui.d r10 = androidx.compose.foundation.d.d(r2, r3, r4, r5, r6, r7, r8)
                r12 = 288012145(0x112ab771, float:1.3467163E-28)
                r11.W(r12)
                aq.a$g r12 = r9.f89625c
                boolean r12 = r11.F(r12)
                aq.a$g r0 = r9.f89625c
                java.lang.Object r2 = r11.D()
                if (r12 != 0) goto L_0x0088
                U0.m$a r12 = U0.C4889m.f14007a
                java.lang.Object r12 = r12.a()
                if (r2 != r12) goto L_0x0090
            L_0x0088:
                Yp.d0 r2 = new Yp.d0
                r2.<init>(r0)
                r11.u(r2)
            L_0x0090:
                nI.l r2 = (nI.C17642l) r2
                r11.P()
                androidx.compose.ui.d r10 = L1.o.a(r10, r2)
                r12 = 288017621(0x112accd5, float:1.3473754E-28)
                r11.W(r12)
                java.lang.Object r12 = r11.D()
                U0.m$a r0 = U0.C4889m.f14007a
                java.lang.Object r0 = r0.a()
                if (r12 != r0) goto L_0x00b3
                Yp.e0 r12 = new Yp.e0
                r12.<init>()
                r11.u(r12)
            L_0x00b3:
                nI.l r12 = (nI.C17642l) r12
                r11.P()
                androidx.compose.ui.d r10 = L1.o.c(r10, r1, r12)
                r12 = 0
                boolean r0 = Yp.b0.z(r11, r12)
                if (r0 == 0) goto L_0x00d6
                r0 = 338647001(0x142f57d9, float:8.852567E-27)
                r11.W(r0)
                aq.a$g r0 = r9.f89625c
                KJ.c r0 = r0.b()
                Yp.b0.p(r0, r10, r11, r12, r12)
                r11.P()
                goto L_0x00e8
            L_0x00d6:
                r0 = 338801474(0x1431b342, float:8.971569E-27)
                r11.W(r0)
                aq.a$g r0 = r9.f89625c
                KJ.c r0 = r0.b()
                Yp.b0.m(r0, r10, r11, r12, r12)
                r11.P()
            L_0x00e8:
                boolean r10 = U0.C4895p.J()
                if (r10 == 0) goto L_0x00f1
                U0.C4895p.R()
            L_0x00f1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Yp.b0.c.e(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            e((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void A(t0.x xVar, int i10, C11079a.g gVar, p<? super String, ? super String, C16807N> pVar, boolean z10) {
        C17542s.j(xVar, "<this>");
        C17542s.j(gVar, "uiModel");
        C17542s.j(pVar, "onStoryClicked");
        if (!z10) {
            com.ingka.ikea.discover.impl.ui.a.b0(xVar, i10, gVar.c(), gVar.e());
        }
        xVar.b("StoryCarousel" + i10, "StoryCarousel", c1.c.c(1420587872, true, new c(z10, pVar, gVar)));
        if (!z10) {
            com.ingka.ikea.discover.impl.ui.a.X(xVar, i10, gVar.a(), new T(pVar, gVar));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N B(p pVar, C11079a.g gVar) {
        pVar.invoke(gVar.d(), gVar.e());
        return C16807N.f139792a;
    }

    private static final long C(aq.c cVar, C4889m mVar, int i10) {
        mVar.W(-1408799188);
        if (C4895p.J()) {
            C4895p.S(-1408799188, i10, -1, "com.ingka.ikea.discover.impl.ui.toComposeColor (StoryComposables.kt:366)");
        }
        long b10 = C5751x0.b(Color.parseColor(C5607m.a(mVar, 0) ? cVar.a() : cVar.b()));
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return b10;
    }

    private static final void i(C6230C c10, C4889m mVar, int i10) {
        int i11;
        long z02;
        C4889m k10 = mVar.k(-1001270860);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(c10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1001270860, i11, -1, "com.ingka.ikea.discover.impl.ui.PagingContent (StoryComposables.kt:343)");
            }
            int G10 = c10.G();
            int i12 = 0;
            while (i12 < G10) {
                if (c10.v() == i12) {
                    k10.W(-223006139);
                    z02 = C18030v.f147664a.a(k10, C18030v.f147665b).F0();
                    k10.P();
                } else {
                    k10.W(-222947642);
                    z02 = C18030v.f147664a.a(k10, C18030v.f147665b).z0();
                    k10.P();
                }
                C5077h.a(J.t(androidx.compose.foundation.b.d(m1.e.a(D.i(d.f18749a, c2.h.B((float) 8)), g.h()), z02, (i1) null, 2, (Object) null), c10.v() == i12 ? c2.h.B((float) 12) : c2.h.B((float) 8)), k10, 0);
                i12++;
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new Y(c10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(C6230C c10, int i10, C4889m mVar, int i11) {
        i(c10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void k(aq.e.a r21, androidx.compose.ui.d r22, U0.C4889m r23, int r24, int r25) {
        /*
            r0 = r21
            r1 = r24
            r2 = r25
            r3 = 2022967192(0x78940798, float:2.4019186E34)
            r4 = r23
            U0.m r15 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r1
            goto L_0x0026
        L_0x0025:
            r4 = r1
        L_0x0026:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x002f
            r4 = r4 | 48
        L_0x002c:
            r6 = r22
            goto L_0x0041
        L_0x002f:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r22
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
        L_0x0041:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0053
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            r15.L()
            r3 = r15
            goto L_0x00b3
        L_0x0053:
            if (r5 == 0) goto L_0x0059
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r14 = r5
            goto L_0x005a
        L_0x0059:
            r14 = r6
        L_0x005a:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0066
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.discover.impl.ui.Product (StoryComposables.kt:317)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x0066:
            com.ingka.ikea.core.model.Image r3 = r21.a()
            java.lang.String r4 = r3.getUrl()
            com.ingka.ikea.core.model.Image r3 = r21.a()
            java.lang.String r5 = r3.A0()
            LC.b$a r7 = LC.C13178b.a.f111818a
            r3 = 24
            float r3 = (float) r3
            float r3 = c2.h.B(r3)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.i(r14, r3)
            E1.k$a r3 = E1.C4478k.f5915a
            E1.k r9 = r3.d()
            int r3 = LC.C13178b.a.f111819b
            int r3 = r3 << 9
            r8 = 196608(0x30000, float:2.75506E-40)
            r17 = r3 | r8
            r18 = 0
            r19 = 4048(0xfd0, float:5.672E-42)
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r3 = 0
            r16 = 0
            r20 = r14
            r14 = r3
            r3 = r15
            r15 = r16
            r16 = r3
            LC.h.c(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00b1
            U0.C4895p.R()
        L_0x00b1:
            r6 = r20
        L_0x00b3:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00c1
            Yp.a0 r4 = new Yp.a0
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x00c1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yp.b0.k(aq.e$a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N l(e.a aVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        k(aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x025f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m(KJ.C15987c<? extends aq.e> r28, androidx.compose.ui.d r29, U0.C4889m r30, int r31, int r32) {
        /*
            r0 = r28
            r1 = r31
            r2 = r32
            r3 = 1109841185(0x4226d521, float:41.708134)
            r4 = r30
            U0.m r15 = r4.k(r3)
            r10 = 1
            r4 = r2 & 1
            r14 = 2
            if (r4 == 0) goto L_0x0018
            r4 = r1 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = r14
        L_0x0025:
            r4 = r4 | r1
            goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x0031
            r4 = r4 | 48
        L_0x002e:
            r6 = r29
            goto L_0x0043
        L_0x0031:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002e
            r6 = r29
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x0040
            r7 = 32
            goto L_0x0042
        L_0x0040:
            r7 = 16
        L_0x0042:
            r4 = r4 | r7
        L_0x0043:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0056
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0050
            goto L_0x0056
        L_0x0050:
            r15.L()
            r13 = r15
            goto L_0x0259
        L_0x0056:
            if (r5 == 0) goto L_0x005c
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r12 = r5
            goto L_0x005d
        L_0x005c:
            r12 = r6
        L_0x005d:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0069
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.discover.impl.ui.StoryCarousel (StoryComposables.kt:119)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x0069:
            r3 = 2099092371(0x7d1d9b93, float:1.3093536E37)
            r15.W(r3)
            boolean r3 = r15.F(r0)
            java.lang.Object r4 = r15.D()
            if (r3 != 0) goto L_0x0081
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r4 != r3) goto L_0x0089
        L_0x0081:
            Yp.W r4 = new Yp.W
            r4.<init>(r0)
            r15.u(r4)
        L_0x0089:
            r6 = r4
            nI.a r6 = (nI.C17631a) r6
            r15.P()
            r8 = 0
            r9 = 3
            r4 = 0
            r5 = 0
            r7 = r15
            x0.C r3 = x0.C6231D.k(r4, r5, r6, r7, r8, r9)
            i1.c$a r22 = i1.C5437c.f24302a
            i1.c r4 = r22.o()
            r11 = 0
            E1.I r4 = androidx.compose.foundation.layout.C5077h.h(r4, r11)
            int r5 = U0.C4883j.a(r15, r11)
            U0.y r6 = r15.s()
            androidx.compose.ui.d r7 = androidx.compose.ui.c.e(r15, r12)
            G1.g$a r23 = G1.C4504g.f6515W
            nI.a r8 = r23.a()
            U0.f r9 = r15.m()
            if (r9 != 0) goto L_0x00be
            U0.C4883j.c()
        L_0x00be:
            r15.I()
            boolean r9 = r15.i()
            if (r9 == 0) goto L_0x00cb
            r15.p(r8)
            goto L_0x00ce
        L_0x00cb:
            r15.t()
        L_0x00ce:
            U0.m r8 = U0.F1.a(r15)
            nI.p r9 = r23.c()
            U0.F1.c(r8, r4, r9)
            nI.p r4 = r23.e()
            U0.F1.c(r8, r6, r4)
            nI.p r4 = r23.b()
            boolean r6 = r8.i()
            if (r6 != 0) goto L_0x00f8
            java.lang.Object r6 = r8.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r9)
            if (r6 != 0) goto L_0x0106
        L_0x00f8:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r8.u(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8.w(r5, r4)
        L_0x0106:
            nI.p r4 = r23.d()
            U0.F1.c(r8, r7, r4)
            androidx.compose.foundation.layout.j r4 = androidx.compose.foundation.layout.C5079j.f18125a
            r5 = 8
            float r8 = (float) r5
            float r9 = c2.h.B(r8)
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r5 = TC.e.i(r7)
            r6 = 0
            r13 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r5, r6, r10, r13)
            r6 = 1061158912(0x3f400000, float:0.75)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.C5074e.b(r5, r6, r11, r14, r13)
            Yp.b0$a r6 = new Yp.b0$a
            r6.<init>(r0)
            r11 = -698775559(0xffffffffd65987f9, float:-5.9794505E13)
            r14 = 54
            c1.a r17 = c1.c.e(r11, r10, r6, r15, r14)
            r20 = 3072(0xc00, float:4.305E-42)
            r21 = 8156(0x1fdc, float:1.1429E-41)
            r6 = 0
            r10 = 0
            r11 = r7
            r7 = r10
            r10 = 0
            r24 = r8
            r8 = r10
            r10 = 0
            r18 = 0
            r25 = r11
            r11 = r18
            r18 = 0
            r26 = r12
            r12 = r18
            r13 = r18
            r18 = 0
            r14 = r18
            r16 = 0
            r29 = r15
            r15 = r16
            r19 = 196608(0x30000, float:2.75506E-40)
            r27 = r4
            r4 = r3
            r18 = r29
            x0.m.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = 3
            r6 = r25
            r5 = 0
            r7 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.C(r6, r7, r5, r4, r7)
            i1.c r6 = r22.b()
            r7 = r27
            androidx.compose.ui.d r8 = r7.a(r4, r6)
            r4 = 24
            float r4 = (float) r4
            float r12 = c2.h.B(r4)
            r13 = 7
            r14 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r8, r9, r10, r11, r12, r13, r14)
            r6 = 16
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            A0.f r6 = A0.g.e(r6)
            androidx.compose.ui.d r7 = m1.e.a(r4, r6)
            tK.v r4 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            r13 = r29
            tK.h r4 = r4.a(r13, r6)
            long r14 = r4.x0()
            r20 = 14
            r21 = 0
            r16 = 1056293519(0x3ef5c28f, float:0.48)
            r17 = 0
            r18 = 0
            r19 = 0
            long r8 = p1.C5747v0.o(r14, r16, r17, r18, r19, r20, r21)
            r11 = 2
            r12 = 0
            r10 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r7, r8, r10, r11, r12)
            float r6 = c2.h.B(r24)
            r7 = 2
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.j(r4, r6, r7)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r6 = r6.b()
            i1.c$c r7 = r22.i()
            r8 = 54
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r7, r13, r8)
            int r7 = U0.C4883j.a(r13, r5)
            U0.y r8 = r13.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r13, r4)
            nI.a r9 = r23.a()
            U0.f r10 = r13.m()
            if (r10 != 0) goto L_0x01f4
            U0.C4883j.c()
        L_0x01f4:
            r13.I()
            boolean r10 = r13.i()
            if (r10 == 0) goto L_0x0201
            r13.p(r9)
            goto L_0x0204
        L_0x0201:
            r13.t()
        L_0x0204:
            U0.m r9 = U0.F1.a(r13)
            nI.p r10 = r23.c()
            U0.F1.c(r9, r6, r10)
            nI.p r6 = r23.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r23.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x022e
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x023c
        L_0x022e:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x023c:
            nI.p r6 = r23.d()
            U0.F1.c(r9, r4, r6)
            s0.N r4 = s0.C5843N.f28726a
            i(r3, r13, r5)
            r13.x()
            r13.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x0257
            U0.C4895p.R()
        L_0x0257:
            r6 = r26
        L_0x0259:
            U0.Y0 r3 = r13.n()
            if (r3 == 0) goto L_0x0267
            Yp.X r4 = new Yp.X
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yp.b0.m(KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final int n(C15987c cVar) {
        return cVar.size();
    }

    /* access modifiers changed from: private */
    public static final C16807N o(C15987c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        m(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void p(KJ.C15987c<? extends aq.e> r28, androidx.compose.ui.d r29, U0.C4889m r30, int r31, int r32) {
        /*
            r0 = r28
            r1 = r31
            r2 = r32
            r3 = -1803427244(0xffffffff9481e254, float:-1.3114942E-26)
            r4 = r30
            U0.m r15 = r4.k(r3)
            r10 = 1
            r4 = r2 & 1
            r14 = 2
            if (r4 == 0) goto L_0x0018
            r4 = r1 | 6
            goto L_0x0028
        L_0x0018:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0027
            boolean r4 = r15.F(r0)
            if (r4 == 0) goto L_0x0024
            r4 = 4
            goto L_0x0025
        L_0x0024:
            r4 = r14
        L_0x0025:
            r4 = r4 | r1
            goto L_0x0028
        L_0x0027:
            r4 = r1
        L_0x0028:
            r5 = r2 & 2
            r13 = 16
            if (r5 == 0) goto L_0x0033
            r4 = r4 | 48
        L_0x0030:
            r6 = r29
            goto L_0x0044
        L_0x0033:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x0030
            r6 = r29
            boolean r7 = r15.V(r6)
            if (r7 == 0) goto L_0x0042
            r7 = 32
            goto L_0x0043
        L_0x0042:
            r7 = r13
        L_0x0043:
            r4 = r4 | r7
        L_0x0044:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0057
            boolean r7 = r15.l()
            if (r7 != 0) goto L_0x0051
            goto L_0x0057
        L_0x0051:
            r15.L()
            r13 = r15
            goto L_0x0250
        L_0x0057:
            if (r5 == 0) goto L_0x005d
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r12 = r5
            goto L_0x005e
        L_0x005d:
            r12 = r6
        L_0x005e:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x006a
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.discover.impl.ui.StoryCarouselLandscape (StoryComposables.kt:212)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x006a:
            java.util.List r3 = YH.C16877v.k0(r0, r14)
            r4 = 1181888019(0x46722e13, float:15499.519)
            r15.W(r4)
            boolean r4 = r15.F(r3)
            java.lang.Object r5 = r15.D()
            if (r4 != 0) goto L_0x0086
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r5 != r4) goto L_0x008e
        L_0x0086:
            Yp.U r5 = new Yp.U
            r5.<init>(r3)
            r15.u(r5)
        L_0x008e:
            r6 = r5
            nI.a r6 = (nI.C17631a) r6
            r15.P()
            r8 = 0
            r9 = 3
            r4 = 0
            r5 = 0
            r7 = r15
            x0.C r4 = x0.C6231D.k(r4, r5, r6, r7, r8, r9)
            i1.c$a r22 = i1.C5437c.f24302a
            i1.c r5 = r22.o()
            r11 = 0
            E1.I r5 = androidx.compose.foundation.layout.C5077h.h(r5, r11)
            int r6 = U0.C4883j.a(r15, r11)
            U0.y r7 = r15.s()
            androidx.compose.ui.d r8 = androidx.compose.ui.c.e(r15, r12)
            G1.g$a r23 = G1.C4504g.f6515W
            nI.a r9 = r23.a()
            U0.f r16 = r15.m()
            if (r16 != 0) goto L_0x00c3
            U0.C4883j.c()
        L_0x00c3:
            r15.I()
            boolean r16 = r15.i()
            if (r16 == 0) goto L_0x00d0
            r15.p(r9)
            goto L_0x00d3
        L_0x00d0:
            r15.t()
        L_0x00d3:
            U0.m r9 = U0.F1.a(r15)
            nI.p r11 = r23.c()
            U0.F1.c(r9, r5, r11)
            nI.p r5 = r23.e()
            U0.F1.c(r9, r7, r5)
            nI.p r5 = r23.b()
            boolean r7 = r9.i()
            if (r7 != 0) goto L_0x00fd
            java.lang.Object r7 = r9.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r6)
            boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r11)
            if (r7 != 0) goto L_0x010b
        L_0x00fd:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r9.u(r7)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9.w(r6, r5)
        L_0x010b:
            nI.p r5 = r23.d()
            U0.F1.c(r9, r8, r5)
            androidx.compose.foundation.layout.j r11 = androidx.compose.foundation.layout.C5079j.f18125a
            r5 = 8
            float r8 = (float) r5
            float r9 = c2.h.B(r8)
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r5 = TC.e.i(r7)
            r6 = 0
            r14 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.J.h(r5, r6, r10, r14)
            Yp.b0$b r6 = new Yp.b0$b
            r6.<init>(r3)
            r3 = -953228676(0xffffffffc72ee27c, float:-44770.484)
            r14 = 54
            c1.a r17 = c1.c.e(r3, r10, r6, r15, r14)
            r20 = 3072(0xc00, float:4.305E-42)
            r21 = 8156(0x1fdc, float:1.1429E-41)
            r6 = 0
            r3 = 0
            r10 = r7
            r7 = r3
            r3 = 0
            r24 = r8
            r8 = r3
            r3 = 0
            r25 = r10
            r10 = r3
            r26 = r11
            r11 = r3
            r3 = 0
            r27 = r12
            r12 = r3
            r13 = r3
            r3 = 0
            r14 = r3
            r29 = r15
            r15 = r3
            r16 = 0
            r19 = 196608(0x30000, float:2.75506E-40)
            r3 = r4
            r18 = r29
            x0.m.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r4 = 3
            r6 = r25
            r5 = 0
            r7 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.J.C(r6, r7, r5, r4, r7)
            i1.c r6 = r22.b()
            r7 = r26
            androidx.compose.ui.d r8 = r7.a(r4, r6)
            r4 = 24
            float r4 = (float) r4
            float r12 = c2.h.B(r4)
            r13 = 7
            r14 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.m(r8, r9, r10, r11, r12, r13, r14)
            r6 = 16
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            A0.f r6 = A0.g.e(r6)
            androidx.compose.ui.d r7 = m1.e.a(r4, r6)
            tK.v r4 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            r13 = r29
            tK.h r4 = r4.a(r13, r6)
            long r14 = r4.x0()
            r20 = 14
            r21 = 0
            r16 = 1056293519(0x3ef5c28f, float:0.48)
            r17 = 0
            r18 = 0
            r19 = 0
            long r8 = p1.C5747v0.o(r14, r16, r17, r18, r19, r20, r21)
            r11 = 2
            r12 = 0
            r10 = 0
            androidx.compose.ui.d r4 = androidx.compose.foundation.b.d(r7, r8, r10, r11, r12)
            float r6 = c2.h.B(r24)
            r7 = 2
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            androidx.compose.ui.d r4 = androidx.compose.foundation.layout.D.j(r4, r6, r7)
            androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$f r6 = r6.b()
            i1.c$c r7 = r22.i()
            r8 = 54
            E1.I r6 = androidx.compose.foundation.layout.G.b(r6, r7, r13, r8)
            int r7 = U0.C4883j.a(r13, r5)
            U0.y r8 = r13.s()
            androidx.compose.ui.d r4 = androidx.compose.ui.c.e(r13, r4)
            nI.a r9 = r23.a()
            U0.f r10 = r13.m()
            if (r10 != 0) goto L_0x01eb
            U0.C4883j.c()
        L_0x01eb:
            r13.I()
            boolean r10 = r13.i()
            if (r10 == 0) goto L_0x01f8
            r13.p(r9)
            goto L_0x01fb
        L_0x01f8:
            r13.t()
        L_0x01fb:
            U0.m r9 = U0.F1.a(r13)
            nI.p r10 = r23.c()
            U0.F1.c(r9, r6, r10)
            nI.p r6 = r23.e()
            U0.F1.c(r9, r8, r6)
            nI.p r6 = r23.b()
            boolean r8 = r9.i()
            if (r8 != 0) goto L_0x0225
            java.lang.Object r8 = r9.D()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
            boolean r8 = kotlin.jvm.internal.C17542s.e(r8, r10)
            if (r8 != 0) goto L_0x0233
        L_0x0225:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9.u(r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9.w(r7, r6)
        L_0x0233:
            nI.p r6 = r23.d()
            U0.F1.c(r9, r4, r6)
            s0.N r4 = s0.C5843N.f28726a
            i(r3, r13, r5)
            r13.x()
            r13.x()
            boolean r3 = U0.C4895p.J()
            if (r3 == 0) goto L_0x024e
            U0.C4895p.R()
        L_0x024e:
            r6 = r27
        L_0x0250:
            U0.Y0 r3 = r13.n()
            if (r3 == 0) goto L_0x025e
            Yp.V r4 = new Yp.V
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x025e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yp.b0.p(KJ.c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N q(C15987c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        p(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int r(List list) {
        return list.size();
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void s(aq.e.c r31, androidx.compose.ui.d r32, U0.C4889m r33, int r34, int r35) {
        /*
            r0 = r31
            r1 = r34
            r2 = r35
            r3 = 2080385318(0x7c002926, float:2.6617943E36)
            r4 = r33
            U0.m r14 = r4.k(r3)
            r4 = r2 & 1
            if (r4 == 0) goto L_0x0016
            r4 = r1 | 6
            goto L_0x0026
        L_0x0016:
            r4 = r1 & 6
            if (r4 != 0) goto L_0x0025
            boolean r4 = r14.F(r0)
            if (r4 == 0) goto L_0x0022
            r4 = 4
            goto L_0x0023
        L_0x0022:
            r4 = 2
        L_0x0023:
            r4 = r4 | r1
            goto L_0x0026
        L_0x0025:
            r4 = r1
        L_0x0026:
            r5 = r2 & 2
            if (r5 == 0) goto L_0x002f
            r4 = r4 | 48
        L_0x002c:
            r6 = r32
            goto L_0x0041
        L_0x002f:
            r6 = r1 & 48
            if (r6 != 0) goto L_0x002c
            r6 = r32
            boolean r7 = r14.V(r6)
            if (r7 == 0) goto L_0x003e
            r7 = 32
            goto L_0x0040
        L_0x003e:
            r7 = 16
        L_0x0040:
            r4 = r4 | r7
        L_0x0041:
            r7 = r4 & 19
            r8 = 18
            if (r7 != r8) goto L_0x0054
            boolean r7 = r14.l()
            if (r7 != 0) goto L_0x004e
            goto L_0x0054
        L_0x004e:
            r14.L()
            r3 = r14
            goto L_0x00cf
        L_0x0054:
            if (r5 == 0) goto L_0x005a
            androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
            r15 = r5
            goto L_0x005b
        L_0x005a:
            r15 = r6
        L_0x005b:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x0067
            r5 = -1
            java.lang.String r6 = "com.ingka.ikea.discover.impl.ui.Teaser (StoryComposables.kt:329)"
            U0.C4895p.S(r3, r4, r5, r6)
        L_0x0067:
            java.lang.String r4 = r31.b()
            TC.b$a$d r5 = TC.C13679b.a.d.f116682a
            aq.c r3 = r31.c()
            r6 = 0
            long r7 = C(r3, r14, r6)
            r3 = 0
            r9 = 0
            r10 = 1
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.d(r15, r3, r10, r9)
            aq.c r3 = r31.a()
            long r17 = C(r3, r14, r6)
            r20 = 2
            r21 = 0
            r19 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.b.d(r16, r17, r19, r20, r21)
            r6 = 48
            float r6 = (float) r6
            float r6 = c2.h.B(r6)
            androidx.compose.ui.d r6 = androidx.compose.foundation.layout.D.i(r3, r6)
            r28 = 0
            r29 = 262128(0x3fff0, float:3.6732E-40)
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 0
            r3 = r14
            r30 = r15
            r14 = r16
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r27 = 48
            r26 = r3
            SC.C13607l.j(r4, r5, r6, r7, r9, r11, r12, r13, r14, r16, r17, r18, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x00cd
            U0.C4895p.R()
        L_0x00cd:
            r6 = r30
        L_0x00cf:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x00dd
            Yp.Z r4 = new Yp.Z
            r4.<init>(r0, r6, r1, r2)
            r3.a(r4)
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Yp.b0.s(aq.e$c, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N t(e.c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        s(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final boolean z(C4889m mVar, int i10) {
        mVar.W(-984174042);
        if (C4895p.J()) {
            C4895p.S(-984174042, i10, -1, "com.ingka.ikea.discover.impl.ui.isLandscape (StoryComposables.kt:110)");
        }
        boolean z10 = ((Configuration) mVar.Q(AndroidCompositionLocals_androidKt.f())).orientation == 2;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return z10;
    }
}
