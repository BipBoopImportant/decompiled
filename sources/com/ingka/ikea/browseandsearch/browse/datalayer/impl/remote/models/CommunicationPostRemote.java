package com.ingka.ikea.browseandsearch.browse.datalayer.impl.remote.models;

import com.ingka.ikea.browseandsearch.browse.datalayer.model.CommunicationPost;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import com.ingka.ikea.core.remotemodel.LinkRemote;
import com.ingka.ikea.core.remotemodel.LinkRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\b\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002?\u0019Ba\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010$\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010'\u001a\u0004\b-\u0010.R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010$\u0012\u0004\b2\u0010'\u001a\u0004\b1\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010$\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010'\u001a\u0004\b8\u00109R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010$\u0012\u0004\b=\u0010'\u001a\u0004\b<\u0010\u001c¨\u0006@"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/CommunicationPostRemote;", "Lpp/b;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/model/CommunicationPost;", "", "seen0", "", "id", "title", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "body", "disclaimer", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "link", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/LinkRemote;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "a", "(Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/CommunicationPostRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "b", "getTitle", "getTitle$annotations", "c", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "d", "getBody", "getBody$annotations", "e", "getDisclaimer", "getDisclaimer$annotations", "f", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink", "()Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink$annotations", "g", "getType", "getType$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommunicationPostRemote implements C11768b<CommunicationPost> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f93351a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93352b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageRemote f93353c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93354d;

    /* renamed from: e  reason: collision with root package name */
    private final String f93355e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkRemote f93356f;

    /* renamed from: g  reason: collision with root package name */
    private final String f93357g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/CommunicationPostRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/browse/datalayer/impl/remote/models/CommunicationPostRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CommunicationPostRemote> serializer() {
            return CommunicationPostRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CommunicationPostRemote(int i10, String str, String str2, ImageRemote imageRemote, String str3, String str4, LinkRemote linkRemote, String str5, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, CommunicationPostRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f93351a = str;
        this.f93352b = str2;
        this.f93353c = imageRemote;
        this.f93354d = str3;
        this.f93355e = str4;
        this.f93356f = linkRemote;
        this.f93357g = str5;
    }

    public static final /* synthetic */ void a(CommunicationPostRemote communicationPostRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, communicationPostRemote.f93351a);
        dVar.B(serialDescriptor, 1, y02, communicationPostRemote.f93352b);
        dVar.B(serialDescriptor, 2, ImageRemote$$serializer.INSTANCE, communicationPostRemote.f93353c);
        dVar.B(serialDescriptor, 3, y02, communicationPostRemote.f93354d);
        dVar.B(serialDescriptor, 4, y02, communicationPostRemote.f93355e);
        dVar.B(serialDescriptor, 5, LinkRemote$$serializer.INSTANCE, communicationPostRemote.f93356f);
        dVar.B(serialDescriptor, 6, y02, communicationPostRemote.f93357g);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommunicationPostRemote)) {
            return false;
        }
        CommunicationPostRemote communicationPostRemote = (CommunicationPostRemote) obj;
        return C17542s.e(this.f93351a, communicationPostRemote.f93351a) && C17542s.e(this.f93352b, communicationPostRemote.f93352b) && C17542s.e(this.f93353c, communicationPostRemote.f93353c) && C17542s.e(this.f93354d, communicationPostRemote.f93354d) && C17542s.e(this.f93355e, communicationPostRemote.f93355e) && C17542s.e(this.f93356f, communicationPostRemote.f93356f) && C17542s.e(this.f93357g, communicationPostRemote.f93357g);
    }

    public int hashCode() {
        String str = this.f93351a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f93352b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageRemote imageRemote = this.f93353c;
        int hashCode3 = (hashCode2 + (imageRemote == null ? 0 : imageRemote.hashCode())) * 31;
        String str3 = this.f93354d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f93355e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        LinkRemote linkRemote = this.f93356f;
        int hashCode6 = (hashCode5 + (linkRemote == null ? 0 : linkRemote.hashCode())) * 31;
        String str5 = this.f93357g;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        String str = this.f93351a;
        String str2 = this.f93352b;
        ImageRemote imageRemote = this.f93353c;
        String str3 = this.f93354d;
        String str4 = this.f93355e;
        LinkRemote linkRemote = this.f93356f;
        String str5 = this.f93357g;
        return "CommunicationPostRemote(id=" + str + ", title=" + str2 + ", image=" + imageRemote + ", body=" + str3 + ", disclaimer=" + str4 + ", link=" + linkRemote + ", type=" + str5 + ")";
    }
}
