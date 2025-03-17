package x1;

import U0.C4899r0;
import U0.o1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR1\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028V@VX\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\t\u0010\u000e\"\u0004\b\f\u0010\u000f\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0011"}, d2 = {"Lx1/c;", "Lx1/b;", "Lx1/a;", "initialInputMode", "Lkotlin/Function1;", "", "onRequestInputModeChange", "<init>", "(ILnI/l;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "LnI/l;", "<set-?>", "b", "LU0/r0;", "()I", "(I)V", "inputMode", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c implements C6241b {

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<C6240a, Boolean> f31831a;

    /* renamed from: b  reason: collision with root package name */
    private final C4899r0 f31832b;

    public /* synthetic */ c(int i10, C17642l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, lVar);
    }

    public int a() {
        return ((C6240a) this.f31832b.getValue()).i();
    }

    public void b(int i10) {
        this.f31832b.setValue(C6240a.c(i10));
    }

    private c(int i10, C17642l<? super C6240a, Boolean> lVar) {
        this.f31831a = lVar;
        this.f31832b = u1.e(C6240a.c(i10), (o1) null, 2, (Object) null);
    }
}
