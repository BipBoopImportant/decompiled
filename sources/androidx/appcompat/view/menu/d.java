package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.l;
import i.C5427g;
import java.util.ArrayList;

public class d implements k, AdapterView.OnItemClickListener {

    /* renamed from: a  reason: collision with root package name */
    Context f15804a;

    /* renamed from: b  reason: collision with root package name */
    LayoutInflater f15805b;

    /* renamed from: c  reason: collision with root package name */
    f f15806c;

    /* renamed from: d  reason: collision with root package name */
    ExpandedMenuView f15807d;

    /* renamed from: e  reason: collision with root package name */
    int f15808e;

    /* renamed from: f  reason: collision with root package name */
    int f15809f;

    /* renamed from: g  reason: collision with root package name */
    int f15810g;

    /* renamed from: h  reason: collision with root package name */
    private k.a f15811h;

    /* renamed from: i  reason: collision with root package name */
    a f15812i;

    /* renamed from: j  reason: collision with root package name */
    private int f15813j;

    private class a extends BaseAdapter {

        /* renamed from: a  reason: collision with root package name */
        private int f15814a = -1;

        public a() {
            a();
        }

        /* access modifiers changed from: package-private */
        public void a() {
            h x10 = d.this.f15806c.x();
            if (x10 != null) {
                ArrayList<h> B10 = d.this.f15806c.B();
                int size = B10.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (B10.get(i10) == x10) {
                        this.f15814a = i10;
                        return;
                    }
                }
            }
            this.f15814a = -1;
        }

        /* renamed from: b */
        public h getItem(int i10) {
            ArrayList<h> B10 = d.this.f15806c.B();
            int i11 = i10 + d.this.f15808e;
            int i12 = this.f15814a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return B10.get(i11);
        }

        public int getCount() {
            int size = d.this.f15806c.B().size() - d.this.f15808e;
            return this.f15814a < 0 ? size : size - 1;
        }

        public long getItemId(int i10) {
            return (long) i10;
        }

        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                d dVar = d.this;
                view = dVar.f15805b.inflate(dVar.f15810g, viewGroup, false);
            }
            ((l.a) view).c(getItem(i10), 0);
            return view;
        }

        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public d(Context context, int i10) {
        this(i10, 0);
        this.f15804a = context;
        this.f15805b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f15812i == null) {
            this.f15812i = new a();
        }
        return this.f15812i;
    }

    public l b(ViewGroup viewGroup) {
        if (this.f15807d == null) {
            this.f15807d = (ExpandedMenuView) this.f15805b.inflate(C5427g.f24013g, viewGroup, false);
            if (this.f15812i == null) {
                this.f15812i = new a();
            }
            this.f15807d.setAdapter(this.f15812i);
            this.f15807d.setOnItemClickListener(this);
        }
        return this.f15807d;
    }

    public void c(f fVar, boolean z10) {
        k.a aVar = this.f15811h;
        if (aVar != null) {
            aVar.c(fVar, z10);
        }
    }

    public boolean d(f fVar, h hVar) {
        return false;
    }

    public void e(k.a aVar) {
        this.f15811h = aVar;
    }

    public void f(Parcelable parcelable) {
        m((Bundle) parcelable);
    }

    public boolean g(o oVar) {
        if (!oVar.hasVisibleItems()) {
            return false;
        }
        new g(oVar).b((IBinder) null);
        k.a aVar = this.f15811h;
        if (aVar == null) {
            return true;
        }
        aVar.d(oVar);
        return true;
    }

    public int getId() {
        return this.f15813j;
    }

    public Parcelable h() {
        if (this.f15807d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        n(bundle);
        return bundle;
    }

    public void i(boolean z10) {
        a aVar = this.f15812i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public boolean j() {
        return false;
    }

    public boolean k(f fVar, h hVar) {
        return false;
    }

    public void l(Context context, f fVar) {
        if (this.f15809f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f15809f);
            this.f15804a = contextThemeWrapper;
            this.f15805b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f15804a != null) {
            this.f15804a = context;
            if (this.f15805b == null) {
                this.f15805b = LayoutInflater.from(context);
            }
        }
        this.f15806c = fVar;
        a aVar = this.f15812i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void m(Bundle bundle) {
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f15807d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    public void n(Bundle bundle) {
        SparseArray sparseArray = new SparseArray();
        ExpandedMenuView expandedMenuView = this.f15807d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        this.f15806c.P(this.f15812i.getItem(i10), this, 0);
    }

    public d(int i10, int i11) {
        this.f15810g = i10;
        this.f15809f = i11;
    }
}
