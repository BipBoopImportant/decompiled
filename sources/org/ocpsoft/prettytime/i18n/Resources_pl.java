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

public class Resources_pl extends ListResourceBundle implements C16214b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[][] f146179a;

    private static class TimeFormatAided implements f {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f146181a;

        public TimeFormatAided(String... strArr) {
            if (strArr.length == 3) {
                this.f146181a = strArr;
                return;
            }
            throw new IllegalArgumentException("Wrong plural forms number for Polish language!");
        }

        private String b(boolean z10, boolean z11, long j10, String str) {
            char c10;
            if (j10 == 1) {
                c10 = 0;
            } else {
                long j11 = j10 % 10;
                if (j11 >= 2 && j11 <= 4) {
                    long j12 = j10 % 100;
                    if (j12 < 10 || j12 >= 20) {
                        c10 = 1;
                    }
                }
                c10 = 2;
            }
            if (c10 <= 3) {
                StringBuilder sb2 = new StringBuilder();
                if (z11) {
                    sb2.append("za ");
                }
                sb2.append(str);
                sb2.append(' ');
                sb2.append(this.f146181a[c10]);
                if (z10) {
                    sb2.append(" temu");
                }
                return sb2.toString();
            }
            throw new IllegalStateException("Wrong plural index was calculated somehow for Polish language");
        }

        public String a(C16126a aVar, String str) {
            return b(aVar.d(), aVar.b(), aVar.c(50), str);
        }

        public String c(C16126a aVar) {
            return String.valueOf(aVar.c(50));
        }
    }

    static {
        int[] iArr = new int[2];
        iArr[1] = 0;
        iArr[0] = 0;
        f146179a = (Object[][]) Array.newInstance(Object.class, iArr);
    }

    public f a(g gVar) {
        if (gVar instanceof JustNow) {
            return new f() {
                private String b(C16126a aVar) {
                    if (aVar.b()) {
                        return "za chwilę";
                    }
                    if (aVar.d()) {
                        return "przed chwilą";
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
            return new TimeFormatAided("wiek", "wieki", "wieków");
        }
        if (gVar instanceof Day) {
            return new TimeFormatAided("dzień", "dni", "dni");
        }
        if (gVar instanceof Decade) {
            return new TimeFormatAided("dekadę", "dekady", "dekad");
        }
        if (gVar instanceof Hour) {
            return new TimeFormatAided("godzinę", "godziny", "godzin");
        }
        if (gVar instanceof Millennium) {
            return new TimeFormatAided("milenium", "milenia", "mileniów");
        }
        if (gVar instanceof Millisecond) {
            return new TimeFormatAided("milisekundę", "milisekundy", "milisekund");
        }
        if (gVar instanceof Minute) {
            return new TimeFormatAided("minutę", "minuty", "minut");
        }
        if (gVar instanceof Month) {
            return new TimeFormatAided("miesiąc", "miesiące", "miesięcy");
        }
        if (gVar instanceof Second) {
            return new TimeFormatAided("sekundę", "sekundy", "sekund");
        }
        if (gVar instanceof Week) {
            return new TimeFormatAided("tydzień", "tygodnie", "tygodni");
        }
        if (gVar instanceof Year) {
            return new TimeFormatAided("rok", "lata", "lat");
        }
        return null;
    }

    public Object[][] getContents() {
        return f146179a;
    }
}
