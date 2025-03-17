package Q6;

import Q6.f;
import R6.c;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\u0018\u0000 R2\u00020\u0001:\u0001;B/\b\u0007\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u000bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\u0017J\u0011\u0010#\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b#\u0010\u0017J\u000f\u0010$\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010\u001fJ\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u000eH\u0016¢\u0006\u0004\b3\u0010\u0010J\u000f\u00104\u001a\u00020\u000eH\u0016¢\u0006\u0004\b4\u0010\u0010J\u001d\u00106\u001a\u00020\u00132\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u000eH\u0016¢\u0006\u0004\b8\u0010\u0010J\u0015\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0016¢\u0006\u0004\b9\u0010:R%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00028\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010B\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010AR\u0018\u0010D\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010CR\u001c\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040E8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010FR,\u0010I\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00020E8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010HR \u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010J0E8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010KR\u0014\u0010O\u001a\u00020M8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010NR\u0016\u0010Q\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010P¨\u0006S"}, d2 = {"LQ6/h;", "LQ6/f;", "", "", "", "root", "", "pathRoot", "<init>", "(Ljava/util/Map;Ljava/util/List;)V", "any", "LQ6/f$a;", "d", "(Ljava/lang/Object;)LQ6/f$a;", "LXH/N;", "c", "()V", "needle", "haystack", "", "i", "(Ljava/lang/String;Ljava/util/List;)I", "l", "()Ljava/lang/String;", "e", "()LQ6/h;", "g", "f", "h", "", "hasNext", "()Z", "O", "()LQ6/f$a;", "B0", "C1", "w1", "", "v2", "()Ljava/lang/Void;", "", "d2", "()D", "G0", "()I", "", "U2", "()J", "LQ6/e;", "R2", "()LQ6/e;", "a0", "close", "names", "T2", "(Ljava/util/List;)I", "D", "m", "()Ljava/util/List;", "a", "Ljava/util/Map;", "getRoot", "()Ljava/util/Map;", "b", "Ljava/util/List;", "LQ6/f$a;", "peekedToken", "Ljava/lang/Object;", "peekedData", "", "[Ljava/lang/Object;", "path", "[Ljava/util/Map;", "containerStack", "", "[Ljava/util/Iterator;", "iteratorStack", "", "[I", "nameIndexStack", "I", "stackSize", "j", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class h implements f {

    /* renamed from: j  reason: collision with root package name */
    public static final a f39611j = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f39612a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f39613b;

    /* renamed from: c  reason: collision with root package name */
    private f.a f39614c;

    /* renamed from: d  reason: collision with root package name */
    private Object f39615d;

    /* renamed from: e  reason: collision with root package name */
    private final Object[] f39616e;

    /* renamed from: f  reason: collision with root package name */
    private Map<String, Object>[] f39617f;

    /* renamed from: g  reason: collision with root package name */
    private final Iterator<?>[] f39618g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f39619h;

    /* renamed from: i  reason: collision with root package name */
    private int f39620i;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LQ6/h$a;", "", "<init>", "()V", "LQ6/f;", "LQ6/h;", "a", "(LQ6/f;)LQ6/h;", "apollo-api"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(f fVar) {
            C17542s.j(fVar, "<this>");
            if (fVar instanceof h) {
                return (h) fVar;
            }
            f.a O10 = fVar.O();
            if (O10 == f.a.BEGIN_OBJECT) {
                List<Object> m10 = fVar.m();
                Object d10 = a.d(fVar);
                C17542s.h(d10, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                return new h((Map) d10, m10);
            }
            throw new IllegalStateException(("Failed to buffer json reader, expected `BEGIN_OBJECT` but found `" + O10 + "` json token").toString());
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f39621a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                Q6.f$a[] r0 = Q6.f.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Q6.f$a r1 = Q6.f.a.END_OBJECT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Q6.f$a r1 = Q6.f.a.END_ARRAY     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Q6.f$a r1 = Q6.f.a.STRING     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                Q6.f$a r1 = Q6.f.a.NUMBER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                Q6.f$a r1 = Q6.f.a.LONG     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f39621a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: Q6.h.b.<clinit>():void");
        }
    }

    public h(Map<String, ? extends Object> map, List<? extends Object> list) {
        C17542s.j(map, "root");
        C17542s.j(list, "pathRoot");
        this.f39612a = map;
        this.f39613b = list;
        this.f39616e = new Object[256];
        this.f39617f = new Map[256];
        this.f39618g = new Iterator[256];
        this.f39619h = new int[256];
        this.f39614c = f.a.BEGIN_OBJECT;
        this.f39615d = map;
    }

    private final void c() {
        int i10 = this.f39620i;
        if (i10 == 0) {
            this.f39614c = f.a.END_DOCUMENT;
            return;
        }
        Iterator<?> it = this.f39618g[i10 - 1];
        C17542s.g(it);
        Object[] objArr = this.f39616e;
        int i11 = this.f39620i;
        if (objArr[i11 - 1] instanceof Integer) {
            int i12 = i11 - 1;
            Object obj = objArr[i11 - 1];
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Int");
            objArr[i12] = Integer.valueOf(((Integer) obj).intValue() + 1);
        }
        if (it.hasNext()) {
            Object next = it.next();
            this.f39615d = next;
            this.f39614c = next instanceof Map.Entry ? f.a.NAME : d(next);
            return;
        }
        this.f39614c = this.f39616e[this.f39620i + -1] instanceof Integer ? f.a.END_ARRAY : f.a.END_OBJECT;
    }

    private final f.a d(Object obj) {
        return obj == null ? f.a.NULL : obj instanceof List ? f.a.BEGIN_ARRAY : obj instanceof Map ? f.a.BEGIN_OBJECT : obj instanceof Integer ? f.a.NUMBER : obj instanceof Long ? f.a.LONG : obj instanceof Double ? f.a.NUMBER : obj instanceof e ? f.a.NUMBER : obj instanceof String ? f.a.STRING : obj instanceof Boolean ? f.a.BOOLEAN : f.a.ANY;
    }

    private final int i(String str, List<String> list) {
        int i10 = this.f39619h[this.f39620i - 1];
        if (i10 >= list.size() || !C17542s.e(list.get(i10), str)) {
            int indexOf = list.indexOf(str);
            if (indexOf != -1) {
                this.f39619h[this.f39620i - 1] = indexOf + 1;
            }
            return indexOf;
        }
        int[] iArr = this.f39619h;
        int i11 = this.f39620i;
        iArr[i11 - 1] = iArr[i11 - 1] + 1;
        return i10;
    }

    private final String l() {
        return C16877v.G0(m(), ".", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
    }

    public String B0() {
        if (O() == f.a.NAME) {
            Object obj = this.f39615d;
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.collections.Map.Entry<kotlin.String, kotlin.Any?>");
            Map.Entry entry = (Map.Entry) obj;
            this.f39616e[this.f39620i - 1] = entry.getKey();
            this.f39615d = entry.getValue();
            this.f39614c = d(entry.getValue());
            return (String) entry.getKey();
        }
        throw new S6.f("Expected NAME but was " + O() + " at path " + l());
    }

    public String C1() {
        int i10 = b.f39621a[O().ordinal()];
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            Object obj = this.f39615d;
            C17542s.g(obj);
            String obj2 = obj.toString();
            c();
            return obj2;
        }
        throw new S6.f("Expected a String but was " + O() + " at path " + l());
    }

    public void D() {
        Map<String, Object>[] mapArr = this.f39617f;
        int i10 = this.f39620i;
        Map<String, Object> map = mapArr[i10 - 1];
        this.f39616e[i10 - 1] = null;
        C17542s.g(map);
        this.f39618g[i10 - 1] = map.entrySet().iterator();
        this.f39619h[this.f39620i - 1] = 0;
        c();
    }

    public int G0() {
        int i10;
        int i11 = b.f39621a[O().ordinal()];
        if (i11 == 3 || i11 == 4 || i11 == 5) {
            Object obj = this.f39615d;
            if (obj instanceof Integer) {
                i10 = ((Number) obj).intValue();
            } else if (obj instanceof Long) {
                i10 = c.d(((Number) obj).longValue());
            } else if (obj instanceof Double) {
                i10 = c.a(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                i10 = Integer.parseInt((String) obj);
            } else if (obj instanceof e) {
                i10 = Integer.parseInt(((e) obj).a());
            } else {
                throw new IllegalStateException(("Expected an Int but got " + obj + " instead").toString());
            }
            c();
            return i10;
        }
        throw new S6.f("Expected an Int but was " + O() + " at path " + l());
    }

    public f.a O() {
        return this.f39614c;
    }

    public e R2() {
        e eVar;
        int i10 = b.f39621a[O().ordinal()];
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            Object obj = this.f39615d;
            boolean z10 = true;
            if (!(obj instanceof Integer ? true : obj instanceof Long)) {
                z10 = obj instanceof Double;
            }
            if (z10) {
                eVar = new e(obj.toString());
            } else if (obj instanceof String) {
                eVar = new e((String) obj);
            } else if (obj instanceof e) {
                eVar = (e) obj;
            } else {
                throw new IllegalStateException(("Expected JsonNumber but got " + obj + " instead").toString());
            }
            c();
            return eVar;
        }
        throw new S6.f("Expected a Number but was " + O() + " at path " + l());
    }

    public int T2(List<String> list) {
        C17542s.j(list, "names");
        while (hasNext()) {
            int i10 = i(B0(), list);
            if (i10 != -1) {
                return i10;
            }
            a0();
        }
        return -1;
    }

    public long U2() {
        long j10;
        int i10 = b.f39621a[O().ordinal()];
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            Object obj = this.f39615d;
            if (obj instanceof Integer) {
                j10 = (long) ((Number) obj).intValue();
            } else if (obj instanceof Long) {
                j10 = ((Number) obj).longValue();
            } else if (obj instanceof Double) {
                j10 = c.b(((Number) obj).doubleValue());
            } else if (obj instanceof String) {
                j10 = Long.parseLong((String) obj);
            } else if (obj instanceof e) {
                j10 = Long.parseLong(((e) obj).a());
            } else {
                throw new IllegalStateException(("Expected Int but got " + obj + " instead").toString());
            }
            c();
            return j10;
        }
        throw new S6.f("Expected a Long but was " + O() + " at path " + l());
    }

    public void a0() {
        c();
    }

    public void close() {
    }

    public double d2() {
        double d10;
        int i10 = b.f39621a[O().ordinal()];
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            Object obj = this.f39615d;
            if (obj instanceof Integer) {
                d10 = (double) ((Number) obj).intValue();
            } else if (obj instanceof Long) {
                d10 = c.c(((Number) obj).longValue());
            } else if (obj instanceof Double) {
                d10 = ((Number) obj).doubleValue();
            } else if (obj instanceof String) {
                d10 = Double.parseDouble((String) obj);
            } else if (obj instanceof e) {
                d10 = Double.parseDouble(((e) obj).a());
            } else {
                throw new IllegalStateException(("Expected a Double but got " + obj + " instead").toString());
            }
            c();
            return d10;
        }
        throw new S6.f("Expected a Double but was " + O() + " at path " + l());
    }

    /* renamed from: e */
    public h G() {
        if (O() == f.a.BEGIN_ARRAY) {
            Object obj = this.f39615d;
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            int i10 = this.f39620i;
            if (i10 < 256) {
                this.f39620i = i10 + 1;
                this.f39616e[i10] = -1;
                this.f39618g[this.f39620i - 1] = list.iterator();
                c();
                return this;
            }
            throw new IllegalStateException("Nesting too deep");
        }
        throw new S6.f("Expected BEGIN_ARRAY but was " + O() + " at path " + l());
    }

    /* renamed from: f */
    public h C() {
        if (O() == f.a.BEGIN_OBJECT) {
            int i10 = this.f39620i;
            if (i10 < 256) {
                this.f39620i = i10 + 1;
                Map<String, Object>[] mapArr = this.f39617f;
                Object obj = this.f39615d;
                C17542s.h(obj, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                mapArr[i10] = (Map) obj;
                D();
                return this;
            }
            throw new IllegalStateException("Nesting too deep");
        }
        throw new S6.f("Expected BEGIN_OBJECT but was " + O() + " at path " + l());
    }

    /* renamed from: g */
    public h E() {
        if (O() == f.a.END_ARRAY) {
            int i10 = this.f39620i - 1;
            this.f39620i = i10;
            this.f39618g[i10] = null;
            this.f39616e[i10] = null;
            c();
            return this;
        }
        throw new S6.f("Expected END_ARRAY but was " + O() + " at path " + l());
    }

    /* renamed from: h */
    public h K() {
        int i10 = this.f39620i - 1;
        this.f39620i = i10;
        this.f39618g[i10] = null;
        this.f39616e[i10] = null;
        this.f39617f[i10] = null;
        c();
        return this;
    }

    public boolean hasNext() {
        int i10 = b.f39621a[O().ordinal()];
        return (i10 == 1 || i10 == 2) ? false : true;
    }

    public List<Object> m() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f39613b);
        int i10 = this.f39620i;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f39616e[i11];
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public Void v2() {
        if (O() == f.a.NULL) {
            c();
            return null;
        }
        throw new S6.f("Expected NULL but was " + O() + " at path " + l());
    }

    public boolean w1() {
        if (O() == f.a.BOOLEAN) {
            Object obj = this.f39615d;
            C17542s.h(obj, "null cannot be cast to non-null type kotlin.Boolean");
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            c();
            return bool.booleanValue();
        }
        throw new S6.f("Expected BOOLEAN but was " + O() + " at path " + l());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Map map, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i10 & 2) != 0 ? C16877v.n() : list);
    }
}
