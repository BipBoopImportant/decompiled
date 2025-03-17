package xI;

import AI.C15423d;
import AI.C15424e;
import AI.C15429j;
import DI.C15535F;
import DI.C15557d;
import DI.C15558e;
import DI.C15559f;
import DI.C15561h;
import DI.C15565l;
import DI.C15566m;
import DI.C15578y;
import DI.C15579z;
import DI.a0;
import DI.i0;
import DI.n0;
import EJ.C15660a;
import GI.C15741k;
import GI.C15746p;
import HJ.C15854t;
import II.C15902k;
import JI.C15965f;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XI.C16830c;
import XI.n;
import YH.C16870n;
import YH.C16877v;
import YH.g0;
import ZI.e;
import aJ.C17030a;
import cJ.C17065b;
import cJ.C17066c;
import cJ.C17069f;
import eJ.C17198i;
import gJ.C17278i;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kJ.C17506e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.W;
import mI.C17603a;
import nI.C17642l;
import nI.p;
import nJ.C17649d;
import nJ.C17651f;
import nJ.C17656k;
import nJ.C17659n;
import qJ.C17798K;
import sJ.C17936m;
import tJ.C17994n;
import uI.C18055d;
import uI.C18059h;
import uI.C18064m;
import uI.C18068q;
import uJ.C18096U;
import uJ.C18113f0;
import xI.C18629d0;
import xI.a1;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u00042\u00020\u00052\u00020\u0006:\u0001KB\u0015\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b$\u0010\"J\u000f\u0010%\u001a\u00020\u001bH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0016X\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R'\u00104\u001a\u0012\u0012\u000e\u0012\f0/R\b\u0012\u0004\u0012\u00028\u00000\u00000.8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058VX\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001a\u0010=\u001a\b\u0012\u0004\u0012\u00020:0\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010?\u001a\u0004\u0018\u00010'8VX\u0004¢\u0006\u0006\u001a\u0004\b>\u0010)R\u0016\u0010A\u001a\u0004\u0018\u00010'8VX\u0004¢\u0006\u0006\u001a\u0004\b@\u0010)R \u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B0\u00158VX\u0004¢\u0006\u0006\u001a\u0004\bC\u0010<R\u001e\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u00158VX\u0004¢\u0006\u0006\u001a\u0004\bE\u0010<R\u0016\u0010I\u001a\u0004\u0018\u00018\u00008VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020J058VX\u0004¢\u0006\u0006\u001a\u0004\bK\u00108R\"\u0010N\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004058VX\u0004¢\u0006\u0006\u001a\u0004\bM\u00108R\u0014\u0010O\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010R\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010PR\u0014\u0010T\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\bS\u0010PR\u0014\u0010V\u001a\u00020 8VX\u0004¢\u0006\u0006\u001a\u0004\bU\u0010PR\u0014\u0010Y\u001a\u00020\u000f8VX\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010\f\u001a\u00020\u000b8BX\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010_\u001a\u00020\\8@X\u0004¢\u0006\u0006\u001a\u0004\b]\u0010^R\u0014\u0010a\u001a\u00020\\8@X\u0004¢\u0006\u0006\u001a\u0004\b`\u0010^¨\u0006b"}, d2 = {"LxI/X;", "", "T", "LxI/d0;", "LuI/d;", "LxI/Y;", "LxI/X0;", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "LcJ/b;", "classId", "LII/k;", "moduleData", "LDI/e;", "c0", "(LcJ/b;LII/k;)LDI/e;", "b0", "LcJ/f;", "name", "", "LDI/a0;", "S", "(LcJ/f;)Ljava/util/Collection;", "LDI/z;", "O", "", "index", "P", "(I)LDI/a0;", "value", "", "s", "(Ljava/lang/Object;)Z", "other", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "Ljava/lang/Class;", "l", "()Ljava/lang/Class;", "LXH/o;", "LxI/X$a;", "e", "LXH/o;", "g0", "()LXH/o;", "data", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "LDI/l;", "N", "()Ljava/util/Collection;", "constructorDescriptors", "f", "simpleName", "u", "qualifiedName", "LuI/h;", "f0", "constructors", "j", "nestedClasses", "p", "()Ljava/lang/Object;", "objectInstance", "LuI/q;", "a", "supertypes", "m", "sealedSubclasses", "isAbstract", "()Z", "c", "isSealed", "n", "isInner", "v", "isValue", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "getClassId", "()Lorg/jetbrains/kotlin/name/ClassId;", "LnJ/k;", "getMemberScope$kotlin_reflection", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "memberScope", "getStaticScope$kotlin_reflection", "staticScope", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: xI.X  reason: case insensitive filesystem */
public final class C18621X<T> extends C18629d0 implements C18055d<T>, Y, X0 {

    /* renamed from: d  reason: collision with root package name */
    private final Class<T> f152355d;

    /* renamed from: e  reason: collision with root package name */
    private final C16824o<C18621X<T>.defpackage.a> f152356e = C16825p.a(s.PUBLICATION, new C18600B(this));

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u000b\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005H\u0002¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR!\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108FX\u0002¢\u0006\f\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00078FX\u0002¢\u0006\f\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u0018R-\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001d8FX\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R%\u0010(\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030%0\u001d8FX\u0002¢\u0006\f\n\u0004\b&\u0010\f\u001a\u0004\b'\u0010!R#\u0010.\u001a\u0004\u0018\u00018\u00008FX\u0002¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,R!\u00102\u001a\b\u0012\u0004\u0012\u00020/0\u00108FX\u0002¢\u0006\f\n\u0004\b0\u0010\f\u001a\u0004\b1\u0010\u0014R!\u00106\u001a\b\u0012\u0004\u0012\u0002030\u00108FX\u0002¢\u0006\f\n\u0004\b4\u0010\f\u001a\u0004\b5\u0010\u0014R)\u00109\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000%0\u00108FX\u0002¢\u0006\f\n\u0004\b7\u0010\f\u001a\u0004\b8\u0010\u0014R%\u0010=\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0002¢\u0006\f\n\u0004\b;\u0010\f\u001a\u0004\b<\u0010!R%\u0010@\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0002¢\u0006\f\n\u0004\b>\u0010\f\u001a\u0004\b?\u0010!R%\u0010C\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0002¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bB\u0010!R%\u0010F\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8BX\u0002¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010!R%\u0010I\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0002¢\u0006\f\n\u0004\bG\u0010\f\u001a\u0004\bH\u0010!R%\u0010L\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0002¢\u0006\f\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010!R%\u0010O\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0002¢\u0006\f\n\u0004\bM\u0010\f\u001a\u0004\bN\u0010!R%\u0010R\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030:0\u001d8FX\u0002¢\u0006\f\n\u0004\bP\u0010\f\u001a\u0004\bQ\u0010!¨\u0006S"}, d2 = {"LxI/X$a;", "LxI/d0$b;", "LxI/d0;", "<init>", "(LxI/X;)V", "Ljava/lang/Class;", "jClass", "", "B", "(Ljava/lang/Class;)Ljava/lang/String;", "LDI/e;", "d", "LxI/a1$a;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", "descriptor", "", "", "e", "J", "()Ljava/util/List;", "annotations", "f", "U", "()Ljava/lang/String;", "simpleName", "g", "S", "qualifiedName", "", "LuI/h;", "h", "K", "()Ljava/util/Collection;", "getConstructors$annotations", "()V", "constructors", "LuI/d;", "i", "Q", "nestedClasses", "j", "LXH/o;", "R", "()Ljava/lang/Object;", "getObjectInstance$annotations", "objectInstance", "LuI/r;", "k", "getTypeParameters", "typeParameters", "LuI/q;", "l", "V", "supertypes", "m", "T", "sealedSubclasses", "LxI/A;", "n", "L", "declaredNonStaticMembers", "o", "M", "declaredStaticMembers", "p", "O", "inheritedNonStaticMembers", "q", "P", "inheritedStaticMembers", "r", "H", "allNonStaticMembers", "s", "I", "allStaticMembers", "t", "getDeclaredMembers", "declaredMembers", "u", "getAllMembers", "allMembers", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.X$a */
    public final class a extends C18629d0.b {

        /* renamed from: w  reason: collision with root package name */
        static final /* synthetic */ C18064m<Object>[] f152357w;

        /* renamed from: d  reason: collision with root package name */
        private final a1.a f152358d;

        /* renamed from: e  reason: collision with root package name */
        private final a1.a f152359e = a1.c(new C18612N(this));

        /* renamed from: f  reason: collision with root package name */
        private final a1.a f152360f;

        /* renamed from: g  reason: collision with root package name */
        private final a1.a f152361g;

        /* renamed from: h  reason: collision with root package name */
        private final a1.a f152362h;

        /* renamed from: i  reason: collision with root package name */
        private final a1.a f152363i;

        /* renamed from: j  reason: collision with root package name */
        private final C16824o f152364j;

        /* renamed from: k  reason: collision with root package name */
        private final a1.a f152365k;

        /* renamed from: l  reason: collision with root package name */
        private final a1.a f152366l;

        /* renamed from: m  reason: collision with root package name */
        private final a1.a f152367m;

        /* renamed from: n  reason: collision with root package name */
        private final a1.a f152368n;

        /* renamed from: o  reason: collision with root package name */
        private final a1.a f152369o;

        /* renamed from: p  reason: collision with root package name */
        private final a1.a f152370p;

        /* renamed from: q  reason: collision with root package name */
        private final a1.a f152371q;

        /* renamed from: r  reason: collision with root package name */
        private final a1.a f152372r;

        /* renamed from: s  reason: collision with root package name */
        private final a1.a f152373s;

        /* renamed from: t  reason: collision with root package name */
        private final a1.a f152374t;

        /* renamed from: u  reason: collision with root package name */
        private final a1.a f152375u;

        static {
            Class<a> cls = a.class;
            f152357w = new C18064m[]{P.h(new G(cls, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), P.h(new G(cls, "annotations", "getAnnotations()Ljava/util/List;", 0)), P.h(new G(cls, "simpleName", "getSimpleName()Ljava/lang/String;", 0)), P.h(new G(cls, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0)), P.h(new G(cls, "constructors", "getConstructors()Ljava/util/Collection;", 0)), P.h(new G(cls, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0)), P.h(new G(cls, "typeParameters", "getTypeParameters()Ljava/util/List;", 0)), P.h(new G(cls, "supertypes", "getSupertypes()Ljava/util/List;", 0)), P.h(new G(cls, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0)), P.h(new G(cls, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0)), P.h(new G(cls, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0)), P.h(new G(cls, "inheritedNonStaticMembers", "getInheritedNonStaticMembers()Ljava/util/Collection;", 0)), P.h(new G(cls, "inheritedStaticMembers", "getInheritedStaticMembers()Ljava/util/Collection;", 0)), P.h(new G(cls, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0)), P.h(new G(cls, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0)), P.h(new G(cls, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0)), P.h(new G(cls, "allMembers", "getAllMembers()Ljava/util/Collection;", 0))};
        }

        public a() {
            super();
            this.f152358d = a1.c(new C18601C(C18621X.this));
            this.f152360f = a1.c(new C18613O(C18621X.this, this));
            this.f152361g = a1.c(new C18614P(C18621X.this));
            this.f152362h = a1.c(new C18615Q(C18621X.this));
            this.f152363i = a1.c(new C18616S(this));
            this.f152364j = C16825p.a(s.PUBLICATION, new C18617T(this, C18621X.this));
            this.f152365k = a1.c(new C18618U(this, C18621X.this));
            this.f152366l = a1.c(new C18619V(this, C18621X.this));
            this.f152367m = a1.c(new C18620W(this));
            this.f152368n = a1.c(new C18602D(C18621X.this));
            this.f152369o = a1.c(new C18603E(C18621X.this));
            this.f152370p = a1.c(new C18604F(C18621X.this));
            this.f152371q = a1.c(new C18605G(C18621X.this));
            this.f152372r = a1.c(new C18606H(this));
            this.f152373s = a1.c(new C18607I(this));
            this.f152374t = a1.c(new C18608J(this));
            this.f152375u = a1.c(new C18609K(this));
        }

        /* access modifiers changed from: private */
        public static final List A(a aVar) {
            return j1.e(aVar.N());
        }

        private final String B(Class<?> cls) {
            String simpleName = cls.getSimpleName();
            Method enclosingMethod = cls.getEnclosingMethod();
            if (enclosingMethod != null) {
                C17542s.g(simpleName);
                return C15854t.l1(simpleName, enclosingMethod.getName() + '$', (String) null, 2, (Object) null);
            }
            Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
            if (enclosingConstructor != null) {
                C17542s.g(simpleName);
                return C15854t.l1(simpleName, enclosingConstructor.getName() + '$', (String) null, 2, (Object) null);
            }
            C17542s.g(simpleName);
            return C15854t.k1(simpleName, '$', (String) null, 2, (Object) null);
        }

        /* access modifiers changed from: private */
        public static final List C(C18621X x10) {
            Iterable<C15565l> N10 = x10.N();
            ArrayList arrayList = new ArrayList(C16877v.y(N10, 10));
            for (C15565l i0Var : N10) {
                arrayList.add(new C18639i0(x10, i0Var));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static final List D(a aVar) {
            return C16877v.V0(aVar.L(), aVar.M());
        }

        /* access modifiers changed from: private */
        public static final Collection E(C18621X x10) {
            return x10.Q(x10.i0(), C18629d0.d.DECLARED);
        }

        /* access modifiers changed from: private */
        public static final Collection F(C18621X x10) {
            return x10.Q(x10.j0(), C18629d0.d.DECLARED);
        }

        /* access modifiers changed from: private */
        public static final C15558e G(C18621X x10) {
            C17065b Z10 = x10.e0();
            C15902k b10 = x10.g0().getValue().b();
            C15558e b11 = (!Z10.i() || !x10.l().isAnnotationPresent(Metadata.class)) ? C15578y.b(b10.b(), Z10) : b10.a().b(Z10);
            return b11 == null ? x10.c0(Z10, b10) : b11;
        }

        private final Collection<C18599A<?>> M() {
            Object b10 = this.f152369o.b(this, f152357w[10]);
            C17542s.i(b10, "getValue(...)");
            return (Collection) b10;
        }

        private final Collection<C18599A<?>> O() {
            Object b10 = this.f152370p.b(this, f152357w[11]);
            C17542s.i(b10, "getValue(...)");
            return (Collection) b10;
        }

        private final Collection<C18599A<?>> P() {
            Object b10 = this.f152371q.b(this, f152357w[12]);
            C17542s.i(b10, "getValue(...)");
            return (Collection) b10;
        }

        /* access modifiers changed from: private */
        public static final Collection W(C18621X x10) {
            return x10.Q(x10.i0(), C18629d0.d.INHERITED);
        }

        /* access modifiers changed from: private */
        public static final Collection X(C18621X x10) {
            return x10.Q(x10.j0(), C18629d0.d.INHERITED);
        }

        /* access modifiers changed from: private */
        public static final List Y(a aVar) {
            ArrayList<C15566m> arrayList = new ArrayList<>();
            for (Object next : C17659n.a.a(aVar.N().U(), (C17649d) null, (C17642l) null, 3, (Object) null)) {
                if (!C17278i.B((C15566m) next)) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (C15566m mVar : arrayList) {
                C15558e eVar = mVar instanceof C15558e ? (C15558e) mVar : null;
                Class<?> q10 = eVar != null ? j1.q(eVar) : null;
                C18621X x10 = q10 != null ? new C18621X(q10) : null;
                if (x10 != null) {
                    arrayList2.add(x10);
                }
            }
            return arrayList2;
        }

        /* access modifiers changed from: private */
        public static final Object Z(a aVar, C18621X x10) {
            C15558e N10 = aVar.N();
            if (N10.h() != C15559f.OBJECT) {
                return null;
            }
            Object obj = ((!N10.b0() || C15424e.a(C15423d.f132979a, N10)) ? x10.l().getDeclaredField("INSTANCE") : x10.l().getEnclosingClass().getDeclaredField(N10.getName().b())).get((Object) null);
            C17542s.h(obj, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
            return obj;
        }

        /* access modifiers changed from: private */
        public static final String a0(C18621X x10) {
            if (x10.l().isAnonymousClass()) {
                return null;
            }
            C17065b Z10 = x10.e0();
            if (Z10.i()) {
                return null;
            }
            return Z10.a().a();
        }

        /* access modifiers changed from: private */
        public static final List b0(a aVar) {
            Collection<C15558e> m10 = aVar.N().m();
            C17542s.i(m10, "getSealedSubclasses(...)");
            ArrayList arrayList = new ArrayList();
            for (C15558e eVar : m10) {
                C17542s.h(eVar, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> q10 = j1.q(eVar);
                C18621X x10 = q10 != null ? new C18621X(q10) : null;
                if (x10 != null) {
                    arrayList.add(x10);
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static final String c0(C18621X x10, a aVar) {
            if (x10.l().isAnonymousClass()) {
                return null;
            }
            C17065b Z10 = x10.e0();
            if (Z10.i()) {
                return aVar.B(x10.l());
            }
            String b10 = Z10.h().b();
            C17542s.i(b10, "asString(...)");
            return b10;
        }

        /* access modifiers changed from: private */
        public static final List d0(a aVar, C18621X x10) {
            Collection<C18096U> a10 = aVar.N().k().a();
            C17542s.i(a10, "getSupertypes(...)");
            ArrayList arrayList = new ArrayList(a10.size());
            for (C18096U u10 : a10) {
                C17542s.g(u10);
                arrayList.add(new U0(u10, new C18610L(u10, aVar, x10)));
            }
            if (!C15429j.v0(aVar.N())) {
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C15559f h10 = C17278i.e(((U0) it.next()).F()).h();
                        C17542s.i(h10, "getKind(...)");
                        if (h10 != C15559f.INTERFACE && h10 != C15559f.ANNOTATION_CLASS) {
                            break;
                        }
                    }
                }
                C18113f0 i10 = C17506e.m(aVar.N()).i();
                C17542s.i(i10, "getAnyType(...)");
                arrayList.add(new U0(i10, C18611M.f152319a));
            }
            return C15660a.c(arrayList);
        }

        /* access modifiers changed from: private */
        public static final Type e0(C18096U u10, a aVar, C18621X x10) {
            C15561h e10 = u10.N0().e();
            if (e10 instanceof C15558e) {
                Class<?> q10 = j1.q((C15558e) e10);
                if (q10 == null) {
                    throw new Y0("Unsupported superclass of " + aVar + ": " + e10);
                } else if (C17542s.e(x10.l().getSuperclass(), q10)) {
                    Type genericSuperclass = x10.l().getGenericSuperclass();
                    C17542s.g(genericSuperclass);
                    return genericSuperclass;
                } else {
                    Class[] interfaces = x10.l().getInterfaces();
                    C17542s.i(interfaces, "getInterfaces(...)");
                    int u02 = C16870n.u0(interfaces, q10);
                    if (u02 >= 0) {
                        Type type = x10.l().getGenericInterfaces()[u02];
                        C17542s.g(type);
                        return type;
                    }
                    throw new Y0("No superclass of " + aVar + " in Java reflection for " + e10);
                }
            } else {
                throw new Y0("Supertype not a class: " + e10);
            }
        }

        /* access modifiers changed from: private */
        public static final Type f0() {
            return Object.class;
        }

        /* access modifiers changed from: private */
        public static final List g0(a aVar, C18621X x10) {
            List<n0> t10 = aVar.N().t();
            C17542s.i(t10, "getDeclaredTypeParameters(...)");
            Iterable<n0> iterable = t10;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (n0 n0Var : iterable) {
                C17542s.g(n0Var);
                arrayList.add(new W0(x10, n0Var));
            }
            return arrayList;
        }

        /* access modifiers changed from: private */
        public static final List x(a aVar) {
            return C16877v.V0(aVar.H(), aVar.I());
        }

        /* access modifiers changed from: private */
        public static final List y(a aVar) {
            return C16877v.V0(aVar.L(), aVar.O());
        }

        /* access modifiers changed from: private */
        public static final List z(a aVar) {
            return C16877v.V0(aVar.M(), aVar.P());
        }

        public final Collection<C18599A<?>> H() {
            Object b10 = this.f152372r.b(this, f152357w[13]);
            C17542s.i(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final Collection<C18599A<?>> I() {
            Object b10 = this.f152373s.b(this, f152357w[14]);
            C17542s.i(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final List<Annotation> J() {
            Object b10 = this.f152359e.b(this, f152357w[1]);
            C17542s.i(b10, "getValue(...)");
            return (List) b10;
        }

        public final Collection<C18059h<T>> K() {
            Object b10 = this.f152362h.b(this, f152357w[4]);
            C17542s.i(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final Collection<C18599A<?>> L() {
            Object b10 = this.f152368n.b(this, f152357w[9]);
            C17542s.i(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final C15558e N() {
            Object b10 = this.f152358d.b(this, f152357w[0]);
            C17542s.i(b10, "getValue(...)");
            return (C15558e) b10;
        }

        public final Collection<C18055d<?>> Q() {
            Object b10 = this.f152363i.b(this, f152357w[5]);
            C17542s.i(b10, "getValue(...)");
            return (Collection) b10;
        }

        public final T R() {
            return this.f152364j.getValue();
        }

        public final String S() {
            return (String) this.f152361g.b(this, f152357w[3]);
        }

        public final List<C18055d<? extends T>> T() {
            Object b10 = this.f152367m.b(this, f152357w[8]);
            C17542s.i(b10, "getValue(...)");
            return (List) b10;
        }

        public final String U() {
            return (String) this.f152360f.b(this, f152357w[2]);
        }

        public final List<C18068q> V() {
            Object b10 = this.f152366l.b(this, f152357w[7]);
            C17542s.i(b10, "getValue(...)");
            return (List) b10;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.X$b */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f152377a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                WI.a$a[] r0 = WI.C16730a.C3422a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                WI.a$a r1 = WI.C16730a.C3422a.FILE_FACADE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                WI.a$a r1 = WI.C16730a.C3422a.MULTIFILE_CLASS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                WI.a$a r1 = WI.C16730a.C3422a.MULTIFILE_CLASS_PART     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                WI.a$a r1 = WI.C16730a.C3422a.SYNTHETIC_CLASS     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                WI.a$a r1 = WI.C16730a.C3422a.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                WI.a$a r1 = WI.C16730a.C3422a.CLASS     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f152377a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xI.C18621X.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0014¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"xI/X$c", "LnJ/f;", "", "LDI/z;", "j", "()Ljava/util/List;", "kotlin-reflection"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.X$c */
    public static final class c extends C17651f {
        c(C15741k kVar, C17994n nVar) {
            super(nVar, kVar);
        }

        /* access modifiers changed from: protected */
        public List<C15579z> j() {
            return C16877v.n();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: xI.X$d */
    /* synthetic */ class d extends C17540p implements p<C17798K, n, a0> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f152378a = new d();

        d() {
            super(2, C17798K.class, "loadProperty", "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0);
        }

        /* renamed from: t */
        public final a0 invoke(C17798K k10, n nVar) {
            C17542s.j(k10, "p0");
            C17542s.j(nVar, "p1");
            return k10.u(nVar);
        }
    }

    public C18621X(Class<T> cls) {
        C17542s.j(cls, "jClass");
        this.f152355d = cls;
    }

    private final C15558e b0(C17065b bVar, C15902k kVar) {
        C15741k kVar2 = new C15741k(new C15746p(kVar.b(), bVar.f()), bVar.h(), C15535F.FINAL, C15559f.CLASS, C16877v.e(kVar.b().p().h().r()), i0.f133841a, false, kVar.a().u());
        kVar2.K0(new c(kVar2, kVar.a().u()), g0.d(), (C15557d) null);
        return kVar2;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
        r0 = r0.b();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final DI.C15558e c0(cJ.C17065b r5, II.C15902k r6) {
        /*
            r4 = this;
            java.lang.Class r0 = r4.l()
            boolean r0 = r0.isSynthetic()
            if (r0 == 0) goto L_0x000f
            DI.e r5 = r4.b0(r5, r6)
            return r5
        L_0x000f:
            II.f$a r0 = II.C15897f.f135483c
            java.lang.Class r1 = r4.l()
            II.f r0 = r0.a(r1)
            if (r0 == 0) goto L_0x0026
            WI.a r0 = r0.b()
            if (r0 == 0) goto L_0x0026
            WI.a$a r0 = r0.c()
            goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            if (r0 != 0) goto L_0x002b
            r1 = -1
            goto L_0x0033
        L_0x002b:
            int[] r1 = xI.C18621X.b.f152377a
            int r2 = r0.ordinal()
            r1 = r1[r2]
        L_0x0033:
            r2 = 41
            java.lang.String r3 = " (kind = "
            switch(r1) {
                case -1: goto L_0x0069;
                case 0: goto L_0x003a;
                case 1: goto L_0x0064;
                case 2: goto L_0x0064;
                case 3: goto L_0x0064;
                case 4: goto L_0x0064;
                case 5: goto L_0x0040;
                case 6: goto L_0x0069;
                default: goto L_0x003a;
            }
        L_0x003a:
            XH.t r5 = new XH.t
            r5.<init>()
            throw r5
        L_0x0040:
            xI.Y0 r5 = new xI.Y0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Unknown class: "
            r6.append(r1)
            java.lang.Class r1 = r4.l()
            r6.append(r1)
            r6.append(r3)
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0064:
            DI.e r5 = r4.b0(r5, r6)
            return r5
        L_0x0069:
            xI.Y0 r5 = new xI.Y0
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Unresolved class: "
            r6.append(r1)
            java.lang.Class r1 = r4.l()
            r6.append(r1)
            r6.append(r3)
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xI.C18621X.c0(cJ.b, II.k):DI.e");
    }

    /* access modifiers changed from: private */
    public static final a d0(C18621X x10) {
        return new a();
    }

    /* access modifiers changed from: private */
    public final C17065b e0() {
        return f1.f152407a.c(l());
    }

    public Collection<C15565l> N() {
        C15558e h02 = getDescriptor();
        if (h02.h() == C15559f.INTERFACE || h02.h() == C15559f.OBJECT) {
            return C16877v.n();
        }
        Collection<C15557d> l10 = h02.l();
        C17542s.i(l10, "getConstructors(...)");
        return l10;
    }

    public Collection<C15579z> O(C17069f fVar) {
        C17542s.j(fVar, "name");
        C17656k i02 = i0();
        LI.d dVar = LI.d.FROM_REFLECTION;
        return C16877v.V0(i02.d(fVar, dVar), j0().d(fVar, dVar));
    }

    public a0 P(int i10) {
        Class<?> declaringClass;
        if (!C17542s.e(l().getSimpleName(), "DefaultImpls") || (declaringClass = l().getDeclaringClass()) == null || !declaringClass.isInterface()) {
            C15558e h02 = getDescriptor();
            C17936m mVar = h02 instanceof C17936m ? (C17936m) h02 : null;
            if (mVar == null) {
                return null;
            }
            C16830c e12 = mVar.e1();
            C17198i.f<C16830c, List<n>> fVar = C17030a.f140996j;
            C17542s.i(fVar, "classLocalVariable");
            n nVar = (n) e.b(e12, fVar, i10);
            if (nVar != null) {
                return (a0) j1.h(l(), nVar, mVar.d1().g(), mVar.d1().j(), mVar.g1(), d.f152378a);
            }
            return null;
        }
        C18055d<?> e10 = C17603a.e(declaringClass);
        C17542s.h(e10, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
        return ((C18621X) e10).P(i10);
    }

    public Collection<a0> S(C17069f fVar) {
        C17542s.j(fVar, "name");
        C17656k i02 = i0();
        LI.d dVar = LI.d.FROM_REFLECTION;
        return C16877v.V0(i02.b(fVar, dVar), j0().b(fVar, dVar));
    }

    public List<C18068q> a() {
        return this.f152356e.getValue().V();
    }

    public boolean c() {
        return getDescriptor().u() == C15535F.SEALED;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C18621X) && C17542s.e(C17603a.c(this), C17603a.c((C18055d) obj));
    }

    public String f() {
        return this.f152356e.getValue().U();
    }

    public Collection<C18059h<T>> f0() {
        return this.f152356e.getValue().K();
    }

    public final C16824o<C18621X<T>.defpackage.a> g0() {
        return this.f152356e;
    }

    public List<Annotation> getAnnotations() {
        return this.f152356e.getValue().J();
    }

    /* renamed from: h0 */
    public C15558e getDescriptor() {
        return this.f152356e.getValue().N();
    }

    public int hashCode() {
        return C17603a.c(this).hashCode();
    }

    public final C17656k i0() {
        return getDescriptor().r().q();
    }

    public boolean isAbstract() {
        return getDescriptor().u() == C15535F.ABSTRACT;
    }

    public Collection<C18055d<?>> j() {
        return this.f152356e.getValue().Q();
    }

    public final C17656k j0() {
        C17656k o02 = getDescriptor().o0();
        C17542s.i(o02, "getStaticScope(...)");
        return o02;
    }

    public Class<T> l() {
        return this.f152355d;
    }

    public List<C18055d<? extends T>> m() {
        return this.f152356e.getValue().T();
    }

    public boolean n() {
        return getDescriptor().n();
    }

    public T p() {
        return this.f152356e.getValue().R();
    }

    public boolean s(Object obj) {
        Integer g10 = C15965f.g(l());
        if (g10 != null) {
            return W.o(obj, g10.intValue());
        }
        Class<?> k10 = C15965f.k(l());
        if (k10 == null) {
            k10 = l();
        }
        return k10.isInstance(obj);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("class ");
        C17065b e02 = e0();
        C17066c f10 = e02.f();
        if (f10.c()) {
            str = "";
        } else {
            str = f10.a() + '.';
        }
        sb2.append(str + C15854t.P(e02.g().a(), '.', '$', false, 4, (Object) null));
        return sb2.toString();
    }

    public String u() {
        return this.f152356e.getValue().S();
    }

    public boolean v() {
        return getDescriptor().v();
    }
}
