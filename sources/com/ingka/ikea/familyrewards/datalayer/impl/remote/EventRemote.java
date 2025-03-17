package com.ingka.ikea.familyrewards.datalayer.impl.remote;

import Qq.c;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\b\u0018\u0000 12\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00022\u0017BM\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b \u0010!R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001aR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001aR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010\"\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001aR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010\"\u0012\u0004\b0\u0010%\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/EventRemote;", "Lpp/b;", "LQq/c;", "", "seen0", "", "id", "amount", "datetime", "title", "subtitle", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/EventRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()LQq/c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getAmount", "getAmount$annotations", "c", "getDatetime", "getDatetime$annotations", "d", "getTitle", "getTitle$annotations", "e", "getSubtitle", "getSubtitle$annotations", "Companion", "$serializer", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EventRemote implements C11768b<c> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95796a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95797b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95798c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95799d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95800e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/EventRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/familyrewards/datalayer/impl/remote/EventRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "familyrewards-datalayer-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<EventRemote> serializer() {
            return EventRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ EventRemote(int i10, String str, String str2, String str3, String str4, String str5, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, EventRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95796a = str;
        this.f95797b = str2;
        this.f95798c = str3;
        this.f95799d = str4;
        this.f95800e = str5;
    }

    public static final /* synthetic */ void b(EventRemote eventRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, eventRemote.f95796a);
        dVar.B(serialDescriptor, 1, y02, eventRemote.f95797b);
        dVar.B(serialDescriptor, 2, y02, eventRemote.f95798c);
        dVar.B(serialDescriptor, 3, y02, eventRemote.f95799d);
        dVar.B(serialDescriptor, 4, y02, eventRemote.f95800e);
    }

    public c a() {
        String str = this.f95796a;
        if (str != null) {
            String str2 = this.f95797b;
            if (str2 != null) {
                String str3 = this.f95798c;
                if (str3 != null) {
                    String str4 = this.f95799d;
                    if (str4 != null) {
                        return new c(str, str2, str3, str4, this.f95800e);
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
        if (!(obj instanceof EventRemote)) {
            return false;
        }
        EventRemote eventRemote = (EventRemote) obj;
        return C17542s.e(this.f95796a, eventRemote.f95796a) && C17542s.e(this.f95797b, eventRemote.f95797b) && C17542s.e(this.f95798c, eventRemote.f95798c) && C17542s.e(this.f95799d, eventRemote.f95799d) && C17542s.e(this.f95800e, eventRemote.f95800e);
    }

    public int hashCode() {
        String str = this.f95796a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95797b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95798c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95799d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95800e;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
    }

    public String toString() {
        String str = this.f95796a;
        String str2 = this.f95797b;
        String str3 = this.f95798c;
        String str4 = this.f95799d;
        String str5 = this.f95800e;
        return "EventRemote(id=" + str + ", amount=" + str2 + ", datetime=" + str3 + ", title=" + str4 + ", subtitle=" + str5 + ")";
    }
}
