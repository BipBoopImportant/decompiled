package op;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0019\u0010\u000bR\u0017\u0010\u001d\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0013\u0010\u001c¨\u0006\u001e"}, d2 = {"Lop/h;", "", "", "text", "", "Lop/i;", "values", "type", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "getType", "d", "Z", "()Z", "showAsImage", "model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: op.h  reason: case insensitive filesystem */
public final class C11697h {

    /* renamed from: a  reason: collision with root package name */
    private final String f100637a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C11698i> f100638b;

    /* renamed from: c  reason: collision with root package name */
    private final String f100639c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f100640d;

    public C11697h(String str, List<C11698i> list, String str2) {
        C17542s.j(str, "text");
        C17542s.j(str2, "type");
        this.f100637a = str;
        this.f100638b = list;
        this.f100639c = str2;
        this.f100640d = C17542s.e(str2, "image");
    }

    public final boolean a() {
        return this.f100640d;
    }

    public final String b() {
        return this.f100637a;
    }

    public final List<C11698i> c() {
        return this.f100638b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11697h)) {
            return false;
        }
        C11697h hVar = (C11697h) obj;
        return C17542s.e(this.f100637a, hVar.f100637a) && C17542s.e(this.f100638b, hVar.f100638b) && C17542s.e(this.f100639c, hVar.f100639c);
    }

    public int hashCode() {
        int hashCode = this.f100637a.hashCode() * 31;
        List<C11698i> list = this.f100638b;
        return ((hashCode + (list == null ? 0 : list.hashCode())) * 31) + this.f100639c.hashCode();
    }

    public String toString() {
        String str = this.f100637a;
        List<C11698i> list = this.f100638b;
        String str2 = this.f100639c;
        return "ProductDetailFacets(text=" + str + ", values=" + list + ", type=" + str2 + ")";
    }
}
