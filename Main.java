public class Main {
    public static void main(String[] args) throws ExcecaoDataInvalida {
        try{
            Data padrao = new Data();
            System.out.println("Data padrão: "+padrao.imprimirData());
            Data aniversario = new Data(21, 9, 2002);
            System.out.println("Data aniversario: "+aniversario.imprimirData());
            //Data diaErrado = new Data(32, 2, 2022);
            //System.out.println("Data dia errado: "+diaErrado.imprimirData());
            //Data mesErrado = new Data(31, 14, 2022);
            //System.out.println("Data mês errado: "+mesErrado.imprimirData());
            Data anoErrado = new Data(23, 5, 33);
            System.out.println("Data ano errado: "+anoErrado.imprimirData());

        } catch(ExcecaoDataInvalida e){
            System.out.println(e.getMessage());
        }
    }
}