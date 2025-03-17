package Nq;

import HJ.C15854t;
import Qq.h;
import Qq.i;
import Qq.q;
import Qq.r;
import YH.C16877v;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionRemote;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.FamilyRewardInteractionsRemote;
import com.ingka.ikea.familyrewards.datalayer.impl.remote.ImageRemote;
import com.sugarcube.core.logger.DslKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"LNq/b;", "", "<init>", "()V", "", "LQq/h;", "interactions", "LQq/i;", "a", "(Ljava/util/List;)LQq/i;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionsRemote;", "remote", "b", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionsRemote;)LQq/i;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote;", "c", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/FamilyRewardInteractionRemote;)LQq/h;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {
    private final i a(List<? extends h> list) {
        Iterable iterable = list;
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (next instanceof q) {
                arrayList.add(next);
            }
        }
        q qVar = (q) C16877v.y0(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : iterable) {
            if (next2 instanceof r) {
                arrayList2.add(next2);
            }
        }
        return new i(qVar, arrayList2);
    }

    public final i b(FamilyRewardInteractionsRemote familyRewardInteractionsRemote) {
        C17542s.j(familyRewardInteractionsRemote, "remote");
        List<FamilyRewardInteractionRemote> b10 = familyRewardInteractionsRemote.b();
        if (b10 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("activities was null");
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = b.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str = str3;
                str2 = str4;
            }
        }
        if (b10 == null) {
            b10 = C16877v.n();
        }
        ArrayList arrayList2 = new ArrayList();
        for (FamilyRewardInteractionRemote c10 : b10) {
            h c11 = c(c10);
            if (c11 != null) {
                arrayList2.add(c11);
            }
        }
        return a(arrayList2);
    }

    public final h c(FamilyRewardInteractionRemote familyRewardInteractionRemote) {
        String str;
        char c10;
        FamilyRewardInteractionRemote familyRewardInteractionRemote2 = familyRewardInteractionRemote;
        C17542s.j(familyRewardInteractionRemote2, "remote");
        String e10 = familyRewardInteractionRemote.e();
        String str2 = DslKt.INDICATOR_BACKGROUND;
        char c11 = '$';
        Class<b> cls = b.class;
        Image image = null;
        if (e10 == null || familyRewardInteractionRemote.h() == null || familyRewardInteractionRemote.g() == null) {
            IllegalStateException illegalStateException = new IllegalStateException("One or more fields was null: " + familyRewardInteractionRemote2);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str3 = null;
            String str4 = null;
            for (C11819b bVar : arrayList) {
                if (str3 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str3 = C11820c.a(a10);
                }
                if (str4 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    c10 = '$';
                    str = str2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    str = str2;
                    c10 = '$';
                }
                char c12 = c10;
                bVar.a(eVar, str4, false, illegalStateException, str3);
                str2 = str;
            }
            return null;
        } else if (familyRewardInteractionRemote.b() != null && familyRewardInteractionRemote.c() != null) {
            String e11 = familyRewardInteractionRemote.e();
            String h10 = familyRewardInteractionRemote.h();
            ImageRemote f10 = familyRewardInteractionRemote.f();
            if (f10 != null) {
                image = f10.a();
            }
            return new q(e11, h10, image);
        } else if (familyRewardInteractionRemote.b() == null && familyRewardInteractionRemote.c() == null) {
            String e12 = familyRewardInteractionRemote.e();
            String h11 = familyRewardInteractionRemote.h();
            ImageRemote f11 = familyRewardInteractionRemote.f();
            if (f11 != null) {
                image = f11.a();
            }
            Image image2 = image;
            Integer g10 = familyRewardInteractionRemote.g();
            String d10 = familyRewardInteractionRemote.d();
            if (d10 == null) {
                d10 = "";
            }
            return new r(e12, h11, g10.intValue(), d10, image2, familyRewardInteractionRemote.i());
        } else {
            IllegalStateException illegalStateException2 = new IllegalStateException("invalid promoted interaction: " + familyRewardInteractionRemote2);
            e eVar2 = e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str5 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException2);
                    if (a11 == null) {
                        return null;
                    }
                    str5 = C11820c.a(a11);
                }
                if (str6 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, c11, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str2) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str6, false, illegalStateException2, str5);
                c11 = '$';
            }
            return null;
        }
    }
}
