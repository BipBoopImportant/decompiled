package com.google.android.material.datepicker;

import androidx.fragment.app.C5187o;
import java.util.LinkedHashSet;

abstract class u<S> extends C5187o {

    /* renamed from: D  reason: collision with root package name */
    protected final LinkedHashSet<t<S>> f66658D = new LinkedHashSet<>();

    u() {
    }

    /* access modifiers changed from: package-private */
    public void m0() {
        this.f66658D.clear();
    }

    /* access modifiers changed from: package-private */
    public boolean q(t<S> tVar) {
        return this.f66658D.add(tVar);
    }
}
