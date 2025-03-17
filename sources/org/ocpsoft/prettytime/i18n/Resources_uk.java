package org.ocpsoft.prettytime.i18n;

import NL.C16126a;
import NL.f;
import NL.g;
import PL.C16214b;
import java.lang.reflect.Array;
import java.util.ListResourceBundle;
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

public class Resources_uk extends ListResourceBundle implements C16214b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[][] f146204a;

    private static class TimeFormatAided implements f {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f146206a;

        public TimeFormatAided(String... strArr) {
            if (strArr.length == 3) {
                this.f146206a = strArr;
                return;
            }
            throw new IllegalArgumentException("Wrong plural forms number for slavic language!");
        }

        private String b(boolean z10, boolean z11, long j10, String str) {
            char c10;
            long j11 = j10 % 10;
            if (j11 != 1 || j10 % 100 == 11) {
                if (j11 >= 2 && j11 <= 4) {
                    long j12 = j10 % 100;
                    if (j12 < 10 || j12 >= 20) {
                        c10 = 1;
                    }
                }
                c10 = 2;
            } else {
                c10 = 0;
            }
            if (c10 <= 3) {
                StringBuilder sb2 = new StringBuilder();
                if (z11) {
                    sb2.append("через ");
                }
                sb2.append(str);
                sb2.append(' ');
                sb2.append(this.f146206a[c10]);
                if (z10) {
                    sb2.append(" тому");
                }
                return sb2.toString();
            }
            throw new IllegalStateException("Wrong plural index was calculated somehow for slavic language");
        }

        public String a(C16126a aVar, String str) {
            return b(aVar.d(), aVar.b(), aVar.c(50), str);
        }

        public String c(C16126a aVar) {
            long c10 = aVar.c(50);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(c10);
            return sb2.toString();
        }
    }

    static {
        int[] iArr = new int[2];
        iArr[1] = 0;
        iArr[0] = 0;
        f146204a = (Object[][]) Array.newInstance(Object.class, iArr);
    }

    public f a(g gVar) {
        if (gVar instanceof JustNow) {
            return new f() {
                private String b(C16126a aVar) {
                    if (aVar.b()) {
                        return "зараз";
                    }
                    if (aVar.d()) {
                        return "щойно";
                    }
                    return null;
                }

                public String a(C16126a aVar, String str) {
                    return str;
                }

                public String c(C16126a aVar) {
                    return b(aVar);
                }
            };
        }
        if (gVar instanceof Century) {
            return new TimeFormatAided("століття", "століття", "столітть");
        }
        if (gVar instanceof Day) {
            return new TimeFormatAided("день", "дні", "днів");
        }
        if (gVar instanceof Decade) {
            return new TimeFormatAided("десятиліття", "десятиліття", "десятиліть");
        }
        if (gVar instanceof Hour) {
            return new TimeFormatAided("годину", "години", "годин");
        }
        if (gVar instanceof Millennium) {
            return new TimeFormatAided("тисячоліття", "тисячоліття", "тисячоліть");
        }
        if (gVar instanceof Millisecond) {
            return new TimeFormatAided("мілісекунду", "мілісекунди", "мілісекунд");
        }
        if (gVar instanceof Minute) {
            return new TimeFormatAided("хвилину", "хвилини", "хвилин");
        }
        if (gVar instanceof Month) {
            return new TimeFormatAided("місяць", "місяці", "місяців");
        }
        if (gVar instanceof Second) {
            return new TimeFormatAided("секунду", "секунди", "секунд");
        }
        if (gVar instanceof Week) {
            return new TimeFormatAided("тиждень", "тижні", "тижнів");
        }
        if (gVar instanceof Year) {
            return new TimeFormatAided("рік", "роки", "років");
        }
        return null;
    }

    public Object[][] getContents() {
        return f146204a;
    }
}
