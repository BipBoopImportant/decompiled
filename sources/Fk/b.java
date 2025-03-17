package Fk;

import Ae.e;
import Ae.j;
import XH.C16796C;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"LFk/b;", "LFk/a;", "LAe/e;", "analytics", "<init>", "(LAe/e;)V", "LGh/b;", "", "", "d", "(LGh/b;)Ljava/util/Map;", "feature", "LXH/N;", "c", "(LGh/b;)V", "item", "", "index", "a", "(LGh/b;I)V", "b", "LAe/e;", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: b  reason: collision with root package name */
    private static final a f80890b = new a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f80891c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final e f80892a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LFk/b$a;", "", "<init>", "()V", "", "COMPONENT_GALLERY", "Ljava/lang/String;", "COMPONENT_MAYBE_LATER_BUTTON", "APP_LOCATION", "INTERACTION_PARAMETER_INDEX", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public b(e eVar) {
        C17542s.j(eVar, "analytics");
        this.f80892a = eVar;
    }

    private final Map<String, String> d(Gh.b bVar) {
        return X.m(C16796C.a("component_value", bVar.a()), C16796C.a("type", bVar.g() != null ? "video" : "image"));
    }

    public void a(Gh.b bVar, int i10) {
        C17542s.j(bVar, "item");
        this.f80892a.track(j.ACTION_TAP.b(), X.s(X.m(C16796C.a("app_location", "fte"), C16796C.a("component", Interaction$Component.LOGIN_BUTTON.getValue()), C16796C.a("index", Integer.valueOf(i10))), d(bVar)));
    }

    public void b(Gh.b bVar, int i10) {
        C17542s.j(bVar, "item");
        this.f80892a.track(j.ACTION_TAP.b(), X.s(X.m(C16796C.a("app_location", "fte"), C16796C.a("component", "maybe_later"), C16796C.a("index", Integer.valueOf(i10))), d(bVar)));
    }

    public void c(Gh.b bVar) {
        C17542s.j(bVar, "feature");
        this.f80892a.track(j.ACTION_VIEWED.b(), X.s(X.m(C16796C.a("app_location", "fte"), C16796C.a("component", "gallery")), d(bVar)));
    }
}
