package Y5;

import WK.C16770e;
import WK.L;
import WK.O;
import XH.C16807N;
import java.io.IOException;
import kotlin.Metadata;
import nI.C17642l;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0016\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u0007\u001a\u0012\u0012\b\u0012\u00060\u0004j\u0002`\u0005\u0012\u0004\u0012\u00020\u00060\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"LY5/d;", "LWK/L;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "Lokio/IOException;", "LXH/N;", "onException", "<init>", "(LWK/L;LnI/l;)V", "LWK/e;", "source", "", "byteCount", "s3", "(LWK/e;J)V", "flush", "()V", "close", "LWK/O;", "y", "()LWK/O;", "a", "LWK/L;", "b", "LnI/l;", "", "c", "Z", "hasErrors", "coil-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements L {

    /* renamed from: a  reason: collision with root package name */
    private final L f40869a;

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<IOException, C16807N> f40870b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f40871c;

    public d(L l10, C17642l<? super IOException, C16807N> lVar) {
        this.f40869a = l10;
        this.f40870b = lVar;
    }

    public void close() {
        try {
            this.f40869a.close();
        } catch (IOException e10) {
            this.f40871c = true;
            this.f40870b.invoke(e10);
        }
    }

    public void flush() {
        try {
            this.f40869a.flush();
        } catch (IOException e10) {
            this.f40871c = true;
            this.f40870b.invoke(e10);
        }
    }

    public void s3(C16770e eVar, long j10) {
        if (this.f40871c) {
            eVar.M(j10);
            return;
        }
        try {
            this.f40869a.s3(eVar, j10);
        } catch (IOException e10) {
            this.f40871c = true;
            this.f40870b.invoke(e10);
        }
    }

    public O y() {
        return this.f40869a.y();
    }
}
