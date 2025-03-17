package ul;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import xB.C15201a;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
public final class d implements C17642l<C15201a, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f103845a;

    public d(String str) {
        this.f103845a = str;
    }

    /* renamed from: a */
    public final Object invoke(C15201a aVar) {
        C17542s.j(aVar, "item");
        String str = this.f103845a;
        if (str != null) {
            String str2 = str + ":" + aVar.f();
            if (str2 != null) {
                return str2;
            }
        }
        return Long.valueOf(aVar.f());
    }
}
