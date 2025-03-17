package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.Q0;
import com.google.android.gms.internal.vision.Q0.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class Q0<MessageType extends Q0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends X<MessageType, BuilderType> {
    private static Map<Object, Q0<?, ?>> zzd = new ConcurrentHashMap();
    protected C7515m2 zzb = C7515m2.a();
    private int zzc = -1;

    protected static class a<T extends Q0<T, ?>> extends Y<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f49242b;

        public a(T t10) {
            this.f49242b = t10;
        }
    }

    public static abstract class b<MessageType extends Q0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends W<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f49243a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f49244b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f49245c = false;

        protected b(MessageType messagetype) {
            this.f49243a = messagetype;
            this.f49244b = (Q0) messagetype.n(f.f49254d, (Object) null, (Object) null);
        }

        private static void l(MessageType messagetype, MessageType messagetype2) {
            N1.a().c(messagetype).c(messagetype, messagetype2);
        }

        private final BuilderType m(byte[] bArr, int i10, int i11, C0 c02) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            try {
                N1.a().c(this.f49244b).e(this.f49244b, bArr, 0, i11, new C7481e0(c02));
                return this;
            } catch (Z0 e10) {
                throw e10;
            } catch (IndexOutOfBoundsException unused) {
                throw Z0.a();
            } catch (IOException e11) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
            }
        }

        public final /* synthetic */ A1 c() {
            return this.f49243a;
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.f49243a.n(f.f49255e, (Object) null, (Object) null);
            bVar.d((Q0) h());
            return bVar;
        }

        public final /* synthetic */ W f(byte[] bArr, int i10, int i11, C0 c02) {
            return m(bArr, 0, i11, c02);
        }

        /* renamed from: k */
        public final BuilderType d(MessageType messagetype) {
            if (this.f49245c) {
                n();
                this.f49245c = false;
            }
            l(this.f49244b, messagetype);
            return this;
        }

        /* access modifiers changed from: protected */
        public void n() {
            MessageType messagetype = (Q0) this.f49244b.n(f.f49254d, (Object) null, (Object) null);
            l(messagetype, this.f49244b);
            this.f49244b = messagetype;
        }

        /* renamed from: o */
        public MessageType h() {
            if (this.f49245c) {
                return this.f49244b;
            }
            MessageType messagetype = this.f49244b;
            N1.a().c(messagetype).d(messagetype);
            this.f49245c = true;
            return this.f49244b;
        }

        /* renamed from: p */
        public final MessageType i() {
            MessageType messagetype = (Q0) h();
            if (messagetype.a()) {
                return messagetype;
            }
            throw new C7507k2(messagetype);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends Q0<MessageType, BuilderType> implements C1 {
        protected I0<e> zzc = I0.c();

        /* access modifiers changed from: package-private */
        public final I0<e> x() {
            if (this.zzc.n()) {
                this.zzc = (I0) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    public static class d<ContainingType extends A1, Type> extends A0<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final A1 f49246a;

        /* renamed from: b  reason: collision with root package name */
        final e f49247b;
    }

    static final class e implements K0<e> {

        /* renamed from: a  reason: collision with root package name */
        final int f49248a;

        /* renamed from: b  reason: collision with root package name */
        final B2 f49249b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f49250c;

        public final D1 A(D1 d12, A1 a12) {
            return ((b) d12).d((Q0) a12);
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return this.f49248a - ((e) obj).f49248a;
        }

        public final boolean h() {
            return false;
        }

        public final I1 q(I1 i12, I1 i13) {
            throw new UnsupportedOperationException();
        }

        public final int zza() {
            return this.f49248a;
        }

        public final B2 zzb() {
            return this.f49249b;
        }

        public final E2 zzc() {
            return this.f49249b.a();
        }

        public final boolean zzd() {
            return this.f49250c;
        }
    }

    /* 'enum' modifier removed */
    public static final class f {

        /* renamed from: a  reason: collision with root package name */
        public static final int f49251a = 1;

        /* renamed from: b  reason: collision with root package name */
        public static final int f49252b = 2;

        /* renamed from: c  reason: collision with root package name */
        public static final int f49253c = 3;

        /* renamed from: d  reason: collision with root package name */
        public static final int f49254d = 4;

        /* renamed from: e  reason: collision with root package name */
        public static final int f49255e = 5;

        /* renamed from: f  reason: collision with root package name */
        public static final int f49256f = 6;

        /* renamed from: g  reason: collision with root package name */
        public static final int f49257g = 7;

        /* renamed from: h  reason: collision with root package name */
        private static final /* synthetic */ int[] f49258h = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) f49258h.clone();
        }
    }

    static <T extends Q0<?, ?>> T l(Class<T> cls) {
        T t10 = (Q0) zzd.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (Q0) zzd.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = (Q0) ((Q0) q2.c(cls)).n(f.f49256f, (Object) null, (Object) null);
            if (t10 != null) {
                zzd.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    protected static <E> C7466a1<E> m(C7466a1<E> a1Var) {
        int size = a1Var.size();
        return a1Var.c(size == 0 ? 10 : size << 1);
    }

    protected static Object o(A1 a12, String str, Object[] objArr) {
        return new Q1(a12, str, objArr);
    }

    static Object p(Method method, Object obj, Object... objArr) {
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

    protected static <T extends Q0<?, ?>> void q(Class<T> cls, T t10) {
        zzd.put(cls, t10);
    }

    protected static final <T extends Q0<T, ?>> boolean s(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.n(f.f49251a, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzd2 = N1.a().c(t10).zzd(t10);
        if (z10) {
            t10.n(f.f49252b, zzd2 ? t10 : null, (Object) null);
        }
        return zzd2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.google.android.gms.internal.vision.S0, com.google.android.gms.internal.vision.Y0] */
    protected static Y0 v() {
        return S0.k();
    }

    protected static <E> C7466a1<E> w() {
        return R1.k();
    }

    public final boolean a() {
        return s(this, true);
    }

    public final void b(C7547x0 x0Var) {
        N1.a().c(this).a(this, C7553z0.J(x0Var));
    }

    public final /* synthetic */ A1 c() {
        return (Q0) n(f.f49256f, (Object) null, (Object) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return N1.a().c(this).b(this, (Q0) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void f(int i10) {
        this.zzc = i10;
    }

    public int hashCode() {
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int zza = N1.a().c(this).zza(this);
        this.zza = zza;
        return zza;
    }

    public final /* synthetic */ D1 j() {
        b bVar = (b) n(f.f49255e, (Object) null, (Object) null);
        bVar.d(this);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public final int k() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public abstract Object n(int i10, Object obj, Object obj2);

    public final int r() {
        if (this.zzc == -1) {
            this.zzc = N1.a().c(this).zzb(this);
        }
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends Q0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType t() {
        return (b) n(f.f49255e, (Object) null, (Object) null);
    }

    public String toString() {
        return F1.a(this, super.toString());
    }

    public final /* synthetic */ D1 u() {
        return (b) n(f.f49255e, (Object) null, (Object) null);
    }
}
