package UE;

import com.sugarcube.app.base.data.database.Scene;
import com.sugarcube.core.network.models.Composition;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"LUE/e;", "", "", "loaded", "", "Lcom/sugarcube/app/base/data/database/Scene;", "scenes", "Lcom/sugarcube/core/network/models/Composition;", "compositions", "", "Ljava/util/UUID;", "sceneToCompMap", "<init>", "(ZLjava/util/List;Ljava/util/List;Ljava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getLoaded", "()Z", "b", "Ljava/util/List;", "()Ljava/util/List;", "c", "d", "Ljava/util/Map;", "getSceneToCompMap", "()Ljava/util/Map;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f117132a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Scene> f117133b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Composition> f117134c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<UUID, List<Composition>> f117135d;

    public e(boolean z10, List<Scene> list, List<Composition> list2, Map<UUID, ? extends List<Composition>> map) {
        C17542s.j(list, "scenes");
        C17542s.j(list2, "compositions");
        C17542s.j(map, "sceneToCompMap");
        this.f117132a = z10;
        this.f117133b = list;
        this.f117134c = list2;
        this.f117135d = map;
    }

    public final List<Composition> a() {
        return this.f117134c;
    }

    public final List<Scene> b() {
        return this.f117133b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f117132a == eVar.f117132a && C17542s.e(this.f117133b, eVar.f117133b) && C17542s.e(this.f117134c, eVar.f117134c) && C17542s.e(this.f117135d, eVar.f117135d);
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f117132a) * 31) + this.f117133b.hashCode()) * 31) + this.f117134c.hashCode()) * 31) + this.f117135d.hashCode();
    }

    public String toString() {
        boolean z10 = this.f117132a;
        List<Scene> list = this.f117133b;
        List<Composition> list2 = this.f117134c;
        Map<UUID, List<Composition>> map = this.f117135d;
        return "UserScenes(loaded=" + z10 + ", scenes=" + list + ", compositions=" + list2 + ", sceneToCompMap=" + map + ")";
    }
}
