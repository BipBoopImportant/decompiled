package z6;

import D6.o;
import I6.i;
import J6.a;
import android.graphics.Path;
import java.util.List;
import y6.s;

/* renamed from: z6.m  reason: case insensitive filesystem */
public class C9031m extends C9019a<o, Path> {

    /* renamed from: i  reason: collision with root package name */
    private final o f58454i = new o();

    /* renamed from: j  reason: collision with root package name */
    private final Path f58455j = new Path();

    /* renamed from: k  reason: collision with root package name */
    private List<s> f58456k;

    public C9031m(List<a<o>> list) {
        super(list);
    }

    /* renamed from: p */
    public Path i(a<o> aVar, float f10) {
        this.f58454i.c((o) aVar.f37351b, (o) aVar.f37352c, f10);
        o oVar = this.f58454i;
        List<s> list = this.f58456k;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                oVar = this.f58456k.get(size).d(oVar);
            }
        }
        i.h(oVar, this.f58455j);
        return this.f58455j;
    }

    public void q(List<s> list) {
        this.f58456k = list;
    }
}
