package Dg;

import Ae.e;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"LDg/b;", "LDg/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "", "rating", "LXH/N;", "a", "(Lcom/ingka/ikea/analytics/Interaction$Component;I)V", "LAe/e;", "inappfeedback_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final e f59165a;

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f59165a = eVar;
    }

    public void a(Interaction$Component interaction$Component, int i10) {
        C17542s.j(interaction$Component, "component");
        e.c.b(this.f59165a, interaction$Component, (String) null, X.f(C16796C.a("component_value", Integer.valueOf(i10))), (e.b) null, 10, (Object) null);
    }
}
