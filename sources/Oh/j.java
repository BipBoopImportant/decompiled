package oH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR*\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0003\u001a\u0004\b\u0013\u0010\u0014R*\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0012\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\u0014R*\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0012\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0014R*\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00048\u0006@BX\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0012\u0012\u0004\b\u001e\u0010\u0003\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010$\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014¨\u0006%"}, d2 = {"LoH/j;", "", "<init>", "()V", "", "insetTypes", "sides", "LXH/N;", "i", "(II)V", "other", "h", "(LoH/j;)LoH/j;", "type", "g", "(I)LoH/j;", "<set-?>", "a", "I", "c", "()I", "getLeft$annotations", "left", "b", "e", "getTop$annotations", "top", "d", "getRight$annotations", "right", "getBottom$annotations", "bottom", "", "f", "()Z", "isEmpty", "all", "insetter"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private int f145276a;

    /* renamed from: b  reason: collision with root package name */
    private int f145277b;

    /* renamed from: c  reason: collision with root package name */
    private int f145278c;

    /* renamed from: d  reason: collision with root package name */
    private int f145279d;

    public final int a() {
        return this.f145276a | this.f145277b | this.f145278c | this.f145279d;
    }

    public final int b() {
        return this.f145279d;
    }

    public final int c() {
        return this.f145276a;
    }

    public final int d() {
        return this.f145278c;
    }

    public final int e() {
        return this.f145277b;
    }

    public final boolean f() {
        return a() == 0;
    }

    public final j g(int i10) {
        if (f() || i10 == 0) {
            return this;
        }
        j jVar = new j();
        int c10 = c();
        int i11 = ~i10;
        jVar.f145276a = c10 & i11;
        jVar.f145277b = e() & i11;
        jVar.f145278c = d() & i11;
        jVar.f145279d = i11 & b();
        return jVar;
    }

    public final j h(j jVar) {
        C17542s.j(jVar, "other");
        if (jVar.f()) {
            return this;
        }
        j jVar2 = new j();
        jVar2.f145276a = c() | jVar.c();
        jVar2.f145277b = e() | jVar.e();
        jVar2.f145278c = d() | jVar.d();
        jVar2.f145279d = jVar.b() | b();
        return jVar2;
    }

    public final void i(int i10, int i11) {
        if ((i11 & 1) != 0) {
            this.f145276a |= i10;
        }
        if ((i11 & 2) != 0) {
            this.f145277b |= i10;
        }
        if ((i11 & 4) != 0) {
            this.f145278c |= i10;
        }
        if ((i11 & 8) != 0) {
            this.f145279d = i10 | this.f145279d;
        }
    }
}
