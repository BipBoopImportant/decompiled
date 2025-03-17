package jL;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mL.C17619c;
import oL.C17722a;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LjL/e;", "R", "", "LoL/a;", "module", "LmL/c;", "factory", "<init>", "(LoL/a;LmL/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LoL/a;", "getModule", "()LoL/a;", "b", "LmL/c;", "getFactory", "()LmL/c;", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class e<R> {

    /* renamed from: a  reason: collision with root package name */
    private final C17722a f144198a;

    /* renamed from: b  reason: collision with root package name */
    private final C17619c<R> f144199b;

    public e(C17722a aVar, C17619c<R> cVar) {
        C17542s.j(aVar, "module");
        C17542s.j(cVar, "factory");
        this.f144198a = aVar;
        this.f144199b = cVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return C17542s.e(this.f144198a, eVar.f144198a) && C17542s.e(this.f144199b, eVar.f144199b);
    }

    public int hashCode() {
        return (this.f144198a.hashCode() * 31) + this.f144199b.hashCode();
    }

    public String toString() {
        return "KoinDefinition(module=" + this.f144198a + ", factory=" + this.f144199b + ')';
    }
}
