public abstract class MedicoA {
    private String nome;
    private String sexo;
    private long identidade;
    private String endereco;
    private String especialidade;
    private int numConsultas;
    private double salario;

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio ou nulo.");
        }
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo == null || sexo.isEmpty()) {
            throw new IllegalArgumentException("Sexo não pode ser vazio ou nulo.");
        }
        this.sexo = sexo;
    }

    public long getIdentidade() {
        return identidade;
    }

    public void setIdentidade(long identidade) {
        if (identidade < 0) {
            throw new IllegalArgumentException("Identidade deve ser um valor positivo.");
        }
        this.identidade = identidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode ser vazio ou nulo.");
        }
        this.endereco = endereco;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        if (especialidade == null || especialidade.isEmpty()) {
            throw new IllegalArgumentException("Especialidade não pode ser vazia ou nula.");
        }
        this.especialidade = especialidade;
    }

    public int getNumConsultas() {
        return numConsultas;
    }

    public void setNumConsultas(int numConsultas) {
        if (numConsultas < 0) {
            throw new IllegalArgumentException("Número de consultas não pode ser negativo.");
        }
        if (numConsultas > 10) {
            numConsultas = 10;
        }
        this.numConsultas = numConsultas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo.");
        }
        this.salario = salario;
    }

    // Métodos abstratos
    public abstract void cadastrar(String nome, String sexo, long identidade, String endereco, String especialidade, int numConsultas, double salario);
    public abstract void excluir();
    public abstract void mostrar();
}