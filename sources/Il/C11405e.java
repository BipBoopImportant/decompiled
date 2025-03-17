package il;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.recyclerview.widget.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lil/e;", "Landroidx/recyclerview/widget/p;", "Landroid/content/Context;", "context", "", "target", "offset", "<init>", "(Landroid/content/Context;II)V", "B", "()I", "Landroid/util/DisplayMetrics;", "displayMetrics", "", "v", "(Landroid/util/DisplayMetrics;)F", "Landroid/view/View;", "view", "snapPreference", "u", "(Landroid/view/View;I)I", "q", "I", "uicomponents_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: il.e  reason: case insensitive filesystem */
public final class C11405e extends p {

    /* renamed from: q  reason: collision with root package name */
    private final int f98366q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11405e(Context context, int i10, int i11) {
        super(context);
        C17542s.j(context, "context");
        this.f98366q = i11;
        p(i10);
    }

    /* access modifiers changed from: protected */
    public int B() {
        return -1;
    }

    public int u(View view, int i10) {
        return super.u(view, i10) + this.f98366q;
    }

    /* access modifiers changed from: protected */
    public float v(DisplayMetrics displayMetrics) {
        C17542s.j(displayMetrics, "displayMetrics");
        return super.v(displayMetrics) * 2.5f;
    }
}
