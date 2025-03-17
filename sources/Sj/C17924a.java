package sJ;

import EI.C15644c;
import EI.C15649h;
import cJ.C17066c;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.P;
import nI.C17631a;
import tJ.C17989i;
import tJ.C17993m;
import tJ.C17994n;
import uI.C18064m;

/* renamed from: sJ.a  reason: case insensitive filesystem */
public class C17924a implements C15649h {

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ C18064m<Object>[] f147047b = {P.h(new G(C17924a.class, "annotations", "getAnnotations()Ljava/util/List;", 0))};

    /* renamed from: a  reason: collision with root package name */
    private final C17989i f147048a;

    public C17924a(C17994n nVar, C17631a<? extends List<? extends C15644c>> aVar) {
        C17542s.j(nVar, "storageManager");
        C17542s.j(aVar, "compute");
        this.f147048a = nVar.d(aVar);
    }

    private final List<C15644c> b() {
        return (List) C17993m.a(this.f147048a, this, f147047b[0]);
    }

    public boolean f2(C17066c cVar) {
        return C15649h.b.b(this, cVar);
    }

    public boolean isEmpty() {
        return b().isEmpty();
    }

    public Iterator<C15644c> iterator() {
        return b().iterator();
    }

    public C15644c v(C17066c cVar) {
        return C15649h.b.a(this, cVar);
    }
}
