package M2;

import android.database.Cursor;
import android.widget.Filter;

class b extends Filter {

    /* renamed from: a  reason: collision with root package name */
    a f9148a;

    interface a {
        void a(Cursor cursor);

        CharSequence b(Cursor cursor);

        Cursor c(CharSequence charSequence);

        Cursor d();
    }

    b(a aVar) {
        this.f9148a = aVar;
    }

    public CharSequence convertResultToString(Object obj) {
        return this.f9148a.b((Cursor) obj);
    }

    /* access modifiers changed from: protected */
    public Filter.FilterResults performFiltering(CharSequence charSequence) {
        Cursor c10 = this.f9148a.c(charSequence);
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (c10 != null) {
            filterResults.count = c10.getCount();
            filterResults.values = c10;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    /* access modifiers changed from: protected */
    public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        Cursor d10 = this.f9148a.d();
        Object obj = filterResults.values;
        if (obj != null && obj != d10) {
            this.f9148a.a((Cursor) obj);
        }
    }
}
