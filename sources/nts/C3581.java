package nts;

import qE.C14943c;
import sE.C15041a;
import sE.C15043c;
import sE.C15044d;

/* renamed from: nts.ϴ  reason: contains not printable characters */
public class C3581 implements C14943c {

    /* renamed from: ഇ  reason: contains not printable characters */
    public C14943c f313;

    public C3581(C14943c cVar) {
        this.f313 = cVar;
    }

    public void cancelled() {
        try {
            C14943c cVar = this.f313;
            if (cVar != null) {
                cVar.cancelled();
            }
        } catch (NullPointerException e10) {
            C3734.f1057.m1123(e10.getMessage());
        }
    }

    public void completed(C15041a aVar) {
        C3952.m2192(1);
        try {
            C14943c cVar = this.f313;
            if (cVar != null) {
                cVar.completed(aVar);
            }
        } catch (NullPointerException e10) {
            C3734.f1057.m1123(e10.getMessage());
        }
    }

    public void protocolError(C15043c cVar) {
        C3734 r02 = C3734.f1057;
        r02.m1123(C3727.m1052("\u0001=:3>%'|jiwmq|sqWab~d-4uskpjodE}|b~+", 8, 15, 29) + cVar.getErrorMessage());
        try {
            C14943c cVar2 = this.f313;
            if (cVar2 != null) {
                cVar2.protocolError(cVar);
            }
        } catch (NullPointerException e10) {
            C3734.f1057.m1123(e10.getMessage());
        }
    }

    public void runtimeError(C15044d dVar) {
        C3734 r02 = C3734.f1057;
        r02.m1123(C3727.m1052("\u0001=:3>%'|jiwmq|sqWab~d-4uskpjodE}|b~+", 23, 13, 29) + dVar.getErrorCode() + ": " + dVar.getErrorMessage());
        try {
            C14943c cVar = this.f313;
            if (cVar != null) {
                cVar.runtimeError(dVar);
            }
        } catch (NullPointerException e10) {
            C3734.f1057.m1123(e10.getMessage());
        }
    }

    public void timedout() {
        C3734.f1057.m1123(C3727.m1052("\u0001=:3>%'|jiwmq|sqWab~d-4uskpjodE}|b~+", 0, 8, 93));
        try {
            C14943c cVar = this.f313;
            if (cVar != null) {
                cVar.timedout();
            }
        } catch (NullPointerException e10) {
            C3734.f1057.m1123(e10.getMessage());
        }
    }
}
