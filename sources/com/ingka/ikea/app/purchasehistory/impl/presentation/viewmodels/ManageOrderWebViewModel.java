package com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels;

import Ei.C10679N;
import HJ.C15854t;
import MD.C13204a;
import PD.C13338c;
import QJ.F0;
import QJ.N;
import QJ.Q;
import QJ.T;
import TJ.C16505B;
import TJ.C16519P;
import TJ.C16521S;
import TJ.C16532g;
import TJ.C16533h;
import TJ.C16534i;
import XH.C16807N;
import XH.t;
import XH.y;
import YC.C13857b;
import YC.C13860e;
import YH.C16877v;
import android.content.UriMatcher;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.lifecycle.U;
import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.a;
import com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.d;
import com.sugarcube.core.logger.DslKt;
import dI.C17160a;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fK.p;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import nI.C17642l;
import nI.q;
import nI.r;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b!\u0018\u0000 W2\u00020\u00012\u00020\u0002:\u0001XB/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u00020\u00112\u001c\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00192\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H&¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0011H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0001¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00102R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\u001c048\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016048\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u001c\u0010<\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010:048\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u00106R\u001c\u0010>\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c048\u0002X\u0004¢\u0006\u0006\n\u0004\b=\u00106R\u001c\u0010@\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0016048\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u00106R\"\u0010D\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u00198\u0002X\u0004¢\u0006\f\n\u0004\bA\u0010B\u0012\u0004\bC\u0010%R\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020E0\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\bF\u0010BR\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020I0H8\u0002X\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010P\u001a\b\u0012\u0004\u0012\u00020I0H8\u0016X\u0004¢\u0006\f\n\u0004\bM\u0010K\u001a\u0004\bN\u0010OR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020I0H8\u0006¢\u0006\f\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010OR\u0014\u0010V\u001a\u00020\u001c8BX\u0004¢\u0006\u0006\u001a\u0004\bT\u0010U¨\u0006Y"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel;", "Landroidx/lifecycle/f0;", "LEi/N;", "Landroidx/lifecycle/U;", "savedStateHandle", "LPD/e;", "setWebViewCookieUseCase", "LPD/d;", "getWebViewUrlUseCase", "LPD/c;", "getWebViewCookieUseCase", "LYC/b;", "uiMode", "<init>", "(Landroidx/lifecycle/U;LPD/e;LPD/d;LPD/c;LYC/b;)V", "Lkotlin/Function1;", "LdI/e;", "LXH/N;", "", "function", "L", "(LnI/l;)V", "", "orderId", "liteId", "LTJ/g;", "M", "(Ljava/lang/String;Ljava/lang/String;)LTJ/g;", "", "setAccesstoken", "I", "(ZLjava/lang/String;)Ljava/lang/String;", "Landroid/webkit/WebResourceRequest;", "request", "a", "(Landroid/webkit/WebResourceRequest;)Z", "N", "()V", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp;", "J", "()Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp;", "m", "LPD/e;", "n", "LPD/d;", "o", "LPD/c;", "p", "LYC/b;", "q", "Ljava/lang/String;", "r", "LTJ/B;", "s", "LTJ/B;", "goBackToPurchaseFlow", "t", "redirectToBrowserUrlFlow", "", "u", "errorMessageFlow", "v", "cookieHasBeenSet", "w", "cookieData", "x", "LTJ/g;", "getContentUri$annotations", "contentUri", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/a;", "y", "contentUriWithParams", "LTJ/P;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;", "z", "LTJ/P;", "_uiState", "A", "getState", "()LTJ/P;", "state", "B", "getUiState", "uiState", "K", "()Z", "setAccessToken", "C", "Companion", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ManageOrderWebViewModel extends f0 implements C10679N {

    /* renamed from: C  reason: collision with root package name */
    public static final Companion f90974C = new Companion((DefaultConstructorMarker) null);

    /* renamed from: D  reason: collision with root package name */
    public static final int f90975D = 8;

    /* renamed from: E  reason: collision with root package name */
    private static final Companion.CookieDataToApp f90976E = new Companion.CookieDataToApp(C16877v.e("https://www.ikea.com"));

    /* renamed from: A  reason: collision with root package name */
    private final C16519P<d> f90977A;

    /* renamed from: B  reason: collision with root package name */
    private final C16519P<d> f90978B;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public final PD.e f90979m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public final PD.d f90980n;

    /* renamed from: o  reason: collision with root package name */
    private final C13338c f90981o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public final C13857b f90982p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public final String f90983q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final String f90984r;

    /* renamed from: s  reason: collision with root package name */
    private final C16505B<Boolean> f90985s;

    /* renamed from: t  reason: collision with root package name */
    private final C16505B<String> f90986t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C16505B<Integer> f90987u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public final C16505B<Boolean> f90988v;
    /* access modifiers changed from: private */

    /* renamed from: w  reason: collision with root package name */
    public final C16505B<String> f90989w;

    /* renamed from: x  reason: collision with root package name */
    private final C16532g<String> f90990x;

    /* renamed from: y  reason: collision with root package name */
    private final C16532g<a> f90991y;

    /* renamed from: z  reason: collision with root package name */
    private final C16519P<d> f90992z;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00058\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion;", "", "<init>", "()V", "Landroid/net/Uri;", "", "callback", "content", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp;", "allowedRedirectCookie", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/b;", "a", "(Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp;)Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/b;", "REDIRECT_URL", "Ljava/lang/String;", "CookieDataToApp", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\nB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp;", "", "", "", "allowedRedirects", "<init>", "(Ljava/util/List;)V", "Landroid/net/Uri;", "uri", "", "a", "(Landroid/net/Uri;)Z", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getAllowedRedirects", "()Ljava/util/List;", "b", "Remote", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CookieDataToApp {

            /* renamed from: b  reason: collision with root package name */
            public static final a f90994b = new a((DefaultConstructorMarker) null);

            /* renamed from: c  reason: collision with root package name */
            public static final int f90995c = 8;

            /* renamed from: a  reason: collision with root package name */
            private final List<String> f90996a;

            @p
            @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&\u001fB+\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006'"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp$Remote;", "LMD/a;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp;", "", "seen0", "", "", "allowedRedirects", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp$Remote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAllowedRedirects", "()Ljava/util/List;", "getAllowedRedirects$annotations", "()V", "Companion", "$serializer", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Remote implements C13204a<CookieDataToApp> {
                public static final a Companion = new a((DefaultConstructorMarker) null);

                /* renamed from: b  reason: collision with root package name */
                public static final int f90997b = 8;
                /* access modifiers changed from: private */

                /* renamed from: c  reason: collision with root package name */
                public static final KSerializer<Object>[] f90998c = {new C17451f(Y0.f144077a)};

                /* renamed from: a  reason: collision with root package name */
                private final List<String> f90999a;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp$Remote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp$Remote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    private a() {
                    }

                    public final KSerializer<Remote> serializer() {
                        return ManageOrderWebViewModel$Companion$CookieDataToApp$Remote$$serializer.INSTANCE;
                    }

                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                public /* synthetic */ Remote(int i10, List list, T0 t02) {
                    if (1 != (i10 & 1)) {
                        E0.b(i10, 1, ManageOrderWebViewModel$Companion$CookieDataToApp$Remote$$serializer.INSTANCE.getDescriptor());
                    }
                    this.f90999a = list;
                }

                /* renamed from: c */
                public CookieDataToApp a() {
                    return new CookieDataToApp(this.f90999a);
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Remote) && C17542s.e(this.f90999a, ((Remote) obj).f90999a);
                }

                public int hashCode() {
                    return this.f90999a.hashCode();
                }

                public String toString() {
                    List<String> list = this.f90999a;
                    return "Remote(allowedRedirects=" + list + ")";
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$Companion$CookieDataToApp$a;", "", "<init>", "()V", "", "defaultAllowedRedirect", "Ljava/lang/String;", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private a() {
                }
            }

            public CookieDataToApp(List<String> list) {
                C17542s.j(list, "allowedRedirects");
                this.f90996a = list;
            }

            public final boolean a(Uri uri) {
                C17542s.j(uri, "uri");
                Iterable<String> iterable = this.f90996a;
                if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
                    return false;
                }
                for (String d02 : iterable) {
                    String uri2 = uri.toString();
                    C17542s.i(uri2, "toString(...)");
                    if (C15854t.d0(uri2, d02, false, 2, (Object) null)) {
                        return true;
                    }
                }
                return false;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CookieDataToApp) && C17542s.e(this.f90996a, ((CookieDataToApp) obj).f90996a);
            }

            public int hashCode() {
                return this.f90996a.hashCode();
            }

            public String toString() {
                List<String> list = this.f90996a;
                return "CookieDataToApp(allowedRedirects=" + list + ")";
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f91000a;

            /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
            static {
                /*
                    com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b[] r0 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b r1 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b r1 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.CONTENT_URI     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b r1 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.REDIRECT_TO_BROWSER     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b r1 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.WEB_VIEW_COMPLETED     // Catch:{ NoSuchFieldError -> 0x002b }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                    r2 = 4
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
                L_0x002b:
                    f91000a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ManageOrderWebViewModel.Companion.a.<clinit>():void");
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Uri uri, String str, String str2, CookieDataToApp cookieDataToApp) {
            Uri parse;
            C17542s.j(uri, "<this>");
            C17542s.j(str, "callback");
            C17542s.j(cookieDataToApp, "allowedRedirectCookie");
            UriMatcher uriMatcher = new UriMatcher(-1);
            Uri parse2 = Uri.parse(str);
            if (parse2 != null) {
                uriMatcher.addURI(parse2.getAuthority(), parse2.getPath(), b.WEB_VIEW_COMPLETED.j());
            }
            if (!(str2 == null || (parse = Uri.parse(str2)) == null)) {
                uriMatcher.addURI(parse.getAuthority(), parse.getPath(), b.CONTENT_URI.j());
            }
            b a10 = b.Companion.a(uriMatcher.match(uri));
            int i10 = a.f91000a[a10.ordinal()];
            if (i10 == 1) {
                return cookieDataToApp.a(uri) ? b.REDIRECT_TO_BROWSER : b.UNKNOWN;
            }
            if (i10 == 2 || i10 == 3 || i10 == 4) {
                return a10;
            }
            throw new t();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f91001a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b[] r0 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b r1 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.CONTENT_URI     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b r1 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.WEB_VIEW_COMPLETED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b r1 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.REDIRECT_TO_BROWSER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b r1 = com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.b.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f91001a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ManageOrderWebViewModel.a.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/a;", "contentUrlWithParams", "", "goBackToPurchase", "", "redirectToBrowserUrl", "", "error", "cookieHasSet", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;", "<anonymous>", "(Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/a;ZLjava/lang/String;IZ)Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/d;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ManageOrderWebViewModel$_uiState$1", f = "ManageOrderWebViewModel.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements nI.t<a, Boolean, String, Integer, Boolean, C17164e<? super d>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91002c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91003d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ boolean f91004e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f91005f;

        /* renamed from: g  reason: collision with root package name */
        /* synthetic */ Object f91006g;

        b(C17164e<? super b> eVar) {
            super(6, eVar);
        }

        public final Object i(a aVar, boolean z10, String str, Integer num, Boolean bool, C17164e<? super d> eVar) {
            b bVar = new b(eVar);
            bVar.f91003d = aVar;
            bVar.f91004e = z10;
            bVar.f91005f = str;
            bVar.f91006g = num;
            return bVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91002c == 0) {
                y.b(obj);
                a aVar = (a) this.f91003d;
                boolean z10 = this.f91004e;
                String str = (String) this.f91005f;
                Integer num = (Integer) this.f91006g;
                if (num != null) {
                    return new d.b(num.intValue());
                }
                if (aVar instanceof a.b) {
                    return d.c.f91039a;
                }
                if (aVar instanceof a.c) {
                    return d.C1991d.f91040a;
                }
                if (aVar instanceof a.C1990a) {
                    return new d.a(((a.C1990a) aVar).a(), z10, str);
                }
                throw new t();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public /* bridge */ /* synthetic */ Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
            return i((a) obj, ((Boolean) obj2).booleanValue(), (String) obj3, (Integer) obj4, (Boolean) obj5, (C17164e) obj6);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "contentUrl", "cookie", "", "cookieSet", "Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/a;", "<anonymous>", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/a;"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ManageOrderWebViewModel$contentUriWithParams$1", f = "ManageOrderWebViewModel.kt", l = {}, m = "invokeSuspend")
    static final class c extends l implements r<String, String, Boolean, C17164e<? super a>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91007c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91008d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f91009e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f91010f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ManageOrderWebViewModel f91011g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
        @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ManageOrderWebViewModel$contentUriWithParams$1$2", f = "ManageOrderWebViewModel.kt", l = {}, m = "invokeSuspend")
        static final class a extends l implements C17642l<C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f91012c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ ManageOrderWebViewModel f91013d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ String f91014e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ String f91015f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(ManageOrderWebViewModel manageOrderWebViewModel, String str, String str2, C17164e<? super a> eVar) {
                super(1, eVar);
                this.f91013d = manageOrderWebViewModel;
                this.f91014e = str;
                this.f91015f = str2;
            }

            /* access modifiers changed from: private */
            public static final C16807N k(ManageOrderWebViewModel manageOrderWebViewModel, boolean z10) {
                manageOrderWebViewModel.f90988v.setValue(Boolean.valueOf(z10));
                return C16807N.f139792a;
            }

            public final C17164e<C16807N> create(C17164e<?> eVar) {
                return new a(this.f91013d, this.f91014e, this.f91015f, eVar);
            }

            public final Object invokeSuspend(Object obj) {
                C17187b.f();
                if (this.f91012c == 0) {
                    y.b(obj);
                    this.f91013d.f90979m.a(this.f91014e, this.f91015f, new c(this.f91013d));
                    return C16807N.f139792a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            /* renamed from: j */
            public final Object invoke(C17164e<? super C16807N> eVar) {
                return ((a) create(eVar)).invokeSuspend(C16807N.f139792a);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(ManageOrderWebViewModel manageOrderWebViewModel, C17164e<? super c> eVar) {
            super(4, eVar);
            this.f91011g = manageOrderWebViewModel;
        }

        /* renamed from: i */
        public final Object l(String str, String str2, Boolean bool, C17164e<? super a> eVar) {
            c cVar = new c(this.f91011g, eVar);
            cVar.f91008d = str;
            cVar.f91009e = str2;
            cVar.f91010f = bool;
            return cVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91007c == 0) {
                y.b(obj);
                String str = (String) this.f91008d;
                String str2 = (String) this.f91009e;
                Boolean bool = (Boolean) this.f91010f;
                ManageOrderWebViewModel manageOrderWebViewModel = this.f91011g;
                qv.e eVar = qv.e.DEBUG;
                ArrayList<C11819b> arrayList = new ArrayList<>();
                for (Object next : qv.d.f102012a.a()) {
                    if (((C11819b) next).b(eVar, false)) {
                        arrayList.add(next);
                    }
                }
                String str3 = null;
                String str4 = null;
                for (C11819b bVar : arrayList) {
                    if (str3 == null) {
                        String a10 = C11818a.a("setCookieAndLoadContent with url: " + str, (Throwable) null);
                        if (a10 == null) {
                            break;
                        }
                        str3 = C11820c.a(a10);
                    }
                    String str5 = str3;
                    if (str4 == null) {
                        String name = manageOrderWebViewModel.getClass().getName();
                        C17542s.g(name);
                        String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o12.length() != 0) {
                            name = C15854t.P0(o12, "Kt");
                        }
                        str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                    }
                    String str6 = str4;
                    bVar.a(eVar, str6, false, (Throwable) null, str5);
                    str3 = str5;
                    str4 = str6;
                }
                if (str == null) {
                    return a.b.f91032a;
                }
                if (C15854t.v0(str)) {
                    return a.c.f91033a;
                }
                if (str2 == null) {
                    C16505B h10 = this.f91011g.f90989w;
                    ManageOrderWebViewModel manageOrderWebViewModel2 = this.f91011g;
                    h10.setValue(manageOrderWebViewModel2.I(manageOrderWebViewModel2.K(), this.f91011g.f90984r));
                    return a.b.f91032a;
                } else if (bool != null) {
                    return new a.C1990a(this.f91011g.f90980n.a(str, "https://www.ikea.com/ikeaapp/success", C13857b.a.b(this.f91011g.f90982p, (C13860e) null, 1, (Object) null)));
                } else {
                    ManageOrderWebViewModel manageOrderWebViewModel3 = this.f91011g;
                    manageOrderWebViewModel3.L(new a(manageOrderWebViewModel3, str, str2, (C17164e<? super a>) null));
                    return a.b.f91032a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/ManageOrderWebViewModel$d", "LdI/a;", "LQJ/N;", "LdI/i;", "context", "", "exception", "LXH/N;", "handleException", "(LdI/i;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends C17160a implements N {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ManageOrderWebViewModel f91016a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(N.a aVar, ManageOrderWebViewModel manageOrderWebViewModel) {
            super(aVar);
            this.f91016a = manageOrderWebViewModel;
        }

        public void handleException(C17168i iVar, Throwable th2) {
            Object value;
            ManageOrderWebViewModel manageOrderWebViewModel = this.f91016a;
            qv.e eVar = qv.e.WARN;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str = null;
            String str2 = null;
            for (C11819b bVar : arrayList) {
                if (str == null) {
                    String a10 = C11818a.a("WebView experience exception", th2);
                    if (a10 == null) {
                        break;
                    }
                    str = C11820c.a(a10);
                }
                String str3 = str;
                if (str2 == null) {
                    String name = manageOrderWebViewModel.getClass().getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str4 = str2;
                bVar.a(eVar, str4, false, th2, str3);
                str = str3;
                str2 = str4;
            }
            C16505B j10 = this.f91016a.f90987u;
            do {
                value = j10.getValue();
                Integer num = (Integer) value;
            } while (!j10.e(value, Integer.valueOf(Oo.b.f84812v3)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ManageOrderWebViewModel$launchOnViewModelScope$2", f = "ManageOrderWebViewModel.kt", l = {194}, m = "invokeSuspend")
    static final class e extends l implements nI.p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91017c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17642l<C17164e<? super C16807N>, Object> f91018d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar, C17164e<? super e> eVar) {
            super(2, eVar);
            this.f91018d = lVar;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new e(this.f91018d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((e) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91017c;
            if (i10 == 0) {
                y.b(obj);
                C17642l<C17164e<? super C16807N>, Object> lVar = this.f91018d;
                this.f91017c = 1;
                if (lVar.invoke(this) == f10) {
                    return f10;
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "LTJ/h;", "it", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.viewmodels.ManageOrderWebViewModel$special$$inlined$flatMapLatest$1", f = "ManageOrderWebViewModel.kt", l = {189}, m = "invokeSuspend")
    public static final class f extends l implements q<C16533h<? super String>, String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91019c;

        /* renamed from: d  reason: collision with root package name */
        private /* synthetic */ Object f91020d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f91021e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ManageOrderWebViewModel f91022f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17164e eVar, ManageOrderWebViewModel manageOrderWebViewModel) {
            super(3, eVar);
            this.f91022f = manageOrderWebViewModel;
        }

        /* renamed from: i */
        public final Object invoke(C16533h<? super String> hVar, String str, C17164e<? super C16807N> eVar) {
            f fVar = new f(eVar, this.f91022f);
            fVar.f91020d = hVar;
            fVar.f91021e = str;
            return fVar.invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            Object f10 = C17187b.f();
            int i10 = this.f91019c;
            if (i10 == 0) {
                y.b(obj);
                C16533h hVar = (C16533h) this.f91020d;
                String str = (String) this.f91021e;
                ManageOrderWebViewModel manageOrderWebViewModel = this.f91022f;
                String D10 = manageOrderWebViewModel.f90983q;
                if (D10 != null) {
                    C16532g<String> M10 = manageOrderWebViewModel.M(D10, this.f91022f.f90984r);
                    this.f91019c = 1;
                    if (C16534i.x(hVar, M10, this) == f10) {
                        return f10;
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else if (i10 == 1) {
                y.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C16807N.f139792a;
        }
    }

    public ManageOrderWebViewModel(U u10, PD.e eVar, PD.d dVar, C13338c cVar, C13857b bVar) {
        C17542s.j(u10, "savedStateHandle");
        C17542s.j(eVar, "setWebViewCookieUseCase");
        C17542s.j(dVar, "getWebViewUrlUseCase");
        C17542s.j(cVar, "getWebViewCookieUseCase");
        C17542s.j(bVar, "uiMode");
        this.f90979m = eVar;
        this.f90980n = dVar;
        this.f90981o = cVar;
        this.f90982p = bVar;
        this.f90983q = (String) u10.f("orderId");
        this.f90984r = (String) u10.f("liteId");
        C16505B<Boolean> a10 = C16521S.a(Boolean.FALSE);
        this.f90985s = a10;
        C16505B<String> a11 = C16521S.a(null);
        this.f90986t = a11;
        C16505B<Integer> a12 = C16521S.a(null);
        this.f90987u = a12;
        C16505B<Boolean> a13 = C16521S.a(null);
        this.f90988v = a13;
        C16505B<String> a14 = C16521S.a(null);
        this.f90989w = a14;
        C16532g<String> g02 = C16534i.g0(C16521S.a(null), new f((C17164e) null, this));
        this.f90990x = g02;
        C16532g<a> m10 = C16534i.m(g02, a14, a13, new c(this, (C17164e<? super c>) null));
        this.f90991y = m10;
        C16519P<d> c02 = C16534i.c0(C16534i.k(m10, a10, a11, a12, a13, new b((C17164e<? super b>) null)), g0.a(this), ip.f.a(), d.c.f91039a);
        this.f90992z = c02;
        this.f90977A = c02;
        this.f90978B = c02;
    }

    /* access modifiers changed from: private */
    public final boolean K() {
        String str = this.f90984r;
        return str == null || C15854t.v0(str);
    }

    /* access modifiers changed from: private */
    public final void L(C17642l<? super C17164e<? super C16807N>, ? extends Object> lVar) {
        F0 unused = C16314k.d(g0.a(this), new d(N.f137593c0, this), (T) null, new e(lVar, (C17164e<? super e>) null), 2, (Object) null);
    }

    public abstract String I(boolean z10, String str);

    public final Companion.CookieDataToApp J() {
        d value = this.f90978B.getValue();
        Companion.CookieDataToApp cookieDataToApp = value instanceof d.a ? (Companion.CookieDataToApp) this.f90981o.a(((d.a) value).a(), Companion.CookieDataToApp.Remote.class) : null;
        return cookieDataToApp == null ? f90976E : cookieDataToApp;
    }

    public abstract C16532g<String> M(String str, String str2);

    public void N() {
        String value;
        d value2 = this.f90978B.getValue();
        if (value2 instanceof d.a) {
            C16505B<String> b10 = this.f90986t;
            do {
                value = b10.getValue();
                String str = value;
            } while (!b10.e(value, null));
        } else if (!(value2 instanceof d.b) && !C17542s.e(value2, d.c.f91039a) && !C17542s.e(value2, d.C1991d.f91040a)) {
            throw new t();
        }
    }

    public boolean a(WebResourceRequest webResourceRequest) {
        char c10;
        char c11;
        Boolean value;
        String value2;
        Uri url;
        Uri url2;
        Iterator it;
        String str;
        d value3 = this.f90978B.getValue();
        d.a aVar = value3 instanceof d.a ? (d.a) value3 : null;
        int i10 = 2;
        if (aVar != null) {
            Companion.CookieDataToApp J10 = J();
            qv.e eVar = qv.e.DEBUG;
            ArrayList arrayList = new ArrayList();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, true)) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            String str2 = null;
            String str3 = null;
            while (it2.hasNext()) {
                C11819b bVar = (C11819b) it2.next();
                if (str2 == null) {
                    String a10 = C11818a.a("allowedRedirectCookieData: " + J10, (Throwable) null);
                    if (a10 == null) {
                        break;
                    }
                    str2 = C11820c.a(a10);
                }
                if (str3 == null) {
                    String name = getClass().getName();
                    C17542s.g(name);
                    it = it2;
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                } else {
                    it = it2;
                    str = str3;
                }
                bVar.a(eVar, str, true, (Throwable) null, str2);
                str3 = str;
                eVar = eVar;
                it2 = it;
            }
            b a11 = (webResourceRequest == null || (url2 = webResourceRequest.getUrl()) == null) ? null : f90974C.a(url2, "https://www.ikea.com/ikeaapp/success", aVar.a(), J10);
            qv.e eVar2 = qv.e.DEBUG;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str5 == null) {
                    String a12 = C11818a.a("web view intercepting action: " + a11, (Throwable) null);
                    if (a12 == null) {
                        break;
                    }
                    str5 = C11820c.a(a12);
                }
                if (str4 == null) {
                    String name2 = getClass().getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str4 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str4, false, (Throwable) null, str5);
            }
            int i11 = a11 == null ? -1 : a.f91001a[a11.ordinal()];
            if (i11 == -1 || i11 == 1) {
                return false;
            }
            if (i11 == 2) {
                C16505B<Boolean> b10 = this.f90985s;
                do {
                    value = b10.getValue();
                    value.booleanValue();
                } while (!b10.e(value, Boolean.TRUE));
            } else if (i11 == 3) {
                C16505B<String> b11 = this.f90986t;
                do {
                    value2 = b11.getValue();
                    String str6 = value2;
                    url = webResourceRequest.getUrl();
                } while (!b11.e(value2, url != null ? url.toString() : null));
            } else if (i11 != 4) {
                throw new t();
            }
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("interceptUrlLoading for invalid state called");
            qv.e eVar3 = qv.e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str7 = null;
            String str8 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str8 == null) {
                    String a13 = C11818a.a((String) null, illegalStateException);
                    if (a13 == null) {
                        break;
                    }
                    str8 = C11820c.a(a13);
                }
                String str9 = str8;
                if (str7 == null) {
                    String name3 = getClass().getName();
                    C17542s.g(name3);
                    c11 = '$';
                    c10 = '.';
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name3;
                } else {
                    c11 = '$';
                    c10 = '.';
                }
                char c12 = c11;
                char c13 = c10;
                bVar3.a(eVar3, str7, false, illegalStateException, str9);
                str8 = str9;
                i10 = 2;
            }
        }
        return true;
    }

    public C16519P<d> getState() {
        return this.f90977A;
    }
}
