package yI;

import XH.C16807N;
import YH.C16870n;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.U;
import yI.C18724h;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u0010*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\b\u0010\u0019\u0014\u0012\"\u001b#\u001eB5\b\u0004\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\u001d8\u0016X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0012\u0010 \u0001\u0007$%&'()*¨\u0006+"}, d2 = {"LyI/i;", "Ljava/lang/reflect/Member;", "M", "LyI/h;", "member", "Ljava/lang/reflect/Type;", "returnType", "Ljava/lang/Class;", "instanceClass", "", "valueParameterTypes", "<init>", "(Ljava/lang/reflect/Member;Ljava/lang/reflect/Type;Ljava/lang/Class;[Ljava/lang/reflect/Type;)V", "", "obj", "LXH/N;", "e", "(Ljava/lang/Object;)V", "a", "Ljava/lang/reflect/Member;", "b", "()Ljava/lang/reflect/Member;", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "c", "Ljava/lang/Class;", "f", "()Ljava/lang/Class;", "", "d", "Ljava/util/List;", "()Ljava/util/List;", "parameterTypes", "h", "g", "LyI/i$a;", "LyI/i$b;", "LyI/i$c;", "LyI/i$e;", "LyI/i$f;", "LyI/i$g;", "LyI/i$h;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: yI.i  reason: case insensitive filesystem */
public abstract class C18725i<M extends Member> implements C18724h<M> {

    /* renamed from: e  reason: collision with root package name */
    public static final d f152722e = new d((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final M f152723a;

    /* renamed from: b  reason: collision with root package name */
    private final Type f152724b;

    /* renamed from: c  reason: collision with root package name */
    private final Class<?> f152725c;

    /* renamed from: d  reason: collision with root package name */
    private final List<Type> f152726d;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u00012\u00020\u0003B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LyI/i$a;", "LyI/i;", "Ljava/lang/reflect/Constructor;", "LyI/g;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.i$a */
    public static final class a extends C18725i<Constructor<?>> implements C18723g {

        /* renamed from: f  reason: collision with root package name */
        private final Object f152727f;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public a(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C17542s.j(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.C17542s.i(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.C17542s.i(r0, r1)
                int r1 = r0.length
                r2 = 2
                if (r1 > r2) goto L_0x001f
                r0 = 0
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r0]
                goto L_0x0026
            L_0x001f:
                int r1 = r0.length
                r2 = 1
                int r1 = r1 - r2
                java.lang.Object[] r0 = YH.C16870n.u(r0, r2, r1)
            L_0x0026:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f152727f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.a.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C17542s.j(objArr, "args");
            d(objArr);
            U u10 = new U(3);
            u10.a(this.f152727f);
            u10.b(objArr);
            u10.a((Object) null);
            return ((Constructor) b()).newInstance(u10.d(new Object[u10.c()]));
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LyI/i$b;", "LyI/i;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.i$b */
    public static final class b extends C18725i<Constructor<?>> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.lang.reflect.Type[]} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.reflect.Type[]} */
        /* JADX WARNING: Illegal instructions before constructor call */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public b(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C17542s.j(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.C17542s.i(r3, r0)
                java.lang.reflect.Type[] r0 = r8.getGenericParameterTypes()
                java.lang.String r1 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.C17542s.i(r0, r1)
                int r1 = r0.length
                r2 = 0
                r4 = 1
                if (r1 > r4) goto L_0x001f
                java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                goto L_0x0025
            L_0x001f:
                int r1 = r0.length
                int r1 = r1 - r4
                java.lang.Object[] r0 = YH.C16870n.u(r0, r2, r1)
            L_0x0025:
                r5 = r0
                java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.b.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C17542s.j(objArr, "args");
            d(objArr);
            U u10 = new U(2);
            u10.b(objArr);
            u10.a((Object) null);
            return ((Constructor) b()).newInstance(u10.d(new Object[u10.c()]));
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002B\u001d\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LyI/i$c;", "LyI/g;", "LyI/i;", "Ljava/lang/reflect/Constructor;", "constructor", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.i$c */
    public static final class c extends C18725i<Constructor<?>> implements C18723g {

        /* renamed from: f  reason: collision with root package name */
        private final Object f152728f;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public c(java.lang.reflect.Constructor<?> r8, java.lang.Object r9) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C17542s.j(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.C17542s.i(r3, r0)
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.C17542s.i(r5, r0)
                r6 = 0
                r4 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                r7.f152728f = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.c.<init>(java.lang.reflect.Constructor, java.lang.Object):void");
        }

        public Object call(Object[] objArr) {
            C17542s.j(objArr, "args");
            d(objArr);
            U u10 = new U(2);
            u10.a(this.f152728f);
            u10.b(objArr);
            return ((Constructor) b()).newInstance(u10.d(new Object[u10.c()]));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\b¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\b¢\u0006\u0004\b\b\u0010\u0007J*\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0006\b\u0001\u0010\u0004\u0018\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0005H\b¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"LyI/i$d;", "", "<init>", "()V", "T", "", "dropFirst", "([Ljava/lang/Object;)[Ljava/lang/Object;", "dropLast", "dropFirstAndLast", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.i$d */
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LyI/i$e;", "LyI/i;", "Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.i$e */
    public static final class e extends C18725i<Constructor<?>> {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public e(java.lang.reflect.Constructor<?> r8) {
            /*
                r7 = this;
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.C17542s.j(r8, r0)
                java.lang.Class r3 = r8.getDeclaringClass()
                java.lang.String r0 = "getDeclaringClass(...)"
                kotlin.jvm.internal.C17542s.i(r3, r0)
                java.lang.Class r0 = r8.getDeclaringClass()
                java.lang.Class r1 = r0.getDeclaringClass()
                if (r1 == 0) goto L_0x0024
                int r0 = r0.getModifiers()
                boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
                if (r0 != 0) goto L_0x0024
                r4 = r1
                goto L_0x0026
            L_0x0024:
                r0 = 0
                r4 = r0
            L_0x0026:
                java.lang.reflect.Type[] r5 = r8.getGenericParameterTypes()
                java.lang.String r0 = "getGenericParameterTypes(...)"
                kotlin.jvm.internal.C17542s.i(r5, r0)
                r6 = 0
                r1 = r7
                r2 = r8
                r1.<init>(r2, r3, r4, r5, r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.e.<init>(java.lang.reflect.Constructor):void");
        }

        public Object call(Object[] objArr) {
            C17542s.j(objArr, "args");
            d(objArr);
            return ((Constructor) b()).newInstance(Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\r\u000e\u000f\u0010\u0011B\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f\u0001\u0005\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017"}, d2 = {"LyI/i$f;", "LyI/i;", "Ljava/lang/reflect/Field;", "field", "", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "e", "c", "d", "a", "b", "LyI/i$f$a;", "LyI/i$f$b;", "LyI/i$f$c;", "LyI/i$f$d;", "LyI/i$f$e;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.i$f */
    public static abstract class f extends C18725i<Field> {

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LyI/i$f$a;", "LyI/g;", "LyI/i$f;", "Ljava/lang/reflect/Field;", "field", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$f$a */
        public static final class a extends f implements C18723g {

            /* renamed from: f  reason: collision with root package name */
            private final Object f152729f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, Object obj) {
                super(field, false, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
                this.f152729f = obj;
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                return ((Field) b()).get(this.f152729f);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LyI/i$f$b;", "LyI/g;", "LyI/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$f$b */
        public static final class b extends f implements C18723g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LyI/i$f$c;", "LyI/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$f$c */
        public static final class c extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LyI/i$f$d;", "LyI/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "args", "LXH/N;", "d", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$f$d */
        public static final class d extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Field field) {
                super(field, true, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
            }

            public void d(Object[] objArr) {
                C17542s.j(objArr, "args");
                C18725i.super.d(objArr);
                e(C16870n.h0(objArr));
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LyI/i$f$e;", "LyI/i$f;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$f$e */
        public static final class e extends f {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Field field) {
                super(field, false, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
            }
        }

        public /* synthetic */ f(Field field, boolean z10, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10);
        }

        public Object call(Object[] objArr) {
            C17542s.j(objArr, "args");
            d(objArr);
            return ((Field) b()).get(f() != null ? C16870n.f0(objArr) : null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private f(java.lang.reflect.Field r7, boolean r8) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericType()
                java.lang.String r0 = "getGenericType(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                if (r8 == 0) goto L_0x0011
                java.lang.Class r8 = r7.getDeclaringClass()
            L_0x000f:
                r3 = r8
                goto L_0x0013
            L_0x0011:
                r8 = 0
                goto L_0x000f
            L_0x0013:
                r8 = 0
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r8]
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.f.<init>(java.lang.reflect.Field, boolean):void");
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0005\u0013\u0014\f\u0015\u0016B!\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0001\u0005\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LyI/i$g;", "LyI/i;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "requiresInstance", "<init>", "(Ljava/lang/reflect/Field;ZZ)V", "", "args", "LXH/N;", "d", "([Ljava/lang/Object;)V", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "f", "Z", "e", "c", "a", "b", "LyI/i$g$a;", "LyI/i$g$b;", "LyI/i$g$c;", "LyI/i$g$d;", "LyI/i$g$e;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.i$g */
    public static abstract class g extends C18725i<Field> {

        /* renamed from: f  reason: collision with root package name */
        private final boolean f152730f;

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LyI/i$g$a;", "LyI/g;", "LyI/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Field;ZLjava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$g$a */
        public static final class a extends g implements C18723g {

            /* renamed from: g  reason: collision with root package name */
            private final Object f152731g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Field field, boolean z10, Object obj) {
                super(field, z10, false, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
                this.f152731g = obj;
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                ((Field) b()).set(this.f152731g, C16870n.f0(objArr));
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LyI/i$g$b;", "LyI/g;", "LyI/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$g$b */
        public static final class b extends g implements C18723g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Field field, boolean z10) {
                super(field, z10, false, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                ((Field) b()).set((Object) null, C16870n.D0(objArr));
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LyI/i$g$c;", "LyI/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$g$c */
        public static final class c extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public c(Field field, boolean z10) {
                super(field, z10, true, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LyI/i$g$d;", "LyI/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "", "args", "LXH/N;", "d", "([Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$g$d */
        public static final class d extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public d(Field field, boolean z10) {
                super(field, z10, true, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
            }

            public void d(Object[] objArr) {
                C17542s.j(objArr, "args");
                super.d(objArr);
                e(C16870n.h0(objArr));
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LyI/i$g$e;", "LyI/i$g;", "Ljava/lang/reflect/Field;", "field", "", "notNull", "<init>", "(Ljava/lang/reflect/Field;Z)V", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$g$e */
        public static final class e extends g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Field field, boolean z10) {
                super(field, z10, false, (DefaultConstructorMarker) null);
                C17542s.j(field, "field");
            }
        }

        public /* synthetic */ g(Field field, boolean z10, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
            this(field, z10, z11);
        }

        public Object call(Object[] objArr) {
            C17542s.j(objArr, "args");
            d(objArr);
            ((Field) b()).set(f() != null ? C16870n.f0(objArr) : null, C16870n.D0(objArr));
            return C16807N.f139792a;
        }

        public void d(Object[] objArr) {
            C17542s.j(objArr, "args");
            C18725i.super.d(objArr);
            if (this.f152730f && C16870n.D0(objArr) == null) {
                throw new IllegalArgumentException("null is not allowed as a value for this property.");
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private g(java.lang.reflect.Field r7, boolean r8, boolean r9) {
            /*
                r6 = this;
                java.lang.Class r2 = java.lang.Void.TYPE
                java.lang.String r0 = "TYPE"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                if (r9 == 0) goto L_0x000f
                java.lang.Class r9 = r7.getDeclaringClass()
            L_0x000d:
                r3 = r9
                goto L_0x0011
            L_0x000f:
                r9 = 0
                goto L_0x000d
            L_0x0011:
                java.lang.reflect.Type r9 = r7.getGenericType()
                r0 = 1
                java.lang.reflect.Type[] r4 = new java.lang.reflect.Type[r0]
                r0 = 0
                r4[r0] = r9
                r5 = 0
                r0 = r6
                r1 = r7
                r0.<init>(r1, r2, r3, r4, r5)
                r6.f152730f = r8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.g.<init>(java.lang.reflect.Field, boolean, boolean):void");
        }
    }

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0007\u000e\u0013\u0010\u0014\u0015\u0016\u0017B+\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0001\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001e¨\u0006\u001f"}, d2 = {"LyI/i$h;", "LyI/i;", "Ljava/lang/reflect/Method;", "method", "", "requiresInstance", "", "Ljava/lang/reflect/Type;", "parameterTypes", "<init>", "(Ljava/lang/reflect/Method;Z[Ljava/lang/reflect/Type;)V", "", "instance", "args", "g", "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "f", "Z", "isVoidMethod", "e", "c", "d", "a", "b", "LyI/i$h$a;", "LyI/i$h$b;", "LyI/i$h$c;", "LyI/i$h$d;", "LyI/i$h$e;", "LyI/i$h$f;", "LyI/i$h$g;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yI.i$h */
    public static abstract class h extends C18725i<Method> {

        /* renamed from: f  reason: collision with root package name */
        private final boolean f152732f;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LyI/i$h$a;", "LyI/g;", "LyI/i$h;", "Ljava/lang/reflect/Method;", "method", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$h$a */
        public static final class a extends h implements C18723g {

            /* renamed from: g  reason: collision with root package name */
            private final Object f152733g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(Method method, Object obj) {
                super(method, false, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C17542s.j(method, "method");
                this.f152733g = obj;
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                return g(this.f152733g, objArr);
            }
        }

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LyI/i$h$b;", "LyI/g;", "LyI/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$h$b */
        public static final class b extends h implements C18723g {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(Method method) {
                super(method, false, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C17542s.j(method, "method");
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                return g((Object) null, objArr);
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"LyI/i$h$c;", "LyI/g;", "LyI/i$h;", "Ljava/lang/reflect/Method;", "method", "", "isCallByToValueClassMangledMethod", "", "boundReceiver", "<init>", "(Ljava/lang/reflect/Method;ZLjava/lang/Object;)V", "", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "Z", "i", "()Z", "h", "Ljava/lang/Object;", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$h$c */
        public static final class c extends h implements C18723g {

            /* renamed from: g  reason: collision with root package name */
            private final boolean f152734g;

            /* renamed from: h  reason: collision with root package name */
            private final Object f152735h;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public c(java.lang.reflect.Method r5, boolean r6, java.lang.Object r7) {
                /*
                    r4 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.C17542s.j(r5, r0)
                    java.lang.reflect.Type[] r0 = r5.getGenericParameterTypes()
                    java.lang.String r1 = "getGenericParameterTypes(...)"
                    kotlin.jvm.internal.C17542s.i(r0, r1)
                    int r1 = r0.length
                    r2 = 0
                    r3 = 1
                    if (r1 > r3) goto L_0x0016
                    java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
                    goto L_0x001b
                L_0x0016:
                    int r1 = r0.length
                    java.lang.Object[] r0 = YH.C16870n.u(r0, r3, r1)
                L_0x001b:
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r1 = 0
                    r4.<init>(r5, r2, r0, r1)
                    r4.f152734g = r6
                    r4.f152735h = r7
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.h.c.<init>(java.lang.reflect.Method, boolean, java.lang.Object):void");
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                U u10 = new U(2);
                u10.a(this.f152735h);
                u10.b(objArr);
                return g((Object) null, u10.d(new Object[u10.c()]));
            }

            public final Object h() {
                return this.f152735h;
            }

            public final boolean i() {
                return this.f152734g;
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"LyI/i$h$d;", "LyI/g;", "LyI/i$h;", "Ljava/lang/reflect/Method;", "method", "", "", "boundReceiverComponents", "<init>", "(Ljava/lang/reflect/Method;[Ljava/lang/Object;)V", "args", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "g", "[Ljava/lang/Object;", "h", "()[Ljava/lang/Object;", "", "i", "()I", "receiverComponentsCount", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$h$d */
        public static final class d extends h implements C18723g {

            /* renamed from: g  reason: collision with root package name */
            private final Object[] f152736g;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public d(java.lang.reflect.Method r4, java.lang.Object[] r5) {
                /*
                    r3 = this;
                    java.lang.String r0 = "method"
                    kotlin.jvm.internal.C17542s.j(r4, r0)
                    java.lang.String r0 = "boundReceiverComponents"
                    kotlin.jvm.internal.C17542s.j(r5, r0)
                    java.lang.reflect.Type[] r0 = r4.getGenericParameterTypes()
                    java.lang.String r1 = "getGenericParameterTypes(...)"
                    kotlin.jvm.internal.C17542s.i(r0, r1)
                    int r1 = r5.length
                    java.util.List r0 = YH.C16870n.c0(r0, r1)
                    java.util.Collection r0 = (java.util.Collection) r0
                    r1 = 0
                    java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r1]
                    java.lang.Object[] r0 = r0.toArray(r2)
                    java.lang.reflect.Type[] r0 = (java.lang.reflect.Type[]) r0
                    r2 = 0
                    r3.<init>(r4, r1, r0, r2)
                    r3.f152736g = r5
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.h.d.<init>(java.lang.reflect.Method, java.lang.Object[]):void");
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                U u10 = new U(2);
                u10.b(this.f152736g);
                u10.b(objArr);
                return g((Object) null, u10.d(new Object[u10.c()]));
            }

            public final Object[] h() {
                return this.f152736g;
            }

            public final int i() {
                return this.f152736g.length;
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LyI/i$h$e;", "LyI/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$h$e */
        public static final class e extends h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public e(Method method) {
                super(method, false, (Type[]) null, 6, (DefaultConstructorMarker) null);
                C17542s.j(method, "method");
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                return g(objArr[0], objArr.length <= 1 ? new Object[0] : C16870n.u(objArr, 1, objArr.length));
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LyI/i$h$f;", "LyI/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$h$f */
        public static final class f extends h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public f(Method method) {
                super(method, true, (Type[]) null, 4, (DefaultConstructorMarker) null);
                C17542s.j(method, "method");
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                e(C16870n.h0(objArr));
                return g((Object) null, objArr.length <= 1 ? new Object[0] : C16870n.u(objArr, 1, objArr.length));
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\t\u001a\u0004\u0018\u00010\b2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LyI/i$h$g;", "LyI/i$h;", "Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
        /* renamed from: yI.i$h$g */
        public static final class g extends h {
            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public g(Method method) {
                super(method, false, (Type[]) null, 6, (DefaultConstructorMarker) null);
                C17542s.j(method, "method");
            }

            public Object call(Object[] objArr) {
                C17542s.j(objArr, "args");
                d(objArr);
                return g((Object) null, objArr);
            }
        }

        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, z10, typeArr);
        }

        /* access modifiers changed from: protected */
        public final Object g(Object obj, Object[] objArr) {
            C17542s.j(objArr, "args");
            return this.f152732f ? C16807N.f139792a : ((Method) b()).invoke(obj, Arrays.copyOf(objArr, objArr.length));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ h(Method method, boolean z10, Type[] typeArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(method, (i10 & 2) != 0 ? !Modifier.isStatic(method.getModifiers()) : z10, (i10 & 4) != 0 ? method.getGenericParameterTypes() : typeArr, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private h(java.lang.reflect.Method r7, boolean r8, java.lang.reflect.Type[] r9) {
            /*
                r6 = this;
                java.lang.reflect.Type r2 = r7.getGenericReturnType()
                java.lang.String r0 = "getGenericReturnType(...)"
                kotlin.jvm.internal.C17542s.i(r2, r0)
                if (r8 == 0) goto L_0x0011
                java.lang.Class r8 = r7.getDeclaringClass()
            L_0x000f:
                r3 = r8
                goto L_0x0013
            L_0x0011:
                r8 = 0
                goto L_0x000f
            L_0x0013:
                r5 = 0
                r0 = r6
                r1 = r7
                r4 = r9
                r0.<init>(r1, r2, r3, r4, r5)
                java.lang.reflect.Type r7 = r6.getReturnType()
                java.lang.Class r8 = java.lang.Void.TYPE
                boolean r7 = kotlin.jvm.internal.C17542s.e(r7, r8)
                r6.f152732f = r7
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.h.<init>(java.lang.reflect.Method, boolean, java.lang.reflect.Type[]):void");
        }
    }

    public /* synthetic */ C18725i(Member member, Type type, Class cls, Type[] typeArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(member, type, cls, typeArr);
    }

    public List<Type> a() {
        return this.f152726d;
    }

    public final M b() {
        return this.f152723a;
    }

    public boolean c() {
        return C18724h.a.b(this);
    }

    public void d(Object[] objArr) {
        C18724h.a.a(this, objArr);
    }

    /* access modifiers changed from: protected */
    public final void e(Object obj) {
        if (obj == null || !this.f152723a.getDeclaringClass().isInstance(obj)) {
            throw new IllegalArgumentException("An object member requires the object instance passed as the first argument.");
        }
    }

    public final Class<?> f() {
        return this.f152725c;
    }

    public final Type getReturnType() {
        return this.f152724b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0025, code lost:
        if (r1 == null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C18725i(M r1, java.lang.reflect.Type r2, java.lang.Class<?> r3, java.lang.reflect.Type[] r4) {
        /*
            r0 = this;
            r0.<init>()
            r0.f152723a = r1
            r0.f152724b = r2
            r0.f152725c = r3
            if (r3 == 0) goto L_0x0027
            kotlin.jvm.internal.U r1 = new kotlin.jvm.internal.U
            r2 = 2
            r1.<init>(r2)
            r1.a(r3)
            r1.b(r4)
            int r2 = r1.c()
            java.lang.reflect.Type[] r2 = new java.lang.reflect.Type[r2]
            java.lang.Object[] r1 = r1.d(r2)
            java.util.List r1 = YH.C16877v.q(r1)
            if (r1 != 0) goto L_0x002b
        L_0x0027:
            java.util.List r1 = YH.C16870n.c1(r4)
        L_0x002b:
            r0.f152726d = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yI.C18725i.<init>(java.lang.reflect.Member, java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type[]):void");
    }
}
