package B6;

import D6.q;
import java.util.List;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final List<q> f33227a;

    /* renamed from: b  reason: collision with root package name */
    private final char f33228b;

    /* renamed from: c  reason: collision with root package name */
    private final double f33229c;

    /* renamed from: d  reason: collision with root package name */
    private final double f33230d;

    /* renamed from: e  reason: collision with root package name */
    private final String f33231e;

    /* renamed from: f  reason: collision with root package name */
    private final String f33232f;

    public d(List<q> list, char c10, double d10, double d11, String str, String str2) {
        this.f33227a = list;
        this.f33228b = c10;
        this.f33229c = d10;
        this.f33230d = d11;
        this.f33231e = str;
        this.f33232f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List<q> a() {
        return this.f33227a;
    }

    public double b() {
        return this.f33230d;
    }

    public int hashCode() {
        return c(this.f33228b, this.f33232f, this.f33231e);
    }
}
