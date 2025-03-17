package M2;

import M2.b;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class a extends BaseAdapter implements Filterable, b.a {

    /* renamed from: a  reason: collision with root package name */
    protected boolean f9138a;

    /* renamed from: b  reason: collision with root package name */
    protected boolean f9139b;

    /* renamed from: c  reason: collision with root package name */
    protected Cursor f9140c;

    /* renamed from: d  reason: collision with root package name */
    protected Context f9141d;

    /* renamed from: e  reason: collision with root package name */
    protected int f9142e;

    /* renamed from: f  reason: collision with root package name */
    protected C0130a f9143f;

    /* renamed from: g  reason: collision with root package name */
    protected DataSetObserver f9144g;

    /* renamed from: h  reason: collision with root package name */
    protected b f9145h;

    /* renamed from: M2.a$a  reason: collision with other inner class name */
    private class C0130a extends ContentObserver {
        C0130a() {
            super(new Handler());
        }

        public boolean deliverSelfNotifications() {
            return true;
        }

        public void onChange(boolean z10) {
            a.this.i();
        }
    }

    private class b extends DataSetObserver {
        b() {
        }

        public void onChanged() {
            a aVar = a.this;
            aVar.f9138a = true;
            aVar.notifyDataSetChanged();
        }

        public void onInvalidated() {
            a aVar = a.this;
            aVar.f9138a = false;
            aVar.notifyDataSetInvalidated();
        }
    }

    public a(Context context, Cursor cursor, boolean z10) {
        f(context, cursor, z10 ? 1 : 2);
    }

    public void a(Cursor cursor) {
        Cursor j10 = j(cursor);
        if (j10 != null) {
            j10.close();
        }
    }

    public Cursor d() {
        return this.f9140c;
    }

    public abstract void e(View view, Context context, Cursor cursor);

    /* access modifiers changed from: package-private */
    public void f(Context context, Cursor cursor, int i10) {
        boolean z10 = false;
        if ((i10 & 1) == 1) {
            i10 |= 2;
            this.f9139b = true;
        } else {
            this.f9139b = false;
        }
        if (cursor != null) {
            z10 = true;
        }
        this.f9140c = cursor;
        this.f9138a = z10;
        this.f9141d = context;
        this.f9142e = z10 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i10 & 2) == 2) {
            this.f9143f = new C0130a();
            this.f9144g = new b();
        } else {
            this.f9143f = null;
            this.f9144g = null;
        }
        if (z10) {
            C0130a aVar = this.f9143f;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f9144g;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract View g(Context context, Cursor cursor, ViewGroup viewGroup);

    public int getCount() {
        Cursor cursor;
        if (!this.f9138a || (cursor = this.f9140c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f9138a) {
            return null;
        }
        this.f9140c.moveToPosition(i10);
        if (view == null) {
            view = g(this.f9141d, this.f9140c, viewGroup);
        }
        e(view, this.f9141d, this.f9140c);
        return view;
    }

    public Filter getFilter() {
        if (this.f9145h == null) {
            this.f9145h = new b(this);
        }
        return this.f9145h;
    }

    public Object getItem(int i10) {
        Cursor cursor;
        if (!this.f9138a || (cursor = this.f9140c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f9140c;
    }

    public long getItemId(int i10) {
        Cursor cursor;
        if (!this.f9138a || (cursor = this.f9140c) == null || !cursor.moveToPosition(i10)) {
            return 0;
        }
        return this.f9140c.getLong(this.f9142e);
    }

    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f9138a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        } else if (this.f9140c.moveToPosition(i10)) {
            if (view == null) {
                view = h(this.f9141d, this.f9140c, viewGroup);
            }
            e(view, this.f9141d, this.f9140c);
            return view;
        } else {
            throw new IllegalStateException("couldn't move cursor to position " + i10);
        }
    }

    public abstract View h(Context context, Cursor cursor, ViewGroup viewGroup);

    /* access modifiers changed from: protected */
    public void i() {
        Cursor cursor;
        if (this.f9139b && (cursor = this.f9140c) != null && !cursor.isClosed()) {
            this.f9138a = this.f9140c.requery();
        }
    }

    public Cursor j(Cursor cursor) {
        Cursor cursor2 = this.f9140c;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            C0130a aVar = this.f9143f;
            if (aVar != null) {
                cursor2.unregisterContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.f9144g;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f9140c = cursor;
        if (cursor != null) {
            C0130a aVar2 = this.f9143f;
            if (aVar2 != null) {
                cursor.registerContentObserver(aVar2);
            }
            DataSetObserver dataSetObserver2 = this.f9144g;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f9142e = cursor.getColumnIndexOrThrow("_id");
            this.f9138a = true;
            notifyDataSetChanged();
        } else {
            this.f9142e = -1;
            this.f9138a = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }
}
