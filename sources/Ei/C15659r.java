package EI;

import XH.C16796C;
import YH.C16877v;
import YH.X;
import fI.C17220a;
import fI.C17221b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: EI.r  reason: case insensitive filesystem */
public enum C15659r {
    CLASS("class", false, 2, (boolean) null),
    ANNOTATION_CLASS("annotation class", false, 2, (boolean) null),
    TYPE_PARAMETER("type parameter", false),
    PROPERTY("property", false, 2, (boolean) null),
    FIELD("field", false, 2, (boolean) null),
    LOCAL_VARIABLE("local variable", false, 2, (boolean) null),
    VALUE_PARAMETER("value parameter", false, 2, (boolean) null),
    CONSTRUCTOR("constructor", false, 2, (boolean) null),
    FUNCTION("function", false, 2, (boolean) null),
    PROPERTY_GETTER("getter", false, 2, (boolean) null),
    PROPERTY_SETTER("setter", false, 2, (boolean) null),
    TYPE("type usage", false),
    EXPRESSION("expression", false),
    FILE("file", false),
    TYPEALIAS("typealias", false),
    TYPE_PROJECTION("type projection", false),
    STAR_PROJECTION("star projection", false),
    PROPERTY_PARAMETER("property constructor parameter", false),
    CLASS_ONLY("class", false),
    OBJECT("object", false),
    STANDALONE_OBJECT("standalone object", false),
    COMPANION_OBJECT("companion object", false),
    INTERFACE("interface", false),
    ENUM_CLASS("enum class", false),
    ENUM_ENTRY("enum entry", false),
    LOCAL_CLASS("local class", false),
    LOCAL_FUNCTION("local function", false),
    MEMBER_FUNCTION("member function", false),
    TOP_LEVEL_FUNCTION("top level function", false),
    MEMBER_PROPERTY("member property", false),
    MEMBER_PROPERTY_WITH_BACKING_FIELD("member property with backing field", false),
    MEMBER_PROPERTY_WITH_DELEGATE("member property with delegate", false),
    MEMBER_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("member property without backing field or delegate", false),
    TOP_LEVEL_PROPERTY("top level property", false),
    TOP_LEVEL_PROPERTY_WITH_BACKING_FIELD("top level property with backing field", false),
    TOP_LEVEL_PROPERTY_WITH_DELEGATE("top level property with delegate", false),
    TOP_LEVEL_PROPERTY_WITHOUT_FIELD_OR_DELEGATE("top level property without backing field or delegate", false),
    BACKING_FIELD("backing field", false, 2, (boolean) null),
    INITIALIZER("initializer", false),
    DESTRUCTURING_DECLARATION("destructuring declaration", false),
    LAMBDA_EXPRESSION("lambda expression", false),
    ANONYMOUS_FUNCTION("anonymous function", false),
    OBJECT_LITERAL("object literal", false);
    
    private static final Set<C15659r> ALL_TARGET_SET = null;
    private static final List<C15659r> ANNOTATION_CLASS_LIST = null;
    private static final List<C15659r> CLASS_LIST = null;
    private static final List<C15659r> COMPANION_OBJECT_LIST = null;
    public static final a Companion = null;
    private static final Set<C15659r> DEFAULT_TARGET_SET = null;
    private static final List<C15659r> ENUM_ENTRY_LIST = null;
    private static final List<C15659r> ENUM_LIST = null;
    private static final List<C15659r> FILE_LIST = null;
    private static final List<C15659r> FUNCTION_LIST = null;
    private static final List<C15659r> INTERFACE_LIST = null;
    private static final List<C15659r> LOCAL_CLASS_LIST = null;
    private static final List<C15659r> OBJECT_LIST = null;
    private static final List<C15659r> PROPERTY_GETTER_LIST = null;
    private static final List<C15659r> PROPERTY_SETTER_LIST = null;
    private static final Map<C15646e, C15659r> USE_SITE_MAPPING = null;
    private static final HashMap<String, C15659r> map = null;
    private final String description;
    private final boolean isDefault;

    /* renamed from: EI.r$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        C15659r[] a10;
        $ENTRIES = C17221b.a(a10);
        Companion = new a((DefaultConstructorMarker) null);
        map = new HashMap<>();
        for (C15659r next : b()) {
            map.put(next.name(), next);
        }
        C17220a<C15659r> b10 = b();
        ArrayList arrayList = new ArrayList();
        for (T next2 : b10) {
            if (((C15659r) next2).isDefault) {
                arrayList.add(next2);
            }
        }
        DEFAULT_TARGET_SET = C16877v.y1(arrayList);
        ALL_TARGET_SET = C16877v.y1(b());
        C15659r rVar = ANNOTATION_CLASS;
        C15659r rVar2 = CLASS;
        ANNOTATION_CLASS_LIST = C16877v.q(rVar, rVar2);
        LOCAL_CLASS_LIST = C16877v.q(LOCAL_CLASS, rVar2);
        CLASS_LIST = C16877v.q(CLASS_ONLY, rVar2);
        C15659r rVar3 = COMPANION_OBJECT;
        C15659r rVar4 = OBJECT;
        COMPANION_OBJECT_LIST = C16877v.q(rVar3, rVar4, rVar2);
        OBJECT_LIST = C16877v.q(STANDALONE_OBJECT, rVar4, rVar2);
        INTERFACE_LIST = C16877v.q(INTERFACE, rVar2);
        ENUM_LIST = C16877v.q(ENUM_CLASS, rVar2);
        C15659r rVar5 = ENUM_ENTRY;
        C15659r rVar6 = PROPERTY;
        C15659r rVar7 = FIELD;
        ENUM_ENTRY_LIST = C16877v.q(rVar5, rVar6, rVar7);
        C15659r rVar8 = PROPERTY_SETTER;
        PROPERTY_SETTER_LIST = C16877v.e(rVar8);
        C15659r rVar9 = PROPERTY_GETTER;
        PROPERTY_GETTER_LIST = C16877v.e(rVar9);
        FUNCTION_LIST = C16877v.e(FUNCTION);
        C15659r rVar10 = FILE;
        FILE_LIST = C16877v.e(rVar10);
        C15646e eVar = C15646e.CONSTRUCTOR_PARAMETER;
        C15659r rVar11 = VALUE_PARAMETER;
        USE_SITE_MAPPING = X.m(C16796C.a(eVar, rVar11), C16796C.a(C15646e.FIELD, rVar7), C16796C.a(C15646e.PROPERTY, rVar6), C16796C.a(C15646e.FILE, rVar10), C16796C.a(C15646e.PROPERTY_GETTER, rVar9), C16796C.a(C15646e.PROPERTY_SETTER, rVar8), C16796C.a(C15646e.RECEIVER, rVar11), C16796C.a(C15646e.SETTER_PARAMETER, rVar11), C16796C.a(C15646e.PROPERTY_DELEGATE_FIELD, rVar7));
    }

    private C15659r(String str, boolean z10) {
        this.description = str;
        this.isDefault = z10;
    }

    public static C17220a<C15659r> b() {
        return $ENTRIES;
    }
}
