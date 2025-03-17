package com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems;

import Ae.k;
import Ar.j;
import Fz.C12912b;
import HJ.C15854t;
import IC.C13023e;
import Sy.a;
import TJ.C16532g;
import TJ.C16534i;
import Vi.C10961a;
import Vi.C10973m;
import Vi.C10974n;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import aA.C13909a;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.ScanAndGoBottomSheetFragment;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.b;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dl.C11212q;
import dl.r;
import eI.C17187b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lg.C10027d;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import oj.i;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rj.C11821a;
import rj.C11822b;
import rj.C11823c;
import rj.C11824d;
import rj.C11825e;
import rj.C11826f;
import rj.C11827g;
import rz.C15015h;
import rz.C15029w;
import u2.C6012a;
import uK.C18146a;
import wj.C12274b;
import x4.C8951o;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u001d\u0010\u0014\u001a\u00020\u00072\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u0004J\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010$\u001a\u00020#2\u0006\u0010 \u001a\u00020\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b$\u0010%J!\u0010(\u001a\u00020\u00072\u0006\u0010'\u001a\u00020&2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0004J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010>\u001a\u0002078\u0000@\u0000X.¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010N\u001a\u00020G8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u0018\u0010R\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010V\u001a\u0004\u0018\u00010S8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u001b\u0010\\\u001a\u00020W8BX\u0002¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R \u0010b\u001a\b\u0012\u0004\u0012\u00020\u00070]8\u0016X\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020O8BX\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010h\u001a\u00020S8BX\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010l\u001a\u00020i8VX\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006m"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/UnavailableChildItemsDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "", "<init>", "()V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;", "state", "LXH/N;", "X0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;)V", "V0", "Q0", "", "addAvailableItemsToCart", "U0", "(Z)V", "S0", "", "Lrz/h;", "unavailableItems", "E0", "(Ljava/util/List;)V", "Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;", "result", "P0", "(Lcom/ingka/ikea/shoppinglist/listpicker/navigation/ListPickerNavigation$b;)V", "b1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/constraintlayout/widget/ConstraintLayout;", "R0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Landroid/content/DialogInterface;", "dialog", "onCancel", "(Landroid/content/DialogInterface;)V", "LaA/a;", "P", "LaA/a;", "N0", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "LSy/a;", "Q", "LSy/a;", "I0", "()LSy/a;", "setAnalytics$scanandgo_implementation_release", "(LSy/a;)V", "analytics", "LAr/j;", "R", "LAr/j;", "M0", "()LAr/j;", "setFeedback$scanandgo_implementation_release", "(LAr/j;)V", "feedback", "Lwj/b;", "S", "Lwj/b;", "H0", "()Lwj/b;", "setAddToFavouritesInteractor$scanandgo_implementation_release", "(Lwj/b;)V", "addToFavouritesInteractor", "LFz/b;", "T", "LFz/b;", "_binding", "LLg/d;", "U", "LLg/d;", "_delegatingAdapter", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b;", "X", "LXH/o;", "O0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b;", "viewModel", "Lkotlin/Function0;", "Y", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "J0", "()LFz/b;", "binding", "K0", "()LLg/d;", "delegatingAdapter", "", "L0", "()Ljava/lang/String;", "destId", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnavailableChildItemsDialog extends a {

    /* renamed from: P  reason: collision with root package name */
    public C13909a f91423P;

    /* renamed from: Q  reason: collision with root package name */
    public Sy.a f91424Q;

    /* renamed from: R  reason: collision with root package name */
    public j f91425R;

    /* renamed from: S  reason: collision with root package name */
    public C12274b f91426S;

    /* renamed from: T  reason: collision with root package name */
    private C12912b f91427T;

    /* renamed from: U  reason: collision with root package name */
    private Lg.d f91428U;

    /* renamed from: X  reason: collision with root package name */
    private final C16824o f91429X;

    /* renamed from: Y  reason: collision with root package name */
    private final C17631a<C16807N> f91430Y = new C11826f();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f91431a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$l$a[] r0 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f.l.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$l$a r1 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f.l.a.ADD_TO_CART     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$l$a r1 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f.l.a.UNAVAILABLE_IN_STORE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f$l$a r1 = com.ingka.ikea.app.scanandgoonlineredesign.productinfo.presentation.f.l.a.AVAILABILITY_NOTICE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f91431a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsDialog.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;", "state", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$d;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsDialog$onViewCreated$1", f = "UnavailableChildItemsDialog.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<b.d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91432c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91433d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UnavailableChildItemsDialog f91434e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UnavailableChildItemsDialog unavailableChildItemsDialog, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f91434e = unavailableChildItemsDialog;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f91434e, eVar);
            bVar.f91433d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(b.d dVar, C17164e<? super C16807N> eVar) {
            return ((b) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91432c == 0) {
                y.b(obj);
                b.d dVar = (b.d) this.f91433d;
                if (dVar != null) {
                    UnavailableChildItemsDialog unavailableChildItemsDialog = this.f91434e;
                    unavailableChildItemsDialog.X0(dVar);
                    unavailableChildItemsDialog.Q0(dVar);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b;", "sideEffect", "LXH/N;", "<anonymous>", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/unavailableitems/b$b;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.unavailableitems.UnavailableChildItemsDialog$onViewCreated$2", f = "UnavailableChildItemsDialog.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements p<b.C2008b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91435c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91436d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UnavailableChildItemsDialog f91437e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(UnavailableChildItemsDialog unavailableChildItemsDialog, C17164e<? super c> eVar) {
            super(2, eVar);
            this.f91437e = unavailableChildItemsDialog;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f91437e, eVar);
            cVar.f91436d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(b.C2008b bVar, C17164e<? super C16807N> eVar) {
            return ((c) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91435c == 0) {
                y.b(obj);
                b.C2008b bVar = (b.C2008b) this.f91436d;
                if (bVar instanceof b.C2008b.a) {
                    ScanAndGoBottomSheetFragment.a aVar = ScanAndGoBottomSheetFragment.f91342T;
                    UnavailableChildItemsDialog unavailableChildItemsDialog = this.f91437e;
                    C13023e a10 = ((b.C2008b.a) bVar).a();
                    Context requireContext = this.f91437e.requireContext();
                    C17542s.i(requireContext, "requireContext(...)");
                    ScanAndGoBottomSheetFragment.a.g(aVar, unavailableChildItemsDialog, a10.b(requireContext), (String) null, C18146a.f148220R5, 2, (Object) null);
                } else if (bVar instanceof b.C2008b.C2009b) {
                    j M02 = this.f91437e.M0();
                    ConstraintLayout b10 = this.f91437e.J0().getRoot();
                    C17542s.i(b10, "getRoot(...)");
                    C13023e a11 = ((b.C2008b.C2009b) bVar).a();
                    Context requireContext2 = this.f91437e.requireContext();
                    C17542s.i(requireContext2, "requireContext(...)");
                    j.a.s(M02, b10, a11.b(requireContext2), this.f91437e.getString(Oo.b.f84330B2), 0, (View) null, (C17631a) null, (C17642l) null, 112, (Object) null);
                } else {
                    throw new t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91438c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f91438c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91438c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91439c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f91439c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91439c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91440c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f91440c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91440c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91441c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91442d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91441c = aVar;
            this.f91442d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91441c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91442d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91443c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91443c = oVar;
            this.f91444d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91444d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91443c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public UnavailableChildItemsDialog() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f91429X = W.b(this, P.b(b.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    private final void E0(List<C15015h> list) {
        if (!list.isEmpty()) {
            C12274b H02 = H0();
            C8951o a10 = androidx.navigation.fragment.a.a(this);
            Iterable<C15015h> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (C15015h hVar : iterable) {
                arrayList.add(new ListPickerNavigation.Operation.AddAll.ProductData(hVar.e().d(), hVar.f()));
            }
            H02.b(a10, new ListPickerNavigation.Operation.AddAll(arrayList, new ListPickerNavigation.Operation.Analytics(Interaction$Component.CART_DETAILS, k.OVERFLOW)));
            H0().a(this, L0(), new C11827g(this));
            return;
        }
        j.a.r(M0(), J0().getRoot(), Oo.b.f84843y3, Oo.b.f84616d5, 0, (View) null, (C17631a) null, 48, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N F0(UnavailableChildItemsDialog unavailableChildItemsDialog, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "it");
        unavailableChildItemsDialog.P0(bVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final C12912b J0() {
        C12912b bVar = this.f91427T;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Lg.d K0() {
        Lg.d dVar = this.f91428U;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final b O0() {
        return (b) this.f91429X.getValue();
    }

    private final void P0(ListPickerNavigation.b bVar) {
        if (bVar instanceof ListPickerNavigation.b.d) {
            MaterialButton materialButton = J0().f110068b;
            materialButton.setClickable(false);
            materialButton.setText(getString(Ez.f.f109703i));
            materialButton.setIcon(C6012a.e(requireContext(), C10027d.f75281l));
            b1();
        } else if (!(bVar instanceof ListPickerNavigation.b.a)) {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public final void Q0(b.d dVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new r.b(G2.b.a(getString(Ez.f.f109707k), 0), (String) null, (Integer) null, (Integer) null, r.c.BodyMedium, 0, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2030, (DefaultConstructorMarker) null));
        arrayList.addAll(dVar.e());
        Lg.d.q(K0(), arrayList, false, (C17642l) null, 6, (Object) null);
    }

    private final void S0() {
        ScanAndGoBottomSheetFragment.f91342T.c(this, new C11821a(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N T0(UnavailableChildItemsDialog unavailableChildItemsDialog, i iVar, com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.a aVar) {
        C17542s.j(iVar, "<unused var>");
        C17542s.j(aVar, "<unused var>");
        qv.e eVar = qv.e.DEBUG;
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
                String a10 = C11818a.a("Errorsheet dismissed", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = unavailableChildItemsDialog.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, (Throwable) null, str3);
            str = str3;
            str2 = str4;
        }
        return C16807N.f139792a;
    }

    private final void U0(boolean z10) {
        rw.d.a(this, Boolean.valueOf(z10), "fr_req_key_ciad");
    }

    private final void V0() {
        this.f91428U = new Lg.d((Lg.a<?>[]) new Lg.a[]{new C11212q(), new C10973m(a.e.SHOP_COMBINATION_PARTIAL_AVAILABLE, I0(), new C10961a.b(new C11822b(this)), (C10974n) null)});
        RecyclerView recyclerView = J0().f110072f;
        recyclerView.setAdapter(K0());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    /* access modifiers changed from: private */
    public static final C16807N W0(UnavailableChildItemsDialog unavailableChildItemsDialog, C15029w wVar, int i10) {
        C17542s.j(wVar, "productLite");
        unavailableChildItemsDialog.O0().D(new b.c.a(wVar.d(), wVar.e(), wVar.g(), wVar.f().e().c(), i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void X0(b.d dVar) {
        int i10 = a.f91431a[dVar.d().ordinal()];
        int i11 = 0;
        boolean z10 = true;
        if (i10 == 1) {
            z10 = false;
        } else if (!(i10 == 2 || i10 == 3)) {
            throw new t();
        }
        C12912b J02 = J0();
        J02.f110071e.setOnClickListener(new C11823c(this));
        if (z10) {
            J02.f110069c.setText(getString(Ez.f.f109721r));
        }
        J02.f110069c.setOnClickListener(new C11824d(this, z10));
        MaterialButton materialButton = J02.f110068b;
        C17542s.i(materialButton, "buttonAddToShoppingList");
        if (!N0().isLoggedIn()) {
            i11 = 8;
        }
        materialButton.setVisibility(i11);
        J02.f110068b.setOnClickListener(new C11825e(this, dVar));
    }

    /* access modifiers changed from: private */
    public static final void Y0(UnavailableChildItemsDialog unavailableChildItemsDialog, View view) {
        unavailableChildItemsDialog.U0(false);
        unavailableChildItemsDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void Z0(UnavailableChildItemsDialog unavailableChildItemsDialog, boolean z10, View view) {
        unavailableChildItemsDialog.U0(!z10);
        unavailableChildItemsDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void a1(UnavailableChildItemsDialog unavailableChildItemsDialog, b.d dVar, View view) {
        unavailableChildItemsDialog.E0(dVar.e());
    }

    private final void b1() {
        Interaction$Component interaction$Component;
        b.d value = O0().getState().getValue();
        if (value != null) {
            int i10 = a.f91431a[value.d().ordinal()];
            if (i10 == 1) {
                interaction$Component = Interaction$Component.SHOP_AND_GO_SHOPPING_LIST_ENTRY_ADD_TO_CART;
            } else if (i10 == 2) {
                interaction$Component = Interaction$Component.SHOP_AND_GO_SHOPPING_LIST_ENTRY_UNAVAILABLE_IN_STORE;
            } else if (i10 == 3) {
                interaction$Component = Interaction$Component.SHOP_AND_GO_SHOPPING_LIST_ENTRY_AVAILABILITY_NOTICE;
            } else {
                throw new t();
            }
            for (C15015h hVar : value.e()) {
                I0().q(interaction$Component, hVar.e().d(), hVar.e().e(), a.c.COMBINATION);
            }
        }
    }

    public final C12274b H0() {
        C12274b bVar = this.f91426S;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("addToFavouritesInteractor");
        return null;
    }

    public final Sy.a I0() {
        Sy.a aVar = this.f91424Q;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public String L0() {
        return "scanandgo/dialog/unavailableChildItemsDialog?entryPoint={entryPoint}&barcode={barcode}";
    }

    public final j M0() {
        j jVar = this.f91425R;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final C13909a N0() {
        C13909a aVar = this.f91423P;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("sessionManager");
        return null;
    }

    /* renamed from: R0 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        C12912b c10 = C12912b.c(layoutInflater, viewGroup, false);
        this.f91427T = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onCancel(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        U0(false);
        super.onCancel(dialogInterface);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public void onDestroyView() {
        this.f91428U = null;
        this.f91427T = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        S0();
        V0();
        C16532g R10 = C16534i.R(C5208k.b(O0().getState(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new b(this, (C17164e<? super b>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        C16532g R11 = C16534i.R(C5208k.b(O0().C(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new c(this, (C17164e<? super c>) null));
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C16534i.M(R11, C5222z.a(viewLifecycleOwner2));
    }
}
