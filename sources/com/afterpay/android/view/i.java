package com.afterpay.android.view;

import XH.C16807N;
import XH.x;
import XH.y;
import android.app.Activity;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.afterpay.android.Afterpay;
import com.afterpay.android.internal.AfterpayCheckoutCompletion;
import com.afterpay.android.internal.AfterpayCheckoutMessage;
import fK.z;
import kK.C17514c;
import kK.C17516e;
import kK.v;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.C17546w;
import kotlin.jvm.internal.P;
import mK.C17611d;
import nI.C17642l;
import t6.C8834c;
import uI.C18068q;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/afterpay/android/view/i;", "", "Landroid/app/Activity;", "activity", "Landroid/webkit/WebView;", "webView", "Lkotlin/Function1;", "Lcom/afterpay/android/internal/AfterpayCheckoutCompletion;", "LXH/N;", "complete", "Lt6/c;", "cancel", "<init>", "(Landroid/app/Activity;Landroid/webkit/WebView;LnI/l;LnI/l;)V", "", "messageJson", "postMessage", "(Ljava/lang/String;)V", "a", "Landroid/app/Activity;", "b", "Landroid/webkit/WebView;", "c", "LnI/l;", "d", "LkK/c;", "e", "LkK/c;", "json", "afterpay_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class i {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f46062a;

    /* renamed from: b  reason: collision with root package name */
    private final WebView f46063b;

    /* renamed from: c  reason: collision with root package name */
    private final C17642l<AfterpayCheckoutCompletion, C16807N> f46064c;

    /* renamed from: d  reason: collision with root package name */
    private final C17642l<C8834c, C16807N> f46065d;

    /* renamed from: e  reason: collision with root package name */
    private final C17514c f46066e = v.b((C17514c) null, a.f46067c, 1, (Object) null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LkK/e;", "LXH/N;", "invoke", "(LkK/e;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    static final class a extends C17544u implements C17642l<C17516e, C16807N> {

        /* renamed from: c  reason: collision with root package name */
        public static final a f46067c = new a();

        a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((C17516e) obj);
            return C16807N.f139792a;
        }

        public final void invoke(C17516e eVar) {
            C17542s.j(eVar, "$this$Json");
            eVar.g(true);
        }
    }

    public i(Activity activity, WebView webView, C17642l<? super AfterpayCheckoutCompletion, C16807N> lVar, C17642l<? super C8834c, C16807N> lVar2) {
        C17542s.j(activity, "activity");
        C17542s.j(webView, "webView");
        C17542s.j(lVar, "complete");
        C17542s.j(lVar2, "cancel");
        this.f46062a = activity;
        this.f46063b = webView;
        this.f46064c = lVar;
        this.f46065d = lVar2;
    }

    @JavascriptInterface
    public final void postMessage(String str) {
        Object obj;
        Object obj2;
        C17542s.j(str, "messageJson");
        try {
            x.a aVar = x.f139812b;
            C17514c cVar = this.f46066e;
            C17611d a10 = cVar.a();
            C18068q l10 = P.l(AfterpayCheckoutMessage.class);
            C17546w.a("kotlinx.serialization.serializer.withModule");
            obj = x.b((AfterpayCheckoutMessage) cVar.c(z.d(a10, l10), str));
        } catch (Throwable th2) {
            x.a aVar2 = x.f139812b;
            obj = x.b(y.a(th2));
        }
        Throwable e10 = x.e(obj);
        Class<i> cls = i.class;
        if (e10 != null) {
            Log.d(cls.getSimpleName(), e10.toString());
        }
        AfterpayCheckoutCompletion afterpayCheckoutCompletion = null;
        if (x.g(obj)) {
            obj = null;
        }
        if (((AfterpayCheckoutMessage) obj) != null) {
            Afterpay.f45951a.c();
            this.f46065d.invoke(C8834c.NO_CHECKOUT_HANDLER);
            return;
        }
        try {
            C17514c cVar2 = this.f46066e;
            C17611d a11 = cVar2.a();
            C18068q l11 = P.l(AfterpayCheckoutCompletion.class);
            C17546w.a("kotlinx.serialization.serializer.withModule");
            obj2 = x.b((AfterpayCheckoutCompletion) cVar2.c(z.d(a11, l11), str));
        } catch (Throwable th3) {
            x.a aVar3 = x.f139812b;
            obj2 = x.b(y.a(th3));
        }
        Throwable e11 = x.e(obj2);
        if (e11 != null) {
            Log.d(cls.getSimpleName(), e11.toString());
        }
        if (!x.g(obj2)) {
            afterpayCheckoutCompletion = obj2;
        }
        AfterpayCheckoutCompletion afterpayCheckoutCompletion2 = afterpayCheckoutCompletion;
        if (afterpayCheckoutCompletion2 != null) {
            this.f46064c.invoke(afterpayCheckoutCompletion2);
        }
    }
}
