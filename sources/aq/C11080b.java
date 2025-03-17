package aq;

import KJ.C15987c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Laq/b;", "", "LKJ/c;", "Laq/a;", "discoveries", "", "publisherDiagnostics", "<init>", "(LKJ/c;LKJ/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LKJ/c;", "()LKJ/c;", "b", "discover_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: aq.b  reason: case insensitive filesystem */
public final class C11080b {

    /* renamed from: a  reason: collision with root package name */
    private final C15987c<C11079a> f90410a;

    /* renamed from: b  reason: collision with root package name */
    private final C15987c<String> f90411b;

    public C11080b(C15987c<? extends C11079a> cVar, C15987c<String> cVar2) {
        C17542s.j(cVar, "discoveries");
        this.f90410a = cVar;
        this.f90411b = cVar2;
    }

    public final C15987c<C11079a> a() {
        return this.f90410a;
    }

    public final C15987c<String> b() {
        return this.f90411b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11080b)) {
            return false;
        }
        C11080b bVar = (C11080b) obj;
        return C17542s.e(this.f90410a, bVar.f90410a) && C17542s.e(this.f90411b, bVar.f90411b);
    }

    public int hashCode() {
        int hashCode = this.f90410a.hashCode() * 31;
        C15987c<String> cVar = this.f90411b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public String toString() {
        C15987c<C11079a> cVar = this.f90410a;
        C15987c<String> cVar2 = this.f90411b;
        return "Discoveries(discoveries=" + cVar + ", publisherDiagnostics=" + cVar2 + ")";
    }
}
