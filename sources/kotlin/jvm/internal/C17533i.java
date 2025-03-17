package kotlin.jvm.internal;

import HJ.C15854t;
import XH.C16796C;
import XH.C16818i;
import XH.C16820k;
import YH.C16877v;
import YH.X;
import com.adjust.sdk.Constants;
import com.optimizely.ab.config.FeatureVariable;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import mI.C17603a;
import mI.C17605c;
import nI.C17631a;
import nI.C17632b;
import nI.C17633c;
import nI.C17634d;
import nI.C17635e;
import nI.C17636f;
import nI.C17637g;
import nI.C17638h;
import nI.C17639i;
import nI.C17640j;
import nI.C17641k;
import nI.C17642l;
import nI.C17643m;
import nI.C17644n;
import nI.C17645o;
import nI.p;
import nI.q;
import nI.r;
import nI.s;
import nI.t;
import nI.u;
import nI.v;
import nI.w;
import uI.C18055d;
import uI.C18068q;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0017B\u0013\u0012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0016R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0016R\u001e\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8VX\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R \u0010.\u001a\b\u0012\u0004\u0012\u00020+0#8VX\u0004¢\u0006\f\u0012\u0004\b,\u0010-\u001a\u0004\b\u0017\u0010&R(\u00101\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010#8VX\u0004¢\u0006\f\u0012\u0004\b0\u0010-\u001a\u0004\b/\u0010&R\u001a\u00102\u001a\u00020\f8VX\u0004¢\u0006\f\u0012\u0004\b4\u0010-\u001a\u0004\b2\u00103R\u001a\u00107\u001a\u00020\f8VX\u0004¢\u0006\f\u0012\u0004\b6\u0010-\u001a\u0004\b5\u00103R\u001a\u0010:\u001a\u00020\f8VX\u0004¢\u0006\f\u0012\u0004\b9\u0010-\u001a\u0004\b8\u00103R\u001a\u0010=\u001a\u00020\f8VX\u0004¢\u0006\f\u0012\u0004\b<\u0010-\u001a\u0004\b;\u00103¨\u0006?"}, d2 = {"Lkotlin/jvm/internal/i;", "LuI/d;", "", "Lkotlin/jvm/internal/h;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "", "y", "()Ljava/lang/Void;", "value", "", "s", "(Ljava/lang/Object;)Z", "other", "equals", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Class;", "l", "()Ljava/lang/Class;", "f", "simpleName", "u", "qualifiedName", "", "j", "()Ljava/util/Collection;", "nestedClasses", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "p", "()Ljava/lang/Object;", "objectInstance", "LuI/q;", "getSupertypes$annotations", "()V", "supertypes", "m", "getSealedSubclasses$annotations", "sealedSubclasses", "isAbstract", "()Z", "isAbstract$annotations", "c", "isSealed$annotations", "isSealed", "n", "isInner$annotations", "isInner", "v", "isValue$annotations", "isValue", "b", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kotlin.jvm.internal.i  reason: case insensitive filesystem */
public final class C17533i implements C18055d<Object>, C17532h {

    /* renamed from: b  reason: collision with root package name */
    public static final a f144376b = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final Map<Class<? extends C16818i<?>>, Integer> f144377c;

    /* renamed from: d  reason: collision with root package name */
    private static final HashMap<String, String> f144378d;

    /* renamed from: e  reason: collision with root package name */
    private static final HashMap<String, String> f144379e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap<String, String> f144380f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final Map<String, String> f144381g;

