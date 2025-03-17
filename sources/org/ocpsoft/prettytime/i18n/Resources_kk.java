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

public class Resources_kk extends ListResourceBundle implements C16214b {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[][] f146168a;

    private static class KkTimeFormat implements f {

        /* renamed from: a  reason: collision with root package name */
        private final int f146170a = 50;

        /* renamed from: b  reason: collision with root package name */
        private final String[] f146171b;

        public KkTimeFormat(String... strArr) {
            if (strArr.length == 2) {
                this.f146171b = strArr;
                return;
            }
            throw new IllegalArgumentException("Future and past forms must be provided for kazakh language!");
        }

        private String b(boolean z10, boolean z11, long j10, String str) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(' ');
            sb2.append(this.f146171b[!z10]);
            sb2.append(' ');
            if (z10) {
                sb2.append("бұрын");
            }
            if (z11) {
                sb2.append("кейін");
            }
            return sb2.toString();
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
        f146168a = (Object[][]) Array.newInstance(Object.class, iArr);
    }

    public f a(g gVar) {
        if (gVar instanceof JustNow) {
            return new f() {
                private String b(C16126a aVar) {
                    if (aVar.b()) {
                        return "дәл қазір";
                    }
                    if (aVar.d()) {
                        return "жана ғана";
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
            return new KkTimeFormat("ғасыр", "ғасырдан");
        }
        if (gVar instanceof Day) {
            return new KkTimeFormat("күн", "күннен");
        }
        if (gVar instanceof Decade) {
            return new KkTimeFormat("онжылдық", "онжылдықтан");
        }
        if (gVar instanceof Hour) {
            return new KkTimeFormat("сағат", "сағаттан");
        }
        if (gVar instanceof Millennium) {
            return new KkTimeFormat("мыңжылдық", "мыңжылдықтан");
        }
        if (gVar instanceof Millisecond) {
            return new KkTimeFormat("миллисекунд", "миллисекундтан");
        }
        if (gVar instanceof Minute) {
            return new KkTimeFormat("минут", "минуттан");
        }
        if (gVar instanceof Month) {
            return new KkTimeFormat("ай", "айдан");
        }
        if (gVar instanceof Second) {
            return new KkTimeFormat("секунд", "секундтан");
        }
        if (gVar instanceof Week) {
            return new KkTimeFormat("апта", "аптадан");
        }
        if (gVar instanceof Year) {
            return new KkTimeFormat("жыл", "жылдан");
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public Object[][] getContents() {
        return f146168a;
    }
}
