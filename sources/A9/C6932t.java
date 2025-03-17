package a9;

import d9.G;
import kotlin.jvm.internal.C17542s;

/* renamed from: a9.t  reason: case insensitive filesystem */
public final class C6932t extends C6861k {

    /* renamed from: b  reason: collision with root package name */
    public final G.a f42857b;

    /* renamed from: c  reason: collision with root package name */
    public int f42858c;

    public C6932t(G.b bVar) {
        G.a n10 = G.n();
        C17542s.i(n10, "newBuilder()");
        System.currentTimeMillis();
        C17542s.j(n10, "payload");
        C17542s.j(bVar, "position");
        this.f42857b = n10;
        n10.H("1");
        n10.G(bVar);
    }

    public final byte[] a() {
        byte[] byteArray = ((G) this.f42857b.g()).toByteArray();
        C17542s.i(byteArray, "payload.build().toByteArray()");
        return byteArray;
    }
}
