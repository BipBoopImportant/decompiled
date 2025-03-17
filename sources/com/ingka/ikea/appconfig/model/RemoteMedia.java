package com.ingka.ikea.appconfig.model;

import fI.C17220a;
import fI.C17221b;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.J;
import jK.T0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 '2\u00020\u0001:\u0003\"(\u001fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b\"\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006)"}, d2 = {"Lcom/ingka/ikea/appconfig/model/RemoteMedia;", "", "", "key", "url", "altText", "Lcom/ingka/ikea/appconfig/model/RemoteMedia$b;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/RemoteMedia$b;)V", "", "seen0", "LjK/T0;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/ingka/ikea/appconfig/model/RemoteMedia$b;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "f", "(Lcom/ingka/ikea/appconfig/model/RemoteMedia;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "e", "d", "Lcom/ingka/ikea/appconfig/model/RemoteMedia$b;", "()Lcom/ingka/ikea/appconfig/model/RemoteMedia$b;", "Companion", "$serializer", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RemoteMedia {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final KSerializer<Object>[] f93017e = {null, null, null, J.b("com.ingka.ikea.appconfig.model.RemoteMedia.Type", b.values())};

    /* renamed from: a  reason: collision with root package name */
    private final String f93018a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93019b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93020c;

    /* renamed from: d  reason: collision with root package name */
    private final b f93021d;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/appconfig/model/RemoteMedia$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/appconfig/model/RemoteMedia;", "serializer", "()Lkotlinx/serialization/KSerializer;", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<RemoteMedia> serializer() {
            return RemoteMedia$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/appconfig/model/RemoteMedia$b;", "", "", "serializedValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "IMAGE", "VIDEO", "appconfig_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum b {
        IMAGE("image"),
        VIDEO("video");
        
        private final String serializedValue;

        static {
            b[] a10;
            $ENTRIES = C17221b.a(a10);
        }

        private b(String str) {
            this.serializedValue = str;
        }

        public static C17220a<b> b() {
            return $ENTRIES;
        }

        public final String j() {
            return this.serializedValue;
        }
    }

    public /* synthetic */ RemoteMedia(int i10, String str, String str2, String str3, b bVar, T0 t02) {
        if (15 != (i10 & 15)) {
            E0.b(i10, 15, RemoteMedia$$serializer.INSTANCE.getDescriptor());
        }
        this.f93018a = str;
        this.f93019b = str2;
        this.f93020c = str3;
        this.f93021d = bVar;
    }

    public static final /* synthetic */ void f(RemoteMedia remoteMedia, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93017e;
        dVar.y(serialDescriptor, 0, remoteMedia.f93018a);
        dVar.y(serialDescriptor, 1, remoteMedia.f93019b);
        dVar.y(serialDescriptor, 2, remoteMedia.f93020c);
        dVar.i(serialDescriptor, 3, kSerializerArr[3], remoteMedia.f93021d);
    }

    public final String b() {
        return this.f93020c;
    }

    public final String c() {
        return this.f93018a;
    }

    public final b d() {
        return this.f93021d;
    }

    public final String e() {
        return this.f93019b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteMedia)) {
            return false;
        }
        RemoteMedia remoteMedia = (RemoteMedia) obj;
        return C17542s.e(this.f93018a, remoteMedia.f93018a) && C17542s.e(this.f93019b, remoteMedia.f93019b) && C17542s.e(this.f93020c, remoteMedia.f93020c) && this.f93021d == remoteMedia.f93021d;
    }

    public int hashCode() {
        return (((((this.f93018a.hashCode() * 31) + this.f93019b.hashCode()) * 31) + this.f93020c.hashCode()) * 31) + this.f93021d.hashCode();
    }

    public String toString() {
        String str = this.f93018a;
        String str2 = this.f93019b;
        String str3 = this.f93020c;
        b bVar = this.f93021d;
        return "RemoteMedia(key=" + str + ", url=" + str2 + ", altText=" + str3 + ", type=" + bVar + ")";
    }

    public RemoteMedia(String str, String str2, String str3, b bVar) {
        C17542s.j(str, "key");
        C17542s.j(str2, "url");
        C17542s.j(str3, "altText");
        C17542s.j(bVar, "type");
        this.f93018a = str;
        this.f93019b = str2;
        this.f93020c = str3;
        this.f93021d = bVar;
    }
}
