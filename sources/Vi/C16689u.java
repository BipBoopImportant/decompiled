package VI;

import AI.C15432m;
import HJ.C15854t;
import VI.C16687s;
import XH.t;
import kotlin.jvm.internal.C17542s;
import lJ.C17557d;
import lJ.C17558e;

/* renamed from: VI.u  reason: case insensitive filesystem */
final class C16689u implements C16688t<C16687s> {

    /* renamed from: a  reason: collision with root package name */
    public static final C16689u f139420a = new C16689u();

    /* renamed from: VI.u$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f139421a;

        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|19) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                AI.m[] r0 = AI.C15432m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                AI.m r1 = AI.C15432m.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                AI.m r1 = AI.C15432m.CHAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                AI.m r1 = AI.C15432m.BYTE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                AI.m r1 = AI.C15432m.SHORT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                AI.m r1 = AI.C15432m.INT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                AI.m r1 = AI.C15432m.FLOAT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                AI.m r1 = AI.C15432m.LONG     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                AI.m r1 = AI.C15432m.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                f139421a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: VI.C16689u.a.<clinit>():void");
        }
    }

    private C16689u() {
    }

    /* renamed from: g */
    public C16687s c(C16687s sVar) {
        C17542s.j(sVar, "possiblyPrimitiveType");
        if (!(sVar instanceof C16687s.d)) {
            return sVar;
        }
        C16687s.d dVar = (C16687s.d) sVar;
        if (dVar.i() == null) {
            return sVar;
        }
        String f10 = C17557d.c(dVar.i().B()).f();
        C17542s.i(f10, "getInternalName(...)");
        return e(f10);
    }

    /* renamed from: h */
    public C16687s b(String str) {
        C17558e eVar;
        C17542s.j(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        C17558e[] values = C17558e.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i10];
            if (eVar.m().charAt(0) == charAt) {
                break;
            }
            i10++;
        }
        if (eVar != null) {
            return new C16687s.d(eVar);
        }
        if (charAt == 'V') {
            return new C16687s.d((C17558e) null);
        }
        if (charAt != '[') {
            if (charAt == 'L') {
                boolean i02 = C15854t.i0(str, ';', false, 2, (Object) null);
            }
            String substring = str.substring(1, str.length() - 1);
            C17542s.i(substring, "substring(...)");
            return new C16687s.c(substring);
        }
        String substring2 = str.substring(1);
        C17542s.i(substring2, "substring(...)");
        return new C16687s.a(b(substring2));
    }

    /* renamed from: i */
    public C16687s.c e(String str) {
        C17542s.j(str, "internalName");
        return new C16687s.c(str);
    }

    /* renamed from: j */
    public C16687s a(C15432m mVar) {
        C17542s.j(mVar, "primitiveType");
        switch (a.f139421a[mVar.ordinal()]) {
            case 1:
                return C16687s.f139408a.a();
            case 2:
                return C16687s.f139408a.c();
            case 3:
                return C16687s.f139408a.b();
            case 4:
                return C16687s.f139408a.h();
            case 5:
                return C16687s.f139408a.f();
            case 6:
                return C16687s.f139408a.e();
            case 7:
                return C16687s.f139408a.g();
            case 8:
                return C16687s.f139408a.d();
            default:
                throw new t();
        }
    }

    /* renamed from: k */
    public C16687s f() {
        return e("java/lang/Class");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0031, code lost:
        r3 = r3.m();
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String d(VI.C16687s r3) {
        /*
            r2 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            boolean r0 = r3 instanceof VI.C16687s.a
            if (r0 == 0) goto L_0x0025
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            VI.s$a r3 = (VI.C16687s.a) r3
            VI.s r3 = r3.i()
            java.lang.String r3 = r2.d(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            goto L_0x005a
        L_0x0025:
            boolean r0 = r3 instanceof VI.C16687s.d
            if (r0 == 0) goto L_0x003a
            VI.s$d r3 = (VI.C16687s.d) r3
            lJ.e r3 = r3.i()
            if (r3 == 0) goto L_0x0037
            java.lang.String r3 = r3.m()
            if (r3 != 0) goto L_0x005a
        L_0x0037:
            java.lang.String r3 = "V"
            goto L_0x005a
        L_0x003a:
            boolean r0 = r3 instanceof VI.C16687s.c
            if (r0 == 0) goto L_0x005b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 76
            r0.append(r1)
            VI.s$c r3 = (VI.C16687s.c) r3
            java.lang.String r3 = r3.i()
            r0.append(r3)
            r3 = 59
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L_0x005a:
            return r3
        L_0x005b:
            XH.t r3 = new XH.t
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: VI.C16689u.d(VI.s):java.lang.String");
    }
}
