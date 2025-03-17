package Mk;

import Ae.e;
import Ae.j;
import Mk.a;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"LMk/b;", "LMk/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LMk/a$a;", "state", "LXH/N;", "a", "(LMk/a$a;)V", "LAe/e;", "getAnalytics", "()LAe/e;", "b", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f83435b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f83436c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f83437a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMk/b$a;", "", "<init>", "()V", "", "APP_LOCATION", "Ljava/lang/String;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f83437a = eVar;
    }

    public void a(a.C1671a aVar) {
        C17542s.j(aVar, "state");
        this.f83437a.track(j.ACTION_TAP.b(), X.m(C16796C.a("app_location", "fte"), C16796C.a("component", Interaction$Component.INBOX_NOTIFICATION_CONSENT.getValue()), C16796C.a("component_value", aVar.b())));
    }
}
