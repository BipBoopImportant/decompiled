package Op;

import HJ.C15854t;
import IC.C13020b;
import IC.C13023e;
import IC.C13026h;
import Oo.a;
import Oo.b;
import YH.C16877v;
import com.sugarcube.core.logger.DslKt;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LOp/e;", "", "LOp/c;", "clock", "<init>", "(LOp/c;)V", "", "validUntilDate", "LIC/e;", "a", "(Ljava/lang/String;)LIC/e;", "LOp/c;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Op.e  reason: case insensitive filesystem */
public final class C10830e {

    /* renamed from: a  reason: collision with root package name */
    private final C10826c f85156a;

    public C10830e(C10826c cVar) {
        C17542s.j(cVar, "clock");
        this.f85156a = cVar;
    }

    public final C13023e a(String str) {
        C17542s.j(str, "validUntilDate");
        try {
            long between = ChronoUnit.DAYS.between(this.f85156a.a(), LocalDate.parse(str));
            if (between < 2) {
                return C13026h.a(b.f84842y2);
            }
            int i10 = (int) between;
            return new C13023e.c(a.f84314i, C13020b.a(i10), C16877v.e(Integer.valueOf(i10)), (DefaultConstructorMarker) null);
        } catch (DateTimeParseException e10) {
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a((String) null, e10);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + "Error parsing date";
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
            return null;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10830e(C10826c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new g1() : cVar);
    }
}
