package GD;

import IC.C13023e;
import IC.C13026h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0004\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\tJ\u0010\u0010\n\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016¨\u0006\u0018"}, d2 = {"LGD/b;", "", "LIC/e;", "label", "title", "description", "<init>", "(LIC/e;LIC/e;LIC/e;)V", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LIC/e;", "b", "()LIC/e;", "c", "wallet-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: GD.b  reason: case insensitive filesystem */
public final class C12929b {

    /* renamed from: a  reason: collision with root package name */
    private final C13023e f110333a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f110334b;

    /* renamed from: c  reason: collision with root package name */
    private final C13023e f110335c;

    public C12929b(C13023e eVar, C13023e eVar2, C13023e eVar3) {
        C17542s.j(eVar, "label");
        C17542s.j(eVar2, "title");
        C17542s.j(eVar3, "description");
        this.f110333a = eVar;
        this.f110334b = eVar2;
        this.f110335c = eVar3;
    }

    public final C13023e a() {
        return this.f110335c;
    }

    public final C13023e b() {
        return this.f110333a;
    }

    public final C13023e c() {
        return this.f110334b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12929b)) {
            return false;
        }
        C12929b bVar = (C12929b) obj;
        return C17542s.e(this.f110333a, bVar.f110333a) && C17542s.e(this.f110334b, bVar.f110334b) && C17542s.e(this.f110335c, bVar.f110335c);
    }

    public int hashCode() {
        return (((this.f110333a.hashCode() * 31) + this.f110334b.hashCode()) * 31) + this.f110335c.hashCode();
    }

    public String toString() {
        C13023e eVar = this.f110333a;
        C13023e eVar2 = this.f110334b;
        C13023e eVar3 = this.f110335c;
        return "CardHeader(label=" + eVar + ", title=" + eVar2 + ", description=" + eVar3 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C12929b(String str, String str2, String str3) {
        this(C13026h.c(str), C13026h.c(str2), C13026h.c(str3));
        C17542s.j(str, "label");
        C17542s.j(str2, "title");
        C17542s.j(str3, "description");
    }
}
