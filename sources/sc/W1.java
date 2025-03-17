package SC;

import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import wK.C18493t7;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LSC/W1;", "", "", "label", "Lkotlin/Function0;", "LXH/N;", "action", "<init>", "(Ljava/lang/String;LnI/a;)V", "LwK/t7;", "a", "()LwK/t7;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "b", "LnI/a;", "getAction", "()LnI/a;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class W1 {

    /* renamed from: c  reason: collision with root package name */
    public static final int f116045c = 0;

    /* renamed from: a  reason: collision with root package name */
    private final String f116046a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<C16807N> f116047b;

    public W1(String str, C17631a<C16807N> aVar) {
        C17542s.j(str, "label");
        C17542s.j(aVar, "action");
        this.f116046a = str;
        this.f116047b = aVar;
    }

    public final C18493t7 a() {
        return new C18493t7(this.f116046a, this.f116047b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof W1)) {
            return false;
        }
        W1 w12 = (W1) obj;
        return C17542s.e(this.f116046a, w12.f116046a) && C17542s.e(this.f116047b, w12.f116047b);
    }

    public int hashCode() {
        return (this.f116046a.hashCode() * 31) + this.f116047b.hashCode();
    }

    public String toString() {
        String str = this.f116046a;
        C17631a<C16807N> aVar = this.f116047b;
        return "SkapaPromptAction(label=" + str + ", action=" + aVar + ")";
    }
}
