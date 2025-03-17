package oJ;

import uJ.C18096U;

/* renamed from: oJ.a  reason: case insensitive filesystem */
public abstract class C17699a implements C17705g {

    /* renamed from: a  reason: collision with root package name */
    protected final C18096U f145288a;

    /* renamed from: b  reason: collision with root package name */
    private final C17705g f145289b;

    public C17699a(C18096U u10, C17705g gVar) {
        if (u10 == null) {
            c(0);
        }
        this.f145288a = u10;
        this.f145289b = gVar == null ? this : gVar;
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 1 || i10 == 2) ? 2 : 3)];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i10 == 1 || i10 == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i10 == 1 || i10 == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C18096U getType() {
        C18096U u10 = this.f145288a;
        if (u10 == null) {
            c(1);
        }
        return u10;
    }
}
