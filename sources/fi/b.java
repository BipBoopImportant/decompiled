package Fi;

import Fi.C10713a;
import HJ.C15854t;
import Il.a;
import com.sugarcube.core.logger.DslKt;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\"\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LFi/b;", "LFi/a;", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "", "dateFormat", "dateString", "LFi/a$a;", "a", "(Ljava/lang/String;Ljava/lang/String;)LFi/a$a;", "LIl/a;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements C10713a {

    /* renamed from: a  reason: collision with root package name */
    private final a f80848a;

    public b(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f80848a = aVar;
    }

    public C10713a.C1548a a(String str, String str2) {
        C17542s.j(str2, "dateString");
        try {
            Locale A10 = this.f80848a.A();
            Date parse = new SimpleDateFormat(str, A10).parse(str2);
            if (parse != null) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar();
                gregorianCalendar.setTime(parse);
                String format = new SimpleDateFormat("MMM d", A10).format(gregorianCalendar.getTime());
                String format2 = new SimpleDateFormat("EEE", A10).format(gregorianCalendar.getTime());
                C17542s.g(format2);
                C17542s.g(format);
                return new C10713a.C1548a(format2, format);
            }
            throw new IllegalArgumentException("Unable to parse date");
        } catch (Exception e10) {
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
                    String a10 = C11818a.a("Unable to format date, dateFormat: " + str + ", date: " + str2, e10);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                String str5 = str3;
                if (str4 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str6 = str4;
                bVar.a(eVar, str6, false, e10, str5);
                str3 = str5;
                str4 = str6;
            }
            return new C10713a.C1548a(str2, "");
        }
    }
}
