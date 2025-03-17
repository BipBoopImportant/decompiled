package z6;

import D6.i;
import D6.o;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* renamed from: z6.h  reason: case insensitive filesystem */
public class C9026h {

    /* renamed from: a  reason: collision with root package name */
    private final List<C9019a<o, Path>> f58443a;

    /* renamed from: b  reason: collision with root package name */
    private final List<C9019a<Integer, Integer>> f58444b;

    /* renamed from: c  reason: collision with root package name */
    private final List<i> f58445c;

    public C9026h(List<i> list) {
        this.f58445c = list;
        this.f58443a = new ArrayList(list.size());
        this.f58444b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f58443a.add(list.get(i10).b().h());
            this.f58444b.add(list.get(i10).c().h());
        }
    }

    public List<C9019a<o, Path>> a() {
        return this.f58443a;
    }

    public List<i> b() {
        return this.f58445c;
    }

    public List<C9019a<Integer, Integer>> c() {
        return this.f58444b;
    }
}
