package com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui;

import Ae.k;
import Ar.j;
import Pj.a;
import Rj.a;
import Sj.C10923j;
import Sj.x;
import Sj.y;
import Sj.z;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.navigation.UpptackaImportProductNavigation$Companion$Result;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.mapper.UiError;
import com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaGenericErrorBottomSheetFragment;
import com.ingka.ikea.shoppinglist.listpicker.navigation.ListPickerNavigation;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import sB.C15035a;
import wj.C12274b;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000m\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0010\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004J\u0019\u0010\u001a\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u001c\u0010\u0004J\u000f\u0010\u001d\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001d\u00109\u001a\u0004\u0018\u0001048BX\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0002¢\u0006\f\n\u0004\b;\u00106\u001a\u0004\b<\u0010=R\u001a\u0010B\u001a\u0002048\u0016XD¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u00108R \u0010H\u001a\b\u0012\u0004\u0012\u00020\u00050C8\u0016X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006I"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaImportProductDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "", "<init>", "()V", "LXH/N;", "O0", "LRj/a$b$a$c;", "navigateTo", "P0", "(LRj/a$b$a$c;)V", "LRj/a$b$a;", "sideEffect", "N0", "(LRj/a$b$a;)V", "R0", "com/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaImportProductDialogFragment$b", "Q0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaImportProductDialogFragment$b;", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;", "error", "S0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;)V", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "w0", "u0", "(LU0/m;I)V", "dismiss", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "LAr/j;", "Q", "LAr/j;", "getFeedback", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "Lwj/b;", "R", "Lwj/b;", "H0", "()Lwj/b;", "setAddToFavouritesInteractor", "(Lwj/b;)V", "addToFavouritesInteractor", "", "S", "LXH/o;", "J0", "()Ljava/lang/String;", "listId", "LPj/b;", "T", "K0", "()LPj/b;", "viewModel", "U", "Ljava/lang/String;", "I0", "destId", "Lkotlin/Function0;", "X", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpptackaImportProductDialogFragment extends a {

    /* renamed from: Q  reason: collision with root package name */
    public j f92297Q;

    /* renamed from: R  reason: collision with root package name */
    public C12274b f92298R;

    /* renamed from: S  reason: collision with root package name */
    private final C16824o f92299S = C16825p.b(new y(this));

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f92300T;

    /* renamed from: U  reason: collision with root package name */
    private final String f92301U;

    /* renamed from: X  reason: collision with root package name */
    private final C17631a<C16807N> f92302X;

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaImportProductDialogFragment$initViewModel$$inlined$collectOnStarted$1", f = "UpptackaImportProductDialogFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends l implements p<a.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f92303c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f92304d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ UpptackaImportProductDialogFragment f92305e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(C17164e eVar, UpptackaImportProductDialogFragment upptackaImportProductDialogFragment) {
            super(2, eVar);
            this.f92305e = upptackaImportProductDialogFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(eVar, this.f92305e);
            aVar.f92304d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(a.b bVar, C17164e<? super C16807N> eVar) {
            return ((a) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f92303c == 0) {
                XH.y.b(obj);
                a.b bVar = (a.b) this.f92304d;
                if (bVar instanceof a.b.C1781b) {
                    this.f92305e.S0(((a.b.C1781b) bVar).a());
                } else if (bVar instanceof a.b.C1778a) {
                    this.f92305e.N0((a.b.C1778a) bVar);
                } else {
                    throw new t();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0004¨\u0006\u0010"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/ui/UpptackaImportProductDialogFragment$b", "LSj/j;", "LXH/N;", "a", "()V", "f", "c", "LRj/d;", "product", "e", "(LRj/d;)V", "Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;", "error", "b", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/upptacka/presentation/mapper/UiError;)V", "d", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements C10923j {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ UpptackaImportProductDialogFragment f92306a;

        b(UpptackaImportProductDialogFragment upptackaImportProductDialogFragment) {
            this.f92306a = upptackaImportProductDialogFragment;
        }

        public void a() {
            this.f92306a.K0().L(a.c.f85574a);
            this.f92306a.dismiss();
        }

        public void b(UiError uiError) {
            C17542s.j(uiError, UiComponentContainer.RESULT_ERROR);
            this.f92306a.S0(uiError);
        }

        public void c() {
            this.f92306a.K0().L(a.C1726a.f85572a);
            this.f92306a.dismiss();
        }

        public void d() {
            this.f92306a.K0().L(a.g.f85578a);
        }

        public void e(Rj.d dVar) {
            C17542s.j(dVar, "product");
            this.f92306a.K0().L(new a.f(dVar));
        }

        public void f() {
            this.f92306a.K0().L(a.h.f85579a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92307c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f92307c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f92307c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92308c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f92308c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f92308c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f92309c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f92309c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f92309c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92310c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f92310c = aVar;
            this.f92311d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f92310c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f92311d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92312c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92313d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f92312c = oVar;
            this.f92313d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f92313d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f92312c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public UpptackaImportProductDialogFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f92300T = W.b(this, P.b(Pj.b.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
        this.f92301U = "scanandgo/dialog/upptackaImportDialog?listId={listId}";
        this.f92302X = new z();
    }

    /* access modifiers changed from: private */
    public static final C16807N C0(UpptackaImportProductDialogFragment upptackaImportProductDialogFragment, ListPickerNavigation.b bVar) {
        C17542s.j(bVar, "result");
        if (bVar instanceof ListPickerNavigation.b.d) {
            ListPickerNavigation.b.d dVar = (ListPickerNavigation.b.d) bVar;
            ListPickerNavigation.b.c cVar = (ListPickerNavigation.b.c) C16877v.y0(dVar.d());
            String b10 = cVar != null ? cVar.b() : null;
            if (b10 == null) {
                b10 = "";
            }
            upptackaImportProductDialogFragment.K0().L(new a.b(new C15035a(dVar.a(), dVar.b(), dVar.c(), b10)));
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N G0() {
        return C16807N.f139792a;
    }

    private final String J0() {
        return (String) this.f92299S.getValue();
    }

    /* access modifiers changed from: private */
    public final Pj.b K0() {
        return (Pj.b) this.f92300T.getValue();
    }

    /* access modifiers changed from: private */
    public static final String L0(UpptackaImportProductDialogFragment upptackaImportProductDialogFragment) {
        Bundle arguments = upptackaImportProductDialogFragment.getArguments();
        if (arguments != null) {
            return arguments.getString("listId");
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final C16807N M0(UpptackaImportProductDialogFragment upptackaImportProductDialogFragment, UpptackaGenericErrorBottomSheetFragment.Result result) {
        C17542s.j(result, "result");
        if (result instanceof UpptackaGenericErrorBottomSheetFragment.Result.b) {
            upptackaImportProductDialogFragment.dismiss();
            return C16807N.f139792a;
        }
        throw new t();
    }

    /* access modifiers changed from: private */
    public final void N0(a.b.C1778a aVar) {
        if (C17542s.e(aVar, a.b.C1778a.C1779a.f86412a)) {
            dismiss();
        } else if (C17542s.e(aVar, a.b.C1778a.C1780b.f86413a)) {
            O0();
        } else if (aVar instanceof a.b.C1778a.c) {
            P0((a.b.C1778a.c) aVar);
        } else {
            throw new t();
        }
    }

    private final void O0() {
        rw.d.a(this, UpptackaImportProductNavigation$Companion$Result.b.f92277a, "UpptackaImportProductDialogFragment.RequestKey");
        super.dismiss();
    }

    private final void P0(a.b.C1778a.c cVar) {
        C8951o a10 = androidx.navigation.fragment.a.a(this);
        v J10 = a10.J();
        if (C17542s.e(J10 != null ? J10.C() : null, "scanandgo/dialog/upptackaImportDialog?listId={listId}")) {
            H0().b(a10, new ListPickerNavigation.Operation.AddOrRemove(cVar.b(), cVar.a(), 0, new ListPickerNavigation.Operation.Analytics(Interaction$Component.SHOP_AND_GO_TRANSFER_ADD_TO_WISHLIST, k.BUTTON), 4, (DefaultConstructorMarker) null));
        }
    }

    private final b Q0() {
        return new b(this);
    }

    private final void R0() {
        rw.d.a(this, UpptackaImportProductNavigation$Companion$Result.a.f92275a, "UpptackaImportProductDialogFragment.RequestKey");
    }

    /* access modifiers changed from: private */
    public final void S0(UiError uiError) {
        UpptackaGenericErrorBottomSheetFragment.b bVar = UpptackaGenericErrorBottomSheetFragment.f92285X;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        bVar.d(parentFragmentManager, uiError.b(), uiError.c(), uiError.a(), uiError.d());
    }

    public final C12274b H0() {
        C12274b bVar = this.f92298R;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("addToFavouritesInteractor");
        return null;
    }

    public String I0() {
        return this.f92301U;
    }

    public void dismiss() {
        R0();
        super.dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
        K0().L(new a.d(J0()));
        UpptackaGenericErrorBottomSheetFragment.b bVar = UpptackaGenericErrorBottomSheetFragment.f92285X;
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        bVar.b(parentFragmentManager, this, new x(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C17542s.j(dialogInterface, "dialog");
        R0();
        super.onDismiss(dialogInterface);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(U0.C4889m r9, int r10) {
        /*
            r8 = this;
            r0 = -508570816(0xffffffffe1afd340, float:-4.054253E20)
            r9.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaImportProductDialogFragment.DialogContent (UpptackaImportProductDialogFragment.kt:99)"
            U0.C4895p.S(r0, r10, r1, r2)
        L_0x0012:
            Pj.b r10 = r8.K0()
            com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaImportProductDialogFragment$b r0 = r8.Q0()
            r1 = 0
            Sj.S.b(r10, r0, r9, r1)
            U0.I0 r10 = Vo.b.c()
            java.lang.Object r10 = r9.Q(r10)
            androidx.fragment.app.o r10 = (androidx.fragment.app.C5187o) r10
            r0 = -2194852(0xffffffffffde825c, float:NaN)
            r9.W(r0)
            java.lang.Object r0 = r9.D()
            U0.m$a r1 = U0.C4889m.f14007a
            java.lang.Object r2 = r1.a()
            if (r0 != r2) goto L_0x0041
            x4.o r0 = androidx.navigation.fragment.a.a(r10)
            r9.u(r0)
        L_0x0041:
            r2 = r0
            x4.o r2 = (x4.C8951o) r2
            r9.P()
            java.lang.String r3 = r8.I0()
            r10 = -2186611(0xffffffffffdea28d, float:NaN)
            r9.W(r10)
            boolean r10 = r9.F(r8)
            java.lang.Object r0 = r9.D()
            if (r10 != 0) goto L_0x0061
            java.lang.Object r10 = r1.a()
            if (r0 != r10) goto L_0x0069
        L_0x0061:
            Sj.w r0 = new Sj.w
            r0.<init>(r8)
            r9.u(r0)
        L_0x0069:
            r5 = r0
            nI.l r5 = (nI.C17642l) r5
            r9.P()
            r7 = 384(0x180, float:5.38E-43)
            java.lang.String r4 = "ChooseListBottomSheet.RequestKey"
            r6 = r9
            qw.l.d(r2, r3, r4, r5, r6, r7)
            boolean r10 = U0.C4895p.J()
            if (r10 == 0) goto L_0x0080
            U0.C4895p.R()
        L_0x0080:
            r9.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.upptacka.presentation.ui.UpptackaImportProductDialogFragment.u0(U0.m, int):void");
    }

    /* access modifiers changed from: protected */
    public void w0() {
        super.w0();
        C16532g R10 = C16534i.R(C5208k.b(K0().J(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new a((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }
}
