package AF;

import DF.C12787d;
import QE.c0;
import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.t;
import com.sugarcube.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0017\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0011\u0010\u001aR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LAF/b;", "Landroidx/recyclerview/widget/RecyclerView$G;", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "", "isDecorateSupported", "<init>", "(LQE/c0;Lcom/squareup/picasso/t;Z)V", "LXH/N;", "f", "()V", "LDF/d;", "galleryModel", "c", "(LDF/d;)V", "e", "LQE/c0;", "d", "()LQE/c0;", "Lcom/squareup/picasso/t;", "getPicasso", "()Lcom/squareup/picasso/t;", "g", "Z", "()Z", "h", "LDF/d;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.b  reason: case insensitive filesystem */
public class C12582b extends RecyclerView.G {

    /* renamed from: e  reason: collision with root package name */
    private final c0 f107693e;

    /* renamed from: f  reason: collision with root package name */
    private final t f107694f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f107695g;

    /* renamed from: h  reason: collision with root package name */
    private C12787d f107696h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12582b(c0 c0Var, t tVar, boolean z10) {
        super(c0Var.getRoot());
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
        this.f107693e = c0Var;
        this.f107694f = tVar;
        this.f107695g = z10;
    }

    private final void f() {
        this.f107693e.f114539c.getRoot().setVisibility(8);
        this.f107693e.f114538b.getRoot().setVisibility(8);
        this.f107693e.f114540d.getRoot().setVisibility(8);
        this.f107693e.f114541e.getRoot().setVisibility(8);
    }

    public void c(C12787d dVar) {
        C12787d dVar2;
        C17542s.j(dVar, "galleryModel");
        this.f107696h = dVar;
        View view = this.itemView;
        if (dVar == null) {
            C17542s.z("galleryModel");
            dVar2 = null;
        } else {
            dVar2 = dVar;
        }
        view.setActivated(dVar2.g());
        f();
        Uri c10 = dVar.c();
        System.out.println("Capture.Upload image " + c10);
        this.f107694f.l(dVar.c()).i(R.drawable.sc_ic_placeholder).d(this.f107693e.f114546j);
    }

    public final c0 d() {
        return this.f107693e;
    }

    public final boolean e() {
        return this.f107695g;
    }
}
