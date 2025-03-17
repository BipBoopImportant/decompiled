package Fy;

import Dy.C12810j;
import HJ.C15854t;
import Jy.n;
import Lg.c;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.t;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kp.C11522d;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;
import qx.d;
import rz.K;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0010B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001b¨\u0006\u001c"}, d2 = {"LFy/i;", "LLg/a;", "LJy/n;", "Lkp/d;", "currencyConfig", "Lkotlin/Function1;", "LJy/n$a;", "LXH/N;", "familyCardClicked", "Lkotlin/Function0;", "onFamilyBannerGenerated", "<init>", "(Lkp/d;LnI/l;LnI/a;)V", "", "item", "", "a", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "container", "LLg/c;", "d", "(Landroid/view/ViewGroup;)LLg/c;", "b", "Lkp/d;", "c", "LnI/l;", "LnI/a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i extends Lg.a<n> {
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C11522d f110015b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17642l<n.a, C16807N> f110016c;

    /* renamed from: d  reason: collision with root package name */
    private final C17631a<C16807N> f110017d;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LFy/i$a;", "LLg/c;", "LJy/n;", "Landroidx/compose/ui/platform/ComposeView;", "composeView", "<init>", "(LFy/i;Landroidx/compose/ui/platform/ComposeView;)V", "viewModel", "LXH/N;", "l", "(LJy/n;)V", "Landroid/view/View;", "view", "i", "(Landroid/view/View;)V", "h", "Landroidx/compose/ui/platform/ComposeView;", "getComposeView", "()Landroidx/compose/ui/platform/ComposeView;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a extends c<n> {

        /* renamed from: h  reason: collision with root package name */
        private final ComposeView f110018h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ i f110019i;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: Fy.i$a$a  reason: collision with other inner class name */
        static final class C2637a implements p<C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ n f110020a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ i f110021b;

            C2637a(n nVar, i iVar) {
                this.f110020a = nVar;
                this.f110021b = iVar;
            }

            public final void a(C4889m mVar, int i10) {
                if ((i10 & 3) != 2 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-1445304592, i10, -1, "com.ingka.ikea.scanandgo.cart.impl.delegate.FamilyCardPromotionDelegate.ViewHolder.bind.<anonymous>.<anonymous> (FamilyCardPromotionDelegate.kt:47)");
                    }
                    C12810j.m(d.a(this.f110020a.h(), this.f110021b.f110015b), this.f110020a.g(), this.f110021b.f110016c, mVar, 0);
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

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(i iVar, ComposeView composeView) {
            super((View) composeView, true);
            C17542s.j(composeView, "composeView");
            this.f110019i = iVar;
            this.f110018h = composeView;
        }

        public void i(View view) {
            n.a aVar;
            C17542s.j(view, "view");
            super.i(view);
            K g10 = ((n) g()).g();
            if (g10 instanceof K.b) {
                aVar = n.a.SIGNUP_LOGIN;
            } else if (g10 instanceof K.a.c) {
                aVar = n.a.UPGRADE_TO_FAMILY;
            } else if ((g10 instanceof K.c) || (g10 instanceof K.a.b) || (g10 instanceof K.a.C3233a)) {
                aVar = null;
            } else {
                throw new t();
            }
            if (aVar == null) {
                IllegalStateException illegalStateException = new IllegalStateException("ViewModel should not exist if user is LoggedInWithFamilyCard");
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str = null;
                String str2 = null;
                for (C11819b bVar : arrayList) {
                    if (str == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 != null) {
                            str = C11820c.a(a10);
                        } else {
                            return;
                        }
                    }
                    String str3 = str;
                    if (str2 == null) {
                        String name = a.class.getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str4 = str2;
                    bVar.a(eVar, str4, false, illegalStateException, str3);
                    str = str3;
                    str2 = str4;
                }
                return;
            }
            this.f110019i.f110016c.invoke(aVar);
        }

        /* renamed from: l */
        public void c(n nVar) {
            C17542s.j(nVar, "viewModel");
            ComposeView composeView = this.f110018h;
            i iVar = this.f110019i;
            super.c(nVar);
            TC.e.l(composeView, false, c1.c.c(-1445304592, true, new C2637a(nVar, iVar)), 1, (Object) null);
        }
    }

    public i(C11522d dVar, C17642l<? super n.a, C16807N> lVar, C17631a<C16807N> aVar) {
        C17542s.j(dVar, "currencyConfig");
        C17542s.j(lVar, "familyCardClicked");
        C17542s.j(aVar, "onFamilyBannerGenerated");
        this.f110015b = dVar;
        this.f110016c = lVar;
        this.f110017d = aVar;
    }

    public boolean a(Object obj) {
        C17542s.j(obj, "item");
        return obj instanceof n;
    }

    public c<n> d(ViewGroup viewGroup) {
        C17542s.j(viewGroup, "container");
        this.f110017d.invoke();
        Context context = viewGroup.getContext();
        C17542s.i(context, "getContext(...)");
        return new a(this, new ComposeView(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null));
    }
}
