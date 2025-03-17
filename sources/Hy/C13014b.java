package Hy;

import IC.C13023e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18148c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LHy/b;", "", "LuK/c;", "icon", "LIC/e;", "text", "<init>", "(LuK/c;LIC/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LuK/c;", "()LuK/c;", "b", "LIC/e;", "()LIC/e;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Hy.b  reason: case insensitive filesystem */
public final class C13014b {

    /* renamed from: c  reason: collision with root package name */
    public static final int f110845c = C13023e.f110931a;

    /* renamed from: a  reason: collision with root package name */
    private final C18148c f110846a;

    /* renamed from: b  reason: collision with root package name */
    private final C13023e f110847b;

    public C13014b(C18148c cVar, C13023e eVar) {
        C17542s.j(cVar, "icon");
        C17542s.j(eVar, "text");
        this.f110846a = cVar;
        this.f110847b = eVar;
    }

    public final C18148c a() {
        return this.f110846a;
    }

    public final C13023e b() {
        return this.f110847b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13014b)) {
            return false;
        }
        C13014b bVar = (C13014b) obj;
        return this.f110846a == bVar.f110846a && C17542s.e(this.f110847b, bVar.f110847b);
    }

    public int hashCode() {
        return (this.f110846a.hashCode() * 31) + this.f110847b.hashCode();
    }

    public String toString() {
        C18148c cVar = this.f110846a;
        C13023e eVar = this.f110847b;
        return "Information(icon=" + cVar + ", text=" + eVar + ")";
    }
}
