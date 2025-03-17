package androidx.media3.ui;

import android.view.View;
import androidx.media3.ui.PlayerControlView;

/* renamed from: androidx.media3.ui.c  reason: case insensitive filesystem */
public final /* synthetic */ class C6994c implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PlayerControlView.e f43327a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f43328b;

    public /* synthetic */ C6994c(PlayerControlView.e eVar, int i10) {
        this.f43327a = eVar;
        this.f43328b = i10;
    }

    public final void onClick(View view) {
        this.f43327a.e(this.f43328b, view);
    }
}
