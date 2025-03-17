package uJ;

import DI.C15558e;
import DI.l0;
import DI.n0;
import gJ.C17278i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import tJ.C17994n;

/* renamed from: uJ.v  reason: case insensitive filesystem */
public class C18141v extends C18104b {

    /* renamed from: d  reason: collision with root package name */
    private final C15558e f147934d;

    /* renamed from: e  reason: collision with root package name */
    private final List<n0> f147935e;

    /* renamed from: f  reason: collision with root package name */
    private final Collection<C18096U> f147936f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18141v(C15558e eVar, List<? extends n0> list, Collection<C18096U> collection, C17994n nVar) {
        super(nVar);
        if (eVar == null) {
            I(0);
        }
        if (list == null) {
            I(1);
        }
        if (collection == null) {
            I(2);
        }
        if (nVar == null) {
            I(3);
        }
        this.f147934d = eVar;
        this.f147935e = Collections.unmodifiableList(new ArrayList(list));
        this.f147936f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void I(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3)];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (!(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    /* renamed from: J */
    public C15558e e() {
        C15558e eVar = this.f147934d;
        if (eVar == null) {
            I(5);
        }
        return eVar;
    }

    public boolean f() {
        return true;
    }

    public List<n0> getParameters() {
        List<n0> list = this.f147935e;
        if (list == null) {
            I(4);
        }
        return list;
    }

    /* access modifiers changed from: protected */
    public Collection<C18096U> s() {
        Collection<C18096U> collection = this.f147936f;
        if (collection == null) {
            I(6);
        }
        return collection;
    }

    public String toString() {
        return C17278i.m(this.f147934d).a();
    }

    /* access modifiers changed from: protected */
    public l0 w() {
        l0.a aVar = l0.a.f133844a;
        if (aVar == null) {
            I(7);
        }
        return aVar;
    }
}
