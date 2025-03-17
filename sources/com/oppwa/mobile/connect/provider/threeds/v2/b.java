package com.oppwa.mobile.connect.provider.threeds.v2;

import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Optional;
import qE.C14943c;
import sE.C15041a;
import sE.C15042b;
import sE.C15043c;
import sE.C15044d;

class b extends a implements C14943c {
    b() {
    }

    /* access modifiers changed from: private */
    public String a(C15042b bVar) {
        return a(bVar.getErrorCode(), bVar.getErrorDescription(), bVar.getErrorDetails());
    }

    public void cancelled() {
        Logger.info("ThreeDS2", "Challenge cancelled.");
        a(PaymentError.getThreeDS2ChallengeCanceledError());
    }

    public void completed(C15041a aVar) {
        Logger.info("ThreeDS2", "Challenge completed.");
        a((PaymentError) null);
    }

    public void protocolError(C15043c cVar) {
        Logger.error("ThreeDS2", "Challenge protocol error.");
        a(PaymentError.getThreeDS2Error((String) Optional.ofNullable(cVar.getErrorMessage()).map(new o(this)).orElse("Protocol error.")));
    }

    public void runtimeError(C15044d dVar) {
        Logger.error("ThreeDS2", "Challenge runtime error.");
        a(PaymentError.getThreeDS2Error((String) Optional.ofNullable(dVar).map(new m(this)).orElse("Runtime error.")));
    }

    public void timedout() {
        Logger.info("ThreeDS2", "Challenge timed out.");
        a(PaymentError.getThreeDS2TimedOutError(a("000", "Transaction closed due to internal timeout expiration", (String) null)));
    }

    /* access modifiers changed from: private */
    public String a(C15044d dVar) {
        return a(dVar.getErrorCode(), dVar.getErrorMessage(), (String) null);
    }

    private String a(String str, String str2, String str3) {
        return str + ": " + str2 + ((String) Optional.ofNullable(str3).map(new n(this)).orElse(""));
    }

    /* access modifiers changed from: private */
    public String a(String str) {
        return " (" + str + ")";
    }
}
