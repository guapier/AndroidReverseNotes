package com.tencent.mm.plugin.voip.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voip.a.a;

public final class n {
    long beginTime = 0;
    String gfj;
    int sQA;
    int sQB;
    int sQC;
    int sQD;
    int sQE;
    public long sQF;
    long sQG;
    long sQH;
    long sQI;
    long sQJ;
    public long sQK;
    long sQL;
    long sQM;
    long sQN;
    long sQO;
    public long sQP = 0;
    public long sQQ = 0;
    public int sQR = 0;
    public int sQe;
    public int sQf;
    public int sQg;
    public int sQh;
    byte sQi;
    byte sQj;
    byte sQk;
    byte sQl;
    byte sQm;
    byte sQn;
    byte sQo;
    int sQp;
    public int sQq;
    public int sQr;
    public int sQs;
    public int sQt;
    public int sQu;
    public int sQv;
    public int sQw;
    int sQx;
    int sQy;
    int sQz;

    public n() {
        AppMethodBeat.i(4448);
        cJf();
        AppMethodBeat.o(4448);
    }

    public final void cJa() {
        AppMethodBeat.i(4449);
        if (this.beginTime == 0) {
            this.sQh = 0;
        } else {
            this.sQh = (int) (System.currentTimeMillis() - this.beginTime);
        }
        a.Logi("MicroMsg.VoipDailReport", "devin:beginTime:" + this.beginTime + ", CurrentTime: " + System.currentTimeMillis());
        a.Logi("MicroMsg.VoipDailReport", "devin:endDial:" + this.sQh);
        AppMethodBeat.o(4449);
    }

    public final void cJb() {
        AppMethodBeat.i(4450);
        if (0 == this.sQG) {
            this.sQG = System.currentTimeMillis();
            a.Logi("MicroMsg.VoipDailReport", "accept received timestamp:" + this.sQG);
        }
        AppMethodBeat.o(4450);
    }

    public final void cJc() {
        AppMethodBeat.i(4451);
        if (0 == this.sQH) {
            this.sQH = System.currentTimeMillis();
            a.Logi("MicroMsg.VoipDailReport", "sync accept received timestamp:" + this.sQH);
        }
        AppMethodBeat.o(4451);
    }

    public final void cJd() {
        AppMethodBeat.i(4452);
        this.sQL = System.currentTimeMillis();
        a.Logd("MicroMsg.VoipDailReport", "devin:acceptCallTime:" + this.sQL);
        AppMethodBeat.o(4452);
    }

    public final void cJe() {
        AppMethodBeat.i(4453);
        if (this.sQK == 0) {
            this.sQA = 0;
        } else {
            this.sQA = (int) (System.currentTimeMillis() - this.sQK);
        }
        a.Logi("MicroMsg.VoipDailReport", "devin:answerInvite current:" + System.currentTimeMillis());
        a.Logi("MicroMsg.VoipDailReport", "devin:answerInvite:" + this.sQA);
        AppMethodBeat.o(4453);
    }

    public final void reset() {
        this.beginTime = 0;
        this.sQe = 0;
        this.sQf = 0;
        this.sQg = 0;
        this.sQh = 0;
        this.sQi = (byte) 0;
        this.sQj = (byte) 0;
        this.sQk = (byte) 0;
        this.sQl = (byte) 0;
        this.sQm = (byte) 0;
        this.sQn = (byte) 0;
        this.sQo = (byte) 0;
        this.sQp = 0;
    }

    public final void cJf() {
        this.sQF = 0;
        this.sQJ = 0;
        this.sQK = 0;
        this.sQL = 0;
        this.sQM = 0;
        this.sQN = 0;
        this.sQG = 0;
        this.sQH = 0;
        this.sQI = 0;
        this.sQq = 0;
        this.sQr = 0;
        this.sQs = 0;
        this.sQt = 0;
        this.sQu = 0;
        this.sQv = 0;
        this.sQw = 0;
        this.sQx = 0;
        this.sQy = 0;
        this.sQz = 0;
        this.sQA = 0;
        this.sQB = 0;
        this.sQC = 0;
        this.sQD = 0;
        this.sQE = 0;
    }

    public final String cJg() {
        AppMethodBeat.i(4454);
        String str = "," + this.sQo;
        AppMethodBeat.o(4454);
        return str;
    }
}
