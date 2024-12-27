public class KrediDepartmani extends Departman{
    @Override
    protected boolean islemUygunMu(Islem islem){
        return islem.getTur().equals("Kredi");
    }
    @Override
    protected void islemIsle(Islem islem){
        System.out.println("Kredi  departmanında islem yapılıyor:"+ islem.getDetaylar());
    }
}
