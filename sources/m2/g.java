package m2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import n2.C5643c;
import n2.f;
import n2.h;
import n2.i;
import n2.j;

public class g {

    /* renamed from: k  reason: collision with root package name */
    public static final Integer f26155k = 0;

    /* renamed from: a  reason: collision with root package name */
    private C5575c f26156a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f26157b = true;

    /* renamed from: c  reason: collision with root package name */
    protected HashMap<Object, f> f26158c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    protected HashMap<Object, e> f26159d = new HashMap<>();

    /* renamed from: e  reason: collision with root package name */
    HashMap<String, ArrayList<String>> f26160e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final C5573a f26161f;

    /* renamed from: g  reason: collision with root package name */
    private int f26162g;

    /* renamed from: h  reason: collision with root package name */
    ArrayList<Object> f26163h;

    /* renamed from: i  reason: collision with root package name */
    ArrayList<p2.e> f26164i;

    /* renamed from: j  reason: collision with root package name */
    boolean f26165j;

    public enum a {
        SPREAD,
        SPREAD_INSIDE,
        PACKED;
        
        public static Map<String, a> chainMap;
        public static Map<String, Integer> valueMap;

        static {
            a aVar;
            a aVar2;
            a aVar3;
            chainMap = new HashMap();
            valueMap = new HashMap();
            chainMap.put("packed", aVar3);
            chainMap.put("spread_inside", aVar2);
            chainMap.put("spread", aVar);
            valueMap.put("packed", 2);
            valueMap.put("spread_inside", 1);
            valueMap.put("spread", 0);
        }

        public static int b(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }
    }

    public enum b {
        LEFT_TO_LEFT,
        LEFT_TO_RIGHT,
        RIGHT_TO_LEFT,
        RIGHT_TO_RIGHT,
        START_TO_START,
        START_TO_END,
        END_TO_START,
        END_TO_END,
        TOP_TO_TOP,
        TOP_TO_BOTTOM,
        TOP_TO_BASELINE,
        BOTTOM_TO_TOP,
        BOTTOM_TO_BOTTOM,
        BOTTOM_TO_BASELINE,
        BASELINE_TO_BASELINE,
        BASELINE_TO_TOP,
        BASELINE_TO_BOTTOM,
        CENTER_HORIZONTALLY,
        CENTER_VERTICALLY,
        CIRCULAR_CONSTRAINT
    }

    public enum c {
        LEFT,
        RIGHT,
        START,
        END,
        TOP,
        BOTTOM
    }

    public enum d {
        HORIZONTAL_CHAIN,
        VERTICAL_CHAIN,
        ALIGN_HORIZONTALLY,
        ALIGN_VERTICALLY,
        BARRIER,
        LAYER,
        HORIZONTAL_FLOW,
        VERTICAL_FLOW,
        GRID,
        ROW,
        COLUMN,
        FLOW
    }

    public enum e {
        NONE,
        CHAIN,
        ALIGNED;
        
        public static Map<String, Integer> valueMap;
        public static Map<String, e> wrapMap;

        static {
            e eVar;
            e eVar2;
            e eVar3;
            wrapMap = new HashMap();
            valueMap = new HashMap();
            wrapMap.put("none", eVar);
            wrapMap.put("chain", eVar2);
            wrapMap.put("aligned", eVar3);
            valueMap.put("none", 0);
            valueMap.put("chain", 3);
            valueMap.put("aligned", 2);
        }

        public static int b(String str) {
            if (valueMap.containsKey(str)) {
                return valueMap.get(str).intValue();
            }
            return -1;
        }
    }

    public g() {
        C5573a aVar = new C5573a(this);
        this.f26161f = aVar;
        this.f26162g = 0;
        this.f26163h = new ArrayList<>();
        this.f26164i = new ArrayList<>();
        this.f26165j = true;
        Integer num = f26155k;
        aVar.c(num);
        this.f26158c.put(num, aVar);
    }

