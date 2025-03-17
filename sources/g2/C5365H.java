package g2;

import E1.H;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l2.C5519c;
import l2.C5520d;
import l2.f;
import l2.g;
import l2.h;
import m2.C5574b;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001c\u001a\u00020\u00052\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010'8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R0\u00102\u001a\u001e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020$0-j\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020$`/8\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u0004\u0018\u00010.8\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u00103R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lg2/H;", "Lg2/D;", "Lg2/w;", "Lm2/b$e;", "layoutVariables", "LXH/N;", "o", "(Lm2/b$e;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "LE1/H;", "measurables", "b", "(Ljava/util/List;)Z", "Lm2/h;", "transition", "", "type", "g", "(Lm2/h;I)V", "Ljava/util/ArrayList;", "Lm2/b$a;", "Lkotlin/collections/ArrayList;", "designElements", "p", "(Ljava/util/ArrayList;)V", "Lg2/X;", "state", "m", "(Lg2/X;)V", "k", "()V", "", "d", "()F", "Lg2/q;", "i", "Lg2/q;", "e", "()Lg2/q;", "extendFrom", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "j", "Ljava/util/HashMap;", "overridedVariables", "Ljava/lang/String;", "overrideVariables", "l", "Z", "_isDirty", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: g2.H  reason: case insensitive filesystem */
public final class C5365H extends C5361D implements C5399w {

    /* renamed from: i  reason: collision with root package name */
    private final C5393q f23507i;

    /* renamed from: j  reason: collision with root package name */
    private final HashMap<String, Float> f23508j;

    /* renamed from: k  reason: collision with root package name */
    private final String f23509k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f23510l;

    private final void o(C5574b.e eVar) {
        String str = this.f23509k;
        if (str != null) {
            try {
                f d10 = g.d(str);
                int size = d10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C5519c O10 = d10.O(i10);
                    C17542s.h(O10, "null cannot be cast to non-null type androidx.constraintlayout.core.parser.CLKey");
                    C5520d dVar = (C5520d) O10;
                    eVar.g(dVar.j(), dVar.r0().p());
                }
            } catch (h e10) {
                PrintStream printStream = System.err;
                printStream.println("exception: " + e10);
            }
        }
        for (String next : this.f23508j.keySet()) {
            Float f10 = this.f23508j.get(next);
            C17542s.g(f10);
            eVar.g(next, f10.floatValue());
        }
    }

    public boolean b(List<? extends H> list) {
        return this.f23510l;
    }

    public float d() {
        return 0.0f;
    }

    public C5393q e() {
        return this.f23507i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C5365H) {
            return C17542s.e(n(), ((C5365H) obj).n());
        }
        return false;
    }

    public void g(m2.h hVar, int i10) {
        o(new C5574b.e());
        C5574b.t(n(), hVar, i10);
    }

    public void k() {
    }

    public void m(X x10) {
        C5574b.e eVar = new C5574b.e();
        o(eVar);
        try {
            C5574b.s(n(), x10, eVar);
            this.f23510l = false;
        } catch (Exception unused) {
            this.f23510l = true;
        }
    }

    public final void p(ArrayList<C5574b.a> arrayList) {
        try {
            arrayList.clear();
            C5574b.j(n(), arrayList);
        } catch (Exception unused) {
        }
    }
}
