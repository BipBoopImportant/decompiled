package com.sugarcube.app.base.ui.gallery;

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

abstract class f extends BaseFragment implements C17600c {

    /* renamed from: J  reason: collision with root package name */
    private ContextWrapper f124404J;

    /* renamed from: K  reason: collision with root package name */
    private boolean f124405K;

    /* renamed from: L  reason: collision with root package name */
    private volatile C17410g f124406L;

    /* renamed from: M  reason: collision with root package name */
    private final Object f124407M = new Object();

    /* renamed from: N  reason: collision with root package name */
    private boolean f124408N = false;

    f() {
    }

    private void t0() {
        if (this.f124404J == null) {
            this.f124404J = C17410g.b(super.getContext(), this);
            this.f124405K = C17219a.a(super.getContext());
        }
    }

    public final Object g0() {
        return r0().g0();
    }

    public Context getContext() {
        if (super.getContext() == null && !this.f124405K) {
            return null;
        }
        t0();
        return this.f124404J;
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
        if (this.f124406L == null) {
            synchronized (this.f124407M) {
                try {
                    if (this.f124406L == null) {
                        this.f124406L = s0();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f124406L;
    }

    /* access modifiers changed from: protected */
    public C17410g s0() {
        return new C17410g(this);
    }

    /* access modifiers changed from: protected */
    public void u0() {
        if (!this.f124408N) {
            this.f124408N = true;
            ((GalleryHomeContentFragment_GeneratedInjector) g0()).injectGalleryHomeContentFragment((GalleryHomeContentFragment) C17602e.a(this));
        }
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ContextWrapper contextWrapper = this.f124404J;
        C17601d.d(contextWrapper == null || C17410g.d(contextWrapper) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        t0();
        u0();
    }
}
