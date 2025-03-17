package Rl;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LRl/f;", "", "", "code", "name", "LRl/i;", "privacyPolicyLink", "<init>", "(Ljava/lang/String;Ljava/lang/String;LRl/i;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "LRl/i;", "()LRl/i;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f86571a;

    /* renamed from: b  reason: collision with root package name */
    private final String f86572b;

    /* renamed from: c  reason: collision with root package name */
    private final i f86573c;

    public f(String str, String str2, i iVar) {
        C17542s.j(str, "code");
        C17542s.j(str2, "name");
        C17542s.j(iVar, "privacyPolicyLink");
        this.f86571a = str;
        this.f86572b = str2;
        this.f86573c = iVar;
    }

    public final String a() {
        return this.f86571a;
    }

    public final String b() {
        return this.f86572b;
    }

    public final i c() {
        return this.f86573c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return C17542s.e(this.f86571a, fVar.f86571a) && C17542s.e(this.f86572b, fVar.f86572b) && C17542s.e(this.f86573c, fVar.f86573c);
    }

    public int hashCode() {
        return (((this.f86571a.hashCode() * 31) + this.f86572b.hashCode()) * 31) + this.f86573c.hashCode();
    }

    public String toString() {
        String str = this.f86571a;
        String str2 = this.f86572b;
        i iVar = this.f86573c;
        return "MarketLanguageConfig(code=" + str + ", name=" + str2 + ", privacyPolicyLink=" + iVar + ")";
    }
}
