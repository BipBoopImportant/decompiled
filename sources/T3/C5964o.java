package t3;

import java.util.concurrent.CopyOnWriteArraySet;
import t3.p;

/* renamed from: t3.o  reason: case insensitive filesystem */
public final /* synthetic */ class C5964o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ CopyOnWriteArraySet f29522a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ int f29523b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ p.a f29524c;

    public /* synthetic */ C5964o(CopyOnWriteArraySet copyOnWriteArraySet, int i10, p.a aVar) {
        this.f29522a = copyOnWriteArraySet;
        this.f29523b = i10;
        this.f29524c = aVar;
    }

    public final void run() {
        p.h(this.f29522a, this.f29523b, this.f29524c);
    }
}
