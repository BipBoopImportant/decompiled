package com.sugarcube.decorate_engine;

import XH.C16807N;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.C17544u;
import nI.C17631a;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LXH/N;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class DecorateEngine$startLogPipeLoop$1 extends C17544u implements C17631a<C16807N> {
    final /* synthetic */ File $pipeFile;
    final /* synthetic */ DecorateEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    DecorateEngine$startLogPipeLoop$1(DecorateEngine decorateEngine, File file) {
        super(0);
        this.this$0 = decorateEngine;
        this.$pipeFile = file;
    }

    public final void invoke() {
        this.this$0.logPipeLoop(this.$pipeFile);
    }
}
