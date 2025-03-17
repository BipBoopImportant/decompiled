package zF;

import AF.C12570D;
import android.os.Bundle;
import androidx.recyclerview.widget.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ!\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LzF/c;", "Landroidx/recyclerview/widget/h$f;", "LAF/D;", "<init>", "()V", "oldItem", "newItem", "", "b", "(LAF/D;LAF/D;)Z", "a", "", "c", "(LAF/D;LAF/D;)Ljava/lang/Object;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zF.c  reason: case insensitive filesystem */
public final class C15342c extends h.f<C12570D> {
    /* renamed from: a */
    public boolean areContentsTheSame(C12570D d10, C12570D d11) {
        C17542s.j(d10, "oldItem");
        C17542s.j(d11, "newItem");
        return C17542s.e(d10, d11);
    }

    /* renamed from: b */
    public boolean areItemsTheSame(C12570D d10, C12570D d11) {
        C17542s.j(d10, "oldItem");
        C17542s.j(d11, "newItem");
        return C17542s.e(d10.a(), d11.a());
    }

    /* renamed from: c */
    public Object getChangePayload(C12570D d10, C12570D d11) {
        C17542s.j(d10, "oldItem");
        C17542s.j(d11, "newItem");
        if (d10.c() == d11.c() && d10.f() == d11.f() && d11.b()) {
            return super.getChangePayload(d10, d11);
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("arg.highlighted", d11.c());
        bundle.putBoolean("arg.selected", d11.f());
        bundle.putBoolean("arg.isProcessing", d11.e());
        bundle.putBoolean("arg.isUploading", d11.g());
        bundle.putBoolean("arg.isNew", d11.d());
        return bundle;
    }
}
