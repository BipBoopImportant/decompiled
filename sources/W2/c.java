package W2;

import W2.f;
import XH.v;
import YH.C16870n;
import YH.C16877v;
import YH.X;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import tI.C17978n;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\b\u0000\u0012\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ&\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0016\u001a\u00020\n\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u0018\u001a\u00020\n2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0017J)\u0010\u001c\u001a\u00020\n2\u001a\u0010\u001b\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u001a0\u0019\"\u0006\u0012\u0002\b\u00030\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u001e\u0010\u0011J\r\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b\u001f\u0010\fJ\u001a\u0010!\u001a\u00020\u00062\b\u0010 \u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R*\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010)\u001a\u0004\b*\u0010\u0014R\u0014\u0010-\u001a\u00020+8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010,¨\u0006."}, d2 = {"LW2/c;", "LW2/f;", "", "LW2/f$a;", "", "preferencesMap", "", "startFrozen", "<init>", "(Ljava/util/Map;Z)V", "LXH/N;", "e", "()V", "g", "T", "key", "b", "(LW2/f$a;)Ljava/lang/Object;", "", "a", "()Ljava/util/Map;", "value", "j", "(LW2/f$a;Ljava/lang/Object;)V", "k", "", "LW2/f$b;", "pairs", "h", "([LW2/f$b;)V", "i", "f", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/Map;", "getPreferencesMap$datastore_preferences_core", "LW2/b;", "LW2/b;", "frozen", "datastore-preferences-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Map<f.a<?>, Object> f14648a;

    /* renamed from: b  reason: collision with root package name */
    private final b f14649b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0003\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "LW2/f$a;", "", "entry", "", "a", "(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 8, 0})
    static final class a extends C17544u implements C17642l<Map.Entry<f.a<?>, Object>, CharSequence> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f14650c = new a();

        a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence invoke(Map.Entry<f.a<?>, Object> entry) {
            C17542s.j(entry, "entry");
            Object value = entry.getValue();
            String B02 = value instanceof byte[] ? C16870n.B0((byte[]) value, ", ", "[", "]", 0, (CharSequence) null, (C17642l) null, 56, (Object) null) : String.valueOf(entry.getValue());
            return "  " + entry.getKey().a() + " = " + B02;
        }
    }

    public c() {
        this((Map) null, false, 3, (DefaultConstructorMarker) null);
    }

    public Map<f.a<?>, Object> a() {
        v vVar;
        Iterable<Map.Entry> entrySet = this.f14648a.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C17978n.e(X.e(C16877v.y(entrySet, 10)), 16));
        for (Map.Entry entry : entrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                C17542s.i(copyOf, "copyOf(this, size)");
                vVar = new v(key, copyOf);
            } else {
                vVar = new v(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(vVar.c(), vVar.d());
        }
        return a.b(linkedHashMap);
    }

    public <T> T b(f.a<T> aVar) {
        C17542s.j(aVar, "key");
        T t10 = this.f14648a.get(aVar);
        if (!(t10 instanceof byte[])) {
            return t10;
        }
        byte[] bArr = (byte[]) t10;
        Object copyOf = Arrays.copyOf(bArr, bArr.length);
        C17542s.i(copyOf, "copyOf(this, size)");
        return copyOf;
    }

    public final void e() {
        if (this.f14649b.a()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof W2.c
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            W2.c r6 = (W2.c) r6
            java.util.Map<W2.f$a<?>, java.lang.Object> r0 = r6.f14648a
            java.util.Map<W2.f$a<?>, java.lang.Object> r2 = r5.f14648a
            r3 = 1
            if (r0 != r2) goto L_0x0010
            return r3
        L_0x0010:
            int r0 = r0.size()
            java.util.Map<W2.f$a<?>, java.lang.Object> r2 = r5.f14648a
            int r2 = r2.size()
            if (r0 == r2) goto L_0x001d
            return r1
        L_0x001d:
            java.util.Map<W2.f$a<?>, java.lang.Object> r6 = r6.f14648a
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0027
        L_0x0025:
            r1 = r3
            goto L_0x0067
        L_0x0027:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x002f:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map<W2.f$a<?>, java.lang.Object> r2 = r5.f14648a
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L_0x0064
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L_0x005f
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L_0x0064
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L_0x0064
            r0 = r3
            goto L_0x0065
        L_0x005f:
            boolean r0 = kotlin.jvm.internal.C17542s.e(r0, r2)
            goto L_0x0065
        L_0x0064:
            r0 = r1
        L_0x0065:
            if (r0 != 0) goto L_0x002f
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: W2.c.equals(java.lang.Object):boolean");
    }

    public final void f() {
        e();
        this.f14648a.clear();
    }

    public final void g() {
        this.f14649b.b(true);
    }

    public final void h(f.b<?>... bVarArr) {
        C17542s.j(bVarArr, "pairs");
        e();
        for (f.b<?> bVar : bVarArr) {
            k(bVar.a(), bVar.b());
        }
    }

    public int hashCode() {
        int i10 = 0;
        for (Map.Entry value : this.f14648a.entrySet()) {
            Object value2 = value.getValue();
            i10 += value2 instanceof byte[] ? Arrays.hashCode((byte[]) value2) : value2.hashCode();
        }
        return i10;
    }

    public final <T> T i(f.a<T> aVar) {
        C17542s.j(aVar, "key");
        e();
        return this.f14648a.remove(aVar);
    }

    public final <T> void j(f.a<T> aVar, T t10) {
        C17542s.j(aVar, "key");
        k(aVar, t10);
    }

    public final void k(f.a<?> aVar, Object obj) {
        C17542s.j(aVar, "key");
        e();
        if (obj == null) {
            i(aVar);
        } else if (obj instanceof Set) {
            this.f14648a.put(aVar, a.a((Set) obj));
        } else if (obj instanceof byte[]) {
            Map<f.a<?>, Object> map = this.f14648a;
            byte[] bArr = (byte[]) obj;
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            C17542s.i(copyOf, "copyOf(this, size)");
            map.put(aVar, copyOf);
        } else {
            this.f14648a.put(aVar, obj);
        }
    }

    public String toString() {
        return C16877v.G0(this.f14648a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, a.f14650c, 24, (Object) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new LinkedHashMap() : map, (i10 & 2) != 0 ? true : z10);
    }

    public c(Map<f.a<?>, Object> map, boolean z10) {
        C17542s.j(map, "preferencesMap");
        this.f14648a = map;
        this.f14649b = new b(z10);
    }
}
