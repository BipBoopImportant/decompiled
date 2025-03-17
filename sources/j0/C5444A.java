package j0;

import XH.C16807N;
import java.util.LinkedHashMap;
import java.util.Map;
import k0.C5490b;
import k0.c;
import k0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\rJ1\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u00012\b\u0010\u0016\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\b\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0019\u0010\rJ\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u001a\u0010\u000bJ\r\u0010\u001b\u001a\u00020\u0010¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u001eJ\u0019\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010 ¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R \u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010'8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0014\u0010,\u001a\u00020*8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010+R\u0016\u0010-\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010&R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010&R\u0016\u00101\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\n\u0010&R\u0016\u00102\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010&¨\u00063"}, d2 = {"Lj0/A;", "", "K", "V", "", "maxSize", "<init>", "(I)V", "key", "value", "h", "(Ljava/lang/Object;Ljava/lang/Object;)I", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "f", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "LXH/N;", "l", "g", "", "evicted", "oldValue", "newValue", "b", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "a", "j", "c", "()V", "i", "()I", "e", "", "k", "()Ljava/util/Map;", "", "toString", "()Ljava/lang/String;", "I", "Lk0/c;", "Lk0/c;", "map", "Lk0/b;", "Lk0/b;", "lock", "size", "putCount", "createCount", "evictionCount", "hitCount", "missCount", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: j0.A  reason: case insensitive filesystem */
public class C5444A<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private int f24509a;

    /* renamed from: b  reason: collision with root package name */
    private final c<K, V> f24510b;

    /* renamed from: c  reason: collision with root package name */
    private final C5490b f24511c;

    /* renamed from: d  reason: collision with root package name */
    private int f24512d;

    /* renamed from: e  reason: collision with root package name */
    private int f24513e;

    /* renamed from: f  reason: collision with root package name */
    private int f24514f;

    /* renamed from: g  reason: collision with root package name */
    private int f24515g;

    /* renamed from: h  reason: collision with root package name */
    private int f24516h;

    /* renamed from: i  reason: collision with root package name */
    private int f24517i;

    public C5444A(int i10) {
        this.f24509a = i10;
        if (!(i10 > 0)) {
            d.a("maxSize <= 0");
        }
        this.f24510b = new c<>(0, 0.75f);
        this.f24511c = new C5490b();
    }

    private final int h(K k10, V v10) {
        int j10 = j(k10, v10);
        if (!(j10 >= 0)) {
            d.b("Negative size: " + k10 + '=' + v10);
        }
        return j10;
    }

    /* access modifiers changed from: protected */
    public V a(K k10) {
        C17542s.j(k10, "key");
        return null;
    }

    /* access modifiers changed from: protected */
    public void b(boolean z10, K k10, V v10, V v11) {
        C17542s.j(k10, "key");
        C17542s.j(v10, "oldValue");
    }

    public final void c() {
        l(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        if (r0 != null) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r1 = r5.f24511c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r5.f24514f++;
        r2 = r5.f24510b.d(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r2 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r5.f24510b.d(r6, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0040, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0042, code lost:
        r5.f24512d += h(r6, r0);
        r3 = XH.C16807N.f139792a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004d, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        if (r2 == null) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0050, code lost:
        b(false, r6, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        l(r5.f24509a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005d, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V d(K r6) {
        /*
            r5 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C17542s.j(r6, r0)
            k0.b r0 = r5.f24511c
            monitor-enter(r0)
            k0.c<K, V> r1 = r5.f24510b     // Catch:{ all -> 0x0018 }
            java.lang.Object r1 = r1.a(r6)     // Catch:{ all -> 0x0018 }
            if (r1 == 0) goto L_0x001a
            int r6 = r5.f24516h     // Catch:{ all -> 0x0018 }
            int r6 = r6 + 1
            r5.f24516h = r6     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            return r1
        L_0x0018:
            r6 = move-exception
            goto L_0x005e
        L_0x001a:
            int r1 = r5.f24517i     // Catch:{ all -> 0x0018 }
            int r1 = r1 + 1
            r5.f24517i = r1     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)
            java.lang.Object r0 = r5.a(r6)
            if (r0 != 0) goto L_0x0029
            r6 = 0
            return r6
        L_0x0029:
            k0.b r1 = r5.f24511c
            monitor-enter(r1)
            int r2 = r5.f24514f     // Catch:{ all -> 0x0040 }
            int r2 = r2 + 1
            r5.f24514f = r2     // Catch:{ all -> 0x0040 }
            k0.c<K, V> r2 = r5.f24510b     // Catch:{ all -> 0x0040 }
            java.lang.Object r2 = r2.d(r6, r0)     // Catch:{ all -> 0x0040 }
            if (r2 == 0) goto L_0x0042
            k0.c<K, V> r3 = r5.f24510b     // Catch:{ all -> 0x0040 }
            r3.d(r6, r2)     // Catch:{ all -> 0x0040 }
            goto L_0x004d
        L_0x0040:
            r6 = move-exception
            goto L_0x005c
        L_0x0042:
            int r3 = r5.f24512d     // Catch:{ all -> 0x0040 }
            int r4 = r5.h(r6, r0)     // Catch:{ all -> 0x0040 }
            int r3 = r3 + r4
            r5.f24512d = r3     // Catch:{ all -> 0x0040 }
            XH.N r3 = XH.C16807N.f139792a     // Catch:{ all -> 0x0040 }
        L_0x004d:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0056
            r1 = 0
            r5.b(r1, r6, r0, r2)
            r0 = r2
            goto L_0x005b
        L_0x0056:
            int r6 = r5.f24509a
            r5.l(r6)
        L_0x005b:
            return r0
        L_0x005c:
            monitor-exit(r1)
            throw r6
        L_0x005e:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C5444A.d(java.lang.Object):java.lang.Object");
    }

    public final int e() {
        int i10;
        synchronized (this.f24511c) {
            i10 = this.f24509a;
        }
        return i10;
    }

    public final V f(K k10, V v10) {
        V d10;
        C17542s.j(k10, "key");
        C17542s.j(v10, "value");
        synchronized (this.f24511c) {
            try {
                this.f24513e++;
                this.f24512d += h(k10, v10);
                d10 = this.f24510b.d(k10, v10);
                if (d10 != null) {
                    this.f24512d -= h(k10, d10);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (d10 != null) {
            b(false, k10, d10, v10);
        }
        l(this.f24509a);
        return d10;
    }

    public final V g(K k10) {
        V e10;
        C17542s.j(k10, "key");
        synchronized (this.f24511c) {
            try {
                e10 = this.f24510b.e(k10);
                if (e10 != null) {
                    this.f24512d -= h(k10, e10);
                }
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (e10 != null) {
            b(false, k10, e10, (V) null);
        }
        return e10;
    }

    public final int i() {
        int i10;
        synchronized (this.f24511c) {
            i10 = this.f24512d;
        }
        return i10;
    }

    /* access modifiers changed from: protected */
    public int j(K k10, V v10) {
        C17542s.j(k10, "key");
        C17542s.j(v10, "value");
        return 1;
    }

    public final Map<K, V> k() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f24511c) {
            linkedHashMap = new LinkedHashMap(this.f24510b.b().size());
            for (Map.Entry entry : this.f24510b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x001c A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[Catch:{ all -> 0x0015 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:29:0x0061 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void l(int r7) {
        /*
            r6 = this;
        L_0x0000:
            k0.b r0 = r6.f24511c
            monitor-enter(r0)
            int r1 = r6.f24512d     // Catch:{ all -> 0x0015 }
            r2 = 1
            if (r1 < 0) goto L_0x0019
            k0.c<K, V> r1 = r6.f24510b     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0017
            int r1 = r6.f24512d     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0019
            goto L_0x0017
        L_0x0015:
            r7 = move-exception
            goto L_0x0063
        L_0x0017:
            r1 = r2
            goto L_0x001a
        L_0x0019:
            r1 = 0
        L_0x001a:
            if (r1 != 0) goto L_0x0021
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            k0.d.b(r1)     // Catch:{ all -> 0x0015 }
        L_0x0021:
            int r1 = r6.f24512d     // Catch:{ all -> 0x0015 }
            if (r1 <= r7) goto L_0x0061
            k0.c<K, V> r1 = r6.f24510b     // Catch:{ all -> 0x0015 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x002e
            goto L_0x0061
        L_0x002e:
            k0.c<K, V> r1 = r6.f24510b     // Catch:{ all -> 0x0015 }
            java.util.Set r1 = r1.b()     // Catch:{ all -> 0x0015 }
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = YH.C16877v.x0(r1)     // Catch:{ all -> 0x0015 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0040
            monitor-exit(r0)
            return
        L_0x0040:
            java.lang.Object r3 = r1.getKey()     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x0015 }
            k0.c<K, V> r4 = r6.f24510b     // Catch:{ all -> 0x0015 }
            r4.e(r3)     // Catch:{ all -> 0x0015 }
            int r4 = r6.f24512d     // Catch:{ all -> 0x0015 }
            int r5 = r6.h(r3, r1)     // Catch:{ all -> 0x0015 }
            int r4 = r4 - r5
            r6.f24512d = r4     // Catch:{ all -> 0x0015 }
            int r4 = r6.f24515g     // Catch:{ all -> 0x0015 }
            int r4 = r4 + r2
            r6.f24515g = r4     // Catch:{ all -> 0x0015 }
            monitor-exit(r0)
            r0 = 0
            r6.b(r2, r3, r1, r0)
            goto L_0x0000
        L_0x0061:
            monitor-exit(r0)
            return
        L_0x0063:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.C5444A.l(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f24511c) {
            try {
                int i10 = this.f24516h;
                int i11 = this.f24517i + i10;
                str = "LruCache[maxSize=" + this.f24509a + ",hits=" + this.f24516h + ",misses=" + this.f24517i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str;
    }
}
