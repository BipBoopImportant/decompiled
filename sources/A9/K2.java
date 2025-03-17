package a9;

import android.view.View;

public final class K2 {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f42096a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f42097b;

    /* renamed from: c  reason: collision with root package name */
    public final View f42098c;

    public K2(View view, boolean z10) {
        this.f42096a = z10;
        if (z10) {
            this.f42097b = false;
        } else {
            this.f42097b = true;
            view = null;
        }
        this.f42098c = view;
    }
}
