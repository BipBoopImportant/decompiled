package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class t {

    /* renamed from: e  reason: collision with root package name */
    static final List<f.e> f122430e;

    /* renamed from: a  reason: collision with root package name */
    private final List<f.e> f122431a;

    /* renamed from: b  reason: collision with root package name */
    private final int f122432b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final ThreadLocal<d> f122433c = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final Map<Object, f<?>> f122434d = new LinkedHashMap();

    class a implements f.e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Type f122435a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f122436b;

        a(Type type, f fVar) {
            this.f122435a = type;
            this.f122436b = fVar;
        }

        public f<?> a(Type type, Set<? extends Annotation> set, t tVar) {
            if (!set.isEmpty() || !ME.c.v(this.f122435a, type)) {
                return null;
            }
            return this.f122436b;
        }
    }

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final List<f.e> f122437a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        int f122438b = 0;

        public b a(f.e eVar) {
            if (eVar != null) {
                List<f.e> list = this.f122437a;
                int i10 = this.f122438b;
                this.f122438b = i10 + 1;
                list.add(i10, eVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public <T> b b(Type type, f<T> fVar) {
            return a(t.h(type, fVar));
        }

        public b c(f.e eVar) {
            if (eVar != null) {
                this.f122437a.add(eVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        public t d() {
            return new t(this);
        }
    }

    static final class c<T> extends f<T> {

        /* renamed from: a  reason: collision with root package name */
        final Type f122439a;

        /* renamed from: b  reason: collision with root package name */
        final String f122440b;

        /* renamed from: c  reason: collision with root package name */
        final Object f122441c;

        /* renamed from: d  reason: collision with root package name */
        f<T> f122442d;

        c(Type type, String str, Object obj) {
            this.f122439a = type;
            this.f122440b = str;
            this.f122441c = obj;
        }

        public T fromJson(k kVar) {
            f<T> fVar = this.f122442d;
            if (fVar != null) {
                return fVar.fromJson(kVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public void toJson(q qVar, T t10) {
            f<T> fVar = this.f122442d;
            if (fVar != null) {
                fVar.toJson(qVar, t10);
                return;
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            f<T> fVar = this.f122442d;
            return fVar != null ? fVar.toString() : super.toString();
        }
    }

    final class d {

        /* renamed from: a  reason: collision with root package name */
        final List<c<?>> f122443a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        final Deque<c<?>> f122444b = new ArrayDeque();

        /* renamed from: c  reason: collision with root package name */
        boolean f122445c;

        d() {
        }

        /* access modifiers changed from: package-private */
        public <T> void a(f<T> fVar) {
            this.f122444b.getLast().f122442d = fVar;
        }

        /* access modifiers changed from: package-private */
        public IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
            if (this.f122445c) {
                return illegalArgumentException;
            }
            this.f122445c = true;
            if (this.f122444b.size() == 1 && this.f122444b.getFirst().f122440b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb2 = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<c<?>> descendingIterator = this.f122444b.descendingIterator();
            while (descendingIterator.hasNext()) {
                c next = descendingIterator.next();
                sb2.append("\nfor ");
                sb2.append(next.f122439a);
                if (next.f122440b != null) {
                    sb2.append(' ');
                    sb2.append(next.f122440b);
                }
            }
            return new IllegalArgumentException(sb2.toString(), illegalArgumentException);
        }

        /* access modifiers changed from: package-private */
        public void c(boolean z10) {
            this.f122444b.removeLast();
            if (this.f122444b.isEmpty()) {
                t.this.f122433c.remove();
                if (z10) {
                    synchronized (t.this.f122434d) {
                        try {
                            int size = this.f122443a.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                c cVar = this.f122443a.get(i10);
                                f<T> fVar = (f) t.this.f122434d.put(cVar.f122441c, cVar.f122442d);
                                if (fVar != null) {
                                    cVar.f122442d = fVar;
                                    t.this.f122434d.put(cVar.f122441c, fVar);
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        public <T> f<T> d(Type type, String str, Object obj) {
            int size = this.f122443a.size();
            for (int i10 = 0; i10 < size; i10++) {
                c cVar = this.f122443a.get(i10);
                if (cVar.f122441c.equals(obj)) {
                    this.f122444b.add(cVar);
                    f<T> fVar = cVar.f122442d;
                    return fVar != null ? fVar : cVar;
                }
            }
            c cVar2 = new c(type, str, obj);
            this.f122443a.add(cVar2);
            this.f122444b.add(cVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f122430e = arrayList;
        arrayList.add(v.f122448a);
        arrayList.add(d.f122346b);
        arrayList.add(s.f122427c);
        arrayList.add(a.f122326c);
        arrayList.add(u.f122447a);
        arrayList.add(c.f122339d);
    }

    t(b bVar) {
        int size = bVar.f122437a.size();
        List<f.e> list = f122430e;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(bVar.f122437a);
        arrayList.addAll(list);
        this.f122431a = Collections.unmodifiableList(arrayList);
        this.f122432b = bVar.f122438b;
    }

    private Object g(Type type, Set<? extends Annotation> set) {
        return set.isEmpty() ? type : Arrays.asList(new Object[]{type, set});
    }

    static <T> f.e h(Type type, f<T> fVar) {
        if (type == null) {
            throw new IllegalArgumentException("type == null");
        } else if (fVar != null) {
            return new a(type, fVar);
        } else {
            throw new IllegalArgumentException("jsonAdapter == null");
        }
    }

    public <T> f<T> c(Class<T> cls) {
        return e(cls, ME.c.f112012a);
    }

    public <T> f<T> d(Type type) {
        return e(type, ME.c.f112012a);
    }

    public <T> f<T> e(Type type, Set<? extends Annotation> set) {
        return f(type, set, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r1 = r4.f122433c.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r1 != null) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002c, code lost:
        r1 = new com.squareup.moshi.t.d(r4);
        r4.f122433c.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r7 = r1.d(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
        if (r7 == null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
        r1.c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r7 = r4.f122431a.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if (r2 >= r7) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r3 = r4.f122431a.get(r2).a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r3 != null) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0058, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005b, code lost:
        r1.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1.c(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0063, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0065, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0081, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + ME.c.t(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        throw r1.b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0087, code lost:
        r1.c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> com.squareup.moshi.f<T> f(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, java.lang.String r7) {
        /*
            r4 = this;
            if (r5 == 0) goto L_0x0095
            if (r6 == 0) goto L_0x008d
            java.lang.reflect.Type r5 = ME.c.a(r5)
            java.lang.reflect.Type r5 = ME.c.o(r5)
            java.lang.Object r0 = r4.g(r5, r6)
            java.util.Map<java.lang.Object, com.squareup.moshi.f<?>> r1 = r4.f122434d
            monitor-enter(r1)
            java.util.Map<java.lang.Object, com.squareup.moshi.f<?>> r2 = r4.f122434d     // Catch:{ all -> 0x001f }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x001f }
            com.squareup.moshi.f r2 = (com.squareup.moshi.f) r2     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x0021
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            return r2
        L_0x001f:
            r5 = move-exception
            goto L_0x008b
        L_0x0021:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            java.lang.ThreadLocal<com.squareup.moshi.t$d> r1 = r4.f122433c
            java.lang.Object r1 = r1.get()
            com.squareup.moshi.t$d r1 = (com.squareup.moshi.t.d) r1
            if (r1 != 0) goto L_0x0036
            com.squareup.moshi.t$d r1 = new com.squareup.moshi.t$d
            r1.<init>()
            java.lang.ThreadLocal<com.squareup.moshi.t$d> r2 = r4.f122433c
            r2.set(r1)
        L_0x0036:
            com.squareup.moshi.f r7 = r1.d(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x0041
            r1.c(r0)
            return r7
        L_0x0041:
            java.util.List<com.squareup.moshi.f$e> r7 = r4.f122431a     // Catch:{ IllegalArgumentException -> 0x0065 }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x0065 }
            r2 = r0
        L_0x0048:
            if (r2 >= r7) goto L_0x0067
            java.util.List<com.squareup.moshi.f$e> r3 = r4.f122431a     // Catch:{ IllegalArgumentException -> 0x0065 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x0065 }
            com.squareup.moshi.f$e r3 = (com.squareup.moshi.f.e) r3     // Catch:{ IllegalArgumentException -> 0x0065 }
            com.squareup.moshi.f r3 = r3.a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x0065 }
            if (r3 != 0) goto L_0x005b
            int r2 = r2 + 1
            goto L_0x0048
        L_0x005b:
            r1.a(r3)     // Catch:{ IllegalArgumentException -> 0x0065 }
            r5 = 1
            r1.c(r5)
            return r3
        L_0x0063:
            r5 = move-exception
            goto L_0x0087
        L_0x0065:
            r5 = move-exception
            goto L_0x0082
        L_0x0067:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0065 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0065 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0065 }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x0065 }
            java.lang.String r5 = ME.c.t(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0065 }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x0065 }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0065 }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0065 }
            throw r7     // Catch:{ IllegalArgumentException -> 0x0065 }
        L_0x0082:
            java.lang.IllegalArgumentException r5 = r1.b(r5)     // Catch:{ all -> 0x0063 }
            throw r5     // Catch:{ all -> 0x0063 }
        L_0x0087:
            r1.c(r0)
            throw r5
        L_0x008b:
            monitor-exit(r1)     // Catch:{ all -> 0x001f }
            throw r5
        L_0x008d:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "annotations == null"
            r5.<init>(r6)
            throw r5
        L_0x0095:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "type == null"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.t.f(java.lang.reflect.Type, java.util.Set, java.lang.String):com.squareup.moshi.f");
    }
}
