package D6;

import C6.m;
import E6.b;
import com.airbnb.lottie.o;
import w6.C8927i;
import y6.C8986c;
import y6.q;

public class n implements c {

    /* renamed from: a  reason: collision with root package name */
    private final String f34528a;

    /* renamed from: b  reason: collision with root package name */
    private final m<Float, Float> f34529b;

    public n(String str, m<Float, Float> mVar) {
        this.f34528a = str;
        this.f34529b = mVar;
    }

    public C8986c a(o oVar, C8927i iVar, b bVar) {
        return new q(oVar, bVar, this);
    }

    public m<Float, Float> b() {
        return this.f34529b;
    }

    public String c() {
        return this.f34528a;
    }
}
