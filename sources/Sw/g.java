package sw;

import B4.a;
import androidx.navigation.fragment.FragmentNavigator;
import androidx.navigation.fragment.compose.ComposableFragment;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18055d;
import uI.C18068q;
import x4.C8945i;
import x4.F;
import x4.w;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tBA\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\u0012\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\r\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\f\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016¨\u0006\u0017"}, d2 = {"Lsw/g;", "Lx4/w;", "Landroidx/navigation/fragment/FragmentNavigator$c;", "LB4/a;", "navigator", "", "route", "fullyQualifiedName", "<init>", "(LB4/a;Ljava/lang/String;Ljava/lang/String;)V", "LuI/d;", "", "", "LuI/q;", "Lx4/F;", "typeMap", "(LB4/a;LuI/d;Ljava/util/Map;Ljava/lang/String;)V", "j", "()Landroidx/navigation/fragment/FragmentNavigator$c;", "i", "LB4/a;", "composableFragmentNavigator", "Ljava/lang/String;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g extends w<FragmentNavigator.c> {

    /* renamed from: k  reason: collision with root package name */
    public static final int f29103k = a.f33130d;

    /* renamed from: i  reason: collision with root package name */
    private final a f29104i;

    /* renamed from: j  reason: collision with root package name */
    private final String f29105j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a aVar, String str, String str2) {
        super(aVar, str);
        C17542s.j(aVar, "navigator");
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(str2, "fullyQualifiedName");
        this.f29104i = aVar;
        this.f29105j = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public FragmentNavigator.c i() {
        FragmentNavigator.c l10 = this.f29104i.a();
        l10.i("androidx.navigation.fragment.compose.FULLY_QUALIFIED_NAME", new C8945i.a().d(F.f57442q).b(this.f29105j).a());
        String name = ComposableFragment.class.getName();
        C17542s.i(name, "getName(...)");
        l10.S(name);
        return l10;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g(a aVar, C18055d<? extends Object> dVar, Map<C18068q, F<?>> map, String str) {
        super(aVar, (C18055d<?>) dVar, map);
        C17542s.j(aVar, "navigator");
        C17542s.j(dVar, PlaceTypes.ROUTE);
        C17542s.j(map, "typeMap");
        C17542s.j(str, "fullyQualifiedName");
        this.f29104i = aVar;
        this.f29105j = str;
    }
}
