package a9;

import XH.C16807N;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17525a;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

public final /* synthetic */ class Y5 extends C17525a implements C17642l<View, C16807N> {
    public Y5(ArrayList arrayList) {
        super(1, arrayList, List.class, "add", "add(Ljava/lang/Object;)Z", 8);
    }

    public final Object invoke(Object obj) {
        View view = (View) obj;
        C17542s.j(view, "p0");
        ((List) this.f144363a).add(view);
        return C16807N.f139792a;
    }
}
