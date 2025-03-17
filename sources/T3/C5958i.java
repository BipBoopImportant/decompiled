package t3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: t3.i  reason: case insensitive filesystem */
public final class C5958i<E> implements Iterable<E> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f29493a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Map<E, Integer> f29494b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    private Set<E> f29495c = Collections.emptySet();

    /* renamed from: d  reason: collision with root package name */
    private List<E> f29496d = Collections.emptyList();

    public Set<E> I1() {
        Set<E> set;
        synchronized (this.f29493a) {
            set = this.f29495c;
        }
        return set;
    }

    public void b(E e10) {
        synchronized (this.f29493a) {
            try {
                ArrayList arrayList = new ArrayList(this.f29496d);
                arrayList.add(e10);
                this.f29496d = Collections.unmodifiableList(arrayList);
                Integer num = this.f29494b.get(e10);
                if (num == null) {
                    HashSet hashSet = new HashSet(this.f29495c);
                    hashSet.add(e10);
                    this.f29495c = Collections.unmodifiableSet(hashSet);
                }
                Map<E, Integer> map = this.f29494b;
                int i10 = 1;
                if (num != null) {
                    i10 = 1 + num.intValue();
                }
                map.put(e10, Integer.valueOf(i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int i(E e10) {
        int intValue;
        synchronized (this.f29493a) {
            try {
                intValue = this.f29494b.containsKey(e10) ? this.f29494b.get(e10).intValue() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return intValue;
    }

    public Iterator<E> iterator() {
        Iterator<E> it;
        synchronized (this.f29493a) {
            it = this.f29496d.iterator();
        }
        return it;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(E r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f29493a
            monitor-enter(r0)
            java.util.Map<E, java.lang.Integer> r1 = r4.f29494b     // Catch:{ all -> 0x000f }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x000f }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ all -> 0x000f }
            if (r1 != 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x000f:
            r5 = move-exception
            goto L_0x004e
        L_0x0011:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x000f }
            java.util.List<E> r3 = r4.f29496d     // Catch:{ all -> 0x000f }
            r2.<init>(r3)     // Catch:{ all -> 0x000f }
            r2.remove(r5)     // Catch:{ all -> 0x000f }
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)     // Catch:{ all -> 0x000f }
            r4.f29496d = r2     // Catch:{ all -> 0x000f }
            int r2 = r1.intValue()     // Catch:{ all -> 0x000f }
            r3 = 1
            if (r2 != r3) goto L_0x003e
            java.util.Map<E, java.lang.Integer> r1 = r4.f29494b     // Catch:{ all -> 0x000f }
            r1.remove(r5)     // Catch:{ all -> 0x000f }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x000f }
            java.util.Set<E> r2 = r4.f29495c     // Catch:{ all -> 0x000f }
            r1.<init>(r2)     // Catch:{ all -> 0x000f }
            r1.remove(r5)     // Catch:{ all -> 0x000f }
            java.util.Set r5 = java.util.Collections.unmodifiableSet(r1)     // Catch:{ all -> 0x000f }
            r4.f29495c = r5     // Catch:{ all -> 0x000f }
            goto L_0x004c
        L_0x003e:
            java.util.Map<E, java.lang.Integer> r2 = r4.f29494b     // Catch:{ all -> 0x000f }
            int r1 = r1.intValue()     // Catch:{ all -> 0x000f }
            int r1 = r1 - r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x000f }
            r2.put(r5, r1)     // Catch:{ all -> 0x000f }
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.C5958i.j(java.lang.Object):void");
    }
}
