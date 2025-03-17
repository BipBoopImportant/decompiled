package AF;

import DF.C12787d;
import QE.c0;
import QE.n0;
import com.squareup.picasso.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LAF/T;", "LAF/b;", "LQE/c0;", "binding", "Lcom/squareup/picasso/t;", "picasso", "", "isDecorateSupported", "<init>", "(LQE/c0;Lcom/squareup/picasso/t;Z)V", "LDF/d;", "galleryModel", "LXH/N;", "c", "(LDF/d;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class T extends C12582b {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public T(c0 c0Var, t tVar, boolean z10) {
        super(c0Var, tVar, z10);
        C17542s.j(c0Var, "binding");
        C17542s.j(tVar, "picasso");
    }

    public void c(C12787d dVar) {
        C17542s.j(dVar, "galleryModel");
        super.c(dVar);
        n0 n0Var = d().f114545i;
        if (n0Var != null) {
            n0Var.getRoot().setVisibility(0);
        }
    }
}
