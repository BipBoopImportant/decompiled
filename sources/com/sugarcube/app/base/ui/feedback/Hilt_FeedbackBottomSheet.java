package com.sugarcube.app.base.ui.feedback;

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

public abstract class Hilt_FeedbackBottomSheet extends BottomSheetDialogFragment implements C17600c {

    /* renamed from: E  reason: collision with root package name */
    private ContextWrapper f124170E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f124171F;

    /* renamed from: G  reason: collision with root package name */
    private volatile C17410g f124172G;

    /* renamed from: H  reason: collision with root package name */
    private final Object f124173H = new Object();

    /* renamed from: I  reason: collision with root package name */
    private boolean f124174I = false;

    Hilt_FeedbackBottomSheet() {
    }

    private void s0() {
        if (this.f124170E == null) {
            this.f124170E = C17410g.b(super.getContext(), this);
            this.f124171F = C17219a.a(super.getContext());
        }
    }

    public final Object g0() {
        return q0().g0();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f124171F) {
            return null;
        }
        s0();
        return this.f124170E;
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
        if (this.f124172G == null) {
            synchronized (this.f124173H) {
                try {
                    if (this.f124172G == null) {
                        this.f124172G = r0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f124172G;
    }

    /* access modifiers changed from: protected */
    public C17410g r0() {
        return new C17410g(this);
    }

    /* access modifiers changed from: protected */
    public void t0() {
        if (!this.f124174I) {
            this.f124174I = true;
            ((FeedbackBottomSheet_GeneratedInjector) g0()).injectFeedbackBottomSheet((FeedbackBottomSheet) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f124170E;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        t0();
    }
}
