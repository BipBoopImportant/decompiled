package Fl;

import HJ.C15854t;
import android.content.Context;
import com.sugarcube.core.logger.DslKt;
import ep.C11255a;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\fB\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0010¨\u0006\u0011"}, d2 = {"LFl/a;", "Lep/a;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Ljava/util/Locale;", "locale", "", "skeleton", "c", "(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;", "a", "(Ljava/util/Locale;)Ljava/lang/String;", "b", "()Ljava/lang/String;", "Landroid/content/Context;", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11255a {

    /* renamed from: b  reason: collision with root package name */
    public static final C1551a f80893b = new C1551a((DefaultConstructorMarker) null);

    /* renamed from: c  reason: collision with root package name */
    public static final int f80894c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Context f80895a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"LFl/a$a;", "", "<init>", "()V", "", "TIME_FORMAT_24_HOUR", "Ljava/lang/String;", "TIME_FORMAT_12_HOUR", "IKEA_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Fl.a$a  reason: collision with other inner class name */
    public static final class C1551a {
        public /* synthetic */ C1551a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1551a() {
        }
    }

    public a(Context context) {
        C17542s.j(context, "context");
        this.f80895a = context;
    }

    public String a(Locale locale) {
        C17542s.j(locale, "locale");
        DateFormat timeFormat = android.text.format.DateFormat.getTimeFormat(this.f80895a);
        if (timeFormat instanceof SimpleDateFormat) {
            String localizedPattern = ((SimpleDateFormat) timeFormat).toLocalizedPattern();
            C17542s.i(localizedPattern, "toLocalizedPattern(...)");
            return localizedPattern;
        }
        IllegalStateException illegalStateException = new IllegalStateException("timeFormat is not SimpleDateFormat: " + timeFormat);
        e eVar = e.ERROR;
        ArrayList<C11819b> arrayList = new ArrayList<>();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        String str = null;
        String str2 = null;
        for (C11819b bVar : arrayList) {
            if (str == null) {
                String a10 = C11818a.a((String) null, illegalStateException);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = a.class.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str4 = str2;
            bVar.a(eVar, str4, false, illegalStateException, str3);
            str = str3;
            str2 = str4;
        }
        String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern(locale, b());
        C17542s.g(bestDateTimePattern);
        return bestDateTimePattern;
    }

    public String b() {
        return android.text.format.DateFormat.is24HourFormat(this.f80895a) ? "HH:mm" : "hh:mm";
    }

    public String c(Locale locale, String str) {
        C17542s.j(locale, "locale");
        C17542s.j(str, "skeleton");
        String bestDateTimePattern = android.text.format.DateFormat.getBestDateTimePattern(locale, str);
        C17542s.i(bestDateTimePattern, "getBestDateTimePattern(...)");
        return bestDateTimePattern;
    }
}
