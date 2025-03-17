package com.ingka.ikea.browseandsearch.browse.datalayer.model;

import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Image$$serializer;
import com.ingka.ikea.core.model.Link;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.J;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import nn.C11656b;

@p
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 72\u00020\u0001:\u0003\u00198#Ba\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b&\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010\u001cR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u000e\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u0010$\u001a\u0004\b6\u0010\u001c¨\u00069"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost;", "", "", "seen0", "", "id", "title", "Lcom/ingka/ikea/core/model/Image;", "image", "description", "Lcom/ingka/ikea/core/model/Link;", "link", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost$b;", "type", "url", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/model/Image;Ljava/lang/String;Lcom/ingka/ikea/core/model/Link;Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost$b;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getTitle", "c", "Lcom/ingka/ikea/core/model/Image;", "getImage", "()Lcom/ingka/ikea/core/model/Image;", "d", "getDescription", "e", "Lcom/ingka/ikea/core/model/Link;", "getLink", "()Lcom/ingka/ikea/core/model/Link;", "f", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost$b;", "getType", "()Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost$b;", "g", "getUrl", "Companion", "$serializer", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommunicationPost {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f93375h = {0, 0, 0, 0, Link.Companion.serializer(), J.b("com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost.Type", b.values()), 0};

    /* renamed from: a  reason: collision with root package name */
    private final String f93376a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93377b;

    /* renamed from: c  reason: collision with root package name */
    private final Image f93378c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93379d;

    /* renamed from: e  reason: collision with root package name */
    private final Link f93380e;

    /* renamed from: f  reason: collision with root package name */
    private final b f93381f;

    /* renamed from: g  reason: collision with root package name */
    private final String f93382g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CommunicationPost> serializer() {
            return CommunicationPost$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost$b;", "", "<init>", "(Ljava/lang/String;I)V", "COMMUNICATION_POST", "CONTENT_PROMOTION", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        COMMUNICATION_POST,
        CONTENT_PROMOTION;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }
    }

    public /* synthetic */ CommunicationPost(int i10, String str, String str2, Image image, String str3, Link link, b bVar, String str4, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, CommunicationPost$$serializer.INSTANCE.getDescriptor());
        }
        this.f93376a = str;
        this.f93377b = str2;
        this.f93378c = image;
        this.f93379d = str3;
        this.f93380e = link;
        this.f93381f = bVar;
        if ((i10 & 64) == 0) {
            this.f93382g = C11656b.b(image.getUrl());
        } else {
            this.f93382g = str4;
        }
    }

    public static final /* synthetic */ void b(CommunicationPost communicationPost, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93375h;
        dVar.y(serialDescriptor, 0, communicationPost.f93376a);
        dVar.y(serialDescriptor, 1, communicationPost.f93377b);
        dVar.i(serialDescriptor, 2, Image$$serializer.INSTANCE, communicationPost.f93378c);
        dVar.y(serialDescriptor, 3, communicationPost.f93379d);
        dVar.B(serialDescriptor, 4, kSerializerArr[4], communicationPost.f93380e);
        dVar.i(serialDescriptor, 5, kSerializerArr[5], communicationPost.f93381f);
        if (dVar.z(serialDescriptor, 6) || !C17542s.e(communicationPost.f93382g, C11656b.b(communicationPost.f93378c.getUrl()))) {
            dVar.y(serialDescriptor, 6, communicationPost.f93382g);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunicationPost)) {
            return false;
        }
        CommunicationPost communicationPost = (CommunicationPost) obj;
        return C17542s.e(this.f93376a, communicationPost.f93376a) && C17542s.e(this.f93377b, communicationPost.f93377b) && C17542s.e(this.f93378c, communicationPost.f93378c) && C17542s.e(this.f93379d, communicationPost.f93379d) && C17542s.e(this.f93380e, communicationPost.f93380e) && this.f93381f == communicationPost.f93381f;
    }

    public int hashCode() {
        int hashCode = ((((((this.f93376a.hashCode() * 31) + this.f93377b.hashCode()) * 31) + this.f93378c.hashCode()) * 31) + this.f93379d.hashCode()) * 31;
        Link link = this.f93380e;
        return ((hashCode + (link == null ? 0 : link.hashCode())) * 31) + this.f93381f.hashCode();
    }

    public String toString() {
        String str = this.f93376a;
        String str2 = this.f93377b;
        Image image = this.f93378c;
        String str3 = this.f93379d;
        Link link = this.f93380e;
        b bVar = this.f93381f;
        return "CommunicationPost(id=" + str + ", title=" + str2 + ", image=" + image + ", description=" + str3 + ", link=" + link + ", type=" + bVar + ")";
    }
}
