package C6;

import J6.a;
import android.graphics.PointF;
import java.util.List;
import z6.C9019a;
import z6.n;

public class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final b f33731a;

    /* renamed from: b  reason: collision with root package name */
    private final b f33732b;

    public i(b bVar, b bVar2) {
        this.f33731a = bVar;
        this.f33732b = bVar2;
    }

    public boolean g() {
        return this.f33731a.g() && this.f33732b.g();
    }

    public C9019a<PointF, PointF> h() {
        return new n(this.f33731a.h(), this.f33732b.h());
    }

    public List<a<PointF>> i() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
