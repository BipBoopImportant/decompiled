package s0;

import c2.d;
import c2.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0004\u001a\u00020\u00038\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u0018\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Ls0/C;", "Ls0/T;", "insets", "Ls0/Y;", "sides", "<init>", "(Ls0/T;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lc2/d;", "density", "Lc2/t;", "layoutDirection", "", "c", "(Lc2/d;Lc2/t;)I", "a", "(Lc2/d;)I", "d", "b", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ls0/T;", "getInsets", "()Ls0/T;", "I", "getSides-JoeWqyM", "foundation-layout_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: s0.C  reason: case insensitive filesystem */
final class C5832C implements C5848T {

    /* renamed from: b  reason: collision with root package name */
    private final C5848T f28715b;

    /* renamed from: c  reason: collision with root package name */
    private final int f28716c;

    public /* synthetic */ C5832C(C5848T t10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(t10, i10);
    }

    public int a(d dVar) {
        if (C5853Y.l(this.f28716c, C5853Y.f28774a.h())) {
            return this.f28715b.a(dVar);
        }
        return 0;
    }

    public int b(d dVar) {
        if (C5853Y.l(this.f28716c, C5853Y.f28774a.e())) {
            return this.f28715b.b(dVar);
        }
        return 0;
    }

    public int c(d dVar, t tVar) {
        if (C5853Y.l(this.f28716c, tVar == t.Ltr ? C5853Y.f28774a.a() : C5853Y.f28774a.b())) {
            return this.f28715b.c(dVar, tVar);
        }
        return 0;
    }

    public int d(d dVar, t tVar) {
        if (C5853Y.l(this.f28716c, tVar == t.Ltr ? C5853Y.f28774a.c() : C5853Y.f28774a.d())) {
            return this.f28715b.d(dVar, tVar);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5832C)) {
            return false;
        }
        C5832C c10 = (C5832C) obj;
        return C17542s.e(this.f28715b, c10.f28715b) && C5853Y.k(this.f28716c, c10.f28716c);
    }

    public int hashCode() {
        return (this.f28715b.hashCode() * 31) + C5853Y.m(this.f28716c);
    }

    public String toString() {
        return '(' + this.f28715b + " only " + C5853Y.o(this.f28716c) + ')';
    }

    private C5832C(C5848T t10, int i10) {
        this.f28715b = t10;
        this.f28716c = i10;
    }
}
