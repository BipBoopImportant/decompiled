package UF;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R:\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00112\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00118\u0006@FX\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"LUF/c;", "Landroid/widget/ArrayAdapter;", "", "Landroid/widget/Filterable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "getCount", "()I", "position", "a", "(I)Ljava/lang/String;", "Landroid/widget/Filter;", "getFilter", "()Landroid/widget/Filter;", "", "value", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "(Ljava/util/List;)V", "suggestions", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: UF.c  reason: case insensitive filesystem */
public final class C16562c extends ArrayAdapter<String> implements Filterable {

    /* renamed from: a  reason: collision with root package name */
    private List<String> f138937a;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"UF/c$a", "Landroid/widget/Filter;", "", "constraint", "Landroid/widget/Filter$FilterResults;", "performFiltering", "(Ljava/lang/CharSequence;)Landroid/widget/Filter$FilterResults;", "results", "LXH/N;", "publishResults", "(Ljava/lang/CharSequence;Landroid/widget/Filter$FilterResults;)V", "v1_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: UF.c$a */
    public static final class a extends Filter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C16562c f138938a;

        a(C16562c cVar) {
            this.f138938a = cVar;
        }

        /* access modifiers changed from: protected */
        public Filter.FilterResults performFiltering(CharSequence charSequence) {
            Filter.FilterResults filterResults = new Filter.FilterResults();
            C16562c cVar = this.f138938a;
            if (charSequence != null) {
                filterResults.values = cVar.b();
                filterResults.count = cVar.getCount();
            }
            return filterResults;
        }

        /* access modifiers changed from: protected */
        public void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if ((filterResults != null ? filterResults.count : 0) > 0) {
                this.f138938a.notifyDataSetChanged();
            } else {
                this.f138938a.notifyDataSetInvalidated();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16562c(Context context) {
        super(context, 17367043);
        C17542s.j(context, "context");
    }

    /* renamed from: a */
    public String getItem(int i10) {
        List<String> list = this.f138937a;
        if (list != null) {
            return list.get(i10);
        }
        return null;
    }

    public final List<String> b() {
        return this.f138937a;
    }

    public final void c(List<String> list) {
        if (!C17542s.e(this.f138937a, list)) {
            this.f138937a = list;
            notifyDataSetChanged();
        }
    }

    public int getCount() {
        List<String> list = this.f138937a;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public Filter getFilter() {
        return new a(this);
    }
}
