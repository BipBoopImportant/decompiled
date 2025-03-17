package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.s  reason: case insensitive filesystem */
public final /* synthetic */ class C5130s implements AccessibilityManager.AccessibilityStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5136v f19570a;

    public /* synthetic */ C5130s(C5136v vVar) {
        this.f19570a = vVar;
    }

    public final void onAccessibilityStateChanged(boolean z10) {
        C5136v.W(this.f19570a, z10);
    }
}
