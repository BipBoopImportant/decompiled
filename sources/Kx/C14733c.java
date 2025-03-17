package kx;

import com.ingka.ikea.prepaidcarddata.impl.data.model.remote.PrepaidCardRemote;
import ix.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import pp.C11769c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lkx/c;", "Lpp/c;", "Lix/c;", "Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;", "Lkx/a;", "amountMapper", "Lkx/b;", "imageMapper", "<init>", "(Lkx/a;Lkx/b;)V", "remote", "b", "(Lcom/ingka/ikea/prepaidcarddata/impl/data/model/remote/PrepaidCardRemote;)Lix/c;", "a", "Lkx/a;", "Lkx/b;", "prepaidcarddata-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: kx.c  reason: case insensitive filesystem */
public final class C14733c implements C11769c<c, PrepaidCardRemote> {

    /* renamed from: a  reason: collision with root package name */
    private final C14731a f128881a;

    /* renamed from: b  reason: collision with root package name */
    private final C14732b f128882b;

    public C14733c(C14731a aVar, C14732b bVar) {
        C17542s.j(aVar, "amountMapper");
        C17542s.j(bVar, "imageMapper");
        this.f128881a = aVar;
        this.f128882b = bVar;
    }

    /* renamed from: b */
    public c a(PrepaidCardRemote prepaidCardRemote) {
        C17542s.j(prepaidCardRemote, "remote");
        String c10 = prepaidCardRemote.c();
        String e10 = prepaidCardRemote.e();
        String g10 = prepaidCardRemote.g();
        String b10 = prepaidCardRemote.b();
        if (b10 == null) {
            b10 = "";
        }
        return new c(c10, e10, g10, prepaidCardRemote.f(), c.C3149c.Companion.a(prepaidCardRemote.h()), b10, c.d.Companion.a(prepaidCardRemote.i()), this.f128881a.a(prepaidCardRemote.a()), this.f128882b.a(prepaidCardRemote.d()));
    }

    public List<c> c(List<PrepaidCardRemote> list) {
        return C11769c.a.a(this, list);
    }
}
