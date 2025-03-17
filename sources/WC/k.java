package WC;

import IC.C13023e;
import IC.C13026h;
import XC.C13802a;
import YH.C16877v;
import YH.U;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import tI.C17974j;
import uK.C18146a;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"LWC/k;", "", "<init>", "()V", "", "LXC/a$a$a$c;", "b", "Ljava/util/List;", "timeSlots", "LXC/a$a$a$d;", "c", "availableSlotGroups", "LXC/a$a$a;", "d", "LXC/a$a$a;", "a", "()LXC/a$a$a;", "content", "time-slot-picker_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static final k f117584a = new k();

    /* renamed from: b  reason: collision with root package name */
    private static final List<C13802a.C2911a.C2912a.c> f117585b;

    /* renamed from: c  reason: collision with root package name */
    private static final List<C13802a.C2911a.C2912a.d> f117586c;

    /* renamed from: d  reason: collision with root package name */
    private static final C13802a.C2911a.C2912a f117587d;

    /* renamed from: e  reason: collision with root package name */
    public static final int f117588e = 8;

    static {
        C17974j jVar = new C17974j(1, 4);
        ArrayList arrayList = new ArrayList(C16877v.y(jVar, 10));
        Iterator it = jVar.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                break;
            }
            int c10 = ((U) it).c();
            String valueOf = String.valueOf(c10);
            String str = "Time slot " + c10;
            if (c10 == 2) {
                z10 = true;
            }
            arrayList.add(new C13802a.C2911a.C2912a.c(valueOf, z10, str, c10 + " kr"));
        }
        f117585b = arrayList;
        C17974j jVar2 = new C17974j(1, 5);
        ArrayList arrayList2 = new ArrayList(C16877v.y(jVar2, 10));
        Iterator it2 = jVar2.iterator();
        while (it2.hasNext()) {
            int c11 = ((U) it2).c();
            arrayList2.add(new C13802a.C2911a.C2912a.d(String.valueOf(c11), c11 != 3, c11 == 2, "Day " + c11, c11 + " Dec"));
        }
        f117586c = arrayList2;
        f117587d = new C13802a.C2911a.C2912a(C13026h.c("Some title"), C13026h.c("Some description"), new C13802a.C2911a.C2912a.C2913a(new C13023e.b("Current slot"), new C13023e.b("17 Dec, 07:00–10:00"), C18146a.f148385c3), arrayList2, f117585b, new C13802a.C2911a.C2912a.b(false, new C13023e.b("Confirm new time slot")));
    }

    private k() {
    }

    public final C13802a.C2911a.C2912a a() {
        return f117587d;
    }
}
