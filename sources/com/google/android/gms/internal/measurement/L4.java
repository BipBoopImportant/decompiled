package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.L4;
import com.google.android.gms.internal.measurement.L4.a;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class L4<MessageType extends L4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends T3<MessageType, BuilderType> {
    private static Map<Class<?>, L4<?, ?>> zzc = new ConcurrentHashMap();
    protected C7269c6 zzb = C7269c6.k();
    private int zzd = -1;

    public static abstract class a<MessageType extends L4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends S3<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f48733a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f48734b;

        protected a(MessageType messagetype) {
            this.f48733a = messagetype;
            if (!messagetype.I()) {
                this.f48734b = messagetype.B();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void p(MessageType messagetype, MessageType messagetype2) {
            G5.a().c(messagetype).b(messagetype, messagetype2);
        }

        private final BuilderType y(byte[] bArr, int i10, int i11, C7445x4 x4Var) {
            if (!this.f48734b.I()) {
                w();
            }
            try {
                G5.a().c(this.f48734b).e(this.f48734b, bArr, 0, i11, new Y3(x4Var));
                return this;
            } catch (U4 e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw U4.g();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }

        public /* synthetic */ Object clone() {
            a aVar = (a) this.f48733a.r(f.f48739e, (Object) null, (Object) null);
            aVar.f48734b = (L4) F();
            return aVar;
        }

        public final boolean e() {
            return L4.y(this.f48734b, false);
        }

        public final /* synthetic */ S3 k(byte[] bArr, int i10, int i11) {
            return y(bArr, 0, i11, C7445x4.f49140c);
        }

        public final /* synthetic */ S3 l(byte[] bArr, int i10, int i11, C7445x4 x4Var) {
            return y(bArr, 0, i11, x4Var);
        }

        public final BuilderType o(MessageType messagetype) {
            if (this.f48733a.equals(messagetype)) {
                return this;
            }
            if (!this.f48734b.I()) {
                w();
            }
            p(this.f48734b, messagetype);
            return this;
        }

        /* renamed from: r */
        public final MessageType s() {
            MessageType messagetype = (L4) F();
            if (messagetype.e()) {
                return messagetype;
            }
            throw new C7251a6(messagetype);
        }

        /* renamed from: u */
        public MessageType F() {
            if (!this.f48734b.I()) {
                return this.f48734b;
            }
            this.f48734b.G();
            return this.f48734b;
        }

        /* access modifiers changed from: protected */
        public final void v() {
            if (!this.f48734b.I()) {
                w();
            }
        }

        /* access modifiers changed from: protected */
        public void w() {
            MessageType B10 = this.f48733a.B();
            p(B10, this.f48734b);
            this.f48734b = B10;
        }
    }

    public static abstract class b<MessageType extends b<MessageType, BuilderType>, BuilderType> extends L4<MessageType, BuilderType> implements C7422u5 {
        protected A4<e> zzc = A4.i();

        /* access modifiers changed from: package-private */
        public final A4<e> J() {
            if (this.zzc.r()) {
                this.zzc = (A4) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    protected static class c<T extends L4<T, ?>> extends U3<T> {
        public c(T t10) {
        }
    }

    public static class d<ContainingType extends C7406s5, Type> extends C7429v4<ContainingType, Type> {
    }

    static final class e implements C4<e> {
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final boolean h() {
            throw new NoSuchMethodError();
        }

        public final A5 r(A5 a52, A5 a53) {
            throw new NoSuchMethodError();
        }

        public final C7430v5 y(C7430v5 v5Var, C7406s5 s5Var) {
            throw new NoSuchMethodError();
        }

        public final int zza() {
            throw new NoSuchMethodError();
        }

        public final C7359m6 zzb() {
            throw new NoSuchMethodError();
        }

        public final C7384p6 zzc() {
            throw new NoSuchMethodError();
        }

        public final boolean zzd() {
            throw new NoSuchMethodError();
        }
    }

    /* 'enum' modifier removed */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final int f48735a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f48736b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f48737c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f48738d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f48739e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f48740f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f48741g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f48742h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f48742h.clone();
        }
    }

    protected static P4 C() {
        return M4.j();
    }

    protected static S4 D() {
        return C7313h5.j();
    }

    protected static <E> R4<E> E() {
        return J5.k();
    }

    private final int m() {
        return G5.a().c(this).zzb(this);
    }

    static <T extends L4<?, ?>> T o(Class<T> cls) {
        T t10 = (L4) zzc.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (L4) zzc.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (L4) ((L4) C7287e6.b(cls)).r(f.f48740f, (Object) null, (Object) null);
            if (t10 != null) {
                zzc.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    protected static <E> R4<E> p(R4<E> r42) {
        return r42.c(r42.size() << 1);
    }

    protected static S4 q(S4 s42) {
        return s42.z(s42.size() << 1);
    }

    protected static Object t(C7406s5 s5Var, String str, Object[] objArr) {
        return new I5(s5Var, str, objArr);
    }

    static Object u(Method method, Object obj, Object... objArr) {
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

    protected static <T extends L4<?, ?>> void v(Class<T> cls, T t10) {
        t10.H();
        zzc.put(cls, t10);
    }

    private final int x(K5<?> k52) {
        return k52 == null ? G5.a().c(this).zza(this) : k52.zza(this);
    }

    /* access modifiers changed from: private */
    public static final <T extends L4<T, ?>> boolean y(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.r(f.f48735a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean a10 = G5.a().c(t10).a(t10);
        if (z10) {
            t10.r(f.f48736b, a10 ? t10 : null, (Object) null);
        }
        return a10;
    }

    public final BuilderType A() {
        return ((a) r(f.f48739e, (Object) null, (Object) null)).o(this);
    }

    /* access modifiers changed from: package-private */
    public final MessageType B() {
        return (L4) r(f.f48738d, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public final void G() {
        G5.a().c(this).zzd(this);
        H();
    }

    /* access modifiers changed from: package-private */
    public final void H() {
        this.zzd &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public final boolean I() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int a() {
        return g((K5) null);
    }

    public final /* synthetic */ C7430v5 b() {
        return ((a) r(f.f48739e, (Object) null, (Object) null)).o(this);
    }

    public final /* synthetic */ C7430v5 c() {
        return (a) r(f.f48739e, (Object) null, (Object) null);
    }

    public final /* synthetic */ C7406s5 d() {
        return (L4) r(f.f48740f, (Object) null, (Object) null);
    }

    public final boolean e() {
        return y(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return G5.a().c(this).c(this, (L4) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final int g(K5 k52) {
        if (I()) {
            int x10 = x(k52);
            if (x10 >= 0) {
                return x10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + x10);
        } else if (k() != Integer.MAX_VALUE) {
            return k();
        } else {
            int x11 = x(k52);
            i(x11);
            return x11;
        }
    }

    public int hashCode() {
        if (I()) {
            return m();
        }
        if (this.zza == 0) {
            this.zza = m();
        }
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final void i(int i10) {
        if (i10 >= 0) {
            this.zzd = (i10 & Integer.MAX_VALUE) | (this.zzd & Integer.MIN_VALUE);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    public final void j(C7405s4 s4Var) {
        G5.a().c(this).d(this, C7413t4.J(s4Var));
    }

    /* access modifiers changed from: package-private */
    public final int k() {
        return this.zzd & Integer.MAX_VALUE;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends L4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType n(MessageType messagetype) {
        return z().o(messagetype);
    }

    /* access modifiers changed from: protected */
    public abstract Object r(int i10, Object obj, Object obj2);

    public String toString() {
        return C7446x5.a(this, super.toString());
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends L4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType z() {
        return (a) r(f.f48739e, (Object) null, (Object) null);
    }
}
