package NL;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.ocpsoft.prettytime.impl.ResourcesTimeUnit;
import org.ocpsoft.prettytime.impl.a;
import org.ocpsoft.prettytime.units.Century;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.JustNow;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Millisecond;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Second;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private volatile Instant f136650a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Locale f136651b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<g, f> f136652c;

    /* renamed from: d  reason: collision with root package name */
    private volatile List<g> f136653d;

    /* renamed from: e  reason: collision with root package name */
    private String f136654e;

    public e() {
        this((String) null);
    }

    private void b(ResourcesTimeUnit resourcesTimeUnit) {
        o(resourcesTimeUnit, new a(resourcesTimeUnit, this.f136654e));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005e, code lost:
        if (r7 <= r0) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r3.h(j(r18));
        r3.g(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r3.h(r18 / r7);
        r3.g(r18 - (r3.e() * r7));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private NL.C16126a e(long r18) {
        /*
            r17 = this;
            long r0 = java.lang.Math.abs(r18)
            java.util.List r2 = r17.k()
            PL.a r3 = new PL.a
            r3.<init>()
            r4 = 0
            r5 = r4
        L_0x000f:
            int r6 = r2.size()
            if (r5 >= r6) goto L_0x007a
            java.lang.Object r6 = r2.get(r5)
            NL.g r6 = (NL.g) r6
            long r7 = r6.b()
            long r7 = java.lang.Math.abs(r7)
            long r9 = r6.a()
            long r9 = java.lang.Math.abs(r9)
            int r11 = r2.size()
            r12 = 1
            int r11 = r11 - r12
            if (r5 != r11) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r12 = r4
        L_0x0035:
            r13 = 0
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 != 0) goto L_0x004e
            if (r12 != 0) goto L_0x004e
            int r9 = r5 + 1
            java.lang.Object r9 = r2.get(r9)
            NL.g r9 = (NL.g) r9
            long r9 = r9.b()
            long r15 = r6.b()
            long r9 = r9 / r15
        L_0x004e:
            long r9 = r9 * r7
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 > 0) goto L_0x0059
            if (r12 == 0) goto L_0x0056
            goto L_0x0059
        L_0x0056:
            int r5 = r5 + 1
            goto L_0x000f
        L_0x0059:
            r3.i(r6)
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x006b
            long r0 = r17.j(r18)
            r3.h(r0)
            r3.g(r13)
            goto L_0x007a
        L_0x006b:
            long r0 = r18 / r7
            r3.h(r0)
            long r0 = r3.e()
            long r0 = r0 * r7
            long r0 = r18 - r0
            r3.g(r0)
        L_0x007a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: NL.e.e(long):NL.a");
    }

    private long j(long j10) {
        return 0 > j10 ? -1 : 1;
    }

    private void l() {
        b(new JustNow());
        b(new Millisecond());
        b(new Second());
        b(new Minute());
        b(new Hour());
        b(new Day());
        b(new Week());
        b(new Month());
        b(new Year());
        b(new Decade());
        b(new Century());
        b(new Millennium());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(Map map, g gVar) {
        map.put(gVar.toString(), this.f136652c.get(gVar));
    }

    private Date n() {
        return new Date();
    }

    public C16126a c(Instant instant) {
        return d(instant != null ? Date.from(instant) : null);
    }

    public C16126a d(Date date) {
        if (date == null) {
            date = n();
        }
        long time = date.getTime() - (this.f136650a != null ? this.f136650a : Instant.now()).toEpochMilli();
        if (time == 0) {
            time = 1;
        }
        return e(time);
    }

    public String f(C16126a aVar) {
        if (aVar == null) {
            return h(n());
        }
        f i10 = i(aVar.a());
        return i10.a(aVar, i10.c(aVar));
    }

    public String g(Instant instant) {
        return f(c(instant));
    }

    public String h(Date date) {
        if (date == null) {
            date = n();
        }
        return f(d(date));
    }

    public f i(g gVar) {
        if (gVar == null) {
            return null;
        }
        if (this.f136652c.get(gVar) != null) {
            return this.f136652c.get(gVar);
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f136652c.keySet().forEach(new C16128c(this, concurrentHashMap));
        return (f) concurrentHashMap.get(gVar.toString());
    }

    public List<g> k() {
        if (this.f136653d == null) {
            ArrayList arrayList = new ArrayList(this.f136652c.keySet());
            Collections.sort(arrayList, Comparator.comparing(new C16129d()));
            this.f136653d = Collections.unmodifiableList(arrayList);
        }
        return this.f136653d;
    }

    public e o(g gVar, f fVar) {
        this.f136653d = null;
        Map<g, f> map = this.f136652c;
        Objects.requireNonNull(gVar, "TimeUnit to register must not be null.");
        Objects.requireNonNull(fVar, "TimeFormat to register must not be null.");
        map.put(gVar, fVar);
        if (gVar instanceof C16127b) {
            ((C16127b) gVar).b(this.f136651b);
        }
        if (fVar instanceof C16127b) {
            ((C16127b) fVar).b(this.f136651b);
        }
        return this;
    }

    public e p(Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        this.f136651b = locale;
        for (g next : this.f136652c.keySet()) {
            if (next instanceof C16127b) {
                ((C16127b) next).b(locale);
            }
        }
        for (f next2 : this.f136652c.values()) {
            if (next2 instanceof C16127b) {
                ((C16127b) next2).b(locale);
            }
        }
        this.f136653d = null;
        return this;
    }

    public String toString() {
        return "PrettyTime [reference=" + this.f136650a + ", locale=" + this.f136651b + "]";
    }

    public e(String str) {
        this.f136651b = Locale.getDefault();
        this.f136652c = new ConcurrentHashMap();
        this.f136654e = str;
        l();
    }

    public e(Locale locale) {
        this();
        p(locale);
    }
}
