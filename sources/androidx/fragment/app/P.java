package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class P {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<C5187o> f21923a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, O> f21924b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, Bundle> f21925c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private K f21926d;

    P() {
    }

    /* access modifiers changed from: package-private */
    public void A(K k10) {
        this.f21926d = k10;
    }

    /* access modifiers changed from: package-private */
    public Bundle B(String str, Bundle bundle) {
        return bundle != null ? this.f21925c.put(str, bundle) : this.f21925c.remove(str);
    }

    /* access modifiers changed from: package-private */
    public void a(C5187o oVar) {
        if (!this.f21923a.contains(oVar)) {
            synchronized (this.f21923a) {
                this.f21923a.add(oVar);
            }
            oVar.mAdded = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + oVar);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f21924b.values().removeAll(Collections.singleton((Object) null));
    }

    /* access modifiers changed from: package-private */
    public boolean c(String str) {
        return this.f21924b.get(str) != null;
    }

    /* access modifiers changed from: package-private */
    public void d(int i10) {
        for (O next : this.f21924b.values()) {
            if (next != null) {
                next.t(i10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f21924b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (O next : this.f21924b.values()) {
                printWriter.print(str);
                if (next != null) {
                    C5187o k10 = next.k();
                    printWriter.println(k10);
                    k10.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f21923a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(this.f21923a.get(i10).toString());
            }
        }
    }

    /* access modifiers changed from: package-private */
    public C5187o f(String str) {
        O o10 = this.f21924b.get(str);
        if (o10 != null) {
            return o10.k();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C5187o g(int i10) {
        for (int size = this.f21923a.size() - 1; size >= 0; size--) {
            C5187o oVar = this.f21923a.get(size);
            if (oVar != null && oVar.mFragmentId == i10) {
                return oVar;
            }
        }
        for (O next : this.f21924b.values()) {
            if (next != null) {
                C5187o k10 = next.k();
                if (k10.mFragmentId == i10) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C5187o h(String str) {
        if (str != null) {
            for (int size = this.f21923a.size() - 1; size >= 0; size--) {
                C5187o oVar = this.f21923a.get(size);
                if (oVar != null && str.equals(oVar.mTag)) {
                    return oVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (O next : this.f21924b.values()) {
            if (next != null) {
                C5187o k10 = next.k();
                if (str.equals(k10.mTag)) {
                    return k10;
                }
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C5187o i(String str) {
        C5187o findFragmentByWho;
        for (O next : this.f21924b.values()) {
            if (next != null && (findFragmentByWho = next.k().findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public int j(C5187o oVar) {
        View view;
        View view2;
        ViewGroup viewGroup = oVar.mContainer;
        if (viewGroup == null) {
            return -1;
        }
        int indexOf = this.f21923a.indexOf(oVar);
        for (int i10 = indexOf - 1; i10 >= 0; i10--) {
            C5187o oVar2 = this.f21923a.get(i10);
            if (oVar2.mContainer == viewGroup && (view2 = oVar2.mView) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            indexOf++;
            if (indexOf >= this.f21923a.size()) {
                return -1;
            }
            C5187o oVar3 = this.f21923a.get(indexOf);
            if (oVar3.mContainer == viewGroup && (view = oVar3.mView) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public List<O> k() {
        ArrayList arrayList = new ArrayList();
        for (O next : this.f21924b.values()) {
            if (next != null) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public List<C5187o> l() {
        ArrayList arrayList = new ArrayList();
        for (O next : this.f21924b.values()) {
            if (next != null) {
                arrayList.add(next.k());
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, Bundle> m() {
        return this.f21925c;
    }

    /* access modifiers changed from: package-private */
    public O n(String str) {
        return this.f21924b.get(str);
    }

    /* access modifiers changed from: package-private */
    public List<C5187o> o() {
        ArrayList arrayList;
        if (this.f21923a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f21923a) {
            arrayList = new ArrayList(this.f21923a);
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public K p() {
        return this.f21926d;
    }

    /* access modifiers changed from: package-private */
    public Bundle q(String str) {
        return this.f21925c.get(str);
    }

    /* access modifiers changed from: package-private */
    public void r(O o10) {
        C5187o k10 = o10.k();
        if (!c(k10.mWho)) {
            this.f21924b.put(k10.mWho, o10);
            if (k10.mRetainInstanceChangedWhileDetached) {
                if (k10.mRetainInstance) {
                    this.f21926d.h(k10);
                } else {
                    this.f21926d.I(k10);
                }
                k10.mRetainInstanceChangedWhileDetached = false;
            }
            if (FragmentManager.U0(2)) {
                Log.v("FragmentManager", "Added fragment to active set " + k10);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void s(O o10) {
        C5187o k10 = o10.k();
        if (k10.mRetainInstance) {
            this.f21926d.I(k10);
        }
        if (this.f21924b.get(k10.mWho) == o10 && this.f21924b.put(k10.mWho, (Object) null) != null && FragmentManager.U0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + k10);
        }
    }

    /* access modifiers changed from: package-private */
    public void t() {
        Iterator<C5187o> it = this.f21923a.iterator();
        while (it.hasNext()) {
            O o10 = this.f21924b.get(it.next().mWho);
            if (o10 != null) {
                o10.m();
            }
        }
        for (O next : this.f21924b.values()) {
            if (next != null) {
                next.m();
                C5187o k10 = next.k();
                if (k10.mRemoving && !k10.isInBackStack()) {
                    if (k10.mBeingSaved && !this.f21925c.containsKey(k10.mWho)) {
                        B(k10.mWho, next.r());
                    }
                    s(next);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void u(C5187o oVar) {
        synchronized (this.f21923a) {
            this.f21923a.remove(oVar);
        }
        oVar.mAdded = false;
    }

    /* access modifiers changed from: package-private */
    public void v() {
        this.f21924b.clear();
    }

    /* access modifiers changed from: package-private */
    public void w(List<String> list) {
        this.f21923a.clear();
        if (list != null) {
            for (String next : list) {
                C5187o f10 = f(next);
                if (f10 != null) {
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + next + "): " + f10);
                    }
                    a(f10);
                } else {
                    throw new IllegalStateException("No instantiated fragment for (" + next + ")");
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void x(HashMap<String, Bundle> hashMap) {
        this.f21925c.clear();
        this.f21925c.putAll(hashMap);
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> y() {
        ArrayList<String> arrayList = new ArrayList<>(this.f21924b.size());
        for (O next : this.f21924b.values()) {
            if (next != null) {
                C5187o k10 = next.k();
                B(k10.mWho, next.r());
                arrayList.add(k10.mWho);
                if (FragmentManager.U0(2)) {
                    Log.v("FragmentManager", "Saved state of " + k10 + ": " + k10.mSavedFragmentState);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> z() {
        synchronized (this.f21923a) {
            try {
                if (this.f21923a.isEmpty()) {
                    return null;
                }
                ArrayList<String> arrayList = new ArrayList<>(this.f21923a.size());
                Iterator<C5187o> it = this.f21923a.iterator();
                while (it.hasNext()) {
                    C5187o next = it.next();
                    arrayList.add(next.mWho);
                    if (FragmentManager.U0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + next.mWho + "): " + next);
                    }
                }
                return arrayList;
            } finally {
            }
        }
    }
}
