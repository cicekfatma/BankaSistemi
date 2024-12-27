public abstract class Departman {
    protected Departman sonraki;
    public void setSonraki(Departman sonraki){
        this.sonraki=sonraki;
    }
    public void islemYap(Islem islem){
        if (islemUygunMu(islem)) {
            islemIsle(islem);
        }
        else if (sonraki!= null) {
            sonraki.islemYap(islem);
        }
    }
    protected abstract boolean islemUygunMu(Islem islem);
    protected abstract void islemIsle(Islem islem);

}
