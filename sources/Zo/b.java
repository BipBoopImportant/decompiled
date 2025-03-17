package Zo;

import D2.j;
import HJ.C15854t;
import Il.a;
import XH.C16814e;
import androidx.appcompat.app.g;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"LZo/b;", "LZo/a;", "<init>", "()V", "LIl/a;", "appConfigApi", "LXH/N;", "a", "(LIl/a;)V", "Ljava/util/Locale;", "locale", "b", "(Ljava/util/Locale;)V", "d", "()Ljava/util/Locale;", "", "c", "(Ljava/util/Locale;)Z", "core-android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static final b f90092a = new b();

    private b() {
    }

    public void a(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        b((C15854t.v0(aVar.a()) || C15854t.v0(aVar.i())) ? d() : aVar.A());
    }

    public void b(Locale locale) {
        C17542s.j(locale, "locale");
        if (!c(locale)) {
            g.Q(j.a(locale));
        }
    }

    public boolean c(Locale locale) {
        C17542s.j(locale, "locale");
        j q10 = g.q();
        return !q10.e() && C17542s.e(q10.c(0), locale);
    }

    @C16814e
    public final Locale d() {
        Locale c10;
        Locale locale = Locale.getDefault();
        j q10 = g.q();
        if (!q10.e() && (c10 = q10.c(0)) != null) {
            locale = c10;
        }
        C17542s.i(locale, "let(...)");
        return locale;
    }
}
