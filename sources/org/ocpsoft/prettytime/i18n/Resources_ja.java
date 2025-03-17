package org.ocpsoft.prettytime.i18n;

import NL.C16126a;
import NL.f;
import NL.g;
import PL.C16214b;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.ocpsoft.prettytime.units.Decade;
import org.ocpsoft.prettytime.units.Millennium;

public class Resources_ja extends ListResourceBundle implements C16214b {

    /* renamed from: b  reason: collision with root package name */
    private static final Object[][] f146154b;

    /* renamed from: a  reason: collision with root package name */
    private final Map<g, f> f146155a = new ConcurrentHashMap();

    private static class JaTimeFormat implements f {

        /* renamed from: a  reason: collision with root package name */
        private String f146156a = "";

        /* renamed from: b  reason: collision with root package name */
        private String f146157b = "";

        /* renamed from: c  reason: collision with root package name */
        private String f146158c = "";

        /* renamed from: d  reason: collision with root package name */
        private String f146159d = "";

        /* renamed from: e  reason: collision with root package name */
        private String f146160e = "";

        /* renamed from: f  reason: collision with root package name */
        private String f146161f = "";

        /* renamed from: g  reason: collision with root package name */
        private String f146162g = "";

        /* renamed from: h  reason: collision with root package name */
        private String f146163h = "";

        /* renamed from: i  reason: collision with root package name */
        private String f146164i = "";

        /* renamed from: j  reason: collision with root package name */
        private String f146165j = "";

        /* renamed from: k  reason: collision with root package name */
        private String f146166k = "";

