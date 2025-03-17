package rL;

import YH.C16877v;
import gL.C17295a;
import jL.C17493b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mL.C17618b;
import mL.C17619c;
import mL.C17620d;
import nL.C17686c;
import oL.C17722a;
import oL.C17723b;
import pL.C17770a;
import qL.C17844a;
import uI.C18055d;
import vL.C18207b;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\b2\u0010\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0016\u001a\u00020\b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J9\u0010 \u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b \u0010!J3\u0010'\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010&\u001a\u00020$H\u0000¢\u0006\u0004\b'\u0010(J=\u0010,\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010)2\b\u0010%\u001a\u0004\u0018\u00010$2\n\u0010#\u001a\u0006\u0012\u0002\b\u00030\"2\u0006\u0010&\u001a\u00020$2\u0006\u0010+\u001a\u00020*H\u0000¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u00103R(\u00106\u001a\u0016\u0012\b\u0012\u00060\u001aj\u0002`\u001b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u00105R8\u0010:\u001a&\u0012\u0004\u0012\u00020.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001007j\u0012\u0012\u0004\u0012\u00020.\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0010`88\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u00109¨\u0006;"}, d2 = {"LrL/a;", "", "LgL/a;", "_koin", "<init>", "(LgL/a;)V", "LoL/a;", "module", "LXH/N;", "a", "(LoL/a;)V", "", "allowOverride", "d", "(LoL/a;Z)V", "", "LmL/d;", "instances", "c", "(Ljava/util/Collection;)V", "", "modules", "e", "(Ljava/util/Set;Z)V", "b", "()V", "", "Lorg/koin/core/definition/IndexKey;", "mapping", "LmL/c;", "factory", "logWarning", "h", "(ZLjava/lang/String;LmL/c;Z)V", "LuI/d;", "clazz", "LqL/a;", "qualifier", "scopeQualifier", "f", "(LuI/d;LqL/a;LqL/a;)LmL/c;", "T", "LmL/b;", "instanceContext", "g", "(LqL/a;LuI/d;LqL/a;LmL/b;)Ljava/lang/Object;", "", "j", "()I", "LgL/a;", "get_koin", "()LgL/a;", "", "Ljava/util/Map;", "_instances", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "eagerInstances", "koin-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rL.a  reason: case insensitive filesystem */
public final class C17880a {

    /* renamed from: a  reason: collision with root package name */
    private final C17295a f146875a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, C17619c<?>> f146876b = C18207b.f149085a.f();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<Integer, C17620d<?>> f146877c = new HashMap<>();

    public C17880a(C17295a aVar) {
        C17542s.j(aVar, "_koin");
        this.f146875a = aVar;
    }

    private final void a(C17722a aVar) {
        for (C17620d dVar : aVar.a()) {
            this.f146877c.put(Integer.valueOf(dVar.hashCode()), dVar);
        }
    }

    private final void c(Collection<? extends C17620d<?>> collection) {
        C17618b bVar = new C17618b(this.f146875a.c(), this.f146875a.d().b(), (C17770a) null, 4, (DefaultConstructorMarker) null);
        for (C17620d b10 : collection) {
            b10.b(bVar);
        }
    }

    private final void d(C17722a aVar, boolean z10) {
        for (Map.Entry next : aVar.c().entrySet()) {
            i(this, z10, (String) next.getKey(), (C17619c) next.getValue(), false, 8, (Object) null);
        }
    }

    public static /* synthetic */ void i(C17880a aVar, boolean z10, String str, C17619c cVar, boolean z11, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z11 = true;
        }
        aVar.h(z10, str, cVar, z11);
    }

    public final void b() {
        Collection<C17620d<?>> values = this.f146877c.values();
        C17542s.i(values, "<get-values>(...)");
        C17620d[] dVarArr = (C17620d[]) values.toArray(new C17620d[0]);
        ArrayList h10 = C16877v.h(Arrays.copyOf(dVarArr, dVarArr.length));
        this.f146877c.clear();
        c(h10);
    }

    public final void e(Set<C17722a> set, boolean z10) {
        C17542s.j(set, "modules");
        for (C17722a aVar : set) {
            d(aVar, z10);
            a(aVar);
        }
    }

    public final C17619c<?> f(C18055d<?> dVar, C17844a aVar, C17844a aVar2) {
        C17542s.j(dVar, "clazz");
        C17542s.j(aVar2, "scopeQualifier");
        return this.f146876b.get(C17493b.a(dVar, aVar, aVar2));
    }

    public final <T> T g(C17844a aVar, C18055d<?> dVar, C17844a aVar2, C17618b bVar) {
        C17542s.j(dVar, "clazz");
        C17542s.j(aVar2, "scopeQualifier");
        C17542s.j(bVar, "instanceContext");
        C17619c<?> f10 = f(dVar, aVar, aVar2);
        T b10 = f10 != null ? f10.b(bVar) : null;
        if (b10 == null) {
            return null;
        }
        return b10;
    }

    public final void h(boolean z10, String str, C17619c<?> cVar, boolean z11) {
        C17542s.j(str, "mapping");
        C17542s.j(cVar, "factory");
        if (this.f146876b.containsKey(str)) {
            if (!z10) {
                C17723b.c(cVar, str);
            } else if (z11) {
                C17686c c10 = this.f146875a.c();
                c10.h("(+) override index '" + str + "' -> '" + cVar.c() + '\'');
            }
        }
        C17686c c11 = this.f146875a.c();
        c11.a("(+) index '" + str + "' -> '" + cVar.c() + '\'');
        this.f146876b.put(str, cVar);
    }

    public final int j() {
        return this.f146876b.size();
    }
}
