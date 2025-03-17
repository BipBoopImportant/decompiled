package com.sugarcube.app.base.ui.feedback;

import OE.n;
import QE.C13445w;
import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.sugarcube.app.base.ui.dialog.a;
import com.sugarcube.app.base.ui.feedback.FeedbackSmileRatingBar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import wF.g;
import wF.h;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001'B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\"\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0018\u0010&\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog;", "Lcom/sugarcube/app/base/ui/dialog/a;", "Landroid/app/Activity;", "activity", "Ljava/util/Locale;", "locale", "", "gravity", "Lcom/sugarcube/app/base/ui/dialog/a$b;", "offset", "Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog$OnFeedbackEnteredListener;", "listener", "<init>", "(Landroid/app/Activity;Ljava/util/Locale;ILcom/sugarcube/app/base/ui/dialog/a$b;Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog$OnFeedbackEnteredListener;)V", "LXH/N;", "j", "()V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "dismiss", "g", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "h", "Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog$OnFeedbackEnteredListener;", "LQE/w;", "i", "LQE/w;", "binding", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar;", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar;", "smileComponent", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "k", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "currentSmileRating", "OnFeedbackEnteredListener", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FeedbackDialog extends a {

    /* renamed from: g  reason: collision with root package name */
    private final Activity f124160g;

    /* renamed from: h  reason: collision with root package name */
    private final OnFeedbackEnteredListener f124161h;

    /* renamed from: i  reason: collision with root package name */
    private C13445w f124162i;

    /* renamed from: j  reason: collision with root package name */
    private FeedbackSmileRatingBar f124163j;

    /* renamed from: k  reason: collision with root package name */
    private FeedbackSmileRatingBar.a f124164k;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/sugarcube/app/base/ui/feedback/FeedbackDialog$OnFeedbackEnteredListener;", "", "Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;", "rating", "LXH/N;", "onFeedbackEntered", "(Lcom/sugarcube/app/base/ui/feedback/FeedbackSmileRatingBar$a;)V", "onFeedbackDismissed", "()V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnFeedbackEnteredListener {
        void onFeedbackDismissed();

        void onFeedbackEntered(FeedbackSmileRatingBar.a aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedbackDialog(Activity activity, Locale locale, int i10, a.b bVar, OnFeedbackEnteredListener onFeedbackEnteredListener) {
        super(activity, locale, i10, bVar);
        C17542s.j(activity, "activity");
        C17542s.j(locale, "locale");
        C17542s.j(onFeedbackEnteredListener, "listener");
        this.f124160g = activity;
        this.f124161h = onFeedbackEnteredListener;
    }

    /* access modifiers changed from: private */
    public static final void h(FeedbackDialog feedbackDialog, View view) {
        feedbackDialog.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void i(FeedbackDialog feedbackDialog, FeedbackSmileRatingBar.a aVar) {
        C17542s.j(aVar, "it");
        feedbackDialog.f124164k = aVar;
        feedbackDialog.j();
    }

    private final void j() {
        TextView textView;
        C13445w wVar = this.f124162i;
        if (!(wVar == null || (textView = wVar.f114742d) == null)) {
            textView.setText(n.f113315Y3);
        }
        a.d(this, 0, 1, (Object) null);
    }

    public void dismiss() {
        FeedbackSmileRatingBar.a aVar = this.f124164k;
        if (aVar != null) {
            this.f124161h.onFeedbackEntered(aVar);
            this.f124164k = null;
        }
        this.f124161h.onFeedbackDismissed();
        super.dismiss();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        C13445w c10 = C13445w.c(LayoutInflater.from(this.f124160g));
        setContentView(c10.getRoot());
        c10.f114740b.setOnClickListener(new g(this));
        FeedbackSmileRatingBar feedbackSmileRatingBar = c10.f114741c;
        feedbackSmileRatingBar.setListener(new h(this));
        this.f124163j = feedbackSmileRatingBar;
        this.f124162i = c10;
    }
}
