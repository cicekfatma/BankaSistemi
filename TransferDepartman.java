public class TransferDepartman extends Departman{
    @Override
    protected boolean islemUygunMu(Islem islem){
        return islem.getTur().equals("Transfer");
    }
    @Override
    protected void islemIsle(Islem islem){
        System.out.println("Transfer  departmanında islem yapılıyor:"+ islem.getDetaylar());
    }
}
