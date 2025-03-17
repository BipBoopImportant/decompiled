package DI;

import java.util.Collection;

/* renamed from: DI.b  reason: case insensitive filesystem */
public interface C15555b extends C15554a, C15534E {

    /* renamed from: DI.b$a */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean a() {
            return this != FAKE_OVERRIDE;
        }
    }

    C15555b C(C15566m mVar, C15535F f10, C15574u uVar, a aVar, boolean z10);

    void E0(Collection<? extends C15555b> collection);

    C15555b a();

    Collection<? extends C15555b> e();

    a h();
}
