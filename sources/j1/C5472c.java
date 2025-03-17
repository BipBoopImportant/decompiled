package j1;

import XH.u;
import android.util.Log;
import android.util.SparseArray;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import o1.C5669i;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\t\u001a\u00020\u0003*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj1/a;", "Landroid/view/ViewStructure;", "root", "LXH/N;", "b", "(Lj1/a;Landroid/view/ViewStructure;)V", "Landroid/util/SparseArray;", "Landroid/view/autofill/AutofillValue;", "values", "a", "(Lj1/a;Landroid/util/SparseArray;)V", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: j1.c  reason: case insensitive filesystem */
public final class C5472c {
    public static final void a(C5470a aVar, SparseArray<AutofillValue> sparseArray) {
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            AutofillValue autofillValue = sparseArray.get(keyAt);
            C5475f fVar = C5475f.f24673a;
            if (fVar.d(autofillValue)) {
                aVar.b().b(keyAt, fVar.i(autofillValue).toString());
            } else if (fVar.b(autofillValue)) {
                throw new u("An operation is not implemented: " + "b/138604541: Add onFill() callback for date");
            } else if (fVar.c(autofillValue)) {
                throw new u("An operation is not implemented: " + "b/138604541: Add onFill() callback for list");
            } else if (fVar.e(autofillValue)) {
                throw new u("An operation is not implemented: " + "b/138604541:  Add onFill() callback for toggle");
            }
        }
    }

    public static final void b(C5470a aVar, ViewStructure viewStructure) {
        ViewStructure viewStructure2 = viewStructure;
        int a10 = C5474e.f24672a.a(viewStructure2, aVar.b().a().size());
        for (Map.Entry next : aVar.b().a().entrySet()) {
            int intValue = ((Number) next.getKey()).intValue();
            C5477h hVar = (C5477h) next.getValue();
            C5474e eVar = C5474e.f24672a;
            ViewStructure b10 = eVar.b(viewStructure2, a10);
            if (b10 != null) {
                C5475f fVar = C5475f.f24673a;
                AutofillId a11 = fVar.a(viewStructure2);
                C17542s.g(a11);
                fVar.g(b10, a11, intValue);
                eVar.d(b10, intValue, aVar.c().getContext().getPackageName(), (String) null, (String) null);
                fVar.h(b10, C5480k.f24681b.a());
                List<C5479j> a12 = hVar.a();
                ArrayList arrayList = new ArrayList(a12.size());
                int size = a12.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(C5471b.a(a12.get(i10)));
                }
                fVar.f(b10, (String[]) arrayList.toArray(new String[0]));
                C5669i b11 = hVar.b();
                if (b11 == null) {
                    Log.w("Autofill Warning", "Bounding box not set.\n                        Did you call perform autofillTree before the component was positioned? ");
                } else {
                    int round = Math.round(b11.o());
                    int round2 = Math.round(b11.r());
                    C5474e.f24672a.c(b10, round, round2, 0, 0, Math.round(b11.p()) - round, Math.round(b11.j()) - round2);
                }
            }
            a10++;
        }
    }
}
