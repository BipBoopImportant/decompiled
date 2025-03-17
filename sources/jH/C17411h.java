package jH;

import androidx.lifecycle.U;
import l3.a;

/* renamed from: jH.h  reason: case insensitive filesystem */
public final class C17411h {

    /* renamed from: a  reason: collision with root package name */
    private a f143962a;

    /* renamed from: b  reason: collision with root package name */
    private U f143963b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f143964c;

    C17411h(a aVar) {
        this.f143964c = aVar == null;
        this.f143962a = aVar;
    }

    public void a() {
        this.f143962a = null;
    }

    public boolean b() {
        return this.f143963b == null && this.f143962a == null;
    }

    public void c(a aVar) {
        if (this.f143963b == null) {
            this.f143962a = aVar;
        }
    }
}
