package x4;

import C4.j;
import YH.X;
import com.google.android.libraries.places.api.model.PlaceTypes;
import fK.z;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18055d;
import uI.C18068q;
import x4.q;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B5\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b¢\u0006\u0004\b\u0002\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u001c\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R&\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u0017\u0010\u001bR.\u0010 \u001a\u0004\u0018\u00010\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b\u0013\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001a\"\u0004\b\u0015\u0010\u001b¨\u0006$"}, d2 = {"Lx4/s;", "", "<init>", "()V", "", "basePath", "LuI/d;", "route", "", "LuI/q;", "Lx4/F;", "typeMap", "(Ljava/lang/String;LuI/d;Ljava/util/Map;)V", "Lx4/q;", "a", "()Lx4/q;", "Lx4/q$a;", "Lx4/q$a;", "builder", "b", "LuI/d;", "c", "Ljava/util/Map;", "d", "Ljava/lang/String;", "getUriPattern", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "uriPattern", "p", "e", "getAction", "action", "f", "getMimeType", "mimeType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s {

    /* renamed from: a  reason: collision with root package name */
    private final q.a f57662a = new q.a();

    /* renamed from: b  reason: collision with root package name */
    private C18055d<?> f57663b;

    /* renamed from: c  reason: collision with root package name */
    private Map<C18068q, ? extends F<?>> f57664c = X.j();

    /* renamed from: d  reason: collision with root package name */
    private String f57665d;

    /* renamed from: e  reason: collision with root package name */
    private String f57666e;

    /* renamed from: f  reason: collision with root package name */
    private String f57667f;

    public s() {
    }

    public final q a() {
        q.a aVar = this.f57662a;
        String str = this.f57665d;
        if (str == null && this.f57666e == null && this.f57667f == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        if (str != null) {
            aVar.d(str);
        }
        String str2 = this.f57666e;
        if (str2 != null) {
            aVar.b(str2);
        }
        String str3 = this.f57667f;
        if (str3 != null) {
            aVar.c(str3);
        }
        return aVar.a();
    }

    public final void b(String str) {
        if (str == null || str.length() != 0) {
            this.f57666e = str;
            return;
        }
        throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
    }

    public final void c(String str) {
        this.f57667f = str;
    }

    public final void d(String str) {
        this.f57665d = str;
    }

    public s(String str, C18055d<?> dVar, Map<C18068q, F<?>> map) {
        C17542s.j(str, "basePath");
        C17542s.j(dVar, PlaceTypes.ROUTE);
        C17542s.j(map, "typeMap");
        if (str.length() > 0) {
            this.f57665d = j.i(z.e(dVar), map, str);
            this.f57663b = dVar;
            this.f57664c = map;
            return;
        }
        throw new IllegalArgumentException("The basePath for NavDeepLink from KClass cannot be empty");
    }
}
