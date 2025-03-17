package com.sugarcube.app.base.ui.selection;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.C5187o;
import androidx.lifecycle.i0;
import fH.C17219a;
import iH.C17354a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_ScanOtherRoomTypesGuidanceFragment extends C5187o implements C17600c {

    /* renamed from: D  reason: collision with root package name */
    private ContextWrapper f125174D;

    /* renamed from: E  reason: collision with root package name */
    private boolean f125175E;

    /* renamed from: F  reason: collision with root package name */
    private volatile C17410g f125176F;

    /* renamed from: G  reason: collision with root package name */
    private final Object f125177G = new Object();

    /* renamed from: H  reason: collision with root package name */
    private boolean f125178H = false;

    Hilt_ScanOtherRoomTypesGuidanceFragment() {
    }

    private void o0() {
        if (this.f125174D == null) {
            this.f125174D = C17410g.b(super.getContext(), this);
            this.f125175E = C17219a.a(super.getContext());
        }
    }

    public final Object g0() {
        return m0().g0();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f125175E) {
            return null;
        }
        o0();
        return this.f125174D;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        return C17354a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public final C17410g m0() {
        if (this.f125176F == null) {
            synchronized (this.f125177G) {
                try {
                    if (this.f125176F == null) {
                        this.f125176F = n0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f125176F;
    }

    /* access modifiers changed from: protected */
    public C17410g n0() {
        return new C17410g(this);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        o0();
        q0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C17410g.c(onGetLayoutInflater, this));
    }

    /* access modifiers changed from: protected */
    public void q0() {
        if (!this.f125178H) {
            this.f125178H = true;
            ((ScanOtherRoomTypesGuidanceFragment_GeneratedInjector) g0()).injectScanOtherRoomTypesGuidanceFragment((ScanOtherRoomTypesGuidanceFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f125174D;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        o0();
        q0();
    }
}
