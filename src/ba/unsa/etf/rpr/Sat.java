package ba.unsa.etf.rpr;
public  class Sat{
    private int sati,minute,sekunde;
    public Sat(int sati,int minute, int sekunde){
        Postavi( sati,  minute,  sekunde);
    }
    public  void Postavi(int h, int m, int s){
        this.sati=h;
        this.minute=m;
        this.sekunde=s;
    }
    public void Sljedeci(){
        this.sekunde=this.sekunde+1;
        if(this.sekunde ==60){
            this.sekunde=0;
            this.minute=this.minute+1;
        }
        if(this.minute==60){
            this.minute=0;
            this.sati=this.sati+1;
        }
        if(this.sati==24){
            this.sati=0;
        }
    }
    public void Prethodni(){
        this.sekunde=this.sekunde-1;
        if(this.sekunde==-1){
            this.sekunde=this.sekunde+60;
            this.minute=this.minute-1;
        }
        if(this.minute==-1){
            this.minute=this.minute+60;
            this.sati=this.sati-1;
        }
        if(this.sati==-1){
            this.sati=23;
        }
    }
    public void PomjeriZa(int pomak){
        if(pomak>0){
            for(int i=0;i<pomak;i++){
                Sljedeci();
            }
        }
        else{
            for(int i=0;i<-pomak;i++) {
                Prethodni();
            }
        }
    }
    public int DajSate(){
        return sati;
    }
    public int DajMinute(){
        return minute;
    }
    public int DajSekunde(){
        return sekunde;
    }
    public void Ispisi(){
        System.out.println(sati + ":" + minute + ":" + sekunde);
    }

}
