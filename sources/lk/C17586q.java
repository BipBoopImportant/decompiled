package lK;

import com.optimizely.ab.config.FeatureVariable;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000fR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0013"}, d2 = {"LlK/q;", "LlK/n;", "LlK/v;", "writer", "LkK/c;", "json", "<init>", "(LlK/v;LkK/c;)V", "LXH/N;", "b", "()V", "q", "c", "d", "p", "LkK/c;", "", "I", "level", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: lK.q  reason: case insensitive filesystem */
public final class C17586q extends C17583n {

    /* renamed from: c  reason: collision with root package name */
    private final C17514c f144538c;

    /* renamed from: d  reason: collision with root package name */
    private int f144539d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17586q(C17590v vVar, C17514c cVar) {
        super(vVar);
        C17542s.j(vVar, "writer");
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f144538c = cVar;
    }

    public void b() {
        o(true);
        this.f144539d++;
    }

    public void c() {
        o(false);
        k("\n");
        int i10 = this.f144539d;
        for (int i11 = 0; i11 < i10; i11++) {
            k(this.f144538c.g().n());
        }
    }

    public void d() {
        if (a()) {
            o(false);
        } else {
            c();
        }
    }

    public void p() {
        f(' ');
    }

    public void q() {
        this.f144539d--;
    }
}
