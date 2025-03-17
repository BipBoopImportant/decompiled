package WI;

import DI.i0;
import MI.C16048I;
import VI.C16692x;
import WI.C16730a;
import bJ.C17042a;
import bJ.C17046e;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import com.sugarcube.core.logger.DslKt;
import iJ.C17372f;
import java.security.AccessControlException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: WI.b  reason: case insensitive filesystem */
public class C16731b implements C16692x.c {

    /* renamed from: j  reason: collision with root package name */
    private static boolean f139503j;

    /* renamed from: k  reason: collision with root package name */
    private static final Map<C17065b, C16730a.C3422a> f139504k;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public int[] f139505a = null;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public String f139506b = null;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f139507c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public String f139508d = null;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public String[] f139509e = null;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public String[] f139510f = null;

    /* renamed from: g  reason: collision with root package name */
    private String[] f139511g = null;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C16730a.C3422a f139512h = null;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public String[] f139513i = null;

    /* renamed from: WI.b$b  reason: collision with other inner class name */
    private static abstract class C3424b implements C16692x.b {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f139514a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public void a() {
            g((String[]) this.f139514a.toArray(new String[0]));
        }

        public C16692x.a b(C17065b bVar) {
            if (bVar != null) {
                return null;
            }
            f(3);
            return null;
        }

        public void c(C17372f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        public void d(C17065b bVar, C17069f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        public void e(Object obj) {
            if (obj instanceof String) {
                this.f139514a.add((String) obj);
            }
        }

        /* access modifiers changed from: protected */
        public abstract void g(String[] strArr);
    }

    /* renamed from: WI.b$c */
    private class c implements C16692x.a {

        /* renamed from: WI.b$c$a */
        class a extends C3424b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C16731b.this.f139509e = strArr;
            }
        }

        /* renamed from: WI.b$c$b  reason: collision with other inner class name */
        class C3425b extends C3424b {
            C3425b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C16731b.this.f139510f = strArr;
            }
        }

        private c() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C16692x.b h() {
            return new a();
        }

        private C16692x.b i() {
            return new C3425b();
        }

        public void a() {
        }

