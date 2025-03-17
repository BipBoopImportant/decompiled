package com.ingka.ikea.app.productinformationpage.v2.ui;

import XH.C16814e;
import com.ingka.ikea.analytics.Interaction$Component;
import com.ingka.ikea.app.productinformationpage.v2.ui.WebViewDialogFragment;
import fK.C17247E;
import gK.C17294a;
import iK.C17394c;
import iK.C17395d;
import jK.J0;
import jK.N;
import jK.T0;
import jK.X;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"com/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment.Content.Button.$serializer", "LjK/N;", "Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "LXH/N;", "c", "(Lkotlinx/serialization/encoding/Encoder;Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "b", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/ingka/ikea/app/productinformationpage/v2/ui/WebViewDialogFragment$Content$Button;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@C16814e
public /* synthetic */ class WebViewDialogFragment$Content$Button$$serializer implements N<WebViewDialogFragment.Content.Button> {
    public static final WebViewDialogFragment$Content$Button$$serializer INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final int f72279a = 8;
    private static final SerialDescriptor descriptor;

    static {
        WebViewDialogFragment$Content$Button$$serializer webViewDialogFragment$Content$Button$$serializer = new WebViewDialogFragment$Content$Button$$serializer();
        INSTANCE = webViewDialogFragment$Content$Button$$serializer;
        J0 j02 = new J0("com.ingka.ikea.app.productinformationpage.v2.ui.WebViewDialogFragment.Content.Button", webViewDialogFragment$Content$Button$$serializer, 4);
        j02.p("text", false);
        j02.p("action", false);
        j02.p("icon", true);
        j02.p("clickAnalytics", true);
        descriptor = j02;
    }

    private WebViewDialogFragment$Content$Button$$serializer() {
    }

    /* renamed from: b */
    public final WebViewDialogFragment.Content.Button deserialize(Decoder decoder) {
        Interaction$Component interaction$Component;
        Integer num;
        WebViewDialogFragment.Content.Action action;
        String str;
        int i10;
        Decoder decoder2 = decoder;
        C17542s.j(decoder2, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        C17394c b10 = decoder2.b(serialDescriptor);
        KSerializer[] a10 = WebViewDialogFragment.Content.Button.f72287e;
        String str2 = null;
        if (b10.q()) {
            String n10 = b10.n(serialDescriptor, 0);
            interaction$Component = (Interaction$Component) b10.A(serialDescriptor, 3, a10[3], null);
            str = n10;
            num = (Integer) b10.A(serialDescriptor, 2, X.f144073a, null);
            i10 = 15;
            action = (WebViewDialogFragment.Content.Action) b10.o(serialDescriptor, 1, a10[1], null);
        } else {
            boolean z10 = true;
            int i11 = 0;
            WebViewDialogFragment.Content.Action action2 = null;
            Integer num2 = null;
            Interaction$Component interaction$Component2 = null;
            while (z10) {
                int p10 = b10.p(serialDescriptor);
                if (p10 == -1) {
                    z10 = false;
                } else if (p10 == 0) {
                    str2 = b10.n(serialDescriptor, 0);
                    i11 |= 1;
                } else if (p10 == 1) {
                    action2 = (WebViewDialogFragment.Content.Action) b10.o(serialDescriptor, 1, a10[1], action2);
                    i11 |= 2;
                } else if (p10 == 2) {
                    num2 = (Integer) b10.A(serialDescriptor, 2, X.f144073a, num2);
                    i11 |= 4;
                } else if (p10 == 3) {
                    interaction$Component2 = (Interaction$Component) b10.A(serialDescriptor, 3, a10[3], interaction$Component2);
                    i11 |= 8;
                } else {
                    throw new C17247E(p10);
                }
            }
            i10 = i11;
            str = str2;
            action = action2;
            num = num2;
            interaction$Component = interaction$Component2;
        }
        b10.c(serialDescriptor);
        return new WebViewDialogFragment.Content.Button(i10, str, action, num, interaction$Component, (T0) null);
    }

    /* renamed from: c */
    public final void serialize(Encoder encoder, WebViewDialogFragment.Content.Button button) {
        C17542s.j(encoder, "encoder");
        C17542s.j(button, "value");
        SerialDescriptor serialDescriptor = descriptor;
        C17395d b10 = encoder.b(serialDescriptor);
        WebViewDialogFragment.Content.Button.f(button, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] a10 = WebViewDialogFragment.Content.Button.f72287e;
        return new KSerializer[]{Y0.f144077a, a10[1], C17294a.u(X.f144073a), C17294a.u(a10[3])};
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return N.a.a(this);
    }
}
