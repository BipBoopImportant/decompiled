package a9;

import kotlin.jvm.internal.C17542s;

public final class T1 implements W2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f42285a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42286b;

    public T1(W2 w22, String str) {
        C17542s.j(w22, "descriptor");
        C17542s.j(str, "eventWebViewTargetPath");
        this.f42285a = w22.b();
        this.f42286b = w22.a() + "|webview|" + str;
    }

    public final String a() {
        return this.f42286b;
    }

    public final String b() {
        return this.f42285a;
    }
}
