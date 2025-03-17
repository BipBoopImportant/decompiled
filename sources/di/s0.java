package DI;

import XH.C16796C;
import XH.t;
import XH.v;
import YH.C16877v;
import cJ.C17069f;
import java.util.ArrayList;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;
import yJ.C18741j;
import yJ.C18742k;

public abstract class s0<Type extends C18741j> {
    public /* synthetic */ s0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract boolean a(C17069f fVar);

    public final <Other extends C18742k> s0<Other> b(C17642l<? super Type, ? extends Other> lVar) {
        C17542s.j(lVar, "transform");
        if (this instanceof C15530A) {
            C15530A a10 = (C15530A) this;
            return new C15530A(a10.c(), (C18741j) lVar.invoke(a10.d()));
        } else if (this instanceof C15539J) {
            Iterable<v> c10 = ((C15539J) this).c();
            ArrayList arrayList = new ArrayList(C16877v.y(c10, 10));
            for (v vVar : c10) {
                arrayList.add(C16796C.a((C17069f) vVar.a(), lVar.invoke((C18741j) vVar.b())));
            }
            return new C15539J(arrayList);
        } else {
            throw new t();
        }
    }

    private s0() {
    }
}
