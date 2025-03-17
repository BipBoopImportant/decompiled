package jh;

import Df.d;
import Fs.a;
import com.ingka.ikea.analytics.Interaction$Component;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import on.C11687b;
import x4.C;
import x4.C8951o;
import ye.C10473a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J'\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Ljh/a;", "LDf/d;", "LFs/a;", "inboxNavigation", "Lon/b;", "plpNavigation", "LZw/a;", "pipNavigation", "Lye/a;", "alertMessageNavigation", "<init>", "(LFs/a;Lon/b;LZw/a;Lye/a;)V", "Lx4/o;", "navController", "LXH/N;", "a", "(Lx4/o;)V", "", "id", "Lon/b$e;", "type", "Lcom/ingka/ikea/analytics/Interaction$Component;", "component", "c", "(Lx4/o;Ljava/lang/String;Lon/b$e;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "b", "itemNo", "sourceComponent", "g", "(Lx4/o;Ljava/lang/String;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "LFs/a;", "getInboxNavigation", "()LFs/a;", "Lon/b;", "getPlpNavigation", "()Lon/b;", "LZw/a;", "getPipNavigation", "()LZw/a;", "d", "Lye/a;", "getAlertMessageNavigation", "()Lye/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: jh.a  reason: case insensitive filesystem */
public final class C9920a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final a f74841a;

    /* renamed from: b  reason: collision with root package name */
    private final C11687b f74842b;

    /* renamed from: c  reason: collision with root package name */
    private final Zw.a f74843c;

    /* renamed from: d  reason: collision with root package name */
    private final C10473a f74844d;

    public C9920a(a aVar, C11687b bVar, Zw.a aVar2, C10473a aVar3) {
        C17542s.j(aVar, "inboxNavigation");
        C17542s.j(bVar, "plpNavigation");
        C17542s.j(aVar2, "pipNavigation");
        C17542s.j(aVar3, "alertMessageNavigation");
        this.f74841a = aVar;
        this.f74842b = bVar;
        this.f74843c = aVar2;
        this.f74844d = aVar3;
    }

    public void a(C8951o oVar) {
        C17542s.j(oVar, "navController");
        this.f74844d.a(oVar);
    }

    public void b(C8951o oVar) {
        C17542s.j(oVar, "navController");
        a.C1575a.a(this.f74841a, oVar, (C) null, 2, (Object) null);
    }

    public void c(C8951o oVar, String str, C11687b.e eVar, Interaction$Component interaction$Component) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "id");
        C17542s.j(eVar, "type");
        Interaction$Component interaction$Component2 = interaction$Component;
        C17542s.j(interaction$Component2, "component");
        C11687b bVar = this.f74842b;
        C11687b.C2346b.b(bVar, str, (String) null, eVar, interaction$Component2, oVar, (List) null, (List) null, (String) null, 226, (Object) null);
    }

    public void g(C8951o oVar, String str, Interaction$Component interaction$Component) {
        C17542s.j(oVar, "navController");
        C17542s.j(str, "itemNo");
        C17542s.j(interaction$Component, "sourceComponent");
        this.f74843c.a(oVar, str, interaction$Component);
    }
}
