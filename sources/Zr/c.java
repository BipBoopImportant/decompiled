package zr;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lzr/c;", "", "", "name", "text", "", "Lzr/d;", "values", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "getText", "c", "Ljava/util/List;", "()Ljava/util/List;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final String f107567a;

    /* renamed from: b  reason: collision with root package name */
    private final String f107568b;

    /* renamed from: c  reason: collision with root package name */
    private final List<d> f107569c;

    public c(String str, String str2, List<d> list) {
        C17542s.j(str, "name");
        C17542s.j(str2, "text");
        C17542s.j(list, "values");
        this.f107567a = str;
        this.f107568b = str2;
        this.f107569c = list;
    }

    public final List<d> a() {
        return this.f107569c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f107567a, cVar.f107567a) && C17542s.e(this.f107568b, cVar.f107568b) && C17542s.e(this.f107569c, cVar.f107569c);
    }

    public int hashCode() {
        return (((this.f107567a.hashCode() * 31) + this.f107568b.hashCode()) * 31) + this.f107569c.hashCode();
    }

    public String toString() {
        String str = this.f107567a;
        String str2 = this.f107568b;
        List<d> list = this.f107569c;
        return "InspirationFilter(name=" + str + ", text=" + str2 + ", values=" + list + ")";
    }
}
