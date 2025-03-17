package to;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0019\u0010\f¨\u0006\u001c"}, d2 = {"Lto/f;", "", "", "id", "", "isChecked", "LIC/e;", "label", "url", "<init>", "(Ljava/lang/String;ZLIC/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "d", "()Z", "c", "LIC/e;", "()LIC/e;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: to.f  reason: case insensitive filesystem */
public final class C11938f {

    /* renamed from: e  reason: collision with root package name */
    public static final int f103121e = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final String f103122a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f103123b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f103124c;

    /* renamed from: d  reason: collision with root package name */
    private final String f103125d;

    public C11938f(String str, boolean z10, C13023e eVar, String str2) {
        C17542s.j(str, "id");
        C17542s.j(eVar, "label");
        C17542s.j(str2, "url");
        this.f103122a = str;
        this.f103123b = z10;
        this.f103124c = eVar;
        this.f103125d = str2;
    }

    public final String a() {
        return this.f103122a;
    }

    public final C13023e b() {
        return this.f103124c;
    }

    public final String c() {
        return this.f103125d;
    }

    public final boolean d() {
        return this.f103123b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11938f)) {
            return false;
        }
        C11938f fVar = (C11938f) obj;
        return C17542s.e(this.f103122a, fVar.f103122a) && this.f103123b == fVar.f103123b && C17542s.e(this.f103124c, fVar.f103124c) && C17542s.e(this.f103125d, fVar.f103125d);
    }

    public int hashCode() {
        return (((((this.f103122a.hashCode() * 31) + Boolean.hashCode(this.f103123b)) * 31) + this.f103124c.hashCode()) * 31) + this.f103125d.hashCode();
    }

    public String toString() {
        String str = this.f103122a;
        boolean z10 = this.f103123b;
        C13023e eVar = this.f103124c;
        String str2 = this.f103125d;
        return "CheckboxWithLinkUiState(id=" + str + ", isChecked=" + z10 + ", label=" + eVar + ", url=" + str2 + ")";
    }
}
