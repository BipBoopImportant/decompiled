package KF;

import com.sugarcube.app.base.upload.g;
import java.util.function.Predicate;
import nI.C17642l;

/* renamed from: KF.y  reason: case insensitive filesystem */
public final /* synthetic */ class C13171y implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17642l f111753a;

    public /* synthetic */ C13171y(C17642l lVar) {
        this.f111753a = lVar;
    }

    public final boolean test(Object obj) {
        return g.V(this.f111753a, obj);
    }
}
