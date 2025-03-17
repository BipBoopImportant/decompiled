package com.ingka.ikea.commercialcontent.impl.view;

import E1.C4488v;
import E1.C4489w;
import E1.I;
import G1.C4504g;
import HJ.C15854t;
import Jo.a;
import KJ.C15985a;
import KJ.C15987c;
import KJ.C15990f;
import Mo.B;
import Mo.C10779b;
import Mo.C10780c;
import Mo.C10781d;
import Mo.C10788k;
import Mo.C10789l;
import Mo.C10790m;
import Mo.C10791n;
import Mo.C10792o;
import Mo.C10793p;
import Mo.C10794q;
import No.b;
import O0.C4762x0;
import O0.H0;
import O0.L0;
import Op.C10828d;
import Op.C10832f;
import Op.C10850o;
import Op.C10867x;
import Op.K;
import Op.c1;
import Op.d1;
import QJ.F0;
import QJ.Q;
import QJ.T;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.G0;
import SC.H2;
import SC.Y2;
import TC.C13679b;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.L;
import U0.M;
import U0.M0;
import U0.P;
import U0.Y0;
import U0.o1;
import XH.C16807N;
import XH.y;
import YH.C16877v;
import android.graphics.drawable.Drawable;
import android.view.Window;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.RecyclerView;
import c1.C5264a;
import com.ingka.ikea.commercialcontent.impl.view.l;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Media;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gs.e;
import i1.C5437c;
import jC.C14615b;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import lC.l;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import o1.C5667g;
import p0.s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import s0.C5834E;
import s0.C5844O;
import s0.C5848T;
import s0.C5850V;
import s0.C5852X;
import s0.C5862h;
import t0.C5934A;
import t0.C5937b;
import t0.C5938c;
import t0.x;
import uK.C18146a;

