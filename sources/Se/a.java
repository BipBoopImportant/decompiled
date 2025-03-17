package Se;

import Ae.c;
import Ae.e;
import Ae.f;
import Ae.j;
import Ae.p;
import Ae.t;
import D2.d;
import HJ.C15854t;
import XH.C16796C;
import XH.v;
import YH.C16877v;
import YH.X;
import android.app.Activity;
import android.os.Bundle;
import com.ingka.ikea.analytics.Interaction$ContextComponent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0001\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n*\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\u00020\u000e2\u0018\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0 0\u0012H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010'\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010(J#\u0010*\u001a\u00020\u000e2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J/\u0010/\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\b/\u00100JK\u00104\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u00103\u001a\u0002022\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b4\u00105JA\u00106\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u00103\u001a\u0002022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b6\u00107JK\u00109\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u00010\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u00103\u001a\u0002022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b9\u0010:J7\u0010;\u001a\u00020\u000e2\u0006\u00101\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020\u000e2\u0016\u0010)\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b=\u0010>JC\u0010?\u001a\u00020\u000e2\u0006\u00103\u001a\u0002022\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b?\u0010@J/\u0010A\u001a\u00020\u000e2\u0006\u00103\u001a\u0002022\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\bA\u0010BJ\u0019\u0010D\u001a\u00020\u000e2\b\u0010C\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bD\u0010EJ7\u0010F\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\bF\u0010<JO\u0010H\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\b2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\b0\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u00103\u001a\u0002022\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nH\u0016¢\u0006\u0004\bH\u0010IJA\u0010J\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\n2\u0006\u00103\u001a\u0002022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\bJ\u00107J?\u0010O\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\b2\u0006\u0010M\u001a\u00020L2\b\u0010N\u001a\u0004\u0018\u00010\b2\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\nH\u0016¢\u0006\u0004\bO\u0010PR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010QR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010R¨\u0006S"}, d2 = {"LSe/a;", "LAe/e;", "LAe/f;", "analyticsEngine", "LBe/a;", "contentsquareTracker", "<init>", "(LAe/f;LBe/a;)V", "", "eventKey", "", "", "customParams", "componentName", "LXH/N;", "v", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V", "componentId", "", "itemIds", "listType", "listId", "LAe/e$b;", "contextParams", "s", "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;LAe/e$b;)Ljava/util/Map;", "r", "(Ljava/util/Map;LAe/e$b;)Ljava/util/Map;", "LAe/p;", "root", "p", "(LAe/p;)V", "LXH/v;", "userProperties", "c", "(Ljava/util/List;)V", "Landroid/app/Activity;", "activity", "viewName", "e", "(Landroid/app/Activity;Ljava/lang/String;)V", "values", "i", "(Ljava/util/Map;)V", "LAe/t;", "u", "()LAe/t;", "track", "(Ljava/lang/String;Ljava/util/Map;)V", "itemId", "LDe/a;", "component", "n", "(Ljava/lang/String;Ljava/util/Map;LDe/a;Ljava/lang/String;LAe/e$b;)V", "f", "(Ljava/lang/String;Ljava/util/Map;LDe/a;LAe/e$b;)V", "itemListType", "m", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;LDe/a;LAe/e$b;)V", "l", "(Ljava/lang/String;Ljava/util/Map;LDe/a;)V", "o", "(Ljava/util/Map;LDe/a;)V", "j", "(LDe/a;Ljava/lang/String;Ljava/util/Map;LAe/e$b;)V", "k", "(LDe/a;Ljava/util/Map;)V", "icmId", "a", "(Ljava/lang/String;)V", "b", "itemNos", "d", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;LDe/a;Ljava/util/Map;)V", "g", "name", "LAe/d;", "type", "code", "q", "(Ljava/lang/String;LAe/d;Ljava/lang/String;Ljava/util/Map;)V", "LAe/f;", "LBe/a;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements e {

    /* renamed from: b  reason: collision with root package name */
    private final f f63388b;

    /* renamed from: c  reason: collision with root package name */
    private final Be.a f63389c;

    public a(f fVar, Be.a aVar) {
        C17542s.j(fVar, "analyticsEngine");
        C17542s.j(aVar, "contentsquareTracker");
        this.f63388b = fVar;
        this.f63389c = aVar;
    }

    private final Map<String, Object> r(Map<String, ? extends Object> map, e.b bVar) {
        Map<String, Object> map2;
        if (map == null || (map2 = X.z(map)) == null) {
            map2 = new LinkedHashMap<>();
        }
        String c10 = bVar.c();
        if (c10 != null) {
            map2.put("context_screen", c10);
        }
        String d10 = bVar.d();
        if (d10 != null) {
            map2.put("context_screen_id", d10);
        }
        String e10 = bVar.e();
        if (e10 != null) {
            map2.put("context_screen_type", e10);
        }
        Interaction$ContextComponent a10 = bVar.a();
        if (a10 != null) {
            map2.put("context_component", a10.getValue());
        }
        String b10 = bVar.b();
        if (b10 != null) {
            map2.put("context_component_id", b10);
        }
        return map2;
    }

    private final Map<String, Object> s(Map<String, ? extends Object> map, String str, String str2, List<String> list, String str3, String str4, e.b bVar) {
        Map c10 = X.c();
        if (map != null) {
            c10.putAll(map);
        }
        if (str != null) {
            c10.put("component", str);
        }
        if (str2 != null) {
            c10.put("component_id", str2);
        }
        if (list != null) {
            Iterable<String> iterable = list;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (String a10 : iterable) {
                arrayList.add(d.b(C16796C.a("item_id", a10)));
            }
            c10.put("items", (Bundle[]) arrayList.toArray(new Bundle[0]));
        }
        if (str3 != null) {
            c10.put("item_list_type", str3);
        }
        if (str4 != null) {
            c10.put("item_list_id", str4);
        }
        if (bVar != null) {
            c10.putAll(r(c10, bVar));
        }
        return X.b(c10);
    }

    static /* synthetic */ Map t(a aVar, Map map, String str, String str2, List list, String str3, String str4, e.b bVar, int i10, Object obj) {
        e.b bVar2 = null;
        String str5 = (i10 & 2) != 0 ? null : str;
        String str6 = (i10 & 4) != 0 ? null : str2;
        List list2 = (i10 & 8) != 0 ? null : list;
        String str7 = (i10 & 16) != 0 ? null : str3;
        String str8 = (i10 & 32) != 0 ? null : str4;
        if ((i10 & 64) == 0) {
            bVar2 = bVar;
        }
        return aVar.s(map, str5, str6, list2, str7, str8, bVar2);
    }

    private final void v(String str, Map<String, ? extends Object> map, String str2) {
        track(str, t(this, map, str2, (String) null, (List) null, (String) null, (String) null, (e.b) null, 124, (Object) null));
    }

    public void a(String str) {
        this.f63388b.a(str);
    }

    public void b(String str, Map<String, ? extends Object> map, De.a aVar) {
        C17542s.j(str, "listId");
        C17542s.j(aVar, "component");
        v("view_item_list", t(this, map, (String) null, (String) null, (List) null, (String) null, str, (e.b) null, 94, (Object) null), aVar.getValue());
    }

    public void c(List<v<String, String>> list) {
        C17542s.j(list, "userProperties");
        this.f63388b.c(list);
        this.f63389c.c(list);
    }

    public void d(String str, List<String> list, String str2, De.a aVar, Map<String, ? extends Object> map) {
        C17542s.j(str, "listId");
        C17542s.j(list, "itemNos");
        C17542s.j(aVar, "component");
        Map<String, ? extends Object> map2 = map;
        v("view_item_list", t(this, map2, (String) null, (String) null, list, str2, str, (e.b) null, 70, (Object) null), aVar.getValue());
    }

    public void e(Activity activity, String str) {
        C17542s.j(str, "viewName");
        this.f63388b.e(activity, str);
        if (!C15854t.v0(str)) {
            this.f63389c.a(str);
        }
    }

    public void f(String str, Map<String, ? extends Object> map, De.a aVar, e.b bVar) {
        C17542s.j(str, "componentId");
        C17542s.j(aVar, "component");
        track("select_item", t(this, map, aVar.getValue(), str, (List) null, (String) null, (String) null, bVar, 56, (Object) null));
    }

    public void g(String str, Map<String, ? extends Object> map, De.a aVar, e.b bVar) {
        C17542s.j(str, "eventKey");
        C17542s.j(aVar, "component");
        String value = aVar.getValue();
        if (map == null) {
            map = X.j();
        }
        v(str, t(this, map, (String) null, (String) null, (List) null, (String) null, (String) null, bVar, 62, (Object) null), value);
    }

    public void i(Map<String, ? extends Object> map) {
        C17542s.j(map, "values");
        this.f63388b.i(map);
    }

    public void j(De.a aVar, String str, Map<String, ? extends Object> map, e.b bVar) {
        C17542s.j(aVar, "component");
        v(j.ACTION_TAP.b(), t(this, map, (String) null, str, (List) null, (String) null, (String) null, bVar, 58, (Object) null), aVar.getValue());
    }

    public void k(De.a aVar, Map<String, ? extends Object> map) {
        C17542s.j(aVar, "component");
        String b10 = j.ACTION_TRIGGERED.b();
        if (map == null) {
            map = X.j();
        }
        v(b10, map, aVar.getValue());
    }

    public void l(String str, Map<String, ? extends Object> map, De.a aVar) {
        C17542s.j(str, "itemId");
        C17542s.j(aVar, "component");
        v("view_item", t(this, map, (String) null, (String) null, C16877v.e(str), (String) null, (String) null, (e.b) null, 118, (Object) null), aVar.getValue());
    }

    public void m(String str, String str2, Map<String, ? extends Object> map, De.a aVar, e.b bVar) {
        C17542s.j(str, "listId");
        C17542s.j(aVar, "component");
        v("select_item", t(this, map, (String) null, (String) null, (List) null, str2, str, bVar, 14, (Object) null), aVar.getValue());
    }

    public void n(String str, Map<String, ? extends Object> map, De.a aVar, String str2, e.b bVar) {
        String str3 = str;
        C17542s.j(str, "itemId");
        C17542s.j(aVar, "component");
        v("select_item", t(this, map, (String) null, str2, C16877v.e(str), (String) null, (String) null, bVar, 50, (Object) null), aVar.getValue());
    }

    public void o(Map<String, ? extends Object> map, De.a aVar) {
        C17542s.j(aVar, "component");
        String b10 = j.ACTION_VIEWED.b();
        if (map == null) {
            map = X.j();
        }
        v(b10, map, aVar.getValue());
    }

    public void p(p pVar) {
        C17542s.j(pVar, "root");
        i(X.f(C16796C.a("root", pVar.j())));
    }

    public void q(String str, Ae.d dVar, String str2, Map<String, String> map) {
        C17542s.j(str, "name");
        C17542s.j(dVar, "type");
        C17542s.j(map, "customParams");
        Map<String, String> z10 = X.z(map);
        z10.putAll(X.m(C16796C.a("action_name", str), C16796C.a("action_type", dVar.b()), C16796C.a("reason_code", c.f58680a.a(str2))));
        track(j.ACTION_FAIL.b(), z10);
    }

    public void track(String str, Map<String, ? extends Object> map) {
        C17542s.j(str, "eventKey");
        this.f63388b.track(str, map);
    }

    /* renamed from: u */
    public t h() {
        return new t();
    }
}
