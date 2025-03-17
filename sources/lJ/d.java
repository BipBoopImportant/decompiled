package Lj;

import U0.C4899r0;
import U0.o1;
import Uj.C10958a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5530a;
import m0.C5532b;
import m0.C5554m;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\fR#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0011\u0010\fR+\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00168F@FX\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0018\u001a\u0004\b\u000e\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LLj/d;", "", "LUj/a;", "initialState", "<init>", "(LUj/a;)V", "Lm0/a;", "", "Lm0/m;", "a", "Lm0/a;", "d", "()Lm0/a;", "bagIconAlpha", "b", "e", "bagIconOffset", "c", "f", "checkmarkIconOffset", "backgroundAlpha", "badgeScaleAndAlpha", "", "<set-?>", "LU0/r0;", "()Ljava/lang/String;", "g", "(Ljava/lang/String;)V", "badgeNumber", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* renamed from: g  reason: collision with root package name */
    public static final int f83157g = C5530a.f25673m;

    /* renamed from: a  reason: collision with root package name */
    private final C5530a<Float, C5554m> f83158a = C5532b.b(1.0f, 0.0f, 2, (Object) null);

    /* renamed from: b  reason: collision with root package name */
    private final C5530a<Float, C5554m> f83159b = C5532b.b(0.0f, 0.0f, 2, (Object) null);

    /* renamed from: c  reason: collision with root package name */
    private final C5530a<Float, C5554m> f83160c = C5532b.b(1.0f, 0.0f, 2, (Object) null);

    /* renamed from: d  reason: collision with root package name */
    private final C5530a<Float, C5554m> f83161d;

    /* renamed from: e  reason: collision with root package name */
    private final C5530a<Float, C5554m> f83162e;

    /* renamed from: f  reason: collision with root package name */
    private final C4899r0 f83163f;

    public d(C10958a aVar) {
        C17542s.j(aVar, "initialState");
        float f10 = 1.0f;
        boolean z10 = aVar instanceof C10958a.b;
        this.f83161d = C5532b.b(z10 ? 0.0f : 1.0f, 0.0f, 2, (Object) null);
        this.f83162e = C5532b.b(z10 ? 0.0f : f10, 0.0f, 2, (Object) null);
        this.f83163f = u1.e(e.c(aVar), (o1) null, 2, (Object) null);
    }

    public final C5530a<Float, C5554m> a() {
        return this.f83161d;
    }

    public final String b() {
        return (String) this.f83163f.getValue();
    }

    public final C5530a<Float, C5554m> c() {
        return this.f83162e;
    }

    public final C5530a<Float, C5554m> d() {
        return this.f83158a;
    }

    public final C5530a<Float, C5554m> e() {
        return this.f83159b;
    }

    public final C5530a<Float, C5554m> f() {
        return this.f83160c;
    }

    public final void g(String str) {
        C17542s.j(str, "<set-?>");
        this.f83163f.setValue(str);
    }
}
