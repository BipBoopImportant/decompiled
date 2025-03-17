package kx;

import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote;
import ix.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lkx/a;", "Lpp/c;", "Lix/c$a;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;", "<init>", "()V", "remote", "b", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote$Amount;)Lix/c$a;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kx.a  reason: case insensitive filesystem */
public final class C14731a implements C11769c<c.a, PrepaidCardRemote.Amount> {
    /* renamed from: b */
    public c.a a(PrepaidCardRemote.Amount amount) {
        C17542s.j(amount, "remote");
        return new c.a(amount.a());
    }
}
