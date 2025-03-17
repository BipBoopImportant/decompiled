package Nf;

import androidx.fragment.app.FragmentManager;
import com.ingka.ikea.app.inappfeedback.FeedbackBottomSheet;
import com.ingka.ikea.app.inappfeedback.e;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"LNf/c;", "LNf/b;", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "parentFragmentManager", "", "requestKey", "Lcom/ingka/ikea/app/inappfeedback/e;", "feedbackArguments", "LXH/N;", "a", "(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Lcom/ingka/ikea/app/inappfeedback/e;)V", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements b {
    public void a(FragmentManager fragmentManager, String str, e eVar) {
        C17542s.j(fragmentManager, "parentFragmentManager");
        C17542s.j(str, "requestKey");
        C17542s.j(eVar, "feedbackArguments");
        FeedbackBottomSheet.f71908y0.a(str, eVar).show(fragmentManager, "feedback_bottom_sheet_tag");
    }
}
