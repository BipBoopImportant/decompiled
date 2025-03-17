package E7;

import C7.k;
import H2.f;
import Q7.e;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class i<DataType, ResourceType, Transcode> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<DataType> f35102a;

    /* renamed from: b  reason: collision with root package name */
    private final List<? extends k<DataType, ResourceType>> f35103b;

    /* renamed from: c  reason: collision with root package name */
    private final e<ResourceType, Transcode> f35104c;

    /* renamed from: d  reason: collision with root package name */
    private final f<List<Throwable>> f35105d;

    /* renamed from: e  reason: collision with root package name */
    private final String f35106e;

    interface a<ResourceType> {
        v<ResourceType> a(v<ResourceType> vVar);
    }

    public i(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends k<DataType, ResourceType>> list, e<ResourceType, Transcode> eVar, f<List<Throwable>> fVar) {
        this.f35102a = cls;
        this.f35103b = list;
        this.f35104c = eVar;
        this.f35105d = fVar;
        this.f35106e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    private v<ResourceType> b(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, C7.i iVar) {
        List list = (List) Y7.k.d(this.f35105d.b());
        try {
            return c(eVar, i10, i11, iVar, list);
        } finally {
            this.f35105d.a(list);
        }
    }

    private v<ResourceType> c(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, C7.i iVar, List<Throwable> list) {
        int size = this.f35103b.size();
        v<ResourceType> vVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            k kVar = (k) this.f35103b.get(i12);
            try {
                if (kVar.b(eVar.a(), iVar)) {
                    vVar = kVar.a(eVar.a(), i10, i11, iVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e10) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + kVar, e10);
                }
                list.add(e10);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new q(this.f35106e, (List<Throwable>) new ArrayList(list));
    }

    public v<Transcode> a(com.bumptech.glide.load.data.e<DataType> eVar, int i10, int i11, C7.i iVar, a<ResourceType> aVar) {
        return this.f35104c.a(aVar.a(b(eVar, i10, i11, iVar)), iVar);
    }

    public String toString() {
        return "DecodePath{ dataClass=" + this.f35102a + ", decoders=" + this.f35103b + ", transcoder=" + this.f35104c + '}';
    }
}
