package F5;

import WK.C16770e;
import WK.C16779n;
import WK.L;
import XH.C16807N;
import java.io.IOException;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0012R$\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005j\u0002`\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"LF5/d;", "LWK/n;", "LWK/L;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "LXH/N;", "onException", "<init>", "(LWK/L;LnI/l;)V", "LWK/e;", "source", "", "byteCount", "s3", "(LWK/e;J)V", "flush", "()V", "close", "b", "LnI/l;", "", "c", "Z", "hasErrors", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class d extends C16779n {

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<IOException, C16807N> f35454b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f35455c;

    public d(L l10, C17642l<? super IOException, C16807N> lVar) {
        super(l10);
        this.f35454b = lVar;
    }

    public void close() {
        try {
            super.close();
        } catch (IOException e10) {
            this.f35455c = true;
            this.f35454b.invoke(e10);
        }
    }

    public void flush() {
        try {
            super.flush();
        } catch (IOException e10) {
            this.f35455c = true;
            this.f35454b.invoke(e10);
        }
    }

    public void s3(C16770e eVar, long j10) {
        if (this.f35455c) {
            eVar.M(j10);
            return;
        }
        try {
            super.s3(eVar, j10);
        } catch (IOException e10) {
            this.f35455c = true;
            this.f35454b.invoke(e10);
        }
    }
}
