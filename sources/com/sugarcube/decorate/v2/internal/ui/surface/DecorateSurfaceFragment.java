package com.sugarcube.decorate.v2.internal.ui.surface;

import C4.j;
import HJ.C15854t;
import JF.C13113u;
import JF.T;
import NG.C16094c;
import NG.C16095d;
import U0.C4889m;
import XH.C16807N;
import XH.C16818i;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.X;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.L;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import cF.C14046h;
import com.sugarcube.app.base.data.database.CachedCatalogItem;
import com.sugarcube.app.base.external.interactions.AccountInteractions;
import com.sugarcube.app.base.external.shoppinglist.AddToShoppingListUseCase;
import com.sugarcube.app.base.navigation.Kreativ;
import com.sugarcube.app.base.ui.gallery.h;
import com.sugarcube.app.base.ui.utils.SystemUiDelegate;
import com.sugarcube.core.logger.Priority;
import com.sugarcube.decorate.internal.navigation.V2;
import com.sugarcube.decorate.v2.internal.ui.surface.a;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17537m;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lF.C14768a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5747v0;
import x4.C;
import x4.C8945i;
import x4.C8948l;
import x4.C8951o;
import x4.I;
import x4.v;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0004J:\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001b\u00100\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001b\u00105\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/sugarcube/decorate/v2/internal/ui/surface/DecorateSurfaceFragment;", "Landroidx/fragment/app/o;", "Lcom/sugarcube/app/base/ui/utils/SystemUiDelegate;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "LXH/N;", "onResume", "Landroid/app/Activity;", "activity", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "systemUiVisible", "decorFitsSystemWindows", "", "orientation", "installSystemUiDelegate", "(Landroid/app/Activity;Landroidx/lifecycle/y;ZZLjava/lang/Integer;)V", "Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "J", "Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "x0", "()Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;", "setAddToShoppingListUseCase", "(Lcom/sugarcube/app/base/external/shoppinglist/AddToShoppingListUseCase;)V", "addToShoppingListUseCase", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "K", "Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "w0", "()Lcom/sugarcube/app/base/external/interactions/AccountInteractions;", "setAccountInteractions", "(Lcom/sugarcube/app/base/external/interactions/AccountInteractions;)V", "accountInteractions", "Lcom/sugarcube/decorate/v2/internal/ui/surface/h;", "L", "LXH/o;", "z0", "()Lcom/sugarcube/decorate/v2/internal/ui/surface/h;", "viewModel", "Lcom/sugarcube/decorate/internal/navigation/V2;", "M", "y0", "()Lcom/sugarcube/decorate/internal/navigation/V2;", "args", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DecorateSurfaceFragment extends i implements SystemUiDelegate {

    /* renamed from: I  reason: collision with root package name */
    private final /* synthetic */ T f142567I = new T();

    /* renamed from: J  reason: collision with root package name */
    public AddToShoppingListUseCase f142568J;

    /* renamed from: K  reason: collision with root package name */
    public AccountInteractions f142569K;

    /* renamed from: L  reason: collision with root package name */
    private final C16824o f142570L;

    /* renamed from: M  reason: collision with root package name */
    private final C16824o f142571M;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DecorateSurfaceFragment f142572a;

        a(DecorateSurfaceFragment decorateSurfaceFragment) {
            this.f142572a = decorateSurfaceFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N j(DecorateSurfaceFragment decorateSurfaceFragment) {
            AccountInteractions w02 = decorateSurfaceFragment.w0();
            C5191t requireActivity = decorateSurfaceFragment.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            w02.navigateLogin(requireActivity);
            decorateSurfaceFragment.z0().i1(a.C17122b.f142609a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N k(DecorateSurfaceFragment decorateSurfaceFragment) {
            AccountInteractions w02 = decorateSurfaceFragment.w0();
            C5191t requireActivity = decorateSurfaceFragment.requireActivity();
            C17542s.i(requireActivity, "requireActivity(...)");
            w02.navigateSignup(requireActivity);
            decorateSurfaceFragment.z0().i1(a.C17122b.f142609a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N m(DecorateSurfaceFragment decorateSurfaceFragment) {
            decorateSurfaceFragment.z0().i1(a.C17144x.f142640a);
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C14768a n(DecorateSurfaceFragment decorateSurfaceFragment, float f10) {
            return decorateSurfaceFragment.z0().getFormattedPrice(f10);
        }

        /* access modifiers changed from: private */
        public static final C16807N p(DecorateSurfaceFragment decorateSurfaceFragment, CachedCatalogItem cachedCatalogItem) {
            C17542s.j(cachedCatalogItem, "item");
            String localItemNumber = cachedCatalogItem.getCatalogItem().getLocalItemNumber();
            if (localItemNumber != null) {
                AddToShoppingListUseCase x02 = decorateSurfaceFragment.x0();
                C8951o a10 = androidx.navigation.fragment.a.a(decorateSurfaceFragment);
                String name = cachedCatalogItem.getCatalogItem().getName();
                if (name == null) {
                    name = "";
                }
                AddToShoppingListUseCase.a.a(x02, a10, name, localItemNumber, (String) null, 1, 8, (Object) null);
            }
            return C16807N.f139792a;
        }

        /* access modifiers changed from: private */
        public static final C16807N q(DecorateSurfaceFragment decorateSurfaceFragment, a aVar) {
            C17542s.j(aVar, "event");
            decorateSurfaceFragment.z0().i1(aVar);
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: nI.l} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v6, resolved type: nI.a} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: nI.a} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void i(U0.C4889m r16, int r17) {
            /*
                r15 = this;
                r0 = r15
                r11 = r16
                r1 = r17
                r2 = r1 & 3
                r3 = 2
                if (r2 != r3) goto L_0x0016
                boolean r2 = r16.l()
                if (r2 != 0) goto L_0x0011
                goto L_0x0016
            L_0x0011:
                r16.L()
                goto L_0x0191
            L_0x0016:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x0025
                r2 = -1
                java.lang.String r3 = "com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment.onCreateView.<anonymous>.<anonymous> (DecorateSurfaceFragment.kt:97)"
                r4 = -775012581(0xffffffffd1ce3f1b, float:-1.1072775E11)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x0025:
                r1 = 1726649171(0x66ea9353, float:5.538757E23)
                r11.W(r1)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r1 = r0.f142572a
                java.lang.Object r2 = r16.D()
                U0.m$a r3 = U0.C4889m.f14007a
                java.lang.Object r4 = r3.a()
                if (r2 != r4) goto L_0x0044
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r1.z0()
                com.sugarcube.decorate.v2.internal.DecorateEngineController r2 = r1.W0()
                r11.u(r2)
            L_0x0044:
                r4 = r2
                com.sugarcube.decorate.v2.internal.DecorateEngineController r4 = (com.sugarcube.decorate.v2.internal.DecorateEngineController) r4
                r16.P()
                r1 = 1726651727(0x66ea9d4f, float:5.539678E23)
                r11.W(r1)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r1 = r0.f142572a
                java.lang.Object r2 = r16.D()
                java.lang.Object r5 = r3.a()
                if (r2 != r5) goto L_0x0067
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r1.z0()
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r2 = r1.g1()
                r11.u(r2)
            L_0x0067:
                r5 = r2
                com.sugarcube.decorate.v2.internal.manager.touch.TouchManager r5 = (com.sugarcube.decorate.v2.internal.manager.touch.TouchManager) r5
                r16.P()
                TJ.P r1 = r4.f()
                r2 = 0
                r6 = 0
                r7 = 1
                U0.A1 r8 = U0.p1.b(r1, r2, r11, r6, r7)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r1 = r0.f142572a
                com.sugarcube.decorate.v2.internal.ui.surface.h r1 = r1.z0()
                TJ.P r1 = r1.f1()
                U0.A1 r1 = U0.p1.b(r1, r2, r11, r6, r7)
                java.lang.Object r1 = r1.getValue()
                OG.l0 r1 = (OG.l0) r1
                r2 = 1726666870(0x66ead876, float:5.5451338E23)
                r11.W(r2)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r2 = r0.f142572a
                boolean r2 = r11.F(r2)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r6 = r0.f142572a
                java.lang.Object r7 = r16.D()
                if (r2 != 0) goto L_0x00a6
                java.lang.Object r2 = r3.a()
                if (r7 != r2) goto L_0x00ae
            L_0x00a6:
                com.sugarcube.decorate.v2.internal.ui.surface.b r7 = new com.sugarcube.decorate.v2.internal.ui.surface.b
                r7.<init>(r6)
                r11.u(r7)
            L_0x00ae:
                r2 = r7
                nI.l r2 = (nI.C17642l) r2
                r16.P()
                r6 = 1726672862(0x66eaefde, float:5.5472926E23)
                r11.W(r6)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r6 = r0.f142572a
                boolean r6 = r11.F(r6)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r7 = r0.f142572a
                java.lang.Object r9 = r16.D()
                if (r6 != 0) goto L_0x00ce
                java.lang.Object r6 = r3.a()
                if (r9 != r6) goto L_0x00d6
            L_0x00ce:
                com.sugarcube.decorate.v2.internal.ui.surface.c r9 = new com.sugarcube.decorate.v2.internal.ui.surface.c
                r9.<init>(r7)
                r11.u(r9)
            L_0x00d6:
                r6 = r9
                nI.l r6 = (nI.C17642l) r6
                r16.P()
                r7 = 1726669407(0x66eae25f, float:5.546048E23)
                r11.W(r7)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r7 = r0.f142572a
                boolean r7 = r11.F(r7)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r9 = r0.f142572a
                java.lang.Object r10 = r16.D()
                if (r7 != 0) goto L_0x00f6
                java.lang.Object r7 = r3.a()
                if (r10 != r7) goto L_0x00fe
            L_0x00f6:
                com.sugarcube.decorate.v2.internal.ui.surface.d r10 = new com.sugarcube.decorate.v2.internal.ui.surface.d
                r10.<init>(r9)
                r11.u(r10)
            L_0x00fe:
                r7 = r10
                nI.l r7 = (nI.C17642l) r7
                r16.P()
                r9 = 1726688692(0x66eb2db4, float:5.552996E23)
                r11.W(r9)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r9 = r0.f142572a
                boolean r9 = r11.F(r9)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r10 = r0.f142572a
                java.lang.Object r12 = r16.D()
                if (r9 != 0) goto L_0x011e
                java.lang.Object r9 = r3.a()
                if (r12 != r9) goto L_0x0126
            L_0x011e:
                com.sugarcube.decorate.v2.internal.ui.surface.e r12 = new com.sugarcube.decorate.v2.internal.ui.surface.e
                r12.<init>(r10)
                r11.u(r12)
            L_0x0126:
                r9 = r12
                nI.a r9 = (nI.C17631a) r9
                r16.P()
                r10 = 1726696309(0x66eb4b75, float:5.5557403E23)
                r11.W(r10)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r10 = r0.f142572a
                boolean r10 = r11.F(r10)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r12 = r0.f142572a
                java.lang.Object r13 = r16.D()
                if (r10 != 0) goto L_0x0146
                java.lang.Object r10 = r3.a()
                if (r13 != r10) goto L_0x014e
            L_0x0146:
                com.sugarcube.decorate.v2.internal.ui.surface.f r13 = new com.sugarcube.decorate.v2.internal.ui.surface.f
                r13.<init>(r12)
                r11.u(r13)
            L_0x014e:
                r10 = r13
                nI.a r10 = (nI.C17631a) r10
                r16.P()
                r12 = 1726703756(0x66eb688c, float:5.5584234E23)
                r11.W(r12)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r12 = r0.f142572a
                boolean r12 = r11.F(r12)
                com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment r13 = r0.f142572a
                java.lang.Object r14 = r16.D()
                if (r12 != 0) goto L_0x016e
                java.lang.Object r3 = r3.a()
                if (r14 != r3) goto L_0x0176
            L_0x016e:
                com.sugarcube.decorate.v2.internal.ui.surface.g r14 = new com.sugarcube.decorate.v2.internal.ui.surface.g
                r14.<init>(r13)
                r11.u(r14)
            L_0x0176:
                r12 = r14
                nI.a r12 = (nI.C17631a) r12
                r16.P()
                r13 = 0
                r3 = r4
                r4 = r8
                r8 = r9
                r9 = r10
                r10 = r12
                r11 = r16
                r12 = r13
                OG.P.a0(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x0191
                U0.C4895p.R()
            L_0x0191:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.decorate.v2.internal.ui.surface.DecorateSurfaceFragment.a.i(U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            i((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements L, C17537m {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ C17642l f142573a;

        b(C17642l lVar) {
            C17542s.j(lVar, "function");
            this.f142573a = lVar;
        }

        public final C16818i<?> c() {
            return this.f142573a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof L) || !(obj instanceof C17537m)) {
                return false;
            }
            return C17542s.e(c(), ((C17537m) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f142573a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f142574c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f142574c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f142574c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f142575c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f142575c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f142575c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f142576c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f142576c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f142576c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f142577c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f142578d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f142577c = aVar;
            this.f142578d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f142577c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f142578d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f142579c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f142580d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f142579c = oVar;
            this.f142580d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f142580d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f142579c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public DecorateSurfaceFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f142570L = W.b(this, P.b(h.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
        this.f142571M = C16825p.b(new C16094c(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N A0(DecorateSurfaceFragment decorateSurfaceFragment, Intent intent) {
        if (intent != null) {
            decorateSurfaceFragment.startActivity(intent);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N B0(DecorateSurfaceFragment decorateSurfaceFragment, String str) {
        String str2 = str;
        h.b bVar = h.b.f124418e;
        com.sugarcube.app.base.ui.gallery.a.b(bVar);
        Class<Kreativ.Gallery> cls = Kreativ.Gallery.class;
        if (str2 != null) {
            Priority priority = Priority.DEBUG;
            String str3 = "Exiting DecorateV2 with showing bottom sheet for composition=" + str2 + ".";
            if (str3 == null) {
                str3 = "";
            }
            int i10 = NG.f.f136484a[priority.ordinal()];
            if (i10 == 1) {
                String name = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                Log.v(name, str3 + " " + "");
            } else if (i10 == 2) {
                String name2 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name2);
                String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o13.length() != 0) {
                    name2 = C15854t.P0(o13, "Kt");
                }
                Log.d(name2, str3 + " " + "");
            } else if (i10 == 3) {
                String name3 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                Log.i(name3, str3 + " " + "");
            } else if (i10 == 4) {
                String name4 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name4);
                String o15 = C15854t.o1(C15854t.s1(name4, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o15.length() != 0) {
                    name4 = C15854t.P0(o15, "Kt");
                }
                Log.w(name4, str3 + " " + "");
            } else if (i10 == 5) {
                String name5 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name5);
                String o16 = C15854t.o1(C15854t.s1(name5, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o16.length() != 0) {
                    name5 = C15854t.P0(o16, "Kt");
                }
                Log.e(name5, str3 + " " + "");
            } else {
                throw new t();
            }
            C8951o a10 = androidx.navigation.fragment.a.a(decorateSurfaceFragment);
            Kreativ.Gallery.Home home = new Kreativ.Gallery.Home(bVar.b());
            C.a aVar = new C.a();
            aVar.j(P.b(cls), true, false);
            C8951o.f0(a10, home, aVar.a(), (I.a) null, 4, (Object) null);
            C8951o.f0(androidx.navigation.fragment.a.a(decorateSurfaceFragment), new Kreativ.Gallery.OverflowSheet(str2, false, 2, (DefaultConstructorMarker) null), (C) null, (I.a) null, 6, (Object) null);
        } else {
            int i11 = NG.g.f136485a[Priority.DEBUG.ordinal()];
            if (i11 == 1) {
                String name6 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name6);
                String o17 = C15854t.o1(C15854t.s1(name6, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o17.length() != 0) {
                    name6 = C15854t.P0(o17, "Kt");
                }
                Log.v(name6, "Exiting DecorateV2 without the need to save." + " " + "");
            } else if (i11 == 2) {
                String name7 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name7);
                String o18 = C15854t.o1(C15854t.s1(name7, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o18.length() != 0) {
                    name7 = C15854t.P0(o18, "Kt");
                }
                Log.d(name7, "Exiting DecorateV2 without the need to save." + " " + "");
            } else if (i11 == 3) {
                String name8 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name8);
                String o19 = C15854t.o1(C15854t.s1(name8, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o19.length() != 0) {
                    name8 = C15854t.P0(o19, "Kt");
                }
                Log.i(name8, "Exiting DecorateV2 without the need to save." + " " + "");
            } else if (i11 == 4) {
                String name9 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name9);
                String o110 = C15854t.o1(C15854t.s1(name9, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o110.length() != 0) {
                    name9 = C15854t.P0(o110, "Kt");
                }
                Log.w(name9, "Exiting DecorateV2 without the need to save." + " " + "");
            } else if (i11 == 5) {
                String name10 = decorateSurfaceFragment.getClass().getName();
                C17542s.g(name10);
                String o111 = C15854t.o1(C15854t.s1(name10, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o111.length() != 0) {
                    name10 = C15854t.P0(o111, "Kt");
                }
                Log.e(name10, "Exiting DecorateV2 without the need to save." + " " + "");
            } else {
                throw new t();
            }
            C8951o a11 = androidx.navigation.fragment.a.a(decorateSurfaceFragment);
            Kreativ.Gallery.Home home2 = new Kreativ.Gallery.Home(bVar.b());
            C.a aVar2 = new C.a();
            aVar2.j(P.b(cls), true, false);
            C8951o.f0(a11, home2, aVar2.a(), (I.a) null, 4, (Object) null);
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final V2 v0(DecorateSurfaceFragment decorateSurfaceFragment) {
        Object obj;
        C8951o a10 = androidx.navigation.fragment.a.a(decorateSurfaceFragment);
        int g10 = j.g(V2.Companion.serializer());
        Class<V2> cls = V2.class;
        if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
            List value = a10.G().getValue();
            ListIterator listIterator = value.listIterator(value.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    obj = null;
                    break;
                }
                obj = listIterator.previous();
                if (((C8948l) obj).e().x() == g10) {
                    break;
                }
            }
            C8948l lVar = (C8948l) obj;
            if (lVar != null) {
                Bundle c10 = lVar.c();
                if (c10 == null) {
                    c10 = new Bundle();
                }
                Map<String, C8945i> s10 = lVar.e().s();
                LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(s10.size()));
                for (Map.Entry entry : s10.entrySet()) {
                    linkedHashMap.put(entry.getKey(), ((C8945i) entry.getValue()).a());
                }
                return (V2) C4.h.a(V2.Companion.serializer(), c10, linkedHashMap);
            }
            throw new IllegalArgumentException(("No destination with route " + P.b(cls).f() + " is on the NavController's back stack. The current destination is " + a10.J()).toString());
        }
        throw new IllegalArgumentException(("Destination with route " + P.b(cls).f() + " cannot be found in navigation graph " + a10.L()).toString());
    }

    private final V2 y0() {
        return (V2) this.f142571M.getValue();
    }

    /* access modifiers changed from: private */
    public final h z0() {
        return (h) this.f142570L.getValue();
    }

    public void installSystemUiDelegate(Activity activity, C5221y yVar, boolean z10, boolean z11, Integer num) {
        C17542s.j(activity, "activity");
        C17542s.j(yVar, "lifecycleOwner");
        this.f142567I.installSystemUiDelegate(activity, yVar, z10, z11, num);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        if (C14046h.e(y0().d()) == null) {
            C8951o a10 = androidx.navigation.fragment.a.a(this);
            int g10 = j.g(Kreativ.Decorate.Companion.serializer());
            if (C8951o.A(a10, a10.L(), g10, true, (v) null, 4, (Object) null) != null) {
                a10.m0(g10, true, false);
                return new View(requireContext());
            }
            throw new IllegalArgumentException(("Destination with route " + P.b(Kreativ.Decorate.class).f() + " cannot be found in navigation graph " + a10.L()).toString());
        }
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        installSystemUiDelegate(requireActivity, viewLifecycleOwner, false, false, 6);
        z0().c1().observe(getViewLifecycleOwner(), new b(new C16095d(this)));
        z0().X0().observe(getViewLifecycleOwner(), new b(new NG.e(this)));
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        C13113u.h(composeView, (C5747v0) null, c1.c.c(-775012581, true, new a(this)), 1, (Object) null);
        return composeView;
    }

    public void onResume() {
        super.onResume();
        if (z0().f1().getValue().c()) {
            z0().i1(new a.C3476a(true));
        }
    }

    public final AccountInteractions w0() {
        AccountInteractions accountInteractions = this.f142569K;
        if (accountInteractions != null) {
            return accountInteractions;
        }
        C17542s.z("accountInteractions");
        return null;
    }

    public final AddToShoppingListUseCase x0() {
        AddToShoppingListUseCase addToShoppingListUseCase = this.f142568J;
        if (addToShoppingListUseCase != null) {
            return addToShoppingListUseCase;
        }
        C17542s.z("addToShoppingListUseCase");
        return null;
    }
}
