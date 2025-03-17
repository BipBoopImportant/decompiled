package J7;

import C7.i;
import I7.h;
import I7.n;
import I7.o;
import I7.p;
import I7.s;
import com.bumptech.glide.load.data.j;
import java.io.InputStream;

public class a implements o<h, InputStream> {

    /* renamed from: b  reason: collision with root package name */
    public static final C7.h<Integer> f37378b = C7.h.f("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: a  reason: collision with root package name */
    private final n<h, h> f37379a;

    /* renamed from: J7.a$a  reason: collision with other inner class name */
    public static class C0593a implements p<h, InputStream> {

        /* renamed from: a  reason: collision with root package name */
        private final n<h, h> f37380a = new n<>(500);

        public o<h, InputStream> d(s sVar) {
            return new a(this.f37380a);
        }

        public void teardown() {
        }
    }

    public a(n<h, h> nVar) {
        this.f37379a = nVar;
    }

    /* renamed from: c */
    public o.a<InputStream> b(h hVar, int i10, int i11, i iVar) {
        n<h, h> nVar = this.f37379a;
        if (nVar != null) {
            h a10 = nVar.a(hVar, 0, 0);
            if (a10 == null) {
                this.f37379a.b(hVar, 0, 0, hVar);
            } else {
                hVar = a10;
            }
        }
        return new o.a<>(hVar, new j(hVar, ((Integer) iVar.c(f37378b)).intValue()));
    }

    /* renamed from: d */
    public boolean a(h hVar) {
        return true;
    }
}
