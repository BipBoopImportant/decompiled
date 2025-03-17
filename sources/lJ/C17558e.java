package lJ;

import AI.C15432m;
import cJ.C17066c;
import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: lJ.e  reason: case insensitive filesystem */
public enum C17558e {
    BOOLEAN(C15432m.BOOLEAN, FeatureVariable.BOOLEAN_TYPE, "Z", "java.lang.Boolean"),
    CHAR(C15432m.CHAR, "char", "C", "java.lang.Character"),
    BYTE(C15432m.BYTE, "byte", "B", "java.lang.Byte"),
    SHORT(C15432m.SHORT, "short", "S", "java.lang.Short"),
    INT(C15432m.INT, "int", "I", "java.lang.Integer"),
    FLOAT(C15432m.FLOAT, "float", "F", "java.lang.Float"),
    LONG(C15432m.LONG, Constants.LONG, "J", "java.lang.Long"),
    DOUBLE(C15432m.DOUBLE, FeatureVariable.DOUBLE_TYPE, "D", "java.lang.Double");
    
    private static final Map<String, String> OWNER_TO_BOXING_METHOD_DESCRIPTOR = null;
    private static final Map<String, C17558e> TYPE_BY_DESC = null;
    private static final Map<String, C17558e> TYPE_BY_NAME = null;
    private static final Map<C15432m, C17558e> TYPE_BY_PRIMITIVE_TYPE = null;
    private static final Set<String> WRAPPER_CLASS_INTERNAL_NAMES = null;
    private final String desc;
    private final String name;
    private final C15432m primitiveType;
    private final C17066c wrapperFqName;

    static {
        TYPE_BY_NAME = new HashMap();
        TYPE_BY_PRIMITIVE_TYPE = new EnumMap(C15432m.class);
        TYPE_BY_DESC = new HashMap();
        WRAPPER_CLASS_INTERNAL_NAMES = new HashSet();
        OWNER_TO_BOXING_METHOD_DESCRIPTOR = new HashMap();
        for (C17558e eVar : values()) {
            TYPE_BY_NAME.put(eVar.n(), eVar);
            TYPE_BY_PRIMITIVE_TYPE.put(eVar.v(), eVar);
            TYPE_BY_DESC.put(eVar.m(), eVar);
            String replace = eVar.wrapperFqName.a().replace('.', '/');
            WRAPPER_CLASS_INTERNAL_NAMES.add(replace);
            OWNER_TO_BOXING_METHOD_DESCRIPTOR.put(replace, "(" + eVar.desc + ")L" + replace + ";");
        }
    }

    private C17558e(C15432m mVar, String str, String str2, String str3) {
        if (mVar == null) {
            a(8);
        }
        if (str == null) {
            a(9);
        }
        if (str2 == null) {
            a(10);
        }
        if (str3 == null) {
            a(11);
        }
        this.primitiveType = mVar;
        this.name = str;
        this.desc = str2;
        this.wrapperFqName = new C17066c(str3);
    }

    public static C17558e b(C15432m mVar) {
        if (mVar == null) {
            a(5);
        }
        C17558e eVar = TYPE_BY_PRIMITIVE_TYPE.get(mVar);
        if (eVar == null) {
            a(6);
        }
        return eVar;
    }

    public static C17558e j(String str) {
        if (str == null) {
            a(3);
        }
        C17558e eVar = TYPE_BY_NAME.get(str);
        if (eVar != null) {
            return eVar;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public C17066c B() {
        C17066c cVar = this.wrapperFqName;
        if (cVar == null) {
            a(15);
        }
        return cVar;
    }

    public String m() {
        String str = this.desc;
        if (str == null) {
            a(14);
        }
        return str;
    }

    public String n() {
        String str = this.name;
        if (str == null) {
            a(13);
        }
        return str;
    }

    public C15432m v() {
        C15432m mVar = this.primitiveType;
        if (mVar == null) {
            a(12);
        }
        return mVar;
    }
}
