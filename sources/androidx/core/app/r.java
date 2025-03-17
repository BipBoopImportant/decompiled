package androidx.core.app;

import android.os.Bundle;
import androidx.core.app.o;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Set;

class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f21101a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static final Object f21102b = new Object();

    static Bundle a(o.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat d10 = aVar.d();
        bundle.putInt("icon", d10 != null ? d10.g() : 0);
        bundle.putCharSequence("title", aVar.h());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.c() != null ? new Bundle(aVar.c()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", c(aVar.e()));
        bundle.putBoolean("showsUserInterface", aVar.g());
        bundle.putInt("semanticAction", aVar.f());
        return bundle;
    }

    private static Bundle b(y yVar) {
        Bundle bundle = new Bundle();
        bundle.putString("resultKey", yVar.i());
        bundle.putCharSequence("label", yVar.h());
        bundle.putCharSequenceArray("choices", yVar.e());
        bundle.putBoolean("allowFreeFormInput", yVar.c());
        bundle.putBundle("extras", yVar.g());
        Set<String> d10 = yVar.d();
        if (d10 != null && !d10.isEmpty()) {
            ArrayList arrayList = new ArrayList(d10.size());
            for (String add : d10) {
                arrayList.add(add);
            }
            bundle.putStringArrayList("allowedDataTypes", arrayList);
        }
        return bundle;
    }

    private static Bundle[] c(y[] yVarArr) {
        if (yVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[yVarArr.length];
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            bundleArr[i10] = b(yVarArr[i10]);
        }
        return bundleArr;
    }
}
