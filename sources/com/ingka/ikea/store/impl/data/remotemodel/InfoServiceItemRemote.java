package com.ingka.ikea.store.impl.data.remotemodel;

import GB.g;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-\u0016B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u0019R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010$\u001a\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/InfoServiceItemRemote;", "Lpp/b;", "LGB/g$b;", "", "seen0", "", "title", "description", "Lcom/ingka/ikea/store/impl/data/remotemodel/IconItemRemote;", "icon", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/store/impl/data/remotemodel/IconItemRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/store/impl/data/remotemodel/InfoServiceItemRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LGB/g$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "c", "Lcom/ingka/ikea/store/impl/data/remotemodel/IconItemRemote;", "getIcon", "()Lcom/ingka/ikea/store/impl/data/remotemodel/IconItemRemote;", "getIcon$annotations", "Companion", "$serializer", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InfoServiceItemRemote implements C11768b<g.b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f120419a;

    /* renamed from: b  reason: collision with root package name */
    private final String f120420b;

    /* renamed from: c  reason: collision with root package name */
    private final IconItemRemote f120421c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/store/impl/data/remotemodel/InfoServiceItemRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/store/impl/data/remotemodel/InfoServiceItemRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "store-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<InfoServiceItemRemote> serializer() {
            return InfoServiceItemRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ InfoServiceItemRemote(int i10, String str, String str2, IconItemRemote iconItemRemote, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, InfoServiceItemRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f120419a = str;
        this.f120420b = str2;
        this.f120421c = iconItemRemote;
    }

    public static final /* synthetic */ void b(InfoServiceItemRemote infoServiceItemRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, infoServiceItemRemote.f120419a);
        dVar.B(serialDescriptor, 1, y02, infoServiceItemRemote.f120420b);
        dVar.B(serialDescriptor, 2, IconItemRemote$$serializer.INSTANCE, infoServiceItemRemote.f120421c);
    }

    public g.b a() {
        String str = this.f120419a;
        String str2 = this.f120420b;
        IconItemRemote iconItemRemote = this.f120421c;
        return new g.b(str, str2, iconItemRemote != null ? iconItemRemote.a() : null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InfoServiceItemRemote)) {
            return false;
        }
        InfoServiceItemRemote infoServiceItemRemote = (InfoServiceItemRemote) obj;
        return C17542s.e(this.f120419a, infoServiceItemRemote.f120419a) && C17542s.e(this.f120420b, infoServiceItemRemote.f120420b) && C17542s.e(this.f120421c, infoServiceItemRemote.f120421c);
    }

    public int hashCode() {
        String str = this.f120419a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f120420b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        IconItemRemote iconItemRemote = this.f120421c;
        if (iconItemRemote != null) {
            i10 = iconItemRemote.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f120419a;
        String str2 = this.f120420b;
        IconItemRemote iconItemRemote = this.f120421c;
        return "InfoServiceItemRemote(title=" + str + ", description=" + str2 + ", icon=" + iconItemRemote + ")";
    }
}
