package Tk;

import com.ingka.ikea.app.stockinfo.network.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LTk/a;", "", "<init>", "()V", "", "status", "Lcom/ingka/ikea/app/stockinfo/network/c;", "a", "(I)Lcom/ingka/ikea/app/stockinfo/network/c;", "salePoint", "b", "(Lcom/ingka/ikea/app/stockinfo/network/c;)I", "stockinfo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f87721a = new a();

    private a() {
    }

    public static final c a(int i10) {
        c cVar = c.SELF_SERVICE;
        if (i10 != cVar.ordinal()) {
            cVar = c.CONTACT_STAFF;
            if (i10 != cVar.ordinal()) {
                cVar = c.OTHER;
                if (i10 != cVar.ordinal()) {
                    throw new IllegalArgumentException("Could not recognize sale point");
                }
            }
        }
        return cVar;
    }

    public static final int b(c cVar) {
        if (cVar == null) {
            cVar = c.OTHER;
        }
        return cVar.ordinal();
    }
}
