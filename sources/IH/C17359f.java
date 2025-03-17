package iH;

import dH.C17157a;
import dH.C17159c;
import gH.C17266b;
import java.util.HashSet;
import java.util.Set;
import lH.C17552b;

/* renamed from: iH.f  reason: case insensitive filesystem */
public final class C17359f implements C17157a, C17159c {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C17552b.a> f143494a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private boolean f143495b = false;

    private void c() {
        if (this.f143495b) {
            throw new IllegalStateException("There was a race between the call to add/remove an OnClearedListener and onCleared(). This can happen when posting to the Main thread from a background thread, which is not supported.");
        }
    }

    public void a(C17552b.a aVar) {
        C17266b.a();
        c();
        this.f143494a.add(aVar);
    }

    public void b() {
        C17266b.a();
        this.f143495b = true;
        for (C17552b.a a10 : this.f143494a) {
            a10.a();
        }
    }
}
