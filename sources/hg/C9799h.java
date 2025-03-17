package hg;

import Ln.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lhg/h;", "", "LLn/d;", "item", "Lhg/J;", "availability", "<init>", "(LLn/d;Lhg/J;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LLn/d;", "b", "()LLn/d;", "Lhg/J;", "()Lhg/J;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: hg.h  reason: case insensitive filesystem */
public final class C9799h {

    /* renamed from: a  reason: collision with root package name */
    private final d f73650a;

    /* renamed from: b  reason: collision with root package name */
    private final J f73651b;

    public C9799h(d dVar, J j10) {
        C17542s.j(dVar, "item");
        C17542s.j(j10, "availability");
        this.f73650a = dVar;
        this.f73651b = j10;
    }

    public final J a() {
        return this.f73651b;
    }

    public final d b() {
        return this.f73650a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9799h)) {
            return false;
        }
        C9799h hVar = (C9799h) obj;
        return C17542s.e(this.f73650a, hVar.f73650a) && C17542s.e(this.f73651b, hVar.f73651b);
    }

    public int hashCode() {
        return (this.f73650a.hashCode() * 31) + this.f73651b.hashCode();
    }

    public String toString() {
        d dVar = this.f73650a;
        J j10 = this.f73651b;
        return "CartItemWithAvailability(item=" + dVar + ", availability=" + j10 + ")";
    }
}