    /* renamed from: a  reason: collision with root package name */
    private final Class<?> f144382a;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\t\u0010\bJ#\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\f\u0010\rR,\u0010\u0011\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000f0\u0004\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0015\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u0017\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R0\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0013j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006`\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R(\u0010\u001a\u001a\u0016\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00060\u0006\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0012¨\u0006\u001b"}, d2 = {"Lkotlin/jvm/internal/i$a;", "", "<init>", "()V", "Ljava/lang/Class;", "jClass", "", "b", "(Ljava/lang/Class;)Ljava/lang/String;", "a", "value", "", "c", "(Ljava/lang/Object;Ljava/lang/Class;)Z", "", "LXH/i;", "", "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "primitiveFqNames", "Ljava/util/HashMap;", "primitiveWrapperFqNames", "classFqNames", "kotlin.jvm.PlatformType", "simpleNames", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: kotlin.jvm.internal.i$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            C17542s.j(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (cls.isArray()) {
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) C17533i.f144380f.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "kotlin.Array" : str2;
            }
            String str3 = (String) C17533i.f144380f.get(cls.getName());
            return str3 == null ? cls.getCanonicalName() : str3;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
            if (r2 == null) goto L_0x0041;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String b(java.lang.Class<?> r7) {
            /*
                r6 = this;
                java.lang.String r0 = "jClass"
                kotlin.jvm.internal.C17542s.j(r7, r0)
                boolean r0 = r7.isAnonymousClass()
                r1 = 0
                if (r0 == 0) goto L_0x000e
                goto L_0x00b3
            L_0x000e:
                boolean r0 = r7.isLocalClass()
                if (r0 == 0) goto L_0x006a
                java.lang.String r0 = r7.getSimpleName()
                java.lang.reflect.Method r2 = r7.getEnclosingMethod()
                r3 = 2
                r4 = 36
                if (r2 == 0) goto L_0x0041
                kotlin.jvm.internal.C17542s.g(r0)
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = r2.getName()
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = r5.toString()
                java.lang.String r2 = HJ.C15854t.l1(r0, r2, r1, r3, r1)
                if (r2 != 0) goto L_0x003e
                goto L_0x0041
            L_0x003e:
                r1 = r2
                goto L_0x00b3
            L_0x0041:
                java.lang.reflect.Constructor r7 = r7.getEnclosingConstructor()
                if (r7 == 0) goto L_0x0062
                kotlin.jvm.internal.C17542s.g(r0)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r7 = r7.getName()
                r2.append(r7)
                r2.append(r4)
                java.lang.String r7 = r2.toString()
                java.lang.String r1 = HJ.C15854t.l1(r0, r7, r1, r3, r1)
                goto L_0x00b3
            L_0x0062:
                kotlin.jvm.internal.C17542s.g(r0)
                java.lang.String r1 = HJ.C15854t.k1(r0, r4, r1, r3, r1)
                goto L_0x00b3
            L_0x006a:
                boolean r0 = r7.isArray()
                if (r0 == 0) goto L_0x009e
                java.lang.Class r7 = r7.getComponentType()
                boolean r0 = r7.isPrimitive()
                java.lang.String r2 = "Array"
                if (r0 == 0) goto L_0x009b
                java.util.Map r0 = kotlin.jvm.internal.C17533i.f144381g
                java.lang.String r7 = r7.getName()
                java.lang.Object r7 = r0.get(r7)
                java.lang.String r7 = (java.lang.String) r7
                if (r7 == 0) goto L_0x009b
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r7)
                r0.append(r2)
                java.lang.String r1 = r0.toString()
            L_0x009b:
                if (r1 != 0) goto L_0x00b3
                goto L_0x003e
            L_0x009e:
                java.util.Map r0 = kotlin.jvm.internal.C17533i.f144381g
                java.lang.String r1 = r7.getName()
                java.lang.Object r0 = r0.get(r1)
                r1 = r0
                java.lang.String r1 = (java.lang.String) r1
                if (r1 != 0) goto L_0x00b3
                java.lang.String r1 = r7.getSimpleName()
            L_0x00b3:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.jvm.internal.C17533i.a.b(java.lang.Class):java.lang.String");
        }

        public final boolean c(Object obj, Class<?> cls) {
            C17542s.j(cls, "jClass");
            Map w10 = C17533i.f144377c;
            C17542s.h(w10, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) w10.get(cls);
            if (num != null) {
                return W.o(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = C17603a.c(C17603a.e(cls));
            }
            return cls.isInstance(obj);
        }

        private a() {
        }
    }

    static {
        Iterable q10 = C16877v.q(C17631a.class, C17642l.class, p.class, q.class, r.class, s.class, t.class, u.class, v.class, w.class, C17632b.class, C17633c.class, C17634d.class, C17635e.class, C17636f.class, C17637g.class, C17638h.class, C17639i.class, C17640j.class, C17641k.class, C17643m.class, C17644n.class, C17645o.class);
        ArrayList arrayList = new ArrayList(C16877v.y(q10, 10));
        int i10 = 0;
        for (Object next : q10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            arrayList.add(C16796C.a((Class) next, Integer.valueOf(i10)));
            i10 = i11;
        }
        f144377c = X.v(arrayList);
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(FeatureVariable.BOOLEAN_TYPE, "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put(Constants.LONG, "kotlin.Long");
        hashMap.put(FeatureVariable.DOUBLE_TYPE, "kotlin.Double");
        f144378d = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f144379e = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        C17542s.i(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            C17542s.g(str);
            sb2.append(C15854t.o1(str, '.', (String) null, 2, (Object) null));
            sb2.append("CompanionObject");
            String sb3 = sb2.toString();
            XH.v a10 = C16796C.a(sb3, str + ".Companion");
            hashMap3.put(a10.c(), a10.d());
        }
        for (Map.Entry next2 : f144377c.entrySet()) {
            int intValue = ((Number) next2.getValue()).intValue();
            String name = ((Class) next2.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        f144380f = hashMap3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(X.e(hashMap3.size()));
        for (Map.Entry entry : hashMap3.entrySet()) {
            Object key = entry.getKey();
            String str2 = (String) entry.getValue();
            C17542s.g(str2);
            linkedHashMap.put(key, C15854t.o1(str2, '.', (String) null, 2, (Object) null));
        }
        f144381g = linkedHashMap;
    }

    public C17533i(Class<?> cls) {
        C17542s.j(cls, "jClass");
        this.f144382a = cls;
    }

    private final Void y() {
        throw new C17605c();
    }

    public List<C18068q> a() {
        y();
        throw new C16820k();
    }

    public boolean c() {
        y();
        throw new C16820k();
    }

    public boolean equals(Object obj) {
        return (obj instanceof C17533i) && C17542s.e(C17603a.c(this), C17603a.c((C18055d) obj));
    }

    public String f() {
        return f144376b.b(l());
    }

    public List<Annotation> getAnnotations() {
        y();
        throw new C16820k();
    }

    public int hashCode() {
        return C17603a.c(this).hashCode();
    }

    public boolean isAbstract() {
        y();
        throw new C16820k();
    }

    public Collection<C18055d<?>> j() {
        y();
        throw new C16820k();
    }

    public Class<?> l() {
        return this.f144382a;
    }

    public List<C18055d<? extends Object>> m() {
        y();
        throw new C16820k();
    }

    public boolean n() {
        y();
        throw new C16820k();
    }

    public Object p() {
        y();
        throw new C16820k();
    }

    public boolean s(Object obj) {
        return f144376b.c(obj, l());
    }

    public String toString() {
        return l() + " (Kotlin reflection is not available)";
    }

    public String u() {
        return f144376b.a(l());
    }

    public boolean v() {
        y();
        throw new C16820k();
    }
}
