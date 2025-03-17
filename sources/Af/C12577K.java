package AF;

import DF.C12787d;
import OE.n;
import OE.q;
import QE.c0;
import QE.k0;
import VE.C13760b;
import android.content.Context;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.squareup.picasso.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"LAF/K;", "LAF/b;", "LOE/q;", "sugarcube", "Landroid/content/Context;", "context", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "", "isDecorateSupported", "<init>", "(LOE/q;Landroid/content/Context;LQE/c0;Lcom/squareup/picasso/t;Z)V", "LDF/d;", "galleryModel", "LXH/N;", "c", "(LDF/d;)V", "i", "LOE/q;", "getSugarcube", "()LOE/q;", "j", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: AF.K  reason: case insensitive filesystem */
public final class C12577K extends C12582b {

    /* renamed from: i  reason: collision with root package name */
    private final q f107672i;

    /* renamed from: j  reason: collision with root package name */
    private final Context f107673j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12577K(q qVar, Context context, c0 c0Var, t tVar, boolean z10) {
        super(c0Var, tVar, z10);
        C17542s.j(qVar, "sugarcube");
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
        this.f107672i = qVar;
        this.f107673j = context;
    }

    public void c(C12787d dVar) {
        Spanned spanned;
        C17542s.j(dVar, "galleryModel");
        super.c(dVar);
        k0 k0Var = d().f114540d;
        k0Var.getRoot().setVisibility(0);
        TextView textView = k0Var.f114626b;
        Context context = this.f107673j;
        if (context != null) {
            String string = context.getString(n.f113357e5, new Object[]{C13760b.f117438d.h(this.f107672i.getCountry(), this.f107672i.getLanguage()), this.f107673j.getString(n.f113461t4)});
            C17542s.i(string, "getString(...)");
            spanned = Html.fromHtml(context.getString(n.f113316Y4, new Object[]{string}), 0);
        } else {
            spanned = null;
        }
        textView.setText(spanned);
        k0Var.f114626b.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
