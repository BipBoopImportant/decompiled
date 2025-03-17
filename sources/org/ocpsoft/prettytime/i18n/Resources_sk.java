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
import org.ocpsoft.prettytime.units.Minute;
import org.ocpsoft.prettytime.units.Month;
import org.ocpsoft.prettytime.units.Week;
import org.ocpsoft.prettytime.units.Year;

public class Resources_sk extends ListResourceBundle implements C16214b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[][] f146188a;

    private static class CsName implements Comparable<CsName> {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f146189a;

        /* renamed from: b  reason: collision with root package name */
        private final String f146190b;

        /* renamed from: c  reason: collision with root package name */
        private final Long f146191c;

        public CsName(boolean z10, String str, Long l10) {
            this.f146189a = z10;
            this.f146190b = str;
            this.f146191c = l10;
        }

        /* renamed from: a */
        public int compareTo(CsName csName) {
            return this.f146191c.compareTo(Long.valueOf(csName.j()));
        }

        public String b() {
            return this.f146190b;
        }

        public long j() {
            return this.f146191c.longValue();
        }

        public boolean m() {
            return this.f146189a;
        }
    }

    private static class CsTimeFormat extends C16182a {

        /* renamed from: o  reason: collision with root package name */
        private final List<CsName> f146192o = new ArrayList();

        /* renamed from: p  reason: collision with root package name */
        private final List<CsName> f146193p = new ArrayList();

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|(2:7|8)|9|(4:13|(2:15|21)(2:16|22)|19|11)|20|17|18) */
        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|(4:13|(2:15|21)(2:16|22)|19|11)|20|17|18) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x00d1 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x00e9 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0101 */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0123  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public CsTimeFormat(java.lang.String r3, java.util.ResourceBundle r4, java.util.Collection<org.ocpsoft.prettytime.i18n.Resources_sk.CsName> r5) {
            /*
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f146192o = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.f146193p = r0
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
                org.ocpsoft.prettytime.i18n.Resources_sk$CsName r4 = (org.ocpsoft.prettytime.i18n.Resources_sk.CsName) r4
                boolean r5 = r4.m()
                if (r5 == 0) goto L_0x0135
                java.util.List<org.ocpsoft.prettytime.i18n.Resources_sk$CsName> r5 = r2.f146192o
                r5.add(r4)
                goto L_0x011d
            L_0x0135:
                java.util.List<org.ocpsoft.prettytime.i18n.Resources_sk$CsName> r5 = r2.f146193p
                r5.add(r4)
                goto L_0x011d
            L_0x013b:
                java.util.List<org.ocpsoft.prettytime.i18n.Resources_sk$CsName> r3 = r2.f146192o
                java.util.Collections.sort(r3)
                java.util.List<org.ocpsoft.prettytime.i18n.Resources_sk$CsName> r3 = r2.f146193p
                java.util.Collections.sort(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.i18n.Resources_sk.CsTimeFormat.<init>(java.lang.String, java.util.ResourceBundle, java.util.Collection):void");
        }

        private String z(long j10, List<CsName> list) {
            for (CsName next : list) {
                if (next.j() >= j10) {
                    return next.b();
                }
            }
            throw new IllegalStateException("Invalid resource bundle configuration");
        }

        /* access modifiers changed from: protected */
        public String f(C16126a aVar, boolean z10) {
            long abs = Math.abs(j(aVar, z10));
            return aVar.b() ? z(abs, this.f146192o) : z(abs, this.f146193p);
        }
    }

    private static class CsTimeFormatBuilder {

        /* renamed from: a  reason: collision with root package name */
        private List<CsName> f146194a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private String f146195b;

        CsTimeFormatBuilder(String str) {
            this.f146195b = str;
        }

        private CsTimeFormatBuilder b(boolean z10, String str, long j10) {
            List<CsName> list = this.f146194a;
            Objects.requireNonNull(str);
            list.add(new CsName(z10, str, Long.valueOf(j10)));
            return this;
        }

        /* access modifiers changed from: package-private */
        public CsTimeFormatBuilder a(String str, long j10) {
            return b(true, str, j10);
        }

        /* access modifiers changed from: package-private */
        public CsTimeFormatBuilder c(String str, long j10) {
            return b(false, str, j10);
        }

        /* access modifiers changed from: package-private */
        public CsTimeFormat d(ResourceBundle resourceBundle) {
            return new CsTimeFormat(this.f146195b, resourceBundle, this.f146194a);
        }
    }

    static {
        Object obj = "pred ";
        Object obj2 = "";
        Object obj3 = "o ";
        Object[] objArr = {"AbstractTimeUnitPattern", obj2};
        Object[] objArr2 = {"AbstractTimeUnitFuturePrefix", obj2};
        Object[] objArr3 = {"AbstractTimeUnitFutureSuffix", obj2};
        Object[] objArr4 = {"AbstractTimeUnitPastPrefix", obj2};
        Object[] objArr5 = {"AbstractTimeUnitPastSuffix", obj2};
        Object[] objArr6 = {"AbstractTimeUnitSingularName", obj2};
        Object[] objArr7 = {"AbstractTimeUnitPluralName", obj2};
        f146188a = new Object[][]{new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "o "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", "pred "}, new Object[]{"CenturyPastSuffix", ""}, new Object[]{"CenturySingularName", "storočie"}, new Object[]{"CenturyPluralName", "storočia"}, new Object[]{"CenturyPastSingularName", "storočím"}, new Object[]{"CenturyPastPluralName", "storočiami"}, new Object[]{"CenturyFutureSingularName", "storočí"}, new Object[]{"CenturyFuturePluralName", "storočia"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "o "}, new Object[]{"DayFutureSuffix", obj2}, new Object[]{"DayPastPrefix", obj}, new Object[]{"DayPastSuffix", obj2}, new Object[]{"DaySingularName", "deň"}, new Object[]{"DayPluralName", "dni"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", obj3}, new Object[]{"DecadeFutureSuffix", obj2}, new Object[]{"DecadePastPrefix", obj}, new Object[]{"DecadePastSuffix", obj2}, new Object[]{"DecadeSingularName", "desaťročie"}, new Object[]{"DecadePluralName", "desaťročia"}, new Object[]{"DecadePastSingularName", "desaťročím"}, new Object[]{"DecadePastPluralName", "desaťročiami"}, new Object[]{"DecadeFutureSingularName", "desaťročí"}, new Object[]{"DecadeFuturePluralName", "desaťročia"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", obj3}, new Object[]{"HourFutureSuffix", obj2}, new Object[]{"HourPastPrefix", "pred"}, new Object[]{"HourPastSuffix", obj2}, new Object[]{"HourSingularName", "hodina"}, new Object[]{"HourPluralName", "hodiny"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", obj2}, new Object[]{"JustNowFutureSuffix", "o chvíľu"}, new Object[]{"JustNowPastPrefix", "pred chvíľou"}, new Object[]{"JustNowPastSuffix", obj2}, new Object[]{"JustNowSingularName", obj2}, new Object[]{"JustNowPluralName", obj2}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", obj3}, new Object[]{"MillenniumFutureSuffix", obj2}, new Object[]{"MillenniumPastPrefix", obj}, new Object[]{"MillenniumPastSuffix", obj2}, new Object[]{"MillenniumSingularName", "tísícročie"}, new Object[]{"MillenniumPluralName", "tisícročia"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", obj3}, new Object[]{"MillisecondFutureSuffix", obj2}, new Object[]{"MillisecondPastPrefix", obj}, new Object[]{"MillisecondPastSuffix", obj2}, new Object[]{"MillisecondSingularName", "milisekunda"}, new Object[]{"MillisecondPluralName", "milisekundy"}, new Object[]{"MillisecondPastSingularName", "milisekundou"}, new Object[]{"MillisecondPastPluralName", "milisekundami"}, new Object[]{"MillisecondFutureSingularName", "milisekundu"}, new Object[]{"MillisecondFuturePluralName", "milisekúnd"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", obj3}, new Object[]{"MinuteFutureSuffix", obj2}, new Object[]{"MinutePastPrefix", obj}, new Object[]{"MinutePastSuffix", obj2}, new Object[]{"MinuteSingularName", "minúta"}, new Object[]{"MinutePluralName", "minúty"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", obj3}, new Object[]{"MonthFutureSuffix", obj2}, new Object[]{"MonthPastPrefix", obj}, new Object[]{"MonthPastSuffix", obj2}, new Object[]{"MonthSingularName", "mesiac"}, new Object[]{"MonthPluralName", "mesiace"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", obj3}, new Object[]{"SecondFutureSuffix", obj2}, new Object[]{"SecondPastPrefix", obj}, new Object[]{"SecondPastSuffix", obj2}, new Object[]{"SecondSingularName", "sekunda"}, new Object[]{"SecondPluralName", "sekundy"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", obj3}, new Object[]{"WeekFutureSuffix", obj2}, new Object[]{"WeekPastPrefix", obj}, new Object[]{"WeekPastSuffix", obj2}, new Object[]{"WeekSingularName", "týždeň"}, new Object[]{"WeekPluralName", "týždne"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", obj3}, new Object[]{"YearFutureSuffix", obj2}, new Object[]{"YearPastPrefix", obj}, new Object[]{"YearPastSuffix", obj2}, new Object[]{"YearSingularName", "rok"}, new Object[]{"YearPluralName", "roky"}, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7};
    }

    public f a(g gVar) {
        if (gVar instanceof Minute) {
            return new CsTimeFormatBuilder("Minute").a("minútu", 1).a("minúty", 4).a("minút", Long.MAX_VALUE).c("minútou", 1).c("minútami", Long.MAX_VALUE).d(this);
        }
        if (gVar instanceof Hour) {
            return new CsTimeFormatBuilder("Hour").a("hodinu", 1).a("hodiny", 4).a("hodín", Long.MAX_VALUE).c("hodinou", 1).c("hodinami", Long.MAX_VALUE).d(this);
        }
        if (gVar instanceof Day) {
            return new CsTimeFormatBuilder("Day").a("deň", 1).a("dni", 4).a("dní", Long.MAX_VALUE).c("dňom", 1).c("dňami", Long.MAX_VALUE).d(this);
        }
        if (gVar instanceof Week) {
            return new CsTimeFormatBuilder("Week").a("týždeň", 1).a("týždne", 4).a("týždňov", Long.MAX_VALUE).c("týždňom", 1).c("týždňami", Long.MAX_VALUE).d(this);
        }
        if (gVar instanceof Month) {
            return new CsTimeFormatBuilder("Month").a("mesiac", 1).a("mesiace", 4).a("mesiacov", Long.MAX_VALUE).c("mesiacom", 1).c("mesiacmi", Long.MAX_VALUE).d(this);
        }
        if (gVar instanceof Year) {
            return new CsTimeFormatBuilder("Year").a("rok", 1).a("roky", 4).a("rokov", Long.MAX_VALUE).c("rokom", 1).c("rokmi", Long.MAX_VALUE).d(this);
        }
        return null;
    }

    public Object[][] getContents() {
        return f146188a;
    }
}
