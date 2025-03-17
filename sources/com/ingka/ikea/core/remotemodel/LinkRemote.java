package com.ingka.ikea.core.remotemodel;

import HJ.C15854t;
import com.ingka.ikea.core.model.Link;
import com.sugarcube.core.logger.DslKt;
import fK.p;
import iK.C17395d;
import jK.E0;
import jK.T0;
import jK.Y0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import pp.C11768b;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import qv.d;
import qv.e;

@p
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u0000 +2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002,#B9\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010$\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010$\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u001b¨\u0006-"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "Lpp/b;", "Lcom/ingka/ikea/core/model/Link;", "", "seen0", "", "uri", "type", "alias", "LjK/T0;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;LjK/T0;)V", "self", "LiK/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "LXH/N;", "d", "(Lcom/ingka/ikea/core/remotemodel/LinkRemote;LiK/d;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "b", "()Lcom/ingka/ikea/core/model/Link;", "newAlias", "c", "(Ljava/lang/String;)Lcom/ingka/ikea/core/model/Link;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getUri$annotations", "()V", "getType", "getType$annotations", "getAlias", "getAlias$annotations", "Companion", "$serializer", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LinkRemote implements C11768b<Link> {
    public static final a Companion = new a((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final String f95216a;

    /* renamed from: b  reason: collision with root package name */
    private final String f95217b;

    /* renamed from: c  reason: collision with root package name */
    private final String f95218c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/remotemodel/LinkRemote$a;", "", "<init>", "()V", "Lkotlinx/serialization/KSerializer;", "Lcom/ingka/ikea/core/remotemodel/LinkRemote;", "serializer", "()Lkotlinx/serialization/KSerializer;", "remote-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        private a() {
        }

        public final KSerializer<LinkRemote> serializer() {
            return LinkRemote$$serializer.INSTANCE;
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ LinkRemote(int i10, String str, String str2, String str3, T0 t02) {
        if (7 != (i10 & 7)) {
            E0.b(i10, 7, LinkRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f95216a = str;
        this.f95217b = str2;
        this.f95218c = str3;
    }

    public static final /* synthetic */ void d(LinkRemote linkRemote, C17395d dVar, SerialDescriptor serialDescriptor) {
        Y0 y02 = Y0.f144077a;
        dVar.B(serialDescriptor, 0, y02, linkRemote.f95216a);
        dVar.B(serialDescriptor, 1, y02, linkRemote.f95217b);
        dVar.B(serialDescriptor, 2, y02, linkRemote.f95218c);
    }

    public final String a() {
        return this.f95216a;
    }

    public Link b() {
        String str = this.f95217b;
        if (C17542s.e(str, "EXTERNAL")) {
            String str2 = this.f95216a;
            if (str2 != null) {
                return new Link.External(this.f95218c, str2);
            }
            throw new IllegalArgumentException("Required value was null.");
        } else if (C17542s.e(str, "DEEPLINK")) {
            String str3 = this.f95216a;
            if (str3 != null) {
                return new Link.Deeplink(this.f95218c, str3);
            }
            throw new IllegalArgumentException("Required value was null.");
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid type: " + this.f95217b);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                String str6 = str4;
                if (str5 == null) {
                    String name = LinkRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str7 = str5;
                bVar.a(eVar, str7, false, illegalArgumentException, str6);
                str4 = str6;
                str5 = str7;
            }
            return null;
        }
    }

    public final Link c(String str) {
        String str2 = this.f95217b;
        if (C17542s.e(str2, "EXTERNAL")) {
            String str3 = this.f95216a;
            if (str3 != null) {
                return new Link.External(str, str3);
            }
            throw new IllegalArgumentException("Required value was null.");
        } else if (C17542s.e(str2, "DEEPLINK")) {
            String str4 = this.f95216a;
            if (str4 != null) {
                return new Link.Deeplink(str, str4);
            }
            throw new IllegalArgumentException("Required value was null.");
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Invalid type: " + this.f95217b);
            e eVar = e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str5 = null;
            String str6 = null;
            for (C11819b bVar : arrayList) {
                if (str5 == null) {
                    String a10 = C11818a.a((String) null, illegalArgumentException);
                    if (a10 == null) {
                        break;
                    }
                    str5 = C11820c.a(a10);
                }
                String str7 = str5;
                if (str6 == null) {
                    String name = LinkRemote.class.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str6 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                }
                String str8 = str6;
                bVar.a(eVar, str8, false, illegalArgumentException, str7);
                str5 = str7;
                str6 = str8;
            }
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkRemote)) {
            return false;
        }
        LinkRemote linkRemote = (LinkRemote) obj;
        return C17542s.e(this.f95216a, linkRemote.f95216a) && C17542s.e(this.f95217b, linkRemote.f95217b) && C17542s.e(this.f95218c, linkRemote.f95218c);
    }

    public int hashCode() {
        String str = this.f95216a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f95217b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f95218c;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f95216a;
        String str2 = this.f95217b;
        String str3 = this.f95218c;
        return "LinkRemote(uri=" + str + ", type=" + str2 + ", alias=" + str3 + ")";
    }
}
