package I7;

import C7.i;
import E7.q;
import H2.f;
import I7.o;
import Y7.k;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class r<Model, Data> implements o<Model, Data> {

    /* renamed from: a  reason: collision with root package name */
    private final List<o<Model, Data>> f37044a;

    /* renamed from: b  reason: collision with root package name */
    private final f<List<Throwable>> f37045b;

    static class a<Data> implements d<Data>, d.a<Data> {

        /* renamed from: a  reason: collision with root package name */
        private final List<d<Data>> f37046a;

        /* renamed from: b  reason: collision with root package name */
        private final f<List<Throwable>> f37047b;

        /* renamed from: c  reason: collision with root package name */
        private int f37048c = 0;

        /* renamed from: d  reason: collision with root package name */
        private g f37049d;

        /* renamed from: e  reason: collision with root package name */
        private d.a<? super Data> f37050e;

        /* renamed from: f  reason: collision with root package name */
        private List<Throwable> f37051f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f37052g;

        a(List<d<Data>> list, f<List<Throwable>> fVar) {
            this.f37047b = fVar;
            k.c(list);
            this.f37046a = list;
        }

        private void g() {
            if (!this.f37052g) {
                if (this.f37048c < this.f37046a.size() - 1) {
                    this.f37048c++;
                    f(this.f37049d, this.f37050e);
                    return;
                }
                k.d(this.f37051f);
                this.f37050e.c(new q("Fetch failed", (List<Throwable>) new ArrayList(this.f37051f)));
            }
        }

        public Class<Data> a() {
            return this.f37046a.get(0).a();
        }

        public void b() {
            List<Throwable> list = this.f37051f;
            if (list != null) {
                this.f37047b.a(list);
            }
            this.f37051f = null;
            for (d<Data> b10 : this.f37046a) {
                b10.b();
            }
        }

        public void c(Exception exc) {
            ((List) k.d(this.f37051f)).add(exc);
            g();
        }

        public void cancel() {
            this.f37052g = true;
            for (d<Data> cancel : this.f37046a) {
                cancel.cancel();
            }
        }

        public C7.a d() {
            return this.f37046a.get(0).d();
        }

        public void e(Data data) {
            if (data != null) {
                this.f37050e.e(data);
            } else {
                g();
            }
        }

        public void f(g gVar, d.a<? super Data> aVar) {
            this.f37049d = gVar;
            this.f37050e = aVar;
            this.f37051f = this.f37047b.b();
            this.f37046a.get(this.f37048c).f(gVar, this);
            if (this.f37052g) {
                cancel();
            }
        }
    }

    r(List<o<Model, Data>> list, f<List<Throwable>> fVar) {
        this.f37044a = list;
        this.f37045b = fVar;
    }

    public boolean a(Model model) {
        for (o<Model, Data> a10 : this.f37044a) {
            if (a10.a(model)) {
                return true;
            }
        }
        return false;
    }

    public o.a<Data> b(Model model, int i10, int i11, i iVar) {
        o.a b10;
        int size = this.f37044a.size();
        ArrayList arrayList = new ArrayList(size);
        C7.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            o oVar = this.f37044a.get(i12);
            if (oVar.a(model) && (b10 = oVar.b(model, i10, i11, iVar)) != null) {
                fVar = b10.f37037a;
                arrayList.add(b10.f37039c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new o.a<>(fVar, new a(arrayList, this.f37045b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f37044a.toArray()) + '}';
    }
}
