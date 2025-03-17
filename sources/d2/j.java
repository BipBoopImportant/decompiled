package D2;

import android.os.LocaleList;
import java.util.Locale;

public final class j {

    /* renamed from: b  reason: collision with root package name */
    private static final j f5511b = a(new Locale[0]);

    /* renamed from: a  reason: collision with root package name */
    private final k f5512a;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Locale[] f5513a = {new Locale("en", "XA"), new Locale("ar", "XB")};

        static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    static class b {
        static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }
    }

    private j(k kVar) {
        this.f5512a = kVar;
    }

    public static j a(Locale... localeArr) {
        return h(b.a(localeArr));
    }

    public static j b(String str) {
        if (str == null || str.isEmpty()) {
            return d();
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i10 = 0; i10 < length; i10++) {
            localeArr[i10] = a.a(split[i10]);
        }
        return a(localeArr);
    }

    public static j d() {
        return f5511b;
    }

    public static j h(LocaleList localeList) {
        return new j(new l(localeList));
    }

    public Locale c(int i10) {
        return this.f5512a.get(i10);
    }

    public boolean e() {
        return this.f5512a.isEmpty();
    }

    public boolean equals(Object obj) {
        return (obj instanceof j) && this.f5512a.equals(((j) obj).f5512a);
    }

    public int f() {
        return this.f5512a.size();
    }

    public String g() {
        return this.f5512a.a();
    }

    public int hashCode() {
        return this.f5512a.hashCode();
    }

    public String toString() {
        return this.f5512a.toString();
    }
}
