package Gq;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uq.C12078d;
import uq.g;
import uq.h;
import vq.C12204c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LGq/c;", "Luq/d;", "Lvq/c;", "episodRepository", "Luq/h;", "episodLogger", "<init>", "(Lvq/c;Luq/h;)V", "Luq/g;", "event", "LXH/N;", "a", "(Luq/g;)V", "Lvq/c;", "b", "Luq/h;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class c implements C12078d {

    /* renamed from: a  reason: collision with root package name */
    private final C12204c f81191a;

    /* renamed from: b  reason: collision with root package name */
    private final h f81192b;

    public c(C12204c cVar, h hVar) {
        C17542s.j(cVar, "episodRepository");
        C17542s.j(hVar, "episodLogger");
        this.f81191a = cVar;
        this.f81192b = hVar;
    }

    public void a(g gVar) {
        C17542s.j(gVar, "event");
        h hVar = this.f81192b;
        String a10 = gVar.a();
        hVar.a("Tracking view item. " + a10);
        this.f81191a.b(gVar);
    }
}
