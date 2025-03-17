package sg;

import android.content.DialogInterface;
import java.util.List;
import nI.C17642l;

public final /* synthetic */ class h implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17642l f76549a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ List f76550b;

    public /* synthetic */ h(C17642l lVar, List list) {
        this.f76549a = lVar;
        this.f76550b = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i10) {
        j.d(this.f76549a, this.f76550b, dialogInterface, i10);
    }
}
