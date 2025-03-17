package qJ;

import AI.C15429j;
import DI.C15538I;
import DI.C15543N;
import DI.C15557d;
import DI.C15558e;
import DI.C15561h;
import DI.C15578y;
import DI.i0;
import DI.u0;
import EI.C15644c;
import EI.C15645d;
import XH.v;
import XI.C16829b;
import YH.C16877v;
import YH.U;
import YH.X;
import ZI.C17005b;
import ZI.c;
import cJ.C17065b;
import cJ.C17069f;
import gJ.C17278i;
import iJ.C17362B;
import iJ.C17363C;
import iJ.C17364D;
import iJ.C17365E;
import iJ.C17367a;
import iJ.C17368b;
import iJ.C17369c;
import iJ.C17370d;
import iJ.C17371e;
import iJ.C17373g;
import iJ.C17375i;
import iJ.C17376j;
import iJ.C17377k;
import iJ.C17378l;
import iJ.C17379m;
import iJ.C17380n;
import iJ.C17386t;
import iJ.C17387u;
import iJ.C17390x;
import iJ.C17391y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.C17542s;
import tI.C17974j;
import tI.C17978n;
import uJ.C18096U;
import uJ.C18113f0;
import wJ.C18230l;

/* renamed from: qJ.g  reason: case insensitive filesystem */
public final class C17819g {

    /* renamed from: a  reason: collision with root package name */
    private final C15538I f146551a;

    /* renamed from: b  reason: collision with root package name */
    private final C15543N f146552b;

