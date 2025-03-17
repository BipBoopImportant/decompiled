package jq;

import androidx.recyclerview.widget.RecyclerView;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.energylabel.impl.EnergyLabelDialog;
import nI.p;

public final /* synthetic */ class g implements p {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ EnergyLabelDialog f98645a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ RecyclerView f98646b;

    public /* synthetic */ g(EnergyLabelDialog energyLabelDialog, RecyclerView recyclerView) {
        this.f98645a = energyLabelDialog;
        this.f98646b = recyclerView;
    }

    public final Object invoke(Object obj, Object obj2) {
        return EnergyLabelDialog.N0(this.f98645a, this.f98646b, (Image[]) obj, ((Integer) obj2).intValue());
    }
}
