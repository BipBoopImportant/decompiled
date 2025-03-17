package com.ingka.ikea.room.impl.data.remote;

import KJ.C15985a;
import YH.C16877v;
import com.ingka.ikea.core.model.Image;
import com.ingka.ikea.core.model.Link;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import com.ingka.ikea.core.remotemodel.LinkRemote;
import com.ingka.ikea.core.remotemodel.LinkRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import py.d;
import sy.C15053a;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\b\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003./\"B?\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0006\u001a\u00020\u00058\u0016X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001aR \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b$\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001aR&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010)\u0012\u0004\b,\u0010&\u001a\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote;", "Lpy/d;", "Lsy/a;", "", "seen0", "", "id", "title", "", "Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote$CardRemote;", "cards", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "c", "()Lsy/a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "getId$annotations", "()V", "getTitle", "getTitle$annotations", "Ljava/util/List;", "getCards", "()Ljava/util/List;", "getCards$annotations", "Companion", "CardRemote", "$serializer", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AssistanceCardsRemote implements d<C15053a> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: d  reason: collision with root package name */
    public static final int f119730d = 8;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f119731e = {null, null, new C17451f(AssistanceCardsRemote$CardRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final String f119732a;

    /* renamed from: b  reason: collision with root package name */
    private final String f119733b;

    /* renamed from: c  reason: collision with root package name */
    private final List<CardRemote> f119734c;

    @p
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00024\u0018BC\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010*\u0012\u0004\b-\u0010&\u001a\u0004\b+\u0010,R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010&\u001a\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote$CardRemote;", "Lpp/b;", "Lsy/a$a;", "", "seen0", "", "title", "body", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "addon", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "link", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;Lcom/ingka/ikea/core/remotemodel/LinkRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote$CardRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lsy/a$a;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getBody", "getBody$annotations", "c", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getAddon", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getAddon$annotations", "d", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink", "()Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "getLink$annotations", "Companion", "$serializer", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CardRemote implements C11768b<C15053a.C3241a> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: e  reason: collision with root package name */
        public static final int f119737e = 8;

        /* renamed from: a  reason: collision with root package name */
        private final String f119738a;

        /* renamed from: b  reason: collision with root package name */
        private final String f119739b;

        /* renamed from: c  reason: collision with root package name */
        private final ImageRemote f119740c;

        /* renamed from: d  reason: collision with root package name */
        private final LinkRemote f119741d;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote$CardRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote$CardRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<CardRemote> serializer() {
                return AssistanceCardsRemote$CardRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CardRemote(int i10, String str, String str2, ImageRemote imageRemote, LinkRemote linkRemote, T0 t02) {
            if (15 != (i10 & 15)) {
                E0.b(i10, 15, AssistanceCardsRemote$CardRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f119738a = str;
            this.f119739b = str2;
            this.f119740c = imageRemote;
            this.f119741d = linkRemote;
        }

        public static final /* synthetic */ void b(CardRemote cardRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            dVar.y(serialDescriptor, 0, cardRemote.f119738a);
            dVar.B(serialDescriptor, 1, Y0.f144077a, cardRemote.f119739b);
            dVar.B(serialDescriptor, 2, ImageRemote$$serializer.INSTANCE, cardRemote.f119740c);
            dVar.B(serialDescriptor, 3, LinkRemote$$serializer.INSTANCE, cardRemote.f119741d);
        }

        public C15053a.C3241a a() {
            String str = this.f119738a;
            String str2 = this.f119739b;
            ImageRemote imageRemote = this.f119740c;
            Link link = null;
            Image c10 = imageRemote != null ? imageRemote.c() : null;
            LinkRemote linkRemote = this.f119741d;
            if (linkRemote != null) {
                link = linkRemote.b();
            }
            return new C15053a.C3241a(str, str2, c10, link);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CardRemote)) {
                return false;
            }
            CardRemote cardRemote = (CardRemote) obj;
            return C17542s.e(this.f119738a, cardRemote.f119738a) && C17542s.e(this.f119739b, cardRemote.f119739b) && C17542s.e(this.f119740c, cardRemote.f119740c) && C17542s.e(this.f119741d, cardRemote.f119741d);
        }

        public int hashCode() {
            int hashCode = this.f119738a.hashCode() * 31;
            String str = this.f119739b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            ImageRemote imageRemote = this.f119740c;
            int hashCode3 = (hashCode2 + (imageRemote == null ? 0 : imageRemote.hashCode())) * 31;
            LinkRemote linkRemote = this.f119741d;
            if (linkRemote != null) {
                i10 = linkRemote.hashCode();
            }
            return hashCode3 + i10;
        }

        public String toString() {
            String str = this.f119738a;
            String str2 = this.f119739b;
            ImageRemote imageRemote = this.f119740c;
            LinkRemote linkRemote = this.f119741d;
            return "CardRemote(title=" + str + ", body=" + str2 + ", addon=" + imageRemote + ", link=" + linkRemote + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/room/impl/data/remote/AssistanceCardsRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "room-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<AssistanceCardsRemote> serializer() {
            return AssistanceCardsRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AssistanceCardsRemote(int i10, String str, String str2, List list, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, AssistanceCardsRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f119732a = str;
        this.f119733b = str2;
        this.f119734c = list;
    }

    public static final /* synthetic */ void d(AssistanceCardsRemote assistanceCardsRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f119731e;
        dVar.y(serialDescriptor, 0, assistanceCardsRemote.b());
        dVar.y(serialDescriptor, 1, assistanceCardsRemote.f119733b);
        dVar.i(serialDescriptor, 2, kSerializerArr[2], assistanceCardsRemote.f119734c);
    }

    public String b() {
        return this.f119732a;
    }

    /* renamed from: c */
    public C15053a toLocal() {
        String b10 = b();
        String str = this.f119733b;
        Iterable<CardRemote> iterable = this.f119734c;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (CardRemote a10 : iterable) {
            arrayList.add(a10.a());
        }
        return new C15053a(b10, str, C15985a.h(arrayList));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssistanceCardsRemote)) {
            return false;
        }
        AssistanceCardsRemote assistanceCardsRemote = (AssistanceCardsRemote) obj;
        return C17542s.e(this.f119732a, assistanceCardsRemote.f119732a) && C17542s.e(this.f119733b, assistanceCardsRemote.f119733b) && C17542s.e(this.f119734c, assistanceCardsRemote.f119734c);
    }

    public int hashCode() {
        return (((this.f119732a.hashCode() * 31) + this.f119733b.hashCode()) * 31) + this.f119734c.hashCode();
    }

    public String toString() {
        String str = this.f119732a;
        String str2 = this.f119733b;
        List<CardRemote> list = this.f119734c;
        return "AssistanceCardsRemote(id=" + str + ", title=" + str2 + ", cards=" + list + ")";
    }
}
