package vH;

import JH.C15954a;
import JH.C15955b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pH.C17746a;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\b\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\b\u0010\u0007\" \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"", "B", "F", "LpH/a;", "LvH/m;", "plugin", "c", "(LpH/a;LvH/m;)Ljava/lang/Object;", "b", "LJH/a;", "LJH/b;", "a", "LJH/a;", "()LJH/a;", "PLUGIN_INSTALLED_LIST", "ktor-client-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: vH.n  reason: case insensitive filesystem */
public final class C18175n {

    /* renamed from: a  reason: collision with root package name */
    private static final C15954a<C15955b> f148941a = new C15954a<>("ApplicationPluginRegistry");

    public static final C15954a<C15955b> a() {
        return f148941a;
    }

    public static final <B, F> F b(C17746a aVar, C18174m<? extends B, F> mVar) {
        C17542s.j(aVar, "<this>");
        C17542s.j(mVar, "plugin");
        F c10 = c(aVar, mVar);
        if (c10 != null) {
            return c10;
        }
        throw new IllegalStateException("Plugin " + mVar + " is not installed. Consider using `install(" + mVar.getKey() + ")` in client config first.");
    }

    public static final <B, F> F c(C17746a aVar, C18174m<? extends B, F> mVar) {
        C17542s.j(aVar, "<this>");
        C17542s.j(mVar, "plugin");
        C15955b bVar = (C15955b) aVar.getAttributes().e(f148941a);
        if (bVar != null) {
            return bVar.e(mVar.getKey());
        }
        return null;
    }
}
