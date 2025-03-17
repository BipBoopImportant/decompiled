package androidx.lifecycle;

import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16534i;
import androidx.lifecycle.r;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.C5676a;
import p.C5677b;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0002F%B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\bJ\u000f\u0010\u0019\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b$\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\"\u0010)R\u0016\u0010\u0014\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020-8\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010&R\u0016\u00105\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R&\u00109\u001a\u0012\u0012\u0004\u0012\u00020\t06j\b\u0012\u0004\u0012\u00020\t`78\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u00108R\u001a\u0010<\u001a\b\u0012\u0004\u0012\u00020\t0:8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010;R\u0014\u0010?\u001a\u00020\u00048BX\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R$\u0010B\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t8V@VX\u000e¢\u0006\f\u001a\u0004\b+\u0010@\"\u0004\bA\u0010\rR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\t0C8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010D¨\u0006G"}, d2 = {"Landroidx/lifecycle/A;", "Landroidx/lifecycle/r;", "Landroidx/lifecycle/y;", "provider", "", "enforceMainThread", "<init>", "(Landroidx/lifecycle/y;Z)V", "(Landroidx/lifecycle/y;)V", "Landroidx/lifecycle/r$b;", "next", "LXH/N;", "n", "(Landroidx/lifecycle/r$b;)V", "Landroidx/lifecycle/x;", "observer", "i", "(Landroidx/lifecycle/x;)Landroidx/lifecycle/r$b;", "o", "()V", "state", "p", "lifecycleOwner", "k", "h", "r", "", "methodName", "j", "(Ljava/lang/String;)V", "Landroidx/lifecycle/r$a;", "event", "l", "(Landroidx/lifecycle/r$a;)V", "c", "(Landroidx/lifecycle/x;)V", "g", "b", "Z", "Lp/a;", "Landroidx/lifecycle/A$b;", "Lp/a;", "observerMap", "d", "Landroidx/lifecycle/r$b;", "Ljava/lang/ref/WeakReference;", "e", "Ljava/lang/ref/WeakReference;", "", "f", "I", "addingObserverCounter", "handlingEvent", "newEventOccurred", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "parentStates", "LTJ/B;", "LTJ/B;", "_currentStateFlow", "m", "()Z", "isSynced", "()Landroidx/lifecycle/r$b;", "q", "currentState", "LTJ/P;", "()LTJ/P;", "currentStateFlow", "a", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class A extends r {

    /* renamed from: k  reason: collision with root package name */
    public static final a f22125k = new a((DefaultConstructorMarker) null);

    /* renamed from: b  reason: collision with root package name */
    private final boolean f22126b;

    /* renamed from: c  reason: collision with root package name */
    private C5676a<C5220x, b> f22127c;

    /* renamed from: d  reason: collision with root package name */
    private r.b f22128d;

    /* renamed from: e  reason: collision with root package name */
    private final WeakReference<C5221y> f22129e;

    /* renamed from: f  reason: collision with root package name */
    private int f22130f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f22131g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f22132h;

    /* renamed from: i  reason: collision with root package name */
    private ArrayList<r.b> f22133i;

    /* renamed from: j  reason: collision with root package name */
    private final C16505B<r.b> f22134j;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/A$a;", "", "<init>", "()V", "Landroidx/lifecycle/r$b;", "state1", "state2", "a", "(Landroidx/lifecycle/r$b;Landroidx/lifecycle/r$b;)Landroidx/lifecycle/r$b;", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r.b a(r.b bVar, r.b bVar2) {
            C17542s.j(bVar, "state1");
            return (bVar2 == null || bVar2.compareTo(bVar) >= 0) ? bVar : bVar2;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/lifecycle/A$b;", "", "Landroidx/lifecycle/x;", "observer", "Landroidx/lifecycle/r$b;", "initialState", "<init>", "(Landroidx/lifecycle/x;Landroidx/lifecycle/r$b;)V", "Landroidx/lifecycle/y;", "owner", "Landroidx/lifecycle/r$a;", "event", "LXH/N;", "a", "(Landroidx/lifecycle/y;Landroidx/lifecycle/r$a;)V", "Landroidx/lifecycle/r$b;", "b", "()Landroidx/lifecycle/r$b;", "setState", "(Landroidx/lifecycle/r$b;)V", "state", "Landroidx/lifecycle/v;", "Landroidx/lifecycle/v;", "getLifecycleObserver", "()Landroidx/lifecycle/v;", "setLifecycleObserver", "(Landroidx/lifecycle/v;)V", "lifecycleObserver", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private r.b f22135a;

        /* renamed from: b  reason: collision with root package name */
        private C5218v f22136b;

        public b(C5220x xVar, r.b bVar) {
            C17542s.j(bVar, "initialState");
            C17542s.g(xVar);
            this.f22136b = E.f(xVar);
            this.f22135a = bVar;
        }

        public final void a(C5221y yVar, r.a aVar) {
            C17542s.j(aVar, "event");
            r.b j10 = aVar.j();
            this.f22135a = A.f22125k.a(this.f22135a, j10);
            C5218v vVar = this.f22136b;
            C17542s.g(yVar);
            vVar.e(yVar, aVar);
            this.f22135a = j10;
        }

        public final r.b b() {
            return this.f22135a;
        }
    }

    private A(C5221y yVar, boolean z10) {
        this.f22126b = z10;
        this.f22127c = new C5676a<>();
        r.b bVar = r.b.INITIALIZED;
        this.f22128d = bVar;
        this.f22133i = new ArrayList<>();
        this.f22129e = new WeakReference<>(yVar);
        this.f22134j = C16521S.a(bVar);
    }

    private final void h(C5221y yVar) {
        Iterator<Map.Entry<C5220x, b>> descendingIterator = this.f22127c.descendingIterator();
        C17542s.i(descendingIterator, "observerMap.descendingIterator()");
        while (descendingIterator.hasNext() && !this.f22132h) {
            Map.Entry next = descendingIterator.next();
            C17542s.i(next, "next()");
            C5220x xVar = (C5220x) next.getKey();
            b bVar = (b) next.getValue();
            while (bVar.b().compareTo(this.f22128d) > 0 && !this.f22132h && this.f22127c.contains(xVar)) {
                r.a a10 = r.a.Companion.a(bVar.b());
                if (a10 != null) {
                    p(a10.j());
                    bVar.a(yVar, a10);
                    o();
                } else {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r4 = r4.getValue();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final androidx.lifecycle.r.b i(androidx.lifecycle.C5220x r4) {
        /*
            r3 = this;
            p.a<androidx.lifecycle.x, androidx.lifecycle.A$b> r0 = r3.f22127c
            java.util.Map$Entry r4 = r0.r(r4)
            r0 = 0
            if (r4 == 0) goto L_0x0016
            java.lang.Object r4 = r4.getValue()
            androidx.lifecycle.A$b r4 = (androidx.lifecycle.A.b) r4
            if (r4 == 0) goto L_0x0016
            androidx.lifecycle.r$b r4 = r4.b()
            goto L_0x0017
        L_0x0016:
            r4 = r0
        L_0x0017:
            java.util.ArrayList<androidx.lifecycle.r$b> r1 = r3.f22133i
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x002d
            java.util.ArrayList<androidx.lifecycle.r$b> r0 = r3.f22133i
            int r1 = r0.size()
            int r1 = r1 + -1
            java.lang.Object r0 = r0.get(r1)
            androidx.lifecycle.r$b r0 = (androidx.lifecycle.r.b) r0
        L_0x002d:
            androidx.lifecycle.A$a r1 = f22125k
            androidx.lifecycle.r$b r2 = r3.f22128d
            androidx.lifecycle.r$b r4 = r1.a(r2, r4)
            androidx.lifecycle.r$b r4 = r1.a(r4, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.A.i(androidx.lifecycle.x):androidx.lifecycle.r$b");
    }

    private final void j(String str) {
        if (this.f22126b && !C.a()) {
            throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
        }
    }

    private final void k(C5221y yVar) {
        C5677b<K, V>.d j10 = this.f22127c.j();
        C17542s.i(j10, "observerMap.iteratorWithAdditions()");
        while (j10.hasNext() && !this.f22132h) {
            Map.Entry entry = (Map.Entry) j10.next();
            C5220x xVar = (C5220x) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f22128d) < 0 && !this.f22132h && this.f22127c.contains(xVar)) {
                p(bVar.b());
                r.a b10 = r.a.Companion.b(bVar.b());
                if (b10 != null) {
                    bVar.a(yVar, b10);
                    o();
                } else {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
            }
        }
    }

    private final boolean m() {
        if (this.f22127c.size() == 0) {
            return true;
        }
        Map.Entry<C5220x, b> b10 = this.f22127c.b();
        C17542s.g(b10);
        r.b b11 = b10.getValue().b();
        Map.Entry<C5220x, b> k10 = this.f22127c.k();
        C17542s.g(k10);
        r.b b12 = k10.getValue().b();
        return b11 == b12 && this.f22128d == b12;
    }

    private final void n(r.b bVar) {
        r.b bVar2 = this.f22128d;
        if (bVar2 != bVar) {
            if (bVar2 == r.b.INITIALIZED && bVar == r.b.DESTROYED) {
                throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f22128d + " in component " + this.f22129e.get()).toString());
            }
            this.f22128d = bVar;
            if (this.f22131g || this.f22130f != 0) {
                this.f22132h = true;
                return;
            }
            this.f22131g = true;
            r();
            this.f22131g = false;
            if (this.f22128d == r.b.DESTROYED) {
                this.f22127c = new C5676a<>();
            }
        }
    }

    private final void o() {
        ArrayList<r.b> arrayList = this.f22133i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void p(r.b bVar) {
        this.f22133i.add(bVar);
    }

    private final void r() {
        C5221y yVar = this.f22129e.get();
        if (yVar != null) {
            while (!m()) {
                this.f22132h = false;
                r.b bVar = this.f22128d;
                Map.Entry<C5220x, b> b10 = this.f22127c.b();
                C17542s.g(b10);
                if (bVar.compareTo(b10.getValue().b()) < 0) {
                    h(yVar);
                }
                Map.Entry<C5220x, b> k10 = this.f22127c.k();
                if (!this.f22132h && k10 != null && this.f22128d.compareTo(k10.getValue().b()) > 0) {
                    k(yVar);
                }
            }
            this.f22132h = false;
            this.f22134j.setValue(d());
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
    }

    public void c(C5220x xVar) {
        C5221y yVar;
        C17542s.j(xVar, "observer");
        j("addObserver");
        r.b bVar = this.f22128d;
        r.b bVar2 = r.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = r.b.INITIALIZED;
        }
        b bVar3 = new b(xVar, bVar2);
        if (this.f22127c.p(xVar, bVar3) == null && (yVar = this.f22129e.get()) != null) {
            boolean z10 = this.f22130f != 0 || this.f22131g;
            r.b i10 = i(xVar);
            this.f22130f++;
            while (bVar3.b().compareTo(i10) < 0 && this.f22127c.contains(xVar)) {
                p(bVar3.b());
                r.a b10 = r.a.Companion.b(bVar3.b());
                if (b10 != null) {
                    bVar3.a(yVar, b10);
                    o();
                    i10 = i(xVar);
                } else {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
            }
            if (!z10) {
                r();
            }
            this.f22130f--;
        }
    }

    public r.b d() {
        return this.f22128d;
    }

    public C16519P<r.b> e() {
        return C16534i.c(this.f22134j);
    }

    public void g(C5220x xVar) {
        C17542s.j(xVar, "observer");
        j("removeObserver");
        this.f22127c.q(xVar);
    }

    public void l(r.a aVar) {
        C17542s.j(aVar, "event");
        j("handleLifecycleEvent");
        n(aVar.j());
    }

    public void q(r.b bVar) {
        C17542s.j(bVar, "state");
        j("setCurrentState");
        n(bVar);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public A(C5221y yVar) {
        this(yVar, true);
        C17542s.j(yVar, "provider");
    }
}
