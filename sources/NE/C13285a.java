package NE;

import ME.c;
import YH.C16865i;
import YH.C16877v;
import com.squareup.moshi.f;
import com.squareup.moshi.h;
import com.squareup.moshi.k;
import com.squareup.moshi.q;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18059h;
import uI.C18062k;
import uI.C18063l;
import uI.C18066o;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0002\u001b\u001fBW\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u0005\u0012\u001a\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR-\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R+\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u00058\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"LNE/a;", "T", "Lcom/squareup/moshi/f;", "LuI/h;", "constructor", "", "LNE/a$a;", "", "allBindings", "nonIgnoredBindings", "Lcom/squareup/moshi/k$a;", "options", "<init>", "(LuI/h;Ljava/util/List;Ljava/util/List;Lcom/squareup/moshi/k$a;)V", "Lcom/squareup/moshi/k;", "reader", "fromJson", "(Lcom/squareup/moshi/k;)Ljava/lang/Object;", "Lcom/squareup/moshi/q;", "writer", "value", "LXH/N;", "toJson", "(Lcom/squareup/moshi/q;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "a", "LuI/h;", "getConstructor", "()LuI/h;", "b", "Ljava/util/List;", "getAllBindings", "()Ljava/util/List;", "c", "getNonIgnoredBindings", "d", "Lcom/squareup/moshi/k$a;", "getOptions", "()Lcom/squareup/moshi/k$a;", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: NE.a  reason: case insensitive filesystem */
public final class C13285a<T> extends f<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C18059h<T> f112440a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C2764a<T, Object>> f112441b;

    /* renamed from: c  reason: collision with root package name */
    private final List<C2764a<T, Object>> f112442c;

    /* renamed from: d  reason: collision with root package name */
    private final k.a f112443d;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000*\u0004\b\u0001\u0010\u0001*\u0004\b\u0002\u0010\u00022\u00020\u0003BC\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00028\u00022\u0006\u0010\u0010\u001a\u00028\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00028\u0002¢\u0006\u0004\b\u0015\u0010\u0016Jb\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00062\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010\u001c¨\u0006/"}, d2 = {"LNE/a$a;", "K", "P", "", "", "jsonName", "Lcom/squareup/moshi/f;", "adapter", "LuI/o;", "property", "LuI/l;", "parameter", "", "propertyIndex", "<init>", "(Ljava/lang/String;Lcom/squareup/moshi/f;LuI/o;LuI/l;I)V", "value", "c", "(Ljava/lang/Object;)Ljava/lang/Object;", "result", "LXH/N;", "h", "(Ljava/lang/Object;Ljava/lang/Object;)V", "a", "(Ljava/lang/String;Lcom/squareup/moshi/f;LuI/o;LuI/l;I)LNE/a$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "e", "b", "Lcom/squareup/moshi/f;", "d", "()Lcom/squareup/moshi/f;", "LuI/o;", "f", "()LuI/o;", "LuI/l;", "getParameter", "()LuI/l;", "I", "g", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NE.a$a  reason: collision with other inner class name */
    public static final class C2764a<K, P> {

        /* renamed from: a  reason: collision with root package name */
        private final String f112444a;

        /* renamed from: b  reason: collision with root package name */
        private final f<P> f112445b;

        /* renamed from: c  reason: collision with root package name */
        private final C18066o<K, P> f112446c;

        /* renamed from: d  reason: collision with root package name */
        private final C18063l f112447d;

        /* renamed from: e  reason: collision with root package name */
        private final int f112448e;

        public C2764a(String str, f<P> fVar, C18066o<K, ? extends P> oVar, C18063l lVar, int i10) {
            C17542s.j(str, "jsonName");
            C17542s.j(fVar, "adapter");
            C17542s.j(oVar, "property");
            this.f112444a = str;
            this.f112445b = fVar;
            this.f112446c = oVar;
            this.f112447d = lVar;
            this.f112448e = i10;
        }

        public static /* synthetic */ C2764a b(C2764a aVar, String str, f<P> fVar, C18066o<K, P> oVar, C18063l lVar, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = aVar.f112444a;
            }
            if ((i11 & 2) != 0) {
                fVar = aVar.f112445b;
            }
            f<P> fVar2 = fVar;
            if ((i11 & 4) != 0) {
                oVar = aVar.f112446c;
            }
            C18066o<K, P> oVar2 = oVar;
            if ((i11 & 8) != 0) {
                lVar = aVar.f112447d;
            }
            C18063l lVar2 = lVar;
            if ((i11 & 16) != 0) {
                i10 = aVar.f112448e;
            }
            return aVar.a(str, fVar2, oVar2, lVar2, i10);
        }

        public final C2764a<K, P> a(String str, f<P> fVar, C18066o<K, ? extends P> oVar, C18063l lVar, int i10) {
            C17542s.j(str, "jsonName");
            C17542s.j(fVar, "adapter");
            C17542s.j(oVar, "property");
            return new C2764a(str, fVar, oVar, lVar, i10);
        }

        public final P c(K k10) {
            return this.f112446c.get(k10);
        }

        public final f<P> d() {
            return this.f112445b;
        }

        public final String e() {
            return this.f112444a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C2764a)) {
                return false;
            }
            C2764a aVar = (C2764a) obj;
            return C17542s.e(this.f112444a, aVar.f112444a) && C17542s.e(this.f112445b, aVar.f112445b) && C17542s.e(this.f112446c, aVar.f112446c) && C17542s.e(this.f112447d, aVar.f112447d) && this.f112448e == aVar.f112448e;
        }

        public final C18066o<K, P> f() {
            return this.f112446c;
        }

        public final int g() {
            return this.f112448e;
        }

        public final void h(K k10, P p10) {
            if (p10 != c.f112452b) {
                C18066o<K, P> oVar = this.f112446c;
                C17542s.h(oVar, "null cannot be cast to non-null type kotlin.reflect.KMutableProperty1<K of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding, P of com.squareup.moshi.kotlin.reflect.KotlinJsonAdapter.Binding>");
                ((C18062k) oVar).r(k10, p10);
            }
        }

        public int hashCode() {
            int hashCode = ((((this.f112444a.hashCode() * 31) + this.f112445b.hashCode()) * 31) + this.f112446c.hashCode()) * 31;
            C18063l lVar = this.f112447d;
            return ((hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31) + Integer.hashCode(this.f112448e);
        }

        public String toString() {
            return "Binding(jsonName=" + this.f112444a + ", adapter=" + this.f112445b + ", property=" + this.f112446c + ", parameter=" + this.f112447d + ", propertyIndex=" + this.f112448e + ')';
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B%\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R(\u0010\u001a\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00180\u00178VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0019¨\u0006\u001b"}, d2 = {"LNE/a$b;", "LYH/i;", "LuI/l;", "", "", "parameterKeys", "", "parameterValues", "<init>", "(Ljava/util/List;[Ljava/lang/Object;)V", "key", "value", "k", "(LuI/l;Ljava/lang/Object;)Ljava/lang/Object;", "", "f", "(LuI/l;)Z", "h", "(LuI/l;)Ljava/lang/Object;", "a", "Ljava/util/List;", "b", "[Ljava/lang/Object;", "", "", "()Ljava/util/Set;", "entries", "moshi-kotlin"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: NE.a$b */
    public static final class b extends C16865i<C18063l, Object> {

        /* renamed from: a  reason: collision with root package name */
        private final List<C18063l> f112449a;

        /* renamed from: b  reason: collision with root package name */
        private final Object[] f112450b;

        public b(List<? extends C18063l> list, Object[] objArr) {
            C17542s.j(list, "parameterKeys");
            C17542s.j(objArr, "parameterValues");
            this.f112449a = list;
            this.f112450b = objArr;
        }

        public Set<Map.Entry<C18063l, Object>> b() {
            Iterable iterable = this.f112449a;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            int i10 = 0;
            for (Object next : iterable) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                arrayList.add(new AbstractMap.SimpleEntry((C18063l) next, this.f112450b[i10]));
                i10 = i11;
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next2 : arrayList) {
                if (((AbstractMap.SimpleEntry) next2).getValue() != c.f112452b) {
                    linkedHashSet.add(next2);
                }
            }
            return linkedHashSet;
        }

        public final /* bridge */ boolean containsKey(Object obj) {
            if (!(obj instanceof C18063l)) {
                return false;
            }
            return f((C18063l) obj);
        }

        public boolean f(C18063l lVar) {
            C17542s.j(lVar, "key");
            return this.f112450b[lVar.getIndex()] != c.f112452b;
        }

        public final /* bridge */ Object get(Object obj) {
            if (!(obj instanceof C18063l)) {
                return null;
            }
            return h((C18063l) obj);
        }

        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof C18063l) ? obj2 : i((C18063l) obj, obj2);
        }

        public Object h(C18063l lVar) {
            C17542s.j(lVar, "key");
            Object obj = this.f112450b[lVar.getIndex()];
            if (obj != c.f112452b) {
                return obj;
            }
            return null;
        }

        public /* bridge */ Object i(C18063l lVar, Object obj) {
            return super.getOrDefault(lVar, obj);
        }

        /* renamed from: k */
        public Object put(C18063l lVar, Object obj) {
            C17542s.j(lVar, "key");
            return null;
        }

        public /* bridge */ Object l(C18063l lVar) {
            return super.remove(lVar);
        }

        public /* bridge */ boolean m(C18063l lVar, Object obj) {
            return super.remove(lVar, obj);
        }

        public final /* bridge */ Object remove(Object obj) {
            if (!(obj instanceof C18063l)) {
                return null;
            }
            return l((C18063l) obj);
        }

        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if (!(obj instanceof C18063l)) {
                return false;
            }
            return m((C18063l) obj, obj2);
        }
    }

    public C13285a(C18059h<? extends T> hVar, List<C2764a<T, Object>> list, List<C2764a<T, Object>> list2, k.a aVar) {
        C17542s.j(hVar, "constructor");
        C17542s.j(list, "allBindings");
        C17542s.j(list2, "nonIgnoredBindings");
        C17542s.j(aVar, "options");
        this.f112440a = hVar;
        this.f112441b = list;
        this.f112442c = list2;
        this.f112443d = aVar;
    }

    public T fromJson(k kVar) {
        C17542s.j(kVar, "reader");
        int size = this.f112440a.getParameters().size();
        int size2 = this.f112441b.size();
        Object[] objArr = new Object[size2];
        for (int i10 = 0; i10 < size2; i10++) {
            objArr[i10] = c.f112452b;
        }
        kVar.d();
        while (kVar.hasNext()) {
            int s10 = kVar.s(this.f112443d);
            if (s10 == -1) {
                kVar.w();
                kVar.a0();
            } else {
                C2764a aVar = this.f112442c.get(s10);
                int g10 = aVar.g();
                if (objArr[g10] == c.f112452b) {
                    Object fromJson = aVar.d().fromJson(kVar);
                    objArr[g10] = fromJson;
                    if (fromJson == null && !aVar.f().getReturnType().k()) {
                        h w10 = c.w(aVar.f().getName(), aVar.e(), kVar);
                        C17542s.i(w10, "unexpectedNull(\n        …         reader\n        )");
                        throw w10;
                    }
                } else {
                    throw new h("Multiple values for '" + aVar.f().getName() + "' at " + kVar.m());
                }
            }
        }
        kVar.f();
        boolean z10 = this.f112441b.size() == size;
        for (int i11 = 0; i11 < size; i11++) {
            if (objArr[i11] == c.f112452b) {
                if (this.f112440a.getParameters().get(i11).B()) {
                    z10 = false;
                } else {
                    String str = null;
                    if (this.f112440a.getParameters().get(i11).getType().k()) {
                        objArr[i11] = null;
                    } else {
                        String name = this.f112440a.getParameters().get(i11).getName();
                        C2764a aVar2 = this.f112441b.get(i11);
                        if (aVar2 != null) {
                            str = aVar2.e();
                        }
                        h n10 = c.n(name, str, kVar);
                        C17542s.i(n10, "missingProperty(\n       …       reader\n          )");
                        throw n10;
                    }
                }
            }
        }
        T call = z10 ? this.f112440a.call(Arrays.copyOf(objArr, size2)) : this.f112440a.callBy(new b(this.f112440a.getParameters(), objArr));
        int size3 = this.f112441b.size();
        while (size < size3) {
            C2764a<T, Object> aVar3 = this.f112441b.get(size);
            C17542s.g(aVar3);
            aVar3.h(call, objArr[size]);
            size++;
        }
        return call;
    }

    public void toJson(q qVar, T t10) {
        C17542s.j(qVar, "writer");
        if (t10 != null) {
            qVar.d();
            for (C2764a next : this.f112441b) {
                if (next != null) {
                    qVar.n(next.e());
                    next.d().toJson(qVar, next.c(t10));
                }
            }
            qVar.g();
            return;
        }
        throw new NullPointerException("value == null");
    }

    public String toString() {
        return "KotlinJsonAdapter(" + this.f112440a.getReturnType() + ')';
    }
}
