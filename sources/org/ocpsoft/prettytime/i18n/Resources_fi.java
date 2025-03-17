package org.ocpsoft.prettytime.i18n;

import NL.C16126a;
import NL.f;
import NL.g;
import OL.C16182a;
import PL.C16214b;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.concurrent.ConcurrentHashMap;
import org.ocpsoft.prettytime.units.Day;

public class Resources_fi extends ListResourceBundle implements C16214b {

    /* renamed from: b  reason: collision with root package name */
    private static Object[][] f146130b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<g, f> f146131a = new ConcurrentHashMap();

    private static class FiTimeFormat extends C16182a {

        /* renamed from: o  reason: collision with root package name */
        private final ResourceBundle f146132o;

        /* renamed from: p  reason: collision with root package name */
        private String f146133p = "";

        /* renamed from: q  reason: collision with root package name */
        private String f146134q = "";

        /* renamed from: r  reason: collision with root package name */
        private String f146135r = "";

        /* renamed from: s  reason: collision with root package name */
        private String f146136s = "";

        /* renamed from: t  reason: collision with root package name */
        private String f146137t = "";

        public FiTimeFormat(ResourceBundle resourceBundle, g gVar) {
            this.f146132o = resourceBundle;
            if (resourceBundle.containsKey(E(gVar) + "PastSingularName")) {
                FiTimeFormat H10 = H(resourceBundle.getString(E(gVar) + "PastSingularName"));
                FiTimeFormat F10 = H10.F(resourceBundle.getString(E(gVar) + "FutureSingularName"));
                FiTimeFormat I10 = F10.I(resourceBundle.getString(E(gVar) + "PastSingularName"));
                FiTimeFormat G10 = I10.G(resourceBundle.getString(E(gVar) + "FutureSingularName"));
                G10.J(resourceBundle.getString(E(gVar) + "Pattern"));
                if (resourceBundle.containsKey(E(gVar) + "PastPluralName")) {
                    I(resourceBundle.getString(E(gVar) + "PastPluralName"));
                }
                if (resourceBundle.containsKey(E(gVar) + "FuturePluralName")) {
                    G(resourceBundle.getString(E(gVar) + "FuturePluralName"));
                }
                if (resourceBundle.containsKey(E(gVar) + "PluralPattern")) {
                    J(resourceBundle.getString(E(gVar) + "PluralPattern"));
                }
                C16182a w10 = w(resourceBundle.getString(E(gVar) + "Pattern"));
                C16182a v10 = w10.v(resourceBundle.getString(E(gVar) + "PastSuffix"));
                v10.q(resourceBundle.getString(E(gVar) + "FutureSuffix")).o("").t("").y("").x("");
            }
        }

        private String E(g gVar) {
            return gVar.getClass().getSimpleName();
        }

        public String A() {
            return this.f146136s;
        }

        public String B() {
            return this.f146133p;
        }

        public String C() {
            return this.f146135r;
        }

        public String D() {
            return this.f146137t;
        }

        public FiTimeFormat F(String str) {
            this.f146134q = str;
            return this;
        }

        public FiTimeFormat G(String str) {
            this.f146136s = str;
            return this;
        }

        public FiTimeFormat H(String str) {
            this.f146133p = str;
            return this;
        }

        public FiTimeFormat I(String str) {
            this.f146135r = str;
            return this;
        }

        public FiTimeFormat J(String str) {
            this.f146137t = str;
            return this;
        }

        public String a(C16126a aVar, String str) {
            return (!(aVar.a() instanceof Day) || Math.abs(aVar.c(50)) != 1) ? super.a(aVar, str) : str;
        }

        /* access modifiers changed from: protected */
        public String f(C16126a aVar, boolean z10) {
            String B10 = aVar.d() ? B() : z();
            if (Math.abs(j(aVar, z10)) != 0 && Math.abs(j(aVar, z10)) <= 1) {
                return B10;
            }
            return aVar.d() ? C() : A();
        }

        /* access modifiers changed from: protected */
        public String h(long j10) {
            return Math.abs(j10) == 1 ? g() : D();
        }

        public String z() {
            return this.f146134q;
        }
    }

