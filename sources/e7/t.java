package E7;

import C7.i;
import E7.i;
import H2.f;
import Y7.k;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t<Data, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<Data> f35198a;

    /* renamed from: b  reason: collision with root package name */
    private final f<List<Throwable>> f35199b;

    /* renamed from: c  reason: collision with root package name */
    private final List<? extends i<Data, ResourceType, Transcode>> f35200c;

    /* renamed from: d  reason: collision with root package name */
    private final String f35201d;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<i<Data, ResourceType, Transcode>> list, f<List<Throwable>> fVar) {
        this.f35198a = cls;
        this.f35199b = fVar;
        this.f35200c = (List) k.c(list);
        this.f35201d = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<Transcode> b(e<Data> eVar, i iVar, int i10, int i11, i.a<ResourceType> aVar, List<Throwable> list) {
        List<Throwable> list2 = list;
        int size = this.f35200c.size();
        v<Transcode> vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            try {
                vVar = ((i) this.f35200c.get(i12)).a(eVar, i10, i11, iVar, aVar);
            } catch (q e10) {
                list2.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f35201d, (List<Throwable>) new ArrayList(list2));
    }

    public v<Transcode> a(e<Data> eVar, C7.i iVar, int i10, int i11, i.a<ResourceType> aVar) {
        List list = (List) k.d(this.f35199b.b());
        try {
            return b(eVar, iVar, i10, i11, aVar, list);
        } finally {
            this.f35199b.a(list);
        }
    }

    public String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f35200c.toArray()) + '}';
    }
}
