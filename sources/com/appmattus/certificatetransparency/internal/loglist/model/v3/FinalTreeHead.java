package com.appmattus.certificatetransparency.internal.loglist.model.v3;

import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0016J\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u0016R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010%\u0012\u0004\b'\u0010$\u001a\u0004\b&\u0010\u0018¨\u0006*"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;", "", "", "treeSize", "", "sha256RootHash", "<init>", "(ILjava/lang/String;)V", "seen0", "LjK/T0;", "serializationConstructorMarker", "(IILjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "write$Self$certificatetransparency", "(Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "component1", "()I", "component2", "()Ljava/lang/String;", "copy", "(ILjava/lang/String;)Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTreeSize", "getTreeSize$annotations", "()V", "Ljava/lang/String;", "getSha256RootHash", "getSha256RootHash$annotations", "Companion", "$serializer", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FinalTreeHead {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private final String sha256RootHash;
    private final int treeSize;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/appmattus/certificatetransparency/internal/loglist/model/v3/FinalTreeHead;", "certificatetransparency"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final KSerializer<FinalTreeHead> serializer() {
            return FinalTreeHead$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FinalTreeHead(int i10, int i11, String str, T0 t02) {
        if (3 != (i10 & 3)) {
            E0.b(i10, 3, FinalTreeHead$$serializer.INSTANCE.getDescriptor());
        }
        this.treeSize = i11;
        this.sha256RootHash = str;
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (str.length() != 44) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static /* synthetic */ FinalTreeHead copy$default(FinalTreeHead finalTreeHead, int i10, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = finalTreeHead.treeSize;
        }
        if ((i11 & 2) != 0) {
            str = finalTreeHead.sha256RootHash;
        }
        return finalTreeHead.copy(i10, str);
    }

    public static /* synthetic */ void getSha256RootHash$annotations() {
    }

    public static /* synthetic */ void getTreeSize$annotations() {
    }

    public static final /* synthetic */ void write$Self$certificatetransparency(FinalTreeHead finalTreeHead, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.w(serialDescriptor, 0, finalTreeHead.treeSize);
        dVar.y(serialDescriptor, 1, finalTreeHead.sha256RootHash);
    }

    public final int component1() {
        return this.treeSize;
    }

    public final String component2() {
        return this.sha256RootHash;
    }

    public final FinalTreeHead copy(int i10, String str) {
        C17542s.j(str, "sha256RootHash");
        return new FinalTreeHead(i10, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FinalTreeHead)) {
            return false;
        }
        FinalTreeHead finalTreeHead = (FinalTreeHead) obj;
        return this.treeSize == finalTreeHead.treeSize && C17542s.e(this.sha256RootHash, finalTreeHead.sha256RootHash);
    }

    public final String getSha256RootHash() {
        return this.sha256RootHash;
    }

    public final int getTreeSize() {
        return this.treeSize;
    }

    public int hashCode() {
        return (Integer.hashCode(this.treeSize) * 31) + this.sha256RootHash.hashCode();
    }

    public String toString() {
        return "FinalTreeHead(treeSize=" + this.treeSize + ", sha256RootHash=" + this.sha256RootHash + ')';
    }

    public FinalTreeHead(int i10, String str) {
        C17542s.j(str, "sha256RootHash");
        this.treeSize = i10;
        this.sha256RootHash = str;
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        } else if (str.length() != 44) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
