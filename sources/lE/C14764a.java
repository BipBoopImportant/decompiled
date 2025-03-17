package lE;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0013\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LlE/a;", "", "", "displayText", "value", "", "isSelected", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Z", "()Z", "zipselector-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lE.a  reason: case insensitive filesystem */
public final class C14764a {

    /* renamed from: a  reason: collision with root package name */
    private final String f128944a;

    /* renamed from: b  reason: collision with root package name */
    private final String f128945b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f128946c;

    public C14764a(String str, String str2, boolean z10) {
        C17542s.j(str, "displayText");
        C17542s.j(str2, "value");
        this.f128944a = str;
        this.f128945b = str2;
        this.f128946c = z10;
    }

    public final String a() {
        return this.f128944a;
    }

    public final String b() {
        return this.f128945b;
    }

    public final boolean c() {
        return this.f128946c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14764a)) {
            return false;
        }
        C14764a aVar = (C14764a) obj;
        return C17542s.e(this.f128944a, aVar.f128944a) && C17542s.e(this.f128945b, aVar.f128945b) && this.f128946c == aVar.f128946c;
    }

    public int hashCode() {
        return (((this.f128944a.hashCode() * 31) + this.f128945b.hashCode()) * 31) + Boolean.hashCode(this.f128946c);
    }

    public String toString() {
        String str = this.f128944a;
        String str2 = this.f128945b;
        boolean z10 = this.f128946c;
        return "PostalCodeState(displayText=" + str + ", value=" + str2 + ", isSelected=" + z10 + ")";
    }
}
