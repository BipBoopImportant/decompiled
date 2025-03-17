package vI;

import DI.C15565l;
import DI.C15579z;
import EJ.C15661b;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import uI.C18055d;
import uI.C18057f;
import uI.C18059h;
import uI.C18066o;
import uI.C18068q;
import xI.C18599A;
import xI.C18621X;
import xI.C18639i0;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\u001a#\u0010\u0003\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"6\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0007\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t\">\u0010\u0012\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u000e0\r\"\b\b\u0000\u0010\u0006*\u00020\u0005*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u000f\u0010\u0010\"\u001c\u0010\u0016\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\"\u001c\u0010\u0018\u001a\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00138BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015\",\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000\u0019*\u0006\u0012\u0002\b\u00030\u00008FX\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"LuI/d;", "base", "", "h", "(LuI/d;LuI/d;)Z", "", "T", "LuI/h;", "d", "(LuI/d;)LuI/h;", "getPrimaryConstructor$annotations", "(LuI/d;)V", "primaryConstructor", "", "LuI/o;", "c", "(LuI/d;)Ljava/util/Collection;", "getMemberProperties$annotations", "memberProperties", "LxI/A;", "f", "(LxI/A;)Z", "isExtension", "g", "isNotExtension", "", "e", "(LuI/d;)Ljava/util/List;", "getSuperclasses$annotations", "superclasses", "kotlin-reflection"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: vI.e  reason: case insensitive filesystem */
public final class C18192e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: vI.e$a */
    /* synthetic */ class a extends G {

        /* renamed from: b  reason: collision with root package name */
        public static final a f149040b = new a();

        a() {
            super(C18192e.class, "superclasses", "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;", 1);
        }

        public Object get(Object obj) {
            return C18192e.e((C18055d) obj);
        }
    }

    public static final <T> Collection<C18066o<T, ?>> c(C18055d<T> dVar) {
        C17542s.j(dVar, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : ((C18621X) dVar).g0().getValue().H()) {
            C18599A a10 = (C18599A) next;
            if (g(a10) && (a10 instanceof C18066o)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final <T> C18059h<T> d(C18055d<T> dVar) {
        Object obj;
        C17542s.j(dVar, "<this>");
        Iterator it = ((C18621X) dVar).f0().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C18059h hVar = (C18059h) obj;
            C17542s.h(hVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            C15579z t02 = ((C18639i0) hVar).d0();
            C17542s.h(t02, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((C15565l) t02).d0()) {
                break;
            }
        }
        return (C18059h) obj;
    }

    public static final List<C18055d<?>> e(C18055d<?> dVar) {
        C17542s.j(dVar, "<this>");
        ArrayList arrayList = new ArrayList();
        for (C18068q e10 : dVar.a()) {
            C18057f e11 = e10.e();
            C18055d dVar2 = e11 instanceof C18055d ? (C18055d) e11 : null;
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    private static final boolean f(C18599A<?> a10) {
        return a10.d0().O() != null;
    }

    private static final boolean g(C18599A<?> a10) {
        return !f(a10);
    }

    public static final boolean h(C18055d<?> dVar, C18055d<?> dVar2) {
        C17542s.j(dVar, "<this>");
        C17542s.j(dVar2, "base");
        return C17542s.e(dVar, dVar2) || C15661b.e(C16877v.e(dVar), new C18190c(a.f149040b), new C18191d(dVar2)).booleanValue();
    }

    /* access modifiers changed from: private */
    public static final Iterable i(C18066o oVar, C18055d dVar) {
        return (Iterable) oVar.invoke(dVar);
    }

    /* access modifiers changed from: private */
    public static final Boolean j(C18055d dVar, C18055d dVar2) {
        return Boolean.valueOf(C17542s.e(dVar2, dVar));
    }
}
