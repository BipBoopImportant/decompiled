package cJ;

import HJ.C15854t;
import XH.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.C17542s;

/* renamed from: cJ.e  reason: case insensitive filesystem */
public final class C17068e {

    /* renamed from: cJ.e$a */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f141256a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                cJ.k[] r0 = cJ.C17074k.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                cJ.k r1 = cJ.C17074k.BEGINNING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                cJ.k r1 = cJ.C17074k.AFTER_DOT     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                cJ.k r1 = cJ.C17074k.MIDDLE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f141256a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: cJ.C17068e.a.<clinit>():void");
        }
    }

    public static final <V> V a(C17066c cVar, Map<C17066c, ? extends V> map) {
        Object obj;
        C17542s.j(cVar, "<this>");
        C17542s.j(map, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            C17066c cVar2 = (C17066c) next.getKey();
            if (C17542s.e(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (!it.hasNext()) {
            obj = null;
        } else {
            obj = it.next();
            if (it.hasNext()) {
                int length = g((C17066c) ((Map.Entry) obj).getKey(), cVar).a().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((C17066c) ((Map.Entry) next2).getKey(), cVar).a().length();
                    if (length > length2) {
                        obj = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    public static final boolean b(C17066c cVar, C17066c cVar2) {
        C17542s.j(cVar, "<this>");
        C17542s.j(cVar2, "packageName");
        return C17542s.e(f(cVar), cVar2);
    }

    public static final boolean c(C17066c cVar, C17066c cVar2) {
        C17542s.j(cVar, "<this>");
        C17542s.j(cVar2, "packageName");
        if (!C17542s.e(cVar, cVar2) && !cVar2.c()) {
            return d(cVar.a(), cVar2.a());
        }
        return true;
    }

    private static final boolean d(String str, String str2) {
        return C15854t.W(str, str2, false, 2, (Object) null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        C17074k kVar = C17074k.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            int i11 = a.f141256a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierStart(charAt)) {
                    return false;
                }
                kVar = C17074k.MIDDLE;
            } else if (i11 != 3) {
                throw new t();
            } else if (charAt == '.') {
                kVar = C17074k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        return kVar != C17074k.AFTER_DOT;
    }

    public static final C17066c f(C17066c cVar) {
        C17542s.j(cVar, "<this>");
        if (cVar.c()) {
            return null;
        }
        return cVar.d();
    }

    public static final C17066c g(C17066c cVar, C17066c cVar2) {
        C17542s.j(cVar, "<this>");
        C17542s.j(cVar2, "prefix");
        if (!c(cVar, cVar2) || cVar2.c()) {
            return cVar;
        }
        if (C17542s.e(cVar, cVar2)) {
            return C17066c.f141246d;
        }
        String substring = cVar.a().substring(cVar2.a().length() + 1);
        C17542s.i(substring, "substring(...)");
        return new C17066c(substring);
    }
}
