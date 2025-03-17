package L1;

import kotlin.Metadata;
import nI.C17631a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\r\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"LL1/j;", "", "Lkotlin/Function0;", "", "value", "maxValue", "", "reverseScrolling", "<init>", "(LnI/a;LnI/a;Z)V", "", "toString", "()Ljava/lang/String;", "a", "LnI/a;", "c", "()LnI/a;", "b", "Z", "()Z", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private final C17631a<Float> f8945a;

    /* renamed from: b  reason: collision with root package name */
    private final C17631a<Float> f8946b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f8947c;

    public j(C17631a<Float> aVar, C17631a<Float> aVar2, boolean z10) {
        this.f8945a = aVar;
        this.f8946b = aVar2;
        this.f8947c = z10;
    }

    public final C17631a<Float> a() {
        return this.f8946b;
    }

    public final boolean b() {
        return this.f8947c;
    }

    public final C17631a<Float> c() {
        return this.f8945a;
    }

    public String toString() {
        return "ScrollAxisRange(value=" + this.f8945a.invoke().floatValue() + ", maxValue=" + this.f8946b.invoke().floatValue() + ", reverseScrolling=" + this.f8947c + ')';
    }
}
