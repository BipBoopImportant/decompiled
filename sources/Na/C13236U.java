package NA;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import HC.O;
import KA.C13125c;
import KJ.C15985a;
import LC.C13178b;
import MC.C13203i;
import N1.P;
import NA.c0;
import O0.H0;
import O0.J0;
import O0.L0;
import Op.c1;
import Op.f1;
import QJ.Q;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.F0;
import SC.G0;
import SC.Y2;
import TC.C13679b;
import TJ.C16532g;
import TJ.C16533h;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4899r0;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.o1;
import U0.p1;
import XH.C16807N;
import XH.t;
import XH.y;
import YH.C16877v;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.core.model.Image;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import gs.e;
import i1.C5437c;
import jC.C14615b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kC.C14673d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import lC.l;
import mp.C11588a;
import nI.C17631a;
import nI.C17642l;
import nI.r;
import p0.s;
import p1.C5747v0;
import s0.C5834E;
import s0.C5852X;
import s0.C5857c;
import s0.C5862h;
import tK.C18030v;
import u0.C5968C;
import u0.C5972G;
import u0.C5974I;
import u0.C5975J;
import u0.C5978b;
import u0.C5979c;
import u0.C5984h;
import u0.C5987k;
import u0.C5991o;
import u0.C5993q;
import uI.C18059h;
import uK.C18146a;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\b\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0001\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0001\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00162\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0001\u0010 \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b \u0010!\u001a\u001b\u0010#\u001a\u00020\u0004*\u00020\"2\u0006\u0010\u000b\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$\u001aC\u0010%\u001a\u00020\u0004*\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b%\u0010&\u001aa\u0010*\u001a\u00020\u0004*\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00162\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u001a2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0002¢\u0006\u0004\b*\u0010+\u001a/\u0010,\u001a\u00020\u0004*\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0002¢\u0006\u0004\b,\u0010-\u001aI\u0010.\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00162\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0003¢\u0006\u0004\b.\u0010/\u001a+\u00102\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00162\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b2\u00103\u001aG\u00106\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00162\u0006\u00104\u001a\u00020\u001a2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b6\u00107\u001a'\u00109\u001a\u00020\u00042\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\b9\u0010:\u001a!\u0010<\u001a\u00020\u00042\b\u0010;\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0003¢\u0006\u0004\b<\u0010=\u001a\u000f\u0010>\u001a\u00020\u0004H\u0003¢\u0006\u0004\b>\u0010?\u001a+\u0010A\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0003¢\u0006\u0004\bA\u0010B\u001a=\u0010G\u001a\u00020\u00042\u0006\u0010D\u001a\u00020C2\u0006\u0010E\u001a\u00020C2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\u0012\u0010F\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\bG\u0010H\u001a\u000f\u0010I\u001a\u00020\u001aH\u0003¢\u0006\u0004\bI\u0010J¨\u0006K²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u0002²\u0006\u0010\u0010;\u001a\u0004\u0018\u00010\u00188\n@\nX\u0002²\u0006\u000e\u0010\u001b\u001a\u00020\u001a8\n@\nX\u0002²\u0006\u000e\u0010)\u001a\u00020\u001a8\n@\nX\u0002"}, d2 = {"LNA/c0;", "viewModel", "Lkotlin/Function1;", "LOp/c1;", "LXH/N;", "onProductItemEvent", "LKA/c;", "onShoppableImageScreenUiEvent", "z0", "(LNA/c0;LnI/l;LnI/l;LU0/m;I)V", "LNA/c0$b;", "uiState", "LNA/d;", "atcUiEvent", "Lkotlin/Function0;", "onUiEventConsumed", "onErrorTryAgainClicked", "onUserHasSeenNudge", "", "onUserSwipedContextualImage", "q0", "(LNA/c0$b;LNA/d;LnI/l;LnI/a;LnI/a;LnI/l;LnI/a;LnI/l;LU0/m;I)V", "LNA/c0$b$c;", "onScreenUiEvent", "Landroid/graphics/drawable/Drawable;", "onHeaderImageLoaded", "", "showStatusbar", "Landroidx/compose/ui/d;", "modifier", "x0", "(LNA/c0$b$c;LnI/l;LnI/l;LnI/l;LnI/a;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "k0", "(LNA/c0$b$c;LnI/l;LnI/l;LnI/l;LnI/a;LnI/l;LnI/l;LU0/m;I)V", "Lu0/C;", "X0", "(Lu0/C;LNA/c0$b$c;)V", "V0", "(Lu0/C;LNA/c0$b$c;LnI/l;LnI/l;)V", "Lu0/I;", "lazyGridState", "triggerNudgeConsumed", "R0", "(Lu0/C;LNA/c0$b$c;LnI/l;Lu0/I;ZLnI/l;LnI/a;)V", "N0", "(Lu0/C;LNA/c0$b$c;LnI/l;)V", "d0", "(LNA/c0$b$c;LnI/l;LnI/l;Landroidx/compose/ui/d;LU0/m;II)V", "Lmp/a;", "onInspirationClicked", "b0", "(LNA/c0$b$c;LnI/l;LU0/m;I)V", "includeCloseButton", "onImageLoaded", "W", "(LNA/c0$b$c;ZLnI/l;LnI/l;LU0/m;I)V", "onClick", "K", "(Landroidx/compose/ui/d;LnI/a;LU0/m;II)V", "headerImageDrawable", "U", "(Landroid/graphics/drawable/Drawable;ZLU0/m;I)V", "O", "(LU0/m;I)V", "onCloseClicked", "M", "(LnI/a;LnI/a;LU0/m;I)V", "", "columns", "itemCount", "content", "i0", "(IILandroidx/compose/ui/d;LnI/q;LU0/m;II)V", "M0", "(LU0/m;I)Z", "shoppableimage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: NA.U  reason: case insensitive filesystem */
public final class C13236U {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageScreenKt$HandleStatusbarIconColor$1$1", f = "ShoppableImageScreen.kt", l = {670}, m = "invokeSuspend")
    /* renamed from: NA.U$a */
    static final class a extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        Object f112222c;

