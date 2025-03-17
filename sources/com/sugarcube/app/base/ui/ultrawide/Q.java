package com.sugarcube.app.base.ui.ultrawide;

import android.view.View;
import kotlin.jvm.internal.K;

public final /* synthetic */ class Q implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ K f125405a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UltrawideDoneFragment f125406b;

    public /* synthetic */ Q(K k10, UltrawideDoneFragment ultrawideDoneFragment) {
        this.f125405a = k10;
        this.f125406b = ultrawideDoneFragment;
    }

    public final void onClick(View view) {
        UltrawideDoneFragment.P0(this.f125405a, this.f125406b, view);
    }
}
