package a9;

import F8.g;
import android.util.SparseArray;
import kotlin.jvm.internal.C17542s;

public final class G {

    /* renamed from: a  reason: collision with root package name */
    public final g f42006a;

    /* renamed from: b  reason: collision with root package name */
    public SparseArray<C6909q> f42007b = new SparseArray<>();

    public G(g gVar) {
        C17542s.j(gVar, "deviceInfo");
        this.f42006a = gVar;
    }

    public final void a(int i10, long j10, int i11, int i12) {
        C6909q qVar = this.f42007b.get(i10);
        if (qVar == null) {
            qVar = new C6909q();
        }
        int r10 = this.f42006a.r(i11);
        int r11 = this.f42006a.r(i12);
        qVar.f42801b.add(Long.valueOf(j10));
        qVar.f42802c.add(Integer.valueOf(r10));
        qVar.f42803d.add(Integer.valueOf(r11));
        this.f42007b.put(i10, qVar);
    }
}
