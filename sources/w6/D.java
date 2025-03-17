package w6;

import H2.d;
import I6.h;
import j0.C5446b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D {

    /* renamed from: a  reason: collision with root package name */
    private boolean f57204a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Set<b> f57205b = new C5446b();

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, h> f57206c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private final Comparator<d<String, Float>> f57207d = new a();

    class a implements Comparator<d<String, Float>> {
        a() {
        }

        /* renamed from: a */
        public int compare(d<String, Float> dVar, d<String, Float> dVar2) {
            float floatValue = ((Float) dVar.f7053b).floatValue();
            float floatValue2 = ((Float) dVar2.f7053b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    public interface b {
        void a(float f10);
    }

    public void a(String str, float f10) {
        if (this.f57204a) {
            h hVar = this.f57206c.get(str);
            if (hVar == null) {
                hVar = new h();
                this.f57206c.put(str, hVar);
            }
            hVar.a(f10);
            if (str.equals("__container")) {
                for (b a10 : this.f57205b) {
                    a10.a(f10);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(boolean z10) {
        this.f57204a = z10;
    }
}
