package com.ingka.ikea.browseandsearch.plp.datalayer.impl.model.remote;

import YH.C16877v;
import com.ingka.ikea.core.remotemodel.ImageRemote;
import com.ingka.ikea.core.remotemodel.ImageRemote$$serializer;
import fK.p;
import iK.C17395d;
import jK.C17451f;
import jK.C17457i;
import jK.E0;
import jK.T0;
import jK.X;
import jK.Y0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import vn.C12197b;

@p
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0001\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004:;<\u001fBm\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR(\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010 \u0012\u0004\b#\u0010$\u001a\u0004\b!\u0010\"R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010%\u0012\u0004\b(\u0010$\u001a\u0004\b&\u0010'R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010%\u0012\u0004\b*\u0010$\u001a\u0004\b)\u0010'R\"\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010%\u0012\u0004\b-\u0010$\u001a\u0004\b,\u0010'R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010$\u001a\u0004\b0\u00101R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010/\u0012\u0004\b5\u0010$\u001a\u0004\b4\u00101R(\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u0010 \u0012\u0004\b8\u0010$\u001a\u0004\b7\u0010\"¨\u0006="}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6;", "Lpp/b;", "Lvn/b;", "", "seen0", "", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$ValuesFilterRemote;", "types", "", "id", "name", "type", "", "enabled", "selected", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote;", "values", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lvn/b;", "a", "Ljava/util/List;", "getTypes", "()Ljava/util/List;", "getTypes$annotations", "()V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getId$annotations", "getName", "getName$annotations", "d", "getType", "getType$annotations", "e", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "getEnabled$annotations", "f", "getSelected", "getSelected$annotations", "g", "getValues", "getValues$annotations", "Companion", "FilterValueRemote", "ValuesFilterRemote", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FacetsRemoteV6 implements C11768b<C12197b> {
    public static final a Companion = new a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public static final KSerializer<Object>[] f93390h = {new C17451f(FacetsRemoteV6$ValuesFilterRemote$$serializer.INSTANCE), null, null, null, null, null, new C17451f(FacetsRemoteV6$FilterValueRemote$$serializer.INSTANCE)};

    /* renamed from: a  reason: collision with root package name */
    private final List<ValuesFilterRemote> f93391a;

    /* renamed from: b  reason: collision with root package name */
    private final String f93392b;

    /* renamed from: c  reason: collision with root package name */
    private final String f93393c;

    /* renamed from: d  reason: collision with root package name */
    private final String f93394d;

    /* renamed from: e  reason: collision with root package name */
    private final Boolean f93395e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f93396f;

    /* renamed from: g  reason: collision with root package name */
    private final List<FilterValueRemote> f93397g;

    @p
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b!\b\b\u0018\u0000 @2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002A\u001bBa\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010%\u0012\u0004\b'\u0010(\u001a\u0004\b&\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010%\u0012\u0004\b*\u0010(\u001a\u0004\b)\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b0\u00101\u0012\u0004\b4\u0010(\u001a\u0004\b2\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b5\u00101\u0012\u0004\b7\u0010(\u001a\u0004\b6\u00103R\"\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b8\u0010%\u0012\u0004\b:\u0010(\u001a\u0004\b9\u0010\u001eR\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\u0012\n\u0004\b;\u0010<\u0012\u0004\b?\u0010(\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote;", "Lpp/b;", "Lvn/b$b;", "", "seen0", "", "id", "name", "count", "", "enabled", "selected", "value", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "image", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/ingka/ikea/core/remotemodel/ImageRemote;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "b", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "a", "()Lvn/b$b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "c", "Ljava/lang/Integer;", "getCount", "()Ljava/lang/Integer;", "getCount$annotations", "d", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "getEnabled$annotations", "e", "getSelected", "getSelected$annotations", "f", "getValue", "getValue$annotations", "g", "Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage", "()Lcom/ingka/ikea/core/remotemodel/ImageRemote;", "getImage$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterValueRemote implements C11768b<C12197b.C2499b> {
        public static final a Companion = new a((DefaultConstructorMarker) null);

        /* renamed from: a  reason: collision with root package name */
        private final String f93398a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93399b;

        /* renamed from: c  reason: collision with root package name */
        private final Integer f93400c;

        /* renamed from: d  reason: collision with root package name */
        private final Boolean f93401d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f93402e;

        /* renamed from: f  reason: collision with root package name */
        private final String f93403f;

        /* renamed from: g  reason: collision with root package name */
        private final ImageRemote f93404g;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<FilterValueRemote> serializer() {
                return FacetsRemoteV6$FilterValueRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ FilterValueRemote(int i10, String str, String str2, Integer num, Boolean bool, Boolean bool2, String str3, ImageRemote imageRemote, T0 t02) {
            if (127 != (i10 & 127)) {
                E0.b(i10, 127, FacetsRemoteV6$FilterValueRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f93398a = str;
            this.f93399b = str2;
            this.f93400c = num;
            this.f93401d = bool;
            this.f93402e = bool2;
            this.f93403f = str3;
            this.f93404g = imageRemote;
        }

        public static final /* synthetic */ void b(FilterValueRemote filterValueRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, filterValueRemote.f93398a);
            dVar.B(serialDescriptor, 1, y02, filterValueRemote.f93399b);
            dVar.B(serialDescriptor, 2, X.f144073a, filterValueRemote.f93400c);
            C17457i iVar = C17457i.f144111a;
            dVar.B(serialDescriptor, 3, iVar, filterValueRemote.f93401d);
            dVar.B(serialDescriptor, 4, iVar, filterValueRemote.f93402e);
            dVar.B(serialDescriptor, 5, y02, filterValueRemote.f93403f);
            dVar.B(serialDescriptor, 6, ImageRemote$$serializer.INSTANCE, filterValueRemote.f93404g);
        }

        public C12197b.C2499b a() {
            String str = this.f93398a;
            if (str != null) {
                String str2 = this.f93399b;
                if (str2 != null) {
                    Integer num = this.f93400c;
                    if (num != null) {
                        int intValue = num.intValue();
                        Boolean bool = this.f93401d;
                        if (bool != null) {
                            boolean booleanValue = bool.booleanValue();
                            Boolean bool2 = this.f93402e;
                            if (bool2 != null) {
                                boolean booleanValue2 = bool2.booleanValue();
                                String str3 = this.f93403f;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                String str4 = str3;
                                ImageRemote imageRemote = this.f93404g;
                                return new C12197b.C2499b(str, str2, intValue, booleanValue, booleanValue2, str4, imageRemote != null ? imageRemote.c() : null);
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
            if (!(obj instanceof FilterValueRemote)) {
                return false;
            }
            FilterValueRemote filterValueRemote = (FilterValueRemote) obj;
            return C17542s.e(this.f93398a, filterValueRemote.f93398a) && C17542s.e(this.f93399b, filterValueRemote.f93399b) && C17542s.e(this.f93400c, filterValueRemote.f93400c) && C17542s.e(this.f93401d, filterValueRemote.f93401d) && C17542s.e(this.f93402e, filterValueRemote.f93402e) && C17542s.e(this.f93403f, filterValueRemote.f93403f) && C17542s.e(this.f93404g, filterValueRemote.f93404g);
        }

        public int hashCode() {
            String str = this.f93398a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93399b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f93400c;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            Boolean bool = this.f93401d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f93402e;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            String str3 = this.f93403f;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ImageRemote imageRemote = this.f93404g;
            if (imageRemote != null) {
                i10 = imageRemote.hashCode();
            }
            return hashCode6 + i10;
        }

        public String toString() {
            String str = this.f93398a;
            String str2 = this.f93399b;
            Integer num = this.f93400c;
            Boolean bool = this.f93401d;
            Boolean bool2 = this.f93402e;
            String str3 = this.f93403f;
            ImageRemote imageRemote = this.f93404g;
            return "FilterValueRemote(id=" + str + ", name=" + str2 + ", count=" + num + ", enabled=" + bool + ", selected=" + bool2 + ", value=" + str3 + ", image=" + imageRemote + ")";
        }
    }

    @p
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001c\b\b\u0018\u0000 ;2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002<%B]\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b(\u0010)\u001a\u0004\b'\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010&\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010\u001eR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010&\u0012\u0004\b-\u0010)\u001a\u0004\b,\u0010\u001eR\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010)\u001a\u0004\b0\u00101R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\u0012\n\u0004\b3\u0010/\u0012\u0004\b5\u0010)\u001a\u0004\b4\u00101R(\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b6\u00107\u0012\u0004\b:\u0010)\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$ValuesFilterRemote;", "Lpp/b;", "Lvn/b$c;", "", "seen0", "", "id", "name", "type", "", "enabled", "selected", "", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$FilterValueRemote;", "values", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "c", "(Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$ValuesFilterRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lvn/b$c;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getId", "getId$annotations", "()V", "getName", "getName$annotations", "getType", "getType$annotations", "d", "Ljava/lang/Boolean;", "getEnabled", "()Ljava/lang/Boolean;", "getEnabled$annotations", "e", "getSelected", "getSelected$annotations", "f", "Ljava/util/List;", "getValues", "()Ljava/util/List;", "getValues$annotations", "Companion", "$serializer", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ValuesFilterRemote implements C11768b<C12197b.c> {
        public static final a Companion = new a((DefaultConstructorMarker) null);
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public static final KSerializer<Object>[] f93405g = {null, null, null, null, null, new C17451f(FacetsRemoteV6$FilterValueRemote$$serializer.INSTANCE)};

        /* renamed from: a  reason: collision with root package name */
        private final String f93406a;

        /* renamed from: b  reason: collision with root package name */
        private final String f93407b;

        /* renamed from: c  reason: collision with root package name */
        private final String f93408c;

        /* renamed from: d  reason: collision with root package name */
        private final Boolean f93409d;

        /* renamed from: e  reason: collision with root package name */
        private final Boolean f93410e;

        /* renamed from: f  reason: collision with root package name */
        private final List<FilterValueRemote> f93411f;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$ValuesFilterRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$ValuesFilterRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a {
            private a() {
            }

            public final KSerializer<ValuesFilterRemote> serializer() {
                return FacetsRemoteV6$ValuesFilterRemote$$serializer.INSTANCE;
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ ValuesFilterRemote(int i10, String str, String str2, String str3, Boolean bool, Boolean bool2, List list, T0 t02) {
            if (63 != (i10 & 63)) {
                E0.b(i10, 63, FacetsRemoteV6$ValuesFilterRemote$$serializer.INSTANCE.getDescriptor());
            }
            this.f93406a = str;
            this.f93407b = str2;
            this.f93408c = str3;
            this.f93409d = bool;
            this.f93410e = bool2;
            this.f93411f = list;
        }

        public static final /* synthetic */ void c(ValuesFilterRemote valuesFilterRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
            KSerializer<Object>[] kSerializerArr = f93405g;
            Y0 y02 = Y0.f144077a;
            dVar.B(serialDescriptor, 0, y02, valuesFilterRemote.f93406a);
            dVar.B(serialDescriptor, 1, y02, valuesFilterRemote.f93407b);
            dVar.B(serialDescriptor, 2, y02, valuesFilterRemote.f93408c);
            C17457i iVar = C17457i.f144111a;
            dVar.B(serialDescriptor, 3, iVar, valuesFilterRemote.f93409d);
            dVar.B(serialDescriptor, 4, iVar, valuesFilterRemote.f93410e);
            dVar.B(serialDescriptor, 5, kSerializerArr[5], valuesFilterRemote.f93411f);
        }

        public C12197b.c b() {
            List list;
            String str = this.f93406a;
            if (str != null) {
                String str2 = this.f93407b;
                if (str2 != null) {
                    C12197b.a a10 = C12197b.a.Companion.a(this.f93408c);
                    Boolean bool = this.f93409d;
                    if (bool != null) {
                        boolean booleanValue = bool.booleanValue();
                        Boolean bool2 = this.f93410e;
                        if (bool2 != null) {
                            boolean booleanValue2 = bool2.booleanValue();
                            List<FilterValueRemote> list2 = this.f93411f;
                            if (list2 != null) {
                                Iterable<FilterValueRemote> iterable = list2;
                                list = new ArrayList(C16877v.y(iterable, 10));
                                for (FilterValueRemote a11 : iterable) {
                                    list.add(a11.a());
                                }
                            } else {
                                list = C16877v.n();
                            }
                            return new C12197b.c(str, str2, a10, booleanValue, booleanValue2, list);
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
            if (!(obj instanceof ValuesFilterRemote)) {
                return false;
            }
            ValuesFilterRemote valuesFilterRemote = (ValuesFilterRemote) obj;
            return C17542s.e(this.f93406a, valuesFilterRemote.f93406a) && C17542s.e(this.f93407b, valuesFilterRemote.f93407b) && C17542s.e(this.f93408c, valuesFilterRemote.f93408c) && C17542s.e(this.f93409d, valuesFilterRemote.f93409d) && C17542s.e(this.f93410e, valuesFilterRemote.f93410e) && C17542s.e(this.f93411f, valuesFilterRemote.f93411f);
        }

        public int hashCode() {
            String str = this.f93406a;
            int i10 = 0;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f93407b;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f93408c;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.f93409d;
            int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.f93410e;
            int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
            List<FilterValueRemote> list = this.f93411f;
            if (list != null) {
                i10 = list.hashCode();
            }
            return hashCode5 + i10;
        }

        public String toString() {
            String str = this.f93406a;
            String str2 = this.f93407b;
            String str3 = this.f93408c;
            Boolean bool = this.f93409d;
            Boolean bool2 = this.f93410e;
            List<FilterValueRemote> list = this.f93411f;
            return "ValuesFilterRemote(id=" + str + ", name=" + str2 + ", type=" + str3 + ", enabled=" + bool + ", selected=" + bool2 + ", values=" + list + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/browseandsearch/plp/datalayer/impl/model/remote/FacetsRemoteV6;", "serializer", "()Lkotlinx/serialization/KSerializer;", "datalayer-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<FacetsRemoteV6> serializer() {
            return FacetsRemoteV6$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ FacetsRemoteV6(int i10, List list, String str, String str2, String str3, Boolean bool, Boolean bool2, List list2, T0 t02) {
        if (127 != (i10 & 127)) {
            E0.b(i10, 127, FacetsRemoteV6$$serializer.INSTANCE.getDescriptor());
        }
        this.f93391a = list;
        this.f93392b = str;
        this.f93393c = str2;
        this.f93394d = str3;
        this.f93395e = bool;
        this.f93396f = bool2;
        this.f93397g = list2;
    }

    public static final /* synthetic */ void c(FacetsRemoteV6 facetsRemoteV6, C17395d dVar, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = f93390h;
        dVar.B(serialDescriptor, 0, kSerializerArr[0], facetsRemoteV6.f93391a);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 1, y02, facetsRemoteV6.f93392b);
        dVar.B(serialDescriptor, 2, y02, facetsRemoteV6.f93393c);
        dVar.B(serialDescriptor, 3, y02, facetsRemoteV6.f93394d);
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 4, iVar, facetsRemoteV6.f93395e);
        dVar.B(serialDescriptor, 5, iVar, facetsRemoteV6.f93396f);
        dVar.B(serialDescriptor, 6, kSerializerArr[6], facetsRemoteV6.f93397g);
    }

    public C12197b b() {
        List list;
        List list2;
        String str = this.f93392b;
        if (str != null) {
            String str2 = this.f93393c;
            if (str2 == null) {
                str2 = null;
            } else if (str2.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                String valueOf = String.valueOf(str2.charAt(0));
                C17542s.h(valueOf, "null cannot be cast to non-null type java.lang.String");
                String upperCase = valueOf.toUpperCase(Locale.ROOT);
                C17542s.i(upperCase, "toUpperCase(...)");
                sb2.append(upperCase);
                String substring = str2.substring(1);
                C17542s.i(substring, "substring(...)");
                sb2.append(substring);
                str2 = sb2.toString();
            }
            if (str2 != null) {
                C12197b.a a10 = C12197b.a.Companion.a(this.f93394d);
                Boolean bool = this.f93395e;
                if (bool != null) {
                    boolean booleanValue = bool.booleanValue();
                    Boolean bool2 = this.f93396f;
                    if (bool2 != null) {
                        boolean booleanValue2 = bool2.booleanValue();
                        List<ValuesFilterRemote> list3 = this.f93391a;
                        if (list3 != null) {
                            Iterable<ValuesFilterRemote> iterable = list3;
                            list = new ArrayList(C16877v.y(iterable, 10));
                            for (ValuesFilterRemote b10 : iterable) {
                                list.add(b10.b());
                            }
                        } else {
                            list = C16877v.n();
                        }
                        List<FilterValueRemote> list4 = this.f93397g;
                        if (list4 != null) {
                            Iterable<FilterValueRemote> iterable2 = list4;
                            list2 = new ArrayList(C16877v.y(iterable2, 10));
                            for (FilterValueRemote a11 : iterable2) {
                                list2.add(a11.a());
                            }
                        } else {
                            list2 = C16877v.n();
                        }
                        return new C12197b(str, str2, a10, booleanValue, booleanValue2, list, list2);
                    }
                    throw new IllegalArgumentException("Required value was null.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
