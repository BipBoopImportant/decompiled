package I7;

import C7.f;
import C7.i;
import Y7.k;
import com.bumptech.glide.load.data.d;
import java.util.Collections;
import java.util.List;

public interface o<Model, Data> {

    public static class a<Data> {

        /* renamed from: a  reason: collision with root package name */
        public final f f37037a;

        /* renamed from: b  reason: collision with root package name */
        public final List<f> f37038b;

        /* renamed from: c  reason: collision with root package name */
        public final d<Data> f37039c;

        public a(f fVar, d<Data> dVar) {
            this(fVar, Collections.emptyList(), dVar);
        }

        public a(f fVar, List<f> list, d<Data> dVar) {
            this.f37037a = (f) k.d(fVar);
            this.f37038b = (List) k.d(list);
            this.f37039c = (d) k.d(dVar);
        }
    }

    boolean a(Model model);

    a<Data> b(Model model, int i10, int i11, i iVar);
}
