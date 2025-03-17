package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.f0;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

final class K extends f0 {

    /* renamed from: t  reason: collision with root package name */
    private static final i0.c f21892t = new a();

    /* renamed from: m  reason: collision with root package name */
    private final HashMap<String, C5187o> f21893m = new HashMap<>();

    /* renamed from: n  reason: collision with root package name */
    private final HashMap<String, K> f21894n = new HashMap<>();

    /* renamed from: o  reason: collision with root package name */
    private final HashMap<String, j0> f21895o = new HashMap<>();

    /* renamed from: p  reason: collision with root package name */
    private final boolean f21896p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f21897q = false;

    /* renamed from: r  reason: collision with root package name */
    private boolean f21898r = false;

    /* renamed from: s  reason: collision with root package name */
    private boolean f21899s = false;

    class a implements i0.c {
        a() {
        }

        public <T extends f0> T create(Class<T> cls) {
            return new K(true);
        }
    }

    K(boolean z10) {
        this.f21896p = z10;
    }

    static K E(j0 j0Var) {
        return (K) new i0(j0Var, f21892t).a(K.class);
    }

    private void k(String str, boolean z10) {
        K k10 = this.f21894n.get(str);
        if (k10 != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(k10.f21894n.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    k10.j((String) it.next(), true);
                }
            }
            k10.onCleared();
            this.f21894n.remove(str);
        }
        j0 j0Var = this.f21895o.get(str);
        if (j0Var != null) {
            j0Var.a();
            this.f21895o.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public C5187o C(String str) {
        return this.f21893m.get(str);
    }

    /* access modifiers changed from: package-private */
    public K D(C5187o oVar) {
        K k10 = this.f21894n.get(oVar.mWho);
        if (k10 != null) {
            return k10;
        }
        K k11 = new K(this.f21896p);
        this.f21894n.put(oVar.mWho, k11);
        return k11;
    }

    /* access modifiers changed from: package-private */
    public Collection<C5187o> F() {
        return new ArrayList(this.f21893m.values());
    }

    /* access modifiers changed from: package-private */
    public j0 G(C5187o oVar) {
        j0 j0Var = this.f21895o.get(oVar.mWho);
        if (j0Var != null) {
            return j0Var;
        }
        j0 j0Var2 = new j0();
        this.f21895o.put(oVar.mWho, j0Var2);
        return j0Var2;
    }

    /* access modifiers changed from: package-private */
    public boolean H() {
        return this.f21897q;
    }

    /* access modifiers changed from: package-private */
    public void I(C5187o oVar) {
        if (this.f21899s) {
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else if (this.f21893m.remove(oVar.mWho) != null && FragmentManager.U0(2)) {
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + oVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void J(boolean z10) {
        this.f21899s = z10;
    }

    /* access modifiers changed from: package-private */
    public boolean K(C5187o oVar) {
        if (!this.f21893m.containsKey(oVar.mWho)) {
            return true;
        }
        return this.f21896p ? this.f21897q : !this.f21898r;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || K.class != obj.getClass()) {
            return false;
        }
        K k10 = (K) obj;
        return this.f21893m.equals(k10.f21893m) && this.f21894n.equals(k10.f21894n) && this.f21895o.equals(k10.f21895o);
    }

    /* access modifiers changed from: package-private */
    public void h(C5187o oVar) {
        if (this.f21899s) {
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else if (!this.f21893m.containsKey(oVar.mWho)) {
            this.f21893m.put(oVar.mWho, oVar);
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + oVar);
            }
        }
    }

    public int hashCode() {
        return (((this.f21893m.hashCode() * 31) + this.f21894n.hashCode()) * 31) + this.f21895o.hashCode();
    }

    /* access modifiers changed from: package-private */
    public void i(C5187o oVar, boolean z10) {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + oVar);
        }
        k(oVar.mWho, z10);
    }

    /* access modifiers changed from: package-private */
    public void j(String str, boolean z10) {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        k(str, z10);
    }

    /* access modifiers changed from: protected */
    public void onCleared() {
        if (FragmentManager.U0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f21897q = true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator<C5187o> it = this.f21893m.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator<String> it2 = this.f21894n.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append(it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator<String> it3 = this.f21895o.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append(it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
