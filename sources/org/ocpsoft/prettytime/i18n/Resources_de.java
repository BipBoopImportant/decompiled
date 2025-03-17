package org.ocpsoft.prettytime.i18n;

import NL.C16126a;
import NL.f;
import NL.g;
import OL.C16182a;
import PL.C16214b;
import com.sugarcube.core.logger.DslKt;
import java.util.ListResourceBundle;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Resources_de extends ListResourceBundle implements C16214b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[][] f146121a;

    private static class DeTimeFormat extends C16182a {

        /* renamed from: o  reason: collision with root package name */
        private static final Map<String, String> f146122o;

        /* renamed from: p  reason: collision with root package name */
        private static final Pattern f146123p;

        static {
            Map<String, String> map = (Map) Stream.of(new String[]{"Jahrtausende", "Jahrhunderte", "Jahrzehnte", "Jahre", "Monate", "Tage"}).collect(Collectors.toMap(Function.identity(), new a()));
            f146122o = map;
            f146123p = Pattern.compile("\\b(" + String.join(DslKt.INDICATOR_SEPARATOR, map.keySet()) + ")\\b");
        }

        public DeTimeFormat(ResourceBundle resourceBundle, g gVar) {
            String simpleName = gVar.getClass().getSimpleName();
            w(resourceBundle.getString(simpleName + "Pattern"));
            o(resourceBundle.getString(simpleName + "FuturePrefix"));
            q(resourceBundle.getString(simpleName + "FutureSuffix"));
            t(resourceBundle.getString(simpleName + "PastPrefix"));
            v(resourceBundle.getString(simpleName + "PastSuffix"));
            y(resourceBundle.getString(simpleName + "SingularName"));
            x(resourceBundle.getString(simpleName + "PluralName"));
        }

        private String A(String str) {
            Matcher matcher = f146123p.matcher(str);
            StringBuffer stringBuffer = new StringBuffer();
            while (matcher.find()) {
                matcher.appendReplacement(stringBuffer, f146122o.get(matcher.group(1)));
            }
            matcher.appendTail(stringBuffer);
            return stringBuffer.toString();
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ String B(String str) {
            return str + "n";
        }

        public String a(C16126a aVar, String str) {
            return super.a(aVar, A(str));
        }
    }

    static {
        Object obj = "vor ";
        Object obj2 = "";
        Object obj3 = "in ";
        f146121a = new Object[][]{new Object[]{"CenturyPattern", "%n %u"}, new Object[]{"CenturyFuturePrefix", "in "}, new Object[]{"CenturyFutureSuffix", ""}, new Object[]{"CenturyPastPrefix", "vor "}, new Object[]{"CenturyPastSuffix", ""}, new Object[]{"CenturySingularName", "Jahrhundert"}, new Object[]{"CenturyPluralName", "Jahrhunderte"}, new Object[]{"DayPattern", "%n %u"}, new Object[]{"DayFuturePrefix", "in "}, new Object[]{"DayFutureSuffix", ""}, new Object[]{"DayPastPrefix", "vor "}, new Object[]{"DayPastSuffix", ""}, new Object[]{"DaySingularName", "Tag"}, new Object[]{"DayPluralName", "Tage"}, new Object[]{"DecadePattern", "%n %u"}, new Object[]{"DecadeFuturePrefix", obj3}, new Object[]{"DecadeFutureSuffix", obj2}, new Object[]{"DecadePastPrefix", obj}, new Object[]{"DecadePastSuffix", obj2}, new Object[]{"DecadeSingularName", "Jahrzehnt"}, new Object[]{"DecadePluralName", "Jahrzehnte"}, new Object[]{"HourPattern", "%n %u"}, new Object[]{"HourFuturePrefix", obj3}, new Object[]{"HourFutureSuffix", obj2}, new Object[]{"HourPastPrefix", obj}, new Object[]{"HourPastSuffix", obj2}, new Object[]{"HourSingularName", "Stunde"}, new Object[]{"HourPluralName", "Stunden"}, new Object[]{"JustNowPattern", "%u"}, new Object[]{"JustNowFuturePrefix", "Jetzt"}, new Object[]{"JustNowFutureSuffix", obj2}, new Object[]{"JustNowPastPrefix", "gerade eben"}, new Object[]{"JustNowPastSuffix", obj2}, new Object[]{"JustNowSingularName", obj2}, new Object[]{"JustNowPluralName", obj2}, new Object[]{"MillenniumPattern", "%n %u"}, new Object[]{"MillenniumFuturePrefix", obj3}, new Object[]{"MillenniumFutureSuffix", obj2}, new Object[]{"MillenniumPastPrefix", obj}, new Object[]{"MillenniumPastSuffix", obj2}, new Object[]{"MillenniumSingularName", "Jahrtausend"}, new Object[]{"MillenniumPluralName", "Jahrtausende"}, new Object[]{"MillisecondPattern", "%n %u"}, new Object[]{"MillisecondFuturePrefix", obj3}, new Object[]{"MillisecondFutureSuffix", obj2}, new Object[]{"MillisecondPastPrefix", obj}, new Object[]{"MillisecondPastSuffix", obj2}, new Object[]{"MillisecondSingularName", "Millisekunde"}, new Object[]{"MillisecondPluralName", "Millisekunden"}, new Object[]{"MinutePattern", "%n %u"}, new Object[]{"MinuteFuturePrefix", obj3}, new Object[]{"MinuteFutureSuffix", obj2}, new Object[]{"MinutePastPrefix", obj}, new Object[]{"MinutePastSuffix", obj2}, new Object[]{"MinuteSingularName", "Minute"}, new Object[]{"MinutePluralName", "Minuten"}, new Object[]{"MonthPattern", "%n %u"}, new Object[]{"MonthFuturePrefix", obj3}, new Object[]{"MonthFutureSuffix", obj2}, new Object[]{"MonthPastPrefix", obj}, new Object[]{"MonthPastSuffix", obj2}, new Object[]{"MonthSingularName", "Monat"}, new Object[]{"MonthPluralName", "Monate"}, new Object[]{"SecondPattern", "%n %u"}, new Object[]{"SecondFuturePrefix", obj3}, new Object[]{"SecondFutureSuffix", obj2}, new Object[]{"SecondPastPrefix", obj}, new Object[]{"SecondPastSuffix", obj2}, new Object[]{"SecondSingularName", "Sekunde"}, new Object[]{"SecondPluralName", "Sekunden"}, new Object[]{"WeekPattern", "%n %u"}, new Object[]{"WeekFuturePrefix", obj3}, new Object[]{"WeekFutureSuffix", obj2}, new Object[]{"WeekPastPrefix", obj}, new Object[]{"WeekPastSuffix", obj2}, new Object[]{"WeekSingularName", "Woche"}, new Object[]{"WeekPluralName", "Wochen"}, new Object[]{"YearPattern", "%n %u"}, new Object[]{"YearFuturePrefix", obj3}, new Object[]{"YearFutureSuffix", obj2}, new Object[]{"YearPastPrefix", obj}, new Object[]{"YearPastSuffix", obj2}, new Object[]{"YearSingularName", "Jahr"}, new Object[]{"YearPluralName", "Jahre"}, new Object[]{"AbstractTimeUnitPattern", obj2}, new Object[]{"AbstractTimeUnitFuturePrefix", obj2}, new Object[]{"AbstractTimeUnitFutureSuffix", obj2}, new Object[]{"AbstractTimeUnitPastPrefix", obj2}, new Object[]{"AbstractTimeUnitPastSuffix", obj2}, new Object[]{"AbstractTimeUnitSingularName", obj2}, new Object[]{"AbstractTimeUnitPluralName", obj2}};
    }

    public f a(g gVar) {
        return new DeTimeFormat(this, gVar);
    }

    /* access modifiers changed from: protected */
    public Object[][] getContents() {
        return f146121a;
    }
}
