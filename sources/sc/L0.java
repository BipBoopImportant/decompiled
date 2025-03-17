package SC;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import wK.C18525w3;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LSC/L0;", "", "", "label", "Lkotlin/Function0;", "LXH/N;", "onClick", "<init>", "(Ljava/lang/String;LnI/a;)V", "LwK/w3;", "a", "()LwK/w3;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "b", "LnI/a;", "getOnClick", "()LnI/a;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class L0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f115829a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f115830b;

    public L0(String str, C17631a<C16807N> aVar) {
        C17542s.j(str, "label");
        C17542s.j(aVar, "onClick");
        this.f115829a = str;
        this.f115830b = aVar;
    }

    public final C18525w3 a() {
        return new C18525w3(this.f115829a, this.f115830b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L0)) {
            return false;
        }
        L0 l02 = (L0) obj;
        return C17542s.e(this.f115829a, l02.f115829a) && C17542s.e(this.f115830b, l02.f115830b);
    }

    public int hashCode() {
        return (this.f115829a.hashCode() * 31) + this.f115830b.hashCode();
    }

    public String toString() {
        String str = this.f115829a;
        C17631a<C16807N> aVar = this.f115830b;
        return "SkapaInlineMessageActionParams(label=" + str + ", onClick=" + aVar + ")";
    }
}
