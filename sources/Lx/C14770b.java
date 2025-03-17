package lx;

import TJ.C16505B;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16534i;
import XH.C16807N;
import YH.C16877v;
import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote;
import dI.C17164e;
import eI.C17187b;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\u000b\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H@¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\r8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000e¨\u0006\u0010"}, d2 = {"Llx/b;", "Llx/a;", "<init>", "()V", "LTJ/g;", "", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;", "b", "()LTJ/g;", "cards", "LXH/N;", "a", "(Ljava/util/List;LdI/e;)Ljava/lang/Object;", "LTJ/B;", "LTJ/B;", "cardCache", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lx.b  reason: case insensitive filesystem */
public final class C14770b implements C14769a {

    /* renamed from: a  reason: collision with root package name */
    private final C16505B<List<PrepaidCardRemote>> f128966a = C16521S.a(C16877v.n());

    public Object a(List<PrepaidCardRemote> list, C17164e<? super C16807N> eVar) {
        Object emit = this.f128966a.emit(list, eVar);
        return emit == C17187b.f() ? emit : C16807N.f139792a;
    }

    public C16532g<List<PrepaidCardRemote>> b() {
        return C16534i.c(this.f128966a);
    }
}
