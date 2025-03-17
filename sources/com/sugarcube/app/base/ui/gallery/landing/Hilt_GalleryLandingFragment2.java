package com.sugarcube.app.base.ui.gallery.landing;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.lifecycle.i0;
import com.sugarcube.app.base.ui.BaseFragment;
import fH.C17219a;
import iH.C17354a;
import jH.C17410g;
import mH.C17600c;
import mH.C17601d;
import mH.C17602e;

public abstract class Hilt_GalleryLandingFragment2 extends BaseFragment implements C17600c {

    /* renamed from: J  reason: collision with root package name */
    private ContextWrapper f124448J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f124449K;

    /* renamed from: L  reason: collision with root package name */
    private volatile C17410g f124450L;

    /* renamed from: M  reason: collision with root package name */
    private final Object f124451M = new Object();

    /* renamed from: N  reason: collision with root package name */
    private boolean f124452N = false;

    private void t0() {
        if (this.f124448J == null) {
            this.f124448J = C17410g.b(super.getContext(), this);
            this.f124449K = C17219a.a(super.getContext());
        }
    }

    public final Object g0() {
        return r0().g0();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f124449K) {
            return null;
        }
        t0();
        return this.f124448J;
    }

    public i0.c getDefaultViewModelProviderFactory() {
        return C17354a.b(this, super.getDefaultViewModelProviderFactory());
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        t0();
        u0();
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        return onGetLayoutInflater.cloneInContext(C17410g.c(onGetLayoutInflater, this));
    }

    public final C17410g r0() {
        if (this.f124450L == null) {
            synchronized (this.f124451M) {
                try {
                    if (this.f124450L == null) {
                        this.f124450L = s0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f124450L;
    }

    /* access modifiers changed from: protected */
    public C17410g s0() {
        return new C17410g(this);
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f124452N) {
            this.f124452N = true;
            ((GalleryLandingFragment2_GeneratedInjector) g0()).injectGalleryLandingFragment2((GalleryLandingFragment2) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f124448J;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t0();
        u0();
    }
}
