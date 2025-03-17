package com.afterpay.android.view;

import XH.C16807N;
import android.net.Uri;
import android.webkit.WebChromeClient;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17642l;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u000f\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/afterpay/android/view/g;", "Landroid/webkit/WebChromeClient;", "Lkotlin/Function1;", "Landroid/net/Uri;", "LXH/N;", "openExternalLink", "<init>", "(LnI/l;)V", "Landroid/webkit/WebView;", "view", "", "isDialog", "isUserGesture", "Landroid/os/Message;", "resultMsg", "onCreateWindow", "(Landroid/webkit/WebView;ZZLandroid/os/Message;)Z", "a", "LnI/l;", "Companion", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class g extends WebChromeClient {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17642l<Uri, C16807N> f46058a;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/afterpay/android/view/g$a;", "", "<init>", "()V", "", "URL_KEY", "Ljava/lang/String;", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public g(C17642l<? super Uri, C16807N> lVar) {
        C17542s.j(lVar, "openExternalLink");
        this.f46058a = lVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r1.getHandler();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onCreateWindow(android.webkit.WebView r1, boolean r2, boolean r3, android.os.Message r4) {
        /*
            r0 = this;
            r2 = 0
            if (r1 == 0) goto L_0x000e
            android.os.Handler r3 = r1.getHandler()
            if (r3 == 0) goto L_0x000e
            android.os.Message r3 = r3.obtainMessage()
            goto L_0x000f
        L_0x000e:
            r3 = r2
        L_0x000f:
            if (r1 == 0) goto L_0x0014
            r1.requestFocusNodeHref(r3)
        L_0x0014:
            if (r3 == 0) goto L_0x0022
            android.os.Bundle r1 = r3.getData()
            if (r1 == 0) goto L_0x0022
            java.lang.String r2 = "url"
            java.lang.String r2 = r1.getString(r2)
        L_0x0022:
            if (r2 == 0) goto L_0x0032
            nI.l<android.net.Uri, XH.N> r1 = r0.f46058a
            android.net.Uri r2 = android.net.Uri.parse(r2)
            java.lang.String r3 = "parse(it)"
            kotlin.jvm.internal.C17542s.i(r2, r3)
            r1.invoke(r2)
        L_0x0032:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.afterpay.android.view.g.onCreateWindow(android.webkit.WebView, boolean, boolean, android.os.Message):boolean");
    }
}
