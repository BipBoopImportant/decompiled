package com.google.android.material.internal;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.internal.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a<T extends i<T>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, T> f66863a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final Set<Integer> f66864b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private b f66865c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f66866d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f66867e;

    /* renamed from: com.google.android.material.internal.a$a  reason: collision with other inner class name */
    class C1168a implements i.a<T> {
        C1168a() {
        }

        /* renamed from: b */
        public void a(T t10, boolean z10) {
            if (!z10) {
                a aVar = a.this;
                if (!aVar.r(t10, aVar.f66867e)) {
                    return;
                }
            } else if (!a.this.g(t10)) {
                return;
            }
            a.this.m();
        }
    }

    public interface b {
        void a(Set<Integer> set);
    }

    /* access modifiers changed from: private */
    public boolean g(i<T> iVar) {
        int id2 = iVar.getId();
        if (this.f66864b.contains(Integer.valueOf(id2))) {
            return false;
        }
        i iVar2 = (i) this.f66863a.get(Integer.valueOf(k()));
        if (iVar2 != null) {
            r(iVar2, false);
        }
        boolean add = this.f66864b.add(Integer.valueOf(id2));
        if (!iVar.isChecked()) {
            iVar.setChecked(true);
        }
        return add;
    }

    /* access modifiers changed from: private */
    public void m() {
        b bVar = this.f66865c;
        if (bVar != null) {
            bVar.a(i());
        }
    }

    /* access modifiers changed from: private */
    public boolean r(i<T> iVar, boolean z10) {
        int id2 = iVar.getId();
        if (!this.f66864b.contains(Integer.valueOf(id2))) {
            return false;
        }
        if (!z10 || this.f66864b.size() != 1 || !this.f66864b.contains(Integer.valueOf(id2))) {
            boolean remove = this.f66864b.remove(Integer.valueOf(id2));
            if (iVar.isChecked()) {
                iVar.setChecked(false);
            }
            return remove;
        }
        iVar.setChecked(true);
        return false;
    }

    public void e(T t10) {
        this.f66863a.put(Integer.valueOf(t10.getId()), t10);
        if (t10.isChecked()) {
            g(t10);
        }
        t10.setInternalOnCheckedChangeListener(new C1168a());
    }

    public void f(int i10) {
        i iVar = (i) this.f66863a.get(Integer.valueOf(i10));
        if (iVar != null && g(iVar)) {
            m();
        }
    }

    public void h() {
        boolean isEmpty = this.f66864b.isEmpty();
        for (T r10 : this.f66863a.values()) {
            r(r10, false);
        }
        if (!isEmpty) {
            m();
        }
    }

    public Set<Integer> i() {
        return new HashSet(this.f66864b);
    }

    public List<Integer> j(ViewGroup viewGroup) {
        Set<Integer> i10 = i();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if ((childAt instanceof i) && i10.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public int k() {
        if (!this.f66866d || this.f66864b.isEmpty()) {
            return -1;
        }
        return this.f66864b.iterator().next().intValue();
    }

    public boolean l() {
        return this.f66866d;
    }

    public void n(T t10) {
        t10.setInternalOnCheckedChangeListener((i.a) null);
        this.f66863a.remove(Integer.valueOf(t10.getId()));
        this.f66864b.remove(Integer.valueOf(t10.getId()));
    }

    public void o(b bVar) {
        this.f66865c = bVar;
    }

    public void p(boolean z10) {
        this.f66867e = z10;
    }

    public void q(boolean z10) {
        if (this.f66866d != z10) {
            this.f66866d = z10;
            h();
        }
    }
}
