package org.ocpsoft.prettytime.i18n;

import NL.C16126a;
import NL.f;
import NL.g;
import PL.C16214b;
import java.lang.reflect.Array;
import java.util.Arrays;
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

public class Resources_ru extends ListResourceBundle implements C16214b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[][] f146184a;

    private class TimeFormatAided implements f {

        /* renamed from: a  reason: collision with root package name */
        private final String[] f146186a;

        public TimeFormatAided(String... strArr) {
            if (strArr.length == 4) {
                this.f146186a = strArr;
                return;
            }
            throw new IllegalArgumentException(String.format("Wrong plural forms number for russian language! Expected %s, got %s\nPlurals: %s", new Object[]{4, Integer.valueOf(strArr.length), Arrays.toString(strArr)}));
        }

        public String a(C16126a aVar, String str) {
            return e(aVar, true) ? b(aVar, d(Math.abs(aVar.c(50)), false)) : b(aVar, str);
        }

        public String b(C16126a aVar, String str) {
            if (aVar.b()) {
                return "через " + str;
            } else if (!aVar.d()) {
                return str;
            } else {
                return str + " назад";
            }
        }

        public String c(C16126a aVar) {
            return d(Math.abs(aVar.c(50)), true);
        }

        public String d(long j10, boolean z10) {
            int i10;
            long j11 = j10 % 10;
            if (j11 != 1 || j10 % 100 == 11) {
                if (j11 >= 2 && j11 <= 4) {
                    long j12 = j10 % 100;
                    if (j12 < 10 || j12 >= 20) {
                        i10 = 1;
                    }
                }
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (i10 <= 4) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(String.valueOf(j10));
                sb2.append(' ');
                String[] strArr = this.f146186a;
                if (!z10 || i10 != 0) {
                    i10++;
                }
                sb2.append(strArr[i10]);
                return sb2.toString();
            }
            throw new IllegalStateException("Wrong plural index was calculated somehow for russian language");
        }

        public boolean e(C16126a aVar, boolean z10) {
            return Math.abs(z10 ? aVar.c(50) : aVar.e()) == 1;
        }
    }

    static {
        int[] iArr = new int[2];
        iArr[1] = 0;
        iArr[0] = 0;
        f146184a = (Object[][]) Array.newInstance(Object.class, iArr);
    }

    public f a(g gVar) {
        if (gVar instanceof JustNow) {
            return new f() {
                private String b(C16126a aVar) {
                    if (aVar.b()) {
                        return "сейчас";
                    }
                    if (aVar.d()) {
                        return "только что";
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
            return new TimeFormatAided("век", "век", "века", "веков");
        }
        if (gVar instanceof Day) {
            return new TimeFormatAided("день", "день", "дня", "дней");
        }
        if (gVar instanceof Decade) {
            return new TimeFormatAided("десятилетие", "десятилетие", "десятилетия", "десятилетий");
        }
        if (gVar instanceof Hour) {
            return new TimeFormatAided("час", "час", "часа", "часов");
        }
        if (gVar instanceof Millennium) {
            return new TimeFormatAided("тысячелетие", "тысячелетие", "тысячелетия", "тысячелетий");
        }
        if (gVar instanceof Millisecond) {
            return new TimeFormatAided("миллисекунда", "миллисекунду", "миллисекунды", "миллисекунд");
        }
        if (gVar instanceof Minute) {
            return new TimeFormatAided("минута", "минуту", "минуты", "минут");
        }
        if (gVar instanceof Month) {
            return new TimeFormatAided("месяц", "месяц", "месяца", "месяцев");
        }
        if (gVar instanceof Second) {
            return new TimeFormatAided("секунда", "секунду", "секунды", "секунд");
        }
        if (gVar instanceof Week) {
            return new TimeFormatAided("неделя", "неделю", "недели", "недель");
        }
        if (gVar instanceof Year) {
            return new TimeFormatAided("год", "год", "года", "лет");
        }
        return null;
    }

    public Object[][] getContents() {
        return f146184a;
    }
}
