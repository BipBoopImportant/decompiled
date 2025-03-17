package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;
import com.google.android.gms.internal.clearcut.C7186g0.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.clearcut.g0  reason: case insensitive filesystem */
public abstract class C7186g0<MessageType extends C7186g0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C7215q<MessageType, BuilderType> {
    private static Map<Object, C7186g0<?, ?>> zzjr = new ConcurrentHashMap();
    protected C7234w1 zzjp = C7234w1.h();
    private int zzjq = -1;

    /* renamed from: com.google.android.gms.internal.clearcut.g0$a */
    public static abstract class a<MessageType extends C7186g0<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends r<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f48375a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f48376b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f48377c = false;

        protected a(MessageType messagetype) {
            this.f48375a = messagetype;
            this.f48376b = (C7186g0) messagetype.e(e.f48384d, (Object) null, (Object) null);
        }

        private static void d(MessageType messagetype, MessageType messagetype2) {
            Y0.a().d(messagetype).h(messagetype, messagetype2);
        }

        /* renamed from: b */
        public final BuilderType a(MessageType messagetype) {
            e();
            d(this.f48376b, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) this.f48375a.e(e.f48385e, (Object) null, (Object) null);
            aVar.a((C7186g0) B());
            return aVar;
        }

        /* access modifiers changed from: protected */
        public void e() {
            if (this.f48377c) {
                MessageType messagetype = (C7186g0) this.f48376b.e(e.f48384d, (Object) null, (Object) null);
                d(messagetype, this.f48376b);
                this.f48376b = messagetype;
                this.f48377c = false;
            }
        }

        /* renamed from: f */
        public MessageType B() {
            if (this.f48377c) {
                return this.f48376b;
            }
            MessageType messagetype = this.f48376b;
            Y0.a().d(messagetype).d(messagetype);
            this.f48377c = true;
            return this.f48376b;
        }

