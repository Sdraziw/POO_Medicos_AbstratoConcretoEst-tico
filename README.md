# POO_Medicos_AbstratoConcretoEstatico
Aprendizados em POO Fatec

# Projeto de P2

Este projeto é uma aplicação simples para gerenciar informações de médicos, incluindo cadastro, exclusão e exibição de dados, além de cálculos relacionados ao plantão hospitalar.

## Funcionalidades

- **Cadastrar Médico**: Permite cadastrar um novo médico com informações como nome, sexo, identidade, endereço, especialidade, número de consultas e salário.
- **Mostrar Médico**: Exibe as informações do médico cadastrado.
- **Excluir Médico**: Exclui os dados do médico cadastrado.
- **Calcular Plantão em Minutos**: Calcula o tempo de plantão em minutos com base nas horas fornecidas.
- **Calcular Máximo de Plantões**: Calcula o número máximo de plantões permitidos em um determinado número de dias.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- **MedicoA**: Classe abstrata que define os atributos e métodos básicos de um médico.
- **Medico**: Classe concreta que herda de `MedicoA` e implementa os métodos abstratos.
- **HospitalUtil**: Classe utilitária para cálculos relacionados ao hospital.
- **TesteMedico**: Classe principal que fornece uma interface gráfica para interagir com as funcionalidades do projeto.

## Como Executar

1. **Clone o repositório**:
    
    git clone https://github.com/seu-usuario/projeto-gestao-medicos.git
    
    cd projeto-gestao-medicos
    
2. **Compile o projeto**:
    
    javac *.java
    
3. **Execute a aplicação**:
    
    java TesteMedico
    

## Exemplo de Uso

Ao executar a aplicação, um menu será exibido com as opções disponíveis. Utilize o mouse ou o teclado para selecionar a opção desejada e siga as instruções fornecidas.

### Menu

Escolha uma opção:

1. Cadastrar Médico

2. Mostrar Médico

3. Excluir Médico

4. Calcular Plantão em Minutos

5. Calcular Máximo de Plantões

6. Sair

### Cadastro de Médico

Preencha os campos solicitados para cadastrar um novo médico:

- Nome
- Sexo
- Identidade
- Endereço
- Especialidade
- Número de Consultas
- Salário

### Exibição de Médico

Exibe as informações do médico cadastrado em uma janela de diálogo.

### Exclusão de Médico

Exclui os dados do médico cadastrado e redefine os atributos para valores padrão.

### Cálculo de Plantão em Minutos

Insira o número de horas de plantão para calcular o tempo equivalente em minutos.

### Cálculo de Máximo de Plantões

Insira o número de dias de trabalho para calcular o número máximo de plantões permitidos.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias e correções.
