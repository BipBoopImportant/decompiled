package com.ingka.ikea.datalayer.impl;

import Mp.e;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;

@p
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0001\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002%\u0016B7\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0006\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0018\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR \u0010\u0007\u001a\u00020\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0018\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u001aR \u0010\t\u001a\u00020\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010\u001c\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/FilterValueRemote;", "Lpp/b;", "LMp/e$b;", "", "seen0", "", "id", "name", "", "selected", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/datalayer/impl/FilterValueRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LMp/e$b;", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "()V", "getName", "getName$annotations", "c", "Z", "getSelected", "()Z", "getSelected$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FilterValueRemote implements C11768b<e.b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95482a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95483b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f95484c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/datalayer/impl/FilterValueRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/datalayer/impl/FilterValueRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FilterValueRemote> serializer() {
            return FilterValueRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FilterValueRemote(int i10, String str, String str2, boolean z10, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, FilterValueRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95482a = str;
        this.f95483b = str2;
        this.f95484c = z10;
    }

    public static final /* synthetic */ void b(FilterValueRemote filterValueRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, filterValueRemote.f95482a);
        dVar.y(serialDescriptor, 1, filterValueRemote.f95483b);
        dVar.x(serialDescriptor, 2, filterValueRemote.f95484c);
    }

    public e.b a() {
        return new e.b(this.f95482a, this.f95483b, this.f95484c);
    }
}
