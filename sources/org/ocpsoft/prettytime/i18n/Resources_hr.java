package org.ocpsoft.prettytime.i18n;

import NL.C16126a;
import NL.f;
import NL.g;
import OL.C16182a;
import PL.C16214b;
import java.util.ArrayList;
import java.util.List;
import java.util.ListResourceBundle;
import java.util.Objects;
import java.util.ResourceBundle;
import org.ocpsoft.prettytime.units.Day;
import org.ocpsoft.prettytime.units.Hour;
import org.ocpsoft.prettytime.units.Millennium;
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

public class Resources_hr extends ListResourceBundle implements C16214b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[][] f146142a;

    private static class HrName implements Comparable<HrName> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f146143a;

        /* renamed from: b  reason: collision with root package name */
        private final Long f146144b;

        /* renamed from: c  reason: collision with root package name */
        private final String f146145c;

        public HrName(boolean z10, String str, Long l10) {
            this.f146143a = z10;
            this.f146145c = str;
            this.f146144b = l10;
        }

        /* renamed from: a */
        public int compareTo(HrName hrName) {
            return this.f146144b.compareTo(Long.valueOf(hrName.j()));
        }

        public String b() {
            return this.f146145c;
        }

        public long j() {
            return this.f146144b.longValue();
        }

        public boolean m() {
            return this.f146143a;
        }
    }

    private static class HrTimeFormat extends C16182a {

        /* renamed from: o  reason: collision with root package name */
        private final List<HrName> f146146o = new ArrayList();

        /* renamed from: p  reason: collision with root package name */
        private final List<HrName> f146147p = new ArrayList();

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|(2:7|8)|9|(4:13|(2:15|21)(2:16|22)|19|11)|20|17|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|(4:13|(2:15|21)(2:16|22)|19|11)|20|17|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0101 */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0123  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public HrTimeFormat(java.lang.String r3, java.util.ResourceBundle r4, java.util.Collection<org.ocpsoft.prettytime.i18n.Resources_hr.HrName> r5) {
            /*
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f146146o = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f146147p = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = "Pattern"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r4.getString(r0)
                r2.w(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = "FuturePrefix"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r4.getString(r0)
                r2.o(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = "FutureSuffix"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r4.getString(r0)
                r2.q(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = "PastPrefix"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r4.getString(r0)
                r2.t(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = "PastSuffix"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r4.getString(r0)
                r2.v(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = "SingularName"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r4.getString(r0)
                r2.y(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r1 = "PluralName"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r4.getString(r0)
                r2.x(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d1 }
                r0.<init>()     // Catch:{ Exception -> 0x00d1 }
                r0.append(r3)     // Catch:{ Exception -> 0x00d1 }
                java.lang.String r1 = "FuturePluralName"
                r0.append(r1)     // Catch:{ Exception -> 0x00d1 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00d1 }
                java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x00d1 }
                r2.n(r0)     // Catch:{ Exception -> 0x00d1 }
            L_0x00d1:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e9 }
                r0.<init>()     // Catch:{ Exception -> 0x00e9 }
                r0.append(r3)     // Catch:{ Exception -> 0x00e9 }
                java.lang.String r1 = "FutureSingularName"
                r0.append(r1)     // Catch:{ Exception -> 0x00e9 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00e9 }
                java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x00e9 }
                r2.p(r0)     // Catch:{ Exception -> 0x00e9 }
            L_0x00e9:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0101 }
                r0.<init>()     // Catch:{ Exception -> 0x0101 }
                r0.append(r3)     // Catch:{ Exception -> 0x0101 }
                java.lang.String r1 = "PastPluralName"
                r0.append(r1)     // Catch:{ Exception -> 0x0101 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0101 }
                java.lang.String r0 = r4.getString(r0)     // Catch:{ Exception -> 0x0101 }
                r2.s(r0)     // Catch:{ Exception -> 0x0101 }
            L_0x0101:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0119 }
                r0.<init>()     // Catch:{ Exception -> 0x0119 }
                r0.append(r3)     // Catch:{ Exception -> 0x0119 }
                java.lang.String r3 = "PastSingularName"
                r0.append(r3)     // Catch:{ Exception -> 0x0119 }
                java.lang.String r3 = r0.toString()     // Catch:{ Exception -> 0x0119 }
                java.lang.String r3 = r4.getString(r3)     // Catch:{ Exception -> 0x0119 }
                r2.u(r3)     // Catch:{ Exception -> 0x0119 }
            L_0x0119:
                java.util.Iterator r3 = r5.iterator()
            L_0x011d:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x013b
                java.lang.Object r4 = r3.next()
                org.ocpsoft.prettytime.i18n.Resources_hr$HrName r4 = (org.ocpsoft.prettytime.i18n.Resources_hr.HrName) r4
                boolean r5 = r4.m()
                if (r5 == 0) goto L_0x0135
                java.util.List<org.ocpsoft.prettytime.i18n.Resources_hr$HrName> r5 = r2.f146146o
                r5.add(r4)
                goto L_0x011d
            L_0x0135:
                java.util.List<org.ocpsoft.prettytime.i18n.Resources_hr$HrName> r5 = r2.f146147p
                r5.add(r4)
                goto L_0x011d
            L_0x013b:
                java.util.List<org.ocpsoft.prettytime.i18n.Resources_hr$HrName> r3 = r2.f146146o
                java.util.Collections.sort(r3)
                java.util.List<org.ocpsoft.prettytime.i18n.Resources_hr$HrName> r3 = r2.f146147p
                java.util.Collections.sort(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.i18n.Resources_hr.HrTimeFormat.<init>(java.lang.String, java.util.ResourceBundle, java.util.Collection):void");
        }

        private String z(long j10, List<HrName> list) {
            for (HrName next : list) {
                if (next.j() >= j10) {
                    return next.b();
                }
            }
            throw new IllegalStateException("Invalid resource bundle configuration");
        }

        /* access modifiers changed from: protected */
        public String f(C16126a aVar, boolean z10) {
            long abs = Math.abs(j(aVar, z10));
            return aVar.b() ? z(abs, this.f146146o) : z(abs, this.f146147p);
        }
    }

    private static class HrTimeFormatBuilder {

        /* renamed from: a  reason: collision with root package name */
        private final List<HrName> f146148a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final String f146149b;

        HrTimeFormatBuilder(String str) {
            this.f146149b = str;
        }

        private HrTimeFormatBuilder a(boolean z10, String str, long j10) {
            List<HrName> list = this.f146148a;
            Objects.requireNonNull(str);
            list.add(new HrName(z10, str, Long.valueOf(j10)));
            return this;
        }

        /* access modifiers changed from: package-private */
        public HrTimeFormatBuilder b(String str, long j10) {
            return a(true, str, j10).a(false, str, j10);
        }

        /* access modifiers changed from: package-private */
        public HrTimeFormat c(ResourceBundle resourceBundle) {
            return new HrTimeFormat(this.f146149b, resourceBundle, this.f146148a);
        }
    }

    static {
        Object obj = "prije ";
        Object obj2 = "";
        Object obj3 = "za ";
        f146142a = new Object[][]{new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "za "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", ""}, new Object[]{"CenturyPastSuffix", " unatrag"}, new Object[]{"CenturySingularName", "stoljeće"}, new Object[]{"CenturyPluralName", "stoljeća"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "za "}, new Object[]{"DayFutureSuffix", ""}, new Object[]{"DayPastPrefix", "prije "}, new Object[]{"DayPastSuffix", ""}, new Object[]{"DaySingularName", "dan"}, new Object[]{"DayPluralName", "dana"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", obj3}, new Object[]{"DecadeFutureSuffix", obj2}, new Object[]{"DecadePastPrefix", obj}, new Object[]{"DecadePastSuffix", obj2}, new Object[]{"DecadeSingularName", "desetljeće"}, new Object[]{"DecadePluralName", "desetljeća"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", obj3}, new Object[]{"HourFutureSuffix", obj2}, new Object[]{"HourPastPrefix", obj}, new Object[]{"HourPastSuffix", obj2}, new Object[]{"HourSingularName", "sat"}, new Object[]{"HourPluralName", "sati"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "za nekoliko trenutaka"}, new Object[]{"JustNowFutureSuffix", obj2}, new Object[]{"JustNowPastPrefix", "prije nekoliko trenutaka"}, new Object[]{"JustNowPastSuffix", obj2}, new Object[]{"JustNowSingularName", obj2}, new Object[]{"JustNowPluralName", obj2}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", obj3}, new Object[]{"MillenniumFutureSuffix", obj2}, new Object[]{"MillenniumPastPrefix", obj}, new Object[]{"MillenniumPastSuffix", obj2}, new Object[]{"MillenniumSingularName", "tisućljeće"}, new Object[]{"MillenniumPluralName", "tisućljeća"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", obj3}, new Object[]{"MillisecondFutureSuffix", obj2}, new Object[]{"MillisecondPastPrefix", obj}, new Object[]{"MillisecondPastSuffix", obj2}, new Object[]{"MillisecondSingularName", "milisekunda"}, new Object[]{"MillisecondPluralName", "milisekunda"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", obj3}, new Object[]{"MinuteFutureSuffix", obj2}, new Object[]{"MinutePastPrefix", obj}, new Object[]{"MinutePastSuffix", obj2}, new Object[]{"MinuteSingularName", "minuta"}, new Object[]{"MinutePluralName", "minuta"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", obj3}, new Object[]{"MonthFutureSuffix", obj2}, new Object[]{"MonthPastPrefix", obj}, new Object[]{"MonthPastSuffix", obj2}, new Object[]{"MonthSingularName", "mjesec"}, new Object[]{"MonthPluralName", "mjeseca"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", obj3}, new Object[]{"SecondFutureSuffix", obj2}, new Object[]{"SecondPastPrefix", obj}, new Object[]{"SecondPastSuffix", obj2}, new Object[]{"SecondSingularName", "sekunda"}, new Object[]{"SecondPluralName", "sekundi"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", obj3}, new Object[]{"WeekFutureSuffix", obj2}, new Object[]{"WeekPastPrefix", obj}, new Object[]{"WeekPastSuffix", obj2}, new Object[]{"WeekSingularName", "tjedan"}, new Object[]{"WeekPluralName", "tjedna"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", obj3}, new Object[]{"YearFutureSuffix", obj2}, new Object[]{"YearPastPrefix", obj}, new Object[]{"YearPastSuffix", obj2}, new Object[]{"YearSingularName", "godina"}, new Object[]{"YearPluralName", "godina"}, new Object[]{"AbstractTimeUnitPattern", obj2}, new Object[]{"AbstractTimeUnitFuturePrefix", obj2}, new Object[]{"AbstractTimeUnitFutureSuffix", obj2}, new Object[]{"AbstractTimeUnitPastPrefix", obj2}, new Object[]{"AbstractTimeUnitPastSuffix", obj2}, new Object[]{"AbstractTimeUnitSingularName", obj2}, new Object[]{"AbstractTimeUnitPluralName", obj2}};
    }

    public f a(g gVar) {
        if (gVar instanceof Minute) {
            return new HrTimeFormatBuilder("Minute").b("minutu", 1).b("minute", 4).b("minuta", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Hour) {
            return new HrTimeFormatBuilder("Hour").b("sat", 1).b("sata", 4).b("sati", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Day) {
            return new HrTimeFormatBuilder("Day").b("dan", 1).b("dana", 4).b("dana", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Week) {
            return new HrTimeFormatBuilder("Week").b("tjedan", 1).b("tjedna", 4).b("tjedana", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Month) {
            return new HrTimeFormatBuilder("Month").b("mjesec", 1).b("mjeseca", 4).b("mjeseci", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Year) {
            return new HrTimeFormatBuilder("Year").b("godinu", 1).b("godine", 4).b("godina", Long.MAX_VALUE).c(this);
        }
        if (gVar instanceof Millennium) {
            return new HrTimeFormatBuilder("Millennium").b("tisućljeće", 1).b("tisućljeća", Long.MAX_VALUE).c(this);
        }
        return null;
    }

    public Object[][] getContents() {
        return f146142a;
    }
}
