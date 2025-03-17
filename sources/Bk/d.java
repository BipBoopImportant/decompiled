package bk;

import androidx.security.crypto.b;
import com.optimizely.ab.config.Group;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rI.C17853c;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbk/d;", "Lbk/c;", "Lbk/b;", "keyStore", "LrI/c;", "random", "<init>", "(Lbk/b;LrI/c;)V", "", "maxWaitTimeMillis", "LXH/N;", "b", "(I)V", "retries", "backoffDelayInMillis", "Landroidx/security/crypto/b;", "a", "(II)Landroidx/security/crypto/b;", "Lbk/b;", "LrI/c;", "securestorage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements c {

    /* renamed from: a  reason: collision with root package name */
    private final b f90461a;

    /* renamed from: b  reason: collision with root package name */
    private final C17853c f90462b;

    public d(b bVar, C17853c cVar) {
        C17542s.j(bVar, "keyStore");
        C17542s.j(cVar, Group.RANDOM_POLICY);
        this.f90461a = bVar;
        this.f90462b = cVar;
    }

    private final void b(int i10) {
        try {
            Thread.sleep((long) (this.f90462b.c() * ((float) i10)));
        } catch (InterruptedException unused) {
        }
    }

    public b a(int i10, int i11) {
        while (true) {
            try {
                return this.f90461a.a();
            } catch (GeneralSecurityException e10) {
                if (i10 > 0) {
                    b(i11);
                    i10--;
                    i11 *= 2;
                } else {
                    throw e10;
                }
            }
        }
    }
}
