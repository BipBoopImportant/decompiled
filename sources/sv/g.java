package Sv;

import IC.C13023e;
import IC.C13026h;
import Rv.c;
import Sv.e;
import fI.C17221b;
import kotlin.Metadata;
import yv.C9008m;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\u000f\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"LSv/g;", "", "LIC/e;", "text", "subtext", "LRv/c$a;", "clickEvent", "<init>", "(Ljava/lang/String;ILIC/e;LIC/e;LRv/c$a;)V", "LSv/e$c;", "b", "()LSv/e$c;", "LIC/e;", "getText", "()LIC/e;", "getSubtext", "LRv/c$a;", "getClickEvent", "()LRv/c$a;", "Latest", "BenefitsGuest", "BenefitsFamily", "BenefitsRegular", "FamilyRewards", "MemberDiscounts", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum g {
    Latest(C13026h.a(C9008m.f58150W), (int) null, (C13023e) null, 6, (c.a) null),
    BenefitsGuest(C13026h.a(C9008m.f58143P), (int) null, (C13023e) null, 6, (c.a) null),
    BenefitsFamily(C13026h.a(C9008m.f58144Q), (int) null, (C13023e) null, 6, (c.a) null),
    BenefitsRegular(C13026h.a(C9008m.f58145R), C13026h.a(C9008m.f58146S), (C13023e) null, 4, (c.a) null),
    FamilyRewards(C13026h.a(C9008m.f58149V), (int) null, c.a.b.C0642b.f39763a, 2, (c.a) null),
    MemberDiscounts(C13026h.a(C9008m.f58152Y), (int) null, c.a.g.MemberDiscounts, 2, (c.a) null);
    
    private final c.a clickEvent;
    private final C13023e subtext;
    private final C13023e text;

    static {
        g[] a10;
        $ENTRIES = C17221b.a(a10);
    }

    private g(C13023e eVar, C13023e eVar2, c.a aVar) {
        this.text = eVar;
        this.subtext = eVar2;
        this.clickEvent = aVar;
    }

    public final e.c b() {
        return new e.c(this.text, this.subtext, this.clickEvent);
    }
}
