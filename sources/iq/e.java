package Iq;

import GJ.C15765h;
import GJ.C15768k;
import Iq.g;
import KJ.C15985a;
import Qq.g;
import Qq.k;
import YH.C16877v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0014¨\u0006\u0015"}, d2 = {"LIq/e;", "LIq/d;", "LIq/b;", "familyRewardCardMapper", "<init>", "(LIq/b;)V", "LQq/k;", "reward", "LGJ/h;", "LQq/g;", "b", "(LQq/k;)LGJ/h;", "LJq/d;", "resource", "LIq/g;", "a", "(LJq/d;)LIq/g;", "LIq/g$b;", "c", "(LQq/k;)LIq/g$b;", "LIq/b;", "familyrewards_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e implements d {

    /* renamed from: a  reason: collision with root package name */
    private final b f81982a;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<g, a> {
        a(Object obj) {
            super(1, obj, b.class, "map", "map(Lcom/ingka/ikea/familyrewards/datalayer/model/FamilyReward;)Lcom/ingka/ikea/familyrewards/data/FamilyRewardCard;", 0);
        }

        /* renamed from: t */
        public final a invoke(g gVar) {
            C17542s.j(gVar, "p0");
            return ((b) this.receiver).a(gVar);
        }
    }

    public e(b bVar) {
        C17542s.j(bVar, "familyRewardCardMapper");
        this.f81982a = bVar;
    }

    private final C15765h<g> b(k kVar) {
        return C15768k.k(C15768k.v(C16877v.h0(kVar.f()), C16877v.h0(kVar.d()), C16877v.h0(kVar.g())));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        r2 = c(r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Iq.g a(Jq.d<Qq.k> r2) {
        /*
            r1 = this;
            java.lang.String r0 = "resource"
            kotlin.jvm.internal.C17542s.j(r2, r0)
            boolean r0 = r2 instanceof Jq.d.a
            if (r0 == 0) goto L_0x000c
            Iq.g$a r2 = Iq.g.a.f81986a
            goto L_0x004c
        L_0x000c:
            boolean r0 = r2 instanceof Jq.d.b
            if (r0 == 0) goto L_0x0024
            Jq.d$b r2 = (Jq.d.b) r2
            java.lang.Object r2 = r2.a()
            Qq.k r2 = (Qq.k) r2
            if (r2 == 0) goto L_0x0021
            Iq.g$b r2 = r1.c(r2)
            if (r2 == 0) goto L_0x0021
            goto L_0x004c
        L_0x0021:
            Iq.g$a r2 = Iq.g.a.f81986a
            goto L_0x004c
        L_0x0024:
            boolean r0 = r2 instanceof Jq.d.c
            if (r0 == 0) goto L_0x003c
            Jq.d$c r2 = (Jq.d.c) r2
            java.lang.Object r2 = r2.a()
            Qq.k r2 = (Qq.k) r2
            if (r2 == 0) goto L_0x0039
            Iq.g$b r2 = r1.c(r2)
            if (r2 == 0) goto L_0x0039
            goto L_0x004c
        L_0x0039:
            Iq.g$c r2 = Iq.g.c.f81991a
            goto L_0x004c
        L_0x003c:
            boolean r0 = r2 instanceof Jq.d.C1628d
            if (r0 == 0) goto L_0x004d
            Jq.d$d r2 = (Jq.d.C1628d) r2
            java.lang.Object r2 = r2.a()
            Qq.k r2 = (Qq.k) r2
            Iq.g$b r2 = r1.c(r2)
        L_0x004c:
            return r2
        L_0x004d:
            XH.t r2 = new XH.t
            r2.<init>()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Iq.e.a(Jq.d):Iq.g");
    }

    public g.b c(k kVar) {
        C17542s.j(kVar, "reward");
        return new g.b(C15985a.k(C15768k.X(C15768k.S(b(kVar), new a(this.f81982a)), 8)), kVar.e());
    }
}
