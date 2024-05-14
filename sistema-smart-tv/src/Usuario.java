
public class Usuario {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
       SmartTv smartTv = new SmartTv();


       SmartTv.diminuirVolume();
       SmartTv.diminuirVolume();
       SmartTv.diminuirVolume();
       SmartTv.aumentarVolume();

       System.out.println("Canal Atual :" + smartTv.canal);
       smartTv.mudarCanal(13);
       System.out.println("Volume Atual : "+ smartTv.volume);
       
       System.out.println("TV ligada ?" + smartTv.ligada);
       
       System.out.println("Volume Atual : "+ smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> TV ligada ?" + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV ligada ?" + smartTv.ligada);
    }
}
