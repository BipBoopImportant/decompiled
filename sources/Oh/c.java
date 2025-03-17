package oH;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import oH.C17692b;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJS\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\fJS\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0017\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LoH/c;", "", "", "type", "LoH/b$a;", "builder", "<init>", "(ILoH/b$a;)V", "", "animated", "LXH/N;", "f", "(Z)V", "left", "top", "right", "bottom", "horizontal", "vertical", "g", "(ZZZZZZZ)V", "b", "c", "a", "I", "LoH/b$a;", "()LoH/b$a;", "setBuilder$insetter", "(LoH/b$a;)V", "insetter"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final int f145272a;

    /* renamed from: b  reason: collision with root package name */
    private C17692b.a f145273b;

    public c(int i10, C17692b.a aVar) {
        C17542s.j(aVar, "builder");
        this.f145272a = i10;
        this.f145273b = aVar;
    }

    public static /* synthetic */ void d(c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        cVar.b(z10);
    }

    public static /* synthetic */ void e(c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        }
        if ((i10 & 16) != 0) {
            z14 = false;
        }
        if ((i10 & 32) != 0) {
            z15 = false;
        }
        if ((i10 & 64) != 0) {
            z16 = false;
        }
        cVar.c(z10, z11, z12, z13, z14, z15, z16);
    }

    public static /* synthetic */ void h(c cVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        cVar.f(z10);
    }

    public static /* synthetic */ void i(c cVar, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            z12 = false;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        }
        if ((i10 & 16) != 0) {
            z14 = false;
        }
        if ((i10 & 32) != 0) {
            z15 = false;
        }
        if ((i10 & 64) != 0) {
            z16 = false;
        }
        cVar.g(z10, z11, z12, z13, z14, z15, z16);
    }

    public final C17692b.a a() {
        return this.f145273b;
    }

    public final void b(boolean z10) {
        e(this, false, false, false, false, true, true, z10, 15, (Object) null);
    }

    public final void c(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f145273b = this.f145273b.d(this.f145272a, k.a(z10, z11, z12, z13, z14, z15), z16);
    }

    public final void f(boolean z10) {
        i(this, false, false, false, false, true, true, z10, 15, (Object) null);
    }

    public final void g(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f145273b = this.f145273b.e(this.f145272a, k.a(z10, z11, z12, z13, z14, z15), z16);
    }
}
