package com.sugarcube.app.base.ui.hybrid;

import QE.L;
import android.view.View;

/* renamed from: com.sugarcube.app.base.ui.hybrid.b0  reason: case insensitive filesystem */
public final /* synthetic */ class C14250b0 implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L f125014a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ HybridPreviewFragment f125015b;

    public /* synthetic */ C14250b0(L l10, HybridPreviewFragment hybridPreviewFragment) {
        this.f125014a = l10;
        this.f125015b = hybridPreviewFragment;
    }

    public final void onClick(View view) {
        HybridPreviewFragment.D0(this.f125014a, this.f125015b, view);
    }
}
