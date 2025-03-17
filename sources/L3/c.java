package l3;

import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import n3.g;
import n3.h;
import nI.C17642l;
import uI.C18055d;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Ll3/c;", "", "<init>", "()V", "Landroidx/lifecycle/f0;", "T", "LuI/d;", "clazz", "Lkotlin/Function1;", "Ll3/a;", "initializer", "LXH/N;", "a", "(LuI/d;LnI/l;)V", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;", "", "Ll3/f;", "Ljava/util/Map;", "initializers", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<C18055d<?>, f<?>> f25488a = new LinkedHashMap();

    public final <T extends f0> void a(C18055d<T> dVar, C17642l<? super a, ? extends T> lVar) {
        C17542s.j(dVar, "clazz");
        C17542s.j(lVar, "initializer");
        if (!this.f25488a.containsKey(dVar)) {
            this.f25488a.put(dVar, new f(dVar, lVar));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + h.a(dVar) + '.').toString());
    }

    public final i0.c b() {
        return g.f26584a.a(this.f25488a.values());
    }
}
