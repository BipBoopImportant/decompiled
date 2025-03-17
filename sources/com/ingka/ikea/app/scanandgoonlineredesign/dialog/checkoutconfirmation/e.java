package com.ingka.ikea.app.scanandgoonlineredesign.dialog.checkoutconfirmation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.i0;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import fH.C17219a;
import iH.C17354a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;
import qj.h;

abstract class e extends BottomSheetDialogFragment implements C17600c {

    /* renamed from: E  reason: collision with root package name */
    private ContextWrapper f91418E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f91419F;

    /* renamed from: G  reason: collision with root package name */
    private volatile C17410g f91420G;

    /* renamed from: H  reason: collision with root package name */
    private final Object f91421H = new Object();

    /* renamed from: I  reason: collision with root package name */
    private boolean f91422I = false;

    e() {
    }

    private void s0() {
        if (this.f91418E == null) {
            this.f91418E = C17410g.b(super.getContext(), this);
            this.f91419F = C17219a.a(super.getContext());
        }
    }

    public final Object g0() {
        return q0().g0();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f91419F) {
            return null;
        }
        s0();
        return this.f91418E;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        return C17354a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        s0();
        t0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C17410g.c(onGetLayoutInflater, this));
    }

    public final C17410g q0() {
        if (this.f91420G == null) {
            synchronized (this.f91421H) {
                try {
                    if (this.f91420G == null) {
                        this.f91420G = r0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f91420G;
    }

    /* access modifiers changed from: protected */
    public C17410g r0() {
        return new C17410g(this);
    }

    /* access modifiers changed from: protected */
    public void t0() {
        if (!this.f91422I) {
            this.f91422I = true;
            ((h) g0()).x1((CheckoutConfirmationDialog) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f91418E;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        t0();
    }
}
