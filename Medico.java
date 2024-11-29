import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class Medico extends MedicoA {

    @Override
    public void cadastrar(String nome, String sexo, long identidade, String endereco, String especialidade, int numConsultas, double salario) {
        if (nome == null || nome.isEmpty() || sexo == null || sexo.isEmpty() || identidade <= 0 || endereco == null || endereco.isEmpty() || especialidade == null || especialidade.isEmpty() || numConsultas < 0 || salario < 0) {
            throw new IllegalArgumentException("Todos os campos devem ser preenchidos corretamente.");
        }
        setNome(nome);
        setSexo(sexo);
        setIdentidade(identidade);
        setEndereco(endereco);
        setEspecialidade(especialidade);
        setNumConsultas(numConsultas);
        setSalario(salario);
        JOptionPane.showMessageDialog(null, "Médico cadastrado com sucesso: " + nome, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public void excluir() {
        JOptionPane.showMessageDialog(null, "Excluindo dados do médico: " + getNome(), "Informação", JOptionPane.INFORMATION_MESSAGE);
        setNome("N/A");
        setSexo("N/A");
        setIdentidade(0);
        setEndereco("N/A");
        setEspecialidade("N/A");
        setNumConsultas(0);
        setSalario(0.0);
    }

    @Override
    public void mostrar() {
        String nome = getNome() != null ? getNome() : "N/A";
        String sexo = getSexo() != null ? getSexo() : "N/A";
        String identidade = getIdentidade() != 0 ? String.valueOf(getIdentidade()) : "N/A";
        String endereco = getEndereco() != null ? getEndereco() : "N/A";
        String especialidade = getEspecialidade() != null ? getEspecialidade() : "N/A";
        String numConsultas = getNumConsultas() != 0 ? String.valueOf(getNumConsultas()) : "N/A";
        String salario = getSalario() != 0.0 ? NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(getSalario()) : "N/A";

        String mensagem = String.format("""
                          Médico:
                          Nome: %s
                          Sexo: %s
                          Identidade: %s
                          Endereço: %s
                          Especialidade: %s
                          Número de Consultas: %s
                          Salário: %s
                          """, nome, sexo, identidade, endereco, especialidade, numConsultas, salario);

        JOptionPane.showMessageDialog(null, mensagem, "Informação", JOptionPane.INFORMATION_MESSAGE);
    }
}