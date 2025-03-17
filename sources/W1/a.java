package W1;

import U1.d;
import U1.e;
import V1.g;
import YH.C16877v;
import android.os.LocaleList;
import android.text.style.LocaleSpan;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LW1/a;", "", "<init>", "()V", "LU1/e;", "localeList", "a", "(LU1/e;)Ljava/lang/Object;", "LV1/g;", "textPaint", "LXH/N;", "b", "(LV1/g;LU1/e;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14644a = new a();

    private a() {
    }

    public final Object a(e eVar) {
        ArrayList arrayList = new ArrayList(C16877v.y(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(g gVar, e eVar) {
        ArrayList arrayList = new ArrayList(C16877v.y(eVar, 10));
        Iterator it = eVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).a());
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        gVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
