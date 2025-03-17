package cA;

import Ae.d;
import Ae.e;
import Ae.h;
import Ae.m;
import Ae.n;
import Nd.c;
import XH.C16796C;
import YH.X;
import aA.C13910b;
import cA.C14021d;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ne.C10089a;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \u00132\u00020\u0001:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0014J\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"¨\u0006#"}, d2 = {"LcA/b;", "LcA/a;", "LAe/e;", "analytics", "Lne/a;", "adjustTracker", "LcA/d;", "sessionAnalytics", "LNd/c;", "abTesting", "<init>", "(LAe/e;Lne/a;LcA/d;LNd/c;)V", "LaA/b;", "userState", "", "clearUserId", "LXH/N;", "d", "(LaA/b;Z)V", "e", "()V", "", "reasonCode", "h", "(Ljava/lang/String;)V", "c", "a", "code", "g", "f", "b", "LAe/e;", "Lne/a;", "LcA/d;", "LNd/c;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: cA.b  reason: case insensitive filesystem */
public final class C14019b implements C14018a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f119025e = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final e f119026a;

    /* renamed from: b  reason: collision with root package name */
    private final C10089a f119027b;

    /* renamed from: c  reason: collision with root package name */
    private final C14021d f119028c;

    /* renamed from: d  reason: collision with root package name */
    private final c f119029d;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LcA/b$a;", "", "<init>", "()V", "", "SIGNUP_METHOD_DEFAULT", "Ljava/lang/String;", "usersession-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: cA.b$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C14019b(e eVar, C10089a aVar, C14021d dVar, c cVar) {
        C17542s.j(eVar, "analytics");
        C17542s.j(aVar, "adjustTracker");
        C17542s.j(dVar, "sessionAnalytics");
        C17542s.j(cVar, "abTesting");
        this.f119026a = eVar;
        this.f119027b = aVar;
        this.f119028c = dVar;
        this.f119029d = cVar;
    }

    public void a() {
        e.c.c(this.f119026a, m.LOGIN.b(), X.f(C16796C.a(n.METHOD.b(), "default")), Interaction$Component.LOGIN_BUTTON, (e.b) null, 8, (Object) null);
        this.f119027b.a(C14020c.f119030e);
        c.a.a(this.f119029d, "user_login", (Map) null, (Map) null, 6, (Object) null);
    }

    public void b(String str) {
        C17542s.j(str, "code");
        e.c.a(this.f119026a, m.SIGN_UP.b(), d.SYS_ERROR, str, (Map) null, 8, (Object) null);
    }

    public void c() {
        h.a.a(this.f119028c, C14021d.a.REFRESH_INVALID_CREDENTIALS, (Map) null, 2, (Object) null);
    }

    public void d(C13910b bVar, boolean z10) {
        C17542s.j(bVar, "userState");
        this.f119028c.a(bVar);
        if (z10) {
            this.f119026a.a((String) null);
        }
    }

    public void e() {
        h.a.a(this.f119028c, C14021d.a.REFRESH_SUCCESS, (Map) null, 2, (Object) null);
    }

    public void f() {
        e.c.c(this.f119026a, m.SIGN_UP.b(), X.f(C16796C.a(n.METHOD.b(), "default")), Interaction$Component.SIGN_UP_BUTTON, (e.b) null, 8, (Object) null);
    }

    public void g(String str) {
        C17542s.j(str, "code");
        e.c.a(this.f119026a, m.LOGIN.b(), d.SYS_ERROR, str, (Map) null, 8, (Object) null);
    }

    public void h(String str) {
        C17542s.j(str, "reasonCode");
        this.f119028c.e(C14021d.a.REFRESH_FAIL, str);
    }
}