        /* renamed from: d  reason: collision with root package name */
        int f112223d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ jC.i f112224e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ boolean f112225f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Drawable f112226g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ boolean f112227h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(jC.i iVar, boolean z10, Drawable drawable, boolean z11, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f112224e = iVar;
            this.f112225f = z10;
            this.f112226g = drawable;
            this.f112227h = z11;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f112224e, this.f112225f, this.f112226g, this.f112227h, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            lC.l lVar;
            C14615b bVar;
            lC.l lVar2;
            Object f10 = C17187b.f();
            int i10 = this.f112223d;
            if (i10 == 0) {
                y.b(obj);
                lVar = this.f112224e.a();
                if (this.f112225f) {
                    bVar = C14615b.e.f127859b;
                } else if (this.f112226g != null) {
                    lC.l a10 = this.f112224e.a();
                    Drawable drawable = this.f112226g;
                    this.f112222c = lVar;
                    this.f112223d = 1;
                    Object a11 = l.a.a(a10, drawable, (C14615b) null, false, this, 6, (Object) null);
                    if (a11 == f10) {
                        return f10;
                    }
                    lVar2 = lVar;
                    obj = a11;
                } else {
                    bVar = this.f112227h ? C14615b.c.f127858b : C14615b.C3152b.f127857b;
                }
                lVar.a(bVar);
                return C16807N.f139792a;
            } else if (i10 == 1) {
                lVar2 = (lC.l) this.f112222c;
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lC.l lVar3 = lVar2;
            bVar = (C14615b) obj;
            lVar = lVar3;
            lVar.a(bVar);
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$b */
    static final class b implements nI.q<f1, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17642l<f1, C16807N> f112228a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<f1, C16807N> f112229b;

        b(C17642l<? super f1, C16807N> lVar, C17642l<? super f1, C16807N> lVar2) {
            this.f112228a = lVar;
            this.f112229b = lVar2;
        }

        public final void a(f1 f1Var, C4889m mVar, int i10) {
            C17542s.j(f1Var, "product");
            if ((i10 & 6) == 0) {
                i10 |= (i10 & 8) == 0 ? mVar.V(f1Var) : mVar.F(f1Var) ? 4 : 2;
            }
            if ((i10 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1124532223, i10, -1, "com.ingka.ikea.shoppableimage.impl.presentation.ImageSection.<anonymous>.<anonymous> (ShoppableImageScreen.kt:619)");
                }
                Mo.Q.g(f1Var, this.f112228a, this.f112229b, (androidx.compose.ui.d) null, mVar, f1.f85176d | 384 | (i10 & 14), 8);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((f1) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$c */
    static final class c implements nI.q<Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<C11588a> f112230a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C11588a, C16807N> f112231b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List<C11588a> f112232c;

        c(List<C11588a> list, C17642l<? super C11588a, C16807N> lVar, List<C11588a> list2) {
            this.f112230a = list;
            this.f112231b = lVar;
            this.f112232c = list2;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, List list, int i10, C11588a aVar) {
            C17542s.j(aVar, "it");
            lVar.invoke(list.get(i10));
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(int r11, U0.C4889m r12, int r13) {
            /*
                r10 = this;
                r0 = r13 & 6
                r1 = 4
                if (r0 != 0) goto L_0x000f
                boolean r0 = r12.d(r11)
                if (r0 == 0) goto L_0x000d
                r0 = r1
                goto L_0x000e
            L_0x000d:
                r0 = 2
            L_0x000e:
                r13 = r13 | r0
            L_0x000f:
                r0 = r13 & 19
                r2 = 18
                if (r0 != r2) goto L_0x0021
                boolean r0 = r12.l()
                if (r0 != 0) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r12.L()
                goto L_0x00bb
            L_0x0021:
                boolean r0 = U0.C4895p.J()
                if (r0 == 0) goto L_0x0030
                r0 = -1
                java.lang.String r2 = "com.ingka.ikea.shoppableimage.impl.presentation.InspirationsSection.<anonymous>.<anonymous> (ShoppableImageScreen.kt:558)"
                r3 = 1752381930(0x687339ea, float:4.5944135E24)
                U0.C4895p.S(r3, r13, r0, r2)
            L_0x0030:
                java.util.List<mp.a> r0 = r10.f112230a
                java.lang.Object r0 = r0.get(r11)
                r2 = r0
                mp.a r2 = (mp.C11588a) r2
                LC.b$a r3 = LC.C13178b.a.f111818a
                r0 = -50035149(0xfffffffffd048633, float:-1.1009681E37)
                r12.W(r0)
                nI.l<mp.a, XH.N> r0 = r10.f112231b
                boolean r0 = r12.V(r0)
                java.util.List<mp.a> r4 = r10.f112232c
                boolean r4 = r12.F(r4)
                r0 = r0 | r4
                r13 = r13 & 14
                if (r13 != r1) goto L_0x0054
                r13 = 1
                goto L_0x0055
            L_0x0054:
                r13 = 0
            L_0x0055:
                r13 = r13 | r0
                nI.l<mp.a, XH.N> r0 = r10.f112231b
                java.util.List<mp.a> r4 = r10.f112232c
                java.lang.Object r5 = r12.D()
                if (r13 != 0) goto L_0x0068
                U0.m$a r13 = U0.C4889m.f14007a
                java.lang.Object r13 = r13.a()
                if (r5 != r13) goto L_0x0070
            L_0x0068:
                NA.V r5 = new NA.V
                r5.<init>(r0, r4, r11)
                r12.u(r5)
            L_0x0070:
                r4 = r5
                nI.l r4 = (nI.C17642l) r4
                r12.P()
                androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                float r0 = (float) r1
                float r0 = c2.h.B(r0)
                androidx.compose.ui.d r13 = androidx.compose.foundation.layout.D.i(r13, r0)
                r0 = 6
                float r0 = (float) r0
                float r0 = c2.h.B(r0)
                A0.f r0 = A0.g.e(r0)
                androidx.compose.ui.d r5 = m1.e.a(r13, r0)
                java.util.List<mp.a> r13 = r10.f112230a
                java.lang.Object r11 = r13.get(r11)
                mp.a r11 = (mp.C11588a) r11
                float r11 = r11.d()
                r13 = 1065353216(0x3f800000, float:1.0)
                int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r11 != 0) goto L_0x00a7
                java.lang.Float r11 = java.lang.Float.valueOf(r13)
            L_0x00a5:
                r6 = r11
                goto L_0x00a9
            L_0x00a7:
                r11 = 0
                goto L_0x00a5
            L_0x00a9:
                int r11 = LC.C13178b.a.f111819b
                int r8 = r11 << 3
                r9 = 0
                r7 = r12
                MC.C13203i.c(r2, r3, r4, r5, r6, r7, r8, r9)
                boolean r11 = U0.C4895p.J()
                if (r11 == 0) goto L_0x00bb
                U0.C4895p.R()
            L_0x00bb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: NA.C13236U.c.b(int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b(((Number) obj).intValue(), (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageScreenKt$PortraitShoppableImageDetails$1$1", f = "ShoppableImageScreen.kt", l = {263}, m = "invokeSuspend")
    /* renamed from: NA.U$d */
    static final class d extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112233c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C5974I f112234d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<Boolean, C16807N> f112235e;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: NA.U$d$a */
        static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C17642l<Boolean, C16807N> f112236a;

            a(C17642l<? super Boolean, C16807N> lVar) {
                this.f112236a = lVar;
            }

            /* renamed from: c */
            public final Object emit(List<? extends C5987k> list, C17164e<? super C16807N> eVar) {
                Iterable iterable = list;
                boolean z10 = false;
                if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C17542s.e(((C5987k) it.next()).getKey(), "ImageSection")) {
                                z10 = true;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                this.f112236a.invoke(kotlin.coroutines.jvm.internal.b.a(!z10));
                return C16807N.f139792a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(C5974I i10, C17642l<? super Boolean, C16807N> lVar, C17164e<? super d> eVar) {
            super(2, eVar);
            this.f112234d = i10;
            this.f112235e = lVar;
        }

        /* access modifiers changed from: private */
        public static final List j(C5974I i10) {
            return i10.v().i();
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new d(this.f112234d, this.f112235e, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((d) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f112233c;
            if (i10 == 0) {
                y.b(obj);
                C16532g r10 = p1.r(new C13238W(this.f112234d));
                a aVar = new a(this.f112235e);
                this.f112233c = 1;
                if (r10.collect(aVar, this) == f10) {
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
    /* renamed from: NA.U$e */
    static final class e implements nI.p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f112237a;

        e(L0 l02) {
            this.f112237a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-191339263, i10, -1, "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageComposable.<anonymous> (ShoppableImageScreen.kt:143)");
                }
                Y2.c(this.f112237a, (androidx.compose.ui.d) null, (r<? super H0, ? super nI.p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
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
    /* renamed from: NA.U$f */
    static final class f implements nI.q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0.b f112238a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f112239b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<C13125c, C16807N> f112240c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<c1, C16807N> f112241d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f112242e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f112243f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C4899r0<Drawable> f112244g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ C4899r0<Boolean> f112245h;

        f(c0.b bVar, C17631a<C16807N> aVar, C17642l<? super C13125c, C16807N> lVar, C17642l<? super c1, C16807N> lVar2, C17631a<C16807N> aVar2, C17642l<? super String, C16807N> lVar3, C4899r0<Drawable> r0Var, C4899r0<Boolean> r0Var2) {
            this.f112238a = bVar;
            this.f112239b = aVar;
            this.f112240c = lVar;
            this.f112241d = lVar2;
            this.f112242e = aVar2;
            this.f112243f = lVar3;
            this.f112244g = r0Var;
            this.f112245h = r0Var2;
        }

        /* access modifiers changed from: private */
        public static final C16807N f(C17642l lVar) {
            lVar.invoke(C13125c.a.f111474a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C4899r0 r0Var, Drawable drawable) {
            C17542s.j(drawable, "it");
            C13236U.s0(r0Var, drawable);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N i(C4899r0 r0Var, boolean z10) {
            C13236U.u0(r0Var, z10);
            return C16807N.f139792a;
        }

        public final void e(C5834E e10, C4889m mVar, int i10) {
            int i11;
            C5834E e11 = e10;
            C4889m mVar2 = mVar;
            C17542s.j(e11, "contentPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(e11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1106659402, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageComposable.<anonymous> (ShoppableImageScreen.kt:150)");
                }
                androidx.compose.ui.d h10 = D.h(J.f(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null), e11);
                c0.b bVar = this.f112238a;
                C17631a<C16807N> aVar = this.f112239b;
                C17642l<C13125c, C16807N> lVar = this.f112240c;
                C17642l<c1, C16807N> lVar2 = this.f112241d;
                C17631a<C16807N> aVar2 = this.f112242e;
                C17642l<String, C16807N> lVar3 = this.f112243f;
                C4899r0<Drawable> r0Var = this.f112244g;
                C4899r0<Boolean> r0Var2 = this.f112245h;
                I h11 = C5077h.h(C5437c.f24302a.o(), false);
                int a10 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                androidx.compose.ui.d e12 = androidx.compose.ui.c.e(mVar2, h10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a11 = aVar3.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a11);
                } else {
                    mVar.t();
                }
                C4889m a12 = F1.a(mVar);
                F1.c(a12, h11, aVar3.c());
                F1.c(a12, s10, aVar3.e());
                nI.p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                    a12.u(Integer.valueOf(a10));
                    a12.w(Integer.valueOf(a10), b10);
                }
                F1.c(a12, e12, aVar3.d());
                C5079j jVar = C5079j.f18125a;
                if (C17542s.e(bVar, c0.b.C2761b.f112305a)) {
                    mVar2.W(216571269);
                    C13236U.O(mVar2, 0);
                    mVar.P();
                } else if (bVar instanceof c0.b.a) {
                    mVar2.W(-1876121649);
                    mVar2.W(216579313);
                    boolean V10 = mVar2.V(lVar);
                    Object D10 = mVar.D();
                    if (V10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C13239X(lVar);
                        mVar2.u(D10);
                    }
                    mVar.P();
                    C13236U.M(aVar, (C17631a) D10, mVar2, 0);
                    mVar.P();
                } else if (bVar instanceof c0.b.c) {
                    mVar2.W(-1875713627);
                    c0.b.c cVar = (c0.b.c) bVar;
                    mVar2.W(216595790);
                    Object D11 = mVar.D();
                    C4889m.a aVar4 = C4889m.f14007a;
                    if (D11 == aVar4.a()) {
                        D11 = new C13240Y(r0Var);
                        mVar2.u(D11);
                    }
                    C17642l lVar4 = (C17642l) D11;
                    mVar.P();
                    mVar2.W(216602760);
                    Object D12 = mVar.D();
                    if (D12 == aVar4.a()) {
                        D12 = new C13241Z(r0Var2);
                        mVar2.u(D12);
                    }
                    mVar.P();
                    C13236U.x0(cVar, lVar2, lVar, lVar4, aVar2, lVar3, (C17642l) D12, (androidx.compose.ui.d) null, mVar, 1575936, 128);
                    if (C13236U.t0(r0Var2)) {
                        C14673d.b((androidx.compose.ui.d) null, C5747v0.o(C18030v.f147664a.a(mVar2, C18030v.f147665b).k0(), 0.5f, 0.0f, 0.0f, 0.0f, 14, (Object) null), false, mVar, 0, 5);
                    }
                    mVar.P();
                } else {
                    mVar2.W(216569063);
                    mVar.P();
                    throw new t();
                }
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
            e((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageScreenKt$ShoppableImageComposable$3$1$1", f = "ShoppableImageScreen.kt", l = {195}, m = "invokeSuspend")
    /* renamed from: NA.U$g */
    static final class g extends kotlin.coroutines.jvm.internal.l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f112246c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f112247d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f112248e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f112249f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        g(L0 l02, String str, C17631a<C16807N> aVar, C17164e<? super g> eVar) {
            super(2, eVar);
            this.f112247d = l02;
            this.f112248e = str;
            this.f112249f = aVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new g(this.f112247d, this.f112248e, this.f112249f, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((g) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f112246c;
            if (i10 == 0) {
                y.b(obj);
                L0 l02 = this.f112247d;
                String str = this.f112248e;
                J0 j02 = J0.Short;
                this.f112246c = 1;
                if (L0.f(l02, str, (String) null, false, j02, this, 6, (Object) null) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f112249f.invoke();
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$h */
    /* synthetic */ class h extends C17540p implements C17631a<C16807N> {
        h(Object obj) {
            super(0, obj, c0.class, "onUiEventConsumed", "onUiEventConsumed()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((c0) this.receiver).N();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$i */
    /* synthetic */ class i extends C17540p implements C17631a<C16807N> {
        i(Object obj) {
            super(0, obj, c0.class, "loadData", "loadData()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((c0) this.receiver).J();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$j */
    /* synthetic */ class j extends C17540p implements C17631a<C16807N> {
        j(Object obj) {
            super(0, obj, c0.class, "onUserHasSeenNudge", "onUserHasSeenNudge$shoppableimage_implementation_release()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((c0) this.receiver).O();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$k */
    /* synthetic */ class k extends C17540p implements C17642l<String, C16807N> {
        k(Object obj) {
            super(1, obj, c0.class, "onUserSwipedContextualImage", "onUserSwipedContextualImage$shoppableimage_implementation_release(Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((String) obj);
            return C16807N.f139792a;
        }

        public final void t(String str) {
            C17542s.j(str, "p0");
            ((c0) this.receiver).P(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$l */
    static final class l implements nI.q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0.b.c f112250a;

        l(c0.b.c cVar) {
            this.f112250a = cVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(oVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-441392352, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.moreInspirationsSection.<anonymous> (ShoppableImageScreen.kt:410)");
                }
                String d10 = this.f112250a.a().d();
                if (d10 != null) {
                    C13607l.j(d10, C13679b.C2857b.c.f116685a, D.k(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, c2.h.B((float) 24), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$m */
    static final class m implements r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<C11588a> f112251a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C13125c, C16807N> f112252b;

        m(List<C11588a> list, C17642l<? super C13125c, C16807N> lVar) {
            this.f112251a = list;
            this.f112252b = lVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, List list, int i10, C11588a aVar) {
            C17542s.j(aVar, "it");
            lVar.invoke(new C13125c.b(((C11588a) list.get(i10)).e().getUrl(), ((C11588a) list.get(i10)).f()));
            return C16807N.f139792a;
        }

        public final void b(C5991o oVar, int i10, C4889m mVar, int i11) {
            C17542s.j(oVar, "$this$items");
            if ((i11 & 48) == 0) {
                i11 |= mVar.d(i10) ? 32 : 16;
            }
            if ((i11 & 145) != 144 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1557167600, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.moreInspirationsSection.<anonymous>.<anonymous> (ShoppableImageScreen.kt:427)");
                }
                C11588a aVar = this.f112251a.get(i10);
                C13178b.a aVar2 = C13178b.a.f111818a;
                mVar.W(-1003572992);
                boolean V10 = mVar.V(this.f112252b) | mVar.F(this.f112251a) | ((i11 & 112) == 32);
                C17642l<C13125c, C16807N> lVar = this.f112252b;
                List<C11588a> list = this.f112251a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a0(lVar, list, i10);
                    mVar.u(D10);
                }
                mVar.P();
                C13203i.c(aVar, aVar2, (C17642l) D10, m1.e.a(D.i(androidx.compose.ui.d.f18749a, c2.h.B((float) 4)), A0.g.e(c2.h.B((float) 6))), (Float) null, mVar, C13178b.a.f111819b << 3, 16);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            b((C5991o) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$n */
    static final class n implements r<C5991o, Integer, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<f1> f112253a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5974I f112254b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f112255c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<c1, C16807N> f112256d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C17642l<String, C16807N> f112257e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f112258f;

        n(List<f1> list, C5974I i10, boolean z10, C17642l<? super c1, C16807N> lVar, C17642l<? super String, C16807N> lVar2, C17631a<C16807N> aVar) {
            this.f112253a = list;
            this.f112254b = i10;
            this.f112255c = z10;
            this.f112256d = lVar;
            this.f112257e = lVar2;
            this.f112258f = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C17642l lVar, List list, int i10) {
            lVar.invoke(((f1) list.get(i10)).b().p().f());
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v0, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(u0.C5991o r21, int r22, U0.C4889m r23, int r24) {
            /*
                r20 = this;
                r0 = r20
                r1 = r22
                r14 = r23
                java.lang.String r2 = "$this$items"
                r3 = r21
                kotlin.jvm.internal.C17542s.j(r3, r2)
                r2 = r24 & 48
                r3 = 32
                if (r2 != 0) goto L_0x0020
                boolean r2 = r14.d(r1)
                if (r2 == 0) goto L_0x001b
                r2 = r3
                goto L_0x001d
            L_0x001b:
                r2 = 16
            L_0x001d:
                r2 = r24 | r2
                goto L_0x0022
            L_0x0020:
                r2 = r24
            L_0x0022:
                r4 = r2 & 145(0x91, float:2.03E-43)
                r5 = 144(0x90, float:2.02E-43)
                if (r4 != r5) goto L_0x0034
                boolean r4 = r23.l()
                if (r4 != 0) goto L_0x002f
                goto L_0x0034
            L_0x002f:
                r23.L()
                goto L_0x00f3
            L_0x0034:
                boolean r4 = U0.C4895p.J()
                if (r4 == 0) goto L_0x0043
                r4 = -1
                java.lang.String r5 = "com.ingka.ikea.shoppableimage.impl.presentation.productsSection.<anonymous>.<anonymous> (ShoppableImageScreen.kt:372)"
                r6 = -1659289974(0xffffffff9d193e8a, float:-2.0281713E-21)
                U0.C4895p.S(r6, r2, r4, r5)
            L_0x0043:
                java.util.List<Op.f1> r4 = r0.f112253a
                java.lang.Object r4 = r4.get(r1)
                Op.f1 r4 = (Op.f1) r4
                androidx.compose.ui.d$a r5 = androidx.compose.ui.d.f18749a
                Op.d1 r6 = r4.b()
                Op.d r6 = r6.p()
                java.lang.String r6 = r6.f()
                u0.I r7 = r0.f112254b
                U0.I0 r8 = androidx.compose.ui.platform.C5100f0.e()
                java.lang.Object r8 = r14.Q(r8)
                c2.d r8 = (c2.d) r8
                androidx.compose.ui.d r6 = Cl.a.a(r5, r6, r7, r8)
                Op.d1 r7 = r4.b()
                r5 = 24
                float r5 = (float) r5
                float r5 = c2.h.B(r5)
                s0.E r11 = androidx.compose.foundation.layout.D.a(r5)
                LC.b$a r18 = LC.C13178b.a.f111818a
                boolean r5 = r0.f112255c
                if (r5 != 0) goto L_0x0089
                boolean r4 = r4.c()
                if (r4 == 0) goto L_0x0089
                Op.A r4 = Op.A.NUDGE
            L_0x0086:
                r19 = r4
                goto L_0x008c
            L_0x0089:
                Op.A r4 = Op.A.DISABLED
                goto L_0x0086
            L_0x008c:
                nI.l<Op.c1, XH.N> r4 = r0.f112256d
                r5 = 1654106678(0x6297aa36, float:1.3988617E21)
                r14.W(r5)
                nI.l<java.lang.String, XH.N> r5 = r0.f112257e
                boolean r5 = r14.V(r5)
                java.util.List<Op.f1> r8 = r0.f112253a
                boolean r8 = r14.F(r8)
                r5 = r5 | r8
                r2 = r2 & 112(0x70, float:1.57E-43)
                if (r2 != r3) goto L_0x00a7
                r2 = 1
                goto L_0x00a8
            L_0x00a7:
                r2 = 0
            L_0x00a8:
                r2 = r2 | r5
                nI.l<java.lang.String, XH.N> r3 = r0.f112257e
                java.util.List<Op.f1> r5 = r0.f112253a
                java.lang.Object r8 = r23.D()
                if (r2 != 0) goto L_0x00bb
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r8 != r2) goto L_0x00c3
            L_0x00bb:
                NA.b0 r8 = new NA.b0
                r8.<init>(r3, r5, r1)
                r14.u(r8)
            L_0x00c3:
                r12 = r8
                nI.a r12 = (nI.C17631a) r12
                r23.P()
                nI.a<XH.N> r13 = r0.f112258f
                int r1 = LC.C13178b.a.f111819b
                int r1 = r1 << 15
                r2 = 1573248(0x180180, float:2.20459E-39)
                r15 = r1 | r2
                r16 = 0
                r17 = 912(0x390, float:1.278E-42)
                r3 = 0
                r5 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r1 = r7
                r2 = r4
                r4 = r6
                r6 = r18
                r7 = r11
                r11 = r19
                r14 = r23
                Op.C10872z0.y0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x00f3
                U0.C4895p.R()
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: NA.C13236U.n.b(u0.o, int, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object l(Object obj, Object obj2, Object obj3, Object obj4) {
            b((C5991o) obj, ((Number) obj2).intValue(), (C4889m) obj3, ((Number) obj4).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$o */
    static final class o implements nI.q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0.b.c f112259a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<C13125c, C16807N> f112260b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<Drawable, C16807N> f112261c;

        o(c0.b.c cVar, C17642l<? super C13125c, C16807N> lVar, C17642l<? super Drawable, C16807N> lVar2) {
            this.f112259a = cVar;
            this.f112260b = lVar;
            this.f112261c = lVar2;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            C17542s.j(oVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-1935896348, i10, -1, "com.ingka.ikea.shoppableimage.impl.presentation.shoppableImageSection.<anonymous> (ShoppableImageScreen.kt:341)");
                }
                C13236U.W(this.f112259a, true, this.f112260b, this.f112261c, mVar, 48);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$p */
    static final class p implements nI.q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0.b.c f112262a;

        p(c0.b.c cVar) {
            this.f112262a = cVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(oVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(568080928, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.titleAndDescriptionSection.<anonymous> (ShoppableImageScreen.kt:303)");
                }
                String f10 = this.f112262a.a().f();
                if (f10 != null) {
                    C13607l.j(f10, C13679b.C2857b.C2858b.f116684a, D.m(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, c2.h.B((float) 24), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: NA.U$q */
    static final class q implements nI.q<C5991o, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0.b.c f112263a;

        q(c0.b.c cVar) {
            this.f112263a = cVar;
        }

        public final void a(C5991o oVar, C4889m mVar, int i10) {
            int i11 = i10;
            C17542s.j(oVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-902190775, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.titleAndDescriptionSection.<anonymous> (ShoppableImageScreen.kt:319)");
                }
                String a10 = this.f112263a.a().a();
                if (a10 != null) {
                    C13607l.j(a10, C13679b.a.C2856b.f116680a, D.m(TC.e.i(androidx.compose.ui.d.f18749a), 0.0f, c2.h.B((float) 12), 0.0f, 0.0f, 13, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
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
            a((C5991o) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    private static final c0.b A0(A1<? extends c0.b> a12) {
        return (c0.b) a12.getValue();
    }

    private static final C13245d B0(A1<? extends C13245d> a12) {
        return (C13245d) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N C0(c0 c0Var, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        z0(c0Var, lVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N D0(C17642l lVar, c0 c0Var, c1 c1Var) {
        C17542s.j(c1Var, "productItemUiEvent");
        lVar.invoke(c1Var);
        c0Var.K(c1Var);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N E0(C17642l lVar, c0 c0Var, C13125c cVar) {
        C17542s.j(cVar, "uiEvent");
        lVar.invoke(cVar);
        c0Var.L(cVar);
        return C16807N.f139792a;
    }

    private static final void K(androidx.compose.ui.d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        C17631a<C16807N> aVar2 = aVar;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1017671002);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i14 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            d.a aVar3 = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1017671002, i12, -1, "com.ingka.ikea.shoppableimage.impl.presentation.CloseButton (ShoppableImageScreen.kt:649)");
            }
            androidx.compose.ui.d dVar3 = aVar3;
            F0.b(C18146a.f148097J2, J1.j.b(Oo.b.f84665i, k10, 0), C5852X.e(D.i(aVar3, c2.h.B((float) 24))), false, SC.H0.PrimaryInverse, G0.Small, (r0.m) null, false, aVar, k10, ((i12 << 21) & 234881024) | 221184, 200);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = dVar3;
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C13255n(dVar2, aVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N L(androidx.compose.ui.d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        K(dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void M(C17631a<C16807N> aVar, C17631a<C16807N> aVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        C17631a<C16807N> aVar3 = aVar;
        C17631a<C16807N> aVar4 = aVar2;
        int i12 = i10;
        C4889m k10 = mVar.k(1651857330);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(aVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar4) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1651857330, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.FullScreenError (ShoppableImageScreen.kt:728)");
            }
            d.a aVar5 = androidx.compose.ui.d.f18749a;
            androidx.compose.ui.d f10 = J.f(aVar5, 0.0f, 1, (Object) null);
            C5437c.a aVar6 = C5437c.f24302a;
            I h10 = C5077h.h(aVar6.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, f10);
            C4504g.a aVar7 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar7.a();
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
            F1.c(a12, h10, aVar7.c());
            F1.c(a12, s10, aVar7.e());
            nI.p<C4504g, Integer, C16807N> b10 = aVar7.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar7.d());
            C5079j jVar = C5079j.f18125a;
            K(jVar.a(aVar5, aVar6.n()), aVar4, k10, i11 & 112, 0);
            androidx.compose.ui.d i13 = TC.e.i(jVar.a(aVar5, aVar6.e()));
            I a13 = C5080k.a(C5073d.f18068a.n(c2.h.B((float) 24)), aVar6.k(), k10, 6);
            int a14 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            androidx.compose.ui.d e11 = androidx.compose.ui.c.e(k10, i13);
            C17631a<C4504g> a15 = aVar7.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a15);
            } else {
                k10.t();
            }
            C4889m a16 = F1.a(k10);
            F1.c(a16, a13, aVar7.c());
            F1.c(a16, s11, aVar7.e());
            nI.p<C4504g, Integer, C16807N> b11 = aVar7.b();
            if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                a16.u(Integer.valueOf(a14));
                a16.w(Integer.valueOf(a14), b11);
            }
            F1.c(a16, e11, aVar7.d());
            C5862h hVar = C5862h.f28810a;
            C13607l.j(J1.j.b(Oo.b.f84812v3, k10, 0), C13679b.C2857b.C2858b.f116684a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (Y1.k) null, (Y1.j) null, (Y1.f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, k10, 48, 0, 262140);
            mVar2 = k10;
            F0.b(C18146a.f148569o, J1.j.b(Oo.b.f84823w3, k10, 0), hVar.b(aVar5, aVar6.g()), false, (SC.H0) null, (G0) null, (r0.m) null, false, aVar, k10, (i11 << 24) & 234881024, 248);
            mVar2.x();
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
            n10.a(new C13235T(aVar3, aVar4, i12));
        }
    }

    private static final boolean M0(C4889m mVar, int i10) {
        mVar.W(136608928);
        if (C4895p.J()) {
            C4895p.S(136608928, i10, -1, "com.ingka.ikea.shoppableimage.impl.presentation.isLandscape (ShoppableImageScreen.kt:793)");
        }
        boolean z10 = ((Configuration) mVar.Q(AndroidCompositionLocals_androidKt.f())).orientation == 2;
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return z10;
    }

    /* access modifiers changed from: private */
    public static final C16807N N(C17631a aVar, C17631a aVar2, int i10, C4889m mVar, int i11) {
        M(aVar, aVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void N0(C5968C c10, c0.b.c cVar, C17642l<? super C13125c, C16807N> lVar) {
        c10.d("InspirationsTitle", new C13221E(), "InspirationsTitle", c1.c.c(-441392352, true, new l(cVar)));
        List<C11588a> c11 = cVar.a().c();
        if (c11 != null) {
            C5968C.c(c10, c11.size(), new C13223G(c11), (nI.p) null, new C13224H(), c1.c.c(1557167600, true, new m(c11, lVar)), 4, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void O(C4889m mVar, int i10) {
        C4889m k10 = mVar.k(546101548);
        if (i10 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(546101548, i10, -1, "com.ingka.ikea.shoppableimage.impl.presentation.FullScreenLoading (ShoppableImageScreen.kt:680)");
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
            nI.p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            androidx.compose.ui.d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            C5978b.a aVar3 = new C5978b.a(2);
            k10.W(246517070);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new C13232P();
                k10.u(D10);
            }
            k10.P();
            C5984h.a(aVar3, h10, (C5974I) null, (C5834E) null, false, (C5073d.m) null, (C5073d.e) null, (s) null, false, (C17642l) D10, k10, 805306416, 508);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C13233Q(i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C5979c O0(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(qVar.a()));
    }

    /* access modifiers changed from: private */
    public static final C16807N P(C5968C c10) {
        C17542s.j(c10, "$this$LazyVerticalGrid");
        C13252k kVar = new C13252k();
        C13242a aVar = C13242a.f112271a;
        C5968C c11 = c10;
        C5968C.f(c11, (Object) null, kVar, (Object) null, aVar.a(), 5, (Object) null);
        C5968C.f(c10, (Object) null, new C13253l(), (Object) null, aVar.b(), 5, (Object) null);
        C5968C.c(c11, 6, (C17642l) null, new C13254m(), (C17642l) null, aVar.c(), 10, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Object P0(List list, int i10) {
        return ((C11588a) list.get(i10)).f();
    }

    /* access modifiers changed from: private */
    public static final C5979c Q(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(2));
    }

    /* access modifiers changed from: private */
    public static final Object Q0(int i10) {
        return "Inspirations";
    }

    /* access modifiers changed from: private */
    public static final C5979c R(C5993q qVar) {
        C17542s.j(qVar, "$this$item");
        return C5979c.a(C5972G.a(2));
    }

    private static final void R0(C5968C c10, c0.b.c cVar, C17642l<? super c1, C16807N> lVar, C5974I i10, boolean z10, C17642l<? super String, C16807N> lVar2, C17631a<C16807N> aVar) {
        nI.p pVar;
        List<f1> e10 = cVar.a().e();
        if (e10 != null) {
            boolean z11 = e10.size() == 1;
            int size = e10.size();
            C13218B b10 = new C13218B(e10);
            if (z11) {
                new C13219C
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0021: CONSTRUCTOR  (r0v5 ? I:NA.C) =  call: NA.C.<init>():void type: CONSTRUCTOR in method: NA.U.R0(u0.C, NA.c0$b$c, nI.l, u0.I, boolean, nI.l, nI.a):void, dex: classes5.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:256)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                    	at java.util.ArrayList.forEach(ArrayList.java:1259)
                    	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                    	at java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:483)
                    	at java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)
                    	at java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                    	at java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                    	at java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                    	at java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:485)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r0v5 ?
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:189)
                    	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:620)
                    	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	... 41 more
                    */
                /*
                    OA.a r0 = r14.a()
                    java.util.List r2 = r0.e()
                    if (r2 == 0) goto L_0x004c
                    int r0 = r2.size()
                    r8 = 1
                    if (r0 != r8) goto L_0x0013
                    r0 = r8
                    goto L_0x0014
                L_0x0013:
                    r0 = 0
                L_0x0014:
                    int r9 = r2.size()
                    NA.B r10 = new NA.B
                    r10.<init>(r2)
                    if (r0 == 0) goto L_0x0025
                    NA.C r0 = new NA.C
                    r0.<init>()
                    goto L_0x0026
                L_0x0025:
                    r0 = 0
                L_0x0026:
                    NA.D r11 = new NA.D
                    r11.<init>()
                    NA.U$n r12 = new NA.U$n
                    r1 = r12
                    r3 = r16
                    r4 = r17
                    r5 = r15
                    r6 = r18
                    r7 = r19
                    r1.<init>(r2, r3, r4, r5, r6, r7)
                    r1 = -1659289974(0xffffffff9d193e8a, float:-2.0281713E-21)
                    c1.a r1 = c1.c.c(r1, r8, r12)
                    r14 = r9
                    r15 = r10
                    r16 = r0
                    r17 = r11
                    r18 = r1
                    r13.h(r14, r15, r16, r17, r18)
                L_0x004c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: NA.C13236U.R0(u0.C, NA.c0$b$c, nI.l, u0.I, boolean, nI.l, nI.a):void");
            }

            /* access modifiers changed from: private */
            public static final C5979c S(C5993q qVar, int i10) {
                C17542s.j(qVar, "$this$items");
                return C5979c.a(C5972G.a(1));
            }

            /* access modifiers changed from: private */
            public static final Object S0(List list, int i10) {
                return ((f1) list.get(i10)).b().p().f();
            }

            /* access modifiers changed from: private */
            public static final C16807N T(int i10, C4889m mVar, int i11) {
                O(mVar, M0.a(i10 | 1));
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C5979c T0(C5993q qVar, int i10) {
                C17542s.j(qVar, "$this$items");
                return C5979c.a(C5972G.a(qVar.a()));
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.lang.Object} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: NA.U$a} */
            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: NA.U$a} */
            /* JADX WARNING: type inference failed for: r3v4 */
            /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
                if (r3 == U0.C4889m.f14007a.a()) goto L_0x0081;
             */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static final void U(android.graphics.drawable.Drawable r11, boolean r12, U0.C4889m r13, int r14) {
                /*
                    r0 = -358147654(0xffffffffeaa719ba, float:-1.0100605E26)
                    U0.m r13 = r13.k(r0)
                    r1 = r14 & 6
                    if (r1 != 0) goto L_0x0016
                    boolean r1 = r13.F(r11)
                    if (r1 == 0) goto L_0x0013
                    r1 = 4
                    goto L_0x0014
                L_0x0013:
                    r1 = 2
                L_0x0014:
                    r1 = r1 | r14
                    goto L_0x0017
                L_0x0016:
                    r1 = r14
                L_0x0017:
                    r2 = r14 & 48
                    r3 = 32
                    if (r2 != 0) goto L_0x0028
                    boolean r2 = r13.b(r12)
                    if (r2 == 0) goto L_0x0025
                    r2 = r3
                    goto L_0x0027
                L_0x0025:
                    r2 = 16
                L_0x0027:
                    r1 = r1 | r2
                L_0x0028:
                    r2 = r1 & 19
                    r4 = 18
                    if (r2 != r4) goto L_0x003a
                    boolean r2 = r13.l()
                    if (r2 != 0) goto L_0x0035
                    goto L_0x003a
                L_0x0035:
                    r13.L()
                    goto L_0x00aa
                L_0x003a:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0046
                    r2 = -1
                    java.lang.String r4 = "com.ingka.ikea.shoppableimage.impl.presentation.HandleStatusbarIconColor (ShoppableImageScreen.kt:663)"
                    U0.C4895p.S(r0, r1, r2, r4)
                L_0x0046:
                    r0 = 0
                    boolean r8 = n0.C5607m.a(r13, r0)
                    r2 = 0
                    r4 = 1
                    jC.i r5 = jC.k.c(r2, r13, r0, r4)
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
                    java.lang.Boolean r10 = java.lang.Boolean.valueOf(r12)
                    r6 = 1648822255(0x624707ef, float:9.1786844E20)
                    r13.W(r6)
                    boolean r6 = r13.F(r5)
                    r7 = r1 & 112(0x70, float:1.57E-43)
                    if (r7 != r3) goto L_0x0068
                    r0 = r4
                L_0x0068:
                    r0 = r0 | r6
                    boolean r3 = r13.F(r11)
                    r0 = r0 | r3
                    boolean r3 = r13.b(r8)
                    r0 = r0 | r3
                    java.lang.Object r3 = r13.D()
                    if (r0 != 0) goto L_0x0081
                    U0.m$a r0 = U0.C4889m.f14007a
                    java.lang.Object r0 = r0.a()
                    if (r3 != r0) goto L_0x008d
                L_0x0081:
                    NA.U$a r3 = new NA.U$a
                    r9 = 0
                    r4 = r3
                    r6 = r12
                    r7 = r11
                    r4.<init>(r5, r6, r7, r8, r9)
                    r13.u(r3)
                L_0x008d:
                    r4 = r3
                    nI.p r4 = (nI.p) r4
                    r13.P()
                    r0 = r1 & 14
                    int r1 = r1 << 3
                    r1 = r1 & 896(0x380, float:1.256E-42)
                    r6 = r0 | r1
                    r1 = r11
                    r3 = r10
                    r5 = r13
                    U0.P.e(r1, r2, r3, r4, r5, r6)
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x00aa
                    U0.C4895p.R()
                L_0x00aa:
                    U0.Y0 r13 = r13.n()
                    if (r13 == 0) goto L_0x00b8
                    NA.O r0 = new NA.O
                    r0.<init>(r11, r12, r14)
                    r13.a(r0)
                L_0x00b8:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: NA.C13236U.U(android.graphics.drawable.Drawable, boolean, U0.m, int):void");
            }

            /* access modifiers changed from: private */
            public static final Object U0(int i10) {
                return "Product";
            }

            /* access modifiers changed from: private */
            public static final C16807N V(Drawable drawable, boolean z10, int i10, C4889m mVar, int i11) {
                U(drawable, z10, mVar, M0.a(i10 | 1));
                return C16807N.f139792a;
            }

            private static final void V0(C5968C c10, c0.b.c cVar, C17642l<? super C13125c, C16807N> lVar, C17642l<? super Drawable, C16807N> lVar2) {
                c10.d("ImageSection", new C13226J(), "ImageSection", c1.c.c(-1935896348, true, new o(cVar, lVar, lVar2)));
            }

            /* access modifiers changed from: private */
            public static final void W(c0.b.c cVar, boolean z10, C17642l<? super C13125c, C16807N> lVar, C17642l<? super Drawable, C16807N> lVar2, C4889m mVar, int i10) {
                int i11;
                C5079j jVar;
                C5079j jVar2;
                boolean z11 = z10;
                C17642l<? super C13125c, C16807N> lVar3 = lVar;
                int i12 = i10;
                C4889m k10 = mVar.k(1773217728);
                if ((i12 & 6) == 0) {
                    i11 = (k10.F(cVar) ? 4 : 2) | i12;
                } else {
                    c0.b.c cVar2 = cVar;
                    i11 = i12;
                }
                if ((i12 & 48) == 0) {
                    i11 |= k10.b(z11) ? 32 : 16;
                }
                if ((i12 & 384) == 0) {
                    i11 |= k10.F(lVar3) ? 256 : 128;
                }
                C17642l<? super Drawable, C16807N> lVar4 = lVar2;
                if ((i12 & 3072) == 0) {
                    i11 |= k10.F(lVar4) ? RecyclerView.n.FLAG_MOVED : 1024;
                }
                if ((i11 & 1171) != 1170 || !k10.l()) {
                    if (C4895p.J()) {
                        C4895p.S(1773217728, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.ImageSection (ShoppableImageScreen.kt:584)");
                    }
                    d.a aVar = androidx.compose.ui.d.f18749a;
                    androidx.compose.ui.d C10 = J.C(J.h(aVar, 0.0f, 1, (Object) null), (C5437c.C0386c) null, false, 3, (Object) null);
                    C5437c.a aVar2 = C5437c.f24302a;
                    I h10 = C5077h.h(aVar2.o(), false);
                    int a10 = C4883j.a(k10, 0);
                    C4912y s10 = k10.s();
                    androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, C10);
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
                    nI.p<C4504g, Integer, C16807N> b10 = aVar3.b();
                    if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                        a12.u(Integer.valueOf(a10));
                        a12.w(Integer.valueOf(a10), b10);
                    }
                    F1.c(a12, e10, aVar3.d());
                    C5079j jVar3 = C5079j.f18125a;
                    Image b11 = cVar.a().b();
                    Collection e11 = cVar.a().e();
                    if (e11 == null || e11.isEmpty()) {
                        C5079j jVar4 = jVar3;
                        k10.W(-579611429);
                        jVar = jVar4;
                        LC.h.c(b11.getUrl(), b11.A0(), J.h(aVar, 0.0f, 1, (Object) null), C13178b.a.f111818a, (e.b) null, (C4478k) null, (C5437c) null, (C17642l<? super e.c, C16807N>) null, false, false, (nI.q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, (nI.q<? super C5857c, ? super C4889m, ? super Integer, C16807N>) null, k10, (C13178b.a.f111819b << 9) | 384, 0, 4080);
                        k10.P();
                    } else {
                        k10.W(-579316805);
                        k10.W(2059523740);
                        int i13 = i11 & 896;
                        boolean z12 = i13 == 256;
                        Object D10 = k10.D();
                        if (z12 || D10 == C4889m.f14007a.a()) {
                            D10 = new C13263v(lVar3);
                            k10.u(D10);
                        }
                        C17642l lVar5 = (C17642l) D10;
                        k10.P();
                        k10.W(2059534040);
                        Object D11 = k10.D();
                        C4889m.a aVar4 = C4889m.f14007a;
                        if (D11 == aVar4.a()) {
                            D11 = new C13264w();
                            k10.u(D11);
                        }
                        k10.P();
                        int i14 = i13;
                        C5079j jVar5 = jVar3;
                        Mo.Q.k(b11.getUrl(), b11.A0(), C15985a.h(cVar.a().e()), lVar5, c1.c.e(-1124532223, true, new b(lVar5, (C17642l) D11), k10, 54), (androidx.compose.ui.d) null, lVar2, k10, (f1.f85176d << 6) | 24576 | ((i11 << 9) & 3670016), 32);
                        if (z11) {
                            jVar2 = jVar5;
                            androidx.compose.ui.d a13 = jVar2.a(aVar, aVar2.n());
                            k10.W(2059563146);
                            boolean z13 = i14 == 256;
                            Object D12 = k10.D();
                            if (z13 || D12 == aVar4.a()) {
                                D12 = new C13265x(lVar3);
                                k10.u(D12);
                            }
                            k10.P();
                            K(a13, (C17631a) D12, k10, 0, 0);
                        } else {
                            jVar2 = jVar5;
                        }
                        k10.P();
                        jVar = jVar2;
                    }
                    g0 g10 = cVar.a().g();
                    k10.W(2059569574);
                    if (g10 != null) {
                        O.d(g10.b(), g10.a(), D.i(jVar.a(aVar, aVar2.o()), c2.h.B((float) 24)), k10, 0, 0);
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
                    n10.a(new C13266y(cVar, z10, lVar, lVar2, i10));
                }
            }

            /* access modifiers changed from: private */
            public static final C5979c W0(C5993q qVar) {
                C17542s.j(qVar, "$this$item");
                return C5979c.a(C5972G.a(qVar.a()));
            }

            /* access modifiers changed from: private */
            public static final C16807N X(C17642l lVar, f1 f1Var) {
                C17542s.j(f1Var, "product");
                lVar.invoke(new C13125c.C2711c(f1Var.b().p().f()));
                return C16807N.f139792a;
            }

            private static final void X0(C5968C c10, c0.b.c cVar) {
                c10.d("Title", new C13227K(), "Title", c1.c.c(568080928, true, new p(cVar)));
                c10.d("Description", new C13228L(), "Description", c1.c.c(-902190775, true, new q(cVar)));
            }

            /* access modifiers changed from: private */
            public static final C16807N Y(f1 f1Var) {
                C17542s.j(f1Var, "product");
                new c1.c(f1Var.b().p().f());
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C5979c Y0(C5993q qVar) {
                C17542s.j(qVar, "$this$item");
                return C5979c.a(C5972G.a(qVar.a()));
            }

            /* access modifiers changed from: private */
            public static final C16807N Z(C17642l lVar) {
                lVar.invoke(C13125c.a.f111474a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C5979c Z0(C5993q qVar) {
                C17542s.j(qVar, "$this$item");
                return C5979c.a(C5972G.a(qVar.a()));
            }

            /* access modifiers changed from: private */
            public static final C16807N a0(c0.b.c cVar, boolean z10, C17642l lVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
                W(cVar, z10, lVar, lVar2, mVar, M0.a(i10 | 1));
                return C16807N.f139792a;
            }

            private static final void b0(c0.b.c cVar, C17642l<? super C11588a, C16807N> lVar, C4889m mVar, int i10) {
                int i11;
                C4889m k10 = mVar.k(337451085);
                if ((i10 & 6) == 0) {
                    i11 = (k10.F(cVar) ? 4 : 2) | i10;
                } else {
                    i11 = i10;
                }
                if ((i10 & 48) == 0) {
                    i11 |= k10.F(lVar) ? 32 : 16;
                }
                if ((i11 & 19) != 18 || !k10.l()) {
                    if (C4895p.J()) {
                        C4895p.S(337451085, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.InspirationsSection (ShoppableImageScreen.kt:548)");
                    }
                    List<C11588a> c10 = cVar.a().c();
                    if (c10 != null) {
                        Iterable iterable = c10;
                        ArrayList arrayList = new ArrayList();
                        Iterator it = iterable.iterator();
                        while (true) {
                            boolean z10 = true;
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (((C11588a) next).d() != 1.0f) {
                                z10 = false;
                            }
                            if (!z10) {
                                arrayList.add(next);
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Object next2 : iterable) {
                            if (((C11588a) next2).d() == 1.0f) {
                                arrayList2.add(next2);
                            }
                        }
                        List V02 = C16877v.V0(arrayList, arrayList2);
                        i0(3, V02.size(), (androidx.compose.ui.d) null, c1.c.e(1752381930, true, new c(V02, lVar, c10), k10, 54), k10, 3078, 4);
                    }
                    if (C4895p.J()) {
                        C4895p.R();
                    }
                } else {
                    k10.L();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new C13267z(cVar, lVar, i10));
                }
            }

            /* access modifiers changed from: private */
            public static final C16807N c0(c0.b.c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
                b0(cVar, lVar, mVar, M0.a(i10 | 1));
                return C16807N.f139792a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:146:0x0510  */
            /* JADX WARNING: Removed duplicated region for block: B:149:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
            /* JADX WARNING: Removed duplicated region for block: B:48:0x008e  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static final void d0(NA.c0.b.c r43, nI.C17642l<? super KA.C13125c, XH.C16807N> r44, nI.C17642l<? super Op.c1, XH.C16807N> r45, androidx.compose.ui.d r46, U0.C4889m r47, int r48, int r49) {
                /*
                    r6 = r43
                    r7 = r44
                    r8 = r48
                    r0 = 4
                    r1 = 148354679(0x8d7b677, float:1.2982739E-33)
                    r2 = r47
                    U0.m r9 = r2.k(r1)
                    r14 = 1
                    r2 = r49 & 1
                    r15 = 2
                    if (r2 == 0) goto L_0x0019
                    r2 = r8 | 6
                    goto L_0x0029
                L_0x0019:
                    r2 = r8 & 6
                    if (r2 != 0) goto L_0x0028
                    boolean r2 = r9.F(r6)
                    if (r2 == 0) goto L_0x0025
                    r2 = r0
                    goto L_0x0026
                L_0x0025:
                    r2 = r15
                L_0x0026:
                    r2 = r2 | r8
                    goto L_0x0029
                L_0x0028:
                    r2 = r8
                L_0x0029:
                    r3 = r49 & 2
                    r13 = 32
                    if (r3 == 0) goto L_0x0032
                    r2 = r2 | 48
                    goto L_0x0041
                L_0x0032:
                    r3 = r8 & 48
                    if (r3 != 0) goto L_0x0041
                    boolean r3 = r9.F(r7)
                    if (r3 == 0) goto L_0x003e
                    r3 = r13
                    goto L_0x0040
                L_0x003e:
                    r3 = 16
                L_0x0040:
                    r2 = r2 | r3
                L_0x0041:
                    r0 = r49 & 4
                    if (r0 == 0) goto L_0x004a
                    r2 = r2 | 384(0x180, float:5.38E-43)
                    r11 = r45
                    goto L_0x005c
                L_0x004a:
                    r0 = r8 & 384(0x180, float:5.38E-43)
                    r11 = r45
                    if (r0 != 0) goto L_0x005c
                    boolean r0 = r9.F(r11)
                    if (r0 == 0) goto L_0x0059
                    r0 = 256(0x100, float:3.59E-43)
                    goto L_0x005b
                L_0x0059:
                    r0 = 128(0x80, float:1.794E-43)
                L_0x005b:
                    r2 = r2 | r0
                L_0x005c:
                    r0 = r49 & 8
                    if (r0 == 0) goto L_0x0066
                    r2 = r2 | 3072(0xc00, float:4.305E-42)
                L_0x0062:
                    r3 = r46
                L_0x0064:
                    r10 = r2
                    goto L_0x0079
                L_0x0066:
                    r3 = r8 & 3072(0xc00, float:4.305E-42)
                    if (r3 != 0) goto L_0x0062
                    r3 = r46
                    boolean r4 = r9.V(r3)
                    if (r4 == 0) goto L_0x0075
                    r4 = 2048(0x800, float:2.87E-42)
                    goto L_0x0077
                L_0x0075:
                    r4 = 1024(0x400, float:1.435E-42)
                L_0x0077:
                    r2 = r2 | r4
                    goto L_0x0064
                L_0x0079:
                    r2 = r10 & 1171(0x493, float:1.641E-42)
                    r4 = 1170(0x492, float:1.64E-42)
                    if (r2 != r4) goto L_0x008e
                    boolean r2 = r9.l()
                    if (r2 != 0) goto L_0x0086
                    goto L_0x008e
                L_0x0086:
                    r9.L()
                    r39 = r3
                    r4 = r9
                    goto L_0x050a
                L_0x008e:
                    if (r0 == 0) goto L_0x0094
                    androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                    r5 = r0
                    goto L_0x0095
                L_0x0094:
                    r5 = r3
                L_0x0095:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x00a1
                    r0 = -1
                    java.lang.String r2 = "com.ingka.ikea.shoppableimage.impl.presentation.LandscapeShoppableImageDetails (ShoppableImageScreen.kt:453)"
                    U0.C4895p.S(r1, r10, r0, r2)
                L_0x00a1:
                    r4 = 0
                    r3 = 0
                    androidx.compose.ui.d r16 = androidx.compose.foundation.layout.J.f(r5, r4, r14, r3)
                    r2 = 0
                    androidx.compose.foundation.o r17 = androidx.compose.foundation.m.c(r2, r9, r2, r14)
                    r21 = 14
                    r22 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    androidx.compose.ui.d r0 = androidx.compose.foundation.m.f(r16, r17, r18, r19, r20, r21, r22)
                    androidx.compose.foundation.layout.d r35 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r1 = r35.g()
                    i1.c$a r36 = i1.C5437c.f24302a
                    i1.c$b r12 = r36.k()
                    E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r12, r9, r2)
                    int r12 = U0.C4883j.a(r9, r2)
                    U0.y r15 = r9.s()
                    androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r9, r0)
                    G1.g$a r37 = G1.C4504g.f6515W
                    nI.a r3 = r37.a()
                    U0.f r17 = r9.m()
                    if (r17 != 0) goto L_0x00e5
                    U0.C4883j.c()
                L_0x00e5:
                    r9.I()
                    boolean r17 = r9.i()
                    if (r17 == 0) goto L_0x00f2
                    r9.p(r3)
                    goto L_0x00f5
                L_0x00f2:
                    r9.t()
                L_0x00f5:
                    U0.m r3 = U0.F1.a(r9)
                    nI.p r4 = r37.c()
                    U0.F1.c(r3, r1, r4)
                    nI.p r1 = r37.e()
                    U0.F1.c(r3, r15, r1)
                    nI.p r1 = r37.b()
                    boolean r4 = r3.i()
                    if (r4 != 0) goto L_0x011f
                    java.lang.Object r4 = r3.D()
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r12)
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r15)
                    if (r4 != 0) goto L_0x012d
                L_0x011f:
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
                    r3.u(r4)
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
                    r3.w(r4, r1)
                L_0x012d:
                    nI.p r1 = r37.d()
                    U0.F1.c(r3, r0, r1)
                    s0.h r0 = s0.C5862h.f28810a
                    androidx.compose.ui.d$a r15 = androidx.compose.ui.d.f18749a
                    i1.c$b r1 = r36.j()
                    androidx.compose.ui.d r0 = r0.b(r15, r1)
                    r1 = -187693700(0xfffffffff4d0057c, float:-1.3184924E32)
                    r9.W(r1)
                    r12 = r10 & 112(0x70, float:1.57E-43)
                    if (r12 != r13) goto L_0x014c
                    r1 = r14
                    goto L_0x014d
                L_0x014c:
                    r1 = r2
                L_0x014d:
                    java.lang.Object r3 = r9.D()
                    if (r1 != 0) goto L_0x015b
                    U0.m$a r1 = U0.C4889m.f14007a
                    java.lang.Object r1 = r1.a()
                    if (r3 != r1) goto L_0x0163
                L_0x015b:
                    NA.o r3 = new NA.o
                    r3.<init>(r7)
                    r9.u(r3)
                L_0x0163:
                    nI.a r3 = (nI.C17631a) r3
                    r9.P()
                    K(r0, r3, r9, r2, r2)
                    r3 = 0
                    r4 = 0
                    androidx.compose.ui.d r0 = androidx.compose.foundation.layout.J.h(r15, r4, r14, r3)
                    androidx.compose.foundation.layout.d$e r1 = r35.f()
                    i1.c$c r3 = r36.l()
                    E1.I r1 = androidx.compose.foundation.layout.G.b(r1, r3, r9, r2)
                    int r3 = U0.C4883j.a(r9, r2)
                    U0.y r4 = r9.s()
                    androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r9, r0)
                    nI.a r13 = r37.a()
                    U0.f r18 = r9.m()
                    if (r18 != 0) goto L_0x0196
                    U0.C4883j.c()
                L_0x0196:
                    r9.I()
                    boolean r18 = r9.i()
                    if (r18 == 0) goto L_0x01a3
                    r9.p(r13)
                    goto L_0x01a6
                L_0x01a3:
                    r9.t()
                L_0x01a6:
                    U0.m r13 = U0.F1.a(r9)
                    nI.p r14 = r37.c()
                    U0.F1.c(r13, r1, r14)
                    nI.p r1 = r37.e()
                    U0.F1.c(r13, r4, r1)
                    nI.p r1 = r37.b()
                    boolean r4 = r13.i()
                    if (r4 != 0) goto L_0x01d0
                    java.lang.Object r4 = r13.D()
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r14)
                    if (r4 != 0) goto L_0x01de
                L_0x01d0:
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                    r13.u(r4)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r13.w(r3, r1)
                L_0x01de:
                    nI.p r1 = r37.d()
                    U0.F1.c(r13, r0, r1)
                    s0.N r0 = s0.C5843N.f28726a
                    r1 = 64
                    float r1 = (float) r1
                    float r19 = c2.h.B(r1)
                    r23 = 14
                    r24 = 0
                    r20 = 0
                    r21 = 0
                    r22 = 0
                    r18 = r15
                    androidx.compose.ui.d r19 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
                    r22 = 2
                    r23 = 0
                    r20 = 1065353216(0x3f800000, float:1.0)
                    r21 = 0
                    r18 = r0
                    androidx.compose.ui.d r0 = s0.C5842M.e(r18, r19, r20, r21, r22, r23)
                    androidx.compose.foundation.layout.d$m r1 = r35.g()
                    i1.c$b r3 = r36.k()
                    E1.I r1 = androidx.compose.foundation.layout.C5080k.a(r1, r3, r9, r2)
                    int r3 = U0.C4883j.a(r9, r2)
                    U0.y r4 = r9.s()
                    androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r9, r0)
                    nI.a r13 = r37.a()
                    U0.f r14 = r9.m()
                    if (r14 != 0) goto L_0x0231
                    U0.C4883j.c()
                L_0x0231:
                    r9.I()
                    boolean r14 = r9.i()
                    if (r14 == 0) goto L_0x023e
                    r9.p(r13)
                    goto L_0x0241
                L_0x023e:
                    r9.t()
                L_0x0241:
                    U0.m r13 = U0.F1.a(r9)
                    nI.p r14 = r37.c()
                    U0.F1.c(r13, r1, r14)
                    nI.p r1 = r37.e()
                    U0.F1.c(r13, r4, r1)
                    nI.p r1 = r37.b()
                    boolean r4 = r13.i()
                    if (r4 != 0) goto L_0x026b
                    java.lang.Object r4 = r13.D()
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
                    boolean r4 = kotlin.jvm.internal.C17542s.e(r4, r14)
                    if (r4 != 0) goto L_0x0279
                L_0x026b:
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
                    r13.u(r4)
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r13.w(r3, r1)
                L_0x0279:
                    nI.p r1 = r37.d()
                    U0.F1.c(r13, r0, r1)
                    r0 = -315499969(0xffffffffed31da3f, float:-3.440168E27)
                    r9.W(r0)
                    java.lang.Object r0 = r9.D()
                    U0.m$a r38 = U0.C4889m.f14007a
                    java.lang.Object r1 = r38.a()
                    if (r0 != r1) goto L_0x029a
                    NA.p r0 = new NA.p
                    r0.<init>()
                    r9.u(r0)
                L_0x029a:
                    r3 = r0
                    nI.l r3 = (nI.C17642l) r3
                    r9.P()
                    r14 = r10 & 14
                    r0 = r14 | 3120(0xc30, float:4.372E-42)
                    int r1 = r10 << 3
                    r1 = r1 & 896(0x380, float:1.256E-42)
                    r13 = r0 | r1
                    r1 = 0
                    r0 = r43
                    r4 = r2
                    r2 = r44
                    r4 = r9
                    r39 = r5
                    r5 = r13
                    W(r0, r1, r2, r3, r4, r5)
                    OA.a r0 = r43.a()
                    java.lang.String r0 = r0.f()
                    r1 = -315497853(0xffffffffed31e283, float:-3.4407927E27)
                    r9.W(r1)
                    r1 = 24
                    if (r0 != 0) goto L_0x02d3
                    r4 = r9
                    r3 = r10
                    r40 = r12
                    r42 = r14
                    r41 = r15
                    r2 = 1
                    goto L_0x0324
                L_0x02d3:
                    TC.b$b$b r2 = TC.C13679b.C2857b.C2858b.f116684a
                    r3 = r10
                    r10 = r2
                    float r2 = (float) r1
                    float r20 = c2.h.B(r2)
                    r23 = 13
                    r24 = 0
                    r19 = 0
                    r21 = 0
                    r22 = 0
                    r18 = r15
                    androidx.compose.ui.d r2 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
                    r11 = r2
                    r33 = 0
                    r34 = 262136(0x3fff8, float:3.67331E-40)
                    r4 = 0
                    r40 = r12
                    r2 = 32
                    r12 = r4
                    r42 = r14
                    r41 = r15
                    r2 = 1
                    r14 = r4
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r26 = 0
                    r27 = 0
                    r28 = 0
                    r29 = 0
                    r30 = 0
                    r32 = 432(0x1b0, float:6.05E-43)
                    r4 = r9
                    r9 = r0
                    r31 = r4
                    SC.C13607l.j(r9, r10, r11, r12, r14, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34)
                    XH.N r0 = XH.C16807N.f139792a
                L_0x0324:
                    r4.P()
                    OA.a r0 = r43.a()
                    java.lang.String r9 = r0.a()
                    r0 = -315489088(0xffffffffed3204c0, float:-3.4433796E27)
                    r4.W(r0)
                    if (r9 != 0) goto L_0x0338
                    goto L_0x037b
                L_0x0338:
                    TC.b$a$b r10 = TC.C13679b.a.C2856b.f116680a
                    float r0 = (float) r1
                    float r20 = c2.h.B(r0)
                    r23 = 13
                    r24 = 0
                    r19 = 0
                    r21 = 0
                    r22 = 0
                    r18 = r41
                    androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.m(r18, r19, r20, r21, r22, r23, r24)
                    r33 = 0
                    r34 = 262136(0x3fff8, float:3.67331E-40)
                    r12 = 0
                    r14 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r26 = 0
                    r27 = 0
                    r28 = 0
                    r29 = 0
                    r30 = 0
                    r32 = 432(0x1b0, float:6.05E-43)
                    r31 = r4
                    SC.C13607l.j(r9, r10, r11, r12, r14, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34)
                    XH.N r0 = XH.C16807N.f139792a
                L_0x037b:
                    r4.P()
                    OA.a r0 = r43.a()
                    java.lang.String r9 = r0.d()
                    r0 = -315478938(0xffffffffed322c66, float:-3.4463754E27)
                    r4.W(r0)
                    if (r9 != 0) goto L_0x0391
                    r2 = 0
                    r5 = 0
                    goto L_0x03d0
                L_0x0391:
                    TC.b$b$c r10 = TC.C13679b.C2857b.c.f116685a
                    androidx.compose.ui.d r0 = TC.e.i(r41)
                    float r1 = (float) r1
                    float r1 = c2.h.B(r1)
                    r5 = 0
                    r14 = 0
                    androidx.compose.ui.d r11 = androidx.compose.foundation.layout.D.k(r0, r5, r1, r2, r14)
                    r33 = 0
                    r34 = 262136(0x3fff8, float:3.67331E-40)
                    r12 = 0
                    r0 = 0
                    r2 = r14
                    r14 = r0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r21 = 0
                    r22 = 0
                    r23 = 0
                    r24 = 0
                    r26 = 0
                    r27 = 0
                    r28 = 0
                    r29 = 0
                    r30 = 0
                    r32 = 48
                    r31 = r4
                    SC.C13607l.j(r9, r10, r11, r12, r14, r16, r17, r18, r19, r21, r22, r23, r24, r26, r27, r28, r29, r30, r31, r32, r33, r34)
                    XH.N r0 = XH.C16807N.f139792a
                L_0x03d0:
                    r4.P()
                    r0 = -315464501(0xffffffffed3264cb, float:-3.4506364E27)
                    r4.W(r0)
                    r1 = r40
                    r0 = 32
                    if (r1 != r0) goto L_0x03e1
                    r14 = 1
                    goto L_0x03e2
                L_0x03e1:
                    r14 = 0
                L_0x03e2:
                    java.lang.Object r0 = r4.D()
                    if (r14 != 0) goto L_0x03ee
                    java.lang.Object r1 = r38.a()
                    if (r0 != r1) goto L_0x03f6
                L_0x03ee:
                    NA.q r0 = new NA.q
                    r0.<init>(r7)
                    r4.u(r0)
                L_0x03f6:
                    nI.l r0 = (nI.C17642l) r0
                    r4.P()
                    r1 = r42
                    b0(r6, r0, r4, r1)
                    r4.x()
                    OA.a r0 = r43.a()
                    java.util.List r0 = r0.e()
                    r1 = 2063992218(0x7b06059a, float:6.958814E35)
                    r4.W(r1)
                    if (r0 != 0) goto L_0x0415
                    goto L_0x04f8
                L_0x0415:
                    r1 = 16
                    float r1 = (float) r1
                    float r1 = c2.h.B(r1)
                    r10 = r41
                    r9 = 2
                    androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r10, r1, r5, r9, r2)
                    r9 = 182(0xb6, float:2.55E-43)
                    float r9 = (float) r9
                    float r9 = c2.h.B(r9)
                    androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.y(r1, r9)
                    androidx.compose.foundation.layout.d$m r9 = r35.g()
                    i1.c$b r10 = r36.k()
                    r11 = 0
                    E1.I r9 = androidx.compose.foundation.layout.C5080k.a(r9, r10, r4, r11)
                    int r10 = U0.C4883j.a(r4, r11)
                    U0.y r11 = r4.s()
                    androidx.compose.ui.d r1 = androidx.compose.ui.c.e(r4, r1)
                    nI.a r12 = r37.a()
                    U0.f r13 = r4.m()
                    if (r13 != 0) goto L_0x0454
                    U0.C4883j.c()
                L_0x0454:
                    r4.I()
                    boolean r13 = r4.i()
                    if (r13 == 0) goto L_0x0461
                    r4.p(r12)
                    goto L_0x0464
                L_0x0461:
                    r4.t()
                L_0x0464:
                    U0.m r12 = U0.F1.a(r4)
                    nI.p r13 = r37.c()
                    U0.F1.c(r12, r9, r13)
                    nI.p r9 = r37.e()
                    U0.F1.c(r12, r11, r9)
                    nI.p r9 = r37.b()
                    boolean r11 = r12.i()
                    if (r11 != 0) goto L_0x048e
                    java.lang.Object r11 = r12.D()
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
                    boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r13)
                    if (r11 != 0) goto L_0x049c
                L_0x048e:
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
                    r12.u(r11)
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
                    r12.w(r10, r9)
                L_0x049c:
                    nI.p r9 = r37.d()
                    U0.F1.c(r12, r1, r9)
                    r1 = 34399349(0x20ce475, float:1.035114E-37)
                    r4.W(r1)
                    java.lang.Iterable r0 = (java.lang.Iterable) r0
                    java.util.Iterator r0 = r0.iterator()
                L_0x04af:
                    boolean r1 = r0.hasNext()
                    if (r1 == 0) goto L_0x04f0
                    java.lang.Object r1 = r0.next()
                    Op.f1 r1 = (Op.f1) r1
                    Op.d1 r9 = r1.b()
                    androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                    r10 = 1
                    androidx.compose.ui.d r12 = androidx.compose.foundation.layout.J.h(r1, r5, r10, r2)
                    LC.b$a r14 = LC.C13178b.a.f111818a
                    int r1 = r3 >> 3
                    r1 = r1 & 112(0x70, float:1.57E-43)
                    r1 = r1 | 3456(0xd80, float:4.843E-42)
                    int r11 = LC.C13178b.a.f111819b
                    int r11 = r11 << 15
                    r23 = r1 | r11
                    r24 = 0
                    r25 = 8144(0x1fd0, float:1.1412E-41)
                    r11 = 0
                    r13 = 0
                    r15 = 0
                    r16 = 0
                    r17 = 0
                    r18 = 0
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    r1 = r10
                    r10 = r45
                    r22 = r4
                    Op.C10872z0.y0(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
                    goto L_0x04af
                L_0x04f0:
                    r4.P()
                    r4.x()
                    XH.N r0 = XH.C16807N.f139792a
                L_0x04f8:
                    r4.P()
                    r4.x()
                    r4.x()
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x050a
                    U0.C4895p.R()
                L_0x050a:
                    U0.Y0 r9 = r4.n()
                    if (r9 == 0) goto L_0x0525
                    NA.r r10 = new NA.r
                    r0 = r10
                    r1 = r43
                    r2 = r44
                    r3 = r45
                    r4 = r39
                    r5 = r48
                    r6 = r49
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    r9.a(r10)
                L_0x0525:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: NA.C13236U.d0(NA.c0$b$c, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
            }

            /* access modifiers changed from: private */
            public static final C16807N e0(C17642l lVar) {
                lVar.invoke(C13125c.a.f111474a);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N f0(Drawable drawable) {
                C17542s.j(drawable, "it");
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N g0(C17642l lVar, C11588a aVar) {
                C17542s.j(aVar, "inspirationFeedItem");
                lVar.invoke(new C13125c.b(aVar.e().getUrl(), aVar.f()));
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N h0(c0.b.c cVar, C17642l lVar, C17642l lVar2, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
                d0(cVar, lVar, lVar2, dVar, mVar, M0.a(i10 | 1), i11);
                return C16807N.f139792a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:107:0x029c  */
            /* JADX WARNING: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:34:0x0061  */
            /* JADX WARNING: Removed duplicated region for block: B:35:0x0064  */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x0081  */
            /* JADX WARNING: Removed duplicated region for block: B:47:0x0086  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static final void i0(int r20, int r21, androidx.compose.ui.d r22, nI.q<? super java.lang.Integer, ? super U0.C4889m, ? super java.lang.Integer, XH.C16807N> r23, U0.C4889m r24, int r25, int r26) {
                /*
                    r1 = r20
                    r2 = r21
                    r4 = r23
                    r5 = r25
                    r0 = 2
                    r3 = 4
                    r6 = 8299063(0x7ea237, float:1.1629464E-38)
                    r7 = r24
                    U0.m r7 = r7.k(r6)
                    r8 = 1
                    r9 = r26 & 1
                    if (r9 == 0) goto L_0x001b
                    r9 = r5 | 6
                    goto L_0x002b
                L_0x001b:
                    r9 = r5 & 6
                    if (r9 != 0) goto L_0x002a
                    boolean r9 = r7.d(r1)
                    if (r9 == 0) goto L_0x0027
                    r9 = r3
                    goto L_0x0028
                L_0x0027:
                    r9 = r0
                L_0x0028:
                    r9 = r9 | r5
                    goto L_0x002b
                L_0x002a:
                    r9 = r5
                L_0x002b:
                    r0 = r26 & 2
                    if (r0 == 0) goto L_0x0032
                    r9 = r9 | 48
                    goto L_0x0042
                L_0x0032:
                    r0 = r5 & 48
                    if (r0 != 0) goto L_0x0042
                    boolean r0 = r7.d(r2)
                    if (r0 == 0) goto L_0x003f
                    r0 = 32
                    goto L_0x0041
                L_0x003f:
                    r0 = 16
                L_0x0041:
                    r9 = r9 | r0
                L_0x0042:
                    r0 = r26 & 4
                    if (r0 == 0) goto L_0x004b
                    r9 = r9 | 384(0x180, float:5.38E-43)
                L_0x0048:
                    r3 = r22
                    goto L_0x005d
                L_0x004b:
                    r3 = r5 & 384(0x180, float:5.38E-43)
                    if (r3 != 0) goto L_0x0048
                    r3 = r22
                    boolean r10 = r7.V(r3)
                    if (r10 == 0) goto L_0x005a
                    r10 = 256(0x100, float:3.59E-43)
                    goto L_0x005c
                L_0x005a:
                    r10 = 128(0x80, float:1.794E-43)
                L_0x005c:
                    r9 = r9 | r10
                L_0x005d:
                    r10 = r26 & 8
                    if (r10 == 0) goto L_0x0064
                    r9 = r9 | 3072(0xc00, float:4.305E-42)
                    goto L_0x0074
                L_0x0064:
                    r10 = r5 & 3072(0xc00, float:4.305E-42)
                    if (r10 != 0) goto L_0x0074
                    boolean r10 = r7.F(r4)
                    if (r10 == 0) goto L_0x0071
                    r10 = 2048(0x800, float:2.87E-42)
                    goto L_0x0073
                L_0x0071:
                    r10 = 1024(0x400, float:1.435E-42)
                L_0x0073:
                    r9 = r9 | r10
                L_0x0074:
                    r10 = r9 & 1171(0x493, float:1.641E-42)
                    r11 = 1170(0x492, float:1.64E-42)
                    if (r10 != r11) goto L_0x0086
                    boolean r10 = r7.l()
                    if (r10 != 0) goto L_0x0081
                    goto L_0x0086
                L_0x0081:
                    r7.L()
                    goto L_0x0296
                L_0x0086:
                    if (r0 == 0) goto L_0x008b
                    androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                    goto L_0x008c
                L_0x008b:
                    r0 = r3
                L_0x008c:
                    boolean r3 = U0.C4895p.J()
                    if (r3 == 0) goto L_0x0098
                    r3 = -1
                    java.lang.String r10 = "com.ingka.ikea.shoppableimage.impl.presentation.NonLazyGrid (ShoppableImageScreen.kt:764)"
                    U0.C4895p.S(r6, r9, r3, r10)
                L_0x0098:
                    int r3 = r9 >> 6
                    androidx.compose.foundation.layout.d r6 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$m r6 = r6.g()
                    i1.c$a r9 = i1.C5437c.f24302a
                    i1.c$b r9 = r9.k()
                    r10 = 0
                    E1.I r6 = androidx.compose.foundation.layout.C5080k.a(r6, r9, r7, r10)
                    int r9 = U0.C4883j.a(r7, r10)
                    U0.y r11 = r7.s()
                    androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r7, r0)
                    G1.g$a r13 = G1.C4504g.f6515W
                    nI.a r14 = r13.a()
                    U0.f r15 = r7.m()
                    if (r15 != 0) goto L_0x00c6
                    U0.C4883j.c()
                L_0x00c6:
                    r7.I()
                    boolean r15 = r7.i()
                    if (r15 == 0) goto L_0x00d3
                    r7.p(r14)
                    goto L_0x00d6
                L_0x00d3:
                    r7.t()
                L_0x00d6:
                    U0.m r14 = U0.F1.a(r7)
                    nI.p r15 = r13.c()
                    U0.F1.c(r14, r6, r15)
                    nI.p r6 = r13.e()
                    U0.F1.c(r14, r11, r6)
                    nI.p r6 = r13.b()
                    boolean r11 = r14.i()
                    if (r11 != 0) goto L_0x0100
                    java.lang.Object r11 = r14.D()
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
                    boolean r11 = kotlin.jvm.internal.C17542s.e(r11, r15)
                    if (r11 != 0) goto L_0x010e
                L_0x0100:
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
                    r14.u(r11)
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                    r14.w(r9, r6)
                L_0x010e:
                    nI.p r6 = r13.d()
                    U0.F1.c(r14, r12, r6)
                    s0.h r6 = s0.C5862h.f28810a
                    int r6 = r2 / r1
                    int r9 = r2 % r1
                    r11 = r9 ^ r1
                    int r12 = -r9
                    r12 = r12 | r9
                    r11 = r11 & r12
                    int r11 = r11 >> 31
                    r11 = r11 & r1
                    int r9 = r9 + r11
                    if (r9 <= 0) goto L_0x0127
                    int r6 = r6 + r8
                L_0x0127:
                    r9 = -131649739(0xfffffffff8272f35, float:-1.356361E34)
                    r7.W(r9)
                    r9 = r10
                L_0x012e:
                    if (r9 >= r6) goto L_0x0283
                    int r11 = r9 * r1
                    androidx.compose.ui.d$a r12 = androidx.compose.ui.d.f18749a
                    androidx.compose.foundation.layout.d r13 = androidx.compose.foundation.layout.C5073d.f18068a
                    androidx.compose.foundation.layout.d$e r13 = r13.f()
                    i1.c$a r14 = i1.C5437c.f24302a
                    i1.c$c r14 = r14.l()
                    E1.I r13 = androidx.compose.foundation.layout.G.b(r13, r14, r7, r10)
                    int r14 = U0.C4883j.a(r7, r10)
                    U0.y r15 = r7.s()
                    androidx.compose.ui.d r12 = androidx.compose.ui.c.e(r7, r12)
                    G1.g$a r16 = G1.C4504g.f6515W
                    nI.a r10 = r16.a()
                    U0.f r17 = r7.m()
                    if (r17 != 0) goto L_0x015f
                    U0.C4883j.c()
                L_0x015f:
                    r7.I()
                    boolean r17 = r7.i()
                    if (r17 == 0) goto L_0x016c
                    r7.p(r10)
                    goto L_0x016f
                L_0x016c:
                    r7.t()
                L_0x016f:
                    U0.m r10 = U0.F1.a(r7)
                    nI.p r8 = r16.c()
                    U0.F1.c(r10, r13, r8)
                    nI.p r8 = r16.e()
                    U0.F1.c(r10, r15, r8)
                    nI.p r8 = r16.b()
                    boolean r13 = r10.i()
                    if (r13 != 0) goto L_0x0199
                    java.lang.Object r13 = r10.D()
                    java.lang.Integer r15 = java.lang.Integer.valueOf(r14)
                    boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r15)
                    if (r13 != 0) goto L_0x01a7
                L_0x0199:
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
                    r10.u(r13)
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
                    r10.w(r13, r8)
                L_0x01a7:
                    nI.p r8 = r16.d()
                    U0.F1.c(r10, r12, r8)
                    s0.N r8 = s0.C5843N.f28726a
                    r10 = 288130414(0x112c856e, float:1.3609524E-28)
                    r7.W(r10)
                    r10 = 0
                L_0x01b7:
                    if (r10 >= r1) goto L_0x026f
                    int r12 = r11 + r10
                    androidx.compose.ui.d$a r13 = androidx.compose.ui.d.f18749a
                    r14 = 0
                    r15 = 0
                    r19 = r0
                    r0 = 1
                    androidx.compose.ui.d r14 = androidx.compose.foundation.layout.J.h(r13, r14, r0, r15)
                    r17 = 2
                    r18 = 0
                    r15 = 1065353216(0x3f800000, float:1.0)
                    r16 = 0
                    r13 = r8
                    androidx.compose.ui.d r0 = s0.C5842M.e(r13, r14, r15, r16, r17, r18)
                    i1.c$a r13 = i1.C5437c.f24302a
                    i1.c r13 = r13.o()
                    r14 = 0
                    E1.I r13 = androidx.compose.foundation.layout.C5077h.h(r13, r14)
                    int r15 = U0.C4883j.a(r7, r14)
                    U0.y r14 = r7.s()
                    androidx.compose.ui.d r0 = androidx.compose.ui.c.e(r7, r0)
                    G1.g$a r16 = G1.C4504g.f6515W
                    nI.a r1 = r16.a()
                    U0.f r17 = r7.m()
                    if (r17 != 0) goto L_0x01f9
                    U0.C4883j.c()
                L_0x01f9:
                    r7.I()
                    boolean r17 = r7.i()
                    if (r17 == 0) goto L_0x0206
                    r7.p(r1)
                    goto L_0x0209
                L_0x0206:
                    r7.t()
                L_0x0209:
                    U0.m r1 = U0.F1.a(r7)
                    nI.p r5 = r16.c()
                    U0.F1.c(r1, r13, r5)
                    nI.p r5 = r16.e()
                    U0.F1.c(r1, r14, r5)
                    nI.p r5 = r16.b()
                    boolean r13 = r1.i()
                    if (r13 != 0) goto L_0x0233
                    java.lang.Object r13 = r1.D()
                    java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                    boolean r13 = kotlin.jvm.internal.C17542s.e(r13, r14)
                    if (r13 != 0) goto L_0x0241
                L_0x0233:
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
                    r1.u(r13)
                    java.lang.Integer r13 = java.lang.Integer.valueOf(r15)
                    r1.w(r13, r5)
                L_0x0241:
                    nI.p r5 = r16.d()
                    U0.F1.c(r1, r0, r5)
                    androidx.compose.foundation.layout.j r0 = androidx.compose.foundation.layout.C5079j.f18125a
                    r0 = 956918561(0x39096b21, float:1.3105247E-4)
                    r7.W(r0)
                    if (r12 >= r2) goto L_0x025f
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
                    r1 = r3 & 112(0x70, float:1.57E-43)
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r4.invoke(r0, r7, r1)
                L_0x025f:
                    r7.P()
                    r7.x()
                    r0 = 1
                    int r10 = r10 + r0
                    r1 = r20
                    r5 = r25
                    r0 = r19
                    goto L_0x01b7
                L_0x026f:
                    r19 = r0
                    r0 = 1
                    r7.P()
                    r7.x()
                    int r9 = r9 + r0
                    r1 = r20
                    r5 = r25
                    r8 = r0
                    r0 = r19
                    r10 = 0
                    goto L_0x012e
                L_0x0283:
                    r19 = r0
                    r7.P()
                    r7.x()
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x0294
                    U0.C4895p.R()
                L_0x0294:
                    r3 = r19
                L_0x0296:
                    U0.Y0 r7 = r7.n()
                    if (r7 == 0) goto L_0x02af
                    NA.I r8 = new NA.I
                    r0 = r8
                    r1 = r20
                    r2 = r21
                    r4 = r23
                    r5 = r25
                    r6 = r26
                    r0.<init>(r1, r2, r3, r4, r5, r6)
                    r7.a(r8)
                L_0x02af:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: NA.C13236U.i0(int, int, androidx.compose.ui.d, nI.q, U0.m, int, int):void");
            }

            /* access modifiers changed from: private */
            public static final C16807N j0(int i10, int i11, androidx.compose.ui.d dVar, nI.q qVar, int i12, int i13, C4889m mVar, int i14) {
                i0(i10, i11, dVar, qVar, mVar, M0.a(i12 | 1), i13);
                return C16807N.f139792a;
            }

            private static final void k0(c0.b.c cVar, C17642l<? super C13125c, C16807N> lVar, C17642l<? super c1, C16807N> lVar2, C17642l<? super Drawable, C16807N> lVar3, C17631a<C16807N> aVar, C17642l<? super String, C16807N> lVar4, C17642l<? super Boolean, C16807N> lVar5, C4889m mVar, int i10) {
                int i11;
                C4889m mVar2;
                C5978b.a aVar2;
                C5974I i12;
                c0.b.c cVar2 = cVar;
                C17642l<? super Boolean, C16807N> lVar6 = lVar5;
                int i13 = i10;
                C4889m k10 = mVar.k(-1934233487);
                if ((i13 & 6) == 0) {
                    i11 = (k10.F(cVar2) ? 4 : 2) | i13;
                } else {
                    i11 = i13;
                }
                C17642l<? super C13125c, C16807N> lVar7 = lVar;
                if ((i13 & 48) == 0) {
                    i11 |= k10.F(lVar7) ? 32 : 16;
                }
                C17642l<? super c1, C16807N> lVar8 = lVar2;
                if ((i13 & 384) == 0) {
                    i11 |= k10.F(lVar8) ? 256 : 128;
                }
                C17642l<? super Drawable, C16807N> lVar9 = lVar3;
                if ((i13 & 3072) == 0) {
                    i11 |= k10.F(lVar9) ? RecyclerView.n.FLAG_MOVED : 1024;
                }
                C17631a<C16807N> aVar3 = aVar;
                if ((i13 & 24576) == 0) {
                    i11 |= k10.F(aVar3) ? 16384 : 8192;
                }
                if ((196608 & i13) == 0) {
                    i11 |= k10.F(lVar4) ? 131072 : ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
                } else {
                    C17642l<? super String, C16807N> lVar10 = lVar4;
                }
                if ((i13 & 1572864) == 0) {
                    i11 |= k10.F(lVar6) ? 1048576 : ImageMetadata.LENS_APERTURE;
                }
                if ((i11 & 599187) != 599186 || !k10.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1934233487, i11, -1, "com.ingka.ikea.shoppableimage.impl.presentation.PortraitShoppableImageDetails (ShoppableImageScreen.kt:256)");
                    }
                    C5974I b10 = C5975J.b(0, 0, k10, 0, 3);
                    k10.W(-2137583006);
                    Object D10 = k10.D();
                    C4889m.a aVar4 = C4889m.f14007a;
                    if (D10 == aVar4.a()) {
                        D10 = u1.e(Boolean.FALSE, (o1) null, 2, (Object) null);
                        k10.u(D10);
                    }
                    C4899r0 r0Var = (C4899r0) D10;
                    k10.P();
                    k10.W(-2137580487);
                    boolean V10 = k10.V(b10) | ((3670016 & i11) == 1048576);
                    Object D11 = k10.D();
                    if (V10 || D11 == aVar4.a()) {
                        D11 = new d(b10, lVar6, (C17164e<? super d>) null);
                        k10.u(D11);
                    }
                    k10.P();
                    U0.P.g(b10, (nI.p) D11, k10, 0);
                    C5978b.a aVar5 = new C5978b.a(2);
                    androidx.compose.ui.d h10 = J.h(androidx.compose.ui.d.f18749a, 0.0f, 1, (Object) null);
                    k10.W(-2137565214);
                    boolean F10 = k10.F(cVar2) | ((i11 & 112) == 32) | ((i11 & 7168) == 2048) | ((i11 & 896) == 256) | k10.V(b10) | ((458752 & i11) == 131072) | ((i11 & 57344) == 16384);
                    Object D12 = k10.D();
                    if (F10 || D12 == aVar4.a()) {
                        C13260s sVar = r0;
                        i12 = b10;
                        aVar2 = aVar5;
                        C13260s sVar2 = new C13260s(cVar, lVar, lVar3, lVar2, b10, lVar4, r0Var, aVar);
                        k10.u(sVar);
                        D12 = sVar;
                    } else {
                        i12 = b10;
                        aVar2 = aVar5;
                    }
                    k10.P();
                    mVar2 = k10;
                    C5984h.a(aVar2, h10, i12, (C5834E) null, false, (C5073d.m) null, (C5073d.e) null, (s) null, false, (C17642l) D12, mVar2, 48, 504);
                    if (C4895p.J()) {
                        C4895p.R();
                    }
                } else {
                    k10.L();
                    mVar2 = k10;
                }
                Y0 n10 = mVar2.n();
                if (n10 != null) {
                    n10.a(new C13261t(cVar, lVar, lVar2, lVar3, aVar, lVar4, lVar5, i10));
                }
            }

            private static final boolean l0(C4899r0<Boolean> r0Var) {
                return r0Var.getValue().booleanValue();
            }

            private static final void m0(C4899r0<Boolean> r0Var, boolean z10) {
                r0Var.setValue(Boolean.valueOf(z10));
            }

            /* access modifiers changed from: private */
            public static final C16807N n0(c0.b.c cVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C5974I i10, C17642l lVar4, C4899r0 r0Var, C17631a aVar, C5968C c10) {
                c0.b.c cVar2 = cVar;
                C17642l lVar5 = lVar;
                C5968C c11 = c10;
                C17542s.j(c11, "$this$LazyVerticalGrid");
                C17642l lVar6 = lVar2;
                V0(c11, cVar, lVar, lVar2);
                X0(c11, cVar);
                R0(c10, cVar, lVar3, i10, l0(r0Var), lVar4, new C13217A(aVar, r0Var));
                N0(c11, cVar, lVar);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N o0(C17631a aVar, C4899r0 r0Var) {
                aVar.invoke();
                m0(r0Var, true);
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N p0(c0.b.c cVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17631a aVar, C17642l lVar4, C17642l lVar5, int i10, C4889m mVar, int i11) {
                k0(cVar, lVar, lVar2, lVar3, aVar, lVar4, lVar5, mVar, M0.a(i10 | 1));
                return C16807N.f139792a;
            }

            /* JADX WARNING: Removed duplicated region for block: B:108:0x0264  */
            /* JADX WARNING: Removed duplicated region for block: B:109:0x0268  */
            /* JADX WARNING: Removed duplicated region for block: B:111:0x026b  */
            /* JADX WARNING: Removed duplicated region for block: B:112:0x026e  */
            /* JADX WARNING: Removed duplicated region for block: B:128:0x02c9  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static final void q0(NA.c0.b r33, NA.C13245d r34, nI.C17642l<? super Op.c1, XH.C16807N> r35, nI.C17631a<XH.C16807N> r36, nI.C17631a<XH.C16807N> r37, nI.C17642l<? super KA.C13125c, XH.C16807N> r38, nI.C17631a<XH.C16807N> r39, nI.C17642l<? super java.lang.String, XH.C16807N> r40, U0.C4889m r41, int r42) {
                /*
                    r9 = r33
                    r10 = r34
                    r11 = r36
                    r12 = r38
                    r13 = r42
                    r0 = -375723717(0xffffffffe99ae93b, float:-2.3409497E25)
                    r1 = r41
                    U0.m r15 = r1.k(r0)
                    r1 = r13 & 6
                    r2 = 2
                    if (r1 != 0) goto L_0x002c
                    r1 = r13 & 8
                    if (r1 != 0) goto L_0x0021
                    boolean r1 = r15.V(r9)
                    goto L_0x0025
                L_0x0021:
                    boolean r1 = r15.F(r9)
                L_0x0025:
                    if (r1 == 0) goto L_0x0029
                    r1 = 4
                    goto L_0x002a
                L_0x0029:
                    r1 = r2
                L_0x002a:
                    r1 = r1 | r13
                    goto L_0x002d
                L_0x002c:
                    r1 = r13
                L_0x002d:
                    r3 = r13 & 48
                    if (r3 != 0) goto L_0x0046
                    r3 = r13 & 64
                    if (r3 != 0) goto L_0x003a
                    boolean r3 = r15.V(r10)
                    goto L_0x003e
                L_0x003a:
                    boolean r3 = r15.F(r10)
                L_0x003e:
                    if (r3 == 0) goto L_0x0043
                    r3 = 32
                    goto L_0x0045
                L_0x0043:
                    r3 = 16
                L_0x0045:
                    r1 = r1 | r3
                L_0x0046:
                    r3 = r13 & 384(0x180, float:5.38E-43)
                    r14 = r35
                    if (r3 != 0) goto L_0x0058
                    boolean r3 = r15.F(r14)
                    if (r3 == 0) goto L_0x0055
                    r3 = 256(0x100, float:3.59E-43)
                    goto L_0x0057
                L_0x0055:
                    r3 = 128(0x80, float:1.794E-43)
                L_0x0057:
                    r1 = r1 | r3
                L_0x0058:
                    r3 = r13 & 3072(0xc00, float:4.305E-42)
                    r8 = 2048(0x800, float:2.87E-42)
                    if (r3 != 0) goto L_0x0069
                    boolean r3 = r15.F(r11)
                    if (r3 == 0) goto L_0x0066
                    r3 = r8
                    goto L_0x0068
                L_0x0066:
                    r3 = 1024(0x400, float:1.435E-42)
                L_0x0068:
                    r1 = r1 | r3
                L_0x0069:
                    r3 = r13 & 24576(0x6000, float:3.4438E-41)
                    r7 = r37
                    if (r3 != 0) goto L_0x007b
                    boolean r3 = r15.F(r7)
                    if (r3 == 0) goto L_0x0078
                    r3 = 16384(0x4000, float:2.2959E-41)
                    goto L_0x007a
                L_0x0078:
                    r3 = 8192(0x2000, float:1.14794E-41)
                L_0x007a:
                    r1 = r1 | r3
                L_0x007b:
                    r3 = 196608(0x30000, float:2.75506E-40)
                    r3 = r3 & r13
                    if (r3 != 0) goto L_0x008c
                    boolean r3 = r15.F(r12)
                    if (r3 == 0) goto L_0x0089
                    r3 = 131072(0x20000, float:1.83671E-40)
                    goto L_0x008b
                L_0x0089:
                    r3 = 65536(0x10000, float:9.18355E-41)
                L_0x008b:
                    r1 = r1 | r3
                L_0x008c:
                    r3 = 1572864(0x180000, float:2.204052E-39)
                    r3 = r3 & r13
                    r5 = r39
                    if (r3 != 0) goto L_0x009f
                    boolean r3 = r15.F(r5)
                    if (r3 == 0) goto L_0x009c
                    r3 = 1048576(0x100000, float:1.469368E-39)
                    goto L_0x009e
                L_0x009c:
                    r3 = 524288(0x80000, float:7.34684E-40)
                L_0x009e:
                    r1 = r1 | r3
                L_0x009f:
                    r3 = 12582912(0xc00000, float:1.7632415E-38)
                    r3 = r3 & r13
                    r4 = r40
                    if (r3 != 0) goto L_0x00b2
                    boolean r3 = r15.F(r4)
                    if (r3 == 0) goto L_0x00af
                    r3 = 8388608(0x800000, float:1.17549435E-38)
                    goto L_0x00b1
                L_0x00af:
                    r3 = 4194304(0x400000, float:5.877472E-39)
                L_0x00b1:
                    r1 = r1 | r3
                L_0x00b2:
                    r3 = r1
                    r1 = 4793491(0x492493, float:6.717112E-39)
                    r1 = r1 & r3
                    r6 = 4793490(0x492492, float:6.71711E-39)
                    if (r1 != r6) goto L_0x00ca
                    boolean r1 = r15.l()
                    if (r1 != 0) goto L_0x00c3
                    goto L_0x00ca
                L_0x00c3:
                    r15.L()
                    r9 = r12
                    r8 = r15
                    goto L_0x02cc
                L_0x00ca:
                    boolean r1 = U0.C4895p.J()
                    if (r1 == 0) goto L_0x00d6
                    r1 = -1
                    java.lang.String r6 = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageComposable (ShoppableImageScreen.kt:132)"
                    U0.C4895p.S(r0, r3, r1, r6)
                L_0x00d6:
                    r0 = -330532672(0xffffffffec4c78c0, float:-9.887644E26)
                    r15.W(r0)
                    java.lang.Object r0 = r15.D()
                    U0.m$a r29 = U0.C4889m.f14007a
                    java.lang.Object r1 = r29.a()
                    r6 = 0
                    if (r0 != r1) goto L_0x00f0
                    U0.r0 r0 = U0.u1.e(r6, r6, r2, r6)
                    r15.u(r0)
                L_0x00f0:
                    r16 = r0
                    U0.r0 r16 = (U0.C4899r0) r16
                    r15.P()
                    r0 = -330530442(0xffffffffec4c8176, float:-9.889289E26)
                    r15.W(r0)
                    java.lang.Object r0 = r15.D()
                    java.lang.Object r1 = r29.a()
                    if (r0 != r1) goto L_0x0110
                    java.lang.Boolean r0 = java.lang.Boolean.FALSE
                    U0.r0 r0 = U0.u1.e(r0, r6, r2, r6)
                    r15.u(r0)
                L_0x0110:
                    r17 = r0
                    U0.r0 r17 = (U0.C4899r0) r17
                    r15.P()
                    android.graphics.drawable.Drawable r0 = r0(r16)
                    boolean r1 = t0(r17)
                    r2 = 0
                    U(r0, r1, r15, r2)
                    r0 = -330526284(0xffffffffec4c91b4, float:-9.892357E26)
                    r15.W(r0)
                    java.lang.Object r0 = r15.D()
                    java.lang.Object r1 = r29.a()
                    if (r0 != r1) goto L_0x013b
                    O0.L0 r0 = new O0.L0
                    r0.<init>()
                    r15.u(r0)
                L_0x013b:
                    r1 = r0
                    O0.L0 r1 = (O0.L0) r1
                    r15.P()
                    float r0 = (float) r2
                    float r18 = c2.h.B(r0)
                    r22 = 14
                    r23 = 0
                    r19 = 0
                    r20 = 0
                    r21 = 0
                    s0.T r24 = s0.C5850V.c(r18, r19, r20, r21, r22, r23)
                    androidx.compose.ui.d$a r0 = androidx.compose.ui.d.f18749a
                    s0.T$a r2 = s0.C5848T.f28733a
                    r9 = 6
                    s0.T r2 = s0.a0.b(r2, r15, r9)
                    s0.Y$a r19 = s0.C5853Y.f28774a
                    int r6 = r19.e()
                    s0.T r2 = s0.C5850V.i(r2, r6)
                    androidx.compose.ui.d r19 = s0.C5851W.d(r0, r2)
                    NA.U$e r0 = new NA.U$e
                    r0.<init>(r1)
                    r2 = -191339263(0xfffffffff4986501, float:-9.659152E31)
                    r6 = 1
                    r9 = 54
                    c1.a r21 = c1.c.e(r2, r6, r0, r15, r9)
                    NA.U$f r2 = new NA.U$f
                    r0 = r2
                    r30 = r1
                    r1 = r33
                    r13 = r2
                    r31 = 0
                    r2 = r37
                    r32 = r3
                    r3 = r38
                    r4 = r35
                    r5 = r39
                    r12 = r6
                    r6 = r40
                    r7 = r16
                    r8 = r17
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    r0 = 1106659402(0x41f6484a, float:30.785297)
                    c1.a r25 = c1.c.e(r0, r12, r13, r15, r9)
                    r27 = 805309440(0x30000c00, float:4.658318E-10)
                    r28 = 246(0xf6, float:3.45E-43)
                    r0 = 0
                    r16 = 0
                    r18 = 0
                    r1 = 0
                    r2 = 0
                    r22 = 0
                    r14 = r19
                    r8 = r15
                    r15 = r0
                    r17 = r21
                    r19 = r1
                    r20 = r2
                    r26 = r8
                    O0.C4762x0.a(r14, r15, r16, r17, r18, r19, r20, r22, r24, r25, r26, r27, r28)
                    r0 = -330466771(0xffffffffec4d7a2d, float:-9.93627E26)
                    r8.W(r0)
                    if (r10 == 0) goto L_0x020b
                    boolean r0 = r10 instanceof NA.C13245d.a
                    if (r0 == 0) goto L_0x01e0
                    r0 = -330462402(0xffffffffec4d8b3e, float:-9.939494E26)
                    r8.W(r0)
                    r0 = r10
                    NA.d$a r0 = (NA.C13245d.a) r0
                    IC.e r0 = r0.a()
                    int r1 = IC.C13023e.f110931a
                    java.lang.String r6 = r0.a(r8, r1)
                    r8.P()
                    goto L_0x0209
                L_0x01e0:
                    boolean r0 = r10 instanceof NA.C13245d.b
                    if (r0 == 0) goto L_0x01fb
                    r0 = -330459362(0xffffffffec4d971e, float:-9.941737E26)
                    r8.W(r0)
                    r0 = r10
                    NA.d$b r0 = (NA.C13245d.b) r0
                    IC.e r0 = r0.a()
                    int r1 = IC.C13023e.f110931a
                    java.lang.String r6 = r0.a(r8, r1)
                    r8.P()
                    goto L_0x0209
                L_0x01fb:
                    boolean r0 = r10 instanceof NA.C13245d.c
                    if (r0 == 0) goto L_0x024e
                    r0 = -1654231415(0xffffffff9d666e89, float:-3.0497392E-21)
                    r8.W(r0)
                    r8.P()
                    r6 = 0
                L_0x0209:
                    if (r6 != 0) goto L_0x0211
                L_0x020b:
                    r3 = r30
                    r1 = r32
                    r0 = 0
                    goto L_0x025d
                L_0x0211:
                    r0 = -1944579445(0xffffffff8c18128b, float:-1.1715234E-31)
                    r8.W(r0)
                    boolean r0 = r8.V(r6)
                    r1 = r32
                    r2 = r1 & 7168(0x1c00, float:1.0045E-41)
                    r3 = 2048(0x800, float:2.87E-42)
                    if (r2 != r3) goto L_0x0225
                    r2 = r12
                    goto L_0x0227
                L_0x0225:
                    r2 = r31
                L_0x0227:
                    r0 = r0 | r2
                    java.lang.Object r2 = r8.D()
                    if (r0 != 0) goto L_0x0239
                    java.lang.Object r0 = r29.a()
                    if (r2 != r0) goto L_0x0235
                    goto L_0x0239
                L_0x0235:
                    r3 = r30
                    r0 = 0
                    goto L_0x0244
                L_0x0239:
                    NA.U$g r2 = new NA.U$g
                    r3 = r30
                    r0 = 0
                    r2.<init>(r3, r6, r11, r0)
                    r8.u(r2)
                L_0x0244:
                    nI.p r2 = (nI.p) r2
                    r8.P()
                    r4 = 6
                    U0.P.g(r3, r2, r8, r4)
                    goto L_0x025d
                L_0x024e:
                    r0 = -330465435(0xffffffffec4d7f65, float:-9.937256E26)
                    r8.W(r0)
                    r8.P()
                    XH.t r0 = new XH.t
                    r0.<init>()
                    throw r0
                L_0x025d:
                    r8.P()
                    boolean r2 = r10 instanceof NA.C13245d.c
                    if (r2 == 0) goto L_0x0268
                    r6 = r10
                    NA.d$c r6 = (NA.C13245d.c) r6
                    goto L_0x0269
                L_0x0268:
                    r6 = r0
                L_0x0269:
                    if (r6 != 0) goto L_0x026e
                    r9 = r38
                    goto L_0x02c3
                L_0x026e:
                    sB.a r2 = r6.a()
                    r0 = -1944564690(0xffffffff8c184c2e, float:-1.1732579E-31)
                    r8.W(r0)
                    r0 = 458752(0x70000, float:6.42848E-40)
                    r0 = r0 & r1
                    r4 = 131072(0x20000, float:1.83671E-40)
                    if (r0 != r4) goto L_0x0281
                    r0 = r12
                    goto L_0x0283
                L_0x0281:
                    r0 = r31
                L_0x0283:
                    java.lang.Object r4 = r8.D()
                    if (r0 != 0) goto L_0x0294
                    java.lang.Object r0 = r29.a()
                    if (r4 != r0) goto L_0x0290
                    goto L_0x0294
                L_0x0290:
                    r9 = r38
                    r0 = r12
                    goto L_0x029f
                L_0x0294:
                    NA.M r4 = new NA.M
                    r9 = r38
                    r0 = r12
                    r4.<init>(r9)
                    r8.u(r4)
                L_0x029f:
                    nI.l r4 = (nI.C17642l) r4
                    r8.P()
                    sB.a r5 = r6.a()
                    sB.a$a r5 = r5.a()
                    sB.a$a r6 = sB.C15035a.C3239a.ADD
                    if (r5 != r6) goto L_0x02b2
                    r31 = r0
                L_0x02b2:
                    r0 = r1 & 7168(0x1c00, float:1.0045E-41)
                    r1 = 6
                    r6 = r0 | 6
                    r7 = 0
                    r0 = r3
                    r1 = r2
                    r2 = r4
                    r3 = r36
                    r4 = r31
                    r5 = r8
                    tB.C15062c.c(r0, r1, r2, r3, r4, r5, r6, r7)
                L_0x02c3:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x02cc
                    U0.C4895p.R()
                L_0x02cc:
                    U0.Y0 r12 = r8.n()
                    if (r12 == 0) goto L_0x02ed
                    NA.N r13 = new NA.N
                    r0 = r13
                    r1 = r33
                    r2 = r34
                    r3 = r35
                    r4 = r36
                    r5 = r37
                    r6 = r38
                    r7 = r39
                    r8 = r40
                    r9 = r42
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    r12.a(r13)
                L_0x02ed:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: NA.C13236U.q0(NA.c0$b, NA.d, nI.l, nI.a, nI.a, nI.l, nI.a, nI.l, U0.m, int):void");
            }

            private static final Drawable r0(C4899r0<Drawable> r0Var) {
                return r0Var.getValue();
            }

            /* access modifiers changed from: private */
            public static final void s0(C4899r0<Drawable> r0Var, Drawable drawable) {
                r0Var.setValue(drawable);
            }

            /* access modifiers changed from: private */
            public static final boolean t0(C4899r0<Boolean> r0Var) {
                return r0Var.getValue().booleanValue();
            }

            /* access modifiers changed from: private */
            public static final void u0(C4899r0<Boolean> r0Var, boolean z10) {
                r0Var.setValue(Boolean.valueOf(z10));
            }

            /* access modifiers changed from: private */
            public static final C16807N v0(C17642l lVar, String str) {
                C17542s.j(str, "listId");
                lVar.invoke(new C13125c.d(str));
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            public static final C16807N w0(c0.b bVar, C13245d dVar, C17642l lVar, C17631a aVar, C17631a aVar2, C17642l lVar2, C17631a aVar3, C17642l lVar3, int i10, C4889m mVar, int i11) {
                q0(bVar, dVar, lVar, aVar, aVar2, lVar2, aVar3, lVar3, mVar, M0.a(i10 | 1));
                return C16807N.f139792a;
            }

            /* access modifiers changed from: private */
            /* JADX WARNING: Removed duplicated region for block: B:103:0x0193  */
            /* JADX WARNING: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:86:0x00f5  */
            /* JADX WARNING: Removed duplicated region for block: B:87:0x00fb  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public static final void x0(NA.c0.b.c r18, nI.C17642l<? super Op.c1, XH.C16807N> r19, nI.C17642l<? super KA.C13125c, XH.C16807N> r20, nI.C17642l<? super android.graphics.drawable.Drawable, XH.C16807N> r21, nI.C17631a<XH.C16807N> r22, nI.C17642l<? super java.lang.String, XH.C16807N> r23, nI.C17642l<? super java.lang.Boolean, XH.C16807N> r24, androidx.compose.ui.d r25, U0.C4889m r26, int r27, int r28) {
                /*
                    r9 = r24
                    r10 = r27
                    r11 = r28
                    r0 = 1828780558(0x6d00fa0e, float:2.4947737E27)
                    r1 = r26
                    U0.m r12 = r1.k(r0)
                    r1 = r11 & 1
                    if (r1 == 0) goto L_0x0018
                    r1 = r10 | 6
                    r13 = r18
                    goto L_0x002a
                L_0x0018:
                    r1 = r10 & 6
                    r13 = r18
                    if (r1 != 0) goto L_0x0029
                    boolean r1 = r12.F(r13)
                    if (r1 == 0) goto L_0x0026
                    r1 = 4
                    goto L_0x0027
                L_0x0026:
                    r1 = 2
                L_0x0027:
                    r1 = r1 | r10
                    goto L_0x002a
                L_0x0029:
                    r1 = r10
                L_0x002a:
                    r2 = r11 & 2
                    if (r2 == 0) goto L_0x0033
                    r1 = r1 | 48
                    r14 = r19
                    goto L_0x0045
                L_0x0033:
                    r2 = r10 & 48
                    r14 = r19
                    if (r2 != 0) goto L_0x0045
                    boolean r2 = r12.F(r14)
                    if (r2 == 0) goto L_0x0042
                    r2 = 32
                    goto L_0x0044
                L_0x0042:
                    r2 = 16
                L_0x0044:
                    r1 = r1 | r2
                L_0x0045:
                    r2 = r11 & 4
                    if (r2 == 0) goto L_0x004e
                    r1 = r1 | 384(0x180, float:5.38E-43)
                    r15 = r20
                    goto L_0x0060
                L_0x004e:
                    r2 = r10 & 384(0x180, float:5.38E-43)
                    r15 = r20
                    if (r2 != 0) goto L_0x0060
                    boolean r2 = r12.F(r15)
                    if (r2 == 0) goto L_0x005d
                    r2 = 256(0x100, float:3.59E-43)
                    goto L_0x005f
                L_0x005d:
                    r2 = 128(0x80, float:1.794E-43)
                L_0x005f:
                    r1 = r1 | r2
                L_0x0060:
                    r2 = r11 & 8
                    if (r2 == 0) goto L_0x0069
                    r1 = r1 | 3072(0xc00, float:4.305E-42)
                    r8 = r21
                    goto L_0x007b
                L_0x0069:
                    r2 = r10 & 3072(0xc00, float:4.305E-42)
                    r8 = r21
                    if (r2 != 0) goto L_0x007b
                    boolean r2 = r12.F(r8)
                    if (r2 == 0) goto L_0x0078
                    r2 = 2048(0x800, float:2.87E-42)
                    goto L_0x007a
                L_0x0078:
                    r2 = 1024(0x400, float:1.435E-42)
                L_0x007a:
                    r1 = r1 | r2
                L_0x007b:
                    r2 = r11 & 16
                    if (r2 == 0) goto L_0x0084
                    r1 = r1 | 24576(0x6000, float:3.4438E-41)
                    r7 = r22
                    goto L_0x0096
                L_0x0084:
                    r2 = r10 & 24576(0x6000, float:3.4438E-41)
                    r7 = r22
                    if (r2 != 0) goto L_0x0096
                    boolean r2 = r12.F(r7)
                    if (r2 == 0) goto L_0x0093
                    r2 = 16384(0x4000, float:2.2959E-41)
                    goto L_0x0095
                L_0x0093:
                    r2 = 8192(0x2000, float:1.14794E-41)
                L_0x0095:
                    r1 = r1 | r2
                L_0x0096:
                    r2 = r11 & 32
                    r3 = 196608(0x30000, float:2.75506E-40)
                    if (r2 == 0) goto L_0x00a0
                    r1 = r1 | r3
                    r6 = r23
                    goto L_0x00b2
                L_0x00a0:
                    r2 = r10 & r3
                    r6 = r23
                    if (r2 != 0) goto L_0x00b2
                    boolean r2 = r12.F(r6)
                    if (r2 == 0) goto L_0x00af
                    r2 = 131072(0x20000, float:1.83671E-40)
                    goto L_0x00b1
                L_0x00af:
                    r2 = 65536(0x10000, float:9.18355E-41)
                L_0x00b1:
                    r1 = r1 | r2
                L_0x00b2:
                    r2 = r11 & 64
                    r3 = 1572864(0x180000, float:2.204052E-39)
                    if (r2 == 0) goto L_0x00ba
                    r1 = r1 | r3
                    goto L_0x00ca
                L_0x00ba:
                    r2 = r10 & r3
                    if (r2 != 0) goto L_0x00ca
                    boolean r2 = r12.F(r9)
                    if (r2 == 0) goto L_0x00c7
                    r2 = 1048576(0x100000, float:1.469368E-39)
                    goto L_0x00c9
                L_0x00c7:
                    r2 = 524288(0x80000, float:7.34684E-40)
                L_0x00c9:
                    r1 = r1 | r2
                L_0x00ca:
                    r2 = r11 & 128(0x80, float:1.794E-43)
                    r3 = 12582912(0xc00000, float:1.7632415E-38)
                    if (r2 == 0) goto L_0x00d4
                    r1 = r1 | r3
                L_0x00d1:
                    r3 = r25
                    goto L_0x00e5
                L_0x00d4:
                    r3 = r3 & r10
                    if (r3 != 0) goto L_0x00d1
                    r3 = r25
                    boolean r4 = r12.V(r3)
                    if (r4 == 0) goto L_0x00e2
                    r4 = 8388608(0x800000, float:1.17549435E-38)
                    goto L_0x00e4
                L_0x00e2:
                    r4 = 4194304(0x400000, float:5.877472E-39)
                L_0x00e4:
                    r1 = r1 | r4
                L_0x00e5:
                    r4 = 4793491(0x492493, float:6.717112E-39)
                    r4 = r4 & r1
                    r5 = 4793490(0x492492, float:6.71711E-39)
                    if (r4 != r5) goto L_0x00fb
                    boolean r4 = r12.l()
                    if (r4 != 0) goto L_0x00f5
                    goto L_0x00fb
                L_0x00f5:
                    r12.L()
                    r8 = r3
                    goto L_0x018d
                L_0x00fb:
                    if (r2 == 0) goto L_0x0102
                    androidx.compose.ui.d$a r2 = androidx.compose.ui.d.f18749a
                    r16 = r2
                    goto L_0x0104
                L_0x0102:
                    r16 = r3
                L_0x0104:
                    boolean r2 = U0.C4895p.J()
                    if (r2 == 0) goto L_0x0110
                    r2 = -1
                    java.lang.String r3 = "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageContent (ShoppableImageScreen.kt:225)"
                    U0.C4895p.S(r0, r1, r2, r3)
                L_0x0110:
                    r0 = 0
                    boolean r0 = M0(r12, r0)
                    if (r0 == 0) goto L_0x0148
                    r0 = -1061734633(0xffffffffc0b73717, float:-5.725475)
                    r12.W(r0)
                    java.lang.Boolean r0 = java.lang.Boolean.TRUE
                    r9.invoke(r0)
                    r0 = r1 & 14
                    int r2 = r1 >> 3
                    r2 = r2 & 112(0x70, float:1.57E-43)
                    r0 = r0 | r2
                    int r2 = r1 << 3
                    r2 = r2 & 896(0x380, float:1.256E-42)
                    r0 = r0 | r2
                    int r1 = r1 >> 12
                    r1 = r1 & 7168(0x1c00, float:1.0045E-41)
                    r0 = r0 | r1
                    r17 = 0
                    r1 = r18
                    r2 = r20
                    r3 = r19
                    r4 = r16
                    r5 = r12
                    r6 = r0
                    r7 = r17
                    d0(r1, r2, r3, r4, r5, r6, r7)
                    r12.P()
                    goto L_0x0182
                L_0x0148:
                    r0 = -1061476713(0xffffffffc0bb2697, float:-5.8484607)
                    r12.W(r0)
                    r0 = r1 & 14
                    int r2 = r1 >> 3
                    r2 = r2 & 112(0x70, float:1.57E-43)
                    r0 = r0 | r2
                    int r2 = r1 << 3
                    r2 = r2 & 896(0x380, float:1.256E-42)
                    r0 = r0 | r2
                    r2 = r1 & 7168(0x1c00, float:1.0045E-41)
                    r0 = r0 | r2
                    r2 = 57344(0xe000, float:8.0356E-41)
                    r2 = r2 & r1
                    r0 = r0 | r2
                    r2 = 458752(0x70000, float:6.42848E-40)
                    r2 = r2 & r1
                    r0 = r0 | r2
                    r2 = 3670016(0x380000, float:5.142788E-39)
                    r1 = r1 & r2
                    r17 = r0 | r1
                    r0 = r18
                    r1 = r20
                    r2 = r19
                    r3 = r21
                    r4 = r22
                    r5 = r23
                    r6 = r24
                    r7 = r12
                    r8 = r17
                    k0(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                    r12.P()
                L_0x0182:
                    boolean r0 = U0.C4895p.J()
                    if (r0 == 0) goto L_0x018b
                    U0.C4895p.R()
                L_0x018b:
                    r8 = r16
                L_0x018d:
                    U0.Y0 r12 = r12.n()
                    if (r12 == 0) goto L_0x01af
                    NA.S r7 = new NA.S
                    r0 = r7
                    r1 = r18
                    r2 = r19
                    r3 = r20
                    r4 = r21
                    r5 = r22
                    r6 = r23
                    r13 = r7
                    r7 = r24
                    r9 = r27
                    r10 = r28
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                    r12.a(r13)
                L_0x01af:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: NA.C13236U.x0(NA.c0$b$c, nI.l, nI.l, nI.l, nI.a, nI.l, nI.l, androidx.compose.ui.d, U0.m, int, int):void");
            }

            /* access modifiers changed from: private */
            public static final C16807N y0(c0.b.c cVar, C17642l lVar, C17642l lVar2, C17642l lVar3, C17631a aVar, C17642l lVar4, C17642l lVar5, androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
                x0(cVar, lVar, lVar2, lVar3, aVar, lVar4, lVar5, dVar, mVar, M0.a(i10 | 1), i11);
                return C16807N.f139792a;
            }

            public static final void z0(c0 c0Var, C17642l<? super c1, C16807N> lVar, C17642l<? super C13125c, C16807N> lVar2, C4889m mVar, int i10) {
                int i11;
                c0 c0Var2 = c0Var;
                C17642l<? super c1, C16807N> lVar3 = lVar;
                C17642l<? super C13125c, C16807N> lVar4 = lVar2;
                int i12 = i10;
                C17542s.j(c0Var2, "viewModel");
                C17542s.j(lVar3, "onProductItemEvent");
                C17542s.j(lVar4, "onShoppableImageScreenUiEvent");
                C4889m k10 = mVar.k(957037607);
                if ((i12 & 6) == 0) {
                    i11 = (k10.F(c0Var2) ? 4 : 2) | i12;
                } else {
                    i11 = i12;
                }
                if ((i12 & 48) == 0) {
                    i11 |= k10.F(lVar3) ? 32 : 16;
                }
                if ((i12 & 384) == 0) {
                    i11 |= k10.F(lVar4) ? 256 : 128;
                }
                int i13 = i11;
                if ((i13 & 147) != 146 || !k10.l()) {
                    if (C4895p.J()) {
                        C4895p.S(957037607, i13, -1, "com.ingka.ikea.shoppableimage.impl.presentation.ShoppableImageScreen (ShoppableImageScreen.kt:101)");
                    }
                    A1<c0.b> b10 = p1.b(c0Var.m(), (C17168i) null, k10, 0, 1);
                    A1<C13245d> c10 = j3.a.c(c0Var.I(), (C5221y) null, (r.b) null, (C17168i) null, k10, 0, 7);
                    c0.b A02 = A0(b10);
                    C13245d B02 = B0(c10);
                    k10.W(-1668696506);
                    boolean F10 = k10.F(c0Var2) | ((i13 & 112) == 32);
                    Object D10 = k10.D();
                    if (F10 || D10 == C4889m.f14007a.a()) {
                        D10 = new C13251j(lVar3, c0Var2);
                        k10.u(D10);
                    }
                    C17642l lVar5 = (C17642l) D10;
                    k10.P();
                    k10.W(-1668690961);
                    boolean F11 = k10.F(c0Var2);
                    Object D11 = k10.D();
                    if (F11 || D11 == C4889m.f14007a.a()) {
                        D11 = new h(c0Var2);
                        k10.u(D11);
                    }
                    k10.P();
                    C17631a aVar = (C17631a) ((C18059h) D11);
                    k10.W(-1668688954);
                    boolean F12 = k10.F(c0Var2);
                    Object D12 = k10.D();
                    if (F12 || D12 == C4889m.f14007a.a()) {
                        D12 = new i(c0Var2);
                        k10.u(D12);
                    }
                    k10.P();
                    C17631a aVar2 = (C17631a) ((C18059h) D12);
                    k10.W(-1668686901);
                    boolean F13 = k10.F(c0Var2) | ((i13 & 896) == 256);
                    Object D13 = k10.D();
                    if (F13 || D13 == C4889m.f14007a.a()) {
                        D13 = new C13262u(lVar4, c0Var2);
                        k10.u(D13);
                    }
                    C17642l lVar6 = (C17642l) D13;
                    k10.P();
                    k10.W(-1668682160);
                    boolean F14 = k10.F(c0Var2);
                    Object D14 = k10.D();
                    if (F14 || D14 == C4889m.f14007a.a()) {
                        D14 = new j(c0Var2);
                        k10.u(D14);
                    }
                    k10.P();
                    C17631a aVar3 = (C17631a) ((C18059h) D14);
                    k10.W(-1668679943);
                    boolean F15 = k10.F(c0Var2);
                    Object D15 = k10.D();
                    if (F15 || D15 == C4889m.f14007a.a()) {
                        D15 = new k(c0Var2);
                        k10.u(D15);
                    }
                    k10.P();
                    q0(A02, B02, lVar5, aVar, aVar2, lVar6, aVar3, (C17642l) ((C18059h) D15), k10, 0);
                    if (C4895p.J()) {
                        C4895p.R();
                    }
                } else {
                    k10.L();
                }
                Y0 n10 = k10.n();
                if (n10 != null) {
                    n10.a(new C13222F(c0Var2, lVar3, lVar4, i12));
                }
            }
        }
