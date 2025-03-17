package Wj;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ya.b;
import za.a;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001b¨\u0006\u001d"}, d2 = {"LWj/c;", "Lya/b$b;", "Lza/a;", "processor", "<init>", "(Lya/b$b;)V", "LWj/b;", "filter", "LXH/N;", "b", "(LWj/b;)V", "", "pause", "c", "(Z)V", "Lya/b$a;", "detections", "a", "(Lya/b$a;)V", "release", "()V", "Lya/b$b;", "getProcessor", "()Lya/b$b;", "", "Ljava/util/List;", "filters", "Z", "pauseFiltering", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b.C0937b<a> {

    /* renamed from: a  reason: collision with root package name */
    private final b.C0937b<a> f88865a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b> f88866b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private boolean f88867c;

    public c(b.C0937b<a> bVar) {
        C17542s.j(bVar, "processor");
        this.f88865a = bVar;
    }

    public void a(b.a<a> aVar) {
        C17542s.j(aVar, "detections");
        if (!this.f88867c) {
            for (b a10 : this.f88866b) {
                aVar = a10.a(aVar);
            }
            this.f88865a.a(aVar);
        }
    }

    public final void b(b bVar) {
        C17542s.j(bVar, "filter");
        if (bVar instanceof g) {
            ((g) bVar).b(this.f88865a);
        }
        this.f88866b.add(bVar);
    }

    public final void c(boolean z10) {
        this.f88867c = z10;
    }

    public void release() {
        for (b release : this.f88866b) {
            release.release();
        }
    }
}