        public void b(C17069f fVar, Object obj) {
            if (fVar != null) {
                String b10 = fVar.b();
                if ("k".equals(b10)) {
                    if (obj instanceof Integer) {
                        C16730a.C3422a unused = C16731b.this.f139512h = C16730a.C3422a.j(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(b10)) {
                    if (obj instanceof int[]) {
                        int[] unused2 = C16731b.this.f139505a = (int[]) obj;
                    }
                } else if ("xs".equals(b10)) {
                    if (obj instanceof String) {
                        String str = (String) obj;
                        if (!str.isEmpty()) {
                            String unused3 = C16731b.this.f139506b = str;
                        }
                    }
                } else if ("xi".equals(b10)) {
                    if (obj instanceof Integer) {
                        int unused4 = C16731b.this.f139507c = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(b10) && (obj instanceof String)) {
                    String str2 = (String) obj;
                    if (!str2.isEmpty()) {
                        String unused5 = C16731b.this.f139508d = str2;
                    }
                }
            }
        }

        public void c(C17069f fVar, C17065b bVar, C17069f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        public void d(C17069f fVar, C17372f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        public C16692x.b e(C17069f fVar) {
            String b10 = fVar != null ? fVar.b() : null;
            if ("d1".equals(b10)) {
                return h();
            }
            if ("d2".equals(b10)) {
                return i();
            }
            return null;
        }

        public C16692x.a f(C17069f fVar, C17065b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }
    }

    /* renamed from: WI.b$d */
    private class d implements C16692x.a {

        /* renamed from: WI.b$d$a */
        class a extends C3424b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C16731b.this.f139513i = strArr;
            }
        }

        private d() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C16692x.b h() {
            return new a();
        }

        public void a() {
        }

        public void b(C17069f fVar, Object obj) {
        }

        public void c(C17069f fVar, C17065b bVar, C17069f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        public void d(C17069f fVar, C17372f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        public C16692x.b e(C17069f fVar) {
            if (DslKt.INDICATOR_BACKGROUND.equals(fVar != null ? fVar.b() : null)) {
                return h();
            }
            return null;
        }

        public C16692x.a f(C17069f fVar, C17065b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }
    }

    /* renamed from: WI.b$e */
    private class e implements C16692x.a {

        /* renamed from: WI.b$e$a */
        class a extends C3424b {
            a() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C16731b.this.f139509e = strArr;
            }
        }

        /* renamed from: WI.b$e$b  reason: collision with other inner class name */
        class C3426b extends C3424b {
            C3426b() {
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"}));
            }

            /* access modifiers changed from: protected */
            public void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                String[] unused = C16731b.this.f139510f = strArr;
            }
        }

        private e() {
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private C16692x.b h() {
            return new a();
        }

        private C16692x.b i() {
            return new C3426b();
        }

        public void a() {
        }

        public void b(C17069f fVar, Object obj) {
            if (fVar != null) {
                String b10 = fVar.b();
                if ("version".equals(b10)) {
                    if (obj instanceof int[]) {
                        int[] unused = C16731b.this.f139505a = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(b10)) {
                    String unused2 = C16731b.this.f139506b = obj instanceof String ? (String) obj : null;
                }
            }
        }

        public void c(C17069f fVar, C17065b bVar, C17069f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        public void d(C17069f fVar, C17372f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        public C16692x.b e(C17069f fVar) {
            String b10 = fVar != null ? fVar.b() : null;
            if ("data".equals(b10) || "filePartClassNames".equals(b10)) {
                return h();
            }
            if ("strings".equals(b10)) {
                return i();
            }
            return null;
        }

        public C16692x.a f(C17069f fVar, C17065b bVar) {
            if (bVar != null) {
                return null;
            }
            g(3);
            return null;
        }
    }

    static {
        try {
            f139503j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));
        } catch (AccessControlException unused) {
            f139503j = false;
        }
        HashMap hashMap = new HashMap();
        f139504k = hashMap;
        hashMap.put(C17065b.k(new C17066c("kotlin.jvm.internal.KotlinClass")), C16730a.C3422a.CLASS);
        hashMap.put(C17065b.k(new C17066c("kotlin.jvm.internal.KotlinFileFacade")), C16730a.C3422a.FILE_FACADE);
        hashMap.put(C17065b.k(new C17066c("kotlin.jvm.internal.KotlinMultifileClass")), C16730a.C3422a.MULTIFILE_CLASS);
        hashMap.put(C17065b.k(new C17066c("kotlin.jvm.internal.KotlinMultifileClassPart")), C16730a.C3422a.MULTIFILE_CLASS_PART);
        hashMap.put(C17065b.k(new C17066c("kotlin.jvm.internal.KotlinSyntheticClass")), C16730a.C3422a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean o() {
        C16730a.C3422a aVar = this.f139512h;
        return aVar == C16730a.C3422a.CLASS || aVar == C16730a.C3422a.FILE_FACADE || aVar == C16730a.C3422a.MULTIFILE_CLASS_PART;
    }

    public void a() {
    }

    public C16692x.a c(C17065b bVar, i0 i0Var) {
        C16730a.C3422a aVar;
        if (bVar == null) {
            d(0);
        }
        if (i0Var == null) {
            d(1);
        }
        C17066c a10 = bVar.a();
        if (a10.equals(C16048I.f136289a)) {
            return new c();
        }
        if (a10.equals(C16048I.f136308t)) {
            return new d();
        }
        if (f139503j || this.f139512h != null || (aVar = f139504k.get(bVar)) == null) {
            return null;
        }
        this.f139512h = aVar;
        return new e();
    }

    public C16730a m(C17046e eVar) {
        byte[] bArr = null;
        if (this.f139512h == null || this.f139505a == null) {
            return null;
        }
        C17046e eVar2 = new C17046e(this.f139505a, (this.f139507c & 8) != 0);
        if (!eVar2.h(eVar)) {
            this.f139511g = this.f139509e;
            this.f139509e = null;
        } else if (o() && this.f139509e == null) {
            return null;
        }
        String[] strArr = this.f139513i;
        if (strArr != null) {
            bArr = C17042a.e(strArr);
        }
        return new C16730a(this.f139512h, eVar2, this.f139509e, this.f139511g, this.f139510f, this.f139506b, this.f139507c, this.f139508d, bArr);
    }

    public C16730a n() {
        return m(C17046e.f141178i);
    }
}
