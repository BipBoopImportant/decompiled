package com.ingka.ikea.discover.impl;

import aq.c;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002&\u0014B/\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0017R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0017¨\u0006'"}, d2 = {"Lcom/ingka/ikea/discover/impl/HexColorRemote;", "Lpp/b;", "Laq/c;", "", "seen0", "", "light", "dark", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/discover/impl/HexColorRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Laq/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLight", "getLight$annotations", "()V", "getDark", "getDark$annotations", "Companion", "$serializer", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class HexColorRemote implements C11768b<c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95524a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95525b;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/discover/impl/HexColorRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/discover/impl/HexColorRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "discover-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<HexColorRemote> serializer() {
            return HexColorRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ HexColorRemote(int i10, String str, String str2, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, HexColorRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95524a = str;
        this.f95525b = str2;
    }

    public static final /* synthetic */ void b(HexColorRemote hexColorRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, hexColorRemote.f95524a);
        dVar.B(serialDescriptor, 1, y02, hexColorRemote.f95525b);
    }

    public c a() {
        String str = this.f95524a;
        if (str != null) {
            String str2 = this.f95525b;
            if (str2 != null) {
                return new c(str, str2);
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HexColorRemote)) {
            return false;
        }
        HexColorRemote hexColorRemote = (HexColorRemote) obj;
        return C17542s.e(this.f95524a, hexColorRemote.f95524a) && C17542s.e(this.f95525b, hexColorRemote.f95525b);
    }

    public int hashCode() {
        String str = this.f95524a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95525b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f95524a;
        String str2 = this.f95525b;
        return "HexColorRemote(light=" + str + ", dark=" + str2 + ")";
    }
}
