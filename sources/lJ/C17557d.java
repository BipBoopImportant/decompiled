package lJ;

import cJ.C17065b;
import cJ.C17066c;

/* renamed from: lJ.d  reason: case insensitive filesystem */
public class C17557d {

    /* renamed from: a  reason: collision with root package name */
    private final String f144407a;

    /* renamed from: b  reason: collision with root package name */
    private C17066c f144408b;

    private C17557d(String str) {
        if (str == null) {
            a(7);
        }
        this.f144407a = str;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        Throwable th2;
        if (!(i10 == 3 || i10 == 5)) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i10 == 3 || i10 == 5)) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    i11 = 3;
                    break;
            }
        }
        i11 = 2;
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
                objArr[0] = "classId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "internalNameByClassId";
        } else if (i10 != 5) {
            switch (i10) {
                case 8:
                    objArr[1] = "getFqNameForClassNameWithoutDollars";
                    break;
                case 9:
                    objArr[1] = "getPackageFqName";
                    break;
                case 10:
                    objArr[1] = "getInternalName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                    break;
            }
        } else {
            objArr[1] = "byFqNameWithoutInnerClasses";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
                objArr[2] = "internalNameByClassId";
                break;
            case 3:
            case 5:
            case 8:
            case 9:
            case 10:
                break;
            case 4:
            case 6:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i10 == 3 || i10 == 5)) {
            switch (i10) {
                case 8:
                case 9:
                case 10:
                    break;
                default:
                    th2 = new IllegalArgumentException(format);
                    break;
            }
        }
        th2 = new IllegalStateException(format);
        throw th2;
    }

    public static C17557d b(C17065b bVar) {
        if (bVar == null) {
            a(1);
        }
        return new C17557d(h(bVar));
    }

    public static C17557d c(C17066c cVar) {
        if (cVar == null) {
            a(4);
        }
        C17557d dVar = new C17557d(cVar.a().replace('.', '/'));
        dVar.f144408b = cVar;
        return dVar;
    }

    public static C17557d d(String str) {
        if (str == null) {
            a(0);
        }
        return new C17557d(str);
    }

    public static String h(C17065b bVar) {
        if (bVar == null) {
            a(2);
        }
        C17066c f10 = bVar.f();
        String replace = bVar.g().a().replace('.', '$');
        if (!f10.c()) {
            replace = f10.a().replace('.', '/') + "/" + replace;
        }
        if (replace == null) {
            a(3);
        }
        return replace;
    }

    public C17066c e() {
        return new C17066c(this.f144407a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f144407a.equals(((C17557d) obj).f144407a);
    }

    public String f() {
        String str = this.f144407a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public C17066c g() {
        int lastIndexOf = this.f144407a.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new C17066c(this.f144407a.substring(0, lastIndexOf).replace('/', '.'));
        }
        C17066c cVar = C17066c.f141246d;
        if (cVar == null) {
            a(9);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f144407a.hashCode();
    }

    public String toString() {
        return this.f144407a;
    }
}
