package com.ingka.ikea.app.scanandgoonlineredesign.dialog;

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
import lj.C11545l;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_EmailCollectionBottomSheetDialog extends BottomSheetDialogFragment implements C17600c {

    /* renamed from: E  reason: collision with root package name */
    private ContextWrapper f91334E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f91335F;

    /* renamed from: G  reason: collision with root package name */
    private volatile C17410g f91336G;

    /* renamed from: H  reason: collision with root package name */
    private final Object f91337H = new Object();

    /* renamed from: I  reason: collision with root package name */
    private boolean f91338I = false;

    Hilt_EmailCollectionBottomSheetDialog() {
    }

    private void s0() {
        if (this.f91334E == null) {
            this.f91334E = C17410g.b(super.getContext(), this);
            this.f91335F = C17219a.a(super.getContext());
        }
    }

    public final Object g0() {
        return q0().g0();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f91335F) {
            return null;
        }
        s0();
        return this.f91334E;
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
        if (this.f91336G == null) {
            synchronized (this.f91337H) {
                try {
                    if (this.f91336G == null) {
                        this.f91336G = r0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f91336G;
    }

    /* access modifiers changed from: protected */
    public C17410g r0() {
        return new C17410g(this);
    }

    /* access modifiers changed from: protected */
    public void t0() {
        if (!this.f91338I) {
            this.f91338I = true;
            ((C11545l) g0()).i0((EmailCollectionBottomSheetDialog) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f91334E;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        s0();
        t0();
    }
}
