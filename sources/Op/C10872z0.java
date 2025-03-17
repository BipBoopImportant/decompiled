package Op;

import A0.g;
import E1.C4478k;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import J1.j;
import KJ.C15987c;
import L1.x;
import LC.C13178b;
import O0.V;
import Op.C10828d;
import Op.c1;
import QJ.Q;
import SC.B;
import SC.E;
import SC.F;
import SC.K2;
import SC.P1;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16795B;
import XH.C16807N;
import XH.t;
import XH.v;
import XH.y;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.core.model.Link;
import dI.C17164e;
import eI.C17187b;
import gs.e;
import i1.C5437c;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import p1.C5747v0;
import p1.i1;
import s0.C5834E;
import s0.C5843N;
import s0.C5844O;
import s0.C5857c;
import s0.C5861g;
import s0.C5862h;
import t1.C5942c;
import tK.C18030v;
import uK.C18146a;
import x0.C6230C;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\u001a§\u0001\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0001\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b \u0010!\u001ac\u0010#\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0001\u0010%\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b%\u0010&\u001aI\u0010(\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b(\u0010)\u001a;\u0010+\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00002\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040\u0016H\u0003¢\u0006\u0004\b+\u0010,\u001a7\u00102\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b2\u00103\u001aq\u00109\u001a\u00020\u00042\f\u00106\u001a\b\u0012\u0004\u0012\u000205042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00162\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00142\b\b\u0002\u00108\u001a\u000207H\u0001¢\u0006\u0004\b9\u0010:\u001a#\u0010<\u001a\u00020\u0004*\u00020;2\u0006\u00108\u001a\u0002072\u0006\u0010\u0015\u001a\u00020\u0014H\u0003¢\u0006\u0004\b<\u0010=\u001a\u0017\u0010>\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0003¢\u0006\u0004\b>\u0010?\u001a%\u0010C\u001a\u00020\u00042\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@042\u0006\u0010B\u001a\u00020\u0006H\u0001¢\u0006\u0004\bC\u0010D\u001a\u000f\u0010E\u001a\u00020\u0004H\u0003¢\u0006\u0004\bE\u0010F¨\u0006I²\u0006\u000e\u0010H\u001a\u00020G8\n@\nX\u0002"}, d2 = {"LOp/d1;", "productItem", "Lkotlin/Function1;", "LOp/c1;", "LXH/N;", "eventHandler", "", "isCompactDesign", "Landroidx/compose/ui/d;", "modifier", "LSC/P1;", "size", "LLC/b;", "requestImageSize", "Ls0/E;", "itemPadding", "contentPadding", "isColumnLayout", "LA0/f;", "imageShape", "LOp/A;", "pagingIndicatorType", "Lkotlin/Function0;", "onUserSwipedContextualImage", "onUserHasSeenNudge", "y0", "(LOp/d1;LnI/l;ZLandroidx/compose/ui/d;LSC/P1;LLC/b;Ls0/E;Ls0/E;ZLA0/f;LOp/A;LnI/a;LnI/a;LU0/m;III)V", "uiModel", "q0", "(LOp/d1;LnI/l;ZLA0/f;Ls0/E;Ls0/E;LOp/A;LnI/a;LnI/a;Landroidx/compose/ui/d;LSC/P1;LLC/b;LU0/m;III)V", "LIC/e;", "offerValidUntil", "j0", "(LIC/e;Landroidx/compose/ui/d;LU0/m;II)V", "addToFavouritesLambda", "P", "(LOp/d1;LnI/a;ZLLC/b;LA0/f;LOp/A;LnI/a;LnI/a;LU0/m;I)V", "d0", "(LOp/d1;LnI/l;ZLA0/f;Ls0/E;LOp/A;LnI/a;LnI/a;Landroidx/compose/ui/d;LSC/P1;LLC/b;LU0/m;III)V", "energyLabelLambda", "Z", "(ZLOp/d1;LnI/a;LSC/P1;LnI/l;LU0/m;I)V", "addToCartLambda", "I", "(LOp/d1;LnI/a;ZLnI/a;LU0/m;I)V", "LOp/x;", "favouritesState", "", "productName", "onClick", "K", "(LOp/x;Ljava/lang/String;LnI/a;Landroidx/compose/ui/d;LU0/m;II)V", "LKJ/c;", "LOp/d$m;", "images", "Lx0/C;", "pagerState", "R", "(LKJ/c;Landroidx/compose/ui/d;LLC/b;LnI/a;LnI/a;LA0/f;LOp/A;Lx0/C;LU0/m;II)V", "Ls0/c;", "n0", "(Ls0/c;Lx0/C;LOp/A;LU0/m;I)V", "l0", "(Lx0/C;LU0/m;I)V", "LOp/d$f;", "availability", "useSmallSkapaStatus", "N", "(LKJ/c;ZLU0/m;I)V", "D0", "(LU0/m;I)V", "", "previousPage", "product_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Op.z0  reason: case insensitive filesystem */
public final class C10872z0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.z0$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10867x f85359a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f85360b;

        a(C10867x xVar, String str) {
            this.f85359a = xVar;
            this.f85360b = str;
        }

        public final void a(C4889m mVar, int i10) {
            v vVar;
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-921156301, i10, -1, "com.ingka.ikea.design.ui.product.AddToFavourites.<anonymous> (ProductItemComposable.kt:510)");
                }
                if (this.f85359a.b()) {
                    mVar.W(-1960019152);
                    vVar = new v(Integer.valueOf(C18146a.f147965A5), C5747v0.k(C18030v.f147664a.a(mVar, C18030v.f147665b).H()));
                    mVar.P();
                } else {
                    mVar.W(-1959852341);
                    vVar = new v(Integer.valueOf(C18146a.f148740z5), C5747v0.k(C18030v.f147664a.a(mVar, C18030v.f147665b).x0()));
                    mVar.P();
                }
                int intValue = ((Number) vVar.a()).intValue();
                long y10 = ((C5747v0) vVar.b()).y();
                C5942c c10 = J1.e.c(intValue, mVar, 0);
                String lowerCase = j.c(Oo.b.f84621e, new Object[]{this.f85360b}, mVar, 0).toLowerCase(Locale.ROOT);
                C17542s.i(lowerCase, "toLowerCase(...)");
                V.a(c10, lowerCase, J.t(androidx.compose.ui.d.f18749a, h.B((float) 24)), y10, mVar, 384, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.design.ui.product.ProductItemComposableKt$ImageSection$4$1", f = "ProductItemComposable.kt", l = {568}, m = "invokeSuspend")
    /* renamed from: Op.z0$b */
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85361c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f85362d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85363e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C4894o0 f85364f;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newPage", "LXH/N;", "<anonymous>", "(I)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.ingka.ikea.design.ui.product.ProductItemComposableKt$ImageSection$4$1$2", f = "ProductItemComposable.kt", l = {}, m = "invokeSuspend")
        /* renamed from: Op.z0$b$a */
        static final class a extends l implements p<Integer, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f85365c;

            /* renamed from: d  reason: collision with root package name */
            /* synthetic */ int f85366d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ C17631a<C16807N> f85367e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ C4894o0 f85368f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C17631a<C16807N> aVar, C4894o0 o0Var, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f85367e = aVar;
                this.f85368f = o0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                a aVar = new a(this.f85367e, this.f85368f, eVar);
                aVar.f85366d = ((Number) obj).intValue();
                return aVar;
            }

            public final Object i(int i10, C17164e<? super C16807N> eVar) {
                return ((a) create(Integer.valueOf(i10), eVar)).invokeSuspend(C16807N.f139792a);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return i(((Number) obj).intValue(), (C17164e) obj2);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f85365c == 0) {
                    y.b(obj);
                    int i10 = this.f85366d;
                    if (i10 != C10872z0.V(this.f85368f)) {
                        C10872z0.W(this.f85368f, i10);
                        this.f85367e.invoke();
                    }
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(C6230C c10, C17631a<C16807N> aVar, C4894o0 o0Var, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f85362d = c10;
            this.f85363e = aVar;
            this.f85364f = o0Var;
        }

        /* access modifiers changed from: private */
        public static final int j(C6230C c10) {
            return c10.R();
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f85362d, this.f85363e, this.f85364f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f85361c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new A0(this.f85362d));
                a aVar = new a(this.f85363e, this.f85364f, (C17164e<? super a>) null);
                this.f85361c = 1;
                if (C16534i.j(r10, aVar, this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.z0$c */
    static final class c implements r<x0.v, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<C10828d.m> f85369a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ A0.f f85370b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C13178b f85371c;

        c(C15987c<? extends C10828d.m> cVar, A0.f fVar, C13178b bVar) {
            this.f85369a = cVar;
            this.f85370b = fVar;
            this.f85371c = bVar;
        }

        public final void a(x0.v vVar, int i10, C4889m mVar, int i11) {
            float f10;
            C17542s.j(vVar, "$this$HorizontalPager");
            if (C4895p.J()) {
                C4895p.S(-134936487, i11, -1, "com.ingka.ikea.design.ui.product.ImageSection.<anonymous>.<anonymous> (ProductItemComposable.kt:583)");
            }
            C10828d.m mVar2 = this.f85369a.get(i10);
            A0.f fVar = this.f85370b;
            if (fVar == null) {
                if (mVar2 instanceof C10828d.m.b) {
                    f10 = h.B((float) 8);
                } else if (mVar2 instanceof C10828d.m.a) {
                    f10 = h.B((float) 0);
                } else {
                    throw new t();
                }
                fVar = g.e(f10);
            }
            String b10 = mVar2.a().b();
            if (b10 == null) {
                b10 = "";
            }
            LC.h.c(b10, mVar2.a().a(), C5116k1.a(m1.e.a(androidx.compose.ui.d.f18749a, fVar), "IMAGE"), this.f85371c, (e.b) null, C4478k.f5915a.a(), (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, mVar, ImageMetadata.EDGE_MODE, 0, 4048);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            a((x0.v) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @f(c = "com.ingka.ikea.design.ui.product.ProductItemComposableKt$ImageSection$5$2$1", f = "ProductItemComposable.kt", l = {615, 616, 617}, m = "invokeSuspend")
    /* renamed from: Op.z0$d */
    static final class d extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f85372c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C6230C f85373d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f85374e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C6230C c10, C17631a<C16807N> aVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f85373d = c10;
            this.f85374e = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f85373d, this.f85374e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0055 A[RETURN] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = eI.C17187b.f()
                int r1 = r10.f85372c
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L_0x0025
                if (r1 == r4) goto L_0x0021
                if (r1 == r3) goto L_0x001d
                if (r1 != r2) goto L_0x0015
                XH.y.b(r11)
                goto L_0x0056
            L_0x0015:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L_0x001d:
                XH.y.b(r11)
                goto L_0x0045
            L_0x0021:
                XH.y.b(r11)
                goto L_0x003a
            L_0x0025:
                XH.y.b(r11)
                x0.C r11 = r10.f85373d
                r10.f85372c = r4
                r5 = 1120403456(0x42c80000, float:100.0)
                r6 = 0
                r8 = 2
                r9 = 0
                r4 = r11
                r7 = r10
                java.lang.Object r11 = p0.z.b(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L_0x003a
                return r0
            L_0x003a:
                r10.f85372c = r3
                r3 = 750(0x2ee, double:3.705E-321)
                java.lang.Object r11 = QJ.C16297b0.b(r3, r10)
                if (r11 != r0) goto L_0x0045
                return r0
            L_0x0045:
                x0.C r3 = r10.f85373d
                r10.f85372c = r2
                r4 = -1027080192(0xffffffffc2c80000, float:-100.0)
                r5 = 0
                r7 = 2
                r8 = 0
                r6 = r10
                java.lang.Object r11 = p0.z.b(r3, r4, r5, r6, r7, r8)
                if (r11 != r0) goto L_0x0056
                return r0
            L_0x0056:
                nI.a<XH.N> r11 = r10.f85374e
                r11.invoke()
                XH.N r11 = XH.C16807N.f139792a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: Op.C10872z0.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Op.z0$e */
    public /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f85375a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Op.A[] r0 = Op.A.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Op.A r1 = Op.A.DOT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Op.A r1 = Op.A.NUDGE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Op.A r1 = Op.A.DISABLED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f85375a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Op.C10872z0.e.<clinit>():void");
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N A0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B0(x xVar) {
        C17542s.j(xVar, "$this$semantics");
        L1.v.A0(xVar, true);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C0(d1 d1Var, C17642l lVar, boolean z10, androidx.compose.ui.d dVar, P1 p12, C13178b bVar, C5834E e10, C5834E e11, boolean z11, A0.f fVar, A a10, C17631a aVar, C17631a aVar2, int i10, int i11, int i12, C4889m mVar, int i13) {
        y0(d1Var, lVar, z10, dVar, p12, bVar, e10, e11, z11, fVar, a10, aVar, aVar2, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    private static final void D0(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(-2023178938);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2023178938, i10, -1, "com.ingka.ikea.design.ui.product.QuantityPicker (ProductItemComposable.kt:706)");
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10833f0(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(int i10, C4889m mVar, int i11) {
        D0(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void I(d1 d1Var, C17631a<C16807N> aVar, boolean z10, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(854580087);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(d1Var) ? 4 : 2) | i12;
        } else {
            d1 d1Var2 = d1Var;
            i11 = i12;
        }
        C17631a<C16807N> aVar3 = aVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar3) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        C17631a<C16807N> aVar4 = aVar2;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(aVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i11 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(854580087, i11, -1, "com.ingka.ikea.design.ui.product.ActionButtons (ProductItemComposable.kt:466)");
            }
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d d10 = J.d(aVar5, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, d10);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar6.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar6.c());
            F1.c(a13, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b10 = aVar6.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            K(d1Var.o(), d1Var.p().e().k(), aVar, (androidx.compose.ui.d) null, k10, (i11 << 3) & 896, 8);
            C5844O.a(C5861g.c(hVar, aVar5, 1.0f, false, 2, (Object) null), k10, 0);
            k10.W(1714496580);
            if (!z11 && d1Var.i() != null) {
                C10865w.h(d1Var.i(), d1Var.p().e().k(), aVar2, (androidx.compose.ui.d) null, k10, (i11 >> 3) & 896, 8);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new Y(d1Var, aVar, z10, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N J(d1 d1Var, C17631a aVar, boolean z10, C17631a aVar2, int i10, C4889m mVar, int i11) {
        I(d1Var, aVar, z10, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void K(Op.C10867x r23, java.lang.String r24, nI.C17631a<XH.C16807N> r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r1 = r23
            r2 = r24
            r12 = r25
            r13 = r28
            java.lang.String r0 = "favouritesState"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            java.lang.String r0 = "productName"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            java.lang.String r0 = "onClick"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            r0 = 728060758(0x2b655356, float:8.1472795E-13)
            r3 = r27
            U0.m r14 = r3.k(r0)
            r3 = r29 & 1
            r4 = 2
            r5 = 4
            if (r3 == 0) goto L_0x0029
            r3 = r13 | 6
            goto L_0x0039
        L_0x0029:
            r3 = r13 & 6
            if (r3 != 0) goto L_0x0038
            boolean r3 = r14.V(r1)
            if (r3 == 0) goto L_0x0035
            r3 = r5
            goto L_0x0036
        L_0x0035:
            r3 = r4
        L_0x0036:
            r3 = r3 | r13
            goto L_0x0039
        L_0x0038:
            r3 = r13
        L_0x0039:
            r6 = r29 & 2
            if (r6 == 0) goto L_0x0040
            r3 = r3 | 48
            goto L_0x0050
        L_0x0040:
            r6 = r13 & 48
            if (r6 != 0) goto L_0x0050
            boolean r6 = r14.V(r2)
            if (r6 == 0) goto L_0x004d
            r6 = 32
            goto L_0x004f
        L_0x004d:
            r6 = 16
        L_0x004f:
            r3 = r3 | r6
        L_0x0050:
            r6 = r29 & 4
            if (r6 == 0) goto L_0x0057
            r3 = r3 | 384(0x180, float:5.38E-43)
            goto L_0x0067
        L_0x0057:
            r6 = r13 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L_0x0067
            boolean r6 = r14.F(r12)
            if (r6 == 0) goto L_0x0064
            r6 = 256(0x100, float:3.59E-43)
            goto L_0x0066
        L_0x0064:
            r6 = 128(0x80, float:1.794E-43)
        L_0x0066:
            r3 = r3 | r6
        L_0x0067:
            r6 = r29 & 8
            if (r6 == 0) goto L_0x0070
            r3 = r3 | 3072(0xc00, float:4.305E-42)
        L_0x006d:
            r7 = r26
            goto L_0x0082
        L_0x0070:
            r7 = r13 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x006d
            r7 = r26
            boolean r8 = r14.V(r7)
            if (r8 == 0) goto L_0x007f
            r8 = 2048(0x800, float:2.87E-42)
            goto L_0x0081
        L_0x007f:
            r8 = 1024(0x400, float:1.435E-42)
        L_0x0081:
            r3 = r3 | r8
        L_0x0082:
            r8 = r3 & 1171(0x493, float:1.641E-42)
            r9 = 1170(0x492, float:1.64E-42)
            if (r8 != r9) goto L_0x0095
            boolean r8 = r14.l()
            if (r8 != 0) goto L_0x008f
            goto L_0x0095
        L_0x008f:
            r14.L()
            r4 = r7
            goto L_0x0155
        L_0x0095:
            if (r6 == 0) goto L_0x009c
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r22 = r6
            goto L_0x009e
        L_0x009c:
            r22 = r7
        L_0x009e:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x00aa
            r6 = -1
            java.lang.String r7 = "com.ingka.ikea.design.ui.product.AddToFavourites (ProductItemComposable.kt:496)"
            U0.C4895p.S(r0, r3, r6, r7)
        L_0x00aa:
            boolean r0 = r23.a()
            if (r0 != 0) goto L_0x00d5
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x00b9
            U0.C4895p.R()
        L_0x00b9:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x00d4
            Op.g0 r8 = new Op.g0
            r0 = r8
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r22
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x00d4:
            return
        L_0x00d5:
            float r0 = (float) r5
            float r18 = c2.h.B(r0)
            float r0 = (float) r4
            float r19 = c2.h.B(r0)
            r20 = 3
            r21 = 0
            r16 = 0
            r17 = 0
            r15 = r22
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.m(r15, r16, r17, r18, r19, r20, r21)
            java.lang.String r4 = "ADD_TO_FAVOURITES"
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r4)
            A0.f r4 = A0.g.h()
            tK.v r5 = tK.C18030v.f147664a
            int r6 = tK.C18030v.f147665b
            tK.h r7 = r5.a(r14, r6)
            long r7 = r7.F0()
            androidx.compose.ui.d r0 = androidx.compose.foundation.b.c(r0, r7, r4)
            r4 = 1
            float r7 = (float) r4
            float r7 = c2.h.B(r7)
            tK.h r5 = r5.a(r14, r6)
            long r5 = r5.z0()
            A0.f r8 = A0.g.h()
            androidx.compose.ui.d r0 = n0.C5599e.g(r0, r7, r5, r8)
            r5 = 40
            float r5 = (float) r5
            float r5 = c2.h.B(r5)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.t(r0, r5)
            Op.z0$a r5 = new Op.z0$a
            r5.<init>(r1, r2)
            r6 = 54
            r7 = -921156301(0xffffffffc9184533, float:-623699.2)
            c1.a r8 = c1.c.e(r7, r4, r5, r14, r6)
            int r3 = r3 >> 6
            r3 = r3 & 14
            r4 = 196608(0x30000, float:2.75506E-40)
            r10 = r3 | r4
            r11 = 28
            r5 = 0
            r6 = 0
            r7 = 0
            r3 = r25
            r4 = r0
            r9 = r14
            O0.U.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0153
            U0.C4895p.R()
        L_0x0153:
            r4 = r22
        L_0x0155:
            U0.Y0 r7 = r14.n()
            if (r7 == 0) goto L_0x016e
            Op.h0 r8 = new Op.h0
            r0 = r8
            r1 = r23
            r2 = r24
            r3 = r25
            r5 = r28
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x016e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.C10872z0.K(Op.x, java.lang.String, nI.a, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N L(C10867x xVar, String str, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        K(xVar, str, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(C10867x xVar, String str, C17631a aVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        K(xVar, str, aVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void N(C15987c<C10828d.f> cVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C17542s.j(cVar, "availability");
        C4889m k10 = mVar.k(749218645);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.b(z10) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(749218645, i12, -1, "com.ingka.ikea.design.ui.product.AvailabilitySection (ProductItemComposable.kt:681)");
            }
            for (C10828d.f fVar : cVar) {
                d.a aVar = androidx.compose.ui.d.f18749a;
                float f10 = (float) 8;
                androidx.compose.ui.d k11 = D.k(aVar, 0.0f, h.B(f10), 1, (Object) null);
                I b10 = G.b(C5073d.f18068a.n(h.B(f10)), C5437c.f24302a.i(), k10, 54);
                int a10 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, k11);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar2.a();
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
                F1.c(a12, b10, aVar2.c());
                F1.c(a12, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b11 = aVar2.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b11);
                }
                F1.c(a12, e10, aVar2.d());
                C5843N n10 = C5843N.f28726a;
                k10.W(2105220720);
                if (fVar.a() != null) {
                    V.a(J1.e.c(fVar.a().intValue(), k10, 0), (String) null, J.t(aVar, h.B((float) 24)), 0, k10, 432, 8);
                }
                k10.P();
                K2.d(fVar.b().a(k10, C13023e.f110931a), fVar.c(), (androidx.compose.ui.d) null, z10, k10, (i12 << 6) & 7168, 4);
                k10.x();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C10851o0(cVar, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N O(C15987c cVar, boolean z10, int i10, C4889m mVar, int i11) {
        N(cVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void P(d1 d1Var, C17631a<C16807N> aVar, boolean z10, C13178b bVar, A0.f fVar, A a10, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        boolean z11 = z10;
        int i12 = i10;
        C4889m k10 = mVar.k(-1712879425);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(d1Var) ? 4 : 2) | i12;
        } else {
            d1 d1Var2 = d1Var;
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar) ? 32 : 16;
        } else {
            C17631a<C16807N> aVar4 = aVar;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.b(z11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(bVar) ? RecyclerView.n.FLAG_MOVED : 1024;
        } else {
            C13178b bVar2 = bVar;
        }
        if ((i12 & 24576) == 0) {
            i11 |= k10.V(fVar) ? 16384 : 8192;
        } else {
            A0.f fVar2 = fVar;
        }
        if ((196608 & i12) == 0) {
            i11 |= k10.V(a10) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        } else {
            A a11 = a10;
        }
        C17631a<C16807N> aVar5 = aVar2;
        if ((1572864 & i12) == 0) {
            i11 |= k10.F(aVar5) ? ImageMetadata.SHADING_MODE : ImageMetadata.LENS_APERTURE;
        }
        C17631a<C16807N> aVar6 = aVar3;
        if ((12582912 & i12) == 0) {
            i11 |= k10.F(aVar6) ? 8388608 : 4194304;
        }
        if ((4793491 & i11) != 4793490 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1712879425, i11, -1, "com.ingka.ikea.design.ui.product.ImageBadgeAndAddToFavouritesSection (ProductItemComposable.kt:300)");
            }
            d.a aVar7 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = J.h(aVar7, 0.0f, 1, (Object) null);
            C5437c.a aVar8 = C5437c.f24302a;
            I h11 = C5077h.h(aVar8.o(), false);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, h10);
            C4504g.a aVar9 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar9.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, h11, aVar9.c());
            F1.c(a14, s10, aVar9.e());
            p<C4504g, Integer, C16807N> b10 = aVar9.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar9.d());
            C5079j jVar = C5079j.f18125a;
            float f10 = (float) 8;
            int i13 = i11 >> 9;
            int i14 = i11 << 3;
            R(d1Var.p().d(), D.m(aVar7, 0.0f, 0.0f, 0.0f, h.B(f10), 7, (Object) null), bVar, aVar2, aVar3, fVar, a10, (C6230C) null, k10, (i13 & 7168) | ((i11 >> 3) & 896) | 48 | (57344 & i13) | (458752 & i14) | (3670016 & i14), 128);
            k10.W(-1261054011);
            if (!z11 && d1Var.p().h() != null) {
                C10824b.b(d1Var.p().h(), jVar.a(aVar7, aVar8.o()), k10, 0, 0);
            }
            k10.P();
            K(d1Var.o(), d1Var.p().e().k(), aVar, D.m(jVar.a(aVar7, aVar8.c()), 0.0f, 0.0f, 0.0f, h.B(f10), 7, (Object) null), k10, i14 & 896, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new Z(d1Var, aVar, z10, bVar, fVar, a10, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N Q(d1 d1Var, C17631a aVar, boolean z10, C13178b bVar, A0.f fVar, A a10, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        P(d1Var, aVar, z10, bVar, fVar, a10, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: androidx.compose.ui.d$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:233:0x04cf  */
    /* JADX WARNING: Removed duplicated region for block: B:237:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0114  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(KJ.C15987c<? extends Op.C10828d.m> r36, androidx.compose.ui.d r37, LC.C13178b r38, nI.C17631a<XH.C16807N> r39, nI.C17631a<XH.C16807N> r40, A0.f r41, Op.A r42, x0.C6230C r43, U0.C4889m r44, int r45, int r46) {
        /*
            r1 = r36
            r9 = r45
            r10 = r46
            r3 = 8
            r4 = 16
            r5 = 32
            r6 = 6
            r7 = 128(0x80, float:1.794E-43)
            java.lang.String r8 = "images"
            kotlin.jvm.internal.C17542s.j(r1, r8)
            r8 = 1578433701(0x5e14fca5, float:2.68390926E18)
            r11 = r44
            U0.m r15 = r11.k(r8)
            int r11 = r15.a()
            r14 = 1
            r12 = r10 & 1
            r13 = 2
            r0 = 4
            if (r12 == 0) goto L_0x002b
            r12 = r9 | 6
            goto L_0x003b
        L_0x002b:
            r12 = r9 & 6
            if (r12 != 0) goto L_0x003a
            boolean r12 = r15.V(r1)
            if (r12 == 0) goto L_0x0037
            r12 = r0
            goto L_0x0038
        L_0x0037:
            r12 = r13
        L_0x0038:
            r12 = r12 | r9
            goto L_0x003b
        L_0x003a:
            r12 = r9
        L_0x003b:
            r16 = r10 & 2
            if (r16 == 0) goto L_0x0044
            r12 = r12 | 48
            r6 = r37
            goto L_0x0057
        L_0x0044:
            r17 = r9 & 48
            r6 = r37
            if (r17 != 0) goto L_0x0057
            boolean r17 = r15.V(r6)
            if (r17 == 0) goto L_0x0053
            r17 = r5
            goto L_0x0055
        L_0x0053:
            r17 = r4
        L_0x0055:
            r12 = r12 | r17
        L_0x0057:
            r2 = r9 & 384(0x180, float:5.38E-43)
            if (r2 != 0) goto L_0x0071
            r2 = r10 & 4
            if (r2 != 0) goto L_0x006a
            r2 = r38
            boolean r18 = r15.F(r2)
            if (r18 == 0) goto L_0x006c
            r18 = 256(0x100, float:3.59E-43)
            goto L_0x006e
        L_0x006a:
            r2 = r38
        L_0x006c:
            r18 = r7
        L_0x006e:
            r12 = r12 | r18
            goto L_0x0073
        L_0x0071:
            r2 = r38
        L_0x0073:
            r18 = r10 & 8
            if (r18 == 0) goto L_0x007c
            r12 = r12 | 3072(0xc00, float:4.305E-42)
        L_0x0079:
            r13 = r39
            goto L_0x008f
        L_0x007c:
            r13 = r9 & 3072(0xc00, float:4.305E-42)
            if (r13 != 0) goto L_0x0079
            r13 = r39
            boolean r20 = r15.F(r13)
            if (r20 == 0) goto L_0x008b
            r20 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r20 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r12 = r12 | r20
        L_0x008f:
            r4 = r4 & r10
            if (r4 == 0) goto L_0x0097
            r12 = r12 | 24576(0x6000, float:3.4438E-41)
        L_0x0094:
            r13 = r40
            goto L_0x00aa
        L_0x0097:
            r13 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r13 != 0) goto L_0x0094
            r13 = r40
            boolean r21 = r15.F(r13)
            if (r21 == 0) goto L_0x00a6
            r21 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a8
        L_0x00a6:
            r21 = 8192(0x2000, float:1.14794E-41)
        L_0x00a8:
            r12 = r12 | r21
        L_0x00aa:
            r5 = r5 & r10
            r21 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00b4
            r12 = r12 | r21
            r3 = r41
            goto L_0x00c7
        L_0x00b4:
            r22 = r9 & r21
            r3 = r41
            if (r22 != 0) goto L_0x00c7
            boolean r23 = r15.V(r3)
            if (r23 == 0) goto L_0x00c3
            r23 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c5
        L_0x00c3:
            r23 = 65536(0x10000, float:9.18355E-41)
        L_0x00c5:
            r12 = r12 | r23
        L_0x00c7:
            r23 = r10 & 64
            r24 = 1572864(0x180000, float:2.204052E-39)
            if (r23 == 0) goto L_0x00d2
            r12 = r12 | r24
            r8 = r42
            goto L_0x00e5
        L_0x00d2:
            r24 = r9 & r24
            r8 = r42
            if (r24 != 0) goto L_0x00e5
            boolean r25 = r15.V(r8)
            if (r25 == 0) goto L_0x00e1
            r25 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e3
        L_0x00e1:
            r25 = 524288(0x80000, float:7.34684E-40)
        L_0x00e3:
            r12 = r12 | r25
        L_0x00e5:
            r29 = 12582912(0xc00000, float:1.7632415E-38)
            r25 = r9 & r29
            if (r25 != 0) goto L_0x0101
            r13 = r10 & 128(0x80, float:1.794E-43)
            if (r13 != 0) goto L_0x00fa
            r13 = r43
            boolean r26 = r15.V(r13)
            if (r26 == 0) goto L_0x00fc
            r26 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fe
        L_0x00fa:
            r13 = r43
        L_0x00fc:
            r26 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fe:
            r12 = r12 | r26
            goto L_0x0103
        L_0x0101:
            r13 = r43
        L_0x0103:
            r26 = 4793491(0x492493, float:6.717112E-39)
            r7 = r12 & r26
            r0 = 4793490(0x492492, float:6.71711E-39)
            if (r7 != r0) goto L_0x0126
            boolean r0 = r15.l()
            if (r0 != 0) goto L_0x0114
            goto L_0x0126
        L_0x0114:
            r15.L()
            r4 = r39
            r5 = r40
            r7 = r8
            r8 = r13
            r9 = r15
            r35 = r3
            r3 = r2
            r2 = r6
            r6 = r35
            goto L_0x04c9
        L_0x0126:
            r15.G()
            r0 = r9 & 1
            r7 = -29360129(0xfffffffffe3fffff, float:-6.380294E37)
            if (r0 == 0) goto L_0x0156
            boolean r0 = r15.O()
            if (r0 == 0) goto L_0x0137
            goto L_0x0156
        L_0x0137:
            r15.L()
            r0 = 4
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0140
            r12 = r12 & -897(0xfffffffffffffc7f, float:NaN)
        L_0x0140:
            r0 = 128(0x80, float:1.794E-43)
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0146
            r12 = r12 & r7
        L_0x0146:
            r4 = r39
            r5 = r40
            r7 = r8
            r0 = r12
            r8 = r43
            r35 = r3
            r3 = r2
            r2 = r6
            r6 = r35
            goto L_0x020f
        L_0x0156:
            if (r16 == 0) goto L_0x015b
            androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
            r6 = r0
        L_0x015b:
            r0 = 4
            r16 = r10 & 4
            if (r16 == 0) goto L_0x016a
            LC.b$b r0 = new LC.b$b
            gs.h$a r2 = gs.h.a.XXXS
            r0.<init>(r2)
            r12 = r12 & -897(0xfffffffffffffc7f, float:NaN)
            goto L_0x016b
        L_0x016a:
            r0 = r2
        L_0x016b:
            if (r18 == 0) goto L_0x018d
            r2 = 1330452226(0x4f4d1702, float:3.44083712E9)
            r15.W(r2)
            java.lang.Object r2 = r15.D()
            U0.m$a r16 = U0.C4889m.f14007a
            java.lang.Object r13 = r16.a()
            if (r2 != r13) goto L_0x0187
            Op.i0 r2 = new Op.i0
            r2.<init>()
            r15.u(r2)
        L_0x0187:
            nI.a r2 = (nI.C17631a) r2
            r15.P()
            goto L_0x018f
        L_0x018d:
            r2 = r39
        L_0x018f:
            if (r4 == 0) goto L_0x01b1
            r4 = 1330453538(0x4f4d1c22, float:3.44117299E9)
            r15.W(r4)
            java.lang.Object r4 = r15.D()
            U0.m$a r13 = U0.C4889m.f14007a
            java.lang.Object r13 = r13.a()
            if (r4 != r13) goto L_0x01ab
            Op.j0 r4 = new Op.j0
            r4.<init>()
            r15.u(r4)
        L_0x01ab:
            nI.a r4 = (nI.C17631a) r4
            r15.P()
            goto L_0x01b3
        L_0x01b1:
            r4 = r40
        L_0x01b3:
            if (r5 == 0) goto L_0x01b6
            r3 = 0
        L_0x01b6:
            if (r23 == 0) goto L_0x01bd
            Op.A r5 = Op.A.DISABLED
        L_0x01ba:
            r8 = 128(0x80, float:1.794E-43)
            goto L_0x01bf
        L_0x01bd:
            r5 = r8
            goto L_0x01ba
        L_0x01bf:
            r8 = r8 & r10
            if (r8 == 0) goto L_0x020c
            r8 = 1330459471(0x4f4d334f, float:3.44269184E9)
            r15.W(r8)
            r8 = r12 & 14
            r13 = 4
            if (r8 != r13) goto L_0x01cf
            r8 = r14
            goto L_0x01d0
        L_0x01cf:
            r8 = 0
        L_0x01d0:
            java.lang.Object r13 = r15.D()
            if (r8 != 0) goto L_0x01de
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r13 != r8) goto L_0x01e6
        L_0x01de:
            Op.k0 r13 = new Op.k0
            r13.<init>(r1)
            r15.u(r13)
        L_0x01e6:
            r8 = r13
            nI.a r8 = (nI.C17631a) r8
            r15.P()
            r13 = 0
            r16 = 3
            r23 = 0
            r26 = 0
            r37 = r23
            r38 = r26
            r39 = r8
            r40 = r15
            r41 = r13
            r42 = r16
            x0.C r8 = x0.C6231D.k(r37, r38, r39, r40, r41, r42)
            r12 = r12 & r7
        L_0x0204:
            r7 = r5
            r5 = r4
            r4 = r2
            r2 = r6
            r6 = r3
            r3 = r0
            r0 = r12
            goto L_0x020f
        L_0x020c:
            r8 = r43
            goto L_0x0204
        L_0x020f:
            r15.y()
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x0221
            r12 = -1
            java.lang.String r13 = "com.ingka.ikea.design.ui.product.ImageSection (ProductItemComposable.kt:543)"
            r14 = 1578433701(0x5e14fca5, float:2.68390926E18)
            U0.C4895p.S(r14, r0, r12, r13)
        L_0x0221:
            int r12 = r36.size()
            r13 = 1
            if (r12 != r13) goto L_0x02ae
            r11 = -1705360537(0xffffffff9a5a4367, float:-4.513579E-23)
            r15.W(r11)
            java.lang.Object r11 = YH.C16877v.w0(r36)
            Op.d$m r11 = (Op.C10828d.m) r11
            if (r6 != 0) goto L_0x0257
            boolean r12 = r11 instanceof Op.C10828d.m.b
            if (r12 == 0) goto L_0x0242
            r12 = 8
            float r12 = (float) r12
            float r12 = c2.h.B(r12)
            goto L_0x024c
        L_0x0242:
            boolean r12 = r11 instanceof Op.C10828d.m.a
            if (r12 == 0) goto L_0x0251
            r12 = 0
            float r13 = (float) r12
            float r12 = c2.h.B(r13)
        L_0x024c:
            A0.f r12 = A0.g.e(r12)
            goto L_0x0258
        L_0x0251:
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x0257:
            r12 = r6
        L_0x0258:
            Op.d$d r13 = r11.a()
            java.lang.String r13 = r13.b()
            if (r13 != 0) goto L_0x0264
            java.lang.String r13 = ""
        L_0x0264:
            Op.d$d r11 = r11.a()
            java.lang.String r14 = r11.a()
            r44 = r15
            r9 = 0
            r10 = 0
            r11 = 2
            r15 = 1065353216(0x3f800000, float:1.0)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.C5074e.b(r2, r15, r10, r11, r9)
            androidx.compose.ui.d r9 = m1.e.a(r9, r12)
            java.lang.String r10 = "IMAGE"
            androidx.compose.ui.d r9 = androidx.compose.ui.platform.C5116k1.a(r9, r10)
            E1.k$a r10 = E1.C4478k.f5915a
            E1.k r16 = r10.a()
            r10 = 3
            int r0 = r0 << r10
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r24 = r0 | r21
            r25 = 0
            r26 = 4048(0xfd0, float:5.672E-42)
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r11 = r13
            r12 = r14
            r13 = r9
            r14 = r3
            r9 = r44
            r23 = r9
            LC.h.c(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r9.P()
            goto L_0x04c0
        L_0x02ae:
            r9 = r15
            r10 = -1704612879(0xffffffff9a65abf1, float:-4.7494983E-23)
            r9.W(r10)
            r10 = 1330484566(0x4f4d9556, float:3.44911616E9)
            r9.W(r10)
            java.lang.Object r10 = r9.D()
            U0.m$a r31 = U0.C4889m.f14007a
            java.lang.Object r12 = r31.a()
            if (r10 != r12) goto L_0x02d2
            int r10 = r8.v()
            U0.o0 r10 = U0.C4877g1.a(r10)
            r9.u(r10)
        L_0x02d2:
            U0.o0 r10 = (U0.C4894o0) r10
            r9.P()
            r12 = 1330487686(0x4f4da186, float:3.44991488E9)
            r9.W(r12)
            r12 = 29360128(0x1c00000, float:7.052966E-38)
            r12 = r12 & r0
            r15 = r12 ^ r29
            r13 = 8388608(0x800000, float:1.17549435E-38)
            if (r15 <= r13) goto L_0x02ec
            boolean r12 = r9.V(r8)
            if (r12 != 0) goto L_0x02f0
        L_0x02ec:
            r12 = r0 & r29
            if (r12 != r13) goto L_0x02f2
        L_0x02f0:
            r12 = 1
            goto L_0x02f3
        L_0x02f2:
            r12 = 0
        L_0x02f3:
            r14 = r0 & 7168(0x1c00, float:1.0045E-41)
            r13 = 2048(0x800, float:2.87E-42)
            if (r14 != r13) goto L_0x02fb
            r13 = 1
            goto L_0x02fc
        L_0x02fb:
            r13 = 0
        L_0x02fc:
            r12 = r12 | r13
            java.lang.Object r13 = r9.D()
            if (r12 != 0) goto L_0x030c
            java.lang.Object r12 = r31.a()
            if (r13 != r12) goto L_0x030a
            goto L_0x030c
        L_0x030a:
            r14 = 0
            goto L_0x0315
        L_0x030c:
            Op.z0$b r13 = new Op.z0$b
            r14 = 0
            r13.<init>(r8, r4, r10, r14)
            r9.u(r13)
        L_0x0315:
            nI.p r13 = (nI.p) r13
            r9.P()
            int r10 = r0 >> 21
            r10 = r10 & 14
            U0.P.g(r8, r13, r9, r10)
            r44 = r11
            r11 = 1065353216(0x3f800000, float:1.0)
            r12 = 0
            r13 = 2
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.C5074e.b(r2, r11, r12, r13, r14)
            i1.c$a r17 = i1.C5437c.f24302a
            i1.c r13 = r17.o()
            E1.I r13 = androidx.compose.foundation.layout.C5077h.h(r13, r12)
            int r17 = U0.C4883j.a(r9, r12)
            U0.y r12 = r9.s()
            androidx.compose.ui.d r11 = androidx.compose.ui.c.e(r9, r11)
            G1.g$a r21 = G1.C4504g.f6515W
            nI.a r14 = r21.a()
            U0.f r22 = r9.m()
            if (r22 != 0) goto L_0x0350
            U0.C4883j.c()
        L_0x0350:
            r9.I()
            boolean r22 = r9.i()
            if (r22 == 0) goto L_0x035d
            r9.p(r14)
            goto L_0x0360
        L_0x035d:
            r9.t()
        L_0x0360:
            U0.m r14 = U0.F1.a(r9)
            r37 = r15
            nI.p r15 = r21.c()
            U0.F1.c(r14, r13, r15)
            nI.p r13 = r21.e()
            U0.F1.c(r14, r12, r13)
            nI.p r12 = r21.b()
            boolean r13 = r14.i()
            if (r13 != 0) goto L_0x038c
            java.lang.Object r13 = r14.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r17)
            boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r15)
            if (r13 != 0) goto L_0x039a
        L_0x038c:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r14.u(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r17)
            r14.w(r13, r12)
        L_0x039a:
            nI.p r12 = r21.d()
            U0.F1.c(r14, r11, r12)
            androidx.compose.foundation.layout.j r11 = androidx.compose.foundation.layout.C5079j.f18125a
            r12 = -136441862(0xfffffffff7de0ffa, float:-9.0079215E33)
            r9.W(r12)
            androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
            java.lang.String r13 = "IMAGE_PAGER"
            androidx.compose.ui.d r12 = androidx.compose.ui.platform.C5116k1.a(r12, r13)
            r13 = 0
            Op.z0$c r14 = new Op.z0$c
            r14.<init>(r1, r6, r3)
            r15 = 54
            r13 = -134936487(0xfffffffff7f50859, float:-9.9397034E33)
            r1 = 1
            c1.a r24 = c1.c.e(r13, r1, r14, r9, r15)
            r26 = r10 | 48
            r27 = 3072(0xc00, float:4.305E-42)
            r28 = 8188(0x1ffc, float:1.1474E-41)
            r13 = 0
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r14 = 16384(0x4000, float:2.2959E-41)
            r15 = 2
            r30 = 0
            r17 = 0
            r1 = 1
            r14 = r17
            r16 = 0
            r32 = r37
            r15 = r16
            r16 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r33 = r44
            r34 = r11
            r11 = r8
            r25 = r9
            x0.m.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r11 = -558560640(0xffffffffdeb50a80, float:-6.52269E18)
            r9.W(r11)
            int r11 = r36.size()
            if (r11 <= r1) goto L_0x04b4
            int[] r11 = Op.C10872z0.e.f85375a
            int r12 = r7.ordinal()
            r11 = r11[r12]
            if (r11 == r1) goto L_0x0499
            r12 = 2
            if (r11 == r12) goto L_0x044a
            r12 = 3
            if (r11 != r12) goto L_0x043b
            r0 = -134778403(0xfffffffff7f771dd, float:-1.0037553E34)
            r9.W(r0)
            r9.P()
            r0 = r33
            r9.q(r0)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0425
            U0.C4895p.R()
        L_0x0425:
            U0.Y0 r11 = r9.n()
            if (r11 == 0) goto L_0x043a
            Op.l0 r12 = new Op.l0
            r0 = r12
            r1 = r36
            r9 = r45
            r10 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x043a:
            return
        L_0x043b:
            r0 = -558559445(0xffffffffdeb50f2b, float:-6.523347E18)
            r9.W(r0)
            r9.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x044a:
            r11 = -135148326(0xfffffffff7f1ccda, float:-9.8085815E33)
            r9.W(r11)
            r11 = -558547331(0xffffffffdeb53e7d, float:-6.5300067E18)
            r9.W(r11)
            r12 = r32
            r11 = 8388608(0x800000, float:1.17549435E-38)
            if (r12 <= r11) goto L_0x0462
            boolean r12 = r9.V(r8)
            if (r12 != 0) goto L_0x0466
        L_0x0462:
            r12 = r0 & r29
            if (r12 != r11) goto L_0x0468
        L_0x0466:
            r14 = r1
            goto L_0x046a
        L_0x0468:
            r14 = r30
        L_0x046a:
            r11 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r11
            r11 = 16384(0x4000, float:2.2959E-41)
            if (r0 != r11) goto L_0x0474
            r30 = r1
        L_0x0474:
            r0 = r14 | r30
            java.lang.Object r1 = r9.D()
            if (r0 != 0) goto L_0x0482
            java.lang.Object r0 = r31.a()
            if (r1 != r0) goto L_0x048b
        L_0x0482:
            Op.z0$d r1 = new Op.z0$d
            r0 = 0
            r1.<init>(r8, r5, r0)
            r9.u(r1)
        L_0x048b:
            nI.p r1 = (nI.p) r1
            r9.P()
            U0.P.g(r8, r1, r9, r10)
            r9.P()
            XH.N r0 = XH.C16807N.f139792a
            goto L_0x04b4
        L_0x0499:
            r1 = -135414771(0xfffffffff7edbc0d, float:-9.64366E33)
            r9.W(r1)
            int r1 = r0 >> 18
            r1 = r1 & 112(0x70, float:1.57E-43)
            r10 = 6
            r1 = r1 | r10
            int r0 = r0 >> 12
            r0 = r0 & 896(0x380, float:1.256E-42)
            r0 = r0 | r1
            r1 = r34
            n0(r1, r8, r7, r9, r0)
            r9.P()
            XH.N r0 = XH.C16807N.f139792a
        L_0x04b4:
            r9.P()
            r9.P()
            r9.x()
            r9.P()
        L_0x04c0:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x04c9
            U0.C4895p.R()
        L_0x04c9:
            U0.Y0 r11 = r9.n()
            if (r11 == 0) goto L_0x04de
            Op.m0 r12 = new Op.m0
            r0 = r12
            r1 = r36
            r9 = r45
            r10 = r46
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r11.a(r12)
        L_0x04de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.C10872z0.R(KJ.c, androidx.compose.ui.d, LC.b, nI.a, nI.a, A0.f, Op.A, x0.C, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N S() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N T() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final int U(C15987c cVar) {
        return cVar.size();
    }

    /* access modifiers changed from: private */
    public static final int V(C4894o0 o0Var) {
        return o0Var.e();
    }

    /* access modifiers changed from: private */
    public static final void W(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N X(C15987c cVar, androidx.compose.ui.d dVar, C13178b bVar, C17631a aVar, C17631a aVar2, A0.f fVar, A a10, C6230C c10, int i10, int i11, C4889m mVar, int i12) {
        R(cVar, dVar, bVar, aVar, aVar2, fVar, a10, c10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Y(C15987c cVar, androidx.compose.ui.d dVar, C13178b bVar, C17631a aVar, C17631a aVar2, A0.f fVar, A a10, C6230C c10, int i10, int i11, C4889m mVar, int i12) {
        R(cVar, dVar, bVar, aVar, aVar2, fVar, a10, c10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void Z(boolean r23, Op.d1 r24, nI.C17631a<XH.C16807N> r25, SC.P1 r26, nI.C17642l<? super Op.c1, XH.C16807N> r27, U0.C4889m r28, int r29) {
        /*
            r10 = r23
            r11 = r27
            r12 = r29
            r0 = -2089583631(0xffffffff83737bf1, float:-7.155356E-37)
            r1 = r28
            U0.m r13 = r1.k(r0)
            r1 = r12 & 6
            if (r1 != 0) goto L_0x001e
            boolean r1 = r13.b(r10)
            if (r1 == 0) goto L_0x001b
            r1 = 4
            goto L_0x001c
        L_0x001b:
            r1 = 2
        L_0x001c:
            r1 = r1 | r12
            goto L_0x001f
        L_0x001e:
            r1 = r12
        L_0x001f:
            r2 = r12 & 48
            r14 = r24
            if (r2 != 0) goto L_0x0031
            boolean r2 = r13.V(r14)
            if (r2 == 0) goto L_0x002e
            r2 = 32
            goto L_0x0030
        L_0x002e:
            r2 = 16
        L_0x0030:
            r1 = r1 | r2
        L_0x0031:
            r2 = r12 & 384(0x180, float:5.38E-43)
            r15 = r25
            if (r2 != 0) goto L_0x0043
            boolean r2 = r13.F(r15)
            if (r2 == 0) goto L_0x0040
            r2 = 256(0x100, float:3.59E-43)
            goto L_0x0042
        L_0x0040:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0042:
            r1 = r1 | r2
        L_0x0043:
            r2 = r12 & 3072(0xc00, float:4.305E-42)
            r9 = r26
            if (r2 != 0) goto L_0x0055
            boolean r2 = r13.V(r9)
            if (r2 == 0) goto L_0x0052
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x0054
        L_0x0052:
            r2 = 1024(0x400, float:1.435E-42)
        L_0x0054:
            r1 = r1 | r2
        L_0x0055:
            r2 = r12 & 24576(0x6000, float:3.4438E-41)
            r8 = 16384(0x4000, float:2.2959E-41)
            if (r2 != 0) goto L_0x0066
            boolean r2 = r13.F(r11)
            if (r2 == 0) goto L_0x0063
            r2 = r8
            goto L_0x0065
        L_0x0063:
            r2 = 8192(0x2000, float:1.14794E-41)
        L_0x0065:
            r1 = r1 | r2
        L_0x0066:
            r2 = r1
            r1 = r2 & 9363(0x2493, float:1.312E-41)
            r3 = 9362(0x2492, float:1.3119E-41)
            if (r1 != r3) goto L_0x0079
            boolean r1 = r13.l()
            if (r1 != 0) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            r13.L()
            goto L_0x01a5
        L_0x0079:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0085
            r1 = -1
            java.lang.String r3 = "com.ingka.ikea.design.ui.product.LandscapeProductDetails (ProductItemComposable.kt:424)"
            U0.C4895p.S(r0, r2, r1, r3)
        L_0x0085:
            r0 = -1427204564(0xffffffffaaee962c, float:-4.2381495E-13)
            r13.W(r0)
            r0 = 48
            r1 = 0
            if (r10 != 0) goto L_0x00bc
            Op.d r3 = r24.p()
            Op.d$b r3 = r3.h()
            if (r3 == 0) goto L_0x00bc
            androidx.compose.ui.d$a r16 = androidx.compose.ui.d.f18749a
            r3 = 8
            float r3 = (float) r3
            float r18 = c2.h.B(r3)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            Op.d r4 = r24.p()
            Op.d$b r4 = r4.h()
            Op.C10824b.b(r4, r3, r13, r0, r1)
        L_0x00bc:
            r13.P()
            Op.d r3 = r24.p()
            Op.d$h r16 = r3.e()
            Op.i1 r7 = new Op.i1
            kp.d r3 = r24.j()
            r7.<init>(r3)
            SC.Q1$b r17 = new SC.Q1$b
            r18 = 4
            r19 = 0
            r5 = 1
            r6 = 0
            r3 = r17
            r4 = r26
            r20 = r7
            r7 = r18
            r0 = r8
            r8 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            boolean r3 = r24.n()
            int r4 = r2 << 3
            r4 = r4 & 7168(0x1c00, float:1.0045E-41)
            int r5 = SC.Q1.b.f115896e
            int r5 = r5 << 15
            r8 = r4 | r5
            r18 = 16
            r5 = 0
            r7 = r1
            r1 = r16
            r16 = r2
            r2 = r20
            r4 = r25
            r6 = r17
            r7 = r13
            r9 = r18
            Op.F.g(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            Op.d r1 = r24.p()
            java.lang.String r1 = r1.f()
            Op.d r2 = r24.p()
            KJ.c r2 = r2.i()
            r3 = -1427178765(0xffffffffaaeefaf3, float:-4.2451424E-13)
            r13.W(r3)
            r3 = 57344(0xe000, float:8.0356E-41)
            r4 = r16 & r3
            r5 = 1
            if (r4 != r0) goto L_0x0128
            r6 = r5
            goto L_0x0129
        L_0x0128:
            r6 = 0
        L_0x0129:
            java.lang.Object r7 = r13.D()
            if (r6 != 0) goto L_0x0137
            U0.m$a r6 = U0.C4889m.f14007a
            java.lang.Object r6 = r6.a()
            if (r7 != r6) goto L_0x013f
        L_0x0137:
            Op.b0 r7 = new Op.b0
            r7.<init>(r11)
            r13.u(r7)
        L_0x013f:
            r6 = r7
            nI.l r6 = (nI.C17642l) r6
            r13.P()
            r7 = -1427175040(0xffffffffaaef0980, float:-4.246152E-13)
            r13.W(r7)
            if (r4 != r0) goto L_0x014e
            goto L_0x014f
        L_0x014e:
            r5 = 0
        L_0x014f:
            java.lang.Object r0 = r13.D()
            if (r5 != 0) goto L_0x015d
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r0 != r4) goto L_0x0165
        L_0x015d:
            Op.d0 r0 = new Op.d0
            r0.<init>(r11)
            r13.u(r0)
        L_0x0165:
            r4 = r0
            nI.l r4 = (nI.C17642l) r4
            r13.P()
            Op.d r0 = r24.p()
            Op.d$h r0 = r0.e()
            java.lang.String r5 = r0.k()
            int r0 = r16 << 12
            r8 = r0 & r3
            r9 = 64
            r7 = 0
            r3 = 48
            r0 = r1
            r1 = r2
            r2 = r6
            r6 = r3
            r3 = r4
            r4 = r23
            r6 = r7
            r7 = r13
            Op.C10848n.l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r10 != 0) goto L_0x019c
            Op.d r0 = r24.p()
            KJ.c r0 = r0.c()
            r1 = 48
            r2 = 0
            N(r0, r2, r13, r1)
        L_0x019c:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x01a5
            U0.C4895p.R()
        L_0x01a5:
            U0.Y0 r7 = r13.n()
            if (r7 == 0) goto L_0x01c0
            Op.e0 r8 = new Op.e0
            r0 = r8
            r1 = r23
            r2 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.a(r8)
        L_0x01c0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.C10872z0.Z(boolean, Op.d1, nI.a, SC.P1, nI.l, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N a0(C17642l lVar, String str) {
        C17542s.j(str, "itemNo");
        lVar.invoke(new c1.b(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N b0(C17642l lVar, Link link) {
        C17542s.j(link, "it");
        lVar.invoke(new c1.f(link));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N c0(boolean z10, d1 d1Var, C17631a aVar, P1 p12, C17642l lVar, int i10, C4889m mVar, int i11) {
        Z(z10, d1Var, aVar, p12, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r28v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r29v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r34v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r27v3, resolved type: LC.b$b} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0179  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:206:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void d0(Op.d1 r40, nI.C17642l<? super Op.c1, XH.C16807N> r41, boolean r42, A0.f r43, s0.C5834E r44, Op.A r45, nI.C17631a<XH.C16807N> r46, nI.C17631a<XH.C16807N> r47, androidx.compose.ui.d r48, SC.P1 r49, LC.C13178b r50, U0.C4889m r51, int r52, int r53, int r54) {
        /*
            r7 = r40
            r8 = r41
            r9 = r44
            r12 = r52
            r14 = r54
            r1 = 8
            r2 = 128(0x80, float:1.794E-43)
            r3 = 256(0x100, float:3.59E-43)
            r4 = 32
            r5 = 16
            r10 = 6
            r11 = -1246430665(0xffffffffb5b4fa37, float:-1.3483867E-6)
            r13 = r51
            U0.m r13 = r13.k(r11)
            r15 = 1
            r16 = r14 & 1
            r0 = 2
            r11 = 4
            if (r16 == 0) goto L_0x0028
            r16 = r12 | 6
            goto L_0x003c
        L_0x0028:
            r16 = r12 & 6
            if (r16 != 0) goto L_0x003a
            boolean r16 = r13.V(r7)
            if (r16 == 0) goto L_0x0035
            r16 = r11
            goto L_0x0037
        L_0x0035:
            r16 = r0
        L_0x0037:
            r16 = r12 | r16
            goto L_0x003c
        L_0x003a:
            r16 = r12
        L_0x003c:
            r18 = r14 & 2
            if (r18 == 0) goto L_0x0045
            r16 = r16 | 48
        L_0x0042:
            r15 = r16
            goto L_0x0057
        L_0x0045:
            r18 = r12 & 48
            if (r18 != 0) goto L_0x0042
            boolean r18 = r13.F(r8)
            if (r18 == 0) goto L_0x0052
            r18 = r4
            goto L_0x0054
        L_0x0052:
            r18 = r5
        L_0x0054:
            r16 = r16 | r18
            goto L_0x0042
        L_0x0057:
            r16 = r14 & 4
            if (r16 == 0) goto L_0x0060
            r15 = r15 | 384(0x180, float:5.38E-43)
        L_0x005d:
            r11 = r42
            goto L_0x0073
        L_0x0060:
            r11 = r12 & 384(0x180, float:5.38E-43)
            if (r11 != 0) goto L_0x005d
            r11 = r42
            boolean r18 = r13.b(r11)
            if (r18 == 0) goto L_0x006f
            r18 = r3
            goto L_0x0071
        L_0x006f:
            r18 = r2
        L_0x0071:
            r15 = r15 | r18
        L_0x0073:
            r18 = r14 & 8
            if (r18 == 0) goto L_0x007c
            r15 = r15 | 3072(0xc00, float:4.305E-42)
        L_0x0079:
            r1 = r43
            goto L_0x008f
        L_0x007c:
            r1 = r12 & 3072(0xc00, float:4.305E-42)
            if (r1 != 0) goto L_0x0079
            r1 = r43
            boolean r19 = r13.V(r1)
            if (r19 == 0) goto L_0x008b
            r19 = 2048(0x800, float:2.87E-42)
            goto L_0x008d
        L_0x008b:
            r19 = 1024(0x400, float:1.435E-42)
        L_0x008d:
            r15 = r15 | r19
        L_0x008f:
            r19 = r14 & 16
            if (r19 == 0) goto L_0x0096
            r15 = r15 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a6
        L_0x0096:
            r5 = r12 & 24576(0x6000, float:3.4438E-41)
            if (r5 != 0) goto L_0x00a6
            boolean r5 = r13.V(r9)
            if (r5 == 0) goto L_0x00a3
            r5 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a5
        L_0x00a3:
            r5 = 8192(0x2000, float:1.14794E-41)
        L_0x00a5:
            r15 = r15 | r5
        L_0x00a6:
            r5 = r14 & 32
            r19 = 196608(0x30000, float:2.75506E-40)
            if (r5 == 0) goto L_0x00b1
            r15 = r15 | r19
        L_0x00ae:
            r5 = r45
            goto L_0x00c4
        L_0x00b1:
            r5 = r12 & r19
            if (r5 != 0) goto L_0x00ae
            r5 = r45
            boolean r19 = r13.V(r5)
            if (r19 == 0) goto L_0x00c0
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c2
        L_0x00c0:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00c2:
            r15 = r15 | r19
        L_0x00c4:
            r19 = r14 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00cf
            r15 = r15 | r20
            r4 = r46
            goto L_0x00e2
        L_0x00cf:
            r19 = r12 & r20
            r4 = r46
            if (r19 != 0) goto L_0x00e2
            boolean r20 = r13.F(r4)
            if (r20 == 0) goto L_0x00de
            r20 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00e0
        L_0x00de:
            r20 = 524288(0x80000, float:7.34684E-40)
        L_0x00e0:
            r15 = r15 | r20
        L_0x00e2:
            r2 = r2 & r14
            r20 = 12582912(0xc00000, float:1.7632415E-38)
            if (r2 == 0) goto L_0x00ec
            r15 = r15 | r20
        L_0x00e9:
            r2 = r47
            goto L_0x00ff
        L_0x00ec:
            r2 = r12 & r20
            if (r2 != 0) goto L_0x00e9
            r2 = r47
            boolean r20 = r13.F(r2)
            if (r20 == 0) goto L_0x00fb
            r20 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fd
        L_0x00fb:
            r20 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fd:
            r15 = r15 | r20
        L_0x00ff:
            r3 = r3 & r14
            r20 = 100663296(0x6000000, float:2.4074124E-35)
            if (r3 == 0) goto L_0x0109
            r15 = r15 | r20
            r0 = r48
            goto L_0x011c
        L_0x0109:
            r20 = r12 & r20
            r0 = r48
            if (r20 != 0) goto L_0x011c
            boolean r21 = r13.V(r0)
            if (r21 == 0) goto L_0x0118
            r21 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x011a
        L_0x0118:
            r21 = 33554432(0x2000000, float:9.403955E-38)
        L_0x011a:
            r15 = r15 | r21
        L_0x011c:
            r6 = r14 & 512(0x200, float:7.175E-43)
            r22 = 805306368(0x30000000, float:4.656613E-10)
            if (r6 == 0) goto L_0x0129
            r15 = r15 | r22
            r22 = r10
            r10 = r49
            goto L_0x013e
        L_0x0129:
            r22 = r12 & r22
            r10 = r49
            if (r22 != 0) goto L_0x013c
            boolean r22 = r13.V(r10)
            if (r22 == 0) goto L_0x0138
            r22 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x013a
        L_0x0138:
            r22 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x013a:
            r15 = r15 | r22
        L_0x013c:
            r22 = 6
        L_0x013e:
            r23 = r53 & 6
            if (r23 != 0) goto L_0x0156
            r0 = 1024(0x400, float:1.435E-42)
            r1 = r14 & 1024(0x400, float:1.435E-42)
            r0 = r50
            if (r1 != 0) goto L_0x0152
            boolean r1 = r13.F(r0)
            if (r1 == 0) goto L_0x0152
            r1 = 4
            goto L_0x0153
        L_0x0152:
            r1 = 2
        L_0x0153:
            r1 = r53 | r1
            goto L_0x015a
        L_0x0156:
            r0 = r50
            r1 = r53
        L_0x015a:
            r22 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r15 & r22
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r2) goto L_0x0179
            r0 = r1 & 3
            r2 = 2
            if (r0 != r2) goto L_0x0179
            boolean r0 = r13.l()
            if (r0 != 0) goto L_0x0170
            goto L_0x0179
        L_0x0170:
            r13.L()
            r9 = r48
            r27 = r50
            goto L_0x0475
        L_0x0179:
            r13.G()
            r0 = 1
            r2 = r12 & 1
            if (r2 == 0) goto L_0x0199
            boolean r2 = r13.O()
            if (r2 == 0) goto L_0x0188
            goto L_0x0199
        L_0x0188:
            r13.L()
            r2 = 1024(0x400, float:1.435E-42)
            r2 = r2 & r14
            if (r2 == 0) goto L_0x0192
            r1 = r1 & -15
        L_0x0192:
            r27 = r50
            r26 = r10
            r10 = r48
            goto L_0x01c0
        L_0x0199:
            if (r3 == 0) goto L_0x019e
            androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
            goto L_0x01a0
        L_0x019e:
            r2 = r48
        L_0x01a0:
            if (r6 == 0) goto L_0x01a7
            SC.P1 r3 = SC.P1.Small
        L_0x01a4:
            r6 = 1024(0x400, float:1.435E-42)
            goto L_0x01a9
        L_0x01a7:
            r3 = r10
            goto L_0x01a4
        L_0x01a9:
            r6 = r6 & r14
            if (r6 == 0) goto L_0x01bb
            LC.b$b r6 = new LC.b$b
            gs.h$a r10 = gs.h.a.XXXS
            r6.<init>(r10)
            r1 = r1 & -15
            r10 = r2
            r26 = r3
            r27 = r6
            goto L_0x01c0
        L_0x01bb:
            r27 = r50
            r10 = r2
            r26 = r3
        L_0x01c0:
            r13.y()
            boolean r2 = U0.C4895p.J()
            if (r2 == 0) goto L_0x01d1
            java.lang.String r2 = "com.ingka.ikea.design.ui.product.LandscapeProductItem (ProductItemComposable.kt:341)"
            r3 = -1246430665(0xffffffffb5b4fa37, float:-1.3483867E-6)
            U0.C4895p.S(r3, r15, r1, r2)
        L_0x01d1:
            Op.d r2 = r40.p()
            java.lang.String r2 = r2.f()
            r3 = -252195504(0xfffffffff0f7cd50, float:-6.1352804E29)
            r13.W(r3)
            boolean r2 = r13.V(r2)
            java.lang.Object r3 = r13.D()
            if (r2 != 0) goto L_0x01f1
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x01f9
        L_0x01f1:
            Op.t0 r3 = new Op.t0
            r3.<init>(r8, r7)
            r13.u(r3)
        L_0x01f9:
            r28 = r3
            nI.a r28 = (nI.C17631a) r28
            r13.P()
            Op.d r2 = r40.p()
            java.lang.String r2 = r2.f()
            r3 = -252184817(0xfffffffff0f7f70f, float:-6.139318E29)
            r13.W(r3)
            boolean r2 = r13.V(r2)
            java.lang.Object r3 = r13.D()
            if (r2 != 0) goto L_0x0220
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L_0x0228
        L_0x0220:
            Op.u0 r3 = new Op.u0
            r3.<init>(r8, r7)
            r13.u(r3)
        L_0x0228:
            r2 = r3
            nI.a r2 = (nI.C17631a) r2
            r13.P()
            Op.d r3 = r40.p()
            java.lang.String r3 = r3.f()
            r6 = -252176058(0xfffffffff0f81946, float:-6.142627E29)
            r13.W(r6)
            boolean r3 = r13.V(r3)
            java.lang.Object r6 = r13.D()
            if (r3 != 0) goto L_0x024e
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r6 != r3) goto L_0x0256
        L_0x024e:
            Op.v0 r6 = new Op.v0
            r6.<init>(r8, r7)
            r13.u(r6)
        L_0x0256:
            r29 = r6
            nI.a r29 = (nI.C17631a) r29
            r13.P()
            s0.z r3 = s0.C5880z.Max
            androidx.compose.ui.d r30 = androidx.compose.foundation.layout.x.a(r10, r3)
            r3 = -252160444(0xfffffffff0f85644, float:-6.1485257E29)
            r13.W(r3)
            r3 = r15 & 112(0x70, float:1.57E-43)
            r0 = 32
            if (r3 != r0) goto L_0x0271
            r0 = 1
            goto L_0x0272
        L_0x0271:
            r0 = 0
        L_0x0272:
            r3 = r15 & 14
            r6 = 4
            if (r3 != r6) goto L_0x0279
            r3 = 1
            goto L_0x027a
        L_0x0279:
            r3 = 0
        L_0x027a:
            r0 = r0 | r3
            java.lang.Object r3 = r13.D()
            if (r0 != 0) goto L_0x0289
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x0291
        L_0x0289:
            Op.w0 r3 = new Op.w0
            r3.<init>(r8, r7)
            r13.u(r3)
        L_0x0291:
            r34 = r3
            nI.a r34 = (nI.C17631a) r34
            r13.P()
            r35 = 7
            r36 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.d.d(r30, r31, r32, r33, r34, r35, r36)
            Op.d r3 = r40.p()
            java.lang.String r3 = r3.f()
            androidx.compose.ui.d r0 = androidx.compose.ui.platform.C5116k1.a(r0, r3)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.h(r0, r9)
            androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$e r6 = r3.f()
            i1.c$a r30 = i1.C5437c.f24302a
            i1.c$c r4 = r30.l()
            r5 = 0
            E1.I r4 = androidx.compose.foundation.layout.G.b(r6, r4, r13, r5)
            int r6 = U0.C4883j.a(r13, r5)
            U0.y r5 = r13.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r13, r0)
            G1.g$a r31 = G1.C4504g.f6515W
            nI.a r7 = r31.a()
            U0.f r16 = r13.m()
            if (r16 != 0) goto L_0x02e2
            U0.C4883j.c()
        L_0x02e2:
            r13.I()
            boolean r16 = r13.i()
            if (r16 == 0) goto L_0x02ef
            r13.p(r7)
            goto L_0x02f2
        L_0x02ef:
            r13.t()
        L_0x02f2:
            U0.m r7 = U0.F1.a(r13)
            nI.p r8 = r31.c()
            U0.F1.c(r7, r4, r8)
            nI.p r4 = r31.e()
            U0.F1.c(r7, r5, r4)
            nI.p r4 = r31.b()
            boolean r5 = r7.i()
            if (r5 != 0) goto L_0x031c
            java.lang.Object r5 = r7.D()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
            if (r5 != 0) goto L_0x032a
        L_0x031c:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r7.u(r5)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r7.w(r5, r4)
        L_0x032a:
            nI.p r4 = r31.d()
            U0.F1.c(r7, r0, r4)
            s0.N r0 = s0.C5843N.f28726a
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r19 = r0
            r20 = r7
            androidx.compose.ui.d r32 = s0.C5842M.e(r19, r20, r21, r22, r23, r24)
            r4 = 8
            float r4 = (float) r4
            float r34 = c2.h.B(r4)
            r37 = 13
            r38 = 0
            r33 = 0
            r35 = 0
            r36 = 0
            androidx.compose.ui.d r16 = androidx.compose.foundation.layout.D.m(r32, r33, r34, r35, r36, r37, r38)
            Op.d r4 = r40.p()
            KJ.c r4 = r4.d()
            r5 = 6
            int r1 = r1 << r5
            r1 = r1 & 896(0x380, float:1.256E-42)
            int r6 = r15 >> 9
            r8 = r6 & 7168(0x1c00, float:1.0045E-41)
            r1 = r1 | r8
            r8 = 57344(0xe000, float:8.0356E-41)
            r6 = r6 & r8
            r1 = r1 | r6
            int r6 = r15 << 6
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r5 & r6
            r1 = r1 | r5
            int r5 = r15 << 3
            r6 = 3670016(0x380000, float:5.142788E-39)
            r6 = r6 & r5
            r24 = r1 | r6
            r25 = 128(0x80, float:1.794E-43)
            r22 = 0
            r8 = r15
            r15 = r4
            r17 = r27
            r18 = r46
            r19 = r47
            r20 = r43
            r21 = r45
            r23 = r13
            R(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            r1 = 16
            float r15 = (float) r1
            float r1 = c2.h.B(r15)
            androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.y(r7, r1)
            r4 = 6
            s0.C5844O.a(r1, r13, r4)
            r23 = 2
            r24 = 0
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
            r19 = r0
            r20 = r7
            androidx.compose.ui.d r0 = s0.C5842M.e(r19, r20, r21, r22, r23, r24)
            androidx.compose.foundation.layout.d$m r1 = r3.g()
            i1.c$b r3 = r30.k()
            r4 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r3, r13, r4)
            int r3 = U0.C4883j.a(r13, r4)
            U0.y r4 = r13.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r13, r0)
            nI.a r6 = r31.a()
            U0.f r16 = r13.m()
            if (r16 != 0) goto L_0x03d7
            U0.C4883j.c()
        L_0x03d7:
            r13.I()
            boolean r16 = r13.i()
            if (r16 == 0) goto L_0x03e4
            r13.p(r6)
            goto L_0x03e7
        L_0x03e4:
            r13.t()
        L_0x03e7:
            U0.m r6 = U0.F1.a(r13)
            nI.p r9 = r31.c()
            U0.F1.c(r6, r1, r9)
            nI.p r1 = r31.e()
            U0.F1.c(r6, r4, r1)
            nI.p r1 = r31.b()
            boolean r4 = r6.i()
            if (r4 != 0) goto L_0x0411
            java.lang.Object r4 = r6.D()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r9)
            if (r4 != 0) goto L_0x041f
        L_0x0411:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r6.u(r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r6.w(r3, r1)
        L_0x041f:
            nI.p r1 = r31.d()
            U0.F1.c(r6, r0, r1)
            s0.h r0 = s0.C5862h.f28810a
            r0 = 6
            int r1 = r8 >> 6
            r0 = r1 & 14
            r1 = r5 & 112(0x70, float:1.57E-43)
            r0 = r0 | r1
            int r1 = r8 >> 18
            r1 = r1 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r1
            int r1 = r8 << 9
            r3 = 57344(0xe000, float:8.0356E-41)
            r1 = r1 & r3
            r6 = r0 | r1
            r0 = r42
            r1 = r40
            r3 = r26
            r4 = r41
            r5 = r13
            Z(r0, r1, r2, r3, r4, r5, r6)
            r13.x()
            float r0 = c2.h.B(r15)
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.y(r7, r0)
            r1 = 6
            s0.C5844O.a(r0, r13, r1)
            r5 = r8 & 910(0x38e, float:1.275E-42)
            r0 = r40
            r1 = r28
            r2 = r42
            r3 = r29
            r4 = r13
            I(r0, r1, r2, r3, r4, r5)
            r13.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0472
            U0.C4895p.R()
        L_0x0472:
            r9 = r10
            r10 = r26
        L_0x0475:
            U0.Y0 r15 = r13.n()
            if (r15 == 0) goto L_0x04a0
            Op.x0 r13 = new Op.x0
            r0 = r13
            r1 = r40
            r2 = r41
            r3 = r42
            r4 = r43
            r5 = r44
            r6 = r45
            r7 = r46
            r8 = r47
            r11 = r27
            r12 = r52
            r39 = r13
            r13 = r53
            r14 = r54
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r0 = r39
            r15.a(r0)
        L_0x04a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.C10872z0.d0(Op.d1, nI.l, boolean, A0.f, s0.E, Op.A, nI.a, nI.a, androidx.compose.ui.d, SC.P1, LC.b, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N e0(C17642l lVar, d1 d1Var) {
        lVar.invoke(new c1.d(d1Var.p().f(), d1Var.p().e().k()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f0(C17642l lVar, d1 d1Var) {
        lVar.invoke(new c1.c(d1Var.p().f()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g0(C17642l lVar, d1 d1Var) {
        lVar.invoke(new c1.a(d1Var.p().f(), d1Var.p().e().k(), d1Var.p().e().c()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N h0(C17642l lVar, d1 d1Var) {
        lVar.invoke(new c1.e(d1Var.p().f()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N i0(d1 d1Var, C17642l lVar, boolean z10, A0.f fVar, C5834E e10, A a10, C17631a aVar, C17631a aVar2, androidx.compose.ui.d dVar, P1 p12, C13178b bVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        d0(d1Var, lVar, z10, fVar, e10, a10, aVar, aVar2, dVar, p12, bVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    private static final void j0(C13023e eVar, androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C4889m k10 = mVar.k(1870387988);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? k10.V(eVar) : k10.F(eVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = androidx.compose.ui.d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(1870387988, i12, -1, "com.ingka.ikea.design.ui.product.OfferExpiryTimeBadge (ProductItemComposable.kt:277)");
            }
            SC.D.b(new F.b(eVar.a(k10, (i12 & 14) | C13023e.f110931a), E.Medium), B.Black, D.m(C5116k1.a(dVar, "OFFER_EXPIRY_TIME"), 0.0f, 0.0f, 0.0f, h.B((float) 16), 7, (Object) null), k10, F.b.f115714d | 48, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10823a0(eVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k0(C13023e eVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        j0(eVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    private static final void l0(C6230C c10, C4889m mVar, int i10) {
        int i11;
        long z02;
        C4889m k10 = mVar.k(1966932348);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(c10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1966932348, i11, -1, "com.ingka.ikea.design.ui.product.PagingContent (ProductItemComposable.kt:655)");
            }
            int G10 = c10.G();
            int i12 = 0;
            while (i12 < G10) {
                if (c10.v() == i12) {
                    k10.W(-275935625);
                    z02 = C18030v.f147664a.a(k10, C18030v.f147665b).F0();
                    k10.P();
                } else {
                    k10.W(-275877128);
                    z02 = C18030v.f147664a.a(k10, C18030v.f147665b).z0();
                    k10.P();
                }
                C5077h.a(J.t(androidx.compose.foundation.b.d(m1.e.a(D.i(androidx.compose.ui.d.f18749a, h.B((float) 8)), g.h()), z02, (i1) null, 2, (Object) null), c10.v() == i12 ? h.B((float) 12) : h.B((float) 8)), k10, 0);
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
            n10.a(new C10856r0(c10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N m0(C6230C c10, int i10, C4889m mVar, int i11) {
        l0(c10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void n0(C5857c cVar, C6230C c10, A a10, C4889m mVar, int i10) {
        int i11;
        C5857c cVar2 = cVar;
        C6230C c11 = c10;
        A a11 = a10;
        int i12 = i10;
        C4889m k10 = mVar.k(1882153952);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(c11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.V(a11) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1882153952, i11, -1, "com.ingka.ikea.design.ui.product.PagingIndicator (ProductItemComposable.kt:632)");
            }
            int i13 = e.f85375a[a10.ordinal()];
            if (i13 == 1) {
                C16795B b10 = new C16795B(h.m(h.B((float) 24)), h.m(h.B((float) 16)), h.m(h.B((float) 8)));
                float G10 = ((h) b10.a()).G();
                float G11 = ((h) b10.b()).G();
                float G12 = ((h) b10.c()).G();
                androidx.compose.ui.d C10 = J.C(androidx.compose.ui.d.f18749a, (C5437c.C0386c) null, false, 3, (Object) null);
                C5437c.a aVar = C5437c.f24302a;
                androidx.compose.ui.d j10 = D.j(androidx.compose.foundation.b.d(m1.e.a(D.m(cVar2.a(C10, aVar.b()), 0.0f, 0.0f, 0.0f, G10, 7, (Object) null), g.e(G11)), C5747v0.o(C18030v.f147664a.a(k10, C18030v.f147665b).x0(), 0.48f, 0.0f, 0.0f, 0.0f, 14, (Object) null), (i1) null, 2, (Object) null), G12, h.B((float) 2));
                I b11 = G.b(C5073d.f18068a.b(), aVar.i(), k10, 54);
                int a12 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, j10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a13 = aVar2.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a13);
                } else {
                    k10.t();
                }
                C4889m a14 = F1.a(k10);
                F1.c(a14, b11, aVar2.c());
                F1.c(a14, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b12 = aVar2.b();
                if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                    a14.u(Integer.valueOf(a12));
                    a14.w(Integer.valueOf(a12), b12);
                }
                F1.c(a14, e10, aVar2.d());
                C5843N n10 = C5843N.f28726a;
                l0(c11, k10, (i11 >> 3) & 14);
                k10.x();
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else if (i13 == 2 || i13 == 3) {
                if (C4895p.J()) {
                    C4895p.R();
                }
                Y0 n11 = k10.n();
                if (n11 != null) {
                    n11.a(new C10853p0(cVar2, c11, a11, i12));
                    return;
                }
                return;
            } else {
                throw new t();
            }
        } else {
            k10.L();
        }
        Y0 n12 = k10.n();
        if (n12 != null) {
            n12.a(new C10855q0(cVar2, c11, a11, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N o0(C5857c cVar, C6230C c10, A a10, int i10, C4889m mVar, int i11) {
        n0(cVar, c10, a10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p0(C5857c cVar, C6230C c10, A a10, int i10, C4889m mVar, int i11) {
        n0(cVar, c10, a10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r32v2, resolved type: LC.b$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v6, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r33v0, resolved type: nI.a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: nI.a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0159  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x05ed  */
    /* JADX WARNING: Removed duplicated region for block: B:258:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0124  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final void q0(Op.d1 r44, nI.C17642l<? super Op.c1, XH.C16807N> r45, boolean r46, A0.f r47, s0.C5834E r48, s0.C5834E r49, Op.A r50, nI.C17631a<XH.C16807N> r51, nI.C17631a<XH.C16807N> r52, androidx.compose.ui.d r53, SC.P1 r54, LC.C13178b r55, U0.C4889m r56, int r57, int r58, int r59) {
        /*
            r10 = r44
            r11 = r45
            r12 = r46
            r13 = r48
            r14 = r49
            r15 = r57
            r9 = r59
            r16 = 57344(0xe000, float:8.0356E-41)
            r0 = 1024(0x400, float:1.435E-42)
            r1 = 128(0x80, float:1.794E-43)
            r2 = 256(0x100, float:3.59E-43)
            r6 = 32
            r3 = 16
            r5 = 48
            r7 = 1715789634(0x6644df42, float:2.3242555E23)
            r8 = r56
            U0.m r8 = r8.k(r7)
            r7 = 1
            r19 = r9 & 1
            r20 = 2
            r7 = 4
            if (r19 == 0) goto L_0x0031
            r19 = r15 | 6
            goto L_0x0045
        L_0x0031:
            r19 = r15 & 6
            if (r19 != 0) goto L_0x0043
            boolean r19 = r8.V(r10)
            if (r19 == 0) goto L_0x003e
            r19 = r7
            goto L_0x0040
        L_0x003e:
            r19 = r20
        L_0x0040:
            r19 = r15 | r19
            goto L_0x0045
        L_0x0043:
            r19 = r15
        L_0x0045:
            r21 = r9 & 2
            if (r21 == 0) goto L_0x004e
            r19 = r19 | 48
        L_0x004b:
            r4 = r19
            goto L_0x0060
        L_0x004e:
            r21 = r15 & 48
            if (r21 != 0) goto L_0x004b
            boolean r21 = r8.F(r11)
            if (r21 == 0) goto L_0x005b
            r21 = r6
            goto L_0x005d
        L_0x005b:
            r21 = r3
        L_0x005d:
            r19 = r19 | r21
            goto L_0x004b
        L_0x0060:
            r19 = r9 & 4
            if (r19 == 0) goto L_0x0067
            r4 = r4 | 384(0x180, float:5.38E-43)
            goto L_0x0075
        L_0x0067:
            r7 = r15 & 384(0x180, float:5.38E-43)
            if (r7 != 0) goto L_0x0075
            boolean r7 = r8.b(r12)
            if (r7 == 0) goto L_0x0073
            r7 = r2
            goto L_0x0074
        L_0x0073:
            r7 = r1
        L_0x0074:
            r4 = r4 | r7
        L_0x0075:
            r7 = r9 & 8
            if (r7 == 0) goto L_0x007e
            r4 = r4 | 3072(0xc00, float:4.305E-42)
        L_0x007b:
            r7 = r47
            goto L_0x0091
        L_0x007e:
            r7 = r15 & 3072(0xc00, float:4.305E-42)
            if (r7 != 0) goto L_0x007b
            r7 = r47
            boolean r22 = r8.V(r7)
            if (r22 == 0) goto L_0x008d
            r22 = 2048(0x800, float:2.87E-42)
            goto L_0x008f
        L_0x008d:
            r22 = r0
        L_0x008f:
            r4 = r4 | r22
        L_0x0091:
            r22 = r9 & 16
            if (r22 == 0) goto L_0x0098
            r4 = r4 | 24576(0x6000, float:3.4438E-41)
            goto L_0x00a8
        L_0x0098:
            r3 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x00a8
            boolean r3 = r8.V(r13)
            if (r3 == 0) goto L_0x00a5
            r3 = 16384(0x4000, float:2.2959E-41)
            goto L_0x00a7
        L_0x00a5:
            r3 = 8192(0x2000, float:1.14794E-41)
        L_0x00a7:
            r4 = r4 | r3
        L_0x00a8:
            r3 = r9 & 32
            r23 = 196608(0x30000, float:2.75506E-40)
            if (r3 == 0) goto L_0x00b1
            r4 = r4 | r23
            goto L_0x00c1
        L_0x00b1:
            r3 = r15 & r23
            if (r3 != 0) goto L_0x00c1
            boolean r3 = r8.V(r14)
            if (r3 == 0) goto L_0x00be
            r3 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00c0
        L_0x00be:
            r3 = 65536(0x10000, float:9.18355E-41)
        L_0x00c0:
            r4 = r4 | r3
        L_0x00c1:
            r3 = r9 & 64
            r23 = 1572864(0x180000, float:2.204052E-39)
            if (r3 == 0) goto L_0x00cc
            r4 = r4 | r23
        L_0x00c9:
            r3 = r50
            goto L_0x00df
        L_0x00cc:
            r3 = r15 & r23
            if (r3 != 0) goto L_0x00c9
            r3 = r50
            boolean r23 = r8.V(r3)
            if (r23 == 0) goto L_0x00db
            r23 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00dd
        L_0x00db:
            r23 = 524288(0x80000, float:7.34684E-40)
        L_0x00dd:
            r4 = r4 | r23
        L_0x00df:
            r1 = r1 & r9
            r23 = 12582912(0xc00000, float:1.7632415E-38)
            if (r1 == 0) goto L_0x00e9
            r4 = r4 | r23
        L_0x00e6:
            r1 = r51
            goto L_0x00fc
        L_0x00e9:
            r1 = r15 & r23
            if (r1 != 0) goto L_0x00e6
            r1 = r51
            boolean r23 = r8.F(r1)
            if (r23 == 0) goto L_0x00f8
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00fa
        L_0x00f8:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00fa:
            r4 = r4 | r23
        L_0x00fc:
            r2 = r2 & r9
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            if (r2 == 0) goto L_0x0106
            r4 = r4 | r23
        L_0x0103:
            r2 = r52
            goto L_0x0119
        L_0x0106:
            r2 = r15 & r23
            if (r2 != 0) goto L_0x0103
            r2 = r52
            boolean r23 = r8.F(r2)
            if (r23 == 0) goto L_0x0115
            r23 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0117
        L_0x0115:
            r23 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0117:
            r4 = r4 | r23
        L_0x0119:
            r6 = r9 & 512(0x200, float:7.175E-43)
            r24 = 805306368(0x30000000, float:4.656613E-10)
            if (r6 == 0) goto L_0x0124
            r4 = r4 | r24
            r5 = r53
            goto L_0x0137
        L_0x0124:
            r24 = r15 & r24
            r5 = r53
            if (r24 != 0) goto L_0x0137
            boolean r25 = r8.V(r5)
            if (r25 == 0) goto L_0x0133
            r25 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0135
        L_0x0133:
            r25 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0135:
            r4 = r4 | r25
        L_0x0137:
            r0 = r0 & r9
            if (r0 == 0) goto L_0x0141
            r20 = r58 | 6
            r1 = r54
        L_0x013e:
            r24 = 48
            goto L_0x0155
        L_0x0141:
            r25 = r58 & 6
            r1 = r54
            if (r25 != 0) goto L_0x0152
            boolean r25 = r8.V(r1)
            if (r25 == 0) goto L_0x014f
            r20 = 4
        L_0x014f:
            r20 = r58 | r20
            goto L_0x013e
        L_0x0152:
            r20 = r58
            goto L_0x013e
        L_0x0155:
            r25 = r58 & 48
            if (r25 != 0) goto L_0x016f
            r1 = 2048(0x800, float:2.87E-42)
            r2 = r9 & 2048(0x800, float:2.87E-42)
            r1 = r55
            if (r2 != 0) goto L_0x016a
            boolean r2 = r8.F(r1)
            if (r2 == 0) goto L_0x016a
            r22 = 32
            goto L_0x016c
        L_0x016a:
            r22 = 16
        L_0x016c:
            r20 = r20 | r22
            goto L_0x0171
        L_0x016f:
            r1 = r55
        L_0x0171:
            r2 = 306783379(0x12492493, float:6.34695E-28)
            r2 = r2 & r4
            r1 = 306783378(0x12492492, float:6.3469493E-28)
            if (r2 != r1) goto L_0x0192
            r1 = r20 & 19
            r2 = 18
            if (r1 != r2) goto L_0x0192
            boolean r1 = r8.l()
            if (r1 != 0) goto L_0x0187
            goto L_0x0192
        L_0x0187:
            r8.L()
            r31 = r54
            r32 = r55
            r10 = r5
            r1 = r8
            goto L_0x05e7
        L_0x0192:
            r8.G()
            r1 = 1
            r2 = r15 & 1
            if (r2 == 0) goto L_0x01b3
            boolean r1 = r8.O()
            if (r1 == 0) goto L_0x01a1
            goto L_0x01b3
        L_0x01a1:
            r8.L()
            r0 = 2048(0x800, float:2.87E-42)
            r0 = r0 & r9
            if (r0 == 0) goto L_0x01ab
            r20 = r20 & -113(0xffffffffffffff8f, float:NaN)
        L_0x01ab:
            r31 = r54
            r32 = r55
            r6 = r5
        L_0x01b0:
            r0 = r20
            goto L_0x01db
        L_0x01b3:
            if (r6 == 0) goto L_0x01b8
            androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
            goto L_0x01b9
        L_0x01b8:
            r1 = r5
        L_0x01b9:
            if (r0 == 0) goto L_0x01c0
            SC.P1 r0 = SC.P1.Small
        L_0x01bd:
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x01c3
        L_0x01c0:
            r0 = r54
            goto L_0x01bd
        L_0x01c3:
            r2 = r2 & r9
            if (r2 == 0) goto L_0x01d5
            LC.b$b r2 = new LC.b$b
            gs.h$a r5 = gs.h.a.XXXS
            r2.<init>(r5)
            r20 = r20 & -113(0xffffffffffffff8f, float:NaN)
            r31 = r0
            r6 = r1
            r32 = r2
            goto L_0x01b0
        L_0x01d5:
            r32 = r55
            r31 = r0
            r6 = r1
            goto L_0x01b0
        L_0x01db:
            r8.y()
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x01ec
            java.lang.String r1 = "com.ingka.ikea.design.ui.product.PortraitProductItem (ProductItemComposable.kt:168)"
            r2 = 1715789634(0x6644df42, float:2.3242555E23)
            U0.C4895p.S(r2, r4, r0, r1)
        L_0x01ec:
            Op.d r1 = r44.p()
            java.lang.String r1 = r1.f()
            r2 = 417980580(0x18e9e0a4, float:6.0455917E-24)
            r8.W(r2)
            boolean r1 = r8.V(r1)
            java.lang.Object r2 = r8.D()
            if (r1 != 0) goto L_0x020c
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r1 = r1.a()
            if (r2 != r1) goto L_0x0214
        L_0x020c:
            Op.y0 r2 = new Op.y0
            r2.<init>(r11, r10)
            r8.u(r2)
        L_0x0214:
            r1 = r2
            nI.a r1 = (nI.C17631a) r1
            r8.P()
            Op.d r2 = r44.p()
            java.lang.String r2 = r2.f()
            r5 = 417991267(0x18ea0a63, float:6.049807E-24)
            r8.W(r5)
            boolean r2 = r8.V(r2)
            java.lang.Object r5 = r8.D()
            if (r2 != 0) goto L_0x023a
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x0242
        L_0x023a:
            Op.S r5 = new Op.S
            r5.<init>(r11, r10)
            r8.u(r5)
        L_0x0242:
            r21 = r5
            nI.a r21 = (nI.C17631a) r21
            r8.P()
            Op.d r2 = r44.p()
            java.lang.String r2 = r2.f()
            r5 = 418000026(0x18ea2c9a, float:6.053262E-24)
            r8.W(r5)
            boolean r2 = r8.V(r2)
            java.lang.Object r5 = r8.D()
            if (r2 != 0) goto L_0x0269
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x0271
        L_0x0269:
            Op.T r5 = new Op.T
            r5.<init>(r11, r10)
            r8.u(r5)
        L_0x0271:
            r33 = r5
            nI.a r33 = (nI.C17631a) r33
            r8.P()
            r2 = 0
            r5 = 1
            r9 = 0
            androidx.compose.ui.d r34 = androidx.compose.foundation.layout.J.h(r6, r2, r5, r9)
            r2 = 418015384(0x18ea6898, float:6.0593195E-24)
            r8.W(r2)
            r2 = r4 & 112(0x70, float:1.57E-43)
            r15 = 0
            r9 = 32
            if (r2 != r9) goto L_0x028f
            r18 = r5
            goto L_0x0291
        L_0x028f:
            r18 = r15
        L_0x0291:
            r5 = r4 & 14
            r9 = 4
            if (r5 != r9) goto L_0x0298
            r5 = 1
            goto L_0x0299
        L_0x0298:
            r5 = r15
        L_0x0299:
            r5 = r18 | r5
            java.lang.Object r9 = r8.D()
            if (r5 != 0) goto L_0x02a9
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r9 != r5) goto L_0x02b1
        L_0x02a9:
            Op.U r9 = new Op.U
            r9.<init>(r11, r10)
            r8.u(r9)
        L_0x02b1:
            r38 = r9
            nI.a r38 = (nI.C17631a) r38
            r8.P()
            r39 = 7
            r40 = 0
            r35 = 0
            r36 = 0
            r37 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.d.d(r34, r35, r36, r37, r38, r39, r40)
            Op.d r9 = r44.p()
            java.lang.String r9 = r9.f()
            androidx.compose.ui.d r5 = androidx.compose.ui.platform.C5116k1.a(r5, r9)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.h(r5, r13)
            androidx.compose.foundation.layout.d r34 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r9 = r34.g()
            i1.c$a r35 = i1.C5437c.f24302a
            r53 = r2
            i1.c$b r2 = r35.k()
            E1.I r2 = androidx.compose.foundation.layout.C5080k.a(r9, r2, r8, r15)
            int r9 = U0.C4883j.a(r8, r15)
            U0.y r15 = r8.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r8, r5)
            G1.g$a r36 = G1.C4504g.f6515W
            nI.a r3 = r36.a()
            U0.f r18 = r8.m()
            if (r18 != 0) goto L_0x0303
            U0.C4883j.c()
        L_0x0303:
            r8.I()
            boolean r18 = r8.i()
            if (r18 == 0) goto L_0x0310
            r8.p(r3)
            goto L_0x0313
        L_0x0310:
            r8.t()
        L_0x0313:
            U0.m r3 = U0.F1.a(r8)
            r18 = r6
            nI.p r6 = r36.c()
            U0.F1.c(r3, r2, r6)
            nI.p r2 = r36.e()
            U0.F1.c(r3, r15, r2)
            nI.p r2 = r36.b()
            boolean r6 = r3.i()
            if (r6 != 0) goto L_0x033f
            java.lang.Object r6 = r3.D()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            boolean r6 = kotlin.jvm.internal.C17542s.e(r6, r15)
            if (r6 != 0) goto L_0x034d
        L_0x033f:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r3.u(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)
            r3.w(r6, r2)
        L_0x034d:
            nI.p r2 = r36.d()
            U0.F1.c(r3, r5, r2)
            s0.h r15 = s0.C5862h.f28810a
            Op.d r2 = r44.p()
            Op.d$h r2 = r2.e()
            IC.e r2 = r2.h()
            r3 = 376095602(0x166ac372, float:1.8964041E-25)
            r8.W(r3)
            if (r2 != 0) goto L_0x036b
            goto L_0x0379
        L_0x036b:
            androidx.compose.ui.d$a r3 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.h(r3, r14)
            int r5 = IC.C13023e.f110931a
            r6 = 0
            j0(r2, r3, r8, r5, r6)
            XH.N r2 = XH.C16807N.f139792a
        L_0x0379:
            r8.P()
            r2 = r4 & 910(0x38e, float:1.275E-42)
            int r0 = r0 << 6
            r0 = r0 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r4 << 3
            r2 = r2 & r16
            r0 = r0 | r2
            int r2 = r4 >> 3
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r3
            r9 = r0 | r2
            r0 = r44
            r6 = r53
            r17 = 0
            r2 = r46
            r3 = r32
            r37 = r4
            r4 = r47
            r10 = r24
            r19 = 1
            r5 = r50
            r10 = r6
            r38 = r18
            r13 = 32
            r6 = r51
            r7 = r52
            r53 = r8
            P(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            androidx.compose.ui.d$a r9 = androidx.compose.ui.d.f18749a
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.D.h(r9, r14)
            androidx.compose.foundation.layout.d$m r1 = r34.g()
            i1.c$b r2 = r35.k()
            r3 = 0
            E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r2, r8, r3)
            int r2 = U0.C4883j.a(r8, r3)
            U0.y r3 = r8.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r8, r0)
            nI.a r4 = r36.a()
            U0.f r5 = r8.m()
            if (r5 != 0) goto L_0x03e5
            U0.C4883j.c()
        L_0x03e5:
            r8.I()
            boolean r5 = r8.i()
            if (r5 == 0) goto L_0x03f2
            r8.p(r4)
            goto L_0x03f5
        L_0x03f2:
            r8.t()
        L_0x03f5:
            U0.m r4 = U0.F1.a(r8)
            nI.p r5 = r36.c()
            U0.F1.c(r4, r1, r5)
            nI.p r1 = r36.e()
            U0.F1.c(r4, r3, r1)
            nI.p r1 = r36.b()
            boolean r3 = r4.i()
            if (r3 != 0) goto L_0x041f
            java.lang.Object r3 = r4.D()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r5)
            if (r3 != 0) goto L_0x042d
        L_0x041f:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4.u(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.w(r2, r1)
        L_0x042d:
            nI.p r1 = r36.d()
            U0.F1.c(r4, r0, r1)
            Op.d r0 = r44.p()
            Op.d$h r18 = r0.e()
            Op.i1 r0 = new Op.i1
            kp.d r1 = r44.j()
            r0.<init>(r1)
            SC.Q1$b r23 = new SC.Q1$b
            r29 = 4
            r30 = 0
            r27 = 1
            r28 = 0
            r25 = r23
            r26 = r31
            r25.<init>(r26, r27, r28, r29, r30)
            boolean r20 = r44.n()
            int r1 = SC.Q1.b.f115896e
            int r25 = r1 << 15
            r26 = 16
            r22 = 0
            r19 = r0
            r24 = r8
            Op.F.g(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            Op.d r0 = r44.p()
            java.lang.String r0 = r0.f()
            Op.d r1 = r44.p()
            KJ.c r1 = r1.i()
            r2 = -1205609190(0xffffffffb823dd1a, float:-3.9068145E-5)
            r8.W(r2)
            if (r10 != r13) goto L_0x0483
            r7 = 1
            goto L_0x0484
        L_0x0483:
            r7 = 0
        L_0x0484:
            java.lang.Object r2 = r8.D()
            if (r7 != 0) goto L_0x0492
            U0.m$a r3 = U0.C4889m.f14007a
            java.lang.Object r3 = r3.a()
            if (r2 != r3) goto L_0x049a
        L_0x0492:
            Op.V r2 = new Op.V
            r2.<init>(r11)
            r8.u(r2)
        L_0x049a:
            nI.l r2 = (nI.C17642l) r2
            r8.P()
            r3 = -1205604697(0xffffffffb823eea7, float:-3.908449E-5)
            r8.W(r3)
            if (r10 != r13) goto L_0x04a9
            r7 = 1
            goto L_0x04aa
        L_0x04a9:
            r7 = 0
        L_0x04aa:
            java.lang.Object r3 = r8.D()
            if (r7 != 0) goto L_0x04b8
            U0.m$a r4 = U0.C4889m.f14007a
            java.lang.Object r4 = r4.a()
            if (r3 != r4) goto L_0x04c0
        L_0x04b8:
            Op.W r3 = new Op.W
            r3.<init>(r11)
            r8.u(r3)
        L_0x04c0:
            nI.l r3 = (nI.C17642l) r3
            r8.P()
            Op.d r4 = r44.p()
            Op.d$h r4 = r4.e()
            java.lang.String r5 = r4.k()
            int r4 = r37 << 6
            r10 = r4 & r16
            r13 = 64
            r6 = 0
            r4 = r46
            r7 = r8
            r41 = r8
            r8 = r10
            r10 = r9
            r9 = r13
            Op.C10848n.l(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r0 = -1205597321(0xffffffffb8240b77, float:-3.9111324E-5)
            r1 = r41
            r1.W(r0)
            if (r12 != 0) goto L_0x04fb
            Op.d r0 = r44.p()
            KJ.c r0 = r0.c()
            r2 = 0
            r3 = 48
            N(r0, r2, r1, r3)
        L_0x04fb:
            r1.P()
            r1.x()
            r29 = 2
            r30 = 0
            r27 = 1065353216(0x3f800000, float:1.0)
            r28 = 0
            r25 = r15
            r26 = r10
            androidx.compose.ui.d r0 = s0.C5861g.c(r25, r26, r27, r28, r29, r30)
            r2 = 0
            s0.C5844O.a(r0, r1, r2)
            r0 = 1
            r3 = 0
            r4 = 0
            androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r10, r3, r0, r4)
            androidx.compose.foundation.layout.d$e r3 = r34.f()
            i1.c$c r4 = r35.l()
            E1.I r3 = androidx.compose.foundation.layout.G.b(r3, r4, r1, r2)
            int r4 = U0.C4883j.a(r1, r2)
            U0.y r2 = r1.s()
            androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r1, r0)
            nI.a r5 = r36.a()
            U0.f r6 = r1.m()
            if (r6 != 0) goto L_0x0541
            U0.C4883j.c()
        L_0x0541:
            r1.I()
            boolean r6 = r1.i()
            if (r6 == 0) goto L_0x054e
            r1.p(r5)
            goto L_0x0551
        L_0x054e:
            r1.t()
        L_0x0551:
            U0.m r5 = U0.F1.a(r1)
            nI.p r6 = r36.c()
            U0.F1.c(r5, r3, r6)
            nI.p r3 = r36.e()
            U0.F1.c(r5, r2, r3)
            nI.p r2 = r36.b()
            boolean r3 = r5.i()
            if (r3 != 0) goto L_0x057b
            java.lang.Object r3 = r5.D()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r6)
            if (r3 != 0) goto L_0x0589
        L_0x057b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r5.u(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r5.w(r3, r2)
        L_0x0589:
            nI.p r2 = r36.d()
            U0.F1.c(r5, r0, r2)
            s0.N r22 = s0.C5843N.f28726a
            r0 = 0
            D0(r1, r0)
            r26 = 2
            r27 = 0
            r24 = 1065353216(0x3f800000, float:1.0)
            r25 = 0
            r23 = r10
            androidx.compose.ui.d r0 = s0.C5842M.e(r22, r23, r24, r25, r26, r27)
            r2 = 0
            s0.C5844O.a(r0, r1, r2)
            r0 = -1205586761(0xffffffffb82434b7, float:-3.914974E-5)
            r1.W(r0)
            if (r12 != 0) goto L_0x05d3
            Op.o$a r0 = r44.i()
            if (r0 == 0) goto L_0x05d3
            Op.o$a r18 = r44.i()
            Op.d r0 = r44.p()
            Op.d$h r0 = r0.e()
            java.lang.String r19 = r0.k()
            r23 = 0
            r24 = 8
            r21 = 0
            r20 = r33
            r22 = r1
            Op.C10865w.h(r18, r19, r20, r21, r22, r23, r24)
        L_0x05d3:
            r1.P()
            r1.x()
            r1.x()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x05e5
            U0.C4895p.R()
        L_0x05e5:
            r10 = r38
        L_0x05e7:
            U0.Y0 r15 = r1.n()
            if (r15 == 0) goto L_0x061b
            Op.X r13 = new Op.X
            r0 = r13
            r1 = r44
            r2 = r45
            r3 = r46
            r4 = r47
            r5 = r48
            r6 = r49
            r7 = r50
            r8 = r51
            r9 = r52
            r11 = r31
            r12 = r32
            r14 = r13
            r13 = r57
            r42 = r14
            r14 = r58
            r43 = r15
            r15 = r59
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r1 = r42
            r0 = r43
            r0.a(r1)
        L_0x061b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.C10872z0.q0(Op.d1, nI.l, boolean, A0.f, s0.E, s0.E, Op.A, nI.a, nI.a, androidx.compose.ui.d, SC.P1, LC.b, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N r0(C17642l lVar, d1 d1Var) {
        lVar.invoke(new c1.c(d1Var.p().f()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s0(C17642l lVar, d1 d1Var) {
        lVar.invoke(new c1.a(d1Var.p().f(), d1Var.p().e().k(), d1Var.p().e().c()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N t0(C17642l lVar, d1 d1Var) {
        lVar.invoke(new c1.e(d1Var.p().f()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N u0(C17642l lVar, String str) {
        C17542s.j(str, "itemNo");
        lVar.invoke(new c1.b(str));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v0(C17642l lVar, Link link) {
        C17542s.j(link, "it");
        lVar.invoke(new c1.f(link));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w0(d1 d1Var, C17642l lVar, boolean z10, A0.f fVar, C5834E e10, C5834E e11, A a10, C17631a aVar, C17631a aVar2, androidx.compose.ui.d dVar, P1 p12, C13178b bVar, int i10, int i11, int i12, C4889m mVar, int i13) {
        q0(d1Var, lVar, z10, fVar, e10, e11, a10, aVar, aVar2, dVar, p12, bVar, mVar, M0.a(i10 | 1), M0.a(i11), i12);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x0(C17642l lVar, d1 d1Var) {
        lVar.invoke(new c1.d(d1Var.p().f(), d1Var.p().e().k()));
        return C16807N.f139792a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01a1  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03ba  */
    /* JADX WARNING: Removed duplicated region for block: B:212:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x011f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void y0(Op.d1 r31, nI.C17642l<? super Op.c1, XH.C16807N> r32, boolean r33, androidx.compose.ui.d r34, SC.P1 r35, LC.C13178b r36, s0.C5834E r37, s0.C5834E r38, boolean r39, A0.f r40, Op.A r41, nI.C17631a<XH.C16807N> r42, nI.C17631a<XH.C16807N> r43, U0.C4889m r44, int r45, int r46, int r47) {
        /*
            r15 = r31
            r14 = r32
            r13 = r45
            r12 = r46
            r11 = r47
            java.lang.String r0 = "productItem"
            kotlin.jvm.internal.C17542s.j(r15, r0)
            java.lang.String r0 = "eventHandler"
            kotlin.jvm.internal.C17542s.j(r14, r0)
            r0 = 120175174(0x729ba46, float:1.2768888E-34)
            r1 = r44
            U0.m r10 = r1.k(r0)
            r1 = r11 & 1
            if (r1 == 0) goto L_0x0024
            r1 = r13 | 6
            goto L_0x0034
        L_0x0024:
            r1 = r13 & 6
            if (r1 != 0) goto L_0x0033
            boolean r1 = r10.V(r15)
            if (r1 == 0) goto L_0x0030
            r1 = 4
            goto L_0x0031
        L_0x0030:
            r1 = 2
        L_0x0031:
            r1 = r1 | r13
            goto L_0x0034
        L_0x0033:
            r1 = r13
        L_0x0034:
            r4 = r11 & 2
            if (r4 == 0) goto L_0x003b
            r1 = r1 | 48
            goto L_0x004b
        L_0x003b:
            r4 = r13 & 48
            if (r4 != 0) goto L_0x004b
            boolean r4 = r10.F(r14)
            if (r4 == 0) goto L_0x0048
            r4 = 32
            goto L_0x004a
        L_0x0048:
            r4 = 16
        L_0x004a:
            r1 = r1 | r4
        L_0x004b:
            r4 = r11 & 4
            if (r4 == 0) goto L_0x0054
            r1 = r1 | 384(0x180, float:5.38E-43)
            r9 = r33
            goto L_0x0066
        L_0x0054:
            r4 = r13 & 384(0x180, float:5.38E-43)
            r9 = r33
            if (r4 != 0) goto L_0x0066
            boolean r4 = r10.b(r9)
            if (r4 == 0) goto L_0x0063
            r4 = 256(0x100, float:3.59E-43)
            goto L_0x0065
        L_0x0063:
            r4 = 128(0x80, float:1.794E-43)
        L_0x0065:
            r1 = r1 | r4
        L_0x0066:
            r4 = r11 & 8
            if (r4 == 0) goto L_0x006f
            r1 = r1 | 3072(0xc00, float:4.305E-42)
        L_0x006c:
            r2 = r34
            goto L_0x0082
        L_0x006f:
            r2 = r13 & 3072(0xc00, float:4.305E-42)
            if (r2 != 0) goto L_0x006c
            r2 = r34
            boolean r16 = r10.V(r2)
            if (r16 == 0) goto L_0x007e
            r16 = 2048(0x800, float:2.87E-42)
            goto L_0x0080
        L_0x007e:
            r16 = 1024(0x400, float:1.435E-42)
        L_0x0080:
            r1 = r1 | r16
        L_0x0082:
            r16 = r11 & 16
            if (r16 == 0) goto L_0x008b
            r1 = r1 | 24576(0x6000, float:3.4438E-41)
        L_0x0088:
            r3 = r35
            goto L_0x009e
        L_0x008b:
            r3 = r13 & 24576(0x6000, float:3.4438E-41)
            if (r3 != 0) goto L_0x0088
            r3 = r35
            boolean r18 = r10.V(r3)
            if (r18 == 0) goto L_0x009a
            r18 = 16384(0x4000, float:2.2959E-41)
            goto L_0x009c
        L_0x009a:
            r18 = 8192(0x2000, float:1.14794E-41)
        L_0x009c:
            r1 = r1 | r18
        L_0x009e:
            r18 = 196608(0x30000, float:2.75506E-40)
            r18 = r13 & r18
            if (r18 != 0) goto L_0x00b8
            r18 = r11 & 32
            r5 = r36
            if (r18 != 0) goto L_0x00b3
            boolean r19 = r10.F(r5)
            if (r19 == 0) goto L_0x00b3
            r19 = 131072(0x20000, float:1.83671E-40)
            goto L_0x00b5
        L_0x00b3:
            r19 = 65536(0x10000, float:9.18355E-41)
        L_0x00b5:
            r1 = r1 | r19
            goto L_0x00ba
        L_0x00b8:
            r5 = r36
        L_0x00ba:
            r19 = r11 & 64
            r20 = 1572864(0x180000, float:2.204052E-39)
            if (r19 == 0) goto L_0x00c5
            r1 = r1 | r20
            r6 = r37
            goto L_0x00d8
        L_0x00c5:
            r20 = r13 & r20
            r6 = r37
            if (r20 != 0) goto L_0x00d8
            boolean r21 = r10.V(r6)
            if (r21 == 0) goto L_0x00d4
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L_0x00d6
        L_0x00d4:
            r21 = 524288(0x80000, float:7.34684E-40)
        L_0x00d6:
            r1 = r1 | r21
        L_0x00d8:
            r7 = r11 & 128(0x80, float:1.794E-43)
            r22 = 12582912(0xc00000, float:1.7632415E-38)
            if (r7 == 0) goto L_0x00e3
            r1 = r1 | r22
            r8 = r38
            goto L_0x00f6
        L_0x00e3:
            r22 = r13 & r22
            r8 = r38
            if (r22 != 0) goto L_0x00f6
            boolean r23 = r10.V(r8)
            if (r23 == 0) goto L_0x00f2
            r23 = 8388608(0x800000, float:1.17549435E-38)
            goto L_0x00f4
        L_0x00f2:
            r23 = 4194304(0x400000, float:5.877472E-39)
        L_0x00f4:
            r1 = r1 | r23
        L_0x00f6:
            r0 = r11 & 256(0x100, float:3.59E-43)
            r24 = 100663296(0x6000000, float:2.4074124E-35)
            if (r0 == 0) goto L_0x0101
            r1 = r1 | r24
            r2 = r39
            goto L_0x0114
        L_0x0101:
            r24 = r13 & r24
            r2 = r39
            if (r24 != 0) goto L_0x0114
            boolean r24 = r10.b(r2)
            if (r24 == 0) goto L_0x0110
            r24 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0112
        L_0x0110:
            r24 = 33554432(0x2000000, float:9.403955E-38)
        L_0x0112:
            r1 = r1 | r24
        L_0x0114:
            r2 = r11 & 512(0x200, float:7.175E-43)
            r24 = 805306368(0x30000000, float:4.656613E-10)
            if (r2 == 0) goto L_0x011f
            r1 = r1 | r24
            r3 = r40
            goto L_0x0132
        L_0x011f:
            r24 = r13 & r24
            r3 = r40
            if (r24 != 0) goto L_0x0132
            boolean r24 = r10.V(r3)
            if (r24 == 0) goto L_0x012e
            r24 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x0130
        L_0x012e:
            r24 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0130:
            r1 = r1 | r24
        L_0x0132:
            r3 = r11 & 1024(0x400, float:1.435E-42)
            if (r3 == 0) goto L_0x013b
            r17 = r12 | 6
            r5 = r41
            goto L_0x0151
        L_0x013b:
            r24 = r12 & 6
            r5 = r41
            if (r24 != 0) goto L_0x014f
            boolean r24 = r10.V(r5)
            if (r24 == 0) goto L_0x014a
            r17 = 4
            goto L_0x014c
        L_0x014a:
            r17 = 2
        L_0x014c:
            r17 = r12 | r17
            goto L_0x0151
        L_0x014f:
            r17 = r12
        L_0x0151:
            r5 = r11 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x015a
            r17 = r17 | 48
        L_0x0157:
            r6 = r17
            goto L_0x016e
        L_0x015a:
            r24 = r12 & 48
            r6 = r42
            if (r24 != 0) goto L_0x0157
            boolean r24 = r10.F(r6)
            if (r24 == 0) goto L_0x0169
            r18 = 32
            goto L_0x016b
        L_0x0169:
            r18 = 16
        L_0x016b:
            r17 = r17 | r18
            goto L_0x0157
        L_0x016e:
            r8 = r11 & 4096(0x1000, float:5.74E-42)
            if (r8 == 0) goto L_0x0177
            r6 = r6 | 384(0x180, float:5.38E-43)
        L_0x0174:
            r9 = r43
            goto L_0x018a
        L_0x0177:
            r9 = r12 & 384(0x180, float:5.38E-43)
            if (r9 != 0) goto L_0x0174
            r9 = r43
            boolean r17 = r10.F(r9)
            if (r17 == 0) goto L_0x0186
            r21 = 256(0x100, float:3.59E-43)
            goto L_0x0188
        L_0x0186:
            r21 = 128(0x80, float:1.794E-43)
        L_0x0188:
            r6 = r6 | r21
        L_0x018a:
            r17 = 306783379(0x12492493, float:6.34695E-28)
            r9 = r1 & r17
            r12 = 306783378(0x12492492, float:6.3469493E-28)
            if (r9 != r12) goto L_0x01bb
            r9 = r6 & 147(0x93, float:2.06E-43)
            r12 = 146(0x92, float:2.05E-43)
            if (r9 != r12) goto L_0x01bb
            boolean r9 = r10.l()
            if (r9 != 0) goto L_0x01a1
            goto L_0x01bb
        L_0x01a1:
            r10.L()
            r4 = r34
            r5 = r35
            r6 = r36
            r7 = r37
            r8 = r38
            r9 = r39
            r11 = r41
            r12 = r42
            r13 = r43
            r15 = r10
            r10 = r40
            goto L_0x03b4
        L_0x01bb:
            r10.G()
            r9 = r13 & 1
            if (r9 == 0) goto L_0x01ea
            boolean r9 = r10.O()
            if (r9 == 0) goto L_0x01c9
            goto L_0x01ea
        L_0x01c9:
            r10.L()
            r0 = r11 & 32
            if (r0 == 0) goto L_0x01d4
            r0 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r0
        L_0x01d4:
            r12 = r34
            r17 = r35
            r18 = r36
            r19 = r37
            r20 = r38
            r21 = r39
            r22 = r40
            r24 = r41
            r25 = r42
            r26 = r43
            goto L_0x02ad
        L_0x01ea:
            if (r4 == 0) goto L_0x01ef
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            goto L_0x01f1
        L_0x01ef:
            r4 = r34
        L_0x01f1:
            if (r16 == 0) goto L_0x01f6
            SC.P1 r9 = SC.P1.Small
            goto L_0x01f8
        L_0x01f6:
            r9 = r35
        L_0x01f8:
            r16 = r11 & 32
            if (r16 == 0) goto L_0x020a
            LC.b$b r12 = new LC.b$b
            r34 = r4
            gs.h$a r4 = gs.h.a.XXXS
            r12.<init>(r4)
            r4 = -458753(0xfffffffffff8ffff, float:NaN)
            r1 = r1 & r4
            goto L_0x020e
        L_0x020a:
            r34 = r4
            r12 = r36
        L_0x020e:
            if (r19 == 0) goto L_0x021c
            r4 = 8
            float r4 = (float) r4
            float r4 = c2.h.B(r4)
            s0.E r4 = androidx.compose.foundation.layout.D.a(r4)
            goto L_0x021e
        L_0x021c:
            r4 = r37
        L_0x021e:
            r35 = r1
            if (r7 == 0) goto L_0x022d
            r7 = 0
            float r1 = (float) r7
            float r1 = c2.h.B(r1)
            s0.E r1 = androidx.compose.foundation.layout.D.a(r1)
            goto L_0x022f
        L_0x022d:
            r1 = r38
        L_0x022f:
            if (r0 == 0) goto L_0x0233
            r0 = 1
            goto L_0x0235
        L_0x0233:
            r0 = r39
        L_0x0235:
            if (r2 == 0) goto L_0x0239
            r2 = 0
            goto L_0x023b
        L_0x0239:
            r2 = r40
        L_0x023b:
            if (r3 == 0) goto L_0x0240
            Op.A r3 = Op.A.DISABLED
            goto L_0x0242
        L_0x0240:
            r3 = r41
        L_0x0242:
            if (r5 == 0) goto L_0x0264
            r5 = 753595323(0x2ceaf3bb, float:6.6777395E-12)
            r10.W(r5)
            java.lang.Object r5 = r10.D()
            U0.m$a r7 = U0.C4889m.f14007a
            java.lang.Object r7 = r7.a()
            if (r5 != r7) goto L_0x025e
            Op.Q r5 = new Op.Q
            r5.<init>()
            r10.u(r5)
        L_0x025e:
            nI.a r5 = (nI.C17631a) r5
            r10.P()
            goto L_0x0266
        L_0x0264:
            r5 = r42
        L_0x0266:
            if (r8 == 0) goto L_0x029e
            r7 = 753596635(0x2ceaf8db, float:6.6783085E-12)
            r10.W(r7)
            java.lang.Object r7 = r10.D()
            U0.m$a r8 = U0.C4889m.f14007a
            java.lang.Object r8 = r8.a()
            if (r7 != r8) goto L_0x0282
            Op.c0 r7 = new Op.c0
            r7.<init>()
            r10.u(r7)
        L_0x0282:
            nI.a r7 = (nI.C17631a) r7
            r10.P()
            r21 = r0
            r20 = r1
            r22 = r2
            r24 = r3
            r19 = r4
            r25 = r5
            r26 = r7
        L_0x0295:
            r17 = r9
            r18 = r12
            r12 = r34
            r1 = r35
            goto L_0x02ad
        L_0x029e:
            r26 = r43
            r21 = r0
            r20 = r1
            r22 = r2
            r24 = r3
            r19 = r4
            r25 = r5
            goto L_0x0295
        L_0x02ad:
            r10.y()
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x02be
            java.lang.String r0 = "com.ingka.ikea.design.ui.product.ProductItemComposable (ProductItemComposable.kt:118)"
            r2 = 120175174(0x729ba46, float:1.2768888E-34)
            U0.C4895p.S(r2, r1, r6, r0)
        L_0x02be:
            r0 = 753598324(0x2ceaff74, float:6.679041E-12)
            r10.W(r0)
            java.lang.Object r0 = r10.D()
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r0 != r2) goto L_0x02d8
            Op.n0 r0 = new Op.n0
            r0.<init>()
            r10.u(r0)
        L_0x02d8:
            nI.l r0 = (nI.C17642l) r0
            r10.P()
            r2 = 0
            r3 = 0
            r4 = 1
            androidx.compose.ui.d r9 = L1.o.d(r12, r3, r0, r4, r2)
            if (r21 == 0) goto L_0x0347
            r0 = 1886782060(0x7076026c, float:3.0454496E29)
            r10.W(r0)
            if (r20 != 0) goto L_0x02f9
            float r0 = (float) r3
            float r0 = c2.h.B(r0)
            s0.E r0 = androidx.compose.foundation.layout.D.a(r0)
            r5 = r0
            goto L_0x02fb
        L_0x02f9:
            r5 = r20
        L_0x02fb:
            r0 = r1 & 1022(0x3fe, float:1.432E-42)
            int r2 = r1 >> 18
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            int r2 = r1 >> 6
            r3 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r6 << 18
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 234881024(0xe000000, float:1.5777218E-30)
            r2 = r2 & r3
            r16 = r0 | r2
            int r0 = r1 >> 12
            r23 = r0 & 126(0x7e, float:1.77E-43)
            r27 = 0
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r22
            r4 = r19
            r6 = r24
            r7 = r25
            r8 = r26
            r34 = r10
            r10 = r17
            r11 = r18
            r28 = r12
            r12 = r34
            r13 = r16
            r14 = r23
            r15 = r27
            q0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r34.P()
            r15 = r34
            goto L_0x0397
        L_0x0347:
            r34 = r10
            r28 = r12
            r0 = 1887386095(0x707f39ef, float:3.1595486E29)
            r15 = r34
            r15.W(r0)
            r0 = r1 & 1022(0x3fe, float:1.432E-42)
            int r2 = r1 >> 18
            r2 = r2 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            int r3 = r1 >> 6
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r6 << 15
            r3 = 458752(0x70000, float:6.42848E-40)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 3670016(0x380000, float:5.142788E-39)
            r3 = r3 & r2
            r0 = r0 | r3
            r3 = 29360128(0x1c00000, float:7.052966E-38)
            r2 = r2 & r3
            r0 = r0 | r2
            int r2 = r1 << 15
            r3 = 1879048192(0x70000000, float:1.58456325E29)
            r2 = r2 & r3
            r12 = r0 | r2
            int r0 = r1 >> 15
            r13 = r0 & 14
            r14 = 0
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r22
            r4 = r19
            r5 = r24
            r6 = r25
            r7 = r26
            r8 = r9
            r9 = r17
            r10 = r18
            r11 = r15
            d0(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r15.P()
        L_0x0397:
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x03a0
            U0.C4895p.R()
        L_0x03a0:
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r24
            r12 = r25
            r13 = r26
            r4 = r28
        L_0x03b4:
            U0.Y0 r15 = r15.n()
            if (r15 == 0) goto L_0x03d7
            Op.s0 r14 = new Op.s0
            r0 = r14
            r1 = r31
            r2 = r32
            r3 = r33
            r29 = r14
            r14 = r45
            r30 = r15
            r15 = r46
            r16 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r1 = r29
            r0 = r30
            r0.a(r1)
        L_0x03d7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Op.C10872z0.y0(Op.d1, nI.l, boolean, androidx.compose.ui.d, SC.P1, LC.b, s0.E, s0.E, boolean, A0.f, Op.A, nI.a, nI.a, U0.m, int, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N z0() {
        return C16807N.f139792a;
    }
}
