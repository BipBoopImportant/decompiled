package m0;

import j0.C5460p;
import j0.E;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m0.Z;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0004B\t\b\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\t\u001a\u00028\u0001*\u00028\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0004¢\u0006\u0004\b\t\u0010\nR,\u0010\u0013\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8G@FX\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\u0015\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000b8G@FX\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u000e\u001a\u0004\b\r\u0010\u0010\"\u0004\b\u0014\u0010\u0012R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00010\u00168\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019\u0001\u0001\u001b¨\u0006\u001c"}, d2 = {"Lm0/b0;", "T", "Lm0/Z;", "E", "", "<init>", "()V", "Lm0/D;", "easing", "f", "(Lm0/Z;Lm0/D;)Lm0/Z;", "", "<set-?>", "a", "I", "b", "()I", "e", "(I)V", "durationMillis", "d", "delayMillis", "Lj0/E;", "c", "Lj0/E;", "()Lj0/E;", "keyframes", "Lm0/a0$b;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: m0.b0  reason: case insensitive filesystem */
public abstract class C5533b0<T, E extends Z<T>> {

    /* renamed from: a  reason: collision with root package name */
    private int f25713a;

    /* renamed from: b  reason: collision with root package name */
    private int f25714b;

    /* renamed from: c  reason: collision with root package name */
    private final E<E> f25715c;

    public /* synthetic */ C5533b0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final int a() {
        return this.f25714b;
    }

    public final int b() {
        return this.f25713a;
    }

    public final E<E> c() {
        return this.f25715c;
    }

    public final void d(int i10) {
        this.f25714b = i10;
    }

    public final void e(int i10) {
        this.f25713a = i10;
    }

    public final E f(E e10, C5525D d10) {
        e10.c(d10);
        return e10;
    }

    private C5533b0() {
        this.f25713a = 300;
        this.f25715c = C5460p.b();
    }
}
