package Wj;

import H2.k;
import XH.C16796C;
import XH.v;
import Xj.c;
import Xj.d;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ya.b;
import ya.c;
import za.a;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\tJ#\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"LWj/h;", "LWj/b;", "LXj/c;", "helper", "<init>", "(LXj/c;)V", "Landroid/view/View;", "viewport", "preview", "(Landroid/view/View;Landroid/view/View;)V", "Lya/b$a;", "Lza/a;", "detections", "a", "(Lya/b$a;)Lya/b$a;", "LXH/N;", "release", "()V", "LXj/c;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements b {

    /* renamed from: a  reason: collision with root package name */
    private final c f88881a;

    public h(c cVar) {
        C17542s.j(cVar, "helper");
        this.f88881a = cVar;
    }

    public b.a<a> a(b.a<a> aVar) {
        C17542s.j(aVar, "detections");
        c.b c10 = aVar.c();
        v a10 = C16796C.a(Integer.valueOf(c10.f()), Integer.valueOf(c10.b()));
        int intValue = ((Number) a10.a()).intValue();
        int intValue2 = ((Number) a10.b()).intValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SparseArray<a> b10 = aVar.b();
        C17542s.i(b10, "getDetectedItems(...)");
        int size = b10.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = b10.keyAt(i10);
            a valueAt = b10.valueAt(i10);
            Xj.c cVar = this.f88881a;
            Rect x10 = valueAt.x();
            C17542s.i(x10, "getBoundingBox(...)");
            if (!cVar.a(x10, intValue, intValue2)) {
                linkedHashMap.put(Integer.valueOf(keyAt), valueAt);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            SparseArray<a> b11 = aVar.b();
            C17542s.i(b11, "getDetectedItems(...)");
            k.a(b11, ((Number) entry.getKey()).intValue(), (a) entry.getValue());
        }
        return aVar;
    }

    public void release() {
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public h(View view, View view2) {
        this(new d(view, view2));
        C17542s.j(view, "viewport");
        C17542s.j(view2, "preview");
    }
}
