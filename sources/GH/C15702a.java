package GH;

import EH.C15618c;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import nI.C17642l;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J?\u0010\n\u001a\u00020\b\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LGH/a;", "", "LGH/c;", "T", "LEH/c;", "contentType", "converter", "Lkotlin/Function1;", "LXH/N;", "configuration", "a", "(LEH/c;LGH/c;LnI/l;)V", "ktor-serialization"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: GH.a  reason: case insensitive filesystem */
public interface C15702a {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: GH.a$a  reason: collision with other inner class name */
    public static final class C3310a {

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LGH/c;", "T", "LXH/N;", "a", "(LGH/c;)V"}, k = 3, mv = {1, 8, 0})
        /* renamed from: GH.a$a$a  reason: collision with other inner class name */
        static final class C3311a extends C17544u implements C17642l {

            /* renamed from: c  reason: collision with root package name */
            public static final C3311a f134458c = new C3311a();

            C3311a() {
                super(1);
            }

            public final void a(C15704c cVar) {
                C17542s.j(cVar, "$this$null");
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C15704c) obj);
                return C16807N.f139792a;
            }
        }

        public static /* synthetic */ void a(C15702a aVar, C15618c cVar, C15704c cVar2, C17642l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 4) != 0) {
                    lVar = C3311a.f134458c;
                }
                aVar.a(cVar, cVar2, lVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
        }
    }

    <T extends C15704c> void a(C15618c cVar, T t10, C17642l<? super T, C16807N> lVar);
}
