package wv;

import com.ingka.ikea.mcomsettings.impl.AvailablePaymentOptionHolder;
import gK.C17294a;
import java.util.List;
import kK.C17514c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lwv/a;", "", "<init>", "()V", "", "Lcom/ingka/ikea/mcomsettings/impl/AvailablePaymentOptionHolder;", "list", "", "a", "(Ljava/util/List;)Ljava/lang/String;", "serializedList", "b", "(Ljava/lang/String;)Ljava/util/List;", "mcomsettings-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: wv.a  reason: case insensitive filesystem */
public final class C12304a {
    public final String a(List<AvailablePaymentOptionHolder> list) {
        if (list != null) {
            return C17514c.f144280d.b(C17294a.h(AvailablePaymentOptionHolder.Companion.serializer()), list);
        }
        return null;
    }

    public final List<AvailablePaymentOptionHolder> b(String str) {
        if (str != null) {
            return (List) C17514c.f144280d.c(C17294a.h(AvailablePaymentOptionHolder.Companion.serializer()), str);
        }
        return null;
    }
}
