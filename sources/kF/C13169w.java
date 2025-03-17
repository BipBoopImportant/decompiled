package KF;

import com.sugarcube.app.base.upload.g;
import java.util.function.Predicate;
import nI.C17642l;

/* renamed from: KF.w  reason: case insensitive filesystem */
public final /* synthetic */ class C13169w implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17642l f111752a;

    public /* synthetic */ C13169w(C17642l lVar) {
        this.f111752a = lVar;
    }

    public final boolean test(Object obj) {
        return g.X(this.f111752a, obj);
    }
}
