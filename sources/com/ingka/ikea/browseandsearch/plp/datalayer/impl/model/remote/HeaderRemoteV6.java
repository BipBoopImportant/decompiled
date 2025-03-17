package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import com.ingka.ikea.core.model.Image;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import vn.d;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b$\b\u0001\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<\u001cBk\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u001e\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%R \u0010\t\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010\u001e\u0012\u0004\b)\u0010\"\u001a\u0004\b(\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010\u001e\u0012\u0004\b,\u0010\"\u001a\u0004\b+\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010\u001e\u0012\u0004\b/\u0010\"\u001a\u0004\b.\u0010 R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010\"\u001a\u0004\b2\u00103R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010\u001e\u0012\u0004\b7\u0010\"\u001a\u0004\b6\u0010 R\"\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010\u001e\u0012\u0004\b:\u0010\"\u001a\u0004\b9\u0010 ¨\u0006="}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;", "Lpp/b;", "Lvn/d;", "", "seen0", "", "id", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "title", "description", "validity", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "link", "disclaimer", "prioritiser", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/LinkRemote;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lvn/d;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "c", "getTitle", "getTitle$annotations", "d", "getDescription", "getDescription$annotations", "e", "getValidity", "getValidity$annotations", "f", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink", "()Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink$annotations", "g", "getDisclaimer", "getDisclaimer$annotations", "h", "getPrioritiser", "getPrioritiser$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeaderRemoteV6 implements C11768b<d> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f93412a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageRemote f93413b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93414c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93415d;

    /* renamed from: e  reason: collision with root package name */
    private final String f93416e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkRemote f93417f;

    /* renamed from: g  reason: collision with root package name */
    private final String f93418g;

    /* renamed from: h  reason: collision with root package name */
    private final String f93419h;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/HeaderRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<HeaderRemoteV6> serializer() {
            return HeaderRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HeaderRemoteV6(int i10, String str, ImageRemote imageRemote, String str2, String str3, String str4, LinkRemote linkRemote, String str5, String str6, T0 t02) {
        if (255 != (i10 & 255)) {
            E0.b(i10, 255, HeaderRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f93412a = str;
        this.f93413b = imageRemote;
        this.f93414c = str2;
        this.f93415d = str3;
        this.f93416e = str4;
        this.f93417f = linkRemote;
        this.f93418g = str5;
        this.f93419h = str6;
    }

    public static final /* synthetic */ void b(HeaderRemoteV6 headerRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, headerRemoteV6.f93412a);
        dVar.B(serialDescriptor, 1, ImageRemote$$serializer.INSTANCE, headerRemoteV6.f93413b);
        dVar.y(serialDescriptor, 2, headerRemoteV6.f93414c);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 3, y02, headerRemoteV6.f93415d);
        dVar.B(serialDescriptor, 4, y02, headerRemoteV6.f93416e);
        dVar.B(serialDescriptor, 5, LinkRemote$$serializer.INSTANCE, headerRemoteV6.f93417f);
        dVar.B(serialDescriptor, 6, y02, headerRemoteV6.f93418g);
        dVar.B(serialDescriptor, 7, y02, headerRemoteV6.f93419h);
    }

    public d a() {
        String str = this.f93412a;
        String str2 = this.f93414c;
        ImageRemote imageRemote = this.f93413b;
        Image c10 = imageRemote != null ? imageRemote.c() : null;
        String str3 = this.f93415d;
        String str4 = this.f93416e;
        LinkRemote linkRemote = this.f93417f;
        return new d(str, str2, c10, str3, str4, linkRemote != null ? linkRemote.b() : null, this.f93418g, this.f93419h);
    }
}
