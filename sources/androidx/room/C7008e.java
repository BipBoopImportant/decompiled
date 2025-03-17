package androidx.room;

import Q4.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/e;", "LQ4/h$c;", "delegate", "Landroidx/room/c;", "autoCloser", "<init>", "(LQ4/h$c;Landroidx/room/c;)V", "LQ4/h$b;", "configuration", "Landroidx/room/d;", "b", "(LQ4/h$b;)Landroidx/room/d;", "a", "LQ4/h$c;", "Landroidx/room/c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.e  reason: case insensitive filesystem */
public final class C7008e implements h.c {

    /* renamed from: a  reason: collision with root package name */
    private final h.c f44303a;

    /* renamed from: b  reason: collision with root package name */
    private final C7006c f44304b;

    public C7008e(h.c cVar, C7006c cVar2) {
        C17542s.j(cVar, "delegate");
        C17542s.j(cVar2, "autoCloser");
        this.f44303a = cVar;
        this.f44304b = cVar2;
    }

    /* renamed from: b */
    public C7007d a(h.b bVar) {
        C17542s.j(bVar, "configuration");
        return new C7007d(this.f44303a.a(bVar), this.f44304b);
    }
}
