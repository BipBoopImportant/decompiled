package com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation;

import Fz.j;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import Vi.B;
import Vi.C;
import Vi.N;
import Vi.O;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import YH.C16877v;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
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
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.a;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.b;
import com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.c;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import qj.C11785a;
import qj.C11786b;
import qj.C11787c;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 ?2\u00020\u0001:\u0001@B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\u00062\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J+\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0006H\u0016¢\u0006\u0004\b#\u0010\u0003R+\u0010+\u001a\u0012\u0012\f\u0012\n &*\u0004\u0018\u00010%0%\u0018\u00010$8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0002¢\u0006\f\n\u0004\b5\u0010(\u001a\u0004\b6\u00107R\u0014\u0010;\u001a\u00020,8BX\u0004¢\u0006\u0006\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u0002008BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/CheckoutConfirmationDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "", "accepted", "LXH/N;", "M0", "(Z)V", "N0", "J0", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/b;", "content", "I0", "(Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/b;)V", "", "", "items", "U0", "(Ljava/util/List;)V", "L0", "S0", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/constraintlayout/widget/ConstraintLayout;", "K0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/widget/FrameLayout;", "kotlin.jvm.PlatformType", "J", "LXH/o;", "E0", "()Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "behavior", "LFz/j;", "K", "LFz/j;", "_binding", "LLg/d;", "L", "LLg/d;", "_delegatingAdapter", "Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/d;", "M", "H0", "()Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/d;", "viewModel", "F0", "()LFz/j;", "binding", "G0", "()LLg/d;", "delegatingAdapter", "N", "a", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CheckoutConfirmationDialog extends e {

    /* renamed from: N  reason: collision with root package name */
    public static final a f91379N = new a((DefaultConstructorMarker) null);

    /* renamed from: O  reason: collision with root package name */
    public static final int f91380O = 8;

    /* renamed from: J  reason: collision with root package name */
    private final C16824o f91381J = C16825p.b(new qj.g(this));

    /* renamed from: K  reason: collision with root package name */
    private j f91382K;

    /* renamed from: L  reason: collision with root package name */
    private Lg.d f91383L;

    /* renamed from: M  reason: collision with root package name */
    private final C16824o f91384M;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/dialog/checkoutconfirmation/CheckoutConfirmationDialog$a;", "", "<init>", "()V", "", "FRAGMENT_REQUEST_KEY_CONFIRMED", "Ljava/lang/String;", "BUNDLE_KEY_CONFIRMATION_RESULT", "TAG", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog$handleState$$inlined$collectOnStarted$1", f = "CheckoutConfirmationDialog.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements p<c, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91385c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91386d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckoutConfirmationDialog f91387e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C17164e eVar, CheckoutConfirmationDialog checkoutConfirmationDialog) {
            super(2, eVar);
            this.f91387e = checkoutConfirmationDialog;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(eVar, this.f91387e);
            bVar.f91386d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(c cVar, C17164e<? super C16807N> eVar) {
            return ((b) create(cVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z10;
            C17187b.f();
            if (this.f91385c == 0) {
                y.b(obj);
                c cVar = (c) this.f91386d;
                if (cVar != null) {
                    this.f91387e.H0().D(a.c.f91405a);
                    if (C17542s.e(cVar, c.a.f91412a)) {
                        z10 = true;
                    } else if (C17542s.e(cVar, c.b.f91413a)) {
                        z10 = false;
                    } else {
                        throw new t();
                    }
                    this.f91387e.M0(z10);
                    this.f91387e.dismiss();
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n"}, d2 = {"T", "state", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog$handleState$$inlined$collectOnStarted$2", f = "CheckoutConfirmationDialog.kt", l = {}, m = "invokeSuspend")
    public static final class c extends l implements p<C11785a, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91388c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91389d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ CheckoutConfirmationDialog f91390e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17164e eVar, CheckoutConfirmationDialog checkoutConfirmationDialog) {
            super(2, eVar);
            this.f91390e = checkoutConfirmationDialog;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(eVar, this.f91390e);
            cVar.f91389d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C11785a aVar, C17164e<? super C16807N> eVar) {
            return ((c) create(aVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91388c == 0) {
                y.b(obj);
                this.f91390e.I0(((C11785a) this.f91389d).c());
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "LTJ/g;", "LTJ/h;", "collector", "LXH/N;", "collect", "(LTJ/h;LdI/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements C16532g<c> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16532g f91391a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a<T> implements C16533h {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ C16533h f91392a;

            @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog$handleState$$inlined$map$1$2", f = "CheckoutConfirmationDialog.kt", l = {50}, m = "emit")
            /* renamed from: com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog$d$a$a  reason: collision with other inner class name */
            public static final class C2005a extends kotlin.coroutines.jvm.internal.d {

                /* renamed from: c  reason: collision with root package name */
                /* synthetic */ Object f91393c;

                /* renamed from: d  reason: collision with root package name */
                int f91394d;

                /* renamed from: e  reason: collision with root package name */
                final /* synthetic */ a f91395e;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C2005a(a aVar, C17164e eVar) {
                    super(eVar);
                    this.f91395e = aVar;
                }

                public final Object invokeSuspend(Object obj) {
                    this.f91393c = obj;
                    this.f91394d |= Integer.MIN_VALUE;
                    return this.f91395e.emit((Object) null, this);
                }
            }

            public a(C16533h hVar) {
                this.f91392a = hVar;
            }

            /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object emit(java.lang.Object r5, dI.C17164e r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog.d.a.C2005a
                    if (r0 == 0) goto L_0x0013
                    r0 = r6
                    com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog$d$a$a r0 = (com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog.d.a.C2005a) r0
                    int r1 = r0.f91394d
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L_0x0013
                    int r1 = r1 - r2
                    r0.f91394d = r1
                    goto L_0x0018
                L_0x0013:
                    com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog$d$a$a r0 = new com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog$d$a$a
                    r0.<init>(r4, r6)
                L_0x0018:
                    java.lang.Object r6 = r0.f91393c
                    java.lang.Object r1 = eI.C17187b.f()
                    int r2 = r0.f91394d
                    r3 = 1
                    if (r2 == 0) goto L_0x0031
                    if (r2 != r3) goto L_0x0029
                    XH.y.b(r6)
                    goto L_0x0045
                L_0x0029:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L_0x0031:
                    XH.y.b(r6)
                    TJ.h r6 = r4.f91392a
                    qj.a r5 = (qj.C11785a) r5
                    com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.c r5 = r5.d()
                    r0.f91394d = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L_0x0045
                    return r1
                L_0x0045:
                    XH.N r5 = XH.C16807N.f139792a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation.CheckoutConfirmationDialog.d.a.emit(java.lang.Object, dI.e):java.lang.Object");
            }
        }

        public d(C16532g gVar) {
            this.f91391a = gVar;
        }

        public Object collect(C16533h hVar, C17164e eVar) {
            Object collect = this.f91391a.collect(new a(hVar), eVar);
            return collect == C17187b.f() ? collect : C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91396c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C5187o oVar) {
            super(0);
            this.f91396c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91396c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91397c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar) {
            super(0);
            this.f91397c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91397c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91398c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C16824o oVar) {
            super(0);
            this.f91398c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91398c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91399c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91399c = aVar;
            this.f91400d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91399c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91400d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91401c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91402d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91401c = oVar;
            this.f91402d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91402d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91401c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public CheckoutConfirmationDialog() {
        C16824o a10 = C16825p.a(s.NONE, new f(new e(this)));
        this.f91384M = W.b(this, P.b(d.class), new g(a10), new h((C17631a) null, a10), new i(this, a10));
    }

    /* access modifiers changed from: private */
    public static final BottomSheetBehavior D0(CheckoutConfirmationDialog checkoutConfirmationDialog) {
        Dialog dialog = checkoutConfirmationDialog.getDialog();
        com.google.android.material.bottomsheet.a aVar = dialog instanceof com.google.android.material.bottomsheet.a ? (com.google.android.material.bottomsheet.a) dialog : null;
        if (aVar != null) {
            return aVar.o();
        }
        return null;
    }

    private final BottomSheetBehavior<FrameLayout> E0() {
        return (BottomSheetBehavior) this.f91381J.getValue();
    }

    private final j F0() {
        j jVar = this.f91382K;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final Lg.d G0() {
        Lg.d dVar = this.f91383L;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public final d H0() {
        return (d) this.f91384M.getValue();
    }

    /* access modifiers changed from: private */
    public final void I0(b bVar) {
        if (bVar instanceof b.a) {
            U0(C16877v.e(new C(false, ((b.a) bVar).a())));
        } else if (bVar instanceof b.C2007b) {
            U0(C16877v.e(new O(((b.C2007b) bVar).a())));
        } else if (bVar != null) {
            throw new t();
        }
    }

    private final void J0() {
        C16532g R10 = C16534i.R(C5208k.b(C16534i.s(new d(H0().getState())), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new b((C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        C16532g R11 = C16534i.R(C5208k.b(H0().getState(), getViewLifecycleOwner().getLifecycle(), (r.b) null, 2, (Object) null), new c((C17164e) null, this));
        C5221y viewLifecycleOwner2 = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C16534i.M(R11, C5222z.a(viewLifecycleOwner2));
    }

    private final void L0() {
        BottomSheetBehavior<FrameLayout> E02 = E0();
        if (E02 != null) {
            E02.W0(true);
        }
    }

    /* access modifiers changed from: private */
    public final void M0(boolean z10) {
        C5197z.c(this, "fr_req_key_acknowledge", D2.d.b(C16796C.a("fr_bundle_key_result", Boolean.valueOf(z10))));
    }

    private final void N0() {
        N n10 = new N(new C11786b(this), new C11787c(this), new qj.d(this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f91383L = new Lg.d((Lg.a<?>[]) new Lg.a[]{n10, new B(C5222z.a(viewLifecycleOwner), new qj.e(this))});
        RecyclerView recyclerView = F0().f110139c;
        recyclerView.setAdapter(G0());
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(CheckoutConfirmationDialog checkoutConfirmationDialog) {
        checkoutConfirmationDialog.H0().D(a.C2006a.f91403a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(CheckoutConfirmationDialog checkoutConfirmationDialog) {
        checkoutConfirmationDialog.H0().D(a.b.f91404a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(CheckoutConfirmationDialog checkoutConfirmationDialog) {
        checkoutConfirmationDialog.H0().D(a.d.f91406a);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(CheckoutConfirmationDialog checkoutConfirmationDialog, String str) {
        C17542s.j(str, "email");
        ConstraintLayout b10 = checkoutConfirmationDialog.F0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        jp.g.b(b10);
        checkoutConfirmationDialog.H0().D(new a.g(str));
        return C16807N.f139792a;
    }

    private final void S0() {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new qj.f(this));
        }
    }

    /* access modifiers changed from: private */
    public static final boolean T0(CheckoutConfirmationDialog checkoutConfirmationDialog, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i10 != 4) {
            return false;
        }
        checkoutConfirmationDialog.H0().D(a.e.f91407a);
        return true;
    }

    private final void U0(List<? extends Object> list) {
        Lg.d.q(G0(), list, true, (C17642l) null, 4, (Object) null);
        BottomSheetBehavior<FrameLayout> E02 = E0();
        if (E02 != null) {
            E02.X0(3);
        }
    }

    /* renamed from: K0 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        j c10 = j.c(layoutInflater, viewGroup, false);
        this.f91382K = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f91383L = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        N0();
        J0();
        L0();
        S0();
    }
}
