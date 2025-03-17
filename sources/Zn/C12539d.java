package zn;

import Cn.x;
import XH.C16807N;
import XH.C16814e;
import android.webkit.WebView;
import h9.C7941b;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import nI.p;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001BC\u0012&\u0010\b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\b\u001a\u00020\u00072\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0017¢\u0006\u0004\b\b\u0010\u000fR7\u0010\b\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lzn/d;", "Lh9/b;", "Lkotlin/Function2;", "", "Lkotlin/Function1;", "LCn/x;", "LXH/N;", "", "shouldOverrideUrlLoading", "action", "<init>", "(LnI/p;LnI/l;)V", "Landroid/webkit/WebView;", "view", "url", "(Landroid/webkit/WebView;Ljava/lang/String;)Z", "d", "LnI/p;", "getShouldOverrideUrlLoading", "()LnI/p;", "e", "LnI/l;", "getAction", "()LnI/l;", "plp-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zn.d  reason: case insensitive filesystem */
final class C12539d extends C7941b {

    /* renamed from: d  reason: collision with root package name */
    private final p<String, C17642l<? super x, C16807N>, Boolean> f107522d;

    /* renamed from: e  reason: collision with root package name */
    private final C17642l<x, C16807N> f107523e;

    public C12539d(p<? super String, ? super C17642l<? super x, C16807N>, Boolean> pVar, C17642l<? super x, C16807N> lVar) {
        C17542s.j(pVar, "shouldOverrideUrlLoading");
        C17542s.j(lVar, "action");
        this.f107522d = pVar;
        this.f107523e = lVar;
    }

    @C16814e
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return this.f107522d.invoke(str, this.f107523e).booleanValue();
    }
}