        /* renamed from: l  reason: collision with root package name */
        private int f146167l = 50;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x00ff */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x011b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0137 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public JaTimeFormat(java.util.ResourceBundle r3, NL.g r4) {
            /*
                r2 = this;
                r2.<init>()
                java.lang.String r0 = ""
                r2.f146156a = r0
                r2.f146157b = r0
                r2.f146158c = r0
                r2.f146159d = r0
                r2.f146160e = r0
                r2.f146161f = r0
                r2.f146162g = r0
                r2.f146163h = r0
                r2.f146164i = r0
                r2.f146165j = r0
                r2.f146166k = r0
                r0 = 50
                r2.f146167l = r0
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.k(r4)
                r0.append(r1)
                java.lang.String r1 = "Pattern"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.getString(r0)
                r2.t(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.k(r4)
                r0.append(r1)
                java.lang.String r1 = "FuturePrefix"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.getString(r0)
                r2.m(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.k(r4)
                r0.append(r1)
                java.lang.String r1 = "FutureSuffix"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.getString(r0)
                r2.o(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.k(r4)
                r0.append(r1)
                java.lang.String r1 = "PastPrefix"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.getString(r0)
                r2.q(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.k(r4)
                r0.append(r1)
                java.lang.String r1 = "PastSuffix"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.getString(r0)
                r2.s(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.k(r4)
                r0.append(r1)
                java.lang.String r1 = "SingularName"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.getString(r0)
                r2.v(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = r2.k(r4)
                r0.append(r1)
                java.lang.String r1 = "PluralName"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r0 = r3.getString(r0)
                r2.u(r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
                r0.<init>()     // Catch:{ Exception -> 0x00ff }
                java.lang.String r1 = r2.k(r4)     // Catch:{ Exception -> 0x00ff }
                r0.append(r1)     // Catch:{ Exception -> 0x00ff }
                java.lang.String r1 = "FuturePluralName"
                r0.append(r1)     // Catch:{ Exception -> 0x00ff }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x00ff }
                java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x00ff }
                r2.l(r0)     // Catch:{ Exception -> 0x00ff }
            L_0x00ff:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011b }
                r0.<init>()     // Catch:{ Exception -> 0x011b }
                java.lang.String r1 = r2.k(r4)     // Catch:{ Exception -> 0x011b }
                r0.append(r1)     // Catch:{ Exception -> 0x011b }
                java.lang.String r1 = "FutureSingularName"
                r0.append(r1)     // Catch:{ Exception -> 0x011b }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x011b }
                java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x011b }
                r2.n(r0)     // Catch:{ Exception -> 0x011b }
            L_0x011b:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0137 }
                r0.<init>()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r1 = r2.k(r4)     // Catch:{ Exception -> 0x0137 }
                r0.append(r1)     // Catch:{ Exception -> 0x0137 }
                java.lang.String r1 = "PastPluralName"
                r0.append(r1)     // Catch:{ Exception -> 0x0137 }
                java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0137 }
                java.lang.String r0 = r3.getString(r0)     // Catch:{ Exception -> 0x0137 }
                r2.p(r0)     // Catch:{ Exception -> 0x0137 }
            L_0x0137:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0153 }
                r0.<init>()     // Catch:{ Exception -> 0x0153 }
                java.lang.String r4 = r2.k(r4)     // Catch:{ Exception -> 0x0153 }
                r0.append(r4)     // Catch:{ Exception -> 0x0153 }
                java.lang.String r4 = "PastSingularName"
                r0.append(r4)     // Catch:{ Exception -> 0x0153 }
                java.lang.String r4 = r0.toString()     // Catch:{ Exception -> 0x0153 }
                java.lang.String r3 = r3.getString(r4)     // Catch:{ Exception -> 0x0153 }
                r2.r(r3)     // Catch:{ Exception -> 0x0153 }
            L_0x0153:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.i18n.Resources_ja.JaTimeFormat.<init>(java.util.ResourceBundle, NL.g):void");
        }

        private String b(String str, String str2, long j10) {
            return f(j10).replaceAll("%s", str).replaceAll("%n", String.valueOf(j10)).replaceAll("%u", str2);
        }

        private String d(C16126a aVar, boolean z10) {
            String i10 = i(aVar);
            String e10 = e(aVar, z10);
            long h10 = h(aVar, z10);
            if (aVar.a() instanceof Decade) {
                h10 *= 10;
            }
            if (aVar.a() instanceof Millennium) {
                h10 *= 1000;
            }
            return b(i10, e10, h10);
        }

        private String g(C16126a aVar) {
            return (!aVar.b() || this.f146159d == null || this.f146158c.length() <= 0) ? (!aVar.d() || this.f146161f == null || this.f146160e.length() <= 0) ? this.f146157b : this.f146161f : this.f146159d;
        }

        private String i(C16126a aVar) {
            return aVar.e() < 0 ? "-" : "";
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            r2 = r1.f146160e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private java.lang.String j(NL.C16126a r2) {
            /*
                r1 = this;
                boolean r0 = r2.b()
                if (r0 == 0) goto L_0x0013
                java.lang.String r0 = r1.f146158c
                if (r0 == 0) goto L_0x0013
                int r0 = r0.length()
                if (r0 <= 0) goto L_0x0013
                java.lang.String r2 = r1.f146158c
                return r2
            L_0x0013:
                boolean r2 = r2.d()
                if (r2 == 0) goto L_0x0026
                java.lang.String r2 = r1.f146160e
                if (r2 == 0) goto L_0x0026
                int r2 = r2.length()
                if (r2 <= 0) goto L_0x0026
                java.lang.String r2 = r1.f146160e
                return r2
            L_0x0026:
                java.lang.String r2 = r1.f146156a
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.ocpsoft.prettytime.i18n.Resources_ja.JaTimeFormat.j(NL.a):java.lang.String");
        }

        private String k(g gVar) {
            return gVar.getClass().getSimpleName();
        }

        public String a(C16126a aVar, String str) {
            StringBuilder sb2 = new StringBuilder();
            if (aVar.d()) {
                sb2.append(this.f146165j);
                sb2.append(str);
                sb2.append(this.f146166k);
            } else {
                sb2.append(this.f146163h);
                sb2.append(str);
                sb2.append(this.f146164i);
            }
            return sb2.toString().replaceAll("\\s+", " ").trim();
        }

        public String c(C16126a aVar) {
            return d(aVar, true);
        }

        /* access modifiers changed from: protected */
        public String e(C16126a aVar, boolean z10) {
            return (Math.abs(h(aVar, z10)) == 0 || Math.abs(h(aVar, z10)) > 1) ? g(aVar) : j(aVar);
        }

        /* access modifiers changed from: protected */
        public String f(long j10) {
            return this.f146162g;
        }

        /* access modifiers changed from: protected */
        public long h(C16126a aVar, boolean z10) {
            return Math.abs(z10 ? aVar.c(this.f146167l) : aVar.e());
        }

        public JaTimeFormat l(String str) {
            this.f146159d = str;
            return this;
        }

        public JaTimeFormat m(String str) {
            this.f146163h = str.trim();
            return this;
        }

        public JaTimeFormat n(String str) {
            this.f146158c = str;
            return this;
        }

        public JaTimeFormat o(String str) {
            this.f146164i = str.trim();
            return this;
        }

        public JaTimeFormat p(String str) {
            this.f146161f = str;
            return this;
        }

        public JaTimeFormat q(String str) {
            this.f146165j = str.trim();
            return this;
        }

        public JaTimeFormat r(String str) {
            this.f146160e = str;
            return this;
        }

        public JaTimeFormat s(String str) {
            this.f146166k = str.trim();
            return this;
        }

        public JaTimeFormat t(String str) {
            this.f146162g = str;
            return this;
        }

        public String toString() {
            return "JaTimeFormat [pattern=" + this.f146162g + ", futurePrefix=" + this.f146163h + ", futureSuffix=" + this.f146164i + ", pastPrefix=" + this.f146165j + ", pastSuffix=" + this.f146166k + ", roundingTolerance=" + this.f146167l + "]";
        }

        public JaTimeFormat u(String str) {
            this.f146157b = str;
            return this;
        }

        public JaTimeFormat v(String str) {
            this.f146156a = str;
            return this;
        }
    }

