package com.ingka.ikea.episod.datalayer.network.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.T0;
import jK.Y0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001d\b\b\u0018\u0000 ;2\u00020\u0001:\u0002<#Ba\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rBu\b\u0011\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J(\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016HÁ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R(\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010)\u0012\u0004\b.\u0010(\u001a\u0004\b-\u0010\u001cR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010)\u0012\u0004\b1\u0010(\u001a\u0004\b0\u0010\u001cR\"\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u0010)\u0012\u0004\b4\u0010(\u001a\u0004\b3\u0010\u001cR\"\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u0010)\u0012\u0004\b7\u0010(\u001a\u0004\b6\u0010\u001cR\"\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010)\u0012\u0004\b:\u0010(\u001a\u0004\b9\u0010\u001c¨\u0006="}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "", "", "Lcom/ingka/ikea/episod/datalayer/network/models/Item;", "items", "", "label", "component", "componentValue", "imageId", "componentType", "category", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen1", "LjK/T0;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "getItems$annotations", "()V", "Ljava/lang/String;", "getLabel", "getLabel$annotations", "c", "getComponent", "getComponent$annotations", "d", "getComponentValue", "getComponentValue$annotations", "e", "getImageId", "getImageId$annotations", "f", "getComponentType", "getComponentType$annotations", "g", "getCategory", "getCategory$annotations", "Companion", "$serializer", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class EventDetails {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f95769h = {new C17451f(Item$$serializer.INSTANCE), null, null, null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<Item> f95770a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95771b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95772c;

    /* renamed from: d  reason: collision with root package name */
    private final String f95773d;

    /* renamed from: e  reason: collision with root package name */
    private final String f95774e;

    /* renamed from: f  reason: collision with root package name */
    private final String f95775f;

    /* renamed from: g  reason: collision with root package name */
    private final String f95776g;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/episod/datalayer/network/models/EventDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "episod-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EventDetails> serializer() {
            return EventDetails$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    public EventDetails() {
        this((List) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public static final /* synthetic */ void b(EventDetails eventDetails, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f95769h;
        if (dVar.z(serialDescriptor, 0) || eventDetails.f95770a != null) {
            dVar.B(serialDescriptor, 0, kSerializerArr[0], eventDetails.f95770a);
        }
        if (dVar.z(serialDescriptor, 1) || eventDetails.f95771b != null) {
            dVar.B(serialDescriptor, 1, Y0.f144077a, eventDetails.f95771b);
        }
        if (dVar.z(serialDescriptor, 2) || eventDetails.f95772c != null) {
            dVar.B(serialDescriptor, 2, Y0.f144077a, eventDetails.f95772c);
        }
        if (dVar.z(serialDescriptor, 3) || eventDetails.f95773d != null) {
            dVar.B(serialDescriptor, 3, Y0.f144077a, eventDetails.f95773d);
        }
        if (dVar.z(serialDescriptor, 4) || eventDetails.f95774e != null) {
            dVar.B(serialDescriptor, 4, Y0.f144077a, eventDetails.f95774e);
        }
        if (dVar.z(serialDescriptor, 5) || eventDetails.f95775f != null) {
            dVar.B(serialDescriptor, 5, Y0.f144077a, eventDetails.f95775f);
        }
        if (dVar.z(serialDescriptor, 6) || eventDetails.f95776g != null) {
            dVar.B(serialDescriptor, 6, Y0.f144077a, eventDetails.f95776g);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EventDetails)) {
            return false;
        }
        EventDetails eventDetails = (EventDetails) obj;
        return C17542s.e(this.f95770a, eventDetails.f95770a) && C17542s.e(this.f95771b, eventDetails.f95771b) && C17542s.e(this.f95772c, eventDetails.f95772c) && C17542s.e(this.f95773d, eventDetails.f95773d) && C17542s.e(this.f95774e, eventDetails.f95774e) && C17542s.e(this.f95775f, eventDetails.f95775f) && C17542s.e(this.f95776g, eventDetails.f95776g);
    }

    public int hashCode() {
        List<Item> list = this.f95770a;
        int i10 = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f95771b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f95772c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95773d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f95774e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f95775f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f95776g;
        if (str6 != null) {
            i10 = str6.hashCode();
        }
        return hashCode6 + i10;
    }

    public String toString() {
        List<Item> list = this.f95770a;
        String str = this.f95771b;
        String str2 = this.f95772c;
        String str3 = this.f95773d;
        String str4 = this.f95774e;
        String str5 = this.f95775f;
        String str6 = this.f95776g;
        return "EventDetails(items=" + list + ", label=" + str + ", component=" + str2 + ", componentValue=" + str3 + ", imageId=" + str4 + ", componentType=" + str5 + ", category=" + str6 + ")";
    }

    @C16814e
    public /* synthetic */ EventDetails(int i10, List list, String str, String str2, String str3, String str4, String str5, String str6, T0 t02) {
        if ((i10 & 1) == 0) {
            this.f95770a = null;
        } else {
            this.f95770a = list;
        }
        if ((i10 & 2) == 0) {
            this.f95771b = null;
        } else {
            this.f95771b = str;
        }
        if ((i10 & 4) == 0) {
            this.f95772c = null;
        } else {
            this.f95772c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f95773d = null;
        } else {
            this.f95773d = str3;
        }
        if ((i10 & 16) == 0) {
            this.f95774e = null;
        } else {
            this.f95774e = str4;
        }
        if ((i10 & 32) == 0) {
            this.f95775f = null;
        } else {
            this.f95775f = str5;
        }
        if ((i10 & 64) == 0) {
            this.f95776g = null;
        } else {
            this.f95776g = str6;
        }
    }

    public EventDetails(List<Item> list, String str, String str2, String str3, String str4, String str5, String str6) {
        this.f95770a = list;
        this.f95771b = str;
        this.f95772c = str2;
        this.f95773d = str3;
        this.f95774e = str4;
        this.f95775f = str5;
        this.f95776g = str6;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ EventDetails(java.util.List r7, java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, int r14, kotlin.jvm.internal.DefaultConstructorMarker r15) {
        /*
            r6 = this;
            r15 = r14 & 1
            r0 = 0
            if (r15 == 0) goto L_0x0007
            r15 = r0
            goto L_0x0008
        L_0x0007:
            r15 = r7
        L_0x0008:
            r7 = r14 & 2
            if (r7 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r8
        L_0x000f:
            r7 = r14 & 4
            if (r7 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r9
        L_0x0016:
            r7 = r14 & 8
            if (r7 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r10
        L_0x001d:
            r7 = r14 & 16
            if (r7 == 0) goto L_0x0023
            r4 = r0
            goto L_0x0024
        L_0x0023:
            r4 = r11
        L_0x0024:
            r7 = r14 & 32
            if (r7 == 0) goto L_0x002a
            r5 = r0
            goto L_0x002b
        L_0x002a:
            r5 = r12
        L_0x002b:
            r7 = r14 & 64
            if (r7 == 0) goto L_0x0031
            r14 = r0
            goto L_0x0032
        L_0x0031:
            r14 = r13
        L_0x0032:
            r7 = r6
            r8 = r15
            r9 = r1
            r10 = r2
            r11 = r3
            r12 = r4
            r13 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.episod.datalayer.network.models.EventDetails.<init>(java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
