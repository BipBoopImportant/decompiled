package EH;

import HJ.C15854t;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"LEH/h;", "", "", "value", "", "LEH/i;", "params", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "a", "()Ljava/lang/String;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Ljava/util/List;", "()Ljava/util/List;", "", "c", "D", "()D", "quality", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: EH.h  reason: case insensitive filesystem */
public final class C15623h {

    /* renamed from: a  reason: collision with root package name */
    private final String f134024a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C15624i> f134025b;

    /* renamed from: c  reason: collision with root package name */
    private final double f134026c;

    public C15623h(String str, List<C15624i> list) {
        Double d10;
        Object obj;
        String d11;
        Double q10;
        C17542s.j(str, "value");
        C17542s.j(list, "params");
        this.f134024a = str;
        this.f134025b = list;
        Iterator it = list.iterator();
        while (true) {
            d10 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C17542s.e(((C15624i) obj).c(), "q")) {
                break;
            }
        }
        C15624i iVar = (C15624i) obj;
        double d12 = 1.0d;
        if (!(iVar == null || (d11 = iVar.d()) == null || (q10 = C15854t.q(d11)) == null)) {
            double doubleValue = q10.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d10 = q10;
            }
            if (d10 != null) {
                d12 = d10.doubleValue();
            }
        }
        this.f134026c = d12;
    }

    public final String a() {
        return this.f134024a;
    }

    public final List<C15624i> b() {
        return this.f134025b;
    }

    public final double c() {
        return this.f134026c;
    }

    public final String d() {
        return this.f134024a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15623h)) {
            return false;
        }
        C15623h hVar = (C15623h) obj;
        return C17542s.e(this.f134024a, hVar.f134024a) && C17542s.e(this.f134025b, hVar.f134025b);
    }

    public int hashCode() {
        return (this.f134024a.hashCode() * 31) + this.f134025b.hashCode();
    }

    public String toString() {
        return "HeaderValue(value=" + this.f134024a + ", params=" + this.f134025b + ')';
    }
}
