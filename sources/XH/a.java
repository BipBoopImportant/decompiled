package Xh;

import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.app.productinformationpage.ui.sections.AssemblyAndDocumentsFragment;
import com.ingka.ikea.core.model.product.Attachment;
import nI.C17642l;

public final /* synthetic */ class a implements C17642l {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f64822a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AssemblyAndDocumentsFragment f64823b;

    public /* synthetic */ a(RecyclerView recyclerView, AssemblyAndDocumentsFragment assemblyAndDocumentsFragment) {
        this.f64822a = recyclerView;
        this.f64823b = assemblyAndDocumentsFragment;
    }

    public final Object invoke(Object obj) {
        return AssemblyAndDocumentsFragment.S0(this.f64822a, this.f64823b, (Attachment) obj);
    }
}
