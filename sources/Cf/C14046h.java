package cF;

import XH.C16824o;
import XH.x;
import XH.y;
import android.util.Log;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.sugarcube.core.logger.AnyKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import x4.C;
import x4.C8948l;
import x4.C8951o;
import x4.I;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\f8\nX\u0002"}, d2 = {"Lx4/o;", "", "route", "Lx4/C;", "navOptions", "LXH/N;", "c", "(Lx4/o;Ljava/lang/Object;Lx4/C;)V", "", "Ljava/util/UUID;", "e", "(Ljava/lang/String;)Ljava/util/UUID;", "Lx4/l;", "backStackEntry", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: cF.h  reason: case insensitive filesystem */
public final class C14046h {
    /* access modifiers changed from: private */
    public static final C8948l b(C16824o<C8948l> oVar) {
        return oVar.getValue();
    }

    public static final void c(C8951o oVar, Object obj, C c10) {
        C17542s.j(oVar, "<this>");
        C17542s.j(obj, PlaceTypes.ROUTE);
        try {
            C8951o.f0(oVar, obj, c10, (I.a) null, 4, (Object) null);
        } catch (Throwable th2) {
            Log.e(AnyKt.SUGARCUBE_TAG, "Navigation error for route " + obj, th2);
        }
    }

    public static /* synthetic */ void d(C8951o oVar, Object obj, C c10, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            c10 = null;
        }
        c(oVar, obj, c10);
    }

    public static final UUID e(String str) {
        Object obj;
        try {
            x.a aVar = x.f139812b;
            obj = x.b(UUID.fromString(str));
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        if (x.g(obj)) {
            obj = null;
        }
        return (UUID) obj;
    }
}
