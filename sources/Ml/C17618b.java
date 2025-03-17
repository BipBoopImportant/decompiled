package mL;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nL.C17686c;
import pL.C17770a;
import sL.C17952a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"LmL/b;", "", "LnL/c;", "logger", "LsL/a;", "scope", "LpL/a;", "parameters", "<init>", "(LnL/c;LsL/a;LpL/a;)V", "a", "LnL/c;", "()LnL/c;", "b", "LsL/a;", "c", "()LsL/a;", "LpL/a;", "()LpL/a;", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mL.b  reason: case insensitive filesystem */
public final class C17618b {

    /* renamed from: a  reason: collision with root package name */
    private final C17686c f144573a;

    /* renamed from: b  reason: collision with root package name */
    private final C17952a f144574b;

    /* renamed from: c  reason: collision with root package name */
    private final C17770a f144575c;

    public C17618b(C17686c cVar, C17952a aVar, C17770a aVar2) {
        C17542s.j(cVar, "logger");
        C17542s.j(aVar, "scope");
        this.f144573a = cVar;
        this.f144574b = aVar;
        this.f144575c = aVar2;
    }

    public final C17686c a() {
        return this.f144573a;
    }

    public final C17770a b() {
        return this.f144575c;
    }

    public final C17952a c() {
        return this.f144574b;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17618b(C17686c cVar, C17952a aVar, C17770a aVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, aVar, (i10 & 4) != 0 ? null : aVar2);
    }
}
