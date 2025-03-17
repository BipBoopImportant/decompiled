package JK;

import WK.C16770e;
import WK.C16779n;
import WK.L;
import XH.C16807N;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0011R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"LJK/e;", "LWK/n;", "LWK/L;", "delegate", "Lkotlin/Function1;", "Ljava/io/IOException;", "LXH/N;", "onException", "<init>", "(LWK/L;LnI/l;)V", "LWK/e;", "source", "", "byteCount", "s3", "(LWK/e;J)V", "flush", "()V", "close", "b", "LnI/l;", "getOnException", "()LnI/l;", "", "c", "Z", "hasErrors", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class e extends C16779n {

    /* renamed from: b  reason: collision with root package name */
    private final C17642l<IOException, C16807N> f135891b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f135892c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(L l10, C17642l<? super IOException, C16807N> lVar) {
        super(l10);
        C17542s.j(l10, "delegate");
        C17542s.j(lVar, "onException");
        this.f135891b = lVar;
    }

    public void close() {
        if (!this.f135892c) {
            try {
                super.close();
            } catch (IOException e10) {
                this.f135892c = true;
                this.f135891b.invoke(e10);
            }
        }
    }

    public void flush() {
        if (!this.f135892c) {
            try {
                super.flush();
            } catch (IOException e10) {
                this.f135892c = true;
                this.f135891b.invoke(e10);
            }
        }
    }

    public void s3(C16770e eVar, long j10) {
        C17542s.j(eVar, "source");
        if (this.f135892c) {
            eVar.M(j10);
            return;
        }
        try {
            super.s3(eVar, j10);
        } catch (IOException e10) {
            this.f135892c = true;
            this.f135891b.invoke(e10);
        }
    }
}
