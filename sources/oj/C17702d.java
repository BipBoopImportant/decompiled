package oJ;

import DI.C15554a;
import uJ.C18096U;

/* renamed from: oJ.d  reason: case insensitive filesystem */
public class C17702d extends C17699a implements C17705g {

    /* renamed from: c  reason: collision with root package name */
    private final C15554a f145294c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17702d(C15554a aVar, C18096U u10, C17705g gVar) {
        super(u10, gVar);
        if (aVar == null) {
            c(0);
        }
        if (u10 == null) {
            c(1);
        }
        this.f145294c = aVar;
    }

    private static /* synthetic */ void c(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i10 != 2 ? 3 : 2)];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i10 != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        return getType() + ": Ext {" + this.f145294c + "}";
    }
}
