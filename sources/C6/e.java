package C6;

import J6.a;
import android.graphics.PointF;
import java.util.List;
import z6.C9019a;
import z6.C9028j;
import z6.C9029k;

public class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<PointF>> f33730a;

    public e(List<a<PointF>> list) {
        this.f33730a = list;
    }

    public boolean g() {
        return this.f33730a.size() == 1 && this.f33730a.get(0).i();
    }

    public C9019a<PointF, PointF> h() {
        return this.f33730a.get(0).i() ? new C9029k(this.f33730a) : new C9028j(this.f33730a);
    }

    public List<a<PointF>> i() {
        return this.f33730a;
    }
}
