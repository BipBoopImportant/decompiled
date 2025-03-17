package a9;

import kotlin.jvm.internal.C17542s;

/* renamed from: a9.c2  reason: case insensitive filesystem */
public final class C6800c2 implements W2 {

    /* renamed from: a  reason: collision with root package name */
    public final String f42479a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42480b;

    public C6800c2(W2 w22, String str) {
        C17542s.j(w22, "descriptor");
        C17542s.j(str, "eventBridgeTargetPath");
        this.f42479a = w22.b();
        this.f42480b = w22.a() + "|flutter|" + str;
    }

    public final String a() {
        return this.f42480b;
    }

    public final String b() {
        return this.f42479a;
    }
}
