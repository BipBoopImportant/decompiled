package com.ingka.ikea.app.productinformationpage.v2.ui;

import Ae.e;
import Ae.j;
import Eo.a;
import HJ.C15854t;
import Oo.b;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebViewClient;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import bl.f;
import com.google.android.material.button.MaterialButton;
import com.ingka.ikea.analytics.Interaction$Component;
import com.optimizely.ab.config.FeatureVariable;
import com.sugarcube.core.logger.DslKt;
import fK.C17261n;
import fK.p;
import iK.C17395d;
import ii.F0;
import ii.G0;
import ii.H0;
import ii.I0;
import ii.J0;
import jK.C17487x0;
import jK.E0;
import jK.J;
import jK.T0;
import jK.X;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import lg.C10025b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import u2.C6012a;
import uI.C18055d;
import uK.C18146a;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0001?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00132\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0019\u0010\u0003R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u001b\u0010;\u001a\u0002068BX\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010>\u001a\u0002028BX\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "<init>", "()V", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;", "action", "Lcom/ingka/ikea/analytics/Interaction$Component;", "clickAnalytics", "LXH/N;", "E0", "(Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "LAe/e;", "P", "LAe/e;", "z0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "LEo/a;", "Q", "LEo/a;", "B0", "()LEo/a;", "setChromeTabApi", "(LEo/a;)V", "chromeTabApi", "LkK/c;", "R", "LkK/c;", "D0", "()LkK/c;", "setJson", "(LkK/c;)V", "json", "Lbl/f;", "S", "Lbl/f;", "_binding", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content;", "T", "LXH/o;", "C0", "()Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content;", "content", "A0", "()Lbl/f;", "binding", "Content", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebViewDialogFragment extends Hilt_WebViewDialogFragment {

    /* renamed from: P  reason: collision with root package name */
    public e f72272P;

    /* renamed from: Q  reason: collision with root package name */
    public a f72273Q;

    /* renamed from: R  reason: collision with root package name */
    public C17514c f72274R;

    /* renamed from: S  reason: collision with root package name */
    private f f72275S;

    /* renamed from: T  reason: collision with root package name */
    private final C16824o f72276T = C16825p.b(new H0(this));

    @p
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 $2\u00020\u0001:\u0004%&'\u001eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001e\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b!\u0010#¨\u0006("}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content;", "", "", "url", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;", "actionButton", "secondaryButton", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;", "()Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;", "Companion", "Button", "Action", "$serializer", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Content {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f72280a;

        /* renamed from: b  reason: collision with root package name */
        private final Button f72281b;

        /* renamed from: c  reason: collision with root package name */
        private final Button f72282c;

        @p
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u0001\u0002\u0015\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;", "", "<init>", "()V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Companion", "Url", "b", "a", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action$b;", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action$Url;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static abstract class Action {
            public static final a Companion = new a((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */

            /* renamed from: a  reason: collision with root package name */
            public static final C16824o<KSerializer<Object>> f72283a = C16825p.a(s.PUBLICATION, new I0());

            @p
            @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014¨\u0006\""}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action$Url;", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;", "", "urlToOpen", "<init>", "(Ljava/lang/String;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action$Url;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ljava/lang/String;", "e", "Companion", "$serializer", "a", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Url extends Action {
                public static final a Companion = new a((DefaultConstructorMarker) null);

                /* renamed from: b  reason: collision with root package name */
                private final String f72284b;

                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action$Url$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action$Url;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
                public static final class a {
                    private a() {
                    }

                    public final KSerializer<Url> serializer() {
                        return WebViewDialogFragment$Content$Action$Url$$serializer.INSTANCE;
                    }

                    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public /* synthetic */ Url(int i10, String str, T0 t02) {
                    super(i10, t02);
                    if (1 != (i10 & 1)) {
                        E0.b(i10, 1, WebViewDialogFragment$Content$Action$Url$$serializer.INSTANCE.getDescriptor());
                    }
                    this.f72284b = str;
                }

                public static final /* synthetic */ void f(Url url, C17395d dVar, SerialDescriptor serialDescriptor) {
                    Action.d(url, dVar, serialDescriptor);
                    dVar.y(serialDescriptor, 0, url.f72284b);
                }

                public final String e() {
                    return this.f72284b;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof Url) && C17542s.e(this.f72284b, ((Url) obj).f72284b);
                }

                public int hashCode() {
                    return this.f72284b.hashCode();
                }

                public String toString() {
                    String str = this.f72284b;
                    return "Url(urlToOpen=" + str + ")";
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public Url(String str) {
                    super((DefaultConstructorMarker) null);
                    C17542s.j(str, "urlToOpen");
                    this.f72284b = str;
                }
            }

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                private final /* synthetic */ KSerializer a() {
                    return (KSerializer) Action.f72283a.getValue();
                }

                public final KSerializer<Action> serializer() {
                    return a();
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            @p
            @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action$b;", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class b extends Action {
                public static final b INSTANCE = new b();

                /* renamed from: b  reason: collision with root package name */
                private static final /* synthetic */ C16824o<KSerializer<Object>> f72285b = C16825p.a(s.PUBLICATION, new J0());

                /* renamed from: c  reason: collision with root package name */
                public static final int f72286c = 8;

                private b() {
                    super((DefaultConstructorMarker) null);
                }

                /* access modifiers changed from: private */
                public static final /* synthetic */ KSerializer b() {
                    return new C17487x0("com.ingka.ikea.app.productinformationpage.v2.ui.WebViewDialogFragment.Content.Action.Dismiss", INSTANCE, new Annotation[0]);
                }

                private final /* synthetic */ KSerializer f() {
                    return f72285b.getValue();
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof b);
                }

                public int hashCode() {
                    return 807341556;
                }

                public final KSerializer<b> serializer() {
                    return f();
                }

                public String toString() {
                    return "Dismiss";
                }
            }

            public /* synthetic */ Action(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* access modifiers changed from: private */
            public static final /* synthetic */ KSerializer b() {
                C18055d b10 = P.b(Action.class);
                C18055d[] dVarArr = {P.b(b.class), P.b(Url.class)};
                return new C17261n("com.ingka.ikea.app.productinformationpage.v2.ui.WebViewDialogFragment.Content.Action", b10, dVarArr, new KSerializer[]{new C17487x0("com.ingka.ikea.app.productinformationpage.v2.ui.WebViewDialogFragment.Content.Action.Dismiss", b.INSTANCE, new Annotation[0]), WebViewDialogFragment$Content$Action$Url$$serializer.INSTANCE}, new Annotation[0]);
            }

            public static final /* synthetic */ void d(Action action, C17395d dVar, SerialDescriptor serialDescriptor) {
            }

            private Action() {
            }

            public /* synthetic */ Action(int i10, T0 t02) {
            }
        }

        @p
        @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 ,2\u00020\u0001:\u0002- B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\n\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b&\u0010+¨\u0006."}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;", "", "", "text", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;", "action", "", "icon", "Lcom/ingka/ikea/analytics/Interaction$Component;", "clickAnalytics", "<init>", "(Ljava/lang/String;Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;Ljava/lang/Integer;Lcom/ingka/ikea/analytics/Interaction$Component;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;Ljava/lang/Integer;Lcom/ingka/ikea/analytics/Interaction$Component;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;", "()Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Action;", "c", "Ljava/lang/Integer;", "d", "()Ljava/lang/Integer;", "Lcom/ingka/ikea/analytics/Interaction$Component;", "()Lcom/ingka/ikea/analytics/Interaction$Component;", "Companion", "$serializer", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Button {
            public static final a Companion = new a((DefaultConstructorMarker) null);
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public static final KSerializer<Object>[] f72287e = {0, Action.Companion.serializer(), 0, J.b("com.ingka.ikea.analytics.Interaction.Component", Interaction$Component.values())};

            /* renamed from: a  reason: collision with root package name */
            private final String f72288a;

            /* renamed from: b  reason: collision with root package name */
            private final Action f72289b;

            /* renamed from: c  reason: collision with root package name */
            private final Integer f72290c;

            /* renamed from: d  reason: collision with root package name */
            private final Interaction$Component f72291d;

            @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class a {
                private a() {
                }

                public final KSerializer<Button> serializer() {
                    return WebViewDialogFragment$Content$Button$$serializer.INSTANCE;
                }

                public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            public /* synthetic */ Button(int i10, String str, Action action, Integer num, Interaction$Component interaction$Component, T0 t02) {
                if (3 != (i10 & 3)) {
                    E0.b(i10, 3, WebViewDialogFragment$Content$Button$$serializer.INSTANCE.getDescriptor());
                }
                this.f72288a = str;
                this.f72289b = action;
                if ((i10 & 4) == 0) {
                    this.f72290c = null;
                } else {
                    this.f72290c = num;
                }
                if ((i10 & 8) == 0) {
                    this.f72291d = null;
                } else {
                    this.f72291d = interaction$Component;
                }
            }

            public static final /* synthetic */ void f(Button button, C17395d dVar, SerialDescriptor serialDescriptor) {
                KSerializer<Object>[] kSerializerArr = f72287e;
                dVar.y(serialDescriptor, 0, button.f72288a);
                dVar.i(serialDescriptor, 1, kSerializerArr[1], button.f72289b);
                if (dVar.z(serialDescriptor, 2) || button.f72290c != null) {
                    dVar.B(serialDescriptor, 2, X.f144073a, button.f72290c);
                }
                if (dVar.z(serialDescriptor, 3) || button.f72291d != null) {
                    dVar.B(serialDescriptor, 3, kSerializerArr[3], button.f72291d);
                }
            }

            public final Action b() {
                return this.f72289b;
            }

            public final Interaction$Component c() {
                return this.f72291d;
            }

            public final Integer d() {
                return this.f72290c;
            }

            public final String e() {
                return this.f72288a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Button)) {
                    return false;
                }
                Button button = (Button) obj;
                return C17542s.e(this.f72288a, button.f72288a) && C17542s.e(this.f72289b, button.f72289b) && C17542s.e(this.f72290c, button.f72290c) && this.f72291d == button.f72291d;
            }

            public int hashCode() {
                int hashCode = ((this.f72288a.hashCode() * 31) + this.f72289b.hashCode()) * 31;
                Integer num = this.f72290c;
                int i10 = 0;
                int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
                Interaction$Component interaction$Component = this.f72291d;
                if (interaction$Component != null) {
                    i10 = interaction$Component.hashCode();
                }
                return hashCode2 + i10;
            }

            public String toString() {
                String str = this.f72288a;
                Action action = this.f72289b;
                Integer num = this.f72290c;
                Interaction$Component interaction$Component = this.f72291d;
                return "Button(text=" + str + ", action=" + action + ", icon=" + num + ", clickAnalytics=" + interaction$Component + ")";
            }

            public Button(String str, Action action, Integer num, Interaction$Component interaction$Component) {
                C17542s.j(str, "text");
                C17542s.j(action, "action");
                this.f72288a = str;
                this.f72289b = action;
                this.f72290c = num;
                this.f72291d = interaction$Component;
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Button(String str, Action action, Integer num, Interaction$Component interaction$Component, int i10, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, action, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : interaction$Component);
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content;", "serializer", "()Lkotlinx/serialization/KSerializer;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<Content> serializer() {
                return WebViewDialogFragment$Content$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ Content(int i10, String str, Button button, Button button2, T0 t02) {
            if (1 != (i10 & 1)) {
                E0.b(i10, 1, WebViewDialogFragment$Content$$serializer.INSTANCE.getDescriptor());
            }
            this.f72280a = str;
            if ((i10 & 2) == 0) {
                this.f72281b = null;
            } else {
                this.f72281b = button;
            }
            if ((i10 & 4) == 0) {
                this.f72282c = null;
            } else {
                this.f72282c = button2;
            }
        }

        public static final /* synthetic */ void d(Content content, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, content.f72280a);
            if (dVar.z(serialDescriptor, 1) || content.f72281b != null) {
                dVar.B(serialDescriptor, 1, WebViewDialogFragment$Content$Button$$serializer.INSTANCE, content.f72281b);
            }
            if (dVar.z(serialDescriptor, 2) || content.f72282c != null) {
                dVar.B(serialDescriptor, 2, WebViewDialogFragment$Content$Button$$serializer.INSTANCE, content.f72282c);
            }
        }

        public final Button a() {
            return this.f72281b;
        }

        public final Button b() {
            return this.f72282c;
        }

        public final String c() {
            return this.f72280a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return C17542s.e(this.f72280a, content.f72280a) && C17542s.e(this.f72281b, content.f72281b) && C17542s.e(this.f72282c, content.f72282c);
        }

        public int hashCode() {
            int hashCode = this.f72280a.hashCode() * 31;
            Button button = this.f72281b;
            int i10 = 0;
            int hashCode2 = (hashCode + (button == null ? 0 : button.hashCode())) * 31;
            Button button2 = this.f72282c;
            if (button2 != null) {
                i10 = button2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            String str = this.f72280a;
            Button button = this.f72281b;
            Button button2 = this.f72282c;
            return "Content(url=" + str + ", actionButton=" + button + ", secondaryButton=" + button2 + ")";
        }

        public Content(String str, Button button, Button button2) {
            C17542s.j(str, "url");
            this.f72280a = str;
            this.f72281b = button;
            this.f72282c = button2;
        }
    }

    private final f A0() {
        f fVar = this.f72275S;
        C17542s.g(fVar);
        return fVar;
    }

    private final Content C0() {
        return (Content) this.f72276T.getValue();
    }

    private final void E0(Content.Action action, Interaction$Component interaction$Component) {
        String str;
        Class<WebViewDialogFragment> cls;
        int i10;
        Content.Action action2 = action;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            cls = WebViewDialogFragment.class;
            i10 = 2;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("Handle action: " + action2, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str3 = str5;
            str2 = str4;
        }
        if (action2 instanceof Content.Action.Url) {
            B0().a(requireContext(), ((Content.Action.Url) action2).e());
            dismiss();
        } else if (C17542s.e(action2, Content.Action.b.INSTANCE)) {
            dismiss();
        } else if (action2 == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No action");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a((String) null, illegalArgumentException);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str7, false, illegalArgumentException, str6);
                i10 = 2;
            }
        } else {
            throw new t();
        }
        if (interaction$Component != null) {
            e.c.c(z0(), j.ACTION_TAP.b(), (Map) null, interaction$Component, (e.b) null, 8, (Object) null);
        }
    }

    /* access modifiers changed from: private */
    public static final void F0(WebViewDialogFragment webViewDialogFragment, View view) {
        webViewDialogFragment.dismiss();
    }

    /* access modifiers changed from: private */
    public static final void G0(WebViewDialogFragment webViewDialogFragment, View view) {
        Content.Button a10 = webViewDialogFragment.C0().a();
        Interaction$Component interaction$Component = null;
        Content.Action b10 = a10 != null ? a10.b() : null;
        Content.Button a11 = webViewDialogFragment.C0().a();
        if (a11 != null) {
            interaction$Component = a11.c();
        }
        webViewDialogFragment.E0(b10, interaction$Component);
    }

    /* access modifiers changed from: private */
    public static final void H0(WebViewDialogFragment webViewDialogFragment, View view) {
        Content.Button b10 = webViewDialogFragment.C0().b();
        Interaction$Component interaction$Component = null;
        Content.Action b11 = b10 != null ? b10.b() : null;
        Content.Button b12 = webViewDialogFragment.C0().b();
        if (b12 != null) {
            interaction$Component = b12.c();
        }
        webViewDialogFragment.E0(b11, interaction$Component);
    }

    /* access modifiers changed from: private */
    public static final Content y0(WebViewDialogFragment webViewDialogFragment) {
        String string = webViewDialogFragment.requireArguments().getString("content");
        if (string != null) {
            return (Content) webViewDialogFragment.D0().c(Content.Companion.serializer(), string);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final a B0() {
        a aVar = this.f72273Q;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabApi");
        return null;
    }

    public final C17514c D0() {
        C17514c cVar = this.f72274R;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z(FeatureVariable.JSON_TYPE);
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        f c10 = f.c(layoutInflater, viewGroup, false);
        c10.f90482e.setWebViewClient(new WebViewClient());
        this.f72275S = c10;
        ConstraintLayout b10 = A0().getRoot();
        C17542s.i(b10, "getRoot(...)");
        return b10;
    }

    public void onDestroyView() {
        this.f72275S = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        Integer d10;
        Integer d11;
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(Uo.a.f88327h);
        toolbar.setNavigationOnClickListener(new ii.E0(this));
        toolbar.setNavigationIcon(C6012a.e(view.getContext(), C18146a.f148142M2));
        toolbar.setNavigationContentDescription((CharSequence) getString(b.f84665i));
        MaterialButton materialButton = A0().f90479b;
        Content.Button a10 = C0().a();
        String str = null;
        materialButton.setText(a10 != null ? a10.e() : null);
        C17542s.g(materialButton);
        boolean z10 = true;
        int i10 = 0;
        materialButton.setVisibility(C0().a() != null ? 0 : 8);
        Content.Button a11 = C0().a();
        if (!(a11 == null || (d11 = a11.d()) == null)) {
            int intValue = d11.intValue();
            materialButton.setIconTintResource(C10025b.f75260b);
            materialButton.setIconResource(intValue);
        }
        materialButton.setOnClickListener(new F0(this));
        MaterialButton materialButton2 = A0().f90480c;
        Content.Button b10 = C0().b();
        if (b10 != null) {
            str = b10.e();
        }
        materialButton2.setText(str);
        C17542s.g(materialButton2);
        if (C0().b() == null) {
            z10 = false;
        }
        if (!z10) {
            i10 = 8;
        }
        materialButton2.setVisibility(i10);
        Content.Button b11 = C0().b();
        if (!(b11 == null || (d10 = b11.d()) == null)) {
            int intValue2 = d10.intValue();
            materialButton2.setIconTintResource(C10025b.f75260b);
            materialButton2.setIconResource(intValue2);
        }
        materialButton2.setOnClickListener(new G0(this));
        A0().f90482e.loadUrl(C0().c());
    }

    public final e z0() {
        e eVar = this.f72272P;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }
}
