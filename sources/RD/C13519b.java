package RD;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\r"}, d2 = {"LRD/b;", "LRD/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LXH/N;", "a", "()V", "c", "d", "b", "LAe/e;", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: RD.b  reason: case insensitive filesystem */
public final class C13519b implements C13518a {

    /* renamed from: a  reason: collision with root package name */
    private final e f115400a;

    public C13519b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f115400a = eVar;
    }

    public void a() {
        this.f115400a.track(j.ACTION_VIEWED.b(), X.m(C16796C.a("component", "splash_promo"), C16796C.a("type", "fallback")));
    }

    public void b() {
        this.f115400a.track("action_dismissed", X.m(C16796C.a("component", "splash_promo"), C16796C.a("type", "user")));
    }

    public void c() {
        this.f115400a.track(j.ACTION_VIEWED.b(), X.m(C16796C.a("component", "splash_promo"), C16796C.a("type", "promo")));
    }

    public void d() {
        this.f115400a.track("action_dismissed", X.m(C16796C.a("component", "splash_promo"), C16796C.a("type", "timer")));
    }
}
