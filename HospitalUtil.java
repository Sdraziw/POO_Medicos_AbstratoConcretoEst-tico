import javax.swing.JOptionPane;

public class HospitalUtil {

    public static int calculaPlantaoEmMinutos(int horas) {
        if (horas < 0) {
            throw new IllegalArgumentException("Horas não podem ser negativas.");
        }
        int minutos = horas * 60;
        JOptionPane.showMessageDialog(null, horas + " horas de plantão equivalem a " + minutos + " minutos.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        return minutos;
    }

    public static int calculaMaximoPlantoes(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("Dias não podem ser negativos.");
        }
        int maxPlantoes = dias * 10; // 10 plantões permitidos por dia
        JOptionPane.showMessageDialog(null, "Número máximo de plantões em " + dias + " dias: " + maxPlantoes, "Informação", JOptionPane.INFORMATION_MESSAGE);
        return maxPlantoes;
    }
}