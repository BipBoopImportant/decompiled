package uJ;

import vJ.g;

public class G0 extends F0 {

    /* renamed from: a  reason: collision with root package name */
    private final Q0 f147815a;

    /* renamed from: b  reason: collision with root package name */
    private final C18096U f147816b;

    public G0(Q0 q02, C18096U u10) {
        if (q02 == null) {
            d(0);
        }
        if (u10 == null) {
            d(1);
        }
        this.f147815a = q02;
        this.f147816b = u10;
    }

    private static /* synthetic */ void d(int i10) {
        String str = (i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 4 || i10 == 5) ? 2 : 3)];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getProjectionKind";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        } else {
            objArr[1] = "getType";
        }
        if (i10 == 3) {
            objArr[2] = "replaceType";
        } else if (!(i10 == 4 || i10 == 5)) {
            if (i10 != 6) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "refine";
            }
        }
        String format = String.format(str, objArr);
        throw ((i10 == 4 || i10 == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean a() {
        return false;
    }

    public E0 b(g gVar) {
        if (gVar == null) {
            d(6);
        }
        return new G0(this.f147815a, gVar.h(this.f147816b));
    }

    public Q0 c() {
        Q0 q02 = this.f147815a;
        if (q02 == null) {
            d(4);
        }
        return q02;
    }

    public C18096U getType() {
        C18096U u10 = this.f147816b;
        if (u10 == null) {
            d(5);
        }
        return u10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public G0(C18096U u10) {
        this(Q0.INVARIANT, u10);
        if (u10 == null) {
            d(2);
        }
    }
}
