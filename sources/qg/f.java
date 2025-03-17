package qg;

import HJ.C15854t;
import IC.C13023e;
import am.h;
import com.sugarcube.core.logger.DslKt;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lqg/f;", "Lqg/a;", "", "minAge", "", "dateFormat", "", "allowEmptyInput", "name", "LIC/e;", "message", "Lam/h;", "timeProvider", "<init>", "(ILjava/lang/String;ZLjava/lang/String;LIC/e;Lam/h;)V", "input", "d", "(Ljava/lang/String;)Z", "e", "I", "f", "Lam/h;", "Ljava/text/SimpleDateFormat;", "g", "Ljava/text/SimpleDateFormat;", "dateFormatter", "dynamicfields_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends C10191a {

    /* renamed from: e  reason: collision with root package name */
    private final int f76108e;

    /* renamed from: f  reason: collision with root package name */
    private final h f76109f;

    /* renamed from: g  reason: collision with root package name */
    private final SimpleDateFormat f76110g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(int i10, String str, boolean z10, String str2, C13023e eVar, h hVar) {
        super(z10, str2, eVar);
        C17542s.j(str, "dateFormat");
        C17542s.j(str2, "name");
        C17542s.j(eVar, "message");
        C17542s.j(hVar, "timeProvider");
        this.f76108e = i10;
        this.f76109f = hVar;
        this.f76110g = new SimpleDateFormat(str, Locale.US);
    }

    /* access modifiers changed from: protected */
    public boolean d(String str) {
        C17542s.j(str, "input");
        try {
            Date parse = this.f76110g.parse(str);
            Calendar instance = Calendar.getInstance();
            instance.setTimeInMillis(this.f76109f.c());
            instance.add(1, -this.f76108e);
            if (parse != null) {
                return parse.before(instance.getTime());
            }
            return false;
        } catch (ParseException e10) {
            e eVar = e.DEBUG;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str2 = null;
            String str3 = null;
            for (C11819b bVar : arrayList) {
                if (str2 == null) {
                    String a10 = C11818a.a("Value not parsable, always use dateFormatter when setting the value.", e10);
                    if (a10 == null) {
                        return false;
                    }
                    str2 = C11820c.a(a10);
                }
                String str4 = str2;
                if (str3 == null) {
                    String name = f.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str3 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str5 = str3;
                bVar.a(eVar, str5, false, e10, str4);
                str2 = str4;
                str3 = str5;
            }
            return false;
        }
    }
}
