package l5;

import Q4.h;
import android.content.Context;
import androidx.work.impl.WorkDatabase;

/* renamed from: l5.G  reason: case insensitive filesystem */
public final /* synthetic */ class C8502G implements h.c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Context f54621a;

    public /* synthetic */ C8502G(Context context) {
        this.f54621a = context;
    }

    public final h a(h.b bVar) {
        return WorkDatabase.a.c(this.f54621a, bVar);
    }
}
