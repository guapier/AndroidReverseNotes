package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;

public final class ab extends a {
    public String nax;
    public String nay;

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(111566);
        int f;
        if (i == 0) {
            e.a.a.c.a aVar = (e.a.a.c.a) objArr[0];
            if (this.nax != null) {
                aVar.e(1, this.nax);
            }
            if (this.nay != null) {
                aVar.e(2, this.nay);
            }
            AppMethodBeat.o(111566);
            return 0;
        } else if (i == 1) {
            if (this.nax != null) {
                f = e.a.a.b.b.a.f(1, this.nax) + 0;
            } else {
                f = 0;
            }
            if (this.nay != null) {
                f += e.a.a.b.b.a.f(2, this.nay);
            }
            AppMethodBeat.o(111566);
            return f;
        } else if (i == 2) {
            e.a.a.a.a aVar2 = new e.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (f = a.getNextFieldNumber(aVar2); f > 0; f = a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, f)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(111566);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            ab abVar = (ab) objArr[1];
            switch (((Integer) objArr[2]).intValue()) {
                case 1:
                    abVar.nax = aVar3.BTU.readString();
                    AppMethodBeat.o(111566);
                    return 0;
                case 2:
                    abVar.nay = aVar3.BTU.readString();
                    AppMethodBeat.o(111566);
                    return 0;
                default:
                    AppMethodBeat.o(111566);
                    return -1;
            }
        } else {
            AppMethodBeat.o(111566);
            return -1;
        }
    }
}
