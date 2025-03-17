package U1;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0014B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u000bR\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0019"}, d2 = {"LU1/d;", "", "Ljava/util/Locale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "platformLocale", "<init>", "(Ljava/util/Locale;)V", "", "languageTag", "(Ljava/lang/String;)V", "c", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "a", "Ljava/util/Locale;", "()Ljava/util/Locale;", "b", "region", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* renamed from: b  reason: collision with root package name */
    public static final a f14212b = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Locale f14213a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"LU1/d$a;", "", "<init>", "()V", "LU1/d;", "a", "()LU1/d;", "current", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return g.a().a().k(0);
        }

        private a() {
        }
    }

    public d(Locale locale) {
        this.f14213a = locale;
    }

    public final Locale a() {
        return this.f14213a;
    }

    public final String b() {
        return h.b(this.f14213a);
    }

    public final String c() {
        return h.a(this.f14213a);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return C17542s.e(c(), ((d) obj).c());
    }

    public int hashCode() {
        return c().hashCode();
    }

    public String toString() {
        return c();
    }

    public d(String str) {
        this(g.a().b(str));
    }
}
