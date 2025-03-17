package AF;

import DF.C12787d;
import DF.C12789f;
import JF.Z;
import OE.C13320l;
import OE.n;
import QE.c0;
import QE.l0;
import android.content.Context;
import android.widget.ImageView;
import com.squareup.picasso.t;
import com.sugarcube.common.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0016\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0017"}, d2 = {"LAF/L;", "LAF/b;", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "", "isDecorateSupported", "<init>", "(LQE/c0;Lcom/squareup/picasso/t;Z)V", "LXH/N;", "g", "()V", "i", "h", "LDF/d;", "galleryModel", "c", "(LDF/d;)V", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/content/Context;", "context", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.L  reason: case insensitive filesystem */
public final class C12578L extends C12582b {

    /* renamed from: i  reason: collision with root package name */
    private final Context f107674i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12578L(c0 c0Var, t tVar, boolean z10) {
        super(c0Var, tVar, z10);
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
        this.f107674i = c0Var.getRoot().getContext();
    }

    private final void g() {
        l0 l0Var = d().f114541e;
        l0Var.f114645g.clearAnimation();
        l0Var.f114645g.setImageResource(R.drawable.sc_ic_gallery_progress_empty);
        l0Var.f114646h.setTextAppearance(R.style.TextAppearance_Sugarcube_CardView_Body);
    }

    private final void h() {
        l0 l0Var = d().f114541e;
        l0Var.f114645g.clearAnimation();
        l0Var.f114645g.setImageResource(R.drawable.sc_ic_checkmark_gallery);
        l0Var.f114640b.setImageResource(R.drawable.sc_ic_progress_gallery);
        ImageView imageView = l0Var.f114640b;
        C17542s.i(imageView, "sceneProcessingAnalyzingIcon");
        Z.i(imageView);
        l0Var.f114646h.setText(this.f107674i.getString(n.f113202F4));
    }

    private final void i() {
        l0 l0Var = d().f114541e;
        l0Var.f114645g.setImageResource(R.drawable.sc_ic_progress_gallery);
        ImageView imageView = l0Var.f114645g;
        C17542s.i(imageView, "sceneProcessingUploadingIcon");
        Z.i(imageView);
    }

    public void c(C12787d dVar) {
        C17542s.j(dVar, "galleryModel");
        super.c(dVar);
        if (dVar instanceof C12789f) {
            C12789f fVar = (C12789f) dVar;
            if (fVar.l().isNew()) {
                g();
            } else if (fVar.l().isUploading()) {
                i();
            } else {
                h();
            }
            l0 l0Var = d().f114541e;
            l0Var.getRoot().setVisibility(0);
            int remainingProcessingTime = fVar.l().getRemainingProcessingTime();
            l0Var.f114643e.setText(this.f107674i.getResources().getQuantityString(C13320l.f113164d, remainingProcessingTime, new Object[]{Integer.valueOf(remainingProcessingTime)}));
        }
    }
}
