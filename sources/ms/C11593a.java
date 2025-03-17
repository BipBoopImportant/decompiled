package ms;

import HJ.C15854t;
import Rx.a;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import com.ingka.ikea.analytics.Interaction$Component;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import on.C11687b;
import pv.C11782b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ#\u0010\f\u001a\u00020\u000b2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H@¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u001a\u0010\u001b\u001a\u00020\u00108\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010 \u001a\u00020\u00078\u0016XD¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010$\u001a\u00020!8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\"\u001a\u0004\b\u001c\u0010#R\u001a\u0010&\u001a\u00020\u00108\u0016XD¢\u0006\f\n\u0004\b\f\u0010\u0018\u001a\u0004\b%\u0010\u001aR\u001a\u0010+\u001a\u00020'8\u0016XD¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*¨\u0006,"}, d2 = {"Lms/a;", "LRx/a;", "Lon/b;", "plpNavigation", "<init>", "(Lon/b;)V", "", "", "data", "a", "(Ljava/util/Map;)Ljava/lang/String;", "Lpv/b;", "e", "(Ljava/util/Map;)Lpv/b;", "g", "(Ljava/util/Map;)Ljava/util/Map;", "", "featureVersion", "b", "(ILjava/util/Map;LdI/e;)Ljava/lang/Object;", "id", "j", "(Ljava/lang/String;)Ljava/util/Map;", "Lon/b;", "I", "getVersion", "()I", "version", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "persistableName", "Lcom/ingka/ikea/analytics/Interaction$Component;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "analyticsComponent", "h", "notificationVisibility", "", "f", "Z", "()Z", "sendPushAnalytics", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ms.a  reason: case insensitive filesystem */
public final class C11593a implements a {

    /* renamed from: g  reason: collision with root package name */
    public static final C2296a f99676g = new C2296a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C11687b f99677a;

    /* renamed from: b  reason: collision with root package name */
    private final int f99678b = 1;

    /* renamed from: c  reason: collision with root package name */
    private final String f99679c = "CommunicationPost";

    /* renamed from: d  reason: collision with root package name */
    private final Interaction$Component f99680d = Interaction$Component.INBOX_COMMUNICATION_POST;

    /* renamed from: e  reason: collision with root package name */
    private final int f99681e = 1;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f99682f;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lms/a$a;", "", "<init>", "()V", "", "FEATURE_NAME", "Ljava/lang/String;", "DATA_ID", "", "VERSION", "I", "OFFERS", "COLLECTIONS", "OTHER", "PURPOSE_KEY", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: ms.a$a  reason: collision with other inner class name */
    public static final class C2296a {
        public /* synthetic */ C2296a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2296a() {
        }
    }

    public C11593a(C11687b bVar) {
        C17542s.j(bVar, "plpNavigation");
        this.f99677a = bVar;
    }

    public String a(Map<String, String> map) {
        C17542s.j(map, "data");
        String str = map.get("purpose");
        return str == null ? "other" : str;
    }

    public Object b(int i10, Map<String, String> map, C17164e<? super String> eVar) {
        String str = map.get("CommunicationPost-Id");
        if (str != null) {
            return C11687b.C2346b.a(this.f99677a, str, "", C11687b.e.CAMPAIGNS, Interaction$Component.INBOX_NEW_INBOX_NOTIFICATIONS, C16877v.n(), C16877v.n(), (Boolean) null, 64, (Object) null).toString();
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Id missing in data");
        e eVar2 = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar2, false)) {
                arrayList.add(next);
            }
        }
        String str2 = null;
        String str3 = null;
        for (C11819b bVar : arrayList) {
            if (str2 == null) {
                String a10 = C11818a.a((String) null, illegalArgumentException);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            if (str3 == null) {
                String name = C11593a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str3;
            bVar.a(eVar2, str4, false, illegalArgumentException, str2);
            str3 = str4;
        }
        return null;
    }

    public Interaction$Component c() {
        return this.f99680d;
    }

    public String d() {
        return this.f99679c;
    }

    public C11782b e(Map<String, String> map) {
        C17542s.j(map, "data");
        String a10 = a(map);
        int hashCode = a10.hashCode();
        if (hashCode != -1019793001) {
            if (hashCode != 106069776) {
                if (hashCode == 1853891989 && a10.equals("collections")) {
                    return C11782b.C2386b.f101387c;
                }
            } else if (a10.equals("other")) {
                return new C11782b.h(3);
            }
        } else if (a10.equals("offers")) {
            return new C11782b.f(3);
        }
        return new C11782b.h(3);
    }

    public boolean f() {
        return this.f99682f;
    }

    public Map<String, String> g(Map<String, String> map) {
        C17542s.j(map, "data");
        return X.j();
    }

    public int getVersion() {
        return this.f99678b;
    }

    public int h() {
        return this.f99681e;
    }

    public final Map<String, String> j(String str) {
        C17542s.j(str, "id");
        return X.f(C16796C.a("CommunicationPost-Id", str));
    }
}
