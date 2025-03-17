package FH;

import EH.C15618c;
import EH.C15638w;
import FH.d;
import XH.C16807N;
import dI.C17164e;
import eI.C17187b;
import io.ktor.utils.io.j;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\u0018\u00002\u00020\u0001BP\u0012\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012R3\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0013\u0010\u001d\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"LFH/b;", "LFH/d$d;", "Lkotlin/Function2;", "Lio/ktor/utils/io/j;", "LdI/e;", "LXH/N;", "", "body", "LEH/c;", "contentType", "LEH/w;", "status", "", "contentLength", "<init>", "(LnI/p;LEH/c;LEH/w;Ljava/lang/Long;)V", "channel", "e", "(Lio/ktor/utils/io/j;LdI/e;)Ljava/lang/Object;", "a", "LnI/p;", "b", "LEH/c;", "()LEH/c;", "c", "LEH/w;", "d", "()LEH/w;", "Ljava/lang/Long;", "()Ljava/lang/Long;", "ktor-http"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: FH.b  reason: case insensitive filesystem */
public final class C15684b extends d.C3307d {

    /* renamed from: a  reason: collision with root package name */
    private final p<j, C17164e<? super C16807N>, Object> f134392a;

    /* renamed from: b  reason: collision with root package name */
    private final C15618c f134393b;

    /* renamed from: c  reason: collision with root package name */
    private final C15638w f134394c;

    /* renamed from: d  reason: collision with root package name */
    private final Long f134395d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15684b(p pVar, C15618c cVar, C15638w wVar, Long l10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(pVar, cVar, (i10 & 4) != 0 ? null : wVar, (i10 & 8) != 0 ? null : l10);
    }

    public Long a() {
        return this.f134395d;
    }

    public C15618c b() {
        return this.f134393b;
    }

    public C15638w d() {
        return this.f134394c;
    }

    public Object e(j jVar, C17164e<? super C16807N> eVar) {
        Object invoke = this.f134392a.invoke(jVar, eVar);
        return invoke == C17187b.f() ? invoke : C16807N.f139792a;
    }

    public C15684b(p<? super j, ? super C17164e<? super C16807N>, ? extends Object> pVar, C15618c cVar, C15638w wVar, Long l10) {
        C17542s.j(pVar, "body");
        this.f134392a = pVar;
        this.f134393b = cVar;
        this.f134394c = wVar;
        this.f134395d = l10;
    }
}
