package mI;

import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.internal.C17532h;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import uI.C18055d;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u001b\n\u0002\b\u0004\"-\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00018G¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004\"-\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0004\"+\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00018F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0004\"+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\b*\b\u0012\u0004\u0012\u00028\u00000\u00028G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"'\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\u0000*\u00020\u0010*\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"T", "LuI/d;", "Ljava/lang/Class;", "b", "(LuI/d;)Ljava/lang/Class;", "getJavaClass$annotations", "(LuI/d;)V", "java", "", "d", "javaPrimitiveType", "c", "javaObjectType", "e", "(Ljava/lang/Class;)LuI/d;", "kotlin", "", "a", "(Ljava/lang/annotation/Annotation;)LuI/d;", "annotationClass", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: mI.a  reason: case insensitive filesystem */
public final class C17603a {
    public static final <T extends Annotation> C18055d<? extends T> a(T t10) {
        C17542s.j(t10, "<this>");
        Class<? extends Annotation> annotationType = t10.annotationType();
        C17542s.i(annotationType, "annotationType(...)");
        C18055d<? extends T> e10 = e(annotationType);
        C17542s.h(e10, "null cannot be cast to non-null type kotlin.reflect.KClass<out T of kotlin.jvm.JvmClassMappingKt.<get-annotationClass>>");
        return e10;
    }

    public static final <T> Class<T> b(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        Class<?> l10 = ((C17532h) dVar).l();
        C17542s.h(l10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return l10;
    }

    public static final <T> Class<T> c(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        Class l10 = ((C17532h) dVar).l();
        if (!l10.isPrimitive()) {
            C17542s.h(l10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return l10;
        }
        String name = l10.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals(FeatureVariable.DOUBLE_TYPE)) {
                    l10 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    l10 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    l10 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    l10 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals(Constants.LONG)) {
                    l10 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    l10 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals(FeatureVariable.BOOLEAN_TYPE)) {
                    l10 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    l10 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    l10 = Short.class;
                    break;
                }
                break;
        }
        C17542s.h(l10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return l10;
    }

    public static final <T> Class<T> d(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        Class<?> l10 = ((C17532h) dVar).l();
        if (l10.isPrimitive()) {
            C17542s.h(l10, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaPrimitiveType>>");
            return l10;
        }
        String name = l10.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    public static final <T> C18055d<T> e(Class<T> cls) {
        C17542s.j(cls, "<this>");
        return P.b(cls);
    }
}
