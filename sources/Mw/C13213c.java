package Mw;

import Nn.C10805h;
import android.content.Context;
import com.oppwa.mobile.connect.checkout.uicomponent.UiComponentContainer;
import fI.C17221b;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0002\u000b\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\fJ7\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000fH&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LMw/c;", "", "LXH/N;", "c", "()V", "", "isValid", "d", "(Z)V", "LNn/h$d;", "paymentResultError", "b", "(LNn/h$d;)V", "LMw/c$c;", "result", "", "paymentSolutionId", "LMw/c$b;", "paymentError", "paymentErrorMessage", "a", "(LMw/c$c;Ljava/lang/String;LMw/c$b;Ljava/lang/String;)V", "Landroid/content/Context;", "context", "e", "(Landroid/content/Context;)V", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Mw.c  reason: case insensitive filesystem */
public interface C13213c {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mw.c$a */
    public static final class a {
        public static /* synthetic */ void a(C13213c cVar, C2746c cVar2, String str, b bVar, String str2, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    bVar = null;
                }
                if ((i10 & 8) != 0) {
                    str2 = null;
                }
                cVar.a(cVar2, str, bVar, str2);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackPaymentResult");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"LMw/c$b;", "", "", "reason", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "THREEDS_ERROR", "KLARNA_ERROR", "GOOGLE_PAY_ERROR", "TRANSACTION_ABORTED", "PAYMENT_PROVIDER_CONNECTION_MALFORMED_RESPONSE", "ERROR_CODE_BANCONTACT_LINK", "EXPRESS_ERROR", "OTHER", "UNKNOWN", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mw.c$b */
    public enum b {
        THREEDS_ERROR("3ds error"),
        KLARNA_ERROR("Klarna error"),
        GOOGLE_PAY_ERROR("Google Pay error"),
        TRANSACTION_ABORTED("Transaction aborted"),
        PAYMENT_PROVIDER_CONNECTION_MALFORMED_RESPONSE("Payment provider connection malformed response"),
        ERROR_CODE_BANCONTACT_LINK("ERROR_CODE_BANCONTACT_LINK"),
        EXPRESS_ERROR("EXPRESS_ERROR"),
        OTHER("Other"),
        UNKNOWN("Unknown");
        
        private final String reason;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.reason = str;
        }

        public final String b() {
            return this.reason;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"LMw/c$c;", "", "", "key", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "SUCCESS", "ERROR", "UNKNOWN", "CANCEL", "onlinepayment-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Mw.c$c  reason: collision with other inner class name */
    public enum C2746c {
        SUCCESS("success"),
        ERROR(UiComponentContainer.RESULT_ERROR),
        UNKNOWN("unknown"),
        CANCEL("cancel");
        
        private final String key;

        static {
            C2746c[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private C2746c(String str) {
            this.key = str;
        }

        public final String b() {
            return this.key;
        }
    }

    void a(C2746c cVar, String str, b bVar, String str2);

    void b(C10805h.d dVar);

    void c();

    void d(boolean z10);

    void e(Context context);
}
