package eJ;

import eJ.C17190a;
import eJ.C17197h;
import eJ.C17199j;
import eJ.C17206q;
import eJ.C17215z;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: eJ.i  reason: case insensitive filesystem */
public abstract class C17198i extends C17190a implements Serializable {

    /* renamed from: eJ.i$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f143049a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                eJ.z$c[] r0 = eJ.C17215z.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f143049a = r0
                eJ.z$c r1 = eJ.C17215z.c.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f143049a     // Catch:{ NoSuchFieldError -> 0x001d }
                eJ.z$c r1 = eJ.C17215z.c.ENUM     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: eJ.C17198i.a.<clinit>():void");
        }
    }

    /* renamed from: eJ.i$b */
    public static abstract class b<MessageType extends C17198i, BuilderType extends b> extends C17190a.C3485a<BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private C17193d f143050a = C17193d.f143014a;

        protected b() {
        }

        /* renamed from: d */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final C17193d e() {
            return this.f143050a;
        }

        public abstract BuilderType f(MessageType messagetype);

        public final BuilderType j(C17193d dVar) {
            this.f143050a = dVar;
            return this;
        }
    }

    /* renamed from: eJ.i$c */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private C17197h<e> f143051b = C17197h.g();

        /* renamed from: c  reason: collision with root package name */
        private boolean f143052c;

        protected c() {
        }

        /* access modifiers changed from: private */
        public C17197h<e> l() {
            this.f143051b.q();
            this.f143052c = false;
            return this.f143051b;
        }

        private void m() {
            if (!this.f143052c) {
                this.f143051b = this.f143051b.clone();
                this.f143052c = true;
            }
        }

        /* access modifiers changed from: protected */
        public final void n(MessageType messagetype) {
            m();
            this.f143051b.r(messagetype.f143053b);
        }
    }

    /* renamed from: eJ.i$e */
    static final class e implements C17197h.b<e> {

        /* renamed from: a  reason: collision with root package name */
        final C17199j.b<?> f143058a;

        /* renamed from: b  reason: collision with root package name */
        final int f143059b;

        /* renamed from: c  reason: collision with root package name */
        final C17215z.b f143060c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f143061d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f143062e;

        e(C17199j.b<?> bVar, int i10, C17215z.b bVar2, boolean z10, boolean z11) {
            this.f143058a = bVar;
            this.f143059b = i10;
            this.f143060c = bVar2;
            this.f143061d = z10;
            this.f143062e = z11;
        }

        /* renamed from: a */
        public int compareTo(e eVar) {
            return this.f143059b - eVar.f143059b;
        }

        public C17199j.b<?> b() {
            return this.f143058a;
        }

        public int d() {
            return this.f143059b;
        }

        public boolean e() {
            return this.f143061d;
        }

        public C17215z.b f() {
            return this.f143060c;
        }

        public C17215z.c g() {
            return this.f143060c.a();
        }

        public boolean i() {
            return this.f143062e;
        }

        public C17206q.a z(C17206q.a aVar, C17206q qVar) {
            return ((b) aVar).f((C17198i) qVar);
        }
    }

    /* renamed from: eJ.i$f */
    public static class f<ContainingType extends C17206q, Type> {

        /* renamed from: a  reason: collision with root package name */
        final ContainingType f143063a;

        /* renamed from: b  reason: collision with root package name */
        final Type f143064b;

        /* renamed from: c  reason: collision with root package name */
        final C17206q f143065c;

        /* renamed from: d  reason: collision with root package name */
        final e f143066d;

        /* renamed from: e  reason: collision with root package name */
        final Class f143067e;

        /* renamed from: f  reason: collision with root package name */
        final Method f143068f;

        f(ContainingType containingtype, Type type, C17206q qVar, e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (eVar.f() == C17215z.b.MESSAGE && qVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f143063a = containingtype;
                this.f143064b = type;
                this.f143065c = qVar;
                this.f143066d = eVar;
                this.f143067e = cls;
                if (C17199j.a.class.isAssignableFrom(cls)) {
                    this.f143068f = C17198i.e(cls, "valueOf", Integer.TYPE);
                } else {
                    this.f143068f = null;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public Object a(Object obj) {
            if (!this.f143066d.e()) {
                return e(obj);
            }
            if (this.f143066d.g() != C17215z.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            for (Object e10 : (List) obj) {
                arrayList.add(e(e10));
            }
            return arrayList;
        }

        public ContainingType b() {
            return this.f143063a;
        }

        public C17206q c() {
            return this.f143065c;
        }

        public int d() {
            return this.f143066d.d();
        }

        /* access modifiers changed from: package-private */
        public Object e(Object obj) {
            return this.f143066d.g() == C17215z.c.ENUM ? C17198i.f(this.f143068f, (Object) null, (Integer) obj) : obj;
        }

        /* access modifiers changed from: package-private */
        public Object f(Object obj) {
            return this.f143066d.g() == C17215z.c.ENUM ? Integer.valueOf(((C17199j.a) obj).d()) : obj;
        }
    }

    protected C17198i() {
    }

    static Method e(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + valueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(valueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static <ContainingType extends C17206q, Type> f<ContainingType, Type> i(ContainingType containingtype, C17206q qVar, C17199j.b<?> bVar, int i10, C17215z.b bVar2, boolean z10, Class cls) {
        return new f(containingtype, Collections.emptyList(), qVar, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static <ContainingType extends C17206q, Type> f<ContainingType, Type> j(ContainingType containingtype, Type type, C17206q qVar, C17199j.b<?> bVar, int i10, C17215z.b bVar2, Class cls) {
        return new f(containingtype, type, qVar, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d4, code lost:
        r8 = (eJ.C17206q) r5.h(r6.f143066d);
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <MessageType extends eJ.C17206q> boolean l(eJ.C17197h<eJ.C17198i.e> r5, MessageType r6, eJ.C17194e r7, eJ.C17195f r8, eJ.C17196g r9, int r10) {
        /*
            int r0 = eJ.C17215z.b(r10)
            int r1 = eJ.C17215z.a(r10)
            eJ.i$f r6 = r9.b(r6, r1)
            r1 = 1
            r2 = 0
            if (r6 != 0) goto L_0x0013
        L_0x0010:
            r0 = r1
            r3 = r2
            goto L_0x003e
        L_0x0013:
            eJ.i$e r3 = r6.f143066d
            eJ.z$b r3 = r3.f()
            int r3 = eJ.C17197h.l(r3, r2)
            if (r0 != r3) goto L_0x0022
            r0 = r2
            r3 = r0
            goto L_0x003e
        L_0x0022:
            eJ.i$e r3 = r6.f143066d
            boolean r4 = r3.f143061d
            if (r4 == 0) goto L_0x0010
            eJ.z$b r3 = r3.f143060c
            boolean r3 = r3.j()
            if (r3 == 0) goto L_0x0010
            eJ.i$e r3 = r6.f143066d
            eJ.z$b r3 = r3.f()
            int r3 = eJ.C17197h.l(r3, r1)
            if (r0 != r3) goto L_0x0010
            r3 = r1
            r0 = r2
        L_0x003e:
            if (r0 == 0) goto L_0x0045
            boolean r5 = r7.P(r10, r8)
            return r5
        L_0x0045:
            if (r3 == 0) goto L_0x0095
            int r8 = r7.A()
            int r8 = r7.j(r8)
            eJ.i$e r9 = r6.f143066d
            eJ.z$b r9 = r9.f()
            eJ.z$b r10 = eJ.C17215z.b.ENUM
            if (r9 != r10) goto L_0x007a
        L_0x0059:
            int r9 = r7.e()
            if (r9 <= 0) goto L_0x0090
            int r9 = r7.n()
            eJ.i$e r10 = r6.f143066d
            eJ.j$b r10 = r10.b()
            eJ.j$a r9 = r10.a(r9)
            if (r9 != 0) goto L_0x0070
            return r1
        L_0x0070:
            eJ.i$e r10 = r6.f143066d
            java.lang.Object r9 = r6.f(r9)
            r5.a(r10, r9)
            goto L_0x0059
        L_0x007a:
            int r9 = r7.e()
            if (r9 <= 0) goto L_0x0090
            eJ.i$e r9 = r6.f143066d
            eJ.z$b r9 = r9.f()
            java.lang.Object r9 = eJ.C17197h.u(r7, r9, r2)
            eJ.i$e r10 = r6.f143066d
            r5.a(r10, r9)
            goto L_0x007a
        L_0x0090:
            r7.i(r8)
            goto L_0x0122
        L_0x0095:
            int[] r0 = eJ.C17198i.a.f143049a
            eJ.i$e r3 = r6.f143066d
            eJ.z$c r3 = r3.g()
            int r3 = r3.ordinal()
            r0 = r0[r3]
            if (r0 == r1) goto L_0x00cc
            r9 = 2
            if (r0 == r9) goto L_0x00b3
            eJ.i$e r8 = r6.f143066d
            eJ.z$b r8 = r8.f()
            java.lang.Object r7 = eJ.C17197h.u(r7, r8, r2)
            goto L_0x0107
        L_0x00b3:
            int r7 = r7.n()
            eJ.i$e r9 = r6.f143066d
            eJ.j$b r9 = r9.b()
            eJ.j$a r9 = r9.a(r7)
            if (r9 != 0) goto L_0x00ca
            r8.o0(r10)
            r8.y0(r7)
            return r1
        L_0x00ca:
            r7 = r9
            goto L_0x0107
        L_0x00cc:
            eJ.i$e r8 = r6.f143066d
            boolean r8 = r8.e()
            if (r8 != 0) goto L_0x00e3
            eJ.i$e r8 = r6.f143066d
            java.lang.Object r8 = r5.h(r8)
            eJ.q r8 = (eJ.C17206q) r8
            if (r8 == 0) goto L_0x00e3
            eJ.q$a r8 = r8.toBuilder()
            goto L_0x00e4
        L_0x00e3:
            r8 = 0
        L_0x00e4:
            if (r8 != 0) goto L_0x00ee
            eJ.q r8 = r6.c()
            eJ.q$a r8 = r8.newBuilderForType()
        L_0x00ee:
            eJ.i$e r10 = r6.f143066d
            eJ.z$b r10 = r10.f()
            eJ.z$b r0 = eJ.C17215z.b.GROUP
            if (r10 != r0) goto L_0x0100
            int r10 = r6.d()
            r7.r(r10, r8, r9)
            goto L_0x0103
        L_0x0100:
            r7.v(r8, r9)
        L_0x0103:
            eJ.q r7 = r8.g()
        L_0x0107:
            eJ.i$e r8 = r6.f143066d
            boolean r8 = r8.e()
            if (r8 == 0) goto L_0x0119
            eJ.i$e r8 = r6.f143066d
            java.lang.Object r6 = r6.f(r7)
            r5.a(r8, r6)
            goto L_0x0122
        L_0x0119:
            eJ.i$e r8 = r6.f143066d
            java.lang.Object r6 = r6.f(r7)
            r5.v(r8, r6)
        L_0x0122:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: eJ.C17198i.l(eJ.h, eJ.q, eJ.e, eJ.f, eJ.g, int):boolean");
    }

    public C17208s<? extends C17206q> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* access modifiers changed from: protected */
    public void h() {
    }

    /* access modifiers changed from: protected */
    public boolean k(C17194e eVar, C17195f fVar, C17196g gVar, int i10) {
        return eVar.P(i10, fVar);
    }

    /* renamed from: eJ.i$d */
    public static abstract class d<MessageType extends d<MessageType>> extends C17198i implements C17207r {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17197h<e> f143053b;

        /* renamed from: eJ.i$d$a */
        protected class a {

            /* renamed from: a  reason: collision with root package name */
            private final Iterator<Map.Entry<e, Object>> f143054a;

            /* renamed from: b  reason: collision with root package name */
            private Map.Entry<e, Object> f143055b;

            /* renamed from: c  reason: collision with root package name */
            private final boolean f143056c;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, C17195f fVar) {
                while (true) {
                    Map.Entry<e, Object> entry = this.f143055b;
                    if (entry != null && entry.getKey().d() < i10) {
                        e key = this.f143055b.getKey();
                        if (!this.f143056c || key.g() != C17215z.c.MESSAGE || key.e()) {
                            C17197h.z(key, this.f143055b.getValue(), fVar);
                        } else {
                            fVar.f0(key.d(), (C17206q) this.f143055b.getValue());
                        }
                        if (this.f143054a.hasNext()) {
                            this.f143055b = this.f143054a.next();
                        } else {
                            this.f143055b = null;
                        }
                    } else {
                        return;
                    }
                }
            }

            private a(boolean z10) {
                Iterator<Map.Entry<e, Object>> p10 = d.this.f143053b.p();
                this.f143054a = p10;
                if (p10.hasNext()) {
                    this.f143055b = p10.next();
                }
                this.f143056c = z10;
            }
        }

        protected d() {
            this.f143053b = C17197h.t();
        }

        private void u(f<MessageType, ?> fVar) {
            if (fVar.b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        /* access modifiers changed from: protected */
        public void h() {
            this.f143053b.q();
        }

        /* access modifiers changed from: protected */
        public boolean k(C17194e eVar, C17195f fVar, C17196g gVar, int i10) {
            return C17198i.l(this.f143053b, getDefaultInstanceForType(), eVar, fVar, gVar, i10);
        }

        /* access modifiers changed from: protected */
        public boolean n() {
            return this.f143053b.n();
        }

        /* access modifiers changed from: protected */
        public int o() {
            return this.f143053b.k();
        }

        public final <Type> Type p(f<MessageType, Type> fVar) {
            u(fVar);
            Object h10 = this.f143053b.h(fVar.f143066d);
            return h10 == null ? fVar.f143064b : fVar.a(h10);
        }

        public final <Type> Type q(f<MessageType, List<Type>> fVar, int i10) {
            u(fVar);
            return fVar.e(this.f143053b.i(fVar.f143066d, i10));
        }

        public final <Type> int r(f<MessageType, List<Type>> fVar) {
            u(fVar);
            return this.f143053b.j(fVar.f143066d);
        }

        public final <Type> boolean s(f<MessageType, Type> fVar) {
            u(fVar);
            return this.f143053b.m(fVar.f143066d);
        }

        /* access modifiers changed from: protected */
        public d<MessageType>.defpackage.a t() {
            return new a(this, false, (a) null);
        }

        protected d(c<MessageType, ?> cVar) {
            this.f143053b = cVar.l();
        }
    }

    protected C17198i(b bVar) {
    }
}
