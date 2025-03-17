package e1;

import U0.C4889m;
import YH.C16877v;
import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.U;
import tI.C17974j;
import tI.C17978n;

@Metadata(d1 = {"\u00006\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\r\u001a\u0004\u0018\u00010\f*\u0006\u0012\u0002\b\u00030\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f*\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a9\u0010\u0016\u001a\u00020\u000f*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u001a\u0010\u0015\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0014\"\u0006\u0012\u0002\b\u00030\u000b¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"", "realValueParams", "thisParams", "c", "(II)I", "d", "(I)I", "Ljava/lang/reflect/Method;", "Le1/a;", "e", "(Ljava/lang/reflect/Method;)Le1/a;", "Ljava/lang/Class;", "", "g", "(Ljava/lang/Class;)Ljava/lang/Object;", "Le1/b;", "b", "(Ljava/lang/reflect/Method;)Le1/b;", "", "methodName", "", "args", "f", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Le1/b;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: e1.c  reason: case insensitive filesystem */
public final class C5293c {
    public static final C5292b b(Method method) {
        C5291a e10 = e(method);
        if (e10.d()) {
            return new C5292b(method, e10);
        }
        return null;
    }

    private static final int c(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        return (int) Math.ceil(((double) (i10 + i11)) / 10.0d);
    }

    private static final int d(int i10) {
        return (int) Math.ceil(((double) i10) / 31.0d);
    }

    private static final C5291a e(Method method) {
        Class[] parameterTypes = method.getParameterTypes();
        int length = parameterTypes.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                if (C17542s.e(parameterTypes[length], C4889m.class)) {
                    break;
                } else if (i10 < 0) {
                    break;
                } else {
                    length = i10;
                }
            }
        }
        length = -1;
        boolean z10 = false;
        if (length == -1) {
            return new C5291a(false, method.getParameterTypes().length, 0, 0);
        }
        int c10 = c(length, Modifier.isStatic(method.getModifiers()) ^ true ? 1 : 0);
        int i11 = length + 1 + c10;
        int length2 = method.getParameterTypes().length;
        int d10 = length2 != i11 ? d(length) : 0;
        if (i11 + d10 == length2) {
            z10 = true;
        }
        return new C5291a(z10, length, c10, d10);
    }

    public static final C5292b f(Class<?> cls, String str, Class<?>... clsArr) {
        Method method;
        Class<C4889m> cls2 = C4889m.class;
        int c10 = c(clsArr.length, 0);
        try {
            U u10 = new U(3);
            u10.b(clsArr);
            u10.a(cls2);
            Class cls3 = Integer.TYPE;
            C17974j w10 = C17978n.w(0, c10);
            ArrayList arrayList = new ArrayList(C16877v.y(w10, 10));
            Iterator it = w10.iterator();
            while (it.hasNext()) {
                ((YH.U) it).c();
                arrayList.add(cls3);
            }
            u10.b(arrayList.toArray(new Class[0]));
            method = cls.getDeclaredMethod(str, (Class[]) u10.d(new Class[u10.c()]));
        } catch (ReflectiveOperationException unused) {
            int d10 = d(clsArr.length);
            try {
                U u11 = new U(4);
                u11.b(clsArr);
                u11.a(cls2);
                Class cls4 = Integer.TYPE;
                C17974j w11 = C17978n.w(0, c10);
                ArrayList arrayList2 = new ArrayList(C16877v.y(w11, 10));
                Iterator it2 = w11.iterator();
                while (it2.hasNext()) {
                    ((YH.U) it2).c();
                    arrayList2.add(cls4);
                }
                u11.b(arrayList2.toArray(new Class[0]));
                Class cls5 = Integer.TYPE;
                C17974j w12 = C17978n.w(0, d10);
                ArrayList arrayList3 = new ArrayList(C16877v.y(w12, 10));
                Iterator it3 = w12.iterator();
                while (it3.hasNext()) {
                    ((YH.U) it3).c();
                    arrayList3.add(cls5);
                }
                u11.b(arrayList3.toArray(new Class[0]));
                method = cls.getDeclaredMethod(str, (Class[]) u11.d(new Class[u11.c()]));
            } catch (ReflectiveOperationException unused2) {
                method = null;
            }
        }
        if (method != null) {
            C5292b b10 = b(method);
            C17542s.g(b10);
            return b10;
        }
        throw new NoSuchMethodException(cls.getName() + '.' + str);
    }

    /* access modifiers changed from: private */
    public static final Object g(Class<?> cls) {
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
}
