package Sx;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pv.C11782b;
import pv.C11783c;
import pv.C11784d;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.e;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LSx/d;", "", "<init>", "()V", "", "", "map", "purpose", "Lpv/c;", "source", "Lpv/b;", "localNotificationChannel", "Lpv/d;", "a", "(Ljava/util/Map;Ljava/lang/String;Lpv/c;Lpv/b;)Lpv/d;", "pushnotification-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f116634a = new d();

    private d() {
    }

    public final C11784d a(Map<String, String> map, String str, C11783c cVar, C11782b bVar) {
        String str2;
        Map<String, String> map2 = map;
        C17542s.j(map, "map");
        String str3 = str;
        C17542s.j(str, "purpose");
        C17542s.j(cVar, "source");
        C17542s.j(bVar, "localNotificationChannel");
        String str4 = map.get("title");
        String str5 = map.get("body");
        String str6 = map.get("imageUrl");
        String str7 = map.get("messageId");
        if (str4 != null && str4.length() != 0 && str5 != null && str5.length() != 0 && str7 != null && str7.length() != 0) {
            return new C11784d(str4, str5, str6, str7, str, cVar, bVar);
        }
        if (str4 == null || str4.length() == 0) {
            str2 = "Message missing title, type: " + map.get("type");
        } else if (str5 == null || str5.length() == 0) {
            str2 = "Message missing body, type: " + map.get("type");
        } else {
            str2 = "Message missing messageId, type: " + map.get("type");
        }
        IllegalStateException illegalStateException = new IllegalStateException(str2);
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str8 = null;
        String str9 = null;
        for (C11819b bVar2 : arrayList) {
            if (str8 == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    break;
                }
                str8 = C11820c.a(a10);
            }
            if (str9 == null) {
                String name = d.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            bVar2.a(eVar, str9, false, illegalStateException, str8);
        }
        return null;
    }
}
