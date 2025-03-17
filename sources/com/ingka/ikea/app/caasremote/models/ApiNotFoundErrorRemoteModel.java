package com.ingka.ikea.app.caasremote.models;

import XH.C16814e;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.E0;
import jK.T0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\b\u0018\u0000 42\u00020\u0001:\u00025 B[\b\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J(\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014HÁ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\b\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001aR \u0010\t\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b)\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001aR \u0010\u000b\u001a\u00020\n8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010%\u001a\u0004\b.\u0010/R \u0010\f\u001a\u00020\u00078\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010&\u0012\u0004\b3\u0010%\u001a\u0004\b2\u0010\u001a¨\u00066"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ApiNotFoundErrorRemoteModel;", "", "", "seen1", "", "Lcom/ingka/ikea/app/caasremote/models/ApiErrorRemoteModel;", "errors", "", "reference", "title", "", "success", "type", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/app/caasremote/models/ApiNotFoundErrorRemoteModel;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getErrors", "()Ljava/util/List;", "getErrors$annotations", "()V", "Ljava/lang/String;", "getReference", "getReference$annotations", "c", "getTitle", "getTitle$annotations", "d", "Z", "getSuccess", "()Z", "getSuccess$annotations", "e", "getType", "getType$annotations", "Companion", "$serializer", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ApiNotFoundErrorRemoteModel {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final KSerializer<Object>[] f71056f = {new C17451f(ApiErrorRemoteModel$$serializer.INSTANCE), null, null, null, null};

    /* renamed from: a  reason: collision with root package name */
    private final List<ApiErrorRemoteModel> f71057a;

    /* renamed from: b  reason: collision with root package name */
    private final String f71058b;

    /* renamed from: c  reason: collision with root package name */
    private final String f71059c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f71060d;

    /* renamed from: e  reason: collision with root package name */
    private final String f71061e;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/app/caasremote/models/ApiNotFoundErrorRemoteModel$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/app/caasremote/models/ApiNotFoundErrorRemoteModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "caasremote"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ApiNotFoundErrorRemoteModel> serializer() {
            return ApiNotFoundErrorRemoteModel$$serializer.INSTANCE;
        }

        private a() {
        }
    }

    @C16814e
    public /* synthetic */ ApiNotFoundErrorRemoteModel(int i10, List list, String str, String str2, boolean z10, String str3, T0 t02) {
        if (31 != (i10 & 31)) {
            E0.b(i10, 31, ApiNotFoundErrorRemoteModel$$serializer.INSTANCE.getDescriptor());
        }
        this.f71057a = list;
        this.f71058b = str;
        this.f71059c = str2;
        this.f71060d = z10;
        this.f71061e = str3;
    }

    public static final /* synthetic */ void b(ApiNotFoundErrorRemoteModel apiNotFoundErrorRemoteModel, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.i(serialDescriptor, 0, f71056f[0], apiNotFoundErrorRemoteModel.f71057a);
        dVar.y(serialDescriptor, 1, apiNotFoundErrorRemoteModel.f71058b);
        dVar.y(serialDescriptor, 2, apiNotFoundErrorRemoteModel.f71059c);
        dVar.x(serialDescriptor, 3, apiNotFoundErrorRemoteModel.f71060d);
        dVar.y(serialDescriptor, 4, apiNotFoundErrorRemoteModel.f71061e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiNotFoundErrorRemoteModel)) {
            return false;
        }
        ApiNotFoundErrorRemoteModel apiNotFoundErrorRemoteModel = (ApiNotFoundErrorRemoteModel) obj;
        return C17542s.e(this.f71057a, apiNotFoundErrorRemoteModel.f71057a) && C17542s.e(this.f71058b, apiNotFoundErrorRemoteModel.f71058b) && C17542s.e(this.f71059c, apiNotFoundErrorRemoteModel.f71059c) && this.f71060d == apiNotFoundErrorRemoteModel.f71060d && C17542s.e(this.f71061e, apiNotFoundErrorRemoteModel.f71061e);
    }

    public int hashCode() {
        return (((((((this.f71057a.hashCode() * 31) + this.f71058b.hashCode()) * 31) + this.f71059c.hashCode()) * 31) + Boolean.hashCode(this.f71060d)) * 31) + this.f71061e.hashCode();
    }

    public String toString() {
        List<ApiErrorRemoteModel> list = this.f71057a;
        String str = this.f71058b;
        String str2 = this.f71059c;
        boolean z10 = this.f71060d;
        String str3 = this.f71061e;
        return "ApiNotFoundErrorRemoteModel(errors=" + list + ", reference=" + str + ", title=" + str2 + ", success=" + z10 + ", type=" + str3 + ")";
    }
}
