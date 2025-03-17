package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C9518a;
import com.google.crypto.tink.shaded.protobuf.C9522e;
import com.google.crypto.tink.shaded.protobuf.C9537u;
import com.google.crypto.tink.shaded.protobuf.C9541y;
import com.google.crypto.tink.shaded.protobuf.C9541y.a;
import com.google.crypto.tink.shaded.protobuf.S;
import com.google.crypto.tink.shaded.protobuf.u0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.crypto.tink.shaded.protobuf.y  reason: case insensitive filesystem */
public abstract class C9541y<MessageType extends C9541y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C9518a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C9541y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected p0 unknownFields = p0.c();

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$a */
    public static abstract class a<MessageType extends C9541y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C9518a.C1175a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f68135a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f68136b;

        protected a(MessageType messagetype) {
            this.f68135a = messagetype;
            if (!messagetype.A()) {
                this.f68136b = v();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void u(MessageType messagetype, MessageType messagetype2) {
            d0.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType v() {
            return this.f68135a.G();
        }

        /* renamed from: f */
        public final MessageType g() {
            MessageType j10 = q();
            if (j10.isInitialized()) {
                return j10;
            }
            throw C9518a.C1175a.e(j10);
        }

        public final boolean isInitialized() {
            return C9541y.z(this.f68136b, false);
        }

        /* renamed from: j */
        public MessageType q() {
            if (!this.f68136b.A()) {
                return this.f68136b;
            }
            this.f68136b.B();
            return this.f68136b;
        }

        /* renamed from: k */
        public BuilderType clone() {
            BuilderType E10 = getDefaultInstanceForType().newBuilderForType();
            E10.f68136b = q();
            return E10;
        }

        /* access modifiers changed from: protected */
        public final void l() {
            if (!this.f68136b.A()) {
                m();
            }
        }

        /* access modifiers changed from: protected */
        public void m() {
            MessageType v10 = v();
            u(v10, this.f68136b);
            this.f68136b = v10;
        }

        /* renamed from: n */
        public MessageType getDefaultInstanceForType() {
            return this.f68135a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: o */
        public BuilderType c(MessageType messagetype) {
            return r(messagetype);
        }

        /* renamed from: p */
        public BuilderType c2(C9526i iVar, C9533p pVar) {
            l();
            try {
                d0.a().d(this.f68136b).i(this.f68136b, C9527j.Q(iVar), pVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType r(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            l();
            u(this.f68136b, messagetype);
            return this;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$b */
    protected static class b<T extends C9541y<T, ?>> extends C9519b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f68137b;

        public b(T t10) {
            this.f68137b = t10;
        }

        /* renamed from: g */
        public T a(C9526i iVar, C9533p pVar) {
            return C9541y.L(this.f68137b, iVar, pVar);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends C9541y<MessageType, BuilderType> implements T {
        protected C9537u<d> extensions = C9537u.h();

        /* access modifiers changed from: package-private */
        public C9537u<d> Q() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ S getDefaultInstanceForType() {
            return C9541y.super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ S.a newBuilderForType() {
            return C9541y.super.newBuilderForType();
        }

        public /* bridge */ /* synthetic */ S.a toBuilder() {
            return C9541y.super.toBuilder();
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$d */
    static final class d implements C9537u.b<d> {

        /* renamed from: a  reason: collision with root package name */
        final A.d<?> f68138a;

        /* renamed from: b  reason: collision with root package name */
        final int f68139b;

        /* renamed from: c  reason: collision with root package name */
        final u0.b f68140c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f68141d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f68142e;

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f68139b - dVar.f68139b;
        }

        public A.d<?> b() {
            return this.f68138a;
        }

        public int d() {
            return this.f68139b;
        }

        public boolean e() {
            return this.f68141d;
        }

        public u0.b f() {
            return this.f68140c;
        }

        public u0.c g() {
            return this.f68140c.a();
        }

        public boolean i() {
            return this.f68142e;
        }

        public S.a o(S.a aVar, S s10) {
            return ((a) aVar).r((C9541y) s10);
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$e */
    public static class e<ContainingType extends S, Type> extends C9531n<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final S f68143a;

        /* renamed from: b  reason: collision with root package name */
        final d f68144b;

        public u0.b a() {
            return this.f68144b.f();
        }

        public S b() {
            return this.f68143a;
        }

        public int c() {
            return this.f68144b.d();
        }

        public boolean d() {
            return this.f68144b.f68141d;
        }
    }

    /* renamed from: com.google.crypto.tink.shaded.protobuf.y$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static <E> A.i<E> D(A.i<E> iVar) {
        int size = iVar.size();
        return iVar.f(size == 0 ? 10 : size * 2);
    }

    protected static Object F(S s10, String str, Object[] objArr) {
        return new f0(s10, str, objArr);
    }

    protected static <T extends C9541y<T, ?>> T H(T t10, C9525h hVar, C9533p pVar) {
        return j(K(t10, hVar, pVar));
    }

    protected static <T extends C9541y<T, ?>> T I(T t10, InputStream inputStream, C9533p pVar) {
        return j(L(t10, C9526i.f(inputStream), pVar));
    }

    protected static <T extends C9541y<T, ?>> T J(T t10, byte[] bArr, C9533p pVar) {
        return j(M(t10, bArr, 0, bArr.length, pVar));
    }

    private static <T extends C9541y<T, ?>> T K(T t10, C9525h hVar, C9533p pVar) {
        C9526i A10 = hVar.A();
        T L10 = L(t10, A10, pVar);
        try {
            A10.a(0);
            return L10;
        } catch (B e10) {
            throw e10.k(L10);
        }
    }

    static <T extends C9541y<T, ?>> T L(T t10, C9526i iVar, C9533p pVar) {
        T G10 = t10.G();
        try {
            h0 d10 = d0.a().d(G10);
            d10.i(G10, C9527j.Q(iVar), pVar);
            d10.f(G10);
            return G10;
        } catch (B e10) {
            e = e10;
            if (e.a()) {
                e = new B((IOException) e);
            }
            throw e.k(G10);
        } catch (n0 e11) {
            throw e11.a().k(G10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof B) {
                throw ((B) e12.getCause());
            }
            throw new B(e12).k(G10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof B) {
                throw ((B) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends C9541y<T, ?>> T M(T t10, byte[] bArr, int i10, int i11, C9533p pVar) {
        T G10 = t10.G();
        try {
            h0 d10 = d0.a().d(G10);
            d10.d(G10, bArr, i10, i10 + i11, new C9522e.b(pVar));
            d10.f(G10);
            return G10;
        } catch (B e10) {
            e = e10;
            if (e.a()) {
                e = new B((IOException) e);
            }
            throw e.k(G10);
        } catch (n0 e11) {
            throw e11.a().k(G10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof B) {
                throw ((B) e12.getCause());
            }
            throw new B(e12).k(G10);
        } catch (IndexOutOfBoundsException unused) {
            throw B.m().k(G10);
        }
    }

    protected static <T extends C9541y<?, ?>> void N(Class<T> cls, T t10) {
        t10.C();
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends C9541y<T, ?>> T j(T t10) {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.f().a().k(t10);
    }

    private int n(h0<?> h0Var) {
        return h0Var == null ? d0.a().d(this).h(this) : h0Var.h(this);
    }

    protected static <E> A.i<E> t() {
        return e0.j();
    }

    static <T extends C9541y<?, ?>> T u(Class<T> cls) {
        T t10 = (C9541y) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (C9541y) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = ((C9541y) s0.k(cls)).getDefaultInstanceForType();
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object y(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends C9541y<T, ?>> boolean z(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.p(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g10 = d0.a().d(t10).g(t10);
        if (z10) {
            t10.r(f.SET_MEMOIZED_IS_INITIALIZED, g10 ? t10 : null);
        }
        return g10;
    }

    /* access modifiers changed from: package-private */
    public boolean A() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* access modifiers changed from: protected */
    public void B() {
        d0.a().d(this).f(this);
        C();
    }

    /* access modifiers changed from: package-private */
    public void C() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: E */
    public final BuilderType newBuilderForType() {
        return (a) p(f.NEW_BUILDER);
    }

    /* access modifiers changed from: package-private */
    public MessageType G() {
        return (C9541y) p(f.NEW_MUTABLE_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void O(int i10) {
        this.memoizedHashCode = i10;
    }

    /* renamed from: P */
    public final BuilderType toBuilder() {
        return ((a) p(f.NEW_BUILDER)).r(this);
    }

    public void b(C9528k kVar) {
        d0.a().d(this).j(this, C9529l.P(kVar));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public int d(h0 h0Var) {
        if (A()) {
            int n10 = n(h0Var);
            if (n10 >= 0) {
                return n10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + n10);
        } else if (c() != Integer.MAX_VALUE) {
            return c();
        } else {
            int n11 = n(h0Var);
            h(n11);
            return n11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return d0.a().d(this).c(this, (C9541y) obj);
        }
        return false;
    }

    public final a0<MessageType> getParserForType() {
        return (a0) p(f.GET_PARSER);
    }

    public int getSerializedSize() {
        return d((h0) null);
    }

    /* access modifiers changed from: package-private */
    public void h(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    public int hashCode() {
        if (A()) {
            return m();
        }
        if (x()) {
            O(m());
        }
        return w();
    }

    /* access modifiers changed from: package-private */
    public Object i() {
        return p(f.BUILD_MESSAGE_INFO);
    }

    public final boolean isInitialized() {
        return z(this, true);
    }

    /* access modifiers changed from: package-private */
    public void k() {
        this.memoizedHashCode = 0;
    }

    /* access modifiers changed from: package-private */
    public void l() {
        h(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public int m() {
        return d0.a().d(this).b(this);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends C9541y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType o() {
        return (a) p(f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object p(f fVar) {
        return s(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object r(f fVar, Object obj) {
        return s(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object s(f fVar, Object obj, Object obj2);

    public String toString() {
        return U.f(this, super.toString());
    }

    /* renamed from: v */
    public final MessageType getDefaultInstanceForType() {
        return (C9541y) p(f.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public int w() {
        return this.memoizedHashCode;
    }

    /* access modifiers changed from: package-private */
    public boolean x() {
        return w() == 0;
    }
}
