package M2;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class c extends a {

    /* renamed from: i  reason: collision with root package name */
    private int f9149i;

    /* renamed from: j  reason: collision with root package name */
    private int f9150j;

    /* renamed from: k  reason: collision with root package name */
    private LayoutInflater f9151k;

    @Deprecated
    public c(Context context, int i10, Cursor cursor, boolean z10) {
        super(context, cursor, z10);
        this.f9150j = i10;
        this.f9149i = i10;
        this.f9151k = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9151k.inflate(this.f9150j, viewGroup, false);
    }

    public View h(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f9151k.inflate(this.f9149i, viewGroup, false);
    }
}
