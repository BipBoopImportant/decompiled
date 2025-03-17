package com.google.protobuf;

import com.google.protobuf.C9568a;
import com.google.protobuf.C9572e;
import com.google.protobuf.C9587u;
import com.google.protobuf.C9592z;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.GeneratedMessageLite.a;
import com.google.protobuf.S;
import com.google.protobuf.u0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C9568a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected p0 unknownFields = p0.c();

    public static abstract class a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends C9568a.C1192a<MessageType, BuilderType> {

        /* renamed from: a  reason: collision with root package name */
        private final MessageType f69205a;

        /* renamed from: b  reason: collision with root package name */
        protected MessageType f69206b;

        protected a(MessageType messagetype) {
            this.f69205a = messagetype;
            if (!messagetype.isMutable()) {
                this.f69206b = D();
                return;
            }
            throw new IllegalArgumentException("Default instance must be immutable.");
        }

        private static <MessageType> void C(MessageType messagetype, MessageType messagetype2) {
            d0.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType D() {
            return this.f69205a.newMutableInstance();
        }

        public BuilderType A(MessageType messagetype) {
            if (getDefaultInstanceForType().equals(messagetype)) {
                return this;
            }
            u();
            C(this.f69206b, messagetype);
            return this;
        }

        public final boolean isInitialized() {
            return GeneratedMessageLite.isInitialized(this.f69206b, false);
        }

        /* renamed from: o */
        public final MessageType g() {
            MessageType p10 = q();
            if (p10.isInitialized()) {
                return p10;
            }
            throw C9568a.C1192a.n(p10);
        }

        /* renamed from: p */
        public MessageType q() {
            if (!this.f69206b.isMutable()) {
                return this.f69206b;
            }
            this.f69206b.makeImmutable();
            return this.f69206b;
        }

        /* renamed from: r */
        public BuilderType clone() {
            BuilderType newBuilderForType = getDefaultInstanceForType().newBuilderForType();
            newBuilderForType.f69206b = q();
            return newBuilderForType;
        }

        /* access modifiers changed from: protected */
        public final void u() {
            if (!this.f69206b.isMutable()) {
                v();
            }
        }

        /* access modifiers changed from: protected */
        public void v() {
            MessageType D10 = D();
            C(D10, this.f69206b);
            this.f69206b = D10;
        }

        /* renamed from: w */
        public MessageType getDefaultInstanceForType() {
            return this.f69205a;
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public BuilderType l(MessageType messagetype) {
            return A(messagetype);
        }

        /* renamed from: z */
        public BuilderType X0(C9576i iVar, C9583p pVar) {
            u();
            try {
                d0.a().d(this.f69206b).i(this.f69206b, C9577j.Q(iVar), pVar);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    protected static class b<T extends GeneratedMessageLite<T, ?>> extends C9569b<T> {

        /* renamed from: b  reason: collision with root package name */
        private final T f69207b;

        public b(T t10) {
            this.f69207b = t10;
        }

        /* renamed from: g */
        public T b(C9576i iVar, C9583p pVar) {
            return GeneratedMessageLite.parsePartialFrom(this.f69207b, iVar, pVar);
        }
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements T {
        protected C9587u<d> extensions = C9587u.h();

        public /* bridge */ /* synthetic */ S getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        /* access modifiers changed from: package-private */
        public C9587u<d> h() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        public /* bridge */ /* synthetic */ S.a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        public /* bridge */ /* synthetic */ S.a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }
    }

    static final class d implements C9587u.b<d> {

        /* renamed from: a  reason: collision with root package name */
        final C9592z.d<?> f69208a;

        /* renamed from: b  reason: collision with root package name */
        final int f69209b;

        /* renamed from: c  reason: collision with root package name */
        final u0.b f69210c;

        /* renamed from: d  reason: collision with root package name */
        final boolean f69211d;

        /* renamed from: e  reason: collision with root package name */
        final boolean f69212e;

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f69209b - dVar.f69209b;
        }

        public C9592z.d<?> b() {
            return this.f69208a;
        }

        public S.a c(S.a aVar, S s10) {
            return ((a) aVar).A((GeneratedMessageLite) s10);
        }

        public int d() {
            return this.f69209b;
        }

        public boolean e() {
            return this.f69211d;
        }

        public u0.b f() {
            return this.f69210c;
        }

        public u0.c g() {
            return this.f69210c.a();
        }

        public boolean i() {
            return this.f69212e;
        }
    }

    public static class e<ContainingType extends S, Type> extends C9581n<ContainingType, Type> {

        /* renamed from: a  reason: collision with root package name */
        final S f69213a;

        /* renamed from: b  reason: collision with root package name */
        final d f69214b;

        public u0.b a() {
            return this.f69214b.f();
        }

        public S b() {
            return this.f69213a;
        }

        public int c() {
            return this.f69214b.d();
        }

        public boolean d() {
            return this.f69214b.f69211d;
        }
    }

    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t10) {
        if (t10 == null || t10.isInitialized()) {
            return t10;
        }
        throw t10.newUninitializedMessageException().a().j(t10);
    }

    private int computeSerializedSize(h0<?> h0Var) {
        return h0Var == null ? d0.a().d(this).h(this) : h0Var.h(this);
    }

    protected static C9592z.g emptyIntList() {
        return C9591y.m();
    }

    protected static C9592z.h emptyLongList() {
        return I.p();
    }

    protected static <E> C9592z.i<E> emptyProtobufList() {
        return e0.j();
    }

    static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t10 = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t10 = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (t10 == null) {
            t10 = ((GeneratedMessageLite) s0.k(cls)).getDefaultInstanceForType();
            if (t10 != null) {
                defaultInstanceMap.put(cls, t10);
            } else {
                throw new IllegalStateException();
            }
        }
        return t10;
    }

    static Object invokeOrDie(Method method, Object obj, Object... objArr) {
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

    protected static C9592z.g mutableCopy(C9592z.g gVar) {
        int size = gVar.size();
        return gVar.f(size == 0 ? 10 : size * 2);
    }

    protected static Object newMessageInfo(S s10, String str, Object[] objArr) {
        return new f0(s10, str, objArr);
    }

    protected static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t10, byte[] bArr) {
        return checkMessageInitialized(parsePartialFrom(t10, bArr, 0, bArr.length, C9583p.b()));
    }

    static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, C9576i iVar, C9583p pVar) {
        T newMutableInstance = t10.newMutableInstance();
        try {
            h0 d10 = d0.a().d(newMutableInstance);
            d10.i(newMutableInstance, C9577j.Q(iVar), pVar);
            d10.f(newMutableInstance);
            return newMutableInstance;
        } catch (B e10) {
            e = e10;
            if (e.a()) {
                e = new B((IOException) e);
            }
            throw e.j(newMutableInstance);
        } catch (n0 e11) {
            throw e11.a().j(newMutableInstance);
        } catch (IOException e12) {
            if (e12.getCause() instanceof B) {
                throw ((B) e12.getCause());
            }
            throw new B(e12).j(newMutableInstance);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof B) {
                throw ((B) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t10) {
        t10.markImmutable();
        defaultInstanceMap.put(cls, t10);
    }

    /* access modifiers changed from: package-private */
    public Object buildMessageInfo() {
        return dynamicMethod(f.BUILD_MESSAGE_INFO);
    }

    /* access modifiers changed from: package-private */
    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    /* access modifiers changed from: package-private */
    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    public int computeHashCode() {
        return d0.a().d(this).b(this);
    }

    /* access modifiers changed from: protected */
    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (a) dynamicMethod(f.NEW_BUILDER);
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(f fVar, Object obj) {
        return dynamicMethod(fVar, obj, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object dynamicMethod(f fVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return d0.a().d(this).c(this, (GeneratedMessageLite) obj);
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    /* access modifiers changed from: package-private */
    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public final a0<MessageType> getParserForType() {
        return (a0) dynamicMethod(f.GET_PARSER);
    }

    /* access modifiers changed from: package-private */
    public int getSerializedSize(h0 h0Var) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(h0Var);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + computeSerializedSize);
        } else if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        } else {
            int computeSerializedSize2 = computeSerializedSize(h0Var);
            setMemoizedSerializedSize(computeSerializedSize2);
            return computeSerializedSize2;
        }
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    /* access modifiers changed from: package-private */
    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    /* access modifiers changed from: package-private */
    public boolean isMutable() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    /* access modifiers changed from: protected */
    public void makeImmutable() {
        d0.a().d(this).f(this);
        markImmutable();
    }

    /* access modifiers changed from: package-private */
    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* access modifiers changed from: package-private */
    public MessageType newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(f.NEW_MUTABLE_INSTANCE);
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedHashCode(int i10) {
        this.memoizedHashCode = i10;
    }

    /* access modifiers changed from: package-private */
    public void setMemoizedSerializedSize(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i10);
    }

    public String toString() {
        return U.f(this, super.toString());
    }

    public void writeTo(C9578k kVar) {
        d0.a().d(this).d(this, C9579l.P(kVar));
    }

    protected static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.dynamicMethod(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g10 = d0.a().d(t10).g(t10);
        if (z10) {
            t10.dynamicMethod(f.SET_MEMOIZED_IS_INITIALIZED, g10 ? t10 : null);
        }
        return g10;
    }

    /* access modifiers changed from: protected */
    public Object dynamicMethod(f fVar) {
        return dynamicMethod(fVar, (Object) null, (Object) null);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(f.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (a) dynamicMethod(f.NEW_BUILDER);
    }

    public final BuilderType toBuilder() {
        return ((a) dynamicMethod(f.NEW_BUILDER)).A(this);
    }

    protected static C9592z.h mutableCopy(C9592z.h hVar) {
        int size = hVar.size();
        return hVar.f(size == 0 ? 10 : size * 2);
    }

    protected static <E> C9592z.i<E> mutableCopy(C9592z.i<E> iVar) {
        int size = iVar.size();
        return iVar.f(size == 0 ? 10 : size * 2);
    }

    public int getSerializedSize() {
        return getSerializedSize((h0) null);
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t10, byte[] bArr, int i10, int i11, C9583p pVar) {
        T newMutableInstance = t10.newMutableInstance();
        try {
            h0 d10 = d0.a().d(newMutableInstance);
            d10.j(newMutableInstance, bArr, i10, i10 + i11, new C9572e.b(pVar));
            d10.f(newMutableInstance);
            return newMutableInstance;
        } catch (B e10) {
            e = e10;
            if (e.a()) {
                e = new B((IOException) e);
            }
            throw e.j(newMutableInstance);
        } catch (n0 e11) {
            throw e11.a().j(newMutableInstance);
        } catch (IOException e12) {
            if (e12.getCause() instanceof B) {
                throw ((B) e12.getCause());
            }
            throw new B(e12).j(newMutableInstance);
        } catch (IndexOutOfBoundsException unused) {
            throw B.k().j(newMutableInstance);
        }
    }
}
