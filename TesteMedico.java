import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

public class TesteMedico extends JFrame {

    private final Medico medico;

    public TesteMedico() {
        medico = new Medico();
        initComponents();
    }

    private void initComponents() {
        setTitle("Menu");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        JButton cadastrarButton = new JButton("Cadastrar Médico");
        cadastrarButton.addActionListener(e -> cadastrarMedico());
        panel.add(cadastrarButton);

        JButton mostrarButton = new JButton("Mostrar Médico");
        mostrarButton.addActionListener(e -> mostrarMedico());
        panel.add(mostrarButton);

        JButton excluirButton = new JButton("Excluir Médico");
        excluirButton.addActionListener(e -> excluirMedico());
        panel.add(excluirButton);

        JButton calcularPlantaoButton = new JButton("Calcular Plantão em Minutos");
        calcularPlantaoButton.addActionListener(e -> calcularPlantao());
        panel.add(calcularPlantaoButton);

        JButton calcularMaximoPlantoesButton = new JButton("Calcular Máximo de Plantões");
        calcularMaximoPlantoesButton.addActionListener(e -> calcularMaximoPlantoes());
        panel.add(calcularMaximoPlantoesButton);

        JButton sairButton = new JButton("Sair");
        sairButton.addActionListener(e -> System.exit(0));
        panel.add(sairButton);

        getContentPane().add(panel);
        pack();
    }

    private void cadastrarMedico() {
        try {
            JPanel panel = new JPanel(new GridLayout(0, 2));
            JTextField nomeField = new JTextField();
            JComboBox<String> sexoField = new JComboBox<>(new String[]{"Masculino", "Feminino"});
            JTextField identidadeField = new JTextField();
            JTextField enderecoField = new JTextField();
            JComboBox<String> especialidadeField = new JComboBox<>(new String[]{"Cardiologia", "Dermatologia", "Neurologia"});
            JSpinner numConsultasField = new JSpinner(new SpinnerNumberModel(0, 0, 100, 1));
            JTextField salarioField = new JTextField();

            panel.add(new JLabel("Nome:"));
            panel.add(nomeField);
            panel.add(new JLabel("Sexo:"));
            panel.add(sexoField);
            panel.add(new JLabel("Identidade:"));
            panel.add(identidadeField);
            panel.add(new JLabel("Endereço:"));
            panel.add(enderecoField);
            panel.add(new JLabel("Especialidade:"));
            panel.add(especialidadeField);
            panel.add(new JLabel("Número de Consultas:"));
            panel.add(numConsultasField);
            panel.add(new JLabel("Salário (R$):"));
            panel.add(salarioField);

            int result = JOptionPane.showConfirmDialog(null, panel, "Cadastrar Médico(a)", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                String nome = nomeField.getText();
                String sexo = (String) sexoField.getSelectedItem();
                long identidade = Long.parseLong(identidadeField.getText());
                String endereco = enderecoField.getText();
                String especialidade = (String) especialidadeField.getSelectedItem();
                int numConsultas = (Integer) numConsultasField.getValue();
                double salario = Double.parseDouble(salarioField.getText());

                medico.cadastrar(nome, sexo, identidade, endereco, especialidade, numConsultas, salario);
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar médico(a): " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void mostrarMedico() {
        if (medico.getNome() != null && !medico.getNome().equals("N/A")) {
            medico.mostrar();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum médico cadastrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void excluirMedico() {
        if (medico.getNome() != null && !medico.getNome().equals("N/A")) {
            medico.excluir();
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum médico cadastrado para excluir.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void calcularPlantao() {
        try {
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas de plantão:"));
            int minutos = HospitalUtil.calculaPlantaoEmMinutos(horas);
            JOptionPane.showMessageDialog(null, horas + " horas de plantão equivalem a " + minutos + " minutos.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular plantão em minutos: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void calcularMaximoPlantoes() {
        try {
            int dias = Integer.parseInt(JOptionPane.showInputDialog("Número de dias:"));
            int maxPlantoes = HospitalUtil.calculaMaximoPlantoes(dias);
            JOptionPane.showMessageDialog(null, "Número máximo de plantões em " + dias + " dias: " + maxPlantoes, "Informação", JOptionPane.INFORMATION_MESSAGE);
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, "Erro ao calcular máximo de plantões: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> {
            new TesteMedico().setVisible(true);
        });
    }
}