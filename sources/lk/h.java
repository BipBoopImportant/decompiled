package LK;

import GK.C15778F;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000f¨\u0006\u0011"}, d2 = {"LLK/h;", "", "<init>", "()V", "LGK/F;", "failedRoute", "LXH/N;", "b", "(LGK/F;)V", "route", "a", "", "c", "(LGK/F;)Z", "", "Ljava/util/Set;", "failedRoutes", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final Set<C15778F> f136205a = new LinkedHashSet();

    public final synchronized void a(C15778F f10) {
        C17542s.j(f10, PlaceTypes.ROUTE);
        this.f136205a.remove(f10);
    }

    public final synchronized void b(C15778F f10) {
        C17542s.j(f10, "failedRoute");
        this.f136205a.add(f10);
    }

    public final synchronized boolean c(C15778F f10) {
        C17542s.j(f10, PlaceTypes.ROUTE);
        return this.f136205a.contains(f10);
    }
}
