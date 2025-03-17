package nJ;

import YH.C16877v;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

/* renamed from: nJ.d  reason: case insensitive filesystem */
public final class C17649d {

    /* renamed from: c  reason: collision with root package name */
    public static final a f144823c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static int f144824d = 1;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final int f144825e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final int f144826f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final int f144827g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final int f144828h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public static final int f144829i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final int f144830j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public static final int f144831k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public static final int f144832l;

    /* renamed from: m  reason: collision with root package name */
    private static final int f144833m;

    /* renamed from: n  reason: collision with root package name */
    private static final int f144834n;

    /* renamed from: o  reason: collision with root package name */
    public static final C17649d f144835o;

    /* renamed from: p  reason: collision with root package name */
    public static final C17649d f144836p;

    /* renamed from: q  reason: collision with root package name */
    public static final C17649d f144837q;

    /* renamed from: r  reason: collision with root package name */
    public static final C17649d f144838r;

    /* renamed from: s  reason: collision with root package name */
    public static final C17649d f144839s;

    /* renamed from: t  reason: collision with root package name */
    public static final C17649d f144840t;

    /* renamed from: u  reason: collision with root package name */
    public static final C17649d f144841u;

    /* renamed from: v  reason: collision with root package name */
    public static final C17649d f144842v;

    /* renamed from: w  reason: collision with root package name */
    public static final C17649d f144843w;

    /* renamed from: x  reason: collision with root package name */
    public static final C17649d f144844x;

    /* renamed from: y  reason: collision with root package name */
    private static final List<a.C3533a> f144845y;

    /* renamed from: z  reason: collision with root package name */
    private static final List<a.C3533a> f144846z;

    /* renamed from: a  reason: collision with root package name */
    private final List<C17648c> f144847a;

    /* renamed from: b  reason: collision with root package name */
    private final int f144848b;

    /* renamed from: nJ.d$a */
    public static final class a {

        /* renamed from: nJ.d$a$a  reason: collision with other inner class name */
        private static final class C3533a {

            /* renamed from: a  reason: collision with root package name */
            private final int f144849a;

            /* renamed from: b  reason: collision with root package name */
            private final String f144850b;

            public C3533a(int i10, String str) {
                C17542s.j(str, "name");
                this.f144849a = i10;
                this.f144850b = str;
            }

            public final int a() {
                return this.f144849a;
            }

            public final String b() {
                return this.f144850b;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* access modifiers changed from: private */
        public final int j() {
            int f10 = C17649d.f144824d;
            C17649d.f144824d = C17649d.f144824d << 1;
            return f10;
        }

        public final int b() {
            return C17649d.f144831k;
        }

        public final int c() {
            return C17649d.f144832l;
        }

        public final int d() {
            return C17649d.f144829i;
        }

        public final int e() {
            return C17649d.f144825e;
        }

        public final int f() {
            return C17649d.f144828h;
        }

        public final int g() {
            return C17649d.f144826f;
        }

        public final int h() {
            return C17649d.f144827g;
        }

        public final int i() {
            return C17649d.f144830j;
        }

        private a() {
        }
    }

    static {
        a.C3533a aVar;
        a.C3533a aVar2;
        a aVar3 = new a((DefaultConstructorMarker) null);
        f144823c = aVar3;
        int a10 = aVar3.j();
        f144825e = a10;
        int a11 = aVar3.j();
        f144826f = a11;
        int a12 = aVar3.j();
        f144827g = a12;
        int a13 = aVar3.j();
        f144828h = a13;
        int a14 = aVar3.j();
        f144829i = a14;
        int a15 = aVar3.j();
        f144830j = a15;
        int a16 = aVar3.j() - 1;
        f144831k = a16;
        int i10 = a10 | a11 | a12;
        f144832l = i10;
        int i11 = a11 | a14 | a15;
        f144833m = i11;
        int i12 = a14 | a15;
        f144834n = i12;
        f144835o = new C17649d(a16, (List) null, 2, (DefaultConstructorMarker) null);
        f144836p = new C17649d(i12, (List) null, 2, (DefaultConstructorMarker) null);
        f144837q = new C17649d(a10, (List) null, 2, (DefaultConstructorMarker) null);
        f144838r = new C17649d(a11, (List) null, 2, (DefaultConstructorMarker) null);
        f144839s = new C17649d(a12, (List) null, 2, (DefaultConstructorMarker) null);
        f144840t = new C17649d(i10, (List) null, 2, (DefaultConstructorMarker) null);
        f144841u = new C17649d(a13, (List) null, 2, (DefaultConstructorMarker) null);
        f144842v = new C17649d(a14, (List) null, 2, (DefaultConstructorMarker) null);
        f144843w = new C17649d(a15, (List) null, 2, (DefaultConstructorMarker) null);
        f144844x = new C17649d(i11, (List) null, 2, (DefaultConstructorMarker) null);
        Class<C17649d> cls = C17649d.class;
        Field[] fields = cls.getFields();
        C17542s.i(fields, "getFields(...)");
        ArrayList<Field> arrayList = new ArrayList<>();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get((Object) null);
            C17649d dVar = obj instanceof C17649d ? (C17649d) obj : null;
            if (dVar != null) {
                int i13 = dVar.f144848b;
                String name = field2.getName();
                C17542s.i(name, "getName(...)");
                aVar2 = new a.C3533a(i13, name);
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                arrayList2.add(aVar2);
            }
        }
        f144845y = arrayList2;
        Field[] fields2 = cls.getFields();
        C17542s.i(fields2, "getFields(...)");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList<>();
        for (Object next : arrayList3) {
            if (C17542s.e(((Field) next).getType(), Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj2 = field4.get((Object) null);
            C17542s.h(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj2).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                C17542s.i(name2, "getName(...)");
                aVar = new a.C3533a(intValue, name2);
            } else {
                aVar = null;
            }
            if (aVar != null) {
                arrayList5.add(aVar);
            }
        }
        f144846z = arrayList5;
    }

    public C17649d(int i10, List<? extends C17648c> list) {
        C17542s.j(list, "excludes");
        this.f144847a = list;
        for (C17648c a10 : list) {
            i10 &= ~a10.a();
        }
        this.f144848b = i10;
    }

    public final boolean a(int i10) {
        return (i10 & this.f144848b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C17542s.e(C17649d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        C17542s.h(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        C17649d dVar = (C17649d) obj;
        return C17542s.e(this.f144847a, dVar.f144847a) && this.f144848b == dVar.f144848b;
    }

    public int hashCode() {
        return (this.f144847a.hashCode() * 31) + this.f144848b;
    }

    public final List<C17648c> l() {
        return this.f144847a;
    }

    public final int m() {
        return this.f144848b;
    }

    public final C17649d n(int i10) {
        int i11 = i10 & this.f144848b;
        if (i11 == 0) {
            return null;
        }
        return new C17649d(i11, this.f144847a);
    }

    public String toString() {
        Object obj;
        Iterator it = f144845y.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.C3533a) obj).a() == this.f144848b) {
                break;
            }
        }
        a.C3533a aVar = (a.C3533a) obj;
        String b10 = aVar != null ? aVar.b() : null;
        if (b10 == null) {
            ArrayList arrayList = new ArrayList();
            for (a.C3533a aVar2 : f144846z) {
                String b11 = a(aVar2.a()) ? aVar2.b() : null;
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            b10 = C16877v.G0(arrayList, " | ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (C17642l) null, 62, (Object) null);
        }
        return "DescriptorKindFilter(" + b10 + ", " + this.f144847a + ')';
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17649d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? C16877v.n() : list);
    }
}
