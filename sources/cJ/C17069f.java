package cJ;

/* renamed from: cJ.f  reason: case insensitive filesystem */
public final class C17069f implements Comparable<C17069f> {

    /* renamed from: a  reason: collision with root package name */
    private final String f141257a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f141258b;

    private C17069f(String str, boolean z10) {
        if (str == null) {
            a(0);
        }
        this.f141257a = str;
        this.f141258b = z10;
    }

    public static boolean C(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static C17069f D(String str) {
        if (str == null) {
            a(8);
        }
        if (str.startsWith("<")) {
            return new C17069f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3)];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "identifierIfValid";
                break;
            case 8:
                objArr[2] = "special";
                break;
            case 9:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static C17069f n(String str) {
        if (str == null) {
            a(9);
        }
        return str.startsWith("<") ? D(str) : v(str);
    }

    public static C17069f v(String str) {
        if (str == null) {
            a(5);
        }
        return new C17069f(str, false);
    }

    public boolean B() {
        return this.f141258b;
    }

    public String b() {
        String str = this.f141257a;
        if (str == null) {
            a(1);
        }
        return str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17069f)) {
            return false;
        }
        C17069f fVar = (C17069f) obj;
        return this.f141258b == fVar.f141258b && this.f141257a.equals(fVar.f141257a);
    }

    public int hashCode() {
        return (this.f141257a.hashCode() * 31) + (this.f141258b ? 1 : 0);
    }

    /* renamed from: j */
    public int compareTo(C17069f fVar) {
        return this.f141257a.compareTo(fVar.f141257a);
    }

    public String m() {
        if (!this.f141258b) {
            String b10 = b();
            if (b10 == null) {
                a(2);
            }
            return b10;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public String toString() {
        return this.f141257a;
    }
}
