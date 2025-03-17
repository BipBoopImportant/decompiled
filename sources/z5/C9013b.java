package z5;

import Q4.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import y5.C8979b;
import y5.C8980c;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ/\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019¨\u0006\u001a"}, d2 = {"Lz5/b;", "Lz5/e;", "LQ4/k;", "statement", "<init>", "(LQ4/k;)V", "", "index", "", "string", "LXH/N;", "H", "(ILjava/lang/String;)V", "R", "Lkotlin/Function1;", "Ly5/c;", "Ly5/b;", "mapper", "a", "(LnI/l;)Ljava/lang/Object;", "", "execute", "()J", "close", "()V", "LQ4/k;", "sqldelight-android-driver_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: z5.b  reason: case insensitive filesystem */
final class C9013b implements C9016e {

    /* renamed from: a  reason: collision with root package name */
    private final k f58392a;

    public C9013b(k kVar) {
        C17542s.j(kVar, "statement");
        this.f58392a = kVar;
    }

    public void H(int i10, String str) {
        if (str == null) {
            this.f58392a.I2(i10 + 1);
        } else {
            this.f58392a.H(i10 + 1, str);
        }
    }

    public <R> R a(C17642l<? super C8980c, ? extends C8979b<R>> lVar) {
        C17542s.j(lVar, "mapper");
        throw new UnsupportedOperationException();
    }

    public void close() {
        this.f58392a.close();
    }

    public long execute() {
        return (long) this.f58392a.b0();
    }
}
