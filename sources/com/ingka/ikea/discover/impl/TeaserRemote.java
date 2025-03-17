package com.ingka.ikea.discover.impl;

import aq.c;
import aq.e;
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

@p
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002-\u0016B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0019R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010'¨\u0006."}, d2 = {"Lcom/ingka/ikea/discover/impl/TeaserRemote;", "Lcom/ingka/ikea/discover/impl/i;", "Laq/e$c;", "", "seen0", "", "teaserDescription", "Lcom/ingka/ikea/discover/impl/HexColorRemote;", "textColor", "backgroundColor", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/ingka/ikea/discover/impl/HexColorRemote;Lcom/ingka/ikea/discover/impl/HexColorRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/discover/impl/TeaserRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Laq/e$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTeaserDescription", "getTeaserDescription$annotations", "()V", "Lcom/ingka/ikea/discover/impl/HexColorRemote;", "getTextColor", "()Lcom/ingka/ikea/discover/impl/HexColorRemote;", "getTextColor$annotations", "c", "getBackgroundColor", "getBackgroundColor$annotations", "Companion", "$serializer", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class TeaserRemote implements i<e.c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95549a;

    /* renamed from: b  reason: collision with root package name */
    private final HexColorRemote f95550b;

    /* renamed from: c  reason: collision with root package name */
    private final HexColorRemote f95551c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/discover/impl/TeaserRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/discover/impl/TeaserRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<TeaserRemote> serializer() {
            return TeaserRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ TeaserRemote(int i10, String str, HexColorRemote hexColorRemote, HexColorRemote hexColorRemote2, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, TeaserRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95549a = str;
        this.f95550b = hexColorRemote;
        this.f95551c = hexColorRemote2;
    }

    public static final /* synthetic */ void b(TeaserRemote teaserRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.B(serialDescriptor, 0, Y0.f144077a, teaserRemote.f95549a);
        HexColorRemote$$serializer hexColorRemote$$serializer = HexColorRemote$$serializer.INSTANCE;
        dVar.B(serialDescriptor, 1, hexColorRemote$$serializer, teaserRemote.f95550b);
        dVar.B(serialDescriptor, 2, hexColorRemote$$serializer, teaserRemote.f95551c);
    }

    /* renamed from: a */
    public e.c toLocal() {
        String str = this.f95549a;
        if (str != null) {
            HexColorRemote hexColorRemote = this.f95550b;
            if (hexColorRemote != null) {
                c a10 = hexColorRemote.a();
                HexColorRemote hexColorRemote2 = this.f95551c;
                if (hexColorRemote2 != null) {
                    return new e.c(str, a10, hexColorRemote2.a());
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
        if (!(obj instanceof TeaserRemote)) {
            return false;
        }
        TeaserRemote teaserRemote = (TeaserRemote) obj;
        return C17542s.e(this.f95549a, teaserRemote.f95549a) && C17542s.e(this.f95550b, teaserRemote.f95550b) && C17542s.e(this.f95551c, teaserRemote.f95551c);
    }

    public int hashCode() {
        String str = this.f95549a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        HexColorRemote hexColorRemote = this.f95550b;
        int hashCode2 = (hashCode + (hexColorRemote == null ? 0 : hexColorRemote.hashCode())) * 31;
        HexColorRemote hexColorRemote2 = this.f95551c;
        if (hexColorRemote2 != null) {
            i10 = hexColorRemote2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95549a;
        HexColorRemote hexColorRemote = this.f95550b;
        HexColorRemote hexColorRemote2 = this.f95551c;
        return "TeaserRemote(teaserDescription=" + str + ", textColor=" + hexColorRemote + ", backgroundColor=" + hexColorRemote2 + ")";
    }
}
