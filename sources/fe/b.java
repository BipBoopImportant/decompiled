package Fe;

import HJ.C15850p;
import HJ.C15854t;
import XH.C16807N;
import XH.x;
import XH.y;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000f¨\u0006\u0011"}, d2 = {"LFe/b;", "", "<init>", "()V", "", "", "params", "LXH/N;", "a", "(Ljava/util/Map;)V", "name", "value", "b", "(Ljava/lang/String;Ljava/lang/Object;)V", "LHJ/p;", "LHJ/p;", "paramNameRegex", "analytics_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f60484a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final C15850p f60485b = new C15850p("^[A-Za-z][A-Za-z0-9_]*$");

    private b() {
    }

    public final void a(Map<String, ? extends Object> map) {
        Object obj;
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                b bVar = f60484a;
                try {
                    x.a aVar = x.f139812b;
                    bVar.b(str, value);
                    obj = x.b(C16807N.f139792a);
                } catch (CancellationException e10) {
                    throw e10;
                } catch (Throwable th2) {
                    x.a aVar2 = x.f139812b;
                    obj = x.b(y.a(th2));
                }
                Throwable e11 = x.e(obj);
                if (e11 != null) {
                    b bVar2 = f60484a;
                    e eVar = e.ERROR;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next2 : d.f102012a.a()) {
                        if (((C11819b) next2).b(eVar, false)) {
                            arrayList.add(next2);
                        }
                    }
                    String str2 = null;
                    String str3 = null;
                    for (C11819b bVar3 : arrayList) {
                        if (str2 == null) {
                            String a10 = C11818a.a((String) null, e11);
                            if (a10 == null) {
                                break;
                            }
                            str2 = C11820c.a(a10);
                        }
                        String str4 = str2;
                        if (str3 == null) {
                            String name = bVar2.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str5 = str3;
                        bVar3.a(eVar, str5, false, e11, str4);
                        str2 = str4;
                        str3 = str5;
                    }
                }
            }
        }
    }

    public final void b(String str, Object obj) {
        C17542s.j(str, "name");
        if (!f60485b.i(str)) {
            throw new IllegalArgumentException("Param name:" + str + ", does not follow the naming rules");
        } else if (str.length() > 100) {
            throw new IllegalArgumentException("Param name:" + str + ", is too long");
        } else if (obj != null && obj.getClass().isEnum()) {
            throw new IllegalArgumentException("Enum " + obj + " passed to analytics, will not work!");
        }
    }
}
