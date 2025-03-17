package U0;

import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LU0/d;", "", "", "loc", "<init>", "(I)V", "LU0/c1;", "slots", "d", "(LU0/c1;)I", "LU0/f1;", "writer", "e", "(LU0/f1;)I", "", "toString", "()Ljava/lang/String;", "a", "I", "()I", "c", "location", "", "b", "()Z", "valid", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: U0.d  reason: case insensitive filesystem */
public final class C4866d {

    /* renamed from: a  reason: collision with root package name */
    private int f13945a;

    public C4866d(int i10) {
        this.f13945a = i10;
    }

    public final int a() {
        return this.f13945a;
    }

    public final boolean b() {
        return this.f13945a != Integer.MIN_VALUE;
    }

    public final void c(int i10) {
        this.f13945a = i10;
    }

    public final int d(C4865c1 c1Var) {
        return c1Var.i(this);
    }

    public final int e(C4874f1 f1Var) {
        return f1Var.F(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f13945a + " }";
    }
}