    static {
        Object obj = "前";
        Object obj2 = "";
        Object obj3 = "後";
        Object obj4 = "今から";
        Object[] objArr = {"AbstractTimeUnitPattern", obj2};
        Object[] objArr2 = {"AbstractTimeUnitFuturePrefix", obj2};
        Object[] objArr3 = {"AbstractTimeUnitFutureSuffix", obj2};
        Object[] objArr4 = {"AbstractTimeUnitPastPrefix", obj2};
        Object[] objArr5 = {"AbstractTimeUnitPastSuffix", obj2};
        Object[] objArr6 = {"AbstractTimeUnitSingularName", obj2};
        Object[] objArr7 = {"AbstractTimeUnitPluralName", obj2};
        f146154b = new Object[][]{new Object[]{"CenturyPattern", "%n%u"}, new Object[]{"CenturyFuturePrefix", "今から"}, new Object[]{"CenturyFutureSuffix", "後"}, new Object[]{"CenturyPastPrefix", ""}, new Object[]{"CenturyPastSuffix", "前"}, new Object[]{"CenturySingularName", "世紀"}, new Object[]{"CenturyPluralName", "世紀"}, new Object[]{"DayPattern", "%n%u"}, new Object[]{"DayFuturePrefix", "今から"}, new Object[]{"DayFutureSuffix", "後"}, new Object[]{"DayPastPrefix", ""}, new Object[]{"DayPastSuffix", obj}, new Object[]{"DaySingularName", "日"}, new Object[]{"DayPluralName", "日"}, new Object[]{"DecadePattern", "%n%u"}, new Object[]{"DecadeFuturePrefix", obj4}, new Object[]{"DecadeFutureSuffix", obj3}, new Object[]{"DecadePastPrefix", obj2}, new Object[]{"DecadePastSuffix", obj}, new Object[]{"DecadeSingularName", "年"}, new Object[]{"DecadePluralName", "年"}, new Object[]{"HourPattern", "%n%u"}, new Object[]{"HourFuturePrefix", obj4}, new Object[]{"HourFutureSuffix", obj3}, new Object[]{"HourPastPrefix", obj2}, new Object[]{"HourPastSuffix", obj}, new Object[]{"HourSingularName", "時間"}, new Object[]{"HourPluralName", "時間"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", obj4}, new Object[]{"JustNowFutureSuffix", "すぐ"}, new Object[]{"JustNowPastPrefix", obj2}, new Object[]{"JustNowPastSuffix", "たった今"}, new Object[]{"JustNowSingularName", obj2}, new Object[]{"JustNowPluralName", obj2}, new Object[]{"MillenniumPattern", "%n%u"}, new Object[]{"MillenniumFuturePrefix", obj4}, new Object[]{"MillenniumFutureSuffix", obj3}, new Object[]{"MillenniumPastPrefix", obj2}, new Object[]{"MillenniumPastSuffix", obj}, new Object[]{"MillenniumSingularName", "年"}, new Object[]{"MillenniumPluralName", "年"}, new Object[]{"MillisecondPattern", "%n%u"}, new Object[]{"MillisecondFuturePrefix", obj4}, new Object[]{"MillisecondFutureSuffix", obj3}, new Object[]{"MillisecondPastPrefix", obj2}, new Object[]{"MillisecondPastSuffix", obj}, new Object[]{"MillisecondSingularName", "ミリ秒"}, new Object[]{"MillisecondPluralName", "ミリ秒"}, new Object[]{"MinutePattern", "%n%u"}, new Object[]{"MinuteFuturePrefix", obj4}, new Object[]{"MinuteFutureSuffix", obj3}, new Object[]{"MinutePastPrefix", obj2}, new Object[]{"MinutePastSuffix", obj}, new Object[]{"MinuteSingularName", "分"}, new Object[]{"MinutePluralName", "分"}, new Object[]{"MonthPattern", "%n%u"}, new Object[]{"MonthFuturePrefix", obj4}, new Object[]{"MonthFutureSuffix", obj3}, new Object[]{"MonthPastPrefix", obj2}, new Object[]{"MonthPastSuffix", obj}, new Object[]{"MonthSingularName", "ヶ月"}, new Object[]{"MonthPluralName", "ヶ月"}, new Object[]{"SecondPattern", "%n%u"}, new Object[]{"SecondFuturePrefix", obj4}, new Object[]{"SecondFutureSuffix", obj3}, new Object[]{"SecondPastPrefix", obj2}, new Object[]{"SecondPastSuffix", obj}, new Object[]{"SecondSingularName", "秒"}, new Object[]{"SecondPluralName", "秒"}, new Object[]{"WeekPattern", "%n%u"}, new Object[]{"WeekFuturePrefix", obj4}, new Object[]{"WeekFutureSuffix", obj3}, new Object[]{"WeekPastPrefix", obj2}, new Object[]{"WeekPastSuffix", obj}, new Object[]{"WeekSingularName", "週間"}, new Object[]{"WeekPluralName", "週間"}, new Object[]{"YearPattern", "%n%u"}, new Object[]{"YearFuturePrefix", obj4}, new Object[]{"YearFutureSuffix", obj3}, new Object[]{"YearPastPrefix", obj2}, new Object[]{"YearPastSuffix", obj}, new Object[]{"YearSingularName", "年"}, new Object[]{"YearPluralName", "年"}, objArr, objArr2, objArr3, objArr4, objArr5, objArr6, objArr7};
    }

    /* access modifiers changed from: private */
    public /* synthetic */ f c(g gVar) {
        return new JaTimeFormat(this, gVar);
    }

    public f a(g gVar) {
        return this.f146155a.computeIfAbsent(gVar, new c(this));
    }

    public Object[][] getContents() {
        return f146154b;
    }
}
