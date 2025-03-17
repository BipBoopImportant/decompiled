package R2;

import QJ.Q;
import S2.a;
import S2.b;
import YH.C16877v;
import com.google.android.libraries.places.api.model.PlaceTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00072\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LR2/i;", "", "<init>", "()V", "T", "LR2/w;", "storage", "LS2/b;", "corruptionHandler", "", "LR2/f;", "migrations", "LQJ/Q;", "scope", "LR2/h;", "a", "(LR2/w;LS2/b;Ljava/util/List;LQJ/Q;)LR2/h;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static final i f12316a = new i();

    private i() {
    }

    public final <T> h<T> a(w<T> wVar, b<T> bVar, List<? extends f<T>> list, Q q10) {
        C17542s.j(wVar, PlaceTypes.STORAGE);
        C17542s.j(list, "migrations");
        C17542s.j(q10, "scope");
        d dVar = bVar;
        if (bVar == null) {
            dVar = new a();
        }
        return new j(wVar, C16877v.e(g.f12298a.b(list)), dVar, q10);
    }
}
