package Z1;

import HJ.C15854t;
import U0.C4889m;
import XH.C16814e;
import YH.C16870n;
import Z1.c;
import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\t\u001a\u00020\b2\u0010\u0010\u0006\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00042\u0010\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u000f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\r\u001a\u00020\f2\u001a\u0010\u000e\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00050\u0004\"\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J9\u0010\u0012\u001a\u0004\u0018\u00010\u000b*\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\r\u001a\u00020\f2\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0019\u001a\u0004\u0018\u00010\u0001*\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J?\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0016\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0004\"\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"LZ1/a;", "", "<init>", "()V", "", "Ljava/lang/Class;", "composableMethodTypes", "previewParameterTypes", "", "a", "([Ljava/lang/Class;[Ljava/lang/Class;)Z", "Ljava/lang/reflect/Method;", "", "methodName", "args", "d", "([Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;", "previewParamArgs", "e", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;", "f", "(Ljava/lang/Class;)Ljava/lang/Object;", "instance", "LU0/m;", "composer", "h", "(Ljava/lang/reflect/Method;Ljava/lang/Object;LU0/m;[Ljava/lang/Object;)Ljava/lang/Object;", "", "realValueParams", "thisParams", "b", "(II)I", "c", "(I)I", "className", "LXH/N;", "g", "(Ljava/lang/String;Ljava/lang/String;LU0/m;[Ljava/lang/Object;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@C16814e
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f14953a = new a();

    private a() {
    }

    private final boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>(clsArr.length);
        int length = clsArr.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= length) {
                break;
            }
            Class<?> cls = clsArr[i10];
            int i12 = i11 + 1;
            Class<?> cls2 = clsArr2[i11];
            if (!C17542s.e(C17603a.e(cls), C17603a.e(cls2)) && !cls.isAssignableFrom(cls2)) {
                z10 = false;
            }
            arrayList.add(Boolean.valueOf(z10));
            i10++;
            i11 = i12;
        }
        if (!arrayList.isEmpty()) {
            for (Boolean booleanValue : arrayList) {
                if (!booleanValue.booleanValue()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final int b(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i10 + i11)) / 10.0d);
    }

    private final int c(int i10) {
        return (int) Math.ceil(((double) i10) / 31.0d);
    }

    private final Method d(Method[] methodArr, String str, Class<?>... clsArr) {
        Method method;
        int length = methodArr.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methodArr[i10];
            if (!C17542s.e(str, method2.getName())) {
                if (!C15854t.W(method2.getName(), str + '-', false, 2, (Object) null)) {
                    continue;
                    i10++;
                }
            }
            if (f14953a.a(method2.getParameterTypes(), (Class[]) Arrays.copyOf(clsArr, clsArr.length))) {
                method = method2;
                break;
            }
            i10++;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodException(str + " not found");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: java.lang.reflect.Method[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.reflect.Method} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Class<?>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.lang.Class<?>} */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:16|17|(1:(2:19|(2:21|(1:32)(1:23))(1:33))(1:31))|24|25|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r8 = r8.getDeclaredMethods();
        r10 = r8.length;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0081, code lost:
        if (r0 < r10) goto L_0x0083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0083, code lost:
        r1 = r8[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (kotlin.jvm.internal.C17542s.e(r1.getName(), r9) == false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        if (HJ.C15854t.W(r1.getName(), r9 + '-', false, 2, (java.lang.Object) null) != false) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ac, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00af, code lost:
        r4 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return r4;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x007b */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.reflect.Method e(java.lang.Class<?> r8, java.lang.String r9, java.lang.Object... r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r10.length
            r2 = 0
            r3 = r2
        L_0x0008:
            r4 = 0
            if (r3 >= r1) goto L_0x001b
            r5 = r10[r3]
            if (r5 == 0) goto L_0x0013
            java.lang.Class r4 = r5.getClass()
        L_0x0013:
            if (r4 == 0) goto L_0x0018
            r0.add(r4)
        L_0x0018:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x001b:
            java.lang.Class[] r10 = new java.lang.Class[r2]
            java.lang.Object[] r10 = r0.toArray(r10)
            java.lang.Class[] r10 = (java.lang.Class[]) r10
            int r0 = r10.length     // Catch:{ ReflectiveOperationException -> 0x007b }
            int r0 = r7.b(r0, r2)     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.Class r1 = java.lang.Integer.TYPE     // Catch:{ ReflectiveOperationException -> 0x007b }
            tI.j r0 = tI.C17978n.w(r2, r0)     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ ReflectiveOperationException -> 0x007b }
            r5 = 10
            int r5 = YH.C16877v.y(r0, r5)     // Catch:{ ReflectiveOperationException -> 0x007b }
            r3.<init>(r5)     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ ReflectiveOperationException -> 0x007b }
        L_0x003d:
            boolean r5 = r0.hasNext()     // Catch:{ ReflectiveOperationException -> 0x007b }
            if (r5 == 0) goto L_0x004d
            r5 = r0
            YH.U r5 = (YH.U) r5     // Catch:{ ReflectiveOperationException -> 0x007b }
            r5.c()     // Catch:{ ReflectiveOperationException -> 0x007b }
            r3.add(r1)     // Catch:{ ReflectiveOperationException -> 0x007b }
            goto L_0x003d
        L_0x004d:
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.reflect.Method[] r1 = r8.getDeclaredMethods()     // Catch:{ ReflectiveOperationException -> 0x007b }
            kotlin.jvm.internal.U r3 = new kotlin.jvm.internal.U     // Catch:{ ReflectiveOperationException -> 0x007b }
            r5 = 3
            r3.<init>(r5)     // Catch:{ ReflectiveOperationException -> 0x007b }
            r3.b(r10)     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.Class<U0.m> r10 = U0.C4889m.class
            r3.a(r10)     // Catch:{ ReflectiveOperationException -> 0x007b }
            r3.b(r0)     // Catch:{ ReflectiveOperationException -> 0x007b }
            int r10 = r3.c()     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.Object[] r10 = r3.d(r10)     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.Class[] r10 = (java.lang.Class[]) r10     // Catch:{ ReflectiveOperationException -> 0x007b }
            java.lang.reflect.Method r8 = r7.d(r1, r9, r10)     // Catch:{ ReflectiveOperationException -> 0x007b }
            goto L_0x00b1
        L_0x007b:
            java.lang.reflect.Method[] r8 = r8.getDeclaredMethods()     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            int r10 = r8.length     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            r0 = r2
        L_0x0081:
            if (r0 >= r10) goto L_0x00b0
            r1 = r8[r0]     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            java.lang.String r3 = r1.getName()     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            boolean r3 = kotlin.jvm.internal.C17542s.e(r3, r9)     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            if (r3 != 0) goto L_0x00af
            java.lang.String r3 = r1.getName()     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            r5.<init>()     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            r5.append(r9)     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            r6 = 45
            r5.append(r6)     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            java.lang.String r5 = r5.toString()     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            r6 = 2
            boolean r3 = HJ.C15854t.W(r3, r5, r2, r6, r4)     // Catch:{ ReflectiveOperationException -> 0x00b0 }
            if (r3 == 0) goto L_0x00ac
            goto L_0x00af
        L_0x00ac:
            int r0 = r0 + 1
            goto L_0x0081
        L_0x00af:
            r4 = r1
        L_0x00b0:
            r8 = r4
        L_0x00b1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Z1.a.e(java.lang.Class, java.lang.String, java.lang.Object[]):java.lang.reflect.Method");
    }

    private final Object f(Class<?> cls) {
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(FeatureVariable.DOUBLE_TYPE)) {
                    return Double.valueOf(0.0d);
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return 0;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return (byte) 0;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return 0;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    return 0L;
                }
                break;
            case 64711720:
                if (name.equals(FeatureVariable.BOOLEAN_TYPE)) {
                    return Boolean.FALSE;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return Float.valueOf(0.0f);
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return (short) 0;
                }
                break;
        }
        return null;
    }

    private final Object h(Method method, Object obj, C4889m mVar, Object... objArr) {
        int i10;
        Class[] parameterTypes = method.getParameterTypes();
        int i11 = -1;
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i12 = length - 1;
                if (C17542s.e(parameterTypes[length], C4889m.class)) {
                    i11 = length;
                    break;
                } else if (i12 < 0) {
                    break;
                } else {
                    length = i12;
                }
            }
        }
        int i13 = i11 + 1;
        int b10 = b(i11, obj != null ? 1 : 0) + i13;
        int length2 = method.getParameterTypes().length;
        if ((length2 != b10 ? c(i11) : 0) + b10 == length2) {
            Object[] objArr2 = new Object[length2];
            int i14 = 0;
            while (i14 < length2) {
                if (i14 >= 0 && i14 < i11) {
                    i10 = (i14 < 0 || i14 > C16870n.n0(objArr)) ? f14953a.f(method.getParameterTypes()[i14]) : objArr[i14];
                } else if (i14 == i11) {
                    i10 = mVar;
                } else if (i13 <= i14 && i14 < b10) {
                    i10 = 0;
                } else if (b10 > i14 || i14 >= length2) {
                    throw new IllegalStateException("Unexpected index");
                } else {
                    i10 = 2097151;
                }
                objArr2[i14] = i10;
                i14++;
            }
            return method.invoke(obj, Arrays.copyOf(objArr2, length2));
        }
        throw new IllegalStateException("params don't add up to total params");
    }

    public final void g(String str, String str2, C4889m mVar, Object... objArr) {
        try {
            Class<?> cls = Class.forName(str);
            Method e10 = e(cls, str2, Arrays.copyOf(objArr, objArr.length));
            if (e10 != null) {
                e10.setAccessible(true);
                if (Modifier.isStatic(e10.getModifiers())) {
                    h(e10, (Object) null, mVar, Arrays.copyOf(objArr, objArr.length));
                } else {
                    h(e10, cls.getConstructor((Class[]) null).newInstance((Object[]) null), mVar, Arrays.copyOf(objArr, objArr.length));
                }
            } else {
                throw new NoSuchMethodException("Composable " + str + '.' + str2 + " not found");
            }
        } catch (Exception e11) {
            c.a aVar = c.f14957a;
            c.a.c(aVar, "Failed to invoke Composable Method '" + str + '.' + str2 + '\'', (Throwable) null, 2, (Object) null);
            throw e11;
        }
    }
}
