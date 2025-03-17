package MI;

import AI.C15435p;
import UI.C16588i;
import UI.C16590k;
import UI.C16591l;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import YH.g0;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

/* renamed from: MI.b  reason: case insensitive filesystem */
public abstract class C16058b<TAnnotation> {

    /* renamed from: c  reason: collision with root package name */
    private static final a f136367c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, C16059c> f136368d;

    /* renamed from: a  reason: collision with root package name */
    private final C16043D f136369a;

    /* renamed from: b  reason: collision with root package name */
    private final ConcurrentHashMap<Object, TAnnotation> f136370b = new ConcurrentHashMap<>();

    /* renamed from: MI.b$a */
    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C16059c cVar : C16059c.values()) {
            String b10 = cVar.b();
            if (linkedHashMap.get(b10) == null) {
                linkedHashMap.put(b10, cVar);
            }
        }
        f136368d = linkedHashMap;
    }

    public C16058b(C16043D d10) {
        C17542s.j(d10, "javaTypeEnhancementState");
        this.f136369a = d10;
    }

    private final Set<C16059c> b(Set<? extends C16059c> set) {
        return set.contains(C16059c.TYPE_USE) ? g0.k(g0.j(C16870n.o1(C16059c.values()), C16059c.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    private final w e(TAnnotation tannotation) {
        C16591l i10;
        w u10 = u(tannotation);
        if (u10 != null) {
            return u10;
        }
        v w10 = w(tannotation);
        if (w10 == null) {
            return null;
        }
        Object a10 = w10.a();
        Set set = (Set) w10.b();
        C16054O t10 = t(tannotation);
        if (t10 == null) {
            t10 = s(a10);
        }
        if (!t10.j() && (i10 = i(a10, C16057a.f136366a)) != null) {
            return new w(C16591l.b(i10, (C16590k) null, t10.m(), 1, (Object) null), set, false, 4, (DefaultConstructorMarker) null);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public static final boolean f(Object obj) {
        C17542s.j(obj, "$this$extractNullability");
        return false;
    }

    private final C16591l i(TAnnotation tannotation, C17642l<? super TAnnotation, Boolean> lVar) {
        C16591l q10;
        C16591l q11 = q(tannotation, lVar.invoke(tannotation).booleanValue());
        if (q11 != null) {
            return q11;
        }
        Object v10 = v(tannotation);
        if (v10 == null) {
            return null;
        }
        C16054O s10 = s(tannotation);
        if (!s10.j() && (q10 = q(v10, lVar.invoke(v10).booleanValue())) != null) {
            return C16591l.b(q10, (C16590k) null, s10.m(), 1, (Object) null);
        }
        return null;
    }

    private final TAnnotation j(TAnnotation tannotation, C17066c cVar) {
        for (TAnnotation next : m(tannotation)) {
            if (C17542s.e(k(next), cVar)) {
                return next;
            }
        }
        return null;
    }

    private final boolean n(TAnnotation tannotation, C17066c cVar) {
        Iterable<Object> m10 = m(tannotation);
        if ((m10 instanceof Collection) && ((Collection) m10).isEmpty()) {
            return false;
        }
        for (Object k10 : m10) {
            if (C17542s.e(k(k10), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r6.equals("ALWAYS") != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        if (r6.equals("NEVER") == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r6.equals("MAYBE") == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        r6 = UI.C16590k.NULLABLE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final UI.C16591l q(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            cJ.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            MI.D r2 = r5.f136369a
            nI.l r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            MI.O r2 = (MI.C16054O) r2
            boolean r3 = r2.j()
            if (r3 == 0) goto L_0x001b
            return r1
        L_0x001b:
            java.util.Set r3 = MI.C16049J.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0029
            UI.k r6 = UI.C16590k.NOT_NULL
            goto L_0x008d
        L_0x0029:
            java.util.Set r3 = MI.C16049J.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0036
            UI.k r6 = UI.C16590k.NULLABLE
            goto L_0x008d
        L_0x0036:
            java.util.Set r3 = MI.C16049J.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L_0x0043
            UI.k r6 = UI.C16590k.FORCE_FLEXIBILITY
            goto L_0x008d
        L_0x0043:
            cJ.c r3 = MI.C16049J.c()
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r3)
            if (r0 == 0) goto L_0x009c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = YH.C16877v.x0(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x008b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L_0x007f;
                case 74175084: goto L_0x0076;
                case 433141802: goto L_0x006a;
                case 1933739535: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0087
        L_0x0061:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x0087
            goto L_0x008b
        L_0x006a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0073
            goto L_0x0087
        L_0x0073:
            UI.k r6 = UI.C16590k.FORCE_FLEXIBILITY
            goto L_0x008d
        L_0x0076:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0088
            goto L_0x0087
        L_0x007f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L_0x0088
        L_0x0087:
            return r1
        L_0x0088:
            UI.k r6 = UI.C16590k.NULLABLE
            goto L_0x008d
        L_0x008b:
            UI.k r6 = UI.C16590k.NOT_NULL
        L_0x008d:
            UI.l r0 = new UI.l
            boolean r1 = r2.m()
            if (r1 != 0) goto L_0x0097
            if (r7 == 0) goto L_0x0098
        L_0x0097:
            r4 = 1
        L_0x0098:
            r0.<init>(r6, r4)
            return r0
        L_0x009c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: MI.C16058b.q(java.lang.Object, boolean):UI.l");
    }

    private final C16054O r(TAnnotation tannotation) {
        C17066c k10 = k(tannotation);
        return (k10 == null || !x.b().containsKey(k10)) ? s(tannotation) : this.f136369a.c().invoke(k10);
    }

    private final C16054O s(TAnnotation tannotation) {
        C16054O t10 = t(tannotation);
        return t10 != null ? t10 : this.f136369a.d().c();
    }

    private final C16054O t(TAnnotation tannotation) {
        Iterable c10;
        String str;
        C16054O o10 = this.f136369a.d().e().get(k(tannotation));
        if (o10 != null) {
            return o10;
        }
        Object j10 = j(tannotation, C16049J.p());
        if (j10 == null || (c10 = c(j10, false)) == null || (str = (String) C16877v.x0(c10)) == null) {
            return null;
        }
        C16054O d10 = this.f136369a.d().d();
        if (d10 != null) {
            return d10;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return C16054O.WARN;
                }
                return null;
            } else if (!str.equals("STRICT")) {
                return null;
            } else {
                return C16054O.STRICT;
            }
        } else if (!str.equals("IGNORE")) {
            return null;
        } else {
            return C16054O.IGNORE;
        }
    }

    private final w u(TAnnotation tannotation) {
        w wVar;
        if (this.f136369a.b() || (wVar = x.a().get(k(tannotation))) == null) {
            return null;
        }
        C16054O r10 = r(tannotation);
        if (r10 == C16054O.IGNORE) {
            r10 = null;
        }
        if (r10 == null) {
            return null;
        }
        return w.b(wVar, C16591l.b(wVar.d(), (C16590k) null, r10.m(), 1, (Object) null), (Collection) null, false, 6, (Object) null);
    }

    private final v<TAnnotation, Set<C16059c>> w(TAnnotation tannotation) {
        Object j10;
        Object obj;
        if (this.f136369a.d().f() || (j10 = j(tannotation, C16049J.g())) == null) {
            return null;
        }
        Iterator it = m(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (v(obj) != null) {
                break;
            }
        }
        if (obj == null) {
            return null;
        }
        Iterable<String> c10 = c(j10, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : c10) {
            C16059c cVar = f136368d.get(str);
            if (cVar != null) {
                linkedHashSet.add(cVar);
            }
        }
        return new v<>(obj, b(linkedHashSet));
    }

    /* access modifiers changed from: protected */
    public abstract Iterable<String> c(TAnnotation tannotation, boolean z10);

    public final C16044E d(C16044E e10, Iterable<? extends TAnnotation> iterable) {
        EnumMap<C16059c, w> b10;
        C17542s.j(iterable, "annotations");
        if (this.f136369a.b()) {
            return e10;
        }
        ArrayList<w> arrayList = new ArrayList<>();
        for (Object e11 : iterable) {
            w e12 = e(e11);
            if (e12 != null) {
                arrayList.add(e12);
            }
        }
        if (arrayList.isEmpty()) {
            return e10;
        }
        Class<C16059c> cls = C16059c.class;
        EnumMap enumMap = new EnumMap(cls);
        for (w wVar : arrayList) {
            for (C16059c next : wVar.e()) {
                if (!enumMap.containsKey(next) || !o()) {
                    enumMap.put(next, wVar);
                } else {
                    w wVar2 = (w) enumMap.get(next);
                    if (wVar2 != null) {
                        C16591l d10 = wVar2.d();
                        C16591l d11 = wVar.d();
                        if (!C17542s.e(d11, d10) && (!d11.d() || d10.d())) {
                            wVar2 = (d11.d() || !d10.d()) ? null : wVar;
                        }
                        enumMap.put(next, wVar2);
                    }
                }
            }
        }
        EnumMap enumMap2 = (e10 == null || (b10 = e10.b()) == null) ? new EnumMap(cls) : new EnumMap(b10);
        boolean z10 = false;
        for (Map.Entry entry : enumMap.entrySet()) {
            C16059c cVar = (C16059c) entry.getKey();
            w wVar3 = (w) entry.getValue();
            if (wVar3 != null) {
                enumMap2.put(cVar, wVar3);
                z10 = true;
            }
        }
        return !z10 ? e10 : new C16044E(enumMap2);
    }

    public final C16588i g(Iterable<? extends TAnnotation> iterable) {
        C16588i iVar;
        C17542s.j(iterable, "annotations");
        C16588i iVar2 = null;
        for (Object k10 : iterable) {
            C17066c k11 = k(k10);
            if (C16877v.l0(C16049J.o(), k11)) {
                iVar = C16588i.READ_ONLY;
            } else if (C16877v.l0(C16049J.l(), k11)) {
                iVar = C16588i.MUTABLE;
            } else {
                continue;
            }
            if (iVar2 != null && iVar2 != iVar) {
                return null;
            }
            iVar2 = iVar;
        }
        return iVar2;
    }

    public final C16591l h(Iterable<? extends TAnnotation> iterable, C17642l<? super TAnnotation, Boolean> lVar) {
        C17542s.j(iterable, "annotations");
        C17542s.j(lVar, "forceWarning");
        C16591l lVar2 = null;
        for (Object i10 : iterable) {
            C16591l i11 = i(i10, lVar);
            if (lVar2 != null) {
                if (i11 != null && !C17542s.e(i11, lVar2)) {
                    if (!i11.d() || lVar2.d()) {
                        if (i11.d() || !lVar2.d()) {
                            return null;
                        }
                    }
                }
            }
            lVar2 = i11;
        }
        return lVar2;
    }

    /* access modifiers changed from: protected */
    public abstract C17066c k(TAnnotation tannotation);

    /* access modifiers changed from: protected */
    public abstract Object l(TAnnotation tannotation);

    /* access modifiers changed from: protected */
    public abstract Iterable<TAnnotation> m(TAnnotation tannotation);

    public abstract boolean o();

    public final boolean p(TAnnotation tannotation) {
        C17542s.j(tannotation, "annotation");
        Object j10 = j(tannotation, C15435p.a.f133063H);
        if (j10 == null) {
            return false;
        }
        Iterable<String> c10 = c(j10, false);
        if ((c10 instanceof Collection) && ((Collection) c10).isEmpty()) {
            return false;
        }
        for (String e10 : c10) {
            if (C17542s.e(e10, "TYPE")) {
                return true;
            }
        }
        return false;
    }

    public final TAnnotation v(TAnnotation tannotation) {
        TAnnotation tannotation2;
        C17542s.j(tannotation, "annotation");
        if (this.f136369a.d().f()) {
            return null;
        }
        if (C16877v.l0(C16049J.a(), k(tannotation)) || n(tannotation, C16049J.f())) {
            return tannotation;
        }
        if (!n(tannotation, C16049J.h())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f136370b;
        Object l10 = l(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(l10);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator it = m(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = v(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(l10, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }
}
