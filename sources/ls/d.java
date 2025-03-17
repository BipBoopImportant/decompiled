package Ls;

import HJ.C15854t;
import Is.e;
import com.ingka.ikea.core.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LLs/d;", "LLs/c;", "<init>", "()V", "LIs/e;", "entity", "LPs/d;", "a", "(LIs/e;)LPs/d;", "inboxrepository-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {
    public Ps.d a(e eVar) {
        C17542s.j(eVar, "entity");
        String j10 = eVar.j();
        String n10 = eVar.n();
        String c10 = eVar.c();
        String d10 = eVar.d();
        String i10 = eVar.i();
        if (C15854t.v0(i10)) {
            i10 = null;
        }
        return new Ps.d(j10, n10, c10, d10, eVar.l(), eVar.m(), eVar.k(), eVar.f(), eVar.g(), eVar.e(), i10 != null ? new Image(i10, eVar.h()) : null);
    }
}
