package se;

import Ae.e;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pe.C10137a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\n¨\u0006\u000b"}, d2 = {"Lse/a;", "Lpe/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LXH/N;", "a", "()V", "b", "LAe/e;", "alertmessaging-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: se.a  reason: case insensitive filesystem */
public final class C10239a implements C10137a {

    /* renamed from: a  reason: collision with root package name */
    private final e f76532a;

    public C10239a(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f76532a = eVar;
    }

    public void a() {
        this.f76532a.o((Map<String, ? extends Object>) null, Interaction$Component.ALERT_MESSAGE_BOTTOM_SHEET);
    }

    public void b() {
        e.c.b(this.f76532a, Interaction$Component.ALERT_MESSAGE_ENTRY_POINT, (String) null, (Map) null, (e.b) null, 14, (Object) null);
    }
}
