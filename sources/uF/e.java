package UF;

import android.view.View;
import com.sugarcube.core.network.models.QuickFilter;
import com.sugarcube.decorate.v1.internal.catalog.adapters.FilterPillAdapter;

public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f138942a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ FilterPillAdapter f138943b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ FilterPillAdapter.a f138944c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ QuickFilter f138945d;

    public /* synthetic */ e(int i10, FilterPillAdapter filterPillAdapter, FilterPillAdapter.a aVar, QuickFilter quickFilter) {
        this.f138942a = i10;
        this.f138943b = filterPillAdapter;
        this.f138944c = aVar;
        this.f138945d = quickFilter;
    }

    public final void onClick(View view) {
        FilterPillAdapter.g(this.f138942a, this.f138943b, this.f138944c, this.f138945d, view);
    }
}
