package K6;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

final class J {
    static ArrayList<View> a(View view) {
        if (!(view instanceof ViewGroup)) {
            ArrayList<View> arrayList = new ArrayList<>();
            arrayList.add(view);
            return arrayList;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        ViewGroup viewGroup = (ViewGroup) view;
        arrayList2.add(view);
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(a(viewGroup.getChildAt(i10)));
            arrayList2.addAll(arrayList3);
        }
        return arrayList2;
    }
}
