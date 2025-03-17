package com.ingka.ikea.customermessage.implementation;

import com.optimizely.ab.config.FeatureVariable;
import fK.C17251d;
import java.util.Map;
import kK.C17514c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tp.C11979a;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\tB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/ingka/ikea/customermessage/implementation/a;", "Ltp/a;", "LkK/c;", "json", "<init>", "(LkK/c;)V", "", "", "data", "a", "(Ljava/util/Map;)Ljava/lang/String;", "LkK/c;", "getJson", "()LkK/c;", "b", "customermessage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements C11979a {

    /* renamed from: b  reason: collision with root package name */
    public static final C2123a f95453b = new C2123a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final C17514c f95454a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/ingka/ikea/customermessage/implementation/a$a;", "", "<init>", "()V", "customermessage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.ingka.ikea.customermessage.implementation.a$a  reason: collision with other inner class name */
    public static final class C2123a {
        public /* synthetic */ C2123a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2123a() {
        }
    }

    public a(C17514c cVar) {
        C17542s.j(cVar, FeatureVariable.JSON_TYPE);
        this.f95454a = cVar;
    }

    public String a(Map<String, String> map) {
        C17542s.j(map, "data");
        try {
            C17514c cVar = this.f95454a;
            C17251d serializer = MessageData.Companion.serializer();
            String str = map.get("content");
            if (str == null) {
                str = "";
            }
            return ((MessageData) cVar.c(serializer, str)).a().a();
        } catch (Exception unused) {
            return "";
        }
    }
}
