package wK;

import N1.Y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import s0.C5834E;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0019\u0010\u001d¨\u0006\u001e"}, d2 = {"LwK/F0;", "", "LN1/Y;", "title", "label", "subHeader", "body", "Ls0/E;", "contentPadding", "<init>", "(LN1/Y;LN1/Y;LN1/Y;LN1/Y;Ls0/E;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LN1/Y;", "e", "()LN1/Y;", "b", "c", "d", "Ls0/E;", "()Ls0/E;", "design_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class F0 {

    /* renamed from: a  reason: collision with root package name */
    private final Y f149467a;

    /* renamed from: b  reason: collision with root package name */
    private final Y f149468b;

    /* renamed from: c  reason: collision with root package name */
    private final Y f149469c;

    /* renamed from: d  reason: collision with root package name */
    private final Y f149470d;

    /* renamed from: e  reason: collision with root package name */
    private final C5834E f149471e;

    public F0(Y y10, Y y11, Y y12, Y y13, C5834E e10) {
        C17542s.j(y10, "title");
        C17542s.j(y11, "label");
        C17542s.j(y12, "subHeader");
        C17542s.j(y13, "body");
        C17542s.j(e10, "contentPadding");
        this.f149467a = y10;
        this.f149468b = y11;
        this.f149469c = y12;
        this.f149470d = y13;
        this.f149471e = e10;
    }

    public final Y a() {
        return this.f149470d;
    }

    public final C5834E b() {
        return this.f149471e;
    }

    public final Y c() {
        return this.f149468b;
    }

    public final Y d() {
        return this.f149469c;
    }

    public final Y e() {
        return this.f149467a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F0)) {
            return false;
        }
        F0 f02 = (F0) obj;
        return C17542s.e(this.f149467a, f02.f149467a) && C17542s.e(this.f149468b, f02.f149468b) && C17542s.e(this.f149469c, f02.f149469c) && C17542s.e(this.f149470d, f02.f149470d) && C17542s.e(this.f149471e, f02.f149471e);
    }

    public int hashCode() {
        return (((((((this.f149467a.hashCode() * 31) + this.f149468b.hashCode()) * 31) + this.f149469c.hashCode()) * 31) + this.f149470d.hashCode()) * 31) + this.f149471e.hashCode();
    }

    public String toString() {
        Y y10 = this.f149467a;
        Y y11 = this.f149468b;
        Y y12 = this.f149469c;
        Y y13 = this.f149470d;
        C5834E e10 = this.f149471e;
        return "CardStyles(title=" + y10 + ", label=" + y11 + ", subHeader=" + y12 + ", body=" + y13 + ", contentPadding=" + e10 + ")";
    }
}
