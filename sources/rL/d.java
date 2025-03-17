package Rl;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u0019"}, d2 = {"LRl/d;", "", "", "code", "name", "", "LRl/f;", "languages", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f86547a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86548b;

    /* renamed from: c  reason: collision with root package name */
    private final List<f> f86549c;

    public d(String str, String str2, List<f> list) {
        C17542s.j(str, "code");
        C17542s.j(str2, "name");
        C17542s.j(list, "languages");
        this.f86547a = str;
        this.f86548b = str2;
        this.f86549c = list;
    }

    public final String a() {
        return this.f86547a;
    }

    public final List<f> b() {
        return this.f86549c;
    }

    public final String c() {
        return this.f86548b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return C17542s.e(this.f86547a, dVar.f86547a) && C17542s.e(this.f86548b, dVar.f86548b) && C17542s.e(this.f86549c, dVar.f86549c);
    }

    public int hashCode() {
        return (((this.f86547a.hashCode() * 31) + this.f86548b.hashCode()) * 31) + this.f86549c.hashCode();
    }

    public String toString() {
        String str = this.f86547a;
        String str2 = this.f86548b;
        List<f> list = this.f86549c;
        return "Market(code=" + str + ", name=" + str2 + ", languages=" + list + ")";
    }
}
