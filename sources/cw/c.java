package cw;

import HJ.C15854t;
import com.sugarcube.core.logger.DslKt;
import fI.C17220a;
import fI.C17221b;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001d"}, d2 = {"Lcw/c;", "", "", "rawValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "Companion", "a", "ASSEMBLY", "EMERGENCY", "CAMPAIGNS_LOCAL", "CAMPAIGNS_GLOBAL", "CLICK_AND_COLLECT", "COVID", "CUSTOMER_SERVICE", "DELIVERY", "IKEA_APP", "INFORMATION", "PAYMENTS", "PLANNERS", "RETURNS", "SALE", "STOCK", "STORES", "SUSTAINABILITY", "UNKNOWN", "messagecenter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum c {
    ASSEMBLY("assembly"),
    EMERGENCY("emergency"),
    CAMPAIGNS_LOCAL("campaigns-local"),
    CAMPAIGNS_GLOBAL("campaigns-global"),
    CLICK_AND_COLLECT("click-collect"),
    COVID("covid"),
    CUSTOMER_SERVICE("customer-service"),
    DELIVERY("delivery"),
    IKEA_APP("ikea-app"),
    INFORMATION("information"),
    PAYMENTS("payments"),
    PLANNERS("planners"),
    RETURNS("returns"),
    SALE("sale"),
    STOCK("stock"),
    STORES("stores"),
    SUSTAINABILITY("sustainability"),
    UNKNOWN("");
    
    public static final a Companion = null;
    private final String rawValue;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcw/c$a;", "", "<init>", "()V", "", "rawValue", "Lcw/c;", "a", "(Ljava/lang/String;)Lcw/c;", "messagecenter_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(String str) {
            T t10;
            String str2 = str;
            C17542s.j(str2, "rawValue");
            Iterator<T> it = c.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t10 = null;
                    break;
                }
                t10 = it.next();
                if (C15854t.H(((c) t10).j(), str2, true)) {
                    break;
                }
            }
            c cVar = (c) t10;
            if (cVar == null) {
                cVar = c.UNKNOWN;
                a aVar = c.Companion;
                IllegalStateException illegalStateException = new IllegalStateException("Unknown MessageType returned in response: " + str2);
                e eVar = e.ERROR;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a((String) null, illegalStateException);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        String name = aVar.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str6 = str4;
                    bVar.a(eVar, str6, false, illegalStateException, str5);
                    str3 = str5;
                    str4 = str6;
                }
            }
            return cVar;
        }

        private a() {
        }
    }

    static {
        c[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
    }

    private c(String str) {
        this.rawValue = str;
    }

    public static C17220a<c> b() {
        return $ENTRIES;
    }

    public final String j() {
        return this.rawValue;
    }
}
