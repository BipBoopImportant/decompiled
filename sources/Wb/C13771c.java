package WB;

import GB.g;
import KJ.C15985a;
import KJ.C15987c;
import XB.C13800a;
import XB.C13801b;
import YH.C16877v;
import java.util.ArrayList;
import kotlin.Metadata;
import uK.C18146a;
import uK.C18148c;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LWB/c;", "", "<init>", "()V", "LGB/g$b;", "LXB/a;", "c", "(LGB/g$b;)LXB/a;", "LGB/g;", "smallStoreDetails", "", "firstTimeSmallStoreShown", "LXB/b;", "b", "(LGB/g;Z)LXB/b;", "LGB/g$a;", "item", "", "a", "(LGB/g$a;)I", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: WB.c  reason: case insensitive filesystem */
public final class C13771c {
    private final C13800a c(g.b bVar) {
        String c10 = bVar.c();
        String a10 = bVar.a();
        int a11 = a(bVar.b());
        g.a b10 = bVar.b();
        return new C13800a(c10, a10, a11, b10 != null ? b10.a() : null);
    }

    public final int a(g.a aVar) {
        Integer num = null;
        String b10 = aVar != null ? aVar.b() : null;
        int i10 = C18146a.f148220R5;
        if (b10 == null) {
            return i10;
        }
        C18148c b11 = C18148c.Companion.b(b10);
        if (b11 != null) {
            num = Integer.valueOf(b11.m());
        }
        return num != null ? num.intValue() : i10;
    }

    public final C13801b b(g gVar, boolean z10) {
        if (gVar == null) {
            return null;
        }
        String d10 = gVar.d();
        String b10 = gVar.b();
        String c10 = gVar.c();
        Iterable<g.b> a10 = gVar.a();
        ArrayList arrayList = new ArrayList(C16877v.y(a10, 10));
        for (g.b c11 : a10) {
            arrayList.add(c(c11));
        }
        C15987c h10 = C15985a.h(arrayList);
        Iterable<g.b> e10 = gVar.e();
        ArrayList arrayList2 = new ArrayList(C16877v.y(e10, 10));
        for (g.b c12 : e10) {
            arrayList2.add(c(c12));
        }
        return new C13801b(d10, b10, c10, z10, h10, C15985a.h(arrayList2));
    }
}
