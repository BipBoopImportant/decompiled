package oJ;

import uJ.C18096U;

public class j extends C17699a {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public j(C18096U u10) {
        this(u10, (C17705g) null);
        if (u10 == null) {
            c(0);
        }
    }

    private static /* synthetic */ void c(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 2) {
            objArr[0] = "type";
        } else {
            objArr[0] = "newType";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i10 != 2) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "replaceType";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        return "{Transient} : " + getType();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private j(C18096U u10, C17705g gVar) {
        super(u10, gVar);
        if (u10 == null) {
            c(1);
        }
    }
}