@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a[\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u000f\u0010\u0017\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001f\u0010\u0019\u001a\u00020\u00042\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001am\u0010!\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u001d2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b!\u0010\"\u001aI\u0010+\u001a\u00020\u0004*\u00020#2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020'2\b\u0010*\u001a\u0004\u0018\u00010)2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a?\u00100\u001a\u00020\u0004*\u00020#2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010-2\u0006\u0010%\u001a\u00020$2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a7\u00104\u001a\u00020\u0004*\u00020#2\u0006\u00103\u001a\u0002022\u0006\u0010%\u001a\u00020$2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b4\u00105\u001a%\u00107\u001a\u00020\u0004*\u00020#2\b\u00106\u001a\u0004\u0018\u00010\u001f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b7\u00108\u001a%\u0010:\u001a\u00020\u0004*\u00020#2\b\u00109\u001a\u0004\u0018\u00010\u001f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b:\u00108\u001a?\u0010>\u001a\u00020\u0004*\u00020#2\u000e\u0010<\u001a\n\u0012\u0004\u0012\u00020;\u0018\u00010-2\u0006\u0010%\u001a\u00020$2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b>\u00101\u001a\u0013\u0010?\u001a\u00020\u0004*\u00020#H\u0002¢\u0006\u0004\b?\u0010@\u001a;\u0010E\u001a\u00020\u00042\u0006\u0010B\u001a\u00020A2\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00040\u001d2\b\b\u0002\u0010D\u001a\u00020CH\u0003¢\u0006\u0004\bE\u0010F\u001a\u001f\u0010J\u001a\u00020\u00042\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020\u001fH\u0003¢\u0006\u0004\bJ\u0010K\u001a!\u0010N\u001a\u00020\u00042\u0006\u0010L\u001a\u00020\u001f2\b\u0010M\u001a\u0004\u0018\u00010\u001fH\u0003¢\u0006\u0004\bN\u0010O\u001a/\u0010S\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u001f2\u0006\u0010Q\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020\u001fH\u0002¢\u0006\u0004\bS\u0010T\"\u0014\u0010H\u001a\u00020G8\u0002X\u0004¢\u0006\u0006\n\u0004\bU\u0010V\"\u001a\u0010\\\u001a\u00020W8\u0000X\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u001a\u0010a\u001a\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`¨\u0006b²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u0002²\u0006\u000e\u0010\u0012\u001a\u00020\u00118\n@\nX\u0002²\u0006\u000e\u0010\u0014\u001a\u00020\u00138\n@\nX\u0002"}, d2 = {"LNo/b;", "viewModel", "Lkotlin/Function1;", "LOp/c1;", "LXH/N;", "onProductItemEvent", "Lcom/ingka/ikea/commercialcontent/impl/view/l;", "onScreenUiEvent", "t", "(LNo/b;LnI/l;LnI/l;LU0/m;I)V", "LNo/b$b;", "uiState", "Lkotlin/Function0;", "onErrorTryAgainClicked", "onShoppingListModifiedConsumed", "r", "(LNo/b$b;LnI/l;LnI/a;LnI/l;LnI/a;LU0/m;I)V", "LjC/b;", "headerImageIconColor", "", "showStatusbar", "I", "(LjC/b;ZLU0/m;I)V", "G", "(LU0/m;I)V", "D", "(LnI/a;LU0/m;II)V", "LNo/i;", "story", "Lkotlin/Function2;", "Landroid/graphics/drawable/Drawable;", "", "onHeaderImageLoaded", "y", "(LNo/i;LnI/l;LnI/l;LnI/p;LnI/l;LU0/m;I)V", "Lt0/x;", "", "sceneIndex", "sceneId", "LJo/a$a;", "sceneType", "Lkp/g;", "productCategory", "i0", "(Lt0/x;ILjava/lang/String;LJo/a$a;Lkp/g;LnI/l;)V", "LKJ/c;", "LOp/d1;", "productsPL", "h0", "(Lt0/x;LKJ/c;ILnI/l;)V", "LNo/a;", "carouselTitle", "d0", "(Lt0/x;LNo/a;ILnI/l;)V", "titlePH", "j0", "(Lt0/x;Ljava/lang/String;I)V", "descriptionPH", "f0", "Lkp/i;", "mediaPH", "onMediaPHClicked", "g0", "c0", "(Lt0/x;)V", "Lcom/ingka/ikea/core/model/Media;", "media", "Landroidx/compose/ui/d;", "modifier", "K", "(Lcom/ingka/ikea/core/model/Media;LnI/p;Landroidx/compose/ui/d;LU0/m;II)V", "LNo/g;", "quoteUiModel", "storyId", "N", "(LNo/g;Ljava/lang/String;LU0/m;I)V", "title", "description", "Q", "(Ljava/lang/String;Ljava/lang/String;LU0/m;I)V", "tag", "image", "url", "e0", "(Ljava/lang/String;Landroid/graphics/drawable/Drawable;Ljava/lang/String;Ljava/lang/String;)V", "a", "LNo/g;", "Lcom/ingka/ikea/core/model/Media$Image;", "b", "Lcom/ingka/ikea/core/model/Media$Image;", "getHeadlineMedia", "()Lcom/ingka/ikea/core/model/Media$Image;", "headlineMedia", "c", "LNo/i;", "getFakeStory", "()LNo/i;", "fakeStory", "commercialcontent-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final No.g f94727a = new No.g("id", "Saying", "Quotee", "Role, Organisation", new Image("https://i.imgur.com/2EtSLdm.jpeg", "altText"));

    /* renamed from: b  reason: collision with root package name */
    private static final Media.Image f94728b;

    /* renamed from: c  reason: collision with root package name */
    private static final No.i f94729c;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.commercialcontent.impl.view.a$a  reason: collision with other inner class name */
    static final class C2111a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f94730a;

        C2111a(L0 l02) {
            this.f94730a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-600393822, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.CommercialContentComposable.<anonymous> (CommercialContentComposable.kt:143)");
                }
                Y2.c(this.f94730a, (androidx.compose.ui.d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b.C1708b f94731a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f94732b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<c1, C16807N> f94733c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<l, C16807N> f94734d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ L0 f94735e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f94736f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.commercialcontent.impl.view.CommercialContentComposableKt$CommercialContentComposable$2$1$1$1$1", f = "CommercialContentComposable.kt", l = {182}, m = "invokeSuspend")
        /* renamed from: com.ingka.ikea.commercialcontent.impl.view.a$b$a  reason: collision with other inner class name */
        static final class C2112a extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f94737c;

            /* renamed from: d  reason: collision with root package name */
            int f94738d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ jC.i f94739e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Drawable f94740f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ C4899r0<C14615b> f94741g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C2112a(jC.i iVar, Drawable drawable, C4899r0<C14615b> r0Var, C17164e<? super C2112a> eVar) {
                super(2, eVar);
                this.f94739e = iVar;
                this.f94740f = drawable;
                this.f94741g = r0Var;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C2112a(this.f94739e, this.f94740f, this.f94741g, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C2112a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C4899r0<C14615b> r0Var;
                Object f10 = C17187b.f();
                int i10 = this.f94738d;
                if (i10 == 0) {
                    y.b(obj);
                    C4899r0<C14615b> r0Var2 = this.f94741g;
                    lC.l a10 = this.f94739e.a();
                    Drawable drawable = this.f94740f;
                    this.f94737c = r0Var2;
                    this.f94738d = 1;
                    Object a11 = l.a.a(a10, drawable, (C14615b) null, false, this, 6, (Object) null);
                    if (a11 == f10) {
                        return f10;
                    }
                    r0Var = r0Var2;
                    obj = a11;
                } else if (i10 == 1) {
                    r0Var = (C4899r0) this.f94737c;
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.p(r0Var, (C14615b) obj);
                return C16807N.f139792a;
            }
        }

        b(b.C1708b bVar, C17631a<C16807N> aVar, C17642l<? super c1, C16807N> lVar, C17642l<? super l, C16807N> lVar2, L0 l02, C17631a<C16807N> aVar2) {
            this.f94731a = bVar;
            this.f94732b = aVar;
            this.f94733c = lVar;
            this.f94734d = lVar2;
            this.f94735e = l02;
            this.f94736f = aVar2;
        }

        private static final C14615b j(C4899r0<C14615b> r0Var) {
            return r0Var.getValue();
        }

        /* access modifiers changed from: private */
        public static final C16807N k(C4899r0 r0Var, boolean z10) {
            t(r0Var, z10);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(C17642l lVar, String str) {
            C17542s.j(str, "listId");
            lVar.invoke(new l.f(str));
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N n(C17642l lVar) {
            lVar.invoke(l.a.f94785a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final void p(C4899r0<C14615b> r0Var, C14615b bVar) {
            r0Var.setValue(bVar);
        }

        /* access modifiers changed from: private */
        public static final C4899r0 q() {
            return u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
        }

        private static final boolean s(C4899r0<Boolean> r0Var) {
            return r0Var.getValue().booleanValue();
        }

        private static final void t(C4899r0<Boolean> r0Var, boolean z10) {
            r0Var.setValue(Boolean.valueOf(z10));
        }

        /* access modifiers changed from: private */
        public static final C16807N u(Q q10, b.C1708b bVar, jC.i iVar, C4899r0 r0Var, Drawable drawable, String str) {
            C17542s.j(drawable, "drawable");
            C17542s.j(str, "url");
            F0 unused = C16314k.d(q10, (C17168i) null, (T) null, new C2112a(iVar, drawable, r0Var, (C17164e<? super C2112a>) null), 3, (Object) null);
            a.e0("headlineMedia", drawable, ((b.C1708b.d) bVar).a().c(), str);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: nI.p} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:90:0x02f4  */
        /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(s0.C5834E r22, U0.C4889m r23, int r24) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r13 = r23
                java.lang.String r2 = "contentPadding"
                kotlin.jvm.internal.C17542s.j(r1, r2)
                r2 = r24 & 6
                if (r2 != 0) goto L_0x001b
                boolean r2 = r13.V(r1)
                if (r2 == 0) goto L_0x0017
                r2 = 4
                goto L_0x0018
            L_0x0017:
                r2 = 2
            L_0x0018:
                r2 = r24 | r2
                goto L_0x001d
            L_0x001b:
                r2 = r24
            L_0x001d:
                r3 = r2 & 19
                r4 = 18
                if (r3 != r4) goto L_0x002f
                boolean r3 = r23.l()
                if (r3 != 0) goto L_0x002a
                goto L_0x002f
            L_0x002a:
                r23.L()
                goto L_0x02f7
            L_0x002f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x003e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.commercialcontent.impl.view.CommercialContentComposable.<anonymous> (CommercialContentComposable.kt:147)"
                r5 = 510696363(0x1e709bab, float:1.27376856E-20)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x003e:
                androidx.compose.ui.d$a r14 = androidx.compose.ui.d.f18749a
                r2 = 0
                r9 = 1
                r10 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.J.f(r14, r2, r9, r10)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.h(r2, r1)
                No.b$b r11 = r0.f94731a
                nI.a<XH.N> r12 = r0.f94732b
                nI.l<Op.c1, XH.N> r15 = r0.f94733c
                nI.l<com.ingka.ikea.commercialcontent.impl.view.l, XH.N> r7 = r0.f94734d
                O0.L0 r6 = r0.f94735e
                nI.a<XH.N> r5 = r0.f94736f
                i1.c$a r2 = i1.C5437c.f24302a
                i1.c r2 = r2.o()
                r4 = 0
                E1.I r2 = androidx.compose.foundation.layout.C5077h.h(r2, r4)
                int r3 = U0.C4883j.a(r13, r4)
                U0.y r9 = r23.s()
                androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r13, r1)
                G1.g$a r16 = G1.C4504g.f6515W
                nI.a r8 = r16.a()
                U0.f r18 = r23.m()
                if (r18 != 0) goto L_0x007d
                U0.C4883j.c()
            L_0x007d:
                r23.I()
                boolean r18 = r23.i()
                if (r18 == 0) goto L_0x008a
                r13.p(r8)
                goto L_0x008d
            L_0x008a:
                r23.t()
            L_0x008d:
                U0.m r8 = U0.F1.a(r23)
                nI.p r10 = r16.c()
                U0.F1.c(r8, r2, r10)
                nI.p r2 = r16.e()
                U0.F1.c(r8, r9, r2)
                nI.p r2 = r16.b()
                boolean r9 = r8.i()
                if (r9 != 0) goto L_0x00b7
                java.lang.Object r9 = r8.D()
                java.lang.Integer r10 = java.lang.Integer.valueOf(r3)
                boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r10)
                if (r9 != 0) goto L_0x00c5
            L_0x00b7:
                java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
                r8.u(r9)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r8.w(r3, r2)
            L_0x00c5:
                nI.p r2 = r16.d()
                U0.F1.c(r8, r1, r2)
                androidx.compose.foundation.layout.j r1 = androidx.compose.foundation.layout.C5079j.f18125a
                boolean r1 = n0.C5607m.a(r13, r4)
                r2 = -576272502(0xffffffffdda6c78a, float:-1.50221573E18)
                r13.W(r2)
                java.lang.Object r2 = r23.D()
                U0.m$a r9 = U0.C4889m.f14007a
                java.lang.Object r3 = r9.a()
                if (r2 != r3) goto L_0x00f6
                if (r1 == 0) goto L_0x00eb
                jC.b$c r1 = jC.C14615b.c.f127858b
            L_0x00e8:
                r2 = 2
                r3 = 0
                goto L_0x00ee
            L_0x00eb:
                jC.b$b r1 = jC.C14615b.C3152b.f127857b
                goto L_0x00e8
            L_0x00ee:
                U0.r0 r1 = U0.u1.e(r1, r3, r2, r3)
                r13.u(r1)
                r2 = r1
            L_0x00f6:
                r8 = r2
                U0.r0 r8 = (U0.C4899r0) r8
                r23.P()
                java.lang.Object[] r1 = new java.lang.Object[r4]
                r2 = -576267156(0xffffffffdda6dc6c, float:-1.50295048E18)
                r13.W(r2)
                java.lang.Object r2 = r23.D()
                java.lang.Object r3 = r9.a()
                if (r2 != r3) goto L_0x0116
                com.ingka.ikea.commercialcontent.impl.view.b r2 = new com.ingka.ikea.commercialcontent.impl.view.b
                r2.<init>()
                r13.u(r2)
            L_0x0116:
                r10 = r2
                nI.a r10 = (nI.C17631a) r10
                r23.P()
                r16 = 3072(0xc00, float:4.305E-42)
                r19 = 6
                r2 = 0
                r3 = 0
                r4 = r10
                r10 = r5
                r5 = r23
                r20 = r6
                r6 = r16
                r22 = r7
                r7 = r19
                java.lang.Object r1 = f1.C5301c.e(r1, r2, r3, r4, r5, r6, r7)
                r7 = r1
                U0.r0 r7 = (U0.C4899r0) r7
                java.lang.Object r1 = r23.D()
                java.lang.Object r2 = r9.a()
                if (r1 != r2) goto L_0x014e
                dI.j r1 = dI.C17169j.f142968a
                QJ.Q r1 = U0.P.k(r1, r13)
                U0.B r2 = new U0.B
                r2.<init>(r1)
                r13.u(r2)
                r1 = r2
            L_0x014e:
                U0.B r1 = (U0.B) r1
                QJ.Q r1 = r1.a()
                r2 = 0
                r5 = 0
                r6 = 1
                jC.i r3 = jC.k.c(r2, r13, r5, r6)
                jC.b r2 = j(r8)
                boolean r4 = s(r7)
                com.ingka.ikea.commercialcontent.impl.view.a.I(r2, r4, r13, r5)
                boolean r2 = r11 instanceof No.b.C1708b.C1709b
                if (r2 == 0) goto L_0x017d
                r1 = -576257562(0xffffffffdda701e6, float:-1.50426907E18)
                r13.W(r1)
                com.ingka.ikea.commercialcontent.impl.view.a.G(r13, r5)
                r23.P()
                XH.N r1 = XH.C16807N.f139792a
            L_0x0178:
                r12 = r22
                r11 = r5
                goto L_0x0294
            L_0x017d:
                boolean r2 = r11 instanceof No.b.C1708b.a
                if (r2 == 0) goto L_0x0190
                r1 = -684030048(0xffffffffd73a87a0, float:-2.05091668E14)
                r13.W(r1)
                com.ingka.ikea.commercialcontent.impl.view.a.D(r12, r13, r5, r5)
                r23.P()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0178
            L_0x0190:
                boolean r2 = r11 instanceof No.b.C1708b.c
                if (r2 == 0) goto L_0x01a3
                r1 = -683883232(0xffffffffd73cc520, float:-2.07554831E14)
                r13.W(r1)
                com.ingka.ikea.commercialcontent.impl.view.a.D(r12, r13, r5, r5)
                r23.P()
                XH.N r1 = XH.C16807N.f139792a
                goto L_0x0178
            L_0x01a3:
                boolean r2 = r11 instanceof No.b.C1708b.d
                if (r2 == 0) goto L_0x02f8
                r2 = -683679686(0xffffffffd73fe03a, float:-2.10969767E14)
                r13.W(r2)
                r12 = r11
                No.b$b$d r12 = (No.b.C1708b.d) r12
                No.i r2 = r12.a()
                r4 = -576236952(0xffffffffdda75268, float:-1.50710169E18)
                r13.W(r4)
                boolean r4 = r13.F(r1)
                boolean r16 = r13.F(r3)
                r4 = r4 | r16
                boolean r16 = r13.F(r11)
                r4 = r4 | r16
                java.lang.Object r5 = r23.D()
                if (r4 != 0) goto L_0x01d6
                java.lang.Object r4 = r9.a()
                if (r5 != r4) goto L_0x01de
            L_0x01d6:
                com.ingka.ikea.commercialcontent.impl.view.c r5 = new com.ingka.ikea.commercialcontent.impl.view.c
                r5.<init>(r1, r11, r3, r8)
                r13.u(r5)
            L_0x01de:
                r4 = r5
                nI.p r4 = (nI.p) r4
                r23.P()
                r1 = -576218071(0xffffffffdda79c29, float:-1.50969667E18)
                r13.W(r1)
                boolean r1 = r13.V(r7)
                java.lang.Object r3 = r23.D()
                if (r1 != 0) goto L_0x01fa
                java.lang.Object r1 = r9.a()
                if (r3 != r1) goto L_0x0202
            L_0x01fa:
                com.ingka.ikea.commercialcontent.impl.view.d r3 = new com.ingka.ikea.commercialcontent.impl.view.d
                r3.<init>(r7)
                r13.u(r3)
            L_0x0202:
                r5 = r3
                nI.l r5 = (nI.C17642l) r5
                r23.P()
                r8 = 0
                r1 = r2
                r2 = r15
                r3 = r22
                r11 = 0
                r15 = r6
                r6 = r23
                r16 = r7
                r7 = r8
                com.ingka.ikea.commercialcontent.impl.view.a.y(r1, r2, r3, r4, r5, r6, r7)
                r1 = -576215861(0xffffffffdda7a4cb, float:-1.51000041E18)
                r13.W(r1)
                boolean r1 = s(r16)
                if (r1 == 0) goto L_0x022e
                r6 = 0
                r7 = 7
                r1 = 0
                r2 = 0
                r4 = 0
                r5 = r23
                kC.C14673d.b(r1, r2, r4, r5, r6, r7)
            L_0x022e:
                r23.P()
                No.i r1 = r12.a()
                KJ.c r1 = r1.e()
                r2 = -576211227(0xffffffffdda7b6e5, float:-1.5106373E18)
                r13.W(r2)
                if (r1 != 0) goto L_0x0242
                goto L_0x0249
            L_0x0242:
                r2 = 2
                r3 = 0
                HC.r.k(r1, r3, r13, r11, r2)
                XH.N r1 = XH.C16807N.f139792a
            L_0x0249:
                r23.P()
                sB.a r2 = r12.b()
                if (r2 != 0) goto L_0x0255
                r12 = r22
                goto L_0x0291
            L_0x0255:
                sB.a$a r1 = r2.a()
                sB.a$a r3 = sB.C15035a.C3239a.ADD
                if (r1 != r3) goto L_0x025f
                r5 = r15
                goto L_0x0260
            L_0x025f:
                r5 = r11
            L_0x0260:
                r1 = -634584830(0xffffffffda2d0102, float:-1.21740698E16)
                r13.W(r1)
                r12 = r22
                boolean r1 = r13.V(r12)
                java.lang.Object r3 = r23.D()
                if (r1 != 0) goto L_0x0278
                java.lang.Object r1 = r9.a()
                if (r3 != r1) goto L_0x0280
            L_0x0278:
                com.ingka.ikea.commercialcontent.impl.view.e r3 = new com.ingka.ikea.commercialcontent.impl.view.e
                r3.<init>(r12)
                r13.u(r3)
            L_0x0280:
                nI.l r3 = (nI.C17642l) r3
                r23.P()
                r7 = 6
                r8 = 0
                r1 = r20
                r4 = r10
                r6 = r23
                tB.C15062c.c(r1, r2, r3, r4, r5, r6, r7, r8)
                XH.N r1 = XH.C16807N.f139792a
            L_0x0291:
                r23.P()
            L_0x0294:
                r1 = 24
                float r1 = (float) r1
                float r15 = c2.h.B(r1)
                r1 = 52
                float r1 = (float) r1
                float r16 = c2.h.B(r1)
                r19 = 12
                r20 = 0
                r17 = 0
                r18 = 0
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r14, r15, r16, r17, r18, r19, r20)
                int r1 = uK.C18146a.f148719y
                int r2 = Oo.b.f84632f
                java.lang.String r2 = J1.j.b(r2, r13, r11)
                SC.H0 r5 = SC.H0.PrimaryInverseStatic
                SC.G0 r6 = SC.G0.Small
                r4 = -576171709(0xffffffffdda85143, float:-1.51606862E18)
                r13.W(r4)
                boolean r4 = r13.V(r12)
                java.lang.Object r7 = r23.D()
                if (r4 != 0) goto L_0x02d0
                java.lang.Object r4 = r9.a()
                if (r7 != r4) goto L_0x02d8
            L_0x02d0:
                com.ingka.ikea.commercialcontent.impl.view.f r7 = new com.ingka.ikea.commercialcontent.impl.view.f
                r7.<init>(r12)
                r13.u(r7)
            L_0x02d8:
                r9 = r7
                nI.a r9 = (nI.C17631a) r9
                r23.P()
                r11 = 221568(0x36180, float:3.10483E-40)
                r12 = 200(0xc8, float:2.8E-43)
                r4 = 0
                r7 = 0
                r8 = 0
                r10 = r23
                SC.F0.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r23.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x02f7
                U0.C4895p.R()
            L_0x02f7:
                return
            L_0x02f8:
                r1 = -576257820(0xffffffffdda700e4, float:-1.50423361E18)
                r13.W(r1)
                r23.P()
                XH.t r1 = new XH.t
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.commercialcontent.impl.view.a.b.i(s0.E, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            i((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
        c(Object obj) {
            super(0, obj, No.b.class, "loadData", "loadData()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((No.b) this.receiver).E();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends C17540p implements C17631a<C16807N> {
        d(Object obj) {
            super(0, obj, No.b.class, "onShoppingListModifiedConsumed", "onShoppingListModifiedConsumed()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((No.b) this.receiver).I();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class e implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ No.i f94742a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f94743b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ p<Drawable, String, C16807N> f94744c;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ingka/ikea/commercialcontent/impl/view/a$e$a", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.commercialcontent.impl.view.a$e$a  reason: collision with other inner class name */
        public static final class C2113a implements L {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l f94745a;

            public C2113a(C17642l lVar) {
                this.f94745a = lVar;
            }

            public void b() {
                this.f94745a.invoke(Boolean.TRUE);
            }
        }

        e(No.i iVar, C17642l<? super Boolean, C16807N> lVar, p<? super Drawable, ? super String, C16807N> pVar) {
            this.f94742a = iVar;
            this.f94743b = lVar;
            this.f94744c = pVar;
        }

        /* access modifiers changed from: private */
        public static final L e(C17642l lVar, M m10) {
            C17542s.j(m10, "$this$DisposableEffect");
            return new C2113a(lVar);
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar, C4488v vVar) {
            C17542s.j(vVar, "it");
            if (C5667g.n(C4489w.a(vVar).k()) <= 0.0f) {
                lVar.invoke(Boolean.TRUE);
            } else {
                lVar.invoke(Boolean.FALSE);
            }
            return C16807N.f139792a;
        }

        public final void c(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-2002730491, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.Content.<anonymous>.<anonymous>.<anonymous> (CommercialContentComposable.kt:318)");
                }
                if (this.f94742a.b() != null) {
                    mVar.W(-372946897);
                    Media b10 = this.f94742a.b();
                    mVar.W(126518084);
                    boolean V10 = mVar.V(this.f94743b);
                    C17642l<Boolean, C16807N> lVar = this.f94743b;
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new g(lVar);
                        mVar.u(D10);
                    }
                    mVar.P();
                    P.c(b10, (C17642l) D10, mVar, 0);
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    mVar.W(126525446);
                    boolean V11 = mVar.V(this.f94743b);
                    C17642l<Boolean, C16807N> lVar2 = this.f94743b;
                    Object D11 = mVar.D();
                    if (V11 || D11 == C4889m.f14007a.a()) {
                        D11 = new h(lVar2);
                        mVar.u(D11);
                    }
                    mVar.P();
                    a.K(this.f94742a.b(), this.f94744c, androidx.compose.ui.layout.c.a(aVar, (C17642l) D11), mVar, 0, 0);
                    mVar.P();
                } else {
                    mVar.W(-372127815);
                    this.f94743b.invoke(Boolean.TRUE);
                    C5844O.a(J.i(C5852X.e(androidx.compose.ui.d.f18749a), c2.h.B((float) 40)), mVar, 0);
                    mVar.P();
                }
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            c((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ No.i f94746a;

        f(No.i iVar) {
            this.f94746a = iVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1348338322, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.Content.<anonymous>.<anonymous>.<anonymous> (CommercialContentComposable.kt:354)");
                }
                a.Q(this.f94746a.g(), this.f94746a.d(), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ No.g f94747a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ No.i f94748b;

        g(No.g gVar, No.i iVar) {
            this.f94747a = gVar;
            this.f94748b = iVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1928639238, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommercialContentComposable.kt:365)");
                }
                a.N(this.f94747a, this.f94748b.c(), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class h implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ No.g f94749a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ No.i f94750b;

        h(No.g gVar, No.i iVar) {
            this.f94749a = gVar;
            this.f94750b = iVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(875993880, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CommercialContentComposable.kt:426)");
                }
                a.N(this.f94749a, this.f94750b.c(), mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.commercialcontent.impl.view.CommercialContentComposableKt$HandleStatusbarIconColor$1$1", f = "CommercialContentComposable.kt", l = {}, m = "invokeSuspend")
    static final class i extends kotlin.coroutines.jvm.internal.l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94751c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ jC.i f94752d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f94753e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C14615b f94754f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(jC.i iVar, boolean z10, C14615b bVar, C17164e<? super i> eVar) {
            super(2, eVar);
            this.f94752d = iVar;
            this.f94753e = z10;
            this.f94754f = bVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new i(this.f94752d, this.f94753e, this.f94754f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((i) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f94751c == 0) {
                y.b(obj);
                this.f94752d.a().a(this.f94753e ? C14615b.e.f127859b : this.f94754f);
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ No.a f94755a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<l, C16807N> f94756b;

        j(No.a aVar, C17642l<? super l, C16807N> lVar) {
            this.f94755a = aVar;
            this.f94756b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, No.a aVar) {
            String d10 = aVar.d();
            if (d10 == null) {
                d10 = "";
            }
            lVar.invoke(new l.b(aVar.c(), d10));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r30, U0.C4889m r31, int r32) {
            /*
                r29 = this;
                r0 = r29
                r1 = r31
                r2 = r32
                java.lang.String r3 = "$this$item"
                r4 = r30
                kotlin.jvm.internal.C17542s.j(r4, r3)
                r3 = r2 & 17
                r15 = 16
                if (r3 != r15) goto L_0x001f
                boolean r3 = r31.l()
                if (r3 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r31.L()
                goto L_0x0251
            L_0x001f:
                boolean r3 = U0.C4895p.J()
                if (r3 == 0) goto L_0x002e
                r3 = -1
                java.lang.String r4 = "com.ingka.ikea.commercialcontent.impl.view.carouselTitle.<anonymous> (CommercialContentComposable.kt:496)"
                r5 = 643014850(0x2653a0c2, float:7.34232E-16)
                U0.C4895p.S(r5, r2, r3, r4)
            L_0x002e:
                No.a r14 = r0.f94755a
                nI.l<com.ingka.ikea.commercialcontent.impl.view.l, XH.N> r2 = r0.f94756b
                androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                androidx.compose.foundation.layout.d r10 = androidx.compose.foundation.layout.C5073d.f18068a
                androidx.compose.foundation.layout.d$m r3 = r10.g()
                i1.c$a r11 = i1.C5437c.f24302a
                i1.c$b r4 = r11.k()
                r12 = 0
                E1.I r3 = androidx.compose.foundation.layout.C5080k.a(r3, r4, r1, r12)
                int r4 = U0.C4883j.a(r1, r12)
                U0.y r5 = r31.s()
                androidx.compose.ui.d r6 = androidx.compose.ui.c.e(r1, r13)
                G1.g$a r16 = G1.C4504g.f6515W
                nI.a r7 = r16.a()
                U0.f r8 = r31.m()
                if (r8 != 0) goto L_0x0060
                U0.C4883j.c()
            L_0x0060:
                r31.I()
                boolean r8 = r31.i()
                if (r8 == 0) goto L_0x006d
                r1.p(r7)
                goto L_0x0070
            L_0x006d:
                r31.t()
            L_0x0070:
                U0.m r7 = U0.F1.a(r31)
                nI.p r8 = r16.c()
                U0.F1.c(r7, r3, r8)
                nI.p r3 = r16.e()
                U0.F1.c(r7, r5, r3)
                nI.p r3 = r16.b()
                boolean r5 = r7.i()
                if (r5 != 0) goto L_0x009a
                java.lang.Object r5 = r7.D()
                java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r8)
                if (r5 != 0) goto L_0x00a8
            L_0x009a:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r7.u(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r7.w(r4, r3)
            L_0x00a8:
                nI.p r3 = r16.d()
                U0.F1.c(r7, r6, r3)
                s0.h r3 = s0.C5862h.f28810a
                r3 = -1085673121(0xffffffffbf49f15f, float:-0.7888393)
                r1.W(r3)
                java.lang.String r3 = r14.c()
                if (r3 == 0) goto L_0x00f3
                r3 = -1085670682(0xffffffffbf49fae6, float:-0.78898466)
                r1.W(r3)
                boolean r3 = r1.V(r2)
                boolean r4 = r1.V(r14)
                r3 = r3 | r4
                java.lang.Object r4 = r31.D()
                if (r3 != 0) goto L_0x00da
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r3 = r3.a()
                if (r4 != r3) goto L_0x00e2
            L_0x00da:
                com.ingka.ikea.commercialcontent.impl.view.i r4 = new com.ingka.ikea.commercialcontent.impl.view.i
                r4.<init>(r2, r14)
                r1.u(r4)
            L_0x00e2:
                r7 = r4
                nI.a r7 = (nI.C17631a) r7
                r31.P()
                r8 = 7
                r9 = 0
                r4 = 0
                r5 = 0
                r6 = 0
                r3 = r13
                androidx.compose.ui.d r2 = androidx.compose.foundation.d.d(r3, r4, r5, r6, r7, r8, r9)
                goto L_0x00f4
            L_0x00f3:
                r2 = r13
            L_0x00f4:
                r31.P()
                androidx.compose.ui.d r2 = TC.e.i(r2)
                r3 = 24
                float r3 = (float) r3
                float r3 = c2.h.B(r3)
                r4 = 1
                r5 = 0
                r6 = 0
                androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.k(r2, r6, r3, r4, r5)
                androidx.compose.foundation.layout.d$e r3 = r10.f()
                i1.c$c r4 = r11.l()
                E1.I r3 = androidx.compose.foundation.layout.G.b(r3, r4, r1, r12)
                int r4 = U0.C4883j.a(r1, r12)
                U0.y r5 = r31.s()
                androidx.compose.ui.d r2 = androidx.compose.ui.c.e(r1, r2)
                nI.a r6 = r16.a()
                U0.f r7 = r31.m()
                if (r7 != 0) goto L_0x012e
                U0.C4883j.c()
            L_0x012e:
                r31.I()
                boolean r7 = r31.i()
                if (r7 == 0) goto L_0x013b
                r1.p(r6)
                goto L_0x013e
            L_0x013b:
                r31.t()
            L_0x013e:
                U0.m r6 = U0.F1.a(r31)
                nI.p r7 = r16.c()
                U0.F1.c(r6, r3, r7)
                nI.p r3 = r16.e()
                U0.F1.c(r6, r5, r3)
                nI.p r3 = r16.b()
                boolean r5 = r6.i()
                if (r5 != 0) goto L_0x0168
                java.lang.Object r5 = r6.D()
                java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
                boolean r5 = kotlin.jvm.internal.C17542s.e(r5, r7)
                if (r5 != 0) goto L_0x0176
            L_0x0168:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
                r6.u(r5)
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r6.w(r4, r3)
            L_0x0176:
                nI.p r3 = r16.d()
                U0.F1.c(r6, r2, r3)
                s0.N r3 = s0.C5843N.f28726a
                java.lang.String r2 = r14.d()
                if (r2 != 0) goto L_0x0187
                java.lang.String r2 = ""
            L_0x0187:
                r23 = r2
                TC.b$b$b r2 = TC.C13679b.C2857b.C2858b.f116684a
                r7 = 2
                r8 = 0
                r5 = 1065353216(0x3f800000, float:1.0)
                r6 = 0
                r4 = r13
                androidx.compose.ui.d r3 = s0.C5842M.e(r3, r4, r5, r6, r7, r8)
                r25 = 0
                r26 = 262136(0x3fff8, float:3.67331E-40)
                r4 = 0
                r6 = 0
                r9 = 0
                r10 = 0
                r16 = 0
                r11 = r16
                r16 = 0
                r27 = r13
                r13 = r16
                r28 = r14
                r14 = r16
                r15 = r16
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r24 = 48
                r1 = r23
                r23 = r31
                SC.C13607l.j(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
                r1 = 1292442626(0x4d091c02, float:1.43769632E8)
                r15 = r31
                r15.W(r1)
                java.lang.String r1 = r28.c()
                if (r1 == 0) goto L_0x0202
                int r1 = uK.C18146a.f148109K
                r2 = 0
                t1.c r1 = J1.e.c(r1, r15, r2)
                r2 = 16
                float r2 = (float) r2
                float r4 = c2.h.B(r2)
                r8 = 14
                r9 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r27
                androidx.compose.ui.d r3 = androidx.compose.foundation.layout.D.m(r3, r4, r5, r6, r7, r8, r9)
                tK.v r2 = tK.C18030v.f147664a
                int r4 = tK.C18030v.f147665b
                tK.h r2 = r2.a(r15, r4)
                long r4 = r2.G0()
                r7 = 432(0x1b0, float:6.05E-43)
                r8 = 0
                r2 = 0
                r6 = r31
                O0.V.a(r1, r2, r3, r4, r6, r7, r8)
            L_0x0202:
                r31.P()
                r31.x()
                java.lang.String r1 = r28.a()
                r2 = -1085627883(0xffffffffbf4aa215, float:-0.7915357)
                r15.W(r2)
                if (r1 != 0) goto L_0x0215
                goto L_0x0242
            L_0x0215:
                TC.b$a$a r2 = TC.C13679b.a.C2855a.f116679a
                androidx.compose.ui.d r3 = TC.e.i(r27)
                r25 = 0
                r26 = 262136(0x3fff8, float:3.67331E-40)
                r4 = 0
                r6 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r13 = 0
                r14 = 0
                r16 = 0
                r15 = r16
                r16 = 0
                r18 = 0
                r19 = 0
                r20 = 0
                r21 = 0
                r22 = 0
                r24 = 48
                r23 = r31
                SC.C13607l.j(r1, r2, r3, r4, r6, r8, r9, r10, r11, r13, r14, r15, r16, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            L_0x0242:
                r31.P()
                r31.x()
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0251
                U0.C4895p.R()
            L_0x0251:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.commercialcontent.impl.view.a.j.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class k implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f94757a;

        k(String str) {
            this.f94757a = str;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1663718739, i11, -1, "com.ingka.ikea.commercialcontent.impl.view.descriptionPH.<anonymous> (CommercialContentComposable.kt:570)");
                }
                C13607l.j(this.f94757a, C13679b.a.C2856b.f116680a, TC.e.i(androidx.compose.ui.d.f18749a), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar, 48, 0, 262136);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class l implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<kp.i> f94758a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<kp.i, C16807N> f94759b;

        l(C15987c<kp.i> cVar, C17642l<? super kp.i, C16807N> lVar) {
            this.f94758a = cVar;
            this.f94759b = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1663824531, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.mediaPH.<anonymous> (CommercialContentComposable.kt:590)");
                }
                HC.y.j(this.f94758a, this.f94759b, (androidx.compose.ui.d) null, mVar, 0, 4);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<d1> f94760a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<c1, C16807N> f94761b;

        m(C15987c<d1> cVar, C17642l<? super c1, C16807N> lVar) {
            this.f94760a = cVar;
            this.f94761b = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1759948047, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.productsCarousel.<anonymous> (CommercialContentComposable.kt:477)");
                }
                K.g(this.f94760a, this.f94761b, (androidx.compose.ui.d) null, (C5934A) null, true, false, mVar, 24576, 44);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class n implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kp.g f94762a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<l, C16807N> f94763b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f94764c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.C1624a f94765d;

        n(kp.g gVar, C17642l<? super l, C16807N> lVar, String str, a.C1624a aVar) {
            this.f94762a = gVar;
            this.f94763b = lVar;
            this.f94764c = str;
            this.f94765d = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, kp.g gVar, String str, a.C1624a aVar) {
            lVar.invoke(new l.d(gVar.a(), gVar.c(), str, aVar));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r19, U0.C4889m r20, int r21) {
            /*
                r18 = this;
                r0 = r18
                r14 = r20
                r1 = r21
                java.lang.String r2 = "$this$item"
                r3 = r19
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001f
                boolean r2 = r20.l()
                if (r2 != 0) goto L_0x001a
                goto L_0x001f
            L_0x001a:
                r20.L()
                goto L_0x00a0
            L_0x001f:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002e
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.commercialcontent.impl.view.sceneProductListButton.<anonymous> (CommercialContentComposable.kt:447)"
                r4 = -2043177420(0xffffffff86379634, float:-3.4528826E-35)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002e:
                kp.g r1 = r0.f94762a
                java.lang.String r1 = r1.c()
                kp.g r2 = r0.f94762a
                java.lang.String r4 = r2.b()
                SC.b1$a r6 = SC.C13569b1.a.f116142b
                r2 = 477054182(0x1c6f44e6, float:7.9167516E-22)
                r14.W(r2)
                nI.l<com.ingka.ikea.commercialcontent.impl.view.l, XH.N> r2 = r0.f94763b
                boolean r2 = r14.V(r2)
                kp.g r3 = r0.f94762a
                boolean r3 = r14.F(r3)
                r2 = r2 | r3
                java.lang.String r3 = r0.f94764c
                boolean r3 = r14.V(r3)
                r2 = r2 | r3
                Jo.a$a r3 = r0.f94765d
                boolean r3 = r14.V(r3)
                r2 = r2 | r3
                nI.l<com.ingka.ikea.commercialcontent.impl.view.l, XH.N> r3 = r0.f94763b
                kp.g r5 = r0.f94762a
                java.lang.String r7 = r0.f94764c
                Jo.a$a r8 = r0.f94765d
                java.lang.Object r9 = r20.D()
                if (r2 != 0) goto L_0x0073
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r9 != r2) goto L_0x007b
            L_0x0073:
                com.ingka.ikea.commercialcontent.impl.view.j r9 = new com.ingka.ikea.commercialcontent.impl.view.j
                r9.<init>(r3, r5, r7, r8)
                r14.u(r9)
            L_0x007b:
                r2 = r9
                nI.a r2 = (nI.C17631a) r2
                r20.P()
                int r3 = SC.C13569b1.a.f116143c
                int r15 = r3 << 15
                r16 = 6
                r17 = 7124(0x1bd4, float:9.983E-42)
                r3 = 0
                r5 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 1
                r12 = 0
                r13 = 0
                r14 = r20
                SC.C13585f1.c(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00a0
                U0.C4895p.R()
            L_0x00a0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.commercialcontent.impl.view.a.n.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class o implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f94766a;

        o(String str) {
            this.f94766a = str;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1014641745, i11, -1, "com.ingka.ikea.commercialcontent.impl.view.titlePH.<anonymous> (CommercialContentComposable.kt:551)");
                }
                C13607l.j(this.f94766a, C13679b.C2857b.C2858b.f116684a, TC.e.i(androidx.compose.ui.d.f18749a), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar, 48, 0, 262136);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    static {
        Media.Image image = new Media.Image("https://i.imgur.com/2EtSLdm.jpeg", "altText");
        f94728b = image;
        a.C1624a aVar = a.C1624a.VISUAL_MESSAGE;
        C15990f a10 = C15985a.a();
        No.a aVar2 = new No.a("Title PL", "Description PL", (String) null);
        C10832f fVar = C10832f.f85163a;
        f94729c = new No.i("1", "Title", "Description", image, (C15987c<No.g>) null, C15985a.b(new No.h("id", "Title PH", "Description PH", a10, aVar2, C15985a.b(fVar.d(), d1.h(fVar.d(), (C10850o.a) null, (C10867x) null, C10828d.b(fVar.b(), "30421230", (String) null, (C10828d.b) null, (C15987c) null, (C10828d.h) null, C15985a.a(), (C15987c) null, false, 222, (Object) null), (C11522d) null, false, 27, (Object) null), d1.h(fVar.d(), (C10850o.a) null, (C10867x) null, C10828d.b(fVar.b(), "30421231", (String) null, (C10828d.b) null, (C15987c) null, (C10828d.h) null, (C15987c) null, (C15987c) null, false, 250, (Object) null), (C11522d) null, false, 27, (Object) null)), new kp.g("id", "Title", "Subtitle"), C15985a.a(), "story1", aVar)), (String) null, (C15987c<String>) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N A(C17642l lVar, No.h hVar, kp.i iVar) {
        C17542s.j(iVar, "it");
        lVar.invoke(new l.e(iVar, hVar.c(), hVar.i()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B(C17642l lVar, No.i iVar, No.h hVar, C17642l lVar2, c1 c1Var) {
        C17542s.j(c1Var, "it");
        if (c1Var instanceof c1.e) {
            lVar.invoke(new l.c(((c1.e) c1Var).a(), iVar.c(), hVar.c(), hVar.i()));
        }
        lVar2.invoke(c1Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N C(No.i iVar, C17642l lVar, C17642l lVar2, p pVar, C17642l lVar3, int i10, C4889m mVar, int i11) {
        y(iVar, lVar, lVar2, pVar, lVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void D(C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17631a<C16807N> aVar2;
        C17631a<C16807N> aVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(633841942);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            aVar2 = aVar;
        } else if ((i13 & 6) == 0) {
            aVar2 = aVar;
            i12 = (k10.F(aVar2) ? 4 : 2) | i13;
        } else {
            aVar2 = aVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (i15 != 0) {
                k10.W(162150088);
                Object D10 = k10.D();
                if (D10 == C4889m.f14007a.a()) {
                    D10 = new C10793p();
                    k10.u(D10);
                }
                k10.P();
                aVar3 = (C17631a) D10;
            } else {
                aVar3 = aVar2;
            }
            if (C4895p.J()) {
                C4895p.S(633841942, i12, -1, "com.ingka.ikea.commercialcontent.impl.view.FullScreenError (CommercialContentComposable.kt:277)");
            }
            d.a aVar4 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d i16 = TC.e.i(J.f(aVar4, 0.0f, 1, (Object) null));
            C5437c.a aVar5 = C5437c.f24302a;
            I h10 = C5077h.h(aVar5.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, i16);
            C4504g.a aVar6 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar6.a();
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
            F1.c(a12, h10, aVar6.c());
            F1.c(a12, s10, aVar6.e());
            p<C4504g, Integer, C16807N> b10 = aVar6.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar6.d());
            androidx.compose.ui.d a13 = C5079j.f18125a.a(aVar4, aVar5.e());
            I a14 = C5080k.a(C5073d.f18068a.n(c2.h.B((float) 24)), aVar5.k(), k10, 6);
            int a15 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, a13);
            C17631a<C4504g> a16 = aVar6.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a16);
            } else {
                k10.t();
            }
            C4889m a17 = F1.a(k10);
            F1.c(a17, a14, aVar6.c());
            F1.c(a17, s11, aVar6.e());
            p<C4504g, Integer, C16807N> b11 = aVar6.b();
            if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                a17.u(Integer.valueOf(a15));
                a17.w(Integer.valueOf(a15), b11);
            }
            F1.c(a17, e11, aVar6.d());
            C5862h hVar = C5862h.f28810a;
            C4889m mVar2 = k10;
            C13607l.j(J1.j.b(Oo.b.f84812v3, k10, 0), C13679b.C2857b.C2858b.f116684a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar2, 48, 0, 262140);
            k10 = mVar2;
            SC.F0.b(C18146a.f148569o, J1.j.b(Oo.b.f84823w3, k10, 0), hVar.b(aVar4, aVar5.g()), false, (SC.H0) null, (G0) null, (r0.m) null, false, aVar3, k10, (i12 << 24) & 234881024, 248);
            k10.x();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            aVar2 = aVar3;
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10794q(aVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N E() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N F(C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        D(aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void G(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(1297879516);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1297879516, i10, -1, "com.ingka.ikea.commercialcontent.impl.view.FullScreenLoading (CommercialContentComposable.kt:245)");
            }
            C5073d.f n10 = C5073d.f18068a.n(c2.h.B((float) 24));
            d.a aVar = androidx.compose.ui.d.f18749a;
            I a10 = C5080k.a(n10, C5437c.f24302a.k(), k10, 6);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, aVar);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
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
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            A0.f e11 = A0.g.e(c2.h.B((float) 4));
            H2.b(C5074e.b(J.h(aVar, 0.0f, 1, (Object) null), 0.75f, false, 2, (Object) null), false, k10, 6, 2);
            H2.b(m1.e.a(J.i(TC.e.i(aVar), c2.h.B((float) 88)), e11), false, k10, 0, 2);
            H2.b(m1.e.a(J.i(TC.e.i(aVar), c2.h.B((float) 300)), e11), false, k10, 0, 2);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C10792o(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N H(int i10, C4889m mVar, int i11) {
        G(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void I(C14615b bVar, boolean z10, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1736898180);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(bVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.b(z10) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1736898180, i11, -1, "com.ingka.ikea.commercialcontent.impl.view.HandleStatusbarIconColor (CommercialContentComposable.kt:234)");
            }
            boolean z11 = false;
            jC.i c10 = jC.k.c((Window) null, k10, 0, 1);
            Boolean valueOf = Boolean.valueOf(z10);
            k10.W(1365128558);
            boolean F10 = k10.F(c10);
            if ((i11 & 112) == 32) {
                z11 = true;
            }
            boolean F11 = z11 | F10 | k10.F(bVar);
            Object D10 = k10.D();
            if (F11 || D10 == C4889m.f14007a.a()) {
                D10 = new i(c10, z10, bVar, (C17164e<? super i>) null);
                k10.u(D10);
            }
            k10.P();
            P.f(bVar, valueOf, (p) D10, k10, i11 & 126);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C10791n(bVar, z10, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N J(C14615b bVar, boolean z10, int i10, C4889m mVar, int i11) {
        I(bVar, z10, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v1, resolved type: nI.l} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: androidx.compose.ui.d$a} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void K(com.ingka.ikea.core.model.Media r24, nI.p<? super android.graphics.drawable.Drawable, ? super java.lang.String, XH.C16807N> r25, androidx.compose.ui.d r26, U0.C4889m r27, int r28, int r29) {
        /*
            r1 = r24
            r2 = r25
            r4 = r28
            r0 = 708965937(0x2a41f631, float:1.7227258E-13)
            r3 = r27
            U0.m r3 = r3.k(r0)
            r5 = r29 & 1
            if (r5 == 0) goto L_0x0016
            r5 = r4 | 6
            goto L_0x0026
        L_0x0016:
            r5 = r4 & 6
            if (r5 != 0) goto L_0x0025
            boolean r5 = r3.F(r1)
            if (r5 == 0) goto L_0x0022
            r5 = 4
            goto L_0x0023
        L_0x0022:
            r5 = 2
        L_0x0023:
            r5 = r5 | r4
            goto L_0x0026
        L_0x0025:
            r5 = r4
        L_0x0026:
            r6 = r29 & 2
            r7 = 32
            if (r6 == 0) goto L_0x002f
            r5 = r5 | 48
            goto L_0x003e
        L_0x002f:
            r6 = r4 & 48
            if (r6 != 0) goto L_0x003e
            boolean r6 = r3.F(r2)
            if (r6 == 0) goto L_0x003b
            r6 = r7
            goto L_0x003d
        L_0x003b:
            r6 = 16
        L_0x003d:
            r5 = r5 | r6
        L_0x003e:
            r6 = r29 & 4
            if (r6 == 0) goto L_0x0047
            r5 = r5 | 384(0x180, float:5.38E-43)
        L_0x0044:
            r8 = r26
            goto L_0x0059
        L_0x0047:
            r8 = r4 & 384(0x180, float:5.38E-43)
            if (r8 != 0) goto L_0x0044
            r8 = r26
            boolean r9 = r3.V(r8)
            if (r9 == 0) goto L_0x0056
            r9 = 256(0x100, float:3.59E-43)
            goto L_0x0058
        L_0x0056:
            r9 = 128(0x80, float:1.794E-43)
        L_0x0058:
            r5 = r5 | r9
        L_0x0059:
            r9 = r5 & 147(0x93, float:2.06E-43)
            r10 = 146(0x92, float:2.05E-43)
            if (r9 != r10) goto L_0x006b
            boolean r9 = r3.l()
            if (r9 != 0) goto L_0x0066
            goto L_0x006b
        L_0x0066:
            r3.L()
            goto L_0x01e2
        L_0x006b:
            if (r6 == 0) goto L_0x0071
            androidx.compose.ui.d$a r6 = androidx.compose.ui.d.f18749a
            r15 = r6
            goto L_0x0072
        L_0x0071:
            r15 = r8
        L_0x0072:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x007e
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.commercialcontent.impl.view.HeadlineMediaComposable (CommercialContentComposable.kt:610)"
            U0.C4895p.S(r0, r5, r6, r8)
        L_0x007e:
            boolean r0 = r1 instanceof com.ingka.ikea.core.model.Media.Image
            if (r0 != 0) goto L_0x00ba
            boolean r0 = r1 instanceof com.ingka.ikea.core.model.Media.InfoImage
            if (r0 == 0) goto L_0x0087
            goto L_0x00ba
        L_0x0087:
            boolean r0 = r1 instanceof com.ingka.ikea.core.model.Media.Video
            if (r0 == 0) goto L_0x00ab
            r0 = -532520318(0xffffffffe0426282, float:-5.6027603E19)
            r3.W(r0)
            r0 = r1
            com.ingka.ikea.core.model.Media$Video r0 = (com.ingka.ikea.core.model.Media.Video) r0
            java.lang.String r5 = r0.getUrl()
            java.lang.String r6 = r0.A0()
            androidx.compose.ui.d$a r7 = androidx.compose.ui.d.f18749a
            r9 = 384(0x180, float:5.38E-43)
            r10 = 0
            r8 = r3
            HC.C12963A.b(r5, r6, r7, r8, r9, r10)
            r3.P()
            r0 = r15
            goto L_0x01d8
        L_0x00ab:
            r0 = -532555900(0xffffffffe041d784, float:-5.587111E19)
            r3.W(r0)
            r3.P()
            XH.t r0 = new XH.t
            r0.<init>()
            throw r0
        L_0x00ba:
            r0 = 670705850(0x27fa28ba, float:6.9433095E-15)
            r3.W(r0)
            boolean r0 = r1 instanceof com.ingka.ikea.core.model.Media.InfoImage
            r6 = 0
            r8 = 1
            if (r0 == 0) goto L_0x0160
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "InfoImage not supported in HeadlineMedia"
            r0.<init>(r9)
            qv.e r14 = qv.e.ERROR
            qv.d r9 = qv.d.f102012a
            java.util.List r9 = r9.a()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00e0:
            boolean r11 = r9.hasNext()
            r13 = 0
            if (r11 == 0) goto L_0x00f8
            java.lang.Object r11 = r9.next()
            r12 = r11
            qv.b r12 = (qv.C11819b) r12
            boolean r12 = r12.b(r14, r13)
            if (r12 == 0) goto L_0x00e0
            r10.add(r11)
            goto L_0x00e0
        L_0x00f8:
            java.util.Iterator r16 = r10.iterator()
            r9 = r6
            r10 = r9
        L_0x00fe:
            boolean r11 = r16.hasNext()
            if (r11 == 0) goto L_0x0160
            java.lang.Object r11 = r16.next()
            qv.b r11 = (qv.C11819b) r11
            if (r9 != 0) goto L_0x0117
            java.lang.String r9 = qv.C11818a.a(r6, r0)
            if (r9 != 0) goto L_0x0113
            goto L_0x0160
        L_0x0113:
            java.lang.String r9 = qv.C11820c.a(r9)
        L_0x0117:
            r17 = r9
            if (r10 != 0) goto L_0x0146
            java.lang.Thread r9 = java.lang.Thread.currentThread()
            java.lang.String r9 = r9.getName()
            java.lang.String r10 = "main"
            boolean r9 = HJ.C15854t.b0(r9, r10, r8)
            if (r9 == 0) goto L_0x012e
            java.lang.String r9 = "m"
            goto L_0x0130
        L_0x012e:
            java.lang.String r9 = "b"
        L_0x0130:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r9)
            java.lang.String r9 = "|"
            r10.append(r9)
            java.lang.String r9 = "HeadlineMediaComposable:"
            r10.append(r9)
            java.lang.String r10 = r10.toString()
        L_0x0146:
            r18 = r10
            r9 = r11
            r10 = r14
            r11 = r18
            r12 = r13
            r19 = r13
            r13 = r0
            r20 = r14
            r14 = r17
            r9.a(r10, r11, r12, r13, r14)
            r9 = r17
            r10 = r18
            r13 = r19
            r14 = r20
            goto L_0x00fe
        L_0x0160:
            java.lang.String r0 = r24.getUrl()
            java.lang.String r9 = r24.A0()
            LC.b$a r10 = LC.C13178b.a.f111818a
            r11 = 500(0x1f4, float:7.0E-43)
            float r11 = (float) r11
            float r11 = c2.h.B(r11)
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.i(r15, r11)
            r12 = 0
            androidx.compose.ui.d r11 = androidx.compose.foundation.layout.J.h(r11, r12, r8, r6)
            r6 = -532535775(0xffffffffe0422621, float:-5.5959622E19)
            r3.W(r6)
            r5 = r5 & 112(0x70, float:1.57E-43)
            if (r5 != r7) goto L_0x0185
            goto L_0x0186
        L_0x0185:
            r8 = 0
        L_0x0186:
            boolean r5 = r3.F(r1)
            r5 = r5 | r8
            java.lang.Object r6 = r3.D()
            if (r5 != 0) goto L_0x0199
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r6 != r5) goto L_0x01a1
        L_0x0199:
            Mo.g r6 = new Mo.g
            r6.<init>(r2, r1)
            r3.u(r6)
        L_0x01a1:
            r12 = r6
            nI.l r12 = (nI.C17642l) r12
            r3.P()
            int r5 = LC.C13178b.a.f111819b
            int r5 = r5 << 9
            r6 = 100663296(0x6000000, float:2.4074124E-35)
            r18 = r5 | r6
            r19 = 0
            r20 = 3696(0xe70, float:5.179E-42)
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r5 = r0
            r6 = r9
            r7 = r11
            r8 = r10
            r9 = r13
            r10 = r14
            r11 = r16
            r13 = r17
            r14 = r21
            r0 = r15
            r15 = r22
            r16 = r23
            r17 = r3
            LC.h.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r3.P()
        L_0x01d8:
            boolean r5 = U0.C4895p.J()
            if (r5 == 0) goto L_0x01e1
            U0.C4895p.R()
        L_0x01e1:
            r8 = r0
        L_0x01e2:
            U0.Y0 r6 = r3.n()
            if (r6 == 0) goto L_0x01fa
            Mo.h r7 = new Mo.h
            r0 = r7
            r1 = r24
            r2 = r25
            r3 = r8
            r4 = r28
            r5 = r29
            r0.<init>(r1, r2, r3, r4, r5)
            r6.a(r7)
        L_0x01fa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.commercialcontent.impl.view.a.K(com.ingka.ikea.core.model.Media, nI.p, androidx.compose.ui.d, U0.m, int, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N L(p pVar, Media media, e.c cVar) {
        C17542s.j(cVar, "it");
        if (cVar instanceof e.c.d) {
            pVar.invoke(((e.c.d) cVar).a(), media.getUrl());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N M(Media media, p pVar, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        K(media, pVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: nI.l} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void N(No.g r32, java.lang.String r33, U0.C4889m r34, int r35) {
        /*
            r0 = r32
            r1 = r33
            r2 = r35
            r3 = 48
            r4 = 1247006263(0x4a53ce37, float:3470221.8)
            r5 = r34
            U0.m r15 = r5.k(r4)
            r5 = r2 & 6
            if (r5 != 0) goto L_0x0020
            boolean r5 = r15.F(r0)
            if (r5 == 0) goto L_0x001d
            r5 = 4
            goto L_0x001e
        L_0x001d:
            r5 = 2
        L_0x001e:
            r5 = r5 | r2
            goto L_0x0021
        L_0x0020:
            r5 = r2
        L_0x0021:
            r6 = r2 & 48
            r7 = 32
            if (r6 != 0) goto L_0x0032
            boolean r6 = r15.V(r1)
            if (r6 == 0) goto L_0x002f
            r6 = r7
            goto L_0x0031
        L_0x002f:
            r6 = 16
        L_0x0031:
            r5 = r5 | r6
        L_0x0032:
            r6 = r5 & 19
            r8 = 18
            if (r6 != r8) goto L_0x0045
            boolean r6 = r15.l()
            if (r6 != 0) goto L_0x003f
            goto L_0x0045
        L_0x003f:
            r15.L()
            r3 = r15
            goto L_0x0302
        L_0x0045:
            boolean r6 = U0.C4895p.J()
            if (r6 == 0) goto L_0x0051
            r6 = -1
            java.lang.String r8 = "com.ingka.ikea.commercialcontent.impl.view.QuoteImageAndTextBox (CommercialContentComposable.kt:653)"
            U0.C4895p.S(r4, r5, r6, r8)
        L_0x0051:
            androidx.compose.ui.d$a r4 = androidx.compose.ui.d.f18749a
            i1.c$a r21 = i1.C5437c.f24302a
            i1.c r6 = r21.o()
            r14 = 0
            E1.I r6 = androidx.compose.foundation.layout.C5077h.h(r6, r14)
            int r8 = U0.C4883j.a(r15, r14)
            U0.y r9 = r15.s()
            androidx.compose.ui.d r10 = androidx.compose.ui.c.e(r15, r4)
            G1.g$a r22 = G1.C4504g.f6515W
            nI.a r11 = r22.a()
            U0.f r12 = r15.m()
            if (r12 != 0) goto L_0x0079
            U0.C4883j.c()
        L_0x0079:
            r15.I()
            boolean r12 = r15.i()
            if (r12 == 0) goto L_0x0086
            r15.p(r11)
            goto L_0x0089
        L_0x0086:
            r15.t()
        L_0x0089:
            U0.m r11 = U0.F1.a(r15)
            nI.p r12 = r22.c()
            U0.F1.c(r11, r6, r12)
            nI.p r6 = r22.e()
            U0.F1.c(r11, r9, r6)
            nI.p r6 = r22.b()
            boolean r9 = r11.i()
            if (r9 != 0) goto L_0x00b3
            java.lang.Object r9 = r11.D()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r12)
            if (r9 != 0) goto L_0x00c1
        L_0x00b3:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r11.u(r9)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r11.w(r8, r6)
        L_0x00c1:
            nI.p r6 = r22.d()
            U0.F1.c(r11, r10, r6)
            androidx.compose.foundation.layout.j r6 = androidx.compose.foundation.layout.C5079j.f18125a
            r6 = 1976677976(0x75d1b658, float:5.316838E32)
            r15.W(r6)
            com.ingka.ikea.core.model.Image r6 = r32.c()
            r13 = 1
            if (r6 == 0) goto L_0x0159
            com.ingka.ikea.core.model.Image r6 = r32.c()
            java.lang.String r6 = r6.getUrl()
            com.ingka.ikea.core.model.Image r8 = r32.c()
            java.lang.String r8 = r8.A0()
            LC.b$a r9 = LC.C13178b.a.f111818a
            r10 = 500(0x1f4, float:7.0E-43)
            float r10 = (float) r10
            float r10 = c2.h.B(r10)
            androidx.compose.ui.d r10 = androidx.compose.foundation.layout.J.i(r4, r10)
            r11 = 1976688770(0x75d1e082, float:5.3210137E32)
            r15.W(r11)
            r5 = r5 & 112(0x70, float:1.57E-43)
            if (r5 != r7) goto L_0x0100
            r5 = r13
            goto L_0x0101
        L_0x0100:
            r5 = r14
        L_0x0101:
            boolean r7 = r15.F(r0)
            r5 = r5 | r7
            java.lang.Object r7 = r15.D()
            if (r5 != 0) goto L_0x0114
            U0.m$a r5 = U0.C4889m.f14007a
            java.lang.Object r5 = r5.a()
            if (r7 != r5) goto L_0x011c
        L_0x0114:
            Mo.e r7 = new Mo.e
            r7.<init>(r1, r0)
            r15.u(r7)
        L_0x011c:
            r12 = r7
            nI.l r12 = (nI.C17642l) r12
            r15.P()
            int r5 = LC.C13178b.a.f111819b
            int r5 = r5 << 9
            r11 = r5 | 384(0x180, float:5.38E-43)
            r19 = 0
            r20 = 3952(0xf70, float:5.538E-42)
            r16 = 0
            r17 = 0
            r18 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r5 = r6
            r6 = r8
            r7 = r10
            r8 = r9
            r9 = r16
            r10 = r17
            r27 = r11
            r11 = r18
            r13 = r23
            r3 = r14
            r14 = r24
            r34 = r15
            r15 = r25
            r16 = r26
            r17 = r34
            r18 = r27
            LC.h.c(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x015c
        L_0x0159:
            r3 = r14
            r34 = r15
        L_0x015c:
            r34.P()
            com.ingka.ikea.core.model.Image r5 = r32.c()
            r6 = 24
            if (r5 == 0) goto L_0x0189
            XH.B r5 = new XH.B
            r7 = 250(0xfa, float:3.5E-43)
            float r7 = (float) r7
            float r7 = c2.h.B(r7)
            c2.h r7 = c2.h.m(r7)
            float r8 = (float) r3
            float r9 = c2.h.B(r8)
            c2.h r9 = c2.h.m(r9)
            float r8 = c2.h.B(r8)
            c2.h r8 = c2.h.m(r8)
            r5.<init>(r7, r9, r8)
            goto L_0x01ac
        L_0x0189:
            XH.B r5 = new XH.B
            float r7 = (float) r6
            float r7 = c2.h.B(r7)
            c2.h r7 = c2.h.m(r7)
            r8 = 48
            float r8 = (float) r8
            float r8 = c2.h.B(r8)
            c2.h r8 = c2.h.m(r8)
            r9 = 1
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            c2.h r9 = c2.h.m(r9)
            r5.<init>(r7, r8, r9)
        L_0x01ac:
            java.lang.Object r7 = r5.a()
            c2.h r7 = (c2.h) r7
            float r7 = r7.G()
            java.lang.Object r8 = r5.b()
            c2.h r8 = (c2.h) r8
            float r8 = r8.G()
            java.lang.Object r5 = r5.c()
            c2.h r5 = (c2.h) r5
            float r10 = r5.G()
            float r6 = (float) r6
            float r5 = c2.h.B(r6)
            r9 = 56
            float r9 = (float) r9
            float r9 = c2.h.B(r9)
            androidx.compose.ui.d r9 = androidx.compose.foundation.layout.D.l(r4, r5, r7, r9, r8)
            tK.v r5 = tK.C18030v.f147664a
            int r7 = tK.C18030v.f147665b
            r8 = r34
            tK.h r11 = r5.a(r8, r7)
            long r11 = r11.m0()
            r14 = 4
            r15 = 0
            r13 = 0
            androidx.compose.ui.d r23 = n0.C5599e.h(r9, r10, r11, r13, r14, r15)
            tK.h r5 = r5.a(r8, r7)
            long r24 = r5.k0()
            r27 = 2
            r28 = 0
            r26 = 0
            androidx.compose.ui.d r5 = androidx.compose.foundation.b.d(r23, r24, r26, r27, r28)
            float r7 = c2.h.B(r6)
            androidx.compose.ui.d r5 = androidx.compose.foundation.layout.D.i(r5, r7)
            androidx.compose.foundation.layout.d r7 = androidx.compose.foundation.layout.C5073d.f18068a
            androidx.compose.foundation.layout.d$m r7 = r7.g()
            i1.c$b r9 = r21.k()
            E1.I r7 = androidx.compose.foundation.layout.C5080k.a(r7, r9, r8, r3)
            int r3 = U0.C4883j.a(r8, r3)
            U0.y r9 = r8.s()
            androidx.compose.ui.d r5 = androidx.compose.ui.c.e(r8, r5)
            nI.a r10 = r22.a()
            U0.f r11 = r8.m()
            if (r11 != 0) goto L_0x0230
            U0.C4883j.c()
        L_0x0230:
            r8.I()
            boolean r11 = r8.i()
            if (r11 == 0) goto L_0x023d
            r8.p(r10)
            goto L_0x0240
        L_0x023d:
            r8.t()
        L_0x0240:
            U0.m r10 = U0.F1.a(r8)
            nI.p r11 = r22.c()
            U0.F1.c(r10, r7, r11)
            nI.p r7 = r22.e()
            U0.F1.c(r10, r9, r7)
            nI.p r7 = r22.b()
            boolean r9 = r10.i()
            if (r9 != 0) goto L_0x026a
            java.lang.Object r9 = r10.D()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r3)
            boolean r9 = kotlin.jvm.internal.C17542s.e(r9, r11)
            if (r9 != 0) goto L_0x0278
        L_0x026a:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            r10.u(r9)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r10.w(r3, r7)
        L_0x0278:
            nI.p r3 = r22.d()
            U0.F1.c(r10, r5, r3)
            s0.h r3 = s0.C5862h.f28810a
            java.lang.String r5 = r32.f()
            TC.b$a$d r3 = TC.C13679b.a.d.f116682a
            r31 = r6
            r6 = r3
            r29 = 0
            r30 = 262140(0x3fffc, float:3.67336E-40)
            r7 = 0
            r9 = 0
            r3 = r8
            r8 = r9
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r28 = 48
            r27 = r3
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r5 = r32.d()
            TC.b$b$c r6 = TC.C13679b.C2857b.c.f116685a
            float r18 = c2.h.B(r31)
            r21 = 13
            r22 = 0
            r17 = 0
            r19 = 0
            r20 = 0
            r16 = r4
            androidx.compose.ui.d r7 = androidx.compose.foundation.layout.D.m(r16, r17, r18, r19, r20, r21, r22)
            r30 = 262136(0x3fff8, float:3.67331E-40)
            r8 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r22 = 0
            r28 = 432(0x1b0, float:6.05E-43)
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            java.lang.String r5 = r32.e()
            TC.b$a$b r6 = TC.C13679b.a.C2856b.f116680a
            r30 = 262140(0x3fffc, float:3.67336E-40)
            r7 = 0
            r28 = 48
            SC.C13607l.j(r5, r6, r7, r8, r10, r12, r13, r14, r15, r17, r18, r19, r20, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r3.x()
            r3.x()
            boolean r4 = U0.C4895p.J()
            if (r4 == 0) goto L_0x0302
            U0.C4895p.R()
        L_0x0302:
            U0.Y0 r3 = r3.n()
            if (r3 == 0) goto L_0x0310
            Mo.f r4 = new Mo.f
            r4.<init>(r0, r1, r2)
            r3.a(r4)
        L_0x0310:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.commercialcontent.impl.view.a.N(No.g, java.lang.String, U0.m, int):void");
    }

    /* access modifiers changed from: private */
    public static final C16807N O(String str, No.g gVar, e.c cVar) {
        C17542s.j(cVar, "it");
        if (cVar instanceof e.c.d) {
            e0("quoteImage", ((e.c.d) cVar).a(), str, gVar.c().getUrl());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P(No.g gVar, String str, int i10, C4889m mVar, int i11) {
        N(gVar, str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void Q(String str, String str2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str3 = str;
        String str4 = str2;
        C4889m k10 = mVar.k(-1550396351);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str3) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1550396351, i12, -1, "com.ingka.ikea.commercialcontent.impl.view.StoryTitleAndDescription (CommercialContentComposable.kt:716)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, h10);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
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
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            d.a aVar3 = aVar;
            int i13 = i12;
            C4889m mVar3 = k10;
            C13607l.j(str, C13679b.C2857b.d.f116686a, TC.e.i(aVar), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar3, (i12 & 14) | 48, 0, 262136);
            C4889m mVar4 = mVar3;
            mVar4.W(-374259359);
            if (str2 != null) {
                mVar2 = mVar4;
                C13607l.j(str2, C13679b.a.C2856b.f116680a, D.m(TC.e.i(aVar3), 0.0f, c2.h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super N1.P, C16807N>) null, mVar2, ((i13 >> 3) & 14) | 48, 0, 262136);
            } else {
                mVar2 = mVar4;
            }
            mVar2.P();
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
            n10.a(new C10781d(str, str2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N R(String str, String str2, int i10, C4889m mVar, int i11) {
        Q(str, str2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void c0(x xVar) {
        x.i(xVar, (Object) null, (Object) null, B.f83521a.a(), 3, (Object) null);
    }

    private static final void d0(x xVar, No.a aVar, int i10, C17642l<? super l, C16807N> lVar) {
        if (aVar.b()) {
            xVar.b("TitlePl" + i10, "TitlePl", c1.c.c(643014850, true, new j(aVar, lVar)));
        }
    }

    /* access modifiers changed from: private */
    public static final void e0(String str, Drawable drawable, String str2, String str3) {
        if (drawable.getIntrinsicWidth() >= drawable.getIntrinsicHeight()) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Image not in portrait, storyId: " + str2 + ", url: " + str3 + ". Please report to PO in E&F");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 != null) {
                        str4 = C11820c.a(a10);
                    } else {
                        return;
                    }
                }
                String str6 = str4;
                if (str5 == null) {
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + str;
                }
                String str7 = str5;
                bVar.a(eVar, str7, false, illegalArgumentException, str6);
                str4 = str6;
                str5 = str7;
            }
        }
    }

    private static final void f0(x xVar, String str, int i10) {
        if (str != null) {
            xVar.b("DescriptionPh" + i10, "DescriptionPh", c1.c.c(-1663718739, true, new k(str)));
        }
    }

    private static final void g0(x xVar, C15987c<kp.i> cVar, int i10, C17642l<? super kp.i, C16807N> lVar) {
        if (cVar != null) {
            xVar.b("MediaPh" + i10, "MediaPh", c1.c.c(-1663824531, true, new l(cVar, lVar)));
        }
    }

    private static final void h0(x xVar, C15987c<d1> cVar, int i10, C17642l<? super c1, C16807N> lVar) {
        if (cVar != null) {
            xVar.b("ProductCarousel" + i10, "ProductCarousel", c1.c.c(-1759948047, true, new m(cVar, lVar)));
        }
    }

    private static final void i0(x xVar, int i10, String str, a.C1624a aVar, kp.g gVar, C17642l<? super l, C16807N> lVar) {
        if (gVar != null) {
            xVar.b("ProductCategoryRow" + i10, "ProductCategoryRow", c1.c.c(-2043177420, true, new n(gVar, lVar, str, aVar)));
        }
    }

    private static final void j0(x xVar, String str, int i10) {
        if (str != null) {
            xVar.b("TitlePh" + i10, "TitlePh", c1.c.c(1014641745, true, new o(str)));
        }
    }

    /* access modifiers changed from: private */
    public static final void r(b.C1708b bVar, C17642l<? super c1, C16807N> lVar, C17631a<C16807N> aVar, C17642l<? super l, C16807N> lVar2, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        b.C1708b bVar2 = bVar;
        int i12 = i10;
        C4889m k10 = mVar.k(296717148);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(bVar2) : k10.F(bVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        C17642l<? super c1, C16807N> lVar3 = lVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar3) ? 32 : 16;
        }
        C17631a<C16807N> aVar3 = aVar;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar3) ? 256 : 128;
        }
        C17642l<? super l, C16807N> lVar4 = lVar2;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(lVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        C17631a<C16807N> aVar4 = aVar2;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(aVar4) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(296717148, i11, -1, "com.ingka.ikea.commercialcontent.impl.view.CommercialContentComposable (CommercialContentComposable.kt:139)");
            }
            k10.W(-1692163371);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            L0 l02 = (L0) D10;
            k10.P();
            C5264a e10 = c1.c.e(-600393822, true, new C2111a(l02), k10, 54);
            C5848T c10 = C5850V.c(c2.h.B((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null);
            b bVar3 = r0;
            b bVar4 = new b(bVar, aVar, lVar, lVar2, l02, aVar2);
            mVar2 = k10;
            C4762x0.a((androidx.compose.ui.d) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, e10, (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, c10, c1.c.e(510696363, true, bVar3, k10, 54), mVar2, 805309440, 247);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C10788k(bVar, lVar, aVar, lVar2, aVar2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N s(b.C1708b bVar, C17642l lVar, C17631a aVar, C17642l lVar2, C17631a aVar2, int i10, C4889m mVar, int i11) {
        r(bVar, lVar, aVar, lVar2, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: nI.l} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void t(No.b r11, nI.C17642l<? super Op.c1, XH.C16807N> r12, nI.C17642l<? super com.ingka.ikea.commercialcontent.impl.view.l, XH.C16807N> r13, U0.C4889m r14, int r15) {
        /*
            java.lang.String r0 = "viewModel"
            kotlin.jvm.internal.C17542s.j(r11, r0)
            java.lang.String r0 = "onProductItemEvent"
            kotlin.jvm.internal.C17542s.j(r12, r0)
            java.lang.String r0 = "onScreenUiEvent"
            kotlin.jvm.internal.C17542s.j(r13, r0)
            r0 = 383371537(0x16d9c911, float:3.5185132E-25)
            U0.m r14 = r14.k(r0)
            r1 = r15 & 6
            if (r1 != 0) goto L_0x0025
            boolean r1 = r14.F(r11)
            if (r1 == 0) goto L_0x0022
            r1 = 4
            goto L_0x0023
        L_0x0022:
            r1 = 2
        L_0x0023:
            r1 = r1 | r15
            goto L_0x0026
        L_0x0025:
            r1 = r15
        L_0x0026:
            r2 = r15 & 48
            r8 = 32
            if (r2 != 0) goto L_0x0037
            boolean r2 = r14.F(r12)
            if (r2 == 0) goto L_0x0034
            r2 = r8
            goto L_0x0036
        L_0x0034:
            r2 = 16
        L_0x0036:
            r1 = r1 | r2
        L_0x0037:
            r2 = r15 & 384(0x180, float:5.38E-43)
            r9 = 256(0x100, float:3.59E-43)
            if (r2 != 0) goto L_0x0048
            boolean r2 = r14.F(r13)
            if (r2 == 0) goto L_0x0045
            r2 = r9
            goto L_0x0047
        L_0x0045:
            r2 = 128(0x80, float:1.794E-43)
        L_0x0047:
            r1 = r1 | r2
        L_0x0048:
            r10 = r1
            r1 = r10 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            if (r1 != r2) goto L_0x005b
            boolean r1 = r14.l()
            if (r1 != 0) goto L_0x0056
            goto L_0x005b
        L_0x0056:
            r14.L()
            goto L_0x0136
        L_0x005b:
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0067
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.commercialcontent.impl.view.CommercialContentScreen (CommercialContentComposable.kt:115)"
            U0.C4895p.S(r0, r10, r1, r2)
        L_0x0067:
            TJ.P r1 = r11.m()
            r6 = 0
            r7 = 7
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = r14
            U0.A1 r0 = j3.a.c(r1, r2, r3, r4, r5, r6, r7)
            No.b$b r1 = u(r0)
            r0 = 188451815(0xb3b8be7, float:3.612014E-32)
            r14.W(r0)
            boolean r0 = r14.F(r11)
            java.lang.Object r2 = r14.D()
            if (r0 != 0) goto L_0x0091
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r2 != r0) goto L_0x0099
        L_0x0091:
            com.ingka.ikea.commercialcontent.impl.view.a$c r2 = new com.ingka.ikea.commercialcontent.impl.view.a$c
            r2.<init>(r11)
            r14.u(r2)
        L_0x0099:
            uI.h r2 = (uI.C18059h) r2
            r14.P()
            r0 = 188453821(0xb3b93bd, float:3.6126036E-32)
            r14.W(r0)
            boolean r0 = r14.F(r11)
            java.lang.Object r3 = r14.D()
            if (r0 != 0) goto L_0x00b6
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r3 != r0) goto L_0x00be
        L_0x00b6:
            com.ingka.ikea.commercialcontent.impl.view.a$d r3 = new com.ingka.ikea.commercialcontent.impl.view.a$d
            r3.<init>(r11)
            r14.u(r3)
        L_0x00be:
            uI.h r3 = (uI.C18059h) r3
            r14.P()
            r0 = 188443294(0xb3b6a9e, float:3.60951E-32)
            r14.W(r0)
            boolean r0 = r14.F(r11)
            r4 = r10 & 112(0x70, float:1.57E-43)
            r5 = 0
            r6 = 1
            if (r4 != r8) goto L_0x00d5
            r4 = r6
            goto L_0x00d6
        L_0x00d5:
            r4 = r5
        L_0x00d6:
            r0 = r0 | r4
            java.lang.Object r4 = r14.D()
            if (r0 != 0) goto L_0x00e5
            U0.m$a r0 = U0.C4889m.f14007a
            java.lang.Object r0 = r0.a()
            if (r4 != r0) goto L_0x00ed
        L_0x00e5:
            Mo.a r4 = new Mo.a
            r4.<init>(r11, r12)
            r14.u(r4)
        L_0x00ed:
            r0 = r4
            nI.l r0 = (nI.C17642l) r0
            r14.P()
            r4 = r2
            nI.a r4 = (nI.C17631a) r4
            r2 = 188447576(0xb3b7b58, float:3.6107683E-32)
            r14.W(r2)
            boolean r2 = r14.F(r11)
            r7 = r10 & 896(0x380, float:1.256E-42)
            if (r7 != r9) goto L_0x0105
            r5 = r6
        L_0x0105:
            r2 = r2 | r5
            java.lang.Object r5 = r14.D()
            if (r2 != 0) goto L_0x0114
            U0.m$a r2 = U0.C4889m.f14007a
            java.lang.Object r2 = r2.a()
            if (r5 != r2) goto L_0x011c
        L_0x0114:
            Mo.i r5 = new Mo.i
            r5.<init>(r11, r13)
            r14.u(r5)
        L_0x011c:
            nI.l r5 = (nI.C17642l) r5
            r14.P()
            r6 = r3
            nI.a r6 = (nI.C17631a) r6
            r7 = 0
            r2 = r0
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            r(r1, r2, r3, r4, r5, r6, r7)
            boolean r0 = U0.C4895p.J()
            if (r0 == 0) goto L_0x0136
            U0.C4895p.R()
        L_0x0136:
            U0.Y0 r14 = r14.n()
            if (r14 == 0) goto L_0x0144
            Mo.j r0 = new Mo.j
            r0.<init>(r11, r12, r13, r15)
            r14.a(r0)
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.commercialcontent.impl.view.a.t(No.b, nI.l, nI.l, U0.m, int):void");
    }

    private static final b.C1708b u(A1<? extends b.C1708b> a12) {
        return (b.C1708b) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N v(No.b bVar, C17642l lVar, c1 c1Var) {
        C17542s.j(c1Var, "event");
        bVar.F(c1Var);
        lVar.invoke(c1Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N w(No.b bVar, C17642l lVar, l lVar2) {
        C17542s.j(lVar2, "event");
        bVar.G(lVar2);
        lVar.invoke(lVar2);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N x(No.b bVar, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        t(bVar, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void y(No.i iVar, C17642l<? super c1, C16807N> lVar, C17642l<? super l, C16807N> lVar2, p<? super Drawable, ? super String, C16807N> pVar, C17642l<? super Boolean, C16807N> lVar3, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        No.i iVar2 = iVar;
        int i12 = i10;
        C4889m k10 = mVar.k(1014828313);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(iVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        C17642l<? super c1, C16807N> lVar4 = lVar;
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar4) ? 32 : 16;
        }
        C17642l<? super l, C16807N> lVar5 = lVar2;
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar5) ? 256 : 128;
        }
        p<? super Drawable, ? super String, C16807N> pVar2 = pVar;
        if ((i12 & 3072) == 0) {
            i11 |= k10.F(pVar2) ? 2048 : 1024;
        }
        C17642l<? super Boolean, C16807N> lVar6 = lVar3;
        if ((i12 & 24576) == 0) {
            i11 |= k10.F(lVar6) ? 16384 : 8192;
        }
        if ((i11 & 9363) != 9362 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1014828313, i11, -1, "com.ingka.ikea.commercialcontent.impl.view.Content (CommercialContentComposable.kt:309)");
            }
            boolean z10 = true;
            androidx.compose.ui.d f10 = J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
            C5073d.f n10 = C5073d.f18068a.n(c2.h.B((float) 24));
            k10.W(1430763364);
            boolean F10 = k10.F(iVar2) | ((57344 & i11) == 16384) | ((i11 & 7168) == 2048) | ((i11 & 896) == 256);
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean z11 = F10 | z10;
            Object D10 = k10.D();
            if (z11 || D10 == C4889m.f14007a.a()) {
                C10789l lVar7 = new C10789l(iVar, lVar3, pVar, lVar2, lVar);
                k10.u(lVar7);
                D10 = lVar7;
            }
            k10.P();
            mVar2 = k10;
            C5937b.a(f10, (C5934A) null, (C5834E) null, false, n10, (C5437c.b) null, (s) null, false, (C17642l) D10, mVar2, 24582, 238);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C10790m(iVar, lVar, lVar2, pVar, lVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N z(No.i iVar, C17642l lVar, p pVar, C17642l lVar2, C17642l lVar3, x xVar) {
        No.i iVar2 = iVar;
        C17642l lVar4 = lVar2;
        x xVar2 = xVar;
        C17542s.j(xVar2, "$this$LazyColumn");
        xVar2.b("HeadlineMedia", "HeadlineMedia", c1.c.c(-2002730491, true, new e(iVar2, lVar, pVar)));
        xVar2.b("Story", "Story", c1.c.c(-1348338322, true, new f(iVar2)));
        C15987c<No.g> a10 = iVar.a();
        if (a10 != null) {
            int i10 = 0;
            for (T next : a10) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                xVar2.b("HeadBeatsQuote" + i10, "Quote", c1.c.c(1928639238, true, new g((No.g) next, iVar2)));
                i10 = i11;
            }
        }
        int i12 = 0;
        for (T next2 : iVar.f()) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C16877v.x();
            }
            No.h hVar = (No.h) next2;
            j0(xVar2, hVar.h(), i12);
            g0(xVar2, hVar.d(), i12, new C10779b(lVar4, hVar));
            f0(xVar2, hVar.b(), i12);
            d0(xVar2, hVar.a(), i12, lVar4);
            h0(xVar2, hVar.f(), i12, new C10780c(lVar4, iVar2, hVar, lVar3));
            i0(xVar, i12, hVar.c(), hVar.i(), hVar.e(), lVar2);
            C15987c<No.g> g10 = hVar.g();
            if (g10 != null) {
                int i14 = 0;
                for (T next3 : g10) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C16877v.x();
                    }
                    xVar2.b("Quote" + i12 + "-" + i14, "Quote", c1.c.c(875993880, true, new h((No.g) next3, iVar2)));
                    i14 = i15;
                }
            }
            i12 = i13;
        }
        c0(xVar);
        return C16807N.f139792a;
    }
}
