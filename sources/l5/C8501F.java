package l5;

import XH.C16807N;
import android.text.TextUtils;
import androidx.work.C;
import androidx.work.C7042k;
import androidx.work.C7055y;
import androidx.work.G;
import androidx.work.N;
import androidx.work.P;
import androidx.work.T;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import t5.C8812g;

/* renamed from: l5.F  reason: case insensitive filesystem */
public class C8501F extends P {

    /* renamed from: j  reason: collision with root package name */
    private static final String f54611j = C7055y.i("WorkContinuationImpl");

    /* renamed from: a  reason: collision with root package name */
    private final O f54612a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54613b;

    /* renamed from: c  reason: collision with root package name */
    private final C7042k f54614c;

    /* renamed from: d  reason: collision with root package name */
    private final List<? extends T> f54615d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f54616e;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f54617f;

    /* renamed from: g  reason: collision with root package name */
    private final List<C8501F> f54618g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f54619h;

    /* renamed from: i  reason: collision with root package name */
    private C f54620i;

    public C8501F(O o10, List<? extends T> list) {
        this(o10, (String) null, C7042k.KEEP, list, (List<C8501F>) null);
    }

    private static boolean j(C8501F f10, Set<String> set) {
        set.addAll(f10.d());
        Set<String> n10 = n(f10);
        for (String contains : set) {
            if (n10.contains(contains)) {
                return true;
            }
        }
        List<C8501F> f11 = f10.f();
        if (f11 != null && !f11.isEmpty()) {
            for (C8501F j10 : f11) {
                if (j(j10, set)) {
                    return true;
                }
            }
        }
        set.removeAll(f10.d());
        return false;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C16807N l() {
        C8812g.b(this);
        return C16807N.f139792a;
    }

    public static Set<String> n(C8501F f10) {
        HashSet hashSet = new HashSet();
        List<C8501F> f11 = f10.f();
        if (f11 != null && !f11.isEmpty()) {
            for (C8501F d10 : f11) {
                hashSet.addAll(d10.d());
            }
        }
        return hashSet;
    }

    public C b() {
        if (!this.f54619h) {
            N n10 = this.f54612a.p().n();
            this.f54620i = G.c(n10, "EnqueueRunnable_" + c().name(), this.f54612a.x().c(), new C8500E(this));
        } else {
            C7055y e10 = C7055y.e();
            String str = f54611j;
            e10.k(str, "Already enqueued work ids (" + TextUtils.join(", ", this.f54616e) + ")");
        }
        return this.f54620i;
    }

    public C7042k c() {
        return this.f54614c;
    }

    public List<String> d() {
        return this.f54616e;
    }

    public String e() {
        return this.f54613b;
    }

    public List<C8501F> f() {
        return this.f54618g;
    }

    public List<? extends T> g() {
        return this.f54615d;
    }

    public O h() {
        return this.f54612a;
    }

    public boolean i() {
        return j(this, new HashSet());
    }

    public boolean k() {
        return this.f54619h;
    }

    public void m() {
        this.f54619h = true;
    }

    public C8501F(O o10, String str, C7042k kVar, List<? extends T> list) {
        this(o10, str, kVar, list, (List<C8501F>) null);
    }

    public C8501F(O o10, String str, C7042k kVar, List<? extends T> list, List<C8501F> list2) {
        this.f54612a = o10;
        this.f54613b = str;
        this.f54614c = kVar;
        this.f54615d = list;
        this.f54618g = list2;
        this.f54616e = new ArrayList(list.size());
        this.f54617f = new ArrayList();
        if (list2 != null) {
            for (C8501F f10 : list2) {
                this.f54617f.addAll(f10.f54617f);
            }
        }
        int i10 = 0;
        while (i10 < list.size()) {
            if (kVar != C7042k.REPLACE || ((T) list.get(i10)).d().g() == Long.MAX_VALUE) {
                String b10 = ((T) list.get(i10)).b();
                this.f54616e.add(b10);
                this.f54617f.add(b10);
                i10++;
            } else {
                throw new IllegalArgumentException("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
            }
        }
    }
}
