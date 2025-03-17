package D2;

import android.os.LocaleList;
import java.util.Locale;

final class l implements k {

    /* renamed from: a  reason: collision with root package name */
    private final LocaleList f5514a;

    l(Object obj) {
        this.f5514a = (LocaleList) obj;
    }

    public String a() {
        return this.f5514a.toLanguageTags();
    }

    public Object b() {
        return this.f5514a;
    }

    public boolean equals(Object obj) {
        return this.f5514a.equals(((k) obj).b());
    }

    public Locale get(int i10) {
        return this.f5514a.get(i10);
    }

    public int hashCode() {
        return this.f5514a.hashCode();
    }

    public boolean isEmpty() {
        return this.f5514a.isEmpty();
    }

    public int size() {
        return this.f5514a.size();
    }

    public String toString() {
        return this.f5514a.toString();
    }
}
