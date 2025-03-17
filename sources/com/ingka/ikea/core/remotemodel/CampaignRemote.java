package com.ingka.ikea.core.remotemodel;

import com.ingka.ikea.core.model.Link;
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
import kp.C11519a;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0007\u0018\u0000 72\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u00028\u001bBa\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0011\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001d\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\u001fR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010!\u001a\u0004\b&\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001d\u0012\u0004\b+\u0010!\u001a\u0004\b*\u0010\u001fR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010\u001d\u0012\u0004\b.\u0010!\u001a\u0004\b-\u0010\u001fR\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010!\u001a\u0004\b1\u00102R\"\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010\u001d\u0012\u0004\b6\u0010!\u001a\u0004\b5\u0010\u001f¨\u00069"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/CampaignRemote;", "Lpp/b;", "Lkp/a;", "", "seen0", "", "id", "title", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "body", "disclaimer", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "link", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/LinkRemote;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/core/remotemodel/CampaignRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lkp/a;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "c", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "d", "getBody", "getBody$annotations", "e", "getDisclaimer", "getDisclaimer$annotations", "f", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink", "()Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink$annotations", "g", "getType", "getType$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CampaignRemote implements C11768b<C11519a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95173a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95174b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageRemote f95175c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95176d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95177e;

    /* renamed from: f  reason: collision with root package name */
    private final LinkRemote f95178f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95179g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/CampaignRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/CampaignRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<CampaignRemote> serializer() {
            return CampaignRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ CampaignRemote(int i10, String str, String str2, ImageRemote imageRemote, String str3, String str4, LinkRemote linkRemote, String str5, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, CampaignRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95173a = str;
        this.f95174b = str2;
        this.f95175c = imageRemote;
        this.f95176d = str3;
        this.f95177e = str4;
        this.f95178f = linkRemote;
        this.f95179g = str5;
    }

    public static final /* synthetic */ void b(CampaignRemote campaignRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, campaignRemote.f95173a);
        dVar.B(serialDescriptor, 1, y02, campaignRemote.f95174b);
        dVar.B(serialDescriptor, 2, ImageRemote$$serializer.INSTANCE, campaignRemote.f95175c);
        dVar.B(serialDescriptor, 3, y02, campaignRemote.f95176d);
        dVar.B(serialDescriptor, 4, y02, campaignRemote.f95177e);
        dVar.B(serialDescriptor, 5, LinkRemote$$serializer.INSTANCE, campaignRemote.f95178f);
        dVar.B(serialDescriptor, 6, y02, campaignRemote.f95179g);
    }

    public C11519a a() {
        String str = this.f95179g;
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        } else if (C17542s.e(str, "communicationPost")) {
            String str2 = this.f95173a;
            if (str2 != null) {
                String str3 = this.f95174b;
                if (str3 != null) {
                    ImageRemote imageRemote = this.f95175c;
                    if (imageRemote != null) {
                        return new C11519a.C2243a(str2, str3, imageRemote.c(), this.f95176d);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        } else {
            if (C17542s.e(str, "contentPromotion")) {
                LinkRemote linkRemote = this.f95178f;
                if (linkRemote != null) {
                    Link b10 = linkRemote.b();
                    if (b10 != null) {
                        String str4 = this.f95173a;
                        if (str4 != null) {
                            String str5 = this.f95174b;
                            if (str5 != null) {
                                ImageRemote imageRemote2 = this.f95175c;
                                if (imageRemote2 != null) {
                                    return new C11519a.b(str4, str5, imageRemote2.c(), this.f95176d, b10);
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            return null;
        }
    }
}
