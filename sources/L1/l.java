package L1;

import XH.C16818i;
import androidx.compose.ui.platform.C5143y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import oI.C17693a;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R&\u00100\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00105\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0016\u00101\u001a\u0004\b2\u0010\u001c\"\u0004\b3\u00104R\"\u00109\u001a\u00020\u00188\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u00101\u001a\u0004\b7\u0010\u001c\"\u0004\b8\u00104¨\u0006:"}, d2 = {"LL1/l;", "LL1/x;", "", "", "LL1/w;", "", "<init>", "()V", "T", "key", "q", "(LL1/w;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "s", "(LL1/w;LnI/a;)Ljava/lang/Object;", "t", "", "iterator", "()Ljava/util/Iterator;", "value", "LXH/N;", "b", "(LL1/w;Ljava/lang/Object;)V", "", "k", "(LL1/w;)Z", "m", "()Z", "child", "B", "(LL1/l;)V", "peer", "i", "p", "()LL1/l;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/util/Map;", "props", "Z", "A", "D", "(Z)V", "isMergingSemanticsOfDescendants", "c", "x", "C", "isClearingSemantics", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class l implements x, Iterable<Map.Entry<? extends w<?>, ? extends Object>>, C17693a {

    /* renamed from: a  reason: collision with root package name */
    private final Map<w<?>, Object> f8979a = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private boolean f8980b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f8981c;

    public final boolean A() {
        return this.f8980b;
    }

    public final void B(l lVar) {
        for (Map.Entry next : lVar.f8979a.entrySet()) {
            w wVar = (w) next.getKey();
            Object value = next.getValue();
            Object obj = this.f8979a.get(wVar);
            C17542s.h(wVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
            Object c10 = wVar.c(obj, value);
            if (c10 != null) {
                this.f8979a.put(wVar, c10);
            }
        }
    }

    public final void C(boolean z10) {
        this.f8981c = z10;
    }

    public final void D(boolean z10) {
        this.f8980b = z10;
    }

    public <T> void b(w<T> wVar, T t10) {
        if (!(t10 instanceof a) || !k(wVar)) {
            this.f8979a.put(wVar, t10);
            return;
        }
        Object obj = this.f8979a.get(wVar);
        C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
        a aVar = (a) obj;
        Map<w<?>, Object> map = this.f8979a;
        a aVar2 = (a) t10;
        String b10 = aVar2.b();
        if (b10 == null) {
            b10 = aVar.b();
        }
        C16818i a10 = aVar2.a();
        if (a10 == null) {
            a10 = aVar.a();
        }
        map.put(wVar, new a(b10, a10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return C17542s.e(this.f8979a, lVar.f8979a) && this.f8980b == lVar.f8980b && this.f8981c == lVar.f8981c;
    }

    public int hashCode() {
        return (((this.f8979a.hashCode() * 31) + Boolean.hashCode(this.f8980b)) * 31) + Boolean.hashCode(this.f8981c);
    }

    public final void i(l lVar) {
        if (lVar.f8980b) {
            this.f8980b = true;
        }
        if (lVar.f8981c) {
            this.f8981c = true;
        }
        for (Map.Entry next : lVar.f8979a.entrySet()) {
            w wVar = (w) next.getKey();
            Object value = next.getValue();
            if (!this.f8979a.containsKey(wVar)) {
                this.f8979a.put(wVar, value);
            } else if (value instanceof a) {
                Object obj = this.f8979a.get(wVar);
                C17542s.h(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                a aVar = (a) obj;
                Map<w<?>, Object> map = this.f8979a;
                String b10 = aVar.b();
                if (b10 == null) {
                    b10 = ((a) value).b();
                }
                C16818i a10 = aVar.a();
                if (a10 == null) {
                    a10 = ((a) value).a();
                }
                map.put(wVar, new a(b10, a10));
            }
        }
    }

    public Iterator<Map.Entry<w<?>, Object>> iterator() {
        return this.f8979a.entrySet().iterator();
    }

    public final <T> boolean k(w<T> wVar) {
        return this.f8979a.containsKey(wVar);
    }

    public final boolean m() {
        Iterable<w> keySet = this.f8979a.keySet();
        if ((keySet instanceof Collection) && ((Collection) keySet).isEmpty()) {
            return false;
        }
        for (w b10 : keySet) {
            if (b10.b()) {
                return true;
            }
        }
        return false;
    }

    public final l p() {
        l lVar = new l();
        lVar.f8980b = this.f8980b;
        lVar.f8981c = this.f8981c;
        lVar.f8979a.putAll(this.f8979a);
        return lVar;
    }

    public final <T> T q(w<T> wVar) {
        T t10 = this.f8979a.get(wVar);
        if (t10 != null) {
            return t10;
        }
        throw new IllegalStateException("Key not present: " + wVar + " - consider getOrElse or getOrNull");
    }

    public final <T> T s(w<T> wVar, C17631a<? extends T> aVar) {
        T t10 = this.f8979a.get(wVar);
        return t10 == null ? aVar.invoke() : t10;
    }

    public final <T> T t(w<T> wVar, C17631a<? extends T> aVar) {
        T t10 = this.f8979a.get(wVar);
        return t10 == null ? aVar.invoke() : t10;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String str = "";
        if (this.f8980b) {
            sb2.append(str);
            sb2.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f8981c) {
            sb2.append(str);
            sb2.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry next : this.f8979a.entrySet()) {
            Object value = next.getValue();
            sb2.append(str);
            sb2.append(((w) next.getKey()).a());
            sb2.append(" : ");
            sb2.append(value);
            str = ", ";
        }
        return C5143y0.a(this, (String) null) + "{ " + sb2 + " }";
    }

    public final boolean x() {
        return this.f8981c;
    }
}
