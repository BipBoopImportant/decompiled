package Wj;

import XH.C16796C;
import XH.v;
import Xj.c;
import Xj.d;
import YH.C16877v;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import com.ingka.ikea.app.scannerbase.googlevision.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ya.b;
import ya.c;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB+\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\rJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LWj/a;", "LWj/b;", "Lcom/ingka/ikea/app/scannerbase/googlevision/a;", "renderer", "LXj/c;", "helper", "", "blockFurtherProcessing", "<init>", "(Lcom/ingka/ikea/app/scannerbase/googlevision/a;LXj/c;Z)V", "Landroid/view/View;", "viewport", "preview", "(Landroid/view/View;Landroid/view/View;Lcom/ingka/ikea/app/scannerbase/googlevision/a;Z)V", "Lya/b$a;", "Lza/a;", "detections", "a", "(Lya/b$a;)Lya/b$a;", "LXH/N;", "release", "()V", "Lcom/ingka/ikea/app/scannerbase/googlevision/a;", "b", "LXj/c;", "c", "Z", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final com.ingka.ikea.app.scannerbase.googlevision.a f88862a;

    /* renamed from: b  reason: collision with root package name */
    private final c f88863b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f88864c;

    public a(com.ingka.ikea.app.scannerbase.googlevision.a aVar, c cVar, boolean z10) {
        C17542s.j(aVar, "renderer");
        C17542s.j(cVar, "helper");
        this.f88862a = aVar;
        this.f88863b = cVar;
        this.f88864c = z10;
    }

    public b.a<za.a> a(b.a<za.a> aVar) {
        C17542s.j(aVar, "detections");
        c.b c10 = aVar.c();
        v a10 = C16796C.a(Integer.valueOf(c10.f()), Integer.valueOf(c10.b()));
        int intValue = ((Number) a10.a()).intValue();
        int intValue2 = ((Number) a10.b()).intValue();
        List c11 = C16877v.c();
        SparseArray<za.a> b10 = aVar.b();
        C17542s.i(b10, "getDetectedItems(...)");
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            b10.keyAt(i10);
            Rect x10 = b10.valueAt(i10).x();
            Xj.c cVar = this.f88863b;
            C17542s.g(x10);
            c11.add(new a.C2047a(cVar.b(x10, intValue, intValue2), this.f88863b.a(x10, intValue, intValue2)));
        }
        this.f88862a.a(C16877v.a(c11));
        if (this.f88864c) {
            aVar.b().clear();
        }
        return aVar;
    }

    public void release() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a(View view, View view2, com.ingka.ikea.app.scannerbase.googlevision.a aVar, boolean z10) {
        this(aVar, new d(view, view2), z10);
        C17542s.j(view, "viewport");
        C17542s.j(view2, "preview");
        C17542s.j(aVar, "renderer");
    }
}
