package a9;

import android.webkit.ValueCallback;
import nI.C17642l;

public final /* synthetic */ class J0 implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L0 f42078a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C17642l f42079b;

    public /* synthetic */ J0(L0 l02, C17642l lVar) {
        this.f42078a = l02;
        this.f42079b = lVar;
    }

    public final void onReceiveValue(Object obj) {
        L0.g(this.f42078a, this.f42079b, (String) obj);
    }
}
