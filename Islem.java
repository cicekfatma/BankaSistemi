public class Islem {
    private IslemTuru islemTuru;
    private String detaylar;

    public Islem(String tur,String detaylar){
        this.islemTuru= new IslemTuru(tur);
        this.detaylar=detaylar;
    }
    public IslemTuru getTur(){
        return islemTuru;

    }
    public String getDetaylar(){
        return detaylar;
    }
    public void kabulEt(IZiyaretci ziyaretci){
        ziyaretci.ziyaretEt(this);
    }
}