    /* renamed from: qJ.g$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f146553a;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|(2:25|26)|27|29) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|29) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                XI.b$b$c$c[] r0 = XI.C16829b.C3431b.c.C3434c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.BYTE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.CHAR     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.SHORT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.INT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.LONG     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.FLOAT     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.DOUBLE     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.STRING     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.CLASS     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.ENUM     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.ANNOTATION     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                XI.b$b$c$c r1 = XI.C16829b.C3431b.c.C3434c.ARRAY     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                f146553a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qJ.C17819g.a.<clinit>():void");
        }
    }

    public C17819g(C15538I i10, C15543N n10) {
        C17542s.j(i10, "module");
        C17542s.j(n10, "notFoundClasses");
        this.f146551a = i10;
        this.f146552b = n10;
    }

    private final boolean b(C17373g<?> gVar, C18096U u10, C16829b.C3431b.c cVar) {
        C16829b.C3431b.c.C3434c N10 = cVar.N();
        int i10 = N10 == null ? -1 : a.f146553a[N10.ordinal()];
        if (i10 == 10) {
            C15561h e10 = u10.N0().e();
            C15558e eVar = e10 instanceof C15558e ? (C15558e) e10 : null;
            if (eVar == null || C15429j.m0(eVar)) {
                return true;
            }
        } else if (i10 != 13) {
            return C17542s.e(gVar.a(this.f146551a), u10);
        } else {
            if (!(gVar instanceof C17368b) || ((List) ((C17368b) gVar).b()).size() != cVar.E().size()) {
                throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
            }
            C18096U l10 = c().l(u10);
            if (l10 == null) {
                return false;
            }
            C17368b bVar = (C17368b) gVar;
            C17974j o10 = C16877v.o((Collection) bVar.b());
            if ((o10 instanceof Collection) && ((Collection) o10).isEmpty()) {
                return true;
            }
            Iterator it = o10.iterator();
            while (it.hasNext()) {
                int c10 = ((U) it).c();
                C16829b.C3431b.c C10 = cVar.C(c10);
                C17542s.i(C10, "getArrayElement(...)");
                if (!b((C17373g) ((List) bVar.b()).get(c10), l10, C10)) {
                }
            }
            return true;
        }
        return false;
    }

    private final C15429j c() {
        return this.f146551a.p();
    }

    private final v<C17069f, C17373g<?>> d(C16829b.C3431b bVar, Map<C17069f, ? extends u0> map, c cVar) {
        u0 u0Var = (u0) map.get(C17799L.b(cVar, bVar.r()));
        if (u0Var == null) {
            return null;
        }
        C17069f b10 = C17799L.b(cVar, bVar.r());
        C18096U type = u0Var.getType();
        C17542s.i(type, "getType(...)");
        C16829b.C3431b.c s10 = bVar.s();
        C17542s.i(s10, "getValue(...)");
        return new v<>(b10, g(type, s10, cVar));
    }

    private final C15558e e(C17065b bVar) {
        return C15578y.d(this.f146551a, bVar, this.f146552b);
    }

    private final C17373g<?> g(C18096U u10, C16829b.C3431b.c cVar, c cVar2) {
        C17373g<?> f10 = f(u10, cVar, cVar2);
        if (!b(f10, u10, cVar)) {
            f10 = null;
        }
        if (f10 != null) {
            return f10;
        }
        C17378l.a aVar = C17378l.f143507b;
        return aVar.a("Unexpected argument value: actual type " + cVar.N() + " != expected type " + u10);
    }

    public final C15644c a(C16829b bVar, c cVar) {
        C17542s.j(bVar, "proto");
        C17542s.j(cVar, "nameResolver");
        C15558e e10 = e(C17799L.a(cVar, bVar.v()));
        Map j10 = X.j();
        if (bVar.s() != 0 && !C18230l.m(e10) && C17278i.t(e10)) {
            Collection<C15557d> l10 = e10.l();
            C17542s.i(l10, "getConstructors(...)");
            C15557d dVar = (C15557d) C16877v.c1(l10);
            if (dVar != null) {
                List<u0> j11 = dVar.j();
                C17542s.i(j11, "getValueParameters(...)");
                Iterable iterable = j11;
                LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(iterable, 10)), 16));
                for (Object next : iterable) {
                    linkedHashMap.put(((u0) next).getName(), next);
                }
                List<C16829b.C3431b> t10 = bVar.t();
                C17542s.i(t10, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (C16829b.C3431b bVar2 : t10) {
                    C17542s.g(bVar2);
                    v<C17069f, C17373g<?>> d10 = d(bVar2, linkedHashMap, cVar);
                    if (d10 != null) {
                        arrayList.add(d10);
                    }
                }
                j10 = X.v(arrayList);
            }
        }
        return new C15645d(e10.r(), j10, i0.f133841a);
    }

    public final C17373g<?> f(C18096U u10, C16829b.C3431b.c cVar, c cVar2) {
        C17373g<?> dVar;
        C17542s.j(u10, "expectedType");
        C17542s.j(cVar, "value");
        C17542s.j(cVar2, "nameResolver");
        Boolean f10 = C17005b.f140810P.d(cVar.J());
        C17542s.i(f10, "get(...)");
        boolean booleanValue = f10.booleanValue();
        C16829b.C3431b.c.C3434c N10 = cVar.N();
        switch (N10 == null ? -1 : a.f146553a[N10.ordinal()]) {
            case 1:
                byte L10 = (byte) ((int) cVar.L());
                if (!booleanValue) {
                    dVar = new C17370d(L10);
                    break;
                } else {
                    dVar = new C17362B(L10);
                    break;
                }
            case 2:
                return new C17371e((char) ((int) cVar.L()));
            case 3:
                short L11 = (short) ((int) cVar.L());
                if (!booleanValue) {
                    dVar = new C17390x(L11);
                    break;
                } else {
                    dVar = new C17365E(L11);
                    break;
                }
            case 4:
                int L12 = (int) cVar.L();
                if (!booleanValue) {
                    dVar = new C17380n(L12);
                    break;
                } else {
                    dVar = new C17363C(L12);
                    break;
                }
            case 5:
                long L13 = cVar.L();
                return booleanValue ? new C17364D(L13) : new C17387u(L13);
            case 6:
                return new C17379m(cVar.K());
            case 7:
                return new C17376j(cVar.H());
            case 8:
                return new C17369c(cVar.L() != 0);
            case 9:
                return new C17391y(cVar2.getString(cVar.M()));
            case 10:
                return new C17386t(C17799L.a(cVar2, cVar.F()), cVar.B());
            case 11:
                return new C17377k(C17799L.a(cVar2, cVar.F()), C17799L.b(cVar2, cVar.I()));
            case 12:
                C16829b A10 = cVar.A();
                C17542s.i(A10, "getAnnotation(...)");
                return new C17367a(a(A10, cVar2));
            case 13:
                C17375i iVar = C17375i.f143504a;
                List<C16829b.C3431b.c> E10 = cVar.E();
                C17542s.i(E10, "getArrayElementList(...)");
                Iterable<C16829b.C3431b.c> iterable = E10;
                ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
                for (C16829b.C3431b.c cVar3 : iterable) {
                    C18113f0 i10 = c().i();
                    C17542s.i(i10, "getAnyType(...)");
                    C17542s.g(cVar3);
                    arrayList.add(f(i10, cVar3, cVar2));
                }
                return iVar.c(arrayList, u10);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.N() + " (expected " + u10 + ')').toString());
        }
        return dVar;
    }
}
