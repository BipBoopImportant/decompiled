package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import java.util.Collections;
import java.util.List;

abstract class H {

    /* renamed from: a  reason: collision with root package name */
    private static final H f67925a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final H f67926b = new c();

    private static final class b extends H {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?> f67927c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j10) {
            return (List) s0.C(obj, j10);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.crypto.tink.shaded.protobuf.F} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.crypto.tink.shaded.protobuf.F} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.crypto.tink.shaded.protobuf.F} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.G
                if (r1 == 0) goto L_0x0014
                com.google.crypto.tink.shaded.protobuf.F r0 = new com.google.crypto.tink.shaded.protobuf.F
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.b0
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.A.i
                if (r1 == 0) goto L_0x0024
                com.google.crypto.tink.shaded.protobuf.A$i r0 = (com.google.crypto.tink.shaded.protobuf.A.i) r0
                com.google.crypto.tink.shaded.protobuf.A$i r6 = r0.f(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                com.google.crypto.tink.shaded.protobuf.s0.R(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f67927c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                com.google.crypto.tink.shaded.protobuf.s0.R(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.r0
                if (r1 == 0) goto L_0x0062
                com.google.crypto.tink.shaded.protobuf.F r1 = new com.google.crypto.tink.shaded.protobuf.F
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                com.google.crypto.tink.shaded.protobuf.r0 r0 = (com.google.crypto.tink.shaded.protobuf.r0) r0
                r1.addAll(r0)
                com.google.crypto.tink.shaded.protobuf.s0.R(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.b0
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof com.google.crypto.tink.shaded.protobuf.A.i
                if (r1 == 0) goto L_0x007f
                r1 = r0
                com.google.crypto.tink.shaded.protobuf.A$i r1 = (com.google.crypto.tink.shaded.protobuf.A.i) r1
                boolean r2 = r1.u()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                com.google.crypto.tink.shaded.protobuf.A$i r0 = r1.f(r0)
                com.google.crypto.tink.shaded.protobuf.s0.R(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.H.b.g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            Object obj2;
            List list = (List) s0.C(obj, j10);
            if (list instanceof G) {
                obj2 = ((G) list).w();
            } else if (!f67927c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof b0) || !(list instanceof A.i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    A.i iVar = (A.i) list;
                    if (iVar.u()) {
                        iVar.o();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            s0.R(obj, j10, obj2);
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j10) {
            List f10 = f(obj2, j10);
            List g10 = g(obj, j10, f10.size());
            int size = g10.size();
            int size2 = f10.size();
            if (size > 0 && size2 > 0) {
                g10.addAll(f10);
            }
            if (size > 0) {
                f10 = g10;
            }
            s0.R(obj, j10, f10);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends H {
        private c() {
            super();
        }

        static <E> A.i<E> f(Object obj, long j10) {
            return (A.i) s0.C(obj, j10);
        }

        /* access modifiers changed from: package-private */
        public void c(Object obj, long j10) {
            f(obj, j10).o();
        }

        /* access modifiers changed from: package-private */
        public <E> void d(Object obj, Object obj2, long j10) {
            A.i f10 = f(obj, j10);
            A.i f11 = f(obj2, j10);
            int size = f10.size();
            int size2 = f11.size();
            if (size > 0 && size2 > 0) {
                if (!f10.u()) {
                    f10 = f10.f(size2 + size);
                }
                f10.addAll(f11);
            }
            if (size > 0) {
                f11 = f10;
            }
            s0.R(obj, j10, f11);
        }

        /* access modifiers changed from: package-private */
        public <L> List<L> e(Object obj, long j10) {
            A.i f10 = f(obj, j10);
            if (f10.u()) {
                return f10;
            }
            int size = f10.size();
            A.i f11 = f10.f(size == 0 ? 10 : size * 2);
            s0.R(obj, j10, f11);
            return f11;
        }
    }

    static H a() {
        return f67925a;
    }

    static H b() {
        return f67926b;
    }

    /* access modifiers changed from: package-private */
    public abstract void c(Object obj, long j10);

    /* access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j10);

    /* access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j10);

    private H() {
    }
}
