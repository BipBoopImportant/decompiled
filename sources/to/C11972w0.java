package to;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lto/w0;", "", "LIC/e;", "label", "", "inputText", "", "showInputError", "<init>", "(LIC/e;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "Ljava/lang/String;", "c", "Z", "()Z", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: to.w0  reason: case insensitive filesystem */
public final class C11972w0 {

    /* renamed from: d  reason: collision with root package name */
    public static final int f103231d = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f103232a;

    /* renamed from: b  reason: collision with root package name */
    private final String f103233b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f103234c;

    public C11972w0(C13023e eVar, String str, boolean z10) {
        C17542s.j(eVar, "label");
        this.f103232a = eVar;
        this.f103233b = str;
        this.f103234c = z10;
    }

    public final String a() {
        return this.f103233b;
    }

    public final C13023e b() {
        return this.f103232a;
    }

    public final boolean c() {
        return this.f103234c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11972w0)) {
            return false;
        }
        C11972w0 w0Var = (C11972w0) obj;
        return C17542s.e(this.f103232a, w0Var.f103232a) && C17542s.e(this.f103233b, w0Var.f103233b) && this.f103234c == w0Var.f103234c;
    }

    public int hashCode() {
        int hashCode = this.f103232a.hashCode() * 31;
        String str = this.f103233b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.f103234c);
    }

    public String toString() {
        C13023e eVar = this.f103232a;
        String str = this.f103233b;
        boolean z10 = this.f103234c;
        return "IdInputData(label=" + eVar + ", inputText=" + str + ", showInputError=" + z10 + ")";
    }
}
