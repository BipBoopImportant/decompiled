package SC;

import U0.C4889m;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002BC\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u0017\u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\"\u001a\u0004\b\u001e\u0010#¨\u0006$"}, d2 = {"LSC/v2;", "T", "", "key", "", "xCoordinate", "yCoordinate", "Lkotlin/Function0;", "LXH/N;", "content", "onClick", "<init>", "(Ljava/lang/Object;FFLnI/p;LnI/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Object;", "b", "()Ljava/lang/Object;", "F", "d", "()F", "c", "e", "LnI/p;", "()LnI/p;", "LnI/a;", "()LnI/a;", "skapa_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: SC.v2  reason: case insensitive filesystem */
public final class C13649v2<T> {

    /* renamed from: f  reason: collision with root package name */
    public static final int f116466f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final T f116467a;

    /* renamed from: b  reason: collision with root package name */
    private final float f116468b;

    /* renamed from: c  reason: collision with root package name */
    private final float f116469c;

    /* renamed from: d  reason: collision with root package name */
    private final p<C4889m, Integer, C16807N> f116470d;

    /* renamed from: e  reason: collision with root package name */
    private final C17631a<C16807N> f116471e;

    public C13649v2(T t10, float f10, float f11, p<? super C4889m, ? super Integer, C16807N> pVar, C17631a<C16807N> aVar) {
        C17542s.j(pVar, "content");
        this.f116467a = t10;
        this.f116468b = f10;
        this.f116469c = f11;
        this.f116470d = pVar;
        this.f116471e = aVar;
    }

    public final p<C4889m, Integer, C16807N> a() {
        return this.f116470d;
    }

    public final T b() {
        return this.f116467a;
    }

    public final C17631a<C16807N> c() {
        return this.f116471e;
    }

    public final float d() {
        return this.f116468b;
    }

    public final float e() {
        return this.f116469c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13649v2)) {
            return false;
        }
        C13649v2 v2Var = (C13649v2) obj;
        return C17542s.e(this.f116467a, v2Var.f116467a) && Float.compare(this.f116468b, v2Var.f116468b) == 0 && Float.compare(this.f116469c, v2Var.f116469c) == 0 && C17542s.e(this.f116470d, v2Var.f116470d) && C17542s.e(this.f116471e, v2Var.f116471e);
    }

    public int hashCode() {
        T t10 = this.f116467a;
        int i10 = 0;
        int hashCode = (((((((t10 == null ? 0 : t10.hashCode()) * 31) + Float.hashCode(this.f116468b)) * 31) + Float.hashCode(this.f116469c)) * 31) + this.f116470d.hashCode()) * 31;
        C17631a<C16807N> aVar = this.f116471e;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        T t10 = this.f116467a;
        float f10 = this.f116468b;
        float f11 = this.f116469c;
        p<C4889m, Integer, C16807N> pVar = this.f116470d;
        C17631a<C16807N> aVar = this.f116471e;
        return "SkapaShoppableImageItem(key=" + t10 + ", xCoordinate=" + f10 + ", yCoordinate=" + f11 + ", content=" + pVar + ", onClick=" + aVar + ")";
    }
}
