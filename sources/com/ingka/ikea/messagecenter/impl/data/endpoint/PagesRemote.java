package com.ingka.ikea.messagecenter.impl.data.endpoint;

import fK.p;
import iK.C17395d;
import jK.C17457i;
import jK.C17458i0;
import jK.E0;
import jK.T0;
import jK.Y0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@p
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\b\u0018\u0000 D2\u00020\u0001:\u0002E&B\u0001\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\f2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b)\u0010*\u001a\u0004\b(\u0010 R \u0010\u0006\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b+\u0010'\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010 R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b.\u0010'\u0012\u0004\b0\u0010*\u001a\u0004\b/\u0010 R \u0010\b\u001a\u00020\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b1\u0010'\u0012\u0004\b3\u0010*\u001a\u0004\b2\u0010 R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b4\u0010'\u0012\u0004\b5\u0010*\u001a\u0004\b&\u0010 R\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b/\u0010'\u0012\u0004\b6\u0010*\u001a\u0004\b+\u0010 R\"\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b8\u0010*\u001a\u0004\b7\u0010 R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b7\u00109\u0012\u0004\b<\u0010*\u001a\u0004\b:\u0010;R\"\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b=\u0010>\u0012\u0004\b@\u0010*\u001a\u0004\b=\u0010?R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\u0012\n\u0004\b,\u0010>\u0012\u0004\bA\u0010*\u001a\u0004\b1\u0010?R\"\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b2\u00109\u0012\u0004\bB\u0010*\u001a\u0004\b.\u0010;R\"\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006X\u0004¢\u0006\u0012\n\u0004\b\u001d\u00109\u0012\u0004\bC\u0010*\u001a\u0004\b4\u0010;¨\u0006F"}, d2 = {"Lcom/ingka/ikea/messagecenter/impl/data/endpoint/PagesRemote;", "", "", "seen0", "", "id", "text", "icon", "type", "allowedPaths", "blockedPaths", "linkTo", "", "linkNewWindow", "", "startMs", "endMs", "childpages", "hideOnPip", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "l", "(Lcom/ingka/ikea/messagecenter/impl/data/endpoint/PagesRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "getId$annotations", "()V", "b", "j", "getText$annotations", "c", "f", "getIcon$annotations", "d", "k", "getType$annotations", "e", "getAllowedPaths$annotations", "getBlockedPaths$annotations", "h", "getLinkTo$annotations", "Ljava/lang/Boolean;", "getLinkNewWindow", "()Ljava/lang/Boolean;", "getLinkNewWindow$annotations", "i", "Ljava/lang/Long;", "()Ljava/lang/Long;", "getStartMs$annotations", "getEndMs$annotations", "getChildpages$annotations", "getHideOnPip$annotations", "Companion", "$serializer", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PagesRemote {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f72324a;

    /* renamed from: b  reason: collision with root package name */
    private final String f72325b;

    /* renamed from: c  reason: collision with root package name */
    private final String f72326c;

    /* renamed from: d  reason: collision with root package name */
    private final String f72327d;

    /* renamed from: e  reason: collision with root package name */
    private final String f72328e;

    /* renamed from: f  reason: collision with root package name */
    private final String f72329f;

    /* renamed from: g  reason: collision with root package name */
    private final String f72330g;

    /* renamed from: h  reason: collision with root package name */
    private final Boolean f72331h;

    /* renamed from: i  reason: collision with root package name */
    private final Long f72332i;

    /* renamed from: j  reason: collision with root package name */
    private final Long f72333j;

    /* renamed from: k  reason: collision with root package name */
    private final Boolean f72334k;

    /* renamed from: l  reason: collision with root package name */
    private final Boolean f72335l;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/messagecenter/impl/data/endpoint/PagesRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/messagecenter/impl/data/endpoint/PagesRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "messagecenter-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<PagesRemote> serializer() {
            return PagesRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ PagesRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, Boolean bool, Long l10, Long l11, Boolean bool2, Boolean bool3, T0 t02) {
        if (4095 != (i10 & 4095)) {
            E0.b(i10, 4095, PagesRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f72324a = str;
        this.f72325b = str2;
        this.f72326c = str3;
        this.f72327d = str4;
        this.f72328e = str5;
        this.f72329f = str6;
        this.f72330g = str7;
        this.f72331h = bool;
        this.f72332i = l10;
        this.f72333j = l11;
        this.f72334k = bool2;
        this.f72335l = bool3;
    }

    public static final /* synthetic */ void l(PagesRemote pagesRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        dVar.y(serialDescriptor, 0, pagesRemote.f72324a);
        dVar.y(serialDescriptor, 1, pagesRemote.f72325b);
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 2, y02, pagesRemote.f72326c);
        dVar.y(serialDescriptor, 3, pagesRemote.f72327d);
        dVar.B(serialDescriptor, 4, y02, pagesRemote.f72328e);
        dVar.B(serialDescriptor, 5, y02, pagesRemote.f72329f);
        dVar.B(serialDescriptor, 6, y02, pagesRemote.f72330g);
        C17457i iVar = C17457i.f144111a;
        dVar.B(serialDescriptor, 7, iVar, pagesRemote.f72331h);
        C17458i0 i0Var = C17458i0.f144113a;
        dVar.B(serialDescriptor, 8, i0Var, pagesRemote.f72332i);
        dVar.B(serialDescriptor, 9, i0Var, pagesRemote.f72333j);
        dVar.B(serialDescriptor, 10, iVar, pagesRemote.f72334k);
        dVar.B(serialDescriptor, 11, iVar, pagesRemote.f72335l);
    }

    public final String a() {
        return this.f72328e;
    }

    public final String b() {
        return this.f72329f;
    }

    public final Boolean c() {
        return this.f72334k;
    }

    public final Long d() {
        return this.f72333j;
    }

    public final Boolean e() {
        return this.f72335l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PagesRemote)) {
            return false;
        }
        PagesRemote pagesRemote = (PagesRemote) obj;
        return C17542s.e(this.f72324a, pagesRemote.f72324a) && C17542s.e(this.f72325b, pagesRemote.f72325b) && C17542s.e(this.f72326c, pagesRemote.f72326c) && C17542s.e(this.f72327d, pagesRemote.f72327d) && C17542s.e(this.f72328e, pagesRemote.f72328e) && C17542s.e(this.f72329f, pagesRemote.f72329f) && C17542s.e(this.f72330g, pagesRemote.f72330g) && C17542s.e(this.f72331h, pagesRemote.f72331h) && C17542s.e(this.f72332i, pagesRemote.f72332i) && C17542s.e(this.f72333j, pagesRemote.f72333j) && C17542s.e(this.f72334k, pagesRemote.f72334k) && C17542s.e(this.f72335l, pagesRemote.f72335l);
    }

    public final String f() {
        return this.f72326c;
    }

    public final String g() {
        return this.f72324a;
    }

    public final String h() {
        return this.f72330g;
    }

    public int hashCode() {
        int hashCode = ((this.f72324a.hashCode() * 31) + this.f72325b.hashCode()) * 31;
        String str = this.f72326c;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f72327d.hashCode()) * 31;
        String str2 = this.f72328e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f72329f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f72330g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool = this.f72331h;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Long l10 = this.f72332i;
        int hashCode7 = (hashCode6 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.f72333j;
        int hashCode8 = (hashCode7 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool2 = this.f72334k;
        int hashCode9 = (hashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f72335l;
        if (bool3 != null) {
            i10 = bool3.hashCode();
        }
        return hashCode9 + i10;
    }

    public final Long i() {
        return this.f72332i;
    }

    public final String j() {
        return this.f72325b;
    }

    public final String k() {
        return this.f72327d;
    }

    public String toString() {
        String str = this.f72324a;
        String str2 = this.f72325b;
        String str3 = this.f72326c;
        String str4 = this.f72327d;
        String str5 = this.f72328e;
        String str6 = this.f72329f;
        String str7 = this.f72330g;
        Boolean bool = this.f72331h;
        Long l10 = this.f72332i;
        Long l11 = this.f72333j;
        Boolean bool2 = this.f72334k;
        Boolean bool3 = this.f72335l;
        return "PagesRemote(id=" + str + ", text=" + str2 + ", icon=" + str3 + ", type=" + str4 + ", allowedPaths=" + str5 + ", blockedPaths=" + str6 + ", linkTo=" + str7 + ", linkNewWindow=" + bool + ", startMs=" + l10 + ", endMs=" + l11 + ", childpages=" + bool2 + ", hideOnPip=" + bool3 + ")";
    }
}
