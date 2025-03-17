package j6;

import GK.C15776D;
import GK.C15786e;
import GK.C15787f;
import QJ.C16320n;
import XH.C16807N;
import XH.x;
import XH.y;
import java.io.IOException;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\u0010\u000e\u001a\u00060\u0010j\u0002`\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lj6/c;", "LGK/f;", "Lkotlin/Function1;", "", "LXH/N;", "Lkotlinx/coroutines/CompletionHandler;", "LGK/e;", "call", "LQJ/n;", "LGK/D;", "continuation", "<init>", "(LGK/e;LQJ/n;)V", "response", "e", "(LGK/e;LGK/D;)V", "Ljava/io/IOException;", "Lokio/IOException;", "c", "(LGK/e;Ljava/io/IOException;)V", "cause", "a", "(Ljava/lang/Throwable;)V", "LGK/e;", "b", "LQJ/n;", "coil-network-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: j6.c  reason: case insensitive filesystem */
final class C8405c implements C15787f, C17642l<Throwable, C16807N> {

    /* renamed from: a  reason: collision with root package name */
    private final C15786e f54049a;

    /* renamed from: b  reason: collision with root package name */
    private final C16320n<C15776D> f54050b;

    public C8405c(C15786e eVar, C16320n<? super C15776D> nVar) {
        this.f54049a = eVar;
        this.f54050b = nVar;
    }

    public void a(Throwable th2) {
        try {
            this.f54049a.cancel();
        } catch (Throwable unused) {
        }
    }

    public void c(C15786e eVar, IOException iOException) {
        if (!eVar.J()) {
            C16320n<C15776D> nVar = this.f54050b;
            x.a aVar = x.f139812b;
            nVar.resumeWith(x.b(y.a(iOException)));
        }
    }

    public void e(C15786e eVar, C15776D d10) {
        this.f54050b.resumeWith(x.b(d10));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((Throwable) obj);
        return C16807N.f139792a;
    }
}
