package androidx.media3.ui;

import android.view.View;
import androidx.media3.ui.PlayerControlView;
import q3.E;
import q3.K;

public final /* synthetic */ class f implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerControlView.l f43331a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ E f43332b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ K f43333c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ PlayerControlView.k f43334d;

    public /* synthetic */ f(PlayerControlView.l lVar, E e10, K k10, PlayerControlView.k kVar) {
        this.f43331a = lVar;
        this.f43332b = e10;
        this.f43333c = k10;
        this.f43334d = kVar;
    }

    public final void onClick(View view) {
        this.f43331a.e(this.f43332b, this.f43333c, this.f43334d, view);
    }
}
