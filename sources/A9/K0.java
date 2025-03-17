package a9;

import android.webkit.ValueCallback;
import nI.C17642l;

public final /* synthetic */ class K0 implements ValueCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ L0 f42093a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C17642l f42094b;

    public /* synthetic */ K0(L0 l02, C17642l lVar) {
        this.f42093a = l02;
        this.f42094b = lVar;
    }

    public final void onReceiveValue(Object obj) {
        L0.c(this.f42093a, this.f42094b, (String) obj);
    }
}
