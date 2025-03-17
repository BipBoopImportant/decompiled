package rG;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import lF.C14768a;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"LrG/a;", "", "LrG/b;", "item", "LlF/a;", "priceData", "<init>", "(LrG/b;LlF/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LrG/b;", "()LrG/b;", "b", "LlF/a;", "()LlF/a;", "v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rG.a  reason: case insensitive filesystem */
public final class C17847a {

    /* renamed from: a  reason: collision with root package name */
    private final C17848b f146656a;

    /* renamed from: b  reason: collision with root package name */
    private final C14768a f146657b;

    public C17847a(C17848b bVar, C14768a aVar) {
        C17542s.j(bVar, "item");
        C17542s.j(aVar, "priceData");
        this.f146656a = bVar;
        this.f146657b = aVar;
    }

    public final C17848b a() {
        return this.f146656a;
    }

    public final C14768a b() {
        return this.f146657b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17847a)) {
            return false;
        }
        C17847a aVar = (C17847a) obj;
        return C17542s.e(this.f146656a, aVar.f146656a) && C17542s.e(this.f146657b, aVar.f146657b);
    }

    public int hashCode() {
        return (this.f146656a.hashCode() * 31) + this.f146657b.hashCode();
    }

    public String toString() {
        C17848b bVar = this.f146656a;
        C14768a aVar = this.f146657b;
        return "CartItemDataModel(item=" + bVar + ", priceData=" + aVar + ")";
    }
}
