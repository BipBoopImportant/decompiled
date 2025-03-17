package com.ingka.ikea.browseandsearch.plp.impl.composables.webview;

import android.content.Context;
import android.webkit.WebView;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/impl/composables/webview/ScrollableWebView;", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "a", "()I", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class ScrollableWebView extends WebView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableWebView(Context context) {
        super(context);
        C17542s.j(context, "context");
    }

    public final int a() {
        return computeHorizontalScrollRange();
    }
}
