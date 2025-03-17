package Iz;

import Cz.b;
import Ez.f;
import YH.C16877v;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C5221y;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.inappfeedback.FeedbackBottomSheet;
import com.ingka.ikea.app.inappfeedback.e;
import com.ingka.ikea.app.inappfeedback.i;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import zz.C15390a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \f2\u00020\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"LIz/l;", "LIz/j;", "LCz/b;", "shouldUserGiveFeedbackRepository", "Lzz/a;", "postPurchaseFeedbackAnalytics", "<init>", "(LCz/b;Lzz/a;)V", "Landroid/content/Context;", "context", "", "Lcom/ingka/ikea/app/inappfeedback/e$b;", "c", "(Landroid/content/Context;)Ljava/util/List;", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "Landroidx/lifecycle/y;", "lifecycleOwner", "", "storeId", "LXH/N;", "a", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Landroidx/lifecycle/y;Ljava/lang/String;)V", "LCz/b;", "b", "Lzz/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: Iz.l  reason: case insensitive filesystem */
public final class C13046l implements C13044j {

    /* renamed from: c  reason: collision with root package name */
    public static final a f111055c = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f111056d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final b f111057a;

    /* renamed from: b  reason: collision with root package name */
    private final C15390a f111058b;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0014\u0010\u0010\u001a\u00020\n8\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"LIz/l$a;", "", "<init>", "()V", "", "RATING_LOW_MIN_RATING", "I", "RATING_LOW_MAX_RATING", "RATING_HIGH_MIN_RATING", "RATING_HIGH_MAX_RATING", "", "REQUEST_KEY_FEEDBACK_SCAN_AND_GO", "Ljava/lang/String;", "SURVEY_ID_ONLINE", "SURVEY_QUESTION_POSITIVE_ID", "SURVEY_QUESTION_NEGATIVE_ID", "PAYMENT_SUCCESS_DIALOG", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Iz.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public C13046l(b bVar, C15390a aVar) {
        C17542s.j(bVar, "shouldUserGiveFeedbackRepository");
        C17542s.j(aVar, "postPurchaseFeedbackAnalytics");
        this.f111057a = bVar;
        this.f111058b = aVar;
    }

    private final List<e.b> c(Context context) {
        String string = context.getString(f.f109698f0);
        C17542s.i(string, "getString(...)");
        e.b bVar = new e.b("feedback-negative", string, 1, 3);
        String string2 = context.getString(f.f109700g0);
        C17542s.i(string2, "getString(...)");
        return C16877v.q(bVar, new e.b("feedback-positive", string2, 4, 5));
    }

    /* access modifiers changed from: private */
    public static final void d(C13046l lVar, String str, String str2, Bundle bundle) {
        Cg.a a10;
        C17542s.j(str2, "requestKey");
        C17542s.j(bundle, "bundle");
        if (str2.hashCode() == -677811160 && str2.equals("request_key_feedback_scan_and_go")) {
            i iVar = (i) bundle.getParcelable("FeedbackBottomSheetBundleKey");
            i.b bVar = iVar instanceof i.b ? (i.b) iVar : null;
            if (!(bVar == null || (a10 = bVar.a()) == null)) {
                lVar.f111058b.a(a10.d(), str);
            }
            lVar.f111057a.b();
        }
    }

    public void a(Context context, FragmentManager fragmentManager, C5221y yVar, String str) {
        C17542s.j(context, "context");
        C17542s.j(fragmentManager, "fragmentManager");
        C17542s.j(yVar, "lifecycleOwner");
        C17542s.j(str, "storeId");
        FeedbackBottomSheet.b bVar = FeedbackBottomSheet.f71908y0;
        String string = context.getString(f.f109704i0);
        C17542s.i(string, "getString(...)");
        String string2 = context.getString(f.f109702h0);
        C17542s.i(string2, "getString(...)");
        bVar.a("request_key_feedback_scan_and_go", new e(string, string2, "scanshop-order-confirmation-online", str, c(context), Interaction$Component.SHOP_AND_GO_PURCHASE)).show(fragmentManager, "ScanAndGoPaymentSuccessDialog");
        fragmentManager.R1("request_key_feedback_scan_and_go", yVar, new C13045k(this, str));
    }
}
