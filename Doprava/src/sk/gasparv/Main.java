package sk.gasparv;

public class Main {

    public static void main(String[] args) {
	Lietadlo noveLietadlo = new Lietadlo();
	Auto noveAuto = new Auto();
	Vlak novyVlak = new Vlak();

	//Lieatdlo
	noveLietadlo.dopredu();
	noveLietadlo.zrychli();
	noveLietadlo.zrychli();
	int hodnotaRychlosti = noveLietadlo.getAktualnaRychlost();
	while(hodnotaRychlosti<100){
		hodnotaRychlosti = noveLietadlo.getAktualnaRychlost();
		noveLietadlo.zrychli();
	}
	//Vlak
	novyVlak.dopredu();
	novyVlak.zrychli();
    }
}