    static {
        Object obj = "%n %u";
        Object obj2 = "päästä";
        Object obj3 = "sitten";
        Object[] objArr = {"MillenniumPastSuffix", obj3};
        Object[] objArr2 = {"MillenniumFutureSuffix", obj2};
        f146130b = new Object[][]{new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowPastSingularName", "hetki"}, new Object[]{"JustNowFutureSingularName", "hetken"}, new Object[]{"JustNowPastSuffix", "sitten"}, new Object[]{"JustNowFutureSuffix", "päästä"}, new Object[]{"MillisecondPattern", "%u"}, new Object[]{"MillisecondPluralPattern", "%n %u"}, new Object[]{"MillisecondPastSingularName", "millisekunti"}, new Object[]{"MillisecondPastPluralName", "millisekuntia"}, new Object[]{"MillisecondFutureSingularName", "millisekunnin"}, new Object[]{"MillisecondPastSuffix", "sitten"}, new Object[]{"MillisecondFutureSuffix", "päästä"}, new Object[]{"SecondPattern", "%u"}, new Object[]{"SecondPluralPattern", obj}, new Object[]{"SecondPastSingularName", "sekunti"}, new Object[]{"SecondPastPluralName", "sekuntia"}, new Object[]{"SecondFutureSingularName", "sekunnin"}, new Object[]{"SecondPastSuffix", obj3}, new Object[]{"SecondFutureSuffix", obj2}, new Object[]{"MinutePattern", "%u"}, new Object[]{"MinutePluralPattern", obj}, new Object[]{"MinutePastSingularName", "minuutti"}, new Object[]{"MinutePastPluralName", "minuuttia"}, new Object[]{"MinuteFutureSingularName", "minuutin"}, new Object[]{"MinutePastSuffix", obj3}, new Object[]{"MinuteFutureSuffix", obj2}, new Object[]{"HourPattern", "%u"}, new Object[]{"HourPluralPattern", obj}, new Object[]{"HourPastSingularName", "tunti"}, new Object[]{"HourPastPluralName", "tuntia"}, new Object[]{"HourFutureSingularName", "tunnin"}, new Object[]{"HourPastSuffix", obj3}, new Object[]{"HourFutureSuffix", obj2}, new Object[]{"DayPattern", "%u"}, new Object[]{"DayPluralPattern", obj}, new Object[]{"DayPastSingularName", "eilen"}, new Object[]{"DayPastPluralName", "päivää"}, new Object[]{"DayFutureSingularName", "huomenna"}, new Object[]{"DayFuturePluralName", "päivän"}, new Object[]{"DayPastSuffix", obj3}, new Object[]{"DayFutureSuffix", obj2}, new Object[]{"WeekPattern", "%u"}, new Object[]{"WeekPluralPattern", obj}, new Object[]{"WeekPastSingularName", "viikko"}, new Object[]{"WeekPastPluralName", "viikkoa"}, new Object[]{"WeekFutureSingularName", "viikon"}, new Object[]{"WeekFuturePluralName", "viikon"}, new Object[]{"WeekPastSuffix", obj3}, new Object[]{"WeekFutureSuffix", obj2}, new Object[]{"MonthPattern", "%u"}, new Object[]{"MonthPluralPattern", obj}, new Object[]{"MonthPastSingularName", "kuukausi"}, new Object[]{"MonthPastPluralName", "kuukautta"}, new Object[]{"MonthFutureSingularName", "kuukauden"}, new Object[]{"MonthPastSuffix", obj3}, new Object[]{"MonthFutureSuffix", obj2}, new Object[]{"YearPattern", "%u"}, new Object[]{"YearPluralPattern", obj}, new Object[]{"YearPastSingularName", "vuosi"}, new Object[]{"YearPastPluralName", "vuotta"}, new Object[]{"YearFutureSingularName", "vuoden"}, new Object[]{"YearPastSuffix", obj3}, new Object[]{"YearFutureSuffix", obj2}, new Object[]{"DecadePattern", "%u"}, new Object[]{"DecadePluralPattern", obj}, new Object[]{"DecadePastSingularName", "vuosikymmen"}, new Object[]{"DecadePastPluralName", "vuosikymmentä"}, new Object[]{"DecadeFutureSingularName", "vuosikymmenen"}, new Object[]{"DecadePastSuffix", obj3}, new Object[]{"DecadeFutureSuffix", obj2}, new Object[]{"CenturyPattern", "%u"}, new Object[]{"CenturyPluralPattern", obj}, new Object[]{"CenturyPastSingularName", "vuosisata"}, new Object[]{"CenturyPastPluralName", "vuosisataa"}, new Object[]{"CenturyFutureSingularName", "vuosisadan"}, new Object[]{"CenturyPastSuffix", obj3}, new Object[]{"CenturyFutureSuffix", obj2}, new Object[]{"MillenniumPattern", "%u"}, new Object[]{"MillenniumPluralPattern", obj}, new Object[]{"MillenniumPastSingularName", "vuosituhat"}, new Object[]{"MillenniumPastPluralName", "vuosituhatta"}, new Object[]{"MillenniumFutureSingularName", "vuosituhannen"}, objArr, objArr2};
    }

    /* access modifiers changed from: private */
    public /* synthetic */ f c(g gVar) {
        return new FiTimeFormat(this, gVar);
    }

    public f a(g gVar) {
        return this.f146131a.computeIfAbsent(gVar, new b(this));
    }

    /* access modifiers changed from: protected */
    public Object[][] getContents() {
        return f146130b;
    }
}
