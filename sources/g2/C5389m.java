package g2;

import E1.C4491y;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0003\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lg2/m;", "LE1/y;", "Lg2/h;", "ref", "Lkotlin/Function1;", "Lg2/g;", "LXH/N;", "constrain", "<init>", "(Lg2/h;LnI/l;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lg2/h;", "b", "()Lg2/h;", "LnI/l;", "()LnI/l;", "c", "Ljava/lang/Object;", "e1", "()Ljava/lang/Object;", "layoutId", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.m  reason: case insensitive filesystem */
final class C5389m implements C4491y {

    /* renamed from: a  reason: collision with root package name */
    private final C5384h f23732a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<C5383g, C16807N> f23733b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f23734c;

    public C5389m(C5384h hVar, C17642l<? super C5383g, C16807N> lVar) {
        this.f23732a = hVar;
        this.f23733b = lVar;
        this.f23734c = hVar.a();
    }

    public final C17642l<C5383g, C16807N> a() {
        return this.f23733b;
    }

    public final C5384h b() {
        return this.f23732a;
    }

    public Object e1() {
        return this.f23734c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5389m) {
            C5389m mVar = (C5389m) obj;
            return C17542s.e(this.f23732a.a(), mVar.f23732a.a()) && this.f23733b == mVar.f23733b;
        }
    }

    public int hashCode() {
        return (this.f23732a.a().hashCode() * 31) + this.f23733b.hashCode();
    }
}
