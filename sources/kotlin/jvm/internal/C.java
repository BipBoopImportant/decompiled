package kotlin.jvm.internal;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lkotlin/jvm/internal/C;", "Lkotlin/jvm/internal/h;", "Ljava/lang/Class;", "jClass", "", "moduleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", "l", "()Ljava/lang/Class;", "b", "Ljava/lang/String;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class C implements C17532h {

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f144341a;

    /* renamed from: b  reason: collision with root package name */
    private final String f144342b;

    public C(Class<?> cls, String str) {
        C17542s.j(cls, "jClass");
        C17542s.j(str, "moduleName");
        this.f144341a = cls;
        this.f144342b = str;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C) && C17542s.e(l(), ((C) obj).l());
    }

    public int hashCode() {
        return l().hashCode();
    }

    public Class<?> l() {
        return this.f144341a;
    }

    public String toString() {
        return l() + " (Kotlin reflection is not available)";
    }
}
