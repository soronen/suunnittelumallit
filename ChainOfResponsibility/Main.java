package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Toimitusjohtaja toimitusjohtaja = new Toimitusjohtaja(null);
        Yksikköpäällikkö yksikköPäällikkö = new Yksikköpäällikkö(toimitusjohtaja);
        Lähimies lähimies = new Lähimies(yksikköPäällikkö);

        Työntekijä työntekijä = new Työntekijä(lähimies, 2400.0);

        työntekijä.pyydäPalkankorotusta(0.01);
        työntekijä.pyydäPalkankorotusta(0.03);
        työntekijä.pyydäPalkankorotusta(0.06);


    }
}
