package com.ingka.ikea.app.scanandgoonlineredesign.checkout.confirmationdialog;

import D2.d;
import Ez.f;
import Fz.k;
import Sy.a;
import XH.C16796C;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.C5197z;
import cj.C11132a;
import cj.C11133b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010$\u001a\u00020\u001e8BX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010'\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/checkout/confirmationdialog/CloseOrderConfirmationDialog;", "Lcom/ingka/ikea/core/android/fragments/BaseBottomSheetDialogFragment;", "<init>", "()V", "", "isConfirmed", "LXH/N;", "F0", "(Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroidx/constraintlayout/widget/ConstraintLayout;", "C0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "LSy/a;", "O", "LSy/a;", "z0", "()LSy/a;", "setAnalytics", "(LSy/a;)V", "analytics", "LFz/k;", "P", "LFz/k;", "_binding", "A0", "()LFz/k;", "binding", "B0", "()Z", "isPickupOrder", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CloseOrderConfirmationDialog extends a {

    /* renamed from: O  reason: collision with root package name */
    public a f91207O;

    /* renamed from: P  reason: collision with root package name */
    private k f91208P;

    private final k A0() {
        k kVar = this.f91208P;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final boolean B0() {
        return requireArguments().getBoolean("hasOrder");
    }

    /* access modifiers changed from: private */
    public static final void D0(CloseOrderConfirmationDialog closeOrderConfirmationDialog, View view) {
        if (closeOrderConfirmationDialog.B0()) {
            closeOrderConfirmationDialog.z0().w();
        }
        closeOrderConfirmationDialog.F0(true);
    }

    /* access modifiers changed from: private */
    public static final void E0(CloseOrderConfirmationDialog closeOrderConfirmationDialog, View view) {
        closeOrderConfirmationDialog.F0(false);
    }

    private final void F0(boolean z10) {
        C5197z.c(this, "fr_req_key_confirmed", d.b(C16796C.a("fr_bundle_key_conf_result", Boolean.valueOf(z10))));
        dismiss();
    }

    /* renamed from: C0 */
    public ConstraintLayout onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        k c10 = k.c(layoutInflater, viewGroup, false);
        this.f91208P = c10;
        ConstraintLayout b10 = c10.getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        k A02 = A0();
        if (B0()) {
            A02.f110145f.setText(f.f109719q);
            A02.f110142c.setText(f.f109715o);
            A02.f110144e.setText(f.f109717p);
        } else {
            A02.f110145f.setText(f.f109713n);
            A02.f110142c.setText(f.f109711m);
            A02.f110144e.setText(f.f109661A);
        }
        A02.f110144e.setOnClickListener(new C11132a(this));
        A02.f110141b.setOnClickListener(new C11133b(this));
        if (B0()) {
            z0().W();
        }
    }

    public final a z0() {
        a aVar = this.f91207O;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("analytics");
        return null;
    }
}
