package androidx.camera.view;

import C.G0;
import androidx.camera.view.PreviewView;

public final /* synthetic */ class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ PreviewView.a f17206a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ G0 f17207b;

    public /* synthetic */ n(PreviewView.a aVar, G0 g02) {
        this.f17206a = aVar;
        this.f17207b = g02;
    }

    public final void run() {
        this.f17206a.e(this.f17207b);
    }
}
