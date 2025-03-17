package com.ingka.ikea.inbox.communicationpost.impl;

import com.ingka.ikea.core.model.Image;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import js.C11451a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0001\u0018\u0000 42\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00025\u001aBa\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001c\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u001c\u0012\u0004\b\"\u0010 \u001a\u0004\b!\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010\u001c\u0012\u0004\b%\u0010 \u001a\u0004\b$\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010\u001c\u0012\u0004\b(\u0010 \u001a\u0004\b'\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010\u001c\u0012\u0004\b+\u0010 \u001a\u0004\b*\u0010\u001eR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010 \u001a\u0004\b.\u0010/R\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010\u001c\u0012\u0004\b3\u0010 \u001a\u0004\b2\u0010\u001e¨\u00066"}, d2 = {"Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostRemote;", "Lpp/b;", "Ljs/a;", "", "seen0", "", "id", "title", "body", "createdAt", "updatedAt", "Lcom/ingka/ikea/inbox/communicationpost/impl/ImageRemote;", "image", "purpose", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/inbox/communicationpost/impl/ImageRemote;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Ljs/a;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "c", "getBody", "getBody$annotations", "d", "getCreatedAt", "getCreatedAt$annotations", "e", "getUpdatedAt", "getUpdatedAt$annotations", "f", "Lcom/ingka/ikea/inbox/communicationpost/impl/ImageRemote;", "getImage", "()Lcom/ingka/ikea/inbox/communicationpost/impl/ImageRemote;", "getImage$annotations", "g", "getPurpose", "getPurpose$annotations", "Companion", "$serializer", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CommunicationPostRemote implements C11768b<C11451a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95994a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95995b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95996c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95997d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95998e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageRemote f95999f;

    /* renamed from: g  reason: collision with root package name */
    private final String f96000g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/inbox/communicationpost/impl/CommunicationPostRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "communicationpost-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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

    public /* synthetic */ CommunicationPostRemote(int i10, String str, String str2, String str3, String str4, String str5, ImageRemote imageRemote, String str6, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, CommunicationPostRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95994a = str;
        this.f95995b = str2;
        this.f95996c = str3;
        this.f95997d = str4;
        this.f95998e = str5;
        this.f95999f = imageRemote;
        this.f96000g = str6;
    }

    public static final /* synthetic */ void b(CommunicationPostRemote communicationPostRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, communicationPostRemote.f95994a);
        dVar.B(serialDescriptor, 1, y02, communicationPostRemote.f95995b);
        dVar.B(serialDescriptor, 2, y02, communicationPostRemote.f95996c);
        dVar.B(serialDescriptor, 3, y02, communicationPostRemote.f95997d);
        dVar.B(serialDescriptor, 4, y02, communicationPostRemote.f95998e);
        dVar.B(serialDescriptor, 5, ImageRemote$$serializer.INSTANCE, communicationPostRemote.f95999f);
        dVar.B(serialDescriptor, 6, y02, communicationPostRemote.f96000g);
    }

    public C11451a a() {
        String str = this.f95994a;
        if (str != null) {
            String str2 = this.f95995b;
            if (str2 != null) {
                String str3 = this.f95996c;
                if (str3 != null) {
                    String str4 = this.f95997d;
                    if (str4 != null) {
                        String str5 = this.f95998e;
                        if (str5 != null) {
                            ImageRemote imageRemote = this.f95999f;
                            Image a10 = imageRemote != null ? imageRemote.a() : null;
                            if (a10 != null) {
                                String str6 = this.f96000g;
                                if (str6 != null) {
                                    return new C11451a(str, str2, str3, str4, str5, a10, str6);
                                }
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
