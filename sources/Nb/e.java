package Nb;

import Lc.d;
import Lc.f;
import Sb.j;
import Sb.p;
import YH.C16877v;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LNb/e;", "LLc/f;", "LSb/p;", "userMetadata", "<init>", "(LSb/p;)V", "LLc/e;", "rolloutsState", "LXH/N;", "a", "(LLc/e;)V", "LSb/p;", "com.google.firebase-firebase-crashlytics"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class e implements f {

    /* renamed from: a  reason: collision with root package name */
    private final p f61974a;

    public e(p pVar) {
        C17542s.j(pVar, "userMetadata");
        this.f61974a = pVar;
    }

    public void a(Lc.e eVar) {
        C17542s.j(eVar, "rolloutsState");
        p pVar = this.f61974a;
        Set<d> b10 = eVar.b();
        C17542s.i(b10, "rolloutsState.rolloutAssignments");
        Iterable<d> iterable = b10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (d dVar : iterable) {
            arrayList.add(j.b(dVar.d(), dVar.b(), dVar.c(), dVar.f(), dVar.e()));
        }
        pVar.t(arrayList);
        g.f().b("Updated Crashlytics Rollout State");
    }
}
