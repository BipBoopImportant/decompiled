package com.ingka.ikea.app.scanandgoonlineredesign;

import Ar.j;
import Fz.A;
import Iz.Y;
import Kj.a;
import LD.C13183a;
import Py.a;
import TJ.C16519P;
import TJ.C16532g;
import TJ.C16534i;
import Ui.C10957a;
import Uj.k;
import Vi.C10964d;
import Vi.C10965e;
import Vi.C10966f;
import Vi.C10967g;
import Vi.C10968h;
import Vi.C10971k;
import Vi.I;
import Vi.J;
import Vi.U;
import Vi.X;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import androidx.activity.v;
import androidx.constraintlayout.widget.ConstraintLayout;
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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.C11136e;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.snackbar.Snackbar;
import dI.C17164e;
import eI.C17187b;
import jC.C14617d;
import jC.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import rz.C15007A;
import vm.C12190a;
import x4.C8951o;

@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\"H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u001aH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J+\u00103\u001a\u0002022\u0006\u0010/\u001a\u00020.2\b\u00101\u001a\u0004\u0018\u0001002\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b3\u00104J!\u00106\u001a\u00020\u00052\u0006\u00105\u001a\u0002022\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0005H\u0016¢\u0006\u0004\b8\u0010\u0004J\u000f\u00109\u001a\u00020\u0005H\u0016¢\u0006\u0004\b9\u0010\u0004J\u000f\u0010:\u001a\u00020\u0005H\u0016¢\u0006\u0004\b:\u0010\u0004R\u001a\u0010?\u001a\u00020\u001e8\u0016XD¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R \u0010E\u001a\b\u0012\u0004\u0012\u00020\u00050@8\u0016X\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0000@\u0000X.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010U\u001a\u00020N8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010]\u001a\u00020V8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\"\u0010e\u001a\u00020^8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR\"\u0010m\u001a\u00020f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u001b\u0010s\u001a\u00020n8BX\u0002¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010rR\u0018\u0010w\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bu\u0010vR\u0016\u0010{\u001a\u00020x8\u0002@\u0002X.¢\u0006\u0006\n\u0004\by\u0010zR\u0016\u0010\u001a\u00020|8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u0001\u001a\u00020t8BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006\u0001"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/ScanAndGoCheckoutFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseFragment;", "", "<init>", "()V", "LXH/N;", "i1", "Q0", "l1", "h1", "LUj/k$f;", "uiEvent", "g1", "(LUj/k$f;)V", "Lrz/A;", "scanAndGoCheckout", "LKj/a;", "scanAndGoCheckoutState", "d1", "(Lrz/A;LKj/a;)V", "LUj/k$e;", "uiError", "e1", "(LUj/k$e;)V", "LKj/a$c;", "state", "", "isEarlyPayment", "a1", "(LKj/a$c;Z)V", "", "message", "Z0", "(Ljava/lang/String;)V", "LKj/a$d;", "c1", "(LKj/a$d;)V", "hasOrder", "p1", "(Z)V", "k1", "(Lrz/A;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onResume", "onPause", "onDestroyView", "R", "Ljava/lang/String;", "U0", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "S", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "LAr/j;", "T", "LAr/j;", "V0", "()LAr/j;", "setFeedback$scanandgo_implementation_release", "(LAr/j;)V", "feedback", "Lvm/a;", "U", "Lvm/a;", "R0", "()Lvm/a;", "setBarcode", "(Lvm/a;)V", "barcode", "LLD/a;", "X", "LLD/a;", "Y0", "()LLD/a;", "setWalletNavigation", "(LLD/a;)V", "walletNavigation", "Lcj/e;", "Y", "Lcj/e;", "T0", "()Lcj/e;", "setCloseOrderConfirmationNavigation", "(Lcj/e;)V", "closeOrderConfirmationNavigation", "LIz/Y;", "Z", "LIz/Y;", "W0", "()LIz/Y;", "setScanAndGoNavigation", "(LIz/Y;)V", "scanAndGoNavigation", "LUj/k;", "y0", "LXH/o;", "X0", "()LUj/k;", "viewModel", "LFz/A;", "z0", "LFz/A;", "_binding", "LLg/d;", "A0", "LLg/d;", "delegatingAdapter", "", "B0", "F", "userScreenBrightness", "S0", "()LFz/A;", "binding", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoCheckoutFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private Lg.d f91170A0;

    /* renamed from: B0  reason: collision with root package name */
    private float f91171B0;

    /* renamed from: R  reason: collision with root package name */
    private final String f91172R = "scanandgo/checkout?timeSlotId={timeSlotId}&earlyPayment={earlyPayment}&";

    /* renamed from: S  reason: collision with root package name */
    private final C17631a<C16807N> f91173S = new Ui.g();

    /* renamed from: T  reason: collision with root package name */
    public j f91174T;

    /* renamed from: U  reason: collision with root package name */
    public C12190a f91175U;

    /* renamed from: X  reason: collision with root package name */
    public C13183a f91176X;

    /* renamed from: Y  reason: collision with root package name */
    public C11136e f91177Y;

    /* renamed from: Z  reason: collision with root package name */
    public Y f91178Z;

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f91179y0;

    /* renamed from: z0  reason: collision with root package name */
    private A f91180z0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LUj/k$d;", "uiData", "LXH/N;", "<anonymous>", "(LUj/k$d;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.ScanAndGoCheckoutFragment$observeUiData$1", f = "ScanAndGoCheckoutFragment.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<k.d, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91181c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91182d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCheckoutFragment f91183e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(ScanAndGoCheckoutFragment scanAndGoCheckoutFragment, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f91183e = scanAndGoCheckoutFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            a aVar = new a(this.f91183e, eVar);
            aVar.f91182d = obj;
            return aVar;
        }

        /* renamed from: i */
        public final Object invoke(k.d dVar, C17164e<? super C16807N> eVar) {
            return ((a) create(dVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91181c == 0) {
                y.b(obj);
                k.d dVar = (k.d) this.f91182d;
                ImageButton imageButton = this.f91183e.S0().f110042h;
                C17542s.i(imageButton, "ikeaFamilyCard");
                imageButton.setVisibility(dVar.d() ? 0 : 8);
                this.f91183e.e1(dVar.g());
                this.f91183e.g1(dVar.h());
                this.f91183e.d1(dVar.e(), dVar.c());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/ScanAndGoCheckoutFragment$b", "Landroidx/activity/v;", "LXH/N;", "handleOnBackPressed", "()V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends v {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ScanAndGoCheckoutFragment f91184b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(ScanAndGoCheckoutFragment scanAndGoCheckoutFragment) {
            super(true);
            this.f91184b = scanAndGoCheckoutFragment;
        }

        public void handleOnBackPressed() {
            this.f91184b.X0().X(k.c.e.f88162a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91185c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f91185c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91185c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91186c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f91186c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91186c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91187c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f91187c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91187c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91188c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91189d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91188c = aVar;
            this.f91189d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91188c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91189d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91190c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91191d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91190c = oVar;
            this.f91191d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91191d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91190c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ScanAndGoCheckoutFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f91179y0 = W.b(this, P.b(k.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N P0() {
        return C16807N.f139792a;
    }

    private final void Q0() {
        this.f91170A0 = new Lg.d((Lg.a<?>[]) new Lg.a[]{new C10966f(R0(), getResources().getDimensionPixelOffset(Ez.a.f109493a)), new C10964d(), new U(), new I(), new C10968h()});
        RecyclerView recyclerView = S0().f110045k;
        Lg.d dVar = this.f91170A0;
        if (dVar == null) {
            C17542s.z("delegatingAdapter");
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    /* access modifiers changed from: private */
    public final A S0() {
        A a10 = this.f91180z0;
        if (a10 != null) {
            return a10;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final k X0() {
        return (k) this.f91179y0.getValue();
    }

    private final void Z0(String str) {
        rw.d.a(this, new a.C2810a.C2811a(str), "FRAGMENT_REQUEST_KEY_CHECKOUT_RESULT");
        X0().X(k.c.h.f88165a);
    }

    private final void a1(a.c cVar, boolean z10) {
        Lg.d dVar;
        X0().U().getValue().i();
        rw.d.a(this, a.C2810a.c.f114047a, "FRAGMENT_REQUEST_KEY_CHECKOUT_RESULT");
        C15007A e10 = X0().U().getValue().e();
        XH.v a10 = (e10 != null ? e10.f() : null) != null ? C16796C.a(getString(Oo.b.f84485Q7), getString(Oo.b.f84475P7)) : C16796C.a(cVar.e(), cVar.c());
        Object a11 = a10.a();
        C17542s.i(a11, "component1(...)");
        String str = (String) a11;
        Object b10 = a10.b();
        C17542s.i(b10, "component2(...)");
        String str2 = (String) b10;
        List c10 = C16877v.c();
        if (z10) {
            c10.add(new C10971k(str, str2));
        } else {
            c10.add(new C10967g(cVar.d(), str, str2, true));
        }
        a.c.C1636a f10 = cVar.f();
        if (f10 != null) {
            c10.add(new J(f10));
        }
        List a12 = C16877v.a(c10);
        S0().f110039e.setVisibility(8);
        int i10 = X0().U().getValue().i() ? Ez.f.f109686Z : Oo.b.f84767r2;
        MaterialButton materialButton = S0().f110038d;
        materialButton.setVisibility(0);
        materialButton.setText(getString(i10));
        materialButton.setOnClickListener(new Ui.b(z10, this));
        Lg.d dVar2 = this.f91170A0;
        if (dVar2 == null) {
            C17542s.z("delegatingAdapter");
            dVar = null;
        } else {
            dVar = dVar2;
        }
        Lg.d.q(dVar, a12, false, (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final void b1(boolean z10, ScanAndGoCheckoutFragment scanAndGoCheckoutFragment, View view) {
        if (z10) {
            scanAndGoCheckoutFragment.X0().X(k.c.f.f88163a);
        } else {
            scanAndGoCheckoutFragment.X0().X(k.c.g.f88164a);
        }
    }

    private final void c1(a.d dVar) {
        Lg.d dVar2 = this.f91170A0;
        if (dVar2 == null) {
            C17542s.z("delegatingAdapter");
            dVar2 = null;
        }
        Lg.d.q(dVar2, C16877v.e(new C10965e(dVar.e(), dVar.c())), false, (C17642l) null, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void d1(C15007A a10, Kj.a aVar) {
        if (a10 == null || (aVar instanceof a.C1635a)) {
            S0().f110039e.setVisibility(8);
            Lg.d dVar = this.f91170A0;
            if (dVar == null) {
                C17542s.z("delegatingAdapter");
                dVar = null;
            }
            Lg.d.q(dVar, C16877v.e(X.f88531a), false, (C17642l) null, 6, (Object) null);
        } else if (C17542s.e(aVar, a.C1635a.f82779a)) {
        } else {
            if (aVar instanceof a.c) {
                a1((a.c) aVar, X0().U().getValue().i());
            } else if (aVar instanceof a.b) {
                Z0(((a.b) aVar).c());
            } else if (aVar instanceof a.d) {
                c1((a.d) aVar);
            } else if (C17542s.e(aVar, a.e.f82802a)) {
                k1(a10);
            } else {
                throw new t();
            }
        }
    }

    /* access modifiers changed from: private */
    public final void e1(k.e eVar) {
        k.e eVar2 = eVar;
        if (eVar2 != null) {
            X0().X(k.c.a.f88158a);
            if (C17542s.e(eVar2, k.e.a.f88174a)) {
                Y W02 = W0();
                FragmentManager parentFragmentManager = getParentFragmentManager();
                C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
                W02.c(parentFragmentManager);
            } else if (eVar2 instanceof k.e.c) {
                j V02 = V0();
                ConstraintLayout b10 = S0().getRoot();
                C17542s.i(b10, "getRoot(...)");
                String string = getString(Oo.b.f84526U8);
                C17542s.i(string, "getString(...)");
                j.a.s(V02, b10, string, getString(Ez.f.f109674N), -1, (View) null, (C17631a) null, (C17642l) null, 112, (Object) null);
            } else if (eVar2 instanceof k.e.d) {
                X0().X(k.c.C1846c.f88160a);
                j V03 = V0();
                Context requireContext = requireContext();
                String string2 = getString(Ez.f.f109668H);
                C17542s.i(string2, "getString(...)");
                j.a.k(V03, requireContext, string2, getString(Ez.f.f109667G), false, 0, new C10957a(this), (String) null, (C17631a) null, (C17631a) null, 464, (Object) null);
            } else if (C17542s.e(eVar2, k.e.C1847e.f88178a)) {
                Y W03 = W0();
                FragmentManager parentFragmentManager2 = getParentFragmentManager();
                C17542s.i(parentFragmentManager2, "getParentFragmentManager(...)");
                W03.i(parentFragmentManager2);
            } else if (eVar2 instanceof k.e.b) {
                j V04 = V0();
                ConstraintLayout b11 = S0().getRoot();
                C17542s.i(b11, "getRoot(...)");
                Snackbar s10 = j.a.s(V04, b11, ((k.e.b) eVar2).a(), (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 116, (Object) null);
                if (s10 != null) {
                    s10.b0();
                }
            } else {
                throw new t();
            }
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f1(ScanAndGoCheckoutFragment scanAndGoCheckoutFragment) {
        scanAndGoCheckoutFragment.X0().X(k.c.h.f88165a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void g1(k.f fVar) {
        if (fVar != null) {
            X0().X(k.c.b.f88159a);
            if (C17542s.e(fVar, k.f.a.f88179a)) {
                rw.d.a(this, a.C2810a.b.f114046a, "FRAGMENT_REQUEST_KEY_CHECKOUT_RESULT");
                androidx.navigation.fragment.a.a(this).k0();
            } else if (fVar instanceof k.f.b) {
                p1(((k.f.b) fVar).a());
            } else if (fVar instanceof k.f.c) {
                j V02 = V0();
                ConstraintLayout b10 = S0().getRoot();
                C17542s.i(b10, "getRoot(...)");
                Snackbar s10 = j.a.s(V02, b10, ((k.f.c) fVar).a(), (String) null, 0, (View) null, (C17631a) null, (C17642l) null, 116, (Object) null);
                if (s10 != null) {
                    s10.b0();
                }
            } else if (C17542s.e(fVar, k.f.e.f88183a)) {
                C8951o f10 = rw.f.f(this, U0(), (C17642l) null, 2, (Object) null);
                if (f10 != null) {
                    Y0().a(f10, rw.c.f28698a.c().a());
                }
            } else if (C17542s.e(fVar, k.f.d.f88182a)) {
                androidx.navigation.fragment.a.a(this).k0();
            } else {
                throw new t();
            }
        }
    }

    private final void h1() {
        C16519P<k.d> U10 = X0().U();
        r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        C16532g<k.d> R10 = C16534i.R(C5208k.a(U10, lifecycle, r.b.STARTED), new a(this, (C17164e<? super a>) null));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    private final void i1() {
        C11136e T02 = T0();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        T02.a(parentFragmentManager, this, new Ui.c(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N j1(ScanAndGoCheckoutFragment scanAndGoCheckoutFragment) {
        scanAndGoCheckoutFragment.X0().X(k.c.h.f88165a);
        return C16807N.f139792a;
    }

    private final void k1(C15007A a10) {
        A S02 = S0();
        S02.f110039e.setVisibility(0);
        S02.f110044j.setText(a10.h());
        S02.f110043i.setText(a10.i());
        S02.f110047m.setText(a10.j());
        S02.f110046l.setText(a10.k());
        Lg.d dVar = this.f91170A0;
        if (dVar == null) {
            C17542s.z("delegatingAdapter");
            dVar = null;
        }
        Lg.d.q(dVar, C16877v.e(new C10967g(a10.e(), a10.g(), a10.a(), false)), false, (C17642l) null, 4, (Object) null);
    }

    private final void l1() {
        A S02 = S0();
        S02.f110040f.setOnClickListener(new Ui.d(this));
        ImageButton imageButton = S02.f110042h;
        C17542s.g(imageButton);
        imageButton.setVisibility(8);
        imageButton.setOnClickListener(new Ui.e(this));
        b(new Ui.f(S02));
    }

    /* access modifiers changed from: private */
    public static final void m1(ScanAndGoCheckoutFragment scanAndGoCheckoutFragment, View view) {
        scanAndGoCheckoutFragment.X0().X(k.c.e.f88162a);
    }

    /* access modifiers changed from: private */
    public static final void n1(ScanAndGoCheckoutFragment scanAndGoCheckoutFragment, View view) {
        scanAndGoCheckoutFragment.X0().X(k.c.i.f88166a);
    }

    /* access modifiers changed from: private */
    public static final C16807N o1(A a10, q qVar) {
        C17542s.j(qVar, "$this$systemUi");
        ImageButton imageButton = a10.f110040f;
        C17542s.i(imageButton, "closeImage");
        C14617d dVar = C14617d.Margin;
        qVar.e(imageButton, dVar);
        ImageButton imageButton2 = a10.f110042h;
        C17542s.i(imageButton2, "ikeaFamilyCard");
        qVar.e(imageButton2, dVar);
        return C16807N.f139792a;
    }

    private final void p1(boolean z10) {
        C11136e T02 = T0();
        FragmentManager parentFragmentManager = getParentFragmentManager();
        C17542s.i(parentFragmentManager, "getParentFragmentManager(...)");
        T02.b(parentFragmentManager, z10);
    }

    public final C12190a R0() {
        C12190a aVar = this.f91175U;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("barcode");
        return null;
    }

    public final C11136e T0() {
        C11136e eVar = this.f91177Y;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("closeOrderConfirmationNavigation");
        return null;
    }

    public String U0() {
        return this.f91172R;
    }

    public final j V0() {
        j jVar = this.f91174T;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public final Y W0() {
        Y y10 = this.f91178Z;
        if (y10 != null) {
            return y10;
        }
        C17542s.z("scanAndGoNavigation");
        return null;
    }

    public final C13183a Y0() {
        C13183a aVar = this.f91176X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("walletNavigation");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requireActivity().getOnBackPressedDispatcher().i(this, new b(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        A c10 = A.c(layoutInflater);
        this.f91180z0 = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        super.onDestroyView();
        requireActivity().setRequestedOrientation(-1);
    }

    public void onPause() {
        super.onPause();
        requireActivity().getWindow().getAttributes().screenBrightness = this.f91171B0;
    }

    public void onResume() {
        super.onResume();
        WindowManager.LayoutParams attributes = requireActivity().getWindow().getAttributes();
        this.f91171B0 = attributes.screenBrightness;
        attributes.screenBrightness = 1.0f;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        k X02 = X0();
        r lifecycle = getLifecycle();
        C17542s.i(lifecycle, "<get-lifecycle>(...)");
        X02.X(new k.c.d(lifecycle));
        l1();
        i1();
        Q0();
        h1();
        requireActivity().setRequestedOrientation(1);
    }
}
