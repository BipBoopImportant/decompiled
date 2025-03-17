package Kt;

import U0.A1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.v0;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B3\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\f\u001a\u0004\b\u000f\u0010\rR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0011¨\u0006\u0012"}, d2 = {"LKt/b;", "", "LU0/A1;", "", "scale", "translation", "Lm0/v0;", "LKt/c;", "transition", "<init>", "(LU0/A1;LU0/A1;Lm0/v0;)V", "a", "LU0/A1;", "()LU0/A1;", "b", "c", "Lm0/v0;", "()Lm0/v0;", "instore-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private final A1<Float> f83113a;

    /* renamed from: b  reason: collision with root package name */
    private final A1<Float> f83114b;

    /* renamed from: c  reason: collision with root package name */
    private final v0<c> f83115c;

    public b(A1<Float> a12, A1<Float> a13, v0<c> v0Var) {
        C17542s.j(a12, "scale");
        C17542s.j(a13, "translation");
        C17542s.j(v0Var, "transition");
        this.f83113a = a12;
        this.f83114b = a13;
        this.f83115c = v0Var;
    }

    public final A1<Float> a() {
        return this.f83113a;
    }

    public final v0<c> b() {
        return this.f83115c;
    }

    public final A1<Float> c() {
        return this.f83114b;
    }
}
