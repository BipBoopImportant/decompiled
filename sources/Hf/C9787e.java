package hf;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhf/e;", "", "", "copyright", "link", "", "dependencies", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "Ljava/util/List;", "()Ljava/util/List;", "profile-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hf.e  reason: case insensitive filesystem */
public final class C9787e {

    /* renamed from: a  reason: collision with root package name */
    private final String f73585a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73586b;

    /* renamed from: c  reason: collision with root package name */
    private final List<String> f73587c;

    public C9787e(String str, String str2, List<String> list) {
        C17542s.j(str, "copyright");
        C17542s.j(str2, "link");
        C17542s.j(list, "dependencies");
        this.f73585a = str;
        this.f73586b = str2;
        this.f73587c = list;
    }

    public final String a() {
        return this.f73585a;
    }

    public final List<String> b() {
        return this.f73587c;
    }

    public final String c() {
        return this.f73586b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9787e)) {
            return false;
        }
        C9787e eVar = (C9787e) obj;
        return C17542s.e(this.f73585a, eVar.f73585a) && C17542s.e(this.f73586b, eVar.f73586b) && C17542s.e(this.f73587c, eVar.f73587c);
    }

    public int hashCode() {
        return (((this.f73585a.hashCode() * 31) + this.f73586b.hashCode()) * 31) + this.f73587c.hashCode();
    }

    public String toString() {
        String str = this.f73585a;
        String str2 = this.f73586b;
        List<String> list = this.f73587c;
        return "OpenSourceDelegateModel(copyright=" + str + ", link=" + str2 + ", dependencies=" + list + ")";
    }
}
