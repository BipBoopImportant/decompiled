package sw;

import A4.b;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uI.C18055d;
import uI.C18068q;
import x4.C8945i;
import x4.F;
import x4.w;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000e\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsw/b;", "Lx4/w;", "LA4/b$b;", "Lsw/a;", "navigator", "", "route", "fullyQualifiedName", "Lsw/c;", "properties", "<init>", "(Lsw/a;Ljava/lang/String;Ljava/lang/String;Lsw/c;)V", "LuI/d;", "", "", "LuI/q;", "Lx4/F;", "typeMap", "(Lsw/a;LuI/d;Ljava/util/Map;Ljava/lang/String;Lsw/c;)V", "j", "()LA4/b$b;", "i", "Lsw/a;", "composableDialogNavigator", "Ljava/lang/String;", "navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b extends w<b.C0502b> {

    /* renamed from: i  reason: collision with root package name */
    private final a f29098i;

    /* renamed from: j  reason: collision with root package name */
    private final String f29099j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, String str2, c cVar) {
        super(aVar, str);
        C17542s.j(aVar, "navigator");
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(str2, "fullyQualifiedName");
        C17542s.j(cVar, "properties");
        this.f29098i = aVar;
        this.f29099j = str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public b.C0502b i() {
        this.f29098i.a().i("androidx.navigation.fragment.compose.FULLY_QUALIFIED_NAME", new C8945i.a().d(F.f57442q).b(this.f29099j).a());
        new C8945i.a().d(F.f57439n);
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(a aVar, C18055d<? extends Object> dVar, Map<C18068q, F<?>> map, String str, c cVar) {
        super(aVar, (C18055d<?>) dVar, map);
        C17542s.j(aVar, "navigator");
        C17542s.j(dVar, PlaceTypes.ROUTE);
        C17542s.j(map, "typeMap");
        C17542s.j(str, "fullyQualifiedName");
        C17542s.j(cVar, "properties");
        this.f29098i = aVar;
        this.f29099j = str;
    }
}
