package t5;

import java.util.UUID;
import l5.O;
import t5.C8809d;

/* renamed from: t5.c  reason: case insensitive filesystem */
public final /* synthetic */ class C8808c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ O f56609a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UUID f56610b;

    public /* synthetic */ C8808c(O o10, UUID uuid) {
        this.f56609a = o10;
        this.f56610b = uuid;
    }

    public final void run() {
        C8809d.a.b(this.f56609a, this.f56610b);
    }
}
