import javax.swing.JOptionPane;

public class Main {
  public static void main(String[] args) {
    int numero1, numero2;
    double quociente, potencia;

    numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro:"));
    numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro:"));

    quociente = (double) numero1 / numero2;
    potencia = Math.pow(numero1, numero2);

    String mensagem = "Quociente da divisão: " + quociente + "\n";
    mensagem += "Potência: " + potencia;

    JOptionPane.showMessageDialog(null, mensagem);
  }

}