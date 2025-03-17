package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.C5148a;
import androidx.datastore.preferences.protobuf.C5166t;
import androidx.datastore.preferences.protobuf.C5170x;
import androidx.datastore.preferences.protobuf.C5170x.a;
import androidx.datastore.preferences.protobuf.C5172z;
import androidx.datastore.preferences.protobuf.S;
import androidx.datastore.preferences.protobuf.t0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: androidx.datastore.preferences.protobuf.x  reason: case insensitive filesystem */
public abstract class C5170x<MessageType extends C5170x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C5148a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, C5170x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected p0 unknownFields = p0.c();

    /* renamed from: androidx.datastore.preferences.protobuf.x$a */
    public static abstract class a<MessageType extends C5170x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C5148a.C0330a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f21456a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f21457b;

        protected a(MessageType messagetype) {
            this.f21456a = messagetype;
            if (!messagetype.B()) {
                this.f21457b = w();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void v(MessageType messagetype, MessageType messagetype2) {
            d0.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType w() {
            return this.f21456a.H();
        }

        public final boolean isInitialized() {
            return C5170x.A(this.f21457b, false);
        }

        /* renamed from: j */
        public final MessageType g() {
            MessageType k10 = q();
            if (k10.isInitialized()) {
                return k10;
            }
            throw C5148a.C0330a.f(k10);
        }

        /* renamed from: k */
        public MessageType q() {
            if (!this.f21457b.B()) {
                return this.f21457b;
            }
            this.f21457b.C();
            return this.f21457b;
        }

        /* renamed from: l */
        public BuilderType clone() {
            BuilderType F10 = getDefaultInstanceForType().newBuilderForType();
            F10.f21457b = q();
            return F10;
        }

        /* access modifiers changed from: protected */
        public final void m() {
            if (!this.f21457b.B()) {
                n();
            }
        }

        /* access modifiers changed from: protected */
        public void n() {
            MessageType w10 = w();
            v(w10, this.f21457b);
            this.f21457b = w10;
        }

        /* renamed from: o */
        public MessageType getDefaultInstanceForType() {
            return this.f21456a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: p */
        public BuilderType d(MessageType messagetype) {
            return u(messagetype);
        }

        /* renamed from: r */
        public BuilderType a1(C5155h hVar, C5162o oVar) {
            m();
            try {
                d0.a().d(this.f21457b).i(this.f21457b, C5156i.Q(hVar), oVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType u(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            m();
            v(this.f21457b, messagetype);
            return this;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$b */
    protected static class b<T extends C5170x<T, ?>> extends C5149b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f21458b;

        public b(T t10) {
            this.f21458b = t10;
        }

        /* renamed from: g */
        public T b(C5155h hVar, C5162o oVar) {
            return C5170x.J(this.f21458b, hVar, oVar);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends C5170x<MessageType, BuilderType> implements T {
        protected C5166t<d> extensions = C5166t.h();

        /* access modifiers changed from: package-private */
        public C5166t<d> N() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ S getDefaultInstanceForType() {
            return C5170x.super.getDefaultInstanceForType();
        }

        public /* bridge */ /* synthetic */ S.a newBuilderForType() {
            return C5170x.super.newBuilderForType();
        }

        public /* bridge */ /* synthetic */ S.a toBuilder() {
            return C5170x.super.toBuilder();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$d */
    static final class d implements C5166t.b<d> {

        /* renamed from: a  reason: collision with root package name */
        final int f21459a;

        /* renamed from: b  reason: collision with root package name */
        final t0.b f21460b;

        /* renamed from: c  reason: collision with root package name */
        final boolean f21461c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f21462d;

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f21459a - dVar.f21459a;
        }

        public C5172z.d<?> b() {
            return null;
        }

        public int d() {
            return this.f21459a;
        }

        public boolean e() {
            return this.f21461c;
        }

        public t0.b f() {
            return this.f21460b;
        }

        public t0.c g() {
            return this.f21460b.a();
        }

        public boolean i() {
            return this.f21462d;
        }

        public S.a s(S.a aVar, S s10) {
            return ((a) aVar).u((C5170x) s10);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$e */
    public static class e<ContainingType extends S, Type> extends C5160m<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final S f21463a;

        /* renamed from: b  reason: collision with root package name */
        final d f21464b;

        public t0.b a() {
            return this.f21464b.f();
        }

        public S b() {
            return this.f21463a;
        }

        public int c() {
            return this.f21464b.d();
        }

        public boolean d() {
            return this.f21464b.f21461c;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.x$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static final <T extends C5170x<T, ?>> boolean A(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.r(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g10 = d0.a().d(t10).g(t10);
        if (z10) {
            t10.s(f.SET_MEMOIZED_IS_INITIALIZED, g10 ? t10 : null);
        }
        return g10;
    }

    protected static <E> C5172z.i<E> E(C5172z.i<E> iVar) {
        int size = iVar.size();
        return iVar.f(size == 0 ? 10 : size * 2);
    }

    protected static Object G(S s10, String str, Object[] objArr) {
        return new f0(s10, str, objArr);
    }

    protected static <T extends C5170x<T, ?>> T I(T t10, InputStream inputStream) {
        return k(J(t10, C5155h.g(inputStream), C5162o.b()));
    }

    static <T extends C5170x<T, ?>> T J(T t10, C5155h hVar, C5162o oVar) {
        T H10 = t10.H();
        try {
            h0 d10 = d0.a().d(H10);
            d10.i(H10, C5156i.Q(hVar), oVar);
            d10.f(H10);
            return H10;
        } catch (A e10) {
            e = e10;
            if (e.a()) {
                e = new A((IOException) e);
            }
            throw e.k(H10);
        } catch (n0 e11) {
            throw e11.a().k(H10);
        } catch (IOException e12) {
            if (e12.getCause() instanceof A) {
                throw ((A) e12.getCause());
            }
            throw new A(e12).k(H10);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof A) {
                throw ((A) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends C5170x<?, ?>> void K(Class<T> cls, T t10) {
        t10.D();
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends C5170x<T, ?>> T k(T t10) {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.f().a().k(t10);
    }

    private int o(h0<?> h0Var) {
        return h0Var == null ? d0.a().d(this).h(this) : h0Var.h(this);
    }

    protected static <E> C5172z.i<E> u() {
        return e0.j();
    }

    static <T extends C5170x<?, ?>> T v(Class<T> cls) {
        T t10 = (C5170x) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (C5170x) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = ((C5170x) r0.i(cls)).getDefaultInstanceForType();
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object z(Method method, Object obj, Object... objArr) {
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

    /* access modifiers changed from: package-private */
    public boolean B() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* access modifiers changed from: protected */
    public void C() {
        d0.a().d(this).f(this);
        D();
    }

    /* access modifiers changed from: package-private */
    public void D() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* renamed from: F */
    public final BuilderType newBuilderForType() {
        return (a) r(f.NEW_BUILDER);
    }

    /* access modifiers changed from: package-private */
    public MessageType H() {
        return (C5170x) r(f.NEW_MUTABLE_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void L(int i10) {
        this.memoizedHashCode = i10;
    }

    /* renamed from: M */
    public final BuilderType toBuilder() {
        return ((a) r(f.NEW_BUILDER)).u(this);
    }

    public void a(C5157j jVar) {
        d0.a().d(this).j(this, C5158k.P(jVar));
    }

    /* access modifiers changed from: package-private */
    public int c() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public int d(h0 h0Var) {
        if (B()) {
            int o10 = o(h0Var);
            if (o10 >= 0) {
                return o10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + o10);
        } else if (c() != Integer.MAX_VALUE) {
            return c();
        } else {
            int o11 = o(h0Var);
            h(o11);
            return o11;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return d0.a().d(this).c(this, (C5170x) obj);
        }
        return false;
    }

    public final a0<MessageType> getParserForType() {
        return (a0) r(f.GET_PARSER);
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
        if (B()) {
            return n();
        }
        if (y()) {
            L(n());
        }
        return x();
    }

    public final boolean isInitialized() {
        return A(this, true);
    }

    /* access modifiers changed from: package-private */
    public Object j() {
        return r(f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: package-private */
    public void l() {
        this.memoizedHashCode = 0;
    }

    /* access modifiers changed from: package-private */
    public void m() {
        h(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public int n() {
        return d0.a().d(this).b(this);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends C5170x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType p() {
        return (a) r(f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object r(f fVar) {
        return t(fVar, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public Object s(f fVar, Object obj) {
        return t(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object t(f fVar, Object obj, Object obj2);

    public String toString() {
        return U.f(this, super.toString());
    }

    /* renamed from: w */
    public final MessageType getDefaultInstanceForType() {
        return (C5170x) r(f.GET_DEFAULT_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public int x() {
        return this.memoizedHashCode;
    }

    /* access modifiers changed from: package-private */
    public boolean y() {
        return x() == 0;
    }
}
