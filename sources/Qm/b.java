package Qm;

import Ae.e;
import XH.C16807N;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000b2\u00020\u0001:\u0001\u0007B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u000e"}, d2 = {"LQm/b;", "LQm/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LXH/N;", "a", "()V", "", "success", "b", "(Z)V", "LAe/e;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f86004b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f86005c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f86006a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LQm/b$a;", "", "<init>", "()V", "", "APP_LOCATION", "Ljava/lang/String;", "boka-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f86006a = eVar;
    }

    public void a() {
        e eVar = this.f86006a;
        Interaction$Component interaction$Component = Interaction$Component.BOOK_APPOINTMENT_CONTINUE;
        Map c10 = X.c();
        c10.put("app_location", "membership_space_overview");
        C16807N n10 = C16807N.f139792a;
        e.c.b(eVar, interaction$Component, (String) null, X.b(c10), (e.b) null, 10, (Object) null);
    }

    public void b(boolean z10) {
        e eVar = this.f86006a;
        Interaction$Component interaction$Component = z10 ? Interaction$Component.BOOK_APPOINTMENT_SUCCESS : Interaction$Component.BOOK_APPOINTMENT_CANCEL;
        Map c10 = X.c();
        c10.put("app_location", "membership_space_overview");
        C16807N n10 = C16807N.f139792a;
        e.c.b(eVar, interaction$Component, (String) null, X.b(c10), (e.b) null, 10, (Object) null);
    }
}