    private String g() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("__HELPER_KEY_");
        int i10 = this.f26162g;
        this.f26162g = i10 + 1;
        sb2.append(i10);
        sb2.append("__");
        return sb2.toString();
    }

    public void A(String str, String str2) {
        ArrayList arrayList;
        C5573a d10 = d(str);
        if (d10 != null) {
            d10.b0(str2);
            if (!this.f26160e.containsKey(str2)) {
                arrayList = new ArrayList();
                this.f26160e.put(str2, arrayList);
            } else {
                arrayList = this.f26160e.get(str2);
            }
            arrayList.add(str);
        }
    }

    public g B(d dVar) {
        this.f26161f.f0(dVar);
        return this;
    }

    public j C() {
        return (j) n((Object) null, d.VERTICAL_CHAIN);
    }

    public h D(Object obj) {
        return l(obj, 1);
    }

    public g E(d dVar) {
        return B(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x014d, code lost:
        r1 = (m2.e) r0.d();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(p2.f r8) {
        /*
            r7 = this;
            r8.z1()
            m2.a r0 = r7.f26161f
            m2.d r0 = r0.E()
            r1 = 0
            r0.a(r7, r8, r1)
            m2.a r0 = r7.f26161f
            m2.d r0 = r0.C()
            r1 = 1
            r0.a(r7, r8, r1)
            java.util.HashMap<java.lang.Object, m2.e> r0 = r7.f26159d
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x004b
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, m2.e> r2 = r7.f26159d
            java.lang.Object r2 = r2.get(r1)
            m2.e r2 = (m2.e) r2
            p2.j r2 = r2.u0()
            if (r2 == 0) goto L_0x0021
            java.util.HashMap<java.lang.Object, m2.f> r3 = r7.f26158c
            java.lang.Object r3 = r3.get(r1)
            m2.f r3 = (m2.f) r3
            if (r3 != 0) goto L_0x0047
            m2.a r3 = r7.d(r1)
        L_0x0047:
            r3.b(r2)
            goto L_0x0021
        L_0x004b:
            java.util.HashMap<java.lang.Object, m2.f> r0 = r7.f26158c
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0055:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0091
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, m2.f> r2 = r7.f26158c
            java.lang.Object r2 = r2.get(r1)
            m2.f r2 = (m2.f) r2
            m2.a r3 = r7.f26161f
            if (r2 == r3) goto L_0x0055
            n2.e r3 = r2.d()
            boolean r3 = r3 instanceof m2.e
            if (r3 == 0) goto L_0x0055
            n2.e r2 = r2.d()
            m2.e r2 = (m2.e) r2
            p2.j r2 = r2.u0()
            if (r2 == 0) goto L_0x0055
            java.util.HashMap<java.lang.Object, m2.f> r3 = r7.f26158c
            java.lang.Object r3 = r3.get(r1)
            m2.f r3 = (m2.f) r3
            if (r3 != 0) goto L_0x008d
            m2.a r3 = r7.d(r1)
        L_0x008d:
            r3.b(r2)
            goto L_0x0055
        L_0x0091:
            java.util.HashMap<java.lang.Object, m2.f> r0 = r7.f26158c
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x009b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00d7
            java.lang.Object r1 = r0.next()
            java.util.HashMap<java.lang.Object, m2.f> r2 = r7.f26158c
            java.lang.Object r1 = r2.get(r1)
            m2.f r1 = (m2.f) r1
            m2.a r2 = r7.f26161f
            if (r1 == r2) goto L_0x00d3
            p2.e r2 = r1.a()
            java.lang.Object r3 = r1.getKey()
            java.lang.String r3 = r3.toString()
            r2.G0(r3)
            r3 = 0
            r2.g1(r3)
            n2.e r3 = r1.d()
            boolean r3 = r3 instanceof n2.h
            if (r3 == 0) goto L_0x00cf
            r1.apply()
        L_0x00cf:
            r8.a(r2)
            goto L_0x009b
        L_0x00d3:
            r1.b(r8)
            goto L_0x009b
        L_0x00d7:
            java.util.HashMap<java.lang.Object, m2.e> r8 = r7.f26159d
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x00e1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0125
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, m2.e> r1 = r7.f26159d
            java.lang.Object r0 = r1.get(r0)
            m2.e r0 = (m2.e) r0
            p2.j r1 = r0.u0()
            if (r1 == 0) goto L_0x0121
            java.util.ArrayList<java.lang.Object> r1 = r0.f26153o0
            java.util.Iterator r1 = r1.iterator()
        L_0x00ff:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x011d
            java.lang.Object r2 = r1.next()
            java.util.HashMap<java.lang.Object, m2.f> r3 = r7.f26158c
            java.lang.Object r2 = r3.get(r2)
            m2.f r2 = (m2.f) r2
            p2.j r3 = r0.u0()
            p2.e r2 = r2.a()
            r3.a(r2)
            goto L_0x00ff
        L_0x011d:
            r0.apply()
            goto L_0x00e1
        L_0x0121:
            r0.apply()
            goto L_0x00e1
        L_0x0125:
            java.util.HashMap<java.lang.Object, m2.f> r8 = r7.f26158c
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x012f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01a4
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, m2.f> r1 = r7.f26158c
            java.lang.Object r0 = r1.get(r0)
            m2.f r0 = (m2.f) r0
            m2.a r1 = r7.f26161f
            if (r0 == r1) goto L_0x012f
            n2.e r1 = r0.d()
            boolean r1 = r1 instanceof m2.e
            if (r1 == 0) goto L_0x012f
            n2.e r1 = r0.d()
            m2.e r1 = (m2.e) r1
            p2.j r2 = r1.u0()
            if (r2 == 0) goto L_0x012f
            java.util.ArrayList<java.lang.Object> r1 = r1.f26153o0
            java.util.Iterator r1 = r1.iterator()
        L_0x015f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x01a0
            java.lang.Object r3 = r1.next()
            java.util.HashMap<java.lang.Object, m2.f> r4 = r7.f26158c
            java.lang.Object r4 = r4.get(r3)
            m2.f r4 = (m2.f) r4
            if (r4 == 0) goto L_0x017b
            p2.e r3 = r4.a()
            r2.a(r3)
            goto L_0x015f
        L_0x017b:
            boolean r4 = r3 instanceof m2.f
            if (r4 == 0) goto L_0x0189
            m2.f r3 = (m2.f) r3
            p2.e r3 = r3.a()
            r2.a(r3)
            goto L_0x015f
        L_0x0189:
            java.io.PrintStream r4 = java.lang.System.out
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "couldn't find reference for "
            r5.append(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.println(r3)
            goto L_0x015f
        L_0x01a0:
            r0.apply()
            goto L_0x012f
        L_0x01a4:
            java.util.HashMap<java.lang.Object, m2.f> r8 = r7.f26158c
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x01ae:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x01d2
            java.lang.Object r0 = r8.next()
            java.util.HashMap<java.lang.Object, m2.f> r1 = r7.f26158c
            java.lang.Object r1 = r1.get(r0)
            m2.f r1 = (m2.f) r1
            r1.apply()
            p2.e r1 = r1.a()
            if (r1 == 0) goto L_0x01ae
            if (r0 == 0) goto L_0x01ae
            java.lang.String r0 = r0.toString()
            r1.f27468o = r0
            goto L_0x01ae
        L_0x01d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g.a(p2.f):void");
    }

    public C5643c b(Object obj, c cVar) {
        C5573a d10 = d(obj);
        if (d10.d() == null || !(d10.d() instanceof C5643c)) {
            C5643c cVar2 = new C5643c(this);
            cVar2.w0(cVar);
            d10.X(cVar2);
        }
        return (C5643c) d10.d();
    }

    public void c(Object obj) {
        this.f26163h.add(obj);
        this.f26165j = true;
    }

    public C5573a d(Object obj) {
        f fVar = this.f26158c.get(obj);
        if (fVar == null) {
            fVar = f(obj);
            this.f26158c.put(obj, fVar);
            fVar.c(obj);
        }
        if (fVar instanceof C5573a) {
            return (C5573a) fVar;
        }
        return null;
    }

    public int e(Object obj) {
        if (obj instanceof Float) {
            return Math.round(((Float) obj).floatValue());
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 0;
    }

    public C5573a f(Object obj) {
        return new C5573a(this);
    }

    /* access modifiers changed from: package-private */
    public C5575c h() {
        return this.f26156a;
    }

    public f i(Object obj, boolean z10) {
        C5573a d10 = d(obj);
        if (d10.d() == null || !(d10.d() instanceof f)) {
            d10.X(z10 ? new f(this, d.VERTICAL_FLOW) : new f(this, d.HORIZONTAL_FLOW));
        }
        return (f) d10.d();
    }

    public n2.g j(Object obj, String str) {
        C5573a d10 = d(obj);
        if (d10.d() == null || !(d10.d() instanceof n2.g)) {
            d dVar = d.GRID;
            if (str.charAt(0) == 'r') {
                dVar = d.ROW;
            } else if (str.charAt(0) == 'c') {
                dVar = d.COLUMN;
            }
            d10.X(new n2.g(this, dVar));
        }
        return (n2.g) d10.d();
    }

    public ArrayList<String> k(String str) {
        if (this.f26160e.containsKey(str)) {
            return this.f26160e.get(str);
        }
        return null;
    }

    public h l(Object obj, int i10) {
        C5573a d10 = d(obj);
        if (d10.d() == null || !(d10.d() instanceof h)) {
            h hVar = new h(this);
            hVar.g(i10);
            hVar.c(obj);
            d10.X(hVar);
        }
        return (h) d10.d();
    }

    public g m(d dVar) {
        return y(dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r0.c(r2);
        r1.f26159d.put(r2, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public m2.e n(java.lang.Object r2, m2.g.d r3) {
        /*
            r1 = this;
            if (r2 != 0) goto L_0x0006
            java.lang.String r2 = r1.g()
        L_0x0006:
            java.util.HashMap<java.lang.Object, m2.e> r0 = r1.f26159d
            java.lang.Object r0 = r0.get(r2)
            m2.e r0 = (m2.e) r0
            if (r0 != 0) goto L_0x0050
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x0042;
                case 1: goto L_0x003c;
                case 2: goto L_0x0036;
                case 3: goto L_0x0030;
                case 4: goto L_0x0029;
                case 5: goto L_0x0017;
                case 6: goto L_0x0023;
                case 7: goto L_0x0023;
                case 8: goto L_0x001d;
                case 9: goto L_0x001d;
                case 10: goto L_0x001d;
                default: goto L_0x0017;
            }
        L_0x0017:
            m2.e r0 = new m2.e
            r0.<init>(r1, r3)
            goto L_0x0048
        L_0x001d:
            n2.g r0 = new n2.g
            r0.<init>(r1, r3)
            goto L_0x0048
        L_0x0023:
            n2.f r0 = new n2.f
            r0.<init>(r1, r3)
            goto L_0x0048
        L_0x0029:
            n2.c r3 = new n2.c
            r3.<init>(r1)
        L_0x002e:
            r0 = r3
            goto L_0x0048
        L_0x0030:
            n2.b r3 = new n2.b
            r3.<init>(r1)
            goto L_0x002e
        L_0x0036:
            n2.a r3 = new n2.a
            r3.<init>(r1)
            goto L_0x002e
        L_0x003c:
            n2.j r3 = new n2.j
            r3.<init>(r1)
            goto L_0x002e
        L_0x0042:
            n2.i r3 = new n2.i
            r3.<init>(r1)
            goto L_0x002e
        L_0x0048:
            r0.c(r2)
            java.util.HashMap<java.lang.Object, m2.e> r3 = r1.f26159d
            r3.put(r2, r0)
        L_0x0050:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: m2.g.n(java.lang.Object, m2.g$d):m2.e");
    }

    public i o() {
        return (i) n((Object) null, d.HORIZONTAL_CHAIN);
    }

    public h p(Object obj) {
        return l(obj, 0);
    }

    public boolean q(p2.e eVar) {
        if (this.f26165j) {
            this.f26164i.clear();
            Iterator<Object> it = this.f26163h.iterator();
            while (it.hasNext()) {
                p2.e a10 = this.f26158c.get(it.next()).a();
                if (a10 != null) {
                    this.f26164i.add(a10);
                }
            }
            this.f26165j = false;
        }
        return this.f26164i.contains(eVar);
    }

    public boolean r() {
        return !this.f26157b;
    }

    public void s(Object obj, Object obj2) {
        C5573a d10 = d(obj);
        if (d10 != null) {
            d10.e0(obj2);
        }
    }

    /* access modifiers changed from: package-private */
    public f t(Object obj) {
        return this.f26158c.get(obj);
    }

    public void u() {
        for (Object obj : this.f26158c.keySet()) {
            this.f26158c.get(obj).a().v0();
        }
        this.f26158c.clear();
        this.f26158c.put(f26155k, this.f26161f);
        this.f26159d.clear();
        this.f26160e.clear();
        this.f26163h.clear();
        this.f26165j = true;
    }

    public boolean v(int i10) {
        return this.f26161f.C().i(i10);
    }

    public boolean w(int i10) {
        return this.f26161f.E().i(i10);
    }

    public void x(C5575c cVar) {
        this.f26156a = cVar;
    }

    public g y(d dVar) {
        this.f26161f.Y(dVar);
        return this;
    }

    public void z(boolean z10) {
        this.f26157b = !z10;
    }
}
