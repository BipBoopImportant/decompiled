package z6;

import D6.d;
import J6.a;
import java.util.List;

/* renamed from: z6.e  reason: case insensitive filesystem */
public class C9023e extends C9025g<d> {

    /* renamed from: i  reason: collision with root package name */
    private final d f58442i;

    public C9023e(List<a<d>> list) {
        super(list);
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = (d) list.get(i11).f37351b;
            if (dVar != null) {
                i10 = Math.max(i10, dVar.e());
            }
        }
        this.f58442i = new d(new float[i10], new int[i10]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public d i(a<d> aVar, float f10) {
        this.f58442i.f((d) aVar.f37351b, (d) aVar.f37352c, f10);
        return this.f58442i;
    }
}
