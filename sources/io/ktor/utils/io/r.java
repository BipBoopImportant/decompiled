package io.ktor.utils.io;

import XH.x;
import XH.y;
import bI.C17035a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import mI.C17603a;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\"\u0010\u0012\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\f2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0010¢\u0006\u0004\b\u0012\u0010\u0010\"\u0014\u0010\u0014\u001a\u00020\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013\"\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016\":\u0010\u001b\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\f\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\bj\u0002`\t0\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a*(\b\u0002\u0010\u001c\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b2\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b¨\u0006\u001d"}, d2 = {"", "E", "exception", "cause", "e", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/reflect/Constructor;", "constructor", "Lkotlin/Function1;", "Lio/ktor/utils/io/Ctor;", "a", "(Ljava/lang/reflect/Constructor;)LnI/l;", "Ljava/lang/Class;", "", "defaultValue", "d", "(Ljava/lang/Class;I)I", "accumulator", "b", "I", "throwableFields", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "exceptionCtors", "Ctor", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final int f143836a = d(Throwable.class, -1);

    /* renamed from: b  reason: collision with root package name */
    private static final ReentrantReadWriteLock f143837b = new ReentrantReadWriteLock();

    /* renamed from: c  reason: collision with root package name */
    private static final WeakHashMap<Class<? extends Throwable>, C17642l<Throwable, Throwable>> f143838c = new WeakHashMap<>();

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends C17544u implements C17642l<Throwable, Throwable> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Constructor f143839c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f143839c = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object obj;
            C17542s.j(th2, "e");
            try {
                x.a aVar = x.f139812b;
                Object newInstance = this.f143839c.newInstance(new Object[]{th2.getMessage(), th2});
                C17542s.h(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                obj = x.b((Throwable) newInstance);
            } catch (Throwable th3) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th3));
            }
            if (x.g(obj)) {
                obj = null;
            }
            return (Throwable) obj;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    public static final class b extends C17544u implements C17642l<Throwable, Throwable> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Constructor f143840c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f143840c = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object obj;
            C17542s.j(th2, "e");
            try {
                x.a aVar = x.f139812b;
                Object newInstance = this.f143840c.newInstance(new Object[]{th2});
                C17542s.h(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                obj = x.b((Throwable) newInstance);
            } catch (Throwable th3) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th3));
            }
            if (x.g(obj)) {
                obj = null;
            }
            return (Throwable) obj;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    public static final class c extends C17544u implements C17642l<Throwable, Throwable> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Constructor f143841c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f143841c = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object obj;
            C17542s.j(th2, "e");
            try {
                x.a aVar = x.f139812b;
                Object newInstance = this.f143841c.newInstance(new Object[]{th2.getMessage()});
                C17542s.h(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th3 = (Throwable) newInstance;
                th3.initCause(th2);
                obj = x.b(th3);
            } catch (Throwable th4) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th4));
            }
            if (x.g(obj)) {
                obj = null;
            }
            return (Throwable) obj;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "e", "a", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 8, 0})
    public static final class d extends C17544u implements C17642l<Throwable, Throwable> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Constructor f143842c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f143842c = constructor;
        }

        /* renamed from: a */
        public final Throwable invoke(Throwable th2) {
            Object obj;
            C17542s.j(th2, "e");
            Throwable th3 = null;
            try {
                x.a aVar = x.f139812b;
                Object newInstance = this.f143842c.newInstance((Object[]) null);
                C17542s.h(newInstance, "null cannot be cast to non-null type kotlin.Throwable");
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                obj = x.b(th4);
            } catch (Throwable th5) {
                x.a aVar2 = x.f139812b;
                obj = x.b(y.a(th5));
            }
            if (!x.g(obj)) {
                th3 = obj;
            }
            return th3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class e<T> implements Comparator {
        public final int compare(T t10, T t11) {
            return C17035a.e(Integer.valueOf(((Constructor) t11).getParameterTypes().length), Integer.valueOf(((Constructor) t10).getParameterTypes().length));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class f extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final f f143843c = new f();

        f() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th2) {
            C17542s.j(th2, "it");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "E", "it", "", "a", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0})
    static final class g extends C17544u implements C17642l {

        /* renamed from: c  reason: collision with root package name */
        public static final g f143844c = new g();

        g() {
            super(1);
        }

        /* renamed from: a */
        public final Void invoke(Throwable th2) {
            C17542s.j(th2, "it");
            return null;
        }
    }

    private static final C17642l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length == 0) {
            return new d(constructor);
        }
        Class<Throwable> cls = Throwable.class;
        Class<String> cls2 = String.class;
        if (length == 1) {
            Class cls3 = parameterTypes[0];
            if (C17542s.e(cls3, cls)) {
                return new b(constructor);
            }
            if (C17542s.e(cls3, cls2)) {
                return new c(constructor);
            }
            return null;
        } else if (length == 2 && C17542s.e(parameterTypes[0], cls2) && C17542s.e(parameterTypes[1], cls)) {
            return new a(constructor);
        } else {
            return null;
        }
    }

    private static final int b(Class<?> cls, int i10) {
        Class<? super Object> superclass;
        do {
            Field[] declaredFields = r5.getDeclaredFields();
            C17542s.i(declaredFields, "declaredFields");
            int i11 = 0;
            Class<? super Object> cls2 = cls;
            for (Field modifiers : declaredFields) {
                if (!Modifier.isStatic(modifiers.getModifiers())) {
                    i11++;
                }
            }
            i10 += i11;
            superclass = cls2.getSuperclass();
            cls2 = superclass;
        } while (superclass != null);
        return i10;
    }

    static /* synthetic */ int c(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return b(cls, i10);
    }

    private static final int d(Class<?> cls, int i10) {
        Integer num;
        C17603a.e(cls);
        try {
            x.a aVar = x.f139812b;
            num = x.b(Integer.valueOf(c(cls, 0, 1, (Object) null)));
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            num = x.b(y.a(th2));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (x.g(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static final <E extends java.lang.Throwable> E e(E r8, java.lang.Throwable r9) {
        /*
            java.lang.String r0 = "exception"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            java.lang.String r0 = "cause"
            kotlin.jvm.internal.C17542s.j(r9, r0)
            boolean r0 = r8 instanceof QJ.C16289G
            r1 = 0
            if (r0 == 0) goto L_0x0032
            XH.x$a r9 = XH.x.f139812b     // Catch:{ all -> 0x001c }
            QJ.G r8 = (QJ.C16289G) r8     // Catch:{ all -> 0x001c }
            java.lang.Throwable r8 = r8.a()     // Catch:{ all -> 0x001c }
            java.lang.Object r8 = XH.x.b(r8)     // Catch:{ all -> 0x001c }
            goto L_0x0027
        L_0x001c:
            r8 = move-exception
            XH.x$a r9 = XH.x.f139812b
            java.lang.Object r8 = XH.y.a(r8)
            java.lang.Object r8 = XH.x.b(r8)
        L_0x0027:
            boolean r9 = XH.x.g(r8)
            if (r9 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r1 = r8
        L_0x002f:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L_0x0032:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f143837b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, nI.l<java.lang.Throwable, java.lang.Throwable>> r3 = f143838c     // Catch:{ all -> 0x012e }
            java.lang.Class r4 = r8.getClass()     // Catch:{ all -> 0x012e }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x012e }
            nI.l r3 = (nI.C17642l) r3     // Catch:{ all -> 0x012e }
            r2.unlock()
            if (r3 == 0) goto L_0x0053
            java.lang.Object r8 = r3.invoke(r8)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            return r8
        L_0x0053:
            int r2 = f143836a
            java.lang.Class r3 = r8.getClass()
            r4 = 0
            int r3 = d(r3, r4)
            if (r2 == r3) goto L_0x00a6
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r0.readLock()
            int r2 = r0.getWriteHoldCount()
            if (r2 != 0) goto L_0x006f
            int r2 = r0.getReadHoldCount()
            goto L_0x0070
        L_0x006f:
            r2 = r4
        L_0x0070:
            r3 = r4
        L_0x0071:
            if (r3 >= r2) goto L_0x0079
            r9.unlock()
            int r3 = r3 + 1
            goto L_0x0071
        L_0x0079:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, nI.l<java.lang.Throwable, java.lang.Throwable>> r3 = f143838c     // Catch:{ all -> 0x0099 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x0099 }
            io.ktor.utils.io.r$f r5 = io.ktor.utils.io.r.f.f143843c     // Catch:{ all -> 0x0099 }
            r3.put(r8, r5)     // Catch:{ all -> 0x0099 }
            XH.N r8 = XH.C16807N.f139792a     // Catch:{ all -> 0x0099 }
        L_0x008d:
            if (r4 >= r2) goto L_0x0095
            r9.lock()
            int r4 = r4 + 1
            goto L_0x008d
        L_0x0095:
            r0.unlock()
            return r1
        L_0x0099:
            r8 = move-exception
        L_0x009a:
            if (r4 >= r2) goto L_0x00a2
            r9.lock()
            int r4 = r4 + 1
            goto L_0x009a
        L_0x00a2:
            r0.unlock()
            throw r8
        L_0x00a6:
            java.lang.Class r0 = r8.getClass()
            java.lang.reflect.Constructor[] r0 = r0.getConstructors()
            java.lang.String r2 = "exception.javaClass.constructors"
            kotlin.jvm.internal.C17542s.i(r0, r2)
            io.ktor.utils.io.r$e r2 = new io.ktor.utils.io.r$e
            r2.<init>()
            java.util.List r0 = YH.C16870n.S0(r0, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L_0x00c1:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00d8
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2
            java.lang.String r3 = "constructor"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            nI.l r2 = a(r2)
            if (r2 == 0) goto L_0x00c1
        L_0x00d8:
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = f143837b
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r0.readLock()
            int r5 = r0.getWriteHoldCount()
            if (r5 != 0) goto L_0x00e9
            int r5 = r0.getReadHoldCount()
            goto L_0x00ea
        L_0x00e9:
            r5 = r4
        L_0x00ea:
            r6 = r4
        L_0x00eb:
            if (r6 >= r5) goto L_0x00f3
            r3.unlock()
            int r6 = r6 + 1
            goto L_0x00eb
        L_0x00f3:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r0.writeLock()
            r0.lock()
            java.util.WeakHashMap<java.lang.Class<? extends java.lang.Throwable>, nI.l<java.lang.Throwable, java.lang.Throwable>> r6 = f143838c     // Catch:{ all -> 0x0105 }
            java.lang.Class r8 = r8.getClass()     // Catch:{ all -> 0x0105 }
            if (r2 != 0) goto L_0x0107
            io.ktor.utils.io.r$g r7 = io.ktor.utils.io.r.g.f143844c     // Catch:{ all -> 0x0105 }
            goto L_0x0108
        L_0x0105:
            r8 = move-exception
            goto L_0x0122
        L_0x0107:
            r7 = r2
        L_0x0108:
            r6.put(r8, r7)     // Catch:{ all -> 0x0105 }
            XH.N r8 = XH.C16807N.f139792a     // Catch:{ all -> 0x0105 }
        L_0x010d:
            if (r4 >= r5) goto L_0x0115
            r3.lock()
            int r4 = r4 + 1
            goto L_0x010d
        L_0x0115:
            r0.unlock()
            if (r2 == 0) goto L_0x0121
            java.lang.Object r8 = r2.invoke(r9)
            r1 = r8
            java.lang.Throwable r1 = (java.lang.Throwable) r1
        L_0x0121:
            return r1
        L_0x0122:
            if (r4 >= r5) goto L_0x012a
            r3.lock()
            int r4 = r4 + 1
            goto L_0x0122
        L_0x012a:
            r0.unlock()
            throw r8
        L_0x012e:
            r8 = move-exception
            r2.unlock()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: io.ktor.utils.io.r.e(java.lang.Throwable, java.lang.Throwable):java.lang.Throwable");
    }
}
