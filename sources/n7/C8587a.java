package n7;

import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import k7.o;
import k7.q;
import k7.s;
import k7.u;
import k7.x;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015¨\u0006\u0016"}, d2 = {"Ln7/a;", "", "Lk7/o;", "obj", "<init>", "(Lk7/o;)V", "", "b", "()Ljava/util/List;", "", "a", "()Ljava/lang/String;", "c", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk7/o;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: n7.a  reason: case insensitive filesystem */
public final class C8587a {

    /* renamed from: a  reason: collision with root package name */
    private final o f55100a;

    public C8587a(o oVar) {
        C17542s.j(oVar, "obj");
        this.f55100a = oVar;
    }

    public final String a() {
        o oVar = this.f55100a;
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1ObjectIdentifier");
        return ((q) oVar).q();
    }

    public final List<C8587a> b() {
        o oVar = this.f55100a;
        C17542s.h(oVar, "null cannot be cast to non-null type com.appmattus.certificatetransparency.internal.utils.asn1.ASN1Sequence");
        Iterable<o> q10 = ((x) oVar).q();
        ArrayList arrayList = new ArrayList(C16877v.y(q10, 10));
        for (o aVar : q10) {
            arrayList.add(new C8587a(aVar));
        }
        return arrayList;
    }

    public final String c() {
        o oVar = this.f55100a;
        if (oVar instanceof s) {
            return ((s) oVar).o();
        }
        if (oVar instanceof u) {
            return ((u) oVar).o();
        }
        throw new IllegalStateException(("Unsupported string object " + this.f55100a).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8587a) && C17542s.e(this.f55100a, ((C8587a) obj).f55100a);
    }

    public int hashCode() {
        return this.f55100a.hashCode();
    }

    public String toString() {
        return "ASN1Query(obj=" + this.f55100a + ')';
    }
}
