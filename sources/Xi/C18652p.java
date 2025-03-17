package xI;

import DI.C15544O;
import DI.C15566m;
import DI.C15573t;
import DI.a0;
import JI.C15965f;
import MI.C16047H;
import VI.C16686r;
import XI.C16830c;
import XI.n;
import ZI.e;
import ZI.g;
import aJ.C17030a;
import bJ.C17045d;
import bJ.C17050i;
import cJ.C17070g;
import com.sugarcube.core.logger.DslKt;
import eJ.C17198i;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sJ.C17918N;
import sJ.C17936m;
import sJ.C17942s;
import xI.C18648n;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0007\b\u0005\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LxI/p;", "", "<init>", "()V", "", "a", "()Ljava/lang/String;", "c", "b", "d", "LxI/p$a;", "LxI/p$b;", "LxI/p$c;", "LxI/p$d;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.p  reason: case insensitive filesystem */
public abstract class C18652p {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LxI/p$a;", "LxI/p;", "Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Field;", "b", "()Ljava/lang/reflect/Field;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.p$a */
    public static final class a extends C18652p {

        /* renamed from: a  reason: collision with root package name */
        private final Field f152453a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Field field) {
            super((DefaultConstructorMarker) null);
            C17542s.j(field, "field");
            this.f152453a = field;
        }

        public String a() {
            StringBuilder sb2 = new StringBuilder();
            String name = this.f152453a.getName();
            C17542s.i(name, "getName(...)");
            sb2.append(C16047H.b(name));
            sb2.append("()");
            Class<?> type = this.f152453a.getType();
            C17542s.i(type, "getType(...)");
            sb2.append(C15965f.f(type));
            return sb2.toString();
        }

        public final Field b() {
            return this.f152453a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"LxI/p$b;", "LxI/p;", "Ljava/lang/reflect/Method;", "getterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "", "a", "()Ljava/lang/String;", "Ljava/lang/reflect/Method;", "b", "()Ljava/lang/reflect/Method;", "c", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.p$b */
    public static final class b extends C18652p {

        /* renamed from: a  reason: collision with root package name */
        private final Method f152454a;

        /* renamed from: b  reason: collision with root package name */
        private final Method f152455b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(Method method, Method method2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(method, "getterMethod");
            this.f152454a = method;
            this.f152455b = method2;
        }

        public String a() {
            return h1.d(this.f152454a);
        }

        public final Method b() {
            return this.f152454a;
        }

        public final Method c() {
            return this.f152455b;
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"LxI/p$c;", "LxI/p;", "LDI/a0;", "descriptor", "LXI/n;", "proto", "LaJ/a$d;", "signature", "LZI/c;", "nameResolver", "LZI/g;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "", "c", "()Ljava/lang/String;", "a", "LDI/a0;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "b", "LXI/n;", "getProto", "()Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;", "LaJ/a$d;", "getSignature", "()Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "d", "LZI/c;", "getNameResolver", "()Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;", "e", "LZI/g;", "getTypeTable", "()Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;", "f", "Ljava/lang/String;", "string", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.p$c */
    public static final class c extends C18652p {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f152456a;

        /* renamed from: b  reason: collision with root package name */
        private final n f152457b;

        /* renamed from: c  reason: collision with root package name */
        private final C17030a.d f152458c;

        /* renamed from: d  reason: collision with root package name */
        private final ZI.c f152459d;

        /* renamed from: e  reason: collision with root package name */
        private final g f152460e;

        /* renamed from: f  reason: collision with root package name */
        private final String f152461f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(a0 a0Var, n nVar, C17030a.d dVar, ZI.c cVar, g gVar) {
            super((DefaultConstructorMarker) null);
            String str;
            C17542s.j(a0Var, "descriptor");
            C17542s.j(nVar, "proto");
            C17542s.j(dVar, "signature");
            C17542s.j(cVar, "nameResolver");
            C17542s.j(gVar, "typeTable");
            this.f152456a = a0Var;
            this.f152457b = nVar;
            this.f152458c = dVar;
            this.f152459d = cVar;
            this.f152460e = gVar;
            if (dVar.B()) {
                str = cVar.getString(dVar.w().s()) + cVar.getString(dVar.w().r());
            } else {
                C17045d.a d10 = C17050i.d(C17050i.f141191a, nVar, cVar, gVar, false, 8, (Object) null);
                if (d10 != null) {
                    String b10 = d10.b();
                    str = C16047H.b(b10) + c() + "()" + d10.c();
                } else {
                    throw new Y0("No field signature for property: " + a0Var);
                }
            }
            this.f152461f = str;
        }

        private final String c() {
            String str;
            C15566m b10 = this.f152456a.b();
            C17542s.i(b10, "getContainingDeclaration(...)");
            if (C17542s.e(this.f152456a.getVisibility(), C15573t.f133852d) && (b10 instanceof C17936m)) {
                C16830c e12 = ((C17936m) b10).e1();
                C17198i.f<C16830c, Integer> fVar = C17030a.f140995i;
                C17542s.i(fVar, "classModuleName");
                Integer num = (Integer) e.a(e12, fVar);
                if (num == null || (str = this.f152459d.getString(num.intValue())) == null) {
                    str = DslKt.MAIN_THREAD_NAME;
                }
                return '$' + C17070g.b(str);
            } else if (!C17542s.e(this.f152456a.getVisibility(), C15573t.f133849a) || !(b10 instanceof C15544O)) {
                return "";
            } else {
                a0 a0Var = this.f152456a;
                C17542s.h(a0Var, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                C17942s K10 = ((C17918N) a0Var).K();
                if (!(K10 instanceof C16686r)) {
                    return "";
                }
                C16686r rVar = (C16686r) K10;
                if (rVar.f() == null) {
                    return "";
                }
                return '$' + rVar.h().b();
            }
        }

        public String a() {
            return this.f152461f;
        }

        public final a0 b() {
            return this.f152456a;
        }

        public final ZI.c d() {
            return this.f152459d;
        }

        public final n e() {
            return this.f152457b;
        }

        public final C17030a.d f() {
            return this.f152458c;
        }

        public final g g() {
            return this.f152460e;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"LxI/p$d;", "LxI/p;", "LxI/n$e;", "getterSignature", "setterSignature", "<init>", "(LxI/n$e;LxI/n$e;)V", "", "a", "()Ljava/lang/String;", "LxI/n$e;", "b", "()LxI/n$e;", "c", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.p$d */
    public static final class d extends C18652p {

        /* renamed from: a  reason: collision with root package name */
        private final C18648n.e f152462a;

        /* renamed from: b  reason: collision with root package name */
        private final C18648n.e f152463b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C18648n.e eVar, C18648n.e eVar2) {
            super((DefaultConstructorMarker) null);
            C17542s.j(eVar, "getterSignature");
            this.f152462a = eVar;
            this.f152463b = eVar2;
        }

        public String a() {
            return this.f152462a.a();
        }

        public final C18648n.e b() {
            return this.f152462a;
        }

        public final C18648n.e c() {
            return this.f152463b;
        }
    }

    public /* synthetic */ C18652p(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String a();

    private C18652p() {
    }
}