        public final MessageType j() {
            MessageType messagetype = (C7186g0) B();
            byte byteValue = ((Byte) messagetype.e(e.f48381a, (Object) null, (Object) null)).byteValue();
            boolean z10 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z10 = false;
                } else {
                    z10 = Y0.a().d(messagetype).g(messagetype);
                    messagetype.e(e.f48382b, z10 ? messagetype : null, (Object) null);
                }
            }
            if (z10) {
                return messagetype;
            }
            throw new C7228u1(messagetype);
        }

        public final /* synthetic */ M0 x() {
            C7186g0 g0Var = (C7186g0) B();
            byte byteValue = ((Byte) g0Var.e(e.f48381a, (Object) null, (Object) null)).byteValue();
            boolean z10 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z10 = false;
                } else {
                    z10 = Y0.a().d(g0Var).g(g0Var);
                    g0Var.e(e.f48382b, z10 ? g0Var : null, (Object) null);
                }
            }
            if (z10) {
                return g0Var;
            }
            throw new C7228u1(g0Var);
        }

        public final /* synthetic */ M0 z() {
            return this.f48375a;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.g0$b */
    public static class b<T extends C7186g0<T, ?>> extends C7220s<T> {

        /* renamed from: b  reason: collision with root package name */
        private T f48378b;

        public b(T t10) {
            this.f48378b = t10;
        }
    }

    /* renamed from: com.google.android.gms.internal.clearcut.g0$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends C7186g0<MessageType, BuilderType> implements O0 {
        protected X<d> zzjv = X.k();
    }

    /* renamed from: com.google.android.gms.internal.clearcut.g0$d */
    static final class d implements C7166a0<d> {

        /* renamed from: a  reason: collision with root package name */
        final int f48379a;

        /* renamed from: b  reason: collision with root package name */
        final K1 f48380b;

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f48379a - ((d) obj).f48379a;
        }

        public final boolean k() {
            return false;
        }

        public final P1 l() {
            return this.f48380b.a();
        }

        public final boolean p() {
            return false;
        }

        public final K1 t() {
            return this.f48380b;
        }

        public final S0 u(S0 s02, S0 s03) {
            throw new UnsupportedOperationException();
        }

        public final N0 x(N0 n02, M0 m02) {
            return ((a) n02).a((C7186g0) m02);
        }

        public final int zzc() {
            return this.f48379a;
        }
    }

    /* 'enum' modifier removed */
    /* renamed from: com.google.android.gms.internal.clearcut.g0$e */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public static final int f48381a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f48382b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f48383c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f48384d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f48385e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f48386f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f48387g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f48388h = {1, 2, 3, 4, 5, 6, 7};

        /* renamed from: i  reason: collision with root package name */
        public static final int f48389i = 1;

        /* renamed from: j  reason: collision with root package name */
        public static final int f48390j = 2;

        /* renamed from: k  reason: collision with root package name */
        private static final /* synthetic */ int[] f48391k = {1, 2};

        /* renamed from: l  reason: collision with root package name */
        public static final int f48392l = 1;

        /* renamed from: m  reason: collision with root package name */
        public static final int f48393m = 2;

        /* renamed from: n  reason: collision with root package name */
        private static final /* synthetic */ int[] f48394n = {1, 2};

        public static int[] a() {
            return (int[]) f48388h.clone();
        }
    }

    private static <T extends C7186g0<T, ?>> T d(T t10, byte[] bArr) {
        T t11 = (C7186g0) t10.e(e.f48384d, (Object) null, (Object) null);
        try {
            Y0.a().d(t11).j(t11, bArr, 0, bArr.length, new C7232w());
            Y0.a().d(t11).d(t11);
            if (t11.zzex == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e10) {
            if (e10.getCause() instanceof C7204m0) {
                throw ((C7204m0) e10.getCause());
            }
            throw new C7204m0(e10.getMessage()).f(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw C7204m0.a().f(t11);
        }
    }

    protected static Object f(M0 m02, String str, Object[] objArr) {
        return new C7167a1(m02, str, objArr);
    }

    static Object g(Method method, Object obj, Object... objArr) {
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

    protected static <T extends C7186g0<?, ?>> void h(Class<T> cls, T t10) {
        zzjr.put(cls, t10);
    }

    protected static <T extends C7186g0<T, ?>> T i(T t10, byte[] bArr) {
        T d10 = d(t10, bArr);
        if (d10 != null) {
            byte byteValue = ((Byte) d10.e(e.f48381a, (Object) null, (Object) null)).byteValue();
            boolean z10 = true;
            if (byteValue != 1) {
                if (byteValue == 0) {
                    z10 = false;
                } else {
                    z10 = Y0.a().d(d10).g(d10);
                    d10.e(e.f48382b, z10 ? d10 : null, (Object) null);
                }
            }
            if (!z10) {
                throw new C7204m0(new C7228u1(d10).getMessage()).f(d10);
            }
        }
        return d10;
    }

    protected static <E> C7201l0<E> j() {
        return Z0.i();
    }

    static <T extends C7186g0<?, ?>> T k(Class<T> cls) {
        T t10 = (C7186g0) zzjr.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (C7186g0) zzjr.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 != null) {
            return t10;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    public final void A(M m10) {
        Y0.a().b(getClass()).f(this, O.c(m10));
    }

    /* access modifiers changed from: package-private */
    public final void a(int i10) {
        this.zzjq = i10;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return this.zzjq;
    }

    /* access modifiers changed from: protected */
    public abstract Object e(int i10, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((C7186g0) e(e.f48386f, (Object) null, (Object) null)).getClass().isInstance(obj)) {
            return false;
        }
        return Y0.a().d(this).c(this, (C7186g0) obj);
    }

    public int hashCode() {
        int i10 = this.zzex;
        if (i10 != 0) {
            return i10;
        }
        int b10 = Y0.a().d(this).b(this);
        this.zzex = b10;
        return b10;
    }

    public final boolean isInitialized() {
        byte byteValue = ((Byte) e(e.f48381a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g10 = Y0.a().d(this).g(this);
        e(e.f48382b, g10 ? this : null, (Object) null);
        return g10;
    }

    public String toString() {
        return P0.a(this, super.toString());
    }

    public final /* synthetic */ N0 v() {
        a aVar = (a) e(e.f48385e, (Object) null, (Object) null);
        aVar.a(this);
        return aVar;
    }

    public final /* synthetic */ N0 w() {
        return (a) e(e.f48385e, (Object) null, (Object) null);
    }

    public final int y() {
        if (this.zzjq == -1) {
            this.zzjq = Y0.a().d(this).i(this);
        }
        return this.zzjq;
    }

    public final /* synthetic */ M0 z() {
        return (C7186g0) e(e.f48386f, (Object) null, (Object) null);
    }
}
