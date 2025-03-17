package R1;

import V1.s;
import V1.t;
import XH.C16807N;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\rJ1\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R0\u0010%\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`#8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R$\u0010)\u001a\u0012\u0012\u0004\u0012\u00028\u00000&j\b\u0012\u0004\u0012\u00028\u0000`'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R$\u0010.\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00048G@BX\u000e¢\u0006\f\n\u0004\b\f\u0010+\u001a\u0004\b,\u0010-R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010+R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010+R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010+R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010+R\u0016\u00103\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010+¨\u00064"}, d2 = {"LR1/b;", "K", "V", "", "", "maxSize", "<init>", "(I)V", "key", "value", "g", "(Ljava/lang/Object;Ljava/lang/Object;)I", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "e", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "LXH/N;", "j", "f", "", "evicted", "oldValue", "newValue", "c", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "b", "i", "", "toString", "()Ljava/lang/String;", "LV1/t;", "a", "LV1/t;", "monitor", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "map", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "keySet", "<set-?>", "I", "h", "()I", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b<K, V> {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final t f12277a = s.a();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<K, V> f12278b;

    /* renamed from: c  reason: collision with root package name */
    private final LinkedHashSet<K> f12279c;

    /* renamed from: d  reason: collision with root package name */
    private int f12280d;

    /* renamed from: e  reason: collision with root package name */
    private int f12281e;

    /* renamed from: f  reason: collision with root package name */
    private int f12282f;

    /* renamed from: g  reason: collision with root package name */
    private int f12283g;

    /* renamed from: h  reason: collision with root package name */
    private int f12284h;

    /* renamed from: i  reason: collision with root package name */
    private int f12285i;

    /* renamed from: j  reason: collision with root package name */
    private int f12286j;

    public b(int i10) {
        if (i10 > 0) {
            this.f12281e = i10;
            this.f12278b = new HashMap<>(0, 0.75f);
            this.f12279c = new LinkedHashSet<>();
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private final int g(K k10, V v10) {
        int i10 = i(k10, v10);
        if (i10 >= 0) {
            return i10;
        }
        throw new IllegalStateException(("Negative size: " + k10 + '=' + v10).toString());
    }

    /* access modifiers changed from: protected */
    public V b(K k10) {
        return null;
    }

    /* access modifiers changed from: protected */
    public void c(boolean z10, K k10, V v10, V v11) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = b(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r2 = r5.f12277a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.f12283g++;
        r3 = r5.f12278b.put(r6, r0);
        r5.f12279c.remove(r6);
        r5.f12279c.add(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r3 == null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r5.f12278b.put(r6, r3);
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0050, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        r5.f12280d = h() + g(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005d, code lost:
        r3 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005f, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r1 == null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        c(false, r6, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0067, code lost:
        j(r5.f12281e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x006c, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006e, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V d(K r6) {
        /*
            r5 = this;
            V1.t r0 = r5.f12277a
            monitor-enter(r0)
            java.util.HashMap<K, V> r1 = r5.f12278b     // Catch:{ all -> 0x001d }
            java.lang.Object r1 = r1.get(r6)     // Catch:{ all -> 0x001d }
            if (r1 == 0) goto L_0x001f
            java.util.LinkedHashSet<K> r2 = r5.f12279c     // Catch:{ all -> 0x001d }
            r2.remove(r6)     // Catch:{ all -> 0x001d }
            java.util.LinkedHashSet<K> r2 = r5.f12279c     // Catch:{ all -> 0x001d }
            r2.add(r6)     // Catch:{ all -> 0x001d }
            int r6 = r5.f12285i     // Catch:{ all -> 0x001d }
            int r6 = r6 + 1
            r5.f12285i = r6     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            return r1
        L_0x001d:
            r6 = move-exception
            goto L_0x006f
        L_0x001f:
            int r2 = r5.f12286j     // Catch:{ all -> 0x001d }
            int r2 = r2 + 1
            r5.f12286j = r2     // Catch:{ all -> 0x001d }
            monitor-exit(r0)
            java.lang.Object r0 = r5.b(r6)
            if (r0 != 0) goto L_0x002e
            r6 = 0
            return r6
        L_0x002e:
            V1.t r2 = r5.f12277a
            monitor-enter(r2)
            int r3 = r5.f12283g     // Catch:{ all -> 0x0050 }
            int r3 = r3 + 1
            r5.f12283g = r3     // Catch:{ all -> 0x0050 }
            java.util.HashMap<K, V> r3 = r5.f12278b     // Catch:{ all -> 0x0050 }
            java.lang.Object r3 = r3.put(r6, r0)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashSet<K> r4 = r5.f12279c     // Catch:{ all -> 0x0050 }
            r4.remove(r6)     // Catch:{ all -> 0x0050 }
            java.util.LinkedHashSet<K> r4 = r5.f12279c     // Catch:{ all -> 0x0050 }
            r4.add(r6)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x0052
            java.util.HashMap<K, V> r1 = r5.f12278b     // Catch:{ all -> 0x0050 }
            r1.put(r6, r3)     // Catch:{ all -> 0x0050 }
            r1 = r3
            goto L_0x005d
        L_0x0050:
            r6 = move-exception
            goto L_0x006d
        L_0x0052:
            int r3 = r5.h()     // Catch:{ all -> 0x0050 }
            int r4 = r5.g(r6, r0)     // Catch:{ all -> 0x0050 }
            int r3 = r3 + r4
            r5.f12280d = r3     // Catch:{ all -> 0x0050 }
        L_0x005d:
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x0050 }
            monitor-exit(r2)
            if (r1 == 0) goto L_0x0067
            r2 = 0
            r5.c(r2, r6, r0, r1)
            return r1
        L_0x0067:
            int r6 = r5.f12281e
            r5.j(r6)
            return r0
        L_0x006d:
            monitor-exit(r2)
            throw r6
        L_0x006f:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.b.d(java.lang.Object):java.lang.Object");
    }

    public final V e(K k10, V v10) {
        V put;
        if (k10 == null || v10 == null) {
            throw null;
        }
        synchronized (this.f12277a) {
            try {
                this.f12282f++;
                this.f12280d = h() + g(k10, v10);
                put = this.f12278b.put(k10, v10);
                if (put != null) {
                    this.f12280d = h() - g(k10, put);
                }
                if (this.f12279c.contains(k10)) {
                    this.f12279c.remove(k10);
                }
                this.f12279c.add(k10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (put != null) {
            c(false, k10, put, v10);
        }
        j(this.f12281e);
        return put;
    }

    public final V f(K k10) {
        V remove;
        k10.getClass();
        synchronized (this.f12277a) {
            try {
                remove = this.f12278b.remove(k10);
                this.f12279c.remove(k10);
                if (remove != null) {
                    this.f12280d = h() - g(k10, remove);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (remove != null) {
            c(false, k10, remove, (V) null);
        }
        return remove;
    }

    public final int h() {
        int i10;
        synchronized (this.f12277a) {
            i10 = this.f12280d;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public int i(K k10, V v10) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0094, code lost:
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(int r8) {
        /*
            r7 = this;
        L_0x0000:
            V1.t r0 = r7.f12277a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch:{ all -> 0x0018 }
            if (r1 < 0) goto L_0x008d
            java.util.HashMap<K, V> r1 = r7.f12278b     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001b
            int r1 = r7.h()     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x008d
            goto L_0x001b
        L_0x0018:
            r8 = move-exception
            goto L_0x0095
        L_0x001b:
            java.util.HashMap<K, V> r1 = r7.f12278b     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashSet<K> r2 = r7.f12279c     // Catch:{ all -> 0x0018 }
            boolean r2 = r2.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 != r2) goto L_0x008d
            int r1 = r7.h()     // Catch:{ all -> 0x0018 }
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L_0x0078
            java.util.HashMap<K, V> r1 = r7.f12278b     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0078
            java.util.LinkedHashSet<K> r1 = r7.f12279c     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = YH.C16877v.v0(r1)     // Catch:{ all -> 0x0018 }
            java.util.HashMap<K, V> r4 = r7.f12278b     // Catch:{ all -> 0x0018 }
            java.lang.Object r4 = r4.get(r1)     // Catch:{ all -> 0x0018 }
            if (r4 == 0) goto L_0x0070
            java.util.HashMap<K, V> r5 = r7.f12278b     // Catch:{ all -> 0x0018 }
            java.util.Map r5 = kotlin.jvm.internal.W.d(r5)     // Catch:{ all -> 0x0018 }
            r5.remove(r1)     // Catch:{ all -> 0x0018 }
            java.util.LinkedHashSet<K> r5 = r7.f12279c     // Catch:{ all -> 0x0018 }
            java.util.Collection r5 = kotlin.jvm.internal.W.a(r5)     // Catch:{ all -> 0x0018 }
            r5.remove(r1)     // Catch:{ all -> 0x0018 }
            int r5 = r7.h()     // Catch:{ all -> 0x0018 }
            kotlin.jvm.internal.C17542s.g(r1)     // Catch:{ all -> 0x0018 }
            kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ all -> 0x0018 }
            int r6 = r7.g(r1, r4)     // Catch:{ all -> 0x0018 }
            int r5 = r5 - r6
            r7.f12280d = r5     // Catch:{ all -> 0x0018 }
            int r5 = r7.f12284h     // Catch:{ all -> 0x0018 }
            int r5 = r5 + r2
            r7.f12284h = r5     // Catch:{ all -> 0x0018 }
            goto L_0x007a
        L_0x0070:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch:{ all -> 0x0018 }
            throw r8     // Catch:{ all -> 0x0018 }
        L_0x0078:
            r1 = r3
            r4 = r1
        L_0x007a:
            XH.N r5 = XH.C16807N.f139792a     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            if (r1 != 0) goto L_0x0082
            if (r4 != 0) goto L_0x0082
            return
        L_0x0082:
            kotlin.jvm.internal.C17542s.g(r1)
            kotlin.jvm.internal.C17542s.g(r4)
            r7.c(r2, r1, r4, r3)
            goto L_0x0000
        L_0x008d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0018 }
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch:{ all -> 0x0018 }
            throw r8     // Catch:{ all -> 0x0018 }
        L_0x0095:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.b.j(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f12277a) {
            try {
                int i10 = this.f12285i;
                int i11 = this.f12286j + i10;
                str = "LruCache[maxSize=" + this.f12281e + ",hits=" + this.f12285i + ",misses=" + this.f12286j + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
