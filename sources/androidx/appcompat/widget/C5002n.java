package androidx.appcompat.widget;

import H2.i;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* renamed from: androidx.appcompat.widget.n  reason: case insensitive filesystem */
final class C5002n {

    /* renamed from: a  reason: collision with root package name */
    private TextView f16538a;

    /* renamed from: b  reason: collision with root package name */
    private TextClassifier f16539b;

    /* renamed from: androidx.appcompat.widget.n$a */
    private static final class a {
        static TextClassifier a(TextView textView) {
            TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
            return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
        }
    }

    C5002n(TextView textView) {
        this.f16538a = (TextView) i.g(textView);
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f16539b;
        return textClassifier == null ? a.a(this.f16538a) : textClassifier;
    }

    public void b(TextClassifier textClassifier) {
        this.f16539b = textClassifier;
    }
}
