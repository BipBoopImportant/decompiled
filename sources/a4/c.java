package A4;

import A4.b;
import androidx.fragment.app.DialogFragment;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mI.C17603a;
import uI.C18055d;
import uI.C18068q;
import x4.F;
import x4.w;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u0007\u0012\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000f0\r\u0012\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"LA4/c;", "Lx4/w;", "LA4/b$b;", "LA4/b;", "navigator", "", "route", "LuI/d;", "Landroidx/fragment/app/DialogFragment;", "fragmentClass", "<init>", "(LA4/b;Ljava/lang/String;LuI/d;)V", "", "", "LuI/q;", "Lx4/F;", "typeMap", "(LA4/b;LuI/d;Ljava/util/Map;LuI/d;)V", "j", "()LA4/b$b;", "i", "LuI/d;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends w<b.C0502b> {

    /* renamed from: i  reason: collision with root package name */
    private C18055d<? extends DialogFragment> f32685i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, C18055d<? extends DialogFragment> dVar) {
        super(bVar, str);
        C17542s.j(bVar, "navigator");
        C17542s.j(str, PlaceTypes.ROUTE);
        C17542s.j(dVar, "fragmentClass");
        this.f32685i = dVar;
    }

    /* renamed from: j */
    public b.C0502b c() {
        b.C0502b bVar = (b.C0502b) super.c();
        String name = C17603a.b(this.f32685i).getName();
        C17542s.i(name, "fragmentClass.java.name");
        bVar.S(name);
        return bVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(b bVar, C18055d<? extends Object> dVar, Map<C18068q, F<?>> map, C18055d<? extends DialogFragment> dVar2) {
        super(bVar, (C18055d<?>) dVar, map);
        C17542s.j(bVar, "navigator");
        C17542s.j(dVar, PlaceTypes.ROUTE);
        C17542s.j(map, "typeMap");
        C17542s.j(dVar2, "fragmentClass");
        this.f32685i = dVar2;
    }
}
