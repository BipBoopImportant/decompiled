package Jx;

import HJ.C15854t;
import Hx.h;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.RescheduleTimeWindowRemote;
import com.ingka.ikea.purchasehistorydata.impl.data.remote.TimeWindowDateTimeRemote;
import com.sugarcube.core.logger.DslKt;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pp.C11769c;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u000f2\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"LJx/a;", "Lpp/c;", "LHx/h;", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/RescheduleTimeWindowRemote;", "<init>", "()V", "Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/TimeWindowDateTimeRemote;", "", "timeZone", "LHx/h$b;", "b", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/TimeWindowDateTimeRemote;Ljava/lang/String;)LHx/h$b;", "remote", "c", "(Lcom/ingka/ikea/purchasehistorydata/impl/data/remote/RescheduleTimeWindowRemote;)LHx/h;", "a", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11769c<h, RescheduleTimeWindowRemote> {

    /* renamed from: a  reason: collision with root package name */
    public static final C2707a f111395a = new C2707a((DefaultConstructorMarker) null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LJx/a$a;", "", "<init>", "()V", "", "TIME_RANGE_FORMAT", "Ljava/lang/String;", "purchasehistorydata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Jx.a$a  reason: collision with other inner class name */
    public static final class C2707a {
        public /* synthetic */ C2707a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2707a() {
        }
    }

    private final h.b b(TimeWindowDateTimeRemote timeWindowDateTimeRemote, String str) {
        String a10;
        String c10;
        String b10;
        if (str == null || str.length() == 0 || (a10 = timeWindowDateTimeRemote.a()) == null || a10.length() == 0 || (c10 = timeWindowDateTimeRemote.c()) == null || c10.length() == 0 || (b10 = timeWindowDateTimeRemote.b()) == null || b10.length() == 0) {
            return null;
        }
        String a11 = timeWindowDateTimeRemote.a();
        String c11 = timeWindowDateTimeRemote.c();
        String localDate = ZonedDateTime.parse(a11 + "T" + c11).withZoneSameInstant(ZoneId.of(str)).toLocalDate().toString();
        C17542s.i(localDate, "toString(...)");
        return new h.b(localDate, timeWindowDateTimeRemote.b());
    }

    /* renamed from: c */
    public h a(RescheduleTimeWindowRemote rescheduleTimeWindowRemote) {
        C17542s.j(rescheduleTimeWindowRemote, "remote");
        String d10 = rescheduleTimeWindowRemote.d();
        Class<a> cls = a.class;
        int i10 = 2;
        if (d10 == null || d10.length() == 0) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing id for time window: " + this);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                if (str2 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str2, false, illegalArgumentException, str);
                i10 = 2;
            }
            return null;
        }
        String b10 = rescheduleTimeWindowRemote.b();
        if (b10 == null || b10.length() == 0) {
            IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException("Missing date range for time window: " + this);
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str3 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException2);
                    if (a11 == null) {
                        break;
                    }
                    str3 = C11820c.a(a11);
                }
                if (str4 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, illegalArgumentException2, str3);
            }
            return null;
        }
        TimeWindowDateTimeRemote e10 = rescheduleTimeWindowRemote.e();
        h.b b11 = e10 != null ? b(e10, rescheduleTimeWindowRemote.f()) : null;
        TimeWindowDateTimeRemote c10 = rescheduleTimeWindowRemote.c();
        h.b b12 = c10 != null ? b(c10, rescheduleTimeWindowRemote.f()) : null;
        if (b11 == null || b12 == null) {
            IllegalArgumentException illegalArgumentException3 = new IllegalArgumentException("Invalid time window dates: " + this);
            e eVar3 = e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str5 == null) {
                    String a12 = C11818a.a((String) null, illegalArgumentException3);
                    if (a12 == null) {
                        break;
                    }
                    str5 = C11820c.a(a12);
                }
                if (str6 == null) {
                    String name3 = cls.getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar3.a(eVar3, str6, false, illegalArgumentException3, str5);
            }
            return null;
        }
        String format = String.format("%s — %s", Arrays.copyOf(new Object[]{b11.b(), b12.b()}, 2));
        C17542s.i(format, "format(...)");
        String d11 = rescheduleTimeWindowRemote.d();
        String b13 = rescheduleTimeWindowRemote.b();
        Boolean a13 = rescheduleTimeWindowRemote.a();
        return new h(d11, b13, format, a13 != null ? a13.booleanValue() : false, b11, b12);
    }
}
