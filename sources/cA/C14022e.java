package cA;

import Ae.e;
import XH.C16796C;
import YH.X;
import aA.C13910b;
import cA.C14021d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"LcA/e;", "LcA/d;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LcA/d$a;", "event", "", "", "", "values", "LXH/N;", "f", "(LcA/d$a;Ljava/util/Map;)V", "reasonCode", "g", "(LcA/d$a;Ljava/lang/String;)V", "LaA/b;", "userState", "a", "(LaA/b;)V", "LAe/e;", "getAnalytics", "()LAe/e;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cA.e  reason: case insensitive filesystem */
public final class C14022e implements C14021d {

    /* renamed from: a  reason: collision with root package name */
    private final e f119033a;

    public C14022e(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f119033a = eVar;
    }

    public void a(C13910b bVar) {
        C17542s.j(bVar, "userState");
        this.f119033a.c(this.f119033a.h().i(bVar.b()).g());
    }

    /* renamed from: f */
    public void b(C14021d.a aVar, Map<String, ? extends Object> map) {
        C17542s.j(aVar, "event");
        this.f119033a.track(aVar.b(), map);
    }

    /* renamed from: g */
    public void e(C14021d.a aVar, String str) {
        C17542s.j(aVar, "event");
        C17542s.j(str, "reasonCode");
        this.f119033a.track(aVar.b(), X.f(C16796C.a("reason_code", str)));
    }
}
