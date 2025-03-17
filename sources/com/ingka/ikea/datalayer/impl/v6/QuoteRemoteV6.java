package com.ingka.ikea.datalayer.impl.v6;

import Mp.b;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
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
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\b\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00029\u0019BW\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010$\u0012\u0004\b)\u0010'\u001a\u0004\b(\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b*\u0010$\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b-\u0010$\u0012\u0004\b/\u0010'\u001a\u0004\b.\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u0010$\u0012\u0004\b2\u0010'\u001a\u0004\b1\u0010\u001cR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010'\u001a\u0004\b5\u00106¨\u0006:"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/v6/QuoteRemoteV6;", "Lpp/b;", "LMp/b;", "", "seen0", "", "id", "saying", "quotee", "role", "organisation", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/datalayer/impl/v6/QuoteRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LMp/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getSaying", "getSaying$annotations", "c", "getQuotee", "getQuotee$annotations", "d", "getRole", "getRole$annotations", "e", "getOrganisation", "getOrganisation$annotations", "f", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class QuoteRemoteV6 implements C11768b<b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95492a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95493b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95494c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95495d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95496e;

    /* renamed from: f  reason: collision with root package name */
    private final ImageRemote f95497f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/v6/QuoteRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/datalayer/impl/v6/QuoteRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<QuoteRemoteV6> serializer() {
            return QuoteRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ QuoteRemoteV6(int i10, String str, String str2, String str3, String str4, String str5, ImageRemote imageRemote, T0 t02) {
        if (63 != (i10 & 63)) {
            E0.b(i10, 63, QuoteRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f95492a = str;
        this.f95493b = str2;
        this.f95494c = str3;
        this.f95495d = str4;
        this.f95496e = str5;
        this.f95497f = imageRemote;
    }

    public static final /* synthetic */ void b(QuoteRemoteV6 quoteRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, quoteRemoteV6.f95492a);
        dVar.B(serialDescriptor, 1, y02, quoteRemoteV6.f95493b);
        dVar.B(serialDescriptor, 2, y02, quoteRemoteV6.f95494c);
        dVar.B(serialDescriptor, 3, y02, quoteRemoteV6.f95495d);
        dVar.B(serialDescriptor, 4, y02, quoteRemoteV6.f95496e);
        dVar.B(serialDescriptor, 5, ImageRemote$$serializer.INSTANCE, quoteRemoteV6.f95497f);
    }

    public b a() {
        String str = this.f95492a;
        if (str != null) {
            String str2 = this.f95493b;
            if (str2 != null) {
                String str3 = this.f95494c;
                if (str3 != null) {
                    String str4 = this.f95495d;
                    if (str4 != null) {
                        String str5 = this.f95496e;
                        if (str5 != null) {
                            ImageRemote imageRemote = this.f95497f;
                            return new b(str, str2, str3, str4, str5, imageRemote != null ? imageRemote.c() : null);
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

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QuoteRemoteV6)) {
            return false;
        }
        QuoteRemoteV6 quoteRemoteV6 = (QuoteRemoteV6) obj;
        return C17542s.e(this.f95492a, quoteRemoteV6.f95492a) && C17542s.e(this.f95493b, quoteRemoteV6.f95493b) && C17542s.e(this.f95494c, quoteRemoteV6.f95494c) && C17542s.e(this.f95495d, quoteRemoteV6.f95495d) && C17542s.e(this.f95496e, quoteRemoteV6.f95496e) && C17542s.e(this.f95497f, quoteRemoteV6.f95497f);
    }

    public int hashCode() {
        String str = this.f95492a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95493b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95494c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95495d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95496e;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        ImageRemote imageRemote = this.f95497f;
        if (imageRemote != null) {
            i10 = imageRemote.hashCode();
        }
        return hashCode5 + i10;
    }

    public String toString() {
        String str = this.f95492a;
        String str2 = this.f95493b;
        String str3 = this.f95494c;
        String str4 = this.f95495d;
        String str5 = this.f95496e;
        ImageRemote imageRemote = this.f95497f;
        return "QuoteRemoteV6(id=" + str + ", saying=" + str2 + ", quotee=" + str3 + ", role=" + str4 + ", organisation=" + str5 + ", image=" + imageRemote + ")";
    }
}
