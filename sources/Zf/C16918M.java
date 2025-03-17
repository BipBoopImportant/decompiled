package ZF;

import com.sugarcube.decorate.v1.internal.v1.DecorateFragment;
import java.util.function.Predicate;
import nI.C17642l;

/* renamed from: ZF.M  reason: case insensitive filesystem */
public final /* synthetic */ class C16918M implements Predicate {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C17642l f140557a;

    public /* synthetic */ C16918M(C17642l lVar) {
        this.f140557a = lVar;
    }

    public final boolean test(Object obj) {
        return DecorateFragment.n4(this.f140557a, obj);
    }
}
