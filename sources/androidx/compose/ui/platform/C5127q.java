package androidx.compose.ui.platform;

import androidx.compose.ui.platform.AndroidComposeView;
import nI.C17631a;

/* renamed from: androidx.compose.ui.platform.q  reason: case insensitive filesystem */
public final /* synthetic */ class C5127q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17631a f19557a;

    public /* synthetic */ C5127q(C17631a aVar) {
        this.f19557a = aVar;
    }

    public final void run() {
        AndroidComposeView.w.c(this.f19557a);
    }
}
