package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityManager;

/* renamed from: androidx.compose.ui.platform.t  reason: case insensitive filesystem */
public final /* synthetic */ class C5132t implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5136v f19587a;

    public /* synthetic */ C5132t(C5136v vVar) {
        this.f19587a = vVar;
    }

    public final void onTouchExplorationStateChanged(boolean z10) {
        C5136v.c1(this.f19587a, z10);
    }
}
