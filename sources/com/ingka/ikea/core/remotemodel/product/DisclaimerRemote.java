package com.ingka.ikea.core.remotemodel.product;

import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.model.product.Disclaimer;
import com.ingka.ikea.core.model.product.DisclaimerType;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import com.ingka.ikea.core.remotemodel.LinkRemote;
import com.ingka.ikea.core.remotemodel.LinkRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002*\u001aBC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010\u001b\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010\u001dR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b!\u0010#\u0012\u0004\b%\u0010\u001f\u001a\u0004\b\u001a\u0010$R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010&\u0012\u0004\b(\u0010\u001f\u001a\u0004\b \u0010'¨\u0006+"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/product/Disclaimer;", "", "seen0", "", "type", "text", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "link", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Lcom/ingka/ikea/core/remotemodel/LinkRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "e", "(Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "d", "()Lcom/ingka/ikea/core/model/product/Disclaimer;", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "getType$annotations", "()V", "b", "c", "getText$annotations", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "()Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DisclaimerRemote implements C11768b<Disclaimer> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95267a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95268b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageRemote f95269c;

    /* renamed from: d  reason: collision with root package name */
    private final LinkRemote f95270d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/product/DisclaimerRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<DisclaimerRemote> serializer() {
            return DisclaimerRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ DisclaimerRemote(int i10, String str, String str2, ImageRemote imageRemote, LinkRemote linkRemote, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, DisclaimerRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95267a = str;
        this.f95268b = str2;
        this.f95269c = imageRemote;
        this.f95270d = linkRemote;
    }

    public static final /* synthetic */ void e(DisclaimerRemote disclaimerRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, disclaimerRemote.f95267a);
        dVar.B(serialDescriptor, 1, y02, disclaimerRemote.f95268b);
        dVar.B(serialDescriptor, 2, ImageRemote$$serializer.INSTANCE, disclaimerRemote.f95269c);
        dVar.B(serialDescriptor, 3, LinkRemote$$serializer.INSTANCE, disclaimerRemote.f95270d);
    }

    public final ImageRemote a() {
        return this.f95269c;
    }

    public final LinkRemote b() {
        return this.f95270d;
    }

    public final String c() {
        return this.f95268b;
    }

    public Disclaimer d() {
        Link link;
        T t10;
        Iterator<T> it = DisclaimerType.getEntries().iterator();
        while (true) {
            link = null;
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (C17542s.e(((DisclaimerType) t10).name(), this.f95267a)) {
                break;
            }
        }
        DisclaimerType disclaimerType = (DisclaimerType) t10;
        if (disclaimerType == null) {
            disclaimerType = DisclaimerType.UNKNOWN;
        }
        String str = this.f95268b;
        if (str != null) {
            ImageRemote imageRemote = this.f95269c;
            Image c10 = imageRemote != null ? imageRemote.c() : null;
            LinkRemote linkRemote = this.f95270d;
            if (linkRemote != null) {
                link = linkRemote.b();
            }
            return new Disclaimer(disclaimerType, str, c10, link);
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
