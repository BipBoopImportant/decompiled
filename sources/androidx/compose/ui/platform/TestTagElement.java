package androidx.compose.ui.platform;

import G1.V;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/TestTagElement;", "LG1/V;", "Landroidx/compose/ui/platform/l1;", "", "tag", "<init>", "(Ljava/lang/String;)V", "c", "()Landroidx/compose/ui/platform/l1;", "node", "LXH/N;", "f", "(Landroidx/compose/ui/platform/l1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "d", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TestTagElement extends V<l1> {

    /* renamed from: d  reason: collision with root package name */
    private final String f19334d;

    public TestTagElement(String str) {
        this.f19334d = str;
    }

    /* renamed from: c */
    public l1 a() {
        return new l1(this.f19334d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestTagElement)) {
            return false;
        }
        return C17542s.e(this.f19334d, ((TestTagElement) obj).f19334d);
    }

    /* renamed from: f */
    public void b(l1 l1Var) {
        l1Var.C2(this.f19334d);
    }

    public int hashCode() {
        return this.f19334d.hashCode();
    }
}
